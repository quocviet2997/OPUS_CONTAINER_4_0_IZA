/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : GL_CTR_ERP.java
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
public final class GL_CTR_ERP implements java.io.Serializable {

	private String            ibflag            = "";
	private String            page_rows         = "";
	private String            ctr_erp_no        = "";
	private String            ctr_erp_cd        = "";
	private String            ctr_locl_nm        = "";
	private String            ctr_eng_nm        = "";
	private String            curr_cd           = "";
	private String            cnt_cd            = "";
	private String            rgn_cd            = "";
	private String            jnl_smry_trns_flg = "";
	private String            cre_usr_id        = "";
	private String            cre_dt            = "";
	private String            upd_usr_id        = "";
	private String            upd_dt            = "";
	private String            delt_flg          = "";
	private String            biz_div_cd        = "";
	private String            eai_evnt_dt       = "";

	public GL_CTR_ERP(){}

	public GL_CTR_ERP(
			String            ibflag           ,
			String            page_rows        ,
			String            ctr_erp_no       ,
			String            ctr_erp_cd       ,
			String            ctr_locl_nm       ,
			String            ctr_eng_nm       ,
			String            curr_cd          ,
			String            cnt_cd           ,
			String            rgn_cd           ,
			String            jnl_smry_trns_flg,
			String            cre_usr_id       ,
			String            cre_dt           ,
			String            upd_usr_id       ,
			String            upd_dt           ,
			String            delt_flg         ,
			String            biz_div_cd       ,
			String            eai_evnt_dt      ){
		this.ibflag            = ibflag           ;
		this.page_rows         = page_rows        ;
		this.ctr_erp_no        = ctr_erp_no       ;
		this.ctr_erp_cd        = ctr_erp_cd       ;
		this.ctr_locl_nm        = ctr_locl_nm       ;
		this.ctr_eng_nm        = ctr_eng_nm       ;
		this.curr_cd           = curr_cd          ;
		this.cnt_cd            = cnt_cd           ;
		this.rgn_cd            = rgn_cd           ;
		this.jnl_smry_trns_flg = jnl_smry_trns_flg;
		this.cre_usr_id        = cre_usr_id       ;
		this.cre_dt            = cre_dt           ;
		this.upd_usr_id        = upd_usr_id       ;
		this.upd_dt            = upd_dt           ;
		this.delt_flg          = delt_flg         ;
		this.biz_div_cd        = biz_div_cd       ;
		this.eai_evnt_dt       = eai_evnt_dt      ;
	}

	// getter method is proceeding ..
	public String            getIbflag           (){	return ibflag           	;	}
	public String            getPage_rows        (){	return page_rows        	;	}
	public String            getCtr_erp_no       (){	return ctr_erp_no       	;	}
	public String            getCtr_erp_cd       (){	return ctr_erp_cd       	;	}
	public String            getCtr_locl_nm       (){	return ctr_locl_nm       	;	}
	public String            getCtr_eng_nm       (){	return ctr_eng_nm       	;	}
	public String            getCurr_cd          (){	return curr_cd          	;	}
	public String            getCnt_cd           (){	return cnt_cd           	;	}
	public String            getRgn_cd           (){	return rgn_cd           	;	}
	public String            getJnl_smry_trns_flg(){	return jnl_smry_trns_flg	;	}
	public String            getCre_usr_id       (){	return cre_usr_id       	;	}
	public String            getCre_dt           (){	return cre_dt           	;	}
	public String            getUpd_usr_id       (){	return upd_usr_id       	;	}
	public String            getUpd_dt           (){	return upd_dt           	;	}
	public String            getDelt_flg         (){	return delt_flg         	;	}
	public String            getBiz_div_cd       (){	return biz_div_cd       	;	}
	public String            getEai_evnt_dt      (){	return eai_evnt_dt      	;	}

