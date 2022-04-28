/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : GNI_USR_FILE.java
*@FileTitle : 결합테스트 현황
*Open Issues :
*Change history :
*@LastModifyDate : 2006-12-20
*@LastModifier : Seongwook_kim
*@LastVersion : 1.0
* 2006-12-20 Seongwook_kim
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
 * @author Seongwook_kim
 * @since J2EE 1.4
 */
public final class GNI_USR_FILE implements java.io.Serializable {

	private String        ibflag        = "";
	private String        page_rows     = "";
	private String        usr_id        = "";
	private String        blk_jb_tit_cd = "";
	private String        rev_slp_flg   = "";
	private String        expn_slp_flg  = "";
	private String        pay_slp_flg   = "";
	private String        dat_inq_lvl   = "";
	private String        cre_usr_id    = "";
	private String        cre_dt        = "";
	private String        upd_usr_id    = "";
	private String        upd_dt        = "";

	public GNI_USR_FILE(){}

	public GNI_USR_FILE(
			String        ibflag       ,
			String        page_rows    ,
			String        usr_id       ,
			String        blk_jb_tit_cd,
			String        rev_slp_flg  ,
			String        expn_slp_flg ,
			String        pay_slp_flg  ,
			String        dat_inq_lvl  ,
			String        cre_usr_id   ,
			String        cre_dt       ,
			String        upd_usr_id   ,
			String        upd_dt       ){
		this.ibflag        = ibflag       ;
		this.page_rows     = page_rows    ;
		this.usr_id        = usr_id       ;
		this.blk_jb_tit_cd = blk_jb_tit_cd;
		this.rev_slp_flg   = rev_slp_flg  ;
		this.expn_slp_flg  = expn_slp_flg ;
		this.pay_slp_flg   = pay_slp_flg  ;
		this.dat_inq_lvl   = dat_inq_lvl  ;
		this.cre_usr_id    = cre_usr_id   ;
		this.cre_dt        = cre_dt       ;
		this.upd_usr_id    = upd_usr_id   ;
		this.upd_dt        = upd_dt       ;
	}

	// getter method is proceeding ..
	public String        getIbflag       (){	return ibflag       	;	}
	public String        getPage_rows    (){	return page_rows    	;	}
	public String        getUsr_id       (){	return usr_id       	;	}
	public String        getBlk_jb_tit_cd(){	return blk_jb_tit_cd	;	}
	public String        getRev_slp_flg  (){	return rev_slp_flg  	;	}
	public String        getExpn_slp_flg (){	return expn_slp_flg 	;	}
	public String        getPay_slp_flg  (){	return pay_slp_flg  	;	}
	public String        getDat_inq_lvl  (){	return dat_inq_lvl  	;	}
	public String        getCre_usr_id   (){	return cre_usr_id   	;	}
	public String        getCre_dt       (){	return cre_dt       	;	}
	public String        getUpd_usr_id   (){	return upd_usr_id   	;	}
	public String        getUpd_dt       (){	return upd_dt       	;	}

	// setter method is proceeding ..
	public void setIbflag       ( String        ibflag        ){	this.ibflag        = ibflag       	;	}
	public void setPage_rows    ( String        page_rows     ){	this.page_rows     = page_rows    	;	}
	public void setUsr_id       ( String        usr_id        ){	this.usr_id        = usr_id       	;	}
	public void setBlk_jb_tit_cd( String        blk_jb_tit_cd ){	this.blk_jb_tit_cd = blk_jb_tit_cd	;	}
	public void setRev_slp_flg  ( String        rev_slp_flg   ){	this.rev_slp_flg   = rev_slp_flg  	;	}
	public void setExpn_slp_flg ( String        expn_slp_flg  ){	this.expn_slp_flg  = expn_slp_flg 	;	}
	public void setPay_slp_flg  ( String        pay_slp_flg   ){	this.pay_slp_flg   = pay_slp_flg  	;	}
	public void setDat_inq_lvl  ( String        dat_inq_lvl   ){	this.dat_inq_lvl   = dat_inq_lvl  	;	}
	public void setCre_usr_id   ( String        cre_usr_id    ){	this.cre_usr_id    = cre_usr_id   	;	}
	public void setCre_dt       ( String        cre_dt        ){	this.cre_dt        = cre_dt       	;	}
	public void setUpd_usr_id   ( String        upd_usr_id    ){	this.upd_usr_id    = upd_usr_id   	;	}
	public void setUpd_dt       ( String        upd_dt        ){	this.upd_dt        = upd_dt       	;	}

