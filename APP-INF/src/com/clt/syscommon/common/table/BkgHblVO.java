/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgHblVO.java
*@FileTitle : BkgHblVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.28
*@LastModifier : 김영출
*@LastVersion : 1.0
* 2009.07.28 김영출 
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
 * @author 김영출
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgHblVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgHblVO> models = new ArrayList<BkgHblVO>();
	
	/* Column Info */
	private String blGdsDesc = null;
	/* Column Info */
	private String idaIecNo = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String xterSiNo = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String hblNo = null;
	/* Column Info */
	private String cmdtMeasUtCd = null;
	/* Column Info */
	private String pckTpCd = null;
	/* Column Info */
	private String xterSiSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String doNoSplit = null;
	/* Column Info */
	private String cntrMfNo = null;
	/* Column Info */
	private String orgCntrMfNo = null;
	/* Column Info */
	private String doNo = null;
	/* Column Info */
	private String hblMfTpCd = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String hblWgt = null;
	/* Column Info */
	private String cmdtMeasQty = null;
	/* Column Info */
	private String blMkDesc = null;
	/* Column Info */
	private String hblSeq = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgHblVO() {}

	public BkgHblVO(String ibflag, String pagerows, String bkgNo, String hblSeq, String hblNo, String cntrMfNo, String orgCntrMfNo, String blMkDesc, String blGdsDesc, String hblWgt, String wgtUtCd, String pckQty, String pckTpCd, String cmdtMeasUtCd, String cmdtMeasQty, String xterSiNo, String xterSiSeq, String doNo, String doNoSplit, String idaIecNo, String hblMfTpCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.blGdsDesc = blGdsDesc;
		this.idaIecNo = idaIecNo;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.xterSiNo = xterSiNo;
		this.ibflag = ibflag;
		this.wgtUtCd = wgtUtCd;
		this.pckQty = pckQty;
		this.hblNo = hblNo;
		this.cmdtMeasUtCd = cmdtMeasUtCd;
		this.pckTpCd = pckTpCd;
		this.xterSiSeq = xterSiSeq;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.doNoSplit = doNoSplit;
		this.cntrMfNo = cntrMfNo;
		this.orgCntrMfNo = orgCntrMfNo;
		this.doNo = doNo;
		this.hblMfTpCd = hblMfTpCd;
		this.bkgNo = bkgNo;
		this.creUsrId = creUsrId;
		this.hblWgt = hblWgt;
		this.cmdtMeasQty = cmdtMeasQty;
		this.blMkDesc = blMkDesc;
		this.hblSeq = hblSeq;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("bl_gds_desc", getBlGdsDesc());
		this.hashColumns.put("ida_iec_no", getIdaIecNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("xter_si_no", getXterSiNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("hbl_no", getHblNo());
		this.hashColumns.put("cmdt_meas_ut_cd", getCmdtMeasUtCd());
		this.hashColumns.put("pck_tp_cd", getPckTpCd());
		this.hashColumns.put("xter_si_seq", getXterSiSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("do_no_split", getDoNoSplit());
		this.hashColumns.put("cntr_mf_no", getCntrMfNo());
		this.hashColumns.put("org_cntr_mf_no", getOrgCntrMfNo());
		this.hashColumns.put("do_no", getDoNo());
		this.hashColumns.put("hbl_mf_tp_cd", getHblMfTpCd());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("hbl_wgt", getHblWgt());
		this.hashColumns.put("cmdt_meas_qty", getCmdtMeasQty());
		this.hashColumns.put("bl_mk_desc", getBlMkDesc());
		this.hashColumns.put("hbl_seq", getHblSeq());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("bl_gds_desc", "blGdsDesc");
		this.hashFields.put("ida_iec_no", "idaIecNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("xter_si_no", "xterSiNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("hbl_no", "hblNo");
		this.hashFields.put("cmdt_meas_ut_cd", "cmdtMeasUtCd");
		this.hashFields.put("pck_tp_cd", "pckTpCd");
		this.hashFields.put("xter_si_seq", "xterSiSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("do_no_split", "doNoSplit");
		this.hashFields.put("cntr_mf_no", "cntrMfNo");
		this.hashFields.put("org_cntr_mf_no", "orgCntrMfNo");
		this.hashFields.put("do_no", "doNo");
		this.hashFields.put("hbl_mf_tp_cd", "hblMfTpCd");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("hbl_wgt", "hblWgt");
		this.hashFields.put("cmdt_meas_qty", "cmdtMeasQty");
		this.hashFields.put("bl_mk_desc", "blMkDesc");
		this.hashFields.put("hbl_seq", "hblSeq");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return blGdsDesc
	 */
	public String getBlGdsDesc() {
		return this.blGdsDesc;
	}
	
	/**
	 * Column Info
	 * @return idaIecNo
	 */
	public String getIdaIecNo() {
		return this.idaIecNo;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return xterSiNo
	 */
	public String getXterSiNo() {
		return this.xterSiNo;
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
	 * @return wgtUtCd
	 */
	public String getWgtUtCd() {
		return this.wgtUtCd;
	}
	
	/**
	 * Column Info
	 * @return pckQty
	 */
	public String getPckQty() {
		return this.pckQty;
	}
	
	/**
	 * Column Info
	 * @return hblNo
	 */
	public String getHblNo() {
		return this.hblNo;
	}
	
	/**
	 * Column Info
	 * @return cmdtMeasUtCd
	 */
	public String getCmdtMeasUtCd() {
		return this.cmdtMeasUtCd;
	}
	
	/**
	 * Column Info
	 * @return pckTpCd
	 */
	public String getPckTpCd() {
		return this.pckTpCd;
	}
	
	/**
	 * Column Info
	 * @return xterSiSeq
	 */
	public String getXterSiSeq() {
		return this.xterSiSeq;
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
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return doNoSplit
	 */
	public String getDoNoSplit() {
		return this.doNoSplit;
	}
	
	/**
	 * Column Info
	 * @return cntrMfNo
	 */
	public String getCntrMfNo() {
		return this.cntrMfNo;
	}
	
	/**
	 * Column Info
	 * @return orgCntrMfNo
	 */
	public String getOrgCntrMfNo() {
		return this.orgCntrMfNo;
	}
	
	/**
	 * Column Info
	 * @return doNo
	 */
	public String getDoNo() {
		return this.doNo;
	}
	
	/**
	 * Column Info
	 * @return hblMfTpCd
	 */
	public String getHblMfTpCd() {
		return this.hblMfTpCd;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return hblWgt
	 */
	public String getHblWgt() {
		return this.hblWgt;
	}
	
	/**
	 * Column Info
	 * @return cmdtMeasQty
	 */
	public String getCmdtMeasQty() {
		return this.cmdtMeasQty;
	}
	
	/**
	 * Column Info
	 * @return blMkDesc
	 */
	public String getBlMkDesc() {
		return this.blMkDesc;
	}
	
	/**
	 * Column Info
	 * @return hblSeq
	 */
	public String getHblSeq() {
		return this.hblSeq;
	}
	

	/**
	 * Column Info
	 * @param blGdsDesc
	 */
	public void setBlGdsDesc(String blGdsDesc) {
		this.blGdsDesc = blGdsDesc;
	}
	
	/**
	 * Column Info
	 * @param idaIecNo
	 */
	public void setIdaIecNo(String idaIecNo) {
		this.idaIecNo = idaIecNo;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
	 * @param xterSiNo
	 */
	public void setXterSiNo(String xterSiNo) {
		this.xterSiNo = xterSiNo;
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
	 * @param wgtUtCd
	 */
	public void setWgtUtCd(String wgtUtCd) {
		this.wgtUtCd = wgtUtCd;
	}
	
	/**
	 * Column Info
	 * @param pckQty
	 */
	public void setPckQty(String pckQty) {
		this.pckQty = pckQty;
	}
	
	/**
	 * Column Info
	 * @param hblNo
	 */
	public void setHblNo(String hblNo) {
		this.hblNo = hblNo;
	}
	
	/**
	 * Column Info
	 * @param cmdtMeasUtCd
	 */
	public void setCmdtMeasUtCd(String cmdtMeasUtCd) {
		this.cmdtMeasUtCd = cmdtMeasUtCd;
	}
	
	/**
	 * Column Info
	 * @param pckTpCd
	 */
	public void setPckTpCd(String pckTpCd) {
		this.pckTpCd = pckTpCd;
	}
	
	/**
	 * Column Info
	 * @param xterSiSeq
	 */
	public void setXterSiSeq(String xterSiSeq) {
		this.xterSiSeq = xterSiSeq;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param doNoSplit
	 */
	public void setDoNoSplit(String doNoSplit) {
		this.doNoSplit = doNoSplit;
	}
	
	/**
	 * Column Info
	 * @param cntrMfNo
	 */
	public void setCntrMfNo(String cntrMfNo) {
		this.cntrMfNo = cntrMfNo;
	}
	
	/**
	 * Column Info
	 * @param orgCntrMfNo
	 */
	public void setOrgCntrMfNo(String orgCntrMfNo) {
		this.orgCntrMfNo = orgCntrMfNo;
	}
	
	/**
	 * Column Info
	 * @param doNo
	 */
	public void setDoNo(String doNo) {
		this.doNo = doNo;
	}
	
	/**
	 * Column Info
	 * @param hblMfTpCd
	 */
	public void setHblMfTpCd(String hblMfTpCd) {
		this.hblMfTpCd = hblMfTpCd;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param hblWgt
	 */
	public void setHblWgt(String hblWgt) {
		this.hblWgt = hblWgt;
	}
	
	/**
	 * Column Info
	 * @param cmdtMeasQty
	 */
	public void setCmdtMeasQty(String cmdtMeasQty) {
		this.cmdtMeasQty = cmdtMeasQty;
	}
	
	/**
	 * Column Info
	 * @param blMkDesc
	 */
	public void setBlMkDesc(String blMkDesc) {
		this.blMkDesc = blMkDesc;
	}
	
	/**
	 * Column Info
	 * @param hblSeq
	 */
	public void setHblSeq(String hblSeq) {
		this.hblSeq = hblSeq;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setBlGdsDesc(JSPUtil.getParameter(request, "bl_gds_desc", ""));
		setIdaIecNo(JSPUtil.getParameter(request, "ida_iec_no", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setXterSiNo(JSPUtil.getParameter(request, "xter_si_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setWgtUtCd(JSPUtil.getParameter(request, "wgt_ut_cd", ""));
		setPckQty(JSPUtil.getParameter(request, "pck_qty", ""));
		setHblNo(JSPUtil.getParameter(request, "hbl_no", ""));
		setCmdtMeasUtCd(JSPUtil.getParameter(request, "cmdt_meas_ut_cd", ""));
		setPckTpCd(JSPUtil.getParameter(request, "pck_tp_cd", ""));
		setXterSiSeq(JSPUtil.getParameter(request, "xter_si_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setDoNoSplit(JSPUtil.getParameter(request, "do_no_split", ""));
		setCntrMfNo(JSPUtil.getParameter(request, "cntr_mf_no", ""));
		setOrgCntrMfNo(JSPUtil.getParameter(request, "org_cntr_mf_no", ""));
		setDoNo(JSPUtil.getParameter(request, "do_no", ""));
		setHblMfTpCd(JSPUtil.getParameter(request, "hbl_mf_tp_cd", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setHblWgt(JSPUtil.getParameter(request, "hbl_wgt", ""));
		setCmdtMeasQty(JSPUtil.getParameter(request, "cmdt_meas_qty", ""));
		setBlMkDesc(JSPUtil.getParameter(request, "bl_mk_desc", ""));
		setHblSeq(JSPUtil.getParameter(request, "hbl_seq", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgHblVO[]
	 */
	public BkgHblVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgHblVO[]
	 */
	public BkgHblVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgHblVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] blGdsDesc = (JSPUtil.getParameter(request, prefix	+ "bl_gds_desc", length));
			String[] idaIecNo = (JSPUtil.getParameter(request, prefix	+ "ida_iec_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] xterSiNo = (JSPUtil.getParameter(request, prefix	+ "xter_si_no", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd", length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty", length));
			String[] hblNo = (JSPUtil.getParameter(request, prefix	+ "hbl_no", length));
			String[] cmdtMeasUtCd = (JSPUtil.getParameter(request, prefix	+ "cmdt_meas_ut_cd", length));
			String[] pckTpCd = (JSPUtil.getParameter(request, prefix	+ "pck_tp_cd", length));
			String[] xterSiSeq = (JSPUtil.getParameter(request, prefix	+ "xter_si_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] doNoSplit = (JSPUtil.getParameter(request, prefix	+ "do_no_split", length));
			String[] cntrMfNo = (JSPUtil.getParameter(request, prefix	+ "cntr_mf_no", length));
			String[] orgCntrMfNo = (JSPUtil.getParameter(request, prefix	+ "org_cntr_mf_no", length));
			String[] doNo = (JSPUtil.getParameter(request, prefix	+ "do_no", length));
			String[] hblMfTpCd = (JSPUtil.getParameter(request, prefix	+ "hbl_mf_tp_cd", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] hblWgt = (JSPUtil.getParameter(request, prefix	+ "hbl_wgt", length));
			String[] cmdtMeasQty = (JSPUtil.getParameter(request, prefix	+ "cmdt_meas_qty", length));
			String[] blMkDesc = (JSPUtil.getParameter(request, prefix	+ "bl_mk_desc", length));
			String[] hblSeq = (JSPUtil.getParameter(request, prefix	+ "hbl_seq", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgHblVO();
				if (blGdsDesc[i] != null)
					model.setBlGdsDesc(blGdsDesc[i]);
				if (idaIecNo[i] != null)
					model.setIdaIecNo(idaIecNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (xterSiNo[i] != null)
					model.setXterSiNo(xterSiNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (hblNo[i] != null)
					model.setHblNo(hblNo[i]);
				if (cmdtMeasUtCd[i] != null)
					model.setCmdtMeasUtCd(cmdtMeasUtCd[i]);
				if (pckTpCd[i] != null)
					model.setPckTpCd(pckTpCd[i]);
				if (xterSiSeq[i] != null)
					model.setXterSiSeq(xterSiSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (doNoSplit[i] != null)
					model.setDoNoSplit(doNoSplit[i]);
				if (cntrMfNo[i] != null)
					model.setCntrMfNo(cntrMfNo[i]);
				if (orgCntrMfNo[i] != null)
					model.setOrgCntrMfNo(orgCntrMfNo[i]);
				if (doNo[i] != null)
					model.setDoNo(doNo[i]);
				if (hblMfTpCd[i] != null)
					model.setHblMfTpCd(hblMfTpCd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (hblWgt[i] != null)
					model.setHblWgt(hblWgt[i]);
				if (cmdtMeasQty[i] != null)
					model.setCmdtMeasQty(cmdtMeasQty[i]);
				if (blMkDesc[i] != null)
					model.setBlMkDesc(blMkDesc[i]);
				if (hblSeq[i] != null)
					model.setHblSeq(hblSeq[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgHblVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgHblVO[]
	 */
	public BkgHblVO[] getBkgHblVOs(){
		BkgHblVO[] vos = (BkgHblVO[])models.toArray(new BkgHblVO[models.size()]);
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
		this.blGdsDesc = this.blGdsDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.idaIecNo = this.idaIecNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xterSiNo = this.xterSiNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hblNo = this.hblNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtMeasUtCd = this.cmdtMeasUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckTpCd = this.pckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xterSiSeq = this.xterSiSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.doNoSplit = this.doNoSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMfNo = this.cntrMfNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgCntrMfNo = this.orgCntrMfNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.doNo = this.doNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hblMfTpCd = this.hblMfTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hblWgt = this.hblWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtMeasQty = this.cmdtMeasQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blMkDesc = this.blMkDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hblSeq = this.hblSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
