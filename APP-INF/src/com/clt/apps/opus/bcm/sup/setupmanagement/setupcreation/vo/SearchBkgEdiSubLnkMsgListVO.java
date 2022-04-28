/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SearchBkgEdiSubLnkMsgListVO.java
*@FileTitle : SearchBkgEdiSubLnkMsgListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.09
*@LastModifier : 
*@LastVersion : 1.0
* 2011.03.09  
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

public class SearchBkgEdiSubLnkMsgListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchBkgEdiSubLnkMsgListVO> models = new ArrayList<SearchBkgEdiSubLnkMsgListVO>();
	
	/* Column Info */
	private String ediMsgIndCd5 = null;
	/* Column Info */
	private String ediMsgIndCd3 = null;
	/* Column Info */
	private String ediMsgIndCd4 = null;
	/* Column Info */
	private String ediMsgIndCd1 = null;
	/* Column Info */
	private String trdPrnrSubLnkSeq = null;
	/* Column Info */
	private String ediMsgIndCd2 = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String msgTpDesc = null;
	/* Column Info */
	private String ediMsgIndCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String ediMsgTpId = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchBkgEdiSubLnkMsgListVO() {}

	public SearchBkgEdiSubLnkMsgListVO(String ibflag, String pagerows, String trdPrnrSubLnkSeq, String ediMsgTpId, String ediMsgIndCd1, String ediMsgIndCd2, String ediMsgIndCd3, String ediMsgIndCd4, String ediMsgIndCd5, String ediMsgIndCd, String msgTpDesc, String creUsrId, String updUsrId) {
		this.ediMsgIndCd5 = ediMsgIndCd5;
		this.ediMsgIndCd3 = ediMsgIndCd3;
		this.ediMsgIndCd4 = ediMsgIndCd4;
		this.ediMsgIndCd1 = ediMsgIndCd1;
		this.trdPrnrSubLnkSeq = trdPrnrSubLnkSeq;
		this.ediMsgIndCd2 = ediMsgIndCd2;
		this.pagerows = pagerows;
		this.msgTpDesc = msgTpDesc;
		this.ediMsgIndCd = ediMsgIndCd;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.ediMsgTpId = ediMsgTpId;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("edi_msg_ind_cd5", getEdiMsgIndCd5());
		this.hashColumns.put("edi_msg_ind_cd3", getEdiMsgIndCd3());
		this.hashColumns.put("edi_msg_ind_cd4", getEdiMsgIndCd4());
		this.hashColumns.put("edi_msg_ind_cd1", getEdiMsgIndCd1());
		this.hashColumns.put("trd_prnr_sub_lnk_seq", getTrdPrnrSubLnkSeq());
		this.hashColumns.put("edi_msg_ind_cd2", getEdiMsgIndCd2());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("msg_tp_desc", getMsgTpDesc());
		this.hashColumns.put("edi_msg_ind_cd", getEdiMsgIndCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("edi_msg_tp_id", getEdiMsgTpId());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("edi_msg_ind_cd5", "ediMsgIndCd5");
		this.hashFields.put("edi_msg_ind_cd3", "ediMsgIndCd3");
		this.hashFields.put("edi_msg_ind_cd4", "ediMsgIndCd4");
		this.hashFields.put("edi_msg_ind_cd1", "ediMsgIndCd1");
		this.hashFields.put("trd_prnr_sub_lnk_seq", "trdPrnrSubLnkSeq");
		this.hashFields.put("edi_msg_ind_cd2", "ediMsgIndCd2");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("msg_tp_desc", "msgTpDesc");
		this.hashFields.put("edi_msg_ind_cd", "ediMsgIndCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("edi_msg_tp_id", "ediMsgTpId");
		this.hashFields.put("upd_usr_id", "updUsrId");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return ediMsgIndCd5
	 */
	public String getEdiMsgIndCd5() {
		return this.ediMsgIndCd5;
	}
	
	/**
	 * Column Info
	 * @return ediMsgIndCd3
	 */
	public String getEdiMsgIndCd3() {
		return this.ediMsgIndCd3;
	}
	
	/**
	 * Column Info
	 * @return ediMsgIndCd4
	 */
	public String getEdiMsgIndCd4() {
		return this.ediMsgIndCd4;
	}
	
	/**
	 * Column Info
	 * @return ediMsgIndCd1
	 */
	public String getEdiMsgIndCd1() {
		return this.ediMsgIndCd1;
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
	 * @return ediMsgIndCd2
	 */
	public String getEdiMsgIndCd2() {
		return this.ediMsgIndCd2;
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
	 * @return msgTpDesc
	 */
	public String getMsgTpDesc() {
		return this.msgTpDesc;
	}
	
	/**
	 * Column Info
	 * @return ediMsgIndCd
	 */
	public String getEdiMsgIndCd() {
		return this.ediMsgIndCd;
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
	 * @return ediMsgTpId
	 */
	public String getEdiMsgTpId() {
		return this.ediMsgTpId;
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
	 * @param ediMsgIndCd5
	 */
	public void setEdiMsgIndCd5(String ediMsgIndCd5) {
		this.ediMsgIndCd5 = ediMsgIndCd5;
	}
	
	/**
	 * Column Info
	 * @param ediMsgIndCd3
	 */
	public void setEdiMsgIndCd3(String ediMsgIndCd3) {
		this.ediMsgIndCd3 = ediMsgIndCd3;
	}
	
	/**
	 * Column Info
	 * @param ediMsgIndCd4
	 */
	public void setEdiMsgIndCd4(String ediMsgIndCd4) {
		this.ediMsgIndCd4 = ediMsgIndCd4;
	}
	
	/**
	 * Column Info
	 * @param ediMsgIndCd1
	 */
	public void setEdiMsgIndCd1(String ediMsgIndCd1) {
		this.ediMsgIndCd1 = ediMsgIndCd1;
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
	 * @param ediMsgIndCd2
	 */
	public void setEdiMsgIndCd2(String ediMsgIndCd2) {
		this.ediMsgIndCd2 = ediMsgIndCd2;
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
	 * @param msgTpDesc
	 */
	public void setMsgTpDesc(String msgTpDesc) {
		this.msgTpDesc = msgTpDesc;
	}
	
	/**
	 * Column Info
	 * @param ediMsgIndCd
	 */
	public void setEdiMsgIndCd(String ediMsgIndCd) {
		this.ediMsgIndCd = ediMsgIndCd;
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
	 * @param ediMsgTpId
	 */
	public void setEdiMsgTpId(String ediMsgTpId) {
		this.ediMsgTpId = ediMsgTpId;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
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
		setEdiMsgIndCd5(JSPUtil.getParameter(request, prefix + "edi_msg_ind_cd5", ""));
		setEdiMsgIndCd3(JSPUtil.getParameter(request, prefix + "edi_msg_ind_cd3", ""));
		setEdiMsgIndCd4(JSPUtil.getParameter(request, prefix + "edi_msg_ind_cd4", ""));
		setEdiMsgIndCd1(JSPUtil.getParameter(request, prefix + "edi_msg_ind_cd1", ""));
		setTrdPrnrSubLnkSeq(JSPUtil.getParameter(request, prefix + "trd_prnr_sub_lnk_seq", ""));
		setEdiMsgIndCd2(JSPUtil.getParameter(request, prefix + "edi_msg_ind_cd2", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setMsgTpDesc(JSPUtil.getParameter(request, prefix + "msg_tp_desc", ""));
		setEdiMsgIndCd(JSPUtil.getParameter(request, prefix + "edi_msg_ind_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setEdiMsgTpId(JSPUtil.getParameter(request, prefix + "edi_msg_tp_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SearchBkgEdiSubLnkMsgListVO[]
	 */
	public SearchBkgEdiSubLnkMsgListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchBkgEdiSubLnkMsgListVO[]
	 */
	public SearchBkgEdiSubLnkMsgListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchBkgEdiSubLnkMsgListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ediMsgIndCd5 = (JSPUtil.getParameter(request, prefix	+ "edi_msg_ind_cd5", length));
			String[] ediMsgIndCd3 = (JSPUtil.getParameter(request, prefix	+ "edi_msg_ind_cd3", length));
			String[] ediMsgIndCd4 = (JSPUtil.getParameter(request, prefix	+ "edi_msg_ind_cd4", length));
			String[] ediMsgIndCd1 = (JSPUtil.getParameter(request, prefix	+ "edi_msg_ind_cd1", length));
			String[] trdPrnrSubLnkSeq = (JSPUtil.getParameter(request, prefix	+ "trd_prnr_sub_lnk_seq", length));
			String[] ediMsgIndCd2 = (JSPUtil.getParameter(request, prefix	+ "edi_msg_ind_cd2", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] msgTpDesc = (JSPUtil.getParameter(request, prefix	+ "msg_tp_desc", length));
			String[] ediMsgIndCd = (JSPUtil.getParameter(request, prefix	+ "edi_msg_ind_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ediMsgTpId = (JSPUtil.getParameter(request, prefix	+ "edi_msg_tp_id", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchBkgEdiSubLnkMsgListVO();
				if (ediMsgIndCd5[i] != null)
					model.setEdiMsgIndCd5(ediMsgIndCd5[i]);
				if (ediMsgIndCd3[i] != null)
					model.setEdiMsgIndCd3(ediMsgIndCd3[i]);
				if (ediMsgIndCd4[i] != null)
					model.setEdiMsgIndCd4(ediMsgIndCd4[i]);
				if (ediMsgIndCd1[i] != null)
					model.setEdiMsgIndCd1(ediMsgIndCd1[i]);
				if (trdPrnrSubLnkSeq[i] != null)
					model.setTrdPrnrSubLnkSeq(trdPrnrSubLnkSeq[i]);
				if (ediMsgIndCd2[i] != null)
					model.setEdiMsgIndCd2(ediMsgIndCd2[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (msgTpDesc[i] != null)
					model.setMsgTpDesc(msgTpDesc[i]);
				if (ediMsgIndCd[i] != null)
					model.setEdiMsgIndCd(ediMsgIndCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ediMsgTpId[i] != null)
					model.setEdiMsgTpId(ediMsgTpId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchBkgEdiSubLnkMsgListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchBkgEdiSubLnkMsgListVO[]
	 */
	public SearchBkgEdiSubLnkMsgListVO[] getSearchBkgEdiSubLnkMsgListVOs(){
		SearchBkgEdiSubLnkMsgListVO[] vos = (SearchBkgEdiSubLnkMsgListVO[])models.toArray(new SearchBkgEdiSubLnkMsgListVO[models.size()]);
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
		this.ediMsgIndCd5 = this.ediMsgIndCd5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediMsgIndCd3 = this.ediMsgIndCd3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediMsgIndCd4 = this.ediMsgIndCd4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediMsgIndCd1 = this.ediMsgIndCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdPrnrSubLnkSeq = this.trdPrnrSubLnkSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediMsgIndCd2 = this.ediMsgIndCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgTpDesc = this.msgTpDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediMsgIndCd = this.ediMsgIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediMsgTpId = this.ediMsgTpId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
