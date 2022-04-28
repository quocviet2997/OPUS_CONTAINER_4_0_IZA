/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BsaVvdSwapInfoVO.java
*@FileTitle : BsaVvdSwapInfoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.03
*@LastModifier : 남궁진호
*@LastVersion : 1.0
* 2009.09.03 남궁진호 
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
 * @author 남궁진호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BsaVvdSwapInfoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BsaVvdSwapInfoVO> models = new ArrayList<BsaVvdSwapInfoVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String sltSwapVvdCd = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String sltSwapTeuCapa = null;
	/* Column Info */
	private String sltSwapWgt = null;
	/* Column Info */
	private String purWgt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String crrCd = null;
	/* Column Info */
	private String freeAddWgt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String slsWgt = null;
	/* Column Info */
	private String bsaOpJbCd = null;
	/* Column Info */
	private String purTeuCapa = null;
	/* Column Info */
	private String sltSwapRlaneCd = null;
	/* Column Info */
	private String sltSwapAmt = null;
	/* Column Info */
	private String freeAddTeuCapa = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String slsTeuCapa = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BsaVvdSwapInfoVO() {}

	public BsaVvdSwapInfoVO(String ibflag, String pagerows, String trdCd, String rlaneCd, String vslCd, String skdVoyNo, String skdDirCd, String crrCd, String sltSwapRlaneCd, String slsTeuCapa, String slsWgt, String purTeuCapa, String purWgt, String sltSwapVvdCd, String sltSwapTeuCapa, String sltSwapWgt, String sltSwapAmt, String freeAddTeuCapa, String freeAddWgt, String bsaOpJbCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.sltSwapVvdCd = sltSwapVvdCd;
		this.vslCd = vslCd;
		this.sltSwapTeuCapa = sltSwapTeuCapa;
		this.sltSwapWgt = sltSwapWgt;
		this.purWgt = purWgt;
		this.creDt = creDt;
		this.trdCd = trdCd;
		this.skdVoyNo = skdVoyNo;
		this.rlaneCd = rlaneCd;
		this.skdDirCd = skdDirCd;
		this.crrCd = crrCd;
		this.freeAddWgt = freeAddWgt;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.slsWgt = slsWgt;
		this.bsaOpJbCd = bsaOpJbCd;
		this.purTeuCapa = purTeuCapa;
		this.sltSwapRlaneCd = sltSwapRlaneCd;
		this.sltSwapAmt = sltSwapAmt;
		this.freeAddTeuCapa = freeAddTeuCapa;
		this.updUsrId = updUsrId;
		this.slsTeuCapa = slsTeuCapa;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("slt_swap_vvd_cd", getSltSwapVvdCd());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("slt_swap_teu_capa", getSltSwapTeuCapa());
		this.hashColumns.put("slt_swap_wgt", getSltSwapWgt());
		this.hashColumns.put("pur_wgt", getPurWgt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("crr_cd", getCrrCd());
		this.hashColumns.put("free_add_wgt", getFreeAddWgt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("sls_wgt", getSlsWgt());
		this.hashColumns.put("bsa_op_jb_cd", getBsaOpJbCd());
		this.hashColumns.put("pur_teu_capa", getPurTeuCapa());
		this.hashColumns.put("slt_swap_rlane_cd", getSltSwapRlaneCd());
		this.hashColumns.put("slt_swap_amt", getSltSwapAmt());
		this.hashColumns.put("free_add_teu_capa", getFreeAddTeuCapa());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("sls_teu_capa", getSlsTeuCapa());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("slt_swap_vvd_cd", "sltSwapVvdCd");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("slt_swap_teu_capa", "sltSwapTeuCapa");
		this.hashFields.put("slt_swap_wgt", "sltSwapWgt");
		this.hashFields.put("pur_wgt", "purWgt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("crr_cd", "crrCd");
		this.hashFields.put("free_add_wgt", "freeAddWgt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("sls_wgt", "slsWgt");
		this.hashFields.put("bsa_op_jb_cd", "bsaOpJbCd");
		this.hashFields.put("pur_teu_capa", "purTeuCapa");
		this.hashFields.put("slt_swap_rlane_cd", "sltSwapRlaneCd");
		this.hashFields.put("slt_swap_amt", "sltSwapAmt");
		this.hashFields.put("free_add_teu_capa", "freeAddTeuCapa");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("sls_teu_capa", "slsTeuCapa");
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
	 * @return sltSwapVvdCd
	 */
	public String getSltSwapVvdCd() {
		return this.sltSwapVvdCd;
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
	 * @return sltSwapTeuCapa
	 */
	public String getSltSwapTeuCapa() {
		return this.sltSwapTeuCapa;
	}
	
	/**
	 * Column Info
	 * @return sltSwapWgt
	 */
	public String getSltSwapWgt() {
		return this.sltSwapWgt;
	}
	
	/**
	 * Column Info
	 * @return purWgt
	 */
	public String getPurWgt() {
		return this.purWgt;
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
	 * @return trdCd
	 */
	public String getTrdCd() {
		return this.trdCd;
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
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
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
	 * @return crrCd
	 */
	public String getCrrCd() {
		return this.crrCd;
	}
	
	/**
	 * Column Info
	 * @return freeAddWgt
	 */
	public String getFreeAddWgt() {
		return this.freeAddWgt;
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
	 * @return slsWgt
	 */
	public String getSlsWgt() {
		return this.slsWgt;
	}
	
	/**
	 * Column Info
	 * @return bsaOpJbCd
	 */
	public String getBsaOpJbCd() {
		return this.bsaOpJbCd;
	}
	
	/**
	 * Column Info
	 * @return purTeuCapa
	 */
	public String getPurTeuCapa() {
		return this.purTeuCapa;
	}
	
	/**
	 * Column Info
	 * @return sltSwapRlaneCd
	 */
	public String getSltSwapRlaneCd() {
		return this.sltSwapRlaneCd;
	}
	
	/**
	 * Column Info
	 * @return sltSwapAmt
	 */
	public String getSltSwapAmt() {
		return this.sltSwapAmt;
	}
	
	/**
	 * Column Info
	 * @return freeAddTeuCapa
	 */
	public String getFreeAddTeuCapa() {
		return this.freeAddTeuCapa;
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
	 * @return slsTeuCapa
	 */
	public String getSlsTeuCapa() {
		return this.slsTeuCapa;
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
	 * @param sltSwapVvdCd
	 */
	public void setSltSwapVvdCd(String sltSwapVvdCd) {
		this.sltSwapVvdCd = sltSwapVvdCd;
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
	 * @param sltSwapTeuCapa
	 */
	public void setSltSwapTeuCapa(String sltSwapTeuCapa) {
		this.sltSwapTeuCapa = sltSwapTeuCapa;
	}
	
	/**
	 * Column Info
	 * @param sltSwapWgt
	 */
	public void setSltSwapWgt(String sltSwapWgt) {
		this.sltSwapWgt = sltSwapWgt;
	}
	
	/**
	 * Column Info
	 * @param purWgt
	 */
	public void setPurWgt(String purWgt) {
		this.purWgt = purWgt;
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
	 * @param trdCd
	 */
	public void setTrdCd(String trdCd) {
		this.trdCd = trdCd;
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
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
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
	 * @param crrCd
	 */
	public void setCrrCd(String crrCd) {
		this.crrCd = crrCd;
	}
	
	/**
	 * Column Info
	 * @param freeAddWgt
	 */
	public void setFreeAddWgt(String freeAddWgt) {
		this.freeAddWgt = freeAddWgt;
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
	 * @param slsWgt
	 */
	public void setSlsWgt(String slsWgt) {
		this.slsWgt = slsWgt;
	}
	
	/**
	 * Column Info
	 * @param bsaOpJbCd
	 */
	public void setBsaOpJbCd(String bsaOpJbCd) {
		this.bsaOpJbCd = bsaOpJbCd;
	}
	
	/**
	 * Column Info
	 * @param purTeuCapa
	 */
	public void setPurTeuCapa(String purTeuCapa) {
		this.purTeuCapa = purTeuCapa;
	}
	
	/**
	 * Column Info
	 * @param sltSwapRlaneCd
	 */
	public void setSltSwapRlaneCd(String sltSwapRlaneCd) {
		this.sltSwapRlaneCd = sltSwapRlaneCd;
	}
	
	/**
	 * Column Info
	 * @param sltSwapAmt
	 */
	public void setSltSwapAmt(String sltSwapAmt) {
		this.sltSwapAmt = sltSwapAmt;
	}
	
	/**
	 * Column Info
	 * @param freeAddTeuCapa
	 */
	public void setFreeAddTeuCapa(String freeAddTeuCapa) {
		this.freeAddTeuCapa = freeAddTeuCapa;
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
	 * @param slsTeuCapa
	 */
	public void setSlsTeuCapa(String slsTeuCapa) {
		this.slsTeuCapa = slsTeuCapa;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setSltSwapVvdCd(JSPUtil.getParameter(request, "slt_swap_vvd_cd", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setSltSwapTeuCapa(JSPUtil.getParameter(request, "slt_swap_teu_capa", ""));
		setSltSwapWgt(JSPUtil.getParameter(request, "slt_swap_wgt", ""));
		setPurWgt(JSPUtil.getParameter(request, "pur_wgt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setCrrCd(JSPUtil.getParameter(request, "crr_cd", ""));
		setFreeAddWgt(JSPUtil.getParameter(request, "free_add_wgt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSlsWgt(JSPUtil.getParameter(request, "sls_wgt", ""));
		setBsaOpJbCd(JSPUtil.getParameter(request, "bsa_op_jb_cd", ""));
		setPurTeuCapa(JSPUtil.getParameter(request, "pur_teu_capa", ""));
		setSltSwapRlaneCd(JSPUtil.getParameter(request, "slt_swap_rlane_cd", ""));
		setSltSwapAmt(JSPUtil.getParameter(request, "slt_swap_amt", ""));
		setFreeAddTeuCapa(JSPUtil.getParameter(request, "free_add_teu_capa", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setSlsTeuCapa(JSPUtil.getParameter(request, "sls_teu_capa", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BsaVvdSwapInfoVO[]
	 */
	public BsaVvdSwapInfoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BsaVvdSwapInfoVO[]
	 */
	public BsaVvdSwapInfoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BsaVvdSwapInfoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] sltSwapVvdCd = (JSPUtil.getParameter(request, prefix	+ "slt_swap_vvd_cd", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] sltSwapTeuCapa = (JSPUtil.getParameter(request, prefix	+ "slt_swap_teu_capa", length));
			String[] sltSwapWgt = (JSPUtil.getParameter(request, prefix	+ "slt_swap_wgt", length));
			String[] purWgt = (JSPUtil.getParameter(request, prefix	+ "pur_wgt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] crrCd = (JSPUtil.getParameter(request, prefix	+ "crr_cd", length));
			String[] freeAddWgt = (JSPUtil.getParameter(request, prefix	+ "free_add_wgt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] slsWgt = (JSPUtil.getParameter(request, prefix	+ "sls_wgt", length));
			String[] bsaOpJbCd = (JSPUtil.getParameter(request, prefix	+ "bsa_op_jb_cd", length));
			String[] purTeuCapa = (JSPUtil.getParameter(request, prefix	+ "pur_teu_capa", length));
			String[] sltSwapRlaneCd = (JSPUtil.getParameter(request, prefix	+ "slt_swap_rlane_cd", length));
			String[] sltSwapAmt = (JSPUtil.getParameter(request, prefix	+ "slt_swap_amt", length));
			String[] freeAddTeuCapa = (JSPUtil.getParameter(request, prefix	+ "free_add_teu_capa", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] slsTeuCapa = (JSPUtil.getParameter(request, prefix	+ "sls_teu_capa", length));
			
			for (int i = 0; i < length; i++) {
				model = new BsaVvdSwapInfoVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (sltSwapVvdCd[i] != null)
					model.setSltSwapVvdCd(sltSwapVvdCd[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (sltSwapTeuCapa[i] != null)
					model.setSltSwapTeuCapa(sltSwapTeuCapa[i]);
				if (sltSwapWgt[i] != null)
					model.setSltSwapWgt(sltSwapWgt[i]);
				if (purWgt[i] != null)
					model.setPurWgt(purWgt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (crrCd[i] != null)
					model.setCrrCd(crrCd[i]);
				if (freeAddWgt[i] != null)
					model.setFreeAddWgt(freeAddWgt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (slsWgt[i] != null)
					model.setSlsWgt(slsWgt[i]);
				if (bsaOpJbCd[i] != null)
					model.setBsaOpJbCd(bsaOpJbCd[i]);
				if (purTeuCapa[i] != null)
					model.setPurTeuCapa(purTeuCapa[i]);
				if (sltSwapRlaneCd[i] != null)
					model.setSltSwapRlaneCd(sltSwapRlaneCd[i]);
				if (sltSwapAmt[i] != null)
					model.setSltSwapAmt(sltSwapAmt[i]);
				if (freeAddTeuCapa[i] != null)
					model.setFreeAddTeuCapa(freeAddTeuCapa[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (slsTeuCapa[i] != null)
					model.setSlsTeuCapa(slsTeuCapa[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBsaVvdSwapInfoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BsaVvdSwapInfoVO[]
	 */
	public BsaVvdSwapInfoVO[] getBsaVvdSwapInfoVOs(){
		BsaVvdSwapInfoVO[] vos = (BsaVvdSwapInfoVO[])models.toArray(new BsaVvdSwapInfoVO[models.size()]);
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
		this.sltSwapVvdCd = this.sltSwapVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sltSwapTeuCapa = this.sltSwapTeuCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sltSwapWgt = this.sltSwapWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.purWgt = this.purWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crrCd = this.crrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.freeAddWgt = this.freeAddWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsWgt = this.slsWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsaOpJbCd = this.bsaOpJbCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.purTeuCapa = this.purTeuCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sltSwapRlaneCd = this.sltSwapRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sltSwapAmt = this.sltSwapAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.freeAddTeuCapa = this.freeAddTeuCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsTeuCapa = this.slsTeuCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
