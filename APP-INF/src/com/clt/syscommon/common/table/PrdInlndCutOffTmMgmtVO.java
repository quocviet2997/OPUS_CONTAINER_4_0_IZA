/*=========================================================
 *Copyright(c) 2015 CyberLogitec
 *@FileName : PrdInlndCutOffTmMgmtVO.java
 *@FileTitle : PrdInlndCutOffTmMgmtVO
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2015.12.30
 *@LastModifier : 
 *@LastVersion : 1.0
 * 2015.12.30  
 * 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

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

public class PrdInlndCutOffTmMgmtVO extends AbstractValueObject {
	private static final long serialVersionUID = 1L;
	private Collection<PrdInlndCutOffTmMgmtVO> models = new ArrayList<PrdInlndCutOffTmMgmtVO>();

	/* Column Info */
	private String laneCd = null;
	/* Column Info */
	private String avalDyCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String avalWkNo = null;
	/* Column Info */
	private String friStFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String tueStFlg = null;
	/* Column Info */
	private String edwUpdDt = null;
	/* Column Info */
	private String destYdCd = null;
	/* Column Info */
	private String sunStFlg = null;
	/* Column Info */
	private String spclCgoCntrTpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cgoClzHrmnt = null;
	/* Column Info */
	private String effFmDt = null;
	/* Column Info */
	private String satStFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String cctDyCd = null;
	/* Column Info */
	private String wedStFlg = null;
	/* Column Info */
	private String inlndCctTpCd = null;
	/* Column Info */
	private String avalHrmnt = null;
	/* Column Info */
	private String orgYdCd = null;
	/* Column Info */
	private String inlndTrspWkItvalNo = null;
	/* Column Info */
	private String inlndTrspFreqCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String thuStFlg = null;
	/* Column Info */
	private String monStFlg = null;
	/* Column Info */
	private String effToDt = null;
	/* Column Info */
	private String prioSeq = null;
	/* Column Info */
	private String orgEffFmDt = null;
	/* Column Info */
	private String orgEffToDt = null;

	/* 테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/* 테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();

	public PrdInlndCutOffTmMgmtVO() {
	}

	public PrdInlndCutOffTmMgmtVO(String ibflag, String pagerows, String laneCd, String orgYdCd, String destYdCd, String spclCgoCntrTpCd, String effFmDt, String effToDt, String inlndCctTpCd,
			String cctDyCd, String cgoClzHrmnt, String avalWkNo, String avalDyCd, String avalHrmnt, String inlndTrspFreqCd, String inlndTrspWkItvalNo, String sunStFlg, String monStFlg,
			String tueStFlg, String wedStFlg, String thuStFlg, String friStFlg, String satStFlg, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt, String edwUpdDt,
			String prioSeq) {
		this.laneCd = laneCd;
		this.avalDyCd = avalDyCd;
		this.deltFlg = deltFlg;
		this.avalWkNo = avalWkNo;
		this.friStFlg = friStFlg;
		this.creDt = creDt;
		this.tueStFlg = tueStFlg;
		this.edwUpdDt = edwUpdDt;
		this.destYdCd = destYdCd;
		this.sunStFlg = sunStFlg;
		this.spclCgoCntrTpCd = spclCgoCntrTpCd;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.cgoClzHrmnt = cgoClzHrmnt;
		this.effFmDt = effFmDt;
		this.satStFlg = satStFlg;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.cctDyCd = cctDyCd;
		this.wedStFlg = wedStFlg;
		this.inlndCctTpCd = inlndCctTpCd;
		this.avalHrmnt = avalHrmnt;
		this.orgYdCd = orgYdCd;
		this.inlndTrspWkItvalNo = inlndTrspWkItvalNo;
		this.inlndTrspFreqCd = inlndTrspFreqCd;
		this.creUsrId = creUsrId;
		this.thuStFlg = thuStFlg;
		this.monStFlg = monStFlg;
		this.effToDt = effToDt;
		this.prioSeq = prioSeq;
	}

	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * 
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues() {
		this.hashColumns.put("lane_cd", getLaneCd());
		this.hashColumns.put("aval_dy_cd", getAvalDyCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("aval_wk_no", getAvalWkNo());
		this.hashColumns.put("fri_st_flg", getFriStFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("tue_st_flg", getTueStFlg());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("dest_yd_cd", getDestYdCd());
		this.hashColumns.put("sun_st_flg", getSunStFlg());
		this.hashColumns.put("spcl_cgo_cntr_tp_cd", getSpclCgoCntrTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cgo_clz_hrmnt", getCgoClzHrmnt());
		this.hashColumns.put("eff_fm_dt", getEffFmDt());
		this.hashColumns.put("sat_st_flg", getSatStFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cct_dy_cd", getCctDyCd());
		this.hashColumns.put("wed_st_flg", getWedStFlg());
		this.hashColumns.put("inlnd_cct_tp_cd", getInlndCctTpCd());
		this.hashColumns.put("aval_hrmnt", getAvalHrmnt());
		this.hashColumns.put("org_yd_cd", getOrgYdCd());
		this.hashColumns.put("inlnd_trsp_wk_itval_no", getInlndTrspWkItvalNo());
		this.hashColumns.put("inlnd_trsp_freq_cd", getInlndTrspFreqCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("thu_st_flg", getThuStFlg());
		this.hashColumns.put("mon_st_flg", getMonStFlg());
		this.hashColumns.put("eff_to_dt", getEffToDt());
		this.hashColumns.put("prio_seq", getPrioSeq());
		this.hashColumns.put("org_eff_fm_dt", getOrgEffFmDt());
		this.hashColumns.put("org_eff_to_dt", getOrgEffToDt());
		return this.hashColumns;
	}

	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환
	 * 
	 * @return
	 */
	public HashMap<String, String> getFieldNames() {
		this.hashFields.put("lane_cd", "laneCd");
		this.hashFields.put("aval_dy_cd", "avalDyCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("aval_wk_no", "avalWkNo");
		this.hashFields.put("fri_st_flg", "friStFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("tue_st_flg", "tueStFlg");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("dest_yd_cd", "destYdCd");
		this.hashFields.put("sun_st_flg", "sunStFlg");
		this.hashFields.put("spcl_cgo_cntr_tp_cd", "spclCgoCntrTpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cgo_clz_hrmnt", "cgoClzHrmnt");
		this.hashFields.put("eff_fm_dt", "effFmDt");
		this.hashFields.put("sat_st_flg", "satStFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cct_dy_cd", "cctDyCd");
		this.hashFields.put("wed_st_flg", "wedStFlg");
		this.hashFields.put("inlnd_cct_tp_cd", "inlndCctTpCd");
		this.hashFields.put("aval_hrmnt", "avalHrmnt");
		this.hashFields.put("org_yd_cd", "orgYdCd");
		this.hashFields.put("inlnd_trsp_wk_itval_no", "inlndTrspWkItvalNo");
		this.hashFields.put("inlnd_trsp_freq_cd", "inlndTrspFreqCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("thu_st_flg", "thuStFlg");
		this.hashFields.put("mon_st_flg", "monStFlg");
		this.hashFields.put("eff_to_dt", "effToDt");
		this.hashFields.put("prio_seq", "prioSeq");
		this.hashFields.put("org_eff_fm_dt", "orgEffFmDt");
		this.hashFields.put("org_eff_to_dt", "orgEffToDt");
		return this.hashFields;
	}

	/**
	 * Column Info
	 * 
	 * @return laneCd
	 */
	public String getLaneCd() {
		return this.laneCd;
	}

	/**
	 * Column Info
	 * 
	 * @return avalDyCd
	 */
	public String getAvalDyCd() {
		return this.avalDyCd;
	}

	/**
	 * Column Info
	 * 
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}

	/**
	 * Column Info
	 * 
	 * @return avalWkNo
	 */
	public String getAvalWkNo() {
		return this.avalWkNo;
	}

	/**
	 * Column Info
	 * 
	 * @return friStFlg
	 */
	public String getFriStFlg() {
		return this.friStFlg;
	}

	/**
	 * Column Info
	 * 
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}

	/**
	 * Column Info
	 * 
	 * @return tueStFlg
	 */
	public String getTueStFlg() {
		return this.tueStFlg;
	}

	/**
	 * Column Info
	 * 
	 * @return edwUpdDt
	 */
	public String getEdwUpdDt() {
		return this.edwUpdDt;
	}

	/**
	 * Column Info
	 * 
	 * @return destYdCd
	 */
	public String getDestYdCd() {
		return this.destYdCd;
	}

	/**
	 * Column Info
	 * 
	 * @return sunStFlg
	 */
	public String getSunStFlg() {
		return this.sunStFlg;
	}

	/**
	 * Column Info
	 * 
	 * @return spclCgoCntrTpCd
	 */
	public String getSpclCgoCntrTpCd() {
		return this.spclCgoCntrTpCd;
	}

	/**
	 * Page Number
	 * 
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}

	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * 
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}

	/**
	 * Column Info
	 * 
	 * @return cgoClzHrmnt
	 */
	public String getCgoClzHrmnt() {
		return this.cgoClzHrmnt;
	}

	/**
	 * Column Info
	 * 
	 * @return effFmDt
	 */
	public String getEffFmDt() {
		return this.effFmDt;
	}

	/**
	 * Column Info
	 * 
	 * @return satStFlg
	 */
	public String getSatStFlg() {
		return this.satStFlg;
	}

	/**
	 * Column Info
	 * 
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}

	/**
	 * Column Info
	 * 
	 * @return cctDyCd
	 */
	public String getCctDyCd() {
		return this.cctDyCd;
	}

	/**
	 * Column Info
	 * 
	 * @return wedStFlg
	 */
	public String getWedStFlg() {
		return this.wedStFlg;
	}

	/**
	 * Column Info
	 * 
	 * @return inlndCctTpCd
	 */
	public String getInlndCctTpCd() {
		return this.inlndCctTpCd;
	}

	/**
	 * Column Info
	 * 
	 * @return avalHrmnt
	 */
	public String getAvalHrmnt() {
		return this.avalHrmnt;
	}

	/**
	 * Column Info
	 * 
	 * @return orgYdCd
	 */
	public String getOrgYdCd() {
		return this.orgYdCd;
	}

	/**
	 * Column Info
	 * 
	 * @return inlndTrspWkItvalNo
	 */
	public String getInlndTrspWkItvalNo() {
		return this.inlndTrspWkItvalNo;
	}

	/**
	 * Column Info
	 * 
	 * @return inlndTrspFreqCd
	 */
	public String getInlndTrspFreqCd() {
		return this.inlndTrspFreqCd;
	}

	/**
	 * Column Info
	 * 
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @return thuStFlg
	 */
	public String getThuStFlg() {
		return this.thuStFlg;
	}

	/**
	 * Column Info
	 * 
	 * @return monStFlg
	 */
	public String getMonStFlg() {
		return this.monStFlg;
	}

	/**
	 * Column Info
	 * 
	 * @return effToDt
	 */
	public String getEffToDt() {
		return this.effToDt;
	}

	/**
	 * Column Info
	 * 
	 * @return prioSeq
	 */
	public String getPrioSeq() {
		return this.prioSeq;
	}

	/**
	 * Column Info
	 * 
	 * @param laneCd
	 */
	public void setLaneCd(String laneCd) {
		this.laneCd = laneCd;
	}

	/**
	 * Column Info
	 * 
	 * @param avalDyCd
	 */
	public void setAvalDyCd(String avalDyCd) {
		this.avalDyCd = avalDyCd;
	}

	/**
	 * Column Info
	 * 
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}

	/**
	 * Column Info
	 * 
	 * @param avalWkNo
	 */
	public void setAvalWkNo(String avalWkNo) {
		this.avalWkNo = avalWkNo;
	}

	/**
	 * Column Info
	 * 
	 * @param friStFlg
	 */
	public void setFriStFlg(String friStFlg) {
		this.friStFlg = friStFlg;
	}

	/**
	 * Column Info
	 * 
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}

	/**
	 * Column Info
	 * 
	 * @param tueStFlg
	 */
	public void setTueStFlg(String tueStFlg) {
		this.tueStFlg = tueStFlg;
	}

	/**
	 * Column Info
	 * 
	 * @param edwUpdDt
	 */
	public void setEdwUpdDt(String edwUpdDt) {
		this.edwUpdDt = edwUpdDt;
	}

	/**
	 * Column Info
	 * 
	 * @param destYdCd
	 */
	public void setDestYdCd(String destYdCd) {
		this.destYdCd = destYdCd;
	}

	/**
	 * Column Info
	 * 
	 * @param sunStFlg
	 */
	public void setSunStFlg(String sunStFlg) {
		this.sunStFlg = sunStFlg;
	}

	/**
	 * Column Info
	 * 
	 * @param spclCgoCntrTpCd
	 */
	public void setSpclCgoCntrTpCd(String spclCgoCntrTpCd) {
		this.spclCgoCntrTpCd = spclCgoCntrTpCd;
	}

	/**
	 * Page Number
	 * 
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}

	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * 
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}

	/**
	 * Column Info
	 * 
	 * @param cgoClzHrmnt
	 */
	public void setCgoClzHrmnt(String cgoClzHrmnt) {
		this.cgoClzHrmnt = cgoClzHrmnt;
	}

	/**
	 * Column Info
	 * 
	 * @param effFmDt
	 */
	public void setEffFmDt(String effFmDt) {
		this.effFmDt = effFmDt;
	}

	/**
	 * Column Info
	 * 
	 * @param satStFlg
	 */
	public void setSatStFlg(String satStFlg) {
		this.satStFlg = satStFlg;
	}

	/**
	 * Column Info
	 * 
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}

	/**
	 * Column Info
	 * 
	 * @param cctDyCd
	 */
	public void setCctDyCd(String cctDyCd) {
		this.cctDyCd = cctDyCd;
	}

	/**
	 * Column Info
	 * 
	 * @param wedStFlg
	 */
	public void setWedStFlg(String wedStFlg) {
		this.wedStFlg = wedStFlg;
	}

	/**
	 * Column Info
	 * 
	 * @param inlndCctTpCd
	 */
	public void setInlndCctTpCd(String inlndCctTpCd) {
		this.inlndCctTpCd = inlndCctTpCd;
	}

	/**
	 * Column Info
	 * 
	 * @param avalHrmnt
	 */
	public void setAvalHrmnt(String avalHrmnt) {
		this.avalHrmnt = avalHrmnt;
	}

	/**
	 * Column Info
	 * 
	 * @param orgYdCd
	 */
	public void setOrgYdCd(String orgYdCd) {
		this.orgYdCd = orgYdCd;
	}

	/**
	 * Column Info
	 * 
	 * @param inlndTrspWkItvalNo
	 */
	public void setInlndTrspWkItvalNo(String inlndTrspWkItvalNo) {
		this.inlndTrspWkItvalNo = inlndTrspWkItvalNo;
	}

	/**
	 * Column Info
	 * 
	 * @param inlndTrspFreqCd
	 */
	public void setInlndTrspFreqCd(String inlndTrspFreqCd) {
		this.inlndTrspFreqCd = inlndTrspFreqCd;
	}

	/**
	 * Column Info
	 * 
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @param thuStFlg
	 */
	public void setThuStFlg(String thuStFlg) {
		this.thuStFlg = thuStFlg;
	}

	/**
	 * Column Info
	 * 
	 * @param monStFlg
	 */
	public void setMonStFlg(String monStFlg) {
		this.monStFlg = monStFlg;
	}

	/**
	 * Column Info
	 * 
	 * @param effToDt
	 */
	public void setEffToDt(String effToDt) {
		this.effToDt = effToDt;
	}

	/**
	 * Column Info
	 * 
	 * @param prioSeq
	 */
	public void setPrioSeq(String prioSeq) {
		this.prioSeq = prioSeq;
	}

	/**
	 * 
	 * @return
	 */
	public String getOrgEffFmDt() {
		return orgEffFmDt;
	}

	/**
	 * 
	 * @param orgEffFmDt
	 */
	public void setOrgEffFmDt(String orgEffFmDt) {
		this.orgEffFmDt = orgEffFmDt;
	}

	/**
	 * 
	 * @return
	 */
	public String getOrgEffToDt() {
		return orgEffToDt;
	}

	/**
	 * 
	 * @param orgEffToDt
	 */
	public void setOrgEffToDt(String orgEffToDt) {
		this.orgEffToDt = orgEffToDt;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * 
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		fromRequest(request, "");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * 
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setLaneCd(JSPUtil.getParameter(request, prefix + "lane_cd", ""));
		setAvalDyCd(JSPUtil.getParameter(request, prefix + "aval_dy_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setAvalWkNo(JSPUtil.getParameter(request, prefix + "aval_wk_no", ""));
		setFriStFlg(JSPUtil.getParameter(request, prefix + "fri_st_flg", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setTueStFlg(JSPUtil.getParameter(request, prefix + "tue_st_flg", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setDestYdCd(JSPUtil.getParameter(request, prefix + "dest_yd_cd", ""));
		setSunStFlg(JSPUtil.getParameter(request, prefix + "sun_st_flg", ""));
		setSpclCgoCntrTpCd(JSPUtil.getParameter(request, prefix + "spcl_cgo_cntr_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCgoClzHrmnt(JSPUtil.getParameter(request, prefix + "cgo_clz_hrmnt", ""));
		setEffFmDt(JSPUtil.getParameter(request, prefix + "eff_fm_dt", ""));
		setSatStFlg(JSPUtil.getParameter(request, prefix + "sat_st_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setCctDyCd(JSPUtil.getParameter(request, prefix + "cct_dy_cd", ""));
		setWedStFlg(JSPUtil.getParameter(request, prefix + "wed_st_flg", ""));
		setInlndCctTpCd(JSPUtil.getParameter(request, prefix + "inlnd_cct_tp_cd", ""));
		setAvalHrmnt(JSPUtil.getParameter(request, prefix + "aval_hrmnt", ""));
		setOrgYdCd(JSPUtil.getParameter(request, prefix + "org_yd_cd", ""));
		setInlndTrspWkItvalNo(JSPUtil.getParameter(request, prefix + "inlnd_trsp_wk_itval_no", ""));
		setInlndTrspFreqCd(JSPUtil.getParameter(request, prefix + "inlnd_trsp_freq_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setThuStFlg(JSPUtil.getParameter(request, prefix + "thu_st_flg", ""));
		setMonStFlg(JSPUtil.getParameter(request, prefix + "mon_st_flg", ""));
		setEffToDt(JSPUtil.getParameter(request, prefix + "eff_to_dt", ""));
		setPrioSeq(JSPUtil.getParameter(request, prefix + "prio_seq", ""));
		setOrgEffFmDt(JSPUtil.getParameter(request, prefix + "org_eff_fm_dt", ""));
		setOrgEffToDt(JSPUtil.getParameter(request, prefix + "org_eff_to_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * 
	 * @param request
	 * @return PrdInlndCutOffTmMgmtVO[]
	 */
	public PrdInlndCutOffTmMgmtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다.
	 * 
	 * @param request
	 * @param prefix
	 * @return PrdInlndCutOffTmMgmtVO[]
	 */
	public PrdInlndCutOffTmMgmtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PrdInlndCutOffTmMgmtVO model = null;

		String[] tmp = request.getParameterValues(prefix + "ibflag");
		if (tmp == null)
			return null;

		int length = request.getParameterValues(prefix + "ibflag").length;

		try {
			String[] laneCd = (JSPUtil.getParameter(request, prefix + "lane_cd", length));
			String[] avalDyCd = (JSPUtil.getParameter(request, prefix + "aval_dy_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix + "delt_flg", length));
			String[] avalWkNo = (JSPUtil.getParameter(request, prefix + "aval_wk_no", length));
			String[] friStFlg = (JSPUtil.getParameter(request, prefix + "fri_st_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
			String[] tueStFlg = (JSPUtil.getParameter(request, prefix + "tue_st_flg", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix + "edw_upd_dt", length));
			String[] destYdCd = (JSPUtil.getParameter(request, prefix + "dest_yd_cd", length));
			String[] sunStFlg = (JSPUtil.getParameter(request, prefix + "sun_st_flg", length));
			String[] spclCgoCntrTpCd = (JSPUtil.getParameter(request, prefix + "spcl_cgo_cntr_tp_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
			String[] cgoClzHrmnt = (JSPUtil.getParameter(request, prefix + "cgo_clz_hrmnt", length));
			String[] effFmDt = (JSPUtil.getParameter(request, prefix + "eff_fm_dt", length));
			String[] satStFlg = (JSPUtil.getParameter(request, prefix + "sat_st_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
			String[] cctDyCd = (JSPUtil.getParameter(request, prefix + "cct_dy_cd", length));
			String[] wedStFlg = (JSPUtil.getParameter(request, prefix + "wed_st_flg", length));
			String[] inlndCctTpCd = (JSPUtil.getParameter(request, prefix + "inlnd_cct_tp_cd", length));
			String[] avalHrmnt = (JSPUtil.getParameter(request, prefix + "aval_hrmnt", length));
			String[] orgYdCd = (JSPUtil.getParameter(request, prefix + "org_yd_cd", length));
			String[] inlndTrspWkItvalNo = (JSPUtil.getParameter(request, prefix + "inlnd_trsp_wk_itval_no", length));
			String[] inlndTrspFreqCd = (JSPUtil.getParameter(request, prefix + "inlnd_trsp_freq_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
			String[] thuStFlg = (JSPUtil.getParameter(request, prefix + "thu_st_flg", length));
			String[] monStFlg = (JSPUtil.getParameter(request, prefix + "mon_st_flg", length));
			String[] effToDt = (JSPUtil.getParameter(request, prefix + "eff_to_dt", length));
			String[] prioSeq = (JSPUtil.getParameter(request, prefix + "prio_seq", length));
			String[] orgEffFmDt = (JSPUtil.getParameter(request, prefix + "org_eff_fm_dt", length));
			String[] orgEffToDt = (JSPUtil.getParameter(request, prefix + "org_eff_to_dt", length));

			for (int i = 0; i < length; i++) {
				model = new PrdInlndCutOffTmMgmtVO();
				if (laneCd[i] != null)
					model.setLaneCd(laneCd[i]);
				if (avalDyCd[i] != null)
					model.setAvalDyCd(avalDyCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (avalWkNo[i] != null)
					model.setAvalWkNo(avalWkNo[i]);
				if (friStFlg[i] != null)
					model.setFriStFlg(friStFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (tueStFlg[i] != null)
					model.setTueStFlg(tueStFlg[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
				if (destYdCd[i] != null)
					model.setDestYdCd(destYdCd[i]);
				if (sunStFlg[i] != null)
					model.setSunStFlg(sunStFlg[i]);
				if (spclCgoCntrTpCd[i] != null)
					model.setSpclCgoCntrTpCd(spclCgoCntrTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cgoClzHrmnt[i] != null)
					model.setCgoClzHrmnt(cgoClzHrmnt[i]);
				if (effFmDt[i] != null)
					model.setEffFmDt(effFmDt[i]);
				if (satStFlg[i] != null)
					model.setSatStFlg(satStFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cctDyCd[i] != null)
					model.setCctDyCd(cctDyCd[i]);
				if (wedStFlg[i] != null)
					model.setWedStFlg(wedStFlg[i]);
				if (inlndCctTpCd[i] != null)
					model.setInlndCctTpCd(inlndCctTpCd[i]);
				if (avalHrmnt[i] != null)
					model.setAvalHrmnt(avalHrmnt[i]);
				if (orgYdCd[i] != null)
					model.setOrgYdCd(orgYdCd[i]);
				if (inlndTrspWkItvalNo[i] != null)
					model.setInlndTrspWkItvalNo(inlndTrspWkItvalNo[i]);
				if (inlndTrspFreqCd[i] != null)
					model.setInlndTrspFreqCd(inlndTrspFreqCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (thuStFlg[i] != null)
					model.setThuStFlg(thuStFlg[i]);
				if (monStFlg[i] != null)
					model.setMonStFlg(monStFlg[i]);
				if (effToDt[i] != null)
					model.setEffToDt(effToDt[i]);
				if (prioSeq[i] != null)
					model.setPrioSeq(prioSeq[i]);
				if (orgEffFmDt[i] != null)
					model.setOrgEffFmDt(orgEffFmDt[i]);
				if (orgEffToDt[i] != null)
					model.setOrgEffToDt(orgEffToDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPrdInlndCutOffTmMgmtVOs();
	}

	/**
	 * VO 배열을 반환
	 * 
	 * @return PrdInlndCutOffTmMgmtVO[]
	 */
	public PrdInlndCutOffTmMgmtVO[] getPrdInlndCutOffTmMgmtVOs() {
		PrdInlndCutOffTmMgmtVO[] vos = (PrdInlndCutOffTmMgmtVO[]) models.toArray(new PrdInlndCutOffTmMgmtVO[models.size()]);
		return vos;
	}

	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	/**
	 * 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	 */
	public void unDataFormat() {
		this.laneCd = this.laneCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.avalDyCd = this.avalDyCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.avalWkNo = this.avalWkNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.friStFlg = this.friStFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tueStFlg = this.tueStFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destYdCd = this.destYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sunStFlg = this.sunStFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoCntrTpCd = this.spclCgoCntrTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoClzHrmnt = this.cgoClzHrmnt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effFmDt = this.effFmDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.satStFlg = this.satStFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cctDyCd = this.cctDyCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wedStFlg = this.wedStFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndCctTpCd = this.inlndCctTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.avalHrmnt = this.avalHrmnt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgYdCd = this.orgYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndTrspWkItvalNo = this.inlndTrspWkItvalNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndTrspFreqCd = this.inlndTrspFreqCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.thuStFlg = this.thuStFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.monStFlg = this.monStFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effToDt = this.effToDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prioSeq = this.prioSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgEffFmDt = this.orgEffFmDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgEffToDt = this.orgEffToDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
