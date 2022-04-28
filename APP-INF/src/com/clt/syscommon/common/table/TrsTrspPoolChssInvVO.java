/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TrsTrspPoolChssInvVO.java
*@FileTitle : TrsTrspPoolChssInvVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.05
*@LastModifier : 양봉준
*@LastVersion : 1.0
* 2009.07.05 양봉준 
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
 * @author 양봉준
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TrsTrspPoolChssInvVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsTrspPoolChssInvVO> models = new ArrayList<TrsTrspPoolChssInvVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String hndlPrdToDt = null;
	/* Column Info */
	private String trspPoolChssInvAmt = null;
	/* Column Info */
	private String invVndrSeq = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String trspPoolChssTaxAmt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String hndlPrdFmDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String subInvSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String trspPoolChssQty = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TrsTrspPoolChssInvVO() {}

	public TrsTrspPoolChssInvVO(String ibflag, String pagerows, String invNo, String invVndrSeq, String subInvSeq, String trspPoolChssQty, String trspPoolChssInvAmt, String trspPoolChssTaxAmt, String hndlPrdFmDt, String hndlPrdToDt, String deltFlg, String creOfcCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.hndlPrdToDt = hndlPrdToDt;
		this.trspPoolChssInvAmt = trspPoolChssInvAmt;
		this.invVndrSeq = invVndrSeq;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.invNo = invNo;
		this.trspPoolChssTaxAmt = trspPoolChssTaxAmt;
		this.ibflag = ibflag;
		this.hndlPrdFmDt = hndlPrdFmDt;
		this.creUsrId = creUsrId;
		this.creOfcCd = creOfcCd;
		this.subInvSeq = subInvSeq;
		this.updUsrId = updUsrId;
		this.trspPoolChssQty = trspPoolChssQty;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("hndl_prd_to_dt", getHndlPrdToDt());
		this.hashColumns.put("trsp_pool_chss_inv_amt", getTrspPoolChssInvAmt());
		this.hashColumns.put("inv_vndr_seq", getInvVndrSeq());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("trsp_pool_chss_tax_amt", getTrspPoolChssTaxAmt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("hndl_prd_fm_dt", getHndlPrdFmDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("sub_inv_seq", getSubInvSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("trsp_pool_chss_qty", getTrspPoolChssQty());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("hndl_prd_to_dt", "hndlPrdToDt");
		this.hashFields.put("trsp_pool_chss_inv_amt", "trspPoolChssInvAmt");
		this.hashFields.put("inv_vndr_seq", "invVndrSeq");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("trsp_pool_chss_tax_amt", "trspPoolChssTaxAmt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("hndl_prd_fm_dt", "hndlPrdFmDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("sub_inv_seq", "subInvSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("trsp_pool_chss_qty", "trspPoolChssQty");
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
	 * @return hndlPrdToDt
	 */
	public String getHndlPrdToDt() {
		return this.hndlPrdToDt;
	}
	
	/**
	 * Column Info
	 * @return trspPoolChssInvAmt
	 */
	public String getTrspPoolChssInvAmt() {
		return this.trspPoolChssInvAmt;
	}
	
	/**
	 * Column Info
	 * @return invVndrSeq
	 */
	public String getInvVndrSeq() {
		return this.invVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return invNo
	 */
	public String getInvNo() {
		return this.invNo;
	}
	
	/**
	 * Column Info
	 * @return trspPoolChssTaxAmt
	 */
	public String getTrspPoolChssTaxAmt() {
		return this.trspPoolChssTaxAmt;
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
	 * @return hndlPrdFmDt
	 */
	public String getHndlPrdFmDt() {
		return this.hndlPrdFmDt;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return creOfcCd
	 */
	public String getCreOfcCd() {
		return this.creOfcCd;
	}
	
	/**
	 * Column Info
	 * @return subInvSeq
	 */
	public String getSubInvSeq() {
		return this.subInvSeq;
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
	 * @return trspPoolChssQty
	 */
	public String getTrspPoolChssQty() {
		return this.trspPoolChssQty;
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
	 * @param hndlPrdToDt
	 */
	public void setHndlPrdToDt(String hndlPrdToDt) {
		this.hndlPrdToDt = hndlPrdToDt;
	}
	
	/**
	 * Column Info
	 * @param trspPoolChssInvAmt
	 */
	public void setTrspPoolChssInvAmt(String trspPoolChssInvAmt) {
		this.trspPoolChssInvAmt = trspPoolChssInvAmt;
	}
	
	/**
	 * Column Info
	 * @param invVndrSeq
	 */
	public void setInvVndrSeq(String invVndrSeq) {
		this.invVndrSeq = invVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
	 * @param invNo
	 */
	public void setInvNo(String invNo) {
		this.invNo = invNo;
	}
	
	/**
	 * Column Info
	 * @param trspPoolChssTaxAmt
	 */
	public void setTrspPoolChssTaxAmt(String trspPoolChssTaxAmt) {
		this.trspPoolChssTaxAmt = trspPoolChssTaxAmt;
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
	 * @param hndlPrdFmDt
	 */
	public void setHndlPrdFmDt(String hndlPrdFmDt) {
		this.hndlPrdFmDt = hndlPrdFmDt;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param creOfcCd
	 */
	public void setCreOfcCd(String creOfcCd) {
		this.creOfcCd = creOfcCd;
	}
	
	/**
	 * Column Info
	 * @param subInvSeq
	 */
	public void setSubInvSeq(String subInvSeq) {
		this.subInvSeq = subInvSeq;
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
	 * @param trspPoolChssQty
	 */
	public void setTrspPoolChssQty(String trspPoolChssQty) {
		this.trspPoolChssQty = trspPoolChssQty;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setHndlPrdToDt(JSPUtil.getParameter(request, "hndl_prd_to_dt", ""));
		setTrspPoolChssInvAmt(JSPUtil.getParameter(request, "trsp_pool_chss_inv_amt", ""));
		setInvVndrSeq(JSPUtil.getParameter(request, "inv_vndr_seq", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setInvNo(JSPUtil.getParameter(request, "inv_no", ""));
		setTrspPoolChssTaxAmt(JSPUtil.getParameter(request, "trsp_pool_chss_tax_amt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setHndlPrdFmDt(JSPUtil.getParameter(request, "hndl_prd_fm_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setSubInvSeq(JSPUtil.getParameter(request, "sub_inv_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setTrspPoolChssQty(JSPUtil.getParameter(request, "trsp_pool_chss_qty", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsTrspPoolChssInvVO[]
	 */
	public TrsTrspPoolChssInvVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsTrspPoolChssInvVO[]
	 */
	public TrsTrspPoolChssInvVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspPoolChssInvVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] hndlPrdToDt = (JSPUtil.getParameter(request, prefix	+ "hndl_prd_to_dt", length));
			String[] trspPoolChssInvAmt = (JSPUtil.getParameter(request, prefix	+ "trsp_pool_chss_inv_amt", length));
			String[] invVndrSeq = (JSPUtil.getParameter(request, prefix	+ "inv_vndr_seq", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] trspPoolChssTaxAmt = (JSPUtil.getParameter(request, prefix	+ "trsp_pool_chss_tax_amt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] hndlPrdFmDt = (JSPUtil.getParameter(request, prefix	+ "hndl_prd_fm_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] subInvSeq = (JSPUtil.getParameter(request, prefix	+ "sub_inv_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] trspPoolChssQty = (JSPUtil.getParameter(request, prefix	+ "trsp_pool_chss_qty", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsTrspPoolChssInvVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (hndlPrdToDt[i] != null)
					model.setHndlPrdToDt(hndlPrdToDt[i]);
				if (trspPoolChssInvAmt[i] != null)
					model.setTrspPoolChssInvAmt(trspPoolChssInvAmt[i]);
				if (invVndrSeq[i] != null)
					model.setInvVndrSeq(invVndrSeq[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (trspPoolChssTaxAmt[i] != null)
					model.setTrspPoolChssTaxAmt(trspPoolChssTaxAmt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (hndlPrdFmDt[i] != null)
					model.setHndlPrdFmDt(hndlPrdFmDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (subInvSeq[i] != null)
					model.setSubInvSeq(subInvSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (trspPoolChssQty[i] != null)
					model.setTrspPoolChssQty(trspPoolChssQty[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsTrspPoolChssInvVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsTrspPoolChssInvVO[]
	 */
	public TrsTrspPoolChssInvVO[] getTrsTrspPoolChssInvVOs(){
		TrsTrspPoolChssInvVO[] vos = (TrsTrspPoolChssInvVO[])models.toArray(new TrsTrspPoolChssInvVO[models.size()]);
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
		this.hndlPrdToDt = this.hndlPrdToDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspPoolChssInvAmt = this.trspPoolChssInvAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invVndrSeq = this.invVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspPoolChssTaxAmt = this.trspPoolChssTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hndlPrdFmDt = this.hndlPrdFmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subInvSeq = this.subInvSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspPoolChssQty = this.trspPoolChssQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
