/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CreatorVO.java
*@FileTitle : CreatorVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.10
*@LastModifier : 손윤석
*@LastVersion : 1.0
* 2009.06.10 손윤석 
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

public class BkgCstmsKrXptLicVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsKrXptLicVO> models = new ArrayList<BkgCstmsKrXptLicVO>();
	
	/* Column Info */
	private String elnoCheck = null;
	/* Column Info */
	private String bmePkgQty = null;
	/* Column Info */
	private String bmeDivSeq = null;
	/* Column Info */
	private String bkgNoSplit = null;
	/* Column Info */
	private String bmeDivInd = null;
	/* Column Info */
	private String bmeWgtTp = null;
	/* Column Info */
	private String bmeSmpSeq = null;
	/* Column Info */
	private String kcdTp = null;
	/* Column Info */
	private String exptKcdTp = null;
	/* Column Info */
	private String bmeDpkgCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String bmePkgCd = null;
	/* Column Info */
	private String bmeDwgtQty = null;
	/* Column Info */
	private String bmeDpkgQty = null;
	/* Column Info */
	private String ktSeq = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String bmeElno = null;
	/* Column Info */
	private String elnoWgt = null;
	/* Column Info */
	private String bmeWgtQty = null;
	/* Column Info */
	private String ktPort = null;
	/* Column Info */
	private String bmeDwgtTp = null;
	private String tr_cd = null;
	private String username = null;
	private String cBlNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsKrXptLicVO() {}

	public BkgCstmsKrXptLicVO(String ibflag, String pagerows, String elnoCheck, String elnoWgt, String bkgNo, String bkgNoSplit, String exptKcdTp, String kcdTp, String ktSeq, String bmeElno, String bmePkgQty, String bmePkgCd, String bmeWgtQty, String bmeWgtTp, String bmeDivInd, String bmeDivSeq, String bmeDpkgQty, String bmeDpkgCd, String bmeDwgtQty, String bmeDwgtTp, String bmeSmpSeq, String ktPort) {
		this.elnoCheck = elnoCheck;
		this.bmePkgQty = bmePkgQty;
		this.bmeDivSeq = bmeDivSeq;
		this.bkgNoSplit = bkgNoSplit;
		this.bmeDivInd = bmeDivInd;
		this.bmeWgtTp = bmeWgtTp;
		this.bmeSmpSeq = bmeSmpSeq;
		this.kcdTp = kcdTp;
		this.exptKcdTp = exptKcdTp;
		this.bmeDpkgCd = bmeDpkgCd;
		this.pagerows = pagerows;
		this.bmePkgCd = bmePkgCd;
		this.bmeDwgtQty = bmeDwgtQty;
		this.bmeDpkgQty = bmeDpkgQty;
		this.ktSeq = ktSeq;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.bmeElno = bmeElno;
		this.elnoWgt = elnoWgt;
		this.bmeWgtQty = bmeWgtQty;
		this.ktPort = ktPort;
		this.bmeDwgtTp = bmeDwgtTp;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("elno_check", getElnoCheck());
		this.hashColumns.put("bme_pkg_qty", getBmePkgQty());
		this.hashColumns.put("bme_div_seq", getBmeDivSeq());
		this.hashColumns.put("bkg_no_split", getBkgNoSplit());
		this.hashColumns.put("bme_div_ind", getBmeDivInd());
		this.hashColumns.put("bme_wgt_tp", getBmeWgtTp());
		this.hashColumns.put("bme_smp_seq", getBmeSmpSeq());
		this.hashColumns.put("kcd_tp", getKcdTp());
		this.hashColumns.put("expt_kcd_tp", getExptKcdTp());
		this.hashColumns.put("bme_dpkg_cd", getBmeDpkgCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("bme_pkg_cd", getBmePkgCd());
		this.hashColumns.put("bme_dwgt_qty", getBmeDwgtQty());
		this.hashColumns.put("bme_dpkg_qty", getBmeDpkgQty());
		this.hashColumns.put("kt_seq", getKtSeq());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("bme_elno", getBmeElno());
		this.hashColumns.put("elno_wgt", getElnoWgt());
		this.hashColumns.put("bme_wgt_qty", getBmeWgtQty());
		this.hashColumns.put("kt_port", getKtPort());
		this.hashColumns.put("bme_dwgt_tp", getBmeDwgtTp());
		this.hashColumns.put("tr_cd", getTrCd());
		this.hashColumns.put("username", getUsername());
		this.hashColumns.put("c_bl_no", getCBlNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("elno_check", "elnoCheck");
		this.hashFields.put("bme_pkg_qty", "bmePkgQty");
		this.hashFields.put("bme_div_seq", "bmeDivSeq");
		this.hashFields.put("bkg_no_split", "bkgNoSplit");
		this.hashFields.put("bme_div_ind", "bmeDivInd");
		this.hashFields.put("bme_wgt_tp", "bmeWgtTp");
		this.hashFields.put("bme_smp_seq", "bmeSmpSeq");
		this.hashFields.put("kcd_tp", "kcdTp");
		this.hashFields.put("expt_kcd_tp", "exptKcdTp");
		this.hashFields.put("bme_dpkg_cd", "bmeDpkgCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("bme_pkg_cd", "bmePkgCd");
		this.hashFields.put("bme_dwgt_qty", "bmeDwgtQty");
		this.hashFields.put("bme_dpkg_qty", "bmeDpkgQty");
		this.hashFields.put("kt_seq", "ktSeq");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("bme_elno", "bmeElno");
		this.hashFields.put("elno_wgt", "elnoWgt");
		this.hashFields.put("bme_wgt_qty", "bmeWgtQty");
		this.hashFields.put("kt_port", "ktPort");
		this.hashFields.put("bme_dwgt_tp", "bmeDwgtTp");
		this.hashFields.put("tr_cd", "tr_cd");
		this.hashFields.put("username", "username");
		this.hashFields.put("c_bl_no", "cBlNo");
		return this.hashFields;
	}
	
	public String getCBlNo() {
		return cBlNo;
	}

	public void setCBlNo(String blNo) {
		cBlNo = blNo;
	}

	/**
	 * Column Info
	 * @return elnoCheck
	 */
	public String getElnoCheck() {
		return this.elnoCheck;
	}
	
	/**
	 * Column Info
	 * @return bmePkgQty
	 */
	public String getBmePkgQty() {
		return this.bmePkgQty;
	}
	
	/**
	 * Column Info
	 * @return bmeDivSeq
	 */
	public String getBmeDivSeq() {
		return this.bmeDivSeq;
	}
	
	/**
	 * Column Info
	 * @return bkgNoSplit
	 */
	public String getBkgNoSplit() {
		return this.bkgNoSplit;
	}
	
	/**
	 * Column Info
	 * @return bmeDivInd
	 */
	public String getBmeDivInd() {
		return this.bmeDivInd;
	}
	
	/**
	 * Column Info
	 * @return bmeWgtTp
	 */
	public String getBmeWgtTp() {
		return this.bmeWgtTp;
	}
	
	/**
	 * Column Info
	 * @return bmeSmpSeq
	 */
	public String getBmeSmpSeq() {
		return this.bmeSmpSeq;
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
	 * @return exptKcdTp
	 */
	public String getExptKcdTp() {
		return this.exptKcdTp;
	}
	
	/**
	 * Column Info
	 * @return bmeDpkgCd
	 */
	public String getBmeDpkgCd() {
		return this.bmeDpkgCd;
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
	 * @return bmePkgCd
	 */
	public String getBmePkgCd() {
		return this.bmePkgCd;
	}
	
	/**
	 * Column Info
	 * @return bmeDwgtQty
	 */
	public String getBmeDwgtQty() {
		return this.bmeDwgtQty;
	}
	
	/**
	 * Column Info
	 * @return bmeDpkgQty
	 */
	public String getBmeDpkgQty() {
		return this.bmeDpkgQty;
	}
	
	/**
	 * Column Info
	 * @return ktSeq
	 */
	public String getKtSeq() {
		return this.ktSeq;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return bmeElno
	 */
	public String getBmeElno() {
		return this.bmeElno;
	}
	
	/**
	 * Column Info
	 * @return elnoWgt
	 */
	public String getElnoWgt() {
		return this.elnoWgt;
	}
	
	/**
	 * Column Info
	 * @return bmeWgtQty
	 */
	public String getBmeWgtQty() {
		return this.bmeWgtQty;
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
	 * @return bmeDwgtTp
	 */
	public String getBmeDwgtTp() {
		return this.bmeDwgtTp;
	}
	
	public String getTrCd(){
		return this.tr_cd;
	}
	
	public String getUsername(){
		return this.username;
	}

	/**
	 * Column Info
	 * @param elnoCheck
	 */
	public void setElnoCheck(String elnoCheck) {
		this.elnoCheck = elnoCheck;
	}
	
	/**
	 * Column Info
	 * @param bmePkgQty
	 */
	public void setBmePkgQty(String bmePkgQty) {
		this.bmePkgQty = bmePkgQty;
	}
	
	/**
	 * Column Info
	 * @param bmeDivSeq
	 */
	public void setBmeDivSeq(String bmeDivSeq) {
		this.bmeDivSeq = bmeDivSeq;
	}
	
	/**
	 * Column Info
	 * @param bkgNoSplit
	 */
	public void setBkgNoSplit(String bkgNoSplit) {
		this.bkgNoSplit = bkgNoSplit;
	}
	
	/**
	 * Column Info
	 * @param bmeDivInd
	 */
	public void setBmeDivInd(String bmeDivInd) {
		this.bmeDivInd = bmeDivInd;
	}
	
	/**
	 * Column Info
	 * @param bmeWgtTp
	 */
	public void setBmeWgtTp(String bmeWgtTp) {
		this.bmeWgtTp = bmeWgtTp;
	}
	
	/**
	 * Column Info
	 * @param bmeSmpSeq
	 */
	public void setBmeSmpSeq(String bmeSmpSeq) {
		this.bmeSmpSeq = bmeSmpSeq;
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
	 * @param exptKcdTp
	 */
	public void setExptKcdTp(String exptKcdTp) {
		this.exptKcdTp = exptKcdTp;
	}
	
	/**
	 * Column Info
	 * @param bmeDpkgCd
	 */
	public void setBmeDpkgCd(String bmeDpkgCd) {
		this.bmeDpkgCd = bmeDpkgCd;
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
	 * @param bmePkgCd
	 */
	public void setBmePkgCd(String bmePkgCd) {
		this.bmePkgCd = bmePkgCd;
	}
	
	/**
	 * Column Info
	 * @param bmeDwgtQty
	 */
	public void setBmeDwgtQty(String bmeDwgtQty) {
		this.bmeDwgtQty = bmeDwgtQty;
	}
	
	/**
	 * Column Info
	 * @param bmeDpkgQty
	 */
	public void setBmeDpkgQty(String bmeDpkgQty) {
		this.bmeDpkgQty = bmeDpkgQty;
	}
	
	/**
	 * Column Info
	 * @param ktSeq
	 */
	public void setKtSeq(String ktSeq) {
		this.ktSeq = ktSeq;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param bmeElno
	 */
	public void setBmeElno(String bmeElno) {
		this.bmeElno = bmeElno;
	}
	
	/**
	 * Column Info
	 * @param elnoWgt
	 */
	public void setElnoWgt(String elnoWgt) {
		this.elnoWgt = elnoWgt;
	}
	
	/**
	 * Column Info
	 * @param bmeWgtQty
	 */
	public void setBmeWgtQty(String bmeWgtQty) {
		this.bmeWgtQty = bmeWgtQty;
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
	 * @param bmeDwgtTp
	 */
	public void setBmeDwgtTp(String bmeDwgtTp) {
		this.bmeDwgtTp = bmeDwgtTp;
	}
	
	public void setTrCd(String p){
		this.tr_cd = p;
	}
	
	public void setUsername(String p){
		this.username = p;
	}
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setElnoCheck(JSPUtil.getParameter(request, "elno_check", ""));
		setBmePkgQty(JSPUtil.getParameter(request, "bme_pkg_qty", ""));
		setBmeDivSeq(JSPUtil.getParameter(request, "bme_div_seq", ""));
		setBkgNoSplit(JSPUtil.getParameter(request, "bkg_no_split", ""));
		setBmeDivInd(JSPUtil.getParameter(request, "bme_div_ind", ""));
		setBmeWgtTp(JSPUtil.getParameter(request, "bme_wgt_tp", ""));
		setBmeSmpSeq(JSPUtil.getParameter(request, "bme_smp_seq", ""));
		setKcdTp(JSPUtil.getParameter(request, "kcd_tp", ""));
		setExptKcdTp(JSPUtil.getParameter(request, "expt_kcd_tp", ""));
		setBmeDpkgCd(JSPUtil.getParameter(request, "bme_dpkg_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setBmePkgCd(JSPUtil.getParameter(request, "bme_pkg_cd", ""));
		setBmeDwgtQty(JSPUtil.getParameter(request, "bme_dwgt_qty", ""));
		setBmeDpkgQty(JSPUtil.getParameter(request, "bme_dpkg_qty", ""));
		setKtSeq(JSPUtil.getParameter(request, "kt_seq", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setBmeElno(JSPUtil.getParameter(request, "bme_elno", ""));
		setElnoWgt(JSPUtil.getParameter(request, "elno_wgt", ""));
		setBmeWgtQty(JSPUtil.getParameter(request, "bme_wgt_qty", ""));
		setKtPort(JSPUtil.getParameter(request, "kt_port", ""));
		setBmeDwgtTp(JSPUtil.getParameter(request, "bme_dwgt_tp", ""));
		setTrCd(JSPUtil.getParameter(request, "tr_cd", ""));
		setUsername(JSPUtil.getParameter(request, "username", ""));
		setCBlNo(JSPUtil.getParameter(request, "c_bl_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsKrXptLicVO[]
	 */
	public BkgCstmsKrXptLicVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsKrXptLicVO[]
	 */
	public BkgCstmsKrXptLicVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsKrXptLicVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] elnoCheck = (JSPUtil.getParameter(request, prefix	+ "elno_check".trim(), length));
			String[] bmePkgQty = (JSPUtil.getParameter(request, prefix	+ "bme_pkg_qty".trim(), length));
			String[] bmeDivSeq = (JSPUtil.getParameter(request, prefix	+ "bme_div_seq".trim(), length));
			String[] bkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "bkg_no_split".trim(), length));
			String[] bmeDivInd = (JSPUtil.getParameter(request, prefix	+ "bme_div_ind".trim(), length));
			String[] bmeWgtTp = (JSPUtil.getParameter(request, prefix	+ "bme_wgt_tp".trim(), length));
			String[] bmeSmpSeq = (JSPUtil.getParameter(request, prefix	+ "bme_smp_seq".trim(), length));
			String[] kcdTp = (JSPUtil.getParameter(request, prefix	+ "kcd_tp".trim(), length));
			String[] exptKcdTp = (JSPUtil.getParameter(request, prefix	+ "expt_kcd_tp".trim(), length));
			String[] bmeDpkgCd = (JSPUtil.getParameter(request, prefix	+ "bme_dpkg_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] bmePkgCd = (JSPUtil.getParameter(request, prefix	+ "bme_pkg_cd".trim(), length));
			String[] bmeDwgtQty = (JSPUtil.getParameter(request, prefix	+ "bme_dwgt_qty".trim(), length));
			String[] bmeDpkgQty = (JSPUtil.getParameter(request, prefix	+ "bme_dpkg_qty".trim(), length));
			String[] ktSeq = (JSPUtil.getParameter(request, prefix	+ "kt_seq".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no".trim(), length));
			String[] bmeElno = (JSPUtil.getParameter(request, prefix	+ "bme_elno".trim(), length));
			String[] elnoWgt = (JSPUtil.getParameter(request, prefix	+ "elno_wgt".trim(), length));
			String[] bmeWgtQty = (JSPUtil.getParameter(request, prefix	+ "bme_wgt_qty".trim(), length));
			String[] ktPort = (JSPUtil.getParameter(request, prefix	+ "kt_port".trim(), length));
			String[] bmeDwgtTp = (JSPUtil.getParameter(request, prefix	+ "bme_dwgt_tp".trim(), length));
			String[] trcd = (JSPUtil.getParameter(request, prefix	+ "tr_cd".trim(), length));
			String[] ausername = (JSPUtil.getParameter(request, prefix	+ "username".trim(), length));
			String[] cBlNo = (JSPUtil.getParameter(request, prefix	+ "c_bl_no".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsKrXptLicVO();
				if (elnoCheck[i] != null)
					model.setElnoCheck(elnoCheck[i]);
				if (bmePkgQty[i] != null)
					model.setBmePkgQty(bmePkgQty[i]);
				if (bmeDivSeq[i] != null)
					model.setBmeDivSeq(bmeDivSeq[i]);
				if (bkgNoSplit[i] != null)
					model.setBkgNoSplit(bkgNoSplit[i]);
				if (bmeDivInd[i] != null)
					model.setBmeDivInd(bmeDivInd[i]);
				if (bmeWgtTp[i] != null)
					model.setBmeWgtTp(bmeWgtTp[i]);
				if (bmeSmpSeq[i] != null)
					model.setBmeSmpSeq(bmeSmpSeq[i]);
				if (kcdTp[i] != null)
					model.setKcdTp(kcdTp[i]);
				if (exptKcdTp[i] != null)
					model.setExptKcdTp(exptKcdTp[i]);
				if (bmeDpkgCd[i] != null)
					model.setBmeDpkgCd(bmeDpkgCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (bmePkgCd[i] != null)
					model.setBmePkgCd(bmePkgCd[i]);
				if (bmeDwgtQty[i] != null)
					model.setBmeDwgtQty(bmeDwgtQty[i]);
				if (bmeDpkgQty[i] != null)
					model.setBmeDpkgQty(bmeDpkgQty[i]);
				if (ktSeq[i] != null)
					model.setKtSeq(ktSeq[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (bmeElno[i] != null)
					model.setBmeElno(bmeElno[i]);
				if (elnoWgt[i] != null)
					model.setElnoWgt(elnoWgt[i]);
				if (bmeWgtQty[i] != null)
					model.setBmeWgtQty(bmeWgtQty[i]);
				if (ktPort[i] != null)
					model.setKtPort(ktPort[i]);
				if (bmeDwgtTp[i] != null)
					model.setBmeDwgtTp(bmeDwgtTp[i]);
				if (trcd[i] != null)
					model.setTrCd(trcd[i]);
				if (ausername[i] != null)
					model.setUsername(ausername[i]);
				if (cBlNo[i] != null)
					model.setCBlNo(cBlNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsKrXptLicVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsKrXptLicVO[]
	 */
	public BkgCstmsKrXptLicVO[] getBkgCstmsKrXptLicVOs(){
		BkgCstmsKrXptLicVO[] vos = (BkgCstmsKrXptLicVO[])models.toArray(new BkgCstmsKrXptLicVO[models.size()]);
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
		this.elnoCheck = this.elnoCheck .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bmePkgQty = this.bmePkgQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bmeDivSeq = this.bmeDivSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNoSplit = this.bkgNoSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bmeDivInd = this.bmeDivInd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bmeWgtTp = this.bmeWgtTp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bmeSmpSeq = this.bmeSmpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.kcdTp = this.kcdTp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exptKcdTp = this.exptKcdTp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bmeDpkgCd = this.bmeDpkgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bmePkgCd = this.bmePkgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bmeDwgtQty = this.bmeDwgtQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bmeDpkgQty = this.bmeDpkgQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ktSeq = this.ktSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bmeElno = this.bmeElno .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.elnoWgt = this.elnoWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bmeWgtQty = this.bmeWgtQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ktPort = this.ktPort .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bmeDwgtTp = this.bmeDwgtTp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tr_cd = this.tr_cd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.username = this.username.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
