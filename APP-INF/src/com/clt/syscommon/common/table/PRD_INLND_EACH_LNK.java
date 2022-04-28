/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : PRD_INLND_EACH_LNK.java
*@FileTitle : Inland Link 정보관리 
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-19
*@LastModifier : jungsunyong
*@LastVersion : 1.0
* 2006-09-19 jungsunyong
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
 * @author jungsunyong
 * @since J2EE 1.4
 */
public final class PRD_INLND_EACH_LNK implements java.io.Serializable {

	private String          ibflag          = "";
	private String          page_rows       = "";
	private String          lnk_org_nod_cd  = "";
	private String          lnk_dest_nod_cd = "";
	private String          trsp_mod_cd     = "";
	private String          vndr_seq        = "";
	private String          tztm_hrs        = "";
	private String          lnk_dist        = "";
	private String          dist_ut_cd      = "";
	private String          rail_crr_tp_cd  = "";
	private String          lnk_rmk         = "";
	private String          cre_ofc_cd      = "";
	private String          delt_flg        = "";
	private String          cre_usr_id      = "";
	private String          cre_dt          = "";
	private String          upd_usr_id      = "";
	private String          upd_dt          = "";
	private String          trsp_agmt_ofc_cty_cd = "";
	private String          trsp_agmt_seq   = "";
	private String          agmt_no   = "";
	private String          result   = ""; //저장등의 결과를 row 단위로 아려주기위한 컬럼 , 로직에서 사용 
	

	public PRD_INLND_EACH_LNK(){}

	public PRD_INLND_EACH_LNK(
			String          ibflag         ,
			String          page_rows      ,
			String          lnk_org_nod_cd ,
			String          lnk_dest_nod_cd,
			String          trsp_mod_cd    ,
			String          vndr_seq       ,
			String          tztm_hrs       ,
			String          lnk_dist       ,
			String          dist_ut_cd     ,
			String          rail_crr_tp_cd ,
			String          lnk_rmk        ,
			String          cre_ofc_cd     ,
			String          delt_flg       ,
			String          cre_usr_id     ,
			String          cre_dt         ,
			String          upd_usr_id     ,
			String          upd_dt         ,
			String          trsp_agmt_ofc_cty_cd         ,
			String          trsp_agmt_seq  ,
			String          result          ){
		this.ibflag          = ibflag         ;
		this.page_rows       = page_rows      ;
		this.lnk_org_nod_cd  = lnk_org_nod_cd ;
		this.lnk_dest_nod_cd = lnk_dest_nod_cd;
		this.trsp_mod_cd     = trsp_mod_cd    ;
		this.vndr_seq        = vndr_seq       ;
		this.tztm_hrs        = tztm_hrs       ;
		this.lnk_dist        = lnk_dist       ;
		this.dist_ut_cd      = dist_ut_cd     ;
		this.rail_crr_tp_cd  = rail_crr_tp_cd ;
		this.lnk_rmk         = lnk_rmk        ;
		this.cre_ofc_cd      = cre_ofc_cd     ;
		this.delt_flg        = delt_flg       ;
		this.cre_usr_id      = cre_usr_id     ;
		this.cre_dt          = cre_dt         ;
		this.upd_usr_id      = upd_usr_id     ;
		this.upd_dt          = upd_dt         ;
		this.trsp_agmt_ofc_cty_cd = trsp_agmt_ofc_cty_cd         ;
		this.trsp_agmt_seq = trsp_agmt_seq    ;
		this.result = result    ;
	}

	// getter method is proceeding ..
	public String          getIbflag         (){	return ibflag         	;	}
	public String          getPage_rows      (){	return page_rows      	;	}
	public String          getLnk_org_nod_cd (){	return lnk_org_nod_cd 	;	}
	public String          getLnk_dest_nod_cd(){	return lnk_dest_nod_cd	;	}
	public String          getTrsp_mod_cd    (){	return trsp_mod_cd    	;	}
	public String          getVndr_seq       (){	return vndr_seq       	;	}
	public String          getTztm_hrs       (){	return tztm_hrs       	;	}
	public String          getLnk_dist       (){	return lnk_dist       	;	}
	public String          getDist_ut_cd     (){	return dist_ut_cd     	;	}
	public String          getRail_crr_tp_cd (){	return rail_crr_tp_cd 	;	}
	public String          getLnk_rmk        (){	return lnk_rmk        	;	}
	public String          getCre_ofc_cd     (){	return cre_ofc_cd     	;	}
	public String          getDelt_flg       (){	return delt_flg       	;	}
	public String          getCre_usr_id     (){	return cre_usr_id     	;	}
	public String          getCre_dt         (){	return cre_dt         	;	}
	public String          getUpd_usr_id     (){	return upd_usr_id     	;	}
	public String          getUpd_dt         (){	return upd_dt         	;	}
	public String          getTrsp_agmt_ofc_cty_cd() {	return trsp_agmt_ofc_cty_cd;}
	public String          getTrsp_agmt_seq  (){	return trsp_agmt_seq    ;   }
	public String getAgmt_no() {
		return agmt_no;
	}
	public String getResult() {
		return result;
	}

