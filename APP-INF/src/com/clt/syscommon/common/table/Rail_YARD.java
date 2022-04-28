/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : RAIL_YARD.java
*@FileTitle : UsaRailYardManage
*Open Issues :
*Change history :
*@LastModifyDate : 2009-05-11
*@LastModifier : Jun Yong Park
*@LastVersion : 1.0
* 2009-05-11 Jun Yong Park
* 1.0 최초 생성
* N200905150040 2009-05-20 [TRS]USA RAIL YARD 정보 저장 화면 개발
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
public final class Rail_YARD implements java.io.Serializable {

	private String                  ibflag                  = "";
	private String                  page_rows               = "";
	private String                  yd_cd                   = "";
	private String                  yd_nm                   = "";
	private String                  yd_loc_cty_nm           = "";
	private String                  yd_loc_ste_cd           = "";
	private String                  yd_ctrl_ofc_addr        = "";
	private String                  yd_ctrl_ofc_cty_nm      = "";
	private String                  yd_ctrl_ofc_ste_cd      = "";
	private String                  yd_ctrl_ofc_zip_cd      = "";

	public Rail_YARD(){}

	public Rail_YARD(
			String                  ibflag                 ,
			String                  page_rows              ,
			String                  yd_cd                  ,
			String                  yd_nm                  ,
			String                  yd_loc_cty_nm          ,
			String                  yd_loc_ste_cd          ,
			String                  yd_ctrl_ofc_addr       ,
			String                  yd_ctrl_ofc_cty_nm     ,
			String                  yd_ctrl_ofc_ste_cd     ,
			String                  yd_ctrl_ofc_zip_cd     ){
		this.ibflag                  = ibflag                 ;
		this.page_rows               = page_rows              ;
		this.yd_cd                   = yd_cd                  ;
		this.yd_nm                   = yd_nm                  ;
		this.yd_loc_cty_nm           = yd_loc_cty_nm          ;
		this.yd_loc_ste_cd        	 = yd_loc_ste_cd       	  ;
		this.yd_ctrl_ofc_addr        = yd_ctrl_ofc_addr       ;
		this.yd_ctrl_ofc_cty_nm      = yd_ctrl_ofc_cty_nm     ;
		this.yd_ctrl_ofc_ste_cd      = yd_ctrl_ofc_ste_cd     ;
		this.yd_ctrl_ofc_zip_cd      = yd_ctrl_ofc_zip_cd     ;
	}

	// getter method is proceeding ..
	public String                  getIbflag                 (){	return ibflag                 	;	}
	public String                  getPage_rows              (){	return page_rows              	;	}
	public String                  getYd_cd                  (){	return yd_cd                  	;	}
	public String                  getYd_nm                  (){	return yd_nm                  	;	}
	public String                  getYd_loc_cty_nm          (){	return yd_loc_cty_nm            ;	}
	public String                  getYd_loc_ste_cd       	 (){	return yd_loc_ste_cd       		;	}
	public String                  getYd_ctrl_ofc_addr       (){	return yd_ctrl_ofc_addr         ;	}
	public String                  getYd_ctrl_ofc_cty_nm     (){	return yd_ctrl_ofc_cty_nm       ;	}
	public String                  getYd_ctrl_ofc_ste_cd     (){	return yd_ctrl_ofc_ste_cd       ;	}
	public String                  getYd_ctrl_ofc_zip_cd     (){	return yd_ctrl_ofc_zip_cd       ;	}

	// setter method is proceeding ..
	public void setIbflag                 ( String                  ibflag                  ){	this.ibflag                  = ibflag                 	;	}
	public void setPage_rows              ( String                  page_rows               ){	this.page_rows               = page_rows              	;	}
	public void setYd_cd                  ( String                  yd_cd                   ){	this.yd_cd                   = yd_cd                  	;	}
	public void setYd_nm                  ( String                  yd_nm                   ){	this.yd_nm                   = yd_nm                  	;	}
	public void setYd_loc_cty_nm          ( String                  yd_loc_cty_nm           ){	this.yd_loc_cty_nm           = yd_loc_cty_nm            ;	}
	public void setYd_loc_ste_cd       	  ( String                  yd_loc_ste_cd        	){	this.yd_loc_ste_cd        	 = yd_loc_ste_cd       		;	}
	public void setYd_ctrl_ofc_addr       ( String                  yd_ctrl_ofc_addr        ){	this.yd_ctrl_ofc_addr        = yd_ctrl_ofc_addr         ;	}
	public void setYd_ctrl_ofc_cty_nm     ( String                  yd_ctrl_ofc_cty_nm      ){	this.yd_ctrl_ofc_cty_nm      = yd_ctrl_ofc_cty_nm       ;	}
	public void setYd_ctrl_ofc_ste_cd     ( String                  yd_ctrl_ofc_ste_cd      ){	this.yd_ctrl_ofc_ste_cd      = yd_ctrl_ofc_ste_cd       ;	}
	public void setYd_ctrl_ofc_zip_cd     ( String                  yd_ctrl_ofc_zip_cd      ){	this.yd_ctrl_ofc_zip_cd      = yd_ctrl_ofc_zip_cd       ;	}
	
	

