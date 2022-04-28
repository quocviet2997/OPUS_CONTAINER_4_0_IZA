/*=========================================================
*Copyright(c) 2007 CyberLogitec
*@FileName :  EDI_USA_IBD_CSTMS_RSLT.java
*@FileTitle : EDI USA INBOND CUSTOMS RESULT Data Sync
*Open Issues :
*Change history :
*@LastModifyDate : 2007-09-17
*@LastModifier : JeongSeon, An
*@LastVersion : 1.0
* 2007-09-17 JeongSeon, An
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
 * @author JeongSeon An
 * @since J2EE 1.4
 */
public final class EDI_USA_IBD_CSTMS_RSLT implements java.io.Serializable {

	private String         ibflag          = "";
	private String         page_rows       = "";
	private String         bl_no           = "";
	private String         bl_no_tp        = "";
	private String         bl_no_chk       = "";
	private String         cstms_rslt_seq  = "";
	private String         dspo_cd         = "";
	private String         dspo_qty        = "";
	private String         dspo_dtl_cd     = "";
	private String         dspo_dtl_no     = "";
	private String         dspo_act_dt     = "";
	private String         cstms_loc_cd    = "";
	private String         bl_tp_cd        = "";
	private String         cre_dt          = "";
	private String         upd_dt          = "";

	
	public EDI_USA_IBD_CSTMS_RSLT(){}

	public EDI_USA_IBD_CSTMS_RSLT(
			String         ibflag        ,
			String         page_rows     ,
			String         bl_no         ,
			String         bl_no_tp      ,
			String         bl_no_chk     ,
			String         cstms_rslt_seq,
			String         dspo_cd       ,
			String         dspo_qty      ,
			String         dspo_dtl_cd   ,
			String         dspo_dtl_no   ,
			String         dspo_act_dt   ,
			String         cstms_loc_cd  ,
			String         bl_tp_cd      ,
			String         cre_dt        ,
			String         upd_dt    ){
		this.ibflag         = ibflag   ;
		this.page_rows      = page_rows   ;
		this.bl_no          = bl_no   ;
		this.bl_no_tp       = bl_no_tp   ;
		this.bl_no_chk      = bl_no_chk   ;
		this.cstms_rslt_seq = cstms_rslt_seq   ;
		this.dspo_cd        = dspo_cd   ;
		this.dspo_qty       = dspo_qty   ;
		this.dspo_dtl_cd    = dspo_dtl_cd   ;
		this.dspo_dtl_no    = dspo_dtl_no   ;
		this.dspo_act_dt    = dspo_act_dt   ;
		this.cstms_loc_cd   = cstms_loc_cd   ;
		this.bl_tp_cd       = bl_tp_cd   ;
		this.cre_dt         = cre_dt   ;
		this.upd_dt         = upd_dt   ;
	}

	// getter method is proceeding ..
	public String         getIbflag         (){	return ibflag        	;	}
	public String         getPage_rows      (){	return page_rows     	;	}
	public String         getBl_no          (){	return bl_no       	    ;	}
	public String         getBl_no_tp       (){	return bl_no_tp       	;	}
	public String         getBl_no_chk      (){	return bl_no_chk    	;	}
	public String         getCstms_rslt_seq (){	return cstms_rslt_seq   ;	}
	public String         getDspo_cd        (){	return dspo_cd        	;	}
	public String         getDspo_qty       (){	return dspo_qty    	    ;	}
	public String         getDspo_dtl_cd    (){	return dspo_dtl_cd    	;	}
	public String         getDspo_dtl_no    (){	return dspo_dtl_no      ;	}
	public String         getDspo_act_dt    (){	return dspo_act_dt    	;	}
	public String         getCstms_loc_cd   (){	return cstms_loc_cd    	;	}
	public String         getBl_tp_cd       (){	return bl_tp_cd       	;	}
	public String         getCre_dt         (){	return cre_dt   	    ;	}
	public String         getUpd_dt         (){	return upd_dt   	    ;	}

