/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : GlMonXchRtVO.java
*@FileTitle : GlMonXchRtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.27
*@LastModifier : 김세일
*@LastVersion : 1.0
* 2009.04.27 김세일 
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
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 김세일
 * @since J2EE 1.5
 */

public class GlMonXchRtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<GlMonXchRtVO> models = new ArrayList<GlMonXchRtVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String loclKrwXchRt = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String nisEvntDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String logUpdDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String acctXchRtLvl = null;
	/* Column Info */
	private String acctRtUsrLvl = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String acctXchRtYrmon = null;
	/* Column Info */
	private String usdKrwXchRt = null;
	/* Column Info */
	private String usdLoclXchRt = null;
	/* Column Info */
	private String updUsrId = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public GlMonXchRtVO() {}

	public GlMonXchRtVO(String ibflag, String pagerows, String acctXchRtYrmon, String acctXchRtLvl, String currCd, String usdLoclXchRt, String loclKrwXchRt, String usdKrwXchRt, String updDt, String acctRtUsrLvl, String logUpdDt, String updUsrId, String deltFlg, String creDt, String nisEvntDt, String eaiEvntDt) {
		this.updDt = updDt;
		this.loclKrwXchRt = loclKrwXchRt;
		this.currCd = currCd;
		this.deltFlg = deltFlg;
		this.nisEvntDt = nisEvntDt;
		this.creDt = creDt;
		this.eaiEvntDt = eaiEvntDt;
		this.logUpdDt = logUpdDt;
		this.pagerows = pagerows;
		this.acctXchRtLvl = acctXchRtLvl;
		this.acctRtUsrLvl = acctRtUsrLvl;
		this.ibflag = ibflag;
		this.acctXchRtYrmon = acctXchRtYrmon;
		this.usdKrwXchRt = usdKrwXchRt;
		this.usdLoclXchRt = usdLoclXchRt;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("locl_krw_xch_rt", getLoclKrwXchRt());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("nis_evnt_dt", getNisEvntDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("log_upd_dt", getLogUpdDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("acct_xch_rt_lvl", getAcctXchRtLvl());
		this.hashColumns.put("acct_rt_usr_lvl", getAcctRtUsrLvl());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("acct_xch_rt_yrmon", getAcctXchRtYrmon());
		this.hashColumns.put("usd_krw_xch_rt", getUsdKrwXchRt());
		this.hashColumns.put("usd_locl_xch_rt", getUsdLoclXchRt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("locl_krw_xch_rt", "loclKrwXchRt");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("nis_evnt_dt", "nisEvntDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("log_upd_dt", "logUpdDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("acct_xch_rt_lvl", "acctXchRtLvl");
		this.hashFields.put("acct_rt_usr_lvl", "acctRtUsrLvl");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("acct_xch_rt_yrmon", "acctXchRtYrmon");
		this.hashFields.put("usd_krw_xch_rt", "usdKrwXchRt");
		this.hashFields.put("usd_locl_xch_rt", "usdLoclXchRt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		return this.hashFields;
	}
	
	public String getUpdDt() {
		return this.updDt;
	}
	public String getLoclKrwXchRt() {
		return this.loclKrwXchRt;
	}
	public String getCurrCd() {
		return this.currCd;
	}
	public String getDeltFlg() {
		return this.deltFlg;
	}
	public String getNisEvntDt() {
		return this.nisEvntDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
	}
	public String getLogUpdDt() {
		return this.logUpdDt;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getAcctXchRtLvl() {
		return this.acctXchRtLvl;
	}
	public String getAcctRtUsrLvl() {
		return this.acctRtUsrLvl;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getAcctXchRtYrmon() {
		return this.acctXchRtYrmon;
	}
	public String getUsdKrwXchRt() {
		return this.usdKrwXchRt;
	}
	public String getUsdLoclXchRt() {
		return this.usdLoclXchRt;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setLoclKrwXchRt(String loclKrwXchRt) {
		this.loclKrwXchRt = loclKrwXchRt;
		//this.loclKrwXchRt=true;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
		//this.currCd=true;
	}
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
		//this.deltFlg=true;
	}
	public void setNisEvntDt(String nisEvntDt) {
		this.nisEvntDt = nisEvntDt;
		//this.nisEvntDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
		//this.eaiEvntDt=true;
	}
	public void setLogUpdDt(String logUpdDt) {
		this.logUpdDt = logUpdDt;
		//this.logUpdDt=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setAcctXchRtLvl(String acctXchRtLvl) {
		this.acctXchRtLvl = acctXchRtLvl;
		//this.acctXchRtLvl=true;
	}
	public void setAcctRtUsrLvl(String acctRtUsrLvl) {
		this.acctRtUsrLvl = acctRtUsrLvl;
		//this.acctRtUsrLvl=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setAcctXchRtYrmon(String acctXchRtYrmon) {
		this.acctXchRtYrmon = acctXchRtYrmon;
		//this.acctXchRtYrmon=true;
	}
	public void setUsdKrwXchRt(String usdKrwXchRt) {
		this.usdKrwXchRt = usdKrwXchRt;
		//this.usdKrwXchRt=true;
	}
	public void setUsdLoclXchRt(String usdLoclXchRt) {
		this.usdLoclXchRt = usdLoclXchRt;
		//this.usdLoclXchRt=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setLoclKrwXchRt(JSPUtil.getParameter(request, "locl_krw_xch_rt", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setNisEvntDt(JSPUtil.getParameter(request, "nis_evnt_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setLogUpdDt(JSPUtil.getParameter(request, "log_upd_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setAcctXchRtLvl(JSPUtil.getParameter(request, "acct_xch_rt_lvl", ""));
		setAcctRtUsrLvl(JSPUtil.getParameter(request, "acct_rt_usr_lvl", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAcctXchRtYrmon(JSPUtil.getParameter(request, "acct_xch_rt_yrmon", ""));
		setUsdKrwXchRt(JSPUtil.getParameter(request, "usd_krw_xch_rt", ""));
		setUsdLoclXchRt(JSPUtil.getParameter(request, "usd_locl_xch_rt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	public GlMonXchRtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public GlMonXchRtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		GlMonXchRtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] loclKrwXchRt = (JSPUtil.getParameter(request, prefix	+ "locl_krw_xch_rt".trim(), length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] nisEvntDt = (JSPUtil.getParameter(request, prefix	+ "nis_evnt_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt".trim(), length));
			String[] logUpdDt = (JSPUtil.getParameter(request, prefix	+ "log_upd_dt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] acctXchRtLvl = (JSPUtil.getParameter(request, prefix	+ "acct_xch_rt_lvl".trim(), length));
			String[] acctRtUsrLvl = (JSPUtil.getParameter(request, prefix	+ "acct_rt_usr_lvl".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] acctXchRtYrmon = (JSPUtil.getParameter(request, prefix	+ "acct_xch_rt_yrmon".trim(), length));
			String[] usdKrwXchRt = (JSPUtil.getParameter(request, prefix	+ "usd_krw_xch_rt".trim(), length));
			String[] usdLoclXchRt = (JSPUtil.getParameter(request, prefix	+ "usd_locl_xch_rt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new GlMonXchRtVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (loclKrwXchRt[i] != null)
					model.setLoclKrwXchRt(loclKrwXchRt[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (nisEvntDt[i] != null)
					model.setNisEvntDt(nisEvntDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (logUpdDt[i] != null)
					model.setLogUpdDt(logUpdDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (acctXchRtLvl[i] != null)
					model.setAcctXchRtLvl(acctXchRtLvl[i]);
				if (acctRtUsrLvl[i] != null)
					model.setAcctRtUsrLvl(acctRtUsrLvl[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (acctXchRtYrmon[i] != null)
					model.setAcctXchRtYrmon(acctXchRtYrmon[i]);
				if (usdKrwXchRt[i] != null)
					model.setUsdKrwXchRt(usdKrwXchRt[i]);
				if (usdLoclXchRt[i] != null)
					model.setUsdLoclXchRt(usdLoclXchRt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getGlMonXchRtVOs();
	}

	public GlMonXchRtVO[] getGlMonXchRtVOs(){
		GlMonXchRtVO[] vos = (GlMonXchRtVO[])models.toArray(new GlMonXchRtVO[models.size()]);
		return vos;
	}
	
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
		} catch (Exception ex) {}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 * @throws IllegalAccessException
	 */
	private String[] getField(Field[] field, int i) throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclKrwXchRt = this.loclKrwXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nisEvntDt = this.nisEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.logUpdDt = this.logUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctXchRtLvl = this.acctXchRtLvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctRtUsrLvl = this.acctRtUsrLvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctXchRtYrmon = this.acctXchRtYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usdKrwXchRt = this.usdKrwXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usdLoclXchRt = this.usdLoclXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
