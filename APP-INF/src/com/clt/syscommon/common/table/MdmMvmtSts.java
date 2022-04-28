/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_MVMT_STS.java
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
public final class MdmMvmtSts implements java.io.Serializable {

	private String      ibflag      = "";
	private String      page_rows   = "";
	private String      mvmt_sts_cd = "";
	private String      mvmt_sts_nm = "";
	private String      dest_yd_flg = "";
	private String      dp_seq      = "";
	private String      io_bnd_cd   = "";
	private String      cre_usr_id  = "";
	private String      cre_dt      = "";
	private String      upd_usr_id  = "";
	private String      upd_dt      = "";
	private String      delt_flg    = "";
	private String      eai_evnt_dt = "";

	public MdmMvmtSts(){}

	public MdmMvmtSts(
			String      ibflag     ,
			String      page_rows  ,
			String      mvmt_sts_cd,
			String      mvmt_sts_nm,
			String      dest_yd_flg,
			String      dp_seq     ,
			String      io_bnd_cd  ,
			String      cre_usr_id ,
			String      cre_dt     ,
			String      upd_usr_id ,
			String      upd_dt     ,
			String      delt_flg   ,
			String      eai_evnt_dt){
		this.ibflag      = ibflag     ;
		this.page_rows   = page_rows  ;
		this.mvmt_sts_cd = mvmt_sts_cd;
		this.mvmt_sts_nm = mvmt_sts_nm;
		this.dest_yd_flg = dest_yd_flg;
		this.dp_seq      = dp_seq     ;
		this.io_bnd_cd   = io_bnd_cd  ;
		this.cre_usr_id  = cre_usr_id ;
		this.cre_dt      = cre_dt     ;
		this.upd_usr_id  = upd_usr_id ;
		this.upd_dt      = upd_dt     ;
		this.delt_flg    = delt_flg   ;
		this.eai_evnt_dt = eai_evnt_dt;
	}

	// getter method is proceeding ..
	public String      getIbflag     (){	return ibflag     	;	}
	public String      getPage_rows  (){	return page_rows  	;	}
	public String      getMvmt_sts_cd(){	return mvmt_sts_cd	;	}
	public String      getMvmt_sts_nm(){	return mvmt_sts_nm	;	}
	public String      getDest_yd_flg(){	return dest_yd_flg	;	}
	public String      getDp_seq     (){	return dp_seq     	;	}
	public String      getIo_bnd_cd  (){	return io_bnd_cd  	;	}
	public String      getCre_usr_id (){	return cre_usr_id 	;	}
	public String      getCre_dt     (){	return cre_dt     	;	}
	public String      getUpd_usr_id (){	return upd_usr_id 	;	}
	public String      getUpd_dt     (){	return upd_dt     	;	}
	public String      getDelt_flg   (){	return delt_flg   	;	}
	public String      getEai_evnt_dt(){	return eai_evnt_dt	;	}

	// setter method is proceeding ..
	public void setIbflag     ( String      ibflag      ){	this.ibflag      = ibflag     	;	}
	public void setPage_rows  ( String      page_rows   ){	this.page_rows   = page_rows  	;	}
	public void setMvmt_sts_cd( String      mvmt_sts_cd ){	this.mvmt_sts_cd = mvmt_sts_cd	;	}
	public void setMvmt_sts_nm( String      mvmt_sts_nm ){	this.mvmt_sts_nm = mvmt_sts_nm	;	}
	public void setDest_yd_flg( String      dest_yd_flg ){	this.dest_yd_flg = dest_yd_flg	;	}
	public void setDp_seq     ( String      dp_seq      ){	this.dp_seq      = dp_seq     	;	}
	public void setIo_bnd_cd  ( String      io_bnd_cd   ){	this.io_bnd_cd   = io_bnd_cd  	;	}
	public void setCre_usr_id ( String      cre_usr_id  ){	this.cre_usr_id  = cre_usr_id 	;	}
	public void setCre_dt     ( String      cre_dt      ){	this.cre_dt      = cre_dt     	;	}
	public void setUpd_usr_id ( String      upd_usr_id  ){	this.upd_usr_id  = upd_usr_id 	;	}
	public void setUpd_dt     ( String      upd_dt      ){	this.upd_dt      = upd_dt     	;	}
	public void setDelt_flg   ( String      delt_flg    ){	this.delt_flg    = delt_flg   	;	}
	public void setEai_evnt_dt( String      eai_evnt_dt ){	this.eai_evnt_dt = eai_evnt_dt	;	}

