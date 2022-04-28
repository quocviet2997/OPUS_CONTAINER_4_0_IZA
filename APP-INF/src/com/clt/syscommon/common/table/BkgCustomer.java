/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : BkgCustomer.java
*@FileTitle : Bkg Booking
*Open Issues :
*Change history :
*@LastModifyDate : 2008.12.29
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2008.12.29 정윤태
* 1.0 최초 생성
=========================================================*/

package com.clt.syscommon.common.table;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 정윤태
 * @see BkgCre079HTMLAction 참조
 * @since J2EE 1.5
 */

public class BkgCustomer implements Serializable {

	private static final long serialVersionUID = 1L;
	/* 컬럼 설명	*/
	private String updDt = null;
	/* 컬럼 설명	*/
	private String custNm = null;
	/* 컬럼 설명	*/
	private String bkgNoSplit = null;
	/* 컬럼 설명	*/
	private String creDt = null;
	/* 컬럼 설명	*/
	private String custAddr = null;
	/* 컬럼 설명	*/
	private String custSeq = null;
	/* 컬럼 설명	*/
	private String custEml = null;
	/* 컬럼 설명	*/
	private String custCtyNm = null;
	/* 컬럼 설명	*/
	private String pagerows = null;
	/* 컬럼 설명	*/
	private String custZipCd = null;
	/* 컬럼 설명	*/
	private String creUsrId = null;
	/* 컬럼 설명	*/
	private String ibflag = null;
	/* 컬럼 설명	*/
	private String bkgNo = null;
	/* 컬럼 설명	*/
	private String addrPrnFlg = null;
	/* 컬럼 설명	*/
	private String prntEdiCustTpCd = null;
	/* 컬럼 설명	*/
	private String refNo = null;
	/* 컬럼 설명	*/
	private String custFaxNo = null;
	/* 컬럼 설명	*/
	private String bkgCustTpCd = null;
	/* 컬럼 설명	*/
	private String siCd = null;
	/* 컬럼 설명	*/
	private String updUsrId = null;
	/* 컬럼 설명	*/
	private String custCntCd = null;
	/* 컬럼 설명	*/
	private String custSteCd = null;
	/* 컬럼 설명	*/
	private String bkgOfcCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumn = new HashMap<String, String>();

	public BkgCustomer() {}

