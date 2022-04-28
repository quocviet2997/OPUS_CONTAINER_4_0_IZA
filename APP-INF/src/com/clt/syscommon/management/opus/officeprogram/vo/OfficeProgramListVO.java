/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : OfficeProgramListVOVO.java
*@FileTitle : OfficeProgramListVOVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.08
*@LastModifier : 이승열
*@LastVersion : 1.0
* 2009.04.08 이승열 
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
 * @author 이승열
 * @see
 * @since J2EE 1.5
 */
public class OfficeProgramListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<OfficeProgramListVO> models = new ArrayList<OfficeProgramListVO>();
	
	private String ibflag = null;
	private String locCd = null;
	private String ofcEngNm = null;
	private String ofcCd = null;
	private String pgmAssign = null;
	private String ofcKndCd = null;
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	/**
	 * OfficeProgramListVO 생성자 
	 */
	public OfficeProgramListVO() {}

    /**
     * OfficeProgramListVO 생성자 <br>
     * 
     * @param 
     * @return   
     * @throws 
     */
	public OfficeProgramListVO(String ibflag, String pagerows, String ofcCd, String ofcEngNm, String ofcKndCd, String locCd, String pgmAssign) {
		this.ibflag = ibflag;
		this.locCd = locCd;
		this.ofcEngNm = ofcEngNm;
		this.ofcCd = ofcCd;
		this.pgmAssign = pgmAssign;
		this.ofcKndCd = ofcKndCd;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("ofc_eng_nm", getOfcEngNm());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("pgm_assign", getPgmAssign());
		this.hashColumns.put("ofc_knd_cd", getOfcKndCd());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("ofc_eng_nm", "ofcEngNm");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("pgm_assign", "pgmAssign");
		this.hashFields.put("ofc_knd_cd", "ofcKndCd");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getIbflag() {
		return this.ibflag;
	}
	public String getLocCd() {
		return this.locCd;
	}
	public String getOfcEngNm() {
		return this.ofcEngNm;
	}
	public String getOfcCd() {
		return this.ofcCd;
	}
	public String getPgmAssign() {
		return this.pgmAssign;
	}
	public String getOfcKndCd() {
		return this.ofcKndCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setLocCd(String locCd) {
		this.locCd = locCd;
		//this.locCd=true;
	}
	public void setOfcEngNm(String ofcEngNm) {
		this.ofcEngNm = ofcEngNm;
		//this.ofcEngNm=true;
	}
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
		//this.ofcCd=true;
	}
	public void setPgmAssign(String pgmAssign) {
		this.pgmAssign = pgmAssign;
		//this.pgmAssign=true;
	}
	public void setOfcKndCd(String ofcKndCd) {
		this.ofcKndCd = ofcKndCd;
		//this.ofcKndCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	
    /**
     * HttpServletRequest에서 OfficeProgramListVO 객체를 생성한다. <br>
     * 
     * @param request HttpServletRequest 
     * @return   
     * @throws 
     */
	public void fromRequest(HttpServletRequest request) {
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setLocCd(JSPUtil.getParameter(request, "loc_cd", ""));
		setOfcEngNm(JSPUtil.getParameter(request, "ofc_eng_nm", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setPgmAssign(JSPUtil.getParameter(request, "pgm_assign", ""));
		setOfcKndCd(JSPUtil.getParameter(request, "ofc_knd_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

    /**
     * HttpServletRequest에서 OfficeProgramListVO 객체배열을 생성한다. <br>
     * 
     * @param request HttpServletRequest 
     * @return   
     * @throws 
     */
	public OfficeProgramListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

    /**
     * HttpServletRequest에서 OfficeProgramListVO 객체배열을 생성한다. <br>
     * 
     * @param request HttpServletRequest
     * @param prefix	String  
     * @return   
     * @throws 
     */
	public OfficeProgramListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		OfficeProgramListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd".trim(), length));
			String[] ofcEngNm = (JSPUtil.getParameter(request, prefix	+ "ofc_eng_nm".trim(), length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd".trim(), length));
			String[] pgmAssign = (JSPUtil.getParameter(request, prefix	+ "pgm_assign".trim(), length));
			String[] ofcKndCd = (JSPUtil.getParameter(request, prefix	+ "ofc_knd_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new OfficeProgramListVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (ofcEngNm[i] != null)
					model.setOfcEngNm(ofcEngNm[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (pgmAssign[i] != null)
					model.setPgmAssign(pgmAssign[i]);
				if (ofcKndCd[i] != null)
					model.setOfcKndCd(ofcKndCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			;
		}
		return getOfficeProgramListVOVOs();
	}

	public OfficeProgramListVO[] getOfficeProgramListVOVOs(){
		OfficeProgramListVO[] vos = (OfficeProgramListVO[])models.toArray(new OfficeProgramListVO[models.size()]);
		return vos;
	}
	
    /**
     * OfficeProgramListVO 객체를 String으로 변경하여 return한다. <br>
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
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcEngNm = this.ofcEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmAssign = this.pgmAssign .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcKndCd = this.ofcKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
