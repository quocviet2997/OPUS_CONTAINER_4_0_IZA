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

package com.clt.syscommon.management.opus.officeprogram.vo;

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
 * @author Jung_InSun
 * @see 
 * @since J2EE 1.4
 */
public class SearchComOfcPgmMtchVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchComOfcPgmMtchVO> models = new ArrayList<SearchComOfcPgmMtchVO>();
	
	
	private String locCd      	= null;
	private String ofcKndCd  = null;
	private String prntOfcCd = null;
	private String ofcCd        = null;
	private String ofcNm       = null;

	private int iPage           	= 1;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchComOfcPgmMtchVO() {}

	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("ofc_knd_cd", getOfcKndCd());
		this.hashColumns.put("prnt_ofc_cd", getPrntOfcCd());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("ofc_nm", getOfcNm());
		
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("ofc_knd_cd", "ofcKndCd");
		this.hashFields.put("prnt_ofc_cd", "prntOfcCd");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("ofc_nm", "ofcNm");
		return this.hashFields;
	}
	
    /**
     * HttpServletRequest에서 OfficeProgramListVO 객체를 생성한다. <br>
     * 
     * @param request HttpServletRequest
     * @return   
     * @throws 
     */
	public void fromRequest(HttpServletRequest request) {
		setLocCd(JSPUtil.getParameter(request, "loc_cd", ""));
		setOfcKndCd(JSPUtil.getParameter(request, "ofc_knd_cd", ""));
		setPrntOfcCd(JSPUtil.getParameter(request, "prnt_ofc_cd", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setOfcNm(JSPUtil.getParameter(request, "ofc_nm", ""));
		setIPage( JSPUtil.getParameterAsInt(request, "iPage", 1));
	}

	public SearchComOfcPgmMtchVO[] getsearchComUsrRoleVOs(){
		SearchComOfcPgmMtchVO[] vos = (SearchComOfcPgmMtchVO[])models.toArray(new SearchComOfcPgmMtchVO[models.size()]);
		return vos;
	}

    /**
     * SearchComOfcPgmMtchVO 객체를 String으로 변경하여 return한다. <br>
     * 
     * @return String   
     * @throws 
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
	
	public void setLocCd(String locCd) {
		this.locCd = locCd;
	}

	public String getLocCd() {
		return locCd;
	}

	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
	}

	public String getOfcCd() {
		return ofcCd;
	}

	public void setPrntOfcCd(String prntOfcCd) {
		this.prntOfcCd = prntOfcCd;
	}

	public String getPrntOfcCd() {
		return prntOfcCd;
	}

	public void setOfcKndCd(String ofcKndCd) {
		this.ofcKndCd = ofcKndCd;
	}

	public String getOfcKndCd() {
		return ofcKndCd;
	}

	public void setOfcNm(String ofcNm) {
		this.ofcNm = ofcNm;
	}

	public String getOfcNm() {
		return ofcNm;
	}

	public void setIPage(int iPage) {
		this.iPage = iPage;
	}

	public int getIPage() {
		return iPage;
	}
}
