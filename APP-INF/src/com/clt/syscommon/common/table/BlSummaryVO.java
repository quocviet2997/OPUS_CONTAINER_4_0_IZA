/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BlSummaryVO.java
*@FileTitle : BlSummaryVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.25
*@LastModifier : 손윤석
*@LastVersion : 1.0
* 2009.06.25 손윤석 
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
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 손윤석
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BlSummaryVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BlSummaryVO> models = new ArrayList<BlSummaryVO>();
	
	/* Column Info */
	private String svBlECnt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String transChkCnt = null;
	/* Column Info */
	private String svBlCCnt = null;
	/* Column Info */
	private String svBlSCnt = null;
	/* Column Info */
	private String svMeaQty = null;
	/* Column Info */
	private String svWgtQty = null;
	/* Column Info */
	private String svPkgQty = null;
	/* Column Info */
	private String svBlMCnt = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BlSummaryVO() {}

	public BlSummaryVO(String ibflag, String pagerows, String svBlMCnt, String svBlCCnt, String svBlECnt, String svPkgQty, String svWgtQty, String svMeaQty, String svBlSCnt, String transChkCnt) {
		this.svBlECnt = svBlECnt;
		this.ibflag = ibflag;
		this.transChkCnt = transChkCnt;
		this.svBlCCnt = svBlCCnt;
		this.svBlSCnt = svBlSCnt;
		this.svMeaQty = svMeaQty;
		this.svWgtQty = svWgtQty;
		this.svPkgQty = svPkgQty;
		this.svBlMCnt = svBlMCnt;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("sv_bl_e_cnt", getSvBlECnt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("trans_chk_cnt", getTransChkCnt());
		this.hashColumns.put("sv_bl_c_cnt", getSvBlCCnt());
		this.hashColumns.put("sv_bl_s_cnt", getSvBlSCnt());
		this.hashColumns.put("sv_mea_qty", getSvMeaQty());
		this.hashColumns.put("sv_wgt_qty", getSvWgtQty());
		this.hashColumns.put("sv_pkg_qty", getSvPkgQty());
		this.hashColumns.put("sv_bl_m_cnt", getSvBlMCnt());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("sv_bl_e_cnt", "svBlECnt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("trans_chk_cnt", "transChkCnt");
		this.hashFields.put("sv_bl_c_cnt", "svBlCCnt");
		this.hashFields.put("sv_bl_s_cnt", "svBlSCnt");
		this.hashFields.put("sv_mea_qty", "svMeaQty");
		this.hashFields.put("sv_wgt_qty", "svWgtQty");
		this.hashFields.put("sv_pkg_qty", "svPkgQty");
		this.hashFields.put("sv_bl_m_cnt", "svBlMCnt");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return svBlECnt
	 */
	public String getSvBlECnt() {
		return this.svBlECnt;
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
	 * @return transChkCnt
	 */
	public String getTransChkCnt() {
		return this.transChkCnt;
	}
	
	/**
	 * Column Info
	 * @return svBlCCnt
	 */
	public String getSvBlCCnt() {
		return this.svBlCCnt;
	}
	
	/**
	 * Column Info
	 * @return svBlSCnt
	 */
	public String getSvBlSCnt() {
		return this.svBlSCnt;
	}
	
	/**
	 * Column Info
	 * @return svMeaQty
	 */
	public String getSvMeaQty() {
		return this.svMeaQty;
	}
	
	/**
	 * Column Info
	 * @return svWgtQty
	 */
	public String getSvWgtQty() {
		return this.svWgtQty;
	}
	
	/**
	 * Column Info
	 * @return svPkgQty
	 */
	public String getSvPkgQty() {
		return this.svPkgQty;
	}
	
	/**
	 * Column Info
	 * @return svBlMCnt
	 */
	public String getSvBlMCnt() {
		return this.svBlMCnt;
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
	 * @param svBlECnt
	 */
	public void setSvBlECnt(String svBlECnt) {
		this.svBlECnt = svBlECnt;
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
	 * @param transChkCnt
	 */
	public void setTransChkCnt(String transChkCnt) {
		this.transChkCnt = transChkCnt;
	}
	
	/**
	 * Column Info
	 * @param svBlCCnt
	 */
	public void setSvBlCCnt(String svBlCCnt) {
		this.svBlCCnt = svBlCCnt;
	}
	
	/**
	 * Column Info
	 * @param svBlSCnt
	 */
	public void setSvBlSCnt(String svBlSCnt) {
		this.svBlSCnt = svBlSCnt;
	}
	
	/**
	 * Column Info
	 * @param svMeaQty
	 */
	public void setSvMeaQty(String svMeaQty) {
		this.svMeaQty = svMeaQty;
	}
	
	/**
	 * Column Info
	 * @param svWgtQty
	 */
	public void setSvWgtQty(String svWgtQty) {
		this.svWgtQty = svWgtQty;
	}
	
	/**
	 * Column Info
	 * @param svPkgQty
	 */
	public void setSvPkgQty(String svPkgQty) {
		this.svPkgQty = svPkgQty;
	}
	
	/**
	 * Column Info
	 * @param svBlMCnt
	 */
	public void setSvBlMCnt(String svBlMCnt) {
		this.svBlMCnt = svBlMCnt;
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
		setSvBlECnt(JSPUtil.getParameter(request, "sv_bl_e_cnt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setTransChkCnt(JSPUtil.getParameter(request, "trans_chk_cnt", ""));
		setSvBlCCnt(JSPUtil.getParameter(request, "sv_bl_c_cnt", ""));
		setSvBlSCnt(JSPUtil.getParameter(request, "sv_bl_s_cnt", ""));
		setSvMeaQty(JSPUtil.getParameter(request, "sv_mea_qty", ""));
		setSvWgtQty(JSPUtil.getParameter(request, "sv_wgt_qty", ""));
		setSvPkgQty(JSPUtil.getParameter(request, "sv_pkg_qty", ""));
		setSvBlMCnt(JSPUtil.getParameter(request, "sv_bl_m_cnt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BlSummaryVO[]
	 */
	public BlSummaryVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BlSummaryVO[]
	 */
	public BlSummaryVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BlSummaryVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] svBlECnt = (JSPUtil.getParameter(request, prefix	+ "sv_bl_e_cnt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] transChkCnt = (JSPUtil.getParameter(request, prefix	+ "trans_chk_cnt", length));
			String[] svBlCCnt = (JSPUtil.getParameter(request, prefix	+ "sv_bl_c_cnt", length));
			String[] svBlSCnt = (JSPUtil.getParameter(request, prefix	+ "sv_bl_s_cnt", length));
			String[] svMeaQty = (JSPUtil.getParameter(request, prefix	+ "sv_mea_qty", length));
			String[] svWgtQty = (JSPUtil.getParameter(request, prefix	+ "sv_wgt_qty", length));
			String[] svPkgQty = (JSPUtil.getParameter(request, prefix	+ "sv_pkg_qty", length));
			String[] svBlMCnt = (JSPUtil.getParameter(request, prefix	+ "sv_bl_m_cnt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new BlSummaryVO();
				if (svBlECnt[i] != null)
					model.setSvBlECnt(svBlECnt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (transChkCnt[i] != null)
					model.setTransChkCnt(transChkCnt[i]);
				if (svBlCCnt[i] != null)
					model.setSvBlCCnt(svBlCCnt[i]);
				if (svBlSCnt[i] != null)
					model.setSvBlSCnt(svBlSCnt[i]);
				if (svMeaQty[i] != null)
					model.setSvMeaQty(svMeaQty[i]);
				if (svWgtQty[i] != null)
					model.setSvWgtQty(svWgtQty[i]);
				if (svPkgQty[i] != null)
					model.setSvPkgQty(svPkgQty[i]);
				if (svBlMCnt[i] != null)
					model.setSvBlMCnt(svBlMCnt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBlSummaryVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BlSummaryVO[]
	 */
	public BlSummaryVO[] getBlSummaryVOs(){
		BlSummaryVO[] vos = (BlSummaryVO[])models.toArray(new BlSummaryVO[models.size()]);
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
		this.svBlECnt = this.svBlECnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.transChkCnt = this.transChkCnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svBlCCnt = this.svBlCCnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svBlSCnt = this.svBlSCnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svMeaQty = this.svMeaQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svWgtQty = this.svWgtQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svPkgQty = this.svPkgQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svBlMCnt = this.svBlMCnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
