/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BKG_MISC_ORG.java
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
 * NIS 의 BKG_MISC_ORG 의 table sync 처리를 위한 VO <br>
 * 
 * @author iskim (2002701)
 * @since J2EE 1.4
 */ 
public class BKG_MISC_ORG implements Serializable {

	private String bkg_no        = "";
	private String bkg_no_split  = "";
	private String xter_si_ind_cd    = "";
	private String xter_si_knt     = "";
	private String xter_si_dt     = "";
	private String xter_si_usr_id     = "";
	private String cre_dt        = "";
	
	public BKG_MISC_ORG(){}
	
	public BKG_MISC_ORG(
			 String bkg_no,       
			 String bkg_no_split, 
			 String xter_si_ind_cd,   
			 String xter_si_knt,   
			 String xter_si_dt,    
			 String xter_si_usr_id,   
			 String cre_dt
	){
		this.bkg_no        = bkg_no      ;
		this.bkg_no_split  = bkg_no_split;
		this.xter_si_ind_cd    = xter_si_ind_cd  ;
		this.xter_si_knt     = xter_si_knt   ;
		this.xter_si_dt     = xter_si_dt   ;
		this.xter_si_usr_id    = xter_si_usr_id  ;
		this.cre_dt        = cre_dt      ;
	}	

	
	
	/**
	 * @param request
	 * @return
	 */
	public static BKG_MISC_ORG fromRequest(HttpServletRequest request) {
		BKG_MISC_ORG model = new BKG_MISC_ORG();
		try {
			model.setBkg_no       (JSPUtil.getParameter(request, "bkg_no      ".trim(), ""));
			model.setBkg_no_split (JSPUtil.getParameter(request, "bkg_no_split".trim(), ""));
			model.setXter_si_ind_cd   (JSPUtil.getParameter(request, "xter_si_ind_cd  ".trim(), ""));
			model.setXter_si_knt    (JSPUtil.getParameter(request, "xter_si_knt   ".trim(), ""));
			model.setXter_si_dt    (JSPUtil.getParameter(request, "xter_si_dt   ".trim(), ""));
			model.setXter_si_usr_id   (JSPUtil.getParameter(request, "xter_si_usr_id  ".trim(), ""));
			model.setCre_dt       (JSPUtil.getParameter(request, "cre_dt      ".trim(), ""));
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
		BKG_MISC_ORG model = null;
		Collection models = new ArrayList();
		try {
			String[] bkg_no       =  (JSPUtil.getParameter(request, "bkg_no      		".trim(), length));
			String[] bkg_no_split =  (JSPUtil.getParameter(request, "bkg_no_split		".trim(), length));
			String[] xter_si_ind_cd   =  (JSPUtil.getParameter(request, "xter_si_ind_cd  		".trim(), length));
			String[] xter_si_knt    =  (JSPUtil.getParameter(request, "xter_si_knt   		".trim(), length));
			String[] xter_si_dt    =  (JSPUtil.getParameter(request, "xter_si_dt   		".trim(), length));
			String[] xter_si_usr_id   =  (JSPUtil.getParameter(request, "xter_si_usr_id  		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, "cre_dt      		".trim(), length));

			for (int i = 0; i < length; i++) {
				model = new BKG_MISC_ORG();
				model.setBkg_no       (bkg_no      [i]);
				model.setBkg_no_split (bkg_no_split[i]);
				model.setXter_si_ind_cd   (xter_si_ind_cd  [i]);
				model.setXter_si_knt    (xter_si_knt   [i]);
				model.setXter_si_dt    (xter_si_dt   [i]);
				model.setXter_si_usr_id   (xter_si_usr_id  [i]);
				model.setCre_dt       (cre_dt      [i]);
				
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
		BKG_MISC_ORG model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] bkg_no       =  (JSPUtil.getParameter(request, prefix + "bkg_no      		".trim(), length));
			String[] bkg_no_split =  (JSPUtil.getParameter(request, prefix + "bkg_no_split 		".trim(), length));
			String[] xter_si_ind_cd   =  (JSPUtil.getParameter(request, prefix + "xter_si_ind_cd   		".trim(), length));
			String[] xter_si_knt    =  (JSPUtil.getParameter(request, prefix + "xter_si_knt    		".trim(), length));
			String[] xter_si_dt    =  (JSPUtil.getParameter(request, prefix + "xter_si_dt    		".trim(), length));
			String[] xter_si_usr_id   =  (JSPUtil.getParameter(request, prefix + "xter_si_usr_id   		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, prefix + "cre_dt       		".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BKG_MISC_ORG();
				model.setBkg_no       (bkg_no      [i]);
				model.setBkg_no_split (bkg_no_split[i]);
				model.setXter_si_ind_cd   (xter_si_ind_cd  [i]);
				model.setXter_si_knt    (xter_si_knt   [i]);
				model.setXter_si_dt    (xter_si_dt   [i]);
				model.setXter_si_usr_id   (xter_si_usr_id  [i]);
				model.setCre_dt       (cre_dt      [i]);

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
	public String getXter_si_usr_id() {
		return xter_si_usr_id;
	}

	/**
	 * @param xter_si_usr_id
	 */
	public void setXter_si_usr_id(String xter_si_usr_id) {
		this.xter_si_usr_id = xter_si_usr_id;
	}

	/**
	 * @return
	 */
	public String getXter_si_dt() {
		return xter_si_dt;
	}

	/**
	 * @param xter_si_dt
	 */
	public void setXter_si_dt(String xter_si_dt) {
		this.xter_si_dt = xter_si_dt;
	}

	/**
	 * @return
	 */
	public String getXter_si_ind_cd() {
		return xter_si_ind_cd;
	}

	/**
	 * @param xter_si_ind_cd
	 */
	public void setXter_si_ind_cd(String xter_si_ind_cd) {
		this.xter_si_ind_cd = xter_si_ind_cd;
	}

	/**
	 * @return
	 */
	public String getXter_si_knt() {
		return xter_si_knt;
	}

	/**
	 * @param xter_si_knt
	 */
	public void setXter_si_knt(String xter_si_knt) {
		this.xter_si_knt = xter_si_knt;
	}
}
