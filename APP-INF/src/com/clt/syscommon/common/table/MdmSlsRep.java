/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_SLS_REP.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-12
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-12 Kildong_hong6
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
public final class MdmSlsRep implements java.io.Serializable {

	private String       ibflag       = "";
	private String       page_rows    = "";
	private String       srep_cd      = "";
	private String       ofc_cd       = "";
	private String       srep_nm      = "";
	private String       ofc_team_cd  = "";
	private String       sex_cd       = "";
	private String       srep_abbr_nm = "";
	private String       ib_srep_flg  = "";
	private String       ob_srep_flg  = "";
	private String       empe_cd      = "";
	private String       srep_eml     = "";
	private String       intl_mphn_no = "";
	private String       mphn_no      = "";
	private String       srep_sts_cd  = "";
	private String       cre_usr_id   = "";
	private String       cre_dt       = "";
	private String       upd_usr_id   = "";
	private String       upd_dt       = "";
	private String       eai_evnt_dt  = "";

	public MdmSlsRep(){}

	public MdmSlsRep(
			String       ibflag      ,
			String       page_rows   ,
			String       srep_cd     ,
			String       ofc_cd      ,
			String       srep_nm     ,
			String       ofc_team_cd ,
			String       sex_cd      ,
			String       srep_abbr_nm,
			String       ib_srep_flg ,
			String       ob_srep_flg ,
			String       empe_cd     ,
			String       srep_eml    ,
			String       intl_mphn_no,
			String       mphn_no     ,
			String       srep_sts_cd ,
			String       cre_usr_id  ,
			String       cre_dt      ,
			String       upd_usr_id  ,
			String       upd_dt      ,
			String       eai_evnt_dt ){
		this.ibflag       = ibflag      ;
		this.page_rows    = page_rows   ;
		this.srep_cd      = srep_cd     ;
		this.ofc_cd       = ofc_cd      ;
		this.srep_nm      = srep_nm     ;
		this.ofc_team_cd  = ofc_team_cd ;
		this.sex_cd       = sex_cd      ;
		this.srep_abbr_nm = srep_abbr_nm;
		this.ib_srep_flg  = ib_srep_flg ;
		this.ob_srep_flg  = ob_srep_flg ;
		this.empe_cd      = empe_cd     ;
		this.srep_eml     = srep_eml    ;
		this.intl_mphn_no = intl_mphn_no;
		this.mphn_no      = mphn_no     ;
		this.srep_sts_cd  = srep_sts_cd ;
		this.cre_usr_id   = cre_usr_id  ;
		this.cre_dt       = cre_dt      ;
		this.upd_usr_id   = upd_usr_id  ;
		this.upd_dt       = upd_dt      ;
		this.eai_evnt_dt  = eai_evnt_dt ;
	}

	// getter method is proceeding ..
	public String       getIbflag      (){	return ibflag      	;	}
	public String       getPage_rows   (){	return page_rows   	;	}
	public String       getSrep_cd     (){	return srep_cd     	;	}
	public String       getOfc_cd      (){	return ofc_cd      	;	}
	public String       getSrep_nm     (){	return srep_nm     	;	}
	public String       getOfc_team_cd (){	return ofc_team_cd 	;	}
	public String       getSex_cd      (){	return sex_cd      	;	}
	public String       getSrep_abbr_nm(){	return srep_abbr_nm	;	}
	public String       getIb_srep_flg (){	return ib_srep_flg 	;	}
	public String       getOb_srep_flg (){	return ob_srep_flg 	;	}
	public String       getEmpe_cd     (){	return empe_cd     	;	}
	public String       getSrep_eml    (){	return srep_eml    	;	}
	public String       getIntl_mphn_no(){	return intl_mphn_no	;	}
	public String       getMphn_no     (){	return mphn_no     	;	}
	public String       getSrep_sts_cd (){	return srep_sts_cd 	;	}
	public String       getCre_usr_id  (){	return cre_usr_id  	;	}
	public String       getCre_dt      (){	return cre_dt      	;	}
	public String       getUpd_usr_id  (){	return upd_usr_id  	;	}
	public String       getUpd_dt      (){	return upd_dt      	;	}
	public String       getEai_evnt_dt (){	return eai_evnt_dt 	;	}

