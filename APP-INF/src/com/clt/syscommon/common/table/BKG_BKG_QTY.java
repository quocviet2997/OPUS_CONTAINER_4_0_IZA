/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BKG_BKG_QTY.java
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
public final class BKG_BKG_QTY implements java.io.Serializable {

	private String               ibflag               = "";
	private String               page_rows            = "";
	private String               bkg_no               = "";
	private String               bkg_no_split         = "";
	private String               cntr_tpsz_cd         = "";
	private String               op_cntr_qty          = "";
	private String               act_cntr_qty         = "";
	private String               bkg_hngr_crr_qty     = "";
	private String               bkg_hngr_shpr_qty    = "";
	private String               dcgo_qty             = "";
	private String               awk_cgo_qty          = "";
	private String               rc_qty               = "";
	private String               bb_cgo_qty           = "";
	private String               rd_cntr_tpsz_cd      = "";
	private String               rd_cgo_qty           = "";
	private String               soc_qty              = "";
	private String               shpr_cntr_tpsz_cd    = "";
	private String               shpr_cntr_qty        = "";
	private String               org_cntr_qty         = "";
	private String               dest_cntr_qty        = "";
	private String               ob_tro_qty           = "";
	private String               ib_tro_qty           = "";
	private String               finc_if_flg          = "";
	private String               bkg_qty_cd           = "";
	private String               nis_evnt_dt          = "";
	private String               crr_hngr_sgl_bar_qty = "";
	private String               crr_hngr_dbl_bar_qty = "";
	private String               cntr_sub_soc_tpsz_cd = "";
	private String               cntr_soc_tpsz_cd     = "";
	private String               eai_evnt_dt          = "";

	public BKG_BKG_QTY(){}

	public BKG_BKG_QTY(
			String               ibflag              ,
			String               page_rows           ,
			String               bkg_no              ,
			String               bkg_no_split        ,
			String               cntr_tpsz_cd        ,
			String               op_cntr_qty         ,
			String               act_cntr_qty        ,
			String               bkg_hngr_crr_qty    ,
			String               bkg_hngr_shpr_qty   ,
			String               dcgo_qty            ,
			String               awk_cgo_qty         ,
			String               rc_qty              ,
			String               bb_cgo_qty          ,
			String               rd_cntr_tpsz_cd     ,
			String               rd_cgo_qty          ,
			String               soc_qty             ,
			String               shpr_cntr_tpsz_cd   ,
			String               shpr_cntr_qty       ,
			String               org_cntr_qty        ,
			String               dest_cntr_qty       ,
			String               ob_tro_qty          ,
			String               ib_tro_qty          ,
			String               finc_if_flg         ,
			String               bkg_qty_cd          ,
			String               nis_evnt_dt         ,
			String               crr_hngr_sgl_bar_qty,
			String               crr_hngr_dbl_bar_qty,
			String               cntr_sub_soc_tpsz_cd,
			String               cntr_soc_tpsz_cd    ,
			String               eai_evnt_dt         ){
		this.ibflag               = ibflag              ;
		this.page_rows            = page_rows           ;
		this.bkg_no               = bkg_no              ;
		this.bkg_no_split         = bkg_no_split        ;
		this.cntr_tpsz_cd         = cntr_tpsz_cd        ;
		this.op_cntr_qty          = op_cntr_qty         ;
		this.act_cntr_qty         = act_cntr_qty        ;
		this.bkg_hngr_crr_qty     = bkg_hngr_crr_qty    ;
		this.bkg_hngr_shpr_qty    = bkg_hngr_shpr_qty   ;
		this.dcgo_qty             = dcgo_qty            ;
		this.awk_cgo_qty          = awk_cgo_qty         ;
		this.rc_qty               = rc_qty              ;
		this.bb_cgo_qty           = bb_cgo_qty          ;
		this.rd_cntr_tpsz_cd      = rd_cntr_tpsz_cd     ;
		this.rd_cgo_qty           = rd_cgo_qty          ;
		this.soc_qty              = soc_qty             ;
		this.shpr_cntr_tpsz_cd    = shpr_cntr_tpsz_cd   ;
		this.shpr_cntr_qty        = shpr_cntr_qty       ;
		this.org_cntr_qty         = org_cntr_qty        ;
		this.dest_cntr_qty        = dest_cntr_qty       ;
		this.ob_tro_qty           = ob_tro_qty          ;
		this.ib_tro_qty           = ib_tro_qty          ;
		this.finc_if_flg          = finc_if_flg         ;
		this.bkg_qty_cd           = bkg_qty_cd          ;
		this.nis_evnt_dt          = nis_evnt_dt         ;
		this.crr_hngr_sgl_bar_qty = crr_hngr_sgl_bar_qty;
		this.crr_hngr_dbl_bar_qty = crr_hngr_dbl_bar_qty;
		this.cntr_sub_soc_tpsz_cd = cntr_sub_soc_tpsz_cd;
		this.cntr_soc_tpsz_cd     = cntr_soc_tpsz_cd    ;
		this.eai_evnt_dt          = eai_evnt_dt         ;
	}

