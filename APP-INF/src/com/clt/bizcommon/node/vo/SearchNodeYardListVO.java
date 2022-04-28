/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : SearchNodeYardListVO.java
*@FileTitle : SearchNodeYardListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.05
*@LastModifier : 
*@LastVersion : 1.0
* 2010.07.05  
* 1.0 Creation
=========================================================*/

package com.clt.bizcommon.node.vo;

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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SearchNodeYardListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchNodeYardListVO> models = new ArrayList<SearchNodeYardListVO>();
	
	/* Column Info */
	private String ydCstmsNo = null;
	/* Column Info */
	private String ydFctyTpMrnTmlFlg = null;
	/* Column Info */
	private String ydFctyTpRailRmpFlg = null;
	/* Column Info */
	private String ydFctyTpPsdoYdFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String ydFctyTpCfsFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String locCd = null;
	/* Column Info */
	private String ydTpCd = null;
	/* Column Info */
	private String ydCd = null;
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String ydNm = null;
	/* Column Info */
	private String ydFctyTpCyFlg = null;
	
	private String deltFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchNodeYardListVO() {}

	public SearchNodeYardListVO(String ibflag, String pagerows, String ydCd, String ydNm, String ofcCd, String ydFctyTpMrnTmlFlg, String ydFctyTpCyFlg, String ydFctyTpCfsFlg, String ydFctyTpRailRmpFlg, String ydFctyTpPsdoYdFlg, String ydTpCd, String cntCd, String locCd, String ydCstmsNo) {
		this.ydCstmsNo = ydCstmsNo;
		this.ydFctyTpMrnTmlFlg = ydFctyTpMrnTmlFlg;
		this.ydFctyTpRailRmpFlg = ydFctyTpRailRmpFlg;
		this.ydFctyTpPsdoYdFlg = ydFctyTpPsdoYdFlg;
		this.pagerows = pagerows;
		this.ofcCd = ofcCd;
		this.ydFctyTpCfsFlg = ydFctyTpCfsFlg;
		this.ibflag = ibflag;
		this.locCd = locCd;
		this.ydTpCd = ydTpCd;
		this.ydCd = ydCd;
		this.cntCd = cntCd;
		this.ydNm = ydNm;
		this.ydFctyTpCyFlg = ydFctyTpCyFlg;
	}
	
	public SearchNodeYardListVO(String ibflag, String pagerows, String ydCd, String ydNm, String ofcCd, String ydFctyTpMrnTmlFlg, String ydFctyTpCyFlg, String ydFctyTpCfsFlg, String ydFctyTpRailRmpFlg, String ydFctyTpPsdoYdFlg, String ydTpCd, String cntCd, String locCd, String ydCstmsNo, String mdmYN, String deltFlg) {
		this.ydCstmsNo = ydCstmsNo;
		this.ydFctyTpMrnTmlFlg = ydFctyTpMrnTmlFlg;
		this.ydFctyTpRailRmpFlg = ydFctyTpRailRmpFlg;
		this.ydFctyTpPsdoYdFlg = ydFctyTpPsdoYdFlg;
		this.pagerows = pagerows;
		this.ofcCd = ofcCd;
		this.ydFctyTpCfsFlg = ydFctyTpCfsFlg;
		this.ibflag = ibflag;
		this.locCd = locCd;
		this.ydTpCd = ydTpCd;
		this.ydCd = ydCd;
		this.cntCd = cntCd;
		this.ydNm = ydNm;
		this.ydFctyTpCyFlg = ydFctyTpCyFlg;
		this.deltFlg = deltFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("yd_cstms_no", getYdCstmsNo());
		this.hashColumns.put("yd_fcty_tp_mrn_tml_flg", getYdFctyTpMrnTmlFlg());
		this.hashColumns.put("yd_fcty_tp_rail_rmp_flg", getYdFctyTpRailRmpFlg());
		this.hashColumns.put("yd_fcty_tp_psdo_yd_flg", getYdFctyTpPsdoYdFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("yd_fcty_tp_cfs_flg", getYdFctyTpCfsFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("yd_tp_cd", getYdTpCd());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("yd_nm", getYdNm());
		this.hashColumns.put("yd_fcty_tp_cy_flg", getYdFctyTpCyFlg());
		this.hashColumns.put("delt_flg", getDeltFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("yd_cstms_no", "ydCstmsNo");
		this.hashFields.put("yd_fcty_tp_mrn_tml_flg", "ydFctyTpMrnTmlFlg");
		this.hashFields.put("yd_fcty_tp_rail_rmp_flg", "ydFctyTpRailRmpFlg");
		this.hashFields.put("yd_fcty_tp_psdo_yd_flg", "ydFctyTpPsdoYdFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("yd_fcty_tp_cfs_flg", "ydFctyTpCfsFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("yd_tp_cd", "ydTpCd");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("yd_nm", "ydNm");
		this.hashFields.put("yd_fcty_tp_cy_flg", "ydFctyTpCyFlg");
		this.hashFields.put("delt_flg", "deltFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return ydCstmsNo
	 */
	public String getYdCstmsNo() {
		return this.ydCstmsNo;
	}
	
	/**
	 * Column Info
	 * @return ydFctyTpMrnTmlFlg
	 */
	public String getYdFctyTpMrnTmlFlg() {
		return this.ydFctyTpMrnTmlFlg;
	}
	
	/**
	 * Column Info
	 * @return ydFctyTpRailRmpFlg
	 */
	public String getYdFctyTpRailRmpFlg() {
		return this.ydFctyTpRailRmpFlg;
	}
	
	/**
	 * Column Info
	 * @return ydFctyTpPsdoYdFlg
	 */
	public String getYdFctyTpPsdoYdFlg() {
		return this.ydFctyTpPsdoYdFlg;
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
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
	}
	
	/**
	 * Column Info
	 * @return ydFctyTpCfsFlg
	 */
	public String getYdFctyTpCfsFlg() {
		return this.ydFctyTpCfsFlg;
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
	 * @return locCd
	 */
	public String getLocCd() {
		return this.locCd;
	}
	
	/**
	 * Column Info
	 * @return ydTpCd
	 */
	public String getYdTpCd() {
		return this.ydTpCd;
	}
	
	/**
	 * Column Info
	 * @return ydCd
	 */
	public String getYdCd() {
		return this.ydCd;
	}
	
	/**
	 * Column Info
	 * @return cntCd
	 */
	public String getCntCd() {
		return this.cntCd;
	}
	
	/**
	 * Column Info
	 * @return ydNm
	 */
	public String getYdNm() {
		return this.ydNm;
	}
	
	/**
	 * Column Info
	 * @return ydFctyTpCyFlg
	 */
	public String getYdFctyTpCyFlg() {
		return this.ydFctyTpCyFlg;
	}


	public String getDeltFlg() {
		return deltFlg;
	}

	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}

	/**
	 * Column Info
	 * @param ydCstmsNo
	 */
	public void setYdCstmsNo(String ydCstmsNo) {
		this.ydCstmsNo = ydCstmsNo;
	}
	
	/**
	 * Column Info
	 * @param ydFctyTpMrnTmlFlg
	 */
	public void setYdFctyTpMrnTmlFlg(String ydFctyTpMrnTmlFlg) {
		this.ydFctyTpMrnTmlFlg = ydFctyTpMrnTmlFlg;
	}
	
	/**
	 * Column Info
	 * @param ydFctyTpRailRmpFlg
	 */
	public void setYdFctyTpRailRmpFlg(String ydFctyTpRailRmpFlg) {
		this.ydFctyTpRailRmpFlg = ydFctyTpRailRmpFlg;
	}
	
	/**
	 * Column Info
	 * @param ydFctyTpPsdoYdFlg
	 */
	public void setYdFctyTpPsdoYdFlg(String ydFctyTpPsdoYdFlg) {
		this.ydFctyTpPsdoYdFlg = ydFctyTpPsdoYdFlg;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Column Info
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
	}
	
	/**
	 * Column Info
	 * @param ydFctyTpCfsFlg
	 */
	public void setYdFctyTpCfsFlg(String ydFctyTpCfsFlg) {
		this.ydFctyTpCfsFlg = ydFctyTpCfsFlg;
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
	 * @param locCd
	 */
	public void setLocCd(String locCd) {
		this.locCd = locCd;
	}
	
	/**
	 * Column Info
	 * @param ydTpCd
	 */
	public void setYdTpCd(String ydTpCd) {
		this.ydTpCd = ydTpCd;
	}
	
	/**
	 * Column Info
	 * @param ydCd
	 */
	public void setYdCd(String ydCd) {
		this.ydCd = ydCd;
	}
	
	/**
	 * Column Info
	 * @param cntCd
	 */
	public void setCntCd(String cntCd) {
		this.cntCd = cntCd;
	}
	
	/**
	 * Column Info
	 * @param ydNm
	 */
	public void setYdNm(String ydNm) {
		this.ydNm = ydNm;
	}
	
	/**
	 * Column Info
	 * @param ydFctyTpCyFlg
	 */
	public void setYdFctyTpCyFlg(String ydFctyTpCyFlg) {
		this.ydFctyTpCyFlg = ydFctyTpCyFlg;
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
		setYdCstmsNo(JSPUtil.getParameter(request, prefix + "yd_cstms_no", ""));
		setYdFctyTpMrnTmlFlg(JSPUtil.getParameter(request, prefix + "yd_fcty_tp_mrn_tml_flg", ""));
		setYdFctyTpRailRmpFlg(JSPUtil.getParameter(request, prefix + "yd_fcty_tp_rail_rmp_flg", ""));
		setYdFctyTpPsdoYdFlg(JSPUtil.getParameter(request, prefix + "yd_fcty_tp_psdo_yd_flg", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
		setYdFctyTpCfsFlg(JSPUtil.getParameter(request, prefix + "yd_fcty_tp_cfs_flg", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setLocCd(JSPUtil.getParameter(request, prefix + "loc_cd", ""));
		setYdTpCd(JSPUtil.getParameter(request, prefix + "yd_tp_cd", ""));
		setYdCd(JSPUtil.getParameter(request, prefix + "yd_cd", ""));
		setCntCd(JSPUtil.getParameter(request, prefix + "cnt_cd", ""));
		setYdNm(JSPUtil.getParameter(request, prefix + "yd_nm", ""));
		setYdFctyTpCyFlg(JSPUtil.getParameter(request, prefix + "yd_fcty_tp_cy_flg", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SearchNodeYardListVO[]
	 */
	public SearchNodeYardListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchNodeYardListVO[]
	 */
	public SearchNodeYardListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchNodeYardListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ydCstmsNo = (JSPUtil.getParameter(request, prefix	+ "yd_cstms_no", length));
			String[] ydFctyTpMrnTmlFlg = (JSPUtil.getParameter(request, prefix	+ "yd_fcty_tp_mrn_tml_flg", length));
			String[] ydFctyTpRailRmpFlg = (JSPUtil.getParameter(request, prefix	+ "yd_fcty_tp_rail_rmp_flg", length));
			String[] ydFctyTpPsdoYdFlg = (JSPUtil.getParameter(request, prefix	+ "yd_fcty_tp_psdo_yd_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] ydFctyTpCfsFlg = (JSPUtil.getParameter(request, prefix	+ "yd_fcty_tp_cfs_flg", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd", length));
			String[] ydTpCd = (JSPUtil.getParameter(request, prefix	+ "yd_tp_cd", length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd", length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd", length));
			String[] ydNm = (JSPUtil.getParameter(request, prefix	+ "yd_nm", length));
			String[] ydFctyTpCyFlg = (JSPUtil.getParameter(request, prefix	+ "yd_fcty_tp_cy_flg", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchNodeYardListVO();
				if (ydCstmsNo[i] != null)
					model.setYdCstmsNo(ydCstmsNo[i]);
				if (ydFctyTpMrnTmlFlg[i] != null)
					model.setYdFctyTpMrnTmlFlg(ydFctyTpMrnTmlFlg[i]);
				if (ydFctyTpRailRmpFlg[i] != null)
					model.setYdFctyTpRailRmpFlg(ydFctyTpRailRmpFlg[i]);
				if (ydFctyTpPsdoYdFlg[i] != null)
					model.setYdFctyTpPsdoYdFlg(ydFctyTpPsdoYdFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (ydFctyTpCfsFlg[i] != null)
					model.setYdFctyTpCfsFlg(ydFctyTpCfsFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (ydTpCd[i] != null)
					model.setYdTpCd(ydTpCd[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (ydNm[i] != null)
					model.setYdNm(ydNm[i]);
				if (ydFctyTpCyFlg[i] != null)
					model.setYdFctyTpCyFlg(ydFctyTpCyFlg[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchNodeYardListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchNodeYardListVO[]
	 */
	public SearchNodeYardListVO[] getSearchNodeYardListVOs(){
		SearchNodeYardListVO[] vos = (SearchNodeYardListVO[])models.toArray(new SearchNodeYardListVO[models.size()]);
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
		this.ydCstmsNo = this.ydCstmsNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydFctyTpMrnTmlFlg = this.ydFctyTpMrnTmlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydFctyTpRailRmpFlg = this.ydFctyTpRailRmpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydFctyTpPsdoYdFlg = this.ydFctyTpPsdoYdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydFctyTpCfsFlg = this.ydFctyTpCfsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydTpCd = this.ydTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydNm = this.ydNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydFctyTpCyFlg = this.ydFctyTpCyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
