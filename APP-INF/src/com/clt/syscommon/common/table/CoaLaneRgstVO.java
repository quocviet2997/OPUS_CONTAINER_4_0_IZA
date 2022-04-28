/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaLaneRgstVO.java
*@FileTitle : CoaLaneRgstVO
*Open Issues :
*Change history :
* 2009.12.23 최인경 0036 화면 IBSHEET컬럼 2개 추가
* 
* 
* 
*@LastModifyDate : 2009.09.25
*@LastModifier : 임옥영
*@LastVersion : 1.0
* 2009.09.25 임옥영 
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
 * @author 임옥영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CoaLaneRgstVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaLaneRgstVO> models = new ArrayList<CoaLaneRgstVO>();
	
	/* Column Info */
	private String pndlmLaneSeq = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String subTrdDesc = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String lodSplCngFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String opLaneTpCd = null;
	/* Column Info */
	private String stupFlg = null;
	/* Column Info */
	private String intrAsiaFlg = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String trnsAtlanFlg = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslLaneTpCd = null;
	/* Column Info */
	private String iocCd = null;
	/* Column Info */
	private String eurFlg = null;
	/* Column Info */
	private String pndlmLaneFlg = null;
	/* Column Info */
	private String trnsPcfFlg = null;
	/* Column Info */
	private String trnkIptFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String slanCd = null;
	/* Column Info */
	private String sctrPrcFlg = null;
	/* Column Info */
	private String laneTpHisFlg = null;
	/* Column Info */
	private String subTrdCd = null;
	/* Column Info */
	private String pctlLaneChkFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaLaneRgstVO() {}

	public CoaLaneRgstVO(String ibflag, String pagerows, String rlaneCd, String dirCd, String trdCd, String iocCd, String vslLaneTpCd, String stupFlg, String sctrPrcFlg, String subTrdCd, String subTrdDesc, String slanCd, String trnsPcfFlg, String eurFlg, String trnkIptFlg, String intrAsiaFlg, String trnsAtlanFlg, String pndlmLaneFlg, String pndlmLaneSeq, String deltFlg, String lodSplCngFlg, String laneTpHisFlg, String creUsrId, String creDt, String updUsrId, String updDt, String opLaneTpCd,String pctlLaneChkFlg) {
		this.pndlmLaneSeq = pndlmLaneSeq;
		this.deltFlg = deltFlg;
		this.subTrdDesc = subTrdDesc;
		this.creDt = creDt;
		this.trdCd = trdCd;
		this.rlaneCd = rlaneCd;
		this.pagerows = pagerows;
		this.lodSplCngFlg = lodSplCngFlg;
		this.ibflag = ibflag;
		this.opLaneTpCd = opLaneTpCd;
		this.pctlLaneChkFlg = pctlLaneChkFlg;
		this.stupFlg = stupFlg;
		this.intrAsiaFlg = intrAsiaFlg;
		this.dirCd = dirCd;
		this.updUsrId = updUsrId;
		this.trnsAtlanFlg = trnsAtlanFlg;
		this.updDt = updDt;
		this.vslLaneTpCd = vslLaneTpCd;
		this.iocCd = iocCd;
		this.eurFlg = eurFlg;
		this.pndlmLaneFlg = pndlmLaneFlg;
		this.trnsPcfFlg = trnsPcfFlg;
		this.trnkIptFlg = trnkIptFlg;
		this.creUsrId = creUsrId;
		this.slanCd = slanCd;
		this.sctrPrcFlg = sctrPrcFlg;
		this.laneTpHisFlg = laneTpHisFlg;
		this.subTrdCd = subTrdCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pndlm_lane_seq", getPndlmLaneSeq());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("sub_trd_desc", getSubTrdDesc());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("lod_spl_cng_flg", getLodSplCngFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("op_lane_tp_cd", getOpLaneTpCd());
		this.hashColumns.put("pctl_lane_chk_flg", getPctlLaneChkFlg());		
		this.hashColumns.put("stup_flg", getStupFlg());
		this.hashColumns.put("intr_asia_flg", getIntrAsiaFlg());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("trns_atlan_flg", getTrnsAtlanFlg());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_lane_tp_cd", getVslLaneTpCd());
		this.hashColumns.put("ioc_cd", getIocCd());
		this.hashColumns.put("eur_flg", getEurFlg());
		this.hashColumns.put("pndlm_lane_flg", getPndlmLaneFlg());
		this.hashColumns.put("trns_pcf_flg", getTrnsPcfFlg());
		this.hashColumns.put("trnk_ipt_flg", getTrnkIptFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("slan_cd", getSlanCd());
		this.hashColumns.put("sctr_prc_flg", getSctrPrcFlg());
		this.hashColumns.put("lane_tp_his_flg", getLaneTpHisFlg());
		this.hashColumns.put("sub_trd_cd", getSubTrdCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pndlm_lane_seq", "pndlmLaneSeq");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("sub_trd_desc", "subTrdDesc");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("lod_spl_cng_flg", "lodSplCngFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("op_lane_tp_cd", "opLaneTpCd");
		this.hashFields.put("pctl_lane_chk_flg", "pctlLaneChkFlg");
		this.hashFields.put("stup_flg", "stupFlg");
		this.hashFields.put("intr_asia_flg", "intrAsiaFlg");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("trns_atlan_flg", "trnsAtlanFlg");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_lane_tp_cd", "vslLaneTpCd");
		this.hashFields.put("ioc_cd", "iocCd");
		this.hashFields.put("eur_flg", "eurFlg");
		this.hashFields.put("pndlm_lane_flg", "pndlmLaneFlg");
		this.hashFields.put("trns_pcf_flg", "trnsPcfFlg");
		this.hashFields.put("trnk_ipt_flg", "trnkIptFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("slan_cd", "slanCd");
		this.hashFields.put("sctr_prc_flg", "sctrPrcFlg");
		this.hashFields.put("lane_tp_his_flg", "laneTpHisFlg");
		this.hashFields.put("sub_trd_cd", "subTrdCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return pndlmLaneSeq
	 */
	public String getPndlmLaneSeq() {
		return this.pndlmLaneSeq;
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
	 * @return subTrdDesc
	 */
	public String getSubTrdDesc() {
		return this.subTrdDesc;
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
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}
	
	/**
	 * Column Info
	 * @return lodSplCngFlg
	 */
	public String getLodSplCngFlg() {
		return this.lodSplCngFlg;
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
	 * @return opLaneTpCd
	 */
	public String getOpLaneTpCd() {
		return this.opLaneTpCd;
	}
	
	/**
	 * Column Info
	 * @return pctlLaneChkFlg
	 */
	public String getPctlLaneChkFlg() {
		return this.pctlLaneChkFlg;
	}
	
	/**
	 * Column Info
	 * @return stupFlg
	 */
	public String getStupFlg() {
		return this.stupFlg;
	}
	
	/**
	 * Column Info
	 * @return intrAsiaFlg
	 */
	public String getIntrAsiaFlg() {
		return this.intrAsiaFlg;
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
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	/**
	 * Column Info
	 * @return trnsAtlanFlg
	 */
	public String getTrnsAtlanFlg() {
		return this.trnsAtlanFlg;
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
	 * @return vslLaneTpCd
	 */
	public String getVslLaneTpCd() {
		return this.vslLaneTpCd;
	}
	
	/**
	 * Column Info
	 * @return iocCd
	 */
	public String getIocCd() {
		return this.iocCd;
	}
	
	/**
	 * Column Info
	 * @return eurFlg
	 */
	public String getEurFlg() {
		return this.eurFlg;
	}
	
	/**
	 * Column Info
	 * @return pndlmLaneFlg
	 */
	public String getPndlmLaneFlg() {
		return this.pndlmLaneFlg;
	}
	
	/**
	 * Column Info
	 * @return trnsPcfFlg
	 */
	public String getTrnsPcfFlg() {
		return this.trnsPcfFlg;
	}
	
	/**
	 * Column Info
	 * @return trnkIptFlg
	 */
	public String getTrnkIptFlg() {
		return this.trnkIptFlg;
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
	 * @return slanCd
	 */
	public String getSlanCd() {
		return this.slanCd;
	}
	
	/**
	 * Column Info
	 * @return sctrPrcFlg
	 */
	public String getSctrPrcFlg() {
		return this.sctrPrcFlg;
	}
	
	/**
	 * Column Info
	 * @return laneTpHisFlg
	 */
	public String getLaneTpHisFlg() {
		return this.laneTpHisFlg;
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
	 * @param pndlmLaneSeq
	 */
	public void setPndlmLaneSeq(String pndlmLaneSeq) {
		this.pndlmLaneSeq = pndlmLaneSeq;
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
	 * @param subTrdDesc
	 */
	public void setSubTrdDesc(String subTrdDesc) {
		this.subTrdDesc = subTrdDesc;
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
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Column Info
	 * @param lodSplCngFlg
	 */
	public void setLodSplCngFlg(String lodSplCngFlg) {
		this.lodSplCngFlg = lodSplCngFlg;
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
	 * @param opLaneTpCd
	 */
	public void setOpLaneTpCd(String opLaneTpCd) {
		this.opLaneTpCd = opLaneTpCd;
	}
	
	/**
	 * Column Info
	 * @param pctlLaneChkFlg
	 */
	public void setPctlLaneChkFlg(String pctlLaneChkFlg) {
		this.pctlLaneChkFlg = pctlLaneChkFlg;
	}
	
	/**
	 * Column Info
	 * @param stupFlg
	 */
	public void setStupFlg(String stupFlg) {
		this.stupFlg = stupFlg;
	}
	
	/**
	 * Column Info
	 * @param intrAsiaFlg
	 */
	public void setIntrAsiaFlg(String intrAsiaFlg) {
		this.intrAsiaFlg = intrAsiaFlg;
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
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param trnsAtlanFlg
	 */
	public void setTrnsAtlanFlg(String trnsAtlanFlg) {
		this.trnsAtlanFlg = trnsAtlanFlg;
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
	 * @param vslLaneTpCd
	 */
	public void setVslLaneTpCd(String vslLaneTpCd) {
		this.vslLaneTpCd = vslLaneTpCd;
	}
	
	/**
	 * Column Info
	 * @param iocCd
	 */
	public void setIocCd(String iocCd) {
		this.iocCd = iocCd;
	}
	
	/**
	 * Column Info
	 * @param eurFlg
	 */
	public void setEurFlg(String eurFlg) {
		this.eurFlg = eurFlg;
	}
	
	/**
	 * Column Info
	 * @param pndlmLaneFlg
	 */
	public void setPndlmLaneFlg(String pndlmLaneFlg) {
		this.pndlmLaneFlg = pndlmLaneFlg;
	}
	
	/**
	 * Column Info
	 * @param trnsPcfFlg
	 */
	public void setTrnsPcfFlg(String trnsPcfFlg) {
		this.trnsPcfFlg = trnsPcfFlg;
	}
	
	/**
	 * Column Info
	 * @param trnkIptFlg
	 */
	public void setTrnkIptFlg(String trnkIptFlg) {
		this.trnkIptFlg = trnkIptFlg;
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
	 * @param slanCd
	 */
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
	}
	
	/**
	 * Column Info
	 * @param sctrPrcFlg
	 */
	public void setSctrPrcFlg(String sctrPrcFlg) {
		this.sctrPrcFlg = sctrPrcFlg;
	}
	
	/**
	 * Column Info
	 * @param laneTpHisFlg
	 */
	public void setLaneTpHisFlg(String laneTpHisFlg) {
		this.laneTpHisFlg = laneTpHisFlg;
	}
	
	/**
	 * Column Info
	 * @param subTrdCd
	 */
	public void setSubTrdCd(String subTrdCd) {
		this.subTrdCd = subTrdCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setPndlmLaneSeq(JSPUtil.getParameter(request, "pndlm_lane_seq", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setSubTrdDesc(JSPUtil.getParameter(request, "sub_trd_desc", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setLodSplCngFlg(JSPUtil.getParameter(request, "lod_spl_cng_flg", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setOpLaneTpCd(JSPUtil.getParameter(request, "op_lane_tp_cd", ""));
		setPctlLaneChkFlg(JSPUtil.getParameter(request, "pctl_lane_chk_flg", ""));
		setStupFlg(JSPUtil.getParameter(request, "stup_flg", ""));
		setIntrAsiaFlg(JSPUtil.getParameter(request, "intr_asia_flg", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setTrnsAtlanFlg(JSPUtil.getParameter(request, "trns_atlan_flg", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setVslLaneTpCd(JSPUtil.getParameter(request, "vsl_lane_tp_cd", ""));
		setIocCd(JSPUtil.getParameter(request, "ioc_cd", ""));
		setEurFlg(JSPUtil.getParameter(request, "eur_flg", ""));
		setPndlmLaneFlg(JSPUtil.getParameter(request, "pndlm_lane_flg", ""));
		setTrnsPcfFlg(JSPUtil.getParameter(request, "trns_pcf_flg", ""));
		setTrnkIptFlg(JSPUtil.getParameter(request, "trnk_ipt_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSlanCd(JSPUtil.getParameter(request, "slan_cd", ""));
		setSctrPrcFlg(JSPUtil.getParameter(request, "sctr_prc_flg", ""));
		setLaneTpHisFlg(JSPUtil.getParameter(request, "lane_tp_his_flg", ""));
		setSubTrdCd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaLaneRgstVO[]
	 */
	public CoaLaneRgstVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaLaneRgstVO[]
	 */
	public CoaLaneRgstVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaLaneRgstVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] pndlmLaneSeq = (JSPUtil.getParameter(request, prefix	+ "pndlm_lane_seq", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] subTrdDesc = (JSPUtil.getParameter(request, prefix	+ "sub_trd_desc", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] lodSplCngFlg = (JSPUtil.getParameter(request, prefix	+ "lod_spl_cng_flg", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] opLaneTpCd = (JSPUtil.getParameter(request, prefix	+ "op_lane_tp_cd", length));
			String[] pctlLaneChkFlg = (JSPUtil.getParameter(request, prefix	+ "pctl_lane_chk_flg", length));
			String[] stupFlg = (JSPUtil.getParameter(request, prefix	+ "stup_flg", length));
			String[] intrAsiaFlg = (JSPUtil.getParameter(request, prefix	+ "intr_asia_flg", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] trnsAtlanFlg = (JSPUtil.getParameter(request, prefix	+ "trns_atlan_flg", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] vslLaneTpCd = (JSPUtil.getParameter(request, prefix	+ "vsl_lane_tp_cd", length));
			String[] iocCd = (JSPUtil.getParameter(request, prefix	+ "ioc_cd", length));
			String[] eurFlg = (JSPUtil.getParameter(request, prefix	+ "eur_flg", length));
			String[] pndlmLaneFlg = (JSPUtil.getParameter(request, prefix	+ "pndlm_lane_flg", length));
			String[] trnsPcfFlg = (JSPUtil.getParameter(request, prefix	+ "trns_pcf_flg", length));
			String[] trnkIptFlg = (JSPUtil.getParameter(request, prefix	+ "trnk_ipt_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd", length));
			String[] sctrPrcFlg = (JSPUtil.getParameter(request, prefix	+ "sctr_prc_flg", length));
			String[] laneTpHisFlg = (JSPUtil.getParameter(request, prefix	+ "lane_tp_his_flg", length));
			String[] subTrdCd = (JSPUtil.getParameter(request, prefix	+ "sub_trd_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaLaneRgstVO();
				if (pndlmLaneSeq[i] != null)
					model.setPndlmLaneSeq(pndlmLaneSeq[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (subTrdDesc[i] != null)
					model.setSubTrdDesc(subTrdDesc[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (lodSplCngFlg[i] != null)
					model.setLodSplCngFlg(lodSplCngFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (opLaneTpCd[i] != null)
					model.setOpLaneTpCd(opLaneTpCd[i]);
				if (pctlLaneChkFlg[i] != null)
					model.setPctlLaneChkFlg(pctlLaneChkFlg[i]);
				if (stupFlg[i] != null)
					model.setStupFlg(stupFlg[i]);
				if (intrAsiaFlg[i] != null)
					model.setIntrAsiaFlg(intrAsiaFlg[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (trnsAtlanFlg[i] != null)
					model.setTrnsAtlanFlg(trnsAtlanFlg[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslLaneTpCd[i] != null)
					model.setVslLaneTpCd(vslLaneTpCd[i]);
				if (iocCd[i] != null)
					model.setIocCd(iocCd[i]);
				if (eurFlg[i] != null)
					model.setEurFlg(eurFlg[i]);
				if (pndlmLaneFlg[i] != null)
					model.setPndlmLaneFlg(pndlmLaneFlg[i]);
				if (trnsPcfFlg[i] != null)
					model.setTrnsPcfFlg(trnsPcfFlg[i]);
				if (trnkIptFlg[i] != null)
					model.setTrnkIptFlg(trnkIptFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (sctrPrcFlg[i] != null)
					model.setSctrPrcFlg(sctrPrcFlg[i]);
				if (laneTpHisFlg[i] != null)
					model.setLaneTpHisFlg(laneTpHisFlg[i]);
				if (subTrdCd[i] != null)
					model.setSubTrdCd(subTrdCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaLaneRgstVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaLaneRgstVO[]
	 */
	public CoaLaneRgstVO[] getCoaLaneRgstVOs(){
		CoaLaneRgstVO[] vos = (CoaLaneRgstVO[])models.toArray(new CoaLaneRgstVO[models.size()]);
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
		this.pndlmLaneSeq = this.pndlmLaneSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdDesc = this.subTrdDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lodSplCngFlg = this.lodSplCngFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opLaneTpCd = this.opLaneTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pctlLaneChkFlg = this.pctlLaneChkFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stupFlg = this.stupFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intrAsiaFlg = this.intrAsiaFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnsAtlanFlg = this.trnsAtlanFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslLaneTpCd = this.vslLaneTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iocCd = this.iocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eurFlg = this.eurFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pndlmLaneFlg = this.pndlmLaneFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnsPcfFlg = this.trnsPcfFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkIptFlg = this.trnkIptFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sctrPrcFlg = this.sctrPrcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.laneTpHisFlg = this.laneTpHisFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdCd = this.subTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