	// setter method is proceeding ..
	public void setIbflag         ( String         ibflag         ){	this.ibflag          = ibflag        	;	}
	public void setPage_rows      ( String         page_rows      ){	this.page_rows       = page_rows     	;	}
	public void setBl_no          ( String         bl_no          ){	this.bl_no           = bl_no         	;	}
	public void setBl_no_tp       ( String         bl_no_tp       ){	this.bl_no_tp        = bl_no_tp       	;	}
	public void setBl_no_chk      ( String         bl_no_chk      ){	this.bl_no_chk       = bl_no_chk    	;	}
	public void setCstms_rslt_seq ( String         cstms_rslt_seq ){	this.cstms_rslt_seq  = cstms_rslt_seq 	;	}
	public void setDspo_cd        ( String         dspo_cd        ){	this.dspo_cd         = dspo_cd        	;	}
	public void setDspo_qty       ( String         dspo_qty       ){	this.dspo_qty        = dspo_qty    	    ;	}
	public void setDspo_dtl_cd    ( String         dspo_dtl_cd    ){	this.dspo_dtl_cd     = dspo_dtl_cd    	;	}
	public void setDspo_dtl_no    ( String         dspo_dtl_no    ){	this.dspo_dtl_no     = dspo_dtl_no      ;	}
	public void setDspo_act_dt    ( String         dspo_act_dt    ){	this.dspo_act_dt     = dspo_act_dt    	;	}
	public void setCstms_loc_cd   ( String         cstms_loc_cd   ){	this.cstms_loc_cd    = cstms_loc_cd    	;	}
	public void setBl_tp_cd       ( String         bl_tp_cd       ){	this.bl_tp_cd        = bl_tp_cd       	;	}
	public void setCre_dt         ( String         cre_dt         ){	this.cre_dt          = cre_dt   	    ;	}
	public void setUpd_dt         ( String         upd_dt         ){	this.upd_dt          = upd_dt   	    ;	}

