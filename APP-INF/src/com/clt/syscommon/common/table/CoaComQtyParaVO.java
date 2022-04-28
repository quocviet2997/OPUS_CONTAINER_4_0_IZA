/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaComQtyParaVO.java
*@FileTitle : CoaComQtyParaVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : 임옥영
*@LastVersion : 1.0
* 2009.09.25 임옥영 
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
 * @author 임옥영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CoaComQtyParaVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaComQtyParaVO> models = new ArrayList<CoaComQtyParaVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String estmOpfitAmt = null;
	/* Column Info */
	private String raOpfitAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String bkgRev = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String pctlNo = null;
	/* Column Info */
	private String bkgOftRev = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgQty = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String estmCmAmt = null;
	/* Column Info */
	private String raCmAmt = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaComQtyParaVO() {}

	public CoaComQtyParaVO(String ibflag, String pagerows, String pctlNo, String cntrTpszCd, String bkgRev, String bkgOftRev, String bkgQty, String estmCmAmt, String estmOpfitAmt, String raOpfitAmt, String raCmAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.estmOpfitAmt = estmOpfitAmt;
		this.raOpfitAmt = raOpfitAmt;
		this.creDt = creDt;
		this.bkgRev = bkgRev;
		this.pagerows = pagerows;
		this.pctlNo = pctlNo;
		this.bkgOftRev = bkgOftRev;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.bkgQty = bkgQty;
		this.cntrTpszCd = cntrTpszCd;
		this.estmCmAmt = estmCmAmt;
		this.raCmAmt = raCmAmt;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("estm_opfit_amt", getEstmOpfitAmt());
		this.hashColumns.put("ra_opfit_amt", getRaOpfitAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bkg_rev", getBkgRev());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pctl_no", getPctlNo());
		this.hashColumns.put("bkg_oft_rev", getBkgOftRev());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_qty", getBkgQty());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("estm_cm_amt", getEstmCmAmt());
		this.hashColumns.put("ra_cm_amt", getRaCmAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("estm_opfit_amt", "estmOpfitAmt");
		this.hashFields.put("ra_opfit_amt", "raOpfitAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bkg_rev", "bkgRev");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pctl_no", "pctlNo");
		this.hashFields.put("bkg_oft_rev", "bkgOftRev");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_qty", "bkgQty");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("estm_cm_amt", "estmCmAmt");
		this.hashFields.put("ra_cm_amt", "raCmAmt");
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
	 * @return estmOpfitAmt
	 */
	public String getEstmOpfitAmt() {
		return this.estmOpfitAmt;
	}
	
	/**
	 * Column Info
	 * @return raOpfitAmt
	 */
	public String getRaOpfitAmt() {
		return this.raOpfitAmt;
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
	 * @return bkgRev
	 */
	public String getBkgRev() {
		return this.bkgRev;
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
	 * @return pctlNo
	 */
	public String getPctlNo() {
		return this.pctlNo;
	}
	
	/**
	 * Column Info
	 * @return bkgOftRev
	 */
	public String getBkgOftRev() {
		return this.bkgOftRev;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return bkgQty
	 */
	public String getBkgQty() {
		return this.bkgQty;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return estmCmAmt
	 */
	public String getEstmCmAmt() {
		return this.estmCmAmt;
	}
	
	/**
	 * Column Info
	 * @return raCmAmt
	 */
	public String getRaCmAmt() {
		return this.raCmAmt;
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
	 * @param estmOpfitAmt
	 */
	public void setEstmOpfitAmt(String estmOpfitAmt) {
		this.estmOpfitAmt = estmOpfitAmt;
	}
	
	/**
	 * Column Info
	 * @param raOpfitAmt
	 */
	public void setRaOpfitAmt(String raOpfitAmt) {
		this.raOpfitAmt = raOpfitAmt;
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
	 * @param bkgRev
	 */
	public void setBkgRev(String bkgRev) {
		this.bkgRev = bkgRev;
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
	 * @param pctlNo
	 */
	public void setPctlNo(String pctlNo) {
		this.pctlNo = pctlNo;
	}
	
	/**
	 * Column Info
	 * @param bkgOftRev
	 */
	public void setBkgOftRev(String bkgOftRev) {
		this.bkgOftRev = bkgOftRev;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param bkgQty
	 */
	public void setBkgQty(String bkgQty) {
		this.bkgQty = bkgQty;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param estmCmAmt
	 */
	public void setEstmCmAmt(String estmCmAmt) {
		this.estmCmAmt = estmCmAmt;
	}
	
	/**
	 * Column Info
	 * @param raCmAmt
	 */
	public void setRaCmAmt(String raCmAmt) {
		this.raCmAmt = raCmAmt;
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
		setEstmOpfitAmt(JSPUtil.getParameter(request, "estm_opfit_amt", ""));
		setRaOpfitAmt(JSPUtil.getParameter(request, "ra_opfit_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setBkgRev(JSPUtil.getParameter(request, "bkg_rev", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPctlNo(JSPUtil.getParameter(request, "pctl_no", ""));
		setBkgOftRev(JSPUtil.getParameter(request, "bkg_oft_rev", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgQty(JSPUtil.getParameter(request, "bkg_qty", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setEstmCmAmt(JSPUtil.getParameter(request, "estm_cm_amt", ""));
		setRaCmAmt(JSPUtil.getParameter(request, "ra_cm_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaComQtyParaVO[]
	 */
	public CoaComQtyParaVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaComQtyParaVO[]
	 */
	public CoaComQtyParaVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaComQtyParaVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] estmOpfitAmt = (JSPUtil.getParameter(request, prefix	+ "estm_opfit_amt", length));
			String[] raOpfitAmt = (JSPUtil.getParameter(request, prefix	+ "ra_opfit_amt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] bkgRev = (JSPUtil.getParameter(request, prefix	+ "bkg_rev", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] pctlNo = (JSPUtil.getParameter(request, prefix	+ "pctl_no", length));
			String[] bkgOftRev = (JSPUtil.getParameter(request, prefix	+ "bkg_oft_rev", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgQty = (JSPUtil.getParameter(request, prefix	+ "bkg_qty", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] estmCmAmt = (JSPUtil.getParameter(request, prefix	+ "estm_cm_amt", length));
			String[] raCmAmt = (JSPUtil.getParameter(request, prefix	+ "ra_cm_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaComQtyParaVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (estmOpfitAmt[i] != null)
					model.setEstmOpfitAmt(estmOpfitAmt[i]);
				if (raOpfitAmt[i] != null)
					model.setRaOpfitAmt(raOpfitAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (bkgRev[i] != null)
					model.setBkgRev(bkgRev[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (pctlNo[i] != null)
					model.setPctlNo(pctlNo[i]);
				if (bkgOftRev[i] != null)
					model.setBkgOftRev(bkgOftRev[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgQty[i] != null)
					model.setBkgQty(bkgQty[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (estmCmAmt[i] != null)
					model.setEstmCmAmt(estmCmAmt[i]);
				if (raCmAmt[i] != null)
					model.setRaCmAmt(raCmAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaComQtyParaVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaComQtyParaVO[]
	 */
	public CoaComQtyParaVO[] getCoaComQtyParaVOs(){
		CoaComQtyParaVO[] vos = (CoaComQtyParaVO[])models.toArray(new CoaComQtyParaVO[models.size()]);
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
		this.estmOpfitAmt = this.estmOpfitAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raOpfitAmt = this.raOpfitAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRev = this.bkgRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pctlNo = this.pctlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgOftRev = this.bkgOftRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgQty = this.bkgQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmCmAmt = this.estmCmAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raCmAmt = this.raCmAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
