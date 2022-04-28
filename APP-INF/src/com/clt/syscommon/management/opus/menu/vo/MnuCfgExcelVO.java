/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MnuCfgExcelVO.java
*@FileTitle : MnuCfgExcelVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.12.04
*@LastModifier : 
*@LastVersion : 1.0
* 2009.12.04  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.management.opus.menu.vo;

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

public class MnuCfgExcelVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MnuCfgExcelVO> models = new ArrayList<MnuCfgExcelVO>();
	
	/* Column Info */
	private String pgmUrl = null;
	/* Column Info */
	private String lvl1 = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String lvl6 = null;
	/* Column Info */
	private String pgmDesc = null;
	/* Column Info */
	private String lvl2 = null;
	/* Column Info */
	private String lvl3 = null;
	/* Column Info */
	private String pgmNo = null;
	/* Column Info */
	private String lvl4 = null;
	/* Column Info */
	private String lvl5 = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MnuCfgExcelVO() {}

	public MnuCfgExcelVO(String ibflag, String pagerows, String lvl1, String lvl2, String lvl3, String lvl4, String lvl5, String lvl6, String pgmNo, String pgmDesc, String pgmUrl) {
		this.pgmUrl = pgmUrl;
		this.lvl1 = lvl1;
		this.ibflag = ibflag;
		this.lvl6 = lvl6;
		this.pgmDesc = pgmDesc;
		this.lvl2 = lvl2;
		this.lvl3 = lvl3;
		this.pgmNo = pgmNo;
		this.lvl4 = lvl4;
		this.lvl5 = lvl5;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pgm_url", getPgmUrl());
		this.hashColumns.put("lvl1", getLvl1());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("lvl6", getLvl6());
		this.hashColumns.put("pgm_desc", getPgmDesc());
		this.hashColumns.put("lvl2", getLvl2());
		this.hashColumns.put("lvl3", getLvl3());
		this.hashColumns.put("pgm_no", getPgmNo());
		this.hashColumns.put("lvl4", getLvl4());
		this.hashColumns.put("lvl5", getLvl5());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pgm_url", "pgmUrl");
		this.hashFields.put("lvl1", "lvl1");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("lvl6", "lvl6");
		this.hashFields.put("pgm_desc", "pgmDesc");
		this.hashFields.put("lvl2", "lvl2");
		this.hashFields.put("lvl3", "lvl3");
		this.hashFields.put("pgm_no", "pgmNo");
		this.hashFields.put("lvl4", "lvl4");
		this.hashFields.put("lvl5", "lvl5");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return pgmUrl
	 */
	public String getPgmUrl() {
		return this.pgmUrl;
	}
	
	/**
	 * Column Info
	 * @return lvl1
	 */
	public String getLvl1() {
		return this.lvl1;
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
	 * @return lvl6
	 */
	public String getLvl6() {
		return this.lvl6;
	}
	
	/**
	 * Column Info
	 * @return pgmDesc
	 */
	public String getPgmDesc() {
		return this.pgmDesc;
	}
	
	/**
	 * Column Info
	 * @return lvl2
	 */
	public String getLvl2() {
		return this.lvl2;
	}
	
	/**
	 * Column Info
	 * @return lvl3
	 */
	public String getLvl3() {
		return this.lvl3;
	}
	
	/**
	 * Column Info
	 * @return pgmNo
	 */
	public String getPgmNo() {
		return this.pgmNo;
	}
	
	/**
	 * Column Info
	 * @return lvl4
	 */
	public String getLvl4() {
		return this.lvl4;
	}
	
	/**
	 * Column Info
	 * @return lvl5
	 */
	public String getLvl5() {
		return this.lvl5;
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
	 * @param pgmUrl
	 */
	public void setPgmUrl(String pgmUrl) {
		this.pgmUrl = pgmUrl;
	}
	
	/**
	 * Column Info
	 * @param lvl1
	 */
	public void setLvl1(String lvl1) {
		this.lvl1 = lvl1;
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
	 * @param lvl6
	 */
	public void setLvl6(String lvl6) {
		this.lvl6 = lvl6;
	}
	
	/**
	 * Column Info
	 * @param pgmDesc
	 */
	public void setPgmDesc(String pgmDesc) {
		this.pgmDesc = pgmDesc;
	}
	
	/**
	 * Column Info
	 * @param lvl2
	 */
	public void setLvl2(String lvl2) {
		this.lvl2 = lvl2;
	}
	
	/**
	 * Column Info
	 * @param lvl3
	 */
	public void setLvl3(String lvl3) {
		this.lvl3 = lvl3;
	}
	
	/**
	 * Column Info
	 * @param pgmNo
	 */
	public void setPgmNo(String pgmNo) {
		this.pgmNo = pgmNo;
	}
	
	/**
	 * Column Info
	 * @param lvl4
	 */
	public void setLvl4(String lvl4) {
		this.lvl4 = lvl4;
	}
	
	/**
	 * Column Info
	 * @param lvl5
	 */
	public void setLvl5(String lvl5) {
		this.lvl5 = lvl5;
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
		setPgmUrl(JSPUtil.getParameter(request, "pgm_url", ""));
		setLvl1(JSPUtil.getParameter(request, "lvl1", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setLvl6(JSPUtil.getParameter(request, "lvl6", ""));
		setPgmDesc(JSPUtil.getParameter(request, "pgm_desc", ""));
		setLvl2(JSPUtil.getParameter(request, "lvl2", ""));
		setLvl3(JSPUtil.getParameter(request, "lvl3", ""));
		setPgmNo(JSPUtil.getParameter(request, "pgm_no", ""));
		setLvl4(JSPUtil.getParameter(request, "lvl4", ""));
		setLvl5(JSPUtil.getParameter(request, "lvl5", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MnuCfgExcelVO[]
	 */
	public MnuCfgExcelVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MnuCfgExcelVO[]
	 */
	public MnuCfgExcelVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MnuCfgExcelVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] pgmUrl = (JSPUtil.getParameter(request, prefix	+ "pgm_url", length));
			String[] lvl1 = (JSPUtil.getParameter(request, prefix	+ "lvl1", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] lvl6 = (JSPUtil.getParameter(request, prefix	+ "lvl6", length));
			String[] pgmDesc = (JSPUtil.getParameter(request, prefix	+ "pgm_desc", length));
			String[] lvl2 = (JSPUtil.getParameter(request, prefix	+ "lvl2", length));
			String[] lvl3 = (JSPUtil.getParameter(request, prefix	+ "lvl3", length));
			String[] pgmNo = (JSPUtil.getParameter(request, prefix	+ "pgm_no", length));
			String[] lvl4 = (JSPUtil.getParameter(request, prefix	+ "lvl4", length));
			String[] lvl5 = (JSPUtil.getParameter(request, prefix	+ "lvl5", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new MnuCfgExcelVO();
				if (pgmUrl[i] != null)
					model.setPgmUrl(pgmUrl[i]);
				if (lvl1[i] != null)
					model.setLvl1(lvl1[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (lvl6[i] != null)
					model.setLvl6(lvl6[i]);
				if (pgmDesc[i] != null)
					model.setPgmDesc(pgmDesc[i]);
				if (lvl2[i] != null)
					model.setLvl2(lvl2[i]);
				if (lvl3[i] != null)
					model.setLvl3(lvl3[i]);
				if (pgmNo[i] != null)
					model.setPgmNo(pgmNo[i]);
				if (lvl4[i] != null)
					model.setLvl4(lvl4[i]);
				if (lvl5[i] != null)
					model.setLvl5(lvl5[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMnuCfgExcelVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MnuCfgExcelVO[]
	 */
	public MnuCfgExcelVO[] getMnuCfgExcelVOs(){
		MnuCfgExcelVO[] vos = (MnuCfgExcelVO[])models.toArray(new MnuCfgExcelVO[models.size()]);
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
		this.pgmUrl = this.pgmUrl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lvl1 = this.lvl1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lvl6 = this.lvl6 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmDesc = this.pgmDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lvl2 = this.lvl2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lvl3 = this.lvl3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNo = this.pgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lvl4 = this.lvl4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lvl5 = this.lvl5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
