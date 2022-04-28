/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : InvArBankVO.java
*@FileTitle : InvArBankVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.11
*@LastModifier : 김세일
*@LastVersion : 1.0
* 2009.05.11 김세일 
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

public class InvArBankVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<InvArBankVO> models = new ArrayList<InvArBankVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String bankAcctNo = null;
	/* Column Info */
	private String bankAcctRmk = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String bankAcctCurrCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ofcCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String bankAddr = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bankShrtNm = null;
	/* Column Info */
	private String bankNm = null;
	/* Column Info */
	private String updUsrId = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public InvArBankVO() {}

	public InvArBankVO(String ibflag, String pagerows, String bankAcctNo, String bankNm, String bankShrtNm, String ofcCd, String bankAcctCurrCd, String bankAddr, String bankAcctRmk, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.bankAcctNo = bankAcctNo;
		this.bankAcctRmk = bankAcctRmk;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.bankAcctCurrCd = bankAcctCurrCd;
		this.pagerows = pagerows;
		this.ofcCd = ofcCd;
		this.ibflag = ibflag;
		this.bankAddr = bankAddr;
		this.creUsrId = creUsrId;
		this.bankShrtNm = bankShrtNm;
		this.bankNm = bankNm;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("bank_acct_no", getBankAcctNo());
		this.hashColumns.put("bank_acct_rmk", getBankAcctRmk());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bank_acct_curr_cd", getBankAcctCurrCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bank_addr", getBankAddr());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bank_shrt_nm", getBankShrtNm());
		this.hashColumns.put("bank_nm", getBankNm());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("bank_acct_no", "bankAcctNo");
		this.hashFields.put("bank_acct_rmk", "bankAcctRmk");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bank_acct_curr_cd", "bankAcctCurrCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bank_addr", "bankAddr");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bank_shrt_nm", "bankShrtNm");
		this.hashFields.put("bank_nm", "bankNm");
		this.hashFields.put("upd_usr_id", "updUsrId");
		return this.hashFields;
	}
	
	public String getUpdDt() {
		return this.updDt;
	}
	public String getBankAcctNo() {
		return this.bankAcctNo;
	}
	public String getBankAcctRmk() {
		return this.bankAcctRmk;
	}
	public String getDeltFlg() {
		return this.deltFlg;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getBankAcctCurrCd() {
		return this.bankAcctCurrCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getOfcCd() {
		return this.ofcCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getBankAddr() {
		return this.bankAddr;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getBankShrtNm() {
		return this.bankShrtNm;
	}
	public String getBankNm() {
		return this.bankNm;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setBankAcctNo(String bankAcctNo) {
		this.bankAcctNo = bankAcctNo;
		//this.bankAcctNo=true;
	}
	public void setBankAcctRmk(String bankAcctRmk) {
		this.bankAcctRmk = bankAcctRmk;
		//this.bankAcctRmk=true;
	}
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
		//this.deltFlg=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setBankAcctCurrCd(String bankAcctCurrCd) {
		this.bankAcctCurrCd = bankAcctCurrCd;
		//this.bankAcctCurrCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
		//this.ofcCd=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setBankAddr(String bankAddr) {
		this.bankAddr = bankAddr;
		//this.bankAddr=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setBankShrtNm(String bankShrtNm) {
		this.bankShrtNm = bankShrtNm;
		//this.bankShrtNm=true;
	}
	public void setBankNm(String bankNm) {
		this.bankNm = bankNm;
		//this.bankNm=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setBankAcctNo(JSPUtil.getParameter(request, "bank_acct_no", ""));
		setBankAcctRmk(JSPUtil.getParameter(request, "bank_acct_rmk", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setBankAcctCurrCd(JSPUtil.getParameter(request, "bank_acct_curr_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBankAddr(JSPUtil.getParameter(request, "bank_addr", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBankShrtNm(JSPUtil.getParameter(request, "bank_shrt_nm", ""));
		setBankNm(JSPUtil.getParameter(request, "bank_nm", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	public InvArBankVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public InvArBankVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		InvArBankVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] bankAcctNo = (JSPUtil.getParameter(request, prefix	+ "bank_acct_no".trim(), length));
			String[] bankAcctRmk = (JSPUtil.getParameter(request, prefix	+ "bank_acct_rmk".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] bankAcctCurrCd = (JSPUtil.getParameter(request, prefix	+ "bank_acct_curr_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] bankAddr = (JSPUtil.getParameter(request, prefix	+ "bank_addr".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] bankShrtNm = (JSPUtil.getParameter(request, prefix	+ "bank_shrt_nm".trim(), length));
			String[] bankNm = (JSPUtil.getParameter(request, prefix	+ "bank_nm".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new InvArBankVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (bankAcctNo[i] != null)
					model.setBankAcctNo(bankAcctNo[i]);
				if (bankAcctRmk[i] != null)
					model.setBankAcctRmk(bankAcctRmk[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (bankAcctCurrCd[i] != null)
					model.setBankAcctCurrCd(bankAcctCurrCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bankAddr[i] != null)
					model.setBankAddr(bankAddr[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bankShrtNm[i] != null)
					model.setBankShrtNm(bankShrtNm[i]);
				if (bankNm[i] != null)
					model.setBankNm(bankNm[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getInvArBankVOs();
	}

	public InvArBankVO[] getInvArBankVOs(){
		InvArBankVO[] vos = (InvArBankVO[])models.toArray(new InvArBankVO[models.size()]);
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
		this.bankAcctNo = this.bankAcctNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bankAcctRmk = this.bankAcctRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bankAcctCurrCd = this.bankAcctCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bankAddr = this.bankAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bankShrtNm = this.bankShrtNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bankNm = this.bankNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