	// setter method is proceeding ..
	public void setIbflag           ( String            ibflag            ){	this.ibflag            = ibflag           	;	}
	public void setPage_rows        ( String            page_rows         ){	this.page_rows         = page_rows        	;	}
	public void setCtr_erp_no       ( String            ctr_erp_no        ){	this.ctr_erp_no        = ctr_erp_no       	;	}
	public void setCtr_erp_cd       ( String            ctr_erp_cd        ){	this.ctr_erp_cd        = ctr_erp_cd       	;	}
	public void setCtr_locl_nm       ( String            ctr_locl_nm        ){	this.ctr_locl_nm        = ctr_locl_nm       	;	}
	public void setCtr_eng_nm       ( String            ctr_eng_nm        ){	this.ctr_eng_nm        = ctr_eng_nm       	;	}
	public void setCurr_cd          ( String            curr_cd           ){	this.curr_cd           = curr_cd          	;	}
	public void setCnt_cd           ( String            cnt_cd            ){	this.cnt_cd            = cnt_cd           	;	}
	public void setRgn_cd           ( String            rgn_cd            ){	this.rgn_cd            = rgn_cd           	;	}
	public void setJnl_smry_trns_flg( String            jnl_smry_trns_flg ){	this.jnl_smry_trns_flg = jnl_smry_trns_flg	;	}
	public void setCre_usr_id       ( String            cre_usr_id        ){	this.cre_usr_id        = cre_usr_id       	;	}
	public void setCre_dt           ( String            cre_dt            ){	this.cre_dt            = cre_dt           	;	}
	public void setUpd_usr_id       ( String            upd_usr_id        ){	this.upd_usr_id        = upd_usr_id       	;	}
	public void setUpd_dt           ( String            upd_dt            ){	this.upd_dt            = upd_dt           	;	}
	public void setDelt_flg         ( String            delt_flg          ){	this.delt_flg          = delt_flg         	;	}
	public void setBiz_div_cd       ( String            biz_div_cd        ){	this.biz_div_cd        = biz_div_cd       	;	}
	public void setEai_evnt_dt      ( String            eai_evnt_dt       ){	this.eai_evnt_dt       = eai_evnt_dt      	;	}