	public static EDI_USA_IBD_CSTMS_RSLT fromRequest(HttpServletRequest request) {
		EDI_USA_IBD_CSTMS_RSLT model = new EDI_USA_IBD_CSTMS_RSLT();
		try {
			model.setIbflag        	(JSPUtil.getParameter(request, "ibflag        		".trim(), ""));
			model.setPage_rows     	(JSPUtil.getParameter(request, "page_rows     		".trim(), ""));
			model.setBl_no       	(JSPUtil.getParameter(request, "bl_no       		".trim(), ""));
			model.setBl_no_tp       (JSPUtil.getParameter(request, "bl_no_tp       		".trim(), ""));
			model.setBl_no_chk    	(JSPUtil.getParameter(request, "bl_no_chk    		".trim(), ""));
			model.setCstms_rslt_seq (JSPUtil.getParameter(request, "cstms_rslt_seq      ".trim(), ""));
			model.setDspo_cd        (JSPUtil.getParameter(request, "dspo_cd        		".trim(), ""));
			model.setDspo_qty    	(JSPUtil.getParameter(request, "dspo_qty    		".trim(), ""));
			model.setDspo_dtl_cd    (JSPUtil.getParameter(request, "dspo_dtl_cd    		".trim(), ""));
			model.setDspo_dtl_no    (JSPUtil.getParameter(request, "dspo_dtl_no        	".trim(), ""));
			model.setDspo_act_dt    (JSPUtil.getParameter(request, "dspo_act_dt    		".trim(), ""));
			model.setCstms_loc_cd   (JSPUtil.getParameter(request, "cstms_loc_cd    	".trim(), ""));
			model.setBl_tp_cd       (JSPUtil.getParameter(request, "bl_tp_cd       		".trim(), ""));
			model.setCre_dt   	    (JSPUtil.getParameter(request, "cre_dt   		    ".trim(), ""));
			model.setUpd_dt   	    (JSPUtil.getParameter(request, "upd_dt   	  	    ".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		EDI_USA_IBD_CSTMS_RSLT model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag        		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows     		".trim(), length));
			String[] bl_no           =  (JSPUtil.getParameter(request, "bl_no       		".trim(), length));
			String[] bl_no_tp        =  (JSPUtil.getParameter(request, "bl_no_tp       		".trim(), length));
			String[] bl_no_chk       =  (JSPUtil.getParameter(request, "bl_no_chk    		".trim(), length));
			String[] cstms_rslt_seq  =  (JSPUtil.getParameter(request, "cstms_rslt_seq      ".trim(), length));
			String[] dspo_cd         =  (JSPUtil.getParameter(request, "dspo_cd        		".trim(), length));
			String[] dspo_qty        =  (JSPUtil.getParameter(request, "dspo_qty    		".trim(), length));
			String[] dspo_dtl_cd     =  (JSPUtil.getParameter(request, "dspo_dtl_cd    		".trim(), length));
			String[] dspo_dtl_no     =  (JSPUtil.getParameter(request, "dspo_dtl_no        	".trim(), length));
			String[] dspo_act_dt     =  (JSPUtil.getParameter(request, "dspo_act_dt    		".trim(), length));
			String[] cstms_loc_cd    =  (JSPUtil.getParameter(request, "cstms_loc_cd    	".trim(), length));
			String[] bl_tp_cd        =  (JSPUtil.getParameter(request, "bl_tp_cd       		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, "cre_dt   	 	    ".trim(), length));
			String[] upd_dt          =  (JSPUtil.getParameter(request, "upd_dt   		    ".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new EDI_USA_IBD_CSTMS_RSLT();
				model.setIbflag        		  (ibflag        	[i]);
				model.setPage_rows     		  (page_rows     	[i]);
				model.setBl_no       		  (bl_no       	    [i]);
				model.setBl_no_tp       	  (bl_no_tp       	[i]);
				model.setBl_no_chk    		  (bl_no_chk    	[i]);
				model.setCstms_rslt_seq       (cstms_rslt_seq   [i]);
				model.setDspo_cd        	  (dspo_cd        	[i]);
				model.setDspo_qty    		  (dspo_qty    	    [i]);
				model.setDspo_dtl_cd    	  (dspo_dtl_cd    	[i]);
				model.setDspo_dtl_no          (dspo_dtl_no      [i]);
				model.setDspo_act_dt    	  (dspo_act_dt    	[i]);
				model.setCstms_loc_cd    	  (cstms_loc_cd    	[i]);
				model.setBl_tp_cd       	  (bl_tp_cd       	[i]);
				model.setCre_dt   		      (cre_dt   	    [i]);
				model.setUpd_dt   		      (upd_dt   	    [i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		EDI_USA_IBD_CSTMS_RSLT model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, prefix + "ibflag        		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, prefix + "page_rows     		".trim(), length));
			String[] bl_no           =  (JSPUtil.getParameter(request, prefix + "bl_no       		".trim(), length));
			String[] bl_no_tp        =  (JSPUtil.getParameter(request, prefix + "bl_no_tp       	".trim(), length));
			String[] bl_no_chk       =  (JSPUtil.getParameter(request, prefix + "bl_no_chk    		".trim(), length));
			String[] cstms_rslt_seq  =  (JSPUtil.getParameter(request, prefix + "cstms_rslt_seq     ".trim(), length));
			String[] dspo_cd         =  (JSPUtil.getParameter(request, prefix + "dspo_cd        	".trim(), length));
			String[] dspo_qty        =  (JSPUtil.getParameter(request, prefix + "dspo_qty    		".trim(), length));
			String[] dspo_dtl_cd     =  (JSPUtil.getParameter(request, prefix + "dspo_dtl_cd    	".trim(), length));
			String[] dspo_dtl_no     =  (JSPUtil.getParameter(request, prefix + "dspo_dtl_no        ".trim(), length));
			String[] dspo_act_dt     =  (JSPUtil.getParameter(request, prefix + "dspo_act_dt    	".trim(), length));
			String[] cstms_loc_cd    =  (JSPUtil.getParameter(request, prefix + "cstms_loc_cd    	".trim(), length));
			String[] bl_tp_cd        =  (JSPUtil.getParameter(request, prefix + "bl_tp_cd       	".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, prefix + "cre_dt   	 	    ".trim(), length));
			String[] upd_dt          =  (JSPUtil.getParameter(request, prefix + "upd_dt   		    ".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new EDI_USA_IBD_CSTMS_RSLT();
				model.setIbflag        		  ( ibflag        	[i]);
				model.setPage_rows     		  ( page_rows     	[i]);
				model.setBl_no       		  ( bl_no       	[i]);
				model.setBl_no_tp       	  ( bl_no_tp       	[i]);
				model.setBl_no_chk    		  ( bl_no_chk    	[i]);
				model.setCstms_rslt_seq       ( cstms_rslt_seq  [i]);
				model.setDspo_cd        	  ( dspo_cd        	[i]);
				model.setDspo_qty    		  ( dspo_qty    	[i]);
				model.setDspo_dtl_cd    	  ( dspo_dtl_cd    	[i]);
				model.setDspo_dtl_no          ( dspo_dtl_no     [i]);
				model.setDspo_act_dt    	  ( dspo_act_dt    	[i]);
				model.setCstms_loc_cd    	  ( cstms_loc_cd    [i]);
				model.setBl_tp_cd       	  ( bl_tp_cd       	[i]);
				model.setCre_dt   		      ( cre_dt   	   	[i]);
				model.setUpd_dt   		      ( upd_dt   	   	[i]);
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
