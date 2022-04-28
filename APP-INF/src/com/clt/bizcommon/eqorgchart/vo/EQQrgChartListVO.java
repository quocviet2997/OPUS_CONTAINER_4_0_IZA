/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : EQQrgChartListVO.java
*@FileTitle : EQQrgChartListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.07
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2010.07.07 함대성 
* 1.0 Creation
=========================================================*/

package com.clt.bizcommon.eqorgchart.vo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 함대성
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EQQrgChartListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EQQrgChartListVO> models = new ArrayList<EQQrgChartListVO>();
	
	/* Column Info */
	private String unit = null;
	/* Column Info */
	private String locCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String level = null;
	/* Column Info */
	private String locDpthCd = null;
	/* Column Info */
	private String prntLocId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EQQrgChartListVO() {}

	public EQQrgChartListVO(String ibflag, String pagerows, String level, String unit, String locCd, String prntLocId, String locDpthCd) {
		this.unit = unit;
		this.locCd = locCd;
		this.ibflag = ibflag;
		this.level = level;
		this.locDpthCd = locDpthCd;
		this.prntLocId = prntLocId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("unit", getUnit());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("level", getLevel());
		this.hashColumns.put("loc_dpth_cd", getLocDpthCd());
		this.hashColumns.put("prnt_loc_id", getPrntLocId());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("unit", "unit");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("level", "level");
		this.hashFields.put("loc_dpth_cd", "locDpthCd");
		this.hashFields.put("prnt_loc_id", "prntLocId");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return unit
	 */
	public String getUnit() {
		return this.unit;
	}
	
	/**
	 * Column Info
	 * @return locCd
	 */
	public String getLocCd() {
		return this.locCd;
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
	 * @return level
	 */
	public String getLevel() {
		return this.level;
	}
	
	/**
	 * Column Info
	 * @return locDpthCd
	 */
	public String getLocDpthCd() {
		return this.locDpthCd;
	}
	
	/**
	 * Column Info
	 * @return prntLocId
	 */
	public String getPrntLocId() {
		return this.prntLocId;
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
	 * @param unit
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	/**
	 * Column Info
	 * @param locCd
	 */
	public void setLocCd(String locCd) {
		this.locCd = locCd;
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
	 * @param level
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	
	/**
	 * Column Info
	 * @param locDpthCd
	 */
	public void setLocDpthCd(String locDpthCd) {
		this.locDpthCd = locDpthCd;
	}
	
	/**
	 * Column Info
	 * @param prntLocId
	 */
	public void setPrntLocId(String prntLocId) {
		this.prntLocId = prntLocId;
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
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setUnit(JSPUtil.getParameter(request, prefix + "unit", ""));
		setLocCd(JSPUtil.getParameter(request, prefix + "loc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setLevel(JSPUtil.getParameter(request, prefix + "level", ""));
		setLocDpthCd(JSPUtil.getParameter(request, prefix + "loc_dpth_cd", ""));
		setPrntLocId(JSPUtil.getParameter(request, prefix + "prnt_loc_id", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EQQrgChartListVO[]
	 */
	public EQQrgChartListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EQQrgChartListVO[]
	 */
	public EQQrgChartListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EQQrgChartListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] unit = (JSPUtil.getParameter(request, prefix	+ "unit", length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] level = (JSPUtil.getParameter(request, prefix	+ "level", length));
			String[] locDpthCd = (JSPUtil.getParameter(request, prefix	+ "loc_dpth_cd", length));
			String[] prntLocId = (JSPUtil.getParameter(request, prefix	+ "prnt_loc_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new EQQrgChartListVO();
				if (unit[i] != null)
					model.setUnit(unit[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (level[i] != null)
					model.setLevel(level[i]);
				if (locDpthCd[i] != null)
					model.setLocDpthCd(locDpthCd[i]);
				if (prntLocId[i] != null)
					model.setPrntLocId(prntLocId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEQQrgChartListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EQQrgChartListVO[]
	 */
	public EQQrgChartListVO[] getEQQrgChartListVOs(){
		EQQrgChartListVO[] vos = (EQQrgChartListVO[])models.toArray(new EQQrgChartListVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		   return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
	   }

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.unit = this.unit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.level = this.level .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locDpthCd = this.locDpthCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prntLocId = this.prntLocId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
