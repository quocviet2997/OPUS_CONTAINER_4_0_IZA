/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CreatorVO.java
*@FileTitle : CreatorVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.11
*@LastModifier : 손윤석
*@LastVersion : 1.0
* 2009.06.11 손윤석 
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
 * @author 손윤석
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCstmsKrDlHisVO extends AbstractValueObject {

private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsKrDlHisVO> models = new ArrayList<BkgCstmsKrDlHisVO>();
	
	/* Column Info */
	private String dt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String polLoc = null;
	/* Column Info */
	private String deleteBlCnt = null;
	/* Column Info */
	private String inBound = null;
	/* Column Info */
	private String txtVvd = null;
	/* Column Info */
	private String radDat = null;
	/* Column Info */
	private String userid = null;
	/* Column Info */
	private String mrn = null;
	/* Column Info */
	private String kcdTp = null;
	/* Column Info */
	private String mrnNo = null;
	/* Column Info */
	private String actionTime = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String vvdCd = null;
	/* Column Info */
	private String txtPol = null;
	/* Column Info */
	private String pol = null;
	/* Column Info */
	private String userName = null;
	/* Column Info */
	private String dateFrom = null;
	/* Column Info */
	private String ktPort = null;
	/* Column Info */
	private String txtPod = null;
	/* Column Info */
	private String radMrn = null;
	/* Column Info */
	private String pod = null;
	/* Column Info */
	private String office = null;
	/* Column Info */
	private String mrnChkNo = null;
	/* Column Info */
	private String kdhSeq = null;
	/* Column Info */
	private String dateTo = null;
	/* Column Info */
	private String dt2 = null;
	/* Column Info */
	private String txtMrn = null;
	/* Column Info */
	private String deleteRow = null;
	/* Column Info */
	private String podLoc = null;
	/* Column Info */
	private String radVvd = null;
	/* Column Info */
	private String mrnChk = null;
	/* Column Info */
	private String vvd = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String blcount = null;
	/* Column Info */
	private String ac = null;
	/* Column Info */
	private String mrnNbr = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsKrDlHisVO() {}

	public BkgCstmsKrDlHisVO(String ibflag, String pagerows, String dt, String deleteBlCnt, String txtVvd, String userid, String radDat, String mrn, String txtPol, String pol, String userName, String dateFrom, String txtPod, String radMrn, String pod, String office, String kdhSeq, String dateTo, String dt2, String txtMrn, String radVvd, String vvd, String blcount, String ac, String mrnNbr, String mrnChk, String actionTime, String vvdCd, String inBound, String polLoc, String podLoc, String bkgNo, String ktPort, String kcdTp, String vslCd, String mrnNo, String mrnChkNo, String deleteRow) {
		this.dt = dt;
		this.vslCd = vslCd;
		this.polLoc = polLoc;
		this.deleteBlCnt = deleteBlCnt;
		this.inBound = inBound;
		this.txtVvd = txtVvd;
		this.radDat = radDat;
		this.userid = userid;
		this.mrn = mrn;
		this.kcdTp = kcdTp;
		this.mrnNo = mrnNo;
		this.actionTime = actionTime;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.vvdCd = vvdCd;
		this.txtPol = txtPol;
		this.pol = pol;
		this.userName = userName;
		this.dateFrom = dateFrom;
		this.ktPort = ktPort;
		this.txtPod = txtPod;
		this.radMrn = radMrn;
		this.pod = pod;
		this.office = office;
		this.mrnChkNo = mrnChkNo;
		this.kdhSeq = kdhSeq;
		this.dateTo = dateTo;
		this.dt2 = dt2;
		this.txtMrn = txtMrn;
		this.deleteRow = deleteRow;
		this.podLoc = podLoc;
		this.radVvd = radVvd;
		this.mrnChk = mrnChk;
		this.vvd = vvd;
		this.bkgNo = bkgNo;
		this.blcount = blcount;
		this.ac = ac;
		this.mrnNbr = mrnNbr;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("dt", getDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("pol_loc", getPolLoc());
		this.hashColumns.put("delete_bl_cnt", getDeleteBlCnt());
		this.hashColumns.put("in_bound", getInBound());
		this.hashColumns.put("txt_vvd", getTxtVvd());
		this.hashColumns.put("rad_dat", getRadDat());
		this.hashColumns.put("userid", getUserid());
		this.hashColumns.put("mrn", getMrn());
		this.hashColumns.put("kcd_tp", getKcdTp());
		this.hashColumns.put("mrn_no", getMrnNo());
		this.hashColumns.put("action_time", getActionTime());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vvd_cd", getVvdCd());
		this.hashColumns.put("txt_pol", getTxtPol());
		this.hashColumns.put("pol", getPol());
		this.hashColumns.put("user_name", getUserName());
		this.hashColumns.put("date_from", getDateFrom());
		this.hashColumns.put("kt_port", getKtPort());
		this.hashColumns.put("txt_pod", getTxtPod());
		this.hashColumns.put("rad_mrn", getRadMrn());
		this.hashColumns.put("pod", getPod());
		this.hashColumns.put("office", getOffice());
		this.hashColumns.put("mrn_chk_no", getMrnChkNo());
		this.hashColumns.put("kdh_seq", getKdhSeq());
		this.hashColumns.put("date_to", getDateTo());
		this.hashColumns.put("dt2", getDt2());
		this.hashColumns.put("txt_mrn", getTxtMrn());
		this.hashColumns.put("delete_row", getDeleteRow());
		this.hashColumns.put("pod_loc", getPodLoc());
		this.hashColumns.put("rad_vvd", getRadVvd());
		this.hashColumns.put("mrn_chk", getMrnChk());
		this.hashColumns.put("vvd", getVvd());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("blcount", getBlcount());
		this.hashColumns.put("ac", getAc());
		this.hashColumns.put("mrn_nbr", getMrnNbr());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("dt", "dt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("pol_loc", "polLoc");
		this.hashFields.put("delete_bl_cnt", "deleteBlCnt");
		this.hashFields.put("in_bound", "inBound");
		this.hashFields.put("txt_vvd", "txtVvd");
		this.hashFields.put("rad_dat", "radDat");
		this.hashFields.put("userid", "userid");
		this.hashFields.put("mrn", "mrn");
		this.hashFields.put("kcd_tp", "kcdTp");
		this.hashFields.put("mrn_no", "mrnNo");
		this.hashFields.put("action_time", "actionTime");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vvd_cd", "vvdCd");
		this.hashFields.put("txt_pol", "txtPol");
		this.hashFields.put("pol", "pol");
		this.hashFields.put("user_name", "userName");
		this.hashFields.put("date_from", "dateFrom");
		this.hashFields.put("kt_port", "ktPort");
		this.hashFields.put("txt_pod", "txtPod");
		this.hashFields.put("rad_mrn", "radMrn");
		this.hashFields.put("pod", "pod");
		this.hashFields.put("office", "office");
		this.hashFields.put("mrn_chk_no", "mrnChkNo");
		this.hashFields.put("kdh_seq", "kdhSeq");
		this.hashFields.put("date_to", "dateTo");
		this.hashFields.put("dt2", "dt2");
		this.hashFields.put("txt_mrn", "txtMrn");
		this.hashFields.put("delete_row", "deleteRow");
		this.hashFields.put("pod_loc", "podLoc");
		this.hashFields.put("rad_vvd", "radVvd");
		this.hashFields.put("mrn_chk", "mrnChk");
		this.hashFields.put("vvd", "vvd");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("blcount", "blcount");
		this.hashFields.put("ac", "ac");
		this.hashFields.put("mrn_nbr", "mrnNbr");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return dt
	 */
	public String getDt() {
		return this.dt;
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
	 * @return polLoc
	 */
	public String getPolLoc() {
		return this.polLoc;
	}
	
	/**
	 * Column Info
	 * @return deleteBlCnt
	 */
	public String getDeleteBlCnt() {
		return this.deleteBlCnt;
	}
	
	/**
	 * Column Info
	 * @return inBound
	 */
	public String getInBound() {
		return this.inBound;
	}
	
	/**
	 * Column Info
	 * @return txtVvd
	 */
	public String getTxtVvd() {
		return this.txtVvd;
	}
	
	/**
	 * Column Info
	 * @return radDat
	 */
	public String getRadDat() {
		return this.radDat;
	}
	
	/**
	 * Column Info
	 * @return userid
	 */
	public String getUserid() {
		return this.userid;
	}
	
	/**
	 * Column Info
	 * @return mrn
	 */
	public String getMrn() {
		return this.mrn;
	}
	
	/**
	 * Column Info
	 * @return kcdTp
	 */
	public String getKcdTp() {
		return this.kcdTp;
	}
	
	/**
	 * Column Info
	 * @return mrnNo
	 */
	public String getMrnNo() {
		return this.mrnNo;
	}
	
	/**
	 * Column Info
	 * @return actionTime
	 */
	public String getActionTime() {
		return this.actionTime;
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
	 * @return vvdCd
	 */
	public String getVvdCd() {
		return this.vvdCd;
	}
	
	/**
	 * Column Info
	 * @return txtPol
	 */
	public String getTxtPol() {
		return this.txtPol;
	}
	
	/**
	 * Column Info
	 * @return pol
	 */
	public String getPol() {
		return this.pol;
	}
	
	/**
	 * Column Info
	 * @return userName
	 */
	public String getUserName() {
		return this.userName;
	}
	
	/**
	 * Column Info
	 * @return dateFrom
	 */
	public String getDateFrom() {
		return this.dateFrom;
	}
	
	/**
	 * Column Info
	 * @return ktPort
	 */
	public String getKtPort() {
		return this.ktPort;
	}
	
	/**
	 * Column Info
	 * @return txtPod
	 */
	public String getTxtPod() {
		return this.txtPod;
	}
	
	/**
	 * Column Info
	 * @return radMrn
	 */
	public String getRadMrn() {
		return this.radMrn;
	}
	
	/**
	 * Column Info
	 * @return pod
	 */
	public String getPod() {
		return this.pod;
	}
	
	/**
	 * Column Info
	 * @return office
	 */
	public String getOffice() {
		return this.office;
	}
	
	/**
	 * Column Info
	 * @return mrnChkNo
	 */
	public String getMrnChkNo() {
		return this.mrnChkNo;
	}
	
	/**
	 * Column Info
	 * @return kdhSeq
	 */
	public String getKdhSeq() {
		return this.kdhSeq;
	}
	
	/**
	 * Column Info
	 * @return dateTo
	 */
	public String getDateTo() {
		return this.dateTo;
	}
	
	/**
	 * Column Info
	 * @return dt2
	 */
	public String getDt2() {
		return this.dt2;
	}
	
	/**
	 * Column Info
	 * @return txtMrn
	 */
	public String getTxtMrn() {
		return this.txtMrn;
	}
	
	/**
	 * Column Info
	 * @return deleteRow
	 */
	public String getDeleteRow() {
		return this.deleteRow;
	}
	
	/**
	 * Column Info
	 * @return podLoc
	 */
	public String getPodLoc() {
		return this.podLoc;
	}
	
	/**
	 * Column Info
	 * @return radVvd
	 */
	public String getRadVvd() {
		return this.radVvd;
	}
	
	/**
	 * Column Info
	 * @return mrnChk
	 */
	public String getMrnChk() {
		return this.mrnChk;
	}
	
	/**
	 * Column Info
	 * @return vvd
	 */
	public String getVvd() {
		return this.vvd;
	}
	
	/**
	 * Column Info
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return blcount
	 */
	public String getBlcount() {
		return this.blcount;
	}
	
	/**
	 * Column Info
	 * @return ac
	 */
	public String getAc() {
		return this.ac;
	}
	
	/**
	 * Column Info
	 * @return mrnNbr
	 */
	public String getMrnNbr() {
		return this.mrnNbr;
	}
	

	/**
	 * Column Info
	 * @param dt
	 */
	public void setDt(String dt) {
		this.dt = dt;
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
	 * @param polLoc
	 */
	public void setPolLoc(String polLoc) {
		this.polLoc = polLoc;
	}
	
	/**
	 * Column Info
	 * @param deleteBlCnt
	 */
	public void setDeleteBlCnt(String deleteBlCnt) {
		this.deleteBlCnt = deleteBlCnt;
	}
	
	/**
	 * Column Info
	 * @param inBound
	 */
	public void setInBound(String inBound) {
		this.inBound = inBound;
	}
	
	/**
	 * Column Info
	 * @param txtVvd
	 */
	public void setTxtVvd(String txtVvd) {
		this.txtVvd = txtVvd;
	}
	
	/**
	 * Column Info
	 * @param radDat
	 */
	public void setRadDat(String radDat) {
		this.radDat = radDat;
	}
	
	/**
	 * Column Info
	 * @param userid
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	/**
	 * Column Info
	 * @param mrn
	 */
	public void setMrn(String mrn) {
		this.mrn = mrn;
	}
	
	/**
	 * Column Info
	 * @param kcdTp
	 */
	public void setKcdTp(String kcdTp) {
		this.kcdTp = kcdTp;
	}
	
	/**
	 * Column Info
	 * @param mrnNo
	 */
	public void setMrnNo(String mrnNo) {
		this.mrnNo = mrnNo;
	}
	
	/**
	 * Column Info
	 * @param actionTime
	 */
	public void setActionTime(String actionTime) {
		this.actionTime = actionTime;
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
	 * @param vvdCd
	 */
	public void setVvdCd(String vvdCd) {
		this.vvdCd = vvdCd;
	}
	
	/**
	 * Column Info
	 * @param txtPol
	 */
	public void setTxtPol(String txtPol) {
		this.txtPol = txtPol;
	}
	
	/**
	 * Column Info
	 * @param pol
	 */
	public void setPol(String pol) {
		this.pol = pol;
	}
	
	/**
	 * Column Info
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * Column Info
	 * @param dateFrom
	 */
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}
	
	/**
	 * Column Info
	 * @param ktPort
	 */
	public void setKtPort(String ktPort) {
		this.ktPort = ktPort;
	}
	
	/**
	 * Column Info
	 * @param txtPod
	 */
	public void setTxtPod(String txtPod) {
		this.txtPod = txtPod;
	}
	
	/**
	 * Column Info
	 * @param radMrn
	 */
	public void setRadMrn(String radMrn) {
		this.radMrn = radMrn;
	}
	
	/**
	 * Column Info
	 * @param pod
	 */
	public void setPod(String pod) {
		this.pod = pod;
	}
	
	/**
	 * Column Info
	 * @param office
	 */
	public void setOffice(String office) {
		this.office = office;
	}
	
	/**
	 * Column Info
	 * @param mrnChkNo
	 */
	public void setMrnChkNo(String mrnChkNo) {
		this.mrnChkNo = mrnChkNo;
	}
	
	/**
	 * Column Info
	 * @param kdhSeq
	 */
	public void setKdhSeq(String kdhSeq) {
		this.kdhSeq = kdhSeq;
	}
	
	/**
	 * Column Info
	 * @param dateTo
	 */
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
	
	/**
	 * Column Info
	 * @param dt2
	 */
	public void setDt2(String dt2) {
		this.dt2 = dt2;
	}
	
	/**
	 * Column Info
	 * @param txtMrn
	 */
	public void setTxtMrn(String txtMrn) {
		this.txtMrn = txtMrn;
	}
	
	/**
	 * Column Info
	 * @param deleteRow
	 */
	public void setDeleteRow(String deleteRow) {
		this.deleteRow = deleteRow;
	}
	
	/**
	 * Column Info
	 * @param podLoc
	 */
	public void setPodLoc(String podLoc) {
		this.podLoc = podLoc;
	}
	
	/**
	 * Column Info
	 * @param radVvd
	 */
	public void setRadVvd(String radVvd) {
		this.radVvd = radVvd;
	}
	
	/**
	 * Column Info
	 * @param mrnChk
	 */
	public void setMrnChk(String mrnChk) {
		this.mrnChk = mrnChk;
	}
	
	/**
	 * Column Info
	 * @param vvd
	 */
	public void setVvd(String vvd) {
		this.vvd = vvd;
	}
	
	/**
	 * Column Info
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param blcount
	 */
	public void setBlcount(String blcount) {
		this.blcount = blcount;
	}
	
	/**
	 * Column Info
	 * @param ac
	 */
	public void setAc(String ac) {
		this.ac = ac;
	}
	
	/**
	 * Column Info
	 * @param mrnNbr
	 */
	public void setMrnNbr(String mrnNbr) {
		this.mrnNbr = mrnNbr;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setDt(JSPUtil.getParameter(request, "dt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setPolLoc(JSPUtil.getParameter(request, "pol_loc", ""));
		setDeleteBlCnt(JSPUtil.getParameter(request, "delete_bl_cnt", ""));
		setInBound(JSPUtil.getParameter(request, "in_bound", ""));
		setTxtVvd(JSPUtil.getParameter(request, "txt_vvd", ""));
		setRadDat(JSPUtil.getParameter(request, "rad_dat", ""));
		setUserid(JSPUtil.getParameter(request, "userid", ""));
		setMrn(JSPUtil.getParameter(request, "mrn", ""));
		setKcdTp(JSPUtil.getParameter(request, "kcd_tp", ""));
		setMrnNo(JSPUtil.getParameter(request, "mrn_no", ""));
		setActionTime(JSPUtil.getParameter(request, "action_time", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setVvdCd(JSPUtil.getParameter(request, "vvd_cd", ""));
		setTxtPol(JSPUtil.getParameter(request, "txt_pol", ""));
		setPol(JSPUtil.getParameter(request, "pol", ""));
		setUserName(JSPUtil.getParameter(request, "user_name", ""));
		setDateFrom(JSPUtil.getParameter(request, "date_from", ""));
		setKtPort(JSPUtil.getParameter(request, "kt_port", ""));
		setTxtPod(JSPUtil.getParameter(request, "txt_pod", ""));
		setRadMrn(JSPUtil.getParameter(request, "rad_mrn", ""));
		setPod(JSPUtil.getParameter(request, "pod", ""));
		setOffice(JSPUtil.getParameter(request, "office", ""));
		setMrnChkNo(JSPUtil.getParameter(request, "mrn_chk_no", ""));
		setKdhSeq(JSPUtil.getParameter(request, "kdh_seq", ""));
		setDateTo(JSPUtil.getParameter(request, "date_to", ""));
		setDt2(JSPUtil.getParameter(request, "dt2", ""));
		setTxtMrn(JSPUtil.getParameter(request, "txt_mrn", ""));
		setDeleteRow(JSPUtil.getParameter(request, "delete_row", ""));
		setPodLoc(JSPUtil.getParameter(request, "pod_loc", ""));
		setRadVvd(JSPUtil.getParameter(request, "rad_vvd", ""));
		setMrnChk(JSPUtil.getParameter(request, "mrn_chk", ""));
		setVvd(JSPUtil.getParameter(request, "vvd", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setBlcount(JSPUtil.getParameter(request, "blcount", ""));
		setAc(JSPUtil.getParameter(request, "ac", ""));
		setMrnNbr(JSPUtil.getParameter(request, "mrn_nbr", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsKrDlHisVO[]
	 */
	public BkgCstmsKrDlHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsKrDlHisVO[]
	 */
	public BkgCstmsKrDlHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsKrDlHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] dt = (JSPUtil.getParameter(request, prefix	+ "dt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] polLoc = (JSPUtil.getParameter(request, prefix	+ "pol_loc", length));
			String[] deleteBlCnt = (JSPUtil.getParameter(request, prefix	+ "delete_bl_cnt", length));
			String[] inBound = (JSPUtil.getParameter(request, prefix	+ "in_bound", length));
			String[] txtVvd = (JSPUtil.getParameter(request, prefix	+ "txt_vvd", length));
			String[] radDat = (JSPUtil.getParameter(request, prefix	+ "rad_dat", length));
			String[] userid = (JSPUtil.getParameter(request, prefix	+ "userid", length));
			String[] mrn = (JSPUtil.getParameter(request, prefix	+ "mrn", length));
			String[] kcdTp = (JSPUtil.getParameter(request, prefix	+ "kcd_tp", length));
			String[] mrnNo = (JSPUtil.getParameter(request, prefix	+ "mrn_no", length));
			String[] actionTime = (JSPUtil.getParameter(request, prefix	+ "action_time", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] vvdCd = (JSPUtil.getParameter(request, prefix	+ "vvd_cd", length));
			String[] txtPol = (JSPUtil.getParameter(request, prefix	+ "txt_pol", length));
			String[] pol = (JSPUtil.getParameter(request, prefix	+ "pol", length));
			String[] userName = (JSPUtil.getParameter(request, prefix	+ "user_name", length));
			String[] dateFrom = (JSPUtil.getParameter(request, prefix	+ "date_from", length));
			String[] ktPort = (JSPUtil.getParameter(request, prefix	+ "kt_port", length));
			String[] txtPod = (JSPUtil.getParameter(request, prefix	+ "txt_pod", length));
			String[] radMrn = (JSPUtil.getParameter(request, prefix	+ "rad_mrn", length));
			String[] pod = (JSPUtil.getParameter(request, prefix	+ "pod", length));
			String[] office = (JSPUtil.getParameter(request, prefix	+ "office", length));
			String[] mrnChkNo = (JSPUtil.getParameter(request, prefix	+ "mrn_chk_no", length));
			String[] kdhSeq = (JSPUtil.getParameter(request, prefix	+ "kdh_seq", length));
			String[] dateTo = (JSPUtil.getParameter(request, prefix	+ "date_to", length));
			String[] dt2 = (JSPUtil.getParameter(request, prefix	+ "dt2", length));
			String[] txtMrn = (JSPUtil.getParameter(request, prefix	+ "txt_mrn", length));
			String[] deleteRow = (JSPUtil.getParameter(request, prefix	+ "delete_row", length));
			String[] podLoc = (JSPUtil.getParameter(request, prefix	+ "pod_loc", length));
			String[] radVvd = (JSPUtil.getParameter(request, prefix	+ "rad_vvd", length));
			String[] mrnChk = (JSPUtil.getParameter(request, prefix	+ "mrn_chk", length));
			String[] vvd = (JSPUtil.getParameter(request, prefix	+ "vvd", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] blcount = (JSPUtil.getParameter(request, prefix	+ "blcount", length));
			String[] ac = (JSPUtil.getParameter(request, prefix	+ "ac", length));
			String[] mrnNbr = (JSPUtil.getParameter(request, prefix	+ "mrn_nbr", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsKrDlHisVO();
				if (dt[i] != null)
					model.setDt(dt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (polLoc[i] != null)
					model.setPolLoc(polLoc[i]);
				if (deleteBlCnt[i] != null)
					model.setDeleteBlCnt(deleteBlCnt[i]);
				if (inBound[i] != null)
					model.setInBound(inBound[i]);
				if (txtVvd[i] != null)
					model.setTxtVvd(txtVvd[i]);
				if (radDat[i] != null)
					model.setRadDat(radDat[i]);
				if (userid[i] != null)
					model.setUserid(userid[i]);
				if (mrn[i] != null)
					model.setMrn(mrn[i]);
				if (kcdTp[i] != null)
					model.setKcdTp(kcdTp[i]);
				if (mrnNo[i] != null)
					model.setMrnNo(mrnNo[i]);
				if (actionTime[i] != null)
					model.setActionTime(actionTime[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vvdCd[i] != null)
					model.setVvdCd(vvdCd[i]);
				if (txtPol[i] != null)
					model.setTxtPol(txtPol[i]);
				if (pol[i] != null)
					model.setPol(pol[i]);
				if (userName[i] != null)
					model.setUserName(userName[i]);
				if (dateFrom[i] != null)
					model.setDateFrom(dateFrom[i]);
				if (ktPort[i] != null)
					model.setKtPort(ktPort[i]);
				if (txtPod[i] != null)
					model.setTxtPod(txtPod[i]);
				if (radMrn[i] != null)
					model.setRadMrn(radMrn[i]);
				if (pod[i] != null)
					model.setPod(pod[i]);
				if (office[i] != null)
					model.setOffice(office[i]);
				if (mrnChkNo[i] != null)
					model.setMrnChkNo(mrnChkNo[i]);
				if (kdhSeq[i] != null)
					model.setKdhSeq(kdhSeq[i]);
				if (dateTo[i] != null)
					model.setDateTo(dateTo[i]);
				if (dt2[i] != null)
					model.setDt2(dt2[i]);
				if (txtMrn[i] != null)
					model.setTxtMrn(txtMrn[i]);
				if (deleteRow[i] != null)
					model.setDeleteRow(deleteRow[i]);
				if (podLoc[i] != null)
					model.setPodLoc(podLoc[i]);
				if (radVvd[i] != null)
					model.setRadVvd(radVvd[i]);
				if (mrnChk[i] != null)
					model.setMrnChk(mrnChk[i]);
				if (vvd[i] != null)
					model.setVvd(vvd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (blcount[i] != null)
					model.setBlcount(blcount[i]);
				if (ac[i] != null)
					model.setAc(ac[i]);
				if (mrnNbr[i] != null)
					model.setMrnNbr(mrnNbr[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsKrDlHisVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsKrDlHisVO[]
	 */
	public BkgCstmsKrDlHisVO[] getBkgCstmsKrDlHisVOs(){
		BkgCstmsKrDlHisVO[] vos = (BkgCstmsKrDlHisVO[])models.toArray(new BkgCstmsKrDlHisVO[models.size()]);
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
		this.dt = this.dt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polLoc = this.polLoc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deleteBlCnt = this.deleteBlCnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inBound = this.inBound .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.txtVvd = this.txtVvd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.radDat = this.radDat .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.userid = this.userid .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mrn = this.mrn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.kcdTp = this.kcdTp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mrnNo = this.mrnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actionTime = this.actionTime .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdCd = this.vvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.txtPol = this.txtPol .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pol = this.pol .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.userName = this.userName .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dateFrom = this.dateFrom .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ktPort = this.ktPort .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.txtPod = this.txtPod .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.radMrn = this.radMrn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pod = this.pod .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.office = this.office .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mrnChkNo = this.mrnChkNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.kdhSeq = this.kdhSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dateTo = this.dateTo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dt2 = this.dt2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.txtMrn = this.txtMrn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deleteRow = this.deleteRow .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podLoc = this.podLoc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.radVvd = this.radVvd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mrnChk = this.mrnChk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvd = this.vvd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blcount = this.blcount .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ac = this.ac .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mrnNbr = this.mrnNbr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
