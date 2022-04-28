/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : AP_INV_DTRB.java
*@FileTitle : Terminal invoice CSR Creation - Summary
*Open Issues :
*Change history :
*@LastModifyDate : 2006-12-22
*@LastModifier : jongbaemoon
*@LastVersion : 1.0
* 2006-12-22 jongbaemoon
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
 * @author jongbaemoon
 * @since J2EE 1.4
 */
public final class AP_INV_DTRB implements java.io.Serializable {

	private String               ibflag               = "";
	private String               page_rows            = "";
	private String               csr_no               = "";
	private String               line_seq             = "";
	private String               line_no              = "";
	private String               line_tp_lu_cd        = "";
	private String               inv_amt              = "";
	private String               inv_desc             = "";
	private String               inv_tax_cd           = "";
	private String               dtrb_coa_co_cd       = "";
	private String               dtrb_coa_rgn_cd      = "";
	private String               dtrb_coa_ctr_cd      = "";
	private String               dtrb_coa_acct_cd     = "";
	private String               dtrb_coa_vvd_cd      = "";
	private String               dtrb_coa_inter_co_cd = "";
	private String               dtrb_coa_ftu_n1st_cd = "";
	private String               dtrb_coa_ftu_n2nd_cd = "";
	private String               attr_cate_nm         = "";
	private String               attr_ctnt1           = "";
	private String               attr_ctnt2           = "";
	private String               attr_ctnt3           = "";
	private String               attr_ctnt4           = "";
	private String               attr_ctnt5           = "";
	private String               attr_ctnt6           = "";
	private String               attr_ctnt7           = "";
	private String               attr_ctnt8           = "";
	private String               attr_ctnt9           = "";
	private String               attr_ctnt10          = "";
	private String               attr_ctnt11          = "";
	private String               attr_ctnt12          = "";
	private String               attr_ctnt13          = "";
	private String               attr_ctnt14          = "";
	private String               attr_ctnt15          = "";
	private String               bkg_no               = "";
	private String               bkg_no_split         = "";
	private String               cntr_tpsz_cd         = "";
	private String               act_vvd_cd           = "";
	private String               pln_sctr_div_cd      = "";
	private String               so_crr_cd            = "";
	private String               yd_cd                = "";
	private String               ftu_use_ctnt1        = "";
	private String               ftu_use_ctnt2        = "";
	private String               ftu_use_ctnt3        = "";
	private String               ftu_use_ctnt4        = "";
	private String               ftu_use_ctnt5        = "";
	private String               cre_dt               = "";
	private String               cre_usr_id           = "";
	private String               eai_evnt_dt          = "";

	public AP_INV_DTRB(){}

	public AP_INV_DTRB(
			String               ibflag              ,
			String               page_rows           ,
			String               csr_no              ,
			String               line_seq            ,
			String               line_no             ,
			String               line_tp_lu_cd       ,
			String               inv_amt             ,
			String               inv_desc            ,
			String               inv_tax_cd          ,
			String               dtrb_coa_co_cd      ,
			String               dtrb_coa_rgn_cd     ,
			String               dtrb_coa_ctr_cd     ,
			String               dtrb_coa_acct_cd    ,
			String               dtrb_coa_vvd_cd     ,
			String               dtrb_coa_inter_co_cd,
			String               dtrb_coa_ftu_n1st_cd,
			String               dtrb_coa_ftu_n2nd_cd,
			String               attr_cate_nm        ,
			String               attr_ctnt1          ,
			String               attr_ctnt2          ,
			String               attr_ctnt3          ,
			String               attr_ctnt4          ,
			String               attr_ctnt5          ,
			String               attr_ctnt6          ,
			String               attr_ctnt7          ,
			String               attr_ctnt8          ,
			String               attr_ctnt9          ,
			String               attr_ctnt10         ,
			String               attr_ctnt11         ,
			String               attr_ctnt12         ,
			String               attr_ctnt13         ,
			String               attr_ctnt14         ,
			String               attr_ctnt15         ,
			String               bkg_no              ,
			String               bkg_no_split        ,
			String               cntr_tpsz_cd        ,
			String               act_vvd_cd          ,
			String               pln_sctr_div_cd     ,
			String               so_crr_cd           ,
			String               yd_cd               ,
			String               ftu_use_ctnt1       ,
			String               ftu_use_ctnt2       ,
			String               ftu_use_ctnt3       ,
			String               ftu_use_ctnt4       ,
			String               ftu_use_ctnt5       ,
			String               cre_dt              ,
			String               cre_usr_id          ,
			String               eai_evnt_dt         ){
		this.ibflag               = ibflag              ;
		this.page_rows            = page_rows           ;
		this.csr_no               = csr_no              ;
		this.line_seq             = line_seq            ;
		this.line_no              = line_no             ;
		this.line_tp_lu_cd        = line_tp_lu_cd       ;
		this.inv_amt              = inv_amt             ;
		this.inv_desc             = inv_desc            ;
		this.inv_tax_cd           = inv_tax_cd          ;
		this.dtrb_coa_co_cd       = dtrb_coa_co_cd      ;
		this.dtrb_coa_rgn_cd      = dtrb_coa_rgn_cd     ;
		this.dtrb_coa_ctr_cd      = dtrb_coa_ctr_cd     ;
		this.dtrb_coa_acct_cd     = dtrb_coa_acct_cd    ;
		this.dtrb_coa_vvd_cd      = dtrb_coa_vvd_cd     ;
		this.dtrb_coa_inter_co_cd = dtrb_coa_inter_co_cd;
		this.dtrb_coa_ftu_n1st_cd = dtrb_coa_ftu_n1st_cd;
		this.dtrb_coa_ftu_n2nd_cd = dtrb_coa_ftu_n2nd_cd;
		this.attr_cate_nm         = attr_cate_nm        ;
		this.attr_ctnt1           = attr_ctnt1          ;
		this.attr_ctnt2           = attr_ctnt2          ;
		this.attr_ctnt3           = attr_ctnt3          ;
		this.attr_ctnt4           = attr_ctnt4          ;
		this.attr_ctnt5           = attr_ctnt5          ;
		this.attr_ctnt6           = attr_ctnt6          ;
		this.attr_ctnt7           = attr_ctnt7          ;
		this.attr_ctnt8           = attr_ctnt8          ;
		this.attr_ctnt9           = attr_ctnt9          ;
		this.attr_ctnt10          = attr_ctnt10         ;
		this.attr_ctnt11          = attr_ctnt11         ;
		this.attr_ctnt12          = attr_ctnt12         ;
		this.attr_ctnt13          = attr_ctnt13         ;
		this.attr_ctnt14          = attr_ctnt14         ;
		this.attr_ctnt15          = attr_ctnt15         ;
		this.bkg_no               = bkg_no              ;
		this.bkg_no_split         = bkg_no_split        ;
		this.cntr_tpsz_cd         = cntr_tpsz_cd        ;
		this.act_vvd_cd           = act_vvd_cd          ;
		this.pln_sctr_div_cd      = pln_sctr_div_cd     ;
		this.so_crr_cd            = so_crr_cd           ;
		this.yd_cd                = yd_cd               ;
		this.ftu_use_ctnt1        = ftu_use_ctnt1       ;
		this.ftu_use_ctnt2        = ftu_use_ctnt2       ;
		this.ftu_use_ctnt3        = ftu_use_ctnt3       ;
		this.ftu_use_ctnt4        = ftu_use_ctnt4       ;
		this.ftu_use_ctnt5        = ftu_use_ctnt5       ;
		this.cre_dt               = cre_dt              ;
		this.cre_usr_id           = cre_usr_id          ;
		this.eai_evnt_dt          = eai_evnt_dt         ;
	}

