/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgTroVO.java
*@FileTitle : BkgTroVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.19
*@LastModifier : 이남경
*@LastVersion : 1.0
* 2009.05.19 이남경 
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
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 이남경
 * @since J2EE 1.5
 * @see AbstractValueObject
 */

public class BkgTroVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgTroVO> models = new ArrayList<BkgTroVO>();
	
	/* Column Info */
	private String rcSeq = null;
	/* Column Info */
	private String rqstUsrId = null;
	/* Column Info */
	private String soActCustNo = null;
	/* Column Info */
	private String cxlFlg = null;
	/* Column Info */
	private String znCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String awkCgoSeq = null;
	/* Column Info */
	private String ownrTrkFlg = null;
	/* Column Info */
	private String cntcPhnNo = null;
	/* Column Info */
	private String pctlNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String soActCustSeq = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String cntcPsonNm = null;
	/* Column Info */
	private String cntcFaxNo = null;
	/* Column Info */
	private String actShprPhnNo = null;
	/* Column Info */
	private String cntcMphnNo = null;
	/* Column Info */
	private String rcvTermCd = null;
	/* Column Info */
	private String rtnTroFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String rqstDt = null;
	/* Column Info */
	private String dorPstNo = null;
	/* Column Info */
	private String soFlg = null;
	/* Column Info */
	private String troSeq = null;
	/* Column Info */
	private String bkgNoSplit = null;
	/* Column Info */
	private String dorLocCd = null;
	/* Column Info */
	private String cfmDt = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Column Info */
	private String cfmFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String bizRgstNo = null;
	/* Column Info */
	private String actShprCntCd = null;
	/* Column Info */
	private String actShprNm = null;
	/* Column Info */
	private String actShprSeq = null;
	/* Column Info */
	private String actShprAddr = null;

	/*	Table Column name으로 맴버변수 value 담는다*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	Table Column name으로 맴버변수 name 	담는다*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgTroVO() {}

	public BkgTroVO(String ibflag, String pagerows, String bkgNo, String bkgNoSplit, String ioBndCd, String rtnTroFlg, String troSeq, String rcvTermCd, String rqstDt, String rqstUsrId, String ownrTrkFlg, String rcSeq, String awkCgoSeq, String actShprCntCd, String actShprSeq, String actShprNm, String actShprPhnNo, String actShprAddr, String znCd, String dorLocCd, String dorPstNo, String bizRgstNo, String cfmFlg, String cfmDt, String diffRmk, String cntcPsonNm, String cntcFaxNo, String cntcPhnNo, String cntcMphnNo, String cxlFlg, String soFlg, String soActCustNo, String soActCustSeq, String pctlNo, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.rcSeq = rcSeq;
		this.rqstUsrId = rqstUsrId;
		this.soActCustNo = soActCustNo;
		this.cxlFlg = cxlFlg;
		this.znCd = znCd;
		this.creDt = creDt;
		this.awkCgoSeq = awkCgoSeq;
		this.ownrTrkFlg = ownrTrkFlg;
		this.cntcPhnNo = cntcPhnNo;
		this.pctlNo = pctlNo;
		this.pagerows = pagerows;
		this.soActCustSeq = soActCustSeq;
		this.ibflag = ibflag;
		this.cntcPsonNm = cntcPsonNm;
		this.cntcFaxNo = cntcFaxNo;
		this.actShprPhnNo = actShprPhnNo;
		this.cntcMphnNo = cntcMphnNo;
		this.rcvTermCd = rcvTermCd;
		this.rtnTroFlg = rtnTroFlg;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.rqstDt = rqstDt;
		this.dorPstNo = dorPstNo;
		this.soFlg = soFlg;
		this.troSeq = troSeq;
		this.bkgNoSplit = bkgNoSplit;
		this.dorLocCd = dorLocCd;
		this.cfmDt = cfmDt;
		this.ioBndCd = ioBndCd;
		this.cfmFlg = cfmFlg;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.diffRmk = diffRmk;
		this.bizRgstNo = bizRgstNo;
		this.actShprCntCd = actShprCntCd;
		this.actShprNm = actShprNm;
		this.actShprSeq = actShprSeq;
		this.actShprAddr = actShprAddr;
	}
	
	/**
	 * Table Column name 으로 맴버변수에 value를 리턴한다.
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("rc_seq", getRcSeq());
		this.hashColumns.put("rqst_usr_id", getRqstUsrId());
		this.hashColumns.put("so_act_cust_no", getSoActCustNo());
		this.hashColumns.put("cxl_flg", getCxlFlg());
		this.hashColumns.put("zn_cd", getZnCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("awk_cgo_seq", getAwkCgoSeq());
		this.hashColumns.put("ownr_trk_flg", getOwnrTrkFlg());
		this.hashColumns.put("cntc_phn_no", getCntcPhnNo());
		this.hashColumns.put("pctl_no", getPctlNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("so_act_cust_seq", getSoActCustSeq());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cntc_pson_nm", getCntcPsonNm());
		this.hashColumns.put("cntc_fax_no", getCntcFaxNo());
		this.hashColumns.put("act_shpr_phn_no", getActShprPhnNo());
		this.hashColumns.put("cntc_mphn_no", getCntcMphnNo());
		this.hashColumns.put("rcv_term_cd", getRcvTermCd());
		this.hashColumns.put("rtn_tro_flg", getRtnTroFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rqst_dt", getRqstDt());
		this.hashColumns.put("dor_pst_no", getDorPstNo());
		this.hashColumns.put("so_flg", getSoFlg());
		this.hashColumns.put("tro_seq", getTroSeq());
		this.hashColumns.put("bkg_no_split", getBkgNoSplit());
		this.hashColumns.put("dor_loc_cd", getDorLocCd());
		this.hashColumns.put("cfm_dt", getCfmDt());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("cfm_flg", getCfmFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("biz_rgst_no", getBizRgstNo());
		this.hashColumns.put("act_shpr_cnt_cd", getActShprCntCd());
		this.hashColumns.put("act_shpr_nm", getActShprNm());
		this.hashColumns.put("act_shpr_seq", getActShprSeq());
		this.hashColumns.put("act_shpr_addr", getActShprAddr());
		return this.hashColumns;
	}
	
	/**
	 * Table Column name 으로 맴버변수를 호출한다
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("rc_seq", "rcSeq");
		this.hashFields.put("rqst_usr_id", "rqstUsrId");
		this.hashFields.put("so_act_cust_no", "soActCustNo");
		this.hashFields.put("cxl_flg", "cxlFlg");
		this.hashFields.put("zn_cd", "znCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("awk_cgo_seq", "awkCgoSeq");
		this.hashFields.put("ownr_trk_flg", "ownrTrkFlg");
		this.hashFields.put("cntc_phn_no", "cntcPhnNo");
		this.hashFields.put("pctl_no", "pctlNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("so_act_cust_seq", "soActCustSeq");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cntc_pson_nm", "cntcPsonNm");
		this.hashFields.put("cntc_fax_no", "cntcFaxNo");
		this.hashFields.put("act_shpr_phn_no", "actShprPhnNo");
		this.hashFields.put("cntc_mphn_no", "cntcMphnNo");
		this.hashFields.put("rcv_term_cd", "rcvTermCd");
		this.hashFields.put("rtn_tro_flg", "rtnTroFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rqst_dt", "rqstDt");
		this.hashFields.put("dor_pst_no", "dorPstNo");
		this.hashFields.put("so_flg", "soFlg");
		this.hashFields.put("tro_seq", "troSeq");
		this.hashFields.put("bkg_no_split", "bkgNoSplit");
		this.hashFields.put("dor_loc_cd", "dorLocCd");
		this.hashFields.put("cfm_dt", "cfmDt");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("cfm_flg", "cfmFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("biz_rgst_no", "bizRgstNo");
		this.hashFields.put("act_shpr_cnt_cd", "actShprCntCd");
		this.hashFields.put("act_shpr_nm", "actShprNm");
		this.hashFields.put("act_shpr_seq", "actShprSeq");
		this.hashFields.put("act_shpr_addr", "actShprAddr");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return rcSeq
	 */
	public String getRcSeq() {
		return this.rcSeq;
	}
	
	/**
	 * Column Info
	 * @return rqstUsrId
	 */
	public String getRqstUsrId() {
		return this.rqstUsrId;
	}
	
	/**
	 * Column Info
	 * @return soActCustNo
	 */
	public String getSoActCustNo() {
		return this.soActCustNo;
	}
	
	/**
	 * Column Info
	 * @return cxlFlg
	 */
	public String getCxlFlg() {
		return this.cxlFlg;
	}
	
	/**
	 * Column Info
	 * @return znCd
	 */
	public String getZnCd() {
		return this.znCd;
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
	 * @return awkCgoSeq
	 */
	public String getAwkCgoSeq() {
		return this.awkCgoSeq;
	}
	
	/**
	 * Column Info
	 * @return ownrTrkFlg
	 */
	public String getOwnrTrkFlg() {
		return this.ownrTrkFlg;
	}
	
	/**
	 * Column Info
	 * @return cntcPhnNo
	 */
	public String getCntcPhnNo() {
		return this.cntcPhnNo;
	}
	
	/**
	 * Column Info
	 * @return pctlNo
	 */
	public String getPctlNo() {
		return this.pctlNo;
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
	 * @return soActCustSeq
	 */
	public String getSoActCustSeq() {
		return this.soActCustSeq;
	}
	
	/**
	 * Status
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return cntcPsonNm
	 */
	public String getCntcPsonNm() {
		return this.cntcPsonNm;
	}
	
	/**
	 * Column Info
	 * @return cntcFaxNo
	 */
	public String getCntcFaxNo() {
		return this.cntcFaxNo;
	}
	
	/**
	 * Column Info
	 * @return actShprPhnNo
	 */
	public String getActShprPhnNo() {
		return this.actShprPhnNo;
	}
	
	/**
	 * Column Info
	 * @return cntcMphnNo
	 */
	public String getCntcMphnNo() {
		return this.cntcMphnNo;
	}
	
	/**
	 * Column Info
	 * @return rcvTermCd
	 */
	public String getRcvTermCd() {
		return this.rcvTermCd;
	}
	
	/**
	 * Column Info
	 * @return rtnTroFlg
	 */
	public String getRtnTroFlg() {
		return this.rtnTroFlg;
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
	 * @return rqstDt
	 */
	public String getRqstDt() {
		return this.rqstDt;
	}
	
	/**
	 * Column Info
	 * @return dorPstNo
	 */
	public String getDorPstNo() {
		return this.dorPstNo;
	}
	
	/**
	 * Column Info
	 * @return soFlg
	 */
	public String getSoFlg() {
		return this.soFlg;
	}
	
	/**
	 * Column Info
	 * @return troSeq
	 */
	public String getTroSeq() {
		return this.troSeq;
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
	 * @return dorLocCd
	 */
	public String getDorLocCd() {
		return this.dorLocCd;
	}
	
	/**
	 * Column Info
	 * @return cfmDt
	 */
	public String getCfmDt() {
		return this.cfmDt;
	}
	
	/**
	 * Column Info
	 * @return ioBndCd
	 */
	public String getIoBndCd() {
		return this.ioBndCd;
	}
	
	/**
	 * Column Info
	 * @return cfmFlg
	 */
	public String getCfmFlg() {
		return this.cfmFlg;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return diffRmk
	 */
	public String getDiffRmk() {
		return this.diffRmk;
	}
	
	/**
	 * Column Info
	 * @return bizRgstNo
	 */
	public String getBizRgstNo() {
		return this.bizRgstNo;
	}
	
	/**
	 * Column Info
	 * @return actShprCntCd
	 */
	public String getActShprCntCd() {
		return this.actShprCntCd;
	}
	
	/**
	 * Column Info
	 * @return actShprNm
	 */
	public String getActShprNm() {
		return this.actShprNm;
	}
	
	/**
	 * Column Info
	 * @return actShprSeq
	 */
	public String getActShprSeq() {
		return this.actShprSeq;
	}
	
	/**
	 * Column Info
	 * @return actShprAddr
	 */
	public String getActShprAddr() {
		return this.actShprAddr;
	}
	

	/**
	 * Column Info
	 * @param rcSeq
	 */
	public void setRcSeq(String rcSeq) {
		this.rcSeq = rcSeq;
	}
	
	/**
	 * Column Info
	 * @param rqstUsrId
	 */
	public void setRqstUsrId(String rqstUsrId) {
		this.rqstUsrId = rqstUsrId;
	}
	
	/**
	 * Column Info
	 * @param soActCustNo
	 */
	public void setSoActCustNo(String soActCustNo) {
		this.soActCustNo = soActCustNo;
	}
	
	/**
	 * Column Info
	 * @param cxlFlg
	 */
	public void setCxlFlg(String cxlFlg) {
		this.cxlFlg = cxlFlg;
	}
	
	/**
	 * Column Info
	 * @param znCd
	 */
	public void setZnCd(String znCd) {
		this.znCd = znCd;
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
	 * @param awkCgoSeq
	 */
	public void setAwkCgoSeq(String awkCgoSeq) {
		this.awkCgoSeq = awkCgoSeq;
	}
	
	/**
	 * Column Info
	 * @param ownrTrkFlg
	 */
	public void setOwnrTrkFlg(String ownrTrkFlg) {
		this.ownrTrkFlg = ownrTrkFlg;
	}
	
	/**
	 * Column Info
	 * @param cntcPhnNo
	 */
	public void setCntcPhnNo(String cntcPhnNo) {
		this.cntcPhnNo = cntcPhnNo;
	}
	
	/**
	 * Column Info
	 * @param pctlNo
	 */
	public void setPctlNo(String pctlNo) {
		this.pctlNo = pctlNo;
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
	 * @param soActCustSeq
	 */
	public void setSoActCustSeq(String soActCustSeq) {
		this.soActCustSeq = soActCustSeq;
	}
	
	/**
	 * Status
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param cntcPsonNm
	 */
	public void setCntcPsonNm(String cntcPsonNm) {
		this.cntcPsonNm = cntcPsonNm;
	}
	
	/**
	 * Column Info
	 * @param cntcFaxNo
	 */
	public void setCntcFaxNo(String cntcFaxNo) {
		this.cntcFaxNo = cntcFaxNo;
	}
	
	/**
	 * Column Info
	 * @param actShprPhnNo
	 */
	public void setActShprPhnNo(String actShprPhnNo) {
		this.actShprPhnNo = actShprPhnNo;
	}
	
	/**
	 * Column Info
	 * @param cntcMphnNo
	 */
	public void setCntcMphnNo(String cntcMphnNo) {
		this.cntcMphnNo = cntcMphnNo;
	}
	
	/**
	 * Column Info
	 * @param rcvTermCd
	 */
	public void setRcvTermCd(String rcvTermCd) {
		this.rcvTermCd = rcvTermCd;
	}
	
	/**
	 * Column Info
	 * @param rtnTroFlg
	 */
	public void setRtnTroFlg(String rtnTroFlg) {
		this.rtnTroFlg = rtnTroFlg;
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
	 * @param rqstDt
	 */
	public void setRqstDt(String rqstDt) {
		this.rqstDt = rqstDt;
	}
	
	/**
	 * Column Info
	 * @param dorPstNo
	 */
	public void setDorPstNo(String dorPstNo) {
		this.dorPstNo = dorPstNo;
	}
	
	/**
	 * Column Info
	 * @param soFlg
	 */
	public void setSoFlg(String soFlg) {
		this.soFlg = soFlg;
	}
	
	/**
	 * Column Info
	 * @param troSeq
	 */
	public void setTroSeq(String troSeq) {
		this.troSeq = troSeq;
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
	 * @param dorLocCd
	 */
	public void setDorLocCd(String dorLocCd) {
		this.dorLocCd = dorLocCd;
	}
	
	/**
	 * Column Info
	 * @param cfmDt
	 */
	public void setCfmDt(String cfmDt) {
		this.cfmDt = cfmDt;
	}
	
	/**
	 * Column Info
	 * @param ioBndCd
	 */
	public void setIoBndCd(String ioBndCd) {
		this.ioBndCd = ioBndCd;
	}
	
	/**
	 * Column Info
	 * @param cfmFlg
	 */
	public void setCfmFlg(String cfmFlg) {
		this.cfmFlg = cfmFlg;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param diffRmk
	 */
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
	}
	
	/**
	 * Column Info
	 * @param bizRgstNo
	 */
	public void setBizRgstNo(String bizRgstNo) {
		this.bizRgstNo = bizRgstNo;
	}
	
	/**
	 * Column Info
	 * @param actShprCntCd
	 */
	public void setActShprCntCd(String actShprCntCd) {
		this.actShprCntCd = actShprCntCd;
	}
	
	/**
	 * Column Info
	 * @param actShprNm
	 */
	public void setActShprNm(String actShprNm) {
		this.actShprNm = actShprNm;
	}
	
	/**
	 * Column Info
	 * @param actShprSeq
	 */
	public void setActShprSeq(String actShprSeq) {
		this.actShprSeq = actShprSeq;
	}
	
	/**
	 * Column Info
	 * @param actShprAddr
	 */
	public void setActShprAddr(String actShprAddr) {
		this.actShprAddr = actShprAddr;
	}
	
	/**
	 * Request 넘어온 단건 DATA를 VO Class 에 담는다. 
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setRcSeq(JSPUtil.getParameter(request, "rc_seq", ""));
		setRqstUsrId(JSPUtil.getParameter(request, "rqst_usr_id", ""));
		setSoActCustNo(JSPUtil.getParameter(request, "so_act_cust_no", ""));
		setCxlFlg(JSPUtil.getParameter(request, "cxl_flg", ""));
		setZnCd(JSPUtil.getParameter(request, "zn_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setAwkCgoSeq(JSPUtil.getParameter(request, "awk_cgo_seq", ""));
		setOwnrTrkFlg(JSPUtil.getParameter(request, "ownr_trk_flg", ""));
		setCntcPhnNo(JSPUtil.getParameter(request, "cntc_phn_no", ""));
		setPctlNo(JSPUtil.getParameter(request, "pctl_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setSoActCustSeq(JSPUtil.getParameter(request, "so_act_cust_seq", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCntcPsonNm(JSPUtil.getParameter(request, "cntc_pson_nm", ""));
		setCntcFaxNo(JSPUtil.getParameter(request, "cntc_fax_no", ""));
		setActShprPhnNo(JSPUtil.getParameter(request, "act_shpr_phn_no", ""));
		setCntcMphnNo(JSPUtil.getParameter(request, "cntc_mphn_no", ""));
		setRcvTermCd(JSPUtil.getParameter(request, "rcv_term_cd", ""));
		setRtnTroFlg(JSPUtil.getParameter(request, "rtn_tro_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setRqstDt(JSPUtil.getParameter(request, "rqst_dt", ""));
		setDorPstNo(JSPUtil.getParameter(request, "dor_pst_no", ""));
		setSoFlg(JSPUtil.getParameter(request, "so_flg", ""));
		setTroSeq(JSPUtil.getParameter(request, "tro_seq", ""));
		setBkgNoSplit(JSPUtil.getParameter(request, "bkg_no_split", ""));
		setDorLocCd(JSPUtil.getParameter(request, "dor_loc_cd", ""));
		setCfmDt(JSPUtil.getParameter(request, "cfm_dt", ""));
		setIoBndCd(JSPUtil.getParameter(request, "io_bnd_cd", ""));
		setCfmFlg(JSPUtil.getParameter(request, "cfm_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setBizRgstNo(JSPUtil.getParameter(request, "biz_rgst_no", ""));
		setActShprCntCd(JSPUtil.getParameter(request, "act_shpr_cnt_cd", ""));
		setActShprNm(JSPUtil.getParameter(request, "act_shpr_nm", ""));
		setActShprSeq(JSPUtil.getParameter(request, "act_shpr_seq", ""));
		setActShprAddr(JSPUtil.getParameter(request, "act_shpr_addr", ""));
	}

	/**
	 * Request를 VO Class를 담는다.
	 * @param request
	 * @return BkgTroVO[]
	 */
	public BkgTroVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgTroVO[]
	 */
	public BkgTroVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgTroVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] rcSeq = (JSPUtil.getParameter(request, prefix	+ "rc_seq".trim(), length));
			String[] rqstUsrId = (JSPUtil.getParameter(request, prefix	+ "rqst_usr_id".trim(), length));
			String[] soActCustNo = (JSPUtil.getParameter(request, prefix	+ "so_act_cust_no".trim(), length));
			String[] cxlFlg = (JSPUtil.getParameter(request, prefix	+ "cxl_flg".trim(), length));
			String[] znCd = (JSPUtil.getParameter(request, prefix	+ "zn_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] awkCgoSeq = (JSPUtil.getParameter(request, prefix	+ "awk_cgo_seq".trim(), length));
			String[] ownrTrkFlg = (JSPUtil.getParameter(request, prefix	+ "ownr_trk_flg".trim(), length));
			String[] cntcPhnNo = (JSPUtil.getParameter(request, prefix	+ "cntc_phn_no".trim(), length));
			String[] pctlNo = (JSPUtil.getParameter(request, prefix	+ "pctl_no".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] soActCustSeq = (JSPUtil.getParameter(request, prefix	+ "so_act_cust_seq".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] cntcPsonNm = (JSPUtil.getParameter(request, prefix	+ "cntc_pson_nm".trim(), length));
			String[] cntcFaxNo = (JSPUtil.getParameter(request, prefix	+ "cntc_fax_no".trim(), length));
			String[] actShprPhnNo = (JSPUtil.getParameter(request, prefix	+ "act_shpr_phn_no".trim(), length));
			String[] cntcMphnNo = (JSPUtil.getParameter(request, prefix	+ "cntc_mphn_no".trim(), length));
			String[] rcvTermCd = (JSPUtil.getParameter(request, prefix	+ "rcv_term_cd".trim(), length));
			String[] rtnTroFlg = (JSPUtil.getParameter(request, prefix	+ "rtn_tro_flg".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] rqstDt = (JSPUtil.getParameter(request, prefix	+ "rqst_dt".trim(), length));
			String[] dorPstNo = (JSPUtil.getParameter(request, prefix	+ "dor_pst_no".trim(), length));
			String[] soFlg = (JSPUtil.getParameter(request, prefix	+ "so_flg".trim(), length));
			String[] troSeq = (JSPUtil.getParameter(request, prefix	+ "tro_seq".trim(), length));
			String[] bkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "bkg_no_split".trim(), length));
			String[] dorLocCd = (JSPUtil.getParameter(request, prefix	+ "dor_loc_cd".trim(), length));
			String[] cfmDt = (JSPUtil.getParameter(request, prefix	+ "cfm_dt".trim(), length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd".trim(), length));
			String[] cfmFlg = (JSPUtil.getParameter(request, prefix	+ "cfm_flg".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no".trim(), length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk".trim(), length));
			String[] bizRgstNo = (JSPUtil.getParameter(request, prefix	+ "biz_rgst_no".trim(), length));
			String[] actShprCntCd = (JSPUtil.getParameter(request, prefix	+ "act_shpr_cnt_cd".trim(), length));
			String[] actShprNm = (JSPUtil.getParameter(request, prefix	+ "act_shpr_nm".trim(), length));
			String[] actShprSeq = (JSPUtil.getParameter(request, prefix	+ "act_shpr_seq".trim(), length));
			String[] actShprAddr = (JSPUtil.getParameter(request, prefix	+ "act_shpr_addr".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgTroVO();
				if (rcSeq[i] != null)
					model.setRcSeq(rcSeq[i]);
				if (rqstUsrId[i] != null)
					model.setRqstUsrId(rqstUsrId[i]);
				if (soActCustNo[i] != null)
					model.setSoActCustNo(soActCustNo[i]);
				if (cxlFlg[i] != null)
					model.setCxlFlg(cxlFlg[i]);
				if (znCd[i] != null)
					model.setZnCd(znCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (awkCgoSeq[i] != null)
					model.setAwkCgoSeq(awkCgoSeq[i]);
				if (ownrTrkFlg[i] != null)
					model.setOwnrTrkFlg(ownrTrkFlg[i]);
				if (cntcPhnNo[i] != null)
					model.setCntcPhnNo(cntcPhnNo[i]);
				if (pctlNo[i] != null)
					model.setPctlNo(pctlNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (soActCustSeq[i] != null)
					model.setSoActCustSeq(soActCustSeq[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cntcPsonNm[i] != null)
					model.setCntcPsonNm(cntcPsonNm[i]);
				if (cntcFaxNo[i] != null)
					model.setCntcFaxNo(cntcFaxNo[i]);
				if (actShprPhnNo[i] != null)
					model.setActShprPhnNo(actShprPhnNo[i]);
				if (cntcMphnNo[i] != null)
					model.setCntcMphnNo(cntcMphnNo[i]);
				if (rcvTermCd[i] != null)
					model.setRcvTermCd(rcvTermCd[i]);
				if (rtnTroFlg[i] != null)
					model.setRtnTroFlg(rtnTroFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (rqstDt[i] != null)
					model.setRqstDt(rqstDt[i]);
				if (dorPstNo[i] != null)
					model.setDorPstNo(dorPstNo[i]);
				if (soFlg[i] != null)
					model.setSoFlg(soFlg[i]);
				if (troSeq[i] != null)
					model.setTroSeq(troSeq[i]);
				if (bkgNoSplit[i] != null)
					model.setBkgNoSplit(bkgNoSplit[i]);
				if (dorLocCd[i] != null)
					model.setDorLocCd(dorLocCd[i]);
				if (cfmDt[i] != null)
					model.setCfmDt(cfmDt[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (cfmFlg[i] != null)
					model.setCfmFlg(cfmFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (bizRgstNo[i] != null)
					model.setBizRgstNo(bizRgstNo[i]);
				if (actShprCntCd[i] != null)
					model.setActShprCntCd(actShprCntCd[i]);
				if (actShprNm[i] != null)
					model.setActShprNm(actShprNm[i]);
				if (actShprSeq[i] != null)
					model.setActShprSeq(actShprSeq[i]);
				if (actShprAddr[i] != null)
					model.setActShprAddr(actShprAddr[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgTroVOs();
	}

	/**
	 * 여러 VO Calss를 배열화 한다 
	 * @return BkgTroVO[]
	 */
	public BkgTroVO[] getBkgTroVOs(){
		BkgTroVO[] vos = (BkgTroVO[])models.toArray(new BkgTroVO[models.size()]);
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
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = getFieldCatct(field, i, arr);
		}
		return arr;
	}
	
	/**
	 * getField 에서 catch문에 대한 로직
	 * @param field
	 * @param i
	 * @param arr
	 * @return arr
	 */
	private String[] getFieldCatct(Field[] field, int i, String[] arr) {
		try {
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		} catch (IllegalAccessException e) {
			return null;
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void unDataFormat(){
		this.rcSeq = this.rcSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstUsrId = this.rqstUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soActCustNo = this.soActCustNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlFlg = this.cxlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.znCd = this.znCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.awkCgoSeq = this.awkCgoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ownrTrkFlg = this.ownrTrkFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPhnNo = this.cntcPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pctlNo = this.pctlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soActCustSeq = this.soActCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPsonNm = this.cntcPsonNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcFaxNo = this.cntcFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actShprPhnNo = this.actShprPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcMphnNo = this.cntcMphnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvTermCd = this.rcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtnTroFlg = this.rtnTroFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstDt = this.rqstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dorPstNo = this.dorPstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soFlg = this.soFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.troSeq = this.troSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNoSplit = this.bkgNoSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dorLocCd = this.dorLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmDt = this.cfmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmFlg = this.cfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bizRgstNo = this.bizRgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actShprCntCd = this.actShprCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actShprNm = this.actShprNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actShprSeq = this.actShprSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actShprAddr = this.actShprAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
