/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPE_EV_GRP.java
*@FileTitle : Service Provider Evolution
*Open Issues :
*Change history :
*@LastModifyDate : 2007-03-19
*@LastModifier : Jung-Jae Kim
*@LastVersion : 1.0
* 2007-03-19 Jung-Jae Kim
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
 * @author Jung-Jae Kim
 * @since J2EE 1.4
 */
public final class SPE_EV_GRP implements java.io.Serializable {

	private String        ibflag        = "";
	private String        page_rows     = "";
	private String        eg_id         = "";
	private String        eg_id_seq     = "";
	private String        eg_rhq_cd     = "";
	private String        eg_cty_cd     = "";
	private String        svc_cate_cd   = "";
	private String        eg_pic_usr_id = "";
	private String        cre_usr_id    = "";
	private String        cre_dt        = "";
	private String        upd_usr_id    = "";
	private String        upd_dt        = "";

	public SPE_EV_GRP(){}

	public SPE_EV_GRP(
			String        ibflag       ,
			String        page_rows    ,
			String        eg_id        ,
			String        eg_id_seq    ,
			String        eg_rhq_cd    ,
			String        eg_cty_cd    ,
			String        svc_cate_cd  ,
			String        eg_pic_usr_id,
			String        cre_usr_id   ,
			String        cre_dt       ,
			String        upd_usr_id   ,
			String        upd_dt       ){
		this.ibflag        = ibflag       ;
		this.page_rows     = page_rows    ;
		this.eg_id         = eg_id        ;
		this.eg_id_seq     = eg_id_seq    ;
		this.eg_rhq_cd     = eg_rhq_cd    ;
		this.eg_cty_cd     = eg_cty_cd    ;
		this.svc_cate_cd   = svc_cate_cd  ;
		this.eg_pic_usr_id = eg_pic_usr_id;
		this.cre_usr_id    = cre_usr_id   ;
		this.cre_dt        = cre_dt       ;
		this.upd_usr_id    = upd_usr_id   ;
		this.upd_dt        = upd_dt       ;
	}

	// getter method is proceeding ..
	public String        getIbflag       (){	return ibflag       	;	}
	public String        getPage_rows    (){	return page_rows    	;	}
	public String        getEg_id        (){	return eg_id        	;	}
	public String        getEg_id_seq    (){	return eg_id_seq    	;	}
	public String        getEg_rhq_cd    (){	return eg_rhq_cd    	;	}
	public String        getEg_cty_cd    (){	return eg_cty_cd    	;	}
	public String        getSvc_cate_cd  (){	return svc_cate_cd  	;	}
	public String        getEg_pic_usr_id(){	return eg_pic_usr_id	;	}
	public String        getCre_usr_id   (){	return cre_usr_id   	;	}
	public String        getCre_dt       (){	return cre_dt       	;	}
	public String        getUpd_usr_id   (){	return upd_usr_id   	;	}
	public String        getUpd_dt       (){	return upd_dt       	;	}

	// setter method is proceeding ..
	public void setIbflag       ( String        ibflag        ){	this.ibflag        = ibflag       	;	}
	public void setPage_rows    ( String        page_rows     ){	this.page_rows     = page_rows    	;	}
	public void setEg_id        ( String        eg_id         ){	this.eg_id         = eg_id        	;	}
	public void setEg_id_seq    ( String        eg_id_seq     ){	this.eg_id_seq     = eg_id_seq    	;	}
	public void setEg_rhq_cd    ( String        eg_rhq_cd     ){	this.eg_rhq_cd     = eg_rhq_cd    	;	}
	public void setEg_cty_cd    ( String        eg_cty_cd     ){	this.eg_cty_cd     = eg_cty_cd    	;	}
	public void setSvc_cate_cd  ( String        svc_cate_cd   ){	this.svc_cate_cd   = svc_cate_cd  	;	}
	public void setEg_pic_usr_id( String        eg_pic_usr_id ){	this.eg_pic_usr_id = eg_pic_usr_id	;	}
	public void setCre_usr_id   ( String        cre_usr_id    ){	this.cre_usr_id    = cre_usr_id   	;	}
	public void setCre_dt       ( String        cre_dt        ){	this.cre_dt        = cre_dt       	;	}
	public void setUpd_usr_id   ( String        upd_usr_id    ){	this.upd_usr_id    = upd_usr_id   	;	}
	public void setUpd_dt       ( String        upd_dt        ){	this.upd_dt        = upd_dt       	;	}

