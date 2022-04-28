/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaMtyCntrRoutPerfVO.java
*@FileTitle : CoaMtyCntrRoutPerfVO
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

public class CoaMtyCntrRoutPerfVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaMtyCntrRoutPerfVO> models = new ArrayList<CoaMtyCntrRoutPerfVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String mtyTrspTtlAmt = null;
	/* Column Info */
	private String routLstEccCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String ttlCntrQty = null;
	/* Column Info */
	private String routN1stYdCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String routSeq = null;
	/* Column Info */
	private String ttlTztmHrs = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String mtyCostTpCd = null;
	/* Column Info */
	private String ttlTzDys = null;
	/* Column Info */
	private String routN1stEccCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String cntrOrgDestCd = null;
	/* Column Info */
	private String routLstYdCd = null;
	/* Column Info */
	private String mtyStvgTtlAmt = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaMtyCntrRoutPerfVO() {}

	public CoaMtyCntrRoutPerfVO(String ibflag, String pagerows, String costYrmon, String cntrTpszCd, String routN1stYdCd, String routLstYdCd, String routSeq, String cntrOrgDestCd, String mtyCostTpCd, String routN1stEccCd, String routLstEccCd, String mtyStvgTtlAmt, String mtyTrspTtlAmt, String ttlTzDys, String ttlTztmHrs, String ttlCntrQty, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.mtyTrspTtlAmt = mtyTrspTtlAmt;
		this.routLstEccCd = routLstEccCd;
		this.creDt = creDt;
		this.ttlCntrQty = ttlCntrQty;
		this.routN1stYdCd = routN1stYdCd;
		this.pagerows = pagerows;
		this.routSeq = routSeq;
		this.ttlTztmHrs = ttlTztmHrs;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.costYrmon = costYrmon;
		this.mtyCostTpCd = mtyCostTpCd;
		this.ttlTzDys = ttlTzDys;
		this.routN1stEccCd = routN1stEccCd;
		this.cntrTpszCd = cntrTpszCd;
		this.cntrOrgDestCd = cntrOrgDestCd;
		this.routLstYdCd = routLstYdCd;
		this.mtyStvgTtlAmt = mtyStvgTtlAmt;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("mty_trsp_ttl_amt", getMtyTrspTtlAmt());
		this.hashColumns.put("rout_lst_ecc_cd", getRoutLstEccCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ttl_cntr_qty", getTtlCntrQty());
		this.hashColumns.put("rout_n1st_yd_cd", getRoutN1stYdCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("rout_seq", getRoutSeq());
		this.hashColumns.put("ttl_tztm_hrs", getTtlTztmHrs());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("mty_cost_tp_cd", getMtyCostTpCd());
		this.hashColumns.put("ttl_tz_dys", getTtlTzDys());
		this.hashColumns.put("rout_n1st_ecc_cd", getRoutN1stEccCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cntr_org_dest_cd", getCntrOrgDestCd());
		this.hashColumns.put("rout_lst_yd_cd", getRoutLstYdCd());
		this.hashColumns.put("mty_stvg_ttl_amt", getMtyStvgTtlAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("mty_trsp_ttl_amt", "mtyTrspTtlAmt");
		this.hashFields.put("rout_lst_ecc_cd", "routLstEccCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ttl_cntr_qty", "ttlCntrQty");
		this.hashFields.put("rout_n1st_yd_cd", "routN1stYdCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("rout_seq", "routSeq");
		this.hashFields.put("ttl_tztm_hrs", "ttlTztmHrs");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("mty_cost_tp_cd", "mtyCostTpCd");
		this.hashFields.put("ttl_tz_dys", "ttlTzDys");
		this.hashFields.put("rout_n1st_ecc_cd", "routN1stEccCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cntr_org_dest_cd", "cntrOrgDestCd");
		this.hashFields.put("rout_lst_yd_cd", "routLstYdCd");
		this.hashFields.put("mty_stvg_ttl_amt", "mtyStvgTtlAmt");
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
	 * @return mtyTrspTtlAmt
	 */
	public String getMtyTrspTtlAmt() {
		return this.mtyTrspTtlAmt;
	}
	
	/**
	 * Column Info
	 * @return routLstEccCd
	 */
	public String getRoutLstEccCd() {
		return this.routLstEccCd;
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
	 * @return ttlCntrQty
	 */
	public String getTtlCntrQty() {
		return this.ttlCntrQty;
	}
	
	/**
	 * Column Info
	 * @return routN1stYdCd
	 */
	public String getRoutN1stYdCd() {
		return this.routN1stYdCd;
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
	 * @return routSeq
	 */
	public String getRoutSeq() {
		return this.routSeq;
	}
	
	/**
	 * Column Info
	 * @return ttlTztmHrs
	 */
	public String getTtlTztmHrs() {
		return this.ttlTztmHrs;
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
	 * @return ttlTzDys
	 */
	public String getTtlTzDys() {
		return this.ttlTzDys;
	}
	
	/**
	 * Column Info
	 * @return routN1stEccCd
	 */
	public String getRoutN1stEccCd() {
		return this.routN1stEccCd;
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
	 * @param mtyTrspTtlAmt
	 */
	public void setMtyTrspTtlAmt(String mtyTrspTtlAmt) {
		this.mtyTrspTtlAmt = mtyTrspTtlAmt;
	}
	
	/**
	 * Column Info
	 * @param routLstEccCd
	 */
	public void setRoutLstEccCd(String routLstEccCd) {
		this.routLstEccCd = routLstEccCd;
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
	 * @param ttlCntrQty
	 */
	public void setTtlCntrQty(String ttlCntrQty) {
		this.ttlCntrQty = ttlCntrQty;
	}
	
	/**
	 * Column Info
	 * @param routN1stYdCd
	 */
	public void setRoutN1stYdCd(String routN1stYdCd) {
		this.routN1stYdCd = routN1stYdCd;
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
	 * @param routSeq
	 */
	public void setRoutSeq(String routSeq) {
		this.routSeq = routSeq;
	}
	
	/**
	 * Column Info
	 * @param ttlTztmHrs
	 */
	public void setTtlTztmHrs(String ttlTztmHrs) {
		this.ttlTztmHrs = ttlTztmHrs;
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
	 * @param ttlTzDys
	 */
	public void setTtlTzDys(String ttlTzDys) {
		this.ttlTzDys = ttlTzDys;
	}
	
	/**
	 * Column Info
	 * @param routN1stEccCd
	 */
	public void setRoutN1stEccCd(String routN1stEccCd) {
		this.routN1stEccCd = routN1stEccCd;
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
		setMtyTrspTtlAmt(JSPUtil.getParameter(request, "mty_trsp_ttl_amt", ""));
		setRoutLstEccCd(JSPUtil.getParameter(request, "rout_lst_ecc_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTtlCntrQty(JSPUtil.getParameter(request, "ttl_cntr_qty", ""));
		setRoutN1stYdCd(JSPUtil.getParameter(request, "rout_n1st_yd_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setRoutSeq(JSPUtil.getParameter(request, "rout_seq", ""));
		setTtlTztmHrs(JSPUtil.getParameter(request, "ttl_tztm_hrs", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setMtyCostTpCd(JSPUtil.getParameter(request, "mty_cost_tp_cd", ""));
		setTtlTzDys(JSPUtil.getParameter(request, "ttl_tz_dys", ""));
		setRoutN1stEccCd(JSPUtil.getParameter(request, "rout_n1st_ecc_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setCntrOrgDestCd(JSPUtil.getParameter(request, "cntr_org_dest_cd", ""));
		setRoutLstYdCd(JSPUtil.getParameter(request, "rout_lst_yd_cd", ""));
		setMtyStvgTtlAmt(JSPUtil.getParameter(request, "mty_stvg_ttl_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaMtyCntrRoutPerfVO[]
	 */
	public CoaMtyCntrRoutPerfVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaMtyCntrRoutPerfVO[]
	 */
	public CoaMtyCntrRoutPerfVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaMtyCntrRoutPerfVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] mtyTrspTtlAmt = (JSPUtil.getParameter(request, prefix	+ "mty_trsp_ttl_amt", length));
			String[] routLstEccCd = (JSPUtil.getParameter(request, prefix	+ "rout_lst_ecc_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] ttlCntrQty = (JSPUtil.getParameter(request, prefix	+ "ttl_cntr_qty", length));
			String[] routN1stYdCd = (JSPUtil.getParameter(request, prefix	+ "rout_n1st_yd_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] routSeq = (JSPUtil.getParameter(request, prefix	+ "rout_seq", length));
			String[] ttlTztmHrs = (JSPUtil.getParameter(request, prefix	+ "ttl_tztm_hrs", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon", length));
			String[] mtyCostTpCd = (JSPUtil.getParameter(request, prefix	+ "mty_cost_tp_cd", length));
			String[] ttlTzDys = (JSPUtil.getParameter(request, prefix	+ "ttl_tz_dys", length));
			String[] routN1stEccCd = (JSPUtil.getParameter(request, prefix	+ "rout_n1st_ecc_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] cntrOrgDestCd = (JSPUtil.getParameter(request, prefix	+ "cntr_org_dest_cd", length));
			String[] routLstYdCd = (JSPUtil.getParameter(request, prefix	+ "rout_lst_yd_cd", length));
			String[] mtyStvgTtlAmt = (JSPUtil.getParameter(request, prefix	+ "mty_stvg_ttl_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaMtyCntrRoutPerfVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (mtyTrspTtlAmt[i] != null)
					model.setMtyTrspTtlAmt(mtyTrspTtlAmt[i]);
				if (routLstEccCd[i] != null)
					model.setRoutLstEccCd(routLstEccCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ttlCntrQty[i] != null)
					model.setTtlCntrQty(ttlCntrQty[i]);
				if (routN1stYdCd[i] != null)
					model.setRoutN1stYdCd(routN1stYdCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (routSeq[i] != null)
					model.setRoutSeq(routSeq[i]);
				if (ttlTztmHrs[i] != null)
					model.setTtlTztmHrs(ttlTztmHrs[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (mtyCostTpCd[i] != null)
					model.setMtyCostTpCd(mtyCostTpCd[i]);
				if (ttlTzDys[i] != null)
					model.setTtlTzDys(ttlTzDys[i]);
				if (routN1stEccCd[i] != null)
					model.setRoutN1stEccCd(routN1stEccCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (cntrOrgDestCd[i] != null)
					model.setCntrOrgDestCd(cntrOrgDestCd[i]);
				if (routLstYdCd[i] != null)
					model.setRoutLstYdCd(routLstYdCd[i]);
				if (mtyStvgTtlAmt[i] != null)
					model.setMtyStvgTtlAmt(mtyStvgTtlAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaMtyCntrRoutPerfVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaMtyCntrRoutPerfVO[]
	 */
	public CoaMtyCntrRoutPerfVO[] getCoaMtyCntrRoutPerfVOs(){
		CoaMtyCntrRoutPerfVO[] vos = (CoaMtyCntrRoutPerfVO[])models.toArray(new CoaMtyCntrRoutPerfVO[models.size()]);
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
		this.routLstEccCd = this.routLstEccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlCntrQty = this.ttlCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routN1stYdCd = this.routN1stYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routSeq = this.routSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlTztmHrs = this.ttlTztmHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyCostTpCd = this.mtyCostTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlTzDys = this.ttlTzDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routN1stEccCd = this.routN1stEccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrOrgDestCd = this.cntrOrgDestCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routLstYdCd = this.routLstYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyStvgTtlAmt = this.mtyStvgTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
