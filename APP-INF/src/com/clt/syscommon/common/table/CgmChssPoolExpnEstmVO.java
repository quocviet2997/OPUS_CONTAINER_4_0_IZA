/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmChssPoolExpnEstmVO.java
*@FileTitle : CgmChssPoolExpnEstmVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.08
*@LastModifier : 김창식
*@LastVersion : 1.0
* 2009.05.08 김창식 
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
 * @author 김창식
 * @since J2EE 1.5
 */

public class CgmChssPoolExpnEstmVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmChssPoolExpnEstmVO> models = new ArrayList<CgmChssPoolExpnEstmVO>();
	
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String agmtSeq = null;
	/* Column Info */
	private String estmAmtFxFlg = null;
	/* Column Info */
	private String chssPoolTpCd = null;
	/* Column Info */
	private String estmAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String estmYrmon = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String actAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String agmtOfcCtyCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String chssPoolCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmChssPoolExpnEstmVO() {}

	public CgmChssPoolExpnEstmVO(String ibflag, String pagerows, String estmYrmon, String agmtOfcCtyCd, String agmtSeq, String chssPoolTpCd, String chssPoolCd, String currCd, String estmAmt, String actAmt, String estmAmtFxFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.ibflag = ibflag;
		this.agmtSeq = agmtSeq;
		this.estmAmtFxFlg = estmAmtFxFlg;
		this.chssPoolTpCd = chssPoolTpCd;
		this.estmAmt = estmAmt;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.creDt = creDt;
		this.estmYrmon = estmYrmon;
		this.currCd = currCd;
		this.actAmt = actAmt;
		this.creUsrId = creUsrId;
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		this.pagerows = pagerows;
		this.chssPoolCd = chssPoolCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("agmt_seq", getAgmtSeq());
		this.hashColumns.put("estm_amt_fx_flg", getEstmAmtFxFlg());
		this.hashColumns.put("chss_pool_tp_cd", getChssPoolTpCd());
		this.hashColumns.put("estm_amt", getEstmAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("estm_yrmon", getEstmYrmon());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("act_amt", getActAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("agmt_ofc_cty_cd", getAgmtOfcCtyCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("chss_pool_cd", getChssPoolCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("agmt_seq", "agmtSeq");
		this.hashFields.put("estm_amt_fx_flg", "estmAmtFxFlg");
		this.hashFields.put("chss_pool_tp_cd", "chssPoolTpCd");
		this.hashFields.put("estm_amt", "estmAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("estm_yrmon", "estmYrmon");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("act_amt", "actAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("agmt_ofc_cty_cd", "agmtOfcCtyCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("chss_pool_cd", "chssPoolCd");
		return this.hashFields;
	}
	
	public String getIbflag() {
		return this.ibflag;
	}
	public String getAgmtSeq() {
		return this.agmtSeq;
	}
	public String getEstmAmtFxFlg() {
		return this.estmAmtFxFlg;
	}
	public String getChssPoolTpCd() {
		return this.chssPoolTpCd;
	}
	public String getEstmAmt() {
		return this.estmAmt;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getEstmYrmon() {
		return this.estmYrmon;
	}
	public String getCurrCd() {
		return this.currCd;
	}
	public String getActAmt() {
		return this.actAmt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getAgmtOfcCtyCd() {
		return this.agmtOfcCtyCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getChssPoolCd() {
		return this.chssPoolCd;
	}

	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setAgmtSeq(String agmtSeq) {
		this.agmtSeq = agmtSeq;
		//this.agmtSeq=true;
	}
	public void setEstmAmtFxFlg(String estmAmtFxFlg) {
		this.estmAmtFxFlg = estmAmtFxFlg;
		//this.estmAmtFxFlg=true;
	}
	public void setChssPoolTpCd(String chssPoolTpCd) {
		this.chssPoolTpCd = chssPoolTpCd;
		//this.chssPoolTpCd=true;
	}
	public void setEstmAmt(String estmAmt) {
		this.estmAmt = estmAmt;
		//this.estmAmt=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setEstmYrmon(String estmYrmon) {
		this.estmYrmon = estmYrmon;
		//this.estmYrmon=true;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
		//this.currCd=true;
	}
	public void setActAmt(String actAmt) {
		this.actAmt = actAmt;
		//this.actAmt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setAgmtOfcCtyCd(String agmtOfcCtyCd) {
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		//this.agmtOfcCtyCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setChssPoolCd(String chssPoolCd) {
		this.chssPoolCd = chssPoolCd;
		//this.chssPoolCd=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAgmtSeq(JSPUtil.getParameter(request, "agmt_seq", ""));
		setEstmAmtFxFlg(JSPUtil.getParameter(request, "estm_amt_fx_flg", ""));
		setChssPoolTpCd(JSPUtil.getParameter(request, "chss_pool_tp_cd", ""));
		setEstmAmt(JSPUtil.getParameter(request, "estm_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEstmYrmon(JSPUtil.getParameter(request, "estm_yrmon", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setActAmt(JSPUtil.getParameter(request, "act_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setAgmtOfcCtyCd(JSPUtil.getParameter(request, "agmt_ofc_cty_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setChssPoolCd(JSPUtil.getParameter(request, "chss_pool_cd", ""));
	}

	public CgmChssPoolExpnEstmVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmChssPoolExpnEstmVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmChssPoolExpnEstmVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] agmtSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_seq".trim(), length));
			String[] estmAmtFxFlg = (JSPUtil.getParameter(request, prefix	+ "estm_amt_fx_flg".trim(), length));
			String[] chssPoolTpCd = (JSPUtil.getParameter(request, prefix	+ "chss_pool_tp_cd".trim(), length));
			String[] estmAmt = (JSPUtil.getParameter(request, prefix	+ "estm_amt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] estmYrmon = (JSPUtil.getParameter(request, prefix	+ "estm_yrmon".trim(), length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd".trim(), length));
			String[] actAmt = (JSPUtil.getParameter(request, prefix	+ "act_amt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] agmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_ofc_cty_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] chssPoolCd = (JSPUtil.getParameter(request, prefix	+ "chss_pool_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmChssPoolExpnEstmVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (agmtSeq[i] != null)
					model.setAgmtSeq(agmtSeq[i]);
				if (estmAmtFxFlg[i] != null)
					model.setEstmAmtFxFlg(estmAmtFxFlg[i]);
				if (chssPoolTpCd[i] != null)
					model.setChssPoolTpCd(chssPoolTpCd[i]);
				if (estmAmt[i] != null)
					model.setEstmAmt(estmAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (estmYrmon[i] != null)
					model.setEstmYrmon(estmYrmon[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (actAmt[i] != null)
					model.setActAmt(actAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (agmtOfcCtyCd[i] != null)
					model.setAgmtOfcCtyCd(agmtOfcCtyCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (chssPoolCd[i] != null)
					model.setChssPoolCd(chssPoolCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmChssPoolExpnEstmVOs();
	}

	public CgmChssPoolExpnEstmVO[] getCgmChssPoolExpnEstmVOs(){
		CgmChssPoolExpnEstmVO[] vos = (CgmChssPoolExpnEstmVO[])models.toArray(new CgmChssPoolExpnEstmVO[models.size()]);
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
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSeq = this.agmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmAmtFxFlg = this.estmAmtFxFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssPoolTpCd = this.chssPoolTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmAmt = this.estmAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmYrmon = this.estmYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actAmt = this.actAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOfcCtyCd = this.agmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssPoolCd = this.chssPoolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
