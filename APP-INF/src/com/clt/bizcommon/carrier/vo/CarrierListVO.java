/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : CarrierListVO.java
*@FileTitle : CarrierListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.07
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2010.07.07 함대성 
* 1.0 Creation
=========================================================*/

package com.clt.bizcommon.carrier.vo;

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

public class CarrierListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CarrierListVO> models = new ArrayList<CarrierListVO>();
	
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String crrNm = null;
	/* Column Info */
	private String crrFullNm = null;
	/* Column Info */
	private String crrCd = null;
	/* Page Number */
	private String pagerows = null;

	/*
	 * 20120210 added by JUN SUNG, KIM
	 * mdm yn 관련 추가 param
	 */
	private String mdmYN = null;
	private String deltFlg = null;
	
	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CarrierListVO() {}

	public CarrierListVO(String ibflag, String pagerows, String crrCd, String crrFullNm, String crrNm) {
		this.ibflag = ibflag;
		this.crrNm = crrNm;
		this.crrFullNm = crrFullNm;
		this.crrCd = crrCd;
		this.pagerows = pagerows;
	}
	
	public CarrierListVO(String ibflag, String pagerows, String crrCd, String crrFullNm, String crrNm, String mdmYN, String deltFlg) {
		this.ibflag = ibflag;
		this.crrNm = crrNm;
		this.crrFullNm = crrFullNm;
		this.crrCd = crrCd;
		this.mdmYN = mdmYN;
		this.deltFlg = deltFlg;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("crr_nm", getCrrNm());
		this.hashColumns.put("crr_full_nm", getCrrFullNm());
		this.hashColumns.put("crr_cd", getCrrCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("crr_nm", "crrNm");
		this.hashFields.put("crr_full_nm", "crrFullNm");
		this.hashFields.put("crr_cd", "crrCd");
		this.hashFields.put("delt_flg", "deltFlg");
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
	 * @return crrNm
	 */
	public String getCrrNm() {
		return this.crrNm;
	}
	
	/**
	 * Column Info
	 * @return crrFullNm
	 */
	public String getCrrFullNm() {
		return this.crrFullNm;
	}
	
	/**
	 * Column Info
	 * @return crrCd
	 */
	public String getCrrCd() {
		return this.crrCd;
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
	

	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}

	public void setMdmYN(String mdmYN) {
		this.mdmYN = mdmYN;
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
	 * @param crrNm
	 */
	public void setCrrNm(String crrNm) {
		this.crrNm = crrNm;
	}
	
	/**
	 * Column Info
	 * @param crrFullNm
	 */
	public void setCrrFullNm(String crrFullNm) {
		this.crrFullNm = crrFullNm;
	}
	
	/**
	 * Column Info
	 * @param crrCd
	 */
	public void setCrrCd(String crrCd) {
		this.crrCd = crrCd;
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
		setCrrNm(JSPUtil.getParameter(request, prefix + "crr_nm", ""));
		setCrrFullNm(JSPUtil.getParameter(request, prefix + "crr_full_nm", ""));
		setCrrCd(JSPUtil.getParameter(request, prefix + "crr_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setMdmYN(JSPUtil.getParameter(request, prefix + "mdm_yn", ""));
		if("Y".equals(this.mdmYN)){
			setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", "N"));
		}else{
			setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		}
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CarrierListVO[]
	 */
	public CarrierListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CarrierListVO[]
	 */
	public CarrierListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CarrierListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] crrNm = (JSPUtil.getParameter(request, prefix	+ "crr_nm", length));
			String[] crrFullNm = (JSPUtil.getParameter(request, prefix	+ "crr_full_nm", length));
			String[] crrCd = (JSPUtil.getParameter(request, prefix	+ "crr_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new CarrierListVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (crrNm[i] != null)
					model.setCrrNm(crrNm[i]);
				if (crrFullNm[i] != null)
					model.setCrrFullNm(crrFullNm[i]);
				if (crrCd[i] != null)
					model.setCrrCd(crrCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCarrierListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CarrierListVO[]
	 */
	public CarrierListVO[] getCarrierListVOs(){
		CarrierListVO[] vos = (CarrierListVO[])models.toArray(new CarrierListVO[models.size()]);
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
		this.crrNm = this.crrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crrFullNm = this.crrFullNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crrCd = this.crrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
