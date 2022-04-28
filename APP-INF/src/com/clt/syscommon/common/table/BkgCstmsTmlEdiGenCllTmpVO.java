/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : BkgCstmsTmlEdiGenCllTmpVO.java
*@FileTitle : BkgCstmsTmlEdiGenCllTmpVO
*Open Issues :
*Change history :
*@LastModifyDate : 2018.06.28
*@LastModifier : 
*@LastVersion : 1.0
* 2018.06.28  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

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

public class BkgCstmsTmlEdiGenCllTmpVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsTmlEdiGenCllTmpVO> models = new ArrayList<BkgCstmsTmlEdiGenCllTmpVO>();
	
	/* Column Info */
	private String tmlEdiCtnt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String msgSnd = null;
	/* Column Info */
	private String n3rdEdiGenOrdNo = null;
	/* Column Info */
	private String n2ndEdiGenOrdNo = null;
	/* Column Info */
	private String edwUpdDt = null;
	/* Column Info */
	private String sndLogId = null;
	/* Column Info */
	private String sndDt = null;
	/* Column Info */
	private String n1stEdiGenOrdNo = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public BkgCstmsTmlEdiGenCllTmpVO() {}

	public BkgCstmsTmlEdiGenCllTmpVO(String ibflag, String pagerows, String sndLogId, String msgSnd, String sndDt, String n1stEdiGenOrdNo, String n2ndEdiGenOrdNo, String n3rdEdiGenOrdNo, String tmlEdiCtnt, String edwUpdDt) {
		this.tmlEdiCtnt = tmlEdiCtnt;
		this.ibflag = ibflag;
		this.msgSnd = msgSnd;
		this.n3rdEdiGenOrdNo = n3rdEdiGenOrdNo;
		this.n2ndEdiGenOrdNo = n2ndEdiGenOrdNo;
		this.edwUpdDt = edwUpdDt;
		this.sndLogId = sndLogId;
		this.sndDt = sndDt;
		this.n1stEdiGenOrdNo = n1stEdiGenOrdNo;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("tml_edi_ctnt", getTmlEdiCtnt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("msg_snd", getMsgSnd());
		this.hashColumns.put("n3rd_edi_gen_ord_no", getN3rdEdiGenOrdNo());
		this.hashColumns.put("n2nd_edi_gen_ord_no", getN2ndEdiGenOrdNo());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("snd_log_id", getSndLogId());
		this.hashColumns.put("snd_dt", getSndDt());
		this.hashColumns.put("n1st_edi_gen_ord_no", getN1stEdiGenOrdNo());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("tml_edi_ctnt", "tmlEdiCtnt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("msg_snd", "msgSnd");
		this.hashFields.put("n3rd_edi_gen_ord_no", "n3rdEdiGenOrdNo");
		this.hashFields.put("n2nd_edi_gen_ord_no", "n2ndEdiGenOrdNo");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("snd_log_id", "sndLogId");
		this.hashFields.put("snd_dt", "sndDt");
		this.hashFields.put("n1st_edi_gen_ord_no", "n1stEdiGenOrdNo");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return tmlEdiCtnt
	 */
	public String getTmlEdiCtnt() {
		return this.tmlEdiCtnt;
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
	 * @return msgSnd
	 */
	public String getMsgSnd() {
		return this.msgSnd;
	}
	
	/**
	 * Column Info
	 * @return n3rdEdiGenOrdNo
	 */
	public String getN3rdEdiGenOrdNo() {
		return this.n3rdEdiGenOrdNo;
	}
	
	/**
	 * Column Info
	 * @return n2ndEdiGenOrdNo
	 */
	public String getN2ndEdiGenOrdNo() {
		return this.n2ndEdiGenOrdNo;
	}
	
	/**
	 * Column Info
	 * @return edwUpdDt
	 */
	public String getEdwUpdDt() {
		return this.edwUpdDt;
	}
	
	/**
	 * Column Info
	 * @return sndLogId
	 */
	public String getSndLogId() {
		return this.sndLogId;
	}
	
	/**
	 * Column Info
	 * @return sndDt
	 */
	public String getSndDt() {
		return this.sndDt;
	}
	
	/**
	 * Column Info
	 * @return n1stEdiGenOrdNo
	 */
	public String getN1stEdiGenOrdNo() {
		return this.n1stEdiGenOrdNo;
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
	 * @param tmlEdiCtnt
	 */
	public void setTmlEdiCtnt(String tmlEdiCtnt) {
		this.tmlEdiCtnt = tmlEdiCtnt;
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
	 * @param msgSnd
	 */
	public void setMsgSnd(String msgSnd) {
		this.msgSnd = msgSnd;
	}
	
	/**
	 * Column Info
	 * @param n3rdEdiGenOrdNo
	 */
	public void setN3rdEdiGenOrdNo(String n3rdEdiGenOrdNo) {
		this.n3rdEdiGenOrdNo = n3rdEdiGenOrdNo;
	}
	
	/**
	 * Column Info
	 * @param n2ndEdiGenOrdNo
	 */
	public void setN2ndEdiGenOrdNo(String n2ndEdiGenOrdNo) {
		this.n2ndEdiGenOrdNo = n2ndEdiGenOrdNo;
	}
	
	/**
	 * Column Info
	 * @param edwUpdDt
	 */
	public void setEdwUpdDt(String edwUpdDt) {
		this.edwUpdDt = edwUpdDt;
	}
	
	/**
	 * Column Info
	 * @param sndLogId
	 */
	public void setSndLogId(String sndLogId) {
		this.sndLogId = sndLogId;
	}
	
	/**
	 * Column Info
	 * @param sndDt
	 */
	public void setSndDt(String sndDt) {
		this.sndDt = sndDt;
	}
	
	/**
	 * Column Info
	 * @param n1stEdiGenOrdNo
	 */
	public void setN1stEdiGenOrdNo(String n1stEdiGenOrdNo) {
		this.n1stEdiGenOrdNo = n1stEdiGenOrdNo;
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
		setTmlEdiCtnt(JSPUtil.getParameter(request, prefix + "tml_edi_ctnt", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setMsgSnd(JSPUtil.getParameter(request, prefix + "msg_snd", ""));
		setN3rdEdiGenOrdNo(JSPUtil.getParameter(request, prefix + "n3rd_edi_gen_ord_no", ""));
		setN2ndEdiGenOrdNo(JSPUtil.getParameter(request, prefix + "n2nd_edi_gen_ord_no", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setSndLogId(JSPUtil.getParameter(request, prefix + "snd_log_id", ""));
		setSndDt(JSPUtil.getParameter(request, prefix + "snd_dt", ""));
		setN1stEdiGenOrdNo(JSPUtil.getParameter(request, prefix + "n1st_edi_gen_ord_no", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsTmlEdiGenCllTmpVO[]
	 */
	public BkgCstmsTmlEdiGenCllTmpVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsTmlEdiGenCllTmpVO[]
	 */
	public BkgCstmsTmlEdiGenCllTmpVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsTmlEdiGenCllTmpVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] tmlEdiCtnt = (JSPUtil.getParameter(request, prefix	+ "tml_edi_ctnt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] msgSnd = (JSPUtil.getParameter(request, prefix	+ "msg_snd", length));
			String[] n3rdEdiGenOrdNo = (JSPUtil.getParameter(request, prefix	+ "n3rd_edi_gen_ord_no", length));
			String[] n2ndEdiGenOrdNo = (JSPUtil.getParameter(request, prefix	+ "n2nd_edi_gen_ord_no", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix	+ "edw_upd_dt", length));
			String[] sndLogId = (JSPUtil.getParameter(request, prefix	+ "snd_log_id", length));
			String[] sndDt = (JSPUtil.getParameter(request, prefix	+ "snd_dt", length));
			String[] n1stEdiGenOrdNo = (JSPUtil.getParameter(request, prefix	+ "n1st_edi_gen_ord_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsTmlEdiGenCllTmpVO();
				if (tmlEdiCtnt[i] != null)
					model.setTmlEdiCtnt(tmlEdiCtnt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (msgSnd[i] != null)
					model.setMsgSnd(msgSnd[i]);
				if (n3rdEdiGenOrdNo[i] != null)
					model.setN3rdEdiGenOrdNo(n3rdEdiGenOrdNo[i]);
				if (n2ndEdiGenOrdNo[i] != null)
					model.setN2ndEdiGenOrdNo(n2ndEdiGenOrdNo[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
				if (sndLogId[i] != null)
					model.setSndLogId(sndLogId[i]);
				if (sndDt[i] != null)
					model.setSndDt(sndDt[i]);
				if (n1stEdiGenOrdNo[i] != null)
					model.setN1stEdiGenOrdNo(n1stEdiGenOrdNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsTmlEdiGenCllTmpVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsTmlEdiGenCllTmpVO[]
	 */
	public BkgCstmsTmlEdiGenCllTmpVO[] getBkgCstmsTmlEdiGenCllTmpVOs(){
		BkgCstmsTmlEdiGenCllTmpVO[] vos = (BkgCstmsTmlEdiGenCllTmpVO[])models.toArray(new BkgCstmsTmlEdiGenCllTmpVO[models.size()]);
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
		this.tmlEdiCtnt = this.tmlEdiCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgSnd = this.msgSnd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdEdiGenOrdNo = this.n3rdEdiGenOrdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndEdiGenOrdNo = this.n2ndEdiGenOrdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndLogId = this.sndLogId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndDt = this.sndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stEdiGenOrdNo = this.n1stEdiGenOrdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
