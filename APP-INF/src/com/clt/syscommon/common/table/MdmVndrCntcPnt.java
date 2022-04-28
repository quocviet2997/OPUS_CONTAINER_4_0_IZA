/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_VNDR_CNTC_PNT.java
*@FileTitle : MDM_VNDR_CNTC_PNT
*Open Issues :
*Change history :
*@LastModifyDate : 2007-06-07
*@LastModifier : Kim Jin-eung
*@LastVersion : 1.1
* 2007-01-12 Kim Jung-Jae
* 1.0 최초 생성
* 2007-06-07 Kim Jin-seung
* 1.1 Corrected 
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
 * @author Kim Jung-Jae
 * @since J2EE 1.4
 */
public final class MdmVndrCntcPnt implements java.io.Serializable {

	private String            ibflag            = "";
	private String            page_rows         = "";
	private String            vndr_seq          = "";
	private String            vndr_cntc_pnt_seq = "";
	private String            intl_phn_no       = "";
	private String            phn_no            = "";
	private String            intl_fax_no       = "";
	private String            fax_no            = "";
	private String            vndr_eml          = "";
	private String            eai_evnt_dt       = "";
	private String            prmry_chk_flg     = "";
	private String            delt_flg          = "";
	private String            cre_usr_id        = "";
	private String            cre_dt            = "";
	private String            upd_usr_id        = "";
	private String            upd_dt            = "";
	private String            cntc_div_cd       = "";

	public MdmVndrCntcPnt(){}

	public MdmVndrCntcPnt(
			String            ibflag           ,
			String            page_rows        ,
			String            vndr_seq         ,
			String            vndr_cntc_pnt_seq,
			String            intl_phn_no      ,
			String            phn_no           ,
			String            intl_fax_no      ,
			String            fax_no           ,
			String            vndr_eml         ,
			String            eai_evnt_dt      ,
			String            prmry_chk_flg    ,
			String            delt_flg         ,
			String            cre_usr_id       ,
			String            cre_dt           ,
			String            upd_usr_id       ,
			String            upd_dt           ,
			String            cntc_div_cd      ){
		this.ibflag            = ibflag           ;
		this.page_rows         = page_rows        ;
		this.vndr_seq          = vndr_seq         ;
		this.vndr_cntc_pnt_seq = vndr_cntc_pnt_seq;
		this.intl_phn_no       = intl_phn_no      ;
		this.phn_no            = phn_no           ;
		this.intl_fax_no       = intl_fax_no      ;
		this.fax_no            = fax_no           ;
		this.vndr_eml          = vndr_eml         ;
		this.eai_evnt_dt       = eai_evnt_dt      ;
		this.prmry_chk_flg     = prmry_chk_flg    ;
		this.delt_flg          = delt_flg         ;
		this.cre_usr_id        = cre_usr_id       ;
		this.cre_dt            = cre_dt           ;
		this.upd_usr_id        = upd_usr_id       ;
		this.upd_dt            = upd_dt           ;
		this.cntc_div_cd       = cntc_div_cd      ;
	}

	// getter method is proceeding ..
	public String            getIbflag           (){	return ibflag           	;	}
	public String            getPage_rows        (){	return page_rows        	;	}
	public String            getVndr_seq         (){	return vndr_seq         	;	}
	public String            getVndr_cntc_pnt_seq(){	return vndr_cntc_pnt_seq	;	}
	public String            getIntl_phn_no      (){	return intl_phn_no      	;	}
	public String            getPhn_no           (){	return phn_no           	;	}
	public String            getIntl_fax_no      (){	return intl_fax_no      	;	}
	public String            getFax_no           (){	return fax_no           	;	}
	public String            getVndr_eml         (){	return vndr_eml         	;	}
	public String            getEai_evnt_dt      (){	return eai_evnt_dt      	;	}
	public String            getPrmry_chk_flg    (){	return prmry_chk_flg    	;	}
	public String            getDelt_flg         (){	return delt_flg         	;	}
	public String            getCre_usr_id       (){	return cre_usr_id       	;	}
	public String            getCre_dt           (){	return cre_dt           	;	}
	public String            getUpd_usr_id       (){	return upd_usr_id       	;	}
	public String            getUpd_dt           (){	return upd_dt           	;	}
	public String            getCntc_div_cd      (){	return cntc_div_cd      	;	}

