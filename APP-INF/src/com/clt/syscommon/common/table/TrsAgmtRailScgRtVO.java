/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : TrsAgmtRailScgRtVO.java
*@FileTitle : TrsAgmtRailScgRtVO
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

public class TrsAgmtRailScgRtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsAgmtRailScgRtVO> models = new ArrayList<TrsAgmtRailScgRtVO>();
	
	/* Column Info */
	private String toNodCd = null;
	/* Column Info */
	private String trspAgmtScgSeq = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String agmtRoutAllFlg = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String trspRailRto = null;
	/* Column Info */
	private String fuelScgAplyFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String cgoTpCd = null;
	/* Column Info */
	private String trspAgmtOfcCtyCd = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String fxScg40ftRt = null;
	/* Column Info */
	private String effFmDt = null;
	/* Column Info */
	private String fxScg45ftRt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String fxScgAllRt = null;
	/* Column Info */
	private String loclCreDt = null;
	/* Column Info */
	private String agmtEqSzNo = null;
	/* Column Info */
	private String railRtoNo = null;
	/* Column Info */
	private String fmNodCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String trspAgmtSeq = null;
	/* Column Info */
	private String fxScg20ftRt = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String trspRailScgCd = null;
	/* Column Info */
	private String lbsOvrWgt = null;
	/* Column Info */
	private String loclUpdDt = null;
	/* Column Info */
	private String effToDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TrsAgmtRailScgRtVO() {}

	public TrsAgmtRailScgRtVO(String ibflag, String pagerows, String trspAgmtScgSeq, String vndrSeq, String trspRailScgCd, String trspAgmtOfcCtyCd, String trspAgmtSeq, String agmtRoutAllFlg, String fmNodCd, String toNodCd, String cgoTpCd, String agmtEqSzNo, String trspRailRto, String effFmDt, String effToDt, String railRtoNo, String lbsOvrWgt, String currCd, String fxScgAllRt, String fxScg20ftRt, String fxScg40ftRt, String fxScg45ftRt, String fuelScgAplyFlg, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt, String loclCreDt, String loclUpdDt) {
		this.toNodCd = toNodCd;
		this.trspAgmtScgSeq = trspAgmtScgSeq;
		this.currCd = currCd;
		this.agmtRoutAllFlg = agmtRoutAllFlg;
		this.deltFlg = deltFlg;
		this.trspRailRto = trspRailRto;
		this.fuelScgAplyFlg = fuelScgAplyFlg;
		this.creDt = creDt;
		this.cgoTpCd = cgoTpCd;
		this.trspAgmtOfcCtyCd = trspAgmtOfcCtyCd;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.fxScg40ftRt = fxScg40ftRt;
		this.effFmDt = effFmDt;
		this.fxScg45ftRt = fxScg45ftRt;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.fxScgAllRt = fxScgAllRt;
		this.loclCreDt = loclCreDt;
		this.agmtEqSzNo = agmtEqSzNo;
		this.railRtoNo = railRtoNo;
		this.fmNodCd = fmNodCd;
		this.creUsrId = creUsrId;
		this.trspAgmtSeq = trspAgmtSeq;
		this.fxScg20ftRt = fxScg20ftRt;
		this.vndrSeq = vndrSeq;
		this.trspRailScgCd = trspRailScgCd;
		this.lbsOvrWgt = lbsOvrWgt;
		this.loclUpdDt = loclUpdDt;
		this.effToDt = effToDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("to_nod_cd", getToNodCd());
		this.hashColumns.put("trsp_agmt_scg_seq", getTrspAgmtScgSeq());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("agmt_rout_all_flg", getAgmtRoutAllFlg());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("trsp_rail_rto", getTrspRailRto());
		this.hashColumns.put("fuel_scg_aply_flg", getFuelScgAplyFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cgo_tp_cd", getCgoTpCd());
		this.hashColumns.put("trsp_agmt_ofc_cty_cd", getTrspAgmtOfcCtyCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("fx_scg_40ft_rt", getFxScg40ftRt());
		this.hashColumns.put("eff_fm_dt", getEffFmDt());
		this.hashColumns.put("fx_scg_45ft_rt", getFxScg45ftRt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("fx_scg_all_rt", getFxScgAllRt());
		this.hashColumns.put("locl_cre_dt", getLoclCreDt());
		this.hashColumns.put("agmt_eq_sz_no", getAgmtEqSzNo());
		this.hashColumns.put("rail_rto_no", getRailRtoNo());
		this.hashColumns.put("fm_nod_cd", getFmNodCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("trsp_agmt_seq", getTrspAgmtSeq());
		this.hashColumns.put("fx_scg_20ft_rt", getFxScg20ftRt());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("trsp_rail_scg_cd", getTrspRailScgCd());
		this.hashColumns.put("lbs_ovr_wgt", getLbsOvrWgt());
		this.hashColumns.put("locl_upd_dt", getLoclUpdDt());
		this.hashColumns.put("eff_to_dt", getEffToDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("to_nod_cd", "toNodCd");
		this.hashFields.put("trsp_agmt_scg_seq", "trspAgmtScgSeq");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("agmt_rout_all_flg", "agmtRoutAllFlg");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("trsp_rail_rto", "trspRailRto");
		this.hashFields.put("fuel_scg_aply_flg", "fuelScgAplyFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cgo_tp_cd", "cgoTpCd");
		this.hashFields.put("trsp_agmt_ofc_cty_cd", "trspAgmtOfcCtyCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("fx_scg_40ft_rt", "fxScg40ftRt");
		this.hashFields.put("eff_fm_dt", "effFmDt");
		this.hashFields.put("fx_scg_45ft_rt", "fxScg45ftRt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("fx_scg_all_rt", "fxScgAllRt");
		this.hashFields.put("locl_cre_dt", "loclCreDt");
		this.hashFields.put("agmt_eq_sz_no", "agmtEqSzNo");
		this.hashFields.put("rail_rto_no", "railRtoNo");
		this.hashFields.put("fm_nod_cd", "fmNodCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("trsp_agmt_seq", "trspAgmtSeq");
		this.hashFields.put("fx_scg_20ft_rt", "fxScg20ftRt");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("trsp_rail_scg_cd", "trspRailScgCd");
		this.hashFields.put("lbs_ovr_wgt", "lbsOvrWgt");
		this.hashFields.put("locl_upd_dt", "loclUpdDt");
		this.hashFields.put("eff_to_dt", "effToDt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return toNodCd
	 */
	public String getToNodCd() {
		return this.toNodCd;
	}
	
	/**
	 * Column Info
	 * @return trspAgmtScgSeq
	 */
	public String getTrspAgmtScgSeq() {
		return this.trspAgmtScgSeq;
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
	 * @return agmtRoutAllFlg
	 */
	public String getAgmtRoutAllFlg() {
		return this.agmtRoutAllFlg;
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
	 * @return trspRailRto
	 */
	public String getTrspRailRto() {
		return this.trspRailRto;
	}
	
	/**
	 * Column Info
	 * @return fuelScgAplyFlg
	 */
	public String getFuelScgAplyFlg() {
		return this.fuelScgAplyFlg;
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
	 * @return cgoTpCd
	 */
	public String getCgoTpCd() {
		return this.cgoTpCd;
	}
	
	/**
	 * Column Info
	 * @return trspAgmtOfcCtyCd
	 */
	public String getTrspAgmtOfcCtyCd() {
		return this.trspAgmtOfcCtyCd;
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
	 * @return fxScg40ftRt
	 */
	public String getFxScg40ftRt() {
		return this.fxScg40ftRt;
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
	 * @return fxScg45ftRt
	 */
	public String getFxScg45ftRt() {
		return this.fxScg45ftRt;
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
	 * @return fxScgAllRt
	 */
	public String getFxScgAllRt() {
		return this.fxScgAllRt;
	}
	
	/**
	 * Column Info
	 * @return loclCreDt
	 */
	public String getLoclCreDt() {
		return this.loclCreDt;
	}
	
	/**
	 * Column Info
	 * @return agmtEqSzNo
	 */
	public String getAgmtEqSzNo() {
		return this.agmtEqSzNo;
	}
	
	/**
	 * Column Info
	 * @return railRtoNo
	 */
	public String getRailRtoNo() {
		return this.railRtoNo;
	}
	
	/**
	 * Column Info
	 * @return fmNodCd
	 */
	public String getFmNodCd() {
		return this.fmNodCd;
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
	 * @return fxScg20ftRt
	 */
	public String getFxScg20ftRt() {
		return this.fxScg20ftRt;
	}
	
	/**
	 * Column Info
	 * @return vndrSeq
	 */
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	
	/**
	 * Column Info
	 * @return trspRailScgCd
	 */
	public String getTrspRailScgCd() {
		return this.trspRailScgCd;
	}
	
	/**
	 * Column Info
	 * @return lbsOvrWgt
	 */
	public String getLbsOvrWgt() {
		return this.lbsOvrWgt;
	}
	
	/**
	 * Column Info
	 * @return loclUpdDt
	 */
	public String getLoclUpdDt() {
		return this.loclUpdDt;
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
	 * @param toNodCd
	 */
	public void setToNodCd(String toNodCd) {
		this.toNodCd = toNodCd;
	}
	
	/**
	 * Column Info
	 * @param trspAgmtScgSeq
	 */
	public void setTrspAgmtScgSeq(String trspAgmtScgSeq) {
		this.trspAgmtScgSeq = trspAgmtScgSeq;
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
	 * @param agmtRoutAllFlg
	 */
	public void setAgmtRoutAllFlg(String agmtRoutAllFlg) {
		this.agmtRoutAllFlg = agmtRoutAllFlg;
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
	 * @param trspRailRto
	 */
	public void setTrspRailRto(String trspRailRto) {
		this.trspRailRto = trspRailRto;
	}
	
	/**
	 * Column Info
	 * @param fuelScgAplyFlg
	 */
	public void setFuelScgAplyFlg(String fuelScgAplyFlg) {
		this.fuelScgAplyFlg = fuelScgAplyFlg;
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
	 * @param cgoTpCd
	 */
	public void setCgoTpCd(String cgoTpCd) {
		this.cgoTpCd = cgoTpCd;
	}
	
	/**
	 * Column Info
	 * @param trspAgmtOfcCtyCd
	 */
	public void setTrspAgmtOfcCtyCd(String trspAgmtOfcCtyCd) {
		this.trspAgmtOfcCtyCd = trspAgmtOfcCtyCd;
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
	 * @param fxScg40ftRt
	 */
	public void setFxScg40ftRt(String fxScg40ftRt) {
		this.fxScg40ftRt = fxScg40ftRt;
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
	 * @param fxScg45ftRt
	 */
	public void setFxScg45ftRt(String fxScg45ftRt) {
		this.fxScg45ftRt = fxScg45ftRt;
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
	 * @param fxScgAllRt
	 */
	public void setFxScgAllRt(String fxScgAllRt) {
		this.fxScgAllRt = fxScgAllRt;
	}
	
	/**
	 * Column Info
	 * @param loclCreDt
	 */
	public void setLoclCreDt(String loclCreDt) {
		this.loclCreDt = loclCreDt;
	}
	
	/**
	 * Column Info
	 * @param agmtEqSzNo
	 */
	public void setAgmtEqSzNo(String agmtEqSzNo) {
		this.agmtEqSzNo = agmtEqSzNo;
	}
	
	/**
	 * Column Info
	 * @param railRtoNo
	 */
	public void setRailRtoNo(String railRtoNo) {
		this.railRtoNo = railRtoNo;
	}
	
	/**
	 * Column Info
	 * @param fmNodCd
	 */
	public void setFmNodCd(String fmNodCd) {
		this.fmNodCd = fmNodCd;
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
	 * @param fxScg20ftRt
	 */
	public void setFxScg20ftRt(String fxScg20ftRt) {
		this.fxScg20ftRt = fxScg20ftRt;
	}
	
	/**
	 * Column Info
	 * @param vndrSeq
	 */
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
	}
	
	/**
	 * Column Info
	 * @param trspRailScgCd
	 */
	public void setTrspRailScgCd(String trspRailScgCd) {
		this.trspRailScgCd = trspRailScgCd;
	}
	
	/**
	 * Column Info
	 * @param lbsOvrWgt
	 */
	public void setLbsOvrWgt(String lbsOvrWgt) {
		this.lbsOvrWgt = lbsOvrWgt;
	}
	
	/**
	 * Column Info
	 * @param loclUpdDt
	 */
	public void setLoclUpdDt(String loclUpdDt) {
		this.loclUpdDt = loclUpdDt;
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
		setToNodCd(JSPUtil.getParameter(request, prefix + "to_nod_cd", ""));
		setTrspAgmtScgSeq(JSPUtil.getParameter(request, prefix + "trsp_agmt_scg_seq", ""));
		setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
		setAgmtRoutAllFlg(JSPUtil.getParameter(request, prefix + "agmt_rout_all_flg", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setTrspRailRto(JSPUtil.getParameter(request, prefix + "trsp_rail_rto", ""));
		setFuelScgAplyFlg(JSPUtil.getParameter(request, prefix + "fuel_scg_aply_flg", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setCgoTpCd(JSPUtil.getParameter(request, prefix + "cgo_tp_cd", ""));
		setTrspAgmtOfcCtyCd(JSPUtil.getParameter(request, prefix + "trsp_agmt_ofc_cty_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setFxScg40ftRt(JSPUtil.getParameter(request, prefix + "fx_scg_40ft_rt", ""));
		setEffFmDt(JSPUtil.getParameter(request, prefix + "eff_fm_dt", ""));
		setFxScg45ftRt(JSPUtil.getParameter(request, prefix + "fx_scg_45ft_rt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setFxScgAllRt(JSPUtil.getParameter(request, prefix + "fx_scg_all_rt", ""));
		setLoclCreDt(JSPUtil.getParameter(request, prefix + "locl_cre_dt", ""));
		setAgmtEqSzNo(JSPUtil.getParameter(request, prefix + "agmt_eq_sz_no", ""));
		setRailRtoNo(JSPUtil.getParameter(request, prefix + "rail_rto_no", ""));
		setFmNodCd(JSPUtil.getParameter(request, prefix + "fm_nod_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setTrspAgmtSeq(JSPUtil.getParameter(request, prefix + "trsp_agmt_seq", ""));
		setFxScg20ftRt(JSPUtil.getParameter(request, prefix + "fx_scg_20ft_rt", ""));
		setVndrSeq(JSPUtil.getParameter(request, prefix + "vndr_seq", ""));
		setTrspRailScgCd(JSPUtil.getParameter(request, prefix + "trsp_rail_scg_cd", ""));
		setLbsOvrWgt(JSPUtil.getParameter(request, prefix + "lbs_ovr_wgt", ""));
		setLoclUpdDt(JSPUtil.getParameter(request, prefix + "locl_upd_dt", ""));
		setEffToDt(JSPUtil.getParameter(request, prefix + "eff_to_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsAgmtRailScgRtVO[]
	 */
	public TrsAgmtRailScgRtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsAgmtRailScgRtVO[]
	 */
	public TrsAgmtRailScgRtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsAgmtRailScgRtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] toNodCd = (JSPUtil.getParameter(request, prefix	+ "to_nod_cd", length));
			String[] trspAgmtScgSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_scg_seq", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] agmtRoutAllFlg = (JSPUtil.getParameter(request, prefix	+ "agmt_rout_all_flg", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] trspRailRto = (JSPUtil.getParameter(request, prefix	+ "trsp_rail_rto", length));
			String[] fuelScgAplyFlg = (JSPUtil.getParameter(request, prefix	+ "fuel_scg_aply_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] cgoTpCd = (JSPUtil.getParameter(request, prefix	+ "cgo_tp_cd", length));
			String[] trspAgmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_ofc_cty_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] fxScg40ftRt = (JSPUtil.getParameter(request, prefix	+ "fx_scg_40ft_rt", length));
			String[] effFmDt = (JSPUtil.getParameter(request, prefix	+ "eff_fm_dt", length));
			String[] fxScg45ftRt = (JSPUtil.getParameter(request, prefix	+ "fx_scg_45ft_rt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] fxScgAllRt = (JSPUtil.getParameter(request, prefix	+ "fx_scg_all_rt", length));
			String[] loclCreDt = (JSPUtil.getParameter(request, prefix	+ "locl_cre_dt", length));
			String[] agmtEqSzNo = (JSPUtil.getParameter(request, prefix	+ "agmt_eq_sz_no", length));
			String[] railRtoNo = (JSPUtil.getParameter(request, prefix	+ "rail_rto_no", length));
			String[] fmNodCd = (JSPUtil.getParameter(request, prefix	+ "fm_nod_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] trspAgmtSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_seq", length));
			String[] fxScg20ftRt = (JSPUtil.getParameter(request, prefix	+ "fx_scg_20ft_rt", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] trspRailScgCd = (JSPUtil.getParameter(request, prefix	+ "trsp_rail_scg_cd", length));
			String[] lbsOvrWgt = (JSPUtil.getParameter(request, prefix	+ "lbs_ovr_wgt", length));
			String[] loclUpdDt = (JSPUtil.getParameter(request, prefix	+ "locl_upd_dt", length));
			String[] effToDt = (JSPUtil.getParameter(request, prefix	+ "eff_to_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsAgmtRailScgRtVO();
				if (toNodCd[i] != null)
					model.setToNodCd(toNodCd[i]);
				if (trspAgmtScgSeq[i] != null)
					model.setTrspAgmtScgSeq(trspAgmtScgSeq[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (agmtRoutAllFlg[i] != null)
					model.setAgmtRoutAllFlg(agmtRoutAllFlg[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (trspRailRto[i] != null)
					model.setTrspRailRto(trspRailRto[i]);
				if (fuelScgAplyFlg[i] != null)
					model.setFuelScgAplyFlg(fuelScgAplyFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (cgoTpCd[i] != null)
					model.setCgoTpCd(cgoTpCd[i]);
				if (trspAgmtOfcCtyCd[i] != null)
					model.setTrspAgmtOfcCtyCd(trspAgmtOfcCtyCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (fxScg40ftRt[i] != null)
					model.setFxScg40ftRt(fxScg40ftRt[i]);
				if (effFmDt[i] != null)
					model.setEffFmDt(effFmDt[i]);
				if (fxScg45ftRt[i] != null)
					model.setFxScg45ftRt(fxScg45ftRt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (fxScgAllRt[i] != null)
					model.setFxScgAllRt(fxScgAllRt[i]);
				if (loclCreDt[i] != null)
					model.setLoclCreDt(loclCreDt[i]);
				if (agmtEqSzNo[i] != null)
					model.setAgmtEqSzNo(agmtEqSzNo[i]);
				if (railRtoNo[i] != null)
					model.setRailRtoNo(railRtoNo[i]);
				if (fmNodCd[i] != null)
					model.setFmNodCd(fmNodCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (trspAgmtSeq[i] != null)
					model.setTrspAgmtSeq(trspAgmtSeq[i]);
				if (fxScg20ftRt[i] != null)
					model.setFxScg20ftRt(fxScg20ftRt[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (trspRailScgCd[i] != null)
					model.setTrspRailScgCd(trspRailScgCd[i]);
				if (lbsOvrWgt[i] != null)
					model.setLbsOvrWgt(lbsOvrWgt[i]);
				if (loclUpdDt[i] != null)
					model.setLoclUpdDt(loclUpdDt[i]);
				if (effToDt[i] != null)
					model.setEffToDt(effToDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsAgmtRailScgRtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsAgmtRailScgRtVO[]
	 */
	public TrsAgmtRailScgRtVO[] getTrsAgmtRailScgRtVOs(){
		TrsAgmtRailScgRtVO[] vos = (TrsAgmtRailScgRtVO[])models.toArray(new TrsAgmtRailScgRtVO[models.size()]);
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
		this.toNodCd = this.toNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtScgSeq = this.trspAgmtScgSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtRoutAllFlg = this.agmtRoutAllFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspRailRto = this.trspRailRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fuelScgAplyFlg = this.fuelScgAplyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoTpCd = this.cgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtOfcCtyCd = this.trspAgmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fxScg40ftRt = this.fxScg40ftRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effFmDt = this.effFmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fxScg45ftRt = this.fxScg45ftRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fxScgAllRt = this.fxScgAllRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCreDt = this.loclCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtEqSzNo = this.agmtEqSzNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railRtoNo = this.railRtoNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmNodCd = this.fmNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtSeq = this.trspAgmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fxScg20ftRt = this.fxScg20ftRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspRailScgCd = this.trspRailScgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lbsOvrWgt = this.lbsOvrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclUpdDt = this.loclUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effToDt = this.effToDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