	// getter method is proceeding ..
	public String               getIbflag              (){	return ibflag              	;	}
	public String               getPage_rows           (){	return page_rows           	;	}
	public String               getCsr_no              (){	return csr_no              	;	}
	public String               getLine_seq            (){	return line_seq            	;	}
	public String               getLine_no             (){	return line_no             	;	}
	public String               getLine_tp_lu_cd       (){	return line_tp_lu_cd       	;	}
	public String               getInv_amt             (){	return inv_amt             	;	}
	public String               getInv_desc            (){	return inv_desc            	;	}
	public String               getInv_tax_cd          (){	return inv_tax_cd          	;	}
	public String               getDtrb_coa_co_cd      (){	return dtrb_coa_co_cd      	;	}
	public String               getDtrb_coa_rgn_cd     (){	return dtrb_coa_rgn_cd     	;	}
	public String               getDtrb_coa_ctr_cd     (){	return dtrb_coa_ctr_cd     	;	}
	public String               getDtrb_coa_acct_cd    (){	return dtrb_coa_acct_cd    	;	}
	public String               getDtrb_coa_vvd_cd     (){	return dtrb_coa_vvd_cd     	;	}
	public String               getDtrb_coa_inter_co_cd(){	return dtrb_coa_inter_co_cd	;	}
	public String               getDtrb_coa_ftu_n1st_cd(){	return dtrb_coa_ftu_n1st_cd	;	}
	public String               getDtrb_coa_ftu_n2nd_cd(){	return dtrb_coa_ftu_n2nd_cd	;	}
	public String               getAttr_cate_nm        (){	return attr_cate_nm        	;	}
	public String               getAttr_ctnt1          (){	return attr_ctnt1          	;	}
	public String               getAttr_ctnt2          (){	return attr_ctnt2          	;	}
	public String               getAttr_ctnt3          (){	return attr_ctnt3          	;	}
	public String               getAttr_ctnt4          (){	return attr_ctnt4          	;	}
	public String               getAttr_ctnt5          (){	return attr_ctnt5          	;	}
	public String               getAttr_ctnt6          (){	return attr_ctnt6          	;	}
	public String               getAttr_ctnt7          (){	return attr_ctnt7          	;	}
	public String               getAttr_ctnt8          (){	return attr_ctnt8          	;	}
	public String               getAttr_ctnt9          (){	return attr_ctnt9          	;	}
	public String               getAttr_ctnt10         (){	return attr_ctnt10         	;	}
	public String               getAttr_ctnt11         (){	return attr_ctnt11         	;	}
	public String               getAttr_ctnt12         (){	return attr_ctnt12         	;	}
	public String               getAttr_ctnt13         (){	return attr_ctnt13         	;	}
	public String               getAttr_ctnt14         (){	return attr_ctnt14         	;	}
	public String               getAttr_ctnt15         (){	return attr_ctnt15         	;	}
	public String               getBkg_no              (){	return bkg_no              	;	}
	public String               getBkg_no_split        (){	return bkg_no_split        	;	}
	public String               getCntr_tpsz_cd        (){	return cntr_tpsz_cd        	;	}
	public String               getAct_vvd_cd          (){	return act_vvd_cd          	;	}
	public String               getPln_sctr_div_cd     (){	return pln_sctr_div_cd     	;	}
	public String               getSo_crr_cd           (){	return so_crr_cd           	;	}
	public String               getYd_cd               (){	return yd_cd               	;	}
	public String               getFtu_use_ctnt1       (){	return ftu_use_ctnt1       	;	}
	public String               getFtu_use_ctnt2       (){	return ftu_use_ctnt2       	;	}
	public String               getFtu_use_ctnt3       (){	return ftu_use_ctnt3       	;	}
	public String               getFtu_use_ctnt4       (){	return ftu_use_ctnt4       	;	}
	public String               getFtu_use_ctnt5       (){	return ftu_use_ctnt5       	;	}
	public String               getCre_dt              (){	return cre_dt              	;	}
	public String               getCre_usr_id          (){	return cre_usr_id          	;	}
	public String               getEai_evnt_dt         (){	return eai_evnt_dt         	;	}

