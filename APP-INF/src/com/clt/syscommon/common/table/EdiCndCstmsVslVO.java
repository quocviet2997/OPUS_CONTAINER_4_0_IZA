/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EdiCndCstmsVslVO.java
*@FileTitle : EdiCndCstmsVslVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.14
*@LastModifier : 
*@LastVersion : 1.0
* 2009.09.14  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

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

public class EdiCndCstmsVslVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EdiCndCstmsVslVO> models = new ArrayList<EdiCndCstmsVslVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String cvyMrnNo = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String rcvErrMsg = null;
	/* Column Info */
	private String cndCstmsRjctCd = null;
	/* Column Info */
	private String vslArrRptSntDt = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String cvyAckNo = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cvyAckCtrlNo = null;
	/* Column Info */
	private String cvyCapNm = null;
	/* Column Info */
	private String cvyAckCd = null;
	/* Column Info */
	private String rspnRcvDt = null;
	/* Column Info */
	private String cvyEtaDt = null;
	/* Column Info */
	private String vslCvyNo = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EdiCndCstmsVslVO() {}

	public EdiCndCstmsVslVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String cvyMrnNo, String cvyCapNm, String cvyEtaDt, String vslCvyNo, String updUsrId, String updDt, String vslArrRptSntDt, String cvyAckCtrlNo, String cvyAckCd, String cvyAckNo, String rcvErrMsg, String rspnRcvDt, String cndCstmsRjctCd, String eaiEvntDt) {
		this.updDt = updDt;
		this.vslCd = vslCd;
		this.cvyMrnNo = cvyMrnNo;
		this.skdVoyNo = skdVoyNo;
		this.eaiEvntDt = eaiEvntDt;
		this.rcvErrMsg = rcvErrMsg;
		this.cndCstmsRjctCd = cndCstmsRjctCd;
		this.vslArrRptSntDt = vslArrRptSntDt;
		this.skdDirCd = skdDirCd;
		this.cvyAckNo = cvyAckNo;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.cvyAckCtrlNo = cvyAckCtrlNo;
		this.cvyCapNm = cvyCapNm;
		this.cvyAckCd = cvyAckCd;
		this.rspnRcvDt = rspnRcvDt;
		this.cvyEtaDt = cvyEtaDt;
		this.vslCvyNo = vslCvyNo;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("cvy_mrn_no", getCvyMrnNo());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("rcv_err_msg", getRcvErrMsg());
		this.hashColumns.put("cnd_cstms_rjct_cd", getCndCstmsRjctCd());
		this.hashColumns.put("vsl_arr_rpt_snt_dt", getVslArrRptSntDt());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("cvy_ack_no", getCvyAckNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cvy_ack_ctrl_no", getCvyAckCtrlNo());
		this.hashColumns.put("cvy_cap_nm", getCvyCapNm());
		this.hashColumns.put("cvy_ack_cd", getCvyAckCd());
		this.hashColumns.put("rspn_rcv_dt", getRspnRcvDt());
		this.hashColumns.put("cvy_eta_dt", getCvyEtaDt());
		this.hashColumns.put("vsl_cvy_no", getVslCvyNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("cvy_mrn_no", "cvyMrnNo");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("rcv_err_msg", "rcvErrMsg");
		this.hashFields.put("cnd_cstms_rjct_cd", "cndCstmsRjctCd");
		this.hashFields.put("vsl_arr_rpt_snt_dt", "vslArrRptSntDt");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("cvy_ack_no", "cvyAckNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cvy_ack_ctrl_no", "cvyAckCtrlNo");
		this.hashFields.put("cvy_cap_nm", "cvyCapNm");
		this.hashFields.put("cvy_ack_cd", "cvyAckCd");
		this.hashFields.put("rspn_rcv_dt", "rspnRcvDt");
		this.hashFields.put("cvy_eta_dt", "cvyEtaDt");
		this.hashFields.put("vsl_cvy_no", "vslCvyNo");
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
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
	}
	
	/**
	 * Column Info
	 * @return cvyMrnNo
	 */
	public String getCvyMrnNo() {
		return this.cvyMrnNo;
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
	 * @return eaiEvntDt
	 */
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @return rcvErrMsg
	 */
	public String getRcvErrMsg() {
		return this.rcvErrMsg;
	}
	
	/**
	 * Column Info
	 * @return cndCstmsRjctCd
	 */
	public String getCndCstmsRjctCd() {
		return this.cndCstmsRjctCd;
	}
	
	/**
	 * Column Info
	 * @return vslArrRptSntDt
	 */
	public String getVslArrRptSntDt() {
		return this.vslArrRptSntDt;
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
	 * @return cvyAckNo
	 */
	public String getCvyAckNo() {
		return this.cvyAckNo;
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
	 * @return cvyAckCtrlNo
	 */
	public String getCvyAckCtrlNo() {
		return this.cvyAckCtrlNo;
	}
	
	/**
	 * Column Info
	 * @return cvyCapNm
	 */
	public String getCvyCapNm() {
		return this.cvyCapNm;
	}
	
	/**
	 * Column Info
	 * @return cvyAckCd
	 */
	public String getCvyAckCd() {
		return this.cvyAckCd;
	}
	
	/**
	 * Column Info
	 * @return rspnRcvDt
	 */
	public String getRspnRcvDt() {
		return this.rspnRcvDt;
	}
	
	/**
	 * Column Info
	 * @return cvyEtaDt
	 */
	public String getCvyEtaDt() {
		return this.cvyEtaDt;
	}
	
	/**
	 * Column Info
	 * @return vslCvyNo
	 */
	public String getVslCvyNo() {
		return this.vslCvyNo;
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
	 * @param vslCd
	 */
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
	}
	
	/**
	 * Column Info
	 * @param cvyMrnNo
	 */
	public void setCvyMrnNo(String cvyMrnNo) {
		this.cvyMrnNo = cvyMrnNo;
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
	 * @param eaiEvntDt
	 */
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @param rcvErrMsg
	 */
	public void setRcvErrMsg(String rcvErrMsg) {
		this.rcvErrMsg = rcvErrMsg;
	}
	
	/**
	 * Column Info
	 * @param cndCstmsRjctCd
	 */
	public void setCndCstmsRjctCd(String cndCstmsRjctCd) {
		this.cndCstmsRjctCd = cndCstmsRjctCd;
	}
	
	/**
	 * Column Info
	 * @param vslArrRptSntDt
	 */
	public void setVslArrRptSntDt(String vslArrRptSntDt) {
		this.vslArrRptSntDt = vslArrRptSntDt;
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
	 * @param cvyAckNo
	 */
	public void setCvyAckNo(String cvyAckNo) {
		this.cvyAckNo = cvyAckNo;
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
	 * @param cvyAckCtrlNo
	 */
	public void setCvyAckCtrlNo(String cvyAckCtrlNo) {
		this.cvyAckCtrlNo = cvyAckCtrlNo;
	}
	
	/**
	 * Column Info
	 * @param cvyCapNm
	 */
	public void setCvyCapNm(String cvyCapNm) {
		this.cvyCapNm = cvyCapNm;
	}
	
	/**
	 * Column Info
	 * @param cvyAckCd
	 */
	public void setCvyAckCd(String cvyAckCd) {
		this.cvyAckCd = cvyAckCd;
	}
	
	/**
	 * Column Info
	 * @param rspnRcvDt
	 */
	public void setRspnRcvDt(String rspnRcvDt) {
		this.rspnRcvDt = rspnRcvDt;
	}
	
	/**
	 * Column Info
	 * @param cvyEtaDt
	 */
	public void setCvyEtaDt(String cvyEtaDt) {
		this.cvyEtaDt = cvyEtaDt;
	}
	
	/**
	 * Column Info
	 * @param vslCvyNo
	 */
	public void setVslCvyNo(String vslCvyNo) {
		this.vslCvyNo = vslCvyNo;
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
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setCvyMrnNo(JSPUtil.getParameter(request, "cvy_mrn_no", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setRcvErrMsg(JSPUtil.getParameter(request, "rcv_err_msg", ""));
		setCndCstmsRjctCd(JSPUtil.getParameter(request, "cnd_cstms_rjct_cd", ""));
		setVslArrRptSntDt(JSPUtil.getParameter(request, "vsl_arr_rpt_snt_dt", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setCvyAckNo(JSPUtil.getParameter(request, "cvy_ack_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCvyAckCtrlNo(JSPUtil.getParameter(request, "cvy_ack_ctrl_no", ""));
		setCvyCapNm(JSPUtil.getParameter(request, "cvy_cap_nm", ""));
		setCvyAckCd(JSPUtil.getParameter(request, "cvy_ack_cd", ""));
		setRspnRcvDt(JSPUtil.getParameter(request, "rspn_rcv_dt", ""));
		setCvyEtaDt(JSPUtil.getParameter(request, "cvy_eta_dt", ""));
		setVslCvyNo(JSPUtil.getParameter(request, "vsl_cvy_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EdiCndCstmsVslVO[]
	 */
	public EdiCndCstmsVslVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EdiCndCstmsVslVO[]
	 */
	public EdiCndCstmsVslVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EdiCndCstmsVslVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] cvyMrnNo = (JSPUtil.getParameter(request, prefix	+ "cvy_mrn_no", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] rcvErrMsg = (JSPUtil.getParameter(request, prefix	+ "rcv_err_msg", length));
			String[] cndCstmsRjctCd = (JSPUtil.getParameter(request, prefix	+ "cnd_cstms_rjct_cd", length));
			String[] vslArrRptSntDt = (JSPUtil.getParameter(request, prefix	+ "vsl_arr_rpt_snt_dt", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] cvyAckNo = (JSPUtil.getParameter(request, prefix	+ "cvy_ack_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cvyAckCtrlNo = (JSPUtil.getParameter(request, prefix	+ "cvy_ack_ctrl_no", length));
			String[] cvyCapNm = (JSPUtil.getParameter(request, prefix	+ "cvy_cap_nm", length));
			String[] cvyAckCd = (JSPUtil.getParameter(request, prefix	+ "cvy_ack_cd", length));
			String[] rspnRcvDt = (JSPUtil.getParameter(request, prefix	+ "rspn_rcv_dt", length));
			String[] cvyEtaDt = (JSPUtil.getParameter(request, prefix	+ "cvy_eta_dt", length));
			String[] vslCvyNo = (JSPUtil.getParameter(request, prefix	+ "vsl_cvy_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new EdiCndCstmsVslVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (cvyMrnNo[i] != null)
					model.setCvyMrnNo(cvyMrnNo[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (rcvErrMsg[i] != null)
					model.setRcvErrMsg(rcvErrMsg[i]);
				if (cndCstmsRjctCd[i] != null)
					model.setCndCstmsRjctCd(cndCstmsRjctCd[i]);
				if (vslArrRptSntDt[i] != null)
					model.setVslArrRptSntDt(vslArrRptSntDt[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (cvyAckNo[i] != null)
					model.setCvyAckNo(cvyAckNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cvyAckCtrlNo[i] != null)
					model.setCvyAckCtrlNo(cvyAckCtrlNo[i]);
				if (cvyCapNm[i] != null)
					model.setCvyCapNm(cvyCapNm[i]);
				if (cvyAckCd[i] != null)
					model.setCvyAckCd(cvyAckCd[i]);
				if (rspnRcvDt[i] != null)
					model.setRspnRcvDt(rspnRcvDt[i]);
				if (cvyEtaDt[i] != null)
					model.setCvyEtaDt(cvyEtaDt[i]);
				if (vslCvyNo[i] != null)
					model.setVslCvyNo(vslCvyNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEdiCndCstmsVslVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EdiCndCstmsVslVO[]
	 */
	public EdiCndCstmsVslVO[] getEdiCndCstmsVslVOs(){
		EdiCndCstmsVslVO[] vos = (EdiCndCstmsVslVO[])models.toArray(new EdiCndCstmsVslVO[models.size()]);
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
		this.cvyMrnNo = this.cvyMrnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvErrMsg = this.rcvErrMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cndCstmsRjctCd = this.cndCstmsRjctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslArrRptSntDt = this.vslArrRptSntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cvyAckNo = this.cvyAckNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cvyAckCtrlNo = this.cvyAckCtrlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cvyCapNm = this.cvyCapNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cvyAckCd = this.cvyAckCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rspnRcvDt = this.rspnRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cvyEtaDt = this.cvyEtaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCvyNo = this.vslCvyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
