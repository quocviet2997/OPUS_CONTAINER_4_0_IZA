/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : AgtAgnAgmtVO.java
*@FileTitle : AgtAgnAgmtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.10.06
*@LastModifier : 박성진
*@LastVersion : 1.0
* 2010.10.06 박성진 
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
 * @author 박성진
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class AgtAgnAgmtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<AgtAgnAgmtVO> models = new ArrayList<AgtAgnAgmtVO>();
	
	/* Column Info */
	private String vndrCntCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String sAgmtSts = null;
	/* Column Info */
	private String usrofccd = null;
	/* Column Info */
	private String vndrLglEngNm = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String oldAgnAgmtSeq = null;
	/* Column Info */
	private String agnAgmtVerSeqValue = null;
	/* Column Info */
	private String agmtOfcCd = null;
	/* Column Info */
	private String vndrSeqValue = null;
	/* Column Info */
	private String vndrCntCdValue = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String agnAgmtSeq = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String usrOfcCd = null;
	/* Column Info */
	private String agmtOfcCdValue = null;
	/* Column Info */
	private String current = null;
	/* Column Info */
	private String fmEffDt = null;
	/* Column Info */
	private String ofcChrLvl = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String agreementNo = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String agmtOfcCtyCdValue = null;
	/* Column Info */
	private String agnAgmtSeqValue = null;
	/* Column Info */
	private String toEffDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String sAgnAgmtSeq = null;
	/* Column Info */
	private String sAgmtOfcCd = null;
	/* Column Info */
	private String agnAgmtVerSeq = null;
	/* Column Info */
	private String agnAgmtRmk = null;
	/* Column Info */
	private String xchRtDivLvl = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String agmtOfcCtyCd = null;
	/* Column Info */
	private String sAgmtOfcCtyCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public AgtAgnAgmtVO() {}

	public AgtAgnAgmtVO(String ibflag, String pagerows, String vndrCntCd, String deltFlg, String creDt, String vndrLglEngNm, String usrofccd, String oldAgnAgmtSeq, String agnAgmtVerSeqValue, String vndrCntCdValue, String vndrSeqValue, String agmtOfcCd, String agnAgmtSeq, String usrOfcCd, String agmtOfcCdValue, String current, String fmEffDt, String ofcChrLvl, String updUsrId, String agreementNo, String updDt, String agmtOfcCtyCdValue, String agnAgmtSeqValue, String toEffDt, String creUsrId, String agnAgmtRmk, String agnAgmtVerSeq, String agmtOfcCtyCd, String vndrSeq, String xchRtDivLvl, String sAgmtOfcCd, String sAgmtOfcCtyCd, String sAgnAgmtSeq, String sAgmtSts) {
		this.vndrCntCd = vndrCntCd;
		this.deltFlg = deltFlg;
		this.sAgmtSts = sAgmtSts;
		this.usrofccd = usrofccd;
		this.vndrLglEngNm = vndrLglEngNm;
		this.creDt = creDt;
		this.oldAgnAgmtSeq = oldAgnAgmtSeq;
		this.agnAgmtVerSeqValue = agnAgmtVerSeqValue;
		this.agmtOfcCd = agmtOfcCd;
		this.vndrSeqValue = vndrSeqValue;
		this.vndrCntCdValue = vndrCntCdValue;
		this.pagerows = pagerows;
		this.agnAgmtSeq = agnAgmtSeq;
		this.ibflag = ibflag;
		this.usrOfcCd = usrOfcCd;
		this.agmtOfcCdValue = agmtOfcCdValue;
		this.current = current;
		this.fmEffDt = fmEffDt;
		this.ofcChrLvl = ofcChrLvl;
		this.updUsrId = updUsrId;
		this.agreementNo = agreementNo;
		this.updDt = updDt;
		this.agmtOfcCtyCdValue = agmtOfcCtyCdValue;
		this.agnAgmtSeqValue = agnAgmtSeqValue;
		this.toEffDt = toEffDt;
		this.creUsrId = creUsrId;
		this.sAgnAgmtSeq = sAgnAgmtSeq;
		this.sAgmtOfcCd = sAgmtOfcCd;
		this.agnAgmtVerSeq = agnAgmtVerSeq;
		this.agnAgmtRmk = agnAgmtRmk;
		this.xchRtDivLvl = xchRtDivLvl;
		this.vndrSeq = vndrSeq;
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		this.sAgmtOfcCtyCd = sAgmtOfcCtyCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vndr_cnt_cd", getVndrCntCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("s_agmt_sts", getSAgmtSts());
		this.hashColumns.put("usrofccd", getUsrofccd());
		this.hashColumns.put("vndr_lgl_eng_nm", getVndrLglEngNm());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("old_agn_agmt_seq", getOldAgnAgmtSeq());
		this.hashColumns.put("agn_agmt_ver_seq_value", getAgnAgmtVerSeqValue());
		this.hashColumns.put("agmt_ofc_cd", getAgmtOfcCd());
		this.hashColumns.put("vndr_seq_value", getVndrSeqValue());
		this.hashColumns.put("vndr_cnt_cd_value", getVndrCntCdValue());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("agn_agmt_seq", getAgnAgmtSeq());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("usr_ofc_cd", getUsrOfcCd());
		this.hashColumns.put("agmt_ofc_cd_value", getAgmtOfcCdValue());
		this.hashColumns.put("current", getCurrent());
		this.hashColumns.put("fm_eff_dt", getFmEffDt());
		this.hashColumns.put("ofc_chr_lvl", getOfcChrLvl());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("agreement_no", getAgreementNo());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("agmt_ofc_cty_cd_value", getAgmtOfcCtyCdValue());
		this.hashColumns.put("agn_agmt_seq_value", getAgnAgmtSeqValue());
		this.hashColumns.put("to_eff_dt", getToEffDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("s_agn_agmt_seq", getSAgnAgmtSeq());
		this.hashColumns.put("s_agmt_ofc_cd", getSAgmtOfcCd());
		this.hashColumns.put("agn_agmt_ver_seq", getAgnAgmtVerSeq());
		this.hashColumns.put("agn_agmt_rmk", getAgnAgmtRmk());
		this.hashColumns.put("xch_rt_div_lvl", getXchRtDivLvl());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("agmt_ofc_cty_cd", getAgmtOfcCtyCd());
		this.hashColumns.put("s_agmt_ofc_cty_cd", getSAgmtOfcCtyCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vndr_cnt_cd", "vndrCntCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("s_agmt_sts", "sAgmtSts");
		this.hashFields.put("usrofccd", "usrofccd");
		this.hashFields.put("vndr_lgl_eng_nm", "vndrLglEngNm");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("old_agn_agmt_seq", "oldAgnAgmtSeq");
		this.hashFields.put("agn_agmt_ver_seq_value", "agnAgmtVerSeqValue");
		this.hashFields.put("agmt_ofc_cd", "agmtOfcCd");
		this.hashFields.put("vndr_seq_value", "vndrSeqValue");
		this.hashFields.put("vndr_cnt_cd_value", "vndrCntCdValue");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("agn_agmt_seq", "agnAgmtSeq");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("usr_ofc_cd", "usrOfcCd");
		this.hashFields.put("agmt_ofc_cd_value", "agmtOfcCdValue");
		this.hashFields.put("current", "current");
		this.hashFields.put("fm_eff_dt", "fmEffDt");
		this.hashFields.put("ofc_chr_lvl", "ofcChrLvl");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("agreement_no", "agreementNo");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("agmt_ofc_cty_cd_value", "agmtOfcCtyCdValue");
		this.hashFields.put("agn_agmt_seq_value", "agnAgmtSeqValue");
		this.hashFields.put("to_eff_dt", "toEffDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("s_agn_agmt_seq", "sAgnAgmtSeq");
		this.hashFields.put("s_agmt_ofc_cd", "sAgmtOfcCd");
		this.hashFields.put("agn_agmt_ver_seq", "agnAgmtVerSeq");
		this.hashFields.put("agn_agmt_rmk", "agnAgmtRmk");
		this.hashFields.put("xch_rt_div_lvl", "xchRtDivLvl");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("agmt_ofc_cty_cd", "agmtOfcCtyCd");
		this.hashFields.put("s_agmt_ofc_cty_cd", "sAgmtOfcCtyCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return vndrCntCd
	 */
	public String getVndrCntCd() {
		return this.vndrCntCd;
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
	 * @return sAgmtSts
	 */
	public String getSAgmtSts() {
		return this.sAgmtSts;
	}
	
	/**
	 * Column Info
	 * @return usrofccd
	 */
	public String getUsrofccd() {
		return this.usrofccd;
	}
	
	/**
	 * Column Info
	 * @return vndrLglEngNm
	 */
	public String getVndrLglEngNm() {
		return this.vndrLglEngNm;
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
	 * @return oldAgnAgmtSeq
	 */
	public String getOldAgnAgmtSeq() {
		return this.oldAgnAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @return agnAgmtVerSeqValue
	 */
	public String getAgnAgmtVerSeqValue() {
		return this.agnAgmtVerSeqValue;
	}
	
	/**
	 * Column Info
	 * @return agmtOfcCd
	 */
	public String getAgmtOfcCd() {
		return this.agmtOfcCd;
	}
	
	/**
	 * Column Info
	 * @return vndrSeqValue
	 */
	public String getVndrSeqValue() {
		return this.vndrSeqValue;
	}
	
	/**
	 * Column Info
	 * @return vndrCntCdValue
	 */
	public String getVndrCntCdValue() {
		return this.vndrCntCdValue;
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
	 * @return agnAgmtSeq
	 */
	public String getAgnAgmtSeq() {
		return this.agnAgmtSeq;
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
	 * @return usrOfcCd
	 */
	public String getUsrOfcCd() {
		return this.usrOfcCd;
	}
	
	/**
	 * Column Info
	 * @return agmtOfcCdValue
	 */
	public String getAgmtOfcCdValue() {
		return this.agmtOfcCdValue;
	}
	
	/**
	 * Column Info
	 * @return current
	 */
	public String getCurrent() {
		return this.current;
	}
	
	/**
	 * Column Info
	 * @return fmEffDt
	 */
	public String getFmEffDt() {
		return this.fmEffDt;
	}
	
	/**
	 * Column Info
	 * @return ofcChrLvl
	 */
	public String getOfcChrLvl() {
		return this.ofcChrLvl;
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
	 * @return agreementNo
	 */
	public String getAgreementNo() {
		return this.agreementNo;
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
	 * @return agmtOfcCtyCdValue
	 */
	public String getAgmtOfcCtyCdValue() {
		return this.agmtOfcCtyCdValue;
	}
	
	/**
	 * Column Info
	 * @return agnAgmtSeqValue
	 */
	public String getAgnAgmtSeqValue() {
		return this.agnAgmtSeqValue;
	}
	
	/**
	 * Column Info
	 * @return toEffDt
	 */
	public String getToEffDt() {
		return this.toEffDt;
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
	 * @return sAgnAgmtSeq
	 */
	public String getSAgnAgmtSeq() {
		return this.sAgnAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @return sAgmtOfcCd
	 */
	public String getSAgmtOfcCd() {
		return this.sAgmtOfcCd;
	}
	
	/**
	 * Column Info
	 * @return agnAgmtVerSeq
	 */
	public String getAgnAgmtVerSeq() {
		return this.agnAgmtVerSeq;
	}
	
	/**
	 * Column Info
	 * @return agnAgmtRmk
	 */
	public String getAgnAgmtRmk() {
		return this.agnAgmtRmk;
	}
	
	/**
	 * Column Info
	 * @return xchRtDivLvl
	 */
	public String getXchRtDivLvl() {
		return this.xchRtDivLvl;
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
	 * @return agmtOfcCtyCd
	 */
	public String getAgmtOfcCtyCd() {
		return this.agmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return sAgmtOfcCtyCd
	 */
	public String getSAgmtOfcCtyCd() {
		return this.sAgmtOfcCtyCd;
	}
	

	/**
	 * Column Info
	 * @param vndrCntCd
	 */
	public void setVndrCntCd(String vndrCntCd) {
		this.vndrCntCd = vndrCntCd;
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
	 * @param sAgmtSts
	 */
	public void setSAgmtSts(String sAgmtSts) {
		this.sAgmtSts = sAgmtSts;
	}
	
	/**
	 * Column Info
	 * @param usrofccd
	 */
	public void setUsrofccd(String usrofccd) {
		this.usrofccd = usrofccd;
	}
	
	/**
	 * Column Info
	 * @param vndrLglEngNm
	 */
	public void setVndrLglEngNm(String vndrLglEngNm) {
		this.vndrLglEngNm = vndrLglEngNm;
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
	 * @param oldAgnAgmtSeq
	 */
	public void setOldAgnAgmtSeq(String oldAgnAgmtSeq) {
		this.oldAgnAgmtSeq = oldAgnAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @param agnAgmtVerSeqValue
	 */
	public void setAgnAgmtVerSeqValue(String agnAgmtVerSeqValue) {
		this.agnAgmtVerSeqValue = agnAgmtVerSeqValue;
	}
	
	/**
	 * Column Info
	 * @param agmtOfcCd
	 */
	public void setAgmtOfcCd(String agmtOfcCd) {
		this.agmtOfcCd = agmtOfcCd;
	}
	
	/**
	 * Column Info
	 * @param vndrSeqValue
	 */
	public void setVndrSeqValue(String vndrSeqValue) {
		this.vndrSeqValue = vndrSeqValue;
	}
	
	/**
	 * Column Info
	 * @param vndrCntCdValue
	 */
	public void setVndrCntCdValue(String vndrCntCdValue) {
		this.vndrCntCdValue = vndrCntCdValue;
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
	 * @param agnAgmtSeq
	 */
	public void setAgnAgmtSeq(String agnAgmtSeq) {
		this.agnAgmtSeq = agnAgmtSeq;
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
	 * @param usrOfcCd
	 */
	public void setUsrOfcCd(String usrOfcCd) {
		this.usrOfcCd = usrOfcCd;
	}
	
	/**
	 * Column Info
	 * @param agmtOfcCdValue
	 */
	public void setAgmtOfcCdValue(String agmtOfcCdValue) {
		this.agmtOfcCdValue = agmtOfcCdValue;
	}
	
	/**
	 * Column Info
	 * @param current
	 */
	public void setCurrent(String current) {
		this.current = current;
	}
	
	/**
	 * Column Info
	 * @param fmEffDt
	 */
	public void setFmEffDt(String fmEffDt) {
		this.fmEffDt = fmEffDt;
	}
	
	/**
	 * Column Info
	 * @param ofcChrLvl
	 */
	public void setOfcChrLvl(String ofcChrLvl) {
		this.ofcChrLvl = ofcChrLvl;
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
	 * @param agreementNo
	 */
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
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
	 * @param agmtOfcCtyCdValue
	 */
	public void setAgmtOfcCtyCdValue(String agmtOfcCtyCdValue) {
		this.agmtOfcCtyCdValue = agmtOfcCtyCdValue;
	}
	
	/**
	 * Column Info
	 * @param agnAgmtSeqValue
	 */
	public void setAgnAgmtSeqValue(String agnAgmtSeqValue) {
		this.agnAgmtSeqValue = agnAgmtSeqValue;
	}
	
	/**
	 * Column Info
	 * @param toEffDt
	 */
	public void setToEffDt(String toEffDt) {
		this.toEffDt = toEffDt;
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
	 * @param sAgnAgmtSeq
	 */
	public void setSAgnAgmtSeq(String sAgnAgmtSeq) {
		this.sAgnAgmtSeq = sAgnAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @param sAgmtOfcCd
	 */
	public void setSAgmtOfcCd(String sAgmtOfcCd) {
		this.sAgmtOfcCd = sAgmtOfcCd;
	}
	
	/**
	 * Column Info
	 * @param agnAgmtVerSeq
	 */
	public void setAgnAgmtVerSeq(String agnAgmtVerSeq) {
		this.agnAgmtVerSeq = agnAgmtVerSeq;
	}
	
	/**
	 * Column Info
	 * @param agnAgmtRmk
	 */
	public void setAgnAgmtRmk(String agnAgmtRmk) {
		this.agnAgmtRmk = agnAgmtRmk;
	}
	
	/**
	 * Column Info
	 * @param xchRtDivLvl
	 */
	public void setXchRtDivLvl(String xchRtDivLvl) {
		this.xchRtDivLvl = xchRtDivLvl;
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
	 * @param agmtOfcCtyCd
	 */
	public void setAgmtOfcCtyCd(String agmtOfcCtyCd) {
		this.agmtOfcCtyCd = agmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param sAgmtOfcCtyCd
	 */
	public void setSAgmtOfcCtyCd(String sAgmtOfcCtyCd) {
		this.sAgmtOfcCtyCd = sAgmtOfcCtyCd;
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
		setVndrCntCd(JSPUtil.getParameter(request, prefix + "vndr_cnt_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setSAgmtSts(JSPUtil.getParameter(request, prefix + "s_agmt_sts", ""));
		setUsrofccd(JSPUtil.getParameter(request, prefix + "usrofccd", ""));
		setVndrLglEngNm(JSPUtil.getParameter(request, prefix + "vndr_lgl_eng_nm", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setOldAgnAgmtSeq(JSPUtil.getParameter(request, prefix + "old_agn_agmt_seq", ""));
		setAgnAgmtVerSeqValue(JSPUtil.getParameter(request, prefix + "agn_agmt_ver_seq_value", ""));
		setAgmtOfcCd(JSPUtil.getParameter(request, prefix + "agmt_ofc_cd", ""));
		setVndrSeqValue(JSPUtil.getParameter(request, prefix + "vndr_seq_value", ""));
		setVndrCntCdValue(JSPUtil.getParameter(request, prefix + "vndr_cnt_cd_value", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setAgnAgmtSeq(JSPUtil.getParameter(request, prefix + "agn_agmt_seq", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setUsrOfcCd(JSPUtil.getParameter(request, prefix + "usr_ofc_cd", ""));
		setAgmtOfcCdValue(JSPUtil.getParameter(request, prefix + "agmt_ofc_cd_value", ""));
		setCurrent(JSPUtil.getParameter(request, prefix + "current", ""));
		setFmEffDt(JSPUtil.getParameter(request, prefix + "fm_eff_dt", ""));
		setOfcChrLvl(JSPUtil.getParameter(request, prefix + "ofc_chr_lvl", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setAgreementNo(JSPUtil.getParameter(request, prefix + "agreement_no", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setAgmtOfcCtyCdValue(JSPUtil.getParameter(request, prefix + "agmt_ofc_cty_cd_value", ""));
		setAgnAgmtSeqValue(JSPUtil.getParameter(request, prefix + "agn_agmt_seq_value", ""));
		setToEffDt(JSPUtil.getParameter(request, prefix + "to_eff_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setSAgnAgmtSeq(JSPUtil.getParameter(request, prefix + "s_agn_agmt_seq", ""));
		setSAgmtOfcCd(JSPUtil.getParameter(request, prefix + "s_agmt_ofc_cd", ""));
		setAgnAgmtVerSeq(JSPUtil.getParameter(request, prefix + "agn_agmt_ver_seq", ""));
		setAgnAgmtRmk(JSPUtil.getParameter(request, prefix + "agn_agmt_rmk", ""));
		setXchRtDivLvl(JSPUtil.getParameter(request, prefix + "xch_rt_div_lvl", ""));
		setVndrSeq(JSPUtil.getParameter(request, prefix + "vndr_seq", ""));
		setAgmtOfcCtyCd(JSPUtil.getParameter(request, prefix + "agmt_ofc_cty_cd", ""));
		setSAgmtOfcCtyCd(JSPUtil.getParameter(request, prefix + "s_agmt_ofc_cty_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return AgtAgnAgmtVO[]
	 */
	public AgtAgnAgmtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return AgtAgnAgmtVO[]
	 */
	public AgtAgnAgmtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		AgtAgnAgmtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vndrCntCd = (JSPUtil.getParameter(request, prefix	+ "vndr_cnt_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] sAgmtSts = (JSPUtil.getParameter(request, prefix	+ "s_agmt_sts", length));
			String[] usrofccd = (JSPUtil.getParameter(request, prefix	+ "usrofccd", length));
			String[] vndrLglEngNm = (JSPUtil.getParameter(request, prefix	+ "vndr_lgl_eng_nm", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] oldAgnAgmtSeq = (JSPUtil.getParameter(request, prefix	+ "old_agn_agmt_seq", length));
			String[] agnAgmtVerSeqValue = (JSPUtil.getParameter(request, prefix	+ "agn_agmt_ver_seq_value", length));
			String[] agmtOfcCd = (JSPUtil.getParameter(request, prefix	+ "agmt_ofc_cd", length));
			String[] vndrSeqValue = (JSPUtil.getParameter(request, prefix	+ "vndr_seq_value", length));
			String[] vndrCntCdValue = (JSPUtil.getParameter(request, prefix	+ "vndr_cnt_cd_value", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] agnAgmtSeq = (JSPUtil.getParameter(request, prefix	+ "agn_agmt_seq", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] usrOfcCd = (JSPUtil.getParameter(request, prefix	+ "usr_ofc_cd", length));
			String[] agmtOfcCdValue = (JSPUtil.getParameter(request, prefix	+ "agmt_ofc_cd_value", length));
			String[] current = (JSPUtil.getParameter(request, prefix	+ "current", length));
			String[] fmEffDt = (JSPUtil.getParameter(request, prefix	+ "fm_eff_dt", length));
			String[] ofcChrLvl = (JSPUtil.getParameter(request, prefix	+ "ofc_chr_lvl", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] agreementNo = (JSPUtil.getParameter(request, prefix	+ "agreement_no", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] agmtOfcCtyCdValue = (JSPUtil.getParameter(request, prefix	+ "agmt_ofc_cty_cd_value", length));
			String[] agnAgmtSeqValue = (JSPUtil.getParameter(request, prefix	+ "agn_agmt_seq_value", length));
			String[] toEffDt = (JSPUtil.getParameter(request, prefix	+ "to_eff_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] sAgnAgmtSeq = (JSPUtil.getParameter(request, prefix	+ "s_agn_agmt_seq", length));
			String[] sAgmtOfcCd = (JSPUtil.getParameter(request, prefix	+ "s_agmt_ofc_cd", length));
			String[] agnAgmtVerSeq = (JSPUtil.getParameter(request, prefix	+ "agn_agmt_ver_seq", length));
			String[] agnAgmtRmk = (JSPUtil.getParameter(request, prefix	+ "agn_agmt_rmk", length));
			String[] xchRtDivLvl = (JSPUtil.getParameter(request, prefix	+ "xch_rt_div_lvl", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] agmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_ofc_cty_cd", length));
			String[] sAgmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "s_agmt_ofc_cty_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new AgtAgnAgmtVO();
				if (vndrCntCd[i] != null)
					model.setVndrCntCd(vndrCntCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (sAgmtSts[i] != null)
					model.setSAgmtSts(sAgmtSts[i]);
				if (usrofccd[i] != null)
					model.setUsrofccd(usrofccd[i]);
				if (vndrLglEngNm[i] != null)
					model.setVndrLglEngNm(vndrLglEngNm[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (oldAgnAgmtSeq[i] != null)
					model.setOldAgnAgmtSeq(oldAgnAgmtSeq[i]);
				if (agnAgmtVerSeqValue[i] != null)
					model.setAgnAgmtVerSeqValue(agnAgmtVerSeqValue[i]);
				if (agmtOfcCd[i] != null)
					model.setAgmtOfcCd(agmtOfcCd[i]);
				if (vndrSeqValue[i] != null)
					model.setVndrSeqValue(vndrSeqValue[i]);
				if (vndrCntCdValue[i] != null)
					model.setVndrCntCdValue(vndrCntCdValue[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (agnAgmtSeq[i] != null)
					model.setAgnAgmtSeq(agnAgmtSeq[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (usrOfcCd[i] != null)
					model.setUsrOfcCd(usrOfcCd[i]);
				if (agmtOfcCdValue[i] != null)
					model.setAgmtOfcCdValue(agmtOfcCdValue[i]);
				if (current[i] != null)
					model.setCurrent(current[i]);
				if (fmEffDt[i] != null)
					model.setFmEffDt(fmEffDt[i]);
				if (ofcChrLvl[i] != null)
					model.setOfcChrLvl(ofcChrLvl[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (agreementNo[i] != null)
					model.setAgreementNo(agreementNo[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (agmtOfcCtyCdValue[i] != null)
					model.setAgmtOfcCtyCdValue(agmtOfcCtyCdValue[i]);
				if (agnAgmtSeqValue[i] != null)
					model.setAgnAgmtSeqValue(agnAgmtSeqValue[i]);
				if (toEffDt[i] != null)
					model.setToEffDt(toEffDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (sAgnAgmtSeq[i] != null)
					model.setSAgnAgmtSeq(sAgnAgmtSeq[i]);
				if (sAgmtOfcCd[i] != null)
					model.setSAgmtOfcCd(sAgmtOfcCd[i]);
				if (agnAgmtVerSeq[i] != null)
					model.setAgnAgmtVerSeq(agnAgmtVerSeq[i]);
				if (agnAgmtRmk[i] != null)
					model.setAgnAgmtRmk(agnAgmtRmk[i]);
				if (xchRtDivLvl[i] != null)
					model.setXchRtDivLvl(xchRtDivLvl[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (agmtOfcCtyCd[i] != null)
					model.setAgmtOfcCtyCd(agmtOfcCtyCd[i]);
				if (sAgmtOfcCtyCd[i] != null)
					model.setSAgmtOfcCtyCd(sAgmtOfcCtyCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getAgtAgnAgmtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return AgtAgnAgmtVO[]
	 */
	public AgtAgnAgmtVO[] getAgtAgnAgmtVOs(){
		AgtAgnAgmtVO[] vos = (AgtAgnAgmtVO[])models.toArray(new AgtAgnAgmtVO[models.size()]);
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
		this.vndrCntCd = this.vndrCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sAgmtSts = this.sAgmtSts .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrofccd = this.usrofccd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrLglEngNm = this.vndrLglEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldAgnAgmtSeq = this.oldAgnAgmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnAgmtVerSeqValue = this.agnAgmtVerSeqValue .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOfcCd = this.agmtOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeqValue = this.vndrSeqValue .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrCntCdValue = this.vndrCntCdValue .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnAgmtSeq = this.agnAgmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrOfcCd = this.usrOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOfcCdValue = this.agmtOfcCdValue .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.current = this.current .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmEffDt = this.fmEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcChrLvl = this.ofcChrLvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agreementNo = this.agreementNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOfcCtyCdValue = this.agmtOfcCtyCdValue .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnAgmtSeqValue = this.agnAgmtSeqValue .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toEffDt = this.toEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sAgnAgmtSeq = this.sAgnAgmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sAgmtOfcCd = this.sAgmtOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnAgmtVerSeq = this.agnAgmtVerSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnAgmtRmk = this.agnAgmtRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xchRtDivLvl = this.xchRtDivLvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOfcCtyCd = this.agmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sAgmtOfcCtyCd = this.sAgmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
