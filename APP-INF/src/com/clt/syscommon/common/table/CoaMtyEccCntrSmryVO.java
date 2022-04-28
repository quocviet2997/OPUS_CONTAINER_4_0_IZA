/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaMtyEccCntrSmryVO.java
*@FileTitle : CoaMtyEccCntrSmryVO
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

public class CoaMtyEccCntrSmryVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaMtyEccCntrSmryVO> models = new ArrayList<CoaMtyEccCntrSmryVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String mtyTrspTtlAmt = null;
	/* Column Info */
	private String eccCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String mtyTrspUcAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String mtyCostTpCd = null;
	/* Column Info */
	private String mtyStvgUcAmt = null;
	/* Column Info */
	private String mtyRepoSimCd = null;
	/* Column Info */
	private String mtyQty = null;
	/* Column Info */
	private String mtyTzHrs = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String cntrOrgDestCd = null;
	/* Column Info */
	private String costLocGrpCd = null;
	/* Column Info */
	private String mtyStvgTtlAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String mtyTzDys = null;
	/* Column Info */
	private String cntrIoVolStsCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaMtyEccCntrSmryVO() {}

	public CoaMtyEccCntrSmryVO(String ibflag, String pagerows, String costYrmon, String costLocGrpCd, String cntrTpszCd, String eccCd, String cntrIoVolStsCd, String cntrOrgDestCd, String mtyRepoSimCd, String mtyCostTpCd, String mtyQty, String mtyStvgUcAmt, String mtyStvgTtlAmt, String mtyTrspUcAmt, String mtyTrspTtlAmt, String mtyTzHrs, String mtyTzDys, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.mtyTrspTtlAmt = mtyTrspTtlAmt;
		this.eccCd = eccCd;
		this.creDt = creDt;
		this.mtyTrspUcAmt = mtyTrspUcAmt;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.costYrmon = costYrmon;
		this.mtyCostTpCd = mtyCostTpCd;
		this.mtyStvgUcAmt = mtyStvgUcAmt;
		this.mtyRepoSimCd = mtyRepoSimCd;
		this.mtyQty = mtyQty;
		this.mtyTzHrs = mtyTzHrs;
		this.cntrTpszCd = cntrTpszCd;
		this.cntrOrgDestCd = cntrOrgDestCd;
		this.costLocGrpCd = costLocGrpCd;
		this.mtyStvgTtlAmt = mtyStvgTtlAmt;
		this.updUsrId = updUsrId;
		this.mtyTzDys = mtyTzDys;
		this.cntrIoVolStsCd = cntrIoVolStsCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("mty_trsp_ttl_amt", getMtyTrspTtlAmt());
		this.hashColumns.put("ecc_cd", getEccCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("mty_trsp_uc_amt", getMtyTrspUcAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("mty_cost_tp_cd", getMtyCostTpCd());
		this.hashColumns.put("mty_stvg_uc_amt", getMtyStvgUcAmt());
		this.hashColumns.put("mty_repo_sim_cd", getMtyRepoSimCd());
		this.hashColumns.put("mty_qty", getMtyQty());
		this.hashColumns.put("mty_tz_hrs", getMtyTzHrs());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cntr_org_dest_cd", getCntrOrgDestCd());
		this.hashColumns.put("cost_loc_grp_cd", getCostLocGrpCd());
		this.hashColumns.put("mty_stvg_ttl_amt", getMtyStvgTtlAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("mty_tz_dys", getMtyTzDys());
		this.hashColumns.put("cntr_io_vol_sts_cd", getCntrIoVolStsCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("mty_trsp_ttl_amt", "mtyTrspTtlAmt");
		this.hashFields.put("ecc_cd", "eccCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("mty_trsp_uc_amt", "mtyTrspUcAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("mty_cost_tp_cd", "mtyCostTpCd");
		this.hashFields.put("mty_stvg_uc_amt", "mtyStvgUcAmt");
		this.hashFields.put("mty_repo_sim_cd", "mtyRepoSimCd");
		this.hashFields.put("mty_qty", "mtyQty");
		this.hashFields.put("mty_tz_hrs", "mtyTzHrs");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cntr_org_dest_cd", "cntrOrgDestCd");
		this.hashFields.put("cost_loc_grp_cd", "costLocGrpCd");
		this.hashFields.put("mty_stvg_ttl_amt", "mtyStvgTtlAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("mty_tz_dys", "mtyTzDys");
		this.hashFields.put("cntr_io_vol_sts_cd", "cntrIoVolStsCd");
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
	 * @return mtyTrspTtlAmt
	 */
	public String getMtyTrspTtlAmt() {
		return this.mtyTrspTtlAmt;
	}
	
	/**
	 * Column Info
	 * @return eccCd
	 */
	public String getEccCd() {
		return this.eccCd;
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
	 * @return mtyTrspUcAmt
	 */
	public String getMtyTrspUcAmt() {
		return this.mtyTrspUcAmt;
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
	 * @return mtyStvgUcAmt
	 */
	public String getMtyStvgUcAmt() {
		return this.mtyStvgUcAmt;
	}
	
	/**
	 * Column Info
	 * @return mtyRepoSimCd
	 */
	public String getMtyRepoSimCd() {
		return this.mtyRepoSimCd;
	}
	
	/**
	 * Column Info
	 * @return mtyQty
	 */
	public String getMtyQty() {
		return this.mtyQty;
	}
	
	/**
	 * Column Info
	 * @return mtyTzHrs
	 */
	public String getMtyTzHrs() {
		return this.mtyTzHrs;
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
	 * @return cntrOrgDestCd
	 */
	public String getCntrOrgDestCd() {
		return this.cntrOrgDestCd;
	}
	
	/**
	 * Column Info
	 * @return costLocGrpCd
	 */
	public String getCostLocGrpCd() {
		return this.costLocGrpCd;
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
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	/**
	 * Column Info
	 * @return mtyTzDys
	 */
	public String getMtyTzDys() {
		return this.mtyTzDys;
	}
	
	/**
	 * Column Info
	 * @return cntrIoVolStsCd
	 */
	public String getCntrIoVolStsCd() {
		return this.cntrIoVolStsCd;
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
	 * @param mtyTrspTtlAmt
	 */
	public void setMtyTrspTtlAmt(String mtyTrspTtlAmt) {
		this.mtyTrspTtlAmt = mtyTrspTtlAmt;
	}
	
	/**
	 * Column Info
	 * @param eccCd
	 */
	public void setEccCd(String eccCd) {
		this.eccCd = eccCd;
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
	 * @param mtyTrspUcAmt
	 */
	public void setMtyTrspUcAmt(String mtyTrspUcAmt) {
		this.mtyTrspUcAmt = mtyTrspUcAmt;
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
	 * @param mtyStvgUcAmt
	 */
	public void setMtyStvgUcAmt(String mtyStvgUcAmt) {
		this.mtyStvgUcAmt = mtyStvgUcAmt;
	}
	
	/**
	 * Column Info
	 * @param mtyRepoSimCd
	 */
	public void setMtyRepoSimCd(String mtyRepoSimCd) {
		this.mtyRepoSimCd = mtyRepoSimCd;
	}
	
	/**
	 * Column Info
	 * @param mtyQty
	 */
	public void setMtyQty(String mtyQty) {
		this.mtyQty = mtyQty;
	}
	
	/**
	 * Column Info
	 * @param mtyTzHrs
	 */
	public void setMtyTzHrs(String mtyTzHrs) {
		this.mtyTzHrs = mtyTzHrs;
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
	 * @param cntrOrgDestCd
	 */
	public void setCntrOrgDestCd(String cntrOrgDestCd) {
		this.cntrOrgDestCd = cntrOrgDestCd;
	}
	
	/**
	 * Column Info
	 * @param costLocGrpCd
	 */
	public void setCostLocGrpCd(String costLocGrpCd) {
		this.costLocGrpCd = costLocGrpCd;
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
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param mtyTzDys
	 */
	public void setMtyTzDys(String mtyTzDys) {
		this.mtyTzDys = mtyTzDys;
	}
	
	/**
	 * Column Info
	 * @param cntrIoVolStsCd
	 */
	public void setCntrIoVolStsCd(String cntrIoVolStsCd) {
		this.cntrIoVolStsCd = cntrIoVolStsCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setMtyTrspTtlAmt(JSPUtil.getParameter(request, "mty_trsp_ttl_amt", ""));
		setEccCd(JSPUtil.getParameter(request, "ecc_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setMtyTrspUcAmt(JSPUtil.getParameter(request, "mty_trsp_uc_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setMtyCostTpCd(JSPUtil.getParameter(request, "mty_cost_tp_cd", ""));
		setMtyStvgUcAmt(JSPUtil.getParameter(request, "mty_stvg_uc_amt", ""));
		setMtyRepoSimCd(JSPUtil.getParameter(request, "mty_repo_sim_cd", ""));
		setMtyQty(JSPUtil.getParameter(request, "mty_qty", ""));
		setMtyTzHrs(JSPUtil.getParameter(request, "mty_tz_hrs", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setCntrOrgDestCd(JSPUtil.getParameter(request, "cntr_org_dest_cd", ""));
		setCostLocGrpCd(JSPUtil.getParameter(request, "cost_loc_grp_cd", ""));
		setMtyStvgTtlAmt(JSPUtil.getParameter(request, "mty_stvg_ttl_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setMtyTzDys(JSPUtil.getParameter(request, "mty_tz_dys", ""));
		setCntrIoVolStsCd(JSPUtil.getParameter(request, "cntr_io_vol_sts_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaMtyEccCntrSmryVO[]
	 */
	public CoaMtyEccCntrSmryVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaMtyEccCntrSmryVO[]
	 */
	public CoaMtyEccCntrSmryVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaMtyEccCntrSmryVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] mtyTrspTtlAmt = (JSPUtil.getParameter(request, prefix	+ "mty_trsp_ttl_amt", length));
			String[] eccCd = (JSPUtil.getParameter(request, prefix	+ "ecc_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] mtyTrspUcAmt = (JSPUtil.getParameter(request, prefix	+ "mty_trsp_uc_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon", length));
			String[] mtyCostTpCd = (JSPUtil.getParameter(request, prefix	+ "mty_cost_tp_cd", length));
			String[] mtyStvgUcAmt = (JSPUtil.getParameter(request, prefix	+ "mty_stvg_uc_amt", length));
			String[] mtyRepoSimCd = (JSPUtil.getParameter(request, prefix	+ "mty_repo_sim_cd", length));
			String[] mtyQty = (JSPUtil.getParameter(request, prefix	+ "mty_qty", length));
			String[] mtyTzHrs = (JSPUtil.getParameter(request, prefix	+ "mty_tz_hrs", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] cntrOrgDestCd = (JSPUtil.getParameter(request, prefix	+ "cntr_org_dest_cd", length));
			String[] costLocGrpCd = (JSPUtil.getParameter(request, prefix	+ "cost_loc_grp_cd", length));
			String[] mtyStvgTtlAmt = (JSPUtil.getParameter(request, prefix	+ "mty_stvg_ttl_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] mtyTzDys = (JSPUtil.getParameter(request, prefix	+ "mty_tz_dys", length));
			String[] cntrIoVolStsCd = (JSPUtil.getParameter(request, prefix	+ "cntr_io_vol_sts_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaMtyEccCntrSmryVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (mtyTrspTtlAmt[i] != null)
					model.setMtyTrspTtlAmt(mtyTrspTtlAmt[i]);
				if (eccCd[i] != null)
					model.setEccCd(eccCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (mtyTrspUcAmt[i] != null)
					model.setMtyTrspUcAmt(mtyTrspUcAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (mtyCostTpCd[i] != null)
					model.setMtyCostTpCd(mtyCostTpCd[i]);
				if (mtyStvgUcAmt[i] != null)
					model.setMtyStvgUcAmt(mtyStvgUcAmt[i]);
				if (mtyRepoSimCd[i] != null)
					model.setMtyRepoSimCd(mtyRepoSimCd[i]);
				if (mtyQty[i] != null)
					model.setMtyQty(mtyQty[i]);
				if (mtyTzHrs[i] != null)
					model.setMtyTzHrs(mtyTzHrs[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (cntrOrgDestCd[i] != null)
					model.setCntrOrgDestCd(cntrOrgDestCd[i]);
				if (costLocGrpCd[i] != null)
					model.setCostLocGrpCd(costLocGrpCd[i]);
				if (mtyStvgTtlAmt[i] != null)
					model.setMtyStvgTtlAmt(mtyStvgTtlAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (mtyTzDys[i] != null)
					model.setMtyTzDys(mtyTzDys[i]);
				if (cntrIoVolStsCd[i] != null)
					model.setCntrIoVolStsCd(cntrIoVolStsCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaMtyEccCntrSmryVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaMtyEccCntrSmryVO[]
	 */
	public CoaMtyEccCntrSmryVO[] getCoaMtyEccCntrSmryVOs(){
		CoaMtyEccCntrSmryVO[] vos = (CoaMtyEccCntrSmryVO[])models.toArray(new CoaMtyEccCntrSmryVO[models.size()]);
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
		this.mtyTrspTtlAmt = this.mtyTrspTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eccCd = this.eccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyTrspUcAmt = this.mtyTrspUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyCostTpCd = this.mtyCostTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyStvgUcAmt = this.mtyStvgUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyRepoSimCd = this.mtyRepoSimCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyQty = this.mtyQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyTzHrs = this.mtyTzHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrOrgDestCd = this.cntrOrgDestCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costLocGrpCd = this.costLocGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyStvgTtlAmt = this.mtyStvgTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyTzDys = this.mtyTzDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrIoVolStsCd = this.cntrIoVolStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