	public static MdmMvmtSts fromRequest(HttpServletRequest request) {
		MdmMvmtSts model = new MdmMvmtSts();
		try {
			model.setIbflag     	(JSPUtil.getParameter(request, "ibflag     		".trim(), ""));
			model.setPage_rows  	(JSPUtil.getParameter(request, "page_rows  		".trim(), ""));
			model.setMvmt_sts_cd	(JSPUtil.getParameter(request, "mvmt_sts_cd		".trim(), ""));
			model.setMvmt_sts_nm	(JSPUtil.getParameter(request, "mvmt_sts_nm		".trim(), ""));
			model.setDest_yd_flg	(JSPUtil.getParameter(request, "dest_yd_flg		".trim(), ""));
			model.setDp_seq     	(JSPUtil.getParameter(request, "dp_seq     		".trim(), ""));
			model.setIo_bnd_cd  	(JSPUtil.getParameter(request, "io_bnd_cd  		".trim(), ""));
			model.setCre_usr_id 	(JSPUtil.getParameter(request, "cre_usr_id 		".trim(), ""));
			model.setCre_dt     	(JSPUtil.getParameter(request, "cre_dt     		".trim(), ""));
			model.setUpd_usr_id 	(JSPUtil.getParameter(request, "upd_usr_id 		".trim(), ""));
			model.setUpd_dt     	(JSPUtil.getParameter(request, "upd_dt     		".trim(), ""));
			model.setDelt_flg   	(JSPUtil.getParameter(request, "delt_flg   		".trim(), ""));
			model.setEai_evnt_dt	(JSPUtil.getParameter(request, "eai_evnt_dt		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmMvmtSts model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag      =  (JSPUtil.getParameter(request, "ibflag     		".trim(), length));
			String[] page_rows   =  (JSPUtil.getParameter(request, "page_rows  		".trim(), length));
			String[] mvmt_sts_cd =  (JSPUtil.getParameter(request, "mvmt_sts_cd		".trim(), length));
			String[] mvmt_sts_nm =  (JSPUtil.getParameter(request, "mvmt_sts_nm		".trim(), length));
			String[] dest_yd_flg =  (JSPUtil.getParameter(request, "dest_yd_flg		".trim(), length));
			String[] dp_seq      =  (JSPUtil.getParameter(request, "dp_seq     		".trim(), length));
			String[] io_bnd_cd   =  (JSPUtil.getParameter(request, "io_bnd_cd  		".trim(), length));
			String[] cre_usr_id  =  (JSPUtil.getParameter(request, "cre_usr_id 		".trim(), length));
			String[] cre_dt      =  (JSPUtil.getParameter(request, "cre_dt     		".trim(), length));
			String[] upd_usr_id  =  (JSPUtil.getParameter(request, "upd_usr_id 		".trim(), length));
			String[] upd_dt      =  (JSPUtil.getParameter(request, "upd_dt     		".trim(), length));
			String[] delt_flg    =  (JSPUtil.getParameter(request, "delt_flg   		".trim(), length));
			String[] eai_evnt_dt =  (JSPUtil.getParameter(request, "eai_evnt_dt		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmMvmtSts();
				model.setIbflag     		  (ibflag     	[i]);
				model.setPage_rows  		  (page_rows  	[i]);
				model.setMvmt_sts_cd		  (mvmt_sts_cd	[i]);
				model.setMvmt_sts_nm		  (mvmt_sts_nm	[i]);
				model.setDest_yd_flg		  (dest_yd_flg	[i]);
				model.setDp_seq     		  (dp_seq     	[i]);
				model.setIo_bnd_cd  		  (io_bnd_cd  	[i]);
				model.setCre_usr_id 		  (cre_usr_id 	[i]);
				model.setCre_dt     		  (cre_dt     	[i]);
				model.setUpd_usr_id 		  (upd_usr_id 	[i]);
				model.setUpd_dt     		  (upd_dt     	[i]);
				model.setDelt_flg   		  (delt_flg   	[i]);
				model.setEai_evnt_dt		  (eai_evnt_dt	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmMvmtSts model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag      =  (JSPUtil.getParameter(request, prefix + "ibflag     		".trim(), length));
			String[] page_rows   =  (JSPUtil.getParameter(request, prefix + "page_rows  		".trim(), length));
			String[] mvmt_sts_cd =  (JSPUtil.getParameter(request, prefix + "mvmt_sts_cd		".trim(), length));
			String[] mvmt_sts_nm =  (JSPUtil.getParameter(request, prefix + "mvmt_sts_nm		".trim(), length));
			String[] dest_yd_flg =  (JSPUtil.getParameter(request, prefix + "dest_yd_flg		".trim(), length));
			String[] dp_seq      =  (JSPUtil.getParameter(request, prefix + "dp_seq     		".trim(), length));
			String[] io_bnd_cd   =  (JSPUtil.getParameter(request, prefix + "io_bnd_cd  		".trim(), length));
			String[] cre_usr_id  =  (JSPUtil.getParameter(request, prefix + "cre_usr_id 		".trim(), length));
			String[] cre_dt      =  (JSPUtil.getParameter(request, prefix + "cre_dt     		".trim(), length));
			String[] upd_usr_id  =  (JSPUtil.getParameter(request, prefix + "upd_usr_id 		".trim(), length));
			String[] upd_dt      =  (JSPUtil.getParameter(request, prefix + "upd_dt     		".trim(), length));
			String[] delt_flg    =  (JSPUtil.getParameter(request, prefix + "delt_flg   		".trim(), length));
			String[] eai_evnt_dt =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmMvmtSts();
				model.setIbflag     		  ( ibflag     	[i]);
				model.setPage_rows  		  ( page_rows  	[i]);
				model.setMvmt_sts_cd		  ( mvmt_sts_cd	[i]);
				model.setMvmt_sts_nm		  ( mvmt_sts_nm	[i]);
				model.setDest_yd_flg		  ( dest_yd_flg	[i]);
				model.setDp_seq     		  ( dp_seq     	[i]);
				model.setIo_bnd_cd  		  ( io_bnd_cd  	[i]);
				model.setCre_usr_id 		  ( cre_usr_id 	[i]);
				model.setCre_dt     		  ( cre_dt     	[i]);
				model.setUpd_usr_id 		  ( upd_usr_id 	[i]);
				model.setUpd_dt     		  ( upd_dt     	[i]);
				model.setDelt_flg   		  ( delt_flg   	[i]);
				model.setEai_evnt_dt		  ( eai_evnt_dt	[i]);
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