	public static GNI_USR_FILE fromRequest(HttpServletRequest request) {
		GNI_USR_FILE model = new GNI_USR_FILE();
		try {
			model.setIbflag       	(JSPUtil.getParameter(request, "ibflag       		".trim(), ""));
			model.setPage_rows    	(JSPUtil.getParameter(request, "page_rows    		".trim(), ""));
			model.setUsr_id       	(JSPUtil.getParameter(request, "usr_id       		".trim(), ""));
			model.setBlk_jb_tit_cd	(JSPUtil.getParameter(request, "blk_jb_tit_cd		".trim(), ""));
			model.setRev_slp_flg  	(JSPUtil.getParameter(request, "rev_slp_flg  		".trim(), ""));
			model.setExpn_slp_flg 	(JSPUtil.getParameter(request, "expn_slp_flg 		".trim(), ""));
			model.setPay_slp_flg  	(JSPUtil.getParameter(request, "pay_slp_flg  		".trim(), ""));
			model.setDat_inq_lvl  	(JSPUtil.getParameter(request, "dat_inq_lvl  		".trim(), ""));
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
		GNI_USR_FILE model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag        =  (JSPUtil.getParameter(request, "ibflag       		".trim(), length));
			String[] page_rows     =  (JSPUtil.getParameter(request, "page_rows    		".trim(), length));
			String[] usr_id        =  (JSPUtil.getParameter(request, "usr_id       		".trim(), length));
			String[] blk_jb_tit_cd =  (JSPUtil.getParameter(request, "blk_jb_tit_cd		".trim(), length));
			String[] rev_slp_flg   =  (JSPUtil.getParameter(request, "rev_slp_flg  		".trim(), length));
			String[] expn_slp_flg  =  (JSPUtil.getParameter(request, "expn_slp_flg 		".trim(), length));
			String[] pay_slp_flg   =  (JSPUtil.getParameter(request, "pay_slp_flg  		".trim(), length));
			String[] dat_inq_lvl   =  (JSPUtil.getParameter(request, "dat_inq_lvl  		".trim(), length));
			String[] cre_usr_id    =  (JSPUtil.getParameter(request, "cre_usr_id   		".trim(), length));
			String[] cre_dt        =  (JSPUtil.getParameter(request, "cre_dt       		".trim(), length));
			String[] upd_usr_id    =  (JSPUtil.getParameter(request, "upd_usr_id   		".trim(), length));
			String[] upd_dt        =  (JSPUtil.getParameter(request, "upd_dt       		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new GNI_USR_FILE();
				model.setIbflag       		  (ibflag       	[i]);
				model.setPage_rows    		  (page_rows    	[i]);
				model.setUsr_id       		  (usr_id       	[i]);
				model.setBlk_jb_tit_cd		  (blk_jb_tit_cd	[i]);
				model.setRev_slp_flg  		  (rev_slp_flg  	[i]);
				model.setExpn_slp_flg 		  (expn_slp_flg 	[i]);
				model.setPay_slp_flg  		  (pay_slp_flg  	[i]);
				model.setDat_inq_lvl  		  (dat_inq_lvl  	[i]);
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
		GNI_USR_FILE model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag        =  (JSPUtil.getParameter(request, prefix + "ibflag       		".trim(), length));
			String[] page_rows     =  (JSPUtil.getParameter(request, prefix + "page_rows    		".trim(), length));
			String[] usr_id        =  (JSPUtil.getParameter(request, prefix + "usr_id       		".trim(), length));
			String[] blk_jb_tit_cd =  (JSPUtil.getParameter(request, prefix + "blk_jb_tit_cd		".trim(), length));
			String[] rev_slp_flg   =  (JSPUtil.getParameter(request, prefix + "rev_slp_flg  		".trim(), length));
			String[] expn_slp_flg  =  (JSPUtil.getParameter(request, prefix + "expn_slp_flg 		".trim(), length));
			String[] pay_slp_flg   =  (JSPUtil.getParameter(request, prefix + "pay_slp_flg  		".trim(), length));
			String[] dat_inq_lvl   =  (JSPUtil.getParameter(request, prefix + "dat_inq_lvl  		".trim(), length));
			String[] cre_usr_id    =  (JSPUtil.getParameter(request, prefix + "cre_usr_id   		".trim(), length));
			String[] cre_dt        =  (JSPUtil.getParameter(request, prefix + "cre_dt       		".trim(), length));
			String[] upd_usr_id    =  (JSPUtil.getParameter(request, prefix + "upd_usr_id   		".trim(), length));
			String[] upd_dt        =  (JSPUtil.getParameter(request, prefix + "upd_dt       		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new GNI_USR_FILE();
				model.setIbflag       		  ( ibflag       	[i]);
				model.setPage_rows    		  ( page_rows    	[i]);
				model.setUsr_id       		  ( usr_id       	[i]);
				model.setBlk_jb_tit_cd		  ( blk_jb_tit_cd	[i]);
				model.setRev_slp_flg  		  ( rev_slp_flg  	[i]);
				model.setExpn_slp_flg 		  ( expn_slp_flg 	[i]);
				model.setPay_slp_flg  		  ( pay_slp_flg  	[i]);
				model.setDat_inq_lvl  		  ( dat_inq_lvl  	[i]);
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
