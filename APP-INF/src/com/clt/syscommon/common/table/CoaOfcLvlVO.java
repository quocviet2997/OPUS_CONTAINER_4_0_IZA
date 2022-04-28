/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaOfcLvlVO.java
*@FileTitle : CoaOfcLvlVO
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

public class CoaOfcLvlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaOfcLvlVO> models = new ArrayList<CoaOfcLvlVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String ofcN4thLvlCd = null;
	/* Column Info */
	private String ofcN6thLvlCd = null;
	/* Column Info */
	private String ofcLvl = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String ofcN7thLvlTpCd = null;
	/* Column Info */
	private String ofcN2ndLvlCd = null;
	/* Column Info */
	private String ofcAplyFmYrmon = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ofcN7thLvlCd = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String ofcN2ndLvlTpCd = null;
	/* Column Info */
	private String prntOfcCd = null;
	/* Column Info */
	private String ofcN5thLvlCd = null;
	/* Column Info */
	private String ofcN5thLvlTpCd = null;
	/* Column Info */
	private String ofcN6thLvlTpCd = null;
	/* Column Info */
	private String ofcN1stLvlCd = null;
	/* Column Info */
	private String ofcN3rdLvlTpCd = null;
	/* Column Info */
	private String ofcAplyToYrmon = null;
	/* Column Info */
	private String ofcN3rdLvlCd = null;
	/* Column Info */
	private String ofcN4thLvlTpCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaOfcLvlVO() {}

	public CoaOfcLvlVO(String ibflag, String pagerows, String ofcCd, String ofcAplyToYrmon, String ofcAplyFmYrmon, String ofcLvl, String ofcN1stLvlCd, String ofcN2ndLvlCd, String ofcN2ndLvlTpCd, String ofcN3rdLvlCd, String ofcN3rdLvlTpCd, String ofcN4thLvlCd, String ofcN4thLvlTpCd, String ofcN5thLvlCd, String ofcN5thLvlTpCd, String ofcN6thLvlCd, String ofcN6thLvlTpCd, String prntOfcCd, String ofcN7thLvlCd, String ofcN7thLvlTpCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.ofcN4thLvlCd = ofcN4thLvlCd;
		this.ofcN6thLvlCd = ofcN6thLvlCd;
		this.ofcLvl = ofcLvl;
		this.creDt = creDt;
		this.ofcN7thLvlTpCd = ofcN7thLvlTpCd;
		this.ofcN2ndLvlCd = ofcN2ndLvlCd;
		this.ofcAplyFmYrmon = ofcAplyFmYrmon;
		this.pagerows = pagerows;
		this.ofcN7thLvlCd = ofcN7thLvlCd;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.ofcN2ndLvlTpCd = ofcN2ndLvlTpCd;
		this.prntOfcCd = prntOfcCd;
		this.ofcN5thLvlCd = ofcN5thLvlCd;
		this.ofcN5thLvlTpCd = ofcN5thLvlTpCd;
		this.ofcN6thLvlTpCd = ofcN6thLvlTpCd;
		this.ofcN1stLvlCd = ofcN1stLvlCd;
		this.ofcN3rdLvlTpCd = ofcN3rdLvlTpCd;
		this.ofcAplyToYrmon = ofcAplyToYrmon;
		this.ofcN3rdLvlCd = ofcN3rdLvlCd;
		this.ofcN4thLvlTpCd = ofcN4thLvlTpCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ofc_n4th_lvl_cd", getOfcN4thLvlCd());
		this.hashColumns.put("ofc_n6th_lvl_cd", getOfcN6thLvlCd());
		this.hashColumns.put("ofc_lvl", getOfcLvl());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ofc_n7th_lvl_tp_cd", getOfcN7thLvlTpCd());
		this.hashColumns.put("ofc_n2nd_lvl_cd", getOfcN2ndLvlCd());
		this.hashColumns.put("ofc_aply_fm_yrmon", getOfcAplyFmYrmon());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ofc_n7th_lvl_cd", getOfcN7thLvlCd());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ofc_n2nd_lvl_tp_cd", getOfcN2ndLvlTpCd());
		this.hashColumns.put("prnt_ofc_cd", getPrntOfcCd());
		this.hashColumns.put("ofc_n5th_lvl_cd", getOfcN5thLvlCd());
		this.hashColumns.put("ofc_n5th_lvl_tp_cd", getOfcN5thLvlTpCd());
		this.hashColumns.put("ofc_n6th_lvl_tp_cd", getOfcN6thLvlTpCd());
		this.hashColumns.put("ofc_n1st_lvl_cd", getOfcN1stLvlCd());
		this.hashColumns.put("ofc_n3rd_lvl_tp_cd", getOfcN3rdLvlTpCd());
		this.hashColumns.put("ofc_aply_to_yrmon", getOfcAplyToYrmon());
		this.hashColumns.put("ofc_n3rd_lvl_cd", getOfcN3rdLvlCd());
		this.hashColumns.put("ofc_n4th_lvl_tp_cd", getOfcN4thLvlTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ofc_n4th_lvl_cd", "ofcN4thLvlCd");
		this.hashFields.put("ofc_n6th_lvl_cd", "ofcN6thLvlCd");
		this.hashFields.put("ofc_lvl", "ofcLvl");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ofc_n7th_lvl_tp_cd", "ofcN7thLvlTpCd");
		this.hashFields.put("ofc_n2nd_lvl_cd", "ofcN2ndLvlCd");
		this.hashFields.put("ofc_aply_fm_yrmon", "ofcAplyFmYrmon");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ofc_n7th_lvl_cd", "ofcN7thLvlCd");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ofc_n2nd_lvl_tp_cd", "ofcN2ndLvlTpCd");
		this.hashFields.put("prnt_ofc_cd", "prntOfcCd");
		this.hashFields.put("ofc_n5th_lvl_cd", "ofcN5thLvlCd");
		this.hashFields.put("ofc_n5th_lvl_tp_cd", "ofcN5thLvlTpCd");
		this.hashFields.put("ofc_n6th_lvl_tp_cd", "ofcN6thLvlTpCd");
		this.hashFields.put("ofc_n1st_lvl_cd", "ofcN1stLvlCd");
		this.hashFields.put("ofc_n3rd_lvl_tp_cd", "ofcN3rdLvlTpCd");
		this.hashFields.put("ofc_aply_to_yrmon", "ofcAplyToYrmon");
		this.hashFields.put("ofc_n3rd_lvl_cd", "ofcN3rdLvlCd");
		this.hashFields.put("ofc_n4th_lvl_tp_cd", "ofcN4thLvlTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		return this.hashFields;
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
	 * @return ofcN4thLvlCd
	 */
	public String getOfcN4thLvlCd() {
		return this.ofcN4thLvlCd;
	}
	
	/**
	 * Column Info
	 * @return ofcN6thLvlCd
	 */
	public String getOfcN6thLvlCd() {
		return this.ofcN6thLvlCd;
	}
	
	/**
	 * Column Info
	 * @return ofcLvl
	 */
	public String getOfcLvl() {
		return this.ofcLvl;
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
	 * @return ofcN7thLvlTpCd
	 */
	public String getOfcN7thLvlTpCd() {
		return this.ofcN7thLvlTpCd;
	}
	
	/**
	 * Column Info
	 * @return ofcN2ndLvlCd
	 */
	public String getOfcN2ndLvlCd() {
		return this.ofcN2ndLvlCd;
	}
	
	/**
	 * Column Info
	 * @return ofcAplyFmYrmon
	 */
	public String getOfcAplyFmYrmon() {
		return this.ofcAplyFmYrmon;
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
	 * @return ofcN7thLvlCd
	 */
	public String getOfcN7thLvlCd() {
		return this.ofcN7thLvlCd;
	}
	
	/**
	 * Column Info
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return ofcN2ndLvlTpCd
	 */
	public String getOfcN2ndLvlTpCd() {
		return this.ofcN2ndLvlTpCd;
	}
	
	/**
	 * Column Info
	 * @return prntOfcCd
	 */
	public String getPrntOfcCd() {
		return this.prntOfcCd;
	}
	
	/**
	 * Column Info
	 * @return ofcN5thLvlCd
	 */
	public String getOfcN5thLvlCd() {
		return this.ofcN5thLvlCd;
	}
	
	/**
	 * Column Info
	 * @return ofcN5thLvlTpCd
	 */
	public String getOfcN5thLvlTpCd() {
		return this.ofcN5thLvlTpCd;
	}
	
	/**
	 * Column Info
	 * @return ofcN6thLvlTpCd
	 */
	public String getOfcN6thLvlTpCd() {
		return this.ofcN6thLvlTpCd;
	}
	
	/**
	 * Column Info
	 * @return ofcN1stLvlCd
	 */
	public String getOfcN1stLvlCd() {
		return this.ofcN1stLvlCd;
	}
	
	/**
	 * Column Info
	 * @return ofcN3rdLvlTpCd
	 */
	public String getOfcN3rdLvlTpCd() {
		return this.ofcN3rdLvlTpCd;
	}
	
	/**
	 * Column Info
	 * @return ofcAplyToYrmon
	 */
	public String getOfcAplyToYrmon() {
		return this.ofcAplyToYrmon;
	}
	
	/**
	 * Column Info
	 * @return ofcN3rdLvlCd
	 */
	public String getOfcN3rdLvlCd() {
		return this.ofcN3rdLvlCd;
	}
	
	/**
	 * Column Info
	 * @return ofcN4thLvlTpCd
	 */
	public String getOfcN4thLvlTpCd() {
		return this.ofcN4thLvlTpCd;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param ofcN4thLvlCd
	 */
	public void setOfcN4thLvlCd(String ofcN4thLvlCd) {
		this.ofcN4thLvlCd = ofcN4thLvlCd;
	}
	
	/**
	 * Column Info
	 * @param ofcN6thLvlCd
	 */
	public void setOfcN6thLvlCd(String ofcN6thLvlCd) {
		this.ofcN6thLvlCd = ofcN6thLvlCd;
	}
	
	/**
	 * Column Info
	 * @param ofcLvl
	 */
	public void setOfcLvl(String ofcLvl) {
		this.ofcLvl = ofcLvl;
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
	 * @param ofcN7thLvlTpCd
	 */
	public void setOfcN7thLvlTpCd(String ofcN7thLvlTpCd) {
		this.ofcN7thLvlTpCd = ofcN7thLvlTpCd;
	}
	
	/**
	 * Column Info
	 * @param ofcN2ndLvlCd
	 */
	public void setOfcN2ndLvlCd(String ofcN2ndLvlCd) {
		this.ofcN2ndLvlCd = ofcN2ndLvlCd;
	}
	
	/**
	 * Column Info
	 * @param ofcAplyFmYrmon
	 */
	public void setOfcAplyFmYrmon(String ofcAplyFmYrmon) {
		this.ofcAplyFmYrmon = ofcAplyFmYrmon;
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
	 * @param ofcN7thLvlCd
	 */
	public void setOfcN7thLvlCd(String ofcN7thLvlCd) {
		this.ofcN7thLvlCd = ofcN7thLvlCd;
	}
	
	/**
	 * Column Info
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
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
	 * @param ofcN2ndLvlTpCd
	 */
	public void setOfcN2ndLvlTpCd(String ofcN2ndLvlTpCd) {
		this.ofcN2ndLvlTpCd = ofcN2ndLvlTpCd;
	}
	
	/**
	 * Column Info
	 * @param prntOfcCd
	 */
	public void setPrntOfcCd(String prntOfcCd) {
		this.prntOfcCd = prntOfcCd;
	}
	
	/**
	 * Column Info
	 * @param ofcN5thLvlCd
	 */
	public void setOfcN5thLvlCd(String ofcN5thLvlCd) {
		this.ofcN5thLvlCd = ofcN5thLvlCd;
	}
	
	/**
	 * Column Info
	 * @param ofcN5thLvlTpCd
	 */
	public void setOfcN5thLvlTpCd(String ofcN5thLvlTpCd) {
		this.ofcN5thLvlTpCd = ofcN5thLvlTpCd;
	}
	
	/**
	 * Column Info
	 * @param ofcN6thLvlTpCd
	 */
	public void setOfcN6thLvlTpCd(String ofcN6thLvlTpCd) {
		this.ofcN6thLvlTpCd = ofcN6thLvlTpCd;
	}
	
	/**
	 * Column Info
	 * @param ofcN1stLvlCd
	 */
	public void setOfcN1stLvlCd(String ofcN1stLvlCd) {
		this.ofcN1stLvlCd = ofcN1stLvlCd;
	}
	
	/**
	 * Column Info
	 * @param ofcN3rdLvlTpCd
	 */
	public void setOfcN3rdLvlTpCd(String ofcN3rdLvlTpCd) {
		this.ofcN3rdLvlTpCd = ofcN3rdLvlTpCd;
	}
	
	/**
	 * Column Info
	 * @param ofcAplyToYrmon
	 */
	public void setOfcAplyToYrmon(String ofcAplyToYrmon) {
		this.ofcAplyToYrmon = ofcAplyToYrmon;
	}
	
	/**
	 * Column Info
	 * @param ofcN3rdLvlCd
	 */
	public void setOfcN3rdLvlCd(String ofcN3rdLvlCd) {
		this.ofcN3rdLvlCd = ofcN3rdLvlCd;
	}
	
	/**
	 * Column Info
	 * @param ofcN4thLvlTpCd
	 */
	public void setOfcN4thLvlTpCd(String ofcN4thLvlTpCd) {
		this.ofcN4thLvlTpCd = ofcN4thLvlTpCd;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setOfcN4thLvlCd(JSPUtil.getParameter(request, "ofc_n4th_lvl_cd", ""));
		setOfcN6thLvlCd(JSPUtil.getParameter(request, "ofc_n6th_lvl_cd", ""));
		setOfcLvl(JSPUtil.getParameter(request, "ofc_lvl", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setOfcN7thLvlTpCd(JSPUtil.getParameter(request, "ofc_n7th_lvl_tp_cd", ""));
		setOfcN2ndLvlCd(JSPUtil.getParameter(request, "ofc_n2nd_lvl_cd", ""));
		setOfcAplyFmYrmon(JSPUtil.getParameter(request, "ofc_aply_fm_yrmon", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setOfcN7thLvlCd(JSPUtil.getParameter(request, "ofc_n7th_lvl_cd", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setOfcN2ndLvlTpCd(JSPUtil.getParameter(request, "ofc_n2nd_lvl_tp_cd", ""));
		setPrntOfcCd(JSPUtil.getParameter(request, "prnt_ofc_cd", ""));
		setOfcN5thLvlCd(JSPUtil.getParameter(request, "ofc_n5th_lvl_cd", ""));
		setOfcN5thLvlTpCd(JSPUtil.getParameter(request, "ofc_n5th_lvl_tp_cd", ""));
		setOfcN6thLvlTpCd(JSPUtil.getParameter(request, "ofc_n6th_lvl_tp_cd", ""));
		setOfcN1stLvlCd(JSPUtil.getParameter(request, "ofc_n1st_lvl_cd", ""));
		setOfcN3rdLvlTpCd(JSPUtil.getParameter(request, "ofc_n3rd_lvl_tp_cd", ""));
		setOfcAplyToYrmon(JSPUtil.getParameter(request, "ofc_aply_to_yrmon", ""));
		setOfcN3rdLvlCd(JSPUtil.getParameter(request, "ofc_n3rd_lvl_cd", ""));
		setOfcN4thLvlTpCd(JSPUtil.getParameter(request, "ofc_n4th_lvl_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaOfcLvlVO[]
	 */
	public CoaOfcLvlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaOfcLvlVO[]
	 */
	public CoaOfcLvlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaOfcLvlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] ofcN4thLvlCd = (JSPUtil.getParameter(request, prefix	+ "ofc_n4th_lvl_cd", length));
			String[] ofcN6thLvlCd = (JSPUtil.getParameter(request, prefix	+ "ofc_n6th_lvl_cd", length));
			String[] ofcLvl = (JSPUtil.getParameter(request, prefix	+ "ofc_lvl", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] ofcN7thLvlTpCd = (JSPUtil.getParameter(request, prefix	+ "ofc_n7th_lvl_tp_cd", length));
			String[] ofcN2ndLvlCd = (JSPUtil.getParameter(request, prefix	+ "ofc_n2nd_lvl_cd", length));
			String[] ofcAplyFmYrmon = (JSPUtil.getParameter(request, prefix	+ "ofc_aply_fm_yrmon", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ofcN7thLvlCd = (JSPUtil.getParameter(request, prefix	+ "ofc_n7th_lvl_cd", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] ofcN2ndLvlTpCd = (JSPUtil.getParameter(request, prefix	+ "ofc_n2nd_lvl_tp_cd", length));
			String[] prntOfcCd = (JSPUtil.getParameter(request, prefix	+ "prnt_ofc_cd", length));
			String[] ofcN5thLvlCd = (JSPUtil.getParameter(request, prefix	+ "ofc_n5th_lvl_cd", length));
			String[] ofcN5thLvlTpCd = (JSPUtil.getParameter(request, prefix	+ "ofc_n5th_lvl_tp_cd", length));
			String[] ofcN6thLvlTpCd = (JSPUtil.getParameter(request, prefix	+ "ofc_n6th_lvl_tp_cd", length));
			String[] ofcN1stLvlCd = (JSPUtil.getParameter(request, prefix	+ "ofc_n1st_lvl_cd", length));
			String[] ofcN3rdLvlTpCd = (JSPUtil.getParameter(request, prefix	+ "ofc_n3rd_lvl_tp_cd", length));
			String[] ofcAplyToYrmon = (JSPUtil.getParameter(request, prefix	+ "ofc_aply_to_yrmon", length));
			String[] ofcN3rdLvlCd = (JSPUtil.getParameter(request, prefix	+ "ofc_n3rd_lvl_cd", length));
			String[] ofcN4thLvlTpCd = (JSPUtil.getParameter(request, prefix	+ "ofc_n4th_lvl_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaOfcLvlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (ofcN4thLvlCd[i] != null)
					model.setOfcN4thLvlCd(ofcN4thLvlCd[i]);
				if (ofcN6thLvlCd[i] != null)
					model.setOfcN6thLvlCd(ofcN6thLvlCd[i]);
				if (ofcLvl[i] != null)
					model.setOfcLvl(ofcLvl[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ofcN7thLvlTpCd[i] != null)
					model.setOfcN7thLvlTpCd(ofcN7thLvlTpCd[i]);
				if (ofcN2ndLvlCd[i] != null)
					model.setOfcN2ndLvlCd(ofcN2ndLvlCd[i]);
				if (ofcAplyFmYrmon[i] != null)
					model.setOfcAplyFmYrmon(ofcAplyFmYrmon[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ofcN7thLvlCd[i] != null)
					model.setOfcN7thLvlCd(ofcN7thLvlCd[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ofcN2ndLvlTpCd[i] != null)
					model.setOfcN2ndLvlTpCd(ofcN2ndLvlTpCd[i]);
				if (prntOfcCd[i] != null)
					model.setPrntOfcCd(prntOfcCd[i]);
				if (ofcN5thLvlCd[i] != null)
					model.setOfcN5thLvlCd(ofcN5thLvlCd[i]);
				if (ofcN5thLvlTpCd[i] != null)
					model.setOfcN5thLvlTpCd(ofcN5thLvlTpCd[i]);
				if (ofcN6thLvlTpCd[i] != null)
					model.setOfcN6thLvlTpCd(ofcN6thLvlTpCd[i]);
				if (ofcN1stLvlCd[i] != null)
					model.setOfcN1stLvlCd(ofcN1stLvlCd[i]);
				if (ofcN3rdLvlTpCd[i] != null)
					model.setOfcN3rdLvlTpCd(ofcN3rdLvlTpCd[i]);
				if (ofcAplyToYrmon[i] != null)
					model.setOfcAplyToYrmon(ofcAplyToYrmon[i]);
				if (ofcN3rdLvlCd[i] != null)
					model.setOfcN3rdLvlCd(ofcN3rdLvlCd[i]);
				if (ofcN4thLvlTpCd[i] != null)
					model.setOfcN4thLvlTpCd(ofcN4thLvlTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaOfcLvlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaOfcLvlVO[]
	 */
	public CoaOfcLvlVO[] getCoaOfcLvlVOs(){
		CoaOfcLvlVO[] vos = (CoaOfcLvlVO[])models.toArray(new CoaOfcLvlVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcN4thLvlCd = this.ofcN4thLvlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcN6thLvlCd = this.ofcN6thLvlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcLvl = this.ofcLvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcN7thLvlTpCd = this.ofcN7thLvlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcN2ndLvlCd = this.ofcN2ndLvlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcAplyFmYrmon = this.ofcAplyFmYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcN7thLvlCd = this.ofcN7thLvlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcN2ndLvlTpCd = this.ofcN2ndLvlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prntOfcCd = this.prntOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcN5thLvlCd = this.ofcN5thLvlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcN5thLvlTpCd = this.ofcN5thLvlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcN6thLvlTpCd = this.ofcN6thLvlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcN1stLvlCd = this.ofcN1stLvlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcN3rdLvlTpCd = this.ofcN3rdLvlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcAplyToYrmon = this.ofcAplyToYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcN3rdLvlCd = this.ofcN3rdLvlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcN4thLvlTpCd = this.ofcN4thLvlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