	// setter method is proceeding ..
	public void setIbflag         ( String          ibflag          ){	this.ibflag          = ibflag         	;	}
	public void setPage_rows      ( String          page_rows       ){	this.page_rows       = page_rows      	;	}
	public void setLnk_org_nod_cd ( String          lnk_org_nod_cd  ){	this.lnk_org_nod_cd  = lnk_org_nod_cd 	;	}
	public void setLnk_dest_nod_cd( String          lnk_dest_nod_cd ){	this.lnk_dest_nod_cd = lnk_dest_nod_cd	;	}
	public void setTrsp_mod_cd    ( String          trsp_mod_cd     ){	this.trsp_mod_cd     = trsp_mod_cd    	;	}
	public void setVndr_seq       ( String          vndr_seq        ){	this.vndr_seq        = vndr_seq       	;	}
	public void setTztm_hrs       ( String          tztm_hrs        ){	this.tztm_hrs        = tztm_hrs       	;	}
	public void setLnk_dist       ( String          lnk_dist        ){	this.lnk_dist        = lnk_dist       	;	}
	public void setDist_ut_cd     ( String          dist_ut_cd      ){	this.dist_ut_cd      = dist_ut_cd     	;	}
	public void setRail_crr_tp_cd ( String          rail_crr_tp_cd  ){	this.rail_crr_tp_cd  = rail_crr_tp_cd 	;	}
	public void setLnk_rmk        ( String          lnk_rmk         ){	this.lnk_rmk         = lnk_rmk        	;	}
	public void setCre_ofc_cd     ( String          cre_ofc_cd      ){	this.cre_ofc_cd      = cre_ofc_cd     	;	}
	public void setDelt_flg       ( String          delt_flg        ){	this.delt_flg        = delt_flg       	;	}
	public void setCre_usr_id     ( String          cre_usr_id      ){	this.cre_usr_id      = cre_usr_id     	;	}
	public void setCre_dt         ( String          cre_dt          ){	this.cre_dt          = cre_dt         	;	}
	public void setUpd_usr_id     ( String          upd_usr_id      ){	this.upd_usr_id      = upd_usr_id     	;	}
	public void setUpd_dt         ( String          upd_dt          ){	this.upd_dt          = upd_dt         	;	}
	public void setTrsp_agmt_ofc_cty_cd(String trsp_agmt_ofc_cty_cd) {  this.trsp_agmt_ofc_cty_cd = trsp_agmt_ofc_cty_cd;	}
	public void setTrsp_agmt_seq(String trsp_agmt_seq)               {	this.trsp_agmt_seq = trsp_agmt_seq      ;  	}
	public void setAgmt_no(String agmt_no) {
		this.agmt_no = agmt_no;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public static PRD_INLND_EACH_LNK fromRequest(HttpServletRequest request) {
		PRD_INLND_EACH_LNK model = new PRD_INLND_EACH_LNK();
		try {
			model.setIbflag         	(JSPUtil.getParameter(request, "ibflag         		".trim(), ""));
			model.setPage_rows      	(JSPUtil.getParameter(request, "page_rows      		".trim(), ""));
			model.setLnk_org_nod_cd 	(JSPUtil.getParameter(request, "lnk_org_nod_cd 		".trim(), ""));
			model.setLnk_dest_nod_cd	(JSPUtil.getParameter(request, "lnk_dest_nod_cd		".trim(), ""));
			model.setTrsp_mod_cd    	(JSPUtil.getParameter(request, "trsp_mod_cd    		".trim(), ""));
			model.setVndr_seq       	(JSPUtil.getParameter(request, "vndr_seq       		".trim(), ""));
			model.setTztm_hrs       	(JSPUtil.getParameter(request, "tztm_hrs       		".trim(), ""));
			model.setLnk_dist       	(JSPUtil.getParameter(request, "lnk_dist       		".trim(), ""));
			model.setDist_ut_cd     	(JSPUtil.getParameter(request, "dist_ut_cd     		".trim(), ""));
			model.setRail_crr_tp_cd 	(JSPUtil.getParameter(request, "rail_crr_tp_cd 		".trim(), ""));
			model.setLnk_rmk        	(JSPUtil.getParameter(request, "lnk_rmk        		".trim(), ""));
			model.setCre_ofc_cd     	(JSPUtil.getParameter(request, "cre_ofc_cd     		".trim(), ""));
			model.setDelt_flg       	(JSPUtil.getParameter(request, "delt_flg       		".trim(), ""));
			model.setCre_usr_id     	(JSPUtil.getParameter(request, "cre_usr_id     		".trim(), ""));
			model.setCre_dt         	(JSPUtil.getParameter(request, "cre_dt         		".trim(), ""));
			model.setUpd_usr_id     	(JSPUtil.getParameter(request, "upd_usr_id     		".trim(), ""));
			model.setUpd_dt         	(JSPUtil.getParameter(request, "upd_dt         		".trim(), ""));
			model.setTrsp_agmt_ofc_cty_cd   (JSPUtil.getParameter(request, "trsp_agmt_ofc_cty_cd".trim(), ""));
			model.setTrsp_agmt_seq       (JSPUtil.getParameter(request, "trsp_agmt_seq      ".trim(), ""));
			model.setAgmt_no       (JSPUtil.getParameter(request, "agmt_no      ".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		PRD_INLND_EACH_LNK model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows      		".trim(), length));
			String[] lnk_org_nod_cd  =  (JSPUtil.getParameter(request, "lnk_org_nod_cd 		".trim(), length));
			String[] lnk_dest_nod_cd =  (JSPUtil.getParameter(request, "lnk_dest_nod_cd		".trim(), length));
			String[] trsp_mod_cd     =  (JSPUtil.getParameter(request, "trsp_mod_cd    		".trim(), length));
			String[] vndr_seq        =  (JSPUtil.getParameter(request, "vndr_seq       		".trim(), length));
			String[] tztm_hrs        =  (JSPUtil.getParameter(request, "tztm_hrs       		".trim(), length));
			String[] lnk_dist        =  (JSPUtil.getParameter(request, "lnk_dist       		".trim(), length));
			String[] dist_ut_cd      =  (JSPUtil.getParameter(request, "dist_ut_cd     		".trim(), length));
			String[] rail_crr_tp_cd  =  (JSPUtil.getParameter(request, "rail_crr_tp_cd 		".trim(), length));
			String[] lnk_rmk         =  (JSPUtil.getParameter(request, "lnk_rmk        		".trim(), length));
			String[] cre_ofc_cd      =  (JSPUtil.getParameter(request, "cre_ofc_cd     		".trim(), length));
			String[] delt_flg        =  (JSPUtil.getParameter(request, "delt_flg       		".trim(), length));
			String[] cre_usr_id      =  (JSPUtil.getParameter(request, "cre_usr_id     		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, "cre_dt         		".trim(), length));
			String[] upd_usr_id      =  (JSPUtil.getParameter(request, "upd_usr_id     		".trim(), length));
			String[] upd_dt          =  (JSPUtil.getParameter(request, "upd_dt         		".trim(), length));
			String[] trsp_agmt_ofc_cty_cd   =  (JSPUtil.getParameter(request, "trsp_agmt_ofc_cty_cd".trim(), length));
			String[] trsp_agmt_seq   =  (JSPUtil.getParameter(request, "trsp_agmt_seq       ".trim(), length));
			String[] agmt_no         =   (JSPUtil.getParameter(request, "agmt_no            ".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new PRD_INLND_EACH_LNK();
				model.setIbflag         		  (ibflag         	[i]);
				model.setPage_rows      		  (page_rows      	[i]);
				model.setLnk_org_nod_cd 		  (lnk_org_nod_cd 	[i]);
				model.setLnk_dest_nod_cd		  (lnk_dest_nod_cd	[i]);
				model.setTrsp_mod_cd    		  (trsp_mod_cd    	[i]);
				model.setVndr_seq       		  (vndr_seq       	[i]);
				model.setTztm_hrs       		  (tztm_hrs       	[i]);
				model.setLnk_dist       		  (lnk_dist       	[i]);
				model.setDist_ut_cd     		  (dist_ut_cd     	[i]);
				model.setRail_crr_tp_cd 		  (rail_crr_tp_cd 	[i]);
				model.setLnk_rmk        		  (lnk_rmk        	[i]);
				model.setCre_ofc_cd     		  (cre_ofc_cd     	[i]);
				model.setDelt_flg       		  (delt_flg       	[i]);
				model.setCre_usr_id     		  (cre_usr_id     	[i]);
				model.setCre_dt         		  (cre_dt         	[i]);
				model.setUpd_usr_id     		  (upd_usr_id     	[i]);
				model.setUpd_dt         		  (upd_dt         	[i]);
				model.setTrsp_agmt_ofc_cty_cd     (trsp_agmt_ofc_cty_cd [i]);
				model.setTrsp_agmt_seq         	  (trsp_agmt_seq  	[i]);
				model.setAgmt_no         	      (agmt_no       	[i]);
				models.add(model);

			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		PRD_INLND_EACH_LNK model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, prefix + "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, prefix + "page_rows      		".trim(), length));
			String[] lnk_org_nod_cd  =  (JSPUtil.getParameter(request, prefix + "lnk_org_nod_cd 		".trim(), length));
			String[] lnk_dest_nod_cd =  (JSPUtil.getParameter(request, prefix + "lnk_dest_nod_cd		".trim(), length));
			String[] trsp_mod_cd     =  (JSPUtil.getParameter(request, prefix + "trsp_mod_cd    		".trim(), length));
			String[] vndr_seq        =  (JSPUtil.getParameter(request, prefix + "vndr_seq       		".trim(), length));
			String[] tztm_hrs        =  (JSPUtil.getParameter(request, prefix + "tztm_hrs       		".trim(), length));
			String[] lnk_dist        =  (JSPUtil.getParameter(request, prefix + "lnk_dist       		".trim(), length));
			String[] dist_ut_cd      =  (JSPUtil.getParameter(request, prefix + "dist_ut_cd     		".trim(), length));
			String[] rail_crr_tp_cd  =  (JSPUtil.getParameter(request, prefix + "rail_crr_tp_cd 		".trim(), length));
			String[] lnk_rmk         =  (JSPUtil.getParameter(request, prefix + "lnk_rmk        		".trim(), length));
			String[] cre_ofc_cd      =  (JSPUtil.getParameter(request, prefix + "cre_ofc_cd     		".trim(), length));
			String[] delt_flg        =  (JSPUtil.getParameter(request, prefix + "delt_flg       		".trim(), length));
			String[] cre_usr_id      =  (JSPUtil.getParameter(request, prefix + "cre_usr_id     		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, prefix + "cre_dt         		".trim(), length));
			String[] upd_usr_id      =  (JSPUtil.getParameter(request, prefix + "upd_usr_id     		".trim(), length));
			String[] upd_dt          =  (JSPUtil.getParameter(request, prefix + "upd_dt         		".trim(), length));
			String[] trsp_agmt_ofc_cty_cd          =  (JSPUtil.getParameter(request, prefix + "trsp_agmt_ofc_cty_cd         		".trim(), length));
			String[] trsp_agmt_seq   =  (JSPUtil.getParameter(request, prefix + "trsp_agmt_seq         		".trim(), length));
			String[] agmt_no   =  (JSPUtil.getParameter(request, prefix + "agmt_no         		        ".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new PRD_INLND_EACH_LNK();
				model.setIbflag         		  ( ibflag         	[i]);
				model.setPage_rows      		  ( page_rows      	[i]);
				model.setLnk_org_nod_cd 		  ( lnk_org_nod_cd 	[i]);
				model.setLnk_dest_nod_cd		  ( lnk_dest_nod_cd	[i]);
				model.setTrsp_mod_cd    		  ( trsp_mod_cd    	[i]);
				model.setVndr_seq       		  ( vndr_seq       	[i]);
				model.setTztm_hrs       		  ( tztm_hrs       	[i]);
				model.setLnk_dist       		  ( lnk_dist       	[i]);
				model.setDist_ut_cd     		  ( dist_ut_cd     	[i]);
				model.setRail_crr_tp_cd 		  ( rail_crr_tp_cd 	[i]);
				model.setLnk_rmk        		  ( lnk_rmk        	[i]);
				model.setCre_ofc_cd     		  ( cre_ofc_cd     	[i]);
				model.setDelt_flg       		  ( delt_flg       	[i]);
				model.setCre_usr_id     		  ( cre_usr_id     	[i]);
				model.setCre_dt         		  ( cre_dt         	[i]);
				model.setUpd_usr_id     		  ( upd_usr_id     	[i]);
				model.setUpd_dt         		  ( upd_dt         	[i]);
				model.setTrsp_agmt_ofc_cty_cd     ( trsp_agmt_ofc_cty_cd [i]);
				model.setTrsp_agmt_seq         	  ( trsp_agmt_seq   [i]);
				model.setAgmt_no         	      ( agmt_no         [i]);
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