	// getter method is proceeding ..
	public String               getIbflag              (){	return ibflag              	;	}
	public String               getPage_rows           (){	return page_rows           	;	}
	public String               getBkg_no              (){	return bkg_no              	;	}
	public String               getBkg_no_split        (){	return bkg_no_split        	;	}
	public String               getCntr_tpsz_cd        (){	return cntr_tpsz_cd        	;	}
	public String               getOp_cntr_qty         (){	return op_cntr_qty         	;	}
	public String               getAct_cntr_qty        (){	return act_cntr_qty        	;	}
	public String               getBkg_hngr_crr_qty    (){	return bkg_hngr_crr_qty    	;	}
	public String               getBkg_hngr_shpr_qty   (){	return bkg_hngr_shpr_qty   	;	}
	public String               getDcgo_qty            (){	return dcgo_qty            	;	}
	public String               getAwk_cgo_qty         (){	return awk_cgo_qty         	;	}
	public String               getRc_qty              (){	return rc_qty              	;	}
	public String               getBb_cgo_qty          (){	return bb_cgo_qty          	;	}
	public String               getRd_cntr_tpsz_cd     (){	return rd_cntr_tpsz_cd     	;	}
	public String               getRd_cgo_qty          (){	return rd_cgo_qty          	;	}
	public String               getSoc_qty             (){	return soc_qty             	;	}
	public String               getShpr_cntr_tpsz_cd   (){	return shpr_cntr_tpsz_cd   	;	}
	public String               getShpr_cntr_qty       (){	return shpr_cntr_qty       	;	}
	public String               getOrg_cntr_qty        (){	return org_cntr_qty        	;	}
	public String               getDest_cntr_qty       (){	return dest_cntr_qty       	;	}
	public String               getOb_tro_qty          (){	return ob_tro_qty          	;	}
	public String               getIb_tro_qty          (){	return ib_tro_qty          	;	}
	public String               getFinc_if_flg         (){	return finc_if_flg         	;	}
	public String               getBkg_qty_cd          (){	return bkg_qty_cd          	;	}
	public String               getNis_evnt_dt         (){	return nis_evnt_dt         	;	}
	public String               getCrr_hngr_sgl_bar_qty(){	return crr_hngr_sgl_bar_qty	;	}
	public String               getCrr_hngr_dbl_bar_qty(){	return crr_hngr_dbl_bar_qty	;	}
	public String               getCntr_sub_soc_tpsz_cd(){	return cntr_sub_soc_tpsz_cd	;	}
	public String               getCntr_soc_tpsz_cd    (){	return cntr_soc_tpsz_cd    	;	}
	public String               getEai_evnt_dt         (){	return eai_evnt_dt         	;	}

