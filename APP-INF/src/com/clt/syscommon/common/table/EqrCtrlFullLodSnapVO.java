/*=========================================================
*Copyright(c) 2013 CyberLogitec
*@FileName : EqrCtrlFullLodSnapVO.java
*@FileTitle : EqrCtrlFullLodSnapVO
*Open Issues :
*Change history :
*@LastModifyDate : 2013.11.06
*@LastModifier : 
*@LastVersion : 1.0
* 2013.11.06  
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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EqrCtrlFullLodSnapVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrCtrlFullLodSnapVO> models = new ArrayList<EqrCtrlFullLodSnapVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String fullBkgDchgTtlWgt = null;
	/* Column Info */
	private String fullBkgObrdTtlTeuQty = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String fullBkgAvgTtlWgt = null;
	/* Column Info */
	private String fullBkgDchgTtlTeuQty = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String fullBkgLodTtlTeuQty = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String clptSeq = null;
	/* Column Info */
	private String fullBkgLodTtlWgt = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String polYdCd = null;
	/* Column Info */
	private String fullBkgObrdTtlWgt = null;
	/* Column Info */
	private String bkgObrdTtlWgt = null;
	/* Column Info */
	private String bkgObrdTtlTeuQty = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrCtrlFullLodSnapVO() {}

	public EqrCtrlFullLodSnapVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String polYdCd, String fullBkgLodTtlTeuQty, String fullBkgLodTtlWgt, String fullBkgDchgTtlTeuQty, String fullBkgDchgTtlWgt, String fullBkgObrdTtlTeuQty, String fullBkgObrdTtlWgt, String fullBkgAvgTtlWgt, String creUsrId, String creDt, String updUsrId, String updDt, String clptSeq, String bkgObrdTtlTeuQty, String bkgObrdTtlWgt) {
		this.updDt = updDt;
		this.vslCd = vslCd;
		this.fullBkgDchgTtlWgt = fullBkgDchgTtlWgt;
		this.fullBkgObrdTtlTeuQty = fullBkgObrdTtlTeuQty;
		this.creDt = creDt;
		this.skdVoyNo = skdVoyNo;
		this.fullBkgAvgTtlWgt = fullBkgAvgTtlWgt;
		this.fullBkgDchgTtlTeuQty = fullBkgDchgTtlTeuQty;
		this.skdDirCd = skdDirCd;
		this.fullBkgLodTtlTeuQty = fullBkgLodTtlTeuQty;
		this.pagerows = pagerows;
		this.clptSeq = clptSeq;
		this.fullBkgLodTtlWgt = fullBkgLodTtlWgt;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.polYdCd = polYdCd;
		this.fullBkgObrdTtlWgt = fullBkgObrdTtlWgt;
		this.bkgObrdTtlWgt = bkgObrdTtlWgt;
		this.bkgObrdTtlTeuQty = bkgObrdTtlTeuQty;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("full_bkg_dchg_ttl_wgt", getFullBkgDchgTtlWgt());
		this.hashColumns.put("full_bkg_obrd_ttl_teu_qty", getFullBkgObrdTtlTeuQty());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("full_bkg_avg_ttl_wgt", getFullBkgAvgTtlWgt());
		this.hashColumns.put("full_bkg_dchg_ttl_teu_qty", getFullBkgDchgTtlTeuQty());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("full_bkg_lod_ttl_teu_qty", getFullBkgLodTtlTeuQty());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("clpt_seq", getClptSeq());
		this.hashColumns.put("full_bkg_lod_ttl_wgt", getFullBkgLodTtlWgt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pol_yd_cd", getPolYdCd());
		this.hashColumns.put("full_bkg_obrd_ttl_wgt", getFullBkgObrdTtlWgt());
		this.hashColumns.put("bkg_obrd_ttl_wgt", getBkgObrdTtlWgt());
		this.hashColumns.put("bkg_obrd_ttl_teu_qty", getBkgObrdTtlTeuQty());
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
		this.hashFields.put("full_bkg_dchg_ttl_wgt", "fullBkgDchgTtlWgt");
		this.hashFields.put("full_bkg_obrd_ttl_teu_qty", "fullBkgObrdTtlTeuQty");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("full_bkg_avg_ttl_wgt", "fullBkgAvgTtlWgt");
		this.hashFields.put("full_bkg_dchg_ttl_teu_qty", "fullBkgDchgTtlTeuQty");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("full_bkg_lod_ttl_teu_qty", "fullBkgLodTtlTeuQty");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("clpt_seq", "clptSeq");
		this.hashFields.put("full_bkg_lod_ttl_wgt", "fullBkgLodTtlWgt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pol_yd_cd", "polYdCd");
		this.hashFields.put("full_bkg_obrd_ttl_wgt", "fullBkgObrdTtlWgt");
		this.hashFields.put("bkg_obrd_ttl_wgt", "bkgObrdTtlWgt");
		this.hashFields.put("bkg_obrd_ttl_teu_qty", "bkgObrdTtlTeuQty");
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
	 * @return fullBkgDchgTtlWgt
	 */
	public String getFullBkgDchgTtlWgt() {
		return this.fullBkgDchgTtlWgt;
	}
	
	/**
	 * Column Info
	 * @return fullBkgObrdTtlTeuQty
	 */
	public String getFullBkgObrdTtlTeuQty() {
		return this.fullBkgObrdTtlTeuQty;
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
	 * @return fullBkgAvgTtlWgt
	 */
	public String getFullBkgAvgTtlWgt() {
		return this.fullBkgAvgTtlWgt;
	}
	
	/**
	 * Column Info
	 * @return fullBkgDchgTtlTeuQty
	 */
	public String getFullBkgDchgTtlTeuQty() {
		return this.fullBkgDchgTtlTeuQty;
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
	 * @return fullBkgLodTtlTeuQty
	 */
	public String getFullBkgLodTtlTeuQty() {
		return this.fullBkgLodTtlTeuQty;
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
	 * @return clptSeq
	 */
	public String getClptSeq() {
		return this.clptSeq;
	}
	
	/**
	 * Column Info
	 * @return fullBkgLodTtlWgt
	 */
	public String getFullBkgLodTtlWgt() {
		return this.fullBkgLodTtlWgt;
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
	 * @return polYdCd
	 */
	public String getPolYdCd() {
		return this.polYdCd;
	}
	
	/**
	 * Column Info
	 * @return fullBkgObrdTtlWgt
	 */
	public String getFullBkgObrdTtlWgt() {
		return this.fullBkgObrdTtlWgt;
	}
	
	/**
	 * Column Info
	 * @return bkgObrdTtlWgt
	 */
	public String getBkgObrdTtlWgt() {
		return this.bkgObrdTtlWgt;
	}
	
	/**
	 * Column Info
	 * @return bkgObrdTtlTeuQty
	 */
	public String getBkgObrdTtlTeuQty() {
		return this.bkgObrdTtlTeuQty;
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
	 * @param fullBkgDchgTtlWgt
	 */
	public void setFullBkgDchgTtlWgt(String fullBkgDchgTtlWgt) {
		this.fullBkgDchgTtlWgt = fullBkgDchgTtlWgt;
	}
	
	/**
	 * Column Info
	 * @param fullBkgObrdTtlTeuQty
	 */
	public void setFullBkgObrdTtlTeuQty(String fullBkgObrdTtlTeuQty) {
		this.fullBkgObrdTtlTeuQty = fullBkgObrdTtlTeuQty;
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
	 * @param fullBkgAvgTtlWgt
	 */
	public void setFullBkgAvgTtlWgt(String fullBkgAvgTtlWgt) {
		this.fullBkgAvgTtlWgt = fullBkgAvgTtlWgt;
	}
	
	/**
	 * Column Info
	 * @param fullBkgDchgTtlTeuQty
	 */
	public void setFullBkgDchgTtlTeuQty(String fullBkgDchgTtlTeuQty) {
		this.fullBkgDchgTtlTeuQty = fullBkgDchgTtlTeuQty;
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
	 * @param fullBkgLodTtlTeuQty
	 */
	public void setFullBkgLodTtlTeuQty(String fullBkgLodTtlTeuQty) {
		this.fullBkgLodTtlTeuQty = fullBkgLodTtlTeuQty;
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
	 * @param clptSeq
	 */
	public void setClptSeq(String clptSeq) {
		this.clptSeq = clptSeq;
	}
	
	/**
	 * Column Info
	 * @param fullBkgLodTtlWgt
	 */
	public void setFullBkgLodTtlWgt(String fullBkgLodTtlWgt) {
		this.fullBkgLodTtlWgt = fullBkgLodTtlWgt;
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
	 * @param polYdCd
	 */
	public void setPolYdCd(String polYdCd) {
		this.polYdCd = polYdCd;
	}
	
	/**
	 * Column Info
	 * @param fullBkgObrdTtlWgt
	 */
	public void setFullBkgObrdTtlWgt(String fullBkgObrdTtlWgt) {
		this.fullBkgObrdTtlWgt = fullBkgObrdTtlWgt;
	}
	
	/**
	 * Column Info
	 * @param bkgObrdTtlWgt
	 */
	public void setBkgObrdTtlWgt(String bkgObrdTtlWgt) {
		this.bkgObrdTtlWgt = bkgObrdTtlWgt;
	}
	
	/**
	 * Column Info
	 * @param bkgObrdTtlTeuQty
	 */
	public void setBkgObrdTtlTeuQty(String bkgObrdTtlTeuQty) {
		this.bkgObrdTtlTeuQty = bkgObrdTtlTeuQty;
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
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setFullBkgDchgTtlWgt(JSPUtil.getParameter(request, prefix + "full_bkg_dchg_ttl_wgt", ""));
		setFullBkgObrdTtlTeuQty(JSPUtil.getParameter(request, prefix + "full_bkg_obrd_ttl_teu_qty", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setFullBkgAvgTtlWgt(JSPUtil.getParameter(request, prefix + "full_bkg_avg_ttl_wgt", ""));
		setFullBkgDchgTtlTeuQty(JSPUtil.getParameter(request, prefix + "full_bkg_dchg_ttl_teu_qty", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setFullBkgLodTtlTeuQty(JSPUtil.getParameter(request, prefix + "full_bkg_lod_ttl_teu_qty", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setClptSeq(JSPUtil.getParameter(request, prefix + "clpt_seq", ""));
		setFullBkgLodTtlWgt(JSPUtil.getParameter(request, prefix + "full_bkg_lod_ttl_wgt", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setPolYdCd(JSPUtil.getParameter(request, prefix + "pol_yd_cd", ""));
		setFullBkgObrdTtlWgt(JSPUtil.getParameter(request, prefix + "full_bkg_obrd_ttl_wgt", ""));
		setBkgObrdTtlWgt(JSPUtil.getParameter(request, prefix + "bkg_obrd_ttl_wgt", ""));
		setBkgObrdTtlTeuQty(JSPUtil.getParameter(request, prefix + "bkg_obrd_ttl_teu_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrCtrlFullLodSnapVO[]
	 */
	public EqrCtrlFullLodSnapVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrCtrlFullLodSnapVO[]
	 */
	public EqrCtrlFullLodSnapVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrCtrlFullLodSnapVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] fullBkgDchgTtlWgt = (JSPUtil.getParameter(request, prefix	+ "full_bkg_dchg_ttl_wgt", length));
			String[] fullBkgObrdTtlTeuQty = (JSPUtil.getParameter(request, prefix	+ "full_bkg_obrd_ttl_teu_qty", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] fullBkgAvgTtlWgt = (JSPUtil.getParameter(request, prefix	+ "full_bkg_avg_ttl_wgt", length));
			String[] fullBkgDchgTtlTeuQty = (JSPUtil.getParameter(request, prefix	+ "full_bkg_dchg_ttl_teu_qty", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] fullBkgLodTtlTeuQty = (JSPUtil.getParameter(request, prefix	+ "full_bkg_lod_ttl_teu_qty", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] clptSeq = (JSPUtil.getParameter(request, prefix	+ "clpt_seq", length));
			String[] fullBkgLodTtlWgt = (JSPUtil.getParameter(request, prefix	+ "full_bkg_lod_ttl_wgt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] polYdCd = (JSPUtil.getParameter(request, prefix	+ "pol_yd_cd", length));
			String[] fullBkgObrdTtlWgt = (JSPUtil.getParameter(request, prefix	+ "full_bkg_obrd_ttl_wgt", length));
			String[] bkgObrdTtlWgt = (JSPUtil.getParameter(request, prefix	+ "bkg_obrd_ttl_wgt", length));
			String[] bkgObrdTtlTeuQty = (JSPUtil.getParameter(request, prefix	+ "bkg_obrd_ttl_teu_qty", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrCtrlFullLodSnapVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (fullBkgDchgTtlWgt[i] != null)
					model.setFullBkgDchgTtlWgt(fullBkgDchgTtlWgt[i]);
				if (fullBkgObrdTtlTeuQty[i] != null)
					model.setFullBkgObrdTtlTeuQty(fullBkgObrdTtlTeuQty[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (fullBkgAvgTtlWgt[i] != null)
					model.setFullBkgAvgTtlWgt(fullBkgAvgTtlWgt[i]);
				if (fullBkgDchgTtlTeuQty[i] != null)
					model.setFullBkgDchgTtlTeuQty(fullBkgDchgTtlTeuQty[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (fullBkgLodTtlTeuQty[i] != null)
					model.setFullBkgLodTtlTeuQty(fullBkgLodTtlTeuQty[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (clptSeq[i] != null)
					model.setClptSeq(clptSeq[i]);
				if (fullBkgLodTtlWgt[i] != null)
					model.setFullBkgLodTtlWgt(fullBkgLodTtlWgt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (polYdCd[i] != null)
					model.setPolYdCd(polYdCd[i]);
				if (fullBkgObrdTtlWgt[i] != null)
					model.setFullBkgObrdTtlWgt(fullBkgObrdTtlWgt[i]);
				if (bkgObrdTtlWgt[i] != null)
					model.setBkgObrdTtlWgt(bkgObrdTtlWgt[i]);
				if (bkgObrdTtlTeuQty[i] != null)
					model.setBkgObrdTtlTeuQty(bkgObrdTtlTeuQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrCtrlFullLodSnapVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrCtrlFullLodSnapVO[]
	 */
	public EqrCtrlFullLodSnapVO[] getEqrCtrlFullLodSnapVOs(){
		EqrCtrlFullLodSnapVO[] vos = (EqrCtrlFullLodSnapVO[])models.toArray(new EqrCtrlFullLodSnapVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullBkgDchgTtlWgt = this.fullBkgDchgTtlWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullBkgObrdTtlTeuQty = this.fullBkgObrdTtlTeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullBkgAvgTtlWgt = this.fullBkgAvgTtlWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullBkgDchgTtlTeuQty = this.fullBkgDchgTtlTeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullBkgLodTtlTeuQty = this.fullBkgLodTtlTeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clptSeq = this.clptSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullBkgLodTtlWgt = this.fullBkgLodTtlWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polYdCd = this.polYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullBkgObrdTtlWgt = this.fullBkgObrdTtlWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgObrdTtlWgt = this.bkgObrdTtlWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgObrdTtlTeuQty = this.bkgObrdTtlTeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