	// setter method is proceeding ..
	public void setIbflag      ( String       ibflag       ){	this.ibflag       = ibflag      	;	}
	public void setPage_rows   ( String       page_rows    ){	this.page_rows    = page_rows   	;	}
	public void setSrep_cd     ( String       srep_cd      ){	this.srep_cd      = srep_cd     	;	}
	public void setOfc_cd      ( String       ofc_cd       ){	this.ofc_cd       = ofc_cd      	;	}
	public void setSrep_nm     ( String       srep_nm      ){	this.srep_nm      = srep_nm     	;	}
	public void setOfc_team_cd ( String       ofc_team_cd  ){	this.ofc_team_cd  = ofc_team_cd 	;	}
	public void setSex_cd      ( String       sex_cd       ){	this.sex_cd       = sex_cd      	;	}
	public void setSrep_abbr_nm( String       srep_abbr_nm ){	this.srep_abbr_nm = srep_abbr_nm	;	}
	public void setIb_srep_flg ( String       ib_srep_flg  ){	this.ib_srep_flg  = ib_srep_flg 	;	}
	public void setOb_srep_flg ( String       ob_srep_flg  ){	this.ob_srep_flg  = ob_srep_flg 	;	}
	public void setEmpe_cd     ( String       empe_cd      ){	this.empe_cd      = empe_cd     	;	}
	public void setSrep_eml    ( String       srep_eml     ){	this.srep_eml     = srep_eml    	;	}
	public void setIntl_mphn_no( String       intl_mphn_no ){	this.intl_mphn_no = intl_mphn_no	;	}
	public void setMphn_no     ( String       mphn_no      ){	this.mphn_no      = mphn_no     	;	}
	public void setSrep_sts_cd ( String       srep_sts_cd  ){	this.srep_sts_cd  = srep_sts_cd 	;	}
	public void setCre_usr_id  ( String       cre_usr_id   ){	this.cre_usr_id   = cre_usr_id  	;	}
	public void setCre_dt      ( String       cre_dt       ){	this.cre_dt       = cre_dt      	;	}
	public void setUpd_usr_id  ( String       upd_usr_id   ){	this.upd_usr_id   = upd_usr_id  	;	}
	public void setUpd_dt      ( String       upd_dt       ){	this.upd_dt       = upd_dt      	;	}
	public void setEai_evnt_dt ( String       eai_evnt_dt  ){	this.eai_evnt_dt  = eai_evnt_dt 	;	}

