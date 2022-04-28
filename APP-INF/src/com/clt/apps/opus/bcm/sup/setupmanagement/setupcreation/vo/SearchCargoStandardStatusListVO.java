/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SearchCargoStandardStatusListVO.java
*@FileTitle : SearchCargoStandardStatusListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.08
*@LastModifier : 
*@LastVersion : 1.0
* 2011.03.08  
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo;

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

public class SearchCargoStandardStatusListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchCargoStandardStatusListVO> models = new ArrayList<SearchCargoStandardStatusListVO>();
	
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String rplnBatSndFlg = null;
	/* Column Info */
	private String ediStsSeq = null;
	/* Column Info */
	private String coDivCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String ediStsDesc = null;
	/* Column Info */
	private String ediStndStsCd = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchCargoStandardStatusListVO() {}

	public SearchCargoStandardStatusListVO(String ibflag, String pagerows, String ediStndStsCd, String coDivCd, String ediStsSeq, String ediStsDesc, String rplnBatSndFlg, String creUsrId, String updUsrId) {
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.rplnBatSndFlg = rplnBatSndFlg;
		this.ediStsSeq = ediStsSeq;
		this.coDivCd = coDivCd;
		this.updUsrId = updUsrId;
		this.ediStsDesc = ediStsDesc;
		this.ediStndStsCd = ediStndStsCd;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rpln_bat_snd_flg", getRplnBatSndFlg());
		this.hashColumns.put("edi_sts_seq", getEdiStsSeq());
		this.hashColumns.put("co_div_cd", getCoDivCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("edi_sts_desc", getEdiStsDesc());
		this.hashColumns.put("edi_stnd_sts_cd", getEdiStndStsCd());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rpln_bat_snd_flg", "rplnBatSndFlg");
		this.hashFields.put("edi_sts_seq", "ediStsSeq");
		this.hashFields.put("co_div_cd", "coDivCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("edi_sts_desc", "ediStsDesc");
		this.hashFields.put("edi_stnd_sts_cd", "ediStndStsCd");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
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
	 * @return rplnBatSndFlg
	 */
	public String getRplnBatSndFlg() {
		return this.rplnBatSndFlg;
	}
	
	/**
	 * Column Info
	 * @return ediStsSeq
	 */
	public String getEdiStsSeq() {
		return this.ediStsSeq;
	}
	
	/**
	 * Column Info
	 * @return coDivCd
	 */
	public String getCoDivCd() {
		return this.coDivCd;
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
	 * @return ediStsDesc
	 */
	public String getEdiStsDesc() {
		return this.ediStsDesc;
	}
	
	/**
	 * Column Info
	 * @return ediStndStsCd
	 */
	public String getEdiStndStsCd() {
		return this.ediStndStsCd;
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
	 * @param rplnBatSndFlg
	 */
	public void setRplnBatSndFlg(String rplnBatSndFlg) {
		this.rplnBatSndFlg = rplnBatSndFlg;
	}
	
	/**
	 * Column Info
	 * @param ediStsSeq
	 */
	public void setEdiStsSeq(String ediStsSeq) {
		this.ediStsSeq = ediStsSeq;
	}
	
	/**
	 * Column Info
	 * @param coDivCd
	 */
	public void setCoDivCd(String coDivCd) {
		this.coDivCd = coDivCd;
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
	 * @param ediStsDesc
	 */
	public void setEdiStsDesc(String ediStsDesc) {
		this.ediStsDesc = ediStsDesc;
	}
	
	/**
	 * Column Info
	 * @param ediStndStsCd
	 */
	public void setEdiStndStsCd(String ediStndStsCd) {
		this.ediStndStsCd = ediStndStsCd;
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
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setRplnBatSndFlg(JSPUtil.getParameter(request, prefix + "rpln_bat_snd_flg", ""));
		setEdiStsSeq(JSPUtil.getParameter(request, prefix + "edi_sts_seq", ""));
		setCoDivCd(JSPUtil.getParameter(request, prefix + "co_div_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setEdiStsDesc(JSPUtil.getParameter(request, prefix + "edi_sts_desc", ""));
		setEdiStndStsCd(JSPUtil.getParameter(request, prefix + "edi_stnd_sts_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SearchCargoStandardStatusListVO[]
	 */
	public SearchCargoStandardStatusListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchCargoStandardStatusListVO[]
	 */
	public SearchCargoStandardStatusListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchCargoStandardStatusListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] rplnBatSndFlg = (JSPUtil.getParameter(request, prefix	+ "rpln_bat_snd_flg", length));
			String[] ediStsSeq = (JSPUtil.getParameter(request, prefix	+ "edi_sts_seq", length));
			String[] coDivCd = (JSPUtil.getParameter(request, prefix	+ "co_div_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] ediStsDesc = (JSPUtil.getParameter(request, prefix	+ "edi_sts_desc", length));
			String[] ediStndStsCd = (JSPUtil.getParameter(request, prefix	+ "edi_stnd_sts_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchCargoStandardStatusListVO();
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rplnBatSndFlg[i] != null)
					model.setRplnBatSndFlg(rplnBatSndFlg[i]);
				if (ediStsSeq[i] != null)
					model.setEdiStsSeq(ediStsSeq[i]);
				if (coDivCd[i] != null)
					model.setCoDivCd(coDivCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (ediStsDesc[i] != null)
					model.setEdiStsDesc(ediStsDesc[i]);
				if (ediStndStsCd[i] != null)
					model.setEdiStndStsCd(ediStndStsCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchCargoStandardStatusListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchCargoStandardStatusListVO[]
	 */
	public SearchCargoStandardStatusListVO[] getSearchCargoStandardStatusListVOs(){
		SearchCargoStandardStatusListVO[] vos = (SearchCargoStandardStatusListVO[])models.toArray(new SearchCargoStandardStatusListVO[models.size()]);
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
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rplnBatSndFlg = this.rplnBatSndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediStsSeq = this.ediStsSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coDivCd = this.coDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediStsDesc = this.ediStsDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediStndStsCd = this.ediStndStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
