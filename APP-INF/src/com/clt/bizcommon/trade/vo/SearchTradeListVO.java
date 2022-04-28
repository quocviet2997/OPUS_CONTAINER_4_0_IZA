/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : SearchTradeListVO.java
*@FileTitle : SearchTradeListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-22
*@LastModifier : Shin Ja Young
*@LastVersion : 1.0
* 2012-02-21 Shin Ja Young
* 1.0 최초 생성
=========================================================*/

package com.clt.bizcommon.trade.vo;

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
 * @author Shin Ja Young
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SearchTradeListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchTradeListVO> models = new ArrayList<SearchTradeListVO>();
	
	/* Column Info */
	private String code = null;
	/* Column Info */
	private String desc = null;
	
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String trdNm = null;
	/* Column Info */
	private String fmContiCd = null;
	/* Column Info */
	private String toContiCd = null;
	/* Column Info */
	private String status = null;
	/* Page Number */
	private String pagerows = null;
	private String mdmYN = null;
	private String deltFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchTradeListVO() {}

	
	public SearchTradeListVO(String pagerows, String trdCd, String trdNm, String fmContiCd, String toContiCd, String status, String mdmYN, String deltFlg, String code, String desc) {
		this.trdCd = trdCd;
		this.trdNm = trdNm;
		this.fmContiCd = fmContiCd;
		this.toContiCd = toContiCd;
		this.status = status;
		this.pagerows = pagerows;
		this.mdmYN = mdmYN;
		this.deltFlg = deltFlg;
		this.code = code;
		this.desc = desc;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("trd_nm", getTrdNm());
		this.hashColumns.put("fm_conti_cd", getFmContiCd());
		this.hashColumns.put("to_conti_cd", getToContiCd());
		this.hashColumns.put("code", getCode());
		this.hashColumns.put("desc", getDesc());		
		this.hashColumns.put("status", getStatus());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("trd_nm", "trdNm");
		this.hashFields.put("fm_conti_cd", "fmContiCd");
		this.hashFields.put("to_conti_cd", "toContiCd");
		this.hashFields.put("code", "code");
		this.hashFields.put("desc", "desc");
		this.hashFields.put("status", "status");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return trdCd
	 */
	public String getTrdCd() {
		return this.trdCd;
	}
	
	/**
	 * Column Info
	 * @return trdNm
	 */
	public String getTrdNm() {
		return this.trdNm;
	}
	
	/**
	 * Column Info
	 * @return fmContiCd
	 */
	public String getFmContiCd() {
		return this.fmContiCd;
	}
	
	/**
	 * Column Info
	 * @return toContiCd
	 */
	public String getToContiCd() {
		return this.toContiCd;
	}
	
	/**
	 * Column Info
	 * @return code
	 */
	public String getCode() {
		return this.code;
	}
	
	/**
	 * Column Info
	 * @return desc
	 */
	public String getDesc() {
		return this.desc;
	}
	
	/**
	 * Column Info
	 * @return status
	 */
	public String getStatus() {
		return this.status;
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

	public void setMdmYN(String mdmYN) {
		this.mdmYN = mdmYN;
	}

	public String getDeltFlg() {
		return deltFlg;
	}

	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}

	/**
	 * Column Info
	 * @param trdCd
	 */
	public void setTrdCd(String trdCd) {
		this.trdCd = trdCd;
	}
	
	/**
	 * Column Info
	 * @param trdNm
	 */
	public void setTrdNm(String trdNm) {
		this.trdNm = trdNm;
	}
	
	/**
	 * Column Info
	 * @param fmContiCd
	 */
	public void setFmContiCd(String fmContiCd) {
		this.fmContiCd = fmContiCd;
	}
	
	/**
	 * Column Info
	 * @param toContiCd
	 */
	public void setToContiCd(String toContiCd) {
		this.toContiCd = toContiCd;
	}
	
	/**
	 * Column Info
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * Column Info
	 * @param desc
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	/**
	 * Column Info
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
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
		setTrdCd(JSPUtil.getParameter(request, prefix + "trd_cd", ""));
		setTrdNm(JSPUtil.getParameter(request, prefix + "trd_nm", ""));
		setFmContiCd(JSPUtil.getParameter(request, prefix + "fm_conti_cd", ""));
		setToContiCd(JSPUtil.getParameter(request, prefix + "to_conti_cd", ""));
		setCode(JSPUtil.getParameter(request, prefix + "code", ""));
		setDesc(JSPUtil.getParameter(request, prefix + "desc", ""));
		setStatus(JSPUtil.getParameter(request, prefix + "status", ""));
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
	 * @return SearchTradeListVO[]
	 */
	public SearchTradeListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchTradeListVO[]
	 */
	public SearchTradeListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchTradeListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] trdNm = (JSPUtil.getParameter(request, prefix	+ "trd_nm", length));
			String[] fmContiCd = (JSPUtil.getParameter(request, prefix	+ "fm_conti_cd", length));
			String[] toContiCd = (JSPUtil.getParameter(request, prefix	+ "to_conti_cd", length));
			String[] code = (JSPUtil.getParameter(request, prefix	+ "code", length));
			String[] desc = (JSPUtil.getParameter(request, prefix	+ "desc", length));
			String[] status = (JSPUtil.getParameter(request, prefix	+ "status", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchTradeListVO();
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (trdNm[i] != null)
					model.setTrdNm(trdNm[i]);
				if (fmContiCd[i] != null)
					model.setFmContiCd(fmContiCd[i]);
				if (toContiCd[i] != null)
					model.setToContiCd(toContiCd[i]);
				if (status[i] != null)
					model.setStatus(status[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchTradeListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchTradeListVO[]
	 */
	public SearchTradeListVO[] getSearchTradeListVOs(){
		SearchTradeListVO[] vos = (SearchTradeListVO[])models.toArray(new SearchTradeListVO[models.size()]);
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
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdNm = this.trdNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmContiCd = this.fmContiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toContiCd = this.toContiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.status = this.status .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