	public BkgCustomer(String ibflag, String pagerows, String bkgNo, String bkgNoSplit, String bkgCustTpCd, String custCntCd, String custSeq, String custNm, String custAddr, String custCtyNm, String custSteCd, String custZipCd, String custFaxNo, String custEml, String prntEdiCustTpCd, String refNo, String siCd, String addrPrnFlg, String creUsrId, String creDt, String updUsrId, String updDt, String bkgOfcCd) {
		this.updDt = updDt;
		this.custNm = custNm;
		this.bkgNoSplit = bkgNoSplit;
		this.creDt = creDt;
		this.custAddr = custAddr;
		this.custSeq = custSeq;
		this.custEml = custEml;
		this.custCtyNm = custCtyNm;
		this.pagerows = pagerows;
		this.custZipCd = custZipCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.addrPrnFlg = addrPrnFlg;
		this.prntEdiCustTpCd = prntEdiCustTpCd;
		this.refNo = refNo;
		this.custFaxNo = custFaxNo;
		this.bkgCustTpCd = bkgCustTpCd;
		this.siCd = siCd;
		this.updUsrId = updUsrId;
		this.custCntCd = custCntCd;
		this.custSteCd = custSteCd;
		this.bkgOfcCd = bkgOfcCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValue(){
		this.hashColumn.put("upd_dt", getUpdDt());
		this.hashColumn.put("cust_nm", getCustNm());
		this.hashColumn.put("bkg_no_split", getBkgNoSplit());
		this.hashColumn.put("cre_dt", getCreDt());
		this.hashColumn.put("cust_addr", getCustAddr());
		this.hashColumn.put("cust_seq", getCustSeq());
		this.hashColumn.put("cust_eml", getCustEml());
		this.hashColumn.put("cust_cty_nm", getCustCtyNm());
		this.hashColumn.put("pagerows", getPage_rows());
		this.hashColumn.put("cust_zip_cd", getCustZipCd());
		this.hashColumn.put("cre_usr_id", getCreUsrId());
		this.hashColumn.put("ibflag", getIbflag());
		this.hashColumn.put("bkg_no", getBkgNo());
		this.hashColumn.put("addr_prn_flg", getAddrPrnFlg());
		this.hashColumn.put("prnt_edi_cust_tp_cd", getPrntEdiCustTpCd());
		this.hashColumn.put("ref_no", getRefNo());
		this.hashColumn.put("cust_fax_no", getCustFaxNo());
		this.hashColumn.put("bkg_cust_tp_cd", getBkgCustTpCd());
		this.hashColumn.put("si_cd", getSiCd());
		this.hashColumn.put("upd_usr_id", getUpdUsrId());
		this.hashColumn.put("cust_cnt_cd", getCustCntCd());
		this.hashColumn.put("cust_ste_cd", getCustSteCd());
		this.hashColumn.put("bkg_ofc_cd", getBkgOfcCd());
		return this.hashColumn;
	}
	
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCustNm() {
		return this.custNm;
	}
	public String getBkgNoSplit() {
		return this.bkgNoSplit;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getCustAddr() {
		return this.custAddr;
	}
	public String getCustSeq() {
		return this.custSeq;
	}
	public String getCustEml() {
		return this.custEml;
	}
	public String getCustCtyNm() {
		return this.custCtyNm;
	}
	public String getPage_rows() {
		return this.pagerows;
	}
	public String getCustZipCd() {
		return this.custZipCd;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getBkgNo() {
		return this.bkgNo;
	}
	public String getAddrPrnFlg() {
		return this.addrPrnFlg;
	}
	public String getPrntEdiCustTpCd() {
		return this.prntEdiCustTpCd;
	}
	public String getRefNo() {
		return this.refNo;
	}
	public String getCustFaxNo() {
		return this.custFaxNo;
	}
	public String getBkgCustTpCd() {
		return this.bkgCustTpCd;
	}
	public String getSiCd() {
		return this.siCd;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getCustCntCd() {
		return this.custCntCd;
	}
	public String getCustSteCd() {
		return this.custSteCd;
	}
	public String getBkgOfcCd() {
		return this.bkgOfcCd;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCustNm(String custNm) {
		this.custNm = custNm;
		//this.custNm=true;
	}
	public void setBkgNoSplit(String bkgNoSplit) {
		this.bkgNoSplit = bkgNoSplit;
		//this.bkgNoSplit=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
		//this.custAddr=true;
	}
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
		//this.custSeq=true;
	}
	public void setCustEml(String custEml) {
		this.custEml = custEml;
		//this.custEml=true;
	}
	public void setCustCtyNm(String custCtyNm) {
		this.custCtyNm = custCtyNm;
		//this.custCtyNm=true;
	}
	public void setPage_rows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setCustZipCd(String custZipCd) {
		this.custZipCd = custZipCd;
		//this.custZipCd=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
		//this.bkgNo=true;
	}
	public void setAddrPrnFlg(String addrPrnFlg) {
		this.addrPrnFlg = addrPrnFlg;
		//this.addrPrnFlg=true;
	}
	public void setPrntEdiCustTpCd(String prntEdiCustTpCd) {
		this.prntEdiCustTpCd = prntEdiCustTpCd;
		//this.prntEdiCustTpCd=true;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
		//this.refNo=true;
	}
	public void setCustFaxNo(String custFaxNo) {
		this.custFaxNo = custFaxNo;
		//this.custFaxNo=true;
	}
	public void setBkgCustTpCd(String bkgCustTpCd) {
		this.bkgCustTpCd = bkgCustTpCd;
		//this.bkgCustTpCd=true;
	}
	public void setSiCd(String siCd) {
		this.siCd = siCd;
		//this.siCd=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setCustCntCd(String custCntCd) {
		this.custCntCd = custCntCd;
		//this.custCntCd=true;
	}
	public void setCustSteCd(String custSteCd) {
		this.custSteCd = custSteCd;
		//this.custSteCd=true;
	}
	public void setBkgOfcCd(String bkgOfcCd) {
		this.bkgOfcCd = bkgOfcCd;
		//this.cust_cnt_cd=true;
	}
	
	public static BkgCustomer fromRequest(HttpServletRequest request) {
		BkgCustomer model = new BkgCustomer();
		try {
			model.setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
			model.setCustNm(JSPUtil.getParameter(request, "cust_nm", ""));
			model.setBkgNoSplit(JSPUtil.getParameter(request, "bkg_no_split", ""));
			model.setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
			model.setCustAddr(JSPUtil.getParameter(request, "cust_addr", ""));
			model.setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
			model.setCustEml(JSPUtil.getParameter(request, "cust_eml", ""));
			model.setCustCtyNm(JSPUtil.getParameter(request, "cust_cty_nm", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "pagerows", ""));
			model.setCustZipCd(JSPUtil.getParameter(request, "cust_zip_cd", ""));
			model.setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
			model.setAddrPrnFlg(JSPUtil.getParameter(request, "addr_prn_flg", ""));
			model.setPrntEdiCustTpCd(JSPUtil.getParameter(request, "prnt_edi_cust_tp_cd", ""));
			model.setRefNo(JSPUtil.getParameter(request, "ref_no", ""));
			model.setCustFaxNo(JSPUtil.getParameter(request, "cust_fax_no", ""));
			model.setBkgCustTpCd(JSPUtil.getParameter(request, "bkg_cust_tp_cd", ""));
			model.setSiCd(JSPUtil.getParameter(request, "si_cd", ""));
			model.setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
			model.setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
			model.setCustSteCd(JSPUtil.getParameter(request, "cust_ste_cd", ""));
			model.setBkgOfcCd(JSPUtil.getParameter(request, "bkg_ofc_cd", ""));
		} catch (Exception e) {}
		return model;
	}

	public static Collection<BkgCustomer> fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public static Collection<BkgCustomer> fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCustomer model = null;
		Collection<BkgCustomer> models = new ArrayList<BkgCustomer>();

		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp==null)
   			return models;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] custNm = (JSPUtil.getParameter(request, prefix	+ "cust_nm".trim(), length));
			String[] bkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "bkg_no_split".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] custAddr = (JSPUtil.getParameter(request, prefix	+ "cust_addr".trim(), length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq".trim(), length));
			String[] custEml = (JSPUtil.getParameter(request, prefix	+ "cust_eml".trim(), length));
			String[] custCtyNm = (JSPUtil.getParameter(request, prefix	+ "cust_cty_nm".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] custZipCd = (JSPUtil.getParameter(request, prefix	+ "cust_zip_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no".trim(), length));
			String[] addrPrnFlg = (JSPUtil.getParameter(request, prefix	+ "addr_prn_flg".trim(), length));
			String[] prntEdiCustTpCd = (JSPUtil.getParameter(request, prefix	+ "prnt_edi_cust_tp_cd".trim(), length));
			String[] refNo = (JSPUtil.getParameter(request, prefix	+ "ref_no".trim(), length));
			String[] custFaxNo = (JSPUtil.getParameter(request, prefix	+ "cust_fax_no".trim(), length));
			String[] bkgCustTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_cust_tp_cd".trim(), length));
			String[] siCd = (JSPUtil.getParameter(request, prefix	+ "si_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd".trim(), length));
			String[] custSteCd = (JSPUtil.getParameter(request, prefix	+ "cust_ste_cd".trim(), length));
			String[] bkgOfcCd = (JSPUtil.getParameter(request, prefix	+ "bkg_ofc_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCustomer();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (custNm[i] != null)
					model.setCustNm(custNm[i]);
				if (bkgNoSplit[i] != null)
					model.setBkgNoSplit(bkgNoSplit[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (custAddr[i] != null)
					model.setCustAddr(custAddr[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (custEml[i] != null)
					model.setCustEml(custEml[i]);
				if (custCtyNm[i] != null)
					model.setCustCtyNm(custCtyNm[i]);
				if (pagerows[i] != null)
					model.setPage_rows(pagerows[i]);
				if (custZipCd[i] != null)
					model.setCustZipCd(custZipCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (addrPrnFlg[i] != null)
					model.setAddrPrnFlg(addrPrnFlg[i]);
				if (prntEdiCustTpCd[i] != null)
					model.setPrntEdiCustTpCd(prntEdiCustTpCd[i]);
				if (refNo[i] != null)
					model.setRefNo(refNo[i]);
				if (custFaxNo[i] != null)
					model.setCustFaxNo(custFaxNo[i]);
				if (bkgCustTpCd[i] != null)
					model.setBkgCustTpCd(bkgCustTpCd[i]);
				if (siCd[i] != null)
					model.setSiCd(siCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (custSteCd[i] != null)
					model.setCustSteCd(custSteCd[i]);
				if (bkgOfcCd[i] != null)
					model.setBkgOfcCd(bkgOfcCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return models;
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

}
