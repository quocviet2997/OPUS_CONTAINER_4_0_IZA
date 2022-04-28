/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmAgmtLseTrRtVO.java
*@FileTitle : CgmAgmtLseTrRtVO
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

public class CgmAgmtLseTrRtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmAgmtLseTrRtVO> models = new ArrayList<CgmAgmtLseTrRtVO>();
	
	/* Column Info */
	private String eqTpszCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String agmtSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String agmtVerNo = null;
	/* Column Info */
	private String rntlToTrVal = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String eqKndCd = null;
	/* Column Info */
	private String trRtAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String rntlFmTrVal = null;
	/* Column Info */
	private String agmtOfcCtyCd = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmAgmtLseTrRtVO() {}

	public CgmAgmtLseTrRtVO(String ibflag, String pagerows, String agmtOfcCtyCd, String agmtSeq, String agmtVerNo, String rntlFmTrVal, String rntlToTrVal, String eqTpszCd, String eqKndCd, String trRtAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.eqTpszCd = eqTpszCd;
		this.ibflag = ibflag;
		this.agmtSeq = agmtSeq;
		this.updUsrId = updUsrId;
		this.agmtVerNo = agmtVerNo;
		this.rntlToTrVal = rntlToTrVal;
		this.updDt = updDt;
		this.creDt = creDt;
		this.eqKndCd = eqKndCd;
		this.trRtAmt = trRtAmt;
		this.creUsrId = creUsrId;
		this.rntlFmTrVal = rntlFmTrVal;
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("eq_tpsz_cd", getEqTpszCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("agmt_seq", getAgmtSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("agmt_ver_no", getAgmtVerNo());
		this.hashColumns.put("rntl_to_tr_val", getRntlToTrVal());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eq_knd_cd", getEqKndCd());
		this.hashColumns.put("tr_rt_amt", getTrRtAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("rntl_fm_tr_val", getRntlFmTrVal());
		this.hashColumns.put("agmt_ofc_cty_cd", getAgmtOfcCtyCd());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("eq_tpsz_cd", "eqTpszCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("agmt_seq", "agmtSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("agmt_ver_no", "agmtVerNo");
		this.hashFields.put("rntl_to_tr_val", "rntlToTrVal");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eq_knd_cd", "eqKndCd");
		this.hashFields.put("tr_rt_amt", "trRtAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("rntl_fm_tr_val", "rntlFmTrVal");
		this.hashFields.put("agmt_ofc_cty_cd", "agmtOfcCtyCd");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getEqTpszCd() {
		return this.eqTpszCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getAgmtSeq() {
		return this.agmtSeq;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getAgmtVerNo() {
		return this.agmtVerNo;
	}
	public String getRntlToTrVal() {
		return this.rntlToTrVal;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getEqKndCd() {
		return this.eqKndCd;
	}
	public String getTrRtAmt() {
		return this.trRtAmt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getRntlFmTrVal() {
		return this.rntlFmTrVal;
	}
	public String getAgmtOfcCtyCd() {
		return this.agmtOfcCtyCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setEqTpszCd(String eqTpszCd) {
		this.eqTpszCd = eqTpszCd;
		//this.eqTpszCd=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setAgmtSeq(String agmtSeq) {
		this.agmtSeq = agmtSeq;
		//this.agmtSeq=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setAgmtVerNo(String agmtVerNo) {
		this.agmtVerNo = agmtVerNo;
		//this.agmtVerNo=true;
	}
	public void setRntlToTrVal(String rntlToTrVal) {
		this.rntlToTrVal = rntlToTrVal;
		//this.rntlToTrVal=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setEqKndCd(String eqKndCd) {
		this.eqKndCd = eqKndCd;
		//this.eqKndCd=true;
	}
	public void setTrRtAmt(String trRtAmt) {
		this.trRtAmt = trRtAmt;
		//this.trRtAmt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setRntlFmTrVal(String rntlFmTrVal) {
		this.rntlFmTrVal = rntlFmTrVal;
		//this.rntlFmTrVal=true;
	}
	public void setAgmtOfcCtyCd(String agmtOfcCtyCd) {
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		//this.agmtOfcCtyCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setEqTpszCd(JSPUtil.getParameter(request, "eq_tpsz_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAgmtSeq(JSPUtil.getParameter(request, "agmt_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setAgmtVerNo(JSPUtil.getParameter(request, "agmt_ver_no", ""));
		setRntlToTrVal(JSPUtil.getParameter(request, "rntl_to_tr_val", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEqKndCd(JSPUtil.getParameter(request, "eq_knd_cd", ""));
		setTrRtAmt(JSPUtil.getParameter(request, "tr_rt_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRntlFmTrVal(JSPUtil.getParameter(request, "rntl_fm_tr_val", ""));
		setAgmtOfcCtyCd(JSPUtil.getParameter(request, "agmt_ofc_cty_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public CgmAgmtLseTrRtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmAgmtLseTrRtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmAgmtLseTrRtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] eqTpszCd = (JSPUtil.getParameter(request, prefix	+ "eq_tpsz_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] agmtSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_seq".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] agmtVerNo = (JSPUtil.getParameter(request, prefix	+ "agmt_ver_no".trim(), length));
			String[] rntlToTrVal = (JSPUtil.getParameter(request, prefix	+ "rntl_to_tr_val".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] eqKndCd = (JSPUtil.getParameter(request, prefix	+ "eq_knd_cd".trim(), length));
			String[] trRtAmt = (JSPUtil.getParameter(request, prefix	+ "tr_rt_amt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] rntlFmTrVal = (JSPUtil.getParameter(request, prefix	+ "rntl_fm_tr_val".trim(), length));
			String[] agmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_ofc_cty_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmAgmtLseTrRtVO();
				if (eqTpszCd[i] != null)
					model.setEqTpszCd(eqTpszCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (agmtSeq[i] != null)
					model.setAgmtSeq(agmtSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (agmtVerNo[i] != null)
					model.setAgmtVerNo(agmtVerNo[i]);
				if (rntlToTrVal[i] != null)
					model.setRntlToTrVal(rntlToTrVal[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (eqKndCd[i] != null)
					model.setEqKndCd(eqKndCd[i]);
				if (trRtAmt[i] != null)
					model.setTrRtAmt(trRtAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (rntlFmTrVal[i] != null)
					model.setRntlFmTrVal(rntlFmTrVal[i]);
				if (agmtOfcCtyCd[i] != null)
					model.setAgmtOfcCtyCd(agmtOfcCtyCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmAgmtLseTrRtVOs();
	}

	public CgmAgmtLseTrRtVO[] getCgmAgmtLseTrRtVOs(){
		CgmAgmtLseTrRtVO[] vos = (CgmAgmtLseTrRtVO[])models.toArray(new CgmAgmtLseTrRtVO[models.size()]);
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
		this.eqTpszCd = this.eqTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSeq = this.agmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtVerNo = this.agmtVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rntlToTrVal = this.rntlToTrVal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqKndCd = this.eqKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trRtAmt = this.trRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rntlFmTrVal = this.rntlFmTrVal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOfcCtyCd = this.agmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
