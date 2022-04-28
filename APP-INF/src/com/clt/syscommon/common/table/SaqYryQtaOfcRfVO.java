/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : SaqYryQtaOfcRfVO.java
*@FileTitle : SaqYryQtaOfcRfVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.09.28
*@LastModifier : 이병훈
*@LastVersion : 1.0
* 2010.09.28  이병훈
* 1.0 Creation
* =====================================================
* 2010.09.28 이병훈 [CHM-201005683-01] 특수화물 판매목표 수립 시스템 개발
=========================================================*/

package com.clt.syscommon.common.table;

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

public class SaqYryQtaOfcRfVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SaqYryQtaOfcRfVO> models = new ArrayList<SaqYryQtaOfcRfVO>();
	
	/* Column Info */
	private String cmUcAmt = null;
	/* Column Info */
	private String qtaTgtCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String yqtaStepCd = null;
	/* Column Info */
	private String ctrtRhqCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String bseMon = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String ctrtOfcCd = null;
	/* Column Info */
	private String grsRpbRev = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String rgnOfcCd = null;
	/* Column Info */
	private String aqCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String lodQty = null;
	/* Column Info */
	private String ctrtAqCd = null;
	/* Column Info */
	private String raOpfitUcAmt = null;
	/* Column Info */
	private String rhqCd = null;
	/* Column Info */
	private String opfitUcAmt = null;
	/* Column Info */
	private String ofcAddFlg = null;
	/* Column Info */
	private String bseYr = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String raCmUcAmt = null;
	/* Column Info */
	private String raStpPfitUtAmt = null;
	/* Column Info */
	private String yqtaVerNo = null;
	/* Column Info */
	private String subTrdCd = null;
	/* Column Info */
	private String actType = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String from_mon = null;
	/* Column Info */
	private String to_mon = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SaqYryQtaOfcRfVO() {}

	public SaqYryQtaOfcRfVO(String ibflag, String pagerows, String yqtaStepCd, String bseYr, String trdCd, String dirCd, String yqtaVerNo, String rlaneCd, String ctrtOfcCd, String bseMon, String subTrdCd, String ctrtRhqCd, String ctrtAqCd, String lodQty, String grsRpbRev, String cmUcAmt, String opfitUcAmt, String raCmUcAmt, String raStpPfitUtAmt, String raOpfitUcAmt, String creUsrId, String creDt, String updUsrId, String updDt, String qtaTgtCd, String rgnOfcCd, String rhqCd, String aqCd, String ofcAddFlg) {
		this.cmUcAmt = cmUcAmt;
		this.qtaTgtCd = qtaTgtCd;
		this.creDt = creDt;
		this.trdCd = trdCd;
		this.rlaneCd = rlaneCd;
		this.yqtaStepCd = yqtaStepCd;
		this.ctrtRhqCd = ctrtRhqCd;
		this.pagerows = pagerows;
		this.bseMon = bseMon;
		this.ibflag = ibflag;
		this.ctrtOfcCd = ctrtOfcCd;
		this.grsRpbRev = grsRpbRev;
		this.dirCd = dirCd;
		this.rgnOfcCd = rgnOfcCd;
		this.aqCd = aqCd;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.lodQty = lodQty;
		this.ctrtAqCd = ctrtAqCd;
		this.raOpfitUcAmt = raOpfitUcAmt;
		this.rhqCd = rhqCd;
		this.opfitUcAmt = opfitUcAmt;
		this.ofcAddFlg = ofcAddFlg;
		this.bseYr = bseYr;
		this.creUsrId = creUsrId;
		this.raCmUcAmt = raCmUcAmt;
		this.raStpPfitUtAmt = raStpPfitUtAmt;
		this.yqtaVerNo = yqtaVerNo;
		this.subTrdCd = subTrdCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cm_uc_amt", getCmUcAmt());
		this.hashColumns.put("qta_tgt_cd", getQtaTgtCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("yqta_step_cd", getYqtaStepCd());
		this.hashColumns.put("ctrt_rhq_cd", getCtrtRhqCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("bse_mon", getBseMon());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ctrt_ofc_cd", getCtrtOfcCd());
		this.hashColumns.put("grs_rpb_rev", getGrsRpbRev());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("rgn_ofc_cd", getRgnOfcCd());
		this.hashColumns.put("aq_cd", getAqCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("lod_qty", getLodQty());
		this.hashColumns.put("ctrt_aq_cd", getCtrtAqCd());
		this.hashColumns.put("ra_opfit_uc_amt", getRaOpfitUcAmt());
		this.hashColumns.put("rhq_cd", getRhqCd());
		this.hashColumns.put("opfit_uc_amt", getOpfitUcAmt());
		this.hashColumns.put("ofc_add_flg", getOfcAddFlg());
		this.hashColumns.put("bse_yr", getBseYr());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ra_cm_uc_amt", getRaCmUcAmt());
		this.hashColumns.put("ra_stp_pfit_ut_amt", getRaStpPfitUtAmt());
		this.hashColumns.put("yqta_ver_no", getYqtaVerNo());
		this.hashColumns.put("sub_trd_cd", getSubTrdCd());
		this.hashColumns.put("act_type", getActType());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("from_mon", getFrom_mon());
		this.hashColumns.put("to_mon", getTo_mon());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cm_uc_amt", "cmUcAmt");
		this.hashFields.put("qta_tgt_cd", "qtaTgtCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("yqta_step_cd", "yqtaStepCd");
		this.hashFields.put("ctrt_rhq_cd", "ctrtRhqCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("bse_mon", "bseMon");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ctrt_ofc_cd", "ctrtOfcCd");
		this.hashFields.put("grs_rpb_rev", "grsRpbRev");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("rgn_ofc_cd", "rgnOfcCd");
		this.hashFields.put("aq_cd", "aqCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("lod_qty", "lodQty");
		this.hashFields.put("ctrt_aq_cd", "ctrtAqCd");
		this.hashFields.put("ra_opfit_uc_amt", "raOpfitUcAmt");
		this.hashFields.put("rhq_cd", "rhqCd");
		this.hashFields.put("opfit_uc_amt", "opfitUcAmt");
		this.hashFields.put("ofc_add_flg", "ofcAddFlg");
		this.hashFields.put("bse_yr", "bseYr");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ra_cm_uc_amt", "raCmUcAmt");
		this.hashFields.put("ra_stp_pfit_ut_amt", "raStpPfitUtAmt");
		this.hashFields.put("yqta_ver_no", "yqtaVerNo");
		this.hashFields.put("sub_trd_cd", "subTrdCd");
		this.hashFields.put("act_type", "actType");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("from_mon", "fromMon");
		this.hashFields.put("to_mon", "toMon");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return cmUcAmt
	 */
	public String getCmUcAmt() {
		return this.cmUcAmt;
	}
	
	/**
	 * Column Info
	 * @return qtaTgtCd
	 */
	public String getQtaTgtCd() {
		return this.qtaTgtCd;
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
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	
	/**
	 * Column Info
	 * @return yqtaStepCd
	 */
	public String getYqtaStepCd() {
		return this.yqtaStepCd;
	}
	
	/**
	 * Column Info
	 * @return ctrtRhqCd
	 */
	public String getCtrtRhqCd() {
		return this.ctrtRhqCd;
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
	 * @return bseMon
	 */
	public String getBseMon() {
		return this.bseMon;
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
	 * @return ctrtOfcCd
	 */
	public String getCtrtOfcCd() {
		return this.ctrtOfcCd;
	}
	
	/**
	 * Column Info
	 * @return grsRpbRev
	 */
	public String getGrsRpbRev() {
		return this.grsRpbRev;
	}
	
	/**
	 * Column Info
	 * @return dirCd
	 */
	public String getDirCd() {
		return this.dirCd;
	}
	
	/**
	 * Column Info
	 * @return rgnOfcCd
	 */
	public String getRgnOfcCd() {
		return this.rgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @return aqCd
	 */
	public String getAqCd() {
		return this.aqCd;
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
	 * @return lodQty
	 */
	public String getLodQty() {
		return this.lodQty;
	}
	
	/**
	 * Column Info
	 * @return ctrtAqCd
	 */
	public String getCtrtAqCd() {
		return this.ctrtAqCd;
	}
	
	/**
	 * Column Info
	 * @return raOpfitUcAmt
	 */
	public String getRaOpfitUcAmt() {
		return this.raOpfitUcAmt;
	}
	
	/**
	 * Column Info
	 * @return rhqCd
	 */
	public String getRhqCd() {
		return this.rhqCd;
	}
	
	/**
	 * Column Info
	 * @return opfitUcAmt
	 */
	public String getOpfitUcAmt() {
		return this.opfitUcAmt;
	}
	
	/**
	 * Column Info
	 * @return ofcAddFlg
	 */
	public String getOfcAddFlg() {
		return this.ofcAddFlg;
	}
	
	/**
	 * Column Info
	 * @return bseYr
	 */
	public String getBseYr() {
		return this.bseYr;
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
	 * @return raCmUcAmt
	 */
	public String getRaCmUcAmt() {
		return this.raCmUcAmt;
	}
	
	/**
	 * Column Info
	 * @return raStpPfitUtAmt
	 */
	public String getRaStpPfitUtAmt() {
		return this.raStpPfitUtAmt;
	}
	
	/**
	 * Column Info
	 * @return yqtaVerNo
	 */
	public String getYqtaVerNo() {
		return this.yqtaVerNo;
	}
	
	/**
	 * Column Info
	 * @return subTrdCd
	 */
	public String getSubTrdCd() {
		return this.subTrdCd;
	}
	
	/**
	 * Column Info
	 * @return actType
	 */
	public String getActType() {
		return actType;
	}
	
	/**
	 * Column Info
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return deltFlg;
	}
	
	/**
	 * Column Info
	 * @return from_mon
	 */
	public String getFrom_mon() {
		return from_mon;
	}
	
	/**
	 * Column Info
	 * @return to_mon
	 */
	public String getTo_mon() {
		return to_mon;
	}

	/**
	 * Column Info
	 * @param cmUcAmt
	 */
	public void setCmUcAmt(String cmUcAmt) {
		this.cmUcAmt = cmUcAmt;
	}
	
	/**
	 * Column Info
	 * @param qtaTgtCd
	 */
	public void setQtaTgtCd(String qtaTgtCd) {
		this.qtaTgtCd = qtaTgtCd;
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
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	/**
	 * Column Info
	 * @param yqtaStepCd
	 */
	public void setYqtaStepCd(String yqtaStepCd) {
		this.yqtaStepCd = yqtaStepCd;
	}
	
	/**
	 * Column Info
	 * @param ctrtRhqCd
	 */
	public void setCtrtRhqCd(String ctrtRhqCd) {
		this.ctrtRhqCd = ctrtRhqCd;
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
	 * @param bseMon
	 */
	public void setBseMon(String bseMon) {
		this.bseMon = bseMon;
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
	 * @param ctrtOfcCd
	 */
	public void setCtrtOfcCd(String ctrtOfcCd) {
		this.ctrtOfcCd = ctrtOfcCd;
	}
	
	/**
	 * Column Info
	 * @param grsRpbRev
	 */
	public void setGrsRpbRev(String grsRpbRev) {
		this.grsRpbRev = grsRpbRev;
	}
	
	/**
	 * Column Info
	 * @param dirCd
	 */
	public void setDirCd(String dirCd) {
		this.dirCd = dirCd;
	}
	
	/**
	 * Column Info
	 * @param rgnOfcCd
	 */
	public void setRgnOfcCd(String rgnOfcCd) {
		this.rgnOfcCd = rgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @param aqCd
	 */
	public void setAqCd(String aqCd) {
		this.aqCd = aqCd;
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
	 * @param lodQty
	 */
	public void setLodQty(String lodQty) {
		this.lodQty = lodQty;
	}
	
	/**
	 * Column Info
	 * @param ctrtAqCd
	 */
	public void setCtrtAqCd(String ctrtAqCd) {
		this.ctrtAqCd = ctrtAqCd;
	}
	
	/**
	 * Column Info
	 * @param raOpfitUcAmt
	 */
	public void setRaOpfitUcAmt(String raOpfitUcAmt) {
		this.raOpfitUcAmt = raOpfitUcAmt;
	}
	
	/**
	 * Column Info
	 * @param rhqCd
	 */
	public void setRhqCd(String rhqCd) {
		this.rhqCd = rhqCd;
	}
	
	/**
	 * Column Info
	 * @param opfitUcAmt
	 */
	public void setOpfitUcAmt(String opfitUcAmt) {
		this.opfitUcAmt = opfitUcAmt;
	}
	
	/**
	 * Column Info
	 * @param ofcAddFlg
	 */
	public void setOfcAddFlg(String ofcAddFlg) {
		this.ofcAddFlg = ofcAddFlg;
	}
	
	/**
	 * Column Info
	 * @param bseYr
	 */
	public void setBseYr(String bseYr) {
		this.bseYr = bseYr;
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
	 * @param raCmUcAmt
	 */
	public void setRaCmUcAmt(String raCmUcAmt) {
		this.raCmUcAmt = raCmUcAmt;
	}
	
	/**
	 * Column Info
	 * @param raStpPfitUtAmt
	 */
	public void setRaStpPfitUtAmt(String raStpPfitUtAmt) {
		this.raStpPfitUtAmt = raStpPfitUtAmt;
	}
	
	/**
	 * Column Info
	 * @param yqtaVerNo
	 */
	public void setYqtaVerNo(String yqtaVerNo) {
		this.yqtaVerNo = yqtaVerNo;
	}
	
	/**
	 * Column Info
	 * @param subTrdCd
	 */
	public void setSubTrdCd(String subTrdCd) {
		this.subTrdCd = subTrdCd;
	}
	
	/**
	 * Column Info
	 * @param actType
	 */
	public void setActType(String actType) {
		this.actType = actType;
	}
	
	/**
	 * Column Info
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}
	
	/**
	 * Column Info
	 * @param from_mon
	 */
	public void setFrom_mon(String from_mon) {
		this.from_mon = from_mon;
	}
	
	/**
	 * Column Info
	 * @param to_mon
	 */
	public void setTo_mon(String to_mon) {
		this.to_mon = to_mon;
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
		setCmUcAmt(JSPUtil.getParameter(request, prefix + "cm_uc_amt", ""));
		setQtaTgtCd(JSPUtil.getParameter(request, prefix + "qta_tgt_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setTrdCd(JSPUtil.getParameter(request, prefix + "trd_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, prefix + "rlane_cd", ""));
		setYqtaStepCd(JSPUtil.getParameter(request, prefix + "yqta_step_cd", ""));
		setCtrtRhqCd(JSPUtil.getParameter(request, prefix + "ctrt_rhq_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setBseMon(JSPUtil.getParameter(request, prefix + "bse_mon", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCtrtOfcCd(JSPUtil.getParameter(request, prefix + "ctrt_ofc_cd", ""));
		setGrsRpbRev(JSPUtil.getParameter(request, prefix + "grs_rpb_rev", ""));
		setDirCd(JSPUtil.getParameter(request, prefix + "dir_cd", ""));
		setRgnOfcCd(JSPUtil.getParameter(request, prefix + "rgn_ofc_cd", ""));
		setAqCd(JSPUtil.getParameter(request, prefix + "aq_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setLodQty(JSPUtil.getParameter(request, prefix + "lod_qty", ""));
		setCtrtAqCd(JSPUtil.getParameter(request, prefix + "ctrt_aq_cd", ""));
		setRaOpfitUcAmt(JSPUtil.getParameter(request, prefix + "ra_opfit_uc_amt", ""));
		setRhqCd(JSPUtil.getParameter(request, prefix + "rhq_cd", ""));
		setOpfitUcAmt(JSPUtil.getParameter(request, prefix + "opfit_uc_amt", ""));
		setOfcAddFlg(JSPUtil.getParameter(request, prefix + "ofc_add_flg", ""));
		setBseYr(JSPUtil.getParameter(request, prefix + "bse_yr", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setRaCmUcAmt(JSPUtil.getParameter(request, prefix + "ra_cm_uc_amt", ""));
		setRaStpPfitUtAmt(JSPUtil.getParameter(request, prefix + "ra_stp_pfit_ut_amt", ""));
		setYqtaVerNo(JSPUtil.getParameter(request, prefix + "yqta_ver_no", ""));
		setSubTrdCd(JSPUtil.getParameter(request, prefix + "sub_trd_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SaqYryQtaOfcRfVO[]
	 */
	public SaqYryQtaOfcRfVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqYryQtaOfcRfVO[]
	 */
	public SaqYryQtaOfcRfVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SaqYryQtaOfcRfVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cmUcAmt = (JSPUtil.getParameter(request, prefix	+ "cm_uc_amt", length));
			String[] qtaTgtCd = (JSPUtil.getParameter(request, prefix	+ "qta_tgt_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] yqtaStepCd = (JSPUtil.getParameter(request, prefix	+ "yqta_step_cd", length));
			String[] ctrtRhqCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_rhq_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] bseMon = (JSPUtil.getParameter(request, prefix	+ "bse_mon", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] ctrtOfcCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_ofc_cd", length));
			String[] grsRpbRev = (JSPUtil.getParameter(request, prefix	+ "grs_rpb_rev", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] rgnOfcCd = (JSPUtil.getParameter(request, prefix	+ "rgn_ofc_cd", length));
			String[] aqCd = (JSPUtil.getParameter(request, prefix	+ "aq_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] lodQty = (JSPUtil.getParameter(request, prefix	+ "lod_qty", length));
			String[] ctrtAqCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_aq_cd", length));
			String[] raOpfitUcAmt = (JSPUtil.getParameter(request, prefix	+ "ra_opfit_uc_amt", length));
			String[] rhqCd = (JSPUtil.getParameter(request, prefix	+ "rhq_cd", length));
			String[] opfitUcAmt = (JSPUtil.getParameter(request, prefix	+ "opfit_uc_amt", length));
			String[] ofcAddFlg = (JSPUtil.getParameter(request, prefix	+ "ofc_add_flg", length));
			String[] bseYr = (JSPUtil.getParameter(request, prefix	+ "bse_yr", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] raCmUcAmt = (JSPUtil.getParameter(request, prefix	+ "ra_cm_uc_amt", length));
			String[] raStpPfitUtAmt = (JSPUtil.getParameter(request, prefix	+ "ra_stp_pfit_ut_amt", length));
			String[] yqtaVerNo = (JSPUtil.getParameter(request, prefix	+ "yqta_ver_no", length));
			String[] subTrdCd = (JSPUtil.getParameter(request, prefix	+ "sub_trd_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqYryQtaOfcRfVO();
				if (cmUcAmt[i] != null)
					model.setCmUcAmt(cmUcAmt[i]);
				if (qtaTgtCd[i] != null)
					model.setQtaTgtCd(qtaTgtCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (yqtaStepCd[i] != null)
					model.setYqtaStepCd(yqtaStepCd[i]);
				if (ctrtRhqCd[i] != null)
					model.setCtrtRhqCd(ctrtRhqCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (bseMon[i] != null)
					model.setBseMon(bseMon[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ctrtOfcCd[i] != null)
					model.setCtrtOfcCd(ctrtOfcCd[i]);
				if (grsRpbRev[i] != null)
					model.setGrsRpbRev(grsRpbRev[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (rgnOfcCd[i] != null)
					model.setRgnOfcCd(rgnOfcCd[i]);
				if (aqCd[i] != null)
					model.setAqCd(aqCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (lodQty[i] != null)
					model.setLodQty(lodQty[i]);
				if (ctrtAqCd[i] != null)
					model.setCtrtAqCd(ctrtAqCd[i]);
				if (raOpfitUcAmt[i] != null)
					model.setRaOpfitUcAmt(raOpfitUcAmt[i]);
				if (rhqCd[i] != null)
					model.setRhqCd(rhqCd[i]);
				if (opfitUcAmt[i] != null)
					model.setOpfitUcAmt(opfitUcAmt[i]);
				if (ofcAddFlg[i] != null)
					model.setOfcAddFlg(ofcAddFlg[i]);
				if (bseYr[i] != null)
					model.setBseYr(bseYr[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (raCmUcAmt[i] != null)
					model.setRaCmUcAmt(raCmUcAmt[i]);
				if (raStpPfitUtAmt[i] != null)
					model.setRaStpPfitUtAmt(raStpPfitUtAmt[i]);
				if (yqtaVerNo[i] != null)
					model.setYqtaVerNo(yqtaVerNo[i]);
				if (subTrdCd[i] != null)
					model.setSubTrdCd(subTrdCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqYryQtaOfcRfVOs();
	}
	
	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request HttpServletRequest
	 * @param conVo QuotaConditionVO
	 * @return SaqYryQtaOfcRfVO[]
	 */
//	public SaqYryQtaOfcRfVO[] fromRequestGrid(HttpServletRequest request, QuotaConditionVO conVo) {
//		SaqYryQtaOfcRfVO model = null;
//		
//		String[] tmp = request.getParameterValues("yqta_step_cd");
//  		if(tmp == null)
//   			return null;
//
//  		int length = request.getParameterValues("yqta_step_cd").length;
//  		
//		try {
//			
//			String[] ibflag     = (JSPUtil.getParameter(request, "ibflag".trim(), length));
//			String[] deltFlg = (JSPUtil.getParameter(request, "delt_flg", length));
//			String[] actType = (JSPUtil.getParameter(request, "act_type", length));
//			String[] yqtaStepCd = (JSPUtil.getParameter(request, "yqta_step_cd".trim(), length));
//			String[] bseYr      = (JSPUtil.getParameter(request, "bse_yr".trim(), length));
//			String[] qtaTgtCd   = (JSPUtil.getParameter(request, "qta_tgt_cd".trim(), length));
//			String[] yqtaVerNo  = (JSPUtil.getParameter(request, "yqta_ver_no".trim(), length));
//			String[] bseMon     = (JSPUtil.getParameter(request, "bse_mon".trim(), length));
//			String[] trdCd      = (JSPUtil.getParameter(request, "trd_cd".trim(), length));
//			String[] subTrdCd      = (JSPUtil.getParameter(request, "sub_trd_cd".trim(), length));
//			String[] dirCd      = (JSPUtil.getParameter(request, "dir_cd".trim(), length));
//			String[] rlaneCd    = (JSPUtil.getParameter(request, "rlane_cd".trim(), length));
//			String[] rhqCd   = (JSPUtil.getParameter(request, "rhq_cd".trim(), length));
//			String[] aqCd = (JSPUtil.getParameter(request, "aq_cd", length));
//			String[] rgnOfcCd   = (JSPUtil.getParameter(request, "rgn_ofc_cd".trim(), length));
//			String[] lodQty     = (JSPUtil.getParameter(request, "lod_qty".trim(), length));
//			String[] grsRpbRev  = (JSPUtil.getParameter(request, "grs_rpb_rev".trim(), length));
//			String[] from_mon = (JSPUtil.getParameter(request, "from_mon", length));
//			String[] to_mon = (JSPUtil.getParameter(request, "to_mon", length));
//			
//			for(int i=0 ; i<length ; i++){
//				model = new SaqYryQtaOfcRfVO();
//				if (ibflag[i] != null)
//					model.setIbflag(ibflag[i]);
//				if (deltFlg[i] != null)
//					model.setDeltFlg(deltFlg[i]);
//				if (yqtaStepCd[i] != null)
//					model.setYqtaStepCd(yqtaStepCd[i]);
//				if (bseYr[i] != null)
//					model.setBseYr(bseYr[i]);
//				if (qtaTgtCd[i] != null)
//					model.setQtaTgtCd(qtaTgtCd[i]);
//				if (yqtaVerNo[i] != null)
//					model.setYqtaVerNo(yqtaVerNo[i]);
//				if (bseMon[i] != null)
//					model.setBseMon(bseMon[i]);
//				if (trdCd[i] != null)
//					model.setTrdCd(trdCd[i]);
//				if (rlaneCd[i] != null)
//					model.setRlaneCd(rlaneCd[i]);
//				if (dirCd[i] != null)
//					model.setDirCd(dirCd[i]);
//				if (rgnOfcCd[i] != null)
//					model.setRgnOfcCd(rgnOfcCd[i]);
//				if (rhqCd[i] != null)
//					model.setRhqCd(rhqCd[i]);
//				if (actType[i] != null)
//					model.setActType(actType[i]);
//				if (subTrdCd[i] != null)
//					model.setSubTrdCd(subTrdCd[i]);
//				if (aqCd[i] != null)
//					model.setAqCd(aqCd[i]);
//				if (lodQty[i] != null)
//					model.setLodQty(lodQty[i]);
//				if (grsRpbRev[i] != null)
//					model.setGrsRpbRev(grsRpbRev[i]);
//				if (from_mon[i] != null)
//					model.setFrom_mon(from_mon[i]);
//				if (to_mon[i] != null)
//					model.setTo_mon(to_mon[i]);
//				models.add(model);
//				
//			}
//
//		} catch (Exception e) {
//			return null;
//		}
//		return getSaqYryQtaOfcRfVOs();
//	}

	/**
	 * VO 배열을 반환
	 * @return SaqYryQtaOfcRfVO[]
	 */
	public SaqYryQtaOfcRfVO[] getSaqYryQtaOfcRfVOs(){
		SaqYryQtaOfcRfVO[] vos = (SaqYryQtaOfcRfVO[])models.toArray(new SaqYryQtaOfcRfVO[models.size()]);
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
		this.cmUcAmt = this.cmUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.qtaTgtCd = this.qtaTgtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.yqtaStepCd = this.yqtaStepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtRhqCd = this.ctrtRhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseMon = this.bseMon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtOfcCd = this.ctrtOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsRpbRev = this.grsRpbRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rgnOfcCd = this.rgnOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aqCd = this.aqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lodQty = this.lodQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtAqCd = this.ctrtAqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raOpfitUcAmt = this.raOpfitUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rhqCd = this.rhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opfitUcAmt = this.opfitUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcAddFlg = this.ofcAddFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseYr = this.bseYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raCmUcAmt = this.raCmUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raStpPfitUtAmt = this.raStpPfitUtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.yqtaVerNo = this.yqtaVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdCd = this.subTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