	// setter method is proceeding ..
	public void setIbflag           ( String            ibflag            ){	this.ibflag            = ibflag           	;	}
	public void setPage_rows        ( String            page_rows         ){	this.page_rows         = page_rows        	;	}
	public void setVndr_seq         ( String            vndr_seq          ){	this.vndr_seq          = vndr_seq         	;	}
	public void setVndr_cntc_pnt_seq( String            vndr_cntc_pnt_seq ){	this.vndr_cntc_pnt_seq = vndr_cntc_pnt_seq	;	}
	public void setIntl_phn_no      ( String            intl_phn_no       ){	this.intl_phn_no       = intl_phn_no      	;	}
	public void setPhn_no           ( String            phn_no            ){	this.phn_no            = phn_no           	;	}
	public void setIntl_fax_no      ( String            intl_fax_no       ){	this.intl_fax_no       = intl_fax_no      	;	}
	public void setFax_no           ( String            fax_no            ){	this.fax_no            = fax_no           	;	}
	public void setVndr_eml         ( String            vndr_eml          ){	this.vndr_eml          = vndr_eml         	;	}
	public void setEai_evnt_dt      ( String            eai_evnt_dt       ){	this.eai_evnt_dt       = eai_evnt_dt      	;	}
	public void setPrmry_chk_flg    ( String            prmry_chk_flg     ){	this.prmry_chk_flg     = prmry_chk_flg    	;	}
	public void setDelt_flg         ( String            delt_flg          ){	this.delt_flg          = delt_flg         	;	}
	public void setCre_usr_id       ( String            cre_usr_id        ){	this.cre_usr_id        = cre_usr_id       	;	}
	public void setCre_dt           ( String            cre_dt            ){	this.cre_dt            = cre_dt           	;	}
	public void setUpd_usr_id       ( String            upd_usr_id        ){	this.upd_usr_id        = upd_usr_id       	;	}
	public void setUpd_dt           ( String            upd_dt            ){	this.upd_dt            = upd_dt           	;	}
	public void setCntc_div_cd      ( String            cntc_div_cd       ){	this.cntc_div_cd       = cntc_div_cd      	;	}