	public static GL_CTR_ERP fromRequest(HttpServletRequest request) {
		GL_CTR_ERP model = new GL_CTR_ERP();
		try {
			model.setIbflag           	(JSPUtil.getParameter(request, "ibflag           		".trim(), ""));
			model.setPage_rows        	(JSPUtil.getParameter(request, "page_rows        		".trim(), ""));
			model.setCtr_erp_no       	(JSPUtil.getParameter(request, "ctr_erp_no       		".trim(), ""));
			model.setCtr_erp_cd       	(JSPUtil.getParameter(request, "ctr_erp_cd       		".trim(), ""));
			model.setCtr_locl_nm       	(JSPUtil.getParameter(request, "ctr_locl_nm       		".trim(), ""));
			model.setCtr_eng_nm       	(JSPUtil.getParameter(request, "ctr_eng_nm       		".trim(), ""));
			model.setCurr_cd          	(JSPUtil.getParameter(request, "curr_cd          		".trim(), ""));
			model.setCnt_cd           	(JSPUtil.getParameter(request, "cnt_cd           		".trim(), ""));
			model.setRgn_cd           	(JSPUtil.getParameter(request, "rgn_cd           		".trim(), ""));
			model.setJnl_smry_trns_flg	(JSPUtil.getParameter(request, "jnl_smry_trns_flg		".trim(), ""));
			model.setCre_usr_id       	(JSPUtil.getParameter(request, "cre_usr_id       		".trim(), ""));
			model.setCre_dt           	(JSPUtil.getParameter(request, "cre_dt           		".trim(), ""));
			model.setUpd_usr_id       	(JSPUtil.getParameter(request, "upd_usr_id       		".trim(), ""));
			model.setUpd_dt           	(JSPUtil.getParameter(request, "upd_dt           		".trim(), ""));
			model.setDelt_flg         	(JSPUtil.getParameter(request, "delt_flg         		".trim(), ""));
			model.setBiz_div_cd       	(JSPUtil.getParameter(request, "biz_div_cd       		".trim(), ""));
			model.setEai_evnt_dt      	(JSPUtil.getParameter(request, "eai_evnt_dt      		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		GL_CTR_ERP model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows        		".trim(), length));
			String[] ctr_erp_no        =  (JSPUtil.getParameter(request, "ctr_erp_no       		".trim(), length));
			String[] ctr_erp_cd        =  (JSPUtil.getParameter(request, "ctr_erp_cd       		".trim(), length));
			String[] ctr_locl_nm        =  (JSPUtil.getParameter(request, "ctr_locl_nm       		".trim(), length));
			String[] ctr_eng_nm        =  (JSPUtil.getParameter(request, "ctr_eng_nm       		".trim(), length));
			String[] curr_cd           =  (JSPUtil.getParameter(request, "curr_cd          		".trim(), length));
			String[] cnt_cd            =  (JSPUtil.getParameter(request, "cnt_cd           		".trim(), length));
			String[] rgn_cd            =  (JSPUtil.getParameter(request, "rgn_cd           		".trim(), length));
			String[] jnl_smry_trns_flg =  (JSPUtil.getParameter(request, "jnl_smry_trns_flg		".trim(), length));
			String[] cre_usr_id        =  (JSPUtil.getParameter(request, "cre_usr_id       		".trim(), length));
			String[] cre_dt            =  (JSPUtil.getParameter(request, "cre_dt           		".trim(), length));
			String[] upd_usr_id        =  (JSPUtil.getParameter(request, "upd_usr_id       		".trim(), length));
			String[] upd_dt            =  (JSPUtil.getParameter(request, "upd_dt           		".trim(), length));
			String[] delt_flg          =  (JSPUtil.getParameter(request, "delt_flg         		".trim(), length));
			String[] biz_div_cd        =  (JSPUtil.getParameter(request, "biz_div_cd       		".trim(), length));
			String[] eai_evnt_dt       =  (JSPUtil.getParameter(request, "eai_evnt_dt      		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new GL_CTR_ERP();
				model.setIbflag           		  (ibflag           	[i]);
				model.setPage_rows        		  (page_rows        	[i]);
				model.setCtr_erp_no       		  (ctr_erp_no       	[i]);
				model.setCtr_erp_cd       		  (ctr_erp_cd       	[i]);
				model.setCtr_locl_nm       		  (ctr_locl_nm       	[i]);
				model.setCtr_eng_nm       		  (ctr_eng_nm       	[i]);
				model.setCurr_cd          		  (curr_cd          	[i]);
				model.setCnt_cd           		  (cnt_cd           	[i]);
				model.setRgn_cd           		  (rgn_cd           	[i]);
				model.setJnl_smry_trns_flg		  (jnl_smry_trns_flg	[i]);
				model.setCre_usr_id       		  (cre_usr_id       	[i]);
				model.setCre_dt           		  (cre_dt           	[i]);
				model.setUpd_usr_id       		  (upd_usr_id       	[i]);
				model.setUpd_dt           		  (upd_dt           	[i]);
				model.setDelt_flg         		  (delt_flg         	[i]);
				model.setBiz_div_cd       		  (biz_div_cd       	[i]);
				model.setEai_evnt_dt      		  (eai_evnt_dt      	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		GL_CTR_ERP model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, prefix + "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, prefix + "page_rows        		".trim(), length));
			String[] ctr_erp_no        =  (JSPUtil.getParameter(request, prefix + "ctr_erp_no       		".trim(), length));
			String[] ctr_erp_cd        =  (JSPUtil.getParameter(request, prefix + "ctr_erp_cd       		".trim(), length));
			String[] ctr_locl_nm        =  (JSPUtil.getParameter(request, prefix + "ctr_locl_nm       		".trim(), length));
			String[] ctr_eng_nm        =  (JSPUtil.getParameter(request, prefix + "ctr_eng_nm       		".trim(), length));
			String[] curr_cd           =  (JSPUtil.getParameter(request, prefix + "curr_cd          		".trim(), length));
			String[] cnt_cd            =  (JSPUtil.getParameter(request, prefix + "cnt_cd           		".trim(), length));
			String[] rgn_cd            =  (JSPUtil.getParameter(request, prefix + "rgn_cd           		".trim(), length));
			String[] jnl_smry_trns_flg =  (JSPUtil.getParameter(request, prefix + "jnl_smry_trns_flg		".trim(), length));
			String[] cre_usr_id        =  (JSPUtil.getParameter(request, prefix + "cre_usr_id       		".trim(), length));
			String[] cre_dt            =  (JSPUtil.getParameter(request, prefix + "cre_dt           		".trim(), length));
			String[] upd_usr_id        =  (JSPUtil.getParameter(request, prefix + "upd_usr_id       		".trim(), length));
			String[] upd_dt            =  (JSPUtil.getParameter(request, prefix + "upd_dt           		".trim(), length));
			String[] delt_flg          =  (JSPUtil.getParameter(request, prefix + "delt_flg         		".trim(), length));
			String[] biz_div_cd        =  (JSPUtil.getParameter(request, prefix + "biz_div_cd       		".trim(), length));
			String[] eai_evnt_dt       =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt      		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new GL_CTR_ERP();
				model.setIbflag           		  ( ibflag           	[i]);
				model.setPage_rows        		  ( page_rows        	[i]);
				model.setCtr_erp_no       		  ( ctr_erp_no       	[i]);
				model.setCtr_erp_cd       		  ( ctr_erp_cd       	[i]);
				model.setCtr_locl_nm       		  ( ctr_locl_nm       	[i]);
				model.setCtr_eng_nm       		  ( ctr_eng_nm       	[i]);
				model.setCurr_cd          		  ( curr_cd          	[i]);
				model.setCnt_cd           		  ( cnt_cd           	[i]);
				model.setRgn_cd           		  ( rgn_cd           	[i]);
				model.setJnl_smry_trns_flg		  ( jnl_smry_trns_flg	[i]);
				model.setCre_usr_id       		  ( cre_usr_id       	[i]);
				model.setCre_dt           		  ( cre_dt           	[i]);
				model.setUpd_usr_id       		  ( upd_usr_id       	[i]);
				model.setUpd_dt           		  ( upd_dt           	[i]);
				model.setDelt_flg         		  ( delt_flg         	[i]);
				model.setBiz_div_cd       		  ( biz_div_cd       	[i]);
				model.setEai_evnt_dt      		  ( eai_evnt_dt      	[i]);
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
