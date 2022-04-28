/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SaqMonCfmTgtVvdVO.java
*@FileTitle : SaqMonCfmTgtVvdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 김민아
*@LastVersion : 1.0
* 2009.07.23 김민아 
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
 * @author 김민아
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SaqMonCfmTgtVvdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SaqMonCfmTgtVvdVO> models = new ArrayList<SaqMonCfmTgtVvdVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String fnlBsaCapa = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String bseMon = null;
	/* Column Info */
	private String bseQtrCd = null;
	/* Column Info */
	private String mqtaRlseVerNo = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String convDirCd = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String bsaGrpCd = null;
	/* Column Info */
	private String vvdSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String iocCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String bseYr = null;
	/* Column Info */
	private String bseWk = null;
	/* Column Info */
	private String sprtGrpCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String lstLodgPortEtdDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String subTrdCd = null;

	/* Column Info 추가(ESM_SAQ_0164)*/
	private String matchFlg   = null;
	private String seq        = null;
	private String laneGrp    = null;
	private String pBseMon    = null;
	private String pBseWk     = null;
	private String pVvd       = null;
	private String pBsa       = null;
	private String uBseMon    = null;
	private String uBseWk     = null;
	private String uVvd       = null;
	private String uBsa       = null;
	private String vvdCopy    = null;
	private String applVvd    = null;
	private String changeType = null;
	
	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SaqMonCfmTgtVvdVO() {}

	public SaqMonCfmTgtVvdVO(String ibflag, String pagerows, String mqtaRlseVerNo, String bseYr, String bseQtrCd, String bseMon, String trdCd, String rlaneCd, String dirCd, String vslCd, String skdVoyNo, String skdDirCd, String convDirCd, String sprtGrpCd, String bsaGrpCd, String bseWk, String subTrdCd, String iocCd, String vvdSeq, String fnlBsaCapa, String lstLodgPortEtdDt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.vslCd = vslCd;
		this.creDt = creDt;
		this.trdCd = trdCd;
		this.rlaneCd = rlaneCd;
		this.fnlBsaCapa = fnlBsaCapa;
		this.pagerows = pagerows;
		this.bseMon = bseMon;
		this.bseQtrCd = bseQtrCd;
		this.mqtaRlseVerNo = mqtaRlseVerNo;
		this.ibflag = ibflag;
		this.convDirCd = convDirCd;
		this.dirCd = dirCd;
		this.bsaGrpCd = bsaGrpCd;
		this.vvdSeq = vvdSeq;
		this.updUsrId = updUsrId;
		this.iocCd = iocCd;
		this.updDt = updDt;
		this.skdVoyNo = skdVoyNo;
		this.bseYr = bseYr;
		this.bseWk = bseWk;
		this.sprtGrpCd = sprtGrpCd;
		this.skdDirCd = skdDirCd;
		this.lstLodgPortEtdDt = lstLodgPortEtdDt;
		this.creUsrId = creUsrId;
		this.subTrdCd = subTrdCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("fnl_bsa_capa", getFnlBsaCapa());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("bse_mon", getBseMon());
		this.hashColumns.put("bse_qtr_cd", getBseQtrCd());
		this.hashColumns.put("mqta_rlse_ver_no", getMqtaRlseVerNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("conv_dir_cd", getConvDirCd());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("bsa_grp_cd", getBsaGrpCd());
		this.hashColumns.put("vvd_seq", getVvdSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("ioc_cd", getIocCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("bse_yr", getBseYr());
		this.hashColumns.put("bse_wk", getBseWk());
		this.hashColumns.put("sprt_grp_cd", getSprtGrpCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("lst_lodg_port_etd_dt", getLstLodgPortEtdDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("sub_trd_cd", getSubTrdCd());
		this.hashColumns.put("match_flg" , getMatchFlg());
		this.hashColumns.put("seq" , getSeq());
		this.hashColumns.put("lane_grp" , getLaneGrp());
		this.hashColumns.put("p_bse_mon" , getPBseMon());
		this.hashColumns.put("p_bse_wk" , getPBseWk());
		this.hashColumns.put("p_vvd" , getPVvd());
		this.hashColumns.put("p_fnl_bsa_capa" , getPBsa());
		this.hashColumns.put("u_bse_mon" , getUBseMon());
		this.hashColumns.put("u_bse_wk" , getUBseWk());
		this.hashColumns.put("u_vvd" , getUVvd());
		this.hashColumns.put("u_fnl_bsa_capa" , getUBsa());
		this.hashColumns.put("vvd_copy" , getVvdCopy());
		this.hashColumns.put("applied_vvd" , getApplVvd());
		this.hashColumns.put("change_type" , getChangeType());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("fnl_bsa_capa", "fnlBsaCapa");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("bse_mon", "bseMon");
		this.hashFields.put("bse_qtr_cd", "bseQtrCd");
		this.hashFields.put("mqta_rlse_ver_no", "mqtaRlseVerNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("conv_dir_cd", "convDirCd");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("bsa_grp_cd", "bsaGrpCd");
		this.hashFields.put("vvd_seq", "vvdSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("ioc_cd", "iocCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("bse_yr", "bseYr");
		this.hashFields.put("bse_wk", "bseWk");
		this.hashFields.put("sprt_grp_cd", "sprtGrpCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("lst_lodg_port_etd_dt", "lstLodgPortEtdDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("sub_trd_cd", "subTrdCd");
		this.hashFields.put("match_flg", "matchFlg");
		this.hashFields.put("seq", "seq");
		this.hashFields.put("lane_grp", "laneGrp");
		this.hashFields.put("p_bse_mon", "pBseMon");
		this.hashFields.put("p_bse_wk", "pBseWk");
		this.hashFields.put("p_vvd", "pVvd");
		this.hashFields.put("p_fnl_bsa_capa", "pBsa");
		this.hashFields.put("u_bse_mon", "uBseMon");
		this.hashFields.put("u_bse_wk", "uBseWk");
		this.hashFields.put("u_vvd", "uVvd");
		this.hashFields.put("u_fnl_bsa_capa", "uBsa");
		this.hashFields.put("vvd_copy", "vvdCopy");
		this.hashFields.put("applied_vvd", "applVvd");
		this.hashFields.put("change_type", "changeType");
		return this.hashFields;
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
	 * @return fnlBsaCapa
	 */
	public String getFnlBsaCapa() {
		return this.fnlBsaCapa;
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
	 * Column Info
	 * @return bseQtrCd
	 */
	public String getBseQtrCd() {
		return this.bseQtrCd;
	}
	
	/**
	 * Column Info
	 * @return mqtaRlseVerNo
	 */
	public String getMqtaRlseVerNo() {
		return this.mqtaRlseVerNo;
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
	 * @return convDirCd
	 */
	public String getConvDirCd() {
		return this.convDirCd;
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
	 * @return bsaGrpCd
	 */
	public String getBsaGrpCd() {
		return this.bsaGrpCd;
	}
	
	/**
	 * Column Info
	 * @return vvdSeq
	 */
	public String getVvdSeq() {
		return this.vvdSeq;
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
	 * @return iocCd
	 */
	public String getIocCd() {
		return this.iocCd;
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
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
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
	 * @return bseWk
	 */
	public String getBseWk() {
		return this.bseWk;
	}
	
	/**
	 * Column Info
	 * @return sprtGrpCd
	 */
	public String getSprtGrpCd() {
		return this.sprtGrpCd;
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
	 * @return lstLodgPortEtdDt
	 */
	public String getLstLodgPortEtdDt() {
		return this.lstLodgPortEtdDt;
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
	 * @return subTrdCd
	 */
	public String getSubTrdCd() {
		return this.subTrdCd;
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
	 * @param fnlBsaCapa
	 */
	public void setFnlBsaCapa(String fnlBsaCapa) {
		this.fnlBsaCapa = fnlBsaCapa;
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
	 * Column Info
	 * @param bseQtrCd
	 */
	public void setBseQtrCd(String bseQtrCd) {
		this.bseQtrCd = bseQtrCd;
	}
	
	/**
	 * Column Info
	 * @param mqtaRlseVerNo
	 */
	public void setMqtaRlseVerNo(String mqtaRlseVerNo) {
		this.mqtaRlseVerNo = mqtaRlseVerNo;
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
	 * @param convDirCd
	 */
	public void setConvDirCd(String convDirCd) {
		this.convDirCd = convDirCd;
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
	 * @param bsaGrpCd
	 */
	public void setBsaGrpCd(String bsaGrpCd) {
		this.bsaGrpCd = bsaGrpCd;
	}
	
	/**
	 * Column Info
	 * @param vvdSeq
	 */
	public void setVvdSeq(String vvdSeq) {
		this.vvdSeq = vvdSeq;
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
	 * @param iocCd
	 */
	public void setIocCd(String iocCd) {
		this.iocCd = iocCd;
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
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
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
	 * @param bseWk
	 */
	public void setBseWk(String bseWk) {
		this.bseWk = bseWk;
	}
	
	/**
	 * Column Info
	 * @param sprtGrpCd
	 */
	public void setSprtGrpCd(String sprtGrpCd) {
		this.sprtGrpCd = sprtGrpCd;
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
	 * @param lstLodgPortEtdDt
	 */
	public void setLstLodgPortEtdDt(String lstLodgPortEtdDt) {
		this.lstLodgPortEtdDt = lstLodgPortEtdDt;
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
	 * @param subTrdCd
	 */
	public void setSubTrdCd(String subTrdCd) {
		this.subTrdCd = subTrdCd;
	}
	
	public String getMatchFlg() {
		return matchFlg;
	}

	public void setMatchFlg(String matchFlg) {
		this.matchFlg = matchFlg;
	}

	public String getLaneGrp() {
		return laneGrp;
	}

	public void setLaneGrp(String laneGrp) {
		this.laneGrp = laneGrp;
	}

	public String getPBseMon() {
		return pBseMon;
	}

	public void setPBseMon(String bseMon) {
		pBseMon = bseMon;
	}

	public String getPBseWk() {
		return pBseWk;
	}

	public void setPBseWk(String bseWk) {
		pBseWk = bseWk;
	}

	public String getPVvd() {
		return pVvd;
	}

	public void setPVvd(String vvd) {
		pVvd = vvd;
	}

	public String getPBsa() {
		return pBsa;
	}

	public void setPBsa(String bsa) {
		pBsa = bsa;
	}

	public String getUBseMon() {
		return uBseMon;
	}

	public void setUBseMon(String bseMon) {
		uBseMon = bseMon;
	}

	public String getUBseWk() {
		return uBseWk;
	}

	public void setUBseWk(String bseWk) {
		uBseWk = bseWk;
	}

	public String getUVvd() {
		return uVvd;
	}

	public void setUVvd(String vvd) {
		uVvd = vvd;
	}

	public String getUBsa() {
		return uBsa;
	}

	public void setUBsa(String bsa) {
		uBsa = bsa;
	}

	public String getVvdCopy() {
		return vvdCopy;
	}

	public void setVvdCopy(String vvdCopy) {
		this.vvdCopy = vvdCopy;
	}

	public String getApplVvd() {
		return applVvd;
	}

	public void setApplVvd(String applVvd) {
		this.applVvd = applVvd;
	}
	
	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}
	
	public String getChangeType() {
		return changeType;
	}

	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setFnlBsaCapa(JSPUtil.getParameter(request, "fnl_bsa_capa", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setBseMon(JSPUtil.getParameter(request, "bse_mon", ""));
		setBseQtrCd(JSPUtil.getParameter(request, "bse_qtr_cd", ""));
		setMqtaRlseVerNo(JSPUtil.getParameter(request, "mqta_rlse_ver_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setConvDirCd(JSPUtil.getParameter(request, "conv_dir_cd", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setBsaGrpCd(JSPUtil.getParameter(request, "bsa_grp_cd", ""));
		setVvdSeq(JSPUtil.getParameter(request, "vvd_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setIocCd(JSPUtil.getParameter(request, "ioc_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setBseYr(JSPUtil.getParameter(request, "bse_yr", ""));
		setBseWk(JSPUtil.getParameter(request, "bse_wk", ""));
		setSprtGrpCd(JSPUtil.getParameter(request, "sprt_grp_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setLstLodgPortEtdDt(JSPUtil.getParameter(request, "lst_lodg_port_etd_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSubTrdCd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SaqMonCfmTgtVvdVO[]
	 */
	public SaqMonCfmTgtVvdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqMonCfmTgtVvdVO[]
	 */
	public SaqMonCfmTgtVvdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SaqMonCfmTgtVvdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "mqta_rlse_ver_no");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "mqta_rlse_ver_no").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] fnlBsaCapa = (JSPUtil.getParameter(request, prefix	+ "fnl_bsa_capa", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] bseMon = (JSPUtil.getParameter(request, prefix	+ "bse_mon", length));
			String[] bseQtrCd = (JSPUtil.getParameter(request, prefix	+ "bse_qtr_cd", length));
			String[] mqtaRlseVerNo = (JSPUtil.getParameter(request, prefix	+ "mqta_rlse_ver_no", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] convDirCd = (JSPUtil.getParameter(request, prefix	+ "conv_dir_cd", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] bsaGrpCd = (JSPUtil.getParameter(request, prefix	+ "bsa_grp_cd", length));
			String[] vvdSeq = (JSPUtil.getParameter(request, prefix	+ "vvd_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] iocCd = (JSPUtil.getParameter(request, prefix	+ "ioc_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] bseYr = (JSPUtil.getParameter(request, prefix	+ "bse_yr", length));
			String[] bseWk = (JSPUtil.getParameter(request, prefix	+ "bse_wk", length));
			String[] sprtGrpCd = (JSPUtil.getParameter(request, prefix	+ "sprt_grp_cd", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] lstLodgPortEtdDt = (JSPUtil.getParameter(request, prefix	+ "lst_lodg_port_etd_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] subTrdCd = (JSPUtil.getParameter(request, prefix	+ "sub_trd_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqMonCfmTgtVvdVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (fnlBsaCapa[i] != null)
					model.setFnlBsaCapa(fnlBsaCapa[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (bseMon[i] != null)
					model.setBseMon(bseMon[i]);
				if (bseQtrCd[i] != null)
					model.setBseQtrCd(bseQtrCd[i]);
				if (mqtaRlseVerNo[i] != null)
					model.setMqtaRlseVerNo(mqtaRlseVerNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (convDirCd[i] != null)
					model.setConvDirCd(convDirCd[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (bsaGrpCd[i] != null)
					model.setBsaGrpCd(bsaGrpCd[i]);
				if (vvdSeq[i] != null)
					model.setVvdSeq(vvdSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (iocCd[i] != null)
					model.setIocCd(iocCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (bseYr[i] != null)
					model.setBseYr(bseYr[i]);
				if (bseWk[i] != null)
					model.setBseWk(bseWk[i]);
				if (sprtGrpCd[i] != null)
					model.setSprtGrpCd(sprtGrpCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (lstLodgPortEtdDt[i] != null)
					model.setLstLodgPortEtdDt(lstLodgPortEtdDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (subTrdCd[i] != null)
					model.setSubTrdCd(subTrdCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqMonCfmTgtVvdVOs();
	}

//	/**
//	 * VVD Mapping (ESM_SAQ_0164)에 사용한 Parameter 로 재구성.
//	 * @param request
//	 * @param conVo
//	 * @return SaqMonCfmTgtVvdVO[]
//	 */
//	public SaqMonCfmTgtVvdVO[] fromRequestGrid(HttpServletRequest request, QuotaConditionVO conVo) {
//		SaqMonCfmTgtVvdVO model = null;
//		
//		String[] tmp = request.getParameterValues("seq");
//  		if(tmp == null)
//   			return null;
//
//  		int length = request.getParameterValues("seq").length;
//  
//		try {
//			
//			String changeMode       = conVo.getChangeMode();
//			String changeType		= conVo.getChangeType();
//			String mqtaRlseVerNo	= conVo.getMqtaRlseVerNo();
//			String bseYr			= conVo.getYear();
//			String bseQtrCd			= conVo.getQuarter();
//			String trdCd			= conVo.getTrade();
//			String dirCd			= conVo.getBound();
//			
////			String[] changeType     = (JSPUtil.getParameter(request, "change_type".trim()      , length));
////			String[] mqtaRlseVerNo  = (JSPUtil.getParameter(request, "mqta_rlse_ver_no".trim() , length));
////			String[] bseYr          = (JSPUtil.getParameter(request, "bse_yr".trim()           , length));
////			String[] bseQtrCd       = (JSPUtil.getParameter(request, "bse_qtr_cd".trim()       , length));
////			String[] trdCd          = (JSPUtil.getParameter(request, "trd_cd".trim()           , length));
////			String[] dirCd          = (JSPUtil.getParameter(request, "dir_cd".trim()           , length));
//			String[] matchFlg       = (JSPUtil.getParameter(request, "match_flg".trim()        , length));
//			String[] seq            = (JSPUtil.getParameter(request, "seq".trim()              , length));
//			String[] subTrdCd       = (JSPUtil.getParameter(request, "sub_trd_cd".trim()       , length));
//			String[] rlaneCd        = (JSPUtil.getParameter(request, "rlane_cd".trim()         , length));
//			String[] laneGrp        = (JSPUtil.getParameter(request, "p_group".trim()          , length));
//			String[] pBseMon        = (JSPUtil.getParameter(request, "p_bse_mon".trim()        , length));
//			String[] pBseWk         = (JSPUtil.getParameter(request, "p_bse_wk".trim()         , length));
//			String[] pVvd           = (JSPUtil.getParameter(request, "p_vvd".trim()            , length));
//			String[] pBsa           = (JSPUtil.getParameter(request, "p_fnl_bsa_capa".trim()   , length));
//			String[] uBseMon        = (JSPUtil.getParameter(request, "u_bse_mon".trim()        , length));
//			String[] uBseWk         = (JSPUtil.getParameter(request, "u_bse_wk".trim()         , length));
//			String[] uVvd           = (JSPUtil.getParameter(request, "u_vvd".trim()            , length));
//			String[] uBsa           = (JSPUtil.getParameter(request, "u_fnl_bsa_capa".trim()   , length));
//			String[] vvdCopy        = (JSPUtil.getParameter(request, "vvd_copy".trim()         , length));
//			String[] applVvd        = (JSPUtil.getParameter(request, "applied_vvd".trim()      , length));
//			String[] updUsrId       = (JSPUtil.getParameter(request, "upd_usr_id".trim()       , length));
//			
//			for (int i = 0; i < length; i++) {
//				model = new SaqMonCfmTgtVvdVO();
//				
//				//누락된 기존 로직 추가 2010.02.10 START
//				if(changeMode.equals("B") && changeType.equals("D")){
//					if(JSPUtil.getNull(matchFlg[i]).equals("D")){
//						
////						model.setMatch_flg(match_flg[i]);
////						model.setChange_type(change_type);
////						model.setSeq(rownum[i]);
////						model.setMqta_rlse_ver_no(mqta_rlse_ver_no);
////						model.setBse_yr(bse_yr);
////						model.setBse_qtr_cd(bse_qtr_cd);
////						model.setTrd_cd(trd_cd);
////						model.setDir_cd(dir_cd);
////						model.setSub_trd_cd(sub_trd_cd[i]);
////						model.setRlane_cd(rlane_cd[i]);
////						model.setLane_grp(lane_grp[i]);
////						model.setP_bse_mon(p_bse_mon[i]);
////						model.setP_bse_wk(p_bse_wk[i]);
////						model.setP_vvd(p_vvd[i]);
////						model.setP_fnl_bsa_capa(p_bsa[i]);
////						model.setU_bse_mon(u_bse_mon[i]);
////						model.setU_bse_wk(u_bse_wk[i]);
////						model.setU_vvd(u_vvd[i]);
////						model.setU_fnl_bsa_capa(u_bsa[i]);
////						model.setVvd_copy(vvd_copy[i]);
////						model.setApplied_vvd(appl_vvd[i]);
////						model.setUpd_usr_id(strUserId);
////						models.add(model);
//						
//						if (matchFlg[i] != null)
//							model.setIbflag(matchFlg[i]);
////						if (changeType[i] != null)
//						model.setChangeType(changeType); //변수
//						if (seq[i] != null)
//							model.setSeq(seq[i]);
////						if (mqtaRlseVerNo[i] != null)
//							model.setMqtaRlseVerNo(mqtaRlseVerNo); //변수
////						if (bseYr[i] != null)
//							model.setBseYr(bseYr); //변수
////						if (bseQtrCd[i] != null)
//							model.setBseQtrCd(bseQtrCd); //변수
////						if (trdCd[i] != null)
//							model.setTrdCd(trdCd); //변수
////						if (dirCd[i] != null)
//							model.setDirCd(dirCd); //변수						
//						if (rlaneCd[i] != null)
//							model.setRlaneCd(rlaneCd[i]);
//						if (subTrdCd[i] != null)
//							model.setSubTrdCd(subTrdCd[i]);
//						if (laneGrp[i] != null)
//							model.setLaneGrp(laneGrp[i]);
//						if (pBseMon[i] != null)
//							model.setPBseMon(pBseMon[i]);
//						if (pBseWk[i] != null)
//							model.setPBseWk(pBseWk[i]);
//						if (pVvd[i] != null)
//							model.setPVvd(pVvd[i]);
//						if (pBsa[i] != null)
//							model.setPBsa(pBsa[i]);
//						if (uBseMon[i] != null)
//							model.setUBseMon(uBseMon[i]);
//						if (uBseWk[i] != null)
//							model.setUBseWk(uBseWk[i]);
//						if (uVvd[i] != null)
//							model.setUVvd(uVvd[i]);
//						if (uBsa[i] != null)
//							model.setUBsa(uBsa[i]);
//						if (vvdCopy[i] != null)
//							model.setVvdCopy(vvdCopy[i]);
//						if (applVvd[i] != null)
//							model.setApplVvd(applVvd[i]);
//						if (updUsrId[i] != null)
//							model.setUpdUsrId(updUsrId[i]);
//						models.add(model);						
//						
//					}
//				} else if (!JSPUtil.getNull(matchFlg[i]).equals("Y") || changeType.equals("P")) {{
//					
////					model.setMatch_flg(match_flg[i]);
////					model.setChange_type(change_type);
////					model.setSeq(rownum[i]);
////					model.setMqta_rlse_ver_no(mqta_rlse_ver_no);
////					model.setBse_yr(bse_yr);
////					model.setBse_qtr_cd(bse_qtr_cd);
////					model.setTrd_cd(trd_cd);
////					model.setDir_cd(dir_cd);
////					model.setSub_trd_cd(sub_trd_cd[i]);
////					model.setRlane_cd(rlane_cd[i]);
////					model.setLane_grp(lane_grp[i]);
////					model.setP_bse_mon(p_bse_mon[i]);
////					model.setP_bse_wk(p_bse_wk[i]);
////					model.setP_vvd(p_vvd[i]);
////					model.setP_fnl_bsa_capa(p_bsa[i]);
////					model.setU_bse_mon(u_bse_mon[i]);
////					model.setU_bse_wk(u_bse_wk[i]);
////					model.setU_vvd(u_vvd[i]);
////					model.setU_fnl_bsa_capa(u_bsa[i]);
////					model.setVvd_copy(vvd_copy[i]);
////					model.setApplied_vvd(appl_vvd[i]);
////					model.setUpd_usr_id(strUserId);
////					models.add(model);
//					
//					if (matchFlg[i] != null)
//						model.setIbflag(matchFlg[i]);
////					if (changeType[i] != null)
//						model.setChangeType(changeType); //변수
//					if (seq[i] != null)
//						model.setSeq(seq[i]);
////					if (mqtaRlseVerNo[i] != null)
//						model.setMqtaRlseVerNo(mqtaRlseVerNo); //변수
////					if (bseYr[i] != null)
//						model.setBseYr(bseYr); //변수
////					if (bseQtrCd[i] != null)
//						model.setBseQtrCd(bseQtrCd); //변수
////					if (trdCd[i] != null)
//						model.setTrdCd(trdCd); //변수
////					if (dirCd[i] != null)
//						model.setDirCd(dirCd); //변수						
//					if (rlaneCd[i] != null)
//						model.setRlaneCd(rlaneCd[i]);
//					if (subTrdCd[i] != null)
//						model.setSubTrdCd(subTrdCd[i]);
//					if (laneGrp[i] != null)
//						model.setLaneGrp(laneGrp[i]);
//					if (pBseMon[i] != null)
//						model.setPBseMon(pBseMon[i]);
//					if (pBseWk[i] != null)
//						model.setPBseWk(pBseWk[i]);
//					if (pVvd[i] != null)
//						model.setPVvd(pVvd[i]);
//					if (pBsa[i] != null)
//						model.setPBsa(pBsa[i]);
//					if (uBseMon[i] != null)
//						model.setUBseMon(uBseMon[i]);
//					if (uBseWk[i] != null)
//						model.setUBseWk(uBseWk[i]);
//					if (uVvd[i] != null)
//						model.setUVvd(uVvd[i]);
//					if (uBsa[i] != null)
//						model.setUBsa(uBsa[i]);
//					if (vvdCopy[i] != null)
//						model.setVvdCopy(vvdCopy[i]);
//					if (applVvd[i] != null)
//						model.setApplVvd(applVvd[i]);
//					if (updUsrId[i] != null)
//						model.setUpdUsrId(updUsrId[i]);
//					models.add(model);		
//					}
//				}
//				//누락된 기존 로직 추가 2010.02.10 END				
//				
////				if (changeType[i] != null)
////					model.setChangeType(conVo.getChangeType()); //변수
////				if (mqtaRlseVerNo[i] != null)
////					model.setMqtaRlseVerNo(conVo.getMqtaRlseVerNo()); //변수
////				if (bseYr[i] != null)
////					model.setBseYr(conVo.getYear()); //변수
////				if (bseQtrCd[i] != null)
////					model.setBseQtrCd(conVo.getQuarter()); //변수
////				if (trdCd[i] != null)
////					model.setTrdCd(conVo.getTrade()); //변수
////				if (dirCd[i] != null)
////					model.setDirCd(conVo.getBound()); //변수
////				if (matchFlg[i] != null)
////					model.setIbflag(matchFlg[i]);
////				if (seq[i] != null)
////					model.setSeq(seq[i]);
////				if (rlaneCd[i] != null)
////					model.setRlaneCd(rlaneCd[i]);
////				if (subTrdCd[i] != null)
////					model.setSubTrdCd(subTrdCd[i]);
////				if (laneGrp[i] != null)
////					model.setLaneGrp(laneGrp[i]);
////				if (pBseMon[i] != null)
////					model.setPBseMon(pBseMon[i]);
////				if (pBseWk[i] != null)
////					model.setPBseWk(pBseWk[i]);
////				if (pVvd[i] != null)
////					model.setPVvd(pVvd[i]);
////				if (pBsa[i] != null)
////					model.setPBsa(pBsa[i]);
////				if (uBseMon[i] != null)
////					model.setUBseMon(uBseMon[i]);
////				if (uBseWk[i] != null)
////					model.setUBseWk(uBseWk[i]);
////				if (uVvd[i] != null)
////					model.setUVvd(uVvd[i]);
////				if (uBsa[i] != null)
////					model.setUBsa(uBsa[i]);
////				if (vvdCopy[i] != null)
////					model.setVvdCopy(vvdCopy[i]);
////				if (applVvd[i] != null)
////					model.setApplVvd(applVvd[i]);
////				if (updUsrId[i] != null)
////					model.setUpdUsrId(updUsrId[i]);
////				models.add(model);
//			}
//
//		} catch (Exception e) {
//			return null;
//		}
//		return getSaqMonCfmTgtVvdVOs();
//	}
	
	/**
	 * VO 배열을 반환
	 * @return SaqMonCfmTgtVvdVO[]
	 */
	public SaqMonCfmTgtVvdVO[] getSaqMonCfmTgtVvdVOs(){
		SaqMonCfmTgtVvdVO[] vos = (SaqMonCfmTgtVvdVO[])models.toArray(new SaqMonCfmTgtVvdVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fnlBsaCapa = this.fnlBsaCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseMon = this.bseMon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseQtrCd = this.bseQtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mqtaRlseVerNo = this.mqtaRlseVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.convDirCd = this.convDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsaGrpCd = this.bsaGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdSeq = this.vvdSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iocCd = this.iocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseYr = this.bseYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseWk = this.bseWk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sprtGrpCd = this.sprtGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstLodgPortEtdDt = this.lstLodgPortEtdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdCd = this.subTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