	public static SPE_EV_GRP fromRequest(HttpServletRequest request) {
		SPE_EV_GRP model = new SPE_EV_GRP();
		try {
			model.setIbflag       	(JSPUtil.getParameter(request, "ibflag       		".trim(), ""));
			model.setPage_rows    	(JSPUtil.getParameter(request, "page_rows    		".trim(), ""));
			model.setEg_id        	(JSPUtil.getParameter(request, "eg_id        		".trim(), ""));
			model.setEg_id_seq    	(JSPUtil.getParameter(request, "eg_id_seq    		".trim(), ""));
			model.setEg_rhq_cd    	(JSPUtil.getParameter(request, "eg_rhq_cd    		".trim(), ""));
			model.setEg_cty_cd    	(JSPUtil.getParameter(request, "eg_cty_cd    		".trim(), ""));
			model.setSvc_cate_cd  	(JSPUtil.getParameter(request, "svc_cate_cd  		".trim(), ""));
			model.setEg_pic_usr_id	(JSPUtil.getParameter(request, "eg_pic_usr_id		".trim(), ""));
			model.setCre_usr_id   	(JSPUtil.getParameter(request, "cre_usr_id   		".trim(), ""));
			model.setCre_dt       	(JSPUtil.getParameter(request, "cre_dt       		".trim(), ""));
			model.setUpd_usr_id   	(JSPUtil.getParameter(request, "upd_usr_id   		".trim(), ""));
			model.setUpd_dt       	(JSPUtil.getParameter(request, "upd_dt       		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		SPE_EV_GRP model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag        =  (JSPUtil.getParameter(request, "ibflag       		".trim(), length));
			String[] page_rows     =  (JSPUtil.getParameter(request, "page_rows    		".trim(), length));
			String[] eg_id         =  (JSPUtil.getParameter(request, "eg_id        		".trim(), length));
			String[] eg_id_seq     =  (JSPUtil.getParameter(request, "eg_id_seq    		".trim(), length));
			String[] eg_rhq_cd     =  (JSPUtil.getParameter(request, "eg_rhq_cd    		".trim(), length));
			String[] eg_cty_cd     =  (JSPUtil.getParameter(request, "eg_cty_cd    		".trim(), length));
			String[] svc_cate_cd   =  (JSPUtil.getParameter(request, "svc_cate_cd  		".trim(), length));
			String[] eg_pic_usr_id =  (JSPUtil.getParameter(request, "eg_pic_usr_id		".trim(), length));
			String[] cre_usr_id    =  (JSPUtil.getParameter(request, "cre_usr_id   		".trim(), length));
			String[] cre_dt        =  (JSPUtil.getParameter(request, "cre_dt       		".trim(), length));
			String[] upd_usr_id    =  (JSPUtil.getParameter(request, "upd_usr_id   		".trim(), length));
			String[] upd_dt        =  (JSPUtil.getParameter(request, "upd_dt       		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPE_EV_GRP();
				model.setIbflag       		  (ibflag       	[i]);
				model.setPage_rows    		  (page_rows    	[i]);
				model.setEg_id        		  (eg_id        	[i]);
				model.setEg_id_seq    		  (eg_id_seq    	[i]);
				model.setEg_rhq_cd    		  (eg_rhq_cd    	[i]);
				model.setEg_cty_cd    		  (eg_cty_cd    	[i]);
				model.setSvc_cate_cd  		  (svc_cate_cd  	[i]);
				model.setEg_pic_usr_id		  (eg_pic_usr_id	[i]);
				model.setCre_usr_id   		  (cre_usr_id   	[i]);
				model.setCre_dt       		  (cre_dt       	[i]);
				model.setUpd_usr_id   		  (upd_usr_id   	[i]);
				model.setUpd_dt       		  (upd_dt       	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		SPE_EV_GRP model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag        =  (JSPUtil.getParameter(request, prefix + "ibflag       		".trim(), length));
			String[] page_rows     =  (JSPUtil.getParameter(request, prefix + "page_rows    		".trim(), length));
			String[] eg_id         =  (JSPUtil.getParameter(request, prefix + "eg_id        		".trim(), length));
			String[] eg_id_seq     =  (JSPUtil.getParameter(request, prefix + "eg_id_seq    		".trim(), length));
			String[] eg_rhq_cd     =  (JSPUtil.getParameter(request, prefix + "eg_rhq_cd    		".trim(), length));
			String[] eg_cty_cd     =  (JSPUtil.getParameter(request, prefix + "eg_cty_cd    		".trim(), length));
			String[] svc_cate_cd   =  (JSPUtil.getParameter(request, prefix + "svc_cate_cd  		".trim(), length));
			String[] eg_pic_usr_id =  (JSPUtil.getParameter(request, prefix + "eg_pic_usr_id		".trim(), length));
			String[] cre_usr_id    =  (JSPUtil.getParameter(request, prefix + "cre_usr_id   		".trim(), length));
			String[] cre_dt        =  (JSPUtil.getParameter(request, prefix + "cre_dt       		".trim(), length));
			String[] upd_usr_id    =  (JSPUtil.getParameter(request, prefix + "upd_usr_id   		".trim(), length));
			String[] upd_dt        =  (JSPUtil.getParameter(request, prefix + "upd_dt       		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPE_EV_GRP();
				model.setIbflag       		  ( ibflag       	[i]);
				model.setPage_rows    		  ( page_rows    	[i]);
				model.setEg_id        		  ( eg_id        	[i]);
				model.setEg_id_seq    		  ( eg_id_seq    	[i]);
				model.setEg_rhq_cd    		  ( eg_rhq_cd    	[i]);
				model.setEg_cty_cd    		  ( eg_cty_cd    	[i]);
				model.setSvc_cate_cd  		  ( svc_cate_cd  	[i]);
				model.setEg_pic_usr_id		  ( eg_pic_usr_id	[i]);
				model.setCre_usr_id   		  ( cre_usr_id   	[i]);
				model.setCre_dt       		  ( cre_dt       	[i]);
				model.setUpd_usr_id   		  ( upd_usr_id   	[i]);
				model.setUpd_dt       		  ( upd_dt       	[i]);
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