	public static Rail_YARD fromRequest(HttpServletRequest request) {
		Rail_YARD model = new Rail_YARD();
		try {
			model.setIbflag                 	(JSPUtil.getParameter(request, "ibflag                 		".trim(), ""));
			model.setPage_rows              	(JSPUtil.getParameter(request, "page_rows              		".trim(), ""));
			model.setYd_cd                  	(JSPUtil.getParameter(request, "yd_cd                  		".trim(), ""));
			model.setYd_nm                  	(JSPUtil.getParameter(request, "yd_nm                  		".trim(), ""));
			model.setYd_loc_cty_nm              (JSPUtil.getParameter(request, "yd_loc_cty_nm               ".trim(), ""));
			model.setYd_loc_ste_cd       		(JSPUtil.getParameter(request, "yd_loc_ste_cd       		".trim(), ""));
			model.setYd_ctrl_ofc_addr          	(JSPUtil.getParameter(request, "yd_ctrl_ofc_addr          	".trim(), ""));
			model.setYd_ctrl_ofc_cty_nm         (JSPUtil.getParameter(request, "yd_ctrl_ofc_cty_nm          ".trim(), ""));
			model.setYd_ctrl_ofc_ste_cd         (JSPUtil.getParameter(request, "yd_ctrl_ofc_ste_cd          ".trim(), ""));
			model.setYd_ctrl_ofc_zip_cd         (JSPUtil.getParameter(request, "yd_ctrl_ofc_zip_cd          ".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		Rail_YARD model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                  =  (JSPUtil.getParameter(request, "ibflag                 		".trim(), length));
			String[] page_rows               =  (JSPUtil.getParameter(request, "page_rows              		".trim(), length));
			String[] yd_cd                   =  (JSPUtil.getParameter(request, "yd_cd                  		".trim(), length));
			String[] yd_nm                   =  (JSPUtil.getParameter(request, "yd_nm                  		".trim(), length));
			String[] yd_loc_cty_nm           =  (JSPUtil.getParameter(request, "yd_loc_cty_nm               ".trim(), length));
			String[] yd_loc_ste_cd        	 =  (JSPUtil.getParameter(request, "yd_loc_ste_cd       		".trim(), length));
			String[] yd_ctrl_ofc_addr        =  (JSPUtil.getParameter(request, "yd_ctrl_ofc_addr          	".trim(), length));
			String[] yd_ctrl_ofc_cty_nm      =  (JSPUtil.getParameter(request, "yd_ctrl_ofc_cty_nm          ".trim(), length));
			String[] yd_ctrl_ofc_ste_cd      =  (JSPUtil.getParameter(request, "yd_ctrl_ofc_ste_cd          ".trim(), length));
			String[] yd_ctrl_ofc_zip_cd      =  (JSPUtil.getParameter(request, "yd_ctrl_ofc_zip_cd          ".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new Rail_YARD();
				model.setIbflag                 		  (ibflag                 	[i]);
				model.setPage_rows              		  (page_rows              	[i]);
				model.setYd_cd                  		  (yd_cd                  	[i]);
				model.setYd_nm                  		  (yd_nm                  	[i]);
				model.setYd_loc_cty_nm                 	  (yd_loc_cty_nm            [i]);
				model.setYd_loc_ste_cd       		  	  (yd_loc_ste_cd       		[i]);
				model.setYd_ctrl_ofc_addr          		  (yd_ctrl_ofc_addr         [i]);
				model.setYd_ctrl_ofc_cty_nm               (yd_ctrl_ofc_cty_nm       [i]);
				model.setYd_ctrl_ofc_ste_cd           	  (yd_ctrl_ofc_ste_cd       [i]);
				model.setYd_ctrl_ofc_zip_cd           	  (yd_ctrl_ofc_zip_cd       [i]);
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
