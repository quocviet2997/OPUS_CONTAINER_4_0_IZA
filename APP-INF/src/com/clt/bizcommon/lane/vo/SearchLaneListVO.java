/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SearchLaneListVO.java
*@FileTitle : SearchLaneListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.25
*@LastModifier : 
*@LastVersion : 1.0
* 2009.05.25  
* 1.0 Creation
=========================================================*/

package com.clt.bizcommon.lane.vo;

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

public class SearchLaneListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchLaneListVO> models = new ArrayList<SearchLaneListVO>();
	
	/* Column Info */
	private String col5 = null;
	/* Column Info */
	private String col4 = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String col1 = null;
	/* Column Info */
	private String col3 = null;
	/* Column Info */
	private String col2 = null;
	/* Page Number */
	private String pagerows = null;
	
	/*
	 * 20120210 added by JUN SUNG, KIM
	 * mdm yn 추가 관련 param
	 */
	private String mdmYN = null;
	private String deltFlg = null;
	

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchLaneListVO() {}

	public SearchLaneListVO(String ibflag, String pagerows, String col1, String col2, String col3, String col4, String col5) {
		this.col5 = col5;
		this.col4 = col4;
		this.ibflag = ibflag;
		this.col1 = col1;
		this.col3 = col3;
		this.col2 = col2;
		this.pagerows = pagerows;
	}
	
	public SearchLaneListVO(String ibflag, String pagerows, String col1, String col2, String col3, String col4, String col5, String mdmYN, String deltFlg) {
		this.col5 = col5;
		this.col4 = col4;
		this.ibflag = ibflag;
		this.col1 = col1;
		this.col3 = col3;
		this.col2 = col2;
		this.mdmYN = mdmYN;
		this.deltFlg = deltFlg;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("col5", getCol5());
		this.hashColumns.put("col4", getCol4());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("col1", getCol1());
		this.hashColumns.put("col3", getCol3());
		this.hashColumns.put("col2", getCol2());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("col5", "col5");
		this.hashFields.put("col4", "col4");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("col1", "col1");
		this.hashFields.put("col3", "col3");
		this.hashFields.put("col2", "col2");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return col5
	 */
	public String getCol5() {
		return this.col5;
	}
	
	/**
	 * Column Info
	 * @return col4
	 */
	public String getCol4() {
		return this.col4;
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
	 * @return col1
	 */
	public String getCol1() {
		return this.col1;
	}
	
	/**
	 * Column Info
	 * @return col3
	 */
	public String getCol3() {
		return this.col3;
	}
	
	/**
	 * Column Info
	 * @return col2
	 */
	public String getCol2() {
		return this.col2;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}
	
	

	public String getMdmYN() {
		return mdmYN;
	}

	public String getDeltFlg() {
		return deltFlg;
	}
	
	public void setMdmYN(String mdmYN) {
		this.mdmYN = mdmYN;
	}

	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}

	/**
	 * Column Info
	 * @param col5
	 */
	public void setCol5(String col5) {
		this.col5 = col5;
	}
	
	/**
	 * Column Info
	 * @param col4
	 */
	public void setCol4(String col4) {
		this.col4 = col4;
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
	 * @param col1
	 */
	public void setCol1(String col1) {
		this.col1 = col1;
	}
	
	/**
	 * Column Info
	 * @param col3
	 */
	public void setCol3(String col3) {
		this.col3 = col3;
	}
	
	/**
	 * Column Info
	 * @param col2
	 */
	public void setCol2(String col2) {
		this.col2 = col2;
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
		setCol5(JSPUtil.getParameter(request, "col5", ""));
		setCol4(JSPUtil.getParameter(request, "col4", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCol1(JSPUtil.getParameter(request, "col1", ""));
		setCol3(JSPUtil.getParameter(request, "col3", ""));
		setCol2(JSPUtil.getParameter(request, "col2", ""));
		setMdmYN(JSPUtil.getParameter(request, "mdm_yn", ""));
		if("Y".equals(this.mdmYN)){
			setDeltFlg(JSPUtil.getParameter(request, "delt_flg", "N"));
		}else{
			setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		}
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SearchLaneListVO[]
	 */
	public SearchLaneListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchLaneListVO[]
	 */
	public SearchLaneListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchLaneListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] col5 = (JSPUtil.getParameter(request, prefix	+ "col5".trim(), length));
			String[] col4 = (JSPUtil.getParameter(request, prefix	+ "col4".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] col1 = (JSPUtil.getParameter(request, prefix	+ "col1".trim(), length));
			String[] col3 = (JSPUtil.getParameter(request, prefix	+ "col3".trim(), length));
			String[] col2 = (JSPUtil.getParameter(request, prefix	+ "col2".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchLaneListVO();
				if (col5[i] != null)
					model.setCol5(col5[i]);
				if (col4[i] != null)
					model.setCol4(col4[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (col1[i] != null)
					model.setCol1(col1[i]);
				if (col3[i] != null)
					model.setCol3(col3[i]);
				if (col2[i] != null)
					model.setCol2(col2[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchLaneListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchLaneListVO[]
	 */
	public SearchLaneListVO[] getSearchLaneListVOs(){
		SearchLaneListVO[] vos = (SearchLaneListVO[])models.toArray(new SearchLaneListVO[models.size()]);
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
		this.col5 = this.col5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.col4 = this.col4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.col1 = this.col1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.col3 = this.col3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.col2 = this.col2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
