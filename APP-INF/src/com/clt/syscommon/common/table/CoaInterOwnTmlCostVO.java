/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaInterOwnTmlCostVO.java
*@FileTitle : CoaInterOwnTmlCostVO
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

public class CoaInterOwnTmlCostVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaInterOwnTmlCostVO> models = new ArrayList<CoaInterOwnTmlCostVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String tmlUtCd = null;
	/* Column Info */
	private String tmlUcAmt = null;
	/* Column Info */
	private String coaCostSrcCd = null;
	/* Column Info */
	private String tmlUsdAmt = null;
	/* Column Info */
	private String tmlTrfItmCd = null;
	/* Column Info */
	private String loclCurrCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String tmlCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String tmlTrfDtlCd = null;
	/* Column Info */
	private String mnTrfDtlCd = null;
	/* Column Info */
	private String loclTmlAmt = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String tmlQty = null;
	/* Column Info */
	private String mnItmChkFlg = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaInterOwnTmlCostVO() {}

	public CoaInterOwnTmlCostVO(String ibflag, String pagerows, String costYrmon, String tmlCd, String tmlTrfItmCd, String tmlTrfDtlCd, String cntrTpszCd, String coaCostSrcCd, String tmlUtCd, String loclCurrCd, String mnItmChkFlg, String mnTrfDtlCd, String tmlQty, String loclTmlAmt, String tmlUsdAmt, String tmlUcAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.tmlUtCd = tmlUtCd;
		this.tmlUcAmt = tmlUcAmt;
		this.coaCostSrcCd = coaCostSrcCd;
		this.tmlUsdAmt = tmlUsdAmt;
		this.tmlTrfItmCd = tmlTrfItmCd;
		this.loclCurrCd = loclCurrCd;
		this.creDt = creDt;
		this.tmlCd = tmlCd;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.costYrmon = costYrmon;
		this.tmlTrfDtlCd = tmlTrfDtlCd;
		this.mnTrfDtlCd = mnTrfDtlCd;
		this.loclTmlAmt = loclTmlAmt;
		this.cntrTpszCd = cntrTpszCd;
		this.tmlQty = tmlQty;
		this.mnItmChkFlg = mnItmChkFlg;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("tml_ut_cd", getTmlUtCd());
		this.hashColumns.put("tml_uc_amt", getTmlUcAmt());
		this.hashColumns.put("coa_cost_src_cd", getCoaCostSrcCd());
		this.hashColumns.put("tml_usd_amt", getTmlUsdAmt());
		this.hashColumns.put("tml_trf_itm_cd", getTmlTrfItmCd());
		this.hashColumns.put("locl_curr_cd", getLoclCurrCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("tml_cd", getTmlCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("tml_trf_dtl_cd", getTmlTrfDtlCd());
		this.hashColumns.put("mn_trf_dtl_cd", getMnTrfDtlCd());
		this.hashColumns.put("locl_tml_amt", getLoclTmlAmt());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("tml_qty", getTmlQty());
		this.hashColumns.put("mn_itm_chk_flg", getMnItmChkFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("tml_ut_cd", "tmlUtCd");
		this.hashFields.put("tml_uc_amt", "tmlUcAmt");
		this.hashFields.put("coa_cost_src_cd", "coaCostSrcCd");
		this.hashFields.put("tml_usd_amt", "tmlUsdAmt");
		this.hashFields.put("tml_trf_itm_cd", "tmlTrfItmCd");
		this.hashFields.put("locl_curr_cd", "loclCurrCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("tml_cd", "tmlCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("tml_trf_dtl_cd", "tmlTrfDtlCd");
		this.hashFields.put("mn_trf_dtl_cd", "mnTrfDtlCd");
		this.hashFields.put("locl_tml_amt", "loclTmlAmt");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("tml_qty", "tmlQty");
		this.hashFields.put("mn_itm_chk_flg", "mnItmChkFlg");
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
	 * @return tmlUtCd
	 */
	public String getTmlUtCd() {
		return this.tmlUtCd;
	}
	
	/**
	 * Column Info
	 * @return tmlUcAmt
	 */
	public String getTmlUcAmt() {
		return this.tmlUcAmt;
	}
	
	/**
	 * Column Info
	 * @return coaCostSrcCd
	 */
	public String getCoaCostSrcCd() {
		return this.coaCostSrcCd;
	}
	
	/**
	 * Column Info
	 * @return tmlUsdAmt
	 */
	public String getTmlUsdAmt() {
		return this.tmlUsdAmt;
	}
	
	/**
	 * Column Info
	 * @return tmlTrfItmCd
	 */
	public String getTmlTrfItmCd() {
		return this.tmlTrfItmCd;
	}
	
	/**
	 * Column Info
	 * @return loclCurrCd
	 */
	public String getLoclCurrCd() {
		return this.loclCurrCd;
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
	 * @return tmlCd
	 */
	public String getTmlCd() {
		return this.tmlCd;
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
	 * @return tmlTrfDtlCd
	 */
	public String getTmlTrfDtlCd() {
		return this.tmlTrfDtlCd;
	}
	
	/**
	 * Column Info
	 * @return mnTrfDtlCd
	 */
	public String getMnTrfDtlCd() {
		return this.mnTrfDtlCd;
	}
	
	/**
	 * Column Info
	 * @return loclTmlAmt
	 */
	public String getLoclTmlAmt() {
		return this.loclTmlAmt;
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
	 * @return tmlQty
	 */
	public String getTmlQty() {
		return this.tmlQty;
	}
	
	/**
	 * Column Info
	 * @return mnItmChkFlg
	 */
	public String getMnItmChkFlg() {
		return this.mnItmChkFlg;
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
	 * @param tmlUtCd
	 */
	public void setTmlUtCd(String tmlUtCd) {
		this.tmlUtCd = tmlUtCd;
	}
	
	/**
	 * Column Info
	 * @param tmlUcAmt
	 */
	public void setTmlUcAmt(String tmlUcAmt) {
		this.tmlUcAmt = tmlUcAmt;
	}
	
	/**
	 * Column Info
	 * @param coaCostSrcCd
	 */
	public void setCoaCostSrcCd(String coaCostSrcCd) {
		this.coaCostSrcCd = coaCostSrcCd;
	}
	
	/**
	 * Column Info
	 * @param tmlUsdAmt
	 */
	public void setTmlUsdAmt(String tmlUsdAmt) {
		this.tmlUsdAmt = tmlUsdAmt;
	}
	
	/**
	 * Column Info
	 * @param tmlTrfItmCd
	 */
	public void setTmlTrfItmCd(String tmlTrfItmCd) {
		this.tmlTrfItmCd = tmlTrfItmCd;
	}
	
	/**
	 * Column Info
	 * @param loclCurrCd
	 */
	public void setLoclCurrCd(String loclCurrCd) {
		this.loclCurrCd = loclCurrCd;
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
	 * @param tmlCd
	 */
	public void setTmlCd(String tmlCd) {
		this.tmlCd = tmlCd;
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
	 * @param tmlTrfDtlCd
	 */
	public void setTmlTrfDtlCd(String tmlTrfDtlCd) {
		this.tmlTrfDtlCd = tmlTrfDtlCd;
	}
	
	/**
	 * Column Info
	 * @param mnTrfDtlCd
	 */
	public void setMnTrfDtlCd(String mnTrfDtlCd) {
		this.mnTrfDtlCd = mnTrfDtlCd;
	}
	
	/**
	 * Column Info
	 * @param loclTmlAmt
	 */
	public void setLoclTmlAmt(String loclTmlAmt) {
		this.loclTmlAmt = loclTmlAmt;
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
	 * @param tmlQty
	 */
	public void setTmlQty(String tmlQty) {
		this.tmlQty = tmlQty;
	}
	
	/**
	 * Column Info
	 * @param mnItmChkFlg
	 */
	public void setMnItmChkFlg(String mnItmChkFlg) {
		this.mnItmChkFlg = mnItmChkFlg;
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
		setTmlUtCd(JSPUtil.getParameter(request, "tml_ut_cd", ""));
		setTmlUcAmt(JSPUtil.getParameter(request, "tml_uc_amt", ""));
		setCoaCostSrcCd(JSPUtil.getParameter(request, "coa_cost_src_cd", ""));
		setTmlUsdAmt(JSPUtil.getParameter(request, "tml_usd_amt", ""));
		setTmlTrfItmCd(JSPUtil.getParameter(request, "tml_trf_itm_cd", ""));
		setLoclCurrCd(JSPUtil.getParameter(request, "locl_curr_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTmlCd(JSPUtil.getParameter(request, "tml_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setTmlTrfDtlCd(JSPUtil.getParameter(request, "tml_trf_dtl_cd", ""));
		setMnTrfDtlCd(JSPUtil.getParameter(request, "mn_trf_dtl_cd", ""));
		setLoclTmlAmt(JSPUtil.getParameter(request, "locl_tml_amt", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setTmlQty(JSPUtil.getParameter(request, "tml_qty", ""));
		setMnItmChkFlg(JSPUtil.getParameter(request, "mn_itm_chk_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaInterOwnTmlCostVO[]
	 */
	public CoaInterOwnTmlCostVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaInterOwnTmlCostVO[]
	 */
	public CoaInterOwnTmlCostVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaInterOwnTmlCostVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] tmlUtCd = (JSPUtil.getParameter(request, prefix	+ "tml_ut_cd", length));
			String[] tmlUcAmt = (JSPUtil.getParameter(request, prefix	+ "tml_uc_amt", length));
			String[] coaCostSrcCd = (JSPUtil.getParameter(request, prefix	+ "coa_cost_src_cd", length));
			String[] tmlUsdAmt = (JSPUtil.getParameter(request, prefix	+ "tml_usd_amt", length));
			String[] tmlTrfItmCd = (JSPUtil.getParameter(request, prefix	+ "tml_trf_itm_cd", length));
			String[] loclCurrCd = (JSPUtil.getParameter(request, prefix	+ "locl_curr_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] tmlCd = (JSPUtil.getParameter(request, prefix	+ "tml_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon", length));
			String[] tmlTrfDtlCd = (JSPUtil.getParameter(request, prefix	+ "tml_trf_dtl_cd", length));
			String[] mnTrfDtlCd = (JSPUtil.getParameter(request, prefix	+ "mn_trf_dtl_cd", length));
			String[] loclTmlAmt = (JSPUtil.getParameter(request, prefix	+ "locl_tml_amt", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] tmlQty = (JSPUtil.getParameter(request, prefix	+ "tml_qty", length));
			String[] mnItmChkFlg = (JSPUtil.getParameter(request, prefix	+ "mn_itm_chk_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaInterOwnTmlCostVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (tmlUtCd[i] != null)
					model.setTmlUtCd(tmlUtCd[i]);
				if (tmlUcAmt[i] != null)
					model.setTmlUcAmt(tmlUcAmt[i]);
				if (coaCostSrcCd[i] != null)
					model.setCoaCostSrcCd(coaCostSrcCd[i]);
				if (tmlUsdAmt[i] != null)
					model.setTmlUsdAmt(tmlUsdAmt[i]);
				if (tmlTrfItmCd[i] != null)
					model.setTmlTrfItmCd(tmlTrfItmCd[i]);
				if (loclCurrCd[i] != null)
					model.setLoclCurrCd(loclCurrCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (tmlCd[i] != null)
					model.setTmlCd(tmlCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (tmlTrfDtlCd[i] != null)
					model.setTmlTrfDtlCd(tmlTrfDtlCd[i]);
				if (mnTrfDtlCd[i] != null)
					model.setMnTrfDtlCd(mnTrfDtlCd[i]);
				if (loclTmlAmt[i] != null)
					model.setLoclTmlAmt(loclTmlAmt[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (tmlQty[i] != null)
					model.setTmlQty(tmlQty[i]);
				if (mnItmChkFlg[i] != null)
					model.setMnItmChkFlg(mnItmChkFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaInterOwnTmlCostVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaInterOwnTmlCostVO[]
	 */
	public CoaInterOwnTmlCostVO[] getCoaInterOwnTmlCostVOs(){
		CoaInterOwnTmlCostVO[] vos = (CoaInterOwnTmlCostVO[])models.toArray(new CoaInterOwnTmlCostVO[models.size()]);
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
		this.tmlUtCd = this.tmlUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlUcAmt = this.tmlUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaCostSrcCd = this.coaCostSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlUsdAmt = this.tmlUsdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlTrfItmCd = this.tmlTrfItmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCurrCd = this.loclCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlCd = this.tmlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlTrfDtlCd = this.tmlTrfDtlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnTrfDtlCd = this.mnTrfDtlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclTmlAmt = this.loclTmlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlQty = this.tmlQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnItmChkFlg = this.mnItmChkFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
