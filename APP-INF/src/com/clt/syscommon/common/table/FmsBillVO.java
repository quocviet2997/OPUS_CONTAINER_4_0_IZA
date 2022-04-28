/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FmsBillVO.java
*@FileTitle : FmsBillVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.10
*@LastModifier : 안성인
*@LastVersion : 1.0
* 2009.02.10 안성인 
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
 * @author 안성인
 * @since J2EE 1.5
 */

public class FmsBillVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<FmsBillVO> models = new ArrayList<FmsBillVO>();
	
	/* Column Inpo */
	private String bilPlCd = null;
	/* Column Inpo */
	private String splAddr = null;
	/* Column Inpo */
	private String splRgstNo = null;
	/* Column Inpo */
	private String bilInvYrmon = null;
	/* Column Inpo */
	private String slpFuncCd = null;
	/* Column Inpo */
	private String ofcCd = null;
	/* Column Inpo */
	private String bztpNm = null;
	/* Column Inpo */
	private String updUsrId = null;
	/* Column Inpo */
	private String blnkKnt = null;
	/* Column Inpo */
	private String updDt = null;
	/* Column Inpo */
	private String coNm = null;
	/* Column Inpo */
	private String slpTeamCd = null;
	/* Column Inpo */
	private String currCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String vndrSeq = null;
	/* Column Inpo */
	private String bilSerNo = null;
	/* Column Inpo */
	private String slpTpCd = null;
	/* Column Inpo */
	private String slpIssDt = null;
	/* Column Inpo */
	private String ownrNm = null;
	/* Column Inpo */
	private String issDt = null;
	/* Column Inpo */
	private String creDt = null;
	/* Column Inpo */
	private String bzctNm = null;
	/* Column Inpo */
	private String creUsrId = null;
	/* Column Inpo */
	private String splAmt = null;
	/* Column Inpo */
	private String slpSerNo = null;
	/* Column Inpo */
	private String bilDivCd = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public FmsBillVO() {}

	public FmsBillVO(String ibflag, String pagerows, String bilInvYrmon, String ofcCd, String bilSerNo, String bilDivCd, String bilPlCd, String splAmt, String currCd, String vndrSeq, String splRgstNo, String ownrNm, String coNm, String splAddr, String bzctNm, String bztpNm, String blnkKnt, String issDt, String slpTpCd, String slpFuncCd, String slpTeamCd, String slpIssDt, String slpSerNo, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.bilPlCd = bilPlCd;
		this.splAddr = splAddr;
		this.splRgstNo = splRgstNo;
		this.bilInvYrmon = bilInvYrmon;
		this.slpFuncCd = slpFuncCd;
		this.ofcCd = ofcCd;
		this.bztpNm = bztpNm;
		this.updUsrId = updUsrId;
		this.blnkKnt = blnkKnt;
		this.updDt = updDt;
		this.coNm = coNm;
		this.slpTeamCd = slpTeamCd;
		this.currCd = currCd;
		this.ibflag = ibflag;
		this.vndrSeq = vndrSeq;
		this.bilSerNo = bilSerNo;
		this.slpTpCd = slpTpCd;
		this.slpIssDt = slpIssDt;
		this.ownrNm = ownrNm;
		this.issDt = issDt;
		this.creDt = creDt;
		this.bzctNm = bzctNm;
		this.creUsrId = creUsrId;
		this.splAmt = splAmt;
		this.slpSerNo = slpSerNo;
		this.bilDivCd = bilDivCd;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("bil_pl_cd", getBilPlCd());
		this.hashColumns.put("spl_addr", getSplAddr());
		this.hashColumns.put("spl_rgst_no", getSplRgstNo());
		this.hashColumns.put("bil_inv_yrmon", getBilInvYrmon());
		this.hashColumns.put("slp_func_cd", getSlpFuncCd());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("bztp_nm", getBztpNm());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("blnk_knt", getBlnkKnt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("co_nm", getCoNm());
		this.hashColumns.put("slp_team_cd", getSlpTeamCd());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("bil_ser_no", getBilSerNo());
		this.hashColumns.put("slp_tp_cd", getSlpTpCd());
		this.hashColumns.put("slp_iss_dt", getSlpIssDt());
		this.hashColumns.put("ownr_nm", getOwnrNm());
		this.hashColumns.put("iss_dt", getIssDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bzct_nm", getBzctNm());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("spl_amt", getSplAmt());
		this.hashColumns.put("slp_ser_no", getSlpSerNo());
		this.hashColumns.put("bil_div_cd", getBilDivCd());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("bil_pl_cd", "bilPlCd");
		this.hashFields.put("spl_addr", "splAddr");
		this.hashFields.put("spl_rgst_no", "splRgstNo");
		this.hashFields.put("bil_inv_yrmon", "bilInvYrmon");
		this.hashFields.put("slp_func_cd", "slpFuncCd");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("bztp_nm", "bztpNm");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("blnk_knt", "blnkKnt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("co_nm", "coNm");
		this.hashFields.put("slp_team_cd", "slpTeamCd");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("bil_ser_no", "bilSerNo");
		this.hashFields.put("slp_tp_cd", "slpTpCd");
		this.hashFields.put("slp_iss_dt", "slpIssDt");
		this.hashFields.put("ownr_nm", "ownrNm");
		this.hashFields.put("iss_dt", "issDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bzct_nm", "bzctNm");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("spl_amt", "splAmt");
		this.hashFields.put("slp_ser_no", "slpSerNo");
		this.hashFields.put("bil_div_cd", "bilDivCd");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getBilPlCd() {
		return this.bilPlCd;
	}
	public String getSplAddr() {
		return this.splAddr;
	}
	public String getSplRgstNo() {
		return this.splRgstNo;
	}
	public String getBilInvYrmon() {
		return this.bilInvYrmon;
	}
	public String getSlpFuncCd() {
		return this.slpFuncCd;
	}
	public String getOfcCd() {
		return this.ofcCd;
	}
	public String getBztpNm() {
		return this.bztpNm;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getBlnkKnt() {
		return this.blnkKnt;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCoNm() {
		return this.coNm;
	}
	public String getSlpTeamCd() {
		return this.slpTeamCd;
	}
	public String getCurrCd() {
		return this.currCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	public String getBilSerNo() {
		return this.bilSerNo;
	}
	public String getSlpTpCd() {
		return this.slpTpCd;
	}
	public String getSlpIssDt() {
		return this.slpIssDt;
	}
	public String getOwnrNm() {
		return this.ownrNm;
	}
	public String getIssDt() {
		return this.issDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getBzctNm() {
		return this.bzctNm;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getSplAmt() {
		return this.splAmt;
	}
	public String getSlpSerNo() {
		return this.slpSerNo;
	}
	public String getBilDivCd() {
		return this.bilDivCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setBilPlCd(String bilPlCd) {
		this.bilPlCd = bilPlCd;
		//this.bilPlCd=true;
	}
	public void setSplAddr(String splAddr) {
		this.splAddr = splAddr;
		//this.splAddr=true;
	}
	public void setSplRgstNo(String splRgstNo) {
		this.splRgstNo = splRgstNo;
		//this.splRgstNo=true;
	}
	public void setBilInvYrmon(String bilInvYrmon) {
		this.bilInvYrmon = bilInvYrmon;
		//this.bilInvYrmon=true;
	}
	public void setSlpFuncCd(String slpFuncCd) {
		this.slpFuncCd = slpFuncCd;
		//this.slpFuncCd=true;
	}
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
		//this.ofcCd=true;
	}
	public void setBztpNm(String bztpNm) {
		this.bztpNm = bztpNm;
		//this.bztpNm=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setBlnkKnt(String blnkKnt) {
		this.blnkKnt = blnkKnt;
		//this.blnkKnt=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCoNm(String coNm) {
		this.coNm = coNm;
		//this.coNm=true;
	}
	public void setSlpTeamCd(String slpTeamCd) {
		this.slpTeamCd = slpTeamCd;
		//this.slpTeamCd=true;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
		//this.currCd=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
		//this.vndrSeq=true;
	}
	public void setBilSerNo(String bilSerNo) {
		this.bilSerNo = bilSerNo;
		//this.bilSerNo=true;
	}
	public void setSlpTpCd(String slpTpCd) {
		this.slpTpCd = slpTpCd;
		//this.slpTpCd=true;
	}
	public void setSlpIssDt(String slpIssDt) {
		this.slpIssDt = slpIssDt;
		//this.slpIssDt=true;
	}
	public void setOwnrNm(String ownrNm) {
		this.ownrNm = ownrNm;
		//this.ownrNm=true;
	}
	public void setIssDt(String issDt) {
		this.issDt = issDt;
		//this.issDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setBzctNm(String bzctNm) {
		this.bzctNm = bzctNm;
		//this.bzctNm=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setSplAmt(String splAmt) {
		this.splAmt = splAmt;
		//this.splAmt=true;
	}
	public void setSlpSerNo(String slpSerNo) {
		this.slpSerNo = slpSerNo;
		//this.slpSerNo=true;
	}
	public void setBilDivCd(String bilDivCd) {
		this.bilDivCd = bilDivCd;
		//this.bilDivCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setBilPlCd(JSPUtil.getParameter(request, "bil_pl_cd", ""));
		setSplAddr(JSPUtil.getParameter(request, "spl_addr", ""));
		setSplRgstNo(JSPUtil.getParameter(request, "spl_rgst_no", ""));
		setBilInvYrmon(JSPUtil.getParameter(request, "bil_inv_yrmon", ""));
		setSlpFuncCd(JSPUtil.getParameter(request, "slp_func_cd", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setBztpNm(JSPUtil.getParameter(request, "bztp_nm", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setBlnkKnt(JSPUtil.getParameter(request, "blnk_knt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCoNm(JSPUtil.getParameter(request, "co_nm", ""));
		setSlpTeamCd(JSPUtil.getParameter(request, "slp_team_cd", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setBilSerNo(JSPUtil.getParameter(request, "bil_ser_no", ""));
		setSlpTpCd(JSPUtil.getParameter(request, "slp_tp_cd", ""));
		setSlpIssDt(JSPUtil.getParameter(request, "slp_iss_dt", ""));
		setOwnrNm(JSPUtil.getParameter(request, "ownr_nm", ""));
		setIssDt(JSPUtil.getParameter(request, "iss_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setBzctNm(JSPUtil.getParameter(request, "bzct_nm", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSplAmt(JSPUtil.getParameter(request, "spl_amt", ""));
		setSlpSerNo(JSPUtil.getParameter(request, "slp_ser_no", ""));
		setBilDivCd(JSPUtil.getParameter(request, "bil_div_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public FmsBillVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public FmsBillVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		FmsBillVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] bilPlCd = (JSPUtil.getParameter(request, prefix	+ "bil_pl_cd".trim(), length));
			String[] splAddr = (JSPUtil.getParameter(request, prefix	+ "spl_addr".trim(), length));
			String[] splRgstNo = (JSPUtil.getParameter(request, prefix	+ "spl_rgst_no".trim(), length));
			String[] bilInvYrmon = (JSPUtil.getParameter(request, prefix	+ "bil_inv_yrmon".trim(), length));
			String[] slpFuncCd = (JSPUtil.getParameter(request, prefix	+ "slp_func_cd".trim(), length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd".trim(), length));
			String[] bztpNm = (JSPUtil.getParameter(request, prefix	+ "bztp_nm".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] blnkKnt = (JSPUtil.getParameter(request, prefix	+ "blnk_knt".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] coNm = (JSPUtil.getParameter(request, prefix	+ "co_nm".trim(), length));
			String[] slpTeamCd = (JSPUtil.getParameter(request, prefix	+ "slp_team_cd".trim(), length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq".trim(), length));
			String[] bilSerNo = (JSPUtil.getParameter(request, prefix	+ "bil_ser_no".trim(), length));
			String[] slpTpCd = (JSPUtil.getParameter(request, prefix	+ "slp_tp_cd".trim(), length));
			String[] slpIssDt = (JSPUtil.getParameter(request, prefix	+ "slp_iss_dt".trim(), length));
			String[] ownrNm = (JSPUtil.getParameter(request, prefix	+ "ownr_nm".trim(), length));
			String[] issDt = (JSPUtil.getParameter(request, prefix	+ "iss_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] bzctNm = (JSPUtil.getParameter(request, prefix	+ "bzct_nm".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] splAmt = (JSPUtil.getParameter(request, prefix	+ "spl_amt".trim(), length));
			String[] slpSerNo = (JSPUtil.getParameter(request, prefix	+ "slp_ser_no".trim(), length));
			String[] bilDivCd = (JSPUtil.getParameter(request, prefix	+ "bil_div_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new FmsBillVO();
				if (bilPlCd[i] != null)
					model.setBilPlCd(bilPlCd[i]);
				if (splAddr[i] != null)
					model.setSplAddr(splAddr[i]);
				if (splRgstNo[i] != null)
					model.setSplRgstNo(splRgstNo[i]);
				if (bilInvYrmon[i] != null)
					model.setBilInvYrmon(bilInvYrmon[i]);
				if (slpFuncCd[i] != null)
					model.setSlpFuncCd(slpFuncCd[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (bztpNm[i] != null)
					model.setBztpNm(bztpNm[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (blnkKnt[i] != null)
					model.setBlnkKnt(blnkKnt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (coNm[i] != null)
					model.setCoNm(coNm[i]);
				if (slpTeamCd[i] != null)
					model.setSlpTeamCd(slpTeamCd[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (bilSerNo[i] != null)
					model.setBilSerNo(bilSerNo[i]);
				if (slpTpCd[i] != null)
					model.setSlpTpCd(slpTpCd[i]);
				if (slpIssDt[i] != null)
					model.setSlpIssDt(slpIssDt[i]);
				if (ownrNm[i] != null)
					model.setOwnrNm(ownrNm[i]);
				if (issDt[i] != null)
					model.setIssDt(issDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (bzctNm[i] != null)
					model.setBzctNm(bzctNm[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (splAmt[i] != null)
					model.setSplAmt(splAmt[i]);
				if (slpSerNo[i] != null)
					model.setSlpSerNo(slpSerNo[i]);
				if (bilDivCd[i] != null)
					model.setBilDivCd(bilDivCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getFmsBillVOs();
	}

	public FmsBillVO[] getFmsBillVOs(){
		FmsBillVO[] vos = (FmsBillVO[])models.toArray(new FmsBillVO[models.size()]);
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
		this.bilPlCd = this.bilPlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splAddr = this.splAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splRgstNo = this.splRgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilInvYrmon = this.bilInvYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpFuncCd = this.slpFuncCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bztpNm = this.bztpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blnkKnt = this.blnkKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coNm = this.coNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpTeamCd = this.slpTeamCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilSerNo = this.bilSerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpTpCd = this.slpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpIssDt = this.slpIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ownrNm = this.ownrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issDt = this.issDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bzctNm = this.bzctNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splAmt = this.splAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpSerNo = this.slpSerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilDivCd = this.bilDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