	public static MdmVndrCntcPnt fromRequest(HttpServletRequest request) {
		MdmVndrCntcPnt model = new MdmVndrCntcPnt();
		try {
			model.setIbflag           	(JSPUtil.getParameter(request, "ibflag           		".trim(), ""));
			model.setPage_rows        	(JSPUtil.getParameter(request, "page_rows        		".trim(), ""));
			model.setVndr_seq         	(JSPUtil.getParameter(request, "vndr_seq         		".trim(), ""));
			model.setVndr_cntc_pnt_seq	(JSPUtil.getParameter(request, "vndr_cntc_pnt_seq		".trim(), ""));
			model.setIntl_phn_no      	(JSPUtil.getParameter(request, "intl_phn_no      		".trim(), ""));
			model.setPhn_no           	(JSPUtil.getParameter(request, "phn_no           		".trim(), ""));
			model.setIntl_fax_no      	(JSPUtil.getParameter(request, "intl_fax_no      		".trim(), ""));
			model.setFax_no           	(JSPUtil.getParameter(request, "fax_no           		".trim(), ""));
			model.setVndr_eml         	(JSPUtil.getParameter(request, "vndr_eml         		".trim(), ""));
			model.setEai_evnt_dt      	(JSPUtil.getParameter(request, "eai_evnt_dt      		".trim(), ""));
			model.setPrmry_chk_flg    	(JSPUtil.getParameter(request, "prmry_chk_flg    		".trim(), ""));
			model.setDelt_flg         	(JSPUtil.getParameter(request, "delt_flg         		".trim(), ""));
			model.setCre_usr_id       	(JSPUtil.getParameter(request, "cre_usr_id       		".trim(), ""));
			model.setCre_dt           	(JSPUtil.getParameter(request, "cre_dt           		".trim(), ""));
			model.setUpd_usr_id       	(JSPUtil.getParameter(request, "upd_usr_id       		".trim(), ""));
			model.setUpd_dt           	(JSPUtil.getParameter(request, "upd_dt           		".trim(), ""));
			model.setCntc_div_cd      	(JSPUtil.getParameter(request, "cntc_div_cd      		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmVndrCntcPnt model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows        		".trim(), length));
			String[] vndr_seq          =  (JSPUtil.getParameter(request, "vndr_seq         		".trim(), length));
			String[] vndr_cntc_pnt_seq =  (JSPUtil.getParameter(request, "vndr_cntc_pnt_seq		".trim(), length));
			String[] intl_phn_no       =  (JSPUtil.getParameter(request, "intl_phn_no      		".trim(), length));
			String[] phn_no            =  (JSPUtil.getParameter(request, "phn_no           		".trim(), length));
			String[] intl_fax_no       =  (JSPUtil.getParameter(request, "intl_fax_no      		".trim(), length));
			String[] fax_no            =  (JSPUtil.getParameter(request, "fax_no           		".trim(), length));
			String[] vndr_eml          =  (JSPUtil.getParameter(request, "vndr_eml         		".trim(), length));
			String[] eai_evnt_dt       =  (JSPUtil.getParameter(request, "eai_evnt_dt      		".trim(), length));
			String[] prmry_chk_flg     =  (JSPUtil.getParameter(request, "prmry_chk_flg    		".trim(), length));
			String[] delt_flg          =  (JSPUtil.getParameter(request, "delt_flg         		".trim(), length));
			String[] cre_usr_id        =  (JSPUtil.getParameter(request, "cre_usr_id       		".trim(), length));
			String[] cre_dt            =  (JSPUtil.getParameter(request, "cre_dt           		".trim(), length));
			String[] upd_usr_id        =  (JSPUtil.getParameter(request, "upd_usr_id       		".trim(), length));
			String[] upd_dt            =  (JSPUtil.getParameter(request, "upd_dt           		".trim(), length));
			String[] cntc_div_cd       =  (JSPUtil.getParameter(request, "cntc_div_cd      		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmVndrCntcPnt();
				model.setIbflag           		  (ibflag           	[i]);
				model.setPage_rows        		  (page_rows        	[i]);
				model.setVndr_seq         		  (vndr_seq         	[i]);
				model.setVndr_cntc_pnt_seq		  (vndr_cntc_pnt_seq	[i]);
				model.setIntl_phn_no      		  (intl_phn_no      	[i]);
				model.setPhn_no           		  (phn_no           	[i]);
				model.setIntl_fax_no      		  (intl_fax_no      	[i]);
				model.setFax_no           		  (fax_no           	[i]);
				model.setVndr_eml         		  (vndr_eml         	[i]);
				model.setEai_evnt_dt      		  (eai_evnt_dt      	[i]);
				model.setPrmry_chk_flg    		  (prmry_chk_flg    	[i]);
				model.setDelt_flg         		  (delt_flg         	[i]);
				model.setCre_usr_id       		  (cre_usr_id       	[i]);
				model.setCre_dt           		  (cre_dt           	[i]);
				model.setUpd_usr_id       		  (upd_usr_id       	[i]);
				model.setUpd_dt           		  (upd_dt           	[i]);
				model.setCntc_div_cd      		  (cntc_div_cd      	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmVndrCntcPnt model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, prefix + "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, prefix + "page_rows        		".trim(), length));
			String[] vndr_seq          =  (JSPUtil.getParameter(request, prefix + "vndr_seq         		".trim(), length));
			String[] vndr_cntc_pnt_seq =  (JSPUtil.getParameter(request, prefix + "vndr_cntc_pnt_seq		".trim(), length));
			String[] intl_phn_no       =  (JSPUtil.getParameter(request, prefix + "intl_phn_no      		".trim(), length));
			String[] phn_no            =  (JSPUtil.getParameter(request, prefix + "phn_no           		".trim(), length));
			String[] intl_fax_no       =  (JSPUtil.getParameter(request, prefix + "intl_fax_no      		".trim(), length));
			String[] fax_no            =  (JSPUtil.getParameter(request, prefix + "fax_no           		".trim(), length));
			String[] vndr_eml          =  (JSPUtil.getParameter(request, prefix + "vndr_eml         		".trim(), length));
			String[] eai_evnt_dt       =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt      		".trim(), length));
			String[] prmry_chk_flg     =  (JSPUtil.getParameter(request, prefix + "prmry_chk_flg    		".trim(), length));
			String[] delt_flg          =  (JSPUtil.getParameter(request, prefix + "delt_flg         		".trim(), length));
			String[] cre_usr_id        =  (JSPUtil.getParameter(request, prefix + "cre_usr_id       		".trim(), length));
			String[] cre_dt            =  (JSPUtil.getParameter(request, prefix + "cre_dt           		".trim(), length));
			String[] upd_usr_id        =  (JSPUtil.getParameter(request, prefix + "upd_usr_id       		".trim(), length));
			String[] upd_dt            =  (JSPUtil.getParameter(request, prefix + "upd_dt           		".trim(), length));
			String[] cntc_div_cd       =  (JSPUtil.getParameter(request, prefix + "cntc_div_cd      		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmVndrCntcPnt();
				model.setIbflag           		  ( ibflag           	[i]);
				model.setPage_rows        		  ( page_rows        	[i]);
				model.setVndr_seq         		  ( vndr_seq         	[i]);
				model.setVndr_cntc_pnt_seq		  ( vndr_cntc_pnt_seq	[i]);
				model.setIntl_phn_no      		  ( intl_phn_no      	[i]);
				model.setPhn_no           		  ( phn_no           	[i]);
				model.setIntl_fax_no      		  ( intl_fax_no      	[i]);
				model.setFax_no           		  ( fax_no           	[i]);
				model.setVndr_eml         		  ( vndr_eml         	[i]);
				model.setEai_evnt_dt      		  ( eai_evnt_dt      	[i]);
				model.setPrmry_chk_flg    		  ( prmry_chk_flg    	[i]);
				model.setDelt_flg         		  ( delt_flg         	[i]);
				model.setCre_usr_id       		  ( cre_usr_id       	[i]);
				model.setCre_dt           		  ( cre_dt           	[i]);
				model.setUpd_usr_id       		  ( upd_usr_id       	[i]);
				model.setUpd_dt           		  ( upd_dt           	[i]);
				model.setCntc_div_cd      		  ( cntc_div_cd      	[i]);
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
