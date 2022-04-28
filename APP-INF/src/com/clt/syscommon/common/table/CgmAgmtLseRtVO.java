/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmAgmtLseRtVO.java
*@FileTitle : CgmAgmtLseRtVO
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

public class CgmAgmtLseRtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmAgmtLseRtVO> models = new ArrayList<CgmAgmtLseRtVO>();
	
	/* Column Info */
	private String eqTpszCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String onhInitValAmt = null;
	/* Column Info */
	private String agmtSeq = null;
	/* Column Info */
	private String chssLseRtAmt = null;
	/* Column Info */
	private String mgstLseFxRtAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String agmtVerNo = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String mgstPrtcScgRtAmt = null;
	/* Column Info */
	private String mgstBldpRtAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String eqKndCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String agmtOfcCtyCd = null;
	/* Column Info */
	private String mgstPotcScgRtAmt = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmAgmtLseRtVO() {}

	public CgmAgmtLseRtVO(String ibflag, String pagerows, String agmtOfcCtyCd, String agmtSeq, String agmtVerNo, String eqTpszCd, String eqKndCd, String onhInitValAmt, String chssLseRtAmt, String mgstLseFxRtAmt, String mgstBldpRtAmt, String mgstPotcScgRtAmt, String mgstPrtcScgRtAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.eqTpszCd = eqTpszCd;
		this.ibflag = ibflag;
		this.onhInitValAmt = onhInitValAmt;
		this.agmtSeq = agmtSeq;
		this.chssLseRtAmt = chssLseRtAmt;
		this.mgstLseFxRtAmt = mgstLseFxRtAmt;
		this.updUsrId = updUsrId;
		this.agmtVerNo = agmtVerNo;
		this.updDt = updDt;
		this.mgstPrtcScgRtAmt = mgstPrtcScgRtAmt;
		this.mgstBldpRtAmt = mgstBldpRtAmt;
		this.creDt = creDt;
		this.eqKndCd = eqKndCd;
		this.creUsrId = creUsrId;
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		this.mgstPotcScgRtAmt = mgstPotcScgRtAmt;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("eq_tpsz_cd", getEqTpszCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("onh_init_val_amt", getOnhInitValAmt());
		this.hashColumns.put("agmt_seq", getAgmtSeq());
		this.hashColumns.put("chss_lse_rt_amt", getChssLseRtAmt());
		this.hashColumns.put("mgst_lse_fx_rt_amt", getMgstLseFxRtAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("agmt_ver_no", getAgmtVerNo());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("mgst_prtc_scg_rt_amt", getMgstPrtcScgRtAmt());
		this.hashColumns.put("mgst_bldp_rt_amt", getMgstBldpRtAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eq_knd_cd", getEqKndCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("agmt_ofc_cty_cd", getAgmtOfcCtyCd());
		this.hashColumns.put("mgst_potc_scg_rt_amt", getMgstPotcScgRtAmt());
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
		this.hashFields.put("onh_init_val_amt", "onhInitValAmt");
		this.hashFields.put("agmt_seq", "agmtSeq");
		this.hashFields.put("chss_lse_rt_amt", "chssLseRtAmt");
		this.hashFields.put("mgst_lse_fx_rt_amt", "mgstLseFxRtAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("agmt_ver_no", "agmtVerNo");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("mgst_prtc_scg_rt_amt", "mgstPrtcScgRtAmt");
		this.hashFields.put("mgst_bldp_rt_amt", "mgstBldpRtAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eq_knd_cd", "eqKndCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("agmt_ofc_cty_cd", "agmtOfcCtyCd");
		this.hashFields.put("mgst_potc_scg_rt_amt", "mgstPotcScgRtAmt");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getEqTpszCd() {
		return this.eqTpszCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getOnhInitValAmt() {
		return this.onhInitValAmt;
	}
	public String getAgmtSeq() {
		return this.agmtSeq;
	}
	public String getChssLseRtAmt() {
		return this.chssLseRtAmt;
	}
	public String getMgstLseFxRtAmt() {
		return this.mgstLseFxRtAmt;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getAgmtVerNo() {
		return this.agmtVerNo;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getMgstPrtcScgRtAmt() {
		return this.mgstPrtcScgRtAmt;
	}
	public String getMgstBldpRtAmt() {
		return this.mgstBldpRtAmt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getEqKndCd() {
		return this.eqKndCd;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getAgmtOfcCtyCd() {
		return this.agmtOfcCtyCd;
	}
	public String getMgstPotcScgRtAmt() {
		return this.mgstPotcScgRtAmt;
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
	public void setOnhInitValAmt(String onhInitValAmt) {
		this.onhInitValAmt = onhInitValAmt;
		//this.onhInitValAmt=true;
	}
	public void setAgmtSeq(String agmtSeq) {
		this.agmtSeq = agmtSeq;
		//this.agmtSeq=true;
	}
	public void setChssLseRtAmt(String chssLseRtAmt) {
		this.chssLseRtAmt = chssLseRtAmt;
		//this.chssLseRtAmt=true;
	}
	public void setMgstLseFxRtAmt(String mgstLseFxRtAmt) {
		this.mgstLseFxRtAmt = mgstLseFxRtAmt;
		//this.mgstLseFxRtAmt=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setAgmtVerNo(String agmtVerNo) {
		this.agmtVerNo = agmtVerNo;
		//this.agmtVerNo=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setMgstPrtcScgRtAmt(String mgstPrtcScgRtAmt) {
		this.mgstPrtcScgRtAmt = mgstPrtcScgRtAmt;
		//this.mgstPrtcScgRtAmt=true;
	}
	public void setMgstBldpRtAmt(String mgstBldpRtAmt) {
		this.mgstBldpRtAmt = mgstBldpRtAmt;
		//this.mgstBldpRtAmt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setEqKndCd(String eqKndCd) {
		this.eqKndCd = eqKndCd;
		//this.eqKndCd=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setAgmtOfcCtyCd(String agmtOfcCtyCd) {
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		//this.agmtOfcCtyCd=true;
	}
	public void setMgstPotcScgRtAmt(String mgstPotcScgRtAmt) {
		this.mgstPotcScgRtAmt = mgstPotcScgRtAmt;
		//this.mgstPotcScgRtAmt=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setEqTpszCd(JSPUtil.getParameter(request, "eq_tpsz_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setOnhInitValAmt(JSPUtil.getParameter(request, "onh_init_val_amt", ""));
		setAgmtSeq(JSPUtil.getParameter(request, "agmt_seq", ""));
		setChssLseRtAmt(JSPUtil.getParameter(request, "chss_lse_rt_amt", ""));
		setMgstLseFxRtAmt(JSPUtil.getParameter(request, "mgst_lse_fx_rt_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setAgmtVerNo(JSPUtil.getParameter(request, "agmt_ver_no", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setMgstPrtcScgRtAmt(JSPUtil.getParameter(request, "mgst_prtc_scg_rt_amt", ""));
		setMgstBldpRtAmt(JSPUtil.getParameter(request, "mgst_bldp_rt_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEqKndCd(JSPUtil.getParameter(request, "eq_knd_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setAgmtOfcCtyCd(JSPUtil.getParameter(request, "agmt_ofc_cty_cd", ""));
		setMgstPotcScgRtAmt(JSPUtil.getParameter(request, "mgst_potc_scg_rt_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public CgmAgmtLseRtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmAgmtLseRtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmAgmtLseRtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] eqTpszCd = (JSPUtil.getParameter(request, prefix	+ "eq_tpsz_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] onhInitValAmt = (JSPUtil.getParameter(request, prefix	+ "onh_init_val_amt".trim(), length));
			String[] agmtSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_seq".trim(), length));
			String[] chssLseRtAmt = (JSPUtil.getParameter(request, prefix	+ "chss_lse_rt_amt".trim(), length));
			String[] mgstLseFxRtAmt = (JSPUtil.getParameter(request, prefix	+ "mgst_lse_fx_rt_amt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] agmtVerNo = (JSPUtil.getParameter(request, prefix	+ "agmt_ver_no".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] mgstPrtcScgRtAmt = (JSPUtil.getParameter(request, prefix	+ "mgst_prtc_scg_rt_amt".trim(), length));
			String[] mgstBldpRtAmt = (JSPUtil.getParameter(request, prefix	+ "mgst_bldp_rt_amt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] eqKndCd = (JSPUtil.getParameter(request, prefix	+ "eq_knd_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] agmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_ofc_cty_cd".trim(), length));
			String[] mgstPotcScgRtAmt = (JSPUtil.getParameter(request, prefix	+ "mgst_potc_scg_rt_amt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmAgmtLseRtVO();
				if (eqTpszCd[i] != null)
					model.setEqTpszCd(eqTpszCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (onhInitValAmt[i] != null)
					model.setOnhInitValAmt(onhInitValAmt[i]);
				if (agmtSeq[i] != null)
					model.setAgmtSeq(agmtSeq[i]);
				if (chssLseRtAmt[i] != null)
					model.setChssLseRtAmt(chssLseRtAmt[i]);
				if (mgstLseFxRtAmt[i] != null)
					model.setMgstLseFxRtAmt(mgstLseFxRtAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (agmtVerNo[i] != null)
					model.setAgmtVerNo(agmtVerNo[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (mgstPrtcScgRtAmt[i] != null)
					model.setMgstPrtcScgRtAmt(mgstPrtcScgRtAmt[i]);
				if (mgstBldpRtAmt[i] != null)
					model.setMgstBldpRtAmt(mgstBldpRtAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (eqKndCd[i] != null)
					model.setEqKndCd(eqKndCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (agmtOfcCtyCd[i] != null)
					model.setAgmtOfcCtyCd(agmtOfcCtyCd[i]);
				if (mgstPotcScgRtAmt[i] != null)
					model.setMgstPotcScgRtAmt(mgstPotcScgRtAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmAgmtLseRtVOs();
	}

	public CgmAgmtLseRtVO[] getCgmAgmtLseRtVOs(){
		CgmAgmtLseRtVO[] vos = (CgmAgmtLseRtVO[])models.toArray(new CgmAgmtLseRtVO[models.size()]);
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
		this.onhInitValAmt = this.onhInitValAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSeq = this.agmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssLseRtAmt = this.chssLseRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mgstLseFxRtAmt = this.mgstLseFxRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtVerNo = this.agmtVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mgstPrtcScgRtAmt = this.mgstPrtcScgRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mgstBldpRtAmt = this.mgstBldpRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqKndCd = this.eqKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOfcCtyCd = this.agmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mgstPotcScgRtAmt = this.mgstPotcScgRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
