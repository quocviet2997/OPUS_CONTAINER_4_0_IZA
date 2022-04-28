/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TrsTrspAgmtEqRtVO.java
*@FileTitle : TrsTrspAgmtEqRtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.05
*@LastModifier : 양봉준
*@LastVersion : 1.0
* 2009.07.05 양봉준 
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
 * @author 양봉준
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TrsTrspAgmtEqRtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsTrspAgmtEqRtVO> models = new ArrayList<TrsTrspAgmtEqRtVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String oneWyCurrCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String trspOneWyRt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trspAgmtOfcCtyCd = null;
	/* Column Info */
	private String trspAgmtRtTpSerNo = null;
	/* Column Info */
	private String trspAgmtPairSeq = null;
	/* Column Info */
	private String trspRndRt = null;
	/* Column Info */
	private String trspAgmtEqSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String hjlNo = null;
	/* Column Info */
	private String trspAgmtSeq = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String effFmDt = null;
	/* Column Info */
	private String effToDt = null;
	/* Column Info */
	private String rndCurrCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String trspAgmtDistSeq = null;
	/* Column Info */
	private String agmtTpszStsCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TrsTrspAgmtEqRtVO() {}

	public TrsTrspAgmtEqRtVO(String ibflag, String pagerows, String trspAgmtOfcCtyCd, String trspAgmtSeq, String trspAgmtRtTpSerNo, String trspAgmtEqSeq, String trspAgmtPairSeq, String trspAgmtDistSeq, String agmtTpszStsCd, String effFmDt, String effToDt, String oneWyCurrCd, String rndCurrCd, String trspOneWyRt, String trspRndRt, String creOfcCd, String deltFlg, String hjlNo, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.oneWyCurrCd = oneWyCurrCd;
		this.deltFlg = deltFlg;
		this.trspOneWyRt = trspOneWyRt;
		this.creDt = creDt;
		this.trspAgmtOfcCtyCd = trspAgmtOfcCtyCd;
		this.trspAgmtRtTpSerNo = trspAgmtRtTpSerNo;
		this.trspAgmtPairSeq = trspAgmtPairSeq;
		this.trspRndRt = trspRndRt;
		this.trspAgmtEqSeq = trspAgmtEqSeq;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.hjlNo = hjlNo;
		this.trspAgmtSeq = trspAgmtSeq;
		this.creOfcCd = creOfcCd;
		this.effFmDt = effFmDt;
		this.effToDt = effToDt;
		this.rndCurrCd = rndCurrCd;
		this.updUsrId = updUsrId;
		this.trspAgmtDistSeq = trspAgmtDistSeq;
		this.agmtTpszStsCd = agmtTpszStsCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("one_wy_curr_cd", getOneWyCurrCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("trsp_one_wy_rt", getTrspOneWyRt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trsp_agmt_ofc_cty_cd", getTrspAgmtOfcCtyCd());
		this.hashColumns.put("trsp_agmt_rt_tp_ser_no", getTrspAgmtRtTpSerNo());
		this.hashColumns.put("trsp_agmt_pair_seq", getTrspAgmtPairSeq());
		this.hashColumns.put("trsp_rnd_rt", getTrspRndRt());
		this.hashColumns.put("trsp_agmt_eq_seq", getTrspAgmtEqSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("hjl_no", getHjlNo());
		this.hashColumns.put("trsp_agmt_seq", getTrspAgmtSeq());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("eff_fm_dt", getEffFmDt());
		this.hashColumns.put("eff_to_dt", getEffToDt());
		this.hashColumns.put("rnd_curr_cd", getRndCurrCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("trsp_agmt_dist_seq", getTrspAgmtDistSeq());
		this.hashColumns.put("agmt_tpsz_sts_cd", getAgmtTpszStsCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("one_wy_curr_cd", "oneWyCurrCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("trsp_one_wy_rt", "trspOneWyRt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trsp_agmt_ofc_cty_cd", "trspAgmtOfcCtyCd");
		this.hashFields.put("trsp_agmt_rt_tp_ser_no", "trspAgmtRtTpSerNo");
		this.hashFields.put("trsp_agmt_pair_seq", "trspAgmtPairSeq");
		this.hashFields.put("trsp_rnd_rt", "trspRndRt");
		this.hashFields.put("trsp_agmt_eq_seq", "trspAgmtEqSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("hjl_no", "hjlNo");
		this.hashFields.put("trsp_agmt_seq", "trspAgmtSeq");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("eff_fm_dt", "effFmDt");
		this.hashFields.put("eff_to_dt", "effToDt");
		this.hashFields.put("rnd_curr_cd", "rndCurrCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("trsp_agmt_dist_seq", "trspAgmtDistSeq");
		this.hashFields.put("agmt_tpsz_sts_cd", "agmtTpszStsCd");
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
	 * @return oneWyCurrCd
	 */
	public String getOneWyCurrCd() {
		return this.oneWyCurrCd;
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
	 * @return trspOneWyRt
	 */
	public String getTrspOneWyRt() {
		return this.trspOneWyRt;
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
	 * @return trspAgmtOfcCtyCd
	 */
	public String getTrspAgmtOfcCtyCd() {
		return this.trspAgmtOfcCtyCd;
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
	 * @return trspAgmtPairSeq
	 */
	public String getTrspAgmtPairSeq() {
		return this.trspAgmtPairSeq;
	}
	
	/**
	 * Column Info
	 * @return trspRndRt
	 */
	public String getTrspRndRt() {
		return this.trspRndRt;
	}
	
	/**
	 * Column Info
	 * @return trspAgmtEqSeq
	 */
	public String getTrspAgmtEqSeq() {
		return this.trspAgmtEqSeq;
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
	 * @return hjlNo
	 */
	public String getHjlNo() {
		return this.hjlNo;
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
	 * @return creOfcCd
	 */
	public String getCreOfcCd() {
		return this.creOfcCd;
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
	 * @return effToDt
	 */
	public String getEffToDt() {
		return this.effToDt;
	}
	
	/**
	 * Column Info
	 * @return rndCurrCd
	 */
	public String getRndCurrCd() {
		return this.rndCurrCd;
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
	 * @return trspAgmtDistSeq
	 */
	public String getTrspAgmtDistSeq() {
		return this.trspAgmtDistSeq;
	}
	
	/**
	 * Column Info
	 * @return agmtTpszStsCd
	 */
	public String getAgmtTpszStsCd() {
		return this.agmtTpszStsCd;
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
	 * @param oneWyCurrCd
	 */
	public void setOneWyCurrCd(String oneWyCurrCd) {
		this.oneWyCurrCd = oneWyCurrCd;
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
	 * @param trspOneWyRt
	 */
	public void setTrspOneWyRt(String trspOneWyRt) {
		this.trspOneWyRt = trspOneWyRt;
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
	 * @param trspAgmtOfcCtyCd
	 */
	public void setTrspAgmtOfcCtyCd(String trspAgmtOfcCtyCd) {
		this.trspAgmtOfcCtyCd = trspAgmtOfcCtyCd;
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
	 * @param trspAgmtPairSeq
	 */
	public void setTrspAgmtPairSeq(String trspAgmtPairSeq) {
		this.trspAgmtPairSeq = trspAgmtPairSeq;
	}
	
	/**
	 * Column Info
	 * @param trspRndRt
	 */
	public void setTrspRndRt(String trspRndRt) {
		this.trspRndRt = trspRndRt;
	}
	
	/**
	 * Column Info
	 * @param trspAgmtEqSeq
	 */
	public void setTrspAgmtEqSeq(String trspAgmtEqSeq) {
		this.trspAgmtEqSeq = trspAgmtEqSeq;
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
	 * @param hjlNo
	 */
	public void setHjlNo(String hjlNo) {
		this.hjlNo = hjlNo;
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
	 * @param creOfcCd
	 */
	public void setCreOfcCd(String creOfcCd) {
		this.creOfcCd = creOfcCd;
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
	 * @param effToDt
	 */
	public void setEffToDt(String effToDt) {
		this.effToDt = effToDt;
	}
	
	/**
	 * Column Info
	 * @param rndCurrCd
	 */
	public void setRndCurrCd(String rndCurrCd) {
		this.rndCurrCd = rndCurrCd;
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
	 * @param trspAgmtDistSeq
	 */
	public void setTrspAgmtDistSeq(String trspAgmtDistSeq) {
		this.trspAgmtDistSeq = trspAgmtDistSeq;
	}
	
	/**
	 * Column Info
	 * @param agmtTpszStsCd
	 */
	public void setAgmtTpszStsCd(String agmtTpszStsCd) {
		this.agmtTpszStsCd = agmtTpszStsCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setOneWyCurrCd(JSPUtil.getParameter(request, "one_wy_curr_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setTrspOneWyRt(JSPUtil.getParameter(request, "trsp_one_wy_rt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrspAgmtOfcCtyCd(JSPUtil.getParameter(request, "trsp_agmt_ofc_cty_cd", ""));
		setTrspAgmtRtTpSerNo(JSPUtil.getParameter(request, "trsp_agmt_rt_tp_ser_no", ""));
		setTrspAgmtPairSeq(JSPUtil.getParameter(request, "trsp_agmt_pair_seq", ""));
		setTrspRndRt(JSPUtil.getParameter(request, "trsp_rnd_rt", ""));
		setTrspAgmtEqSeq(JSPUtil.getParameter(request, "trsp_agmt_eq_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setHjlNo(JSPUtil.getParameter(request, "hjl_no", ""));
		setTrspAgmtSeq(JSPUtil.getParameter(request, "trsp_agmt_seq", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setEffFmDt(JSPUtil.getParameter(request, "eff_fm_dt", ""));
		setEffToDt(JSPUtil.getParameter(request, "eff_to_dt", ""));
		setRndCurrCd(JSPUtil.getParameter(request, "rnd_curr_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setTrspAgmtDistSeq(JSPUtil.getParameter(request, "trsp_agmt_dist_seq", ""));
		setAgmtTpszStsCd(JSPUtil.getParameter(request, "agmt_tpsz_sts_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsTrspAgmtEqRtVO[]
	 */
	public TrsTrspAgmtEqRtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsTrspAgmtEqRtVO[]
	 */
	public TrsTrspAgmtEqRtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspAgmtEqRtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] oneWyCurrCd = (JSPUtil.getParameter(request, prefix	+ "one_wy_curr_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] trspOneWyRt = (JSPUtil.getParameter(request, prefix	+ "trsp_one_wy_rt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trspAgmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_ofc_cty_cd", length));
			String[] trspAgmtRtTpSerNo = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_rt_tp_ser_no", length));
			String[] trspAgmtPairSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_pair_seq", length));
			String[] trspRndRt = (JSPUtil.getParameter(request, prefix	+ "trsp_rnd_rt", length));
			String[] trspAgmtEqSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_eq_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] hjlNo = (JSPUtil.getParameter(request, prefix	+ "hjl_no", length));
			String[] trspAgmtSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_seq", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] effFmDt = (JSPUtil.getParameter(request, prefix	+ "eff_fm_dt", length));
			String[] effToDt = (JSPUtil.getParameter(request, prefix	+ "eff_to_dt", length));
			String[] rndCurrCd = (JSPUtil.getParameter(request, prefix	+ "rnd_curr_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] trspAgmtDistSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_dist_seq", length));
			String[] agmtTpszStsCd = (JSPUtil.getParameter(request, prefix	+ "agmt_tpsz_sts_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsTrspAgmtEqRtVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (oneWyCurrCd[i] != null)
					model.setOneWyCurrCd(oneWyCurrCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (trspOneWyRt[i] != null)
					model.setTrspOneWyRt(trspOneWyRt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trspAgmtOfcCtyCd[i] != null)
					model.setTrspAgmtOfcCtyCd(trspAgmtOfcCtyCd[i]);
				if (trspAgmtRtTpSerNo[i] != null)
					model.setTrspAgmtRtTpSerNo(trspAgmtRtTpSerNo[i]);
				if (trspAgmtPairSeq[i] != null)
					model.setTrspAgmtPairSeq(trspAgmtPairSeq[i]);
				if (trspRndRt[i] != null)
					model.setTrspRndRt(trspRndRt[i]);
				if (trspAgmtEqSeq[i] != null)
					model.setTrspAgmtEqSeq(trspAgmtEqSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (hjlNo[i] != null)
					model.setHjlNo(hjlNo[i]);
				if (trspAgmtSeq[i] != null)
					model.setTrspAgmtSeq(trspAgmtSeq[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (effFmDt[i] != null)
					model.setEffFmDt(effFmDt[i]);
				if (effToDt[i] != null)
					model.setEffToDt(effToDt[i]);
				if (rndCurrCd[i] != null)
					model.setRndCurrCd(rndCurrCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (trspAgmtDistSeq[i] != null)
					model.setTrspAgmtDistSeq(trspAgmtDistSeq[i]);
				if (agmtTpszStsCd[i] != null)
					model.setAgmtTpszStsCd(agmtTpszStsCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsTrspAgmtEqRtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsTrspAgmtEqRtVO[]
	 */
	public TrsTrspAgmtEqRtVO[] getTrsTrspAgmtEqRtVOs(){
		TrsTrspAgmtEqRtVO[] vos = (TrsTrspAgmtEqRtVO[])models.toArray(new TrsTrspAgmtEqRtVO[models.size()]);
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
		this.oneWyCurrCd = this.oneWyCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspOneWyRt = this.trspOneWyRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtOfcCtyCd = this.trspAgmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtRtTpSerNo = this.trspAgmtRtTpSerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtPairSeq = this.trspAgmtPairSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspRndRt = this.trspRndRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtEqSeq = this.trspAgmtEqSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlNo = this.hjlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtSeq = this.trspAgmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effFmDt = this.effFmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effToDt = this.effToDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rndCurrCd = this.rndCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtDistSeq = this.trspAgmtDistSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtTpszStsCd = this.agmtTpszStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
