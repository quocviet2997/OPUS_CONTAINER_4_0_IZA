/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaCopIfMgmtVO.java
*@FileTitle : CoaCopIfMgmtVO
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

public class CoaCopIfMgmtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaCopIfMgmtVO> models = new ArrayList<CoaCopIfMgmtVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String costIfMnlRmk = null;
	/* Column Info */
	private String coaMnlBatCd = null;
	/* Column Info */
	private String costIfRmk = null;
	/* Column Info */
	private String coaBatSeq = null;
	/* Column Info */
	private String coaDyBatDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String coaMnlBatDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String coaMnlBatSeq = null;
	/* Column Info */
	private String slsYrmon = null;
	/* Column Info */
	private String coaBatDt = null;
	/* Column Info */
	private String coaDyBatCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String costWk = null;
	/* Column Info */
	private String costIfDyRmk = null;
	/* Column Info */
	private String coaBatCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String coaDyBatSeq = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaCopIfMgmtVO() {}

	public CoaCopIfMgmtVO(String ibflag, String pagerows, String bkgNo, String coaBatCd, String coaBatSeq, String coaBatDt, String coaDyBatCd, String coaDyBatSeq, String coaDyBatDt, String coaMnlBatCd, String coaMnlBatSeq, String coaMnlBatDt, String costIfRmk, String costIfDyRmk, String costIfMnlRmk, String costWk, String costYrmon, String slsYrmon, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.costIfMnlRmk = costIfMnlRmk;
		this.coaMnlBatCd = coaMnlBatCd;
		this.costIfRmk = costIfRmk;
		this.coaBatSeq = coaBatSeq;
		this.coaDyBatDt = coaDyBatDt;
		this.creDt = creDt;
		this.coaMnlBatDt = coaMnlBatDt;
		this.pagerows = pagerows;
		this.coaMnlBatSeq = coaMnlBatSeq;
		this.slsYrmon = slsYrmon;
		this.coaBatDt = coaBatDt;
		this.coaDyBatCd = coaDyBatCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.costYrmon = costYrmon;
		this.costWk = costWk;
		this.costIfDyRmk = costIfDyRmk;
		this.coaBatCd = coaBatCd;
		this.updUsrId = updUsrId;
		this.coaDyBatSeq = coaDyBatSeq;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cost_if_mnl_rmk", getCostIfMnlRmk());
		this.hashColumns.put("coa_mnl_bat_cd", getCoaMnlBatCd());
		this.hashColumns.put("cost_if_rmk", getCostIfRmk());
		this.hashColumns.put("coa_bat_seq", getCoaBatSeq());
		this.hashColumns.put("coa_dy_bat_dt", getCoaDyBatDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("coa_mnl_bat_dt", getCoaMnlBatDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("coa_mnl_bat_seq", getCoaMnlBatSeq());
		this.hashColumns.put("sls_yrmon", getSlsYrmon());
		this.hashColumns.put("coa_bat_dt", getCoaBatDt());
		this.hashColumns.put("coa_dy_bat_cd", getCoaDyBatCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("cost_wk", getCostWk());
		this.hashColumns.put("cost_if_dy_rmk", getCostIfDyRmk());
		this.hashColumns.put("coa_bat_cd", getCoaBatCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("coa_dy_bat_seq", getCoaDyBatSeq());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cost_if_mnl_rmk", "costIfMnlRmk");
		this.hashFields.put("coa_mnl_bat_cd", "coaMnlBatCd");
		this.hashFields.put("cost_if_rmk", "costIfRmk");
		this.hashFields.put("coa_bat_seq", "coaBatSeq");
		this.hashFields.put("coa_dy_bat_dt", "coaDyBatDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("coa_mnl_bat_dt", "coaMnlBatDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("coa_mnl_bat_seq", "coaMnlBatSeq");
		this.hashFields.put("sls_yrmon", "slsYrmon");
		this.hashFields.put("coa_bat_dt", "coaBatDt");
		this.hashFields.put("coa_dy_bat_cd", "coaDyBatCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("cost_wk", "costWk");
		this.hashFields.put("cost_if_dy_rmk", "costIfDyRmk");
		this.hashFields.put("coa_bat_cd", "coaBatCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("coa_dy_bat_seq", "coaDyBatSeq");
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
	 * @return costIfMnlRmk
	 */
	public String getCostIfMnlRmk() {
		return this.costIfMnlRmk;
	}
	
	/**
	 * Column Info
	 * @return coaMnlBatCd
	 */
	public String getCoaMnlBatCd() {
		return this.coaMnlBatCd;
	}
	
	/**
	 * Column Info
	 * @return costIfRmk
	 */
	public String getCostIfRmk() {
		return this.costIfRmk;
	}
	
	/**
	 * Column Info
	 * @return coaBatSeq
	 */
	public String getCoaBatSeq() {
		return this.coaBatSeq;
	}
	
	/**
	 * Column Info
	 * @return coaDyBatDt
	 */
	public String getCoaDyBatDt() {
		return this.coaDyBatDt;
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
	 * @return coaMnlBatDt
	 */
	public String getCoaMnlBatDt() {
		return this.coaMnlBatDt;
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
	 * @return coaMnlBatSeq
	 */
	public String getCoaMnlBatSeq() {
		return this.coaMnlBatSeq;
	}
	
	/**
	 * Column Info
	 * @return slsYrmon
	 */
	public String getSlsYrmon() {
		return this.slsYrmon;
	}
	
	/**
	 * Column Info
	 * @return coaBatDt
	 */
	public String getCoaBatDt() {
		return this.coaBatDt;
	}
	
	/**
	 * Column Info
	 * @return coaDyBatCd
	 */
	public String getCoaDyBatCd() {
		return this.coaDyBatCd;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
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
	 * @return costWk
	 */
	public String getCostWk() {
		return this.costWk;
	}
	
	/**
	 * Column Info
	 * @return costIfDyRmk
	 */
	public String getCostIfDyRmk() {
		return this.costIfDyRmk;
	}
	
	/**
	 * Column Info
	 * @return coaBatCd
	 */
	public String getCoaBatCd() {
		return this.coaBatCd;
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
	 * @return coaDyBatSeq
	 */
	public String getCoaDyBatSeq() {
		return this.coaDyBatSeq;
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
	 * @param costIfMnlRmk
	 */
	public void setCostIfMnlRmk(String costIfMnlRmk) {
		this.costIfMnlRmk = costIfMnlRmk;
	}
	
	/**
	 * Column Info
	 * @param coaMnlBatCd
	 */
	public void setCoaMnlBatCd(String coaMnlBatCd) {
		this.coaMnlBatCd = coaMnlBatCd;
	}
	
	/**
	 * Column Info
	 * @param costIfRmk
	 */
	public void setCostIfRmk(String costIfRmk) {
		this.costIfRmk = costIfRmk;
	}
	
	/**
	 * Column Info
	 * @param coaBatSeq
	 */
	public void setCoaBatSeq(String coaBatSeq) {
		this.coaBatSeq = coaBatSeq;
	}
	
	/**
	 * Column Info
	 * @param coaDyBatDt
	 */
	public void setCoaDyBatDt(String coaDyBatDt) {
		this.coaDyBatDt = coaDyBatDt;
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
	 * @param coaMnlBatDt
	 */
	public void setCoaMnlBatDt(String coaMnlBatDt) {
		this.coaMnlBatDt = coaMnlBatDt;
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
	 * @param coaMnlBatSeq
	 */
	public void setCoaMnlBatSeq(String coaMnlBatSeq) {
		this.coaMnlBatSeq = coaMnlBatSeq;
	}
	
	/**
	 * Column Info
	 * @param slsYrmon
	 */
	public void setSlsYrmon(String slsYrmon) {
		this.slsYrmon = slsYrmon;
	}
	
	/**
	 * Column Info
	 * @param coaBatDt
	 */
	public void setCoaBatDt(String coaBatDt) {
		this.coaBatDt = coaBatDt;
	}
	
	/**
	 * Column Info
	 * @param coaDyBatCd
	 */
	public void setCoaDyBatCd(String coaDyBatCd) {
		this.coaDyBatCd = coaDyBatCd;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
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
	 * @param costWk
	 */
	public void setCostWk(String costWk) {
		this.costWk = costWk;
	}
	
	/**
	 * Column Info
	 * @param costIfDyRmk
	 */
	public void setCostIfDyRmk(String costIfDyRmk) {
		this.costIfDyRmk = costIfDyRmk;
	}
	
	/**
	 * Column Info
	 * @param coaBatCd
	 */
	public void setCoaBatCd(String coaBatCd) {
		this.coaBatCd = coaBatCd;
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
	 * @param coaDyBatSeq
	 */
	public void setCoaDyBatSeq(String coaDyBatSeq) {
		this.coaDyBatSeq = coaDyBatSeq;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCostIfMnlRmk(JSPUtil.getParameter(request, "cost_if_mnl_rmk", ""));
		setCoaMnlBatCd(JSPUtil.getParameter(request, "coa_mnl_bat_cd", ""));
		setCostIfRmk(JSPUtil.getParameter(request, "cost_if_rmk", ""));
		setCoaBatSeq(JSPUtil.getParameter(request, "coa_bat_seq", ""));
		setCoaDyBatDt(JSPUtil.getParameter(request, "coa_dy_bat_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCoaMnlBatDt(JSPUtil.getParameter(request, "coa_mnl_bat_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCoaMnlBatSeq(JSPUtil.getParameter(request, "coa_mnl_bat_seq", ""));
		setSlsYrmon(JSPUtil.getParameter(request, "sls_yrmon", ""));
		setCoaBatDt(JSPUtil.getParameter(request, "coa_bat_dt", ""));
		setCoaDyBatCd(JSPUtil.getParameter(request, "coa_dy_bat_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setCostWk(JSPUtil.getParameter(request, "cost_wk", ""));
		setCostIfDyRmk(JSPUtil.getParameter(request, "cost_if_dy_rmk", ""));
		setCoaBatCd(JSPUtil.getParameter(request, "coa_bat_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCoaDyBatSeq(JSPUtil.getParameter(request, "coa_dy_bat_seq", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaCopIfMgmtVO[]
	 */
	public CoaCopIfMgmtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaCopIfMgmtVO[]
	 */
	public CoaCopIfMgmtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaCopIfMgmtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] costIfMnlRmk = (JSPUtil.getParameter(request, prefix	+ "cost_if_mnl_rmk", length));
			String[] coaMnlBatCd = (JSPUtil.getParameter(request, prefix	+ "coa_mnl_bat_cd", length));
			String[] costIfRmk = (JSPUtil.getParameter(request, prefix	+ "cost_if_rmk", length));
			String[] coaBatSeq = (JSPUtil.getParameter(request, prefix	+ "coa_bat_seq", length));
			String[] coaDyBatDt = (JSPUtil.getParameter(request, prefix	+ "coa_dy_bat_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] coaMnlBatDt = (JSPUtil.getParameter(request, prefix	+ "coa_mnl_bat_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] coaMnlBatSeq = (JSPUtil.getParameter(request, prefix	+ "coa_mnl_bat_seq", length));
			String[] slsYrmon = (JSPUtil.getParameter(request, prefix	+ "sls_yrmon", length));
			String[] coaBatDt = (JSPUtil.getParameter(request, prefix	+ "coa_bat_dt", length));
			String[] coaDyBatCd = (JSPUtil.getParameter(request, prefix	+ "coa_dy_bat_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon", length));
			String[] costWk = (JSPUtil.getParameter(request, prefix	+ "cost_wk", length));
			String[] costIfDyRmk = (JSPUtil.getParameter(request, prefix	+ "cost_if_dy_rmk", length));
			String[] coaBatCd = (JSPUtil.getParameter(request, prefix	+ "coa_bat_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] coaDyBatSeq = (JSPUtil.getParameter(request, prefix	+ "coa_dy_bat_seq", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaCopIfMgmtVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (costIfMnlRmk[i] != null)
					model.setCostIfMnlRmk(costIfMnlRmk[i]);
				if (coaMnlBatCd[i] != null)
					model.setCoaMnlBatCd(coaMnlBatCd[i]);
				if (costIfRmk[i] != null)
					model.setCostIfRmk(costIfRmk[i]);
				if (coaBatSeq[i] != null)
					model.setCoaBatSeq(coaBatSeq[i]);
				if (coaDyBatDt[i] != null)
					model.setCoaDyBatDt(coaDyBatDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (coaMnlBatDt[i] != null)
					model.setCoaMnlBatDt(coaMnlBatDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (coaMnlBatSeq[i] != null)
					model.setCoaMnlBatSeq(coaMnlBatSeq[i]);
				if (slsYrmon[i] != null)
					model.setSlsYrmon(slsYrmon[i]);
				if (coaBatDt[i] != null)
					model.setCoaBatDt(coaBatDt[i]);
				if (coaDyBatCd[i] != null)
					model.setCoaDyBatCd(coaDyBatCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (costWk[i] != null)
					model.setCostWk(costWk[i]);
				if (costIfDyRmk[i] != null)
					model.setCostIfDyRmk(costIfDyRmk[i]);
				if (coaBatCd[i] != null)
					model.setCoaBatCd(coaBatCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (coaDyBatSeq[i] != null)
					model.setCoaDyBatSeq(coaDyBatSeq[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaCopIfMgmtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaCopIfMgmtVO[]
	 */
	public CoaCopIfMgmtVO[] getCoaCopIfMgmtVOs(){
		CoaCopIfMgmtVO[] vos = (CoaCopIfMgmtVO[])models.toArray(new CoaCopIfMgmtVO[models.size()]);
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
		this.costIfMnlRmk = this.costIfMnlRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaMnlBatCd = this.coaMnlBatCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costIfRmk = this.costIfRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaBatSeq = this.coaBatSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaDyBatDt = this.coaDyBatDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaMnlBatDt = this.coaMnlBatDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaMnlBatSeq = this.coaMnlBatSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsYrmon = this.slsYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaBatDt = this.coaBatDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaDyBatCd = this.coaDyBatCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costWk = this.costWk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costIfDyRmk = this.costIfDyRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaBatCd = this.coaBatCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaDyBatSeq = this.coaDyBatSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
