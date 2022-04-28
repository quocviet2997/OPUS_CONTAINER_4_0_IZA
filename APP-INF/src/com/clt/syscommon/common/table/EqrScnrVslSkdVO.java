/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrScnrVslSkdVO.java
*@FileTitle : EqrScnrVslSkdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.12.30
*@LastModifier : 정은호
*@LastVersion : 1.0
* 2009.12.30 정은호 
* 1.0 Creation
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
 * @author 정은호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EqrScnrVslSkdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrScnrVslSkdVO> models = new ArrayList<EqrScnrVslSkdVO>();
	
	/* Column Info */
	private String vslTurnCallIndCd = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String vslEtbDt = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String vslTurnVoyNo = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String vslSlanCd = null;
	/* Column Info */
	private String vslLocCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String vslEtaDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String vslTurnPortInfoCd = null;
	/* Column Info */
	private String callYdIndSeq = null;
	/* Column Info */
	private String cngStsCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslCallIndCd = null;
	/* Column Info */
	private String scnrId = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String vslTurnDirCd = null;
	/* Column Info */
	private String vslEtdDt = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String vslUsdCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String ydCd = null;
	/* Column Info */
	private String vslCallSeq = null;
	

	/* input Info */
	private String vslCallFlg = null;
	/* input Info */
	private String seq = null;
	/* input Info */
	private String vslTurnCallFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrScnrVslSkdVO() {}

	public EqrScnrVslSkdVO(String ibflag, String pagerows, String scnrId, String vslCd, String skdVoyNo, String skdDirCd, String vslLocCd, String vslCallIndCd, String vslCallSeq, String vslEtaDt, String vslEtbDt, String vslEtdDt, String vslTurnPortInfoCd, String vslTurnVoyNo, String vslTurnDirCd, String vslTurnCallIndCd, String vslSlanCd, String vslUsdCd, String deltFlg, String cngStsCd, String creUsrId, String creDt, String updUsrId, String updDt, String ydCd, String callYdIndSeq) {
		this.vslTurnCallIndCd = vslTurnCallIndCd;
		this.vslCd = vslCd;
		this.vslEtbDt = vslEtbDt;
		this.deltFlg = deltFlg;
		this.vslTurnVoyNo = vslTurnVoyNo;
		this.creDt = creDt;
		this.vslSlanCd = vslSlanCd;
		this.vslLocCd = vslLocCd;
		this.pagerows = pagerows;
		this.vslEtaDt = vslEtaDt;
		this.ibflag = ibflag;
		this.vslTurnPortInfoCd = vslTurnPortInfoCd;
		this.callYdIndSeq = callYdIndSeq;
		this.cngStsCd = cngStsCd;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.vslCallIndCd = vslCallIndCd;
		this.scnrId = scnrId;
		this.skdVoyNo = skdVoyNo;
		this.vslTurnDirCd = vslTurnDirCd;
		this.vslEtdDt = vslEtdDt;
		this.skdDirCd = skdDirCd;
		this.vslUsdCd = vslUsdCd;
		this.creUsrId = creUsrId;
		this.ydCd = ydCd;
		this.vslCallSeq = vslCallSeq;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_turn_call_ind_cd", getVslTurnCallIndCd());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("vsl_etb_dt", getVslEtbDt());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("vsl_turn_voy_no", getVslTurnVoyNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("vsl_slan_cd", getVslSlanCd());
		this.hashColumns.put("vsl_loc_cd", getVslLocCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("vsl_eta_dt", getVslEtaDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vsl_turn_port_info_cd", getVslTurnPortInfoCd());
		this.hashColumns.put("call_yd_ind_seq", getCallYdIndSeq());
		this.hashColumns.put("cng_sts_cd", getCngStsCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_call_ind_cd", getVslCallIndCd());
		this.hashColumns.put("scnr_id", getScnrId());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("vsl_turn_dir_cd", getVslTurnDirCd());
		this.hashColumns.put("vsl_etd_dt", getVslEtdDt());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("vsl_usd_cd", getVslUsdCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("vsl_call_seq", getVslCallSeq());
		this.hashColumns.put("vsl_call_flg", getVslCallFlg());
		this.hashColumns.put("seq", getSeq());
		this.hashColumns.put("vslTurnCallFlg", getVslTurnCallFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_turn_call_ind_cd", "vslTurnCallIndCd");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("vsl_etb_dt", "vslEtbDt");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("vsl_turn_voy_no", "vslTurnVoyNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("vsl_slan_cd", "vslSlanCd");
		this.hashFields.put("vsl_loc_cd", "vslLocCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("vsl_eta_dt", "vslEtaDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vsl_turn_port_info_cd", "vslTurnPortInfoCd");
		this.hashFields.put("call_yd_ind_seq", "callYdIndSeq");
		this.hashFields.put("cng_sts_cd", "cngStsCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_call_ind_cd", "vslCallIndCd");
		this.hashFields.put("scnr_id", "scnrId");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("vsl_turn_dir_cd", "vslTurnDirCd");
		this.hashFields.put("vsl_etd_dt", "vslEtdDt");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("vsl_usd_cd", "vslUsdCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("vsl_call_seq", "vslCallSeq");
		this.hashFields.put("vsl_call_flg", "vslCallFlg");
		this.hashFields.put("seq", "seq");
		this.hashFields.put("vsl_turn_call_flg", "vslTurnCallFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return vslTurnCallIndCd
	 */
	public String getVslTurnCallIndCd() {
		return this.vslTurnCallIndCd;
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
	 * @return vslEtbDt
	 */
	public String getVslEtbDt() {
		return this.vslEtbDt;
	}
	
	/**
	 * Column Info
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}
	
	/**
	 * Column Info
	 * @return vslTurnVoyNo
	 */
	public String getVslTurnVoyNo() {
		return this.vslTurnVoyNo;
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
	 * @return vslSlanCd
	 */
	public String getVslSlanCd() {
		return this.vslSlanCd;
	}
	
	/**
	 * Column Info
	 * @return vslLocCd
	 */
	public String getVslLocCd() {
		return this.vslLocCd;
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
	 * @return vslEtaDt
	 */
	public String getVslEtaDt() {
		return this.vslEtaDt;
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
	 * @return vslTurnPortInfoCd
	 */
	public String getVslTurnPortInfoCd() {
		return this.vslTurnPortInfoCd;
	}
	
	/**
	 * Column Info
	 * @return callYdIndSeq
	 */
	public String getCallYdIndSeq() {
		return this.callYdIndSeq;
	}
	
	/**
	 * Column Info
	 * @return cngStsCd
	 */
	public String getCngStsCd() {
		return this.cngStsCd;
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
	 * @return vslCallIndCd
	 */
	public String getVslCallIndCd() {
		return this.vslCallIndCd;
	}
	
	/**
	 * Column Info
	 * @return scnrId
	 */
	public String getScnrId() {
		return this.scnrId;
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
	 * @return vslTurnDirCd
	 */
	public String getVslTurnDirCd() {
		return this.vslTurnDirCd;
	}
	
	/**
	 * Column Info
	 * @return vslEtdDt
	 */
	public String getVslEtdDt() {
		return this.vslEtdDt;
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
	 * @return vslUsdCd
	 */
	public String getVslUsdCd() {
		return this.vslUsdCd;
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
	 * @return ydCd
	 */
	public String getYdCd() {
		return this.ydCd;
	}
	
	/**
	 * Column Info
	 * @return vslCallSeq
	 */
	public String getVslCallSeq() {
		return this.vslCallSeq;
	}
	

	/**
	 * Column Info
	 * @param vslTurnCallIndCd
	 */
	public void setVslTurnCallIndCd(String vslTurnCallIndCd) {
		this.vslTurnCallIndCd = vslTurnCallIndCd;
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
	 * @param vslEtbDt
	 */
	public void setVslEtbDt(String vslEtbDt) {
		this.vslEtbDt = vslEtbDt;
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
	 * @param vslTurnVoyNo
	 */
	public void setVslTurnVoyNo(String vslTurnVoyNo) {
		this.vslTurnVoyNo = vslTurnVoyNo;
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
	 * @param vslSlanCd
	 */
	public void setVslSlanCd(String vslSlanCd) {
		this.vslSlanCd = vslSlanCd;
	}
	
	/**
	 * Column Info
	 * @param vslLocCd
	 */
	public void setVslLocCd(String vslLocCd) {
		this.vslLocCd = vslLocCd;
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
	 * @param vslEtaDt
	 */
	public void setVslEtaDt(String vslEtaDt) {
		this.vslEtaDt = vslEtaDt;
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
	 * @param vslTurnPortInfoCd
	 */
	public void setVslTurnPortInfoCd(String vslTurnPortInfoCd) {
		this.vslTurnPortInfoCd = vslTurnPortInfoCd;
	}
	
	/**
	 * Column Info
	 * @param callYdIndSeq
	 */
	public void setCallYdIndSeq(String callYdIndSeq) {
		this.callYdIndSeq = callYdIndSeq;
	}
	
	/**
	 * Column Info
	 * @param cngStsCd
	 */
	public void setCngStsCd(String cngStsCd) {
		this.cngStsCd = cngStsCd;
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
	 * @param vslCallIndCd
	 */
	public void setVslCallIndCd(String vslCallIndCd) {
		this.vslCallIndCd = vslCallIndCd;
	}
	
	/**
	 * Column Info
	 * @param scnrId
	 */
	public void setScnrId(String scnrId) {
		this.scnrId = scnrId;
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
	 * @param vslTurnDirCd
	 */
	public void setVslTurnDirCd(String vslTurnDirCd) {
		this.vslTurnDirCd = vslTurnDirCd;
	}
	
	/**
	 * Column Info
	 * @param vslEtdDt
	 */
	public void setVslEtdDt(String vslEtdDt) {
		this.vslEtdDt = vslEtdDt;
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
	 * @param vslUsdCd
	 */
	public void setVslUsdCd(String vslUsdCd) {
		this.vslUsdCd = vslUsdCd;
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
	 * @param ydCd
	 */
	public void setYdCd(String ydCd) {
		this.ydCd = ydCd;
	}
	
	/**
	 * Column Info
	 * @param vslCallSeq
	 */
	public void setVslCallSeq(String vslCallSeq) {
		this.vslCallSeq = vslCallSeq;
	}

	public String getVslCallFlg() {
		return vslCallFlg;
	}

	public void setVslCallFlg(String vslCallFlg) {
		this.vslCallFlg = vslCallFlg;
	}
	

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}
	

	public String getVslTurnCallFlg() {
		return vslTurnCallFlg;
	}

	public void setVslTurnCallFlg(String vslTurnCallFlg) {
		this.vslTurnCallFlg = vslTurnCallFlg;
	}
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVslTurnCallIndCd(JSPUtil.getParameter(request, "vsl_turn_call_ind_cd", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setVslEtbDt(JSPUtil.getParameter(request, "vsl_etb_dt", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setVslTurnVoyNo(JSPUtil.getParameter(request, "vsl_turn_voy_no", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setVslSlanCd(JSPUtil.getParameter(request, "vsl_slan_cd", ""));
		setVslLocCd(JSPUtil.getParameter(request, "vsl_loc_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setVslEtaDt(JSPUtil.getParameter(request, "vsl_eta_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setVslTurnPortInfoCd(JSPUtil.getParameter(request, "vsl_turn_port_info_cd", ""));
		setCallYdIndSeq(JSPUtil.getParameter(request, "call_yd_ind_seq", ""));
		setCngStsCd(JSPUtil.getParameter(request, "cng_sts_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setVslCallIndCd(JSPUtil.getParameter(request, "vsl_call_ind_cd", ""));
		setScnrId(JSPUtil.getParameter(request, "scnr_id", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setVslTurnDirCd(JSPUtil.getParameter(request, "vsl_turn_dir_cd", ""));
		setVslEtdDt(JSPUtil.getParameter(request, "vsl_etd_dt", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setVslUsdCd(JSPUtil.getParameter(request, "vsl_usd_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setYdCd(JSPUtil.getParameter(request, "yd_cd", ""));
		setVslCallSeq(JSPUtil.getParameter(request, "vsl_call_seq", ""));
		setVslCallFlg(JSPUtil.getParameter(request, "vsl_call_flg", ""));
		setSeq(JSPUtil.getParameter(request, "seq", ""));
		setVslTurnCallFlg(JSPUtil.getParameter(request, "vsl_turn_call_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrScnrVslSkdVO[]
	 */
	public EqrScnrVslSkdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrScnrVslSkdVO[]
	 */
	public EqrScnrVslSkdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrScnrVslSkdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslTurnCallIndCd = (JSPUtil.getParameter(request, prefix	+ "vsl_turn_call_ind_cd", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] vslEtbDt = (JSPUtil.getParameter(request, prefix	+ "vsl_etb_dt", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] vslTurnVoyNo = (JSPUtil.getParameter(request, prefix	+ "vsl_turn_voy_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] vslSlanCd = (JSPUtil.getParameter(request, prefix	+ "vsl_slan_cd", length));
			String[] vslLocCd = (JSPUtil.getParameter(request, prefix	+ "vsl_loc_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] vslEtaDt = (JSPUtil.getParameter(request, prefix	+ "vsl_eta_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] vslTurnPortInfoCd = (JSPUtil.getParameter(request, prefix	+ "vsl_turn_port_info_cd", length));
			String[] callYdIndSeq = (JSPUtil.getParameter(request, prefix	+ "call_yd_ind_seq", length));
			String[] cngStsCd = (JSPUtil.getParameter(request, prefix	+ "cng_sts_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] vslCallIndCd = (JSPUtil.getParameter(request, prefix	+ "vsl_call_ind_cd", length));
			String[] scnrId = (JSPUtil.getParameter(request, prefix	+ "scnr_id", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] vslTurnDirCd = (JSPUtil.getParameter(request, prefix	+ "vsl_turn_dir_cd", length));
			String[] vslEtdDt = (JSPUtil.getParameter(request, prefix	+ "vsl_etd_dt", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] vslUsdCd = (JSPUtil.getParameter(request, prefix	+ "vsl_usd_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd", length));
			String[] vslCallSeq = (JSPUtil.getParameter(request, prefix	+ "vsl_call_seq", length));
			String[] vslCallFlg = (JSPUtil.getParameter(request, prefix	+ "vsl_call_flg", length));
			String[] seq = (JSPUtil.getParameter(request, prefix	+ "seq", length));
			String[] vslTurnCallFlg = (JSPUtil.getParameter(request, prefix	+ "vsl_turn_call_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrScnrVslSkdVO();
				if (vslTurnCallIndCd[i] != null)
					model.setVslTurnCallIndCd(vslTurnCallIndCd[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (vslEtbDt[i] != null)
					model.setVslEtbDt(vslEtbDt[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (vslTurnVoyNo[i] != null)
					model.setVslTurnVoyNo(vslTurnVoyNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (vslSlanCd[i] != null)
					model.setVslSlanCd(vslSlanCd[i]);
				if (vslLocCd[i] != null)
					model.setVslLocCd(vslLocCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (vslEtaDt[i] != null)
					model.setVslEtaDt(vslEtaDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vslTurnPortInfoCd[i] != null)
					model.setVslTurnPortInfoCd(vslTurnPortInfoCd[i]);
				if (callYdIndSeq[i] != null)
					model.setCallYdIndSeq(callYdIndSeq[i]);
				if (cngStsCd[i] != null)
					model.setCngStsCd(cngStsCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslCallIndCd[i] != null)
					model.setVslCallIndCd(vslCallIndCd[i]);
				if (scnrId[i] != null)
					model.setScnrId(scnrId[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (vslTurnDirCd[i] != null)
					model.setVslTurnDirCd(vslTurnDirCd[i]);
				if (vslEtdDt[i] != null)
					model.setVslEtdDt(vslEtdDt[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (vslUsdCd[i] != null)
					model.setVslUsdCd(vslUsdCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (vslCallSeq[i] != null)
					model.setVslCallSeq(vslCallSeq[i]);
				if (vslCallFlg[i] != null)
					model.setVslCallFlg(vslCallFlg[i]);
				if (seq[i] != null)
					model.setSeq(seq[i]);
				if (vslTurnCallFlg[i] != null)
					model.setVslTurnCallFlg(vslTurnCallFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrScnrVslSkdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrScnrVslSkdVO[]
	 */
	public EqrScnrVslSkdVO[] getEqrScnrVslSkdVOs(){
		EqrScnrVslSkdVO[] vos = (EqrScnrVslSkdVO[])models.toArray(new EqrScnrVslSkdVO[models.size()]);
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
		this.vslTurnCallIndCd = this.vslTurnCallIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslEtbDt = this.vslEtbDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslTurnVoyNo = this.vslTurnVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSlanCd = this.vslSlanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslLocCd = this.vslLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslEtaDt = this.vslEtaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslTurnPortInfoCd = this.vslTurnPortInfoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.callYdIndSeq = this.callYdIndSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cngStsCd = this.cngStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCallIndCd = this.vslCallIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scnrId = this.scnrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslTurnDirCd = this.vslTurnDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslEtdDt = this.vslEtdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslUsdCd = this.vslUsdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCallSeq = this.vslCallSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCallFlg = this.vslCallFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.seq = this.seq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslTurnCallFlg = this.vslTurnCallFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
