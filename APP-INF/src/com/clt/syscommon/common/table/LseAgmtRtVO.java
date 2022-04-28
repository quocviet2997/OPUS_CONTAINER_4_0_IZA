/*=========================================================
*Copyright(c) 2019 CyberLogitec
*@FileName : LseAgmtRtVO.java
*@FileTitle : LseAgmtRtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2019.01.29
*@LastModifier : 
*@LastVersion : 1.0
* 2019.01.29  
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

public class LseAgmtRtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<LseAgmtRtVO> models = new ArrayList<LseAgmtRtVO>();
	
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String agmtChgVal = null;
	/* Column Info */
	private String lseFmTrDys = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String locCd = null;
	/* Column Info */
	private String agmtChgDys = null;
	/* Column Info */
	private String genRmk = null;
	/* Column Info */
	private String agmtSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String eqLocTpCd = null;
	/* Column Info */
	private String n1stChgAmt = null;
	/* Column Info */
	private String fmDt = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String edwUpdDt = null;
	/* Column Info */
	private String n2ndChgAmt = null;
	/* Column Info */
	private String agmtCtyCd = null;
	/* Column Info */
	private String cntrSpecNo = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String cntrRntlChgTpCd = null;
	/* Column Info */
	private String toDt = null;
	/* Column Info */
	private String lseToTrDys = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public LseAgmtRtVO() {}

	public LseAgmtRtVO(String ibflag, String pagerows, String agmtCtyCd, String agmtSeq, String locCd, String cntrTpszCd, String cntrRntlChgTpCd, String agmtChgVal, String n1stChgAmt, String n2ndChgAmt, String agmtChgDys, String cntrSpecNo, String genRmk, String creUsrId, String creDt, String updUsrId, String updDt, String eqLocTpCd, String edwUpdDt, String fmDt, String toDt, String lseFmTrDys, String lseToTrDys) {
		this.pagerows = pagerows;
		this.agmtChgVal = agmtChgVal;
		this.lseFmTrDys = lseFmTrDys;
		this.ibflag = ibflag;
		this.locCd = locCd;
		this.agmtChgDys = agmtChgDys;
		this.genRmk = genRmk;
		this.agmtSeq = agmtSeq;
		this.updUsrId = updUsrId;
		this.creUsrId = creUsrId;
		this.creDt = creDt;
		this.eqLocTpCd = eqLocTpCd;
		this.n1stChgAmt = n1stChgAmt;
		this.fmDt = fmDt;
		this.cntrTpszCd = cntrTpszCd;
		this.edwUpdDt = edwUpdDt;
		this.n2ndChgAmt = n2ndChgAmt;
		this.agmtCtyCd = agmtCtyCd;
		this.cntrSpecNo = cntrSpecNo;
		this.updDt = updDt;
		this.cntrRntlChgTpCd = cntrRntlChgTpCd;
		this.toDt = toDt;
		this.lseToTrDys = lseToTrDys;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("agmt_chg_val", getAgmtChgVal());
		this.hashColumns.put("lse_fm_tr_dys", getLseFmTrDys());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("agmt_chg_dys", getAgmtChgDys());
		this.hashColumns.put("gen_rmk", getGenRmk());
		this.hashColumns.put("agmt_seq", getAgmtSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eq_loc_tp_cd", getEqLocTpCd());
		this.hashColumns.put("n1st_chg_amt", getN1stChgAmt());
		this.hashColumns.put("fm_dt", getFmDt());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("n2nd_chg_amt", getN2ndChgAmt());
		this.hashColumns.put("agmt_cty_cd", getAgmtCtyCd());
		this.hashColumns.put("cntr_spec_no", getCntrSpecNo());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cntr_rntl_chg_tp_cd", getCntrRntlChgTpCd());
		this.hashColumns.put("to_dt", getToDt());
		this.hashColumns.put("lse_to_tr_dys", getLseToTrDys());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("agmt_chg_val", "agmtChgVal");
		this.hashFields.put("lse_fm_tr_dys", "lseFmTrDys");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("agmt_chg_dys", "agmtChgDys");
		this.hashFields.put("gen_rmk", "genRmk");
		this.hashFields.put("agmt_seq", "agmtSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eq_loc_tp_cd", "eqLocTpCd");
		this.hashFields.put("n1st_chg_amt", "n1stChgAmt");
		this.hashFields.put("fm_dt", "fmDt");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("n2nd_chg_amt", "n2ndChgAmt");
		this.hashFields.put("agmt_cty_cd", "agmtCtyCd");
		this.hashFields.put("cntr_spec_no", "cntrSpecNo");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cntr_rntl_chg_tp_cd", "cntrRntlChgTpCd");
		this.hashFields.put("to_dt", "toDt");
		this.hashFields.put("lse_to_tr_dys", "lseToTrDys");
		return this.hashFields;
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
	 * @return agmtChgVal
	 */
	public String getAgmtChgVal() {
		return this.agmtChgVal;
	}
	
	/**
	 * Column Info
	 * @return lseFmTrDys
	 */
	public String getLseFmTrDys() {
		return this.lseFmTrDys;
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
	 * @return locCd
	 */
	public String getLocCd() {
		return this.locCd;
	}
	
	/**
	 * Column Info
	 * @return agmtChgDys
	 */
	public String getAgmtChgDys() {
		return this.agmtChgDys;
	}
	
	/**
	 * Column Info
	 * @return genRmk
	 */
	public String getGenRmk() {
		return this.genRmk;
	}
	
	/**
	 * Column Info
	 * @return agmtSeq
	 */
	public String getAgmtSeq() {
		return this.agmtSeq;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return eqLocTpCd
	 */
	public String getEqLocTpCd() {
		return this.eqLocTpCd;
	}
	
	/**
	 * Column Info
	 * @return n1stChgAmt
	 */
	public String getN1stChgAmt() {
		return this.n1stChgAmt;
	}
	
	/**
	 * Column Info
	 * @return fmDt
	 */
	public String getFmDt() {
		return this.fmDt;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
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
	 * @return n2ndChgAmt
	 */
	public String getN2ndChgAmt() {
		return this.n2ndChgAmt;
	}
	
	/**
	 * Column Info
	 * @return agmtCtyCd
	 */
	public String getAgmtCtyCd() {
		return this.agmtCtyCd;
	}
	
	/**
	 * Column Info
	 * @return cntrSpecNo
	 */
	public String getCntrSpecNo() {
		return this.cntrSpecNo;
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
	 * @return cntrRntlChgTpCd
	 */
	public String getCntrRntlChgTpCd() {
		return this.cntrRntlChgTpCd;
	}
	
	/**
	 * Column Info
	 * @return toDt
	 */
	public String getToDt() {
		return this.toDt;
	}
	
	/**
	 * Column Info
	 * @return lseToTrDys
	 */
	public String getLseToTrDys() {
		return this.lseToTrDys;
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
	 * @param agmtChgVal
	 */
	public void setAgmtChgVal(String agmtChgVal) {
		this.agmtChgVal = agmtChgVal;
	}
	
	/**
	 * Column Info
	 * @param lseFmTrDys
	 */
	public void setLseFmTrDys(String lseFmTrDys) {
		this.lseFmTrDys = lseFmTrDys;
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
	 * @param locCd
	 */
	public void setLocCd(String locCd) {
		this.locCd = locCd;
	}
	
	/**
	 * Column Info
	 * @param agmtChgDys
	 */
	public void setAgmtChgDys(String agmtChgDys) {
		this.agmtChgDys = agmtChgDys;
	}
	
	/**
	 * Column Info
	 * @param genRmk
	 */
	public void setGenRmk(String genRmk) {
		this.genRmk = genRmk;
	}
	
	/**
	 * Column Info
	 * @param agmtSeq
	 */
	public void setAgmtSeq(String agmtSeq) {
		this.agmtSeq = agmtSeq;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
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
	 * @param eqLocTpCd
	 */
	public void setEqLocTpCd(String eqLocTpCd) {
		this.eqLocTpCd = eqLocTpCd;
	}
	
	/**
	 * Column Info
	 * @param n1stChgAmt
	 */
	public void setN1stChgAmt(String n1stChgAmt) {
		this.n1stChgAmt = n1stChgAmt;
	}
	
	/**
	 * Column Info
	 * @param fmDt
	 */
	public void setFmDt(String fmDt) {
		this.fmDt = fmDt;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
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
	 * @param n2ndChgAmt
	 */
	public void setN2ndChgAmt(String n2ndChgAmt) {
		this.n2ndChgAmt = n2ndChgAmt;
	}
	
	/**
	 * Column Info
	 * @param agmtCtyCd
	 */
	public void setAgmtCtyCd(String agmtCtyCd) {
		this.agmtCtyCd = agmtCtyCd;
	}
	
	/**
	 * Column Info
	 * @param cntrSpecNo
	 */
	public void setCntrSpecNo(String cntrSpecNo) {
		this.cntrSpecNo = cntrSpecNo;
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
	 * @param cntrRntlChgTpCd
	 */
	public void setCntrRntlChgTpCd(String cntrRntlChgTpCd) {
		this.cntrRntlChgTpCd = cntrRntlChgTpCd;
	}
	
	/**
	 * Column Info
	 * @param toDt
	 */
	public void setToDt(String toDt) {
		this.toDt = toDt;
	}
	
	/**
	 * Column Info
	 * @param lseToTrDys
	 */
	public void setLseToTrDys(String lseToTrDys) {
		this.lseToTrDys = lseToTrDys;
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
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setAgmtChgVal(JSPUtil.getParameter(request, prefix + "agmt_chg_val", ""));
		setLseFmTrDys(JSPUtil.getParameter(request, prefix + "lse_fm_tr_dys", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setLocCd(JSPUtil.getParameter(request, prefix + "loc_cd", ""));
		setAgmtChgDys(JSPUtil.getParameter(request, prefix + "agmt_chg_dys", ""));
		setGenRmk(JSPUtil.getParameter(request, prefix + "gen_rmk", ""));
		setAgmtSeq(JSPUtil.getParameter(request, prefix + "agmt_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setEqLocTpCd(JSPUtil.getParameter(request, prefix + "eq_loc_tp_cd", ""));
		setN1stChgAmt(JSPUtil.getParameter(request, prefix + "n1st_chg_amt", ""));
		setFmDt(JSPUtil.getParameter(request, prefix + "fm_dt", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setN2ndChgAmt(JSPUtil.getParameter(request, prefix + "n2nd_chg_amt", ""));
		setAgmtCtyCd(JSPUtil.getParameter(request, prefix + "agmt_cty_cd", ""));
		setCntrSpecNo(JSPUtil.getParameter(request, prefix + "cntr_spec_no", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setCntrRntlChgTpCd(JSPUtil.getParameter(request, prefix + "cntr_rntl_chg_tp_cd", ""));
		setToDt(JSPUtil.getParameter(request, prefix + "to_dt", ""));
		setLseToTrDys(JSPUtil.getParameter(request, prefix + "lse_to_tr_dys", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return LseAgmtRtVO[]
	 */
	public LseAgmtRtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return LseAgmtRtVO[]
	 */
	public LseAgmtRtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		LseAgmtRtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] agmtChgVal = (JSPUtil.getParameter(request, prefix	+ "agmt_chg_val", length));
			String[] lseFmTrDys = (JSPUtil.getParameter(request, prefix	+ "lse_fm_tr_dys", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd", length));
			String[] agmtChgDys = (JSPUtil.getParameter(request, prefix	+ "agmt_chg_dys", length));
			String[] genRmk = (JSPUtil.getParameter(request, prefix	+ "gen_rmk", length));
			String[] agmtSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] eqLocTpCd = (JSPUtil.getParameter(request, prefix	+ "eq_loc_tp_cd", length));
			String[] n1stChgAmt = (JSPUtil.getParameter(request, prefix	+ "n1st_chg_amt", length));
			String[] fmDt = (JSPUtil.getParameter(request, prefix	+ "fm_dt", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix	+ "edw_upd_dt", length));
			String[] n2ndChgAmt = (JSPUtil.getParameter(request, prefix	+ "n2nd_chg_amt", length));
			String[] agmtCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_cty_cd", length));
			String[] cntrSpecNo = (JSPUtil.getParameter(request, prefix	+ "cntr_spec_no", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] cntrRntlChgTpCd = (JSPUtil.getParameter(request, prefix	+ "cntr_rntl_chg_tp_cd", length));
			String[] toDt = (JSPUtil.getParameter(request, prefix	+ "to_dt", length));
			String[] lseToTrDys = (JSPUtil.getParameter(request, prefix	+ "lse_to_tr_dys", length));
			
			for (int i = 0; i < length; i++) {
				model = new LseAgmtRtVO();
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (agmtChgVal[i] != null)
					model.setAgmtChgVal(agmtChgVal[i]);
				if (lseFmTrDys[i] != null)
					model.setLseFmTrDys(lseFmTrDys[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (agmtChgDys[i] != null)
					model.setAgmtChgDys(agmtChgDys[i]);
				if (genRmk[i] != null)
					model.setGenRmk(genRmk[i]);
				if (agmtSeq[i] != null)
					model.setAgmtSeq(agmtSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (eqLocTpCd[i] != null)
					model.setEqLocTpCd(eqLocTpCd[i]);
				if (n1stChgAmt[i] != null)
					model.setN1stChgAmt(n1stChgAmt[i]);
				if (fmDt[i] != null)
					model.setFmDt(fmDt[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
				if (n2ndChgAmt[i] != null)
					model.setN2ndChgAmt(n2ndChgAmt[i]);
				if (agmtCtyCd[i] != null)
					model.setAgmtCtyCd(agmtCtyCd[i]);
				if (cntrSpecNo[i] != null)
					model.setCntrSpecNo(cntrSpecNo[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cntrRntlChgTpCd[i] != null)
					model.setCntrRntlChgTpCd(cntrRntlChgTpCd[i]);
				if (toDt[i] != null)
					model.setToDt(toDt[i]);
				if (lseToTrDys[i] != null)
					model.setLseToTrDys(lseToTrDys[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getLseAgmtRtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return LseAgmtRtVO[]
	 */
	public LseAgmtRtVO[] getLseAgmtRtVOs(){
		LseAgmtRtVO[] vos = (LseAgmtRtVO[])models.toArray(new LseAgmtRtVO[models.size()]);
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
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtChgVal = this.agmtChgVal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseFmTrDys = this.lseFmTrDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtChgDys = this.agmtChgDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.genRmk = this.genRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSeq = this.agmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqLocTpCd = this.eqLocTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stChgAmt = this.n1stChgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmDt = this.fmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndChgAmt = this.n2ndChgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtCtyCd = this.agmtCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSpecNo = this.cntrSpecNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrRntlChgTpCd = this.cntrRntlChgTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toDt = this.toDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseToTrDys = this.lseToTrDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
