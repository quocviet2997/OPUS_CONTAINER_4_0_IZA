/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : JooStlVvdVO.java
*@FileTitle : JooStlVvdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.08
*@LastModifier : 박희동
*@LastVersion : 1.0
* 2009.10.08 박희동 
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
 * @author 박희동
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class JooStlVvdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<JooStlVvdVO> models = new ArrayList<JooStlVvdVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String bzcPortEtdDt = null;
	/* Column Info */
	private String pairPortEtaDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String pairPortEtdDt = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String joStlItmCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String revDirCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String agmtPortCondCd = null;
	/* Column Info */
	private String ucBssPortCd = null;
	/* Column Info */
	private String joMnuNm = null;
	/* Column Info */
	private String stlBzcPortCd = null;
	/* Column Info */
	private String bzcPortEtaDt = null;
	/* Column Info */
	private String ucBssPortEtdDt = null;
	/* Column Info */
	private String stlTgtVvdBssCd = null;
	/* Column Info */
	private String agmtOpTpCondCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String stlVvdSeq = null;
	/* Column Info */
	private String stlRmk = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String procJbFlg = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String joCrrCd = null;
	/* Column Info */
	private String agmtPortTpCondCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String acctYrmon = null;
	/* Column Info */
	private String joStlCfmCd = null;
	/* Column Info */
	private String agmtMonCondCd = null;
	/* Column Info */
	private String reDivrCd = null;
	/* Column Info */
	private String stlPairPortCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public JooStlVvdVO() {}

	public JooStlVvdVO(String ibflag, String pagerows, String acctYrmon, String stlVvdSeq, String trdCd, String joCrrCd, String rlaneCd, String reDivrCd, String joStlItmCd, String joMnuNm, String vslCd, String skdVoyNo, String skdDirCd, String revDirCd, String stlBzcPortCd, String bzcPortEtaDt, String bzcPortEtdDt, String stlPairPortCd, String pairPortEtaDt, String pairPortEtdDt, String stlTgtVvdBssCd, String joStlCfmCd, String procJbFlg, String stlRmk, String creDt, String creUsrId, String updDt, String updUsrId, String ucBssPortCd, String ucBssPortEtdDt, String agmtMonCondCd, String agmtPortCondCd, String agmtPortTpCondCd, String agmtOpTpCondCd) {
		this.vslCd = vslCd;
		this.bzcPortEtdDt = bzcPortEtdDt;
		this.pairPortEtaDt = pairPortEtaDt;
		this.creDt = creDt;
		this.trdCd = trdCd;
		this.pairPortEtdDt = pairPortEtdDt;
		this.rlaneCd = rlaneCd;
		this.joStlItmCd = joStlItmCd;
		this.pagerows = pagerows;
		this.revDirCd = revDirCd;
		this.ibflag = ibflag;
		this.agmtPortCondCd = agmtPortCondCd;
		this.ucBssPortCd = ucBssPortCd;
		this.joMnuNm = joMnuNm;
		this.stlBzcPortCd = stlBzcPortCd;
		this.bzcPortEtaDt = bzcPortEtaDt;
		this.ucBssPortEtdDt = ucBssPortEtdDt;
		this.stlTgtVvdBssCd = stlTgtVvdBssCd;
		this.agmtOpTpCondCd = agmtOpTpCondCd;
		this.updUsrId = updUsrId;
		this.stlVvdSeq = stlVvdSeq;
		this.stlRmk = stlRmk;
		this.updDt = updDt;
		this.procJbFlg = procJbFlg;
		this.skdVoyNo = skdVoyNo;
		this.joCrrCd = joCrrCd;
		this.agmtPortTpCondCd = agmtPortTpCondCd;
		this.skdDirCd = skdDirCd;
		this.creUsrId = creUsrId;
		this.acctYrmon = acctYrmon;
		this.joStlCfmCd = joStlCfmCd;
		this.agmtMonCondCd = agmtMonCondCd;
		this.reDivrCd = reDivrCd;
		this.stlPairPortCd = stlPairPortCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("bzc_port_etd_dt", getBzcPortEtdDt());
		this.hashColumns.put("pair_port_eta_dt", getPairPortEtaDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("pair_port_etd_dt", getPairPortEtdDt());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("jo_stl_itm_cd", getJoStlItmCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("rev_dir_cd", getRevDirCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("agmt_port_cond_cd", getAgmtPortCondCd());
		this.hashColumns.put("uc_bss_port_cd", getUcBssPortCd());
		this.hashColumns.put("jo_mnu_nm", getJoMnuNm());
		this.hashColumns.put("stl_bzc_port_cd", getStlBzcPortCd());
		this.hashColumns.put("bzc_port_eta_dt", getBzcPortEtaDt());
		this.hashColumns.put("uc_bss_port_etd_dt", getUcBssPortEtdDt());
		this.hashColumns.put("stl_tgt_vvd_bss_cd", getStlTgtVvdBssCd());
		this.hashColumns.put("agmt_op_tp_cond_cd", getAgmtOpTpCondCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("stl_vvd_seq", getStlVvdSeq());
		this.hashColumns.put("stl_rmk", getStlRmk());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("proc_jb_flg", getProcJbFlg());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("jo_crr_cd", getJoCrrCd());
		this.hashColumns.put("agmt_port_tp_cond_cd", getAgmtPortTpCondCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("acct_yrmon", getAcctYrmon());
		this.hashColumns.put("jo_stl_cfm_cd", getJoStlCfmCd());
		this.hashColumns.put("agmt_mon_cond_cd", getAgmtMonCondCd());
		this.hashColumns.put("re_divr_cd", getReDivrCd());
		this.hashColumns.put("stl_pair_port_cd", getStlPairPortCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("bzc_port_etd_dt", "bzcPortEtdDt");
		this.hashFields.put("pair_port_eta_dt", "pairPortEtaDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("pair_port_etd_dt", "pairPortEtdDt");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("jo_stl_itm_cd", "joStlItmCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("rev_dir_cd", "revDirCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("agmt_port_cond_cd", "agmtPortCondCd");
		this.hashFields.put("uc_bss_port_cd", "ucBssPortCd");
		this.hashFields.put("jo_mnu_nm", "joMnuNm");
		this.hashFields.put("stl_bzc_port_cd", "stlBzcPortCd");
		this.hashFields.put("bzc_port_eta_dt", "bzcPortEtaDt");
		this.hashFields.put("uc_bss_port_etd_dt", "ucBssPortEtdDt");
		this.hashFields.put("stl_tgt_vvd_bss_cd", "stlTgtVvdBssCd");
		this.hashFields.put("agmt_op_tp_cond_cd", "agmtOpTpCondCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("stl_vvd_seq", "stlVvdSeq");
		this.hashFields.put("stl_rmk", "stlRmk");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("proc_jb_flg", "procJbFlg");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("jo_crr_cd", "joCrrCd");
		this.hashFields.put("agmt_port_tp_cond_cd", "agmtPortTpCondCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("acct_yrmon", "acctYrmon");
		this.hashFields.put("jo_stl_cfm_cd", "joStlCfmCd");
		this.hashFields.put("agmt_mon_cond_cd", "agmtMonCondCd");
		this.hashFields.put("re_divr_cd", "reDivrCd");
		this.hashFields.put("stl_pair_port_cd", "stlPairPortCd");
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
	 * @return bzcPortEtdDt
	 */
	public String getBzcPortEtdDt() {
		return this.bzcPortEtdDt;
	}
	
	/**
	 * Column Info
	 * @return pairPortEtaDt
	 */
	public String getPairPortEtaDt() {
		return this.pairPortEtaDt;
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
	 * @return pairPortEtdDt
	 */
	public String getPairPortEtdDt() {
		return this.pairPortEtdDt;
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
	 * @return joStlItmCd
	 */
	public String getJoStlItmCd() {
		return this.joStlItmCd;
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
	 * @return revDirCd
	 */
	public String getRevDirCd() {
		return this.revDirCd;
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
	 * @return agmtPortCondCd
	 */
	public String getAgmtPortCondCd() {
		return this.agmtPortCondCd;
	}
	
	/**
	 * Column Info
	 * @return ucBssPortCd
	 */
	public String getUcBssPortCd() {
		return this.ucBssPortCd;
	}
	
	/**
	 * Column Info
	 * @return joMnuNm
	 */
	public String getJoMnuNm() {
		return this.joMnuNm;
	}
	
	/**
	 * Column Info
	 * @return stlBzcPortCd
	 */
	public String getStlBzcPortCd() {
		return this.stlBzcPortCd;
	}
	
	/**
	 * Column Info
	 * @return bzcPortEtaDt
	 */
	public String getBzcPortEtaDt() {
		return this.bzcPortEtaDt;
	}
	
	/**
	 * Column Info
	 * @return ucBssPortEtdDt
	 */
	public String getUcBssPortEtdDt() {
		return this.ucBssPortEtdDt;
	}
	
	/**
	 * Column Info
	 * @return stlTgtVvdBssCd
	 */
	public String getStlTgtVvdBssCd() {
		return this.stlTgtVvdBssCd;
	}
	
	/**
	 * Column Info
	 * @return agmtOpTpCondCd
	 */
	public String getAgmtOpTpCondCd() {
		return this.agmtOpTpCondCd;
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
	 * @return stlVvdSeq
	 */
	public String getStlVvdSeq() {
		return this.stlVvdSeq;
	}
	
	/**
	 * Column Info
	 * @return stlRmk
	 */
	public String getStlRmk() {
		return this.stlRmk;
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
	 * @return procJbFlg
	 */
	public String getProcJbFlg() {
		return this.procJbFlg;
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
	 * @return joCrrCd
	 */
	public String getJoCrrCd() {
		return this.joCrrCd;
	}
	
	/**
	 * Column Info
	 * @return agmtPortTpCondCd
	 */
	public String getAgmtPortTpCondCd() {
		return this.agmtPortTpCondCd;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return acctYrmon
	 */
	public String getAcctYrmon() {
		return this.acctYrmon;
	}
	
	/**
	 * Column Info
	 * @return joStlCfmCd
	 */
	public String getJoStlCfmCd() {
		return this.joStlCfmCd;
	}
	
	/**
	 * Column Info
	 * @return agmtMonCondCd
	 */
	public String getAgmtMonCondCd() {
		return this.agmtMonCondCd;
	}
	
	/**
	 * Column Info
	 * @return reDivrCd
	 */
	public String getReDivrCd() {
		return this.reDivrCd;
	}
	
	/**
	 * Column Info
	 * @return stlPairPortCd
	 */
	public String getStlPairPortCd() {
		return this.stlPairPortCd;
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
	 * @param bzcPortEtdDt
	 */
	public void setBzcPortEtdDt(String bzcPortEtdDt) {
		this.bzcPortEtdDt = bzcPortEtdDt;
	}
	
	/**
	 * Column Info
	 * @param pairPortEtaDt
	 */
	public void setPairPortEtaDt(String pairPortEtaDt) {
		this.pairPortEtaDt = pairPortEtaDt;
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
	 * @param pairPortEtdDt
	 */
	public void setPairPortEtdDt(String pairPortEtdDt) {
		this.pairPortEtdDt = pairPortEtdDt;
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
	 * @param joStlItmCd
	 */
	public void setJoStlItmCd(String joStlItmCd) {
		this.joStlItmCd = joStlItmCd;
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
	 * @param revDirCd
	 */
	public void setRevDirCd(String revDirCd) {
		this.revDirCd = revDirCd;
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
	 * @param agmtPortCondCd
	 */
	public void setAgmtPortCondCd(String agmtPortCondCd) {
		this.agmtPortCondCd = agmtPortCondCd;
	}
	
	/**
	 * Column Info
	 * @param ucBssPortCd
	 */
	public void setUcBssPortCd(String ucBssPortCd) {
		this.ucBssPortCd = ucBssPortCd;
	}
	
	/**
	 * Column Info
	 * @param joMnuNm
	 */
	public void setJoMnuNm(String joMnuNm) {
		this.joMnuNm = joMnuNm;
	}
	
	/**
	 * Column Info
	 * @param stlBzcPortCd
	 */
	public void setStlBzcPortCd(String stlBzcPortCd) {
		this.stlBzcPortCd = stlBzcPortCd;
	}
	
	/**
	 * Column Info
	 * @param bzcPortEtaDt
	 */
	public void setBzcPortEtaDt(String bzcPortEtaDt) {
		this.bzcPortEtaDt = bzcPortEtaDt;
	}
	
	/**
	 * Column Info
	 * @param ucBssPortEtdDt
	 */
	public void setUcBssPortEtdDt(String ucBssPortEtdDt) {
		this.ucBssPortEtdDt = ucBssPortEtdDt;
	}
	
	/**
	 * Column Info
	 * @param stlTgtVvdBssCd
	 */
	public void setStlTgtVvdBssCd(String stlTgtVvdBssCd) {
		this.stlTgtVvdBssCd = stlTgtVvdBssCd;
	}
	
	/**
	 * Column Info
	 * @param agmtOpTpCondCd
	 */
	public void setAgmtOpTpCondCd(String agmtOpTpCondCd) {
		this.agmtOpTpCondCd = agmtOpTpCondCd;
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
	 * @param stlVvdSeq
	 */
	public void setStlVvdSeq(String stlVvdSeq) {
		this.stlVvdSeq = stlVvdSeq;
	}
	
	/**
	 * Column Info
	 * @param stlRmk
	 */
	public void setStlRmk(String stlRmk) {
		this.stlRmk = stlRmk;
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
	 * @param procJbFlg
	 */
	public void setProcJbFlg(String procJbFlg) {
		this.procJbFlg = procJbFlg;
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
	 * @param joCrrCd
	 */
	public void setJoCrrCd(String joCrrCd) {
		this.joCrrCd = joCrrCd;
	}
	
	/**
	 * Column Info
	 * @param agmtPortTpCondCd
	 */
	public void setAgmtPortTpCondCd(String agmtPortTpCondCd) {
		this.agmtPortTpCondCd = agmtPortTpCondCd;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param acctYrmon
	 */
	public void setAcctYrmon(String acctYrmon) {
		this.acctYrmon = acctYrmon;
	}
	
	/**
	 * Column Info
	 * @param joStlCfmCd
	 */
	public void setJoStlCfmCd(String joStlCfmCd) {
		this.joStlCfmCd = joStlCfmCd;
	}
	
	/**
	 * Column Info
	 * @param agmtMonCondCd
	 */
	public void setAgmtMonCondCd(String agmtMonCondCd) {
		this.agmtMonCondCd = agmtMonCondCd;
	}
	
	/**
	 * Column Info
	 * @param reDivrCd
	 */
	public void setReDivrCd(String reDivrCd) {
		this.reDivrCd = reDivrCd;
	}
	
	/**
	 * Column Info
	 * @param stlPairPortCd
	 */
	public void setStlPairPortCd(String stlPairPortCd) {
		this.stlPairPortCd = stlPairPortCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setBzcPortEtdDt(JSPUtil.getParameter(request, "bzc_port_etd_dt", ""));
		setPairPortEtaDt(JSPUtil.getParameter(request, "pair_port_eta_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setPairPortEtdDt(JSPUtil.getParameter(request, "pair_port_etd_dt", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setJoStlItmCd(JSPUtil.getParameter(request, "jo_stl_itm_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setRevDirCd(JSPUtil.getParameter(request, "rev_dir_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAgmtPortCondCd(JSPUtil.getParameter(request, "agmt_port_cond_cd", ""));
		setUcBssPortCd(JSPUtil.getParameter(request, "uc_bss_port_cd", ""));
		setJoMnuNm(JSPUtil.getParameter(request, "jo_mnu_nm", ""));
		setStlBzcPortCd(JSPUtil.getParameter(request, "stl_bzc_port_cd", ""));
		setBzcPortEtaDt(JSPUtil.getParameter(request, "bzc_port_eta_dt", ""));
		setUcBssPortEtdDt(JSPUtil.getParameter(request, "uc_bss_port_etd_dt", ""));
		setStlTgtVvdBssCd(JSPUtil.getParameter(request, "stl_tgt_vvd_bss_cd", ""));
		setAgmtOpTpCondCd(JSPUtil.getParameter(request, "agmt_op_tp_cond_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setStlVvdSeq(JSPUtil.getParameter(request, "stl_vvd_seq", ""));
		setStlRmk(JSPUtil.getParameter(request, "stl_rmk", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setProcJbFlg(JSPUtil.getParameter(request, "proc_jb_flg", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setJoCrrCd(JSPUtil.getParameter(request, "jo_crr_cd", ""));
		setAgmtPortTpCondCd(JSPUtil.getParameter(request, "agmt_port_tp_cond_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setAcctYrmon(JSPUtil.getParameter(request, "acct_yrmon", ""));
		setJoStlCfmCd(JSPUtil.getParameter(request, "jo_stl_cfm_cd", ""));
		setAgmtMonCondCd(JSPUtil.getParameter(request, "agmt_mon_cond_cd", ""));
		setReDivrCd(JSPUtil.getParameter(request, "re_divr_cd", ""));
		setStlPairPortCd(JSPUtil.getParameter(request, "stl_pair_port_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return JooStlVvdVO[]
	 */
	public JooStlVvdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return JooStlVvdVO[]
	 */
	public JooStlVvdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		JooStlVvdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] bzcPortEtdDt = (JSPUtil.getParameter(request, prefix	+ "bzc_port_etd_dt", length));
			String[] pairPortEtaDt = (JSPUtil.getParameter(request, prefix	+ "pair_port_eta_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] pairPortEtdDt = (JSPUtil.getParameter(request, prefix	+ "pair_port_etd_dt", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] joStlItmCd = (JSPUtil.getParameter(request, prefix	+ "jo_stl_itm_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] revDirCd = (JSPUtil.getParameter(request, prefix	+ "rev_dir_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] agmtPortCondCd = (JSPUtil.getParameter(request, prefix	+ "agmt_port_cond_cd", length));
			String[] ucBssPortCd = (JSPUtil.getParameter(request, prefix	+ "uc_bss_port_cd", length));
			String[] joMnuNm = (JSPUtil.getParameter(request, prefix	+ "jo_mnu_nm", length));
			String[] stlBzcPortCd = (JSPUtil.getParameter(request, prefix	+ "stl_bzc_port_cd", length));
			String[] bzcPortEtaDt = (JSPUtil.getParameter(request, prefix	+ "bzc_port_eta_dt", length));
			String[] ucBssPortEtdDt = (JSPUtil.getParameter(request, prefix	+ "uc_bss_port_etd_dt", length));
			String[] stlTgtVvdBssCd = (JSPUtil.getParameter(request, prefix	+ "stl_tgt_vvd_bss_cd", length));
			String[] agmtOpTpCondCd = (JSPUtil.getParameter(request, prefix	+ "agmt_op_tp_cond_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] stlVvdSeq = (JSPUtil.getParameter(request, prefix	+ "stl_vvd_seq", length));
			String[] stlRmk = (JSPUtil.getParameter(request, prefix	+ "stl_rmk", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] procJbFlg = (JSPUtil.getParameter(request, prefix	+ "proc_jb_flg", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] joCrrCd = (JSPUtil.getParameter(request, prefix	+ "jo_crr_cd", length));
			String[] agmtPortTpCondCd = (JSPUtil.getParameter(request, prefix	+ "agmt_port_tp_cond_cd", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] acctYrmon = (JSPUtil.getParameter(request, prefix	+ "acct_yrmon", length));
			String[] joStlCfmCd = (JSPUtil.getParameter(request, prefix	+ "jo_stl_cfm_cd", length));
			String[] agmtMonCondCd = (JSPUtil.getParameter(request, prefix	+ "agmt_mon_cond_cd", length));
			String[] reDivrCd = (JSPUtil.getParameter(request, prefix	+ "re_divr_cd", length));
			String[] stlPairPortCd = (JSPUtil.getParameter(request, prefix	+ "stl_pair_port_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new JooStlVvdVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (bzcPortEtdDt[i] != null)
					model.setBzcPortEtdDt(bzcPortEtdDt[i]);
				if (pairPortEtaDt[i] != null)
					model.setPairPortEtaDt(pairPortEtaDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (pairPortEtdDt[i] != null)
					model.setPairPortEtdDt(pairPortEtdDt[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (joStlItmCd[i] != null)
					model.setJoStlItmCd(joStlItmCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (revDirCd[i] != null)
					model.setRevDirCd(revDirCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (agmtPortCondCd[i] != null)
					model.setAgmtPortCondCd(agmtPortCondCd[i]);
				if (ucBssPortCd[i] != null)
					model.setUcBssPortCd(ucBssPortCd[i]);
				if (joMnuNm[i] != null)
					model.setJoMnuNm(joMnuNm[i]);
				if (stlBzcPortCd[i] != null)
					model.setStlBzcPortCd(stlBzcPortCd[i]);
				if (bzcPortEtaDt[i] != null)
					model.setBzcPortEtaDt(bzcPortEtaDt[i]);
				if (ucBssPortEtdDt[i] != null)
					model.setUcBssPortEtdDt(ucBssPortEtdDt[i]);
				if (stlTgtVvdBssCd[i] != null)
					model.setStlTgtVvdBssCd(stlTgtVvdBssCd[i]);
				if (agmtOpTpCondCd[i] != null)
					model.setAgmtOpTpCondCd(agmtOpTpCondCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (stlVvdSeq[i] != null)
					model.setStlVvdSeq(stlVvdSeq[i]);
				if (stlRmk[i] != null)
					model.setStlRmk(stlRmk[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (procJbFlg[i] != null)
					model.setProcJbFlg(procJbFlg[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (joCrrCd[i] != null)
					model.setJoCrrCd(joCrrCd[i]);
				if (agmtPortTpCondCd[i] != null)
					model.setAgmtPortTpCondCd(agmtPortTpCondCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (acctYrmon[i] != null)
					model.setAcctYrmon(acctYrmon[i]);
				if (joStlCfmCd[i] != null)
					model.setJoStlCfmCd(joStlCfmCd[i]);
				if (agmtMonCondCd[i] != null)
					model.setAgmtMonCondCd(agmtMonCondCd[i]);
				if (reDivrCd[i] != null)
					model.setReDivrCd(reDivrCd[i]);
				if (stlPairPortCd[i] != null)
					model.setStlPairPortCd(stlPairPortCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getJooStlVvdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return JooStlVvdVO[]
	 */
	public JooStlVvdVO[] getJooStlVvdVOs(){
		JooStlVvdVO[] vos = (JooStlVvdVO[])models.toArray(new JooStlVvdVO[models.size()]);
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
		this.bzcPortEtdDt = this.bzcPortEtdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pairPortEtaDt = this.pairPortEtaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pairPortEtdDt = this.pairPortEtdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joStlItmCd = this.joStlItmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revDirCd = this.revDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtPortCondCd = this.agmtPortCondCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ucBssPortCd = this.ucBssPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joMnuNm = this.joMnuNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlBzcPortCd = this.stlBzcPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bzcPortEtaDt = this.bzcPortEtaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ucBssPortEtdDt = this.ucBssPortEtdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlTgtVvdBssCd = this.stlTgtVvdBssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOpTpCondCd = this.agmtOpTpCondCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlVvdSeq = this.stlVvdSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlRmk = this.stlRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.procJbFlg = this.procJbFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joCrrCd = this.joCrrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtPortTpCondCd = this.agmtPortTpCondCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctYrmon = this.acctYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joStlCfmCd = this.joStlCfmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtMonCondCd = this.agmtMonCondCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.reDivrCd = this.reDivrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlPairPortCd = this.stlPairPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
