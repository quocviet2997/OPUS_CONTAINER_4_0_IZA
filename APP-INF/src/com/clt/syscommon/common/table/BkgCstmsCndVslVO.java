/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCstmsCndVslVO.java
*@FileTitle : BkgCstmsCndVslVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.25
*@LastModifier : 김민정
*@LastVersion : 1.0
* 2009.05.25 김민정 
* 1.0 Creation
* -------------------------------------------------------
* History
* 2013.06.10 김보배 [CHM-201324023] ACI - Vessel Arrival Transmit (A6) 화면 및 로직 보완
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.component.common.AbstractValueObject;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 김민정
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCstmsCndVslVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsCndVslVO> models = new ArrayList<BkgCstmsCndVslVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String rcvErrCtnt = null;
	/* Column Info */
	private String ackDt = null;
	/* Column Info */
	private String cndAckSubCd = null;
	/* Column Info */
	private String etaDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String cvyRefNo = null;
	/* Column Info */
	private String cgoCtrlNoPfxNm = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String cndAckCtrlNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cstmsRjctId = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String capNm = null;
	/* Column Info */
	private String vslArrRptSndDt = null;
	/* Column Info */
	private String cndAckRspnCd = null;
	/* Column Info */
	private String actArrDt = null;
	/* Column Info */
	private String vpsPortCd = null;
	/* Column Info */
	private String xptCvyRefNo = null;
	

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsCndVslVO() {}

	public BkgCstmsCndVslVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String cvyRefNo, String capNm, String etaDt, String cgoCtrlNoPfxNm, String vslArrRptSndDt, String cndAckCtrlNo, String cndAckRspnCd, String cndAckSubCd, String rcvErrCtnt, String ackDt, String cstmsRjctId, String creUsrId, String creDt, String updUsrId, String updDt, String actArrDt, String vpsPortCd, String xptCvyRefNo) {
		this.updDt = updDt;
		this.vslCd = vslCd;
		this.rcvErrCtnt = rcvErrCtnt;
		this.ackDt = ackDt;
		this.cndAckSubCd = cndAckSubCd;
		this.etaDt = etaDt;
		this.creDt = creDt;
		this.skdVoyNo = skdVoyNo;
		this.cvyRefNo = cvyRefNo;
		this.cgoCtrlNoPfxNm = cgoCtrlNoPfxNm;
		this.skdDirCd = skdDirCd;
		this.cndAckCtrlNo = cndAckCtrlNo;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.cstmsRjctId = cstmsRjctId;
		this.updUsrId = updUsrId;
		this.capNm = capNm;
		this.vslArrRptSndDt = vslArrRptSndDt;
		this.cndAckRspnCd = cndAckRspnCd;
		this.actArrDt = actArrDt;
		this.vpsPortCd = vpsPortCd;
		this.xptCvyRefNo = xptCvyRefNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("rcv_err_ctnt", getRcvErrCtnt());
		this.hashColumns.put("ack_dt", getAckDt());
		this.hashColumns.put("cnd_ack_sub_cd", getCndAckSubCd());
		this.hashColumns.put("eta_dt", getEtaDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("cvy_ref_no", getCvyRefNo());
		this.hashColumns.put("cgo_ctrl_no_pfx_nm", getCgoCtrlNoPfxNm());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("cnd_ack_ctrl_no", getCndAckCtrlNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cstms_rjct_id", getCstmsRjctId());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cap_nm", getCapNm());
		this.hashColumns.put("vsl_arr_rpt_snd_dt", getVslArrRptSndDt());
		this.hashColumns.put("cnd_ack_rspn_cd", getCndAckRspnCd());
		this.hashColumns.put("act_arr_dt", getActArrDt());
		this.hashColumns.put("vps_port_cd", getVpsPortCd());
		this.hashColumns.put("xpt_cvy_ref_no", getXptCvyRefNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("rcv_err_ctnt", "rcvErrCtnt");
		this.hashFields.put("ack_dt", "ackDt");
		this.hashFields.put("cnd_ack_sub_cd", "cndAckSubCd");
		this.hashFields.put("eta_dt", "etaDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("cvy_ref_no", "cvyRefNo");
		this.hashFields.put("cgo_ctrl_no_pfx_nm", "cgoCtrlNoPfxNm");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("cnd_ack_ctrl_no", "cndAckCtrlNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cstms_rjct_id", "cstmsRjctId");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cap_nm", "capNm");
		this.hashFields.put("vsl_arr_rpt_snd_dt", "vslArrRptSndDt");
		this.hashFields.put("cnd_ack_rspn_cd", "cndAckRspnCd");
		this.hashFields.put("act_arr_dt", "actArrDt");
		this.hashFields.put("vps_port_cd", "vpsPortCd");
		this.hashFields.put("xpt_cvy_ref_no", "xptCvyRefNo");
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
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
	}
	
	/**
	 * Column Info
	 * @return rcvErrCtnt
	 */
	public String getRcvErrCtnt() {
		return this.rcvErrCtnt;
	}
	
	/**
	 * Column Info
	 * @return ackDt
	 */
	public String getAckDt() {
		return this.ackDt;
	}
	
	/**
	 * Column Info
	 * @return cndAckSubCd
	 */
	public String getCndAckSubCd() {
		return this.cndAckSubCd;
	}
	
	/**
	 * Column Info
	 * @return etaDt
	 */
	public String getEtaDt() {
		return this.etaDt;
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
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return cvyRefNo
	 */
	public String getCvyRefNo() {
		return this.cvyRefNo;
	}
	
	/**
	 * Column Info
	 * @return cgoCtrlNoPfxNm
	 */
	public String getCgoCtrlNoPfxNm() {
		return this.cgoCtrlNoPfxNm;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	
	/**
	 * Column Info
	 * @return cndAckCtrlNo
	 */
	public String getCndAckCtrlNo() {
		return this.cndAckCtrlNo;
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
	 * @return cstmsRjctId
	 */
	public String getCstmsRjctId() {
		return this.cstmsRjctId;
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
	 * @return capNm
	 */
	public String getCapNm() {
		return this.capNm;
	}
	
	/**
	 * Column Info
	 * @return vslArrRptSndDt
	 */
	public String getVslArrRptSndDt() {
		return this.vslArrRptSndDt;
	}
	
	/**
	 * Column Info
	 * @return cndAckRspnCd
	 */
	public String getCndAckRspnCd() {
		return this.cndAckRspnCd;
	}
	
	/**
	 * Column Info
	 * @return actArrDt
	 */
	public String getActArrDt() {
		return this.actArrDt;
	}
	
	/**
	 * Column Info
	 * @return vpsPortCd
	 */
	public String getVpsPortCd() {
		return this.vpsPortCd;
	}
	
	/**
	 * Column Info
	 * @return xptCvyRefNo
	 */
	public String getXptCvyRefNo() {
		return this.xptCvyRefNo;
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
	 * @param vslCd
	 */
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
	}
	
	/**
	 * Column Info
	 * @param rcvErrCtnt
	 */
	public void setRcvErrCtnt(String rcvErrCtnt) {
		this.rcvErrCtnt = rcvErrCtnt;
	}
	
	/**
	 * Column Info
	 * @param ackDt
	 */
	public void setAckDt(String ackDt) {
		this.ackDt = ackDt;
	}
	
	/**
	 * Column Info
	 * @param cndAckSubCd
	 */
	public void setCndAckSubCd(String cndAckSubCd) {
		this.cndAckSubCd = cndAckSubCd;
	}
	
	/**
	 * Column Info
	 * @param etaDt
	 */
	public void setEtaDt(String etaDt) {
		this.etaDt = etaDt;
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
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param cvyRefNo
	 */
	public void setCvyRefNo(String cvyRefNo) {
		this.cvyRefNo = cvyRefNo;
	}
	
	/**
	 * Column Info
	 * @param cgoCtrlNoPfxNm
	 */
	public void setCgoCtrlNoPfxNm(String cgoCtrlNoPfxNm) {
		this.cgoCtrlNoPfxNm = cgoCtrlNoPfxNm;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
	}
	
	/**
	 * Column Info
	 * @param cndAckCtrlNo
	 */
	public void setCndAckCtrlNo(String cndAckCtrlNo) {
		this.cndAckCtrlNo = cndAckCtrlNo;
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
	 * @param cstmsRjctId
	 */
	public void setCstmsRjctId(String cstmsRjctId) {
		this.cstmsRjctId = cstmsRjctId;
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
	 * @param capNm
	 */
	public void setCapNm(String capNm) {
		this.capNm = capNm;
	}
	
	/**
	 * Column Info
	 * @param vslArrRptSndDt
	 */
	public void setVslArrRptSndDt(String vslArrRptSndDt) {
		this.vslArrRptSndDt = vslArrRptSndDt;
	}
	
	/**
	 * Column Info
	 * @param cndAckRspnCd
	 */
	public void setCndAckRspnCd(String cndAckRspnCd) {
		this.cndAckRspnCd = cndAckRspnCd;
	}
	
	/**
	 * Column Info
	 * @param actArrDt
	 */
	public void setActArrDt(String actArrDt) {
		this.actArrDt = actArrDt;
	}
	
	/**
	 * Column Info
	 * @param vpsPortCd
	 */
	public void setVpsPortCd(String vpsPortCd){
		this.vpsPortCd = vpsPortCd;
	}
	
	/**
	 * Column Info
	 * @param xptCvyRefNo
	 */
	public void setXptCvyRefNo(String xptCvyRefNo){
		this.xptCvyRefNo = xptCvyRefNo;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setRcvErrCtnt(JSPUtil.getParameter(request, "rcv_err_ctnt", ""));
		setAckDt(JSPUtil.getParameter(request, "ack_dt", ""));
		setCndAckSubCd(JSPUtil.getParameter(request, "cnd_ack_sub_cd", ""));
		setEtaDt(JSPUtil.getParameter(request, "eta_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setCvyRefNo(JSPUtil.getParameter(request, "cvy_ref_no", ""));
		setCgoCtrlNoPfxNm(JSPUtil.getParameter(request, "cgo_ctrl_no_pfx_nm", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setCndAckCtrlNo(JSPUtil.getParameter(request, "cnd_ack_ctrl_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCstmsRjctId(JSPUtil.getParameter(request, "cstms_rjct_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCapNm(JSPUtil.getParameter(request, "cap_nm", ""));
		setVslArrRptSndDt(JSPUtil.getParameter(request, "vsl_arr_rpt_snd_dt", ""));
		setCndAckRspnCd(JSPUtil.getParameter(request, "cnd_ack_rspn_cd", ""));
		setActArrDt(JSPUtil.getParameter(request, "act_arr_dt", ""));
		setVpsPortCd(JSPUtil.getParameter(request, "vps_port_cd", ""));
		setXptCvyRefNo(JSPUtil.getParameter(request, "xpt_cvy_ref_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsCndVslVO[]
	 */
	public BkgCstmsCndVslVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsCndVslVO[]
	 */
	public BkgCstmsCndVslVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsCndVslVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] rcvErrCtnt = (JSPUtil.getParameter(request, prefix	+ "rcv_err_ctnt".trim(), length));
			String[] ackDt = (JSPUtil.getParameter(request, prefix	+ "ack_dt".trim(), length));
			String[] cndAckSubCd = (JSPUtil.getParameter(request, prefix	+ "cnd_ack_sub_cd".trim(), length));
			String[] etaDt = (JSPUtil.getParameter(request, prefix	+ "eta_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no".trim(), length));
			String[] cvyRefNo = (JSPUtil.getParameter(request, prefix	+ "cvy_ref_no".trim(), length));
			String[] cgoCtrlNoPfxNm = (JSPUtil.getParameter(request, prefix	+ "cgo_ctrl_no_pfx_nm".trim(), length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd".trim(), length));
			String[] cndAckCtrlNo = (JSPUtil.getParameter(request, prefix	+ "cnd_ack_ctrl_no".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] cstmsRjctId = (JSPUtil.getParameter(request, prefix	+ "cstms_rjct_id".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] capNm = (JSPUtil.getParameter(request, prefix	+ "cap_nm".trim(), length));
			String[] vslArrRptSndDt = (JSPUtil.getParameter(request, prefix	+ "vsl_arr_rpt_snd_dt".trim(), length));
			String[] cndAckRspnCd = (JSPUtil.getParameter(request, prefix	+ "cnd_ack_rspn_cd".trim(), length));
			String[] actArrDt = (JSPUtil.getParameter(request, prefix	+ "act_arr_dt".trim(), length));
			String[] vpsPortCd = (JSPUtil.getParameter(request, prefix	+ "vps_port_cd".trim(), length));
			String[] xptCvyRefNo = (JSPUtil.getParameter(request, prefix	+ "xpt_cvy_ref_no".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsCndVslVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (rcvErrCtnt[i] != null)
					model.setRcvErrCtnt(rcvErrCtnt[i]);
				if (ackDt[i] != null)
					model.setAckDt(ackDt[i]);
				if (cndAckSubCd[i] != null)
					model.setCndAckSubCd(cndAckSubCd[i]);
				if (etaDt[i] != null)
					model.setEtaDt(etaDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (cvyRefNo[i] != null)
					model.setCvyRefNo(cvyRefNo[i]);
				if (cgoCtrlNoPfxNm[i] != null)
					model.setCgoCtrlNoPfxNm(cgoCtrlNoPfxNm[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (cndAckCtrlNo[i] != null)
					model.setCndAckCtrlNo(cndAckCtrlNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cstmsRjctId[i] != null)
					model.setCstmsRjctId(cstmsRjctId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (capNm[i] != null)
					model.setCapNm(capNm[i]);
				if (vslArrRptSndDt[i] != null)
					model.setVslArrRptSndDt(vslArrRptSndDt[i]);
				if (cndAckRspnCd[i] != null)
					model.setCndAckRspnCd(cndAckRspnCd[i]);
				if (actArrDt[i] != null)
					model.setActArrDt(actArrDt[i]);
				if (vpsPortCd[i] != null)
					model.setVpsPortCd(vpsPortCd[i]);
				if (xptCvyRefNo[i] != null)
					model.setXptCvyRefNo(xptCvyRefNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsCndVslVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsCndVslVO[]
	 */
	public BkgCstmsCndVslVO[] getBkgCstmsCndVslVOs(){
		BkgCstmsCndVslVO[] vos = (BkgCstmsCndVslVO[])models.toArray(new BkgCstmsCndVslVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space = "";
		try{
			for(int i = 0; i < field.length; i++){
				String[] arr = null;
				arr = getField(field, i);
				if(arr != null){
					for(int j = 0; j < arr.length; j++) {
						ret.append(field[i].getName().concat(space).substring(0, 30).concat("= ") + arr[j] + "\n");
					}
				} else {
					ret.append(field[i].getName() + " =  null \n");
				}
			}
		} catch (Exception ex) {
			return null;
		}
		return ret.toString();
	}
	
	/**
	 * 필드에 있는 값을 스트링 배열로 반환.
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = null;
		}
		return arr;
	}

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvErrCtnt = this.rcvErrCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ackDt = this.ackDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cndAckSubCd = this.cndAckSubCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.etaDt = this.etaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cvyRefNo = this.cvyRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoCtrlNoPfxNm = this.cgoCtrlNoPfxNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cndAckCtrlNo = this.cndAckCtrlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsRjctId = this.cstmsRjctId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.capNm = this.capNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslArrRptSndDt = this.vslArrRptSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cndAckRspnCd = this.cndAckRspnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actArrDt = this.actArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vpsPortCd = this.vpsPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptCvyRefNo = this.xptCvyRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
