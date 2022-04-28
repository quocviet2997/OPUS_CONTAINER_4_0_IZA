/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : SearchLeasingCompanyYardListVO.java
*@FileTitle : SearchLeasingCompanyYardListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.17
*@LastModifier : 
*@LastVersion : 1.0
* 2012.02.17  
* 1.0 Creation
=========================================================*/

package com.clt.bizcommon.leasingcompanyyard.vo;

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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SearchLeasingCompanyYardListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchLeasingCompanyYardListVO> models = new ArrayList<SearchLeasingCompanyYardListVO>();
	
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String lseCoYdCd = null;
	/* Column Info */
	private String lseCoYdNm = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchLeasingCompanyYardListVO() {}

	public SearchLeasingCompanyYardListVO(String ibflag, String pagerows, String lseCoYdCd, String lseCoYdNm, String deltFlg) {
		this.ibflag = ibflag;
		this.deltFlg = deltFlg;
		this.lseCoYdCd = lseCoYdCd;
		this.lseCoYdNm = lseCoYdNm;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("lse_co_yd_cd", getLseCoYdCd());
		this.hashColumns.put("lse_co_yd_nm", getLseCoYdNm());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("lse_co_yd_cd", "lseCoYdCd");
		this.hashFields.put("lse_co_yd_nm", "lseCoYdNm");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
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
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}
	
	/**
	 * Column Info
	 * @return lseCoYdCd
	 */
	public String getLseCoYdCd() {
		return this.lseCoYdCd;
	}
	
	/**
	 * Column Info
	 * @return lseCoYdNm
	 */
	public String getLseCoYdNm() {
		return this.lseCoYdNm;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
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
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}
	
	/**
	 * Column Info
	 * @param lseCoYdCd
	 */
	public void setLseCoYdCd(String lseCoYdCd) {
		this.lseCoYdCd = lseCoYdCd;
	}
	
	/**
	 * Column Info
	 * @param lseCoYdNm
	 */
	public void setLseCoYdNm(String lseCoYdNm) {
		this.lseCoYdNm = lseCoYdNm;
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
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setLseCoYdCd(JSPUtil.getParameter(request, prefix + "lse_co_yd_cd", ""));
		setLseCoYdNm(JSPUtil.getParameter(request, prefix + "lse_co_yd_nm", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SearchLeasingCompanyYardListVO[]
	 */
	public SearchLeasingCompanyYardListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchLeasingCompanyYardListVO[]
	 */
	public SearchLeasingCompanyYardListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchLeasingCompanyYardListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] lseCoYdCd = (JSPUtil.getParameter(request, prefix	+ "lse_co_yd_cd", length));
			String[] lseCoYdNm = (JSPUtil.getParameter(request, prefix	+ "lse_co_yd_nm", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchLeasingCompanyYardListVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (lseCoYdCd[i] != null)
					model.setLseCoYdCd(lseCoYdCd[i]);
				if (lseCoYdNm[i] != null)
					model.setLseCoYdNm(lseCoYdNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchLeasingCompanyYardListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchLeasingCompanyYardListVO[]
	 */
	public SearchLeasingCompanyYardListVO[] getSearchLeasingCompanyYardListVOs(){
		SearchLeasingCompanyYardListVO[] vos = (SearchLeasingCompanyYardListVO[])models.toArray(new SearchLeasingCompanyYardListVO[models.size()]);
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
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoYdCd = this.lseCoYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoYdNm = this.lseCoYdNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
