/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : VskVslSkdRsltVO.java
*@FileTitle : VskVslSkdRsltVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.05.03
*@LastModifier : 유혁
*@LastVersion : 1.0
* 2010.05.03 유혁 
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
 * @author 유혁
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class VskVslSkdRsltVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<VskVslSkdRsltVO> models = new ArrayList<VskVslSkdRsltVO>(); 
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String actBrthDt = null;
	/* Column Info */
	private String subTrdDirCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String arrRmk1 = null;
	/* Column Info */
	private String arrRmk2 = null;
	/* Column Info */
	private String vskdRsltXcldCd = null;
	/* Column Info */
	private String initDepDlayHrs = null;
	/* Column Info */
	private String xcldBrthDlayHrs = null;
	/* Column Info */
	private String depDlayRsnCd2 = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String depDlayRsnCd1 = null;
	/* Column Info */
	private String clptSeq = null;
	/* Column Info */
	private String vpsPortCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String xcldDepDlayHrs = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String pfEtdDt = null;
	/* Column Info */
	private String actInpYrmon = null;
	/* Column Info */
	private String initArrDlayHrs = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String pfEtbDt = null;
	/* Column Info */
	private String depRmk1 = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String inclDepDlayHrs = null;
	/* Column Info */
	private String depRmk2 = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String actDepDt = null;
	/* Column Info */
	private String skdCngStsCd = null;
	/* Column Info */
	private String inclBrthDlayHrs = null;
	/* Column Info */
	private String depDlayHrs1 = null;
	/* Column Info */
	private String arrDlayHrs2 = null;
	/* Column Info */
	private String arrDlayHrs1 = null;
	/* Column Info */
	private String clptIndSeq = null;
	/* Column Info */
	private String depDlayHrs2 = null;
	/* Column Info */
	private String arrDlayRsnCd1 = null;
	/* Column Info */
	private String arrDlayRsnCd2 = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public VskVslSkdRsltVO() {}

	public VskVslSkdRsltVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String subTrdDirCd, String vpsPortCd, String clptIndSeq, String clptSeq, String skdDirCd, String actInpYrmon, String skdCngStsCd, String pfEtbDt, String actBrthDt, String pfEtdDt, String actDepDt, String arrDlayHrs1, String arrDlayHrs2, String arrDlayRsnCd1, String arrDlayRsnCd2, String arrRmk1, String arrRmk2, String depDlayHrs1, String depDlayHrs2, String depDlayRsnCd1, String depDlayRsnCd2, String depRmk1, String depRmk2, String inclBrthDlayHrs, String inclDepDlayHrs, String xcldBrthDlayHrs, String xcldDepDlayHrs, String vskdRsltXcldCd, String creUsrId, String creDt, String updUsrId, String updDt, String initArrDlayHrs, String initDepDlayHrs) {
		this.vslCd = vslCd;
		this.actBrthDt = actBrthDt;
		this.subTrdDirCd = subTrdDirCd;
		this.creDt = creDt;
		this.arrRmk1 = arrRmk1;
		this.arrRmk2 = arrRmk2;
		this.vskdRsltXcldCd = vskdRsltXcldCd;
		this.initDepDlayHrs = initDepDlayHrs;
		this.xcldBrthDlayHrs = xcldBrthDlayHrs;
		this.depDlayRsnCd2 = depDlayRsnCd2;
		this.pagerows = pagerows;
		this.depDlayRsnCd1 = depDlayRsnCd1;
		this.clptSeq = clptSeq;
		this.vpsPortCd = vpsPortCd;
		this.ibflag = ibflag;
		this.xcldDepDlayHrs = xcldDepDlayHrs;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.pfEtdDt = pfEtdDt;
		this.actInpYrmon = actInpYrmon;
		this.initArrDlayHrs = initArrDlayHrs;
		this.skdVoyNo = skdVoyNo;
		this.pfEtbDt = pfEtbDt;
		this.depRmk1 = depRmk1;
		this.skdDirCd = skdDirCd;
		this.inclDepDlayHrs = inclDepDlayHrs;
		this.depRmk2 = depRmk2;
		this.creUsrId = creUsrId;
		this.actDepDt = actDepDt;
		this.skdCngStsCd = skdCngStsCd;
		this.inclBrthDlayHrs = inclBrthDlayHrs;
		this.depDlayHrs1 = depDlayHrs1;
		this.arrDlayHrs2 = arrDlayHrs2;
		this.arrDlayHrs1 = arrDlayHrs1;
		this.clptIndSeq = clptIndSeq;
		this.depDlayHrs2 = depDlayHrs2;
		this.arrDlayRsnCd1 = arrDlayRsnCd1;
		this.arrDlayRsnCd2 = arrDlayRsnCd2;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("act_brth_dt", getActBrthDt());
		this.hashColumns.put("sub_trd_dir_cd", getSubTrdDirCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("arr_rmk1", getArrRmk1());
		this.hashColumns.put("arr_rmk2", getArrRmk2());
		this.hashColumns.put("vskd_rslt_xcld_cd", getVskdRsltXcldCd());
		this.hashColumns.put("init_dep_dlay_hrs", getInitDepDlayHrs());
		this.hashColumns.put("xcld_brth_dlay_hrs", getXcldBrthDlayHrs());
		this.hashColumns.put("dep_dlay_rsn_cd2", getDepDlayRsnCd2());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("dep_dlay_rsn_cd1", getDepDlayRsnCd1());
		this.hashColumns.put("clpt_seq", getClptSeq());
		this.hashColumns.put("vps_port_cd", getVpsPortCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("xcld_dep_dlay_hrs", getXcldDepDlayHrs());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("pf_etd_dt", getPfEtdDt());
		this.hashColumns.put("act_inp_yrmon", getActInpYrmon());
		this.hashColumns.put("init_arr_dlay_hrs", getInitArrDlayHrs());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("pf_etb_dt", getPfEtbDt());
		this.hashColumns.put("dep_rmk1", getDepRmk1());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("incl_dep_dlay_hrs", getInclDepDlayHrs());
		this.hashColumns.put("dep_rmk2", getDepRmk2());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("act_dep_dt", getActDepDt());
		this.hashColumns.put("skd_cng_sts_cd", getSkdCngStsCd());
		this.hashColumns.put("incl_brth_dlay_hrs", getInclBrthDlayHrs());
		this.hashColumns.put("dep_dlay_hrs1", getDepDlayHrs1());
		this.hashColumns.put("arr_dlay_hrs2", getArrDlayHrs2());
		this.hashColumns.put("arr_dlay_hrs1", getArrDlayHrs1());
		this.hashColumns.put("clpt_ind_seq", getClptIndSeq());
		this.hashColumns.put("dep_dlay_hrs2", getDepDlayHrs2());
		this.hashColumns.put("arr_dlay_rsn_cd1", getArrDlayRsnCd1());
		this.hashColumns.put("arr_dlay_rsn_cd2", getArrDlayRsnCd2());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("act_brth_dt", "actBrthDt");
		this.hashFields.put("sub_trd_dir_cd", "subTrdDirCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("arr_rmk1", "arrRmk1");
		this.hashFields.put("arr_rmk2", "arrRmk2");
		this.hashFields.put("vskd_rslt_xcld_cd", "vskdRsltXcldCd");
		this.hashFields.put("init_dep_dlay_hrs", "initDepDlayHrs");
		this.hashFields.put("xcld_brth_dlay_hrs", "xcldBrthDlayHrs");
		this.hashFields.put("dep_dlay_rsn_cd2", "depDlayRsnCd2");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("dep_dlay_rsn_cd1", "depDlayRsnCd1");
		this.hashFields.put("clpt_seq", "clptSeq");
		this.hashFields.put("vps_port_cd", "vpsPortCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("xcld_dep_dlay_hrs", "xcldDepDlayHrs");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("pf_etd_dt", "pfEtdDt");
		this.hashFields.put("act_inp_yrmon", "actInpYrmon");
		this.hashFields.put("init_arr_dlay_hrs", "initArrDlayHrs");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("pf_etb_dt", "pfEtbDt");
		this.hashFields.put("dep_rmk1", "depRmk1");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("incl_dep_dlay_hrs", "inclDepDlayHrs");
		this.hashFields.put("dep_rmk2", "depRmk2");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("act_dep_dt", "actDepDt");
		this.hashFields.put("skd_cng_sts_cd", "skdCngStsCd");
		this.hashFields.put("incl_brth_dlay_hrs", "inclBrthDlayHrs");
		this.hashFields.put("dep_dlay_hrs1", "depDlayHrs1");
		this.hashFields.put("arr_dlay_hrs2", "arrDlayHrs2");
		this.hashFields.put("arr_dlay_hrs1", "arrDlayHrs1");
		this.hashFields.put("clpt_ind_seq", "clptIndSeq");
		this.hashFields.put("dep_dlay_hrs2", "depDlayHrs2");
		this.hashFields.put("arr_dlay_rsn_cd1", "arrDlayRsnCd1");
		this.hashFields.put("arr_dlay_rsn_cd2", "arrDlayRsnCd2");
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
	 * @return actBrthDt
	 */
	public String getActBrthDt() {
		return this.actBrthDt;
	}
	
	/**
	 * Column Info
	 * @return subTrdDirCd
	 */
	public String getSubTrdDirCd() {
		return this.subTrdDirCd;
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
	 * @return arrRmk1
	 */
	public String getArrRmk1() {
		return this.arrRmk1;
	}
	
	/**
	 * Column Info
	 * @return arrRmk2
	 */
	public String getArrRmk2() {
		return this.arrRmk2;
	}
	
	/**
	 * Column Info
	 * @return vskdRsltXcldCd
	 */
	public String getVskdRsltXcldCd() {
		return this.vskdRsltXcldCd;
	}
	
	/**
	 * Column Info
	 * @return initDepDlayHrs
	 */
	public String getInitDepDlayHrs() {
		return this.initDepDlayHrs;
	}
	
	/**
	 * Column Info
	 * @return xcldBrthDlayHrs
	 */
	public String getXcldBrthDlayHrs() {
		return this.xcldBrthDlayHrs;
	}
	
	/**
	 * Column Info
	 * @return depDlayRsnCd2
	 */
	public String getDepDlayRsnCd2() {
		return this.depDlayRsnCd2;
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
	 * @return depDlayRsnCd1
	 */
	public String getDepDlayRsnCd1() {
		return this.depDlayRsnCd1;
	}
	
	/**
	 * Column Info
	 * @return clptSeq
	 */
	public String getClptSeq() {
		return this.clptSeq;
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
	 * @return xcldDepDlayHrs
	 */
	public String getXcldDepDlayHrs() {
		return this.xcldDepDlayHrs;
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
	 * @return pfEtdDt
	 */
	public String getPfEtdDt() {
		return this.pfEtdDt;
	}
	
	/**
	 * Column Info
	 * @return actInpYrmon
	 */
	public String getActInpYrmon() {
		return this.actInpYrmon;
	}
	
	/**
	 * Column Info
	 * @return initArrDlayHrs
	 */
	public String getInitArrDlayHrs() {
		return this.initArrDlayHrs;
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
	 * @return pfEtbDt
	 */
	public String getPfEtbDt() {
		return this.pfEtbDt;
	}
	
	/**
	 * Column Info
	 * @return depRmk1
	 */
	public String getDepRmk1() {
		return this.depRmk1;
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
	 * @return inclDepDlayHrs
	 */
	public String getInclDepDlayHrs() {
		return this.inclDepDlayHrs;
	}
	
	/**
	 * Column Info
	 * @return depRmk2
	 */
	public String getDepRmk2() {
		return this.depRmk2;
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
	 * @return actDepDt
	 */
	public String getActDepDt() {
		return this.actDepDt;
	}
	
	/**
	 * Column Info
	 * @return skdCngStsCd
	 */
	public String getSkdCngStsCd() {
		return this.skdCngStsCd;
	}
	
	/**
	 * Column Info
	 * @return inclBrthDlayHrs
	 */
	public String getInclBrthDlayHrs() {
		return this.inclBrthDlayHrs;
	}
	
	/**
	 * Column Info
	 * @return depDlayHrs1
	 */
	public String getDepDlayHrs1() {
		return this.depDlayHrs1;
	}
	
	/**
	 * Column Info
	 * @return arrDlayHrs2
	 */
	public String getArrDlayHrs2() {
		return this.arrDlayHrs2;
	}
	
	/**
	 * Column Info
	 * @return arrDlayHrs1
	 */
	public String getArrDlayHrs1() {
		return this.arrDlayHrs1;
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
	 * @return depDlayHrs2
	 */
	public String getDepDlayHrs2() {
		return this.depDlayHrs2;
	}
	
	/**
	 * Column Info
	 * @return arrDlayRsnCd1
	 */
	public String getArrDlayRsnCd1() {
		return this.arrDlayRsnCd1;
	}
	
	/**
	 * Column Info
	 * @return arrDlayRsnCd2
	 */
	public String getArrDlayRsnCd2() {
		return this.arrDlayRsnCd2;
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
	 * @param actBrthDt
	 */
	public void setActBrthDt(String actBrthDt) {
		this.actBrthDt = actBrthDt;
	}
	
	/**
	 * Column Info
	 * @param subTrdDirCd
	 */
	public void setSubTrdDirCd(String subTrdDirCd) {
		this.subTrdDirCd = subTrdDirCd;
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
	 * @param arrRmk1
	 */
	public void setArrRmk1(String arrRmk1) {
		this.arrRmk1 = arrRmk1;
	}
	
	/**
	 * Column Info
	 * @param arrRmk2
	 */
	public void setArrRmk2(String arrRmk2) {
		this.arrRmk2 = arrRmk2;
	}
	
	/**
	 * Column Info
	 * @param vskdRsltXcldCd
	 */
	public void setVskdRsltXcldCd(String vskdRsltXcldCd) {
		this.vskdRsltXcldCd = vskdRsltXcldCd;
	}
	
	/**
	 * Column Info
	 * @param initDepDlayHrs
	 */
	public void setInitDepDlayHrs(String initDepDlayHrs) {
		this.initDepDlayHrs = initDepDlayHrs;
	}
	
	/**
	 * Column Info
	 * @param xcldBrthDlayHrs
	 */
	public void setXcldBrthDlayHrs(String xcldBrthDlayHrs) {
		this.xcldBrthDlayHrs = xcldBrthDlayHrs;
	}
	
	/**
	 * Column Info
	 * @param depDlayRsnCd2
	 */
	public void setDepDlayRsnCd2(String depDlayRsnCd2) {
		this.depDlayRsnCd2 = depDlayRsnCd2;
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
	 * @param depDlayRsnCd1
	 */
	public void setDepDlayRsnCd1(String depDlayRsnCd1) {
		this.depDlayRsnCd1 = depDlayRsnCd1;
	}
	
	/**
	 * Column Info
	 * @param clptSeq
	 */
	public void setClptSeq(String clptSeq) {
		this.clptSeq = clptSeq;
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
	 * @param xcldDepDlayHrs
	 */
	public void setXcldDepDlayHrs(String xcldDepDlayHrs) {
		this.xcldDepDlayHrs = xcldDepDlayHrs;
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
	 * @param pfEtdDt
	 */
	public void setPfEtdDt(String pfEtdDt) {
		this.pfEtdDt = pfEtdDt;
	}
	
	/**
	 * Column Info
	 * @param actInpYrmon
	 */
	public void setActInpYrmon(String actInpYrmon) {
		this.actInpYrmon = actInpYrmon;
	}
	
	/**
	 * Column Info
	 * @param initArrDlayHrs
	 */
	public void setInitArrDlayHrs(String initArrDlayHrs) {
		this.initArrDlayHrs = initArrDlayHrs;
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
	 * @param pfEtbDt
	 */
	public void setPfEtbDt(String pfEtbDt) {
		this.pfEtbDt = pfEtbDt;
	}
	
	/**
	 * Column Info
	 * @param depRmk1
	 */
	public void setDepRmk1(String depRmk1) {
		this.depRmk1 = depRmk1;
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
	 * @param inclDepDlayHrs
	 */
	public void setInclDepDlayHrs(String inclDepDlayHrs) {
		this.inclDepDlayHrs = inclDepDlayHrs;
	}
	
	/**
	 * Column Info
	 * @param depRmk2
	 */
	public void setDepRmk2(String depRmk2) {
		this.depRmk2 = depRmk2;
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
	 * @param actDepDt
	 */
	public void setActDepDt(String actDepDt) {
		this.actDepDt = actDepDt;
	}
	
	/**
	 * Column Info
	 * @param skdCngStsCd
	 */
	public void setSkdCngStsCd(String skdCngStsCd) {
		this.skdCngStsCd = skdCngStsCd;
	}
	
	/**
	 * Column Info
	 * @param inclBrthDlayHrs
	 */
	public void setInclBrthDlayHrs(String inclBrthDlayHrs) {
		this.inclBrthDlayHrs = inclBrthDlayHrs;
	}
	
	/**
	 * Column Info
	 * @param depDlayHrs1
	 */
	public void setDepDlayHrs1(String depDlayHrs1) {
		this.depDlayHrs1 = depDlayHrs1;
	}
	
	/**
	 * Column Info
	 * @param arrDlayHrs2
	 */
	public void setArrDlayHrs2(String arrDlayHrs2) {
		this.arrDlayHrs2 = arrDlayHrs2;
	}
	
	/**
	 * Column Info
	 * @param arrDlayHrs1
	 */
	public void setArrDlayHrs1(String arrDlayHrs1) {
		this.arrDlayHrs1 = arrDlayHrs1;
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
	 * @param depDlayHrs2
	 */
	public void setDepDlayHrs2(String depDlayHrs2) {
		this.depDlayHrs2 = depDlayHrs2;
	}
	
	/**
	 * Column Info
	 * @param arrDlayRsnCd1
	 */
	public void setArrDlayRsnCd1(String arrDlayRsnCd1) {
		this.arrDlayRsnCd1 = arrDlayRsnCd1;
	}
	
	/**
	 * Column Info
	 * @param arrDlayRsnCd2
	 */
	public void setArrDlayRsnCd2(String arrDlayRsnCd2) {
		this.arrDlayRsnCd2 = arrDlayRsnCd2;
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
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setActBrthDt(JSPUtil.getParameter(request, prefix + "act_brth_dt", ""));
		setSubTrdDirCd(JSPUtil.getParameter(request, prefix + "sub_trd_dir_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setArrRmk1(JSPUtil.getParameter(request, prefix + "arr_rmk1", ""));
		setArrRmk2(JSPUtil.getParameter(request, prefix + "arr_rmk2", ""));
		setVskdRsltXcldCd(JSPUtil.getParameter(request, prefix + "vskd_rslt_xcld_cd", ""));
		setInitDepDlayHrs(JSPUtil.getParameter(request, prefix + "init_dep_dlay_hrs", ""));
		setXcldBrthDlayHrs(JSPUtil.getParameter(request, prefix + "xcld_brth_dlay_hrs", ""));
		setDepDlayRsnCd2(JSPUtil.getParameter(request, prefix + "dep_dlay_rsn_cd2", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setDepDlayRsnCd1(JSPUtil.getParameter(request, prefix + "dep_dlay_rsn_cd1", ""));
		setClptSeq(JSPUtil.getParameter(request, prefix + "clpt_seq", ""));
		setVpsPortCd(JSPUtil.getParameter(request, prefix + "vps_port_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setXcldDepDlayHrs(JSPUtil.getParameter(request, prefix + "xcld_dep_dlay_hrs", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setPfEtdDt(JSPUtil.getParameter(request, prefix + "pf_etd_dt", ""));
		setActInpYrmon(JSPUtil.getParameter(request, prefix + "act_inp_yrmon", ""));
		setInitArrDlayHrs(JSPUtil.getParameter(request, prefix + "init_arr_dlay_hrs", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setPfEtbDt(JSPUtil.getParameter(request, prefix + "pf_etb_dt", ""));
		setDepRmk1(JSPUtil.getParameter(request, prefix + "dep_rmk1", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setInclDepDlayHrs(JSPUtil.getParameter(request, prefix + "incl_dep_dlay_hrs", ""));
		setDepRmk2(JSPUtil.getParameter(request, prefix + "dep_rmk2", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setActDepDt(JSPUtil.getParameter(request, prefix + "act_dep_dt", ""));
		setSkdCngStsCd(JSPUtil.getParameter(request, prefix + "skd_cng_sts_cd", ""));
		setInclBrthDlayHrs(JSPUtil.getParameter(request, prefix + "incl_brth_dlay_hrs", ""));
		setDepDlayHrs1(JSPUtil.getParameter(request, prefix + "dep_dlay_hrs1", ""));
		setArrDlayHrs2(JSPUtil.getParameter(request, prefix + "arr_dlay_hrs2", ""));
		setArrDlayHrs1(JSPUtil.getParameter(request, prefix + "arr_dlay_hrs1", ""));
		setClptIndSeq(JSPUtil.getParameter(request, prefix + "clpt_ind_seq", ""));
		setDepDlayHrs2(JSPUtil.getParameter(request, prefix + "dep_dlay_hrs2", ""));
		setArrDlayRsnCd1(JSPUtil.getParameter(request, prefix + "arr_dlay_rsn_cd1", ""));
		setArrDlayRsnCd2(JSPUtil.getParameter(request, prefix + "arr_dlay_rsn_cd2", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return VskVslSkdRsltVO[]
	 */
	public VskVslSkdRsltVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return VskVslSkdRsltVO[]
	 */
	public VskVslSkdRsltVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		VskVslSkdRsltVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] actBrthDt = (JSPUtil.getParameter(request, prefix	+ "act_brth_dt", length));
			String[] subTrdDirCd = (JSPUtil.getParameter(request, prefix	+ "sub_trd_dir_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] arrRmk1 = (JSPUtil.getParameter(request, prefix	+ "arr_rmk1", length));
			String[] arrRmk2 = (JSPUtil.getParameter(request, prefix	+ "arr_rmk2", length));
			String[] vskdRsltXcldCd = (JSPUtil.getParameter(request, prefix	+ "vskd_rslt_xcld_cd", length));
			String[] initDepDlayHrs = (JSPUtil.getParameter(request, prefix	+ "init_dep_dlay_hrs", length));
			String[] xcldBrthDlayHrs = (JSPUtil.getParameter(request, prefix	+ "xcld_brth_dlay_hrs", length));
			String[] depDlayRsnCd2 = (JSPUtil.getParameter(request, prefix	+ "dep_dlay_rsn_cd2", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] depDlayRsnCd1 = (JSPUtil.getParameter(request, prefix	+ "dep_dlay_rsn_cd1", length));
			String[] clptSeq = (JSPUtil.getParameter(request, prefix	+ "clpt_seq", length));
			String[] vpsPortCd = (JSPUtil.getParameter(request, prefix	+ "vps_port_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] xcldDepDlayHrs = (JSPUtil.getParameter(request, prefix	+ "xcld_dep_dlay_hrs", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] pfEtdDt = (JSPUtil.getParameter(request, prefix	+ "pf_etd_dt", length));
			String[] actInpYrmon = (JSPUtil.getParameter(request, prefix	+ "act_inp_yrmon", length));
			String[] initArrDlayHrs = (JSPUtil.getParameter(request, prefix	+ "init_arr_dlay_hrs", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] pfEtbDt = (JSPUtil.getParameter(request, prefix	+ "pf_etb_dt", length));
			String[] depRmk1 = (JSPUtil.getParameter(request, prefix	+ "dep_rmk1", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] inclDepDlayHrs = (JSPUtil.getParameter(request, prefix	+ "incl_dep_dlay_hrs", length));
			String[] depRmk2 = (JSPUtil.getParameter(request, prefix	+ "dep_rmk2", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] actDepDt = (JSPUtil.getParameter(request, prefix	+ "act_dep_dt", length));
			String[] skdCngStsCd = (JSPUtil.getParameter(request, prefix	+ "skd_cng_sts_cd", length));
			String[] inclBrthDlayHrs = (JSPUtil.getParameter(request, prefix	+ "incl_brth_dlay_hrs", length));
			String[] depDlayHrs1 = (JSPUtil.getParameter(request, prefix	+ "dep_dlay_hrs1", length));
			String[] arrDlayHrs2 = (JSPUtil.getParameter(request, prefix	+ "arr_dlay_hrs2", length));
			String[] arrDlayHrs1 = (JSPUtil.getParameter(request, prefix	+ "arr_dlay_hrs1", length));
			String[] clptIndSeq = (JSPUtil.getParameter(request, prefix	+ "clpt_ind_seq", length));
			String[] depDlayHrs2 = (JSPUtil.getParameter(request, prefix	+ "dep_dlay_hrs2", length));
			String[] arrDlayRsnCd1 = (JSPUtil.getParameter(request, prefix	+ "arr_dlay_rsn_cd1", length));
			String[] arrDlayRsnCd2 = (JSPUtil.getParameter(request, prefix	+ "arr_dlay_rsn_cd2", length));
			
			for (int i = 0; i < length; i++) {
				model = new VskVslSkdRsltVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (actBrthDt[i] != null)
					model.setActBrthDt(actBrthDt[i]);
				if (subTrdDirCd[i] != null)
					model.setSubTrdDirCd(subTrdDirCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (arrRmk1[i] != null)
					model.setArrRmk1(arrRmk1[i]);
				if (arrRmk2[i] != null)
					model.setArrRmk2(arrRmk2[i]);
				if (vskdRsltXcldCd[i] != null)
					model.setVskdRsltXcldCd(vskdRsltXcldCd[i]);
				if (initDepDlayHrs[i] != null)
					model.setInitDepDlayHrs(initDepDlayHrs[i]);
				if (xcldBrthDlayHrs[i] != null)
					model.setXcldBrthDlayHrs(xcldBrthDlayHrs[i]);
				if (depDlayRsnCd2[i] != null)
					model.setDepDlayRsnCd2(depDlayRsnCd2[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (depDlayRsnCd1[i] != null)
					model.setDepDlayRsnCd1(depDlayRsnCd1[i]);
				if (clptSeq[i] != null)
					model.setClptSeq(clptSeq[i]);
				if (vpsPortCd[i] != null)
					model.setVpsPortCd(vpsPortCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (xcldDepDlayHrs[i] != null)
					model.setXcldDepDlayHrs(xcldDepDlayHrs[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (pfEtdDt[i] != null)
					model.setPfEtdDt(pfEtdDt[i]);
				if (actInpYrmon[i] != null)
					model.setActInpYrmon(actInpYrmon[i]);
				if (initArrDlayHrs[i] != null)
					model.setInitArrDlayHrs(initArrDlayHrs[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (pfEtbDt[i] != null)
					model.setPfEtbDt(pfEtbDt[i]);
				if (depRmk1[i] != null)
					model.setDepRmk1(depRmk1[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (inclDepDlayHrs[i] != null)
					model.setInclDepDlayHrs(inclDepDlayHrs[i]);
				if (depRmk2[i] != null)
					model.setDepRmk2(depRmk2[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (actDepDt[i] != null)
					model.setActDepDt(actDepDt[i]);
				if (skdCngStsCd[i] != null)
					model.setSkdCngStsCd(skdCngStsCd[i]);
				if (inclBrthDlayHrs[i] != null)
					model.setInclBrthDlayHrs(inclBrthDlayHrs[i]);
				if (depDlayHrs1[i] != null)
					model.setDepDlayHrs1(depDlayHrs1[i]);
				if (arrDlayHrs2[i] != null)
					model.setArrDlayHrs2(arrDlayHrs2[i]);
				if (arrDlayHrs1[i] != null)
					model.setArrDlayHrs1(arrDlayHrs1[i]);
				if (clptIndSeq[i] != null)
					model.setClptIndSeq(clptIndSeq[i]);
				if (depDlayHrs2[i] != null)
					model.setDepDlayHrs2(depDlayHrs2[i]);
				if (arrDlayRsnCd1[i] != null)
					model.setArrDlayRsnCd1(arrDlayRsnCd1[i]);
				if (arrDlayRsnCd2[i] != null)
					model.setArrDlayRsnCd2(arrDlayRsnCd2[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getVskVslSkdRsltVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return VskVslSkdRsltVO[]
	 */
	public VskVslSkdRsltVO[] getVskVslSkdRsltVOs(){
		VskVslSkdRsltVO[] vos = (VskVslSkdRsltVO[])models.toArray(new VskVslSkdRsltVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actBrthDt = this.actBrthDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdDirCd = this.subTrdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrRmk1 = this.arrRmk1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrRmk2 = this.arrRmk2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vskdRsltXcldCd = this.vskdRsltXcldCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.initDepDlayHrs = this.initDepDlayHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xcldBrthDlayHrs = this.xcldBrthDlayHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depDlayRsnCd2 = this.depDlayRsnCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depDlayRsnCd1 = this.depDlayRsnCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clptSeq = this.clptSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vpsPortCd = this.vpsPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xcldDepDlayHrs = this.xcldDepDlayHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pfEtdDt = this.pfEtdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actInpYrmon = this.actInpYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.initArrDlayHrs = this.initArrDlayHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pfEtbDt = this.pfEtbDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depRmk1 = this.depRmk1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inclDepDlayHrs = this.inclDepDlayHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depRmk2 = this.depRmk2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actDepDt = this.actDepDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdCngStsCd = this.skdCngStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inclBrthDlayHrs = this.inclBrthDlayHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depDlayHrs1 = this.depDlayHrs1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrDlayHrs2 = this.arrDlayHrs2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrDlayHrs1 = this.arrDlayHrs1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clptIndSeq = this.clptIndSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depDlayHrs2 = this.depDlayHrs2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrDlayRsnCd1 = this.arrDlayRsnCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrDlayRsnCd2 = this.arrDlayRsnCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
