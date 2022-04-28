/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : searchComUsrRoleVO.java
*@FileTitle : searchComUsrRoleVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.16
*@LastModifier : 이승열
*@LastVersion : 1.0
* 2009.02.16 이승열 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.management.opus.role.vo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * SearchComUsrRoleVO Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author SEUNGYOL LEE
 * @see
 * @since J2EE 1.4
 */
public class SearchComUsrRoleVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchComUsrRoleVO> models = new ArrayList<SearchComUsrRoleVO>();
	
	private String level = null;
	private String usrRoleDesc = null;
	private String ibflag = null;
	private String status = null;
	private String delcheck = null;
	private String progAssign = null;
	private String lvl = null;
	private String usrRoleNm = null;
	private String creDt = null;
	private String prntUsrRoleCd = null;
	private String userAssign = null;
	private String pagerows = null;
	private String usrRoleCd = null;
	private String admYn = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchComUsrRoleVO() {}

	
	/**
	 * SearchComUsrRoleVO 생성자.<br>
	 */
	public SearchComUsrRoleVO(String ibflag, String pagerows, String level, String delcheck, String status, String lvl, String usrRoleCd, String usrRoleNm, String usrRoleDesc, String prntUsrRoleCd, String userAssign, String progAssign, String creDt, String admYn) {
		this.level = level;
		this.usrRoleDesc = usrRoleDesc;
		this.ibflag = ibflag;
		this.status = status;
		this.delcheck = delcheck;
		this.progAssign = progAssign;
		this.lvl = lvl;
		this.usrRoleNm = usrRoleNm;
		this.creDt = creDt;
		this.prntUsrRoleCd = prntUsrRoleCd;
		this.userAssign = userAssign;
		this.pagerows = pagerows;
		this.usrRoleCd = usrRoleCd;
		this.admYn = admYn;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("level", getLevel());
		this.hashColumns.put("usr_role_desc", getUsrRoleDesc());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("status", getStatus());
		this.hashColumns.put("delcheck", getDelcheck());
		this.hashColumns.put("prog_assign", getProgAssign());
		this.hashColumns.put("lvl", getLvl());
		this.hashColumns.put("usr_role_nm", getUsrRoleNm());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("prnt_usr_role_cd", getPrntUsrRoleCd());
		this.hashColumns.put("user_assign", getUserAssign());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("usr_role_cd", getUsrRoleCd());
		this.hashColumns.put("adm_yn", getAdmYn());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("level", "level");
		this.hashFields.put("usr_role_desc", "usrRoleDesc");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("status", "status");
		this.hashFields.put("delcheck", "delcheck");
		this.hashFields.put("prog_assign", "progAssign");
		this.hashFields.put("lvl", "lvl");
		this.hashFields.put("usr_role_nm", "usrRoleNm");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("prnt_usr_role_cd", "prntUsrRoleCd");
		this.hashFields.put("user_assign", "userAssign");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("usr_role_cd", "usrRoleCd");
		this.hashFields.put("adm_yn", "admYn");
		return this.hashFields;
	}
	
	public String getLevel() {
		return this.level;
	}
	public String getUsrRoleDesc() {
		return this.usrRoleDesc;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getStatus() {
		return this.status;
	}
	public String getDelcheck() {
		return this.delcheck;
	}
	public String getProgAssign() {
		return this.progAssign;
	}
	public String getLvl() {
		return this.lvl;
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
	public String getUserAssign() {
		return this.userAssign;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getUsrRoleCd() {
		return this.usrRoleCd;
	}

	public void setLevel(String level) {
		this.level = level;
		//this.level=true;
	}
	public void setUsrRoleDesc(String usrRoleDesc) {
		this.usrRoleDesc = usrRoleDesc;
		//this.usrRoleDesc=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setStatus(String status) {
		this.status = status;
		//this.status=true;
	}
	public void setDelcheck(String delcheck) {
		this.delcheck = delcheck;
		//this.delcheck=true;
	}
	public void setProgAssign(String progAssign) {
		this.progAssign = progAssign;
		//this.progAssign=true;
	}
	public void setLvl(String lvl) {
		this.lvl = lvl;
		//this.lvl=true;
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
	public void setUserAssign(String userAssign) {
		this.userAssign = userAssign;
		//this.userAssign=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setUsrRoleCd(String usrRoleCd) {
		this.usrRoleCd = usrRoleCd;
		//this.usrRoleCd=true;
	}

	/**
	 * @param admYn the admYn to set
	 */
	public void setAdmYn(String admYn) {
		this.admYn = admYn;
	}


	/**
	 * @return the admYn
	 */
	public String getAdmYn() {
		return admYn;
	}


	/**
	 * HttpServletRequest에서 SearchComUsrRoleVO객체를 생성한다.<br>
	 * 
	 * @param request HttpServletRequest
	 * @exception 
	 */
	public void fromRequest(HttpServletRequest request) {
		setLevel(JSPUtil.getParameter(request, "level", ""));
		setUsrRoleDesc(JSPUtil.getParameter(request, "usr_role_desc", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setStatus(JSPUtil.getParameter(request, "status", ""));
		setDelcheck(JSPUtil.getParameter(request, "delcheck", ""));
		setProgAssign(JSPUtil.getParameter(request, "prog_assign", ""));
		setLvl(JSPUtil.getParameter(request, "lvl", ""));
		setUsrRoleNm(JSPUtil.getParameter(request, "usr_role_nm", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPrntUsrRoleCd(JSPUtil.getParameter(request, "prnt_usr_role_cd", ""));
		setUserAssign(JSPUtil.getParameter(request, "user_assign", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setUsrRoleCd(JSPUtil.getParameter(request, "usr_role_cd", ""));
	}

	/**
	 * HttpServletRequest에서 SearchComUsrRoleVO 배열 객체를 생성한다.<br>
	 * 
	 * @param request HttpServletRequest
	 * @return SearchComUsrRoleVO[]
	 * @exception 
	 */
	public SearchComUsrRoleVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * HttpServletRequest에서 SearchComUsrRoleVO 배열 객체를 생성한다.<br>
	 * 
	 * @param request HttpServletRequest
	 * @param prefix 	String
	 * @return SearchComUsrRoleVO[]
	 * @exception 
	 */
	public SearchComUsrRoleVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchComUsrRoleVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] level = (JSPUtil.getParameter(request, prefix	+ "level".trim(), length));
			String[] usrRoleDesc = (JSPUtil.getParameter(request, prefix	+ "usr_role_desc".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] status = (JSPUtil.getParameter(request, prefix	+ "status".trim(), length));
			String[] delcheck = (JSPUtil.getParameter(request, prefix	+ "delcheck".trim(), length));
			String[] progAssign = (JSPUtil.getParameter(request, prefix	+ "prog_assign".trim(), length));
			String[] lvl = (JSPUtil.getParameter(request, prefix	+ "lvl".trim(), length));
			String[] usrRoleNm = (JSPUtil.getParameter(request, prefix	+ "usr_role_nm".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] prntUsrRoleCd = (JSPUtil.getParameter(request, prefix	+ "prnt_usr_role_cd".trim(), length));
			String[] userAssign = (JSPUtil.getParameter(request, prefix	+ "user_assign".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] usrRoleCd = (JSPUtil.getParameter(request, prefix	+ "usr_role_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchComUsrRoleVO();
				if (level[i] != null)
					model.setLevel(level[i]);
				if (usrRoleDesc[i] != null)
					model.setUsrRoleDesc(usrRoleDesc[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (status[i] != null)
					model.setStatus(status[i]);
				if (delcheck[i] != null)
					model.setDelcheck(delcheck[i]);
				if (progAssign[i] != null)
					model.setProgAssign(progAssign[i]);
				if (lvl[i] != null)
					model.setLvl(lvl[i]);
				if (usrRoleNm[i] != null)
					model.setUsrRoleNm(usrRoleNm[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (prntUsrRoleCd[i] != null)
					model.setPrntUsrRoleCd(prntUsrRoleCd[i]);
				if (userAssign[i] != null)
					model.setUserAssign(userAssign[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (usrRoleCd[i] != null)
					model.setUsrRoleCd(usrRoleCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			;
		}
		return getsearchComUsrRoleVOs();
	}

	/**
	 * SearchComUsrRoleVO 배열 객체를 반환한다.<br>
	 * 
	 * @return SearchComUsrRoleVO[]
	 * @exception 
	 */
	public SearchComUsrRoleVO[] getsearchComUsrRoleVOs(){
		SearchComUsrRoleVO[] vos = (SearchComUsrRoleVO[])models.toArray(new SearchComUsrRoleVO[models.size()]);
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
		} catch (Exception ex) {
			;
		}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = getFieldCatct(field, i, arr);
		}
		return arr;
	}
	
	/**
	 * getField 에서 catch문에 대한 로직
	 * @param field 
	 * @param i 
	 * @param arr
	 * @return arr    
	 */
	private String[] getFieldCatct(Field[] field, int i, String[] arr) {
		try {
			arr = new String[1]; 
			arr[0] = String.valueOf(field[i].get(this));
		} catch (IllegalAccessException e) {
			return null; 
		}
		return arr; 
	}
	
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.level = this.level .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrRoleDesc = this.usrRoleDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.status = this.status .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delcheck = this.delcheck .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.progAssign = this.progAssign .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lvl = this.lvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrRoleNm = this.usrRoleNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prntUsrRoleCd = this.prntUsrRoleCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.userAssign = this.userAssign .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrRoleCd = this.usrRoleCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