	// setter method is proceeding ..
	public void setIbflag              ( String               ibflag               ){	this.ibflag               = ibflag              	;	}
	public void setPage_rows           ( String               page_rows            ){	this.page_rows            = page_rows           	;	}
	public void setCsr_no              ( String               csr_no               ){	this.csr_no               = csr_no              	;	}
	public void setLine_seq            ( String               line_seq             ){	this.line_seq             = line_seq            	;	}
	public void setLine_no             ( String               line_no              ){	this.line_no              = line_no             	;	}
	public void setLine_tp_lu_cd       ( String               line_tp_lu_cd        ){	this.line_tp_lu_cd        = line_tp_lu_cd       	;	}
	public void setInv_amt             ( String               inv_amt              ){	this.inv_amt              = inv_amt             	;	}
	public void setInv_desc            ( String               inv_desc             ){	this.inv_desc             = inv_desc            	;	}
	public void setInv_tax_cd          ( String               inv_tax_cd           ){	this.inv_tax_cd           = inv_tax_cd          	;	}
	public void setDtrb_coa_co_cd      ( String               dtrb_coa_co_cd       ){	this.dtrb_coa_co_cd       = dtrb_coa_co_cd      	;	}
	public void setDtrb_coa_rgn_cd     ( String               dtrb_coa_rgn_cd      ){	this.dtrb_coa_rgn_cd      = dtrb_coa_rgn_cd     	;	}
	public void setDtrb_coa_ctr_cd     ( String               dtrb_coa_ctr_cd      ){	this.dtrb_coa_ctr_cd      = dtrb_coa_ctr_cd     	;	}
	public void setDtrb_coa_acct_cd    ( String               dtrb_coa_acct_cd     ){	this.dtrb_coa_acct_cd     = dtrb_coa_acct_cd    	;	}
	public void setDtrb_coa_vvd_cd     ( String               dtrb_coa_vvd_cd      ){	this.dtrb_coa_vvd_cd      = dtrb_coa_vvd_cd     	;	}
	public void setDtrb_coa_inter_co_cd( String               dtrb_coa_inter_co_cd ){	this.dtrb_coa_inter_co_cd = dtrb_coa_inter_co_cd	;	}
	public void setDtrb_coa_ftu_n1st_cd( String               dtrb_coa_ftu_n1st_cd ){	this.dtrb_coa_ftu_n1st_cd = dtrb_coa_ftu_n1st_cd	;	}
	public void setDtrb_coa_ftu_n2nd_cd( String               dtrb_coa_ftu_n2nd_cd ){	this.dtrb_coa_ftu_n2nd_cd = dtrb_coa_ftu_n2nd_cd	;	}
	public void setAttr_cate_nm        ( String               attr_cate_nm         ){	this.attr_cate_nm         = attr_cate_nm        	;	}
	public void setAttr_ctnt1          ( String               attr_ctnt1           ){	this.attr_ctnt1           = attr_ctnt1          	;	}
	public void setAttr_ctnt2          ( String               attr_ctnt2           ){	this.attr_ctnt2           = attr_ctnt2          	;	}
	public void setAttr_ctnt3          ( String               attr_ctnt3           ){	this.attr_ctnt3           = attr_ctnt3          	;	}
	public void setAttr_ctnt4          ( String               attr_ctnt4           ){	this.attr_ctnt4           = attr_ctnt4          	;	}
	public void setAttr_ctnt5          ( String               attr_ctnt5           ){	this.attr_ctnt5           = attr_ctnt5          	;	}
	public void setAttr_ctnt6          ( String               attr_ctnt6           ){	this.attr_ctnt6           = attr_ctnt6          	;	}
	public void setAttr_ctnt7          ( String               attr_ctnt7           ){	this.attr_ctnt7           = attr_ctnt7          	;	}
	public void setAttr_ctnt8          ( String               attr_ctnt8           ){	this.attr_ctnt8           = attr_ctnt8          	;	}
	public void setAttr_ctnt9          ( String               attr_ctnt9           ){	this.attr_ctnt9           = attr_ctnt9          	;	}
	public void setAttr_ctnt10         ( String               attr_ctnt10          ){	this.attr_ctnt10          = attr_ctnt10         	;	}
	public void setAttr_ctnt11         ( String               attr_ctnt11          ){	this.attr_ctnt11          = attr_ctnt11         	;	}
	public void setAttr_ctnt12         ( String               attr_ctnt12          ){	this.attr_ctnt12          = attr_ctnt12         	;	}
	public void setAttr_ctnt13         ( String               attr_ctnt13          ){	this.attr_ctnt13          = attr_ctnt13         	;	}
	public void setAttr_ctnt14         ( String               attr_ctnt14          ){	this.attr_ctnt14          = attr_ctnt14         	;	}
	public void setAttr_ctnt15         ( String               attr_ctnt15          ){	this.attr_ctnt15          = attr_ctnt15         	;	}
	public void setBkg_no              ( String               bkg_no               ){	this.bkg_no               = bkg_no              	;	}
	public void setBkg_no_split        ( String               bkg_no_split         ){	this.bkg_no_split         = bkg_no_split        	;	}
	public void setCntr_tpsz_cd        ( String               cntr_tpsz_cd         ){	this.cntr_tpsz_cd         = cntr_tpsz_cd        	;	}
	public void setAct_vvd_cd          ( String               act_vvd_cd           ){	this.act_vvd_cd           = act_vvd_cd          	;	}
	public void setPln_sctr_div_cd     ( String               pln_sctr_div_cd      ){	this.pln_sctr_div_cd      = pln_sctr_div_cd     	;	}
	public void setSo_crr_cd           ( String               so_crr_cd            ){	this.so_crr_cd            = so_crr_cd           	;	}
	public void setYd_cd               ( String               yd_cd                ){	this.yd_cd                = yd_cd               	;	}
	public void setFtu_use_ctnt1       ( String               ftu_use_ctnt1        ){	this.ftu_use_ctnt1        = ftu_use_ctnt1       	;	}
	public void setFtu_use_ctnt2       ( String               ftu_use_ctnt2        ){	this.ftu_use_ctnt2        = ftu_use_ctnt2       	;	}
	public void setFtu_use_ctnt3       ( String               ftu_use_ctnt3        ){	this.ftu_use_ctnt3        = ftu_use_ctnt3       	;	}
	public void setFtu_use_ctnt4       ( String               ftu_use_ctnt4        ){	this.ftu_use_ctnt4        = ftu_use_ctnt4       	;	}
	public void setFtu_use_ctnt5       ( String               ftu_use_ctnt5        ){	this.ftu_use_ctnt5        = ftu_use_ctnt5       	;	}
	public void setCre_dt              ( String               cre_dt               ){	this.cre_dt               = cre_dt              	;	}
	public void setCre_usr_id          ( String               cre_usr_id           ){	this.cre_usr_id           = cre_usr_id          	;	}
	public void setEai_evnt_dt         ( String               eai_evnt_dt          ){	this.eai_evnt_dt          = eai_evnt_dt         	;	}

