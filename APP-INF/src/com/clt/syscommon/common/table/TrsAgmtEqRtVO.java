/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : TrsAgmtEqRtVO.java
*@FileTitle : TrsAgmtEqRtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.05
*@LastModifier : 최종혁
*@LastVersion : 1.0
* 2010.07.05 최종혁 
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
 * @author 최종혁
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TrsAgmtEqRtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsAgmtEqRtVO> models = new ArrayList<TrsAgmtEqRtVO>();
	
	/* Column Info */
	private String trspAgmtNodSeq = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String toWgt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trspAgmtRtTpSerNo = null;
	/* Column Info */
	private String trspAgmtOfcCtyCd = null;
	/* Column Info */
	private String trspRndRt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String wtrRcvTermCd = null;
	/* Column Info */
	private String trspAgmtRtSeq = null;
	/* Column Info */
	private String effFmDt = null;
	/* Column Info */
	private String wtrDeTermCd = null;
	/* Column Info */
	private String trspRvsAplyFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String trspAgmtEqTpSzCd = null;
	/* Column Info */
	private String trspOneWyRt = null;
	/* Column Info */
	private String eqKndCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String trspAgmtSeq = null;
	/* Column Info */
	private String wgtMeasUtCd = null;
	/* Column Info */
	private String trspAgmtBdlQty = null;
	/* Column Info */
	private String effToDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TrsAgmtEqRtVO() {}

	public TrsAgmtEqRtVO(String ibflag, String pagerows, String trspAgmtOfcCtyCd, String trspAgmtSeq, String trspAgmtRtTpSerNo, String trspAgmtNodSeq, String trspAgmtRtSeq, String trspAgmtEqTpSzCd, String eqKndCd, String wtrRcvTermCd, String wtrDeTermCd, String trspAgmtBdlQty, String toWgt, String wgtMeasUtCd, String trspRvsAplyFlg, String effFmDt, String effToDt, String currCd, String trspOneWyRt, String trspRndRt, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.trspAgmtNodSeq = trspAgmtNodSeq;
		this.currCd = currCd;
		this.deltFlg = deltFlg;
		this.toWgt = toWgt;
		this.creDt = creDt;
		this.trspAgmtRtTpSerNo = trspAgmtRtTpSerNo;
		this.trspAgmtOfcCtyCd = trspAgmtOfcCtyCd;
		this.trspRndRt = trspRndRt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.wtrRcvTermCd = wtrRcvTermCd;
		this.trspAgmtRtSeq = trspAgmtRtSeq;
		this.effFmDt = effFmDt;
		this.wtrDeTermCd = wtrDeTermCd;
		this.trspRvsAplyFlg = trspRvsAplyFlg;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.trspAgmtEqTpSzCd = trspAgmtEqTpSzCd;
		this.trspOneWyRt = trspOneWyRt;
		this.eqKndCd = eqKndCd;
		this.creUsrId = creUsrId;
		this.trspAgmtSeq = trspAgmtSeq;
		this.wgtMeasUtCd = wgtMeasUtCd;
		this.trspAgmtBdlQty = trspAgmtBdlQty;
		this.effToDt = effToDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("trsp_agmt_nod_seq", getTrspAgmtNodSeq());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("to_wgt", getToWgt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trsp_agmt_rt_tp_ser_no", getTrspAgmtRtTpSerNo());
		this.hashColumns.put("trsp_agmt_ofc_cty_cd", getTrspAgmtOfcCtyCd());
		this.hashColumns.put("trsp_rnd_rt", getTrspRndRt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("wtr_rcv_term_cd", getWtrRcvTermCd());
		this.hashColumns.put("trsp_agmt_rt_seq", getTrspAgmtRtSeq());
		this.hashColumns.put("eff_fm_dt", getEffFmDt());
		this.hashColumns.put("wtr_de_term_cd", getWtrDeTermCd());
		this.hashColumns.put("trsp_rvs_aply_flg", getTrspRvsAplyFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("trsp_agmt_eq_tp_sz_cd", getTrspAgmtEqTpSzCd());
		this.hashColumns.put("trsp_one_wy_rt", getTrspOneWyRt());
		this.hashColumns.put("eq_knd_cd", getEqKndCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("trsp_agmt_seq", getTrspAgmtSeq());
		this.hashColumns.put("wgt_meas_ut_cd", getWgtMeasUtCd());
		this.hashColumns.put("trsp_agmt_bdl_qty", getTrspAgmtBdlQty());
		this.hashColumns.put("eff_to_dt", getEffToDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("trsp_agmt_nod_seq", "trspAgmtNodSeq");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("to_wgt", "toWgt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trsp_agmt_rt_tp_ser_no", "trspAgmtRtTpSerNo");
		this.hashFields.put("trsp_agmt_ofc_cty_cd", "trspAgmtOfcCtyCd");
		this.hashFields.put("trsp_rnd_rt", "trspRndRt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("wtr_rcv_term_cd", "wtrRcvTermCd");
		this.hashFields.put("trsp_agmt_rt_seq", "trspAgmtRtSeq");
		this.hashFields.put("eff_fm_dt", "effFmDt");
		this.hashFields.put("wtr_de_term_cd", "wtrDeTermCd");
		this.hashFields.put("trsp_rvs_aply_flg", "trspRvsAplyFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("trsp_agmt_eq_tp_sz_cd", "trspAgmtEqTpSzCd");
		this.hashFields.put("trsp_one_wy_rt", "trspOneWyRt");
		this.hashFields.put("eq_knd_cd", "eqKndCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("trsp_agmt_seq", "trspAgmtSeq");
		this.hashFields.put("wgt_meas_ut_cd", "wgtMeasUtCd");
		this.hashFields.put("trsp_agmt_bdl_qty", "trspAgmtBdlQty");
		this.hashFields.put("eff_to_dt", "effToDt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return trspAgmtNodSeq
	 */
	public String getTrspAgmtNodSeq() {
		return this.trspAgmtNodSeq;
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
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}
	
	/**
	 * Column Info
	 * @return toWgt
	 */
	public String getToWgt() {
		return this.toWgt;
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
	 * @return trspAgmtRtTpSerNo
	 */
	public String getTrspAgmtRtTpSerNo() {
		return this.trspAgmtRtTpSerNo;
	}
	
	/**
	 * Column Info
	 * @return trspAgmtOfcCtyCd
	 */
	public String getTrspAgmtOfcCtyCd() {
		return this.trspAgmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return trspRndRt
	 */
	public String getTrspRndRt() {
		return this.trspRndRt;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
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
	 * @return wtrRcvTermCd
	 */
	public String getWtrRcvTermCd() {
		return this.wtrRcvTermCd;
	}
	
	/**
	 * Column Info
	 * @return trspAgmtRtSeq
	 */
	public String getTrspAgmtRtSeq() {
		return this.trspAgmtRtSeq;
	}
	
	/**
	 * Column Info
	 * @return effFmDt
	 */
	public String getEffFmDt() {
		return this.effFmDt;
	}
	
	/**
	 * Column Info
	 * @return wtrDeTermCd
	 */
	public String getWtrDeTermCd() {
		return this.wtrDeTermCd;
	}
	
	/**
	 * Column Info
	 * @return trspRvsAplyFlg
	 */
	public String getTrspRvsAplyFlg() {
		return this.trspRvsAplyFlg;
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
	 * @return trspAgmtEqTpSzCd
	 */
	public String getTrspAgmtEqTpSzCd() {
		return this.trspAgmtEqTpSzCd;
	}
	
	/**
	 * Column Info
	 * @return trspOneWyRt
	 */
	public String getTrspOneWyRt() {
		return this.trspOneWyRt;
	}
	
	/**
	 * Column Info
	 * @return eqKndCd
	 */
	public String getEqKndCd() {
		return this.eqKndCd;
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
	 * @return trspAgmtSeq
	 */
	public String getTrspAgmtSeq() {
		return this.trspAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @return wgtMeasUtCd
	 */
	public String getWgtMeasUtCd() {
		return this.wgtMeasUtCd;
	}
	
	/**
	 * Column Info
	 * @return trspAgmtBdlQty
	 */
	public String getTrspAgmtBdlQty() {
		return this.trspAgmtBdlQty;
	}
	
	/**
	 * Column Info
	 * @return effToDt
	 */
	public String getEffToDt() {
		return this.effToDt;
	}
	

	/**
	 * Column Info
	 * @param trspAgmtNodSeq
	 */
	public void setTrspAgmtNodSeq(String trspAgmtNodSeq) {
		this.trspAgmtNodSeq = trspAgmtNodSeq;
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
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}
	
	/**
	 * Column Info
	 * @param toWgt
	 */
	public void setToWgt(String toWgt) {
		this.toWgt = toWgt;
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
	 * @param trspAgmtRtTpSerNo
	 */
	public void setTrspAgmtRtTpSerNo(String trspAgmtRtTpSerNo) {
		this.trspAgmtRtTpSerNo = trspAgmtRtTpSerNo;
	}
	
	/**
	 * Column Info
	 * @param trspAgmtOfcCtyCd
	 */
	public void setTrspAgmtOfcCtyCd(String trspAgmtOfcCtyCd) {
		this.trspAgmtOfcCtyCd = trspAgmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param trspRndRt
	 */
	public void setTrspRndRt(String trspRndRt) {
		this.trspRndRt = trspRndRt;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
	 * @param wtrRcvTermCd
	 */
	public void setWtrRcvTermCd(String wtrRcvTermCd) {
		this.wtrRcvTermCd = wtrRcvTermCd;
	}
	
	/**
	 * Column Info
	 * @param trspAgmtRtSeq
	 */
	public void setTrspAgmtRtSeq(String trspAgmtRtSeq) {
		this.trspAgmtRtSeq = trspAgmtRtSeq;
	}
	
	/**
	 * Column Info
	 * @param effFmDt
	 */
	public void setEffFmDt(String effFmDt) {
		this.effFmDt = effFmDt;
	}
	
	/**
	 * Column Info
	 * @param wtrDeTermCd
	 */
	public void setWtrDeTermCd(String wtrDeTermCd) {
		this.wtrDeTermCd = wtrDeTermCd;
	}
	
	/**
	 * Column Info
	 * @param trspRvsAplyFlg
	 */
	public void setTrspRvsAplyFlg(String trspRvsAplyFlg) {
		this.trspRvsAplyFlg = trspRvsAplyFlg;
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
	 * @param trspAgmtEqTpSzCd
	 */
	public void setTrspAgmtEqTpSzCd(String trspAgmtEqTpSzCd) {
		this.trspAgmtEqTpSzCd = trspAgmtEqTpSzCd;
	}
	
	/**
	 * Column Info
	 * @param trspOneWyRt
	 */
	public void setTrspOneWyRt(String trspOneWyRt) {
		this.trspOneWyRt = trspOneWyRt;
	}
	
	/**
	 * Column Info
	 * @param eqKndCd
	 */
	public void setEqKndCd(String eqKndCd) {
		this.eqKndCd = eqKndCd;
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
	 * @param trspAgmtSeq
	 */
	public void setTrspAgmtSeq(String trspAgmtSeq) {
		this.trspAgmtSeq = trspAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @param wgtMeasUtCd
	 */
	public void setWgtMeasUtCd(String wgtMeasUtCd) {
		this.wgtMeasUtCd = wgtMeasUtCd;
	}
	
	/**
	 * Column Info
	 * @param trspAgmtBdlQty
	 */
	public void setTrspAgmtBdlQty(String trspAgmtBdlQty) {
		this.trspAgmtBdlQty = trspAgmtBdlQty;
	}
	
	/**
	 * Column Info
	 * @param effToDt
	 */
	public void setEffToDt(String effToDt) {
		this.effToDt = effToDt;
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
		setTrspAgmtNodSeq(JSPUtil.getParameter(request, prefix + "trsp_agmt_nod_seq", ""));
		setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setToWgt(JSPUtil.getParameter(request, prefix + "to_wgt", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setTrspAgmtRtTpSerNo(JSPUtil.getParameter(request, prefix + "trsp_agmt_rt_tp_ser_no", ""));
		setTrspAgmtOfcCtyCd(JSPUtil.getParameter(request, prefix + "trsp_agmt_ofc_cty_cd", ""));
		setTrspRndRt(JSPUtil.getParameter(request, prefix + "trsp_rnd_rt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setWtrRcvTermCd(JSPUtil.getParameter(request, prefix + "wtr_rcv_term_cd", ""));
		setTrspAgmtRtSeq(JSPUtil.getParameter(request, prefix + "trsp_agmt_rt_seq", ""));
		setEffFmDt(JSPUtil.getParameter(request, prefix + "eff_fm_dt", ""));
		setWtrDeTermCd(JSPUtil.getParameter(request, prefix + "wtr_de_term_cd", ""));
		setTrspRvsAplyFlg(JSPUtil.getParameter(request, prefix + "trsp_rvs_aply_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setTrspAgmtEqTpSzCd(JSPUtil.getParameter(request, prefix + "trsp_agmt_eq_tp_sz_cd", ""));
		setTrspOneWyRt(JSPUtil.getParameter(request, prefix + "trsp_one_wy_rt", ""));
		setEqKndCd(JSPUtil.getParameter(request, prefix + "eq_knd_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setTrspAgmtSeq(JSPUtil.getParameter(request, prefix + "trsp_agmt_seq", ""));
		setWgtMeasUtCd(JSPUtil.getParameter(request, prefix + "wgt_meas_ut_cd", ""));
		setTrspAgmtBdlQty(JSPUtil.getParameter(request, prefix + "trsp_agmt_bdl_qty", ""));
		setEffToDt(JSPUtil.getParameter(request, prefix + "eff_to_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsAgmtEqRtVO[]
	 */
	public TrsAgmtEqRtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsAgmtEqRtVO[]
	 */
	public TrsAgmtEqRtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsAgmtEqRtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] trspAgmtNodSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_nod_seq", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] toWgt = (JSPUtil.getParameter(request, prefix	+ "to_wgt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trspAgmtRtTpSerNo = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_rt_tp_ser_no", length));
			String[] trspAgmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_ofc_cty_cd", length));
			String[] trspRndRt = (JSPUtil.getParameter(request, prefix	+ "trsp_rnd_rt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] wtrRcvTermCd = (JSPUtil.getParameter(request, prefix	+ "wtr_rcv_term_cd", length));
			String[] trspAgmtRtSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_rt_seq", length));
			String[] effFmDt = (JSPUtil.getParameter(request, prefix	+ "eff_fm_dt", length));
			String[] wtrDeTermCd = (JSPUtil.getParameter(request, prefix	+ "wtr_de_term_cd", length));
			String[] trspRvsAplyFlg = (JSPUtil.getParameter(request, prefix	+ "trsp_rvs_aply_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] trspAgmtEqTpSzCd = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_eq_tp_sz_cd", length));
			String[] trspOneWyRt = (JSPUtil.getParameter(request, prefix	+ "trsp_one_wy_rt", length));
			String[] eqKndCd = (JSPUtil.getParameter(request, prefix	+ "eq_knd_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] trspAgmtSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_seq", length));
			String[] wgtMeasUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_meas_ut_cd", length));
			String[] trspAgmtBdlQty = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_bdl_qty", length));
			String[] effToDt = (JSPUtil.getParameter(request, prefix	+ "eff_to_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsAgmtEqRtVO();
				if (trspAgmtNodSeq[i] != null)
					model.setTrspAgmtNodSeq(trspAgmtNodSeq[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (toWgt[i] != null)
					model.setToWgt(toWgt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trspAgmtRtTpSerNo[i] != null)
					model.setTrspAgmtRtTpSerNo(trspAgmtRtTpSerNo[i]);
				if (trspAgmtOfcCtyCd[i] != null)
					model.setTrspAgmtOfcCtyCd(trspAgmtOfcCtyCd[i]);
				if (trspRndRt[i] != null)
					model.setTrspRndRt(trspRndRt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (wtrRcvTermCd[i] != null)
					model.setWtrRcvTermCd(wtrRcvTermCd[i]);
				if (trspAgmtRtSeq[i] != null)
					model.setTrspAgmtRtSeq(trspAgmtRtSeq[i]);
				if (effFmDt[i] != null)
					model.setEffFmDt(effFmDt[i]);
				if (wtrDeTermCd[i] != null)
					model.setWtrDeTermCd(wtrDeTermCd[i]);
				if (trspRvsAplyFlg[i] != null)
					model.setTrspRvsAplyFlg(trspRvsAplyFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (trspAgmtEqTpSzCd[i] != null)
					model.setTrspAgmtEqTpSzCd(trspAgmtEqTpSzCd[i]);
				if (trspOneWyRt[i] != null)
					model.setTrspOneWyRt(trspOneWyRt[i]);
				if (eqKndCd[i] != null)
					model.setEqKndCd(eqKndCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (trspAgmtSeq[i] != null)
					model.setTrspAgmtSeq(trspAgmtSeq[i]);
				if (wgtMeasUtCd[i] != null)
					model.setWgtMeasUtCd(wgtMeasUtCd[i]);
				if (trspAgmtBdlQty[i] != null)
					model.setTrspAgmtBdlQty(trspAgmtBdlQty[i]);
				if (effToDt[i] != null)
					model.setEffToDt(effToDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsAgmtEqRtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsAgmtEqRtVO[]
	 */
	public TrsAgmtEqRtVO[] getTrsAgmtEqRtVOs(){
		TrsAgmtEqRtVO[] vos = (TrsAgmtEqRtVO[])models.toArray(new TrsAgmtEqRtVO[models.size()]);
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
		this.trspAgmtNodSeq = this.trspAgmtNodSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toWgt = this.toWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtRtTpSerNo = this.trspAgmtRtTpSerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtOfcCtyCd = this.trspAgmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspRndRt = this.trspRndRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wtrRcvTermCd = this.wtrRcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtRtSeq = this.trspAgmtRtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effFmDt = this.effFmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wtrDeTermCd = this.wtrDeTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspRvsAplyFlg = this.trspRvsAplyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtEqTpSzCd = this.trspAgmtEqTpSzCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspOneWyRt = this.trspOneWyRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqKndCd = this.eqKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtSeq = this.trspAgmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtMeasUtCd = this.wgtMeasUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtBdlQty = this.trspAgmtBdlQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effToDt = this.effToDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
