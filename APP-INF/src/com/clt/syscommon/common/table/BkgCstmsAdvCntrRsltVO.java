/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : BkgCstmsAdvCntrRsltVO.java
*@FileTitle : BkgCstmsAdvCntrRsltVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.05.07
*@LastModifier : 김민정
*@LastVersion : 1.0
* 2010.05.07 김민정 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

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
 * @author 김민정
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCstmsAdvCntrRsltVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsAdvCntrRsltVO> models = new ArrayList<BkgCstmsAdvCntrRsltVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String prtBlNo = null;
	/* Column Info */
	private String cstmsClrCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String dspoCd = null;
	/* Column Info */
	private String preCstmsClrCd = null;
	/* Column Info */
	private String entrTpNo = null;
	/* Column Info */
	private String blNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String railRefNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String cstmsRmk1 = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String rcvDt = null;
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String cstmsBatNo = null;
	/* Column Info */
	private String rcvMsgTpId = null;
	/* Column Info */
	private String cntrQty = null;
	/* Column Info */
	private String entrNo = null;
	/* Column Info */
	private String cstmsSeq = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsAdvCntrRsltVO() {}

	public BkgCstmsAdvCntrRsltVO(String ibflag, String pagerows, String cntCd, String blNo, String cstmsSeq, String cntrNo, String rcvMsgTpId, String dspoCd, String cntrQty, String entrTpNo, String entrNo, String rcvDt, String cstmsClrCd, String railRefNo, String cstmsBatNo, String cstmsRmk1, String creUsrId, String creDt, String updUsrId, String updDt, String preCstmsClrCd, String prtBlNo) {
		this.updDt = updDt;
		this.prtBlNo = prtBlNo;
		this.cstmsClrCd = cstmsClrCd;
		this.creDt = creDt;
		this.dspoCd = dspoCd;
		this.preCstmsClrCd = preCstmsClrCd;
		this.entrTpNo = entrTpNo;
		this.blNo = blNo;
		this.pagerows = pagerows;
		this.railRefNo = railRefNo;
		this.creUsrId = creUsrId;
		this.cstmsRmk1 = cstmsRmk1;
		this.ibflag = ibflag;
		this.cntrNo = cntrNo;
		this.rcvDt = rcvDt;
		this.cntCd = cntCd;
		this.cstmsBatNo = cstmsBatNo;
		this.rcvMsgTpId = rcvMsgTpId;
		this.cntrQty = cntrQty;
		this.entrNo = entrNo;
		this.cstmsSeq = cstmsSeq;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("prt_bl_no", getPrtBlNo());
		this.hashColumns.put("cstms_clr_cd", getCstmsClrCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("dspo_cd", getDspoCd());
		this.hashColumns.put("pre_cstms_clr_cd", getPreCstmsClrCd());
		this.hashColumns.put("entr_tp_no", getEntrTpNo());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("rail_ref_no", getRailRefNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cstms_rmk1", getCstmsRmk1());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("rcv_dt", getRcvDt());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("cstms_bat_no", getCstmsBatNo());
		this.hashColumns.put("rcv_msg_tp_id", getRcvMsgTpId());
		this.hashColumns.put("cntr_qty", getCntrQty());
		this.hashColumns.put("entr_no", getEntrNo());
		this.hashColumns.put("cstms_seq", getCstmsSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("prt_bl_no", "prtBlNo");
		this.hashFields.put("cstms_clr_cd", "cstmsClrCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("dspo_cd", "dspoCd");
		this.hashFields.put("pre_cstms_clr_cd", "preCstmsClrCd");
		this.hashFields.put("entr_tp_no", "entrTpNo");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("rail_ref_no", "railRefNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cstms_rmk1", "cstmsRmk1");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("rcv_dt", "rcvDt");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("cstms_bat_no", "cstmsBatNo");
		this.hashFields.put("rcv_msg_tp_id", "rcvMsgTpId");
		this.hashFields.put("cntr_qty", "cntrQty");
		this.hashFields.put("entr_no", "entrNo");
		this.hashFields.put("cstms_seq", "cstmsSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		return this.hashFields;
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
	 * @return prtBlNo
	 */
	public String getPrtBlNo() {
		return this.prtBlNo;
	}
	
	/**
	 * Column Info
	 * @return cstmsClrCd
	 */
	public String getCstmsClrCd() {
		return this.cstmsClrCd;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return dspoCd
	 */
	public String getDspoCd() {
		return this.dspoCd;
	}
	
	/**
	 * Column Info
	 * @return preCstmsClrCd
	 */
	public String getPreCstmsClrCd() {
		return this.preCstmsClrCd;
	}
	
	/**
	 * Column Info
	 * @return entrTpNo
	 */
	public String getEntrTpNo() {
		return this.entrTpNo;
	}
	
	/**
	 * Column Info
	 * @return blNo
	 */
	public String getBlNo() {
		return this.blNo;
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
	 * @return railRefNo
	 */
	public String getRailRefNo() {
		return this.railRefNo;
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
	 * @return cstmsRmk1
	 */
	public String getCstmsRmk1() {
		return this.cstmsRmk1;
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
	 * @return cntrNo
	 */
	public String getCntrNo() {
		return this.cntrNo;
	}
	
	/**
	 * Column Info
	 * @return rcvDt
	 */
	public String getRcvDt() {
		return this.rcvDt;
	}
	
	/**
	 * Column Info
	 * @return cntCd
	 */
	public String getCntCd() {
		return this.cntCd;
	}
	
	/**
	 * Column Info
	 * @return cstmsBatNo
	 */
	public String getCstmsBatNo() {
		return this.cstmsBatNo;
	}
	
	/**
	 * Column Info
	 * @return rcvMsgTpId
	 */
	public String getRcvMsgTpId() {
		return this.rcvMsgTpId;
	}
	
	/**
	 * Column Info
	 * @return cntrQty
	 */
	public String getCntrQty() {
		return this.cntrQty;
	}
	
	/**
	 * Column Info
	 * @return entrNo
	 */
	public String getEntrNo() {
		return this.entrNo;
	}
	
	/**
	 * Column Info
	 * @return cstmsSeq
	 */
	public String getCstmsSeq() {
		return this.cstmsSeq;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param prtBlNo
	 */
	public void setPrtBlNo(String prtBlNo) {
		this.prtBlNo = prtBlNo;
	}
	
	/**
	 * Column Info
	 * @param cstmsClrCd
	 */
	public void setCstmsClrCd(String cstmsClrCd) {
		this.cstmsClrCd = cstmsClrCd;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param dspoCd
	 */
	public void setDspoCd(String dspoCd) {
		this.dspoCd = dspoCd;
	}
	
	/**
	 * Column Info
	 * @param preCstmsClrCd
	 */
	public void setPreCstmsClrCd(String preCstmsClrCd) {
		this.preCstmsClrCd = preCstmsClrCd;
	}
	
	/**
	 * Column Info
	 * @param entrTpNo
	 */
	public void setEntrTpNo(String entrTpNo) {
		this.entrTpNo = entrTpNo;
	}
	
	/**
	 * Column Info
	 * @param blNo
	 */
	public void setBlNo(String blNo) {
		this.blNo = blNo;
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
	 * @param railRefNo
	 */
	public void setRailRefNo(String railRefNo) {
		this.railRefNo = railRefNo;
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
	 * @param cstmsRmk1
	 */
	public void setCstmsRmk1(String cstmsRmk1) {
		this.cstmsRmk1 = cstmsRmk1;
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
	 * @param cntrNo
	 */
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
	}
	
	/**
	 * Column Info
	 * @param rcvDt
	 */
	public void setRcvDt(String rcvDt) {
		this.rcvDt = rcvDt;
	}
	
	/**
	 * Column Info
	 * @param cntCd
	 */
	public void setCntCd(String cntCd) {
		this.cntCd = cntCd;
	}
	
	/**
	 * Column Info
	 * @param cstmsBatNo
	 */
	public void setCstmsBatNo(String cstmsBatNo) {
		this.cstmsBatNo = cstmsBatNo;
	}
	
	/**
	 * Column Info
	 * @param rcvMsgTpId
	 */
	public void setRcvMsgTpId(String rcvMsgTpId) {
		this.rcvMsgTpId = rcvMsgTpId;
	}
	
	/**
	 * Column Info
	 * @param cntrQty
	 */
	public void setCntrQty(String cntrQty) {
		this.cntrQty = cntrQty;
	}
	
	/**
	 * Column Info
	 * @param entrNo
	 */
	public void setEntrNo(String entrNo) {
		this.entrNo = entrNo;
	}
	
	/**
	 * Column Info
	 * @param cstmsSeq
	 */
	public void setCstmsSeq(String cstmsSeq) {
		this.cstmsSeq = cstmsSeq;
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
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setPrtBlNo(JSPUtil.getParameter(request, prefix + "prt_bl_no", ""));
		setCstmsClrCd(JSPUtil.getParameter(request, prefix + "cstms_clr_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setDspoCd(JSPUtil.getParameter(request, prefix + "dspo_cd", ""));
		setPreCstmsClrCd(JSPUtil.getParameter(request, prefix + "pre_cstms_clr_cd", ""));
		setEntrTpNo(JSPUtil.getParameter(request, prefix + "entr_tp_no", ""));
		setBlNo(JSPUtil.getParameter(request, prefix + "bl_no", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setRailRefNo(JSPUtil.getParameter(request, prefix + "rail_ref_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setCstmsRmk1(JSPUtil.getParameter(request, prefix + "cstms_rmk1", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCntrNo(JSPUtil.getParameter(request, prefix + "cntr_no", ""));
		setRcvDt(JSPUtil.getParameter(request, prefix + "rcv_dt", ""));
		setCntCd(JSPUtil.getParameter(request, prefix + "cnt_cd", ""));
		setCstmsBatNo(JSPUtil.getParameter(request, prefix + "cstms_bat_no", ""));
		setRcvMsgTpId(JSPUtil.getParameter(request, prefix + "rcv_msg_tp_id", ""));
		setCntrQty(JSPUtil.getParameter(request, prefix + "cntr_qty", ""));
		setEntrNo(JSPUtil.getParameter(request, prefix + "entr_no", ""));
		setCstmsSeq(JSPUtil.getParameter(request, prefix + "cstms_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsAdvCntrRsltVO[]
	 */
	public BkgCstmsAdvCntrRsltVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsAdvCntrRsltVO[]
	 */
	public BkgCstmsAdvCntrRsltVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsAdvCntrRsltVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] prtBlNo = (JSPUtil.getParameter(request, prefix	+ "prt_bl_no", length));
			String[] cstmsClrCd = (JSPUtil.getParameter(request, prefix	+ "cstms_clr_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] dspoCd = (JSPUtil.getParameter(request, prefix	+ "dspo_cd", length));
			String[] preCstmsClrCd = (JSPUtil.getParameter(request, prefix	+ "pre_cstms_clr_cd", length));
			String[] entrTpNo = (JSPUtil.getParameter(request, prefix	+ "entr_tp_no", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] railRefNo = (JSPUtil.getParameter(request, prefix	+ "rail_ref_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] cstmsRmk1 = (JSPUtil.getParameter(request, prefix	+ "cstms_rmk1", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] rcvDt = (JSPUtil.getParameter(request, prefix	+ "rcv_dt", length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd", length));
			String[] cstmsBatNo = (JSPUtil.getParameter(request, prefix	+ "cstms_bat_no", length));
			String[] rcvMsgTpId = (JSPUtil.getParameter(request, prefix	+ "rcv_msg_tp_id", length));
			String[] cntrQty = (JSPUtil.getParameter(request, prefix	+ "cntr_qty", length));
			String[] entrNo = (JSPUtil.getParameter(request, prefix	+ "entr_no", length));
			String[] cstmsSeq = (JSPUtil.getParameter(request, prefix	+ "cstms_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsAdvCntrRsltVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (prtBlNo[i] != null)
					model.setPrtBlNo(prtBlNo[i]);
				if (cstmsClrCd[i] != null)
					model.setCstmsClrCd(cstmsClrCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (dspoCd[i] != null)
					model.setDspoCd(dspoCd[i]);
				if (preCstmsClrCd[i] != null)
					model.setPreCstmsClrCd(preCstmsClrCd[i]);
				if (entrTpNo[i] != null)
					model.setEntrTpNo(entrTpNo[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (railRefNo[i] != null)
					model.setRailRefNo(railRefNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (cstmsRmk1[i] != null)
					model.setCstmsRmk1(cstmsRmk1[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (rcvDt[i] != null)
					model.setRcvDt(rcvDt[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (cstmsBatNo[i] != null)
					model.setCstmsBatNo(cstmsBatNo[i]);
				if (rcvMsgTpId[i] != null)
					model.setRcvMsgTpId(rcvMsgTpId[i]);
				if (cntrQty[i] != null)
					model.setCntrQty(cntrQty[i]);
				if (entrNo[i] != null)
					model.setEntrNo(entrNo[i]);
				if (cstmsSeq[i] != null)
					model.setCstmsSeq(cstmsSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsAdvCntrRsltVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsAdvCntrRsltVO[]
	 */
	public BkgCstmsAdvCntrRsltVO[] getBkgCstmsAdvCntrRsltVOs(){
		BkgCstmsAdvCntrRsltVO[] vos = (BkgCstmsAdvCntrRsltVO[])models.toArray(new BkgCstmsAdvCntrRsltVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prtBlNo = this.prtBlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsClrCd = this.cstmsClrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dspoCd = this.dspoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preCstmsClrCd = this.preCstmsClrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.entrTpNo = this.entrTpNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railRefNo = this.railRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsRmk1 = this.cstmsRmk1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvDt = this.rcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsBatNo = this.cstmsBatNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvMsgTpId = this.rcvMsgTpId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrQty = this.cntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.entrNo = this.entrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsSeq = this.cstmsSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
