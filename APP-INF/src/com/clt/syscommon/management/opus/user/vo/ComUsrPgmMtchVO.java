/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComUsrPgmMtchVO.java
*@FileTitle : ComUsrPgmMtchVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.04
*@LastModifier : 
*@LastVersion : 1.0
* 2009.09.04  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.management.opus.user.vo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ComUsrPgmMtchVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComUsrPgmMtchVO> models = new ArrayList<ComUsrPgmMtchVO>();
	
	/* Column Info */
	private String userFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String roleFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String usrId = null;
	/* Column Info */
	private String superFlg = null;
	/* Column Info */
	private String checkbox = null;
	/* Column Info */
	private String addFlg = null;
	/* Column Info */
	private String pgmNm = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String pgmNo = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComUsrPgmMtchVO() {}

	public ComUsrPgmMtchVO(String ibflag, String pagerows, String checkbox, String pgmNo, String pgmNm, String addFlg, String userFlg, String roleFlg, String superFlg, String usrId, String creUsrId, String updUsrId) {
		this.userFlg = userFlg;
		this.creUsrId = creUsrId;
		this.roleFlg = roleFlg;
		this.ibflag = ibflag;
		this.usrId = usrId;
		this.superFlg = superFlg;
		this.checkbox = checkbox;
		this.addFlg = addFlg;
		this.pgmNm = pgmNm;
		this.updUsrId = updUsrId;
		this.pgmNo = pgmNo;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("user_flg", getUserFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("role_flg", getRoleFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("usr_id", getUsrId());
		this.hashColumns.put("super_flg", getSuperFlg());
		this.hashColumns.put("checkbox", getCheckbox());
		this.hashColumns.put("add_flg", getAddFlg());
		this.hashColumns.put("pgm_nm", getPgmNm());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pgm_no", getPgmNo());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("user_flg", "userFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("role_flg", "roleFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("usr_id", "usrId");
		this.hashFields.put("super_flg", "superFlg");
		this.hashFields.put("checkbox", "checkbox");
		this.hashFields.put("add_flg", "addFlg");
		this.hashFields.put("pgm_nm", "pgmNm");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pgm_no", "pgmNo");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return userFlg
	 */
	public String getUserFlg() {
		return this.userFlg;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return roleFlg
	 */
	public String getRoleFlg() {
		return this.roleFlg;
	}
	
	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return usrId
	 */
	public String getUsrId() {
		return this.usrId;
	}
	
	/**
	 * Column Info
	 * @return superFlg
	 */
	public String getSuperFlg() {
		return this.superFlg;
	}
	
	/**
	 * Column Info
	 * @return checkbox
	 */
	public String getCheckbox() {
		return this.checkbox;
	}
	
	/**
	 * Column Info
	 * @return addFlg
	 */
	public String getAddFlg() {
		return this.addFlg;
	}
	
	/**
	 * Column Info
	 * @return pgmNm
	 */
	public String getPgmNm() {
		return this.pgmNm;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	/**
	 * Column Info
	 * @return pgmNo
	 */
	public String getPgmNo() {
		return this.pgmNo;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}
	

	/**
	 * Column Info
	 * @param userFlg
	 */
	public void setUserFlg(String userFlg) {
		this.userFlg = userFlg;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param roleFlg
	 */
	public void setRoleFlg(String roleFlg) {
		this.roleFlg = roleFlg;
	}
	
	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param usrId
	 */
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}
	
	/**
	 * Column Info
	 * @param superFlg
	 */
	public void setSuperFlg(String superFlg) {
		this.superFlg = superFlg;
	}
	
	/**
	 * Column Info
	 * @param checkbox
	 */
	public void setCheckbox(String checkbox) {
		this.checkbox = checkbox;
	}
	
	/**
	 * Column Info
	 * @param addFlg
	 */
	public void setAddFlg(String addFlg) {
		this.addFlg = addFlg;
	}
	
	/**
	 * Column Info
	 * @param pgmNm
	 */
	public void setPgmNm(String pgmNm) {
		this.pgmNm = pgmNm;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param pgmNo
	 */
	public void setPgmNo(String pgmNo) {
		this.pgmNo = pgmNo;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUserFlg(JSPUtil.getParameter(request, "user_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRoleFlg(JSPUtil.getParameter(request, "role_flg", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setUsrId(JSPUtil.getParameter(request, "usr_id", ""));
		setSuperFlg(JSPUtil.getParameter(request, "super_flg", ""));
		setCheckbox(JSPUtil.getParameter(request, "checkbox", ""));
		setAddFlg(JSPUtil.getParameter(request, "add_flg", ""));
		setPgmNm(JSPUtil.getParameter(request, "pgm_nm", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPgmNo(JSPUtil.getParameter(request, "pgm_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ComUsrPgmMtchVO[]
	 */
	public ComUsrPgmMtchVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ComUsrPgmMtchVO[]
	 */
	public ComUsrPgmMtchVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComUsrPgmMtchVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] userFlg = (JSPUtil.getParameter(request, prefix	+ "user_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] roleFlg = (JSPUtil.getParameter(request, prefix	+ "role_flg", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] usrId = (JSPUtil.getParameter(request, prefix	+ "usr_id", length));
			String[] superFlg = (JSPUtil.getParameter(request, prefix	+ "super_flg", length));
			String[] checkbox = (JSPUtil.getParameter(request, prefix	+ "checkbox", length));
			String[] addFlg = (JSPUtil.getParameter(request, prefix	+ "add_flg", length));
			String[] pgmNm = (JSPUtil.getParameter(request, prefix	+ "pgm_nm", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pgmNo = (JSPUtil.getParameter(request, prefix	+ "pgm_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new ComUsrPgmMtchVO();
				if (userFlg[i] != null)
					model.setUserFlg(userFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (roleFlg[i] != null)
					model.setRoleFlg(roleFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (usrId[i] != null)
					model.setUsrId(usrId[i]);
				if (superFlg[i] != null)
					model.setSuperFlg(superFlg[i]);
				if (checkbox[i] != null)
					model.setCheckbox(checkbox[i]);
				if (addFlg[i] != null)
					model.setAddFlg(addFlg[i]);
				if (pgmNm[i] != null)
					model.setPgmNm(pgmNm[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pgmNo[i] != null)
					model.setPgmNo(pgmNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getComUsrPgmMtchVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ComUsrPgmMtchVO[]
	 */
	public ComUsrPgmMtchVO[] getComUsrPgmMtchVOs(){
		ComUsrPgmMtchVO[] vos = (ComUsrPgmMtchVO[])models.toArray(new ComUsrPgmMtchVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
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
			return null;
		}
		return ret.toString();
	}
	
	/**
	 * 필드에 있는 값을 스트링 배열로 반환.
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = null;
		}
		return arr;
	}

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.userFlg = this.userFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.roleFlg = this.roleFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrId = this.usrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.superFlg = this.superFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.checkbox = this.checkbox .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.addFlg = this.addFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNm = this.pgmNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNo = this.pgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
