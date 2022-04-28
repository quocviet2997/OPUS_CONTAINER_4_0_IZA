/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : GlErrVvdVO.java
*@FileTitle : GlErrVvdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2012.04.24
*@LastModifier : 장영석
*@LastVersion : 1.0
* 2012.04.24 장영석 
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo;

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
 * @author 장영석
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class GlErrVvdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<GlErrVvdVO> models = new ArrayList<GlErrVvdVO>();
	
	/* Column Info */
	private String errVslCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String avalFlg = null;
	/* Column Info */
	private String errSkdVoyNo = null;
	/* Column Info */
	private String corrSkdDirCd = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String errVvd = null;
	/* Column Info */
	private String corrRevDirCd = null;
	/* Column Info */
	private String corrSkdVoyNo = null;
	/* Column Info */
	private String errSkdDirCd = null;
	/* Column Info */
	private String corrVslCd = null;
	/* Column Info */
	private String corrVvd = null;
	/* Column Info */
	private String errRevDirCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public GlErrVvdVO() {}

	public GlErrVvdVO(String ibflag, String pagerows, String errVslCd, String errSkdVoyNo, String errSkdDirCd, String errRevDirCd, String corrVslCd, String corrSkdVoyNo, String corrSkdDirCd, String corrRevDirCd, String avalFlg, String creDt, String updDt, String errVvd, String corrVvd) {
		this.errVslCd = errVslCd;
		this.updDt = updDt;
		this.avalFlg = avalFlg;
		this.errSkdVoyNo = errSkdVoyNo;
		this.corrSkdDirCd = corrSkdDirCd;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.errVvd = errVvd;
		this.corrRevDirCd = corrRevDirCd;
		this.corrSkdVoyNo = corrSkdVoyNo;
		this.errSkdDirCd = errSkdDirCd;
		this.corrVslCd = corrVslCd;
		this.corrVvd = corrVvd;
		this.errRevDirCd = errRevDirCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("err_vsl_cd", getErrVslCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("aval_flg", getAvalFlg());
		this.hashColumns.put("err_skd_voy_no", getErrSkdVoyNo());
		this.hashColumns.put("corr_skd_dir_cd", getCorrSkdDirCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("err_vvd", getErrVvd());
		this.hashColumns.put("corr_rev_dir_cd", getCorrRevDirCd());
		this.hashColumns.put("corr_skd_voy_no", getCorrSkdVoyNo());
		this.hashColumns.put("err_skd_dir_cd", getErrSkdDirCd());
		this.hashColumns.put("corr_vsl_cd", getCorrVslCd());
		this.hashColumns.put("corr_vvd", getCorrVvd());
		this.hashColumns.put("err_rev_dir_cd", getErrRevDirCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("err_vsl_cd", "errVslCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("aval_flg", "avalFlg");
		this.hashFields.put("err_skd_voy_no", "errSkdVoyNo");
		this.hashFields.put("corr_skd_dir_cd", "corrSkdDirCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("err_vvd", "errVvd");
		this.hashFields.put("corr_rev_dir_cd", "corrRevDirCd");
		this.hashFields.put("corr_skd_voy_no", "corrSkdVoyNo");
		this.hashFields.put("err_skd_dir_cd", "errSkdDirCd");
		this.hashFields.put("corr_vsl_cd", "corrVslCd");
		this.hashFields.put("corr_vvd", "corrVvd");
		this.hashFields.put("err_rev_dir_cd", "errRevDirCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return errVslCd
	 */
	public String getErrVslCd() {
		return this.errVslCd;
	}
	
	/**
	 * Column Info
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return avalFlg
	 */
	public String getAvalFlg() {
		return this.avalFlg;
	}
	
	/**
	 * Column Info
	 * @return errSkdVoyNo
	 */
	public String getErrSkdVoyNo() {
		return this.errSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return corrSkdDirCd
	 */
	public String getCorrSkdDirCd() {
		return this.corrSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return errVvd
	 */
	public String getErrVvd() {
		return this.errVvd;
	}
	
	/**
	 * Column Info
	 * @return corrRevDirCd
	 */
	public String getCorrRevDirCd() {
		return this.corrRevDirCd;
	}
	
	/**
	 * Column Info
	 * @return corrSkdVoyNo
	 */
	public String getCorrSkdVoyNo() {
		return this.corrSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return errSkdDirCd
	 */
	public String getErrSkdDirCd() {
		return this.errSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return corrVslCd
	 */
	public String getCorrVslCd() {
		return this.corrVslCd;
	}
	
	/**
	 * Column Info
	 * @return corrVvd
	 */
	public String getCorrVvd() {
		return this.corrVvd;
	}
	
	/**
	 * Column Info
	 * @return errRevDirCd
	 */
	public String getErrRevDirCd() {
		return this.errRevDirCd;
	}
	

	/**
	 * Column Info
	 * @param errVslCd
	 */
	public void setErrVslCd(String errVslCd) {
		this.errVslCd = errVslCd;
	}
	
	/**
	 * Column Info
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param avalFlg
	 */
	public void setAvalFlg(String avalFlg) {
		this.avalFlg = avalFlg;
	}
	
	/**
	 * Column Info
	 * @param errSkdVoyNo
	 */
	public void setErrSkdVoyNo(String errSkdVoyNo) {
		this.errSkdVoyNo = errSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param corrSkdDirCd
	 */
	public void setCorrSkdDirCd(String corrSkdDirCd) {
		this.corrSkdDirCd = corrSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
	 * @param errVvd
	 */
	public void setErrVvd(String errVvd) {
		this.errVvd = errVvd;
	}
	
	/**
	 * Column Info
	 * @param corrRevDirCd
	 */
	public void setCorrRevDirCd(String corrRevDirCd) {
		this.corrRevDirCd = corrRevDirCd;
	}
	
	/**
	 * Column Info
	 * @param corrSkdVoyNo
	 */
	public void setCorrSkdVoyNo(String corrSkdVoyNo) {
		this.corrSkdVoyNo = corrSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param errSkdDirCd
	 */
	public void setErrSkdDirCd(String errSkdDirCd) {
		this.errSkdDirCd = errSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param corrVslCd
	 */
	public void setCorrVslCd(String corrVslCd) {
		this.corrVslCd = corrVslCd;
	}
	
	/**
	 * Column Info
	 * @param corrVvd
	 */
	public void setCorrVvd(String corrVvd) {
		this.corrVvd = corrVvd;
	}
	
	/**
	 * Column Info
	 * @param errRevDirCd
	 */
	public void setErrRevDirCd(String errRevDirCd) {
		this.errRevDirCd = errRevDirCd;
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
		setErrVslCd(JSPUtil.getParameter(request, prefix + "err_vsl_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setAvalFlg(JSPUtil.getParameter(request, prefix + "aval_flg", ""));
		setErrSkdVoyNo(JSPUtil.getParameter(request, prefix + "err_skd_voy_no", ""));
		setCorrSkdDirCd(JSPUtil.getParameter(request, prefix + "corr_skd_dir_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setErrVvd(JSPUtil.getParameter(request, prefix + "err_vvd", ""));
		setCorrRevDirCd(JSPUtil.getParameter(request, prefix + "corr_rev_dir_cd", ""));
		setCorrSkdVoyNo(JSPUtil.getParameter(request, prefix + "corr_skd_voy_no", ""));
		setErrSkdDirCd(JSPUtil.getParameter(request, prefix + "err_skd_dir_cd", ""));
		setCorrVslCd(JSPUtil.getParameter(request, prefix + "corr_vsl_cd", ""));
		setCorrVvd(JSPUtil.getParameter(request, prefix + "corr_vvd", ""));
		setErrRevDirCd(JSPUtil.getParameter(request, prefix + "err_rev_dir_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return GlErrVvdVO[]
	 */
	public GlErrVvdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return GlErrVvdVO[]
	 */
	public GlErrVvdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		GlErrVvdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] errVslCd = (JSPUtil.getParameter(request, prefix	+ "err_vsl_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] avalFlg = (JSPUtil.getParameter(request, prefix	+ "aval_flg", length));
			String[] errSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "err_skd_voy_no", length));
			String[] corrSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "corr_skd_dir_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] errVvd = (JSPUtil.getParameter(request, prefix	+ "err_vvd", length));
			String[] corrRevDirCd = (JSPUtil.getParameter(request, prefix	+ "corr_rev_dir_cd", length));
			String[] corrSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "corr_skd_voy_no", length));
			String[] errSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "err_skd_dir_cd", length));
			String[] corrVslCd = (JSPUtil.getParameter(request, prefix	+ "corr_vsl_cd", length));
			String[] corrVvd = (JSPUtil.getParameter(request, prefix	+ "corr_vvd", length));
			String[] errRevDirCd = (JSPUtil.getParameter(request, prefix	+ "err_rev_dir_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new GlErrVvdVO();
				if (errVslCd[i] != null)
					model.setErrVslCd(errVslCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (avalFlg[i] != null)
					model.setAvalFlg(avalFlg[i]);
				if (errSkdVoyNo[i] != null)
					model.setErrSkdVoyNo(errSkdVoyNo[i]);
				if (corrSkdDirCd[i] != null)
					model.setCorrSkdDirCd(corrSkdDirCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (errVvd[i] != null)
					model.setErrVvd(errVvd[i]);
				if (corrRevDirCd[i] != null)
					model.setCorrRevDirCd(corrRevDirCd[i]);
				if (corrSkdVoyNo[i] != null)
					model.setCorrSkdVoyNo(corrSkdVoyNo[i]);
				if (errSkdDirCd[i] != null)
					model.setErrSkdDirCd(errSkdDirCd[i]);
				if (corrVslCd[i] != null)
					model.setCorrVslCd(corrVslCd[i]);
				if (corrVvd[i] != null)
					model.setCorrVvd(corrVvd[i]);
				if (errRevDirCd[i] != null)
					model.setErrRevDirCd(errRevDirCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getGlErrVvdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return GlErrVvdVO[]
	 */
	public GlErrVvdVO[] getGlErrVvdVOs(){
		GlErrVvdVO[] vos = (GlErrVvdVO[])models.toArray(new GlErrVvdVO[models.size()]);
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
		this.errVslCd = this.errVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.avalFlg = this.avalFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.errSkdVoyNo = this.errSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrSkdDirCd = this.corrSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.errVvd = this.errVvd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrRevDirCd = this.corrRevDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrSkdVoyNo = this.corrSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.errSkdDirCd = this.errSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrVslCd = this.corrVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrVvd = this.corrVvd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.errRevDirCd = this.errRevDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
