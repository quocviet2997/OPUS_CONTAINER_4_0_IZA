/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SearchGlMonthlyExchangeRateListVO.java
*@FileTitle : SearchGlMonthlyExchangeRateListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.09
*@LastModifier : 
*@LastVersion : 1.0
* 2011.03.09  
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo;

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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SearchGlMonthlyExchangeRateListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchGlMonthlyExchangeRateListVO> models = new ArrayList<SearchGlMonthlyExchangeRateListVO>();
	
	/* Column Info */
	private String hCurrCd = null;
	/* Column Info */
	private String loclCnyXchRt = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String hAcctXchRtLvl = null;
	/* Column Info */
	private String logUpdDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String acctXchRtLvl = null;
	/* Column Info */
	private String acctRtUsrLvl = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String hAcctXchRtYrmon = null;
	/* Column Info */
	private String acctXchRtYrmon = null;
	/* Column Info */
	private String usdCnyXchRt = null;
	/* Column Info */
	private String usdLoclXchRt = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchGlMonthlyExchangeRateListVO() {}

	public SearchGlMonthlyExchangeRateListVO(String ibflag, String pagerows, String acctXchRtYrmon, String acctXchRtLvl, String currCd, String hAcctXchRtYrmon, String hAcctXchRtLvl, String hCurrCd, String usdLoclXchRt, String loclCnyXchRt, String usdCnyXchRt, String acctRtUsrLvl, String logUpdDt, String deltFlg, String updUsrId, String creUsrId) {
		this.hCurrCd = hCurrCd;
		this.loclCnyXchRt = loclCnyXchRt;
		this.currCd = currCd;
		this.deltFlg = deltFlg;
		this.hAcctXchRtLvl = hAcctXchRtLvl;
		this.logUpdDt = logUpdDt;
		this.pagerows = pagerows;
		this.acctXchRtLvl = acctXchRtLvl;
		this.acctRtUsrLvl = acctRtUsrLvl;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.hAcctXchRtYrmon = hAcctXchRtYrmon;
		this.acctXchRtYrmon = acctXchRtYrmon;
		this.usdCnyXchRt = usdCnyXchRt;
		this.usdLoclXchRt = usdLoclXchRt;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("h_curr_cd", getHCurrCd());
		this.hashColumns.put("locl_cny_xch_rt", getLoclCnyXchRt());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("h_acct_xch_rt_lvl", getHAcctXchRtLvl());
		this.hashColumns.put("log_upd_dt", getLogUpdDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("acct_xch_rt_lvl", getAcctXchRtLvl());
		this.hashColumns.put("acct_rt_usr_lvl", getAcctRtUsrLvl());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("h_acct_xch_rt_yrmon", getHAcctXchRtYrmon());
		this.hashColumns.put("acct_xch_rt_yrmon", getAcctXchRtYrmon());
		this.hashColumns.put("usd_cny_xch_rt", getUsdCnyXchRt());
		this.hashColumns.put("usd_locl_xch_rt", getUsdLoclXchRt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("h_curr_cd", "hCurrCd");
		this.hashFields.put("locl_cny_xch_rt", "loclCnyXchRt");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("h_acct_xch_rt_lvl", "hAcctXchRtLvl");
		this.hashFields.put("log_upd_dt", "logUpdDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("acct_xch_rt_lvl", "acctXchRtLvl");
		this.hashFields.put("acct_rt_usr_lvl", "acctRtUsrLvl");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("h_acct_xch_rt_yrmon", "hAcctXchRtYrmon");
		this.hashFields.put("acct_xch_rt_yrmon", "acctXchRtYrmon");
		this.hashFields.put("usd_cny_xch_rt", "usdCnyXchRt");
		this.hashFields.put("usd_locl_xch_rt", "usdLoclXchRt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return hCurrCd
	 */
	public String getHCurrCd() {
		return this.hCurrCd;
	}
	
	/**
	 * Column Info
	 * @return loclKrwXchRt
	 */
	public String getLoclCnyXchRt() {
		return this.loclCnyXchRt;
	}
	
	/**
	 * Column Info
	 * @return currCd
	 */
	public String getCurrCd() {
		return this.currCd;
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
	 * @return hAcctXchRtLvl
	 */
	public String getHAcctXchRtLvl() {
		return this.hAcctXchRtLvl;
	}
	
	/**
	 * Column Info
	 * @return logUpdDt
	 */
	public String getLogUpdDt() {
		return this.logUpdDt;
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
	 * @return acctXchRtLvl
	 */
	public String getAcctXchRtLvl() {
		return this.acctXchRtLvl;
	}
	
	/**
	 * Column Info
	 * @return acctRtUsrLvl
	 */
	public String getAcctRtUsrLvl() {
		return this.acctRtUsrLvl;
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
	 * @return hAcctXchRtYrmon
	 */
	public String getHAcctXchRtYrmon() {
		return this.hAcctXchRtYrmon;
	}
	
	/**
	 * Column Info
	 * @return acctXchRtYrmon
	 */
	public String getAcctXchRtYrmon() {
		return this.acctXchRtYrmon;
	}
	
	/**
	 * Column Info
	 * @return usdKrwXchRt
	 */
	public String getUsdCnyXchRt() {
		return this.usdCnyXchRt;
	}
	
	/**
	 * Column Info
	 * @return usdLoclXchRt
	 */
	public String getUsdLoclXchRt() {
		return this.usdLoclXchRt;
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
	 * @param hCurrCd
	 */
	public void setHCurrCd(String hCurrCd) {
		this.hCurrCd = hCurrCd;
	}
	
	/**
	 * Column Info
	 * @param loclKrwXchRt
	 */
	public void setLoclCnyXchRt(String loclCnyXchRt) {
		this.loclCnyXchRt = loclCnyXchRt;
	}
	
	/**
	 * Column Info
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
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
	 * @param hAcctXchRtLvl
	 */
	public void setHAcctXchRtLvl(String hAcctXchRtLvl) {
		this.hAcctXchRtLvl = hAcctXchRtLvl;
	}
	
	/**
	 * Column Info
	 * @param logUpdDt
	 */
	public void setLogUpdDt(String logUpdDt) {
		this.logUpdDt = logUpdDt;
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
	 * @param acctXchRtLvl
	 */
	public void setAcctXchRtLvl(String acctXchRtLvl) {
		this.acctXchRtLvl = acctXchRtLvl;
	}
	
	/**
	 * Column Info
	 * @param acctRtUsrLvl
	 */
	public void setAcctRtUsrLvl(String acctRtUsrLvl) {
		this.acctRtUsrLvl = acctRtUsrLvl;
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
	 * @param hAcctXchRtYrmon
	 */
	public void setHAcctXchRtYrmon(String hAcctXchRtYrmon) {
		this.hAcctXchRtYrmon = hAcctXchRtYrmon;
	}
	
	/**
	 * Column Info
	 * @param acctXchRtYrmon
	 */
	public void setAcctXchRtYrmon(String acctXchRtYrmon) {
		this.acctXchRtYrmon = acctXchRtYrmon;
	}
	
	/**
	 * Column Info
	 * @param usdKrwXchRt
	 */
	public void setUsdCnyXchRt(String usdCnyXchRt) {
		this.usdCnyXchRt = usdCnyXchRt;
	}
	
	/**
	 * Column Info
	 * @param usdLoclXchRt
	 */
	public void setUsdLoclXchRt(String usdLoclXchRt) {
		this.usdLoclXchRt = usdLoclXchRt;
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
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setHCurrCd(JSPUtil.getParameter(request, prefix + "h_curr_cd", ""));
		setLoclCnyXchRt(JSPUtil.getParameter(request, prefix + "locl_cny_xch_rt", ""));
		setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setHAcctXchRtLvl(JSPUtil.getParameter(request, prefix + "h_acct_xch_rt_lvl", ""));
		setLogUpdDt(JSPUtil.getParameter(request, prefix + "log_upd_dt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setAcctXchRtLvl(JSPUtil.getParameter(request, prefix + "acct_xch_rt_lvl", ""));
		setAcctRtUsrLvl(JSPUtil.getParameter(request, prefix + "acct_rt_usr_lvl", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setHAcctXchRtYrmon(JSPUtil.getParameter(request, prefix + "h_acct_xch_rt_yrmon", ""));
		setAcctXchRtYrmon(JSPUtil.getParameter(request, prefix + "acct_xch_rt_yrmon", ""));
		setUsdCnyXchRt(JSPUtil.getParameter(request, prefix + "usd_cny_xch_rt", ""));
		setUsdLoclXchRt(JSPUtil.getParameter(request, prefix + "usd_locl_xch_rt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SearchGlMonthlyExchangeRateListVO[]
	 */
	public SearchGlMonthlyExchangeRateListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchGlMonthlyExchangeRateListVO[]
	 */
	public SearchGlMonthlyExchangeRateListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchGlMonthlyExchangeRateListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] hCurrCd = (JSPUtil.getParameter(request, prefix	+ "h_curr_cd", length));
			String[] loclCnyXchRt = (JSPUtil.getParameter(request, prefix	+ "locl_cny_xch_rt", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] hAcctXchRtLvl = (JSPUtil.getParameter(request, prefix	+ "h_acct_xch_rt_lvl", length));
			String[] logUpdDt = (JSPUtil.getParameter(request, prefix	+ "log_upd_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] acctXchRtLvl = (JSPUtil.getParameter(request, prefix	+ "acct_xch_rt_lvl", length));
			String[] acctRtUsrLvl = (JSPUtil.getParameter(request, prefix	+ "acct_rt_usr_lvl", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] hAcctXchRtYrmon = (JSPUtil.getParameter(request, prefix	+ "h_acct_xch_rt_yrmon", length));
			String[] acctXchRtYrmon = (JSPUtil.getParameter(request, prefix	+ "acct_xch_rt_yrmon", length));
			String[] usdCnyXchRt = (JSPUtil.getParameter(request, prefix	+ "usd_cny_xch_rt", length));
			String[] usdLoclXchRt = (JSPUtil.getParameter(request, prefix	+ "usd_locl_xch_rt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchGlMonthlyExchangeRateListVO();
				if (hCurrCd[i] != null)
					model.setHCurrCd(hCurrCd[i]);
				if (loclCnyXchRt[i] != null)
					model.setLoclCnyXchRt(loclCnyXchRt[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (hAcctXchRtLvl[i] != null)
					model.setHAcctXchRtLvl(hAcctXchRtLvl[i]);
				if (logUpdDt[i] != null)
					model.setLogUpdDt(logUpdDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (acctXchRtLvl[i] != null)
					model.setAcctXchRtLvl(acctXchRtLvl[i]);
				if (acctRtUsrLvl[i] != null)
					model.setAcctRtUsrLvl(acctRtUsrLvl[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (hAcctXchRtYrmon[i] != null)
					model.setHAcctXchRtYrmon(hAcctXchRtYrmon[i]);
				if (acctXchRtYrmon[i] != null)
					model.setAcctXchRtYrmon(acctXchRtYrmon[i]);
				if (usdCnyXchRt[i] != null)
					model.setUsdCnyXchRt(usdCnyXchRt[i]);
				if (usdLoclXchRt[i] != null)
					model.setUsdLoclXchRt(usdLoclXchRt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchGlMonthlyExchangeRateListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchGlMonthlyExchangeRateListVO[]
	 */
	public SearchGlMonthlyExchangeRateListVO[] getSearchGlMonthlyExchangeRateListVOs(){
		SearchGlMonthlyExchangeRateListVO[] vos = (SearchGlMonthlyExchangeRateListVO[])models.toArray(new SearchGlMonthlyExchangeRateListVO[models.size()]);
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
		this.hCurrCd = this.hCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCnyXchRt = this.loclCnyXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hAcctXchRtLvl = this.hAcctXchRtLvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.logUpdDt = this.logUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctXchRtLvl = this.acctXchRtLvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctRtUsrLvl = this.acctRtUsrLvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hAcctXchRtYrmon = this.hAcctXchRtYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctXchRtYrmon = this.acctXchRtYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usdCnyXchRt = this.usdCnyXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usdLoclXchRt = this.usdLoclXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