	// setter method is proceeding ..
	public void setIbflag              ( String               ibflag               ){	this.ibflag               = ibflag              	;	}
	public void setPage_rows           ( String               page_rows            ){	this.page_rows            = page_rows           	;	}
	public void setBkg_no              ( String               bkg_no               ){	this.bkg_no               = bkg_no              	;	}
	public void setBkg_no_split        ( String               bkg_no_split         ){	this.bkg_no_split         = bkg_no_split        	;	}
	public void setCntr_tpsz_cd        ( String               cntr_tpsz_cd         ){	this.cntr_tpsz_cd         = cntr_tpsz_cd        	;	}
	public void setOp_cntr_qty         ( String               op_cntr_qty          ){	this.op_cntr_qty          = op_cntr_qty         	;	}
	public void setAct_cntr_qty        ( String               act_cntr_qty         ){	this.act_cntr_qty         = act_cntr_qty        	;	}
	public void setBkg_hngr_crr_qty    ( String               bkg_hngr_crr_qty     ){	this.bkg_hngr_crr_qty     = bkg_hngr_crr_qty    	;	}
	public void setBkg_hngr_shpr_qty   ( String               bkg_hngr_shpr_qty    ){	this.bkg_hngr_shpr_qty    = bkg_hngr_shpr_qty   	;	}
	public void setDcgo_qty            ( String               dcgo_qty             ){	this.dcgo_qty             = dcgo_qty            	;	}
	public void setAwk_cgo_qty         ( String               awk_cgo_qty          ){	this.awk_cgo_qty          = awk_cgo_qty         	;	}
	public void setRc_qty              ( String               rc_qty               ){	this.rc_qty               = rc_qty              	;	}
	public void setBb_cgo_qty          ( String               bb_cgo_qty           ){	this.bb_cgo_qty           = bb_cgo_qty          	;	}
	public void setRd_cntr_tpsz_cd     ( String               rd_cntr_tpsz_cd      ){	this.rd_cntr_tpsz_cd      = rd_cntr_tpsz_cd     	;	}
	public void setRd_cgo_qty          ( String               rd_cgo_qty           ){	this.rd_cgo_qty           = rd_cgo_qty          	;	}
	public void setSoc_qty             ( String               soc_qty              ){	this.soc_qty              = soc_qty             	;	}
	public void setShpr_cntr_tpsz_cd   ( String               shpr_cntr_tpsz_cd    ){	this.shpr_cntr_tpsz_cd    = shpr_cntr_tpsz_cd   	;	}
	public void setShpr_cntr_qty       ( String               shpr_cntr_qty        ){	this.shpr_cntr_qty        = shpr_cntr_qty       	;	}
	public void setOrg_cntr_qty        ( String               org_cntr_qty         ){	this.org_cntr_qty         = org_cntr_qty        	;	}
	public void setDest_cntr_qty       ( String               dest_cntr_qty        ){	this.dest_cntr_qty        = dest_cntr_qty       	;	}
	public void setOb_tro_qty          ( String               ob_tro_qty           ){	this.ob_tro_qty           = ob_tro_qty          	;	}
	public void setIb_tro_qty          ( String               ib_tro_qty           ){	this.ib_tro_qty           = ib_tro_qty          	;	}
	public void setFinc_if_flg         ( String               finc_if_flg          ){	this.finc_if_flg          = finc_if_flg         	;	}
	public void setBkg_qty_cd          ( String               bkg_qty_cd           ){	this.bkg_qty_cd           = bkg_qty_cd          	;	}
	public void setNis_evnt_dt         ( String               nis_evnt_dt          ){	this.nis_evnt_dt          = nis_evnt_dt         	;	}
	public void setCrr_hngr_sgl_bar_qty( String               crr_hngr_sgl_bar_qty ){	this.crr_hngr_sgl_bar_qty = crr_hngr_sgl_bar_qty	;	}
	public void setCrr_hngr_dbl_bar_qty( String               crr_hngr_dbl_bar_qty ){	this.crr_hngr_dbl_bar_qty = crr_hngr_dbl_bar_qty	;	}
	public void setCntr_sub_soc_tpsz_cd( String               cntr_sub_soc_tpsz_cd ){	this.cntr_sub_soc_tpsz_cd = cntr_sub_soc_tpsz_cd	;	}
	public void setCntr_soc_tpsz_cd    ( String               cntr_soc_tpsz_cd     ){	this.cntr_soc_tpsz_cd     = cntr_soc_tpsz_cd    	;	}
	public void setEai_evnt_dt         ( String               eai_evnt_dt          ){	this.eai_evnt_dt          = eai_evnt_dt         	;	}