	public static MdmSlsRep fromRequest(HttpServletRequest request) {
		MdmSlsRep model = new MdmSlsRep();
		try {
			model.setIbflag      	(JSPUtil.getParameter(request, "ibflag      		".trim(), ""));
			model.setPage_rows   	(JSPUtil.getParameter(request, "page_rows   		".trim(), ""));
			model.setSrep_cd     	(JSPUtil.getParameter(request, "srep_cd     		".trim(), ""));
			model.setOfc_cd      	(JSPUtil.getParameter(request, "ofc_cd      		".trim(), ""));
			model.setSrep_nm     	(JSPUtil.getParameter(request, "srep_nm     		".trim(), ""));
			model.setOfc_team_cd 	(JSPUtil.getParameter(request, "ofc_team_cd 		".trim(), ""));
			model.setSex_cd      	(JSPUtil.getParameter(request, "sex_cd      		".trim(), ""));
			model.setSrep_abbr_nm	(JSPUtil.getParameter(request, "srep_abbr_nm		".trim(), ""));
			model.setIb_srep_flg 	(JSPUtil.getParameter(request, "ib_srep_flg 		".trim(), ""));
			model.setOb_srep_flg 	(JSPUtil.getParameter(request, "ob_srep_flg 		".trim(), ""));
			model.setEmpe_cd     	(JSPUtil.getParameter(request, "empe_cd     		".trim(), ""));
			model.setSrep_eml    	(JSPUtil.getParameter(request, "srep_eml    		".trim(), ""));
			model.setIntl_mphn_no	(JSPUtil.getParameter(request, "intl_mphn_no		".trim(), ""));
			model.setMphn_no     	(JSPUtil.getParameter(request, "mphn_no     		".trim(), ""));
			model.setSrep_sts_cd 	(JSPUtil.getParameter(request, "srep_sts_cd 		".trim(), ""));
			model.setCre_usr_id  	(JSPUtil.getParameter(request, "cre_usr_id  		".trim(), ""));
			model.setCre_dt      	(JSPUtil.getParameter(request, "cre_dt      		".trim(), ""));
			model.setUpd_usr_id  	(JSPUtil.getParameter(request, "upd_usr_id  		".trim(), ""));
			model.setUpd_dt      	(JSPUtil.getParameter(request, "upd_dt      		".trim(), ""));
			model.setEai_evnt_dt 	(JSPUtil.getParameter(request, "eai_evnt_dt 		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmSlsRep model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, "page_rows   		".trim(), length));
			String[] srep_cd      =  (JSPUtil.getParameter(request, "srep_cd     		".trim(), length));
			String[] ofc_cd       =  (JSPUtil.getParameter(request, "ofc_cd      		".trim(), length));
			String[] srep_nm      =  (JSPUtil.getParameter(request, "srep_nm     		".trim(), length));
			String[] ofc_team_cd  =  (JSPUtil.getParameter(request, "ofc_team_cd 		".trim(), length));
			String[] sex_cd       =  (JSPUtil.getParameter(request, "sex_cd      		".trim(), length));
			String[] srep_abbr_nm =  (JSPUtil.getParameter(request, "srep_abbr_nm		".trim(), length));
			String[] ib_srep_flg  =  (JSPUtil.getParameter(request, "ib_srep_flg 		".trim(), length));
			String[] ob_srep_flg  =  (JSPUtil.getParameter(request, "ob_srep_flg 		".trim(), length));
			String[] empe_cd      =  (JSPUtil.getParameter(request, "empe_cd     		".trim(), length));
			String[] srep_eml     =  (JSPUtil.getParameter(request, "srep_eml    		".trim(), length));
			String[] intl_mphn_no =  (JSPUtil.getParameter(request, "intl_mphn_no		".trim(), length));
			String[] mphn_no      =  (JSPUtil.getParameter(request, "mphn_no     		".trim(), length));
			String[] srep_sts_cd  =  (JSPUtil.getParameter(request, "srep_sts_cd 		".trim(), length));
			String[] cre_usr_id   =  (JSPUtil.getParameter(request, "cre_usr_id  		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, "cre_dt      		".trim(), length));
			String[] upd_usr_id   =  (JSPUtil.getParameter(request, "upd_usr_id  		".trim(), length));
			String[] upd_dt       =  (JSPUtil.getParameter(request, "upd_dt      		".trim(), length));
			String[] eai_evnt_dt  =  (JSPUtil.getParameter(request, "eai_evnt_dt 		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmSlsRep();
				model.setIbflag      		  (ibflag      	[i]);
				model.setPage_rows   		  (page_rows   	[i]);
				model.setSrep_cd     		  (srep_cd     	[i]);
				model.setOfc_cd      		  (ofc_cd      	[i]);
				model.setSrep_nm     		  (srep_nm     	[i]);
				model.setOfc_team_cd 		  (ofc_team_cd 	[i]);
				model.setSex_cd      		  (sex_cd      	[i]);
				model.setSrep_abbr_nm		  (srep_abbr_nm	[i]);
				model.setIb_srep_flg 		  (ib_srep_flg 	[i]);
				model.setOb_srep_flg 		  (ob_srep_flg 	[i]);
				model.setEmpe_cd     		  (empe_cd     	[i]);
				model.setSrep_eml    		  (srep_eml    	[i]);
				model.setIntl_mphn_no		  (intl_mphn_no	[i]);
				model.setMphn_no     		  (mphn_no     	[i]);
				model.setSrep_sts_cd 		  (srep_sts_cd 	[i]);
				model.setCre_usr_id  		  (cre_usr_id  	[i]);
				model.setCre_dt      		  (cre_dt      	[i]);
				model.setUpd_usr_id  		  (upd_usr_id  	[i]);
				model.setUpd_dt      		  (upd_dt      	[i]);
				model.setEai_evnt_dt 		  (eai_evnt_dt 	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmSlsRep model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, prefix + "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, prefix + "page_rows   		".trim(), length));
			String[] srep_cd      =  (JSPUtil.getParameter(request, prefix + "srep_cd     		".trim(), length));
			String[] ofc_cd       =  (JSPUtil.getParameter(request, prefix + "ofc_cd      		".trim(), length));
			String[] srep_nm      =  (JSPUtil.getParameter(request, prefix + "srep_nm     		".trim(), length));
			String[] ofc_team_cd  =  (JSPUtil.getParameter(request, prefix + "ofc_team_cd 		".trim(), length));
			String[] sex_cd       =  (JSPUtil.getParameter(request, prefix + "sex_cd      		".trim(), length));
			String[] srep_abbr_nm =  (JSPUtil.getParameter(request, prefix + "srep_abbr_nm		".trim(), length));
			String[] ib_srep_flg  =  (JSPUtil.getParameter(request, prefix + "ib_srep_flg 		".trim(), length));
			String[] ob_srep_flg  =  (JSPUtil.getParameter(request, prefix + "ob_srep_flg 		".trim(), length));
			String[] empe_cd      =  (JSPUtil.getParameter(request, prefix + "empe_cd     		".trim(), length));
			String[] srep_eml     =  (JSPUtil.getParameter(request, prefix + "srep_eml    		".trim(), length));
			String[] intl_mphn_no =  (JSPUtil.getParameter(request, prefix + "intl_mphn_no		".trim(), length));
			String[] mphn_no      =  (JSPUtil.getParameter(request, prefix + "mphn_no     		".trim(), length));
			String[] srep_sts_cd  =  (JSPUtil.getParameter(request, prefix + "srep_sts_cd 		".trim(), length));
			String[] cre_usr_id   =  (JSPUtil.getParameter(request, prefix + "cre_usr_id  		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, prefix + "cre_dt      		".trim(), length));
			String[] upd_usr_id   =  (JSPUtil.getParameter(request, prefix + "upd_usr_id  		".trim(), length));
			String[] upd_dt       =  (JSPUtil.getParameter(request, prefix + "upd_dt      		".trim(), length));
			String[] eai_evnt_dt  =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt 		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmSlsRep();
				model.setIbflag      		  ( ibflag      	[i]);
				model.setPage_rows   		  ( page_rows   	[i]);
				model.setSrep_cd     		  ( srep_cd     	[i]);
				model.setOfc_cd      		  ( ofc_cd      	[i]);
				model.setSrep_nm     		  ( srep_nm     	[i]);
				model.setOfc_team_cd 		  ( ofc_team_cd 	[i]);
				model.setSex_cd      		  ( sex_cd      	[i]);
				model.setSrep_abbr_nm		  ( srep_abbr_nm	[i]);
				model.setIb_srep_flg 		  ( ib_srep_flg 	[i]);
				model.setOb_srep_flg 		  ( ob_srep_flg 	[i]);
				model.setEmpe_cd     		  ( empe_cd     	[i]);
				model.setSrep_eml    		  ( srep_eml    	[i]);
				model.setIntl_mphn_no		  ( intl_mphn_no	[i]);
				model.setMphn_no     		  ( mphn_no     	[i]);
				model.setSrep_sts_cd 		  ( srep_sts_cd 	[i]);
				model.setCre_usr_id  		  ( cre_usr_id  	[i]);
				model.setCre_dt      		  ( cre_dt      	[i]);
				model.setUpd_usr_id  		  ( upd_usr_id  	[i]);
				model.setUpd_dt      		  ( upd_dt      	[i]);
				model.setEai_evnt_dt 		  ( eai_evnt_dt 	[i]);
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
