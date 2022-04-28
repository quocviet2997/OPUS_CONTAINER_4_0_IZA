/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SearchUserMappingUsersVO.java
*@FileTitle : SearchUserMappingUsersVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.20
*@LastModifier : 이승열
*@LastVersion : 1.0
* 2009.02.20 이승열 
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
 * SearchUserMappingUsersVO Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author SEUNGYOL LEE
 * @see
 * @since J2EE 1.4
 */
public class SearchUserMappingUsersVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	protected transient org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(this.getClass().getName());
	
	private Collection<SearchUserMappingUsersVO> models = new ArrayList<SearchUserMappingUsersVO>();
	
	/* 상태 */
	private String ibflag = null;
	/* 컬럼 설명 */
	private String usrNm = null;
	/* 컬럼 설명 */
	private String usrId = null;
	/* 컬럼 설명 */
	private String checkVal = null;
	/* 컬럼 설명 */
	private String usrLoclNm = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchUserMappingUsersVO() {}

	/**
	 * SearchUserMappingUsersVO 생성자.
	 * 
	 */
	public SearchUserMappingUsersVO(String ibflag, String pagerows, String checkVal, String usrId, String usrNm, String usrLoclNm) {
		this.ibflag = ibflag;
		this.usrNm = usrNm;
		this.usrId = usrId;
		this.checkVal = checkVal;
		this.usrLoclNm = usrLoclNm;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("usr_nm", getUsrNm());
		this.hashColumns.put("usr_id", getUsrId());
		this.hashColumns.put("check_val", getCheckVal());
		this.hashColumns.put("usr_locl_nm", getUsrLoclNm());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("usr_nm", "usrNm");
		this.hashFields.put("usr_id", "usrId");
		this.hashFields.put("check_val", "checkVal");
		this.hashFields.put("usr_locl_nm", "usrLoclNm");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getIbflag() {
		return this.ibflag;
	}
	public String getUsrNm() {
		return this.usrNm;
	}
	public String getUsrId() {
		return this.usrId;
	}
	public String getCheckVal() {
		return this.checkVal;
	}
	public String getUsrLoclNm() {
		return this.usrLoclNm;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setUsrNm(String usrNm) {
		this.usrNm = usrNm;
		//this.usrNm=true;
	}
	public void setUsrId(String usrId) {
		this.usrId = usrId;
		//this.usrId=true;
	}
	public void setCheckVal(String checkVal) {
		this.checkVal = checkVal;
		//this.checkVal=true;
	}
	public void setUsrLoclNm(String usrLoclNm) {
		this.usrLoclNm = usrLoclNm;
		//this.usrLoclNm=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}

	/**
	 * HttpServletRequest에서 SearchUserMappingUsersVO 객체를 생성한다.<br>
	 * 
	 * @param request HttpServletRequest
	 * @return 
	 * @exception 
	 */	
	public void fromRequest(HttpServletRequest request) {
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setUsrNm(JSPUtil.getParameter(request, "usr_nm", ""));
		setUsrId(JSPUtil.getParameter(request, "usr_id", ""));
		setCheckVal(JSPUtil.getParameter(request, "check_val", ""));
		setUsrLoclNm(JSPUtil.getParameter(request, "usr_locl_nm", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * HttpServletRequest에서 SearchUserMappingUsersVO 객체를 생성한다.<br>
	 * 
	 * @param request HttpServletRequest
	 * @return SearchUserMappingUsersVO[]
	 * @exception 
	 */	
	public SearchUserMappingUsersVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * HttpServletRequest에서 SearchUserMappingUsersVO 객체를 생성한다.<br>
	 * 
	 * @param request HttpServletRequest
	 * @param prefix	String
	 * @return SearchUserMappingUsersVO[]
	 * @exception 
	 */	
	public SearchUserMappingUsersVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchUserMappingUsersVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] usrNm = (JSPUtil.getParameter(request, prefix	+ "usr_nm".trim(), length));
			String[] usrId = (JSPUtil.getParameter(request, prefix	+ "usr_id".trim(), length));
			String[] checkVal = (JSPUtil.getParameter(request, prefix	+ "check_val".trim(), length));
			String[] usrLoclNm = (JSPUtil.getParameter(request, prefix	+ "usr_locl_nm".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchUserMappingUsersVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (usrNm[i] != null)
					model.setUsrNm(usrNm[i]);
				if (usrId[i] != null)
					model.setUsrId(usrId[i]);
				if (checkVal[i] != null)
					model.setCheckVal(checkVal[i]);
				if (usrLoclNm[i] != null)
					model.setUsrLoclNm(usrLoclNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			log.error(e.getMessage(),e);
		}
		return getSearchUserMappingUsersVOs();
	}

	public SearchUserMappingUsersVO[] getSearchUserMappingUsersVOs(){
		SearchUserMappingUsersVO[] vos = (SearchUserMappingUsersVO[])models.toArray(new SearchUserMappingUsersVO[models.size()]);
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
			log.error(ex.getMessage(),ex);
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
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrNm = this.usrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrId = this.usrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.checkVal = this.checkVal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrLoclNm = this.usrLoclNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
