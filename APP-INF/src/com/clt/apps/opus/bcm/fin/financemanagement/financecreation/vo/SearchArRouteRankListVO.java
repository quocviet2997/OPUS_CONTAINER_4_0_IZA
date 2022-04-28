/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SearchArRouteRankListVO.java
*@FileTitle : SearchArRouteRankListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.22
*@LastModifier : 
*@LastVersion : 1.0
* 2011.03.22  
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

public class SearchArRouteRankListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchArRouteRankListVO> models = new ArrayList<SearchArRouteRankListVO>();
	
	/* Column Info */
	private String hRlaneCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String rnkSeq = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String changeFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String iocDesc = null;
	/* Column Info */
	private String slanCd = null;
	/* Column Info */
	private String rlaneDesc = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String hRnkSeq = null;
	/* Column Info */
	private String znIocCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchArRouteRankListVO() {}

	public SearchArRouteRankListVO(String ibflag, String pagerows, String rlaneCd, String rnkSeq, String hRlaneCd, String hRnkSeq, String rlaneDesc, String znIocCd, String iocDesc, String slanCd, String deltFlg, String creUsrId, String updUsrId, String changeFlg) {
		this.hRlaneCd = hRlaneCd;
		this.deltFlg = deltFlg;
		this.rnkSeq = rnkSeq;
		this.rlaneCd = rlaneCd;
		this.pagerows = pagerows;
		this.changeFlg = changeFlg;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.iocDesc = iocDesc;
		this.slanCd = slanCd;
		this.rlaneDesc = rlaneDesc;
		this.updUsrId = updUsrId;
		this.hRnkSeq = hRnkSeq;
		this.znIocCd = znIocCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("h_rlane_cd", getHRlaneCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("rnk_seq", getRnkSeq());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("change_flg", getChangeFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ioc_desc", getIocDesc());
		this.hashColumns.put("slan_cd", getSlanCd());
		this.hashColumns.put("rlane_desc", getRlaneDesc());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("h_rnk_seq", getHRnkSeq());
		this.hashColumns.put("zn_ioc_cd", getZnIocCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("h_rlane_cd", "hRlaneCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("rnk_seq", "rnkSeq");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("change_flg", "changeFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ioc_desc", "iocDesc");
		this.hashFields.put("slan_cd", "slanCd");
		this.hashFields.put("rlane_desc", "rlaneDesc");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("h_rnk_seq", "hRnkSeq");
		this.hashFields.put("zn_ioc_cd", "znIocCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return hRlaneCd
	 */
	public String getHRlaneCd() {
		return this.hRlaneCd;
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
	 * @return rnkSeq
	 */
	public String getRnkSeq() {
		return this.rnkSeq;
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
	 * @return changeFlg
	 */
	public String getChangeFlg() {
		return this.changeFlg;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return iocDesc
	 */
	public String getIocDesc() {
		return this.iocDesc;
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
	 * @return rlaneDesc
	 */
	public String getRlaneDesc() {
		return this.rlaneDesc;
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
	 * @return hRnkSeq
	 */
	public String getHRnkSeq() {
		return this.hRnkSeq;
	}
	
	/**
	 * Column Info
	 * @return znIocCd
	 */
	public String getZnIocCd() {
		return this.znIocCd;
	}
	

	/**
	 * Column Info
	 * @param hRlaneCd
	 */
	public void setHRlaneCd(String hRlaneCd) {
		this.hRlaneCd = hRlaneCd;
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
	 * @param rnkSeq
	 */
	public void setRnkSeq(String rnkSeq) {
		this.rnkSeq = rnkSeq;
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
	 * @param changeFlg
	 */
	public void setChangeFlg(String changeFlg) {
		this.changeFlg = changeFlg;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param iocDesc
	 */
	public void setIocDesc(String iocDesc) {
		this.iocDesc = iocDesc;
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
	 * @param rlaneDesc
	 */
	public void setRlaneDesc(String rlaneDesc) {
		this.rlaneDesc = rlaneDesc;
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
	 * @param hRnkSeq
	 */
	public void setHRnkSeq(String hRnkSeq) {
		this.hRnkSeq = hRnkSeq;
	}
	
	/**
	 * Column Info
	 * @param znIocCd
	 */
	public void setZnIocCd(String znIocCd) {
		this.znIocCd = znIocCd;
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
		setHRlaneCd(JSPUtil.getParameter(request, prefix + "h_rlane_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setRnkSeq(JSPUtil.getParameter(request, prefix + "rnk_seq", ""));
		setRlaneCd(JSPUtil.getParameter(request, prefix + "rlane_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setChangeFlg(JSPUtil.getParameter(request, prefix + "change_flg", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIocDesc(JSPUtil.getParameter(request, prefix + "ioc_desc", ""));
		setSlanCd(JSPUtil.getParameter(request, prefix + "slan_cd", ""));
		setRlaneDesc(JSPUtil.getParameter(request, prefix + "rlane_desc", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setHRnkSeq(JSPUtil.getParameter(request, prefix + "h_rnk_seq", ""));
		setZnIocCd(JSPUtil.getParameter(request, prefix + "zn_ioc_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SearchArRouteRankListVO[]
	 */
	public SearchArRouteRankListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchArRouteRankListVO[]
	 */
	public SearchArRouteRankListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchArRouteRankListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] hRlaneCd = (JSPUtil.getParameter(request, prefix	+ "h_rlane_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] rnkSeq = (JSPUtil.getParameter(request, prefix	+ "rnk_seq", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] changeFlg = (JSPUtil.getParameter(request, prefix	+ "change_flg", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] iocDesc = (JSPUtil.getParameter(request, prefix	+ "ioc_desc", length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd", length));
			String[] rlaneDesc = (JSPUtil.getParameter(request, prefix	+ "rlane_desc", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] hRnkSeq = (JSPUtil.getParameter(request, prefix	+ "h_rnk_seq", length));
			String[] znIocCd = (JSPUtil.getParameter(request, prefix	+ "zn_ioc_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchArRouteRankListVO();
				if (hRlaneCd[i] != null)
					model.setHRlaneCd(hRlaneCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (rnkSeq[i] != null)
					model.setRnkSeq(rnkSeq[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (changeFlg[i] != null)
					model.setChangeFlg(changeFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (iocDesc[i] != null)
					model.setIocDesc(iocDesc[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (rlaneDesc[i] != null)
					model.setRlaneDesc(rlaneDesc[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (hRnkSeq[i] != null)
					model.setHRnkSeq(hRnkSeq[i]);
				if (znIocCd[i] != null)
					model.setZnIocCd(znIocCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchArRouteRankListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchArRouteRankListVO[]
	 */
	public SearchArRouteRankListVO[] getSearchArRouteRankListVOs(){
		SearchArRouteRankListVO[] vos = (SearchArRouteRankListVO[])models.toArray(new SearchArRouteRankListVO[models.size()]);
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
		this.hRlaneCd = this.hRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rnkSeq = this.rnkSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.changeFlg = this.changeFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iocDesc = this.iocDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneDesc = this.rlaneDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hRnkSeq = this.hRnkSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.znIocCd = this.znIocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