	public static AP_INV_DTRB fromRequest(HttpServletRequest request) {
		AP_INV_DTRB model = new AP_INV_DTRB();
		try {
			model.setIbflag              	(JSPUtil.getParameter(request, "ibflag              		".trim(), ""));
			model.setPage_rows           	(JSPUtil.getParameter(request, "page_rows           		".trim(), ""));
			model.setCsr_no              	(JSPUtil.getParameter(request, "csr_no              		".trim(), ""));
			model.setLine_seq            	(JSPUtil.getParameter(request, "line_seq            		".trim(), ""));
			model.setLine_no             	(JSPUtil.getParameter(request, "line_no             		".trim(), ""));
			model.setLine_tp_lu_cd       	(JSPUtil.getParameter(request, "line_tp_lu_cd       		".trim(), ""));
			model.setInv_amt             	(JSPUtil.getParameter(request, "inv_amt             		".trim(), ""));
			model.setInv_desc            	(JSPUtil.getParameter(request, "inv_desc            		".trim(), ""));
			model.setInv_tax_cd          	(JSPUtil.getParameter(request, "inv_tax_cd          		".trim(), ""));
			model.setDtrb_coa_co_cd      	(JSPUtil.getParameter(request, "dtrb_coa_co_cd      		".trim(), ""));
			model.setDtrb_coa_rgn_cd     	(JSPUtil.getParameter(request, "dtrb_coa_rgn_cd     		".trim(), ""));
			model.setDtrb_coa_ctr_cd     	(JSPUtil.getParameter(request, "dtrb_coa_ctr_cd     		".trim(), ""));
			model.setDtrb_coa_acct_cd    	(JSPUtil.getParameter(request, "dtrb_coa_acct_cd    		".trim(), ""));
			model.setDtrb_coa_vvd_cd     	(JSPUtil.getParameter(request, "dtrb_coa_vvd_cd     		".trim(), ""));
			model.setDtrb_coa_inter_co_cd	(JSPUtil.getParameter(request, "dtrb_coa_inter_co_cd		".trim(), ""));
			model.setDtrb_coa_ftu_n1st_cd	(JSPUtil.getParameter(request, "dtrb_coa_ftu_n1st_cd		".trim(), ""));
			model.setDtrb_coa_ftu_n2nd_cd	(JSPUtil.getParameter(request, "dtrb_coa_ftu_n2nd_cd		".trim(), ""));
			model.setAttr_cate_nm        	(JSPUtil.getParameter(request, "attr_cate_nm        		".trim(), ""));
			model.setAttr_ctnt1          	(JSPUtil.getParameter(request, "attr_ctnt1          		".trim(), ""));
			model.setAttr_ctnt2          	(JSPUtil.getParameter(request, "attr_ctnt2          		".trim(), ""));
			model.setAttr_ctnt3          	(JSPUtil.getParameter(request, "attr_ctnt3          		".trim(), ""));
			model.setAttr_ctnt4          	(JSPUtil.getParameter(request, "attr_ctnt4          		".trim(), ""));
			model.setAttr_ctnt5          	(JSPUtil.getParameter(request, "attr_ctnt5          		".trim(), ""));
			model.setAttr_ctnt6          	(JSPUtil.getParameter(request, "attr_ctnt6          		".trim(), ""));
			model.setAttr_ctnt7          	(JSPUtil.getParameter(request, "attr_ctnt7          		".trim(), ""));
			model.setAttr_ctnt8          	(JSPUtil.getParameter(request, "attr_ctnt8          		".trim(), ""));
			model.setAttr_ctnt9          	(JSPUtil.getParameter(request, "attr_ctnt9          		".trim(), ""));
			model.setAttr_ctnt10         	(JSPUtil.getParameter(request, "attr_ctnt10         		".trim(), ""));
			model.setAttr_ctnt11         	(JSPUtil.getParameter(request, "attr_ctnt11         		".trim(), ""));
			model.setAttr_ctnt12         	(JSPUtil.getParameter(request, "attr_ctnt12         		".trim(), ""));
			model.setAttr_ctnt13         	(JSPUtil.getParameter(request, "attr_ctnt13         		".trim(), ""));
			model.setAttr_ctnt14         	(JSPUtil.getParameter(request, "attr_ctnt14         		".trim(), ""));
			model.setAttr_ctnt15         	(JSPUtil.getParameter(request, "attr_ctnt15         		".trim(), ""));
			model.setBkg_no              	(JSPUtil.getParameter(request, "bkg_no              		".trim(), ""));
			model.setBkg_no_split        	(JSPUtil.getParameter(request, "bkg_no_split        		".trim(), ""));
			model.setCntr_tpsz_cd        	(JSPUtil.getParameter(request, "cntr_tpsz_cd        		".trim(), ""));
			model.setAct_vvd_cd          	(JSPUtil.getParameter(request, "act_vvd_cd          		".trim(), ""));
			model.setPln_sctr_div_cd     	(JSPUtil.getParameter(request, "pln_sctr_div_cd     		".trim(), ""));
			model.setSo_crr_cd           	(JSPUtil.getParameter(request, "so_crr_cd           		".trim(), ""));
			model.setYd_cd               	(JSPUtil.getParameter(request, "yd_cd               		".trim(), ""));
			model.setFtu_use_ctnt1       	(JSPUtil.getParameter(request, "ftu_use_ctnt1       		".trim(), ""));
			model.setFtu_use_ctnt2       	(JSPUtil.getParameter(request, "ftu_use_ctnt2       		".trim(), ""));
			model.setFtu_use_ctnt3       	(JSPUtil.getParameter(request, "ftu_use_ctnt3       		".trim(), ""));
			model.setFtu_use_ctnt4       	(JSPUtil.getParameter(request, "ftu_use_ctnt4       		".trim(), ""));
			model.setFtu_use_ctnt5       	(JSPUtil.getParameter(request, "ftu_use_ctnt5       		".trim(), ""));
			model.setCre_dt              	(JSPUtil.getParameter(request, "cre_dt              		".trim(), ""));
			model.setCre_usr_id          	(JSPUtil.getParameter(request, "cre_usr_id          		".trim(), ""));
			model.setEai_evnt_dt         	(JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		AP_INV_DTRB model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, "page_rows           		".trim(), length));
			String[] csr_no               =  (JSPUtil.getParameter(request, "csr_no              		".trim(), length));
			String[] line_seq             =  (JSPUtil.getParameter(request, "line_seq            		".trim(), length));
			String[] line_no              =  (JSPUtil.getParameter(request, "line_no             		".trim(), length));
			String[] line_tp_lu_cd        =  (JSPUtil.getParameter(request, "line_tp_lu_cd       		".trim(), length));
			String[] inv_amt              =  (JSPUtil.getParameter(request, "inv_amt             		".trim(), length));
			String[] inv_desc             =  (JSPUtil.getParameter(request, "inv_desc            		".trim(), length));
			String[] inv_tax_cd           =  (JSPUtil.getParameter(request, "inv_tax_cd          		".trim(), length));
			String[] dtrb_coa_co_cd       =  (JSPUtil.getParameter(request, "dtrb_coa_co_cd      		".trim(), length));
			String[] dtrb_coa_rgn_cd      =  (JSPUtil.getParameter(request, "dtrb_coa_rgn_cd     		".trim(), length));
			String[] dtrb_coa_ctr_cd      =  (JSPUtil.getParameter(request, "dtrb_coa_ctr_cd     		".trim(), length));
			String[] dtrb_coa_acct_cd     =  (JSPUtil.getParameter(request, "dtrb_coa_acct_cd    		".trim(), length));
			String[] dtrb_coa_vvd_cd      =  (JSPUtil.getParameter(request, "dtrb_coa_vvd_cd     		".trim(), length));
			String[] dtrb_coa_inter_co_cd =  (JSPUtil.getParameter(request, "dtrb_coa_inter_co_cd		".trim(), length));
			String[] dtrb_coa_ftu_n1st_cd =  (JSPUtil.getParameter(request, "dtrb_coa_ftu_n1st_cd		".trim(), length));
			String[] dtrb_coa_ftu_n2nd_cd =  (JSPUtil.getParameter(request, "dtrb_coa_ftu_n2nd_cd		".trim(), length));
			String[] attr_cate_nm         =  (JSPUtil.getParameter(request, "attr_cate_nm        		".trim(), length));
			String[] attr_ctnt1           =  (JSPUtil.getParameter(request, "attr_ctnt1          		".trim(), length));
			String[] attr_ctnt2           =  (JSPUtil.getParameter(request, "attr_ctnt2          		".trim(), length));
			String[] attr_ctnt3           =  (JSPUtil.getParameter(request, "attr_ctnt3          		".trim(), length));
			String[] attr_ctnt4           =  (JSPUtil.getParameter(request, "attr_ctnt4          		".trim(), length));
			String[] attr_ctnt5           =  (JSPUtil.getParameter(request, "attr_ctnt5          		".trim(), length));
			String[] attr_ctnt6           =  (JSPUtil.getParameter(request, "attr_ctnt6          		".trim(), length));
			String[] attr_ctnt7           =  (JSPUtil.getParameter(request, "attr_ctnt7          		".trim(), length));
			String[] attr_ctnt8           =  (JSPUtil.getParameter(request, "attr_ctnt8          		".trim(), length));
			String[] attr_ctnt9           =  (JSPUtil.getParameter(request, "attr_ctnt9          		".trim(), length));
			String[] attr_ctnt10          =  (JSPUtil.getParameter(request, "attr_ctnt10         		".trim(), length));
			String[] attr_ctnt11          =  (JSPUtil.getParameter(request, "attr_ctnt11         		".trim(), length));
			String[] attr_ctnt12          =  (JSPUtil.getParameter(request, "attr_ctnt12         		".trim(), length));
			String[] attr_ctnt13          =  (JSPUtil.getParameter(request, "attr_ctnt13         		".trim(), length));
			String[] attr_ctnt14          =  (JSPUtil.getParameter(request, "attr_ctnt14         		".trim(), length));
			String[] attr_ctnt15          =  (JSPUtil.getParameter(request, "attr_ctnt15         		".trim(), length));
			String[] bkg_no               =  (JSPUtil.getParameter(request, "bkg_no              		".trim(), length));
			String[] bkg_no_split         =  (JSPUtil.getParameter(request, "bkg_no_split        		".trim(), length));
			String[] cntr_tpsz_cd         =  (JSPUtil.getParameter(request, "cntr_tpsz_cd        		".trim(), length));
			String[] act_vvd_cd           =  (JSPUtil.getParameter(request, "act_vvd_cd          		".trim(), length));
			String[] pln_sctr_div_cd      =  (JSPUtil.getParameter(request, "pln_sctr_div_cd     		".trim(), length));
			String[] so_crr_cd            =  (JSPUtil.getParameter(request, "so_crr_cd           		".trim(), length));
			String[] yd_cd                =  (JSPUtil.getParameter(request, "yd_cd               		".trim(), length));
			String[] ftu_use_ctnt1        =  (JSPUtil.getParameter(request, "ftu_use_ctnt1       		".trim(), length));
			String[] ftu_use_ctnt2        =  (JSPUtil.getParameter(request, "ftu_use_ctnt2       		".trim(), length));
			String[] ftu_use_ctnt3        =  (JSPUtil.getParameter(request, "ftu_use_ctnt3       		".trim(), length));
			String[] ftu_use_ctnt4        =  (JSPUtil.getParameter(request, "ftu_use_ctnt4       		".trim(), length));
			String[] ftu_use_ctnt5        =  (JSPUtil.getParameter(request, "ftu_use_ctnt5       		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, "cre_dt              		".trim(), length));
			String[] cre_usr_id           =  (JSPUtil.getParameter(request, "cre_usr_id          		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AP_INV_DTRB();
				model.setIbflag              		  (ibflag              	[i]);
				model.setPage_rows           		  (page_rows           	[i]);
				model.setCsr_no              		  (csr_no              	[i]);
				model.setLine_seq            		  (line_seq            	[i]);
				model.setLine_no             		  (line_no             	[i]);
				model.setLine_tp_lu_cd       		  (line_tp_lu_cd       	[i]);
				model.setInv_amt             		  (inv_amt             	[i]);
				model.setInv_desc            		  (inv_desc            	[i]);
				model.setInv_tax_cd          		  (inv_tax_cd          	[i]);
				model.setDtrb_coa_co_cd      		  (dtrb_coa_co_cd      	[i]);
				model.setDtrb_coa_rgn_cd     		  (dtrb_coa_rgn_cd     	[i]);
				model.setDtrb_coa_ctr_cd     		  (dtrb_coa_ctr_cd     	[i]);
				model.setDtrb_coa_acct_cd    		  (dtrb_coa_acct_cd    	[i]);
				model.setDtrb_coa_vvd_cd     		  (dtrb_coa_vvd_cd     	[i]);
				model.setDtrb_coa_inter_co_cd		  (dtrb_coa_inter_co_cd	[i]);
				model.setDtrb_coa_ftu_n1st_cd		  (dtrb_coa_ftu_n1st_cd	[i]);
				model.setDtrb_coa_ftu_n2nd_cd		  (dtrb_coa_ftu_n2nd_cd	[i]);
				model.setAttr_cate_nm        		  (attr_cate_nm        	[i]);
				model.setAttr_ctnt1          		  (attr_ctnt1          	[i]);
				model.setAttr_ctnt2          		  (attr_ctnt2          	[i]);
				model.setAttr_ctnt3          		  (attr_ctnt3          	[i]);
				model.setAttr_ctnt4          		  (attr_ctnt4          	[i]);
				model.setAttr_ctnt5          		  (attr_ctnt5          	[i]);
				model.setAttr_ctnt6          		  (attr_ctnt6          	[i]);
				model.setAttr_ctnt7          		  (attr_ctnt7          	[i]);
				model.setAttr_ctnt8          		  (attr_ctnt8          	[i]);
				model.setAttr_ctnt9          		  (attr_ctnt9          	[i]);
				model.setAttr_ctnt10         		  (attr_ctnt10         	[i]);
				model.setAttr_ctnt11         		  (attr_ctnt11         	[i]);
				model.setAttr_ctnt12         		  (attr_ctnt12         	[i]);
				model.setAttr_ctnt13         		  (attr_ctnt13         	[i]);
				model.setAttr_ctnt14         		  (attr_ctnt14         	[i]);
				model.setAttr_ctnt15         		  (attr_ctnt15         	[i]);
				model.setBkg_no              		  (bkg_no              	[i]);
				model.setBkg_no_split        		  (bkg_no_split        	[i]);
				model.setCntr_tpsz_cd        		  (cntr_tpsz_cd        	[i]);
				model.setAct_vvd_cd          		  (act_vvd_cd          	[i]);
				model.setPln_sctr_div_cd     		  (pln_sctr_div_cd     	[i]);
				model.setSo_crr_cd           		  (so_crr_cd           	[i]);
				model.setYd_cd               		  (yd_cd               	[i]);
				model.setFtu_use_ctnt1       		  (ftu_use_ctnt1       	[i]);
				model.setFtu_use_ctnt2       		  (ftu_use_ctnt2       	[i]);
				model.setFtu_use_ctnt3       		  (ftu_use_ctnt3       	[i]);
				model.setFtu_use_ctnt4       		  (ftu_use_ctnt4       	[i]);
				model.setFtu_use_ctnt5       		  (ftu_use_ctnt5       	[i]);
				model.setCre_dt              		  (cre_dt              	[i]);
				model.setCre_usr_id          		  (cre_usr_id          	[i]);
				model.setEai_evnt_dt         		  (eai_evnt_dt         	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		AP_INV_DTRB model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues(prefix+"ibflag")==null?0:request.getParameterValues(prefix+"ibflag").length;
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, prefix + "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, prefix + "page_rows           		".trim(), length));
			String[] csr_no               =  (JSPUtil.getParameter(request, prefix + "csr_no              		".trim(), length));
			String[] line_seq             =  (JSPUtil.getParameter(request, prefix + "line_seq            		".trim(), length));
			String[] line_no              =  (JSPUtil.getParameter(request, prefix + "line_no             		".trim(), length));
			String[] line_tp_lu_cd        =  (JSPUtil.getParameter(request, prefix + "line_tp_lu_cd       		".trim(), length));
			String[] inv_amt              =  (JSPUtil.getParameter(request, prefix + "inv_amt             		".trim(), length));
			String[] inv_desc             =  (JSPUtil.getParameter(request, prefix + "inv_desc            		".trim(), length));
			String[] inv_tax_cd           =  (JSPUtil.getParameter(request, prefix + "inv_tax_cd          		".trim(), length));
			String[] dtrb_coa_co_cd       =  (JSPUtil.getParameter(request, prefix + "dtrb_coa_co_cd      		".trim(), length));
			String[] dtrb_coa_rgn_cd      =  (JSPUtil.getParameter(request, prefix + "dtrb_coa_rgn_cd     		".trim(), length));
			String[] dtrb_coa_ctr_cd      =  (JSPUtil.getParameter(request, prefix + "dtrb_coa_ctr_cd     		".trim(), length));
			String[] dtrb_coa_acct_cd     =  (JSPUtil.getParameter(request, prefix + "dtrb_coa_acct_cd    		".trim(), length));
			String[] dtrb_coa_vvd_cd      =  (JSPUtil.getParameter(request, prefix + "dtrb_coa_vvd_cd     		".trim(), length));
			String[] dtrb_coa_inter_co_cd =  (JSPUtil.getParameter(request, prefix + "dtrb_coa_inter_co_cd		".trim(), length));
			String[] dtrb_coa_ftu_n1st_cd =  (JSPUtil.getParameter(request, prefix + "dtrb_coa_ftu_n1st_cd		".trim(), length));
			String[] dtrb_coa_ftu_n2nd_cd =  (JSPUtil.getParameter(request, prefix + "dtrb_coa_ftu_n2nd_cd		".trim(), length));
			String[] attr_cate_nm         =  (JSPUtil.getParameter(request, prefix + "attr_cate_nm        		".trim(), length));
			String[] attr_ctnt1           =  (JSPUtil.getParameter(request, prefix + "attr_ctnt1          		".trim(), length));
			String[] attr_ctnt2           =  (JSPUtil.getParameter(request, prefix + "attr_ctnt2          		".trim(), length));
			String[] attr_ctnt3           =  (JSPUtil.getParameter(request, prefix + "attr_ctnt3          		".trim(), length));
			String[] attr_ctnt4           =  (JSPUtil.getParameter(request, prefix + "attr_ctnt4          		".trim(), length));
			String[] attr_ctnt5           =  (JSPUtil.getParameter(request, prefix + "attr_ctnt5          		".trim(), length));
			String[] attr_ctnt6           =  (JSPUtil.getParameter(request, prefix + "attr_ctnt6          		".trim(), length));
			String[] attr_ctnt7           =  (JSPUtil.getParameter(request, prefix + "attr_ctnt7          		".trim(), length));
			String[] attr_ctnt8           =  (JSPUtil.getParameter(request, prefix + "attr_ctnt8          		".trim(), length));
			String[] attr_ctnt9           =  (JSPUtil.getParameter(request, prefix + "attr_ctnt9          		".trim(), length));
			String[] attr_ctnt10          =  (JSPUtil.getParameter(request, prefix + "attr_ctnt10         		".trim(), length));
			String[] attr_ctnt11          =  (JSPUtil.getParameter(request, prefix + "attr_ctnt11         		".trim(), length));
			String[] attr_ctnt12          =  (JSPUtil.getParameter(request, prefix + "attr_ctnt12         		".trim(), length));
			String[] attr_ctnt13          =  (JSPUtil.getParameter(request, prefix + "attr_ctnt13         		".trim(), length));
			String[] attr_ctnt14          =  (JSPUtil.getParameter(request, prefix + "attr_ctnt14         		".trim(), length));
			String[] attr_ctnt15          =  (JSPUtil.getParameter(request, prefix + "attr_ctnt15         		".trim(), length));
			String[] bkg_no               =  (JSPUtil.getParameter(request, prefix + "bkg_no              		".trim(), length));
			String[] bkg_no_split         =  (JSPUtil.getParameter(request, prefix + "bkg_no_split        		".trim(), length));
			String[] cntr_tpsz_cd         =  (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd        		".trim(), length));
			String[] act_vvd_cd           =  (JSPUtil.getParameter(request, prefix + "act_vvd_cd          		".trim(), length));
			String[] pln_sctr_div_cd      =  (JSPUtil.getParameter(request, prefix + "pln_sctr_div_cd     		".trim(), length));
			String[] so_crr_cd            =  (JSPUtil.getParameter(request, prefix + "so_crr_cd           		".trim(), length));
			String[] yd_cd                =  (JSPUtil.getParameter(request, prefix + "yd_cd               		".trim(), length));
			String[] ftu_use_ctnt1        =  (JSPUtil.getParameter(request, prefix + "ftu_use_ctnt1       		".trim(), length));
			String[] ftu_use_ctnt2        =  (JSPUtil.getParameter(request, prefix + "ftu_use_ctnt2       		".trim(), length));
			String[] ftu_use_ctnt3        =  (JSPUtil.getParameter(request, prefix + "ftu_use_ctnt3       		".trim(), length));
			String[] ftu_use_ctnt4        =  (JSPUtil.getParameter(request, prefix + "ftu_use_ctnt4       		".trim(), length));
			String[] ftu_use_ctnt5        =  (JSPUtil.getParameter(request, prefix + "ftu_use_ctnt5       		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, prefix + "cre_dt              		".trim(), length));
			String[] cre_usr_id           =  (JSPUtil.getParameter(request, prefix + "cre_usr_id          		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AP_INV_DTRB();
				model.setIbflag              		  ( ibflag              	[i]);
				model.setPage_rows           		  ( page_rows           	[i]);
				model.setCsr_no              		  ( csr_no              	[i]);
				model.setLine_seq            		  ( line_seq            	[i]);
				model.setLine_no             		  ( line_no             	[i]);
				model.setLine_tp_lu_cd       		  ( line_tp_lu_cd       	[i]);
				model.setInv_amt             		  ( inv_amt             	[i]);
				model.setInv_desc            		  ( inv_desc            	[i]);
				model.setInv_tax_cd          		  ( inv_tax_cd          	[i]);
				model.setDtrb_coa_co_cd      		  ( dtrb_coa_co_cd      	[i]);
				model.setDtrb_coa_rgn_cd     		  ( dtrb_coa_rgn_cd     	[i]);
				model.setDtrb_coa_ctr_cd     		  ( dtrb_coa_ctr_cd     	[i]);
				model.setDtrb_coa_acct_cd    		  ( dtrb_coa_acct_cd    	[i]);
				model.setDtrb_coa_vvd_cd     		  ( dtrb_coa_vvd_cd     	[i]);
				model.setDtrb_coa_inter_co_cd		  ( dtrb_coa_inter_co_cd	[i]);
				model.setDtrb_coa_ftu_n1st_cd		  ( dtrb_coa_ftu_n1st_cd	[i]);
				model.setDtrb_coa_ftu_n2nd_cd		  ( dtrb_coa_ftu_n2nd_cd	[i]);
				model.setAttr_cate_nm        		  ( attr_cate_nm        	[i]);
				model.setAttr_ctnt1          		  ( attr_ctnt1          	[i]);
				model.setAttr_ctnt2          		  ( attr_ctnt2          	[i]);
				model.setAttr_ctnt3          		  ( attr_ctnt3          	[i]);
				model.setAttr_ctnt4          		  ( attr_ctnt4          	[i]);
				model.setAttr_ctnt5          		  ( attr_ctnt5          	[i]);
				model.setAttr_ctnt6          		  ( attr_ctnt6          	[i]);
				model.setAttr_ctnt7          		  ( attr_ctnt7          	[i]);
				model.setAttr_ctnt8          		  ( attr_ctnt8          	[i]);
				model.setAttr_ctnt9          		  ( attr_ctnt9          	[i]);
				model.setAttr_ctnt10         		  ( attr_ctnt10         	[i]);
				model.setAttr_ctnt11         		  ( attr_ctnt11         	[i]);
				model.setAttr_ctnt12         		  ( attr_ctnt12         	[i]);
				model.setAttr_ctnt13         		  ( attr_ctnt13         	[i]);
				model.setAttr_ctnt14         		  ( attr_ctnt14         	[i]);
				model.setAttr_ctnt15         		  ( attr_ctnt15         	[i]);
				model.setBkg_no              		  ( bkg_no              	[i]);
				model.setBkg_no_split        		  ( bkg_no_split        	[i]);
				model.setCntr_tpsz_cd        		  ( cntr_tpsz_cd        	[i]);
				model.setAct_vvd_cd          		  ( act_vvd_cd          	[i]);
				model.setPln_sctr_div_cd     		  ( pln_sctr_div_cd     	[i]);
				model.setSo_crr_cd           		  ( so_crr_cd           	[i]);
				model.setYd_cd               		  ( yd_cd               	[i]);
				model.setFtu_use_ctnt1       		  ( ftu_use_ctnt1       	[i]);
				model.setFtu_use_ctnt2       		  ( ftu_use_ctnt2       	[i]);
				model.setFtu_use_ctnt3       		  ( ftu_use_ctnt3       	[i]);
				model.setFtu_use_ctnt4       		  ( ftu_use_ctnt4       	[i]);
				model.setFtu_use_ctnt5       		  ( ftu_use_ctnt5       	[i]);
				model.setCre_dt              		  ( cre_dt              	[i]);
				model.setCre_usr_id          		  ( cre_usr_id          	[i]);
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
