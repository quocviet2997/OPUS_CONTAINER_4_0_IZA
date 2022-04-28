/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SearchBkgEdiTrdPrnrSubLnkListVO.java
*@FileTitle : SearchBkgEdiTrdPrnrSubLnkListVO
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

public class SearchBkgEdiTrdPrnrSubLnkListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchBkgEdiTrdPrnrSubLnkListVO> models = new ArrayList<SearchBkgEdiTrdPrnrSubLnkListVO>();
	
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String sndrTrdPrnrId = null;
	/* Column Info */
	private String prnrSubLnkDivCd = null;
	/* Column Info */
	private String rcvrTrdPrnrId = null;
	/* Column Info */
	private String trdPrnrSubLnkSeq = null;
	/* Column Info */
	private String prnrSubLnkCd = null;
	/* Column Info */
	private String prnrPortCd = null;
	/* Column Info */
	private String ediSndFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchBkgEdiTrdPrnrSubLnkListVO() {}

	public SearchBkgEdiTrdPrnrSubLnkListVO(String ibflag, String pagerows, String trdPrnrSubLnkSeq, String prnrSubLnkDivCd, String prnrSubLnkCd, String sndrTrdPrnrId, String rcvrTrdPrnrId, String prnrPortCd, String ediSndFlg, String creUsrId, String updUsrId) {
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.sndrTrdPrnrId = sndrTrdPrnrId;
		this.prnrSubLnkDivCd = prnrSubLnkDivCd;
		this.rcvrTrdPrnrId = rcvrTrdPrnrId;
		this.trdPrnrSubLnkSeq = trdPrnrSubLnkSeq;
		this.prnrSubLnkCd = prnrSubLnkCd;
		this.prnrPortCd = prnrPortCd;
		this.ediSndFlg = ediSndFlg;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("sndr_trd_prnr_id", getSndrTrdPrnrId());
		this.hashColumns.put("prnr_sub_lnk_div_cd", getPrnrSubLnkDivCd());
		this.hashColumns.put("rcvr_trd_prnr_id", getRcvrTrdPrnrId());
		this.hashColumns.put("trd_prnr_sub_lnk_seq", getTrdPrnrSubLnkSeq());
		this.hashColumns.put("prnr_sub_lnk_cd", getPrnrSubLnkCd());
		this.hashColumns.put("prnr_port_cd", getPrnrPortCd());
		this.hashColumns.put("edi_snd_flg", getEdiSndFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
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
		this.hashFields.put("sndr_trd_prnr_id", "sndrTrdPrnrId");
		this.hashFields.put("prnr_sub_lnk_div_cd", "prnrSubLnkDivCd");
		this.hashFields.put("rcvr_trd_prnr_id", "rcvrTrdPrnrId");
		this.hashFields.put("trd_prnr_sub_lnk_seq", "trdPrnrSubLnkSeq");
		this.hashFields.put("prnr_sub_lnk_cd", "prnrSubLnkCd");
		this.hashFields.put("prnr_port_cd", "prnrPortCd");
		this.hashFields.put("edi_snd_flg", "ediSndFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
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
	 * @return sndrTrdPrnrId
	 */
	public String getSndrTrdPrnrId() {
		return this.sndrTrdPrnrId;
	}
	
	/**
	 * Column Info
	 * @return prnrSubLnkDivCd
	 */
	public String getPrnrSubLnkDivCd() {
		return this.prnrSubLnkDivCd;
	}
	
	/**
	 * Column Info
	 * @return rcvrTrdPrnrId
	 */
	public String getRcvrTrdPrnrId() {
		return this.rcvrTrdPrnrId;
	}
	
	/**
	 * Column Info
	 * @return trdPrnrSubLnkSeq
	 */
	public String getTrdPrnrSubLnkSeq() {
		return this.trdPrnrSubLnkSeq;
	}
	
	/**
	 * Column Info
	 * @return prnrSubLnkCd
	 */
	public String getPrnrSubLnkCd() {
		return this.prnrSubLnkCd;
	}
	
	/**
	 * Column Info
	 * @return prnrPortCd
	 */
	public String getPrnrPortCd() {
		return this.prnrPortCd;
	}
	
	/**
	 * Column Info
	 * @return ediSndFlg
	 */
	public String getEdiSndFlg() {
		return this.ediSndFlg;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
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
	 * @param sndrTrdPrnrId
	 */
	public void setSndrTrdPrnrId(String sndrTrdPrnrId) {
		this.sndrTrdPrnrId = sndrTrdPrnrId;
	}
	
	/**
	 * Column Info
	 * @param prnrSubLnkDivCd
	 */
	public void setPrnrSubLnkDivCd(String prnrSubLnkDivCd) {
		this.prnrSubLnkDivCd = prnrSubLnkDivCd;
	}
	
	/**
	 * Column Info
	 * @param rcvrTrdPrnrId
	 */
	public void setRcvrTrdPrnrId(String rcvrTrdPrnrId) {
		this.rcvrTrdPrnrId = rcvrTrdPrnrId;
	}
	
	/**
	 * Column Info
	 * @param trdPrnrSubLnkSeq
	 */
	public void setTrdPrnrSubLnkSeq(String trdPrnrSubLnkSeq) {
		this.trdPrnrSubLnkSeq = trdPrnrSubLnkSeq;
	}
	
	/**
	 * Column Info
	 * @param prnrSubLnkCd
	 */
	public void setPrnrSubLnkCd(String prnrSubLnkCd) {
		this.prnrSubLnkCd = prnrSubLnkCd;
	}
	
	/**
	 * Column Info
	 * @param prnrPortCd
	 */
	public void setPrnrPortCd(String prnrPortCd) {
		this.prnrPortCd = prnrPortCd;
	}
	
	/**
	 * Column Info
	 * @param ediSndFlg
	 */
	public void setEdiSndFlg(String ediSndFlg) {
		this.ediSndFlg = ediSndFlg;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
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
		setSndrTrdPrnrId(JSPUtil.getParameter(request, prefix + "sndr_trd_prnr_id", ""));
		setPrnrSubLnkDivCd(JSPUtil.getParameter(request, prefix + "prnr_sub_lnk_div_cd", ""));
		setRcvrTrdPrnrId(JSPUtil.getParameter(request, prefix + "rcvr_trd_prnr_id", ""));
		setTrdPrnrSubLnkSeq(JSPUtil.getParameter(request, prefix + "trd_prnr_sub_lnk_seq", ""));
		setPrnrSubLnkCd(JSPUtil.getParameter(request, prefix + "prnr_sub_lnk_cd", ""));
		setPrnrPortCd(JSPUtil.getParameter(request, prefix + "prnr_port_cd", ""));
		setEdiSndFlg(JSPUtil.getParameter(request, prefix + "edi_snd_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SearchBkgEdiTrdPrnrSubLnkListVO[]
	 */
	public SearchBkgEdiTrdPrnrSubLnkListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchBkgEdiTrdPrnrSubLnkListVO[]
	 */
	public SearchBkgEdiTrdPrnrSubLnkListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchBkgEdiTrdPrnrSubLnkListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] sndrTrdPrnrId = (JSPUtil.getParameter(request, prefix	+ "sndr_trd_prnr_id", length));
			String[] prnrSubLnkDivCd = (JSPUtil.getParameter(request, prefix	+ "prnr_sub_lnk_div_cd", length));
			String[] rcvrTrdPrnrId = (JSPUtil.getParameter(request, prefix	+ "rcvr_trd_prnr_id", length));
			String[] trdPrnrSubLnkSeq = (JSPUtil.getParameter(request, prefix	+ "trd_prnr_sub_lnk_seq", length));
			String[] prnrSubLnkCd = (JSPUtil.getParameter(request, prefix	+ "prnr_sub_lnk_cd", length));
			String[] prnrPortCd = (JSPUtil.getParameter(request, prefix	+ "prnr_port_cd", length));
			String[] ediSndFlg = (JSPUtil.getParameter(request, prefix	+ "edi_snd_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchBkgEdiTrdPrnrSubLnkListVO();
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (sndrTrdPrnrId[i] != null)
					model.setSndrTrdPrnrId(sndrTrdPrnrId[i]);
				if (prnrSubLnkDivCd[i] != null)
					model.setPrnrSubLnkDivCd(prnrSubLnkDivCd[i]);
				if (rcvrTrdPrnrId[i] != null)
					model.setRcvrTrdPrnrId(rcvrTrdPrnrId[i]);
				if (trdPrnrSubLnkSeq[i] != null)
					model.setTrdPrnrSubLnkSeq(trdPrnrSubLnkSeq[i]);
				if (prnrSubLnkCd[i] != null)
					model.setPrnrSubLnkCd(prnrSubLnkCd[i]);
				if (prnrPortCd[i] != null)
					model.setPrnrPortCd(prnrPortCd[i]);
				if (ediSndFlg[i] != null)
					model.setEdiSndFlg(ediSndFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchBkgEdiTrdPrnrSubLnkListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchBkgEdiTrdPrnrSubLnkListVO[]
	 */
	public SearchBkgEdiTrdPrnrSubLnkListVO[] getSearchBkgEdiTrdPrnrSubLnkListVOs(){
		SearchBkgEdiTrdPrnrSubLnkListVO[] vos = (SearchBkgEdiTrdPrnrSubLnkListVO[])models.toArray(new SearchBkgEdiTrdPrnrSubLnkListVO[models.size()]);
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
		this.sndrTrdPrnrId = this.sndrTrdPrnrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prnrSubLnkDivCd = this.prnrSubLnkDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvrTrdPrnrId = this.rcvrTrdPrnrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdPrnrSubLnkSeq = this.trdPrnrSubLnkSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prnrSubLnkCd = this.prnrSubLnkCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prnrPortCd = this.prnrPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndFlg = this.ediSndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
