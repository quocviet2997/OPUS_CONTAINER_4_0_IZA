/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : JooStlBssPortVO.java
*@FileTitle : JooStlBssPortVO
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

public class JooStlBssPortVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<JooStlBssPortVO> models = new ArrayList<JooStlBssPortVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String n1stStlBzcPortCd = null;
	/* Column Info */
	private String n2ndStlPairPortCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String joCrrCd = null;
	/* Column Info */
	private String n3rdStlBzcPortCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String agmtPortTpCondCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String joStlItmCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String joStlTgtTpCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String agmtPortCondCd = null;
	/* Column Info */
	private String ucBssPortCd = null;
	/* Column Info */
	private String agmtMonCondCd = null;
	/* Column Info */
	private String n3rdStlPairPortCd = null;
	/* Column Info */
	private String n1stStlPairPortCd = null;
	/* Column Info */
	private String stlTgtVvdBssCd = null;
	/* Column Info */
	private String n2ndStlBzcPortCd = null;
	/* Column Info */
	private String agmtOpTpCondCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public JooStlBssPortVO() {}

	public JooStlBssPortVO(String ibflag, String pagerows, String joCrrCd, String rlaneCd, String skdDirCd, String joStlItmCd, String joStlTgtTpCd, String n1stStlBzcPortCd, String n2ndStlBzcPortCd, String n3rdStlBzcPortCd, String n1stStlPairPortCd, String n2ndStlPairPortCd, String n3rdStlPairPortCd, String stlTgtVvdBssCd, String trdCd, String creDt, String creUsrId, String updDt, String updUsrId, String ucBssPortCd, String agmtMonCondCd, String agmtPortCondCd, String agmtPortTpCondCd, String agmtOpTpCondCd) {
		this.updDt = updDt;
		this.n1stStlBzcPortCd = n1stStlBzcPortCd;
		this.n2ndStlPairPortCd = n2ndStlPairPortCd;
		this.creDt = creDt;
		this.trdCd = trdCd;
		this.joCrrCd = joCrrCd;
		this.n3rdStlBzcPortCd = n3rdStlBzcPortCd;
		this.rlaneCd = rlaneCd;
		this.agmtPortTpCondCd = agmtPortTpCondCd;
		this.skdDirCd = skdDirCd;
		this.joStlItmCd = joStlItmCd;
		this.pagerows = pagerows;
		this.joStlTgtTpCd = joStlTgtTpCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.agmtPortCondCd = agmtPortCondCd;
		this.ucBssPortCd = ucBssPortCd;
		this.agmtMonCondCd = agmtMonCondCd;
		this.n3rdStlPairPortCd = n3rdStlPairPortCd;
		this.n1stStlPairPortCd = n1stStlPairPortCd;
		this.stlTgtVvdBssCd = stlTgtVvdBssCd;
		this.n2ndStlBzcPortCd = n2ndStlBzcPortCd;
		this.agmtOpTpCondCd = agmtOpTpCondCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("n1st_stl_bzc_port_cd", getN1stStlBzcPortCd());
		this.hashColumns.put("n2nd_stl_pair_port_cd", getN2ndStlPairPortCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("jo_crr_cd", getJoCrrCd());
		this.hashColumns.put("n3rd_stl_bzc_port_cd", getN3rdStlBzcPortCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("agmt_port_tp_cond_cd", getAgmtPortTpCondCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("jo_stl_itm_cd", getJoStlItmCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("jo_stl_tgt_tp_cd", getJoStlTgtTpCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("agmt_port_cond_cd", getAgmtPortCondCd());
		this.hashColumns.put("uc_bss_port_cd", getUcBssPortCd());
		this.hashColumns.put("agmt_mon_cond_cd", getAgmtMonCondCd());
		this.hashColumns.put("n3rd_stl_pair_port_cd", getN3rdStlPairPortCd());
		this.hashColumns.put("n1st_stl_pair_port_cd", getN1stStlPairPortCd());
		this.hashColumns.put("stl_tgt_vvd_bss_cd", getStlTgtVvdBssCd());
		this.hashColumns.put("n2nd_stl_bzc_port_cd", getN2ndStlBzcPortCd());
		this.hashColumns.put("agmt_op_tp_cond_cd", getAgmtOpTpCondCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("n1st_stl_bzc_port_cd", "n1stStlBzcPortCd");
		this.hashFields.put("n2nd_stl_pair_port_cd", "n2ndStlPairPortCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("jo_crr_cd", "joCrrCd");
		this.hashFields.put("n3rd_stl_bzc_port_cd", "n3rdStlBzcPortCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("agmt_port_tp_cond_cd", "agmtPortTpCondCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("jo_stl_itm_cd", "joStlItmCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("jo_stl_tgt_tp_cd", "joStlTgtTpCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("agmt_port_cond_cd", "agmtPortCondCd");
		this.hashFields.put("uc_bss_port_cd", "ucBssPortCd");
		this.hashFields.put("agmt_mon_cond_cd", "agmtMonCondCd");
		this.hashFields.put("n3rd_stl_pair_port_cd", "n3rdStlPairPortCd");
		this.hashFields.put("n1st_stl_pair_port_cd", "n1stStlPairPortCd");
		this.hashFields.put("stl_tgt_vvd_bss_cd", "stlTgtVvdBssCd");
		this.hashFields.put("n2nd_stl_bzc_port_cd", "n2ndStlBzcPortCd");
		this.hashFields.put("agmt_op_tp_cond_cd", "agmtOpTpCondCd");
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
	 * @return n1stStlBzcPortCd
	 */
	public String getN1stStlBzcPortCd() {
		return this.n1stStlBzcPortCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndStlPairPortCd
	 */
	public String getN2ndStlPairPortCd() {
		return this.n2ndStlPairPortCd;
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
	 * @return joCrrCd
	 */
	public String getJoCrrCd() {
		return this.joCrrCd;
	}
	
	/**
	 * Column Info
	 * @return n3rdStlBzcPortCd
	 */
	public String getN3rdStlBzcPortCd() {
		return this.n3rdStlBzcPortCd;
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
	 * @return joStlTgtTpCd
	 */
	public String getJoStlTgtTpCd() {
		return this.joStlTgtTpCd;
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
	 * @return agmtMonCondCd
	 */
	public String getAgmtMonCondCd() {
		return this.agmtMonCondCd;
	}
	
	/**
	 * Column Info
	 * @return n3rdStlPairPortCd
	 */
	public String getN3rdStlPairPortCd() {
		return this.n3rdStlPairPortCd;
	}
	
	/**
	 * Column Info
	 * @return n1stStlPairPortCd
	 */
	public String getN1stStlPairPortCd() {
		return this.n1stStlPairPortCd;
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
	 * @return n2ndStlBzcPortCd
	 */
	public String getN2ndStlBzcPortCd() {
		return this.n2ndStlBzcPortCd;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param n1stStlBzcPortCd
	 */
	public void setN1stStlBzcPortCd(String n1stStlBzcPortCd) {
		this.n1stStlBzcPortCd = n1stStlBzcPortCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndStlPairPortCd
	 */
	public void setN2ndStlPairPortCd(String n2ndStlPairPortCd) {
		this.n2ndStlPairPortCd = n2ndStlPairPortCd;
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
	 * @param joCrrCd
	 */
	public void setJoCrrCd(String joCrrCd) {
		this.joCrrCd = joCrrCd;
	}
	
	/**
	 * Column Info
	 * @param n3rdStlBzcPortCd
	 */
	public void setN3rdStlBzcPortCd(String n3rdStlBzcPortCd) {
		this.n3rdStlBzcPortCd = n3rdStlBzcPortCd;
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
	 * @param joStlTgtTpCd
	 */
	public void setJoStlTgtTpCd(String joStlTgtTpCd) {
		this.joStlTgtTpCd = joStlTgtTpCd;
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
	 * @param agmtMonCondCd
	 */
	public void setAgmtMonCondCd(String agmtMonCondCd) {
		this.agmtMonCondCd = agmtMonCondCd;
	}
	
	/**
	 * Column Info
	 * @param n3rdStlPairPortCd
	 */
	public void setN3rdStlPairPortCd(String n3rdStlPairPortCd) {
		this.n3rdStlPairPortCd = n3rdStlPairPortCd;
	}
	
	/**
	 * Column Info
	 * @param n1stStlPairPortCd
	 */
	public void setN1stStlPairPortCd(String n1stStlPairPortCd) {
		this.n1stStlPairPortCd = n1stStlPairPortCd;
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
	 * @param n2ndStlBzcPortCd
	 */
	public void setN2ndStlBzcPortCd(String n2ndStlBzcPortCd) {
		this.n2ndStlBzcPortCd = n2ndStlBzcPortCd;
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
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setN1stStlBzcPortCd(JSPUtil.getParameter(request, "n1st_stl_bzc_port_cd", ""));
		setN2ndStlPairPortCd(JSPUtil.getParameter(request, "n2nd_stl_pair_port_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setJoCrrCd(JSPUtil.getParameter(request, "jo_crr_cd", ""));
		setN3rdStlBzcPortCd(JSPUtil.getParameter(request, "n3rd_stl_bzc_port_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setAgmtPortTpCondCd(JSPUtil.getParameter(request, "agmt_port_tp_cond_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setJoStlItmCd(JSPUtil.getParameter(request, "jo_stl_itm_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setJoStlTgtTpCd(JSPUtil.getParameter(request, "jo_stl_tgt_tp_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAgmtPortCondCd(JSPUtil.getParameter(request, "agmt_port_cond_cd", ""));
		setUcBssPortCd(JSPUtil.getParameter(request, "uc_bss_port_cd", ""));
		setAgmtMonCondCd(JSPUtil.getParameter(request, "agmt_mon_cond_cd", ""));
		setN3rdStlPairPortCd(JSPUtil.getParameter(request, "n3rd_stl_pair_port_cd", ""));
		setN1stStlPairPortCd(JSPUtil.getParameter(request, "n1st_stl_pair_port_cd", ""));
		setStlTgtVvdBssCd(JSPUtil.getParameter(request, "stl_tgt_vvd_bss_cd", ""));
		setN2ndStlBzcPortCd(JSPUtil.getParameter(request, "n2nd_stl_bzc_port_cd", ""));
		setAgmtOpTpCondCd(JSPUtil.getParameter(request, "agmt_op_tp_cond_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return JooStlBssPortVO[]
	 */
	public JooStlBssPortVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return JooStlBssPortVO[]
	 */
	public JooStlBssPortVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		JooStlBssPortVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] n1stStlBzcPortCd = (JSPUtil.getParameter(request, prefix	+ "n1st_stl_bzc_port_cd", length));
			String[] n2ndStlPairPortCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_stl_pair_port_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] joCrrCd = (JSPUtil.getParameter(request, prefix	+ "jo_crr_cd", length));
			String[] n3rdStlBzcPortCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_stl_bzc_port_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] agmtPortTpCondCd = (JSPUtil.getParameter(request, prefix	+ "agmt_port_tp_cond_cd", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] joStlItmCd = (JSPUtil.getParameter(request, prefix	+ "jo_stl_itm_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] joStlTgtTpCd = (JSPUtil.getParameter(request, prefix	+ "jo_stl_tgt_tp_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] agmtPortCondCd = (JSPUtil.getParameter(request, prefix	+ "agmt_port_cond_cd", length));
			String[] ucBssPortCd = (JSPUtil.getParameter(request, prefix	+ "uc_bss_port_cd", length));
			String[] agmtMonCondCd = (JSPUtil.getParameter(request, prefix	+ "agmt_mon_cond_cd", length));
			String[] n3rdStlPairPortCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_stl_pair_port_cd", length));
			String[] n1stStlPairPortCd = (JSPUtil.getParameter(request, prefix	+ "n1st_stl_pair_port_cd", length));
			String[] stlTgtVvdBssCd = (JSPUtil.getParameter(request, prefix	+ "stl_tgt_vvd_bss_cd", length));
			String[] n2ndStlBzcPortCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_stl_bzc_port_cd", length));
			String[] agmtOpTpCondCd = (JSPUtil.getParameter(request, prefix	+ "agmt_op_tp_cond_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new JooStlBssPortVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (n1stStlBzcPortCd[i] != null)
					model.setN1stStlBzcPortCd(n1stStlBzcPortCd[i]);
				if (n2ndStlPairPortCd[i] != null)
					model.setN2ndStlPairPortCd(n2ndStlPairPortCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (joCrrCd[i] != null)
					model.setJoCrrCd(joCrrCd[i]);
				if (n3rdStlBzcPortCd[i] != null)
					model.setN3rdStlBzcPortCd(n3rdStlBzcPortCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (agmtPortTpCondCd[i] != null)
					model.setAgmtPortTpCondCd(agmtPortTpCondCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (joStlItmCd[i] != null)
					model.setJoStlItmCd(joStlItmCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (joStlTgtTpCd[i] != null)
					model.setJoStlTgtTpCd(joStlTgtTpCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (agmtPortCondCd[i] != null)
					model.setAgmtPortCondCd(agmtPortCondCd[i]);
				if (ucBssPortCd[i] != null)
					model.setUcBssPortCd(ucBssPortCd[i]);
				if (agmtMonCondCd[i] != null)
					model.setAgmtMonCondCd(agmtMonCondCd[i]);
				if (n3rdStlPairPortCd[i] != null)
					model.setN3rdStlPairPortCd(n3rdStlPairPortCd[i]);
				if (n1stStlPairPortCd[i] != null)
					model.setN1stStlPairPortCd(n1stStlPairPortCd[i]);
				if (stlTgtVvdBssCd[i] != null)
					model.setStlTgtVvdBssCd(stlTgtVvdBssCd[i]);
				if (n2ndStlBzcPortCd[i] != null)
					model.setN2ndStlBzcPortCd(n2ndStlBzcPortCd[i]);
				if (agmtOpTpCondCd[i] != null)
					model.setAgmtOpTpCondCd(agmtOpTpCondCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getJooStlBssPortVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return JooStlBssPortVO[]
	 */
	public JooStlBssPortVO[] getJooStlBssPortVOs(){
		JooStlBssPortVO[] vos = (JooStlBssPortVO[])models.toArray(new JooStlBssPortVO[models.size()]);
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
		this.n1stStlBzcPortCd = this.n1stStlBzcPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndStlPairPortCd = this.n2ndStlPairPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joCrrCd = this.joCrrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdStlBzcPortCd = this.n3rdStlBzcPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtPortTpCondCd = this.agmtPortTpCondCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joStlItmCd = this.joStlItmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joStlTgtTpCd = this.joStlTgtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtPortCondCd = this.agmtPortCondCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ucBssPortCd = this.ucBssPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtMonCondCd = this.agmtMonCondCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdStlPairPortCd = this.n3rdStlPairPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stStlPairPortCd = this.n1stStlPairPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlTgtVvdBssCd = this.stlTgtVvdBssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndStlBzcPortCd = this.n2ndStlBzcPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOpTpCondCd = this.agmtOpTpCondCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
