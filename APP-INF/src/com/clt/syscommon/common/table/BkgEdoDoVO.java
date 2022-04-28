/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgEdoDoVO.java
*@FileTitle : BkgEdoDoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.25
*@LastModifier : 안진응
*@LastVersion : 1.0
* 2009.06.25 안진응 
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
 * @author 안진응
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgEdoDoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgEdoDoVO> models = new ArrayList<BkgEdoDoVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String edoTrsmDt = null;
	/* Column Info */
	private String payrBankNm = null;
	/* Column Info */
	private String rqstEdoIssDt = null;
	/* Column Info */
	private String payAmtCtnt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String payrNm = null;
	/* Column Info */
	private String edoXterPrnrAckCd = null;
	/* Column Info */
	private String edoRqstSeq = null;
	/* Column Info */
	private String hndlOfcCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String payCurrCd = null;
	/* Column Info */
	private String edoIssOfcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String edoTrsmUsrId = null;
	/* Column Info */
	private String edoRqstNo = null;
	/* Column Info */
	private String payrBankAcctNo = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgEdoDoVO() {}

	public BkgEdoDoVO(String ibflag, String pagerows, String edoRqstNo, String edoRqstSeq, String edoXterPrnrAckCd, String payAmtCtnt, String payCurrCd, String payrNm, String payrBankNm, String payrBankAcctNo, String hndlOfcCd, String rqstEdoIssDt, String edoIssOfcCd, String edoTrsmDt, String edoTrsmUsrId, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.edoTrsmDt = edoTrsmDt;
		this.payrBankNm = payrBankNm;
		this.rqstEdoIssDt = rqstEdoIssDt;
		this.payAmtCtnt = payAmtCtnt;
		this.creDt = creDt;
		this.payrNm = payrNm;
		this.edoXterPrnrAckCd = edoXterPrnrAckCd;
		this.edoRqstSeq = edoRqstSeq;
		this.hndlOfcCd = hndlOfcCd;
		this.pagerows = pagerows;
		this.payCurrCd = payCurrCd;
		this.edoIssOfcCd = edoIssOfcCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.edoTrsmUsrId = edoTrsmUsrId;
		this.edoRqstNo = edoRqstNo;
		this.payrBankAcctNo = payrBankAcctNo;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("edo_trsm_dt", getEdoTrsmDt());
		this.hashColumns.put("payr_bank_nm", getPayrBankNm());
		this.hashColumns.put("rqst_edo_iss_dt", getRqstEdoIssDt());
		this.hashColumns.put("pay_amt_ctnt", getPayAmtCtnt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("payr_nm", getPayrNm());
		this.hashColumns.put("edo_xter_prnr_ack_cd", getEdoXterPrnrAckCd());
		this.hashColumns.put("edo_rqst_seq", getEdoRqstSeq());
		this.hashColumns.put("hndl_ofc_cd", getHndlOfcCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pay_curr_cd", getPayCurrCd());
		this.hashColumns.put("edo_iss_ofc_cd", getEdoIssOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("edo_trsm_usr_id", getEdoTrsmUsrId());
		this.hashColumns.put("edo_rqst_no", getEdoRqstNo());
		this.hashColumns.put("payr_bank_acct_no", getPayrBankAcctNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("edo_trsm_dt", "edoTrsmDt");
		this.hashFields.put("payr_bank_nm", "payrBankNm");
		this.hashFields.put("rqst_edo_iss_dt", "rqstEdoIssDt");
		this.hashFields.put("pay_amt_ctnt", "payAmtCtnt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("payr_nm", "payrNm");
		this.hashFields.put("edo_xter_prnr_ack_cd", "edoXterPrnrAckCd");
		this.hashFields.put("edo_rqst_seq", "edoRqstSeq");
		this.hashFields.put("hndl_ofc_cd", "hndlOfcCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pay_curr_cd", "payCurrCd");
		this.hashFields.put("edo_iss_ofc_cd", "edoIssOfcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("edo_trsm_usr_id", "edoTrsmUsrId");
		this.hashFields.put("edo_rqst_no", "edoRqstNo");
		this.hashFields.put("payr_bank_acct_no", "payrBankAcctNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
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
	 * @return edoTrsmDt
	 */
	public String getEdoTrsmDt() {
		return this.edoTrsmDt;
	}
	
	/**
	 * Column Info
	 * @return payrBankNm
	 */
	public String getPayrBankNm() {
		return this.payrBankNm;
	}
	
	/**
	 * Column Info
	 * @return rqstEdoIssDt
	 */
	public String getRqstEdoIssDt() {
		return this.rqstEdoIssDt;
	}
	
	/**
	 * Column Info
	 * @return payAmtCtnt
	 */
	public String getPayAmtCtnt() {
		return this.payAmtCtnt;
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
	 * @return payrNm
	 */
	public String getPayrNm() {
		return this.payrNm;
	}
	
	/**
	 * Column Info
	 * @return edoXterPrnrAckCd
	 */
	public String getEdoXterPrnrAckCd() {
		return this.edoXterPrnrAckCd;
	}
	
	/**
	 * Column Info
	 * @return edoRqstSeq
	 */
	public String getEdoRqstSeq() {
		return this.edoRqstSeq;
	}
	
	/**
	 * Column Info
	 * @return hndlOfcCd
	 */
	public String getHndlOfcCd() {
		return this.hndlOfcCd;
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
	 * @return payCurrCd
	 */
	public String getPayCurrCd() {
		return this.payCurrCd;
	}
	
	/**
	 * Column Info
	 * @return edoIssOfcCd
	 */
	public String getEdoIssOfcCd() {
		return this.edoIssOfcCd;
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
	 * @return edoTrsmUsrId
	 */
	public String getEdoTrsmUsrId() {
		return this.edoTrsmUsrId;
	}
	
	/**
	 * Column Info
	 * @return edoRqstNo
	 */
	public String getEdoRqstNo() {
		return this.edoRqstNo;
	}
	
	/**
	 * Column Info
	 * @return payrBankAcctNo
	 */
	public String getPayrBankAcctNo() {
		return this.payrBankAcctNo;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param edoTrsmDt
	 */
	public void setEdoTrsmDt(String edoTrsmDt) {
		this.edoTrsmDt = edoTrsmDt;
	}
	
	/**
	 * Column Info
	 * @param payrBankNm
	 */
	public void setPayrBankNm(String payrBankNm) {
		this.payrBankNm = payrBankNm;
	}
	
	/**
	 * Column Info
	 * @param rqstEdoIssDt
	 */
	public void setRqstEdoIssDt(String rqstEdoIssDt) {
		this.rqstEdoIssDt = rqstEdoIssDt;
	}
	
	/**
	 * Column Info
	 * @param payAmtCtnt
	 */
	public void setPayAmtCtnt(String payAmtCtnt) {
		this.payAmtCtnt = payAmtCtnt;
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
	 * @param payrNm
	 */
	public void setPayrNm(String payrNm) {
		this.payrNm = payrNm;
	}
	
	/**
	 * Column Info
	 * @param edoXterPrnrAckCd
	 */
	public void setEdoXterPrnrAckCd(String edoXterPrnrAckCd) {
		this.edoXterPrnrAckCd = edoXterPrnrAckCd;
	}
	
	/**
	 * Column Info
	 * @param edoRqstSeq
	 */
	public void setEdoRqstSeq(String edoRqstSeq) {
		this.edoRqstSeq = edoRqstSeq;
	}
	
	/**
	 * Column Info
	 * @param hndlOfcCd
	 */
	public void setHndlOfcCd(String hndlOfcCd) {
		this.hndlOfcCd = hndlOfcCd;
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
	 * @param payCurrCd
	 */
	public void setPayCurrCd(String payCurrCd) {
		this.payCurrCd = payCurrCd;
	}
	
	/**
	 * Column Info
	 * @param edoIssOfcCd
	 */
	public void setEdoIssOfcCd(String edoIssOfcCd) {
		this.edoIssOfcCd = edoIssOfcCd;
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
	 * @param edoTrsmUsrId
	 */
	public void setEdoTrsmUsrId(String edoTrsmUsrId) {
		this.edoTrsmUsrId = edoTrsmUsrId;
	}
	
	/**
	 * Column Info
	 * @param edoRqstNo
	 */
	public void setEdoRqstNo(String edoRqstNo) {
		this.edoRqstNo = edoRqstNo;
	}
	
	/**
	 * Column Info
	 * @param payrBankAcctNo
	 */
	public void setPayrBankAcctNo(String payrBankAcctNo) {
		this.payrBankAcctNo = payrBankAcctNo;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setEdoTrsmDt(JSPUtil.getParameter(request, "edo_trsm_dt", ""));
		setPayrBankNm(JSPUtil.getParameter(request, "payr_bank_nm", ""));
		setRqstEdoIssDt(JSPUtil.getParameter(request, "rqst_edo_iss_dt", ""));
		setPayAmtCtnt(JSPUtil.getParameter(request, "pay_amt_ctnt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPayrNm(JSPUtil.getParameter(request, "payr_nm", ""));
		setEdoXterPrnrAckCd(JSPUtil.getParameter(request, "edo_xter_prnr_ack_cd", ""));
		setEdoRqstSeq(JSPUtil.getParameter(request, "edo_rqst_seq", ""));
		setHndlOfcCd(JSPUtil.getParameter(request, "hndl_ofc_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPayCurrCd(JSPUtil.getParameter(request, "pay_curr_cd", ""));
		setEdoIssOfcCd(JSPUtil.getParameter(request, "edo_iss_ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setEdoTrsmUsrId(JSPUtil.getParameter(request, "edo_trsm_usr_id", ""));
		setEdoRqstNo(JSPUtil.getParameter(request, "edo_rqst_no", ""));
		setPayrBankAcctNo(JSPUtil.getParameter(request, "payr_bank_acct_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgEdoDoVO[]
	 */
	public BkgEdoDoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgEdoDoVO[]
	 */
	public BkgEdoDoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgEdoDoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] edoTrsmDt = (JSPUtil.getParameter(request, prefix	+ "edo_trsm_dt", length));
			String[] payrBankNm = (JSPUtil.getParameter(request, prefix	+ "payr_bank_nm", length));
			String[] rqstEdoIssDt = (JSPUtil.getParameter(request, prefix	+ "rqst_edo_iss_dt", length));
			String[] payAmtCtnt = (JSPUtil.getParameter(request, prefix	+ "pay_amt_ctnt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] payrNm = (JSPUtil.getParameter(request, prefix	+ "payr_nm", length));
			String[] edoXterPrnrAckCd = (JSPUtil.getParameter(request, prefix	+ "edo_xter_prnr_ack_cd", length));
			String[] edoRqstSeq = (JSPUtil.getParameter(request, prefix	+ "edo_rqst_seq", length));
			String[] hndlOfcCd = (JSPUtil.getParameter(request, prefix	+ "hndl_ofc_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] payCurrCd = (JSPUtil.getParameter(request, prefix	+ "pay_curr_cd", length));
			String[] edoIssOfcCd = (JSPUtil.getParameter(request, prefix	+ "edo_iss_ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] edoTrsmUsrId = (JSPUtil.getParameter(request, prefix	+ "edo_trsm_usr_id", length));
			String[] edoRqstNo = (JSPUtil.getParameter(request, prefix	+ "edo_rqst_no", length));
			String[] payrBankAcctNo = (JSPUtil.getParameter(request, prefix	+ "payr_bank_acct_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgEdoDoVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (edoTrsmDt[i] != null)
					model.setEdoTrsmDt(edoTrsmDt[i]);
				if (payrBankNm[i] != null)
					model.setPayrBankNm(payrBankNm[i]);
				if (rqstEdoIssDt[i] != null)
					model.setRqstEdoIssDt(rqstEdoIssDt[i]);
				if (payAmtCtnt[i] != null)
					model.setPayAmtCtnt(payAmtCtnt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (payrNm[i] != null)
					model.setPayrNm(payrNm[i]);
				if (edoXterPrnrAckCd[i] != null)
					model.setEdoXterPrnrAckCd(edoXterPrnrAckCd[i]);
				if (edoRqstSeq[i] != null)
					model.setEdoRqstSeq(edoRqstSeq[i]);
				if (hndlOfcCd[i] != null)
					model.setHndlOfcCd(hndlOfcCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (payCurrCd[i] != null)
					model.setPayCurrCd(payCurrCd[i]);
				if (edoIssOfcCd[i] != null)
					model.setEdoIssOfcCd(edoIssOfcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (edoTrsmUsrId[i] != null)
					model.setEdoTrsmUsrId(edoTrsmUsrId[i]);
				if (edoRqstNo[i] != null)
					model.setEdoRqstNo(edoRqstNo[i]);
				if (payrBankAcctNo[i] != null)
					model.setPayrBankAcctNo(payrBankAcctNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgEdoDoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgEdoDoVO[]
	 */
	public BkgEdoDoVO[] getBkgEdoDoVOs(){
		BkgEdoDoVO[] vos = (BkgEdoDoVO[])models.toArray(new BkgEdoDoVO[models.size()]);
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
		this.edoTrsmDt = this.edoTrsmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payrBankNm = this.payrBankNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstEdoIssDt = this.rqstEdoIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payAmtCtnt = this.payAmtCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payrNm = this.payrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoXterPrnrAckCd = this.edoXterPrnrAckCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoRqstSeq = this.edoRqstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hndlOfcCd = this.hndlOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payCurrCd = this.payCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoIssOfcCd = this.edoIssOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoTrsmUsrId = this.edoTrsmUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoRqstNo = this.edoRqstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payrBankAcctNo = this.payrBankAcctNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
