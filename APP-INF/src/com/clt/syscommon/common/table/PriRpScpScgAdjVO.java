/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PriRpScpScgAdjVO.java
*@FileTitle : PriRpScpScgAdjVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.22
*@LastModifier : 공백진
*@LastVersion : 1.0
* 2009.07.22 공백진 
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
 * @author 공백진
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PriRpScpScgAdjVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriRpScpScgAdjVO> models = new ArrayList<PriRpScpScgAdjVO>();
	
	/* Column Info */
	private String scgAdjSeq = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String prcCgoTpCd = null;
	/* Column Info */
	private String amdtSeq = null;
	/* Column Info */
	private String svcScpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String mapgScre = null;
	/* Column Info */
	private String chgCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String orgLocTpCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String orgViaLocTpCd = null;
	/* Column Info */
	private String destViaLocTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String prcCmdtDefCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String adjScgUsdAmt = null;
	/* Column Info */
	private String prcDeTermCd = null;
	/* Column Info */
	private String destLocTpCd = null;
	/* Column Info */
	private String orgViaLocDefCd = null;
	/* Column Info */
	private String orgLocDefCd = null;
	/* Column Info */
	private String prcRcvTermCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String destLocDefCd = null;
	/* Column Info */
	private String adjScgAmt = null;
	/* Column Info */
	private String propNo = null;
	/* Column Info */
	private String bkgRatUtCd = null;
	/* Column Info */
	private String prcCmdtTpCd = null;
	/* Column Info */
	private String destViaLocDefCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriRpScpScgAdjVO() {}

	public PriRpScpScgAdjVO(String ibflag, String pagerows, String propNo, String amdtSeq, String svcScpCd, String scgAdjSeq, String prcCmdtTpCd, String prcCmdtDefCd, String orgLocTpCd, String orgLocDefCd, String orgViaLocTpCd, String orgViaLocDefCd, String destViaLocTpCd, String destViaLocDefCd, String destLocTpCd, String destLocDefCd, String prcRcvTermCd, String prcDeTermCd, String bkgRatUtCd, String prcCgoTpCd, String chgCd, String currCd, String adjScgAmt, String adjScgUsdAmt, String mapgScre, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.scgAdjSeq = scgAdjSeq;
		this.currCd = currCd;
		this.prcCgoTpCd = prcCgoTpCd;
		this.amdtSeq = amdtSeq;
		this.svcScpCd = svcScpCd;
		this.creDt = creDt;
		this.mapgScre = mapgScre;
		this.chgCd = chgCd;
		this.pagerows = pagerows;
		this.orgLocTpCd = orgLocTpCd;
		this.ibflag = ibflag;
		this.orgViaLocTpCd = orgViaLocTpCd;
		this.destViaLocTpCd = destViaLocTpCd;
		this.updUsrId = updUsrId;
		this.prcCmdtDefCd = prcCmdtDefCd;
		this.updDt = updDt;
		this.adjScgUsdAmt = adjScgUsdAmt;
		this.prcDeTermCd = prcDeTermCd;
		this.destLocTpCd = destLocTpCd;
		this.orgViaLocDefCd = orgViaLocDefCd;
		this.orgLocDefCd = orgLocDefCd;
		this.prcRcvTermCd = prcRcvTermCd;
		this.creUsrId = creUsrId;
		this.destLocDefCd = destLocDefCd;
		this.adjScgAmt = adjScgAmt;
		this.propNo = propNo;
		this.bkgRatUtCd = bkgRatUtCd;
		this.prcCmdtTpCd = prcCmdtTpCd;
		this.destViaLocDefCd = destViaLocDefCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("scg_adj_seq", getScgAdjSeq());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("prc_cgo_tp_cd", getPrcCgoTpCd());
		this.hashColumns.put("amdt_seq", getAmdtSeq());
		this.hashColumns.put("svc_scp_cd", getSvcScpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("mapg_scre", getMapgScre());
		this.hashColumns.put("chg_cd", getChgCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("org_loc_tp_cd", getOrgLocTpCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("org_via_loc_tp_cd", getOrgViaLocTpCd());
		this.hashColumns.put("dest_via_loc_tp_cd", getDestViaLocTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("prc_cmdt_def_cd", getPrcCmdtDefCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("adj_scg_usd_amt", getAdjScgUsdAmt());
		this.hashColumns.put("prc_de_term_cd", getPrcDeTermCd());
		this.hashColumns.put("dest_loc_tp_cd", getDestLocTpCd());
		this.hashColumns.put("org_via_loc_def_cd", getOrgViaLocDefCd());
		this.hashColumns.put("org_loc_def_cd", getOrgLocDefCd());
		this.hashColumns.put("prc_rcv_term_cd", getPrcRcvTermCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("dest_loc_def_cd", getDestLocDefCd());
		this.hashColumns.put("adj_scg_amt", getAdjScgAmt());
		this.hashColumns.put("prop_no", getPropNo());
		this.hashColumns.put("bkg_rat_ut_cd", getBkgRatUtCd());
		this.hashColumns.put("prc_cmdt_tp_cd", getPrcCmdtTpCd());
		this.hashColumns.put("dest_via_loc_def_cd", getDestViaLocDefCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("scg_adj_seq", "scgAdjSeq");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("prc_cgo_tp_cd", "prcCgoTpCd");
		this.hashFields.put("amdt_seq", "amdtSeq");
		this.hashFields.put("svc_scp_cd", "svcScpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("mapg_scre", "mapgScre");
		this.hashFields.put("chg_cd", "chgCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("org_loc_tp_cd", "orgLocTpCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("org_via_loc_tp_cd", "orgViaLocTpCd");
		this.hashFields.put("dest_via_loc_tp_cd", "destViaLocTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("prc_cmdt_def_cd", "prcCmdtDefCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("adj_scg_usd_amt", "adjScgUsdAmt");
		this.hashFields.put("prc_de_term_cd", "prcDeTermCd");
		this.hashFields.put("dest_loc_tp_cd", "destLocTpCd");
		this.hashFields.put("org_via_loc_def_cd", "orgViaLocDefCd");
		this.hashFields.put("org_loc_def_cd", "orgLocDefCd");
		this.hashFields.put("prc_rcv_term_cd", "prcRcvTermCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("dest_loc_def_cd", "destLocDefCd");
		this.hashFields.put("adj_scg_amt", "adjScgAmt");
		this.hashFields.put("prop_no", "propNo");
		this.hashFields.put("bkg_rat_ut_cd", "bkgRatUtCd");
		this.hashFields.put("prc_cmdt_tp_cd", "prcCmdtTpCd");
		this.hashFields.put("dest_via_loc_def_cd", "destViaLocDefCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return scgAdjSeq
	 */
	public String getScgAdjSeq() {
		return this.scgAdjSeq;
	}
	
	/**
	 * Column Info
	 * @return currCd
	 */
	public String getCurrCd() {
		return this.currCd;
	}
	
	/**
	 * Column Info
	 * @return prcCgoTpCd
	 */
	public String getPrcCgoTpCd() {
		return this.prcCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @return amdtSeq
	 */
	public String getAmdtSeq() {
		return this.amdtSeq;
	}
	
	/**
	 * Column Info
	 * @return svcScpCd
	 */
	public String getSvcScpCd() {
		return this.svcScpCd;
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
	 * @return mapgScre
	 */
	public String getMapgScre() {
		return this.mapgScre;
	}
	
	/**
	 * Column Info
	 * @return chgCd
	 */
	public String getChgCd() {
		return this.chgCd;
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
	 * @return orgLocTpCd
	 */
	public String getOrgLocTpCd() {
		return this.orgLocTpCd;
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
	 * @return orgViaLocTpCd
	 */
	public String getOrgViaLocTpCd() {
		return this.orgViaLocTpCd;
	}
	
	/**
	 * Column Info
	 * @return destViaLocTpCd
	 */
	public String getDestViaLocTpCd() {
		return this.destViaLocTpCd;
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
	 * @return prcCmdtDefCd
	 */
	public String getPrcCmdtDefCd() {
		return this.prcCmdtDefCd;
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
	 * @return adjScgUsdAmt
	 */
	public String getAdjScgUsdAmt() {
		return this.adjScgUsdAmt;
	}
	
	/**
	 * Column Info
	 * @return prcDeTermCd
	 */
	public String getPrcDeTermCd() {
		return this.prcDeTermCd;
	}
	
	/**
	 * Column Info
	 * @return destLocTpCd
	 */
	public String getDestLocTpCd() {
		return this.destLocTpCd;
	}
	
	/**
	 * Column Info
	 * @return orgViaLocDefCd
	 */
	public String getOrgViaLocDefCd() {
		return this.orgViaLocDefCd;
	}
	
	/**
	 * Column Info
	 * @return orgLocDefCd
	 */
	public String getOrgLocDefCd() {
		return this.orgLocDefCd;
	}
	
	/**
	 * Column Info
	 * @return prcRcvTermCd
	 */
	public String getPrcRcvTermCd() {
		return this.prcRcvTermCd;
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
	 * @return destLocDefCd
	 */
	public String getDestLocDefCd() {
		return this.destLocDefCd;
	}
	
	/**
	 * Column Info
	 * @return adjScgAmt
	 */
	public String getAdjScgAmt() {
		return this.adjScgAmt;
	}
	
	/**
	 * Column Info
	 * @return propNo
	 */
	public String getPropNo() {
		return this.propNo;
	}
	
	/**
	 * Column Info
	 * @return bkgRatUtCd
	 */
	public String getBkgRatUtCd() {
		return this.bkgRatUtCd;
	}
	
	/**
	 * Column Info
	 * @return prcCmdtTpCd
	 */
	public String getPrcCmdtTpCd() {
		return this.prcCmdtTpCd;
	}
	
	/**
	 * Column Info
	 * @return destViaLocDefCd
	 */
	public String getDestViaLocDefCd() {
		return this.destViaLocDefCd;
	}
	

	/**
	 * Column Info
	 * @param scgAdjSeq
	 */
	public void setScgAdjSeq(String scgAdjSeq) {
		this.scgAdjSeq = scgAdjSeq;
	}
	
	/**
	 * Column Info
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	/**
	 * Column Info
	 * @param prcCgoTpCd
	 */
	public void setPrcCgoTpCd(String prcCgoTpCd) {
		this.prcCgoTpCd = prcCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @param amdtSeq
	 */
	public void setAmdtSeq(String amdtSeq) {
		this.amdtSeq = amdtSeq;
	}
	
	/**
	 * Column Info
	 * @param svcScpCd
	 */
	public void setSvcScpCd(String svcScpCd) {
		this.svcScpCd = svcScpCd;
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
	 * @param mapgScre
	 */
	public void setMapgScre(String mapgScre) {
		this.mapgScre = mapgScre;
	}
	
	/**
	 * Column Info
	 * @param chgCd
	 */
	public void setChgCd(String chgCd) {
		this.chgCd = chgCd;
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
	 * @param orgLocTpCd
	 */
	public void setOrgLocTpCd(String orgLocTpCd) {
		this.orgLocTpCd = orgLocTpCd;
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
	 * @param orgViaLocTpCd
	 */
	public void setOrgViaLocTpCd(String orgViaLocTpCd) {
		this.orgViaLocTpCd = orgViaLocTpCd;
	}
	
	/**
	 * Column Info
	 * @param destViaLocTpCd
	 */
	public void setDestViaLocTpCd(String destViaLocTpCd) {
		this.destViaLocTpCd = destViaLocTpCd;
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
	 * @param prcCmdtDefCd
	 */
	public void setPrcCmdtDefCd(String prcCmdtDefCd) {
		this.prcCmdtDefCd = prcCmdtDefCd;
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
	 * @param adjScgUsdAmt
	 */
	public void setAdjScgUsdAmt(String adjScgUsdAmt) {
		this.adjScgUsdAmt = adjScgUsdAmt;
	}
	
	/**
	 * Column Info
	 * @param prcDeTermCd
	 */
	public void setPrcDeTermCd(String prcDeTermCd) {
		this.prcDeTermCd = prcDeTermCd;
	}
	
	/**
	 * Column Info
	 * @param destLocTpCd
	 */
	public void setDestLocTpCd(String destLocTpCd) {
		this.destLocTpCd = destLocTpCd;
	}
	
	/**
	 * Column Info
	 * @param orgViaLocDefCd
	 */
	public void setOrgViaLocDefCd(String orgViaLocDefCd) {
		this.orgViaLocDefCd = orgViaLocDefCd;
	}
	
	/**
	 * Column Info
	 * @param orgLocDefCd
	 */
	public void setOrgLocDefCd(String orgLocDefCd) {
		this.orgLocDefCd = orgLocDefCd;
	}
	
	/**
	 * Column Info
	 * @param prcRcvTermCd
	 */
	public void setPrcRcvTermCd(String prcRcvTermCd) {
		this.prcRcvTermCd = prcRcvTermCd;
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
	 * @param destLocDefCd
	 */
	public void setDestLocDefCd(String destLocDefCd) {
		this.destLocDefCd = destLocDefCd;
	}
	
	/**
	 * Column Info
	 * @param adjScgAmt
	 */
	public void setAdjScgAmt(String adjScgAmt) {
		this.adjScgAmt = adjScgAmt;
	}
	
	/**
	 * Column Info
	 * @param propNo
	 */
	public void setPropNo(String propNo) {
		this.propNo = propNo;
	}
	
	/**
	 * Column Info
	 * @param bkgRatUtCd
	 */
	public void setBkgRatUtCd(String bkgRatUtCd) {
		this.bkgRatUtCd = bkgRatUtCd;
	}
	
	/**
	 * Column Info
	 * @param prcCmdtTpCd
	 */
	public void setPrcCmdtTpCd(String prcCmdtTpCd) {
		this.prcCmdtTpCd = prcCmdtTpCd;
	}
	
	/**
	 * Column Info
	 * @param destViaLocDefCd
	 */
	public void setDestViaLocDefCd(String destViaLocDefCd) {
		this.destViaLocDefCd = destViaLocDefCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setScgAdjSeq(JSPUtil.getParameter(request, "scg_adj_seq", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setPrcCgoTpCd(JSPUtil.getParameter(request, "prc_cgo_tp_cd", ""));
		setAmdtSeq(JSPUtil.getParameter(request, "amdt_seq", ""));
		setSvcScpCd(JSPUtil.getParameter(request, "svc_scp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setMapgScre(JSPUtil.getParameter(request, "mapg_scre", ""));
		setChgCd(JSPUtil.getParameter(request, "chg_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setOrgLocTpCd(JSPUtil.getParameter(request, "org_loc_tp_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setOrgViaLocTpCd(JSPUtil.getParameter(request, "org_via_loc_tp_cd", ""));
		setDestViaLocTpCd(JSPUtil.getParameter(request, "dest_via_loc_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPrcCmdtDefCd(JSPUtil.getParameter(request, "prc_cmdt_def_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setAdjScgUsdAmt(JSPUtil.getParameter(request, "adj_scg_usd_amt", ""));
		setPrcDeTermCd(JSPUtil.getParameter(request, "prc_de_term_cd", ""));
		setDestLocTpCd(JSPUtil.getParameter(request, "dest_loc_tp_cd", ""));
		setOrgViaLocDefCd(JSPUtil.getParameter(request, "org_via_loc_def_cd", ""));
		setOrgLocDefCd(JSPUtil.getParameter(request, "org_loc_def_cd", ""));
		setPrcRcvTermCd(JSPUtil.getParameter(request, "prc_rcv_term_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setDestLocDefCd(JSPUtil.getParameter(request, "dest_loc_def_cd", ""));
		setAdjScgAmt(JSPUtil.getParameter(request, "adj_scg_amt", ""));
		setPropNo(JSPUtil.getParameter(request, "prop_no", ""));
		setBkgRatUtCd(JSPUtil.getParameter(request, "bkg_rat_ut_cd", ""));
		setPrcCmdtTpCd(JSPUtil.getParameter(request, "prc_cmdt_tp_cd", ""));
		setDestViaLocDefCd(JSPUtil.getParameter(request, "dest_via_loc_def_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriRpScpScgAdjVO[]
	 */
	public PriRpScpScgAdjVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriRpScpScgAdjVO[]
	 */
	public PriRpScpScgAdjVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriRpScpScgAdjVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] scgAdjSeq = (JSPUtil.getParameter(request, prefix	+ "scg_adj_seq", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] prcCgoTpCd = (JSPUtil.getParameter(request, prefix	+ "prc_cgo_tp_cd", length));
			String[] amdtSeq = (JSPUtil.getParameter(request, prefix	+ "amdt_seq", length));
			String[] svcScpCd = (JSPUtil.getParameter(request, prefix	+ "svc_scp_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] mapgScre = (JSPUtil.getParameter(request, prefix	+ "mapg_scre", length));
			String[] chgCd = (JSPUtil.getParameter(request, prefix	+ "chg_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] orgLocTpCd = (JSPUtil.getParameter(request, prefix	+ "org_loc_tp_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] orgViaLocTpCd = (JSPUtil.getParameter(request, prefix	+ "org_via_loc_tp_cd", length));
			String[] destViaLocTpCd = (JSPUtil.getParameter(request, prefix	+ "dest_via_loc_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] prcCmdtDefCd = (JSPUtil.getParameter(request, prefix	+ "prc_cmdt_def_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] adjScgUsdAmt = (JSPUtil.getParameter(request, prefix	+ "adj_scg_usd_amt", length));
			String[] prcDeTermCd = (JSPUtil.getParameter(request, prefix	+ "prc_de_term_cd", length));
			String[] destLocTpCd = (JSPUtil.getParameter(request, prefix	+ "dest_loc_tp_cd", length));
			String[] orgViaLocDefCd = (JSPUtil.getParameter(request, prefix	+ "org_via_loc_def_cd", length));
			String[] orgLocDefCd = (JSPUtil.getParameter(request, prefix	+ "org_loc_def_cd", length));
			String[] prcRcvTermCd = (JSPUtil.getParameter(request, prefix	+ "prc_rcv_term_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] destLocDefCd = (JSPUtil.getParameter(request, prefix	+ "dest_loc_def_cd", length));
			String[] adjScgAmt = (JSPUtil.getParameter(request, prefix	+ "adj_scg_amt", length));
			String[] propNo = (JSPUtil.getParameter(request, prefix	+ "prop_no", length));
			String[] bkgRatUtCd = (JSPUtil.getParameter(request, prefix	+ "bkg_rat_ut_cd", length));
			String[] prcCmdtTpCd = (JSPUtil.getParameter(request, prefix	+ "prc_cmdt_tp_cd", length));
			String[] destViaLocDefCd = (JSPUtil.getParameter(request, prefix	+ "dest_via_loc_def_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new PriRpScpScgAdjVO();
				if (scgAdjSeq[i] != null)
					model.setScgAdjSeq(scgAdjSeq[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (prcCgoTpCd[i] != null)
					model.setPrcCgoTpCd(prcCgoTpCd[i]);
				if (amdtSeq[i] != null)
					model.setAmdtSeq(amdtSeq[i]);
				if (svcScpCd[i] != null)
					model.setSvcScpCd(svcScpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (mapgScre[i] != null)
					model.setMapgScre(mapgScre[i]);
				if (chgCd[i] != null)
					model.setChgCd(chgCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (orgLocTpCd[i] != null)
					model.setOrgLocTpCd(orgLocTpCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (orgViaLocTpCd[i] != null)
					model.setOrgViaLocTpCd(orgViaLocTpCd[i]);
				if (destViaLocTpCd[i] != null)
					model.setDestViaLocTpCd(destViaLocTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (prcCmdtDefCd[i] != null)
					model.setPrcCmdtDefCd(prcCmdtDefCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (adjScgUsdAmt[i] != null)
					model.setAdjScgUsdAmt(adjScgUsdAmt[i]);
				if (prcDeTermCd[i] != null)
					model.setPrcDeTermCd(prcDeTermCd[i]);
				if (destLocTpCd[i] != null)
					model.setDestLocTpCd(destLocTpCd[i]);
				if (orgViaLocDefCd[i] != null)
					model.setOrgViaLocDefCd(orgViaLocDefCd[i]);
				if (orgLocDefCd[i] != null)
					model.setOrgLocDefCd(orgLocDefCd[i]);
				if (prcRcvTermCd[i] != null)
					model.setPrcRcvTermCd(prcRcvTermCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (destLocDefCd[i] != null)
					model.setDestLocDefCd(destLocDefCd[i]);
				if (adjScgAmt[i] != null)
					model.setAdjScgAmt(adjScgAmt[i]);
				if (propNo[i] != null)
					model.setPropNo(propNo[i]);
				if (bkgRatUtCd[i] != null)
					model.setBkgRatUtCd(bkgRatUtCd[i]);
				if (prcCmdtTpCd[i] != null)
					model.setPrcCmdtTpCd(prcCmdtTpCd[i]);
				if (destViaLocDefCd[i] != null)
					model.setDestViaLocDefCd(destViaLocDefCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPriRpScpScgAdjVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PriRpScpScgAdjVO[]
	 */
	public PriRpScpScgAdjVO[] getPriRpScpScgAdjVOs(){
		PriRpScpScgAdjVO[] vos = (PriRpScpScgAdjVO[])models.toArray(new PriRpScpScgAdjVO[models.size()]);
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
		this.scgAdjSeq = this.scgAdjSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcCgoTpCd = this.prcCgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amdtSeq = this.amdtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcScpCd = this.svcScpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mapgScre = this.mapgScre .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgCd = this.chgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgLocTpCd = this.orgLocTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgViaLocTpCd = this.orgViaLocTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destViaLocTpCd = this.destViaLocTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcCmdtDefCd = this.prcCmdtDefCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjScgUsdAmt = this.adjScgUsdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcDeTermCd = this.prcDeTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destLocTpCd = this.destLocTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgViaLocDefCd = this.orgViaLocDefCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgLocDefCd = this.orgLocDefCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcRcvTermCd = this.prcRcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destLocDefCd = this.destLocDefCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjScgAmt = this.adjScgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propNo = this.propNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRatUtCd = this.bkgRatUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcCmdtTpCd = this.prcCmdtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destViaLocDefCd = this.destViaLocDefCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
