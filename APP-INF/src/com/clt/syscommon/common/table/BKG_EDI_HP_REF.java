/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BKG_EDI_HP_REF.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2008-12-02
*@LastModifier : 2002701
*@LastVersion : 1.0
* 2008-10-22 2002701
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.table;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 * Hewlett Packerd 관련 EDI 전송 flat file 에 추가될 ship id 및 partner no 관리<br>
 * 
 * @author iskim (2002701)
 * @since J2EE 1.4
 */ 
public class BKG_EDI_HP_REF implements Serializable {

	private String bkg_no        = "";
	private String bkg_no_split  = "";
	private String hp_ref_seq    = "";
	private String hp_shp_id     = "";
	private String hp_prt_no     = "";
	private String cre_ofc_cd    = "";
	private String cre_usr_id    = "";
	private String cre_dt        = "";
	private String upd_usr_id    = "";
	private String upd_dt        = "";
	private String eai_evnt_dt   = "";
	private String op_cd		 = "";
	
	public BKG_EDI_HP_REF(){}
	
	public BKG_EDI_HP_REF(
			 String bkg_no,       
			 String bkg_no_split, 
			 String hp_ref_seq,   
			 String hp_shp_id,   
			 String hp_prt_no,    
			 String cre_ofc_cd,   
			 String cre_usr_id,  
			 String cre_dt,       
			 String upd_usr_id,   
			 String upd_dt,       
			 String eai_evnt_dt,
			 String op_cd
	){
		this.bkg_no        = bkg_no      ;
		this.bkg_no_split  = bkg_no_split;
		this.hp_ref_seq    = hp_ref_seq  ;
		this.hp_shp_id     = hp_shp_id   ;
		this.hp_prt_no     = hp_prt_no   ;
		this.cre_ofc_cd    = cre_ofc_cd  ;
		this.cre_usr_id    = cre_usr_id  ;
		this.cre_dt        = cre_dt      ;
		this.upd_usr_id    = upd_usr_id  ;
		this.upd_dt        = upd_dt      ;
		this.eai_evnt_dt   = eai_evnt_dt ;
		this.op_cd 		   = op_cd		 ;
	}	

	
	
