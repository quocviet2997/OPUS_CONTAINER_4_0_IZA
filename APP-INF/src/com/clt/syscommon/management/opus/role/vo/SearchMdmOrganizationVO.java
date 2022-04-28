/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SearchMdmOrganizationVOVO.java
*@FileTitle : SearchMdmOrganizationVOVO
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
 * SearchMdmOrganizationVO Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author SEUNGYOL LEE
 * @see
 * @since J2EE 1.4
 */
public class SearchMdmOrganizationVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchMdmOrganizationVO> models = new ArrayList<SearchMdmOrganizationVO>();
	
	/* 컬럼 설명 */
	private String level = null;
	/* 상태 */
	private String ibflag = null;
	/* 컬럼 설명 */
	private String ofcKrnNm = null;
	/* 컬럼 설명 */
	private String ofcEngNm = null;
	/* 컬럼 설명 */
	private String ofcCd = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchMdmOrganizationVO() {}
	
	/**
	 * SearchMdmOrganizationVO Creator<br>
	 * 
	 * @param ibflag	 		String
	 * @param pagerows	 	String
	 * @param level	 			String
	 * @param ofcCd	 		String
	 * @param ofcEngNm	 	String
	 * @param ofcKrnNm	 	String
	 * @return 
	 * @exception 
	 */	
	public SearchMdmOrganizationVO(String ibflag, String pagerows, String level, String ofcCd, String ofcEngNm, String ofcKrnNm) {
		this.level = level;
		this.ibflag = ibflag;
		this.ofcKrnNm = ofcKrnNm;
		this.ofcEngNm = ofcEngNm;
		this.ofcCd = ofcCd;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("level", getLevel());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ofc_krn_nm", getOfcKrnNm());
		this.hashColumns.put("ofc_eng_nm", getOfcEngNm());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("level", "level");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ofc_krn_nm", "ofcKrnNm");
		this.hashFields.put("ofc_eng_nm", "ofcEngNm");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getLevel() {
		return this.level;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getOfcKrnNm() {
		return this.ofcKrnNm;
	}
	public String getOfcEngNm() {
		return this.ofcEngNm;
	}
	public String getOfcCd() {
		return this.ofcCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setLevel(String level) {
		this.level = level;
		//this.level=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setOfcKrnNm(String ofcKrnNm) {
		this.ofcKrnNm = ofcKrnNm;
		//this.ofcKrnNm=true;
	}
	public void setOfcEngNm(String ofcEngNm) {
		this.ofcEngNm = ofcEngNm;
		//this.ofcEngNm=true;
	}
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
		//this.ofcCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}

	/**
	 * HttpServletRequest에서 SearchMdmOrganizationVO 배열 객체를 생성한다.<br>
	 * 
	 * @param request HttpServletRequest
	 * @return 
	 * @exception 
	 */	
	public void fromRequest(HttpServletRequest request) {
		setLevel(JSPUtil.getParameter(request, "level", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setOfcKrnNm(JSPUtil.getParameter(request, "ofc_krn_nm", ""));
		setOfcEngNm(JSPUtil.getParameter(request, "ofc_eng_nm", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * HttpServletRequest에서 SearchMdmOrganizationVO 배열 객체를 생성한다.<br>
	 * 
	 * @param request HttpServletRequest
	 * @return SearchMdmOrganizationVO[]
	 * @exception 
	 */	
	public SearchMdmOrganizationVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * HttpServletRequest에서 SearchMdmOrganizationVO 배열 객체를 생성한다.<br>
	 * 
	 * @param request HttpServletRequest
	 * @param prefix 	String
	 * @return SearchMdmOrganizationVO[]
	 * @exception 
	 */	
	public SearchMdmOrganizationVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchMdmOrganizationVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] level = (JSPUtil.getParameter(request, prefix	+ "level".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] ofcKrnNm = (JSPUtil.getParameter(request, prefix	+ "ofc_krn_nm".trim(), length));
			String[] ofcEngNm = (JSPUtil.getParameter(request, prefix	+ "ofc_eng_nm".trim(), length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchMdmOrganizationVO();
				if (level[i] != null)
					model.setLevel(level[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ofcKrnNm[i] != null)
					model.setOfcKrnNm(ofcKrnNm[i]);
				if (ofcEngNm[i] != null)
					model.setOfcEngNm(ofcEngNm[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			;
		}
		return getSearchMdmOrganizationVOVOs();
	}

	public SearchMdmOrganizationVO[] getSearchMdmOrganizationVOVOs(){
		SearchMdmOrganizationVO[] vos = (SearchMdmOrganizationVO[])models.toArray(new SearchMdmOrganizationVO[models.size()]);
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
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcKrnNm = this.ofcKrnNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcEngNm = this.ofcEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
