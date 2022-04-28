/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaCntrMtyMvmtRoutVO.java
*@FileTitle : CoaCntrMtyMvmtRoutVO
*Open Issues :
*Change history :
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

public class CoaCntrMtyMvmtRoutVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaCntrMtyMvmtRoutVO> models = new ArrayList<CoaCntrMtyMvmtRoutVO>();
	
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String routYdCd09 = null;
	/* Column Info */
	private String routYdCd08 = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String routYdCd22 = null;
	/* Column Info */
	private String routYdCd04 = null;
	/* Column Info */
	private String routYdCd23 = null;
	/* Column Info */
	private String routYdCd05 = null;
	/* Column Info */
	private String routYdCd24 = null;
	/* Column Info */
	private String routYdCd06 = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String routYdCd25 = null;
	/* Column Info */
	private String routYdCd07 = null;
	/* Column Info */
	private String routYdCd26 = null;
	/* Column Info */
	private String routYdCd27 = null;
	/* Column Info */
	private String routYdCd01 = null;
	/* Column Info */
	private String routYdCd28 = null;
	/* Column Info */
	private String routYdCd02 = null;
	/* Column Info */
	private String routYdCd29 = null;
	/* Column Info */
	private String routYdCd03 = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String routYdCd20 = null;
	/* Column Info */
	private String routYdCd21 = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String routN1stYdCd = null;
	/* Column Info */
	private String routSeq = null;
	/* Column Info */
	private String routYdCd19 = null;
	/* Column Info */
	private String routYdCd17 = null;
	/* Column Info */
	private String routYdCd18 = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String routYdCd15 = null;
	/* Column Info */
	private String routYdCd16 = null;
	/* Column Info */
	private String routYdCd13 = null;
	/* Column Info */
	private String routYdCd14 = null;
	/* Column Info */
	private String routYdCd11 = null;
	/* Column Info */
	private String routYdCd12 = null;
	/* Column Info */
	private String routYdCd10 = null;
	/* Column Info */
	private String routLstYdCd = null;
	/* Column Info */
	private String routYdCd30 = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaCntrMtyMvmtRoutVO() {}

	public CoaCntrMtyMvmtRoutVO(String ibflag, String pagerows, String routN1stYdCd, String routLstYdCd, String routSeq, String routYdCd01, String routYdCd02, String routYdCd03, String routYdCd04, String routYdCd05, String routYdCd06, String routYdCd07, String routYdCd08, String routYdCd09, String routYdCd10, String routYdCd11, String routYdCd12, String routYdCd13, String routYdCd14, String routYdCd15, String routYdCd16, String routYdCd17, String routYdCd18, String routYdCd19, String routYdCd20, String routYdCd21, String routYdCd22, String routYdCd23, String routYdCd24, String routYdCd25, String routYdCd26, String routYdCd27, String routYdCd28, String routYdCd29, String routYdCd30, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.creDt = creDt;
		this.routYdCd09 = routYdCd09;
		this.routYdCd08 = routYdCd08;
		this.pagerows = pagerows;
		this.routYdCd22 = routYdCd22;
		this.routYdCd04 = routYdCd04;
		this.routYdCd23 = routYdCd23;
		this.routYdCd05 = routYdCd05;
		this.routYdCd24 = routYdCd24;
		this.routYdCd06 = routYdCd06;
		this.ibflag = ibflag;
		this.routYdCd25 = routYdCd25;
		this.routYdCd07 = routYdCd07;
		this.routYdCd26 = routYdCd26;
		this.routYdCd27 = routYdCd27;
		this.routYdCd01 = routYdCd01;
		this.routYdCd28 = routYdCd28;
		this.routYdCd02 = routYdCd02;
		this.routYdCd29 = routYdCd29;
		this.routYdCd03 = routYdCd03;
		this.updUsrId = updUsrId;
		this.routYdCd20 = routYdCd20;
		this.routYdCd21 = routYdCd21;
		this.updDt = updDt;
		this.routN1stYdCd = routN1stYdCd;
		this.routSeq = routSeq;
		this.routYdCd19 = routYdCd19;
		this.routYdCd17 = routYdCd17;
		this.routYdCd18 = routYdCd18;
		this.creUsrId = creUsrId;
		this.routYdCd15 = routYdCd15;
		this.routYdCd16 = routYdCd16;
		this.routYdCd13 = routYdCd13;
		this.routYdCd14 = routYdCd14;
		this.routYdCd11 = routYdCd11;
		this.routYdCd12 = routYdCd12;
		this.routYdCd10 = routYdCd10;
		this.routLstYdCd = routLstYdCd;
		this.routYdCd30 = routYdCd30;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rout_yd_cd09", getRoutYdCd09());
		this.hashColumns.put("rout_yd_cd08", getRoutYdCd08());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("rout_yd_cd22", getRoutYdCd22());
		this.hashColumns.put("rout_yd_cd04", getRoutYdCd04());
		this.hashColumns.put("rout_yd_cd23", getRoutYdCd23());
		this.hashColumns.put("rout_yd_cd05", getRoutYdCd05());
		this.hashColumns.put("rout_yd_cd24", getRoutYdCd24());
		this.hashColumns.put("rout_yd_cd06", getRoutYdCd06());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rout_yd_cd25", getRoutYdCd25());
		this.hashColumns.put("rout_yd_cd07", getRoutYdCd07());
		this.hashColumns.put("rout_yd_cd26", getRoutYdCd26());
		this.hashColumns.put("rout_yd_cd27", getRoutYdCd27());
		this.hashColumns.put("rout_yd_cd01", getRoutYdCd01());
		this.hashColumns.put("rout_yd_cd28", getRoutYdCd28());
		this.hashColumns.put("rout_yd_cd02", getRoutYdCd02());
		this.hashColumns.put("rout_yd_cd29", getRoutYdCd29());
		this.hashColumns.put("rout_yd_cd03", getRoutYdCd03());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("rout_yd_cd20", getRoutYdCd20());
		this.hashColumns.put("rout_yd_cd21", getRoutYdCd21());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rout_n1st_yd_cd", getRoutN1stYdCd());
		this.hashColumns.put("rout_seq", getRoutSeq());
		this.hashColumns.put("rout_yd_cd19", getRoutYdCd19());
		this.hashColumns.put("rout_yd_cd17", getRoutYdCd17());
		this.hashColumns.put("rout_yd_cd18", getRoutYdCd18());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("rout_yd_cd15", getRoutYdCd15());
		this.hashColumns.put("rout_yd_cd16", getRoutYdCd16());
		this.hashColumns.put("rout_yd_cd13", getRoutYdCd13());
		this.hashColumns.put("rout_yd_cd14", getRoutYdCd14());
		this.hashColumns.put("rout_yd_cd11", getRoutYdCd11());
		this.hashColumns.put("rout_yd_cd12", getRoutYdCd12());
		this.hashColumns.put("rout_yd_cd10", getRoutYdCd10());
		this.hashColumns.put("rout_lst_yd_cd", getRoutLstYdCd());
		this.hashColumns.put("rout_yd_cd30", getRoutYdCd30());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rout_yd_cd09", "routYdCd09");
		this.hashFields.put("rout_yd_cd08", "routYdCd08");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("rout_yd_cd22", "routYdCd22");
		this.hashFields.put("rout_yd_cd04", "routYdCd04");
		this.hashFields.put("rout_yd_cd23", "routYdCd23");
		this.hashFields.put("rout_yd_cd05", "routYdCd05");
		this.hashFields.put("rout_yd_cd24", "routYdCd24");
		this.hashFields.put("rout_yd_cd06", "routYdCd06");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rout_yd_cd25", "routYdCd25");
		this.hashFields.put("rout_yd_cd07", "routYdCd07");
		this.hashFields.put("rout_yd_cd26", "routYdCd26");
		this.hashFields.put("rout_yd_cd27", "routYdCd27");
		this.hashFields.put("rout_yd_cd01", "routYdCd01");
		this.hashFields.put("rout_yd_cd28", "routYdCd28");
		this.hashFields.put("rout_yd_cd02", "routYdCd02");
		this.hashFields.put("rout_yd_cd29", "routYdCd29");
		this.hashFields.put("rout_yd_cd03", "routYdCd03");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("rout_yd_cd20", "routYdCd20");
		this.hashFields.put("rout_yd_cd21", "routYdCd21");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rout_n1st_yd_cd", "routN1stYdCd");
		this.hashFields.put("rout_seq", "routSeq");
		this.hashFields.put("rout_yd_cd19", "routYdCd19");
		this.hashFields.put("rout_yd_cd17", "routYdCd17");
		this.hashFields.put("rout_yd_cd18", "routYdCd18");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("rout_yd_cd15", "routYdCd15");
		this.hashFields.put("rout_yd_cd16", "routYdCd16");
		this.hashFields.put("rout_yd_cd13", "routYdCd13");
		this.hashFields.put("rout_yd_cd14", "routYdCd14");
		this.hashFields.put("rout_yd_cd11", "routYdCd11");
		this.hashFields.put("rout_yd_cd12", "routYdCd12");
		this.hashFields.put("rout_yd_cd10", "routYdCd10");
		this.hashFields.put("rout_lst_yd_cd", "routLstYdCd");
		this.hashFields.put("rout_yd_cd30", "routYdCd30");
		return this.hashFields;
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
	 * @return routYdCd09
	 */
	public String getRoutYdCd09() {
		return this.routYdCd09;
	}
	
	/**
	 * Column Info
	 * @return routYdCd08
	 */
	public String getRoutYdCd08() {
		return this.routYdCd08;
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
	 * @return routYdCd22
	 */
	public String getRoutYdCd22() {
		return this.routYdCd22;
	}
	
	/**
	 * Column Info
	 * @return routYdCd04
	 */
	public String getRoutYdCd04() {
		return this.routYdCd04;
	}
	
	/**
	 * Column Info
	 * @return routYdCd23
	 */
	public String getRoutYdCd23() {
		return this.routYdCd23;
	}
	
	/**
	 * Column Info
	 * @return routYdCd05
	 */
	public String getRoutYdCd05() {
		return this.routYdCd05;
	}
	
	/**
	 * Column Info
	 * @return routYdCd24
	 */
	public String getRoutYdCd24() {
		return this.routYdCd24;
	}
	
	/**
	 * Column Info
	 * @return routYdCd06
	 */
	public String getRoutYdCd06() {
		return this.routYdCd06;
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
	 * @return routYdCd25
	 */
	public String getRoutYdCd25() {
		return this.routYdCd25;
	}
	
	/**
	 * Column Info
	 * @return routYdCd07
	 */
	public String getRoutYdCd07() {
		return this.routYdCd07;
	}
	
	/**
	 * Column Info
	 * @return routYdCd26
	 */
	public String getRoutYdCd26() {
		return this.routYdCd26;
	}
	
	/**
	 * Column Info
	 * @return routYdCd27
	 */
	public String getRoutYdCd27() {
		return this.routYdCd27;
	}
	
	/**
	 * Column Info
	 * @return routYdCd01
	 */
	public String getRoutYdCd01() {
		return this.routYdCd01;
	}
	
	/**
	 * Column Info
	 * @return routYdCd28
	 */
	public String getRoutYdCd28() {
		return this.routYdCd28;
	}
	
	/**
	 * Column Info
	 * @return routYdCd02
	 */
	public String getRoutYdCd02() {
		return this.routYdCd02;
	}
	
	/**
	 * Column Info
	 * @return routYdCd29
	 */
	public String getRoutYdCd29() {
		return this.routYdCd29;
	}
	
	/**
	 * Column Info
	 * @return routYdCd03
	 */
	public String getRoutYdCd03() {
		return this.routYdCd03;
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
	 * @return routYdCd20
	 */
	public String getRoutYdCd20() {
		return this.routYdCd20;
	}
	
	/**
	 * Column Info
	 * @return routYdCd21
	 */
	public String getRoutYdCd21() {
		return this.routYdCd21;
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
	 * @return routN1stYdCd
	 */
	public String getRoutN1stYdCd() {
		return this.routN1stYdCd;
	}
	
	/**
	 * Column Info
	 * @return routSeq
	 */
	public String getRoutSeq() {
		return this.routSeq;
	}
	
	/**
	 * Column Info
	 * @return routYdCd19
	 */
	public String getRoutYdCd19() {
		return this.routYdCd19;
	}
	
	/**
	 * Column Info
	 * @return routYdCd17
	 */
	public String getRoutYdCd17() {
		return this.routYdCd17;
	}
	
	/**
	 * Column Info
	 * @return routYdCd18
	 */
	public String getRoutYdCd18() {
		return this.routYdCd18;
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
	 * @return routYdCd15
	 */
	public String getRoutYdCd15() {
		return this.routYdCd15;
	}
	
	/**
	 * Column Info
	 * @return routYdCd16
	 */
	public String getRoutYdCd16() {
		return this.routYdCd16;
	}
	
	/**
	 * Column Info
	 * @return routYdCd13
	 */
	public String getRoutYdCd13() {
		return this.routYdCd13;
	}
	
	/**
	 * Column Info
	 * @return routYdCd14
	 */
	public String getRoutYdCd14() {
		return this.routYdCd14;
	}
	
	/**
	 * Column Info
	 * @return routYdCd11
	 */
	public String getRoutYdCd11() {
		return this.routYdCd11;
	}
	
	/**
	 * Column Info
	 * @return routYdCd12
	 */
	public String getRoutYdCd12() {
		return this.routYdCd12;
	}
	
	/**
	 * Column Info
	 * @return routYdCd10
	 */
	public String getRoutYdCd10() {
		return this.routYdCd10;
	}
	
	/**
	 * Column Info
	 * @return routLstYdCd
	 */
	public String getRoutLstYdCd() {
		return this.routLstYdCd;
	}
	
	/**
	 * Column Info
	 * @return routYdCd30
	 */
	public String getRoutYdCd30() {
		return this.routYdCd30;
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
	 * @param routYdCd09
	 */
	public void setRoutYdCd09(String routYdCd09) {
		this.routYdCd09 = routYdCd09;
	}
	
	/**
	 * Column Info
	 * @param routYdCd08
	 */
	public void setRoutYdCd08(String routYdCd08) {
		this.routYdCd08 = routYdCd08;
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
	 * @param routYdCd22
	 */
	public void setRoutYdCd22(String routYdCd22) {
		this.routYdCd22 = routYdCd22;
	}
	
	/**
	 * Column Info
	 * @param routYdCd04
	 */
	public void setRoutYdCd04(String routYdCd04) {
		this.routYdCd04 = routYdCd04;
	}
	
	/**
	 * Column Info
	 * @param routYdCd23
	 */
	public void setRoutYdCd23(String routYdCd23) {
		this.routYdCd23 = routYdCd23;
	}
	
	/**
	 * Column Info
	 * @param routYdCd05
	 */
	public void setRoutYdCd05(String routYdCd05) {
		this.routYdCd05 = routYdCd05;
	}
	
	/**
	 * Column Info
	 * @param routYdCd24
	 */
	public void setRoutYdCd24(String routYdCd24) {
		this.routYdCd24 = routYdCd24;
	}
	
	/**
	 * Column Info
	 * @param routYdCd06
	 */
	public void setRoutYdCd06(String routYdCd06) {
		this.routYdCd06 = routYdCd06;
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
	 * @param routYdCd25
	 */
	public void setRoutYdCd25(String routYdCd25) {
		this.routYdCd25 = routYdCd25;
	}
	
	/**
	 * Column Info
	 * @param routYdCd07
	 */
	public void setRoutYdCd07(String routYdCd07) {
		this.routYdCd07 = routYdCd07;
	}
	
	/**
	 * Column Info
	 * @param routYdCd26
	 */
	public void setRoutYdCd26(String routYdCd26) {
		this.routYdCd26 = routYdCd26;
	}
	
	/**
	 * Column Info
	 * @param routYdCd27
	 */
	public void setRoutYdCd27(String routYdCd27) {
		this.routYdCd27 = routYdCd27;
	}
	
	/**
	 * Column Info
	 * @param routYdCd01
	 */
	public void setRoutYdCd01(String routYdCd01) {
		this.routYdCd01 = routYdCd01;
	}
	
	/**
	 * Column Info
	 * @param routYdCd28
	 */
	public void setRoutYdCd28(String routYdCd28) {
		this.routYdCd28 = routYdCd28;
	}
	
	/**
	 * Column Info
	 * @param routYdCd02
	 */
	public void setRoutYdCd02(String routYdCd02) {
		this.routYdCd02 = routYdCd02;
	}
	
	/**
	 * Column Info
	 * @param routYdCd29
	 */
	public void setRoutYdCd29(String routYdCd29) {
		this.routYdCd29 = routYdCd29;
	}
	
	/**
	 * Column Info
	 * @param routYdCd03
	 */
	public void setRoutYdCd03(String routYdCd03) {
		this.routYdCd03 = routYdCd03;
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
	 * @param routYdCd20
	 */
	public void setRoutYdCd20(String routYdCd20) {
		this.routYdCd20 = routYdCd20;
	}
	
	/**
	 * Column Info
	 * @param routYdCd21
	 */
	public void setRoutYdCd21(String routYdCd21) {
		this.routYdCd21 = routYdCd21;
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
	 * @param routN1stYdCd
	 */
	public void setRoutN1stYdCd(String routN1stYdCd) {
		this.routN1stYdCd = routN1stYdCd;
	}
	
	/**
	 * Column Info
	 * @param routSeq
	 */
	public void setRoutSeq(String routSeq) {
		this.routSeq = routSeq;
	}
	
	/**
	 * Column Info
	 * @param routYdCd19
	 */
	public void setRoutYdCd19(String routYdCd19) {
		this.routYdCd19 = routYdCd19;
	}
	
	/**
	 * Column Info
	 * @param routYdCd17
	 */
	public void setRoutYdCd17(String routYdCd17) {
		this.routYdCd17 = routYdCd17;
	}
	
	/**
	 * Column Info
	 * @param routYdCd18
	 */
	public void setRoutYdCd18(String routYdCd18) {
		this.routYdCd18 = routYdCd18;
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
	 * @param routYdCd15
	 */
	public void setRoutYdCd15(String routYdCd15) {
		this.routYdCd15 = routYdCd15;
	}
	
	/**
	 * Column Info
	 * @param routYdCd16
	 */
	public void setRoutYdCd16(String routYdCd16) {
		this.routYdCd16 = routYdCd16;
	}
	
	/**
	 * Column Info
	 * @param routYdCd13
	 */
	public void setRoutYdCd13(String routYdCd13) {
		this.routYdCd13 = routYdCd13;
	}
	
	/**
	 * Column Info
	 * @param routYdCd14
	 */
	public void setRoutYdCd14(String routYdCd14) {
		this.routYdCd14 = routYdCd14;
	}
	
	/**
	 * Column Info
	 * @param routYdCd11
	 */
	public void setRoutYdCd11(String routYdCd11) {
		this.routYdCd11 = routYdCd11;
	}
	
	/**
	 * Column Info
	 * @param routYdCd12
	 */
	public void setRoutYdCd12(String routYdCd12) {
		this.routYdCd12 = routYdCd12;
	}
	
	/**
	 * Column Info
	 * @param routYdCd10
	 */
	public void setRoutYdCd10(String routYdCd10) {
		this.routYdCd10 = routYdCd10;
	}
	
	/**
	 * Column Info
	 * @param routLstYdCd
	 */
	public void setRoutLstYdCd(String routLstYdCd) {
		this.routLstYdCd = routLstYdCd;
	}
	
	/**
	 * Column Info
	 * @param routYdCd30
	 */
	public void setRoutYdCd30(String routYdCd30) {
		this.routYdCd30 = routYdCd30;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRoutYdCd09(JSPUtil.getParameter(request, "rout_yd_cd09", ""));
		setRoutYdCd08(JSPUtil.getParameter(request, "rout_yd_cd08", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setRoutYdCd22(JSPUtil.getParameter(request, "rout_yd_cd22", ""));
		setRoutYdCd04(JSPUtil.getParameter(request, "rout_yd_cd04", ""));
		setRoutYdCd23(JSPUtil.getParameter(request, "rout_yd_cd23", ""));
		setRoutYdCd05(JSPUtil.getParameter(request, "rout_yd_cd05", ""));
		setRoutYdCd24(JSPUtil.getParameter(request, "rout_yd_cd24", ""));
		setRoutYdCd06(JSPUtil.getParameter(request, "rout_yd_cd06", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setRoutYdCd25(JSPUtil.getParameter(request, "rout_yd_cd25", ""));
		setRoutYdCd07(JSPUtil.getParameter(request, "rout_yd_cd07", ""));
		setRoutYdCd26(JSPUtil.getParameter(request, "rout_yd_cd26", ""));
		setRoutYdCd27(JSPUtil.getParameter(request, "rout_yd_cd27", ""));
		setRoutYdCd01(JSPUtil.getParameter(request, "rout_yd_cd01", ""));
		setRoutYdCd28(JSPUtil.getParameter(request, "rout_yd_cd28", ""));
		setRoutYdCd02(JSPUtil.getParameter(request, "rout_yd_cd02", ""));
		setRoutYdCd29(JSPUtil.getParameter(request, "rout_yd_cd29", ""));
		setRoutYdCd03(JSPUtil.getParameter(request, "rout_yd_cd03", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setRoutYdCd20(JSPUtil.getParameter(request, "rout_yd_cd20", ""));
		setRoutYdCd21(JSPUtil.getParameter(request, "rout_yd_cd21", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setRoutN1stYdCd(JSPUtil.getParameter(request, "rout_n1st_yd_cd", ""));
		setRoutSeq(JSPUtil.getParameter(request, "rout_seq", ""));
		setRoutYdCd19(JSPUtil.getParameter(request, "rout_yd_cd19", ""));
		setRoutYdCd17(JSPUtil.getParameter(request, "rout_yd_cd17", ""));
		setRoutYdCd18(JSPUtil.getParameter(request, "rout_yd_cd18", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRoutYdCd15(JSPUtil.getParameter(request, "rout_yd_cd15", ""));
		setRoutYdCd16(JSPUtil.getParameter(request, "rout_yd_cd16", ""));
		setRoutYdCd13(JSPUtil.getParameter(request, "rout_yd_cd13", ""));
		setRoutYdCd14(JSPUtil.getParameter(request, "rout_yd_cd14", ""));
		setRoutYdCd11(JSPUtil.getParameter(request, "rout_yd_cd11", ""));
		setRoutYdCd12(JSPUtil.getParameter(request, "rout_yd_cd12", ""));
		setRoutYdCd10(JSPUtil.getParameter(request, "rout_yd_cd10", ""));
		setRoutLstYdCd(JSPUtil.getParameter(request, "rout_lst_yd_cd", ""));
		setRoutYdCd30(JSPUtil.getParameter(request, "rout_yd_cd30", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaCntrMtyMvmtRoutVO[]
	 */
	public CoaCntrMtyMvmtRoutVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaCntrMtyMvmtRoutVO[]
	 */
	public CoaCntrMtyMvmtRoutVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaCntrMtyMvmtRoutVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] routYdCd09 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd09", length));
			String[] routYdCd08 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd08", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] routYdCd22 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd22", length));
			String[] routYdCd04 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd04", length));
			String[] routYdCd23 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd23", length));
			String[] routYdCd05 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd05", length));
			String[] routYdCd24 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd24", length));
			String[] routYdCd06 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd06", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] routYdCd25 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd25", length));
			String[] routYdCd07 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd07", length));
			String[] routYdCd26 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd26", length));
			String[] routYdCd27 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd27", length));
			String[] routYdCd01 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd01", length));
			String[] routYdCd28 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd28", length));
			String[] routYdCd02 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd02", length));
			String[] routYdCd29 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd29", length));
			String[] routYdCd03 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd03", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] routYdCd20 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd20", length));
			String[] routYdCd21 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd21", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] routN1stYdCd = (JSPUtil.getParameter(request, prefix	+ "rout_n1st_yd_cd", length));
			String[] routSeq = (JSPUtil.getParameter(request, prefix	+ "rout_seq", length));
			String[] routYdCd19 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd19", length));
			String[] routYdCd17 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd17", length));
			String[] routYdCd18 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd18", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] routYdCd15 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd15", length));
			String[] routYdCd16 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd16", length));
			String[] routYdCd13 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd13", length));
			String[] routYdCd14 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd14", length));
			String[] routYdCd11 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd11", length));
			String[] routYdCd12 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd12", length));
			String[] routYdCd10 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd10", length));
			String[] routLstYdCd = (JSPUtil.getParameter(request, prefix	+ "rout_lst_yd_cd", length));
			String[] routYdCd30 = (JSPUtil.getParameter(request, prefix	+ "rout_yd_cd30", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaCntrMtyMvmtRoutVO();
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (routYdCd09[i] != null)
					model.setRoutYdCd09(routYdCd09[i]);
				if (routYdCd08[i] != null)
					model.setRoutYdCd08(routYdCd08[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (routYdCd22[i] != null)
					model.setRoutYdCd22(routYdCd22[i]);
				if (routYdCd04[i] != null)
					model.setRoutYdCd04(routYdCd04[i]);
				if (routYdCd23[i] != null)
					model.setRoutYdCd23(routYdCd23[i]);
				if (routYdCd05[i] != null)
					model.setRoutYdCd05(routYdCd05[i]);
				if (routYdCd24[i] != null)
					model.setRoutYdCd24(routYdCd24[i]);
				if (routYdCd06[i] != null)
					model.setRoutYdCd06(routYdCd06[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (routYdCd25[i] != null)
					model.setRoutYdCd25(routYdCd25[i]);
				if (routYdCd07[i] != null)
					model.setRoutYdCd07(routYdCd07[i]);
				if (routYdCd26[i] != null)
					model.setRoutYdCd26(routYdCd26[i]);
				if (routYdCd27[i] != null)
					model.setRoutYdCd27(routYdCd27[i]);
				if (routYdCd01[i] != null)
					model.setRoutYdCd01(routYdCd01[i]);
				if (routYdCd28[i] != null)
					model.setRoutYdCd28(routYdCd28[i]);
				if (routYdCd02[i] != null)
					model.setRoutYdCd02(routYdCd02[i]);
				if (routYdCd29[i] != null)
					model.setRoutYdCd29(routYdCd29[i]);
				if (routYdCd03[i] != null)
					model.setRoutYdCd03(routYdCd03[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (routYdCd20[i] != null)
					model.setRoutYdCd20(routYdCd20[i]);
				if (routYdCd21[i] != null)
					model.setRoutYdCd21(routYdCd21[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (routN1stYdCd[i] != null)
					model.setRoutN1stYdCd(routN1stYdCd[i]);
				if (routSeq[i] != null)
					model.setRoutSeq(routSeq[i]);
				if (routYdCd19[i] != null)
					model.setRoutYdCd19(routYdCd19[i]);
				if (routYdCd17[i] != null)
					model.setRoutYdCd17(routYdCd17[i]);
				if (routYdCd18[i] != null)
					model.setRoutYdCd18(routYdCd18[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (routYdCd15[i] != null)
					model.setRoutYdCd15(routYdCd15[i]);
				if (routYdCd16[i] != null)
					model.setRoutYdCd16(routYdCd16[i]);
				if (routYdCd13[i] != null)
					model.setRoutYdCd13(routYdCd13[i]);
				if (routYdCd14[i] != null)
					model.setRoutYdCd14(routYdCd14[i]);
				if (routYdCd11[i] != null)
					model.setRoutYdCd11(routYdCd11[i]);
				if (routYdCd12[i] != null)
					model.setRoutYdCd12(routYdCd12[i]);
				if (routYdCd10[i] != null)
					model.setRoutYdCd10(routYdCd10[i]);
				if (routLstYdCd[i] != null)
					model.setRoutLstYdCd(routLstYdCd[i]);
				if (routYdCd30[i] != null)
					model.setRoutYdCd30(routYdCd30[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaCntrMtyMvmtRoutVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaCntrMtyMvmtRoutVO[]
	 */
	public CoaCntrMtyMvmtRoutVO[] getCoaCntrMtyMvmtRoutVOs(){
		CoaCntrMtyMvmtRoutVO[] vos = (CoaCntrMtyMvmtRoutVO[])models.toArray(new CoaCntrMtyMvmtRoutVO[models.size()]);
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
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd09 = this.routYdCd09 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd08 = this.routYdCd08 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd22 = this.routYdCd22 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd04 = this.routYdCd04 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd23 = this.routYdCd23 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd05 = this.routYdCd05 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd24 = this.routYdCd24 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd06 = this.routYdCd06 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd25 = this.routYdCd25 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd07 = this.routYdCd07 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd26 = this.routYdCd26 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd27 = this.routYdCd27 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd01 = this.routYdCd01 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd28 = this.routYdCd28 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd02 = this.routYdCd02 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd29 = this.routYdCd29 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd03 = this.routYdCd03 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd20 = this.routYdCd20 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd21 = this.routYdCd21 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routN1stYdCd = this.routN1stYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routSeq = this.routSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd19 = this.routYdCd19 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd17 = this.routYdCd17 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd18 = this.routYdCd18 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd15 = this.routYdCd15 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd16 = this.routYdCd16 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd13 = this.routYdCd13 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd14 = this.routYdCd14 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd11 = this.routYdCd11 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd12 = this.routYdCd12 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd10 = this.routYdCd10 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routLstYdCd = this.routLstYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routYdCd30 = this.routYdCd30 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
