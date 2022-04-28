/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmEqAtchDtchHisVO.java
*@FileTitle : CgmEqAtchDtchHisVO
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

public class CgmEqAtchDtchHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmEqAtchDtchHisVO> models = new ArrayList<CgmEqAtchDtchHisVO>();
	
	/* Column Info */
	private String dtchInpTpCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String atchDt = null;
	/* Column Info */
	private String atchCnmvIdNo = null;
	/* Column Info */
	private String chssNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String atchYdCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String dtchCnmvIdNo = null;
	/* Column Info */
	private String atchInpTpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String eqKndCd = null;
	/* Column Info */
	private String dtchDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String dtchCnmvYr = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String eqNo = null;
	/* Column Info */
	private String atchCnmvYr = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String atchDtchSeq = null;
	/* Column Info */
	private String dtchYdCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmEqAtchDtchHisVO() {}

	public CgmEqAtchDtchHisVO(String ibflag, String pagerows, String eqNo, String atchDt, String atchDtchSeq, String eqKndCd, String cntrNo, String chssNo, String dtchDt, String atchYdCd, String dtchYdCd, String atchInpTpCd, String dtchInpTpCd, String atchCnmvYr, String atchCnmvIdNo, String dtchCnmvYr, String dtchCnmvIdNo, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.dtchInpTpCd = dtchInpTpCd;
		this.ibflag = ibflag;
		this.atchDt = atchDt;
		this.atchCnmvIdNo = atchCnmvIdNo;
		this.chssNo = chssNo;
		this.updUsrId = updUsrId;
		this.atchYdCd = atchYdCd;
		this.updDt = updDt;
		this.dtchCnmvIdNo = dtchCnmvIdNo;
		this.atchInpTpCd = atchInpTpCd;
		this.creDt = creDt;
		this.eqKndCd = eqKndCd;
		this.dtchDt = dtchDt;
		this.creUsrId = creUsrId;
		this.dtchCnmvYr = dtchCnmvYr;
		this.cntrNo = cntrNo;
		this.eqNo = eqNo;
		this.atchCnmvYr = atchCnmvYr;
		this.pagerows = pagerows;
		this.atchDtchSeq = atchDtchSeq;
		this.dtchYdCd = dtchYdCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("dtch_inp_tp_cd", getDtchInpTpCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("atch_dt", getAtchDt());
		this.hashColumns.put("atch_cnmv_id_no", getAtchCnmvIdNo());
		this.hashColumns.put("chss_no", getChssNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("atch_yd_cd", getAtchYdCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("dtch_cnmv_id_no", getDtchCnmvIdNo());
		this.hashColumns.put("atch_inp_tp_cd", getAtchInpTpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eq_knd_cd", getEqKndCd());
		this.hashColumns.put("dtch_dt", getDtchDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("dtch_cnmv_yr", getDtchCnmvYr());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("eq_no", getEqNo());
		this.hashColumns.put("atch_cnmv_yr", getAtchCnmvYr());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("atch_dtch_seq", getAtchDtchSeq());
		this.hashColumns.put("dtch_yd_cd", getDtchYdCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("dtch_inp_tp_cd", "dtchInpTpCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("atch_dt", "atchDt");
		this.hashFields.put("atch_cnmv_id_no", "atchCnmvIdNo");
		this.hashFields.put("chss_no", "chssNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("atch_yd_cd", "atchYdCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("dtch_cnmv_id_no", "dtchCnmvIdNo");
		this.hashFields.put("atch_inp_tp_cd", "atchInpTpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eq_knd_cd", "eqKndCd");
		this.hashFields.put("dtch_dt", "dtchDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("dtch_cnmv_yr", "dtchCnmvYr");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("eq_no", "eqNo");
		this.hashFields.put("atch_cnmv_yr", "atchCnmvYr");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("atch_dtch_seq", "atchDtchSeq");
		this.hashFields.put("dtch_yd_cd", "dtchYdCd");
		return this.hashFields;
	}
	
	public String getDtchInpTpCd() {
		return this.dtchInpTpCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getAtchDt() {
		return this.atchDt;
	}
	public String getAtchCnmvIdNo() {
		return this.atchCnmvIdNo;
	}
	public String getChssNo() {
		return this.chssNo;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getAtchYdCd() {
		return this.atchYdCd;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getDtchCnmvIdNo() {
		return this.dtchCnmvIdNo;
	}
	public String getAtchInpTpCd() {
		return this.atchInpTpCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getEqKndCd() {
		return this.eqKndCd;
	}
	public String getDtchDt() {
		return this.dtchDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getDtchCnmvYr() {
		return this.dtchCnmvYr;
	}
	public String getCntrNo() {
		return this.cntrNo;
	}
	public String getEqNo() {
		return this.eqNo;
	}
	public String getAtchCnmvYr() {
		return this.atchCnmvYr;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getAtchDtchSeq() {
		return this.atchDtchSeq;
	}
	public String getDtchYdCd() {
		return this.dtchYdCd;
	}

	public void setDtchInpTpCd(String dtchInpTpCd) {
		this.dtchInpTpCd = dtchInpTpCd;
		//this.dtchInpTpCd=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setAtchDt(String atchDt) {
		this.atchDt = atchDt;
		//this.atchDt=true;
	}
	public void setAtchCnmvIdNo(String atchCnmvIdNo) {
		this.atchCnmvIdNo = atchCnmvIdNo;
		//this.atchCnmvIdNo=true;
	}
	public void setChssNo(String chssNo) {
		this.chssNo = chssNo;
		//this.chssNo=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setAtchYdCd(String atchYdCd) {
		this.atchYdCd = atchYdCd;
		//this.atchYdCd=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setDtchCnmvIdNo(String dtchCnmvIdNo) {
		this.dtchCnmvIdNo = dtchCnmvIdNo;
		//this.dtchCnmvIdNo=true;
	}
	public void setAtchInpTpCd(String atchInpTpCd) {
		this.atchInpTpCd = atchInpTpCd;
		//this.atchInpTpCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setEqKndCd(String eqKndCd) {
		this.eqKndCd = eqKndCd;
		//this.eqKndCd=true;
	}
	public void setDtchDt(String dtchDt) {
		this.dtchDt = dtchDt;
		//this.dtchDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setDtchCnmvYr(String dtchCnmvYr) {
		this.dtchCnmvYr = dtchCnmvYr;
		//this.dtchCnmvYr=true;
	}
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
		//this.cntrNo=true;
	}
	public void setEqNo(String eqNo) {
		this.eqNo = eqNo;
		//this.eqNo=true;
	}
	public void setAtchCnmvYr(String atchCnmvYr) {
		this.atchCnmvYr = atchCnmvYr;
		//this.atchCnmvYr=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setAtchDtchSeq(String atchDtchSeq) {
		this.atchDtchSeq = atchDtchSeq;
		//this.atchDtchSeq=true;
	}
	public void setDtchYdCd(String dtchYdCd) {
		this.dtchYdCd = dtchYdCd;
		//this.dtchYdCd=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setDtchInpTpCd(JSPUtil.getParameter(request, "dtch_inp_tp_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAtchDt(JSPUtil.getParameter(request, "atch_dt", ""));
		setAtchCnmvIdNo(JSPUtil.getParameter(request, "atch_cnmv_id_no", ""));
		setChssNo(JSPUtil.getParameter(request, "chss_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setAtchYdCd(JSPUtil.getParameter(request, "atch_yd_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setDtchCnmvIdNo(JSPUtil.getParameter(request, "dtch_cnmv_id_no", ""));
		setAtchInpTpCd(JSPUtil.getParameter(request, "atch_inp_tp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEqKndCd(JSPUtil.getParameter(request, "eq_knd_cd", ""));
		setDtchDt(JSPUtil.getParameter(request, "dtch_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setDtchCnmvYr(JSPUtil.getParameter(request, "dtch_cnmv_yr", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setEqNo(JSPUtil.getParameter(request, "eq_no", ""));
		setAtchCnmvYr(JSPUtil.getParameter(request, "atch_cnmv_yr", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setAtchDtchSeq(JSPUtil.getParameter(request, "atch_dtch_seq", ""));
		setDtchYdCd(JSPUtil.getParameter(request, "dtch_yd_cd", ""));
	}

	public CgmEqAtchDtchHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmEqAtchDtchHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmEqAtchDtchHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] dtchInpTpCd = (JSPUtil.getParameter(request, prefix	+ "dtch_inp_tp_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] atchDt = (JSPUtil.getParameter(request, prefix	+ "atch_dt".trim(), length));
			String[] atchCnmvIdNo = (JSPUtil.getParameter(request, prefix	+ "atch_cnmv_id_no".trim(), length));
			String[] chssNo = (JSPUtil.getParameter(request, prefix	+ "chss_no".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] atchYdCd = (JSPUtil.getParameter(request, prefix	+ "atch_yd_cd".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] dtchCnmvIdNo = (JSPUtil.getParameter(request, prefix	+ "dtch_cnmv_id_no".trim(), length));
			String[] atchInpTpCd = (JSPUtil.getParameter(request, prefix	+ "atch_inp_tp_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] eqKndCd = (JSPUtil.getParameter(request, prefix	+ "eq_knd_cd".trim(), length));
			String[] dtchDt = (JSPUtil.getParameter(request, prefix	+ "dtch_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] dtchCnmvYr = (JSPUtil.getParameter(request, prefix	+ "dtch_cnmv_yr".trim(), length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no".trim(), length));
			String[] eqNo = (JSPUtil.getParameter(request, prefix	+ "eq_no".trim(), length));
			String[] atchCnmvYr = (JSPUtil.getParameter(request, prefix	+ "atch_cnmv_yr".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] atchDtchSeq = (JSPUtil.getParameter(request, prefix	+ "atch_dtch_seq".trim(), length));
			String[] dtchYdCd = (JSPUtil.getParameter(request, prefix	+ "dtch_yd_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmEqAtchDtchHisVO();
				if (dtchInpTpCd[i] != null)
					model.setDtchInpTpCd(dtchInpTpCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (atchDt[i] != null)
					model.setAtchDt(atchDt[i]);
				if (atchCnmvIdNo[i] != null)
					model.setAtchCnmvIdNo(atchCnmvIdNo[i]);
				if (chssNo[i] != null)
					model.setChssNo(chssNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (atchYdCd[i] != null)
					model.setAtchYdCd(atchYdCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (dtchCnmvIdNo[i] != null)
					model.setDtchCnmvIdNo(dtchCnmvIdNo[i]);
				if (atchInpTpCd[i] != null)
					model.setAtchInpTpCd(atchInpTpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (eqKndCd[i] != null)
					model.setEqKndCd(eqKndCd[i]);
				if (dtchDt[i] != null)
					model.setDtchDt(dtchDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (dtchCnmvYr[i] != null)
					model.setDtchCnmvYr(dtchCnmvYr[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (eqNo[i] != null)
					model.setEqNo(eqNo[i]);
				if (atchCnmvYr[i] != null)
					model.setAtchCnmvYr(atchCnmvYr[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (atchDtchSeq[i] != null)
					model.setAtchDtchSeq(atchDtchSeq[i]);
				if (dtchYdCd[i] != null)
					model.setDtchYdCd(dtchYdCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmEqAtchDtchHisVOs();
	}

	public CgmEqAtchDtchHisVO[] getCgmEqAtchDtchHisVOs(){
		CgmEqAtchDtchHisVO[] vos = (CgmEqAtchDtchHisVO[])models.toArray(new CgmEqAtchDtchHisVO[models.size()]);
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
		this.dtchInpTpCd = this.dtchInpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.atchDt = this.atchDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.atchCnmvIdNo = this.atchCnmvIdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssNo = this.chssNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.atchYdCd = this.atchYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtchCnmvIdNo = this.dtchCnmvIdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.atchInpTpCd = this.atchInpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqKndCd = this.eqKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtchDt = this.dtchDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtchCnmvYr = this.dtchCnmvYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqNo = this.eqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.atchCnmvYr = this.atchCnmvYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.atchDtchSeq = this.atchDtchSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtchYdCd = this.dtchYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