	public static BKG_BKG_QTY fromRequest(HttpServletRequest request) {
		BKG_BKG_QTY model = new BKG_BKG_QTY();
		try {
			model.setIbflag              	(JSPUtil.getParameter(request, "ibflag              		".trim(), ""));
			model.setPage_rows           	(JSPUtil.getParameter(request, "page_rows           		".trim(), ""));
			model.setBkg_no              	(JSPUtil.getParameter(request, "bkg_no              		".trim(), ""));
			model.setBkg_no_split        	(JSPUtil.getParameter(request, "bkg_no_split        		".trim(), ""));
			model.setCntr_tpsz_cd        	(JSPUtil.getParameter(request, "cntr_tpsz_cd        		".trim(), ""));
			model.setOp_cntr_qty         	(JSPUtil.getParameter(request, "op_cntr_qty         		".trim(), ""));
			model.setAct_cntr_qty        	(JSPUtil.getParameter(request, "act_cntr_qty        		".trim(), ""));
			model.setBkg_hngr_crr_qty    	(JSPUtil.getParameter(request, "bkg_hngr_crr_qty    		".trim(), ""));
			model.setBkg_hngr_shpr_qty   	(JSPUtil.getParameter(request, "bkg_hngr_shpr_qty   		".trim(), ""));
			model.setDcgo_qty            	(JSPUtil.getParameter(request, "dcgo_qty            		".trim(), ""));
			model.setAwk_cgo_qty         	(JSPUtil.getParameter(request, "awk_cgo_qty         		".trim(), ""));
			model.setRc_qty              	(JSPUtil.getParameter(request, "rc_qty              		".trim(), ""));
			model.setBb_cgo_qty          	(JSPUtil.getParameter(request, "bb_cgo_qty          		".trim(), ""));
			model.setRd_cntr_tpsz_cd     	(JSPUtil.getParameter(request, "rd_cntr_tpsz_cd     		".trim(), ""));
			model.setRd_cgo_qty          	(JSPUtil.getParameter(request, "rd_cgo_qty          		".trim(), ""));
			model.setSoc_qty             	(JSPUtil.getParameter(request, "soc_qty             		".trim(), ""));
			model.setShpr_cntr_tpsz_cd   	(JSPUtil.getParameter(request, "shpr_cntr_tpsz_cd   		".trim(), ""));
			model.setShpr_cntr_qty       	(JSPUtil.getParameter(request, "shpr_cntr_qty       		".trim(), ""));
			model.setOrg_cntr_qty        	(JSPUtil.getParameter(request, "org_cntr_qty        		".trim(), ""));
			model.setDest_cntr_qty       	(JSPUtil.getParameter(request, "dest_cntr_qty       		".trim(), ""));
			model.setOb_tro_qty          	(JSPUtil.getParameter(request, "ob_tro_qty          		".trim(), ""));
			model.setIb_tro_qty          	(JSPUtil.getParameter(request, "ib_tro_qty          		".trim(), ""));
			model.setFinc_if_flg         	(JSPUtil.getParameter(request, "finc_if_flg         		".trim(), ""));
			model.setBkg_qty_cd          	(JSPUtil.getParameter(request, "bkg_qty_cd          		".trim(), ""));
			model.setNis_evnt_dt         	(JSPUtil.getParameter(request, "nis_evnt_dt         		".trim(), ""));
			model.setCrr_hngr_sgl_bar_qty	(JSPUtil.getParameter(request, "crr_hngr_sgl_bar_qty		".trim(), ""));
			model.setCrr_hngr_dbl_bar_qty	(JSPUtil.getParameter(request, "crr_hngr_dbl_bar_qty		".trim(), ""));
			model.setCntr_sub_soc_tpsz_cd	(JSPUtil.getParameter(request, "cntr_sub_soc_tpsz_cd		".trim(), ""));
			model.setCntr_soc_tpsz_cd    	(JSPUtil.getParameter(request, "cntr_soc_tpsz_cd    		".trim(), ""));
			model.setEai_evnt_dt         	(JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		BKG_BKG_QTY model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, "page_rows           		".trim(), length));
			String[] bkg_no               =  (JSPUtil.getParameter(request, "bkg_no              		".trim(), length));
			String[] bkg_no_split         =  (JSPUtil.getParameter(request, "bkg_no_split        		".trim(), length));
			String[] cntr_tpsz_cd         =  (JSPUtil.getParameter(request, "cntr_tpsz_cd        		".trim(), length));
			String[] op_cntr_qty          =  (JSPUtil.getParameter(request, "op_cntr_qty         		".trim(), length));
			String[] act_cntr_qty         =  (JSPUtil.getParameter(request, "act_cntr_qty        		".trim(), length));
			String[] bkg_hngr_crr_qty     =  (JSPUtil.getParameter(request, "bkg_hngr_crr_qty    		".trim(), length));
			String[] bkg_hngr_shpr_qty    =  (JSPUtil.getParameter(request, "bkg_hngr_shpr_qty   		".trim(), length));
			String[] dcgo_qty             =  (JSPUtil.getParameter(request, "dcgo_qty            		".trim(), length));
			String[] awk_cgo_qty          =  (JSPUtil.getParameter(request, "awk_cgo_qty         		".trim(), length));
			String[] rc_qty               =  (JSPUtil.getParameter(request, "rc_qty              		".trim(), length));
			String[] bb_cgo_qty           =  (JSPUtil.getParameter(request, "bb_cgo_qty          		".trim(), length));
			String[] rd_cntr_tpsz_cd      =  (JSPUtil.getParameter(request, "rd_cntr_tpsz_cd     		".trim(), length));
			String[] rd_cgo_qty           =  (JSPUtil.getParameter(request, "rd_cgo_qty          		".trim(), length));
			String[] soc_qty              =  (JSPUtil.getParameter(request, "soc_qty             		".trim(), length));
			String[] shpr_cntr_tpsz_cd    =  (JSPUtil.getParameter(request, "shpr_cntr_tpsz_cd   		".trim(), length));
			String[] shpr_cntr_qty        =  (JSPUtil.getParameter(request, "shpr_cntr_qty       		".trim(), length));
			String[] org_cntr_qty         =  (JSPUtil.getParameter(request, "org_cntr_qty        		".trim(), length));
			String[] dest_cntr_qty        =  (JSPUtil.getParameter(request, "dest_cntr_qty       		".trim(), length));
			String[] ob_tro_qty           =  (JSPUtil.getParameter(request, "ob_tro_qty          		".trim(), length));
			String[] ib_tro_qty           =  (JSPUtil.getParameter(request, "ib_tro_qty          		".trim(), length));
			String[] finc_if_flg          =  (JSPUtil.getParameter(request, "finc_if_flg         		".trim(), length));
			String[] bkg_qty_cd           =  (JSPUtil.getParameter(request, "bkg_qty_cd          		".trim(), length));
			String[] nis_evnt_dt          =  (JSPUtil.getParameter(request, "nis_evnt_dt         		".trim(), length));
			String[] crr_hngr_sgl_bar_qty =  (JSPUtil.getParameter(request, "crr_hngr_sgl_bar_qty		".trim(), length));
			String[] crr_hngr_dbl_bar_qty =  (JSPUtil.getParameter(request, "crr_hngr_dbl_bar_qty		".trim(), length));
			String[] cntr_sub_soc_tpsz_cd =  (JSPUtil.getParameter(request, "cntr_sub_soc_tpsz_cd		".trim(), length));
			String[] cntr_soc_tpsz_cd     =  (JSPUtil.getParameter(request, "cntr_soc_tpsz_cd    		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_BKG_QTY();
				model.setIbflag              		  (ibflag              	[i]);
				model.setPage_rows           		  (page_rows           	[i]);
				model.setBkg_no              		  (bkg_no              	[i]);
				model.setBkg_no_split        		  (bkg_no_split        	[i]);
				model.setCntr_tpsz_cd        		  (cntr_tpsz_cd        	[i]);
				model.setOp_cntr_qty         		  (op_cntr_qty         	[i]);
				model.setAct_cntr_qty        		  (act_cntr_qty        	[i]);
				model.setBkg_hngr_crr_qty    		  (bkg_hngr_crr_qty    	[i]);
				model.setBkg_hngr_shpr_qty   		  (bkg_hngr_shpr_qty   	[i]);
				model.setDcgo_qty            		  (dcgo_qty            	[i]);
				model.setAwk_cgo_qty         		  (awk_cgo_qty         	[i]);
				model.setRc_qty              		  (rc_qty              	[i]);
				model.setBb_cgo_qty          		  (bb_cgo_qty          	[i]);
				model.setRd_cntr_tpsz_cd     		  (rd_cntr_tpsz_cd     	[i]);
				model.setRd_cgo_qty          		  (rd_cgo_qty          	[i]);
				model.setSoc_qty             		  (soc_qty             	[i]);
				model.setShpr_cntr_tpsz_cd   		  (shpr_cntr_tpsz_cd   	[i]);
				model.setShpr_cntr_qty       		  (shpr_cntr_qty       	[i]);
				model.setOrg_cntr_qty        		  (org_cntr_qty        	[i]);
				model.setDest_cntr_qty       		  (dest_cntr_qty       	[i]);
				model.setOb_tro_qty          		  (ob_tro_qty          	[i]);
				model.setIb_tro_qty          		  (ib_tro_qty          	[i]);
				model.setFinc_if_flg         		  (finc_if_flg         	[i]);
				model.setBkg_qty_cd          		  (bkg_qty_cd          	[i]);
				model.setNis_evnt_dt         		  (nis_evnt_dt         	[i]);
				model.setCrr_hngr_sgl_bar_qty		  (crr_hngr_sgl_bar_qty	[i]);
				model.setCrr_hngr_dbl_bar_qty		  (crr_hngr_dbl_bar_qty	[i]);
				model.setCntr_sub_soc_tpsz_cd		  (cntr_sub_soc_tpsz_cd	[i]);
				model.setCntr_soc_tpsz_cd    		  (cntr_soc_tpsz_cd    	[i]);
				model.setEai_evnt_dt         		  (eai_evnt_dt         	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		BKG_BKG_QTY model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, prefix + "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, prefix + "page_rows           		".trim(), length));
			String[] bkg_no               =  (JSPUtil.getParameter(request, prefix + "bkg_no              		".trim(), length));
			String[] bkg_no_split         =  (JSPUtil.getParameter(request, prefix + "bkg_no_split        		".trim(), length));
			String[] cntr_tpsz_cd         =  (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd        		".trim(), length));
			String[] op_cntr_qty          =  (JSPUtil.getParameter(request, prefix + "op_cntr_qty         		".trim(), length));
			String[] act_cntr_qty         =  (JSPUtil.getParameter(request, prefix + "act_cntr_qty        		".trim(), length));
			String[] bkg_hngr_crr_qty     =  (JSPUtil.getParameter(request, prefix + "bkg_hngr_crr_qty    		".trim(), length));
			String[] bkg_hngr_shpr_qty    =  (JSPUtil.getParameter(request, prefix + "bkg_hngr_shpr_qty   		".trim(), length));
			String[] dcgo_qty             =  (JSPUtil.getParameter(request, prefix + "dcgo_qty            		".trim(), length));
			String[] awk_cgo_qty          =  (JSPUtil.getParameter(request, prefix + "awk_cgo_qty         		".trim(), length));
			String[] rc_qty               =  (JSPUtil.getParameter(request, prefix + "rc_qty              		".trim(), length));
			String[] bb_cgo_qty           =  (JSPUtil.getParameter(request, prefix + "bb_cgo_qty          		".trim(), length));
			String[] rd_cntr_tpsz_cd      =  (JSPUtil.getParameter(request, prefix + "rd_cntr_tpsz_cd     		".trim(), length));
			String[] rd_cgo_qty           =  (JSPUtil.getParameter(request, prefix + "rd_cgo_qty          		".trim(), length));
			String[] soc_qty              =  (JSPUtil.getParameter(request, prefix + "soc_qty             		".trim(), length));
			String[] shpr_cntr_tpsz_cd    =  (JSPUtil.getParameter(request, prefix + "shpr_cntr_tpsz_cd   		".trim(), length));
			String[] shpr_cntr_qty        =  (JSPUtil.getParameter(request, prefix + "shpr_cntr_qty       		".trim(), length));
			String[] org_cntr_qty         =  (JSPUtil.getParameter(request, prefix + "org_cntr_qty        		".trim(), length));
			String[] dest_cntr_qty        =  (JSPUtil.getParameter(request, prefix + "dest_cntr_qty       		".trim(), length));
			String[] ob_tro_qty           =  (JSPUtil.getParameter(request, prefix + "ob_tro_qty          		".trim(), length));
			String[] ib_tro_qty           =  (JSPUtil.getParameter(request, prefix + "ib_tro_qty          		".trim(), length));
			String[] finc_if_flg          =  (JSPUtil.getParameter(request, prefix + "finc_if_flg         		".trim(), length));
			String[] bkg_qty_cd           =  (JSPUtil.getParameter(request, prefix + "bkg_qty_cd          		".trim(), length));
			String[] nis_evnt_dt          =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt         		".trim(), length));
			String[] crr_hngr_sgl_bar_qty =  (JSPUtil.getParameter(request, prefix + "crr_hngr_sgl_bar_qty		".trim(), length));
			String[] crr_hngr_dbl_bar_qty =  (JSPUtil.getParameter(request, prefix + "crr_hngr_dbl_bar_qty		".trim(), length));
			String[] cntr_sub_soc_tpsz_cd =  (JSPUtil.getParameter(request, prefix + "cntr_sub_soc_tpsz_cd		".trim(), length));
			String[] cntr_soc_tpsz_cd     =  (JSPUtil.getParameter(request, prefix + "cntr_soc_tpsz_cd    		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_BKG_QTY();
				model.setIbflag              		  ( ibflag              	[i]);
				model.setPage_rows           		  ( page_rows           	[i]);
				model.setBkg_no              		  ( bkg_no              	[i]);
				model.setBkg_no_split        		  ( bkg_no_split        	[i]);
				model.setCntr_tpsz_cd        		  ( cntr_tpsz_cd        	[i]);
				model.setOp_cntr_qty         		  ( op_cntr_qty         	[i]);
				model.setAct_cntr_qty        		  ( act_cntr_qty        	[i]);
				model.setBkg_hngr_crr_qty    		  ( bkg_hngr_crr_qty    	[i]);
				model.setBkg_hngr_shpr_qty   		  ( bkg_hngr_shpr_qty   	[i]);
				model.setDcgo_qty            		  ( dcgo_qty            	[i]);
				model.setAwk_cgo_qty         		  ( awk_cgo_qty         	[i]);
				model.setRc_qty              		  ( rc_qty              	[i]);
				model.setBb_cgo_qty          		  ( bb_cgo_qty          	[i]);
				model.setRd_cntr_tpsz_cd     		  ( rd_cntr_tpsz_cd     	[i]);
				model.setRd_cgo_qty          		  ( rd_cgo_qty          	[i]);
				model.setSoc_qty             		  ( soc_qty             	[i]);
				model.setShpr_cntr_tpsz_cd   		  ( shpr_cntr_tpsz_cd   	[i]);
				model.setShpr_cntr_qty       		  ( shpr_cntr_qty       	[i]);
				model.setOrg_cntr_qty        		  ( org_cntr_qty        	[i]);
				model.setDest_cntr_qty       		  ( dest_cntr_qty       	[i]);
				model.setOb_tro_qty          		  ( ob_tro_qty          	[i]);
				model.setIb_tro_qty          		  ( ib_tro_qty          	[i]);
				model.setFinc_if_flg         		  ( finc_if_flg         	[i]);
				model.setBkg_qty_cd          		  ( bkg_qty_cd          	[i]);
				model.setNis_evnt_dt         		  ( nis_evnt_dt         	[i]);
				model.setCrr_hngr_sgl_bar_qty		  ( crr_hngr_sgl_bar_qty	[i]);
				model.setCrr_hngr_dbl_bar_qty		  ( crr_hngr_dbl_bar_qty	[i]);
				model.setCntr_sub_soc_tpsz_cd		  ( cntr_sub_soc_tpsz_cd	[i]);
				model.setCntr_soc_tpsz_cd    		  ( cntr_soc_tpsz_cd    	[i]);
				model.setEai_evnt_dt         		  ( eai_evnt_dt         	[i]);
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
