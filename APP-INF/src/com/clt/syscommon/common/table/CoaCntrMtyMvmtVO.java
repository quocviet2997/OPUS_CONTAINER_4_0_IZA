/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaCntrMtyMvmtVO.java
*@FileTitle : CoaCntrMtyMvmtVO
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

public class CoaCntrMtyMvmtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaCntrMtyMvmtVO> models = new ArrayList<CoaCntrMtyMvmtVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String nxtYdCd = null;
	/* Column Info */
	private String mtyTrspTtlAmt = null;
	/* Column Info */
	private String cnmvDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String routN1stYdCd = null;
	/* Column Info */
	private String costCreStsCd = null;
	/* Column Info */
	private String routSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String monMvmtSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cnmvStsCd = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String mtyCostTpCd = null;
	/* Column Info */
	private String ydCd = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String cntrRoutSeq = null;
	/* Column Info */
	private String routLstYdCd = null;
	/* Column Info */
	private String mtyStvgTtlAmt = null;
	/* Column Info */
	private String mtyDurDys = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String costCalcRmk = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaCntrMtyMvmtVO() {}

	public CoaCntrMtyMvmtVO(String ibflag, String pagerows, String costYrmon, String cntrNo, String monMvmtSeq, String mtyCostTpCd, String ydCd, String cntrTpszCd, String cntrRoutSeq, String cnmvStsCd, String cnmvDt, String routN1stYdCd, String routLstYdCd, String routSeq, String costCreStsCd, String mtyStvgTtlAmt, String mtyTrspTtlAmt, String mtyDurDys, String nxtYdCd, String costCalcRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.nxtYdCd = nxtYdCd;
		this.mtyTrspTtlAmt = mtyTrspTtlAmt;
		this.cnmvDt = cnmvDt;
		this.creDt = creDt;
		this.routN1stYdCd = routN1stYdCd;
		this.costCreStsCd = costCreStsCd;
		this.routSeq = routSeq;
		this.pagerows = pagerows;
		this.monMvmtSeq = monMvmtSeq;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.cnmvStsCd = cnmvStsCd;
		this.costYrmon = costYrmon;
		this.mtyCostTpCd = mtyCostTpCd;
		this.ydCd = ydCd;
		this.cntrNo = cntrNo;
		this.cntrTpszCd = cntrTpszCd;
		this.cntrRoutSeq = cntrRoutSeq;
		this.routLstYdCd = routLstYdCd;
		this.mtyStvgTtlAmt = mtyStvgTtlAmt;
		this.mtyDurDys = mtyDurDys;
		this.updUsrId = updUsrId;
		this.costCalcRmk = costCalcRmk;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("nxt_yd_cd", getNxtYdCd());
		this.hashColumns.put("mty_trsp_ttl_amt", getMtyTrspTtlAmt());
		this.hashColumns.put("cnmv_dt", getCnmvDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rout_n1st_yd_cd", getRoutN1stYdCd());
		this.hashColumns.put("cost_cre_sts_cd", getCostCreStsCd());
		this.hashColumns.put("rout_seq", getRoutSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("mon_mvmt_seq", getMonMvmtSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cnmv_sts_cd", getCnmvStsCd());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("mty_cost_tp_cd", getMtyCostTpCd());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cntr_rout_seq", getCntrRoutSeq());
		this.hashColumns.put("rout_lst_yd_cd", getRoutLstYdCd());
		this.hashColumns.put("mty_stvg_ttl_amt", getMtyStvgTtlAmt());
		this.hashColumns.put("mty_dur_dys", getMtyDurDys());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cost_calc_rmk", getCostCalcRmk());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("nxt_yd_cd", "nxtYdCd");
		this.hashFields.put("mty_trsp_ttl_amt", "mtyTrspTtlAmt");
		this.hashFields.put("cnmv_dt", "cnmvDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rout_n1st_yd_cd", "routN1stYdCd");
		this.hashFields.put("cost_cre_sts_cd", "costCreStsCd");
		this.hashFields.put("rout_seq", "routSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("mon_mvmt_seq", "monMvmtSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cnmv_sts_cd", "cnmvStsCd");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("mty_cost_tp_cd", "mtyCostTpCd");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cntr_rout_seq", "cntrRoutSeq");
		this.hashFields.put("rout_lst_yd_cd", "routLstYdCd");
		this.hashFields.put("mty_stvg_ttl_amt", "mtyStvgTtlAmt");
		this.hashFields.put("mty_dur_dys", "mtyDurDys");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cost_calc_rmk", "costCalcRmk");
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
	 * @return nxtYdCd
	 */
	public String getNxtYdCd() {
		return this.nxtYdCd;
	}
	
	/**
	 * Column Info
	 * @return mtyTrspTtlAmt
	 */
	public String getMtyTrspTtlAmt() {
		return this.mtyTrspTtlAmt;
	}
	
	/**
	 * Column Info
	 * @return cnmvDt
	 */
	public String getCnmvDt() {
		return this.cnmvDt;
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
	 * @return routN1stYdCd
	 */
	public String getRoutN1stYdCd() {
		return this.routN1stYdCd;
	}
	
	/**
	 * Column Info
	 * @return costCreStsCd
	 */
	public String getCostCreStsCd() {
		return this.costCreStsCd;
	}
	
	/**
	 * Column Info
	 * @return routSeq
	 */
	public String getRoutSeq() {
		return this.routSeq;
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
	 * @return monMvmtSeq
	 */
	public String getMonMvmtSeq() {
		return this.monMvmtSeq;
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
	 * @return cnmvStsCd
	 */
	public String getCnmvStsCd() {
		return this.cnmvStsCd;
	}
	
	/**
	 * Column Info
	 * @return costYrmon
	 */
	public String getCostYrmon() {
		return this.costYrmon;
	}
	
	/**
	 * Column Info
	 * @return mtyCostTpCd
	 */
	public String getMtyCostTpCd() {
		return this.mtyCostTpCd;
	}
	
	/**
	 * Column Info
	 * @return ydCd
	 */
	public String getYdCd() {
		return this.ydCd;
	}
	
	/**
	 * Column Info
	 * @return cntrNo
	 */
	public String getCntrNo() {
		return this.cntrNo;
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
	 * @return cntrRoutSeq
	 */
	public String getCntrRoutSeq() {
		return this.cntrRoutSeq;
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
	 * @return mtyStvgTtlAmt
	 */
	public String getMtyStvgTtlAmt() {
		return this.mtyStvgTtlAmt;
	}
	
	/**
	 * Column Info
	 * @return mtyDurDys
	 */
	public String getMtyDurDys() {
		return this.mtyDurDys;
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
	 * @return costCalcRmk
	 */
	public String getCostCalcRmk() {
		return this.costCalcRmk;
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
	 * @param nxtYdCd
	 */
	public void setNxtYdCd(String nxtYdCd) {
		this.nxtYdCd = nxtYdCd;
	}
	
	/**
	 * Column Info
	 * @param mtyTrspTtlAmt
	 */
	public void setMtyTrspTtlAmt(String mtyTrspTtlAmt) {
		this.mtyTrspTtlAmt = mtyTrspTtlAmt;
	}
	
	/**
	 * Column Info
	 * @param cnmvDt
	 */
	public void setCnmvDt(String cnmvDt) {
		this.cnmvDt = cnmvDt;
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
	 * @param routN1stYdCd
	 */
	public void setRoutN1stYdCd(String routN1stYdCd) {
		this.routN1stYdCd = routN1stYdCd;
	}
	
	/**
	 * Column Info
	 * @param costCreStsCd
	 */
	public void setCostCreStsCd(String costCreStsCd) {
		this.costCreStsCd = costCreStsCd;
	}
	
	/**
	 * Column Info
	 * @param routSeq
	 */
	public void setRoutSeq(String routSeq) {
		this.routSeq = routSeq;
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
	 * @param monMvmtSeq
	 */
	public void setMonMvmtSeq(String monMvmtSeq) {
		this.monMvmtSeq = monMvmtSeq;
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
	 * @param cnmvStsCd
	 */
	public void setCnmvStsCd(String cnmvStsCd) {
		this.cnmvStsCd = cnmvStsCd;
	}
	
	/**
	 * Column Info
	 * @param costYrmon
	 */
	public void setCostYrmon(String costYrmon) {
		this.costYrmon = costYrmon;
	}
	
	/**
	 * Column Info
	 * @param mtyCostTpCd
	 */
	public void setMtyCostTpCd(String mtyCostTpCd) {
		this.mtyCostTpCd = mtyCostTpCd;
	}
	
	/**
	 * Column Info
	 * @param ydCd
	 */
	public void setYdCd(String ydCd) {
		this.ydCd = ydCd;
	}
	
	/**
	 * Column Info
	 * @param cntrNo
	 */
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
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
	 * @param cntrRoutSeq
	 */
	public void setCntrRoutSeq(String cntrRoutSeq) {
		this.cntrRoutSeq = cntrRoutSeq;
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
	 * @param mtyStvgTtlAmt
	 */
	public void setMtyStvgTtlAmt(String mtyStvgTtlAmt) {
		this.mtyStvgTtlAmt = mtyStvgTtlAmt;
	}
	
	/**
	 * Column Info
	 * @param mtyDurDys
	 */
	public void setMtyDurDys(String mtyDurDys) {
		this.mtyDurDys = mtyDurDys;
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
	 * @param costCalcRmk
	 */
	public void setCostCalcRmk(String costCalcRmk) {
		this.costCalcRmk = costCalcRmk;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setNxtYdCd(JSPUtil.getParameter(request, "nxt_yd_cd", ""));
		setMtyTrspTtlAmt(JSPUtil.getParameter(request, "mty_trsp_ttl_amt", ""));
		setCnmvDt(JSPUtil.getParameter(request, "cnmv_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRoutN1stYdCd(JSPUtil.getParameter(request, "rout_n1st_yd_cd", ""));
		setCostCreStsCd(JSPUtil.getParameter(request, "cost_cre_sts_cd", ""));
		setRoutSeq(JSPUtil.getParameter(request, "rout_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setMonMvmtSeq(JSPUtil.getParameter(request, "mon_mvmt_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCnmvStsCd(JSPUtil.getParameter(request, "cnmv_sts_cd", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setMtyCostTpCd(JSPUtil.getParameter(request, "mty_cost_tp_cd", ""));
		setYdCd(JSPUtil.getParameter(request, "yd_cd", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setCntrRoutSeq(JSPUtil.getParameter(request, "cntr_rout_seq", ""));
		setRoutLstYdCd(JSPUtil.getParameter(request, "rout_lst_yd_cd", ""));
		setMtyStvgTtlAmt(JSPUtil.getParameter(request, "mty_stvg_ttl_amt", ""));
		setMtyDurDys(JSPUtil.getParameter(request, "mty_dur_dys", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCostCalcRmk(JSPUtil.getParameter(request, "cost_calc_rmk", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaCntrMtyMvmtVO[]
	 */
	public CoaCntrMtyMvmtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaCntrMtyMvmtVO[]
	 */
	public CoaCntrMtyMvmtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaCntrMtyMvmtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] nxtYdCd = (JSPUtil.getParameter(request, prefix	+ "nxt_yd_cd", length));
			String[] mtyTrspTtlAmt = (JSPUtil.getParameter(request, prefix	+ "mty_trsp_ttl_amt", length));
			String[] cnmvDt = (JSPUtil.getParameter(request, prefix	+ "cnmv_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] routN1stYdCd = (JSPUtil.getParameter(request, prefix	+ "rout_n1st_yd_cd", length));
			String[] costCreStsCd = (JSPUtil.getParameter(request, prefix	+ "cost_cre_sts_cd", length));
			String[] routSeq = (JSPUtil.getParameter(request, prefix	+ "rout_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] monMvmtSeq = (JSPUtil.getParameter(request, prefix	+ "mon_mvmt_seq", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cnmvStsCd = (JSPUtil.getParameter(request, prefix	+ "cnmv_sts_cd", length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon", length));
			String[] mtyCostTpCd = (JSPUtil.getParameter(request, prefix	+ "mty_cost_tp_cd", length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] cntrRoutSeq = (JSPUtil.getParameter(request, prefix	+ "cntr_rout_seq", length));
			String[] routLstYdCd = (JSPUtil.getParameter(request, prefix	+ "rout_lst_yd_cd", length));
			String[] mtyStvgTtlAmt = (JSPUtil.getParameter(request, prefix	+ "mty_stvg_ttl_amt", length));
			String[] mtyDurDys = (JSPUtil.getParameter(request, prefix	+ "mty_dur_dys", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] costCalcRmk = (JSPUtil.getParameter(request, prefix	+ "cost_calc_rmk", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaCntrMtyMvmtVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (nxtYdCd[i] != null)
					model.setNxtYdCd(nxtYdCd[i]);
				if (mtyTrspTtlAmt[i] != null)
					model.setMtyTrspTtlAmt(mtyTrspTtlAmt[i]);
				if (cnmvDt[i] != null)
					model.setCnmvDt(cnmvDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (routN1stYdCd[i] != null)
					model.setRoutN1stYdCd(routN1stYdCd[i]);
				if (costCreStsCd[i] != null)
					model.setCostCreStsCd(costCreStsCd[i]);
				if (routSeq[i] != null)
					model.setRoutSeq(routSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (monMvmtSeq[i] != null)
					model.setMonMvmtSeq(monMvmtSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cnmvStsCd[i] != null)
					model.setCnmvStsCd(cnmvStsCd[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (mtyCostTpCd[i] != null)
					model.setMtyCostTpCd(mtyCostTpCd[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (cntrRoutSeq[i] != null)
					model.setCntrRoutSeq(cntrRoutSeq[i]);
				if (routLstYdCd[i] != null)
					model.setRoutLstYdCd(routLstYdCd[i]);
				if (mtyStvgTtlAmt[i] != null)
					model.setMtyStvgTtlAmt(mtyStvgTtlAmt[i]);
				if (mtyDurDys[i] != null)
					model.setMtyDurDys(mtyDurDys[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (costCalcRmk[i] != null)
					model.setCostCalcRmk(costCalcRmk[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaCntrMtyMvmtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaCntrMtyMvmtVO[]
	 */
	public CoaCntrMtyMvmtVO[] getCoaCntrMtyMvmtVOs(){
		CoaCntrMtyMvmtVO[] vos = (CoaCntrMtyMvmtVO[])models.toArray(new CoaCntrMtyMvmtVO[models.size()]);
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
		this.nxtYdCd = this.nxtYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyTrspTtlAmt = this.mtyTrspTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvDt = this.cnmvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routN1stYdCd = this.routN1stYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costCreStsCd = this.costCreStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routSeq = this.routSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.monMvmtSeq = this.monMvmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvStsCd = this.cnmvStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyCostTpCd = this.mtyCostTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrRoutSeq = this.cntrRoutSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routLstYdCd = this.routLstYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyStvgTtlAmt = this.mtyStvgTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyDurDys = this.mtyDurDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costCalcRmk = this.costCalcRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
