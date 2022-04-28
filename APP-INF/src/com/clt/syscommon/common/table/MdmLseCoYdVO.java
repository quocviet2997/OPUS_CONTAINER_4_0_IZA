/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MdmLseCoYdVO.java
*@FileTitle : MdmLseCoYdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.12
*@LastModifier : 정은호
*@LastVersion : 1.0
* 2009.10.12 정은호 
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

public class MdmLseCoYdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MdmLseCoYdVO> models = new ArrayList<MdmLseCoYdVO>();
	
	/* Column Info */
	private String lseCoVndrSeq17 = null;
	/* Column Info */
	private String lseCoVndrSeq16 = null;
	/* Column Info */
	private String lseCoVndrSeq19 = null;
	/* Column Info */
	private String lseCoVndrSeq18 = null;
	/* Column Info */
	private String lseCoVndrSeq13 = null;
	/* Column Info */
	private String lseCoVndrSeq12 = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String lseCoVndrSeq15 = null;
	/* Column Info */
	private String lseCoVndrSeq14 = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String lseCoVndrSeq2 = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String lseCoVndrSeq1 = null;
	/* Column Info */
	private String lseCoVndrSeq4 = null;
	/* Column Info */
	private String lseCoVndrSeq3 = null;
	/* Column Info */
	private String lseCoVndrSeq6 = null;
	/* Column Info */
	private String lseCoVndrSeq5 = null;
	/* Column Info */
	private String lseCoVndrSeq8 = null;
	/* Column Info */
	private String lseCoVndrSeq7 = null;
	/* Column Info */
	private String lseCoVndrSeq10 = null;
	/* Column Info */
	private String lseCoVndrSeq11 = null;
	/* Column Info */
	private String lseCoVndrSeq9 = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String phnNo = null;
	/* Column Info */
	private String onfHirYdFlg = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String eaiIfId = null;
	/* Column Info */
	private String ydPicNm = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String lseCoVndrSeq20 = null;
	/* Column Info */
	private String lseCoYdCd = null;
	/* Column Info */
	private String faxNo = null;
	/* Column Info */
	private String ydAddr = null;
	/* Column Info */
	private String lseCoYdNm = null;
	/* Column Info */
	private String ydEml = null;
	/* Column Info */
	private String intlPhnNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MdmLseCoYdVO() {}

	public MdmLseCoYdVO(String ibflag, String pagerows, String lseCoYdCd, String lseCoYdNm, String onfHirYdFlg, String ydAddr, String intlPhnNo, String phnNo, String faxNo, String ydPicNm, String ydEml, String lseCoVndrSeq1, String lseCoVndrSeq2, String lseCoVndrSeq3, String lseCoVndrSeq4, String lseCoVndrSeq5, String lseCoVndrSeq6, String lseCoVndrSeq7, String lseCoVndrSeq8, String lseCoVndrSeq9, String lseCoVndrSeq10, String creUsrId, String creDt, String updUsrId, String updDt, String deltFlg, String eaiEvntDt, String eaiIfId, String lseCoVndrSeq11, String lseCoVndrSeq12, String lseCoVndrSeq13, String lseCoVndrSeq14, String lseCoVndrSeq15, String lseCoVndrSeq16, String lseCoVndrSeq17, String lseCoVndrSeq18, String lseCoVndrSeq19, String lseCoVndrSeq20) {
		this.lseCoVndrSeq17 = lseCoVndrSeq17;
		this.lseCoVndrSeq16 = lseCoVndrSeq16;
		this.lseCoVndrSeq19 = lseCoVndrSeq19;
		this.lseCoVndrSeq18 = lseCoVndrSeq18;
		this.lseCoVndrSeq13 = lseCoVndrSeq13;
		this.lseCoVndrSeq12 = lseCoVndrSeq12;
		this.deltFlg = deltFlg;
		this.lseCoVndrSeq15 = lseCoVndrSeq15;
		this.lseCoVndrSeq14 = lseCoVndrSeq14;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.lseCoVndrSeq2 = lseCoVndrSeq2;
		this.ibflag = ibflag;
		this.lseCoVndrSeq1 = lseCoVndrSeq1;
		this.lseCoVndrSeq4 = lseCoVndrSeq4;
		this.lseCoVndrSeq3 = lseCoVndrSeq3;
		this.lseCoVndrSeq6 = lseCoVndrSeq6;
		this.lseCoVndrSeq5 = lseCoVndrSeq5;
		this.lseCoVndrSeq8 = lseCoVndrSeq8;
		this.lseCoVndrSeq7 = lseCoVndrSeq7;
		this.lseCoVndrSeq10 = lseCoVndrSeq10;
		this.lseCoVndrSeq11 = lseCoVndrSeq11;
		this.lseCoVndrSeq9 = lseCoVndrSeq9;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.phnNo = phnNo;
		this.onfHirYdFlg = onfHirYdFlg;
		this.eaiEvntDt = eaiEvntDt;
		this.eaiIfId = eaiIfId;
		this.ydPicNm = ydPicNm;
		this.creUsrId = creUsrId;
		this.lseCoVndrSeq20 = lseCoVndrSeq20;
		this.lseCoYdCd = lseCoYdCd;
		this.faxNo = faxNo;
		this.ydAddr = ydAddr;
		this.lseCoYdNm = lseCoYdNm;
		this.ydEml = ydEml;
		this.intlPhnNo = intlPhnNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("lse_co_vndr_seq17", getLseCoVndrSeq17());
		this.hashColumns.put("lse_co_vndr_seq16", getLseCoVndrSeq16());
		this.hashColumns.put("lse_co_vndr_seq19", getLseCoVndrSeq19());
		this.hashColumns.put("lse_co_vndr_seq18", getLseCoVndrSeq18());
		this.hashColumns.put("lse_co_vndr_seq13", getLseCoVndrSeq13());
		this.hashColumns.put("lse_co_vndr_seq12", getLseCoVndrSeq12());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("lse_co_vndr_seq15", getLseCoVndrSeq15());
		this.hashColumns.put("lse_co_vndr_seq14", getLseCoVndrSeq14());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("lse_co_vndr_seq2", getLseCoVndrSeq2());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("lse_co_vndr_seq1", getLseCoVndrSeq1());
		this.hashColumns.put("lse_co_vndr_seq4", getLseCoVndrSeq4());
		this.hashColumns.put("lse_co_vndr_seq3", getLseCoVndrSeq3());
		this.hashColumns.put("lse_co_vndr_seq6", getLseCoVndrSeq6());
		this.hashColumns.put("lse_co_vndr_seq5", getLseCoVndrSeq5());
		this.hashColumns.put("lse_co_vndr_seq8", getLseCoVndrSeq8());
		this.hashColumns.put("lse_co_vndr_seq7", getLseCoVndrSeq7());
		this.hashColumns.put("lse_co_vndr_seq10", getLseCoVndrSeq10());
		this.hashColumns.put("lse_co_vndr_seq11", getLseCoVndrSeq11());
		this.hashColumns.put("lse_co_vndr_seq9", getLseCoVndrSeq9());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("phn_no", getPhnNo());
		this.hashColumns.put("onf_hir_yd_flg", getOnfHirYdFlg());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("eai_if_id", getEaiIfId());
		this.hashColumns.put("yd_pic_nm", getYdPicNm());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("lse_co_vndr_seq20", getLseCoVndrSeq20());
		this.hashColumns.put("lse_co_yd_cd", getLseCoYdCd());
		this.hashColumns.put("fax_no", getFaxNo());
		this.hashColumns.put("yd_addr", getYdAddr());
		this.hashColumns.put("lse_co_yd_nm", getLseCoYdNm());
		this.hashColumns.put("yd_eml", getYdEml());
		this.hashColumns.put("intl_phn_no", getIntlPhnNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("lse_co_vndr_seq17", "lseCoVndrSeq17");
		this.hashFields.put("lse_co_vndr_seq16", "lseCoVndrSeq16");
		this.hashFields.put("lse_co_vndr_seq19", "lseCoVndrSeq19");
		this.hashFields.put("lse_co_vndr_seq18", "lseCoVndrSeq18");
		this.hashFields.put("lse_co_vndr_seq13", "lseCoVndrSeq13");
		this.hashFields.put("lse_co_vndr_seq12", "lseCoVndrSeq12");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("lse_co_vndr_seq15", "lseCoVndrSeq15");
		this.hashFields.put("lse_co_vndr_seq14", "lseCoVndrSeq14");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("lse_co_vndr_seq2", "lseCoVndrSeq2");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("lse_co_vndr_seq1", "lseCoVndrSeq1");
		this.hashFields.put("lse_co_vndr_seq4", "lseCoVndrSeq4");
		this.hashFields.put("lse_co_vndr_seq3", "lseCoVndrSeq3");
		this.hashFields.put("lse_co_vndr_seq6", "lseCoVndrSeq6");
		this.hashFields.put("lse_co_vndr_seq5", "lseCoVndrSeq5");
		this.hashFields.put("lse_co_vndr_seq8", "lseCoVndrSeq8");
		this.hashFields.put("lse_co_vndr_seq7", "lseCoVndrSeq7");
		this.hashFields.put("lse_co_vndr_seq10", "lseCoVndrSeq10");
		this.hashFields.put("lse_co_vndr_seq11", "lseCoVndrSeq11");
		this.hashFields.put("lse_co_vndr_seq9", "lseCoVndrSeq9");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("phn_no", "phnNo");
		this.hashFields.put("onf_hir_yd_flg", "onfHirYdFlg");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("eai_if_id", "eaiIfId");
		this.hashFields.put("yd_pic_nm", "ydPicNm");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("lse_co_vndr_seq20", "lseCoVndrSeq20");
		this.hashFields.put("lse_co_yd_cd", "lseCoYdCd");
		this.hashFields.put("fax_no", "faxNo");
		this.hashFields.put("yd_addr", "ydAddr");
		this.hashFields.put("lse_co_yd_nm", "lseCoYdNm");
		this.hashFields.put("yd_eml", "ydEml");
		this.hashFields.put("intl_phn_no", "intlPhnNo");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return lseCoVndrSeq17
	 */
	public String getLseCoVndrSeq17() {
		return this.lseCoVndrSeq17;
	}
	
	/**
	 * Column Info
	 * @return lseCoVndrSeq16
	 */
	public String getLseCoVndrSeq16() {
		return this.lseCoVndrSeq16;
	}
	
	/**
	 * Column Info
	 * @return lseCoVndrSeq19
	 */
	public String getLseCoVndrSeq19() {
		return this.lseCoVndrSeq19;
	}
	
	/**
	 * Column Info
	 * @return lseCoVndrSeq18
	 */
	public String getLseCoVndrSeq18() {
		return this.lseCoVndrSeq18;
	}
	
	/**
	 * Column Info
	 * @return lseCoVndrSeq13
	 */
	public String getLseCoVndrSeq13() {
		return this.lseCoVndrSeq13;
	}
	
	/**
	 * Column Info
	 * @return lseCoVndrSeq12
	 */
	public String getLseCoVndrSeq12() {
		return this.lseCoVndrSeq12;
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
	 * @return lseCoVndrSeq15
	 */
	public String getLseCoVndrSeq15() {
		return this.lseCoVndrSeq15;
	}
	
	/**
	 * Column Info
	 * @return lseCoVndrSeq14
	 */
	public String getLseCoVndrSeq14() {
		return this.lseCoVndrSeq14;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return lseCoVndrSeq2
	 */
	public String getLseCoVndrSeq2() {
		return this.lseCoVndrSeq2;
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
	 * @return lseCoVndrSeq1
	 */
	public String getLseCoVndrSeq1() {
		return this.lseCoVndrSeq1;
	}
	
	/**
	 * Column Info
	 * @return lseCoVndrSeq4
	 */
	public String getLseCoVndrSeq4() {
		return this.lseCoVndrSeq4;
	}
	
	/**
	 * Column Info
	 * @return lseCoVndrSeq3
	 */
	public String getLseCoVndrSeq3() {
		return this.lseCoVndrSeq3;
	}
	
	/**
	 * Column Info
	 * @return lseCoVndrSeq6
	 */
	public String getLseCoVndrSeq6() {
		return this.lseCoVndrSeq6;
	}
	
	/**
	 * Column Info
	 * @return lseCoVndrSeq5
	 */
	public String getLseCoVndrSeq5() {
		return this.lseCoVndrSeq5;
	}
	
	/**
	 * Column Info
	 * @return lseCoVndrSeq8
	 */
	public String getLseCoVndrSeq8() {
		return this.lseCoVndrSeq8;
	}
	
	/**
	 * Column Info
	 * @return lseCoVndrSeq7
	 */
	public String getLseCoVndrSeq7() {
		return this.lseCoVndrSeq7;
	}
	
	/**
	 * Column Info
	 * @return lseCoVndrSeq10
	 */
	public String getLseCoVndrSeq10() {
		return this.lseCoVndrSeq10;
	}
	
	/**
	 * Column Info
	 * @return lseCoVndrSeq11
	 */
	public String getLseCoVndrSeq11() {
		return this.lseCoVndrSeq11;
	}
	
	/**
	 * Column Info
	 * @return lseCoVndrSeq9
	 */
	public String getLseCoVndrSeq9() {
		return this.lseCoVndrSeq9;
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
	 * @return phnNo
	 */
	public String getPhnNo() {
		return this.phnNo;
	}
	
	/**
	 * Column Info
	 * @return onfHirYdFlg
	 */
	public String getOnfHirYdFlg() {
		return this.onfHirYdFlg;
	}
	
	/**
	 * Column Info
	 * @return eaiEvntDt
	 */
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @return eaiIfId
	 */
	public String getEaiIfId() {
		return this.eaiIfId;
	}
	
	/**
	 * Column Info
	 * @return ydPicNm
	 */
	public String getYdPicNm() {
		return this.ydPicNm;
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
	 * @return lseCoVndrSeq20
	 */
	public String getLseCoVndrSeq20() {
		return this.lseCoVndrSeq20;
	}
	
	/**
	 * Column Info
	 * @return lseCoYdCd
	 */
	public String getLseCoYdCd() {
		return this.lseCoYdCd;
	}
	
	/**
	 * Column Info
	 * @return faxNo
	 */
	public String getFaxNo() {
		return this.faxNo;
	}
	
	/**
	 * Column Info
	 * @return ydAddr
	 */
	public String getYdAddr() {
		return this.ydAddr;
	}
	
	/**
	 * Column Info
	 * @return lseCoYdNm
	 */
	public String getLseCoYdNm() {
		return this.lseCoYdNm;
	}
	
	/**
	 * Column Info
	 * @return ydEml
	 */
	public String getYdEml() {
		return this.ydEml;
	}
	
	/**
	 * Column Info
	 * @return intlPhnNo
	 */
	public String getIntlPhnNo() {
		return this.intlPhnNo;
	}
	

	/**
	 * Column Info
	 * @param lseCoVndrSeq17
	 */
	public void setLseCoVndrSeq17(String lseCoVndrSeq17) {
		this.lseCoVndrSeq17 = lseCoVndrSeq17;
	}
	
	/**
	 * Column Info
	 * @param lseCoVndrSeq16
	 */
	public void setLseCoVndrSeq16(String lseCoVndrSeq16) {
		this.lseCoVndrSeq16 = lseCoVndrSeq16;
	}
	
	/**
	 * Column Info
	 * @param lseCoVndrSeq19
	 */
	public void setLseCoVndrSeq19(String lseCoVndrSeq19) {
		this.lseCoVndrSeq19 = lseCoVndrSeq19;
	}
	
	/**
	 * Column Info
	 * @param lseCoVndrSeq18
	 */
	public void setLseCoVndrSeq18(String lseCoVndrSeq18) {
		this.lseCoVndrSeq18 = lseCoVndrSeq18;
	}
	
	/**
	 * Column Info
	 * @param lseCoVndrSeq13
	 */
	public void setLseCoVndrSeq13(String lseCoVndrSeq13) {
		this.lseCoVndrSeq13 = lseCoVndrSeq13;
	}
	
	/**
	 * Column Info
	 * @param lseCoVndrSeq12
	 */
	public void setLseCoVndrSeq12(String lseCoVndrSeq12) {
		this.lseCoVndrSeq12 = lseCoVndrSeq12;
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
	 * @param lseCoVndrSeq15
	 */
	public void setLseCoVndrSeq15(String lseCoVndrSeq15) {
		this.lseCoVndrSeq15 = lseCoVndrSeq15;
	}
	
	/**
	 * Column Info
	 * @param lseCoVndrSeq14
	 */
	public void setLseCoVndrSeq14(String lseCoVndrSeq14) {
		this.lseCoVndrSeq14 = lseCoVndrSeq14;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
	 * @param lseCoVndrSeq2
	 */
	public void setLseCoVndrSeq2(String lseCoVndrSeq2) {
		this.lseCoVndrSeq2 = lseCoVndrSeq2;
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
	 * @param lseCoVndrSeq1
	 */
	public void setLseCoVndrSeq1(String lseCoVndrSeq1) {
		this.lseCoVndrSeq1 = lseCoVndrSeq1;
	}
	
	/**
	 * Column Info
	 * @param lseCoVndrSeq4
	 */
	public void setLseCoVndrSeq4(String lseCoVndrSeq4) {
		this.lseCoVndrSeq4 = lseCoVndrSeq4;
	}
	
	/**
	 * Column Info
	 * @param lseCoVndrSeq3
	 */
	public void setLseCoVndrSeq3(String lseCoVndrSeq3) {
		this.lseCoVndrSeq3 = lseCoVndrSeq3;
	}
	
	/**
	 * Column Info
	 * @param lseCoVndrSeq6
	 */
	public void setLseCoVndrSeq6(String lseCoVndrSeq6) {
		this.lseCoVndrSeq6 = lseCoVndrSeq6;
	}
	
	/**
	 * Column Info
	 * @param lseCoVndrSeq5
	 */
	public void setLseCoVndrSeq5(String lseCoVndrSeq5) {
		this.lseCoVndrSeq5 = lseCoVndrSeq5;
	}
	
	/**
	 * Column Info
	 * @param lseCoVndrSeq8
	 */
	public void setLseCoVndrSeq8(String lseCoVndrSeq8) {
		this.lseCoVndrSeq8 = lseCoVndrSeq8;
	}
	
	/**
	 * Column Info
	 * @param lseCoVndrSeq7
	 */
	public void setLseCoVndrSeq7(String lseCoVndrSeq7) {
		this.lseCoVndrSeq7 = lseCoVndrSeq7;
	}
	
	/**
	 * Column Info
	 * @param lseCoVndrSeq10
	 */
	public void setLseCoVndrSeq10(String lseCoVndrSeq10) {
		this.lseCoVndrSeq10 = lseCoVndrSeq10;
	}
	
	/**
	 * Column Info
	 * @param lseCoVndrSeq11
	 */
	public void setLseCoVndrSeq11(String lseCoVndrSeq11) {
		this.lseCoVndrSeq11 = lseCoVndrSeq11;
	}
	
	/**
	 * Column Info
	 * @param lseCoVndrSeq9
	 */
	public void setLseCoVndrSeq9(String lseCoVndrSeq9) {
		this.lseCoVndrSeq9 = lseCoVndrSeq9;
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
	 * @param phnNo
	 */
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	
	/**
	 * Column Info
	 * @param onfHirYdFlg
	 */
	public void setOnfHirYdFlg(String onfHirYdFlg) {
		this.onfHirYdFlg = onfHirYdFlg;
	}
	
	/**
	 * Column Info
	 * @param eaiEvntDt
	 */
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @param eaiIfId
	 */
	public void setEaiIfId(String eaiIfId) {
		this.eaiIfId = eaiIfId;
	}
	
	/**
	 * Column Info
	 * @param ydPicNm
	 */
	public void setYdPicNm(String ydPicNm) {
		this.ydPicNm = ydPicNm;
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
	 * @param lseCoVndrSeq20
	 */
	public void setLseCoVndrSeq20(String lseCoVndrSeq20) {
		this.lseCoVndrSeq20 = lseCoVndrSeq20;
	}
	
	/**
	 * Column Info
	 * @param lseCoYdCd
	 */
	public void setLseCoYdCd(String lseCoYdCd) {
		this.lseCoYdCd = lseCoYdCd;
	}
	
	/**
	 * Column Info
	 * @param faxNo
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}
	
	/**
	 * Column Info
	 * @param ydAddr
	 */
	public void setYdAddr(String ydAddr) {
		this.ydAddr = ydAddr;
	}
	
	/**
	 * Column Info
	 * @param lseCoYdNm
	 */
	public void setLseCoYdNm(String lseCoYdNm) {
		this.lseCoYdNm = lseCoYdNm;
	}
	
	/**
	 * Column Info
	 * @param ydEml
	 */
	public void setYdEml(String ydEml) {
		this.ydEml = ydEml;
	}
	
	/**
	 * Column Info
	 * @param intlPhnNo
	 */
	public void setIntlPhnNo(String intlPhnNo) {
		this.intlPhnNo = intlPhnNo;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setLseCoVndrSeq17(JSPUtil.getParameter(request, "lse_co_vndr_seq17", ""));
		setLseCoVndrSeq16(JSPUtil.getParameter(request, "lse_co_vndr_seq16", ""));
		setLseCoVndrSeq19(JSPUtil.getParameter(request, "lse_co_vndr_seq19", ""));
		setLseCoVndrSeq18(JSPUtil.getParameter(request, "lse_co_vndr_seq18", ""));
		setLseCoVndrSeq13(JSPUtil.getParameter(request, "lse_co_vndr_seq13", ""));
		setLseCoVndrSeq12(JSPUtil.getParameter(request, "lse_co_vndr_seq12", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setLseCoVndrSeq15(JSPUtil.getParameter(request, "lse_co_vndr_seq15", ""));
		setLseCoVndrSeq14(JSPUtil.getParameter(request, "lse_co_vndr_seq14", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setLseCoVndrSeq2(JSPUtil.getParameter(request, "lse_co_vndr_seq2", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setLseCoVndrSeq1(JSPUtil.getParameter(request, "lse_co_vndr_seq1", ""));
		setLseCoVndrSeq4(JSPUtil.getParameter(request, "lse_co_vndr_seq4", ""));
		setLseCoVndrSeq3(JSPUtil.getParameter(request, "lse_co_vndr_seq3", ""));
		setLseCoVndrSeq6(JSPUtil.getParameter(request, "lse_co_vndr_seq6", ""));
		setLseCoVndrSeq5(JSPUtil.getParameter(request, "lse_co_vndr_seq5", ""));
		setLseCoVndrSeq8(JSPUtil.getParameter(request, "lse_co_vndr_seq8", ""));
		setLseCoVndrSeq7(JSPUtil.getParameter(request, "lse_co_vndr_seq7", ""));
		setLseCoVndrSeq10(JSPUtil.getParameter(request, "lse_co_vndr_seq10", ""));
		setLseCoVndrSeq11(JSPUtil.getParameter(request, "lse_co_vndr_seq11", ""));
		setLseCoVndrSeq9(JSPUtil.getParameter(request, "lse_co_vndr_seq9", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setPhnNo(JSPUtil.getParameter(request, "phn_no", ""));
		setOnfHirYdFlg(JSPUtil.getParameter(request, "onf_hir_yd_flg", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setEaiIfId(JSPUtil.getParameter(request, "eai_if_id", ""));
		setYdPicNm(JSPUtil.getParameter(request, "yd_pic_nm", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setLseCoVndrSeq20(JSPUtil.getParameter(request, "lse_co_vndr_seq20", ""));
		setLseCoYdCd(JSPUtil.getParameter(request, "lse_co_yd_cd", ""));
		setFaxNo(JSPUtil.getParameter(request, "fax_no", ""));
		setYdAddr(JSPUtil.getParameter(request, "yd_addr", ""));
		setLseCoYdNm(JSPUtil.getParameter(request, "lse_co_yd_nm", ""));
		setYdEml(JSPUtil.getParameter(request, "yd_eml", ""));
		setIntlPhnNo(JSPUtil.getParameter(request, "intl_phn_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MdmLseCoYdVO[]
	 */
	public MdmLseCoYdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MdmLseCoYdVO[]
	 */
	public MdmLseCoYdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmLseCoYdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] lseCoVndrSeq17 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq17", length));
			String[] lseCoVndrSeq16 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq16", length));
			String[] lseCoVndrSeq19 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq19", length));
			String[] lseCoVndrSeq18 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq18", length));
			String[] lseCoVndrSeq13 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq13", length));
			String[] lseCoVndrSeq12 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq12", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] lseCoVndrSeq15 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq15", length));
			String[] lseCoVndrSeq14 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq14", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] lseCoVndrSeq2 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq2", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] lseCoVndrSeq1 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq1", length));
			String[] lseCoVndrSeq4 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq4", length));
			String[] lseCoVndrSeq3 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq3", length));
			String[] lseCoVndrSeq6 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq6", length));
			String[] lseCoVndrSeq5 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq5", length));
			String[] lseCoVndrSeq8 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq8", length));
			String[] lseCoVndrSeq7 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq7", length));
			String[] lseCoVndrSeq10 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq10", length));
			String[] lseCoVndrSeq11 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq11", length));
			String[] lseCoVndrSeq9 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq9", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] phnNo = (JSPUtil.getParameter(request, prefix	+ "phn_no", length));
			String[] onfHirYdFlg = (JSPUtil.getParameter(request, prefix	+ "onf_hir_yd_flg", length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] eaiIfId = (JSPUtil.getParameter(request, prefix	+ "eai_if_id", length));
			String[] ydPicNm = (JSPUtil.getParameter(request, prefix	+ "yd_pic_nm", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] lseCoVndrSeq20 = (JSPUtil.getParameter(request, prefix	+ "lse_co_vndr_seq20", length));
			String[] lseCoYdCd = (JSPUtil.getParameter(request, prefix	+ "lse_co_yd_cd", length));
			String[] faxNo = (JSPUtil.getParameter(request, prefix	+ "fax_no", length));
			String[] ydAddr = (JSPUtil.getParameter(request, prefix	+ "yd_addr", length));
			String[] lseCoYdNm = (JSPUtil.getParameter(request, prefix	+ "lse_co_yd_nm", length));
			String[] ydEml = (JSPUtil.getParameter(request, prefix	+ "yd_eml", length));
			String[] intlPhnNo = (JSPUtil.getParameter(request, prefix	+ "intl_phn_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmLseCoYdVO();
				if (lseCoVndrSeq17[i] != null)
					model.setLseCoVndrSeq17(lseCoVndrSeq17[i]);
				if (lseCoVndrSeq16[i] != null)
					model.setLseCoVndrSeq16(lseCoVndrSeq16[i]);
				if (lseCoVndrSeq19[i] != null)
					model.setLseCoVndrSeq19(lseCoVndrSeq19[i]);
				if (lseCoVndrSeq18[i] != null)
					model.setLseCoVndrSeq18(lseCoVndrSeq18[i]);
				if (lseCoVndrSeq13[i] != null)
					model.setLseCoVndrSeq13(lseCoVndrSeq13[i]);
				if (lseCoVndrSeq12[i] != null)
					model.setLseCoVndrSeq12(lseCoVndrSeq12[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (lseCoVndrSeq15[i] != null)
					model.setLseCoVndrSeq15(lseCoVndrSeq15[i]);
				if (lseCoVndrSeq14[i] != null)
					model.setLseCoVndrSeq14(lseCoVndrSeq14[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (lseCoVndrSeq2[i] != null)
					model.setLseCoVndrSeq2(lseCoVndrSeq2[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (lseCoVndrSeq1[i] != null)
					model.setLseCoVndrSeq1(lseCoVndrSeq1[i]);
				if (lseCoVndrSeq4[i] != null)
					model.setLseCoVndrSeq4(lseCoVndrSeq4[i]);
				if (lseCoVndrSeq3[i] != null)
					model.setLseCoVndrSeq3(lseCoVndrSeq3[i]);
				if (lseCoVndrSeq6[i] != null)
					model.setLseCoVndrSeq6(lseCoVndrSeq6[i]);
				if (lseCoVndrSeq5[i] != null)
					model.setLseCoVndrSeq5(lseCoVndrSeq5[i]);
				if (lseCoVndrSeq8[i] != null)
					model.setLseCoVndrSeq8(lseCoVndrSeq8[i]);
				if (lseCoVndrSeq7[i] != null)
					model.setLseCoVndrSeq7(lseCoVndrSeq7[i]);
				if (lseCoVndrSeq10[i] != null)
					model.setLseCoVndrSeq10(lseCoVndrSeq10[i]);
				if (lseCoVndrSeq11[i] != null)
					model.setLseCoVndrSeq11(lseCoVndrSeq11[i]);
				if (lseCoVndrSeq9[i] != null)
					model.setLseCoVndrSeq9(lseCoVndrSeq9[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (phnNo[i] != null)
					model.setPhnNo(phnNo[i]);
				if (onfHirYdFlg[i] != null)
					model.setOnfHirYdFlg(onfHirYdFlg[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (eaiIfId[i] != null)
					model.setEaiIfId(eaiIfId[i]);
				if (ydPicNm[i] != null)
					model.setYdPicNm(ydPicNm[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (lseCoVndrSeq20[i] != null)
					model.setLseCoVndrSeq20(lseCoVndrSeq20[i]);
				if (lseCoYdCd[i] != null)
					model.setLseCoYdCd(lseCoYdCd[i]);
				if (faxNo[i] != null)
					model.setFaxNo(faxNo[i]);
				if (ydAddr[i] != null)
					model.setYdAddr(ydAddr[i]);
				if (lseCoYdNm[i] != null)
					model.setLseCoYdNm(lseCoYdNm[i]);
				if (ydEml[i] != null)
					model.setYdEml(ydEml[i]);
				if (intlPhnNo[i] != null)
					model.setIntlPhnNo(intlPhnNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMdmLseCoYdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MdmLseCoYdVO[]
	 */
	public MdmLseCoYdVO[] getMdmLseCoYdVOs(){
		MdmLseCoYdVO[] vos = (MdmLseCoYdVO[])models.toArray(new MdmLseCoYdVO[models.size()]);
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
		this.lseCoVndrSeq17 = this.lseCoVndrSeq17 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoVndrSeq16 = this.lseCoVndrSeq16 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoVndrSeq19 = this.lseCoVndrSeq19 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoVndrSeq18 = this.lseCoVndrSeq18 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoVndrSeq13 = this.lseCoVndrSeq13 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoVndrSeq12 = this.lseCoVndrSeq12 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoVndrSeq15 = this.lseCoVndrSeq15 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoVndrSeq14 = this.lseCoVndrSeq14 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoVndrSeq2 = this.lseCoVndrSeq2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoVndrSeq1 = this.lseCoVndrSeq1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoVndrSeq4 = this.lseCoVndrSeq4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoVndrSeq3 = this.lseCoVndrSeq3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoVndrSeq6 = this.lseCoVndrSeq6 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoVndrSeq5 = this.lseCoVndrSeq5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoVndrSeq8 = this.lseCoVndrSeq8 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoVndrSeq7 = this.lseCoVndrSeq7 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoVndrSeq10 = this.lseCoVndrSeq10 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoVndrSeq11 = this.lseCoVndrSeq11 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoVndrSeq9 = this.lseCoVndrSeq9 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.phnNo = this.phnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onfHirYdFlg = this.onfHirYdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiIfId = this.eaiIfId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydPicNm = this.ydPicNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoVndrSeq20 = this.lseCoVndrSeq20 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoYdCd = this.lseCoYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNo = this.faxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydAddr = this.ydAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCoYdNm = this.lseCoYdNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydEml = this.ydEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intlPhnNo = this.intlPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
