/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmLseChgHdrVO.java
*@FileTitle : CgmLseChgHdrVO
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

public class CgmLseChgHdrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmLseChgHdrVO> models = new ArrayList<CgmLseChgHdrVO>();
	
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String chgCreSeq = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String agmtSeq = null;
	/* Column Info */
	private String invSmryAmt = null;
	/* Column Info */
	private String payChgSmryAmt = null;
	/* Column Info */
	private String crSmryAmt = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String agmtVerNo = null;
	/* Column Info */
	private String lseChgStsCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String taxSmryAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String eqKndCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String agmtOfcCtyCd = null;
	/* Column Info */
	private String lseChgSmryAmt = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmLseChgHdrVO() {}

	public CgmLseChgHdrVO(String ibflag, String pagerows, String agmtOfcCtyCd, String agmtSeq, String agmtVerNo, String costYrmon, String eqKndCd, String lseChgStsCd, String vndrSeq, String lseChgSmryAmt, String invSmryAmt, String payChgSmryAmt, String crSmryAmt, String taxSmryAmt, String diffRmk, String chgCreSeq, String creOfcCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.ibflag = ibflag;
		this.chgCreSeq = chgCreSeq;
		this.vndrSeq = vndrSeq;
		this.costYrmon = costYrmon;
		this.agmtSeq = agmtSeq;
		this.invSmryAmt = invSmryAmt;
		this.payChgSmryAmt = payChgSmryAmt;
		this.crSmryAmt = crSmryAmt;
		this.diffRmk = diffRmk;
		this.updUsrId = updUsrId;
		this.agmtVerNo = agmtVerNo;
		this.lseChgStsCd = lseChgStsCd;
		this.updDt = updDt;
		this.taxSmryAmt = taxSmryAmt;
		this.creDt = creDt;
		this.eqKndCd = eqKndCd;
		this.creUsrId = creUsrId;
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		this.lseChgSmryAmt = lseChgSmryAmt;
		this.creOfcCd = creOfcCd;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("chg_cre_seq", getChgCreSeq());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("agmt_seq", getAgmtSeq());
		this.hashColumns.put("inv_smry_amt", getInvSmryAmt());
		this.hashColumns.put("pay_chg_smry_amt", getPayChgSmryAmt());
		this.hashColumns.put("cr_smry_amt", getCrSmryAmt());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("agmt_ver_no", getAgmtVerNo());
		this.hashColumns.put("lse_chg_sts_cd", getLseChgStsCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("tax_smry_amt", getTaxSmryAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eq_knd_cd", getEqKndCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("agmt_ofc_cty_cd", getAgmtOfcCtyCd());
		this.hashColumns.put("lse_chg_smry_amt", getLseChgSmryAmt());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("chg_cre_seq", "chgCreSeq");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("agmt_seq", "agmtSeq");
		this.hashFields.put("inv_smry_amt", "invSmryAmt");
		this.hashFields.put("pay_chg_smry_amt", "payChgSmryAmt");
		this.hashFields.put("cr_smry_amt", "crSmryAmt");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("agmt_ver_no", "agmtVerNo");
		this.hashFields.put("lse_chg_sts_cd", "lseChgStsCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("tax_smry_amt", "taxSmryAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eq_knd_cd", "eqKndCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("agmt_ofc_cty_cd", "agmtOfcCtyCd");
		this.hashFields.put("lse_chg_smry_amt", "lseChgSmryAmt");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getIbflag() {
		return this.ibflag;
	}
	public String getChgCreSeq() {
		return this.chgCreSeq;
	}
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	public String getCostYrmon() {
		return this.costYrmon;
	}
	public String getAgmtSeq() {
		return this.agmtSeq;
	}
	public String getInvSmryAmt() {
		return this.invSmryAmt;
	}
	public String getPayChgSmryAmt() {
		return this.payChgSmryAmt;
	}
	public String getCrSmryAmt() {
		return this.crSmryAmt;
	}
	public String getDiffRmk() {
		return this.diffRmk;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getAgmtVerNo() {
		return this.agmtVerNo;
	}
	public String getLseChgStsCd() {
		return this.lseChgStsCd;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getTaxSmryAmt() {
		return this.taxSmryAmt;
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
	public String getLseChgSmryAmt() {
		return this.lseChgSmryAmt;
	}
	public String getCreOfcCd() {
		return this.creOfcCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setChgCreSeq(String chgCreSeq) {
		this.chgCreSeq = chgCreSeq;
		//this.chgCreSeq=true;
	}
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
		//this.vndrSeq=true;
	}
	public void setCostYrmon(String costYrmon) {
		this.costYrmon = costYrmon;
		//this.costYrmon=true;
	}
	public void setAgmtSeq(String agmtSeq) {
		this.agmtSeq = agmtSeq;
		//this.agmtSeq=true;
	}
	public void setInvSmryAmt(String invSmryAmt) {
		this.invSmryAmt = invSmryAmt;
		//this.invSmryAmt=true;
	}
	public void setPayChgSmryAmt(String payChgSmryAmt) {
		this.payChgSmryAmt = payChgSmryAmt;
		//this.payChgSmryAmt=true;
	}
	public void setCrSmryAmt(String crSmryAmt) {
		this.crSmryAmt = crSmryAmt;
		//this.crSmryAmt=true;
	}
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
		//this.diffRmk=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setAgmtVerNo(String agmtVerNo) {
		this.agmtVerNo = agmtVerNo;
		//this.agmtVerNo=true;
	}
	public void setLseChgStsCd(String lseChgStsCd) {
		this.lseChgStsCd = lseChgStsCd;
		//this.lseChgStsCd=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setTaxSmryAmt(String taxSmryAmt) {
		this.taxSmryAmt = taxSmryAmt;
		//this.taxSmryAmt=true;
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
	public void setLseChgSmryAmt(String lseChgSmryAmt) {
		this.lseChgSmryAmt = lseChgSmryAmt;
		//this.lseChgSmryAmt=true;
	}
	public void setCreOfcCd(String creOfcCd) {
		this.creOfcCd = creOfcCd;
		//this.creOfcCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setChgCreSeq(JSPUtil.getParameter(request, "chg_cre_seq", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setAgmtSeq(JSPUtil.getParameter(request, "agmt_seq", ""));
		setInvSmryAmt(JSPUtil.getParameter(request, "inv_smry_amt", ""));
		setPayChgSmryAmt(JSPUtil.getParameter(request, "pay_chg_smry_amt", ""));
		setCrSmryAmt(JSPUtil.getParameter(request, "cr_smry_amt", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setAgmtVerNo(JSPUtil.getParameter(request, "agmt_ver_no", ""));
		setLseChgStsCd(JSPUtil.getParameter(request, "lse_chg_sts_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setTaxSmryAmt(JSPUtil.getParameter(request, "tax_smry_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEqKndCd(JSPUtil.getParameter(request, "eq_knd_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setAgmtOfcCtyCd(JSPUtil.getParameter(request, "agmt_ofc_cty_cd", ""));
		setLseChgSmryAmt(JSPUtil.getParameter(request, "lse_chg_smry_amt", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public CgmLseChgHdrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmLseChgHdrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmLseChgHdrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] chgCreSeq = (JSPUtil.getParameter(request, prefix	+ "chg_cre_seq".trim(), length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq".trim(), length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon".trim(), length));
			String[] agmtSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_seq".trim(), length));
			String[] invSmryAmt = (JSPUtil.getParameter(request, prefix	+ "inv_smry_amt".trim(), length));
			String[] payChgSmryAmt = (JSPUtil.getParameter(request, prefix	+ "pay_chg_smry_amt".trim(), length));
			String[] crSmryAmt = (JSPUtil.getParameter(request, prefix	+ "cr_smry_amt".trim(), length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] agmtVerNo = (JSPUtil.getParameter(request, prefix	+ "agmt_ver_no".trim(), length));
			String[] lseChgStsCd = (JSPUtil.getParameter(request, prefix	+ "lse_chg_sts_cd".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] taxSmryAmt = (JSPUtil.getParameter(request, prefix	+ "tax_smry_amt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] eqKndCd = (JSPUtil.getParameter(request, prefix	+ "eq_knd_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] agmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_ofc_cty_cd".trim(), length));
			String[] lseChgSmryAmt = (JSPUtil.getParameter(request, prefix	+ "lse_chg_smry_amt".trim(), length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmLseChgHdrVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (chgCreSeq[i] != null)
					model.setChgCreSeq(chgCreSeq[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (agmtSeq[i] != null)
					model.setAgmtSeq(agmtSeq[i]);
				if (invSmryAmt[i] != null)
					model.setInvSmryAmt(invSmryAmt[i]);
				if (payChgSmryAmt[i] != null)
					model.setPayChgSmryAmt(payChgSmryAmt[i]);
				if (crSmryAmt[i] != null)
					model.setCrSmryAmt(crSmryAmt[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (agmtVerNo[i] != null)
					model.setAgmtVerNo(agmtVerNo[i]);
				if (lseChgStsCd[i] != null)
					model.setLseChgStsCd(lseChgStsCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (taxSmryAmt[i] != null)
					model.setTaxSmryAmt(taxSmryAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (eqKndCd[i] != null)
					model.setEqKndCd(eqKndCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (agmtOfcCtyCd[i] != null)
					model.setAgmtOfcCtyCd(agmtOfcCtyCd[i]);
				if (lseChgSmryAmt[i] != null)
					model.setLseChgSmryAmt(lseChgSmryAmt[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmLseChgHdrVOs();
	}

	public CgmLseChgHdrVO[] getCgmLseChgHdrVOs(){
		CgmLseChgHdrVO[] vos = (CgmLseChgHdrVO[])models.toArray(new CgmLseChgHdrVO[models.size()]);
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
		this.chgCreSeq = this.chgCreSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSeq = this.agmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invSmryAmt = this.invSmryAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payChgSmryAmt = this.payChgSmryAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crSmryAmt = this.crSmryAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtVerNo = this.agmtVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseChgStsCd = this.lseChgStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxSmryAmt = this.taxSmryAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqKndCd = this.eqKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOfcCtyCd = this.agmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseChgSmryAmt = this.lseChgSmryAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