	/**
	 * @param request
	 * @return
	 */
	public static BKG_EDI_HP_REF fromRequest(HttpServletRequest request) {
		BKG_EDI_HP_REF model = new BKG_EDI_HP_REF();
		try {
			model.setBkg_no       (JSPUtil.getParameter(request, "bkg_no      ".trim(), ""));
			model.setBkg_no_split (JSPUtil.getParameter(request, "bkg_no_split".trim(), ""));
			model.setHp_ref_seq   (JSPUtil.getParameter(request, "hp_ref_seq  ".trim(), ""));
			model.setHp_shp_id    (JSPUtil.getParameter(request, "hp_shp_id   ".trim(), ""));
			model.setHp_prt_no    (JSPUtil.getParameter(request, "hp_prt_no   ".trim(), ""));
			model.setCre_ofc_cd   (JSPUtil.getParameter(request, "cre_ofc_cd  ".trim(), ""));
			model.setCre_usr_id   (JSPUtil.getParameter(request, "cre_usr_id  ".trim(), ""));
			model.setCre_dt       (JSPUtil.getParameter(request, "cre_dt      ".trim(), ""));
			model.setUpd_usr_id   (JSPUtil.getParameter(request, "upd_usr_id  ".trim(), ""));
			model.setUpd_dt       (JSPUtil.getParameter(request, "upd_dt      ".trim(), ""));
			model.setEai_evnt_dt  (JSPUtil.getParameter(request, "eai_evnt_dt ".trim(), ""));
			model.setOp_cd  	  (JSPUtil.getParameter(request, "op_cd ".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	
	/**
	 * @param request
	 * @param length
	 * @return
	 */
	public static Collection fromRequest(HttpServletRequest request, int length) {
		BKG_EDI_HP_REF model = null;
		Collection models = new ArrayList();
		try {
			String[] bkg_no       =  (JSPUtil.getParameter(request, "bkg_no      		".trim(), length));
			String[] bkg_no_split =  (JSPUtil.getParameter(request, "bkg_no_split		".trim(), length));
			String[] hp_ref_seq   =  (JSPUtil.getParameter(request, "hp_ref_seq  		".trim(), length));
			String[] hp_shp_id    =  (JSPUtil.getParameter(request, "hp_shp_id   		".trim(), length));
			String[] hp_prt_no    =  (JSPUtil.getParameter(request, "hp_prt_no   		".trim(), length));
			String[] cre_ofc_cd   =  (JSPUtil.getParameter(request, "cre_ofc_cd  		".trim(), length));
			String[] cre_usr_id   =  (JSPUtil.getParameter(request, "cre_usr_id  		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, "cre_dt      		".trim(), length));
			String[] upd_usr_id   =  (JSPUtil.getParameter(request, "upd_usr_id  		".trim(), length));
			String[] upd_dt       =  (JSPUtil.getParameter(request, "upd_dt      		".trim(), length));
			String[] eai_evnt_dt  =  (JSPUtil.getParameter(request, "eai_evnt_dt 		".trim(), length));
			String[] op_cd  	  =  (JSPUtil.getParameter(request, "op_cd 				".trim(), length));

			for (int i = 0; i < length; i++) {
				model = new BKG_EDI_HP_REF();
				model.setBkg_no       (bkg_no      [i]);
				model.setBkg_no_split (bkg_no_split[i]);
				model.setHp_ref_seq   (hp_ref_seq  [i]);
				model.setHp_shp_id    (hp_shp_id   [i]);
				model.setHp_prt_no    (hp_prt_no   [i]);
				model.setCre_ofc_cd   (cre_ofc_cd  [i]);
				model.setCre_usr_id   (cre_usr_id  [i]);
				model.setCre_dt       (cre_dt      [i]);
				model.setUpd_usr_id   (upd_usr_id  [i]);
				model.setUpd_dt       (upd_dt      [i]);                                                                   
				model.setEai_evnt_dt  (eai_evnt_dt [i]); 
				model.setOp_cd		  (op_cd	   [i]);
				
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	
	/**
	 * @param request
	 * @param prefix
	 * @return
	 */
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		BKG_EDI_HP_REF model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] bkg_no       =  (JSPUtil.getParameter(request, prefix + "bkg_no      		".trim(), length));
			String[] bkg_no_split =  (JSPUtil.getParameter(request, prefix + "bkg_no_split 		".trim(), length));
			String[] hp_ref_seq   =  (JSPUtil.getParameter(request, prefix + "hp_ref_seq   		".trim(), length));
			String[] hp_shp_id    =  (JSPUtil.getParameter(request, prefix + "hp_shp_id    		".trim(), length));
			String[] hp_prt_no    =  (JSPUtil.getParameter(request, prefix + "hp_prt_no    		".trim(), length));
			String[] cre_ofc_cd   =  (JSPUtil.getParameter(request, prefix + "cre_ofc_cd   		".trim(), length));
			String[] cre_usr_id   =  (JSPUtil.getParameter(request, prefix + "cre_usr_id   		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, prefix + "cre_dt       		".trim(), length));
			String[] upd_usr_id   =  (JSPUtil.getParameter(request, prefix + "upd_usr_id   		".trim(), length));
			String[] upd_dt       =  (JSPUtil.getParameter(request, prefix + "upd_dt      		".trim(), length));
			String[] eai_evnt_dt  =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt 		".trim(), length));
			String[] op_cd  	  =  (JSPUtil.getParameter(request, prefix + "op_cd 		    ".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BKG_EDI_HP_REF();
				model.setBkg_no       (bkg_no      [i]);
				model.setBkg_no_split (bkg_no_split[i]);
				model.setHp_ref_seq   (hp_ref_seq  [i]);
				model.setHp_shp_id    (hp_shp_id   [i]);
				model.setHp_prt_no    (hp_prt_no   [i]);
				model.setCre_ofc_cd   (cre_ofc_cd  [i]);
				model.setCre_usr_id   (cre_usr_id  [i]);
				model.setCre_dt       (cre_dt      [i]);
				model.setUpd_usr_id   (upd_usr_id  [i]);
				model.setUpd_dt       (upd_dt      [i]);                                                                   
				model.setEai_evnt_dt  (eai_evnt_dt [i]); 
				model.setOp_cd		  (op_cd	   [i]);

				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}

	// toString() method is overriding ..
	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
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

	/**
	 * @return
	 */
	public String getBkg_no() {
		return bkg_no;
	}

	/**
	 * @param bkg_no
	 */
	public void setBkg_no(String bkg_no) {
		this.bkg_no = bkg_no;
	}

	/**
	 * @return
	 */
	public String getBkg_no_split() {
		return bkg_no_split;
	}

	/**
	 * @param bkg_no_split
	 */
	public void setBkg_no_split(String bkg_no_split) {
		this.bkg_no_split = bkg_no_split;
	}

	/**
	 * @return
	 */
	public String getCre_dt() {
		return cre_dt;
	}

	/**
	 * @param cre_dt
	 */
	public void setCre_dt(String cre_dt) {
		this.cre_dt = cre_dt;
	}

	/**
	 * @return
	 */
	public String getCre_ofc_cd() {
		return cre_ofc_cd;
	}

	/**
	 * @param cre_ofc_cd
	 */
	public void setCre_ofc_cd(String cre_ofc_cd) {
		this.cre_ofc_cd = cre_ofc_cd;
	}

	/**
	 * @return
	 */
	public String getCre_usr_id() {
		return cre_usr_id;
	}

	/**
	 * @param cre_usr_id
	 */
	public void setCre_usr_id(String cre_usr_id) {
		this.cre_usr_id = cre_usr_id;
	}

	/**
	 * @return
	 */
	public String getEai_evnt_dt() {
		return eai_evnt_dt;
	}

	/**
	 * @param eai_evnt_dt
	 */
	public void setEai_evnt_dt(String eai_evnt_dt) {
		this.eai_evnt_dt = eai_evnt_dt;
	}

	/**
	 * @return
	 */
	public String getHp_prt_no() {
		return hp_prt_no;
	}

	/**
	 * @param hp_prt_no
	 */
	public void setHp_prt_no(String hp_prt_no) {
		this.hp_prt_no = hp_prt_no;
	}

	/**
	 * @return
	 */
	public String getHp_ref_seq() {
		return hp_ref_seq;
	}

	/**
	 * @param hp_ref_seq
	 */
	public void setHp_ref_seq(String hp_ref_seq) {
		this.hp_ref_seq = hp_ref_seq;
	}

	/**
	 * @return
	 */
	public String getHp_shp_id() {
		return hp_shp_id;
	}

	/**
	 * @param hp_shp_id
	 */
	public void setHp_shp_id(String hp_shp_id) {
		this.hp_shp_id = hp_shp_id;
	}

	/**
	 * @return
	 */
	public String getUpd_dt() {
		return upd_dt;
	}

	/**
	 * @param upd_dt
	 */
	public void setUpd_dt(String upd_dt) {
		this.upd_dt = upd_dt;
	}

	/**
	 * @return
	 */
	public String getUpd_usr_id() {
		return upd_usr_id;
	}

	/**
	 * @param upd_usr_id
	 */
	public void setUpd_usr_id(String upd_usr_id) {
		this.upd_usr_id = upd_usr_id;
	}		
	
	/**
	 * @return
	 */
	public String getOp_cd() {
		return op_cd;
	}

	/**
	 * @param op_cd
	 */
	public void setOp_cd(String op_cd) {
		this.op_cd = op_cd;
	}
}
