/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComUsrRoleVO.java
*@FileTitle : ComUsrRoleVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.16
*@LastModifier : 이승열
*@LastVersion : 1.0
* 2009.02.16 이승열 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 이승열
 * @since J2EE 1.5
 */

public class ComUsrRoleVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComUsrRoleVO> models = new ArrayList<ComUsrRoleVO>();
	
	/* Column Inpo */
	private String updUsrId = null;
	/* Column Inpo */
	private String pgmSubSysCd = null;
	/* Column Inpo */
	private String usrRoleDesc = null;
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String updDt = null;
	/* Column Inpo */
	private String usrRoleNm = null;
	/* Column Inpo */
	private String creDt = null;
	/* Column Inpo */
	private String prntUsrRoleCd = null;
	/* Column Inpo */
	private String creUsrId = null;
	/* Column Inpo */
	private String pgmApplCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Inpo */
	private String usrRoleCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComUsrRoleVO() {}

	public ComUsrRoleVO(String ibflag, String pagerows, String usrRoleCd, String pgmApplCd, String pgmSubSysCd, String usrRoleNm, String usrRoleDesc, String prntUsrRoleCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updUsrId = updUsrId;
		this.pgmSubSysCd = pgmSubSysCd;
		this.usrRoleDesc = usrRoleDesc;
		this.ibflag = ibflag;
		this.updDt = updDt;
		this.usrRoleNm = usrRoleNm;
		this.creDt = creDt;
		this.prntUsrRoleCd = prntUsrRoleCd;
		this.creUsrId = creUsrId;
		this.pgmApplCd = pgmApplCd;
		this.pagerows = pagerows;
		this.usrRoleCd = usrRoleCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pgm_sub_sys_cd", getPgmSubSysCd());
		this.hashColumns.put("usr_role_desc", getUsrRoleDesc());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("usr_role_nm", getUsrRoleNm());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("prnt_usr_role_cd", getPrntUsrRoleCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pgm_appl_cd", getPgmApplCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("usr_role_cd", getUsrRoleCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pgm_sub_sys_cd", "pgmSubSysCd");
		this.hashFields.put("usr_role_desc", "usrRoleDesc");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("usr_role_nm", "usrRoleNm");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("prnt_usr_role_cd", "prntUsrRoleCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pgm_appl_cd", "pgmApplCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("usr_role_cd", "usrRoleCd");
		return this.hashFields;
	}
	
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getPgmSubSysCd() {
		return this.pgmSubSysCd;
	}
	public String getUsrRoleDesc() {
		return this.usrRoleDesc;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getUsrRoleNm() {
		return this.usrRoleNm;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getPrntUsrRoleCd() {
		return this.prntUsrRoleCd;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getPgmApplCd() {
		return this.pgmApplCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getUsrRoleCd() {
		return this.usrRoleCd;
	}

	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setPgmSubSysCd(String pgmSubSysCd) {
		this.pgmSubSysCd = pgmSubSysCd;
		//this.pgmSubSysCd=true;
	}
	public void setUsrRoleDesc(String usrRoleDesc) {
		this.usrRoleDesc = usrRoleDesc;
		//this.usrRoleDesc=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setUsrRoleNm(String usrRoleNm) {
		this.usrRoleNm = usrRoleNm;
		//this.usrRoleNm=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setPrntUsrRoleCd(String prntUsrRoleCd) {
		this.prntUsrRoleCd = prntUsrRoleCd;
		//this.prntUsrRoleCd=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setPgmApplCd(String pgmApplCd) {
		this.pgmApplCd = pgmApplCd;
		//this.pgmApplCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setUsrRoleCd(String usrRoleCd) {
		this.usrRoleCd = usrRoleCd;
		//this.usrRoleCd=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPgmSubSysCd(JSPUtil.getParameter(request, "pgm_sub_sys_cd", ""));
		setUsrRoleDesc(JSPUtil.getParameter(request, "usr_role_desc", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setUsrRoleNm(JSPUtil.getParameter(request, "usr_role_nm", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPrntUsrRoleCd(JSPUtil.getParameter(request, "prnt_usr_role_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPgmApplCd(JSPUtil.getParameter(request, "pgm_appl_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setUsrRoleCd(JSPUtil.getParameter(request, "usr_role_cd", ""));
	}

	public ComUsrRoleVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public ComUsrRoleVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComUsrRoleVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] pgmSubSysCd = (JSPUtil.getParameter(request, prefix	+ "pgm_sub_sys_cd".trim(), length));
			String[] usrRoleDesc = (JSPUtil.getParameter(request, prefix	+ "usr_role_desc".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] usrRoleNm = (JSPUtil.getParameter(request, prefix	+ "usr_role_nm".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] prntUsrRoleCd = (JSPUtil.getParameter(request, prefix	+ "prnt_usr_role_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] pgmApplCd = (JSPUtil.getParameter(request, prefix	+ "pgm_appl_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] usrRoleCd = (JSPUtil.getParameter(request, prefix	+ "usr_role_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new ComUsrRoleVO();
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pgmSubSysCd[i] != null)
					model.setPgmSubSysCd(pgmSubSysCd[i]);
				if (usrRoleDesc[i] != null)
					model.setUsrRoleDesc(usrRoleDesc[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (usrRoleNm[i] != null)
					model.setUsrRoleNm(usrRoleNm[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (prntUsrRoleCd[i] != null)
					model.setPrntUsrRoleCd(prntUsrRoleCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (pgmApplCd[i] != null)
					model.setPgmApplCd(pgmApplCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (usrRoleCd[i] != null)
					model.setUsrRoleCd(usrRoleCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getComUsrRoleVOs();
	}

	public ComUsrRoleVO[] getComUsrRoleVOs(){
		ComUsrRoleVO[] vos = (ComUsrRoleVO[])models.toArray(new ComUsrRoleVO[models.size()]);
		return vos;
	}
	
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space = "";
		try{
			for(int i = 0; i < field.length; i++){
				String[] arr = null;
				arr = getField(field, i);
				if(arr != null){
					for(int j = 0; j < arr.length; j++) {
						ret.append(field[i].getName().concat(space).substring(0, 30).concat("= ") + arr[j] + "\n");
					}
				} else {
					ret.append(field[i].getName() + " =  null \n");
				}
			}
		} catch (Exception ex) {}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 * @throws IllegalAccessException
	 */
	private String[] getField(Field[] field, int i) throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmSubSysCd = this.pgmSubSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrRoleDesc = this.usrRoleDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrRoleNm = this.usrRoleNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prntUsrRoleCd = this.prntUsrRoleCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmApplCd = this.pgmApplCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrRoleCd = this.usrRoleCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
