/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SearchArFincDirConvListVO.java
*@FileTitle : SearchArFincDirConvListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.10
*@LastModifier : 
*@LastVersion : 1.0
* 2011.03.10  
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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SearchArFincDirConvListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchArFincDirConvListVO> models = new ArrayList<SearchArFincDirConvListVO>();
	
	/* Column Info */
	private String hSlanCd = null;
	/* Column Info */
	private String dirCngCd = null;
	/* Column Info */
	private String slanDirCd = null;
	/* Column Info */
	private String hScontiCd = null;
	/* Column Info */
	private String hSlanDirCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String hRlaneDirCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String slanCd = null;
	/* Column Info */
	private String rlaneDirCd = null;
	/* Column Info */
	private String apMkFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String scontiCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchArFincDirConvListVO() {}

	public SearchArFincDirConvListVO(String ibflag, String pagerows, String slanCd, String scontiCd, String slanDirCd, String rlaneDirCd, String hSlanCd, String hScontiCd, String hSlanDirCd, String hRlaneDirCd, String dirCngCd, String apMkFlg, String rlaneCd, String deltFlg, String updUsrId, String creUsrId) {
		this.hSlanCd = hSlanCd;
		this.dirCngCd = dirCngCd;
		this.slanDirCd = slanDirCd;
		this.hScontiCd = hScontiCd;
		this.hSlanDirCd = hSlanDirCd;
		this.deltFlg = deltFlg;
		this.hRlaneDirCd = hRlaneDirCd;
		this.rlaneCd = rlaneCd;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.slanCd = slanCd;
		this.rlaneDirCd = rlaneDirCd;
		this.apMkFlg = apMkFlg;
		this.updUsrId = updUsrId;
		this.scontiCd = scontiCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("h_slan_cd", getHSlanCd());
		this.hashColumns.put("dir_cng_cd", getDirCngCd());
		this.hashColumns.put("slan_dir_cd", getSlanDirCd());
		this.hashColumns.put("h_sconti_cd", getHScontiCd());
		this.hashColumns.put("h_slan_dir_cd", getHSlanDirCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("h_rlane_dir_cd", getHRlaneDirCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("slan_cd", getSlanCd());
		this.hashColumns.put("rlane_dir_cd", getRlaneDirCd());
		this.hashColumns.put("ap_mk_flg", getApMkFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("sconti_cd", getScontiCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("h_slan_cd", "hSlanCd");
		this.hashFields.put("dir_cng_cd", "dirCngCd");
		this.hashFields.put("slan_dir_cd", "slanDirCd");
		this.hashFields.put("h_sconti_cd", "hScontiCd");
		this.hashFields.put("h_slan_dir_cd", "hSlanDirCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("h_rlane_dir_cd", "hRlaneDirCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("slan_cd", "slanCd");
		this.hashFields.put("rlane_dir_cd", "rlaneDirCd");
		this.hashFields.put("ap_mk_flg", "apMkFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("sconti_cd", "scontiCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return hSlanCd
	 */
	public String getHSlanCd() {
		return this.hSlanCd;
	}
	
	/**
	 * Column Info
	 * @return dirCngCd
	 */
	public String getDirCngCd() {
		return this.dirCngCd;
	}
	
	/**
	 * Column Info
	 * @return slanDirCd
	 */
	public String getSlanDirCd() {
		return this.slanDirCd;
	}
	
	/**
	 * Column Info
	 * @return hScontiCd
	 */
	public String getHScontiCd() {
		return this.hScontiCd;
	}
	
	/**
	 * Column Info
	 * @return hSlanDirCd
	 */
	public String getHSlanDirCd() {
		return this.hSlanDirCd;
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
	 * @return hRlaneDirCd
	 */
	public String getHRlaneDirCd() {
		return this.hRlaneDirCd;
	}
	
	/**
	 * Column Info
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return slanCd
	 */
	public String getSlanCd() {
		return this.slanCd;
	}
	
	/**
	 * Column Info
	 * @return rlaneDirCd
	 */
	public String getRlaneDirCd() {
		return this.rlaneDirCd;
	}
	
	/**
	 * Column Info
	 * @return apMkFlg
	 */
	public String getApMkFlg() {
		return this.apMkFlg;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	/**
	 * Column Info
	 * @return scontiCd
	 */
	public String getScontiCd() {
		return this.scontiCd;
	}
	

	/**
	 * Column Info
	 * @param hSlanCd
	 */
	public void setHSlanCd(String hSlanCd) {
		this.hSlanCd = hSlanCd;
	}
	
	/**
	 * Column Info
	 * @param dirCngCd
	 */
	public void setDirCngCd(String dirCngCd) {
		this.dirCngCd = dirCngCd;
	}
	
	/**
	 * Column Info
	 * @param slanDirCd
	 */
	public void setSlanDirCd(String slanDirCd) {
		this.slanDirCd = slanDirCd;
	}
	
	/**
	 * Column Info
	 * @param hScontiCd
	 */
	public void setHScontiCd(String hScontiCd) {
		this.hScontiCd = hScontiCd;
	}
	
	/**
	 * Column Info
	 * @param hSlanDirCd
	 */
	public void setHSlanDirCd(String hSlanDirCd) {
		this.hSlanDirCd = hSlanDirCd;
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
	 * @param hRlaneDirCd
	 */
	public void setHRlaneDirCd(String hRlaneDirCd) {
		this.hRlaneDirCd = hRlaneDirCd;
	}
	
	/**
	 * Column Info
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
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
	 * @param slanCd
	 */
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
	}
	
	/**
	 * Column Info
	 * @param rlaneDirCd
	 */
	public void setRlaneDirCd(String rlaneDirCd) {
		this.rlaneDirCd = rlaneDirCd;
	}
	
	/**
	 * Column Info
	 * @param apMkFlg
	 */
	public void setApMkFlg(String apMkFlg) {
		this.apMkFlg = apMkFlg;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param scontiCd
	 */
	public void setScontiCd(String scontiCd) {
		this.scontiCd = scontiCd;
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
		setHSlanCd(JSPUtil.getParameter(request, prefix + "h_slan_cd", ""));
		setDirCngCd(JSPUtil.getParameter(request, prefix + "dir_cng_cd", ""));
		setSlanDirCd(JSPUtil.getParameter(request, prefix + "slan_dir_cd", ""));
		setHScontiCd(JSPUtil.getParameter(request, prefix + "h_sconti_cd", ""));
		setHSlanDirCd(JSPUtil.getParameter(request, prefix + "h_slan_dir_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setHRlaneDirCd(JSPUtil.getParameter(request, prefix + "h_rlane_dir_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, prefix + "rlane_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setSlanCd(JSPUtil.getParameter(request, prefix + "slan_cd", ""));
		setRlaneDirCd(JSPUtil.getParameter(request, prefix + "rlane_dir_cd", ""));
		setApMkFlg(JSPUtil.getParameter(request, prefix + "ap_mk_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setScontiCd(JSPUtil.getParameter(request, prefix + "sconti_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SearchArFincDirConvListVO[]
	 */
	public SearchArFincDirConvListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchArFincDirConvListVO[]
	 */
	public SearchArFincDirConvListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchArFincDirConvListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] hSlanCd = (JSPUtil.getParameter(request, prefix	+ "h_slan_cd", length));
			String[] dirCngCd = (JSPUtil.getParameter(request, prefix	+ "dir_cng_cd", length));
			String[] slanDirCd = (JSPUtil.getParameter(request, prefix	+ "slan_dir_cd", length));
			String[] hScontiCd = (JSPUtil.getParameter(request, prefix	+ "h_sconti_cd", length));
			String[] hSlanDirCd = (JSPUtil.getParameter(request, prefix	+ "h_slan_dir_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] hRlaneDirCd = (JSPUtil.getParameter(request, prefix	+ "h_rlane_dir_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd", length));
			String[] rlaneDirCd = (JSPUtil.getParameter(request, prefix	+ "rlane_dir_cd", length));
			String[] apMkFlg = (JSPUtil.getParameter(request, prefix	+ "ap_mk_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] scontiCd = (JSPUtil.getParameter(request, prefix	+ "sconti_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchArFincDirConvListVO();
				if (hSlanCd[i] != null)
					model.setHSlanCd(hSlanCd[i]);
				if (dirCngCd[i] != null)
					model.setDirCngCd(dirCngCd[i]);
				if (slanDirCd[i] != null)
					model.setSlanDirCd(slanDirCd[i]);
				if (hScontiCd[i] != null)
					model.setHScontiCd(hScontiCd[i]);
				if (hSlanDirCd[i] != null)
					model.setHSlanDirCd(hSlanDirCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (hRlaneDirCd[i] != null)
					model.setHRlaneDirCd(hRlaneDirCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (rlaneDirCd[i] != null)
					model.setRlaneDirCd(rlaneDirCd[i]);
				if (apMkFlg[i] != null)
					model.setApMkFlg(apMkFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (scontiCd[i] != null)
					model.setScontiCd(scontiCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchArFincDirConvListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchArFincDirConvListVO[]
	 */
	public SearchArFincDirConvListVO[] getSearchArFincDirConvListVOs(){
		SearchArFincDirConvListVO[] vos = (SearchArFincDirConvListVO[])models.toArray(new SearchArFincDirConvListVO[models.size()]);
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
		this.hSlanCd = this.hSlanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCngCd = this.dirCngCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanDirCd = this.slanDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hScontiCd = this.hScontiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hSlanDirCd = this.hSlanDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hRlaneDirCd = this.hRlaneDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneDirCd = this.rlaneDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apMkFlg = this.apMkFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scontiCd = this.scontiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
