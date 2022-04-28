/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgEdoIbdTrspVO.java
*@FileTitle : BkgEdoIbdTrspVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.30
*@LastModifier : 안진응
*@LastVersion : 1.0
* 2009.06.30 안진응 
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
 * @author 안진응
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgEdoIbdTrspVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgEdoIbdTrspVO> models = new ArrayList<BkgEdoIbdTrspVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String invCurrCd = null;
	/* Column Info */
	private String edoRqstSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String gdsDesc3 = null;
	/* Column Info */
	private String gdsDesc4 = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String ttlWgt = null;
	/* Column Info */
	private String edoRqstNo = null;
	/* Column Info */
	private String gdsDesc1 = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String arrCstmsNo = null;
	/* Column Info */
	private String gdsDesc2 = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String invAmt = null;
	/* Column Info */
	private String pckTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String rqstTrspDt = null;
	/* Column Info */
	private String arrAreaNo = null;
	/* Column Info */
	private String miscDesc = null;
	/* Column Info */
	private String arrAreaVndrNm = null;
	/* Column Info */
	private String arrCstmsVndrNm = null;
	/* Column Info */
	private String cntrNo = null;

	
	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgEdoIbdTrspVO() {}

	public BkgEdoIbdTrspVO(String ibflag, String pagerows, String edoRqstNo, String edoRqstSeq, String rqstTrspDt, String arrAreaNo, String arrCstmsNo, String gdsDesc1, String gdsDesc2, String gdsDesc3, String gdsDesc4, String miscDesc, String invAmt, String invCurrCd, String pckTpCd, String pckQty, String wgtUtCd, String ttlWgt, String creUsrId, String creDt, String updUsrId, String updDt, String arrAreaVndrNm, String arrCstmsVndrNm, String cntrNo) {
		this.updDt = updDt;
		this.creDt = creDt;
		this.invCurrCd = invCurrCd;
		this.edoRqstSeq = edoRqstSeq;
		this.pagerows = pagerows;
		this.gdsDesc3 = gdsDesc3;
		this.gdsDesc4 = gdsDesc4;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.ttlWgt = ttlWgt;
		this.edoRqstNo = edoRqstNo;
		this.gdsDesc1 = gdsDesc1;
		this.wgtUtCd = wgtUtCd;
		this.arrCstmsNo = arrCstmsNo;
		this.gdsDesc2 = gdsDesc2;
		this.pckQty = pckQty;
		this.invAmt = invAmt;
		this.pckTpCd = pckTpCd;
		this.updUsrId = updUsrId;
		this.rqstTrspDt = rqstTrspDt;
		this.arrAreaNo = arrAreaNo;
		this.miscDesc = miscDesc;
		this.arrAreaVndrNm = arrAreaVndrNm;
		this.arrCstmsVndrNm = arrCstmsVndrNm;
		this.cntrNo = cntrNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("inv_curr_cd", getInvCurrCd());
		this.hashColumns.put("edo_rqst_seq", getEdoRqstSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("gds_desc3", getGdsDesc3());
		this.hashColumns.put("gds_desc4", getGdsDesc4());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ttl_wgt", getTtlWgt());
		this.hashColumns.put("edo_rqst_no", getEdoRqstNo());
		this.hashColumns.put("gds_desc1", getGdsDesc1());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("arr_cstms_no", getArrCstmsNo());
		this.hashColumns.put("gds_desc2", getGdsDesc2());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("inv_amt", getInvAmt());
		this.hashColumns.put("pck_tp_cd", getPckTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("rqst_trsp_dt", getRqstTrspDt());
		this.hashColumns.put("arr_area_no", getArrAreaNo());
		this.hashColumns.put("misc_desc", getMiscDesc());
		this.hashColumns.put("arr_area_vndr_nm", getArrAreaVndrNm());
		this.hashColumns.put("arr_cstms_vndr_nm", getArrCstmsVndrNm());
		this.hashColumns.put("cntr_no", getCntrNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("inv_curr_cd", "invCurrCd");
		this.hashFields.put("edo_rqst_seq", "edoRqstSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("gds_desc3", "gdsDesc3");
		this.hashFields.put("gds_desc4", "gdsDesc4");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ttl_wgt", "ttlWgt");
		this.hashFields.put("edo_rqst_no", "edoRqstNo");
		this.hashFields.put("gds_desc1", "gdsDesc1");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("arr_cstms_no", "arrCstmsNo");
		this.hashFields.put("gds_desc2", "gdsDesc2");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("inv_amt", "invAmt");
		this.hashFields.put("pck_tp_cd", "pckTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("rqst_trsp_dt", "rqstTrspDt");
		this.hashFields.put("arr_area_no", "arrAreaNo");
		this.hashFields.put("misc_desc", "miscDesc");
		this.hashFields.put("arrAreaVndrNm", "miscDesc");
		this.hashFields.put("misc_desc", "miscDesc");
		this.hashFields.put("arr_area_vndr_nm", "arrAreaVndrNm");
		this.hashFields.put("arr_cstms_vndr_nm", "arrCstmsVndrNm");
		this.hashFields.put("cntr_no", "cntrNo");
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return invCurrCd
	 */
	public String getInvCurrCd() {
		return this.invCurrCd;
	}
	
	/**
	 * Column Info
	 * @return edoRqstSeq
	 */
	public String getEdoRqstSeq() {
		return this.edoRqstSeq;
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
	 * @return gdsDesc3
	 */
	public String getGdsDesc3() {
		return this.gdsDesc3;
	}
	
	/**
	 * Column Info
	 * @return gdsDesc4
	 */
	public String getGdsDesc4() {
		return this.gdsDesc4;
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
	 * @return ttlWgt
	 */
	public String getTtlWgt() {
		return this.ttlWgt;
	}
	
	/**
	 * Column Info
	 * @return edoRqstNo
	 */
	public String getEdoRqstNo() {
		return this.edoRqstNo;
	}
	
	/**
	 * Column Info
	 * @return gdsDesc1
	 */
	public String getGdsDesc1() {
		return this.gdsDesc1;
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
	 * @return arrCstmsNo
	 */
	public String getArrCstmsNo() {
		return this.arrCstmsNo;
	}
	
	/**
	 * Column Info
	 * @return gdsDesc2
	 */
	public String getGdsDesc2() {
		return this.gdsDesc2;
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
	 * @return invAmt
	 */
	public String getInvAmt() {
		return this.invAmt;
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
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	/**
	 * Column Info
	 * @return rqstTrspDt
	 */
	public String getRqstTrspDt() {
		return this.rqstTrspDt;
	}
	
	/**
	 * Column Info
	 * @return arrAreaNo
	 */
	public String getArrAreaNo() {
		return this.arrAreaNo;
	}
	
	/**
	 * Column Info
	 * @return miscDesc
	 */
	public String getMiscDesc() {
		return this.miscDesc;
	}
	
	/**
	 * Column Info
	 * @return arrAreaVndrNm
	 */
	public String getArrAreaVndrNm() {
		return this.arrAreaVndrNm;
	}
	
	/**
	 * Column Info
	 * @return arrCstmsVndrNm
	 */
	public String getArrCstmsVndrNm() {
		return this.arrCstmsVndrNm;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
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
	 * @param invCurrCd
	 */
	public void setInvCurrCd(String invCurrCd) {
		this.invCurrCd = invCurrCd;
	}
	
	/**
	 * Column Info
	 * @param edoRqstSeq
	 */
	public void setEdoRqstSeq(String edoRqstSeq) {
		this.edoRqstSeq = edoRqstSeq;
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
	 * @param gdsDesc3
	 */
	public void setGdsDesc3(String gdsDesc3) {
		this.gdsDesc3 = gdsDesc3;
	}
	
	/**
	 * Column Info
	 * @param gdsDesc4
	 */
	public void setGdsDesc4(String gdsDesc4) {
		this.gdsDesc4 = gdsDesc4;
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
	 * @param ttlWgt
	 */
	public void setTtlWgt(String ttlWgt) {
		this.ttlWgt = ttlWgt;
	}
	
	/**
	 * Column Info
	 * @param edoRqstNo
	 */
	public void setEdoRqstNo(String edoRqstNo) {
		this.edoRqstNo = edoRqstNo;
	}
	
	/**
	 * Column Info
	 * @param gdsDesc1
	 */
	public void setGdsDesc1(String gdsDesc1) {
		this.gdsDesc1 = gdsDesc1;
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
	 * @param arrCstmsNo
	 */
	public void setArrCstmsNo(String arrCstmsNo) {
		this.arrCstmsNo = arrCstmsNo;
	}
	
	/**
	 * Column Info
	 * @param gdsDesc2
	 */
	public void setGdsDesc2(String gdsDesc2) {
		this.gdsDesc2 = gdsDesc2;
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
	 * @param invAmt
	 */
	public void setInvAmt(String invAmt) {
		this.invAmt = invAmt;
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
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param rqstTrspDt
	 */
	public void setRqstTrspDt(String rqstTrspDt) {
		this.rqstTrspDt = rqstTrspDt;
	}
	
	/**
	 * Column Info
	 * @param arrAreaNo
	 */
	public void setArrAreaNo(String arrAreaNo) {
		this.arrAreaNo = arrAreaNo;
	}
	
	/**
	 * Column Info
	 * @param miscDesc
	 */
	public void setMiscDesc(String miscDesc) {
		this.miscDesc = miscDesc;
	}

	/**
	 * Column Info
	 * @param arrAreaVndrNm
	 */
	public void setArrAreaVndrNm(String arrAreaVndrNm) {
		this.arrAreaVndrNm = arrAreaVndrNm;
	}	
	
	/**
	 * Column Info
	 * @param arrCstmsVndrNm
	 */
	public void setArrCstmsVndrNm(String arrCstmsVndrNm) {
		this.arrCstmsVndrNm = arrCstmsVndrNm;
	}	
	
	/**
	 * Column Info
	 * @param cntrNo
	 */
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
	}	
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setInvCurrCd(JSPUtil.getParameter(request, "inv_curr_cd", ""));
		setEdoRqstSeq(JSPUtil.getParameter(request, "edo_rqst_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setGdsDesc3(JSPUtil.getParameter(request, "gds_desc3", ""));
		setGdsDesc4(JSPUtil.getParameter(request, "gds_desc4", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setTtlWgt(JSPUtil.getParameter(request, "ttl_wgt", ""));
		setEdoRqstNo(JSPUtil.getParameter(request, "edo_rqst_no", ""));
		setGdsDesc1(JSPUtil.getParameter(request, "gds_desc1", ""));
		setWgtUtCd(JSPUtil.getParameter(request, "wgt_ut_cd", ""));
		setArrCstmsNo(JSPUtil.getParameter(request, "arr_cstms_no", ""));
		setGdsDesc2(JSPUtil.getParameter(request, "gds_desc2", ""));
		setPckQty(JSPUtil.getParameter(request, "pck_qty", ""));
		setInvAmt(JSPUtil.getParameter(request, "inv_amt", ""));
		setPckTpCd(JSPUtil.getParameter(request, "pck_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setRqstTrspDt(JSPUtil.getParameter(request, "rqst_trsp_dt", ""));
		setArrAreaNo(JSPUtil.getParameter(request, "arr_area_no", ""));
		setMiscDesc(JSPUtil.getParameter(request, "misc_desc", ""));
		setArrAreaVndrNm(JSPUtil.getParameter(request, "arr_area_vndr_nm", ""));
		setArrCstmsVndrNm(JSPUtil.getParameter(request, "arr_cstms_vndr_nm", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgEdoIbdTrspVO[]
	 */
	public BkgEdoIbdTrspVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgEdoIbdTrspVO[]
	 */
	public BkgEdoIbdTrspVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgEdoIbdTrspVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] invCurrCd = (JSPUtil.getParameter(request, prefix	+ "inv_curr_cd", length));
			String[] edoRqstSeq = (JSPUtil.getParameter(request, prefix	+ "edo_rqst_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] gdsDesc3 = (JSPUtil.getParameter(request, prefix	+ "gds_desc3", length));
			String[] gdsDesc4 = (JSPUtil.getParameter(request, prefix	+ "gds_desc4", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] ttlWgt = (JSPUtil.getParameter(request, prefix	+ "ttl_wgt", length));
			String[] edoRqstNo = (JSPUtil.getParameter(request, prefix	+ "edo_rqst_no", length));
			String[] gdsDesc1 = (JSPUtil.getParameter(request, prefix	+ "gds_desc1", length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd", length));
			String[] arrCstmsNo = (JSPUtil.getParameter(request, prefix	+ "arr_cstms_no", length));
			String[] gdsDesc2 = (JSPUtil.getParameter(request, prefix	+ "gds_desc2", length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty", length));
			String[] invAmt = (JSPUtil.getParameter(request, prefix	+ "inv_amt", length));
			String[] pckTpCd = (JSPUtil.getParameter(request, prefix	+ "pck_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] rqstTrspDt = (JSPUtil.getParameter(request, prefix	+ "rqst_trsp_dt", length));
			String[] arrAreaNo = (JSPUtil.getParameter(request, prefix	+ "arr_area_no", length));
			String[] miscDesc = (JSPUtil.getParameter(request, prefix	+ "misc_desc", length));
			String[] arrAreaVndrNm = (JSPUtil.getParameter(request, prefix	+ "arr_area_vndr_nm", length));
			String[] arrCstmsVndrNm = (JSPUtil.getParameter(request, prefix	+ "arr_cstms_vndr_nm", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgEdoIbdTrspVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (invCurrCd[i] != null)
					model.setInvCurrCd(invCurrCd[i]);
				if (edoRqstSeq[i] != null)
					model.setEdoRqstSeq(edoRqstSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (gdsDesc3[i] != null)
					model.setGdsDesc3(gdsDesc3[i]);
				if (gdsDesc4[i] != null)
					model.setGdsDesc4(gdsDesc4[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ttlWgt[i] != null)
					model.setTtlWgt(ttlWgt[i]);
				if (edoRqstNo[i] != null)
					model.setEdoRqstNo(edoRqstNo[i]);
				if (gdsDesc1[i] != null)
					model.setGdsDesc1(gdsDesc1[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (arrCstmsNo[i] != null)
					model.setArrCstmsNo(arrCstmsNo[i]);
				if (gdsDesc2[i] != null)
					model.setGdsDesc2(gdsDesc2[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (invAmt[i] != null)
					model.setInvAmt(invAmt[i]);
				if (pckTpCd[i] != null)
					model.setPckTpCd(pckTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (rqstTrspDt[i] != null)
					model.setRqstTrspDt(rqstTrspDt[i]);
				if (arrAreaNo[i] != null)
					model.setArrAreaNo(arrAreaNo[i]);
				if (miscDesc[i] != null)
					model.setMiscDesc(miscDesc[i]);
				if (arrAreaVndrNm[i] != null)
					model.setArrAreaVndrNm(arrAreaVndrNm[i]);
				if (arrCstmsVndrNm[i] != null)
					model.setArrCstmsVndrNm(arrCstmsVndrNm[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgEdoIbdTrspVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgEdoIbdTrspVO[]
	 */
	public BkgEdoIbdTrspVO[] getBkgEdoIbdTrspVOs(){
		BkgEdoIbdTrspVO[] vos = (BkgEdoIbdTrspVO[])models.toArray(new BkgEdoIbdTrspVO[models.size()]);
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
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCurrCd = this.invCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoRqstSeq = this.edoRqstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gdsDesc3 = this.gdsDesc3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gdsDesc4 = this.gdsDesc4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlWgt = this.ttlWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoRqstNo = this.edoRqstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gdsDesc1 = this.gdsDesc1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrCstmsNo = this.arrCstmsNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gdsDesc2 = this.gdsDesc2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invAmt = this.invAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckTpCd = this.pckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstTrspDt = this.rqstTrspDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrAreaNo = this.arrAreaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.miscDesc = this.miscDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrAreaVndrNm = this.arrAreaVndrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrCstmsVndrNm = this.arrCstmsVndrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
