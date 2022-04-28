/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : PrdTmlVgmCctHisVO.java
*@FileTitle : PrdTmlVgmCctHisVO
*Open Issues :
*Change history :
*@LastModifyDate : 2016.10.05
*@LastModifier : 
*@LastVersion : 1.0
* 2016.10.05  
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

public class PrdTmlVgmCctHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PrdTmlVgmCctHisVO> models = new ArrayList<PrdTmlVgmCctHisVO>();
	
	/* Column Info */
	private String cctHr = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String cgoTpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String edwUpdDt = null;
	/* Column Info */
	private String vslSlanCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String dcgoClzDt = null;
	/* Column Info */
	private String pctlUseFlg = null;
	/* Column Info */
	private String vpsPortCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String vvdCd = null;
	/* Column Info */
	private String cgoClzDt = null;
	/* Column Info */
	private String cctHrmnt = null;
	/* Column Info */
	private String bbCgoClzDt = null;
	/* Column Info */
	private String xcldHolSunFlg = null;
	/* Column Info */
	private String vslSlanDirCd = null;
	/* Column Info */
	private String hisSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String cctDyCd = null;
	/* Column Info */
	private String awkCgoClzDt = null;
	/* Column Info */
	private String cctFileFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String xcldHolSatFlg = null;
	/* Column Info */
	private String vgmFlg = null;
	/* Column Info */
	private String ydBseCalcFlg = null;
	/* Column Info */
	private String rcClzDt = null;
	/* Column Info */
	private String ydCd = null;
	/* Column Info */
	private String clptIndSeq = null;
	/* Column Info */
	private String vgmClzDt = null;
	/* Column Info */
	private String xcldHolHolFlg = null;
	/* Column Info */
	private String xcldHolFriFlg = null;
	/* Column Info */
	private String cctTpCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public PrdTmlVgmCctHisVO() {}

	public PrdTmlVgmCctHisVO(String ibflag, String pagerows, String hisSeq, String pctlUseFlg, String ydCd, String vslSlanCd, String vslSlanDirCd, String cgoTpCd, String vvdCd, String vgmFlg, String deltFlg, String cctTpCd, String cctHr, String cctDyCd, String cctHrmnt, String cgoClzDt, String dcgoClzDt, String rcClzDt, String awkCgoClzDt, String bbCgoClzDt, String vgmClzDt, String creUsrId, String creDt, String updUsrId, String updDt, String edwUpdDt, String vpsPortCd, String clptIndSeq, String cctFileFlg, String ydBseCalcFlg, String xcldHolFriFlg, String xcldHolSatFlg, String xcldHolSunFlg, String xcldHolHolFlg) {
		this.cctHr = cctHr;
		this.deltFlg = deltFlg;
		this.cgoTpCd = cgoTpCd;
		this.creDt = creDt;
		this.edwUpdDt = edwUpdDt;
		this.vslSlanCd = vslSlanCd;
		this.pagerows = pagerows;
		this.dcgoClzDt = dcgoClzDt;
		this.pctlUseFlg = pctlUseFlg;
		this.vpsPortCd = vpsPortCd;
		this.ibflag = ibflag;
		this.vvdCd = vvdCd;
		this.cgoClzDt = cgoClzDt;
		this.cctHrmnt = cctHrmnt;
		this.bbCgoClzDt = bbCgoClzDt;
		this.xcldHolSunFlg = xcldHolSunFlg;
		this.vslSlanDirCd = vslSlanDirCd;
		this.hisSeq = hisSeq;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.cctDyCd = cctDyCd;
		this.awkCgoClzDt = awkCgoClzDt;
		this.cctFileFlg = cctFileFlg;
		this.creUsrId = creUsrId;
		this.xcldHolSatFlg = xcldHolSatFlg;
		this.vgmFlg = vgmFlg;
		this.ydBseCalcFlg = ydBseCalcFlg;
		this.rcClzDt = rcClzDt;
		this.ydCd = ydCd;
		this.clptIndSeq = clptIndSeq;
		this.vgmClzDt = vgmClzDt;
		this.xcldHolHolFlg = xcldHolHolFlg;
		this.xcldHolFriFlg = xcldHolFriFlg;
		this.cctTpCd = cctTpCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cct_hr", getCctHr());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cgo_tp_cd", getCgoTpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("vsl_slan_cd", getVslSlanCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("dcgo_clz_dt", getDcgoClzDt());
		this.hashColumns.put("pctl_use_flg", getPctlUseFlg());
		this.hashColumns.put("vps_port_cd", getVpsPortCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vvd_cd", getVvdCd());
		this.hashColumns.put("cgo_clz_dt", getCgoClzDt());
		this.hashColumns.put("cct_hrmnt", getCctHrmnt());
		this.hashColumns.put("bb_cgo_clz_dt", getBbCgoClzDt());
		this.hashColumns.put("xcld_hol_sun_flg", getXcldHolSunFlg());
		this.hashColumns.put("vsl_slan_dir_cd", getVslSlanDirCd());
		this.hashColumns.put("his_seq", getHisSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cct_dy_cd", getCctDyCd());
		this.hashColumns.put("awk_cgo_clz_dt", getAwkCgoClzDt());
		this.hashColumns.put("cct_file_flg", getCctFileFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("xcld_hol_sat_flg", getXcldHolSatFlg());
		this.hashColumns.put("vgm_flg", getVgmFlg());
		this.hashColumns.put("yd_bse_calc_flg", getYdBseCalcFlg());
		this.hashColumns.put("rc_clz_dt", getRcClzDt());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("clpt_ind_seq", getClptIndSeq());
		this.hashColumns.put("vgm_clz_dt", getVgmClzDt());
		this.hashColumns.put("xcld_hol_hol_flg", getXcldHolHolFlg());
		this.hashColumns.put("xcld_hol_fri_flg", getXcldHolFriFlg());
		this.hashColumns.put("cct_tp_cd", getCctTpCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cct_hr", "cctHr");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cgo_tp_cd", "cgoTpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("vsl_slan_cd", "vslSlanCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("dcgo_clz_dt", "dcgoClzDt");
		this.hashFields.put("pctl_use_flg", "pctlUseFlg");
		this.hashFields.put("vps_port_cd", "vpsPortCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vvd_cd", "vvdCd");
		this.hashFields.put("cgo_clz_dt", "cgoClzDt");
		this.hashFields.put("cct_hrmnt", "cctHrmnt");
		this.hashFields.put("bb_cgo_clz_dt", "bbCgoClzDt");
		this.hashFields.put("xcld_hol_sun_flg", "xcldHolSunFlg");
		this.hashFields.put("vsl_slan_dir_cd", "vslSlanDirCd");
		this.hashFields.put("his_seq", "hisSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cct_dy_cd", "cctDyCd");
		this.hashFields.put("awk_cgo_clz_dt", "awkCgoClzDt");
		this.hashFields.put("cct_file_flg", "cctFileFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("xcld_hol_sat_flg", "xcldHolSatFlg");
		this.hashFields.put("vgm_flg", "vgmFlg");
		this.hashFields.put("yd_bse_calc_flg", "ydBseCalcFlg");
		this.hashFields.put("rc_clz_dt", "rcClzDt");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("clpt_ind_seq", "clptIndSeq");
		this.hashFields.put("vgm_clz_dt", "vgmClzDt");
		this.hashFields.put("xcld_hol_hol_flg", "xcldHolHolFlg");
		this.hashFields.put("xcld_hol_fri_flg", "xcldHolFriFlg");
		this.hashFields.put("cct_tp_cd", "cctTpCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return cctHr
	 */
	public String getCctHr() {
		return this.cctHr;
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
	 * @return cgoTpCd
	 */
	public String getCgoTpCd() {
		return this.cgoTpCd;
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
	 * @return edwUpdDt
	 */
	public String getEdwUpdDt() {
		return this.edwUpdDt;
	}
	
	/**
	 * Column Info
	 * @return vslSlanCd
	 */
	public String getVslSlanCd() {
		return this.vslSlanCd;
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
	 * @return dcgoClzDt
	 */
	public String getDcgoClzDt() {
		return this.dcgoClzDt;
	}
	
	/**
	 * Column Info
	 * @return pctlUseFlg
	 */
	public String getPctlUseFlg() {
		return this.pctlUseFlg;
	}
	
	/**
	 * Column Info
	 * @return vpsPortCd
	 */
	public String getVpsPortCd() {
		return this.vpsPortCd;
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
	 * @return vvdCd
	 */
	public String getVvdCd() {
		return this.vvdCd;
	}
	
	/**
	 * Column Info
	 * @return cgoClzDt
	 */
	public String getCgoClzDt() {
		return this.cgoClzDt;
	}
	
	/**
	 * Column Info
	 * @return cctHrmnt
	 */
	public String getCctHrmnt() {
		return this.cctHrmnt;
	}
	
	/**
	 * Column Info
	 * @return bbCgoClzDt
	 */
	public String getBbCgoClzDt() {
		return this.bbCgoClzDt;
	}
	
	/**
	 * Column Info
	 * @return xcldHolSunFlg
	 */
	public String getXcldHolSunFlg() {
		return this.xcldHolSunFlg;
	}
	
	/**
	 * Column Info
	 * @return vslSlanDirCd
	 */
	public String getVslSlanDirCd() {
		return this.vslSlanDirCd;
	}
	
	/**
	 * Column Info
	 * @return hisSeq
	 */
	public String getHisSeq() {
		return this.hisSeq;
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
	 * @return cctDyCd
	 */
	public String getCctDyCd() {
		return this.cctDyCd;
	}
	
	/**
	 * Column Info
	 * @return awkCgoClzDt
	 */
	public String getAwkCgoClzDt() {
		return this.awkCgoClzDt;
	}
	
	/**
	 * Column Info
	 * @return cctFileFlg
	 */
	public String getCctFileFlg() {
		return this.cctFileFlg;
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
	 * @return xcldHolSatFlg
	 */
	public String getXcldHolSatFlg() {
		return this.xcldHolSatFlg;
	}
	
	/**
	 * Column Info
	 * @return vgmFlg
	 */
	public String getVgmFlg() {
		return this.vgmFlg;
	}
	
	/**
	 * Column Info
	 * @return ydBseCalcFlg
	 */
	public String getYdBseCalcFlg() {
		return this.ydBseCalcFlg;
	}
	
	/**
	 * Column Info
	 * @return rcClzDt
	 */
	public String getRcClzDt() {
		return this.rcClzDt;
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
	 * @return clptIndSeq
	 */
	public String getClptIndSeq() {
		return this.clptIndSeq;
	}
	
	/**
	 * Column Info
	 * @return vgmClzDt
	 */
	public String getVgmClzDt() {
		return this.vgmClzDt;
	}
	
	/**
	 * Column Info
	 * @return xcldHolHolFlg
	 */
	public String getXcldHolHolFlg() {
		return this.xcldHolHolFlg;
	}
	
	/**
	 * Column Info
	 * @return xcldHolFriFlg
	 */
	public String getXcldHolFriFlg() {
		return this.xcldHolFriFlg;
	}
	
	/**
	 * Column Info
	 * @return cctTpCd
	 */
	public String getCctTpCd() {
		return this.cctTpCd;
	}
	

	/**
	 * Column Info
	 * @param cctHr
	 */
	public void setCctHr(String cctHr) {
		this.cctHr = cctHr;
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
	 * @param cgoTpCd
	 */
	public void setCgoTpCd(String cgoTpCd) {
		this.cgoTpCd = cgoTpCd;
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
	 * @param edwUpdDt
	 */
	public void setEdwUpdDt(String edwUpdDt) {
		this.edwUpdDt = edwUpdDt;
	}
	
	/**
	 * Column Info
	 * @param vslSlanCd
	 */
	public void setVslSlanCd(String vslSlanCd) {
		this.vslSlanCd = vslSlanCd;
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
	 * @param dcgoClzDt
	 */
	public void setDcgoClzDt(String dcgoClzDt) {
		this.dcgoClzDt = dcgoClzDt;
	}
	
	/**
	 * Column Info
	 * @param pctlUseFlg
	 */
	public void setPctlUseFlg(String pctlUseFlg) {
		this.pctlUseFlg = pctlUseFlg;
	}
	
	/**
	 * Column Info
	 * @param vpsPortCd
	 */
	public void setVpsPortCd(String vpsPortCd) {
		this.vpsPortCd = vpsPortCd;
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
	 * @param vvdCd
	 */
	public void setVvdCd(String vvdCd) {
		this.vvdCd = vvdCd;
	}
	
	/**
	 * Column Info
	 * @param cgoClzDt
	 */
	public void setCgoClzDt(String cgoClzDt) {
		this.cgoClzDt = cgoClzDt;
	}
	
	/**
	 * Column Info
	 * @param cctHrmnt
	 */
	public void setCctHrmnt(String cctHrmnt) {
		this.cctHrmnt = cctHrmnt;
	}
	
	/**
	 * Column Info
	 * @param bbCgoClzDt
	 */
	public void setBbCgoClzDt(String bbCgoClzDt) {
		this.bbCgoClzDt = bbCgoClzDt;
	}
	
	/**
	 * Column Info
	 * @param xcldHolSunFlg
	 */
	public void setXcldHolSunFlg(String xcldHolSunFlg) {
		this.xcldHolSunFlg = xcldHolSunFlg;
	}
	
	/**
	 * Column Info
	 * @param vslSlanDirCd
	 */
	public void setVslSlanDirCd(String vslSlanDirCd) {
		this.vslSlanDirCd = vslSlanDirCd;
	}
	
	/**
	 * Column Info
	 * @param hisSeq
	 */
	public void setHisSeq(String hisSeq) {
		this.hisSeq = hisSeq;
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
	 * @param cctDyCd
	 */
	public void setCctDyCd(String cctDyCd) {
		this.cctDyCd = cctDyCd;
	}
	
	/**
	 * Column Info
	 * @param awkCgoClzDt
	 */
	public void setAwkCgoClzDt(String awkCgoClzDt) {
		this.awkCgoClzDt = awkCgoClzDt;
	}
	
	/**
	 * Column Info
	 * @param cctFileFlg
	 */
	public void setCctFileFlg(String cctFileFlg) {
		this.cctFileFlg = cctFileFlg;
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
	 * @param xcldHolSatFlg
	 */
	public void setXcldHolSatFlg(String xcldHolSatFlg) {
		this.xcldHolSatFlg = xcldHolSatFlg;
	}
	
	/**
	 * Column Info
	 * @param vgmFlg
	 */
	public void setVgmFlg(String vgmFlg) {
		this.vgmFlg = vgmFlg;
	}
	
	/**
	 * Column Info
	 * @param ydBseCalcFlg
	 */
	public void setYdBseCalcFlg(String ydBseCalcFlg) {
		this.ydBseCalcFlg = ydBseCalcFlg;
	}
	
	/**
	 * Column Info
	 * @param rcClzDt
	 */
	public void setRcClzDt(String rcClzDt) {
		this.rcClzDt = rcClzDt;
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
	 * @param clptIndSeq
	 */
	public void setClptIndSeq(String clptIndSeq) {
		this.clptIndSeq = clptIndSeq;
	}
	
	/**
	 * Column Info
	 * @param vgmClzDt
	 */
	public void setVgmClzDt(String vgmClzDt) {
		this.vgmClzDt = vgmClzDt;
	}
	
	/**
	 * Column Info
	 * @param xcldHolHolFlg
	 */
	public void setXcldHolHolFlg(String xcldHolHolFlg) {
		this.xcldHolHolFlg = xcldHolHolFlg;
	}
	
	/**
	 * Column Info
	 * @param xcldHolFriFlg
	 */
	public void setXcldHolFriFlg(String xcldHolFriFlg) {
		this.xcldHolFriFlg = xcldHolFriFlg;
	}
	
	/**
	 * Column Info
	 * @param cctTpCd
	 */
	public void setCctTpCd(String cctTpCd) {
		this.cctTpCd = cctTpCd;
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
		setCctHr(JSPUtil.getParameter(request, prefix + "cct_hr", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setCgoTpCd(JSPUtil.getParameter(request, prefix + "cgo_tp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setVslSlanCd(JSPUtil.getParameter(request, prefix + "vsl_slan_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setDcgoClzDt(JSPUtil.getParameter(request, prefix + "dcgo_clz_dt", ""));
		setPctlUseFlg(JSPUtil.getParameter(request, prefix + "pctl_use_flg", ""));
		setVpsPortCd(JSPUtil.getParameter(request, prefix + "vps_port_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setVvdCd(JSPUtil.getParameter(request, prefix + "vvd_cd", ""));
		setCgoClzDt(JSPUtil.getParameter(request, prefix + "cgo_clz_dt", ""));
		setCctHrmnt(JSPUtil.getParameter(request, prefix + "cct_hrmnt", ""));
		setBbCgoClzDt(JSPUtil.getParameter(request, prefix + "bb_cgo_clz_dt", ""));
		setXcldHolSunFlg(JSPUtil.getParameter(request, prefix + "xcld_hol_sun_flg", ""));
		setVslSlanDirCd(JSPUtil.getParameter(request, prefix + "vsl_slan_dir_cd", ""));
		setHisSeq(JSPUtil.getParameter(request, prefix + "his_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setCctDyCd(JSPUtil.getParameter(request, prefix + "cct_dy_cd", ""));
		setAwkCgoClzDt(JSPUtil.getParameter(request, prefix + "awk_cgo_clz_dt", ""));
		setCctFileFlg(JSPUtil.getParameter(request, prefix + "cct_file_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setXcldHolSatFlg(JSPUtil.getParameter(request, prefix + "xcld_hol_sat_flg", ""));
		setVgmFlg(JSPUtil.getParameter(request, prefix + "vgm_flg", ""));
		setYdBseCalcFlg(JSPUtil.getParameter(request, prefix + "yd_bse_calc_flg", ""));
		setRcClzDt(JSPUtil.getParameter(request, prefix + "rc_clz_dt", ""));
		setYdCd(JSPUtil.getParameter(request, prefix + "yd_cd", ""));
		setClptIndSeq(JSPUtil.getParameter(request, prefix + "clpt_ind_seq", ""));
		setVgmClzDt(JSPUtil.getParameter(request, prefix + "vgm_clz_dt", ""));
		setXcldHolHolFlg(JSPUtil.getParameter(request, prefix + "xcld_hol_hol_flg", ""));
		setXcldHolFriFlg(JSPUtil.getParameter(request, prefix + "xcld_hol_fri_flg", ""));
		setCctTpCd(JSPUtil.getParameter(request, prefix + "cct_tp_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PrdTmlVgmCctHisVO[]
	 */
	public PrdTmlVgmCctHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PrdTmlVgmCctHisVO[]
	 */
	public PrdTmlVgmCctHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PrdTmlVgmCctHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cctHr = (JSPUtil.getParameter(request, prefix	+ "cct_hr", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] cgoTpCd = (JSPUtil.getParameter(request, prefix	+ "cgo_tp_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix	+ "edw_upd_dt", length));
			String[] vslSlanCd = (JSPUtil.getParameter(request, prefix	+ "vsl_slan_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] dcgoClzDt = (JSPUtil.getParameter(request, prefix	+ "dcgo_clz_dt", length));
			String[] pctlUseFlg = (JSPUtil.getParameter(request, prefix	+ "pctl_use_flg", length));
			String[] vpsPortCd = (JSPUtil.getParameter(request, prefix	+ "vps_port_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] vvdCd = (JSPUtil.getParameter(request, prefix	+ "vvd_cd", length));
			String[] cgoClzDt = (JSPUtil.getParameter(request, prefix	+ "cgo_clz_dt", length));
			String[] cctHrmnt = (JSPUtil.getParameter(request, prefix	+ "cct_hrmnt", length));
			String[] bbCgoClzDt = (JSPUtil.getParameter(request, prefix	+ "bb_cgo_clz_dt", length));
			String[] xcldHolSunFlg = (JSPUtil.getParameter(request, prefix	+ "xcld_hol_sun_flg", length));
			String[] vslSlanDirCd = (JSPUtil.getParameter(request, prefix	+ "vsl_slan_dir_cd", length));
			String[] hisSeq = (JSPUtil.getParameter(request, prefix	+ "his_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] cctDyCd = (JSPUtil.getParameter(request, prefix	+ "cct_dy_cd", length));
			String[] awkCgoClzDt = (JSPUtil.getParameter(request, prefix	+ "awk_cgo_clz_dt", length));
			String[] cctFileFlg = (JSPUtil.getParameter(request, prefix	+ "cct_file_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] xcldHolSatFlg = (JSPUtil.getParameter(request, prefix	+ "xcld_hol_sat_flg", length));
			String[] vgmFlg = (JSPUtil.getParameter(request, prefix	+ "vgm_flg", length));
			String[] ydBseCalcFlg = (JSPUtil.getParameter(request, prefix	+ "yd_bse_calc_flg", length));
			String[] rcClzDt = (JSPUtil.getParameter(request, prefix	+ "rc_clz_dt", length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd", length));
			String[] clptIndSeq = (JSPUtil.getParameter(request, prefix	+ "clpt_ind_seq", length));
			String[] vgmClzDt = (JSPUtil.getParameter(request, prefix	+ "vgm_clz_dt", length));
			String[] xcldHolHolFlg = (JSPUtil.getParameter(request, prefix	+ "xcld_hol_hol_flg", length));
			String[] xcldHolFriFlg = (JSPUtil.getParameter(request, prefix	+ "xcld_hol_fri_flg", length));
			String[] cctTpCd = (JSPUtil.getParameter(request, prefix	+ "cct_tp_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new PrdTmlVgmCctHisVO();
				if (cctHr[i] != null)
					model.setCctHr(cctHr[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (cgoTpCd[i] != null)
					model.setCgoTpCd(cgoTpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
				if (vslSlanCd[i] != null)
					model.setVslSlanCd(vslSlanCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (dcgoClzDt[i] != null)
					model.setDcgoClzDt(dcgoClzDt[i]);
				if (pctlUseFlg[i] != null)
					model.setPctlUseFlg(pctlUseFlg[i]);
				if (vpsPortCd[i] != null)
					model.setVpsPortCd(vpsPortCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vvdCd[i] != null)
					model.setVvdCd(vvdCd[i]);
				if (cgoClzDt[i] != null)
					model.setCgoClzDt(cgoClzDt[i]);
				if (cctHrmnt[i] != null)
					model.setCctHrmnt(cctHrmnt[i]);
				if (bbCgoClzDt[i] != null)
					model.setBbCgoClzDt(bbCgoClzDt[i]);
				if (xcldHolSunFlg[i] != null)
					model.setXcldHolSunFlg(xcldHolSunFlg[i]);
				if (vslSlanDirCd[i] != null)
					model.setVslSlanDirCd(vslSlanDirCd[i]);
				if (hisSeq[i] != null)
					model.setHisSeq(hisSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cctDyCd[i] != null)
					model.setCctDyCd(cctDyCd[i]);
				if (awkCgoClzDt[i] != null)
					model.setAwkCgoClzDt(awkCgoClzDt[i]);
				if (cctFileFlg[i] != null)
					model.setCctFileFlg(cctFileFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (xcldHolSatFlg[i] != null)
					model.setXcldHolSatFlg(xcldHolSatFlg[i]);
				if (vgmFlg[i] != null)
					model.setVgmFlg(vgmFlg[i]);
				if (ydBseCalcFlg[i] != null)
					model.setYdBseCalcFlg(ydBseCalcFlg[i]);
				if (rcClzDt[i] != null)
					model.setRcClzDt(rcClzDt[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (clptIndSeq[i] != null)
					model.setClptIndSeq(clptIndSeq[i]);
				if (vgmClzDt[i] != null)
					model.setVgmClzDt(vgmClzDt[i]);
				if (xcldHolHolFlg[i] != null)
					model.setXcldHolHolFlg(xcldHolHolFlg[i]);
				if (xcldHolFriFlg[i] != null)
					model.setXcldHolFriFlg(xcldHolFriFlg[i]);
				if (cctTpCd[i] != null)
					model.setCctTpCd(cctTpCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPrdTmlVgmCctHisVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PrdTmlVgmCctHisVO[]
	 */
	public PrdTmlVgmCctHisVO[] getPrdTmlVgmCctHisVOs(){
		PrdTmlVgmCctHisVO[] vos = (PrdTmlVgmCctHisVO[])models.toArray(new PrdTmlVgmCctHisVO[models.size()]);
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
		this.cctHr = this.cctHr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoTpCd = this.cgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSlanCd = this.vslSlanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoClzDt = this.dcgoClzDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pctlUseFlg = this.pctlUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vpsPortCd = this.vpsPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdCd = this.vvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoClzDt = this.cgoClzDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cctHrmnt = this.cctHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbCgoClzDt = this.bbCgoClzDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xcldHolSunFlg = this.xcldHolSunFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSlanDirCd = this.vslSlanDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hisSeq = this.hisSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cctDyCd = this.cctDyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.awkCgoClzDt = this.awkCgoClzDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cctFileFlg = this.cctFileFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xcldHolSatFlg = this.xcldHolSatFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vgmFlg = this.vgmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydBseCalcFlg = this.ydBseCalcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcClzDt = this.rcClzDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clptIndSeq = this.clptIndSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vgmClzDt = this.vgmClzDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xcldHolHolFlg = this.xcldHolHolFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xcldHolFriFlg = this.xcldHolFriFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cctTpCd = this.cctTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
