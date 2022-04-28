/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCustTmpltVO.java
*@FileTitle : BkgCustTmpltVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.29
*@LastModifier : 박성호
*@LastVersion : 1.0
* 2009.05.29 박성호 
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
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 박성호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCustTmpltVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCustTmpltVO> models = new ArrayList<BkgCustTmpltVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String custNm = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String custAddr = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String custEml = null;
	/* Column Info */
	private String custCtyNm = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String custZipCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String tmpltSeq = null;
	/* Column Info */
	private String tmpltRmk = null;
	/* Column Info */
	private String atndNm = null;
	/* Column Info */
	private String custFaxNo = null;
	/* Column Info */
	private String custPhnNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String custSteCd = null;
	/* Column Info */
	private String eurCstmsStNm = null;
	/* Column Info */
	private String eoriNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCustTmpltVO() {}
/**
 * 
 * @param ibflag
 * @param pagerows
 * @param custCntCd
 * @param custSeq
 * @param tmpltSeq
 * @param custNm
 * @param custAddr
 * @param custCtyNm
 * @param custSteCd
 * @param custZipCd
 * @param custPhnNo
 * @param custFaxNo
 * @param custEml
 * @param atndNm
 * @param tmpltRmk
 * @param creUsrId
 * @param creDt
 * @param updUsrId
 * @param updDt
 */
	public BkgCustTmpltVO(String ibflag, String pagerows, String custCntCd, String custSeq, String tmpltSeq, String custNm, String custAddr, String custCtyNm, String custSteCd, String custZipCd, String custPhnNo, String custFaxNo, String custEml, String atndNm, String tmpltRmk, String creUsrId, String creDt, String updUsrId, String updDt, String eurCstmsStNm, String eoriNo) {
		this.updDt = updDt;
		this.custNm = custNm;
		this.creDt = creDt;
		this.custAddr = custAddr;
		this.custSeq = custSeq;
		this.custEml = custEml;
		this.custCtyNm = custCtyNm;
		this.pagerows = pagerows;
		this.custZipCd = custZipCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.tmpltSeq = tmpltSeq;
		this.tmpltRmk = tmpltRmk;
		this.atndNm = atndNm;
		this.custFaxNo = custFaxNo;
		this.custPhnNo = custPhnNo;
		this.updUsrId = updUsrId;
		this.custCntCd = custCntCd;
		this.custSteCd = custSteCd;
		this.eurCstmsStNm = eurCstmsStNm;
		this.eoriNo = eoriNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cust_nm", getCustNm());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cust_addr", getCustAddr());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("cust_eml", getCustEml());
		this.hashColumns.put("cust_cty_nm", getCustCtyNm());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cust_zip_cd", getCustZipCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("tmplt_seq", getTmpltSeq());
		this.hashColumns.put("tmplt_rmk", getTmpltRmk());
		this.hashColumns.put("atnd_nm", getAtndNm());
		this.hashColumns.put("cust_fax_no", getCustFaxNo());
		this.hashColumns.put("cust_phn_no", getCustPhnNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("cust_ste_cd", getCustSteCd());
		this.hashColumns.put("eur_cstms_st_nm", getEurCstmsStNm());
		this.hashColumns.put("eori_no", getEoriNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cust_nm", "custNm");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cust_addr", "custAddr");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("cust_eml", "custEml");
		this.hashFields.put("cust_cty_nm", "custCtyNm");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cust_zip_cd", "custZipCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("tmplt_seq", "tmpltSeq");
		this.hashFields.put("tmplt_rmk", "tmpltRmk");
		this.hashFields.put("atnd_nm", "atndNm");
		this.hashFields.put("cust_fax_no", "custFaxNo");
		this.hashFields.put("cust_phn_no", "custPhnNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("cust_ste_cd", "custSteCd");
		this.hashFields.put("eur_cstms_st_nm", "eurCstmsStNm");
		this.hashFields.put("eori_no", "eoriNo");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return custNm
	 */
	public String getCustNm() {
		return this.custNm;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return custAddr
	 */
	public String getCustAddr() {
		return this.custAddr;
	}
	
	/**
	 * Column Info
	 * @return custSeq
	 */
	public String getCustSeq() {
		return this.custSeq;
	}
	
	/**
	 * Column Info
	 * @return custEml
	 */
	public String getCustEml() {
		return this.custEml;
	}
	
	/**
	 * Column Info
	 * @return custCtyNm
	 */
	public String getCustCtyNm() {
		return this.custCtyNm;
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
	 * @return custZipCd
	 */
	public String getCustZipCd() {
		return this.custZipCd;
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
	 * @return tmpltSeq
	 */
	public String getTmpltSeq() {
		return this.tmpltSeq;
	}
	
	/**
	 * Column Info
	 * @return tmpltRmk
	 */
	public String getTmpltRmk() {
		return this.tmpltRmk;
	}
	
	/**
	 * Column Info
	 * @return atndNm
	 */
	public String getAtndNm() {
		return this.atndNm;
	}
	
	/**
	 * Column Info
	 * @return custFaxNo
	 */
	public String getCustFaxNo() {
		return this.custFaxNo;
	}
	
	/**
	 * Column Info
	 * @return custPhnNo
	 */
	public String getCustPhnNo() {
		return this.custPhnNo;
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
	 * @return custCntCd
	 */
	public String getCustCntCd() {
		return this.custCntCd;
	}
	
	/**
	 * Column Info
	 * @return custSteCd
	 */
	public String getCustSteCd() {
		return this.custSteCd;
	}	

	/**
	 * Column Info
	 * @return eurCstmsStNm
	 */
	public String getEurCstmsStNm() {
		return this.eurCstmsStNm;
	}
	
	/**
	 * Column Info
	 * @return eoriNo
	 */
	public String getEoriNo() {
		return this.eoriNo;
	}
	
	/**
	 * Column Info
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param custNm
	 */
	public void setCustNm(String custNm) {
		this.custNm = custNm;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param custAddr
	 */
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	
	/**
	 * Column Info
	 * @param custSeq
	 */
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}
	
	/**
	 * Column Info
	 * @param custEml
	 */
	public void setCustEml(String custEml) {
		this.custEml = custEml;
	}
	
	/**
	 * Column Info
	 * @param custCtyNm
	 */
	public void setCustCtyNm(String custCtyNm) {
		this.custCtyNm = custCtyNm;
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
	 * @param custZipCd
	 */
	public void setCustZipCd(String custZipCd) {
		this.custZipCd = custZipCd;
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
	 * @param tmpltSeq
	 */
	public void setTmpltSeq(String tmpltSeq) {
		this.tmpltSeq = tmpltSeq;
	}
	
	/**
	 * Column Info
	 * @param tmpltRmk
	 */
	public void setTmpltRmk(String tmpltRmk) {
		this.tmpltRmk = tmpltRmk;
	}
	
	/**
	 * Column Info
	 * @param atndNm
	 */
	public void setAtndNm(String atndNm) {
		this.atndNm = atndNm;
	}
	
	/**
	 * Column Info
	 * @param custFaxNo
	 */
	public void setCustFaxNo(String custFaxNo) {
		this.custFaxNo = custFaxNo;
	}
	
	/**
	 * Column Info
	 * @param custPhnNo
	 */
	public void setCustPhnNo(String custPhnNo) {
		this.custPhnNo = custPhnNo;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param custCntCd
	 */
	public void setCustCntCd(String custCntCd) {
		this.custCntCd = custCntCd;
	}
	
	/**
	 * Column Info
	 * @param custSteCd
	 */
	public void setCustSteCd(String custSteCd) {
		this.custSteCd = custSteCd;
	}
	/**
	 * Column Info
	 * @param eurCtmsStNm
	 */
	public void setEurCstmsStNm(String eurCstmsStNm) {
		this.eurCstmsStNm = eurCstmsStNm;
	}
		
	/**
	 * Column Info
	 * @param eoriNo
	 */
	public void setEoriNo(String eoriNo) {
		this.eoriNo = eoriNo;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCustNm(JSPUtil.getParameter(request, "cust_nm", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCustAddr(JSPUtil.getParameter(request, "cust_addr", ""));
		setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
		setCustEml(JSPUtil.getParameter(request, "cust_eml", ""));
		setCustCtyNm(JSPUtil.getParameter(request, "cust_cty_nm", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCustZipCd(JSPUtil.getParameter(request, "cust_zip_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setTmpltSeq(JSPUtil.getParameter(request, "tmplt_seq", ""));
		setTmpltRmk(JSPUtil.getParameter(request, "tmplt_rmk", ""));
		setAtndNm(JSPUtil.getParameter(request, "atnd_nm", ""));
		setCustFaxNo(JSPUtil.getParameter(request, "cust_fax_no", ""));
		setCustPhnNo(JSPUtil.getParameter(request, "cust_phn_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
		setCustSteCd(JSPUtil.getParameter(request, "cust_ste_cd", ""));
		setEurCstmsStNm(JSPUtil.getParameter(request, "eur_cstms_st_nm", ""));
		setEoriNo(JSPUtil.getParameter(request, "eori_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCustTmpltVO[]
	 */
	public BkgCustTmpltVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCustTmpltVO[]
	 */
	public BkgCustTmpltVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCustTmpltVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] custNm = (JSPUtil.getParameter(request, prefix	+ "cust_nm".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] custAddr = (JSPUtil.getParameter(request, prefix	+ "cust_addr".trim(), length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq".trim(), length));
			String[] custEml = (JSPUtil.getParameter(request, prefix	+ "cust_eml".trim(), length));
			String[] custCtyNm = (JSPUtil.getParameter(request, prefix	+ "cust_cty_nm".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] custZipCd = (JSPUtil.getParameter(request, prefix	+ "cust_zip_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] tmpltSeq = (JSPUtil.getParameter(request, prefix	+ "tmplt_seq".trim(), length));
			String[] tmpltRmk = (JSPUtil.getParameter(request, prefix	+ "tmplt_rmk".trim(), length));
			String[] atndNm = (JSPUtil.getParameter(request, prefix	+ "atnd_nm".trim(), length));
			String[] custFaxNo = (JSPUtil.getParameter(request, prefix	+ "cust_fax_no".trim(), length));
			String[] custPhnNo = (JSPUtil.getParameter(request, prefix	+ "cust_phn_no".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd".trim(), length));
			String[] custSteCd = (JSPUtil.getParameter(request, prefix	+ "cust_ste_cd".trim(), length));
			String[] eurCstmsStNm = (JSPUtil.getParameter(request, prefix	+ "eur_cstms_st_nm", length));
			String[] eoriNo = (JSPUtil.getParameter(request, prefix	+ "eori_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCustTmpltVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (custNm[i] != null)
					model.setCustNm(custNm[i]);
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
					model.setPagerows(pagerows[i]);
				if (custZipCd[i] != null)
					model.setCustZipCd(custZipCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (tmpltSeq[i] != null)
					model.setTmpltSeq(tmpltSeq[i]);
				if (tmpltRmk[i] != null)
					model.setTmpltRmk(tmpltRmk[i]);
				if (atndNm[i] != null)
					model.setAtndNm(atndNm[i]);
				if (custFaxNo[i] != null)
					model.setCustFaxNo(custFaxNo[i]);
				if (custPhnNo[i] != null)
					model.setCustPhnNo(custPhnNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (custSteCd[i] != null)
					model.setCustSteCd(custSteCd[i]);
				if (eurCstmsStNm[i] != null)
					model.setEurCstmsStNm(eurCstmsStNm[i]);
				if (eoriNo[i] != null)
					model.setEoriNo(eoriNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCustTmpltVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCustTmpltVO[]
	 */
	public BkgCustTmpltVO[] getBkgCustTmpltVOs(){
		BkgCustTmpltVO[] vos = (BkgCustTmpltVO[])models.toArray(new BkgCustTmpltVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
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
		} catch (Exception ex) {
			return null;
		}
		return ret.toString();
	}
	
	/**
	 * 필드에 있는 값을 스트링 배열로 반환.
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = null;
		}
		return arr;
	}

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custNm = this.custNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custAddr = this.custAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custEml = this.custEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCtyNm = this.custCtyNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custZipCd = this.custZipCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmpltSeq = this.tmpltSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmpltRmk = this.tmpltRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.atndNm = this.atndNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custFaxNo = this.custFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custPhnNo = this.custPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSteCd = this.custSteCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eurCstmsStNm = this.eurCstmsStNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eoriNo = this.eoriNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
