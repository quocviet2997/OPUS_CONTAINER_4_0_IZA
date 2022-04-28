/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrScnrEccLnkVO.java
*@FileTitle : EqrScnrEccLnkVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.28
*@LastModifier : Lee Byoung Hun
*@LastVersion : 1.0
* 2009.07.28  
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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EqrScnrEccLnkVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrScnrEccLnkVO> models = new ArrayList<EqrScnrEccLnkVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String tz40ftCostAmt = null;
	/* Column Info */
	private String scnrId = null;
	/* Column Info */
	private String toEccCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String cntrMaxCapaQty = null;
	/* Column Info */
	private String trspModCd = null;
	/* Column Info */
	private String trspFreqKnt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String fmEccCd = null;
	/* Column Info */
	private String exptVolUtCd = null;
	/* Column Info */
	private String exptMaxCapaQty = null;
	/* Column Info */
	private String exptFmYrwk = null;
	/* Column Info */
	private String exptToYrwk = null;
	/* Column Info */
	private String tzDys = null;
	/* Column Info */
	private String tz45ftCostAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String tz20ftCostAmt = null;
	/* Column Info */
	private String cntrVolUtCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrScnrEccLnkVO() {}

	public EqrScnrEccLnkVO(String ibflag, String pagerows, String scnrId, String fmEccCd, String toEccCd, String trspModCd, String tzDys, String tz20ftCostAmt, String tz40ftCostAmt, String tz45ftCostAmt, String cntrMaxCapaQty, String cntrVolUtCd, String trspFreqKnt, String exptFmYrwk, String exptToYrwk, String exptMaxCapaQty, String exptVolUtCd, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.tz40ftCostAmt = tz40ftCostAmt;
		this.scnrId = scnrId;
		this.toEccCd = toEccCd;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.cntrMaxCapaQty = cntrMaxCapaQty;
		this.trspModCd = trspModCd;
		this.trspFreqKnt = trspFreqKnt;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.fmEccCd = fmEccCd;
		this.exptVolUtCd = exptVolUtCd;
		this.exptMaxCapaQty = exptMaxCapaQty;
		this.exptFmYrwk = exptFmYrwk;
		this.exptToYrwk = exptToYrwk;
		this.tzDys = tzDys;
		this.tz45ftCostAmt = tz45ftCostAmt;
		this.updUsrId = updUsrId;
		this.tz20ftCostAmt = tz20ftCostAmt;
		this.cntrVolUtCd = cntrVolUtCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("tz_40ft_cost_amt", getTz40ftCostAmt());
		this.hashColumns.put("scnr_id", getScnrId());
		this.hashColumns.put("to_ecc_cd", getToEccCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cntr_max_capa_qty", getCntrMaxCapaQty());
		this.hashColumns.put("trsp_mod_cd", getTrspModCd());
		this.hashColumns.put("trsp_freq_knt", getTrspFreqKnt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("fm_ecc_cd", getFmEccCd());
		this.hashColumns.put("expt_vol_ut_cd", getExptVolUtCd());
		this.hashColumns.put("expt_max_capa_qty", getExptMaxCapaQty());
		this.hashColumns.put("expt_fm_yrwk", getExptFmYrwk());
		this.hashColumns.put("expt_to_yrwk", getExptToYrwk());
		this.hashColumns.put("tz_dys", getTzDys());
		this.hashColumns.put("tz_45ft_cost_amt", getTz45ftCostAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("tz_20ft_cost_amt", getTz20ftCostAmt());
		this.hashColumns.put("cntr_vol_ut_cd", getCntrVolUtCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("tz_40ft_cost_amt", "tz40ftCostAmt");
		this.hashFields.put("scnr_id", "scnrId");
		this.hashFields.put("to_ecc_cd", "toEccCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cntr_max_capa_qty", "cntrMaxCapaQty");
		this.hashFields.put("trsp_mod_cd", "trspModCd");
		this.hashFields.put("trsp_freq_knt", "trspFreqKnt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("fm_ecc_cd", "fmEccCd");
		this.hashFields.put("expt_vol_ut_cd", "exptVolUtCd");
		this.hashFields.put("expt_max_capa_qty", "exptMaxCapaQty");
		this.hashFields.put("expt_fm_yrwk", "exptFmYrwk");
		this.hashFields.put("expt_to_yrwk", "exptToYrwk");
		this.hashFields.put("tz_dys", "tzDys");
		this.hashFields.put("tz_45ft_cost_amt", "tz45ftCostAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("tz_20ft_cost_amt", "tz20ftCostAmt");
		this.hashFields.put("cntr_vol_ut_cd", "cntrVolUtCd");
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
	 * @return tz40ftCostAmt
	 */
	public String getTz40ftCostAmt() {
		return this.tz40ftCostAmt;
	}
	
	/**
	 * Column Info
	 * @return scnrId
	 */
	public String getScnrId() {
		return this.scnrId;
	}
	
	/**
	 * Column Info
	 * @return toEccCd
	 */
	public String getToEccCd() {
		return this.toEccCd;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return cntrMaxCapaQty
	 */
	public String getCntrMaxCapaQty() {
		return this.cntrMaxCapaQty;
	}
	
	/**
	 * Column Info
	 * @return trspModCd
	 */
	public String getTrspModCd() {
		return this.trspModCd;
	}
	
	/**
	 * Column Info
	 * @return trspFreqKnt
	 */
	public String getTrspFreqKnt() {
		return this.trspFreqKnt;
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
	 * @return fmEccCd
	 */
	public String getFmEccCd() {
		return this.fmEccCd;
	}
	
	/**
	 * Column Info
	 * @return exptVolUtCd
	 */
	public String getExptVolUtCd() {
		return this.exptVolUtCd;
	}
	
	/**
	 * Column Info
	 * @return exptMaxCapaQty
	 */
	public String getExptMaxCapaQty() {
		return this.exptMaxCapaQty;
	}
	
	/**
	 * Column Info
	 * @return exptFmYrwk
	 */
	public String getExptFmYrwk() {
		return this.exptFmYrwk;
	}
	
	/**
	 * Column Info
	 * @return exptToYrwk
	 */
	public String getExptToYrwk() {
		return this.exptToYrwk;
	}
	
	/**
	 * Column Info
	 * @return tzDys
	 */
	public String getTzDys() {
		return this.tzDys;
	}
	
	/**
	 * Column Info
	 * @return tz45ftCostAmt
	 */
	public String getTz45ftCostAmt() {
		return this.tz45ftCostAmt;
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
	 * @return tz20ftCostAmt
	 */
	public String getTz20ftCostAmt() {
		return this.tz20ftCostAmt;
	}
	
	/**
	 * Column Info
	 * @return cntrVolUtCd
	 */
	public String getCntrVolUtCd() {
		return this.cntrVolUtCd;
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
	 * @param tz40ftCostAmt
	 */
	public void setTz40ftCostAmt(String tz40ftCostAmt) {
		this.tz40ftCostAmt = tz40ftCostAmt;
	}
	
	/**
	 * Column Info
	 * @param scnrId
	 */
	public void setScnrId(String scnrId) {
		this.scnrId = scnrId;
	}
	
	/**
	 * Column Info
	 * @param toEccCd
	 */
	public void setToEccCd(String toEccCd) {
		this.toEccCd = toEccCd;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param cntrMaxCapaQty
	 */
	public void setCntrMaxCapaQty(String cntrMaxCapaQty) {
		this.cntrMaxCapaQty = cntrMaxCapaQty;
	}
	
	/**
	 * Column Info
	 * @param trspModCd
	 */
	public void setTrspModCd(String trspModCd) {
		this.trspModCd = trspModCd;
	}
	
	/**
	 * Column Info
	 * @param trspFreqKnt
	 */
	public void setTrspFreqKnt(String trspFreqKnt) {
		this.trspFreqKnt = trspFreqKnt;
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
	 * @param fmEccCd
	 */
	public void setFmEccCd(String fmEccCd) {
		this.fmEccCd = fmEccCd;
	}
	
	/**
	 * Column Info
	 * @param exptVolUtCd
	 */
	public void setExptVolUtCd(String exptVolUtCd) {
		this.exptVolUtCd = exptVolUtCd;
	}
	
	/**
	 * Column Info
	 * @param exptMaxCapaQty
	 */
	public void setExptMaxCapaQty(String exptMaxCapaQty) {
		this.exptMaxCapaQty = exptMaxCapaQty;
	}
	
	/**
	 * Column Info
	 * @param exptFmYrwk
	 */
	public void setExptFmYrwk(String exptFmYrwk) {
		this.exptFmYrwk = exptFmYrwk;
	}
	
	/**
	 * Column Info
	 * @param exptToYrwk
	 */
	public void setExptToYrwk(String exptToYrwk) {
		this.exptToYrwk = exptToYrwk;
	}
	
	/**
	 * Column Info
	 * @param tzDys
	 */
	public void setTzDys(String tzDys) {
		this.tzDys = tzDys;
	}
	
	/**
	 * Column Info
	 * @param tz45ftCostAmt
	 */
	public void setTz45ftCostAmt(String tz45ftCostAmt) {
		this.tz45ftCostAmt = tz45ftCostAmt;
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
	 * @param tz20ftCostAmt
	 */
	public void setTz20ftCostAmt(String tz20ftCostAmt) {
		this.tz20ftCostAmt = tz20ftCostAmt;
	}
	
	/**
	 * Column Info
	 * @param cntrVolUtCd
	 */
	public void setCntrVolUtCd(String cntrVolUtCd) {
		this.cntrVolUtCd = cntrVolUtCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setTz40ftCostAmt(JSPUtil.getParameter(request, "tz_40ft_cost_amt", ""));
		setScnrId(JSPUtil.getParameter(request, "scnr_id", ""));
		setToEccCd(JSPUtil.getParameter(request, "to_ecc_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCntrMaxCapaQty(JSPUtil.getParameter(request, "cntr_max_capa_qty", ""));
		setTrspModCd(JSPUtil.getParameter(request, "trsp_mod_cd", ""));
		setTrspFreqKnt(JSPUtil.getParameter(request, "trsp_freq_knt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setFmEccCd(JSPUtil.getParameter(request, "fm_ecc_cd", ""));
		setExptVolUtCd(JSPUtil.getParameter(request, "expt_vol_ut_cd", ""));
		setExptMaxCapaQty(JSPUtil.getParameter(request, "expt_max_capa_qty", ""));
		setExptFmYrwk(JSPUtil.getParameter(request, "expt_fm_yrwk", ""));
		setExptToYrwk(JSPUtil.getParameter(request, "expt_to_yrwk", ""));
		setTzDys(JSPUtil.getParameter(request, "tz_dys", ""));
		setTz45ftCostAmt(JSPUtil.getParameter(request, "tz_45ft_cost_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setTz20ftCostAmt(JSPUtil.getParameter(request, "tz_20ft_cost_amt", ""));
		setCntrVolUtCd(JSPUtil.getParameter(request, "cntr_vol_ut_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrScnrEccLnkVO[]
	 */
	public EqrScnrEccLnkVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrScnrEccLnkVO[]
	 */
	public EqrScnrEccLnkVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrScnrEccLnkVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] tz40ftCostAmt = (JSPUtil.getParameter(request, prefix	+ "tz_40ft_cost_amt", length));
			String[] scnrId = (JSPUtil.getParameter(request, prefix	+ "scnr_id", length));
			String[] toEccCd = (JSPUtil.getParameter(request, prefix	+ "to_ecc_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] cntrMaxCapaQty = (JSPUtil.getParameter(request, prefix	+ "cntr_max_capa_qty", length));
			String[] trspModCd = (JSPUtil.getParameter(request, prefix	+ "trsp_mod_cd", length));
			String[] trspFreqKnt = (JSPUtil.getParameter(request, prefix	+ "trsp_freq_knt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] fmEccCd = (JSPUtil.getParameter(request, prefix	+ "fm_ecc_cd", length));
			String[] exptVolUtCd = (JSPUtil.getParameter(request, prefix	+ "expt_vol_ut_cd", length));
			String[] exptMaxCapaQty = (JSPUtil.getParameter(request, prefix	+ "expt_max_capa_qty", length));
			String[] exptFmYrwk = (JSPUtil.getParameter(request, prefix	+ "expt_fm_yrwk", length));
			String[] exptToYrwk = (JSPUtil.getParameter(request, prefix	+ "expt_to_yrwk", length));
			String[] tzDys = (JSPUtil.getParameter(request, prefix	+ "tz_dys", length));
			String[] tz45ftCostAmt = (JSPUtil.getParameter(request, prefix	+ "tz_45ft_cost_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] tz20ftCostAmt = (JSPUtil.getParameter(request, prefix	+ "tz_20ft_cost_amt", length));
			String[] cntrVolUtCd = (JSPUtil.getParameter(request, prefix	+ "cntr_vol_ut_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrScnrEccLnkVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (tz40ftCostAmt[i] != null)
					model.setTz40ftCostAmt(tz40ftCostAmt[i]);
				if (scnrId[i] != null)
					model.setScnrId(scnrId[i]);
				if (toEccCd[i] != null)
					model.setToEccCd(toEccCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (cntrMaxCapaQty[i] != null)
					model.setCntrMaxCapaQty(cntrMaxCapaQty[i]);
				if (trspModCd[i] != null)
					model.setTrspModCd(trspModCd[i]);
				if (trspFreqKnt[i] != null)
					model.setTrspFreqKnt(trspFreqKnt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (fmEccCd[i] != null)
					model.setFmEccCd(fmEccCd[i]);
				if (exptVolUtCd[i] != null)
					model.setExptVolUtCd(exptVolUtCd[i]);
				if (exptMaxCapaQty[i] != null)
					model.setExptMaxCapaQty(exptMaxCapaQty[i]);
				if (exptFmYrwk[i] != null)
					model.setExptFmYrwk(exptFmYrwk[i]);
				if (exptToYrwk[i] != null)
					model.setExptToYrwk(exptToYrwk[i]);
				if (tzDys[i] != null)
					model.setTzDys(tzDys[i]);
				if (tz45ftCostAmt[i] != null)
					model.setTz45ftCostAmt(tz45ftCostAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (tz20ftCostAmt[i] != null)
					model.setTz20ftCostAmt(tz20ftCostAmt[i]);
				if (cntrVolUtCd[i] != null)
					model.setCntrVolUtCd(cntrVolUtCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrScnrEccLnkVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrScnrEccLnkVO[]
	 */
	public EqrScnrEccLnkVO[] getEqrScnrEccLnkVOs(){
		EqrScnrEccLnkVO[] vos = (EqrScnrEccLnkVO[])models.toArray(new EqrScnrEccLnkVO[models.size()]);
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
		this.tz40ftCostAmt = this.tz40ftCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scnrId = this.scnrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toEccCd = this.toEccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMaxCapaQty = this.cntrMaxCapaQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspModCd = this.trspModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspFreqKnt = this.trspFreqKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmEccCd = this.fmEccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exptVolUtCd = this.exptVolUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exptMaxCapaQty = this.exptMaxCapaQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exptFmYrwk = this.exptFmYrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exptToYrwk = this.exptToYrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tzDys = this.tzDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tz45ftCostAmt = this.tz45ftCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tz20ftCostAmt = this.tz20ftCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrVolUtCd = this.cntrVolUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
