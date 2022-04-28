/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : SrchPayGrpLuCdVO.java
*@FileTitle : SrchPayGrpLuCdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.05.17
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2010.05.17 함대성 
* 1.0 Creation
=========================================================*/

package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo;

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

public class SrchPayGrpLuCdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SrchPayGrpLuCdVO> models = new ArrayList<SrchPayGrpLuCdVO>();
	
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String apCtrCdIo = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String apCtrCdGbn = null;
	/* Column Info */
	private String apCtrCd = null;
	/* Column Info */
	private String ofcKrnNm = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SrchPayGrpLuCdVO() {}

	public SrchPayGrpLuCdVO(String ibflag, String pagerows, String ofcCd, String ofcKrnNm, String apCtrCd, String apCtrCdGbn, String apCtrCdIo) {
		this.ofcCd = ofcCd;
		this.apCtrCdIo = apCtrCdIo;
		this.ibflag = ibflag;
		this.apCtrCdGbn = apCtrCdGbn;
		this.apCtrCd = apCtrCd;
		this.ofcKrnNm = ofcKrnNm;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("ap_ctr_cd_io", getApCtrCdIo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ap_ctr_cd_gbn", getApCtrCdGbn());
		this.hashColumns.put("ap_ctr_cd", getApCtrCd());
		this.hashColumns.put("ofc_krn_nm", getOfcKrnNm());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("ap_ctr_cd_io", "apCtrCdIo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ap_ctr_cd_gbn", "apCtrCdGbn");
		this.hashFields.put("ap_ctr_cd", "apCtrCd");
		this.hashFields.put("ofc_krn_nm", "ofcKrnNm");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
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
	 * @return apCtrCdIo
	 */
	public String getApCtrCdIo() {
		return this.apCtrCdIo;
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
	 * @return apCtrCdGbn
	 */
	public String getApCtrCdGbn() {
		return this.apCtrCdGbn;
	}
	
	/**
	 * Column Info
	 * @return apCtrCd
	 */
	public String getApCtrCd() {
		return this.apCtrCd;
	}
	
	/**
	 * Column Info
	 * @return ofcKrnNm
	 */
	public String getOfcKrnNm() {
		return this.ofcKrnNm;
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
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
	}
	
	/**
	 * Column Info
	 * @param apCtrCdIo
	 */
	public void setApCtrCdIo(String apCtrCdIo) {
		this.apCtrCdIo = apCtrCdIo;
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
	 * @param apCtrCdGbn
	 */
	public void setApCtrCdGbn(String apCtrCdGbn) {
		this.apCtrCdGbn = apCtrCdGbn;
	}
	
	/**
	 * Column Info
	 * @param apCtrCd
	 */
	public void setApCtrCd(String apCtrCd) {
		this.apCtrCd = apCtrCd;
	}
	
	/**
	 * Column Info
	 * @param ofcKrnNm
	 */
	public void setOfcKrnNm(String ofcKrnNm) {
		this.ofcKrnNm = ofcKrnNm;
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
		setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
		setApCtrCdIo(JSPUtil.getParameter(request, prefix + "ap_ctr_cd_io", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setApCtrCdGbn(JSPUtil.getParameter(request, prefix + "ap_ctr_cd_gbn", ""));
		setApCtrCd(JSPUtil.getParameter(request, prefix + "ap_ctr_cd", ""));
		setOfcKrnNm(JSPUtil.getParameter(request, prefix + "ofc_krn_nm", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SrchPayGrpLuCdVO[]
	 */
	public SrchPayGrpLuCdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SrchPayGrpLuCdVO[]
	 */
	public SrchPayGrpLuCdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SrchPayGrpLuCdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] apCtrCdIo = (JSPUtil.getParameter(request, prefix	+ "ap_ctr_cd_io", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] apCtrCdGbn = (JSPUtil.getParameter(request, prefix	+ "ap_ctr_cd_gbn", length));
			String[] apCtrCd = (JSPUtil.getParameter(request, prefix	+ "ap_ctr_cd", length));
			String[] ofcKrnNm = (JSPUtil.getParameter(request, prefix	+ "ofc_krn_nm", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new SrchPayGrpLuCdVO();
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (apCtrCdIo[i] != null)
					model.setApCtrCdIo(apCtrCdIo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (apCtrCdGbn[i] != null)
					model.setApCtrCdGbn(apCtrCdGbn[i]);
				if (apCtrCd[i] != null)
					model.setApCtrCd(apCtrCd[i]);
				if (ofcKrnNm[i] != null)
					model.setOfcKrnNm(ofcKrnNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSrchPayGrpLuCdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SrchPayGrpLuCdVO[]
	 */
	public SrchPayGrpLuCdVO[] getSrchPayGrpLuCdVOs(){
		SrchPayGrpLuCdVO[] vos = (SrchPayGrpLuCdVO[])models.toArray(new SrchPayGrpLuCdVO[models.size()]);
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
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apCtrCdIo = this.apCtrCdIo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apCtrCdGbn = this.apCtrCdGbn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apCtrCd = this.apCtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcKrnNm = this.ofcKrnNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
