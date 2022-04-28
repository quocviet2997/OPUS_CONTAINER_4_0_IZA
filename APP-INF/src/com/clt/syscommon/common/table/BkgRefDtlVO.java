/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgRefDtlVO.java
*@FileTitle : BkgRefDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.09
*@LastModifier : 이진서
*@LastVersion : 1.0
* 2009.06.09 이진서 
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
 * @author 이진서
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgRefDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgRefDtlVO> models = new ArrayList<BkgRefDtlVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String cntrWgt = null;
	/* Column Info */
	private String cpyDescFlg = null;
	/* Column Info */
	private String itmDesc = null;
	/* Column Info */
	private String bkgNoSplit = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String prtNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String custRefTpCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String poNo = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String refSeq = null;
	/* Column Info */
	private String deNo = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String measQty = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String measUtCd = null;
	/* Column Info */
	private String pckTpCd = null;
	/* Column Info */
	private String itmNo = null;
	/* Column Info */
	private String updUsrId = null;

	private String refNo = null;
	private String bkgRefTpCd = null;
	private String custRefNoCtnt = null;
	private String caFlg = null;
	private String oldBkgRefTpCd = null;
	private String oldCustRefNoCtnt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgRefDtlVO() {}

	public BkgRefDtlVO(String ibflag, String pagerows, String bkgNo, String bkgNoSplit, String refSeq, String custRefTpCd, String deNo, String prtNo, String cpyDescFlg, String cntrNo, String itmNo, String itmDesc, String pckQty, String pckTpCd, String cntrWgt, String wgtUtCd, String measQty, String measUtCd, String poNo, String creUsrId, String creDt, String updUsrId, String updDt, String mrnNo, String ucrNo, String mrnTpCd, String ucrTpCd, String mrnRefSeq, String ucrRefSeq, String refNo, String bkgRefTpCd, String custRefNoCtnt, String caFlg, String oldBkgRefTpCd, String oldCustRefNoCtnt) {
		this.updDt = updDt;
		this.cntrWgt = cntrWgt;
		this.cpyDescFlg = cpyDescFlg;
		this.itmDesc = itmDesc;
		this.bkgNoSplit = bkgNoSplit;
		this.creDt = creDt;
		this.prtNo = prtNo;
		this.pagerows = pagerows;
		this.custRefTpCd = custRefTpCd;
		this.creUsrId = creUsrId;
		this.poNo = poNo;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.refSeq = refSeq;
		this.deNo = deNo;
		this.cntrNo = cntrNo;
		this.measQty = measQty;
		this.wgtUtCd = wgtUtCd;
		this.pckQty = pckQty;
		this.measUtCd = measUtCd;
		this.pckTpCd = pckTpCd;
		this.itmNo = itmNo;
		this.updUsrId = updUsrId;
		this.refNo = refNo;
		this.bkgRefTpCd = bkgRefTpCd;
		this.custRefNoCtnt = custRefNoCtnt;
		this.caFlg = caFlg;
		this.oldBkgRefTpCd = oldBkgRefTpCd;
		this.oldCustRefNoCtnt = oldCustRefNoCtnt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cntr_wgt", getCntrWgt());
		this.hashColumns.put("cpy_desc_flg", getCpyDescFlg());
		this.hashColumns.put("itm_desc", getItmDesc());
		this.hashColumns.put("bkg_no_split", getBkgNoSplit());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("prt_no", getPrtNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cust_ref_tp_cd", getCustRefTpCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("po_no", getPoNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("ref_seq", getRefSeq());
		this.hashColumns.put("de_no", getDeNo());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("meas_qty", getMeasQty());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("meas_ut_cd", getMeasUtCd());
		this.hashColumns.put("pck_tp_cd", getPckTpCd());
		this.hashColumns.put("itm_no", getItmNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("ref_no", getRefNo());
		this.hashColumns.put("bkg_ref_tp_cd", getBkgRefTpCd());
		this.hashColumns.put("cust_ref_no_ctnt", getCustRefNoCtnt());
		this.hashColumns.put("ca_flg", getCaFlg());
		this.hashColumns.put("old_bkg_ref_tp_cd", getOldBkgRefTpCd());
		this.hashColumns.put("old_cust_ref_no_ctnt", getOldCustRefNoCtnt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cntr_wgt", "cntrWgt");
		this.hashFields.put("cpy_desc_flg", "cpyDescFlg");
		this.hashFields.put("itm_desc", "itmDesc");
		this.hashFields.put("bkg_no_split", "bkgNoSplit");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("prt_no", "prtNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cust_ref_tp_cd", "custRefTpCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("po_no", "poNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("ref_seq", "refSeq");
		this.hashFields.put("de_no", "deNo");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("meas_qty", "measQty");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("meas_ut_cd", "measUtCd");
		this.hashFields.put("pck_tp_cd", "pckTpCd");
		this.hashFields.put("itm_no", "itmNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("ref_no", "refNo");
		this.hashFields.put("bkg_ref_tp_cd", "bkgRefTpCd");
		this.hashFields.put("cust_ref_no_ctnt", "custRefNoCtnt");
		this.hashFields.put("ca_flg", "caFlg");
		this.hashFields.put("old_bkg_ref_tp_cd", "oldBkgRefTpCd");
		this.hashFields.put("old_cust_ref_no_ctnt", "oldCustRefNoCtnt");
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
	 * @return cntrWgt
	 */
	public String getCntrWgt() {
		return this.cntrWgt;
	}
	
	/**
	 * Column Info
	 * @return cpyDescFlg
	 */
	public String getCpyDescFlg() {
		return this.cpyDescFlg;
	}
	
	/**
	 * Column Info
	 * @return itmDesc
	 */
	public String getItmDesc() {
		return this.itmDesc;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return prtNo
	 */
	public String getPrtNo() {
		return this.prtNo;
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
	 * @return custRefTpCd
	 */
	public String getCustRefTpCd() {
		return this.custRefTpCd;
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
	 * @return poNo
	 */
	public String getPoNo() {
		return this.poNo;
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
	 * @return refSeq
	 */
	public String getRefSeq() {
		return this.refSeq;
	}
	
	/**
	 * Column Info
	 * @return deNo
	 */
	public String getDeNo() {
		return this.deNo;
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
	 * @return measQty
	 */
	public String getMeasQty() {
		return this.measQty;
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
	 * @return measUtCd
	 */
	public String getMeasUtCd() {
		return this.measUtCd;
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
	 * @return itmNo
	 */
	public String getItmNo() {
		return this.itmNo;
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
	 * @param cntrWgt
	 */
	public void setCntrWgt(String cntrWgt) {
		this.cntrWgt = cntrWgt;
	}
	
	/**
	 * Column Info
	 * @param cpyDescFlg
	 */
	public void setCpyDescFlg(String cpyDescFlg) {
		this.cpyDescFlg = cpyDescFlg;
	}
	
	/**
	 * Column Info
	 * @param itmDesc
	 */
	public void setItmDesc(String itmDesc) {
		this.itmDesc = itmDesc;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param prtNo
	 */
	public void setPrtNo(String prtNo) {
		this.prtNo = prtNo;
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
	 * @param custRefTpCd
	 */
	public void setCustRefTpCd(String custRefTpCd) {
		this.custRefTpCd = custRefTpCd;
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
	 * @param poNo
	 */
	public void setPoNo(String poNo) {
		this.poNo = poNo;
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
	 * @param refSeq
	 */
	public void setRefSeq(String refSeq) {
		this.refSeq = refSeq;
	}
	
	/**
	 * Column Info
	 * @param deNo
	 */
	public void setDeNo(String deNo) {
		this.deNo = deNo;
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
	 * @param measQty
	 */
	public void setMeasQty(String measQty) {
		this.measQty = measQty;
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
	 * @param measUtCd
	 */
	public void setMeasUtCd(String measUtCd) {
		this.measUtCd = measUtCd;
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
	 * @param itmNo
	 */
	public void setItmNo(String itmNo) {
		this.itmNo = itmNo;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	

	/**
	 * @return the refNo
	 */
	public String getRefNo() {
		return refNo;
	}

	/**
	 * @return the bkgRefTpCd
	 */
	public String getBkgRefTpCd() {
		return bkgRefTpCd;
	}

	/**
	 * @param refNo the refNo to set
	 */
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	/**
	 * @param bkgRefTpCd the bkgRefTpCd to set
	 */
	public void setBkgRefTpCd(String bkgRefTpCd) {
		this.bkgRefTpCd = bkgRefTpCd;
	}
	
	/**
	 * @return the custRefNoCtnt
	 */
	public String getCustRefNoCtnt() {
		return custRefNoCtnt;
	}

	/**
	 * @param custRefNoCtnt the custRefNoCtnt to set
	 */
	public void setCustRefNoCtnt(String custRefNoCtnt) {
		this.custRefNoCtnt = custRefNoCtnt;
	}

	/**
	 * @return the caFlg
	 */
	public String getCaFlg() {
		return caFlg;
	}

	/**
	 * @param caFlg the caFlg to set
	 */
	public void setCaFlg(String caFlg) {
		this.caFlg = caFlg;
	}
	
	/**
	 * @return the oldBkgRefTpCd
	 */
	public String getOldBkgRefTpCd() {
		return oldBkgRefTpCd;
	}

	/**
	 * @param oldBkgRefTpCd the oldBkgRefTpCd to set
	 */
	public void setOldBkgRefTpCd(String oldBkgRefTpCd) {
		this.oldBkgRefTpCd = oldBkgRefTpCd;
	}

	/**
	 * @return the oldCustRefNoCtnt
	 */
	public String getOldCustRefNoCtnt() {
		return oldCustRefNoCtnt;
	}

	/**
	 * @param oldCustRefNoCtnt the oldCustRefNoCtnt to set
	 */
	public void setOldCustRefNoCtnt(String oldCustRefNoCtnt) {
		this.oldCustRefNoCtnt = oldCustRefNoCtnt;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCntrWgt(JSPUtil.getParameter(request, "cntr_wgt", ""));
		setCpyDescFlg(JSPUtil.getParameter(request, "cpy_desc_flg", ""));
		setItmDesc(JSPUtil.getParameter(request, "itm_desc", ""));
		setBkgNoSplit(JSPUtil.getParameter(request, "bkg_no_split", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPrtNo(JSPUtil.getParameter(request, "prt_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCustRefTpCd(JSPUtil.getParameter(request, "cust_ref_tp_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPoNo(JSPUtil.getParameter(request, "po_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setRefSeq(JSPUtil.getParameter(request, "ref_seq", ""));
		setDeNo(JSPUtil.getParameter(request, "de_no", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setMeasQty(JSPUtil.getParameter(request, "meas_qty", ""));
		setWgtUtCd(JSPUtil.getParameter(request, "wgt_ut_cd", ""));
		setPckQty(JSPUtil.getParameter(request, "pck_qty", ""));
		setMeasUtCd(JSPUtil.getParameter(request, "meas_ut_cd", ""));
		setPckTpCd(JSPUtil.getParameter(request, "pck_tp_cd", ""));
		setItmNo(JSPUtil.getParameter(request, "itm_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setRefNo(JSPUtil.getParameter(request, "ref_no", ""));
		setBkgRefTpCd(JSPUtil.getParameter(request, "bkg_ref_tp_cd", ""));
		setCustRefNoCtnt(JSPUtil.getParameter(request, "cust_ref_no_ctnt", ""));
		setCaFlg(JSPUtil.getParameter(request, "ca_flg", ""));
		setOldBkgRefTpCd(JSPUtil.getParameter(request, "old_bkg_ref_tp_cd", ""));
		setOldCustRefNoCtnt(JSPUtil.getParameter(request, "old_cust_ref_no_ctnt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgRefDtlVO[]
	 */
	public BkgRefDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgRefDtlVO[]
	 */
	public BkgRefDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgRefDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] cntrWgt = (JSPUtil.getParameter(request, prefix	+ "cntr_wgt", length));
			String[] cpyDescFlg = (JSPUtil.getParameter(request, prefix	+ "cpy_desc_flg", length));
			String[] itmDesc = (JSPUtil.getParameter(request, prefix	+ "itm_desc", length));
			String[] bkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "bkg_no_split", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] prtNo = (JSPUtil.getParameter(request, prefix	+ "prt_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] custRefTpCd = (JSPUtil.getParameter(request, prefix	+ "cust_ref_tp_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] poNo = (JSPUtil.getParameter(request, prefix	+ "po_no", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] refSeq = (JSPUtil.getParameter(request, prefix	+ "ref_seq", length));
			String[] deNo = (JSPUtil.getParameter(request, prefix	+ "de_no", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] measQty = (JSPUtil.getParameter(request, prefix	+ "meas_qty", length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd", length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty", length));
			String[] measUtCd = (JSPUtil.getParameter(request, prefix	+ "meas_ut_cd", length));
			String[] pckTpCd = (JSPUtil.getParameter(request, prefix	+ "pck_tp_cd", length));
			String[] itmNo = (JSPUtil.getParameter(request, prefix	+ "itm_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] refNo = (JSPUtil.getParameter(request, prefix	+ "ref_no", length));
			String[] bkgRefTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_ref_tp_cd", length));
			String[] custRefNoCtnt = (JSPUtil.getParameter(request, prefix	+ "cust_ref_no_ctnt", length));
			String[] caFlg = (JSPUtil.getParameter(request, prefix	+ "ca_flg", length));
			String[] oldBkgRefTpCd = (JSPUtil.getParameter(request, prefix	+ "old_bkg_ref_tp_cd", length));
			String[] oldCustRefNoCtnt = (JSPUtil.getParameter(request, prefix	+ "old_cust_ref_no_ctnt", length));
			
			
			for (int i = 0; i < length; i++) {
				model = new BkgRefDtlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cntrWgt[i] != null)
					model.setCntrWgt(cntrWgt[i]);
				if (cpyDescFlg[i] != null)
					model.setCpyDescFlg(cpyDescFlg[i]);
				if (itmDesc[i] != null)
					model.setItmDesc(itmDesc[i]);
				if (bkgNoSplit[i] != null)
					model.setBkgNoSplit(bkgNoSplit[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (prtNo[i] != null)
					model.setPrtNo(prtNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (custRefTpCd[i] != null)
					model.setCustRefTpCd(custRefTpCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (poNo[i] != null)
					model.setPoNo(poNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (refSeq[i] != null)
					model.setRefSeq(refSeq[i]);
				if (deNo[i] != null)
					model.setDeNo(deNo[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (measQty[i] != null)
					model.setMeasQty(measQty[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (measUtCd[i] != null)
					model.setMeasUtCd(measUtCd[i]);
				if (pckTpCd[i] != null)
					model.setPckTpCd(pckTpCd[i]);
				if (itmNo[i] != null)
					model.setItmNo(itmNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (refNo[i] != null)
					model.setRefNo(refNo[i]);
				if (bkgRefTpCd[i] != null)
					model.setBkgRefTpCd(bkgRefTpCd[i]);
				if (custRefNoCtnt[i] != null)
					model.setCustRefNoCtnt(custRefNoCtnt[i]);
				if (caFlg[i] != null)
					model.setCaFlg(caFlg[i]);
				if (oldBkgRefTpCd[i] != null)
					model.setOldBkgRefTpCd(oldBkgRefTpCd[i]);
				if (oldCustRefNoCtnt[i] != null)
					model.setOldCustRefNoCtnt(oldCustRefNoCtnt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgRefDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgRefDtlVO[]
	 */
	public BkgRefDtlVO[] getBkgRefDtlVOs(){
		BkgRefDtlVO[] vos = (BkgRefDtlVO[])models.toArray(new BkgRefDtlVO[models.size()]);
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
		this.cntrWgt = this.cntrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cpyDescFlg = this.cpyDescFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.itmDesc = this.itmDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNoSplit = this.bkgNoSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prtNo = this.prtNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custRefTpCd = this.custRefTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.poNo = this.poNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refSeq = this.refSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deNo = this.deNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measQty = this.measQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measUtCd = this.measUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckTpCd = this.pckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.itmNo = this.itmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refNo = this.refNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRefTpCd = this.bkgRefTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custRefNoCtnt = this.custRefNoCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.caFlg = this.caFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldBkgRefTpCd = this.oldBkgRefTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldCustRefNoCtnt = this.oldCustRefNoCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
