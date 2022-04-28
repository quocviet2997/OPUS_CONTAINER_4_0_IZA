/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgXterXptLicNoVO.java
*@FileTitle : BkgXterXptLicNoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.12.05
*@LastModifier : 민동진
*@LastVersion : 1.0
* 2009.12.05 민동진 
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
 * @author 민동진
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgXterXptLicNoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgXterXptLicNoVO> models = new ArrayList<BkgXterXptLicNoVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String xterSndrId = null;
	/* Column Info */
	private String cntrWgt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String xterTrspStsCd = null;
	/* Column Info */
	private String xptLicNo = null;
	/* Column Info */
	private String cgoDivdFlg = null;
	/* Column Info */
	private String xptLicNoFileDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String divdPckTpCd = null;
	/* Column Info */
	private String divdPckQty = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String styId = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String divdWgt = null;
	/* Column Info */
	private String xterRqstSeq = null;
	/* Column Info */
	private String divdSeq = null;
	/* Column Info */
	private String xterRqstNo = null;
	/* Column Info */
	private String pckTpCd = null;
	/* Column Info */
	private String divdWgtUtCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgXterXptLicNoVO() {}

	public BkgXterXptLicNoVO(String ibflag, String pagerows, String xterSndrId, String xterRqstNo, String xterRqstSeq, String xptLicNo, String pckQty, String pckTpCd, String cntrWgt, String wgtUtCd, String cgoDivdFlg, String divdSeq, String divdPckQty, String divdPckTpCd, String divdWgt, String divdWgtUtCd, String styId, String xptLicNoFileDt, String xterTrspStsCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.xterSndrId = xterSndrId;
		this.cntrWgt = cntrWgt;
		this.creDt = creDt;
		this.xterTrspStsCd = xterTrspStsCd;
		this.xptLicNo = xptLicNo;
		this.cgoDivdFlg = cgoDivdFlg;
		this.xptLicNoFileDt = xptLicNoFileDt;
		this.pagerows = pagerows;
		this.divdPckTpCd = divdPckTpCd;
		this.divdPckQty = divdPckQty;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.styId = styId;
		this.wgtUtCd = wgtUtCd;
		this.pckQty = pckQty;
		this.divdWgt = divdWgt;
		this.xterRqstSeq = xterRqstSeq;
		this.divdSeq = divdSeq;
		this.xterRqstNo = xterRqstNo;
		this.pckTpCd = pckTpCd;
		this.divdWgtUtCd = divdWgtUtCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("xter_sndr_id", getXterSndrId());
		this.hashColumns.put("cntr_wgt", getCntrWgt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("xter_trsp_sts_cd", getXterTrspStsCd());
		this.hashColumns.put("xpt_lic_no", getXptLicNo());
		this.hashColumns.put("cgo_divd_flg", getCgoDivdFlg());
		this.hashColumns.put("xpt_lic_no_file_dt", getXptLicNoFileDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("divd_pck_tp_cd", getDivdPckTpCd());
		this.hashColumns.put("divd_pck_qty", getDivdPckQty());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("sty_id", getStyId());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("divd_wgt", getDivdWgt());
		this.hashColumns.put("xter_rqst_seq", getXterRqstSeq());
		this.hashColumns.put("divd_seq", getDivdSeq());
		this.hashColumns.put("xter_rqst_no", getXterRqstNo());
		this.hashColumns.put("pck_tp_cd", getPckTpCd());
		this.hashColumns.put("divd_wgt_ut_cd", getDivdWgtUtCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("xter_sndr_id", "xterSndrId");
		this.hashFields.put("cntr_wgt", "cntrWgt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("xter_trsp_sts_cd", "xterTrspStsCd");
		this.hashFields.put("xpt_lic_no", "xptLicNo");
		this.hashFields.put("cgo_divd_flg", "cgoDivdFlg");
		this.hashFields.put("xpt_lic_no_file_dt", "xptLicNoFileDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("divd_pck_tp_cd", "divdPckTpCd");
		this.hashFields.put("divd_pck_qty", "divdPckQty");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("sty_id", "styId");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("divd_wgt", "divdWgt");
		this.hashFields.put("xter_rqst_seq", "xterRqstSeq");
		this.hashFields.put("divd_seq", "divdSeq");
		this.hashFields.put("xter_rqst_no", "xterRqstNo");
		this.hashFields.put("pck_tp_cd", "pckTpCd");
		this.hashFields.put("divd_wgt_ut_cd", "divdWgtUtCd");
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
	 * @return xterSndrId
	 */
	public String getXterSndrId() {
		return this.xterSndrId;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return xterTrspStsCd
	 */
	public String getXterTrspStsCd() {
		return this.xterTrspStsCd;
	}
	
	/**
	 * Column Info
	 * @return xptLicNo
	 */
	public String getXptLicNo() {
		return this.xptLicNo;
	}
	
	/**
	 * Column Info
	 * @return cgoDivdFlg
	 */
	public String getCgoDivdFlg() {
		return this.cgoDivdFlg;
	}
	
	/**
	 * Column Info
	 * @return xptLicNoFileDt
	 */
	public String getXptLicNoFileDt() {
		return this.xptLicNoFileDt;
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
	 * @return divdPckTpCd
	 */
	public String getDivdPckTpCd() {
		return this.divdPckTpCd;
	}
	
	/**
	 * Column Info
	 * @return divdPckQty
	 */
	public String getDivdPckQty() {
		return this.divdPckQty;
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
	 * @return styId
	 */
	public String getStyId() {
		return this.styId;
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
	 * @return divdWgt
	 */
	public String getDivdWgt() {
		return this.divdWgt;
	}
	
	/**
	 * Column Info
	 * @return xterRqstSeq
	 */
	public String getXterRqstSeq() {
		return this.xterRqstSeq;
	}
	
	/**
	 * Column Info
	 * @return divdSeq
	 */
	public String getDivdSeq() {
		return this.divdSeq;
	}
	
	/**
	 * Column Info
	 * @return xterRqstNo
	 */
	public String getXterRqstNo() {
		return this.xterRqstNo;
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
	 * @return divdWgtUtCd
	 */
	public String getDivdWgtUtCd() {
		return this.divdWgtUtCd;
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
	 * @param xterSndrId
	 */
	public void setXterSndrId(String xterSndrId) {
		this.xterSndrId = xterSndrId;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param xterTrspStsCd
	 */
	public void setXterTrspStsCd(String xterTrspStsCd) {
		this.xterTrspStsCd = xterTrspStsCd;
	}
	
	/**
	 * Column Info
	 * @param xptLicNo
	 */
	public void setXptLicNo(String xptLicNo) {
		this.xptLicNo = xptLicNo;
	}
	
	/**
	 * Column Info
	 * @param cgoDivdFlg
	 */
	public void setCgoDivdFlg(String cgoDivdFlg) {
		this.cgoDivdFlg = cgoDivdFlg;
	}
	
	/**
	 * Column Info
	 * @param xptLicNoFileDt
	 */
	public void setXptLicNoFileDt(String xptLicNoFileDt) {
		this.xptLicNoFileDt = xptLicNoFileDt;
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
	 * @param divdPckTpCd
	 */
	public void setDivdPckTpCd(String divdPckTpCd) {
		this.divdPckTpCd = divdPckTpCd;
	}
	
	/**
	 * Column Info
	 * @param divdPckQty
	 */
	public void setDivdPckQty(String divdPckQty) {
		this.divdPckQty = divdPckQty;
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
	 * @param styId
	 */
	public void setStyId(String styId) {
		this.styId = styId;
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
	 * @param divdWgt
	 */
	public void setDivdWgt(String divdWgt) {
		this.divdWgt = divdWgt;
	}
	
	/**
	 * Column Info
	 * @param xterRqstSeq
	 */
	public void setXterRqstSeq(String xterRqstSeq) {
		this.xterRqstSeq = xterRqstSeq;
	}
	
	/**
	 * Column Info
	 * @param divdSeq
	 */
	public void setDivdSeq(String divdSeq) {
		this.divdSeq = divdSeq;
	}
	
	/**
	 * Column Info
	 * @param xterRqstNo
	 */
	public void setXterRqstNo(String xterRqstNo) {
		this.xterRqstNo = xterRqstNo;
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
	 * @param divdWgtUtCd
	 */
	public void setDivdWgtUtCd(String divdWgtUtCd) {
		this.divdWgtUtCd = divdWgtUtCd;
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
		setXterSndrId(JSPUtil.getParameter(request, "xter_sndr_id", ""));
		setCntrWgt(JSPUtil.getParameter(request, "cntr_wgt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setXterTrspStsCd(JSPUtil.getParameter(request, "xter_trsp_sts_cd", ""));
		setXptLicNo(JSPUtil.getParameter(request, "xpt_lic_no", ""));
		setCgoDivdFlg(JSPUtil.getParameter(request, "cgo_divd_flg", ""));
		setXptLicNoFileDt(JSPUtil.getParameter(request, "xpt_lic_no_file_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setDivdPckTpCd(JSPUtil.getParameter(request, "divd_pck_tp_cd", ""));
		setDivdPckQty(JSPUtil.getParameter(request, "divd_pck_qty", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setStyId(JSPUtil.getParameter(request, "sty_id", ""));
		setWgtUtCd(JSPUtil.getParameter(request, "wgt_ut_cd", ""));
		setPckQty(JSPUtil.getParameter(request, "pck_qty", ""));
		setDivdWgt(JSPUtil.getParameter(request, "divd_wgt", ""));
		setXterRqstSeq(JSPUtil.getParameter(request, "xter_rqst_seq", ""));
		setDivdSeq(JSPUtil.getParameter(request, "divd_seq", ""));
		setXterRqstNo(JSPUtil.getParameter(request, "xter_rqst_no", ""));
		setPckTpCd(JSPUtil.getParameter(request, "pck_tp_cd", ""));
		setDivdWgtUtCd(JSPUtil.getParameter(request, "divd_wgt_ut_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgXterXptLicNoVO[]
	 */
	public BkgXterXptLicNoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgXterXptLicNoVO[]
	 */
	public BkgXterXptLicNoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgXterXptLicNoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] xterSndrId = (JSPUtil.getParameter(request, prefix	+ "xter_sndr_id", length));
			String[] cntrWgt = (JSPUtil.getParameter(request, prefix	+ "cntr_wgt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] xterTrspStsCd = (JSPUtil.getParameter(request, prefix	+ "xter_trsp_sts_cd", length));
			String[] xptLicNo = (JSPUtil.getParameter(request, prefix	+ "xpt_lic_no", length));
			String[] cgoDivdFlg = (JSPUtil.getParameter(request, prefix	+ "cgo_divd_flg", length));
			String[] xptLicNoFileDt = (JSPUtil.getParameter(request, prefix	+ "xpt_lic_no_file_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] divdPckTpCd = (JSPUtil.getParameter(request, prefix	+ "divd_pck_tp_cd", length));
			String[] divdPckQty = (JSPUtil.getParameter(request, prefix	+ "divd_pck_qty", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] styId = (JSPUtil.getParameter(request, prefix	+ "sty_id", length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd", length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty", length));
			String[] divdWgt = (JSPUtil.getParameter(request, prefix	+ "divd_wgt", length));
			String[] xterRqstSeq = (JSPUtil.getParameter(request, prefix	+ "xter_rqst_seq", length));
			String[] divdSeq = (JSPUtil.getParameter(request, prefix	+ "divd_seq", length));
			String[] xterRqstNo = (JSPUtil.getParameter(request, prefix	+ "xter_rqst_no", length));
			String[] pckTpCd = (JSPUtil.getParameter(request, prefix	+ "pck_tp_cd", length));
			String[] divdWgtUtCd = (JSPUtil.getParameter(request, prefix	+ "divd_wgt_ut_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgXterXptLicNoVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (xterSndrId[i] != null)
					model.setXterSndrId(xterSndrId[i]);
				if (cntrWgt[i] != null)
					model.setCntrWgt(cntrWgt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (xterTrspStsCd[i] != null)
					model.setXterTrspStsCd(xterTrspStsCd[i]);
				if (xptLicNo[i] != null)
					model.setXptLicNo(xptLicNo[i]);
				if (cgoDivdFlg[i] != null)
					model.setCgoDivdFlg(cgoDivdFlg[i]);
				if (xptLicNoFileDt[i] != null)
					model.setXptLicNoFileDt(xptLicNoFileDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (divdPckTpCd[i] != null)
					model.setDivdPckTpCd(divdPckTpCd[i]);
				if (divdPckQty[i] != null)
					model.setDivdPckQty(divdPckQty[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (styId[i] != null)
					model.setStyId(styId[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (divdWgt[i] != null)
					model.setDivdWgt(divdWgt[i]);
				if (xterRqstSeq[i] != null)
					model.setXterRqstSeq(xterRqstSeq[i]);
				if (divdSeq[i] != null)
					model.setDivdSeq(divdSeq[i]);
				if (xterRqstNo[i] != null)
					model.setXterRqstNo(xterRqstNo[i]);
				if (pckTpCd[i] != null)
					model.setPckTpCd(pckTpCd[i]);
				if (divdWgtUtCd[i] != null)
					model.setDivdWgtUtCd(divdWgtUtCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgXterXptLicNoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgXterXptLicNoVO[]
	 */
	public BkgXterXptLicNoVO[] getBkgXterXptLicNoVOs(){
		BkgXterXptLicNoVO[] vos = (BkgXterXptLicNoVO[])models.toArray(new BkgXterXptLicNoVO[models.size()]);
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
		this.xterSndrId = this.xterSndrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrWgt = this.cntrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xterTrspStsCd = this.xterTrspStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptLicNo = this.xptLicNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoDivdFlg = this.cgoDivdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptLicNoFileDt = this.xptLicNoFileDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.divdPckTpCd = this.divdPckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.divdPckQty = this.divdPckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.styId = this.styId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.divdWgt = this.divdWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xterRqstSeq = this.xterRqstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.divdSeq = this.divdSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xterRqstNo = this.xterRqstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckTpCd = this.pckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.divdWgtUtCd = this.divdWgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
