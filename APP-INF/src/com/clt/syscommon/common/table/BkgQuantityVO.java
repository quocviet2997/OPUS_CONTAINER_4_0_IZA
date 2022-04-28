/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgQuantityVO.java
*@FileTitle : BkgQuantityVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.03
*@LastModifier : 이남경
*@LastVersion : 1.0
* 2009.06.03 이남경 
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
 * @author 이남경
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgQuantityVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgQuantityVO> models = new ArrayList<BkgQuantityVO>();
	
	/* Column Info */
	private String dcgoQty = null;
	/* Column Info */
	private String crrHngrSglBarQty = null;
	/* Column Info */
	private String eqSubstCgoQty = null;
	/* Column Info */
	private String obTroQty = null;
	/* Column Info */
	private String awkCgoQty = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String actCntrQty = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String crrHngrDblBarQty = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String rcQty = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String destCntrQty = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String merHngrQty = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String bkgNoSplit = null;
	/* Column Info */
	private String crrHngrQty = null;
	/* Column Info */
	private String orgCntrQty = null;
	/* Column Info */
	private String eqSubstCntrTpszCd = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bbCgoQty = null;
	/* Column Info */
	private String ibTroQty = null;
	/* Column Info */
	private String opCntrQty = null;
	/* Column Info */
	private String flexHgtFlg = null;
	/* Column Info */
	private String socQty = null;
	/* Column Info */
	private String crrHngrTplBarQty = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgQuantityVO() {}

	public BkgQuantityVO(String ibflag, String pagerows, String bkgNo, String bkgNoSplit, String cntrTpszCd, String opCntrQty, String actCntrQty, String dcgoQty, String awkCgoQty, String rcQty, String bbCgoQty, String socQty, String eqSubstCntrTpszCd, String eqSubstCgoQty, String merHngrQty, String crrHngrQty, String crrHngrSglBarQty, String crrHngrDblBarQty, String crrHngrTplBarQty, String orgCntrQty, String destCntrQty, String obTroQty, String ibTroQty, String flexHgtFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.dcgoQty = dcgoQty;
		this.crrHngrSglBarQty = crrHngrSglBarQty;
		this.eqSubstCgoQty = eqSubstCgoQty;
		this.obTroQty = obTroQty;
		this.awkCgoQty = awkCgoQty;
		this.creDt = creDt;
		this.actCntrQty = actCntrQty;
		this.pagerows = pagerows;
		this.crrHngrDblBarQty = crrHngrDblBarQty;
		this.ibflag = ibflag;
		this.rcQty = rcQty;
		this.cntrTpszCd = cntrTpszCd;
		this.destCntrQty = destCntrQty;
		this.updUsrId = updUsrId;
		this.merHngrQty = merHngrQty;
		this.updDt = updDt;
		this.bkgNoSplit = bkgNoSplit;
		this.crrHngrQty = crrHngrQty;
		this.orgCntrQty = orgCntrQty;
		this.eqSubstCntrTpszCd = eqSubstCntrTpszCd;
		this.bkgNo = bkgNo;
		this.creUsrId = creUsrId;
		this.bbCgoQty = bbCgoQty;
		this.ibTroQty = ibTroQty;
		this.opCntrQty = opCntrQty;
		this.flexHgtFlg = flexHgtFlg;
		this.socQty = socQty;
		this.crrHngrTplBarQty = crrHngrTplBarQty;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("dcgo_qty", getDcgoQty());
		this.hashColumns.put("crr_hngr_sgl_bar_qty", getCrrHngrSglBarQty());
		this.hashColumns.put("eq_subst_cgo_qty", getEqSubstCgoQty());
		this.hashColumns.put("ob_tro_qty", getObTroQty());
		this.hashColumns.put("awk_cgo_qty", getAwkCgoQty());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("act_cntr_qty", getActCntrQty());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("crr_hngr_dbl_bar_qty", getCrrHngrDblBarQty());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rc_qty", getRcQty());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("dest_cntr_qty", getDestCntrQty());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("mer_hngr_qty", getMerHngrQty());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("bkg_no_split", getBkgNoSplit());
		this.hashColumns.put("crr_hngr_qty", getCrrHngrQty());
		this.hashColumns.put("org_cntr_qty", getOrgCntrQty());
		this.hashColumns.put("eq_subst_cntr_tpsz_cd", getEqSubstCntrTpszCd());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bb_cgo_qty", getBbCgoQty());
		this.hashColumns.put("ib_tro_qty", getIbTroQty());
		this.hashColumns.put("op_cntr_qty", getOpCntrQty());
		this.hashColumns.put("flex_hgt_flg", getFlexHgtFlg());
		this.hashColumns.put("soc_qty", getSocQty());
		this.hashColumns.put("crr_hngr_tpl_bar_qty", getCrrHngrTplBarQty());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("dcgo_qty", "dcgoQty");
		this.hashFields.put("crr_hngr_sgl_bar_qty", "crrHngrSglBarQty");
		this.hashFields.put("eq_subst_cgo_qty", "eqSubstCgoQty");
		this.hashFields.put("ob_tro_qty", "obTroQty");
		this.hashFields.put("awk_cgo_qty", "awkCgoQty");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("act_cntr_qty", "actCntrQty");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("crr_hngr_dbl_bar_qty", "crrHngrDblBarQty");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rc_qty", "rcQty");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("dest_cntr_qty", "destCntrQty");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("mer_hngr_qty", "merHngrQty");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("bkg_no_split", "bkgNoSplit");
		this.hashFields.put("crr_hngr_qty", "crrHngrQty");
		this.hashFields.put("org_cntr_qty", "orgCntrQty");
		this.hashFields.put("eq_subst_cntr_tpsz_cd", "eqSubstCntrTpszCd");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bb_cgo_qty", "bbCgoQty");
		this.hashFields.put("ib_tro_qty", "ibTroQty");
		this.hashFields.put("op_cntr_qty", "opCntrQty");
		this.hashFields.put("flex_hgt_flg", "flexHgtFlg");
		this.hashFields.put("soc_qty", "socQty");
		this.hashFields.put("crr_hngr_tpl_bar_qty", "crrHngrTplBarQty");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return dcgoQty
	 */
	public String getDcgoQty() {
		return this.dcgoQty;
	}
	
	/**
	 * Column Info
	 * @return crrHngrSglBarQty
	 */
	public String getCrrHngrSglBarQty() {
		return this.crrHngrSglBarQty;
	}
	
	/**
	 * Column Info
	 * @return eqSubstCgoQty
	 */
	public String getEqSubstCgoQty() {
		return this.eqSubstCgoQty;
	}
	
	/**
	 * Column Info
	 * @return obTroQty
	 */
	public String getObTroQty() {
		return this.obTroQty;
	}
	
	/**
	 * Column Info
	 * @return awkCgoQty
	 */
	public String getAwkCgoQty() {
		return this.awkCgoQty;
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
	 * @return actCntrQty
	 */
	public String getActCntrQty() {
		return this.actCntrQty;
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
	 * @return crrHngrDblBarQty
	 */
	public String getCrrHngrDblBarQty() {
		return this.crrHngrDblBarQty;
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
	 * @return rcQty
	 */
	public String getRcQty() {
		return this.rcQty;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return destCntrQty
	 */
	public String getDestCntrQty() {
		return this.destCntrQty;
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
	 * @return merHngrQty
	 */
	public String getMerHngrQty() {
		return this.merHngrQty;
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
	 * @return bkgNoSplit
	 */
	public String getBkgNoSplit() {
		return this.bkgNoSplit;
	}
	
	/**
	 * Column Info
	 * @return crrHngrQty
	 */
	public String getCrrHngrQty() {
		return this.crrHngrQty;
	}
	
	/**
	 * Column Info
	 * @return orgCntrQty
	 */
	public String getOrgCntrQty() {
		return this.orgCntrQty;
	}
	
	/**
	 * Column Info
	 * @return eqSubstCntrTpszCd
	 */
	public String getEqSubstCntrTpszCd() {
		return this.eqSubstCntrTpszCd;
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
	 * @return bbCgoQty
	 */
	public String getBbCgoQty() {
		return this.bbCgoQty;
	}
	
	/**
	 * Column Info
	 * @return ibTroQty
	 */
	public String getIbTroQty() {
		return this.ibTroQty;
	}
	
	/**
	 * Column Info
	 * @return opCntrQty
	 */
	public String getOpCntrQty() {
		return this.opCntrQty;
	}
	
	/**
	 * Column Info
	 * @return flexHgtFlg
	 */
	public String getFlexHgtFlg() {
		return this.flexHgtFlg;
	}
	
	/**
	 * Column Info
	 * @return socQty
	 */
	public String getSocQty() {
		return this.socQty;
	}
	
	/**
	 * Column Info
	 * @return crrHngrTplBarQty
	 */
	public String getCrrHngrTplBarQty() {
		return this.crrHngrTplBarQty;
	}
	

	/**
	 * Column Info
	 * @param dcgoQty
	 */
	public void setDcgoQty(String dcgoQty) {
		this.dcgoQty = dcgoQty;
	}
	
	/**
	 * Column Info
	 * @param crrHngrSglBarQty
	 */
	public void setCrrHngrSglBarQty(String crrHngrSglBarQty) {
		this.crrHngrSglBarQty = crrHngrSglBarQty;
	}
	
	/**
	 * Column Info
	 * @param eqSubstCgoQty
	 */
	public void setEqSubstCgoQty(String eqSubstCgoQty) {
		this.eqSubstCgoQty = eqSubstCgoQty;
	}
	
	/**
	 * Column Info
	 * @param obTroQty
	 */
	public void setObTroQty(String obTroQty) {
		this.obTroQty = obTroQty;
	}
	
	/**
	 * Column Info
	 * @param awkCgoQty
	 */
	public void setAwkCgoQty(String awkCgoQty) {
		this.awkCgoQty = awkCgoQty;
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
	 * @param actCntrQty
	 */
	public void setActCntrQty(String actCntrQty) {
		this.actCntrQty = actCntrQty;
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
	 * @param crrHngrDblBarQty
	 */
	public void setCrrHngrDblBarQty(String crrHngrDblBarQty) {
		this.crrHngrDblBarQty = crrHngrDblBarQty;
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
	 * @param rcQty
	 */
	public void setRcQty(String rcQty) {
		this.rcQty = rcQty;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param destCntrQty
	 */
	public void setDestCntrQty(String destCntrQty) {
		this.destCntrQty = destCntrQty;
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
	 * @param merHngrQty
	 */
	public void setMerHngrQty(String merHngrQty) {
		this.merHngrQty = merHngrQty;
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
	 * @param bkgNoSplit
	 */
	public void setBkgNoSplit(String bkgNoSplit) {
		this.bkgNoSplit = bkgNoSplit;
	}
	
	/**
	 * Column Info
	 * @param crrHngrQty
	 */
	public void setCrrHngrQty(String crrHngrQty) {
		this.crrHngrQty = crrHngrQty;
	}
	
	/**
	 * Column Info
	 * @param orgCntrQty
	 */
	public void setOrgCntrQty(String orgCntrQty) {
		this.orgCntrQty = orgCntrQty;
	}
	
	/**
	 * Column Info
	 * @param eqSubstCntrTpszCd
	 */
	public void setEqSubstCntrTpszCd(String eqSubstCntrTpszCd) {
		this.eqSubstCntrTpszCd = eqSubstCntrTpszCd;
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
	 * @param bbCgoQty
	 */
	public void setBbCgoQty(String bbCgoQty) {
		this.bbCgoQty = bbCgoQty;
	}
	
	/**
	 * Column Info
	 * @param ibTroQty
	 */
	public void setIbTroQty(String ibTroQty) {
		this.ibTroQty = ibTroQty;
	}
	
	/**
	 * Column Info
	 * @param opCntrQty
	 */
	public void setOpCntrQty(String opCntrQty) {
		this.opCntrQty = opCntrQty;
	}
	
	/**
	 * Column Info
	 * @param flexHgtFlg
	 */
	public void setFlexHgtFlg(String flexHgtFlg) {
		this.flexHgtFlg = flexHgtFlg;
	}
	
	/**
	 * Column Info
	 * @param socQty
	 */
	public void setSocQty(String socQty) {
		this.socQty = socQty;
	}
	
	/**
	 * Column Info
	 * @param crrHngrTplBarQty
	 */
	public void setCrrHngrTplBarQty(String crrHngrTplBarQty) {
		this.crrHngrTplBarQty = crrHngrTplBarQty;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setDcgoQty(JSPUtil.getParameter(request, "dcgo_qty", ""));
		setCrrHngrSglBarQty(JSPUtil.getParameter(request, "crr_hngr_sgl_bar_qty", ""));
		setEqSubstCgoQty(JSPUtil.getParameter(request, "eq_subst_cgo_qty", ""));
		setObTroQty(JSPUtil.getParameter(request, "ob_tro_qty", ""));
		setAwkCgoQty(JSPUtil.getParameter(request, "awk_cgo_qty", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setActCntrQty(JSPUtil.getParameter(request, "act_cntr_qty", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCrrHngrDblBarQty(JSPUtil.getParameter(request, "crr_hngr_dbl_bar_qty", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setRcQty(JSPUtil.getParameter(request, "rc_qty", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setDestCntrQty(JSPUtil.getParameter(request, "dest_cntr_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setMerHngrQty(JSPUtil.getParameter(request, "mer_hngr_qty", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setBkgNoSplit(JSPUtil.getParameter(request, "bkg_no_split", ""));
		setCrrHngrQty(JSPUtil.getParameter(request, "crr_hngr_qty", ""));
		setOrgCntrQty(JSPUtil.getParameter(request, "org_cntr_qty", ""));
		setEqSubstCntrTpszCd(JSPUtil.getParameter(request, "eq_subst_cntr_tpsz_cd", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBbCgoQty(JSPUtil.getParameter(request, "bb_cgo_qty", ""));
		setIbTroQty(JSPUtil.getParameter(request, "ib_tro_qty", ""));
		setOpCntrQty(JSPUtil.getParameter(request, "op_cntr_qty", ""));
		setFlexHgtFlg(JSPUtil.getParameter(request, "flex_hgt_flg", ""));
		setSocQty(JSPUtil.getParameter(request, "soc_qty", ""));
		setCrrHngrTplBarQty(JSPUtil.getParameter(request, "crr_hngr_tpl_bar_qty", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgQuantityVO[]
	 */
	public BkgQuantityVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgQuantityVO[]
	 */
	public BkgQuantityVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgQuantityVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] dcgoQty = (JSPUtil.getParameter(request, prefix	+ "dcgo_qty".trim(), length));
			String[] crrHngrSglBarQty = (JSPUtil.getParameter(request, prefix	+ "crr_hngr_sgl_bar_qty".trim(), length));
			String[] eqSubstCgoQty = (JSPUtil.getParameter(request, prefix	+ "eq_subst_cgo_qty".trim(), length));
			String[] obTroQty = (JSPUtil.getParameter(request, prefix	+ "ob_tro_qty".trim(), length));
			String[] awkCgoQty = (JSPUtil.getParameter(request, prefix	+ "awk_cgo_qty".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] actCntrQty = (JSPUtil.getParameter(request, prefix	+ "act_cntr_qty".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] crrHngrDblBarQty = (JSPUtil.getParameter(request, prefix	+ "crr_hngr_dbl_bar_qty".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] rcQty = (JSPUtil.getParameter(request, prefix	+ "rc_qty".trim(), length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd".trim(), length));
			String[] destCntrQty = (JSPUtil.getParameter(request, prefix	+ "dest_cntr_qty".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] merHngrQty = (JSPUtil.getParameter(request, prefix	+ "mer_hngr_qty".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] bkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "bkg_no_split".trim(), length));
			String[] crrHngrQty = (JSPUtil.getParameter(request, prefix	+ "crr_hngr_qty".trim(), length));
			String[] orgCntrQty = (JSPUtil.getParameter(request, prefix	+ "org_cntr_qty".trim(), length));
			String[] eqSubstCntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "eq_subst_cntr_tpsz_cd".trim(), length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] bbCgoQty = (JSPUtil.getParameter(request, prefix	+ "bb_cgo_qty".trim(), length));
			String[] ibTroQty = (JSPUtil.getParameter(request, prefix	+ "ib_tro_qty".trim(), length));
			String[] opCntrQty = (JSPUtil.getParameter(request, prefix	+ "op_cntr_qty".trim(), length));
			String[] flexHgtFlg = (JSPUtil.getParameter(request, prefix	+ "flex_hgt_flg".trim(), length));
			String[] socQty = (JSPUtil.getParameter(request, prefix	+ "soc_qty".trim(), length));
			String[] crrHngrTplBarQty = (JSPUtil.getParameter(request, prefix	+ "crr_hngr_tpl_bar_qty".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgQuantityVO();
				if (dcgoQty[i] != null)
					model.setDcgoQty(dcgoQty[i]);
				if (crrHngrSglBarQty[i] != null)
					model.setCrrHngrSglBarQty(crrHngrSglBarQty[i]);
				if (eqSubstCgoQty[i] != null)
					model.setEqSubstCgoQty(eqSubstCgoQty[i]);
				if (obTroQty[i] != null)
					model.setObTroQty(obTroQty[i]);
				if (awkCgoQty[i] != null)
					model.setAwkCgoQty(awkCgoQty[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (actCntrQty[i] != null)
					model.setActCntrQty(actCntrQty[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (crrHngrDblBarQty[i] != null)
					model.setCrrHngrDblBarQty(crrHngrDblBarQty[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rcQty[i] != null)
					model.setRcQty(rcQty[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (destCntrQty[i] != null)
					model.setDestCntrQty(destCntrQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (merHngrQty[i] != null)
					model.setMerHngrQty(merHngrQty[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (bkgNoSplit[i] != null)
					model.setBkgNoSplit(bkgNoSplit[i]);
				if (crrHngrQty[i] != null)
					model.setCrrHngrQty(crrHngrQty[i]);
				if (orgCntrQty[i] != null)
					model.setOrgCntrQty(orgCntrQty[i]);
				if (eqSubstCntrTpszCd[i] != null)
					model.setEqSubstCntrTpszCd(eqSubstCntrTpszCd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bbCgoQty[i] != null)
					model.setBbCgoQty(bbCgoQty[i]);
				if (ibTroQty[i] != null)
					model.setIbTroQty(ibTroQty[i]);
				if (opCntrQty[i] != null)
					model.setOpCntrQty(opCntrQty[i]);
				if (flexHgtFlg[i] != null)
					model.setFlexHgtFlg(flexHgtFlg[i]);
				if (socQty[i] != null)
					model.setSocQty(socQty[i]);
				if (crrHngrTplBarQty[i] != null)
					model.setCrrHngrTplBarQty(crrHngrTplBarQty[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgQuantityVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgQuantityVO[]
	 */
	public BkgQuantityVO[] getBkgQuantityVOs(){
		BkgQuantityVO[] vos = (BkgQuantityVO[])models.toArray(new BkgQuantityVO[models.size()]);
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
		this.dcgoQty = this.dcgoQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crrHngrSglBarQty = this.crrHngrSglBarQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqSubstCgoQty = this.eqSubstCgoQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obTroQty = this.obTroQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.awkCgoQty = this.awkCgoQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCntrQty = this.actCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crrHngrDblBarQty = this.crrHngrDblBarQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcQty = this.rcQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destCntrQty = this.destCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.merHngrQty = this.merHngrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNoSplit = this.bkgNoSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crrHngrQty = this.crrHngrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgCntrQty = this.orgCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqSubstCntrTpszCd = this.eqSubstCntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbCgoQty = this.bbCgoQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibTroQty = this.ibTroQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opCntrQty = this.opCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.flexHgtFlg = this.flexHgtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.socQty = this.socQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crrHngrTplBarQty = this.crrHngrTplBarQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
