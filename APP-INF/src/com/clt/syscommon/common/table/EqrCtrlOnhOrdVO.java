/*=========================================================
*Copyright(c) 2013 CyberLogitec
*@FileName : EqrCtrlOnhOrdVO.java
*@FileTitle : EqrCtrlOnhOrdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2013.07.31
*@LastModifier : 문동선
*@LastVersion : 1.0
* 2013.07.31 문동선 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 문동선
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EqrCtrlOnhOrdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrCtrlOnhOrdVO> models = new ArrayList<EqrCtrlOnhOrdVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String eqLstmCd = null;
	/* Column Info */
	private String lccCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String onhOrdRmk = null;
	/* Column Info */
	private String rccCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String onhOrdYr = null;
	/* Column Info */
	private String lsePrdSeq = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrCtrlOnhOrdVO() {}

	public EqrCtrlOnhOrdVO(String ibflag, String pagerows, String onhOrdYr, String lccCd, String eqLstmCd, String lsePrdSeq, String rccCd, String onhOrdRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.eqLstmCd = eqLstmCd;
		this.lccCd = lccCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.creDt = creDt;
		this.onhOrdRmk = onhOrdRmk;
		this.rccCd = rccCd;
		this.updUsrId = updUsrId;
		this.onhOrdYr = onhOrdYr;
		this.lsePrdSeq = lsePrdSeq;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("eq_lstm_cd", getEqLstmCd());
		this.hashColumns.put("lcc_cd", getLccCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("onh_ord_rmk", getOnhOrdRmk());
		this.hashColumns.put("rcc_cd", getRccCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("onh_ord_yr", getOnhOrdYr());
		this.hashColumns.put("lse_prd_seq", getLsePrdSeq());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("eq_lstm_cd", "eqLstmCd");
		this.hashFields.put("lcc_cd", "lccCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("onh_ord_rmk", "onhOrdRmk");
		this.hashFields.put("rcc_cd", "rccCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("onh_ord_yr", "onhOrdYr");
		this.hashFields.put("lse_prd_seq", "lsePrdSeq");
		this.hashFields.put("pagerows", "pagerows");
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
	 * @return eqLstmCd
	 */
	public String getEqLstmCd() {
		return this.eqLstmCd;
	}
	
	/**
	 * Column Info
	 * @return lccCd
	 */
	public String getLccCd() {
		return this.lccCd;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return onhOrdRmk
	 */
	public String getOnhOrdRmk() {
		return this.onhOrdRmk;
	}
	
	/**
	 * Column Info
	 * @return rccCd
	 */
	public String getRccCd() {
		return this.rccCd;
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
	 * @return onhOrdYr
	 */
	public String getOnhOrdYr() {
		return this.onhOrdYr;
	}
	
	/**
	 * Column Info
	 * @return lsePrdSeq
	 */
	public String getLsePrdSeq() {
		return this.lsePrdSeq;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param eqLstmCd
	 */
	public void setEqLstmCd(String eqLstmCd) {
		this.eqLstmCd = eqLstmCd;
	}
	
	/**
	 * Column Info
	 * @param lccCd
	 */
	public void setLccCd(String lccCd) {
		this.lccCd = lccCd;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param onhOrdRmk
	 */
	public void setOnhOrdRmk(String onhOrdRmk) {
		this.onhOrdRmk = onhOrdRmk;
	}
	
	/**
	 * Column Info
	 * @param rccCd
	 */
	public void setRccCd(String rccCd) {
		this.rccCd = rccCd;
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
	 * @param onhOrdYr
	 */
	public void setOnhOrdYr(String onhOrdYr) {
		this.onhOrdYr = onhOrdYr;
	}
	
	/**
	 * Column Info
	 * @param lsePrdSeq
	 */
	public void setLsePrdSeq(String lsePrdSeq) {
		this.lsePrdSeq = lsePrdSeq;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setEqLstmCd(JSPUtil.getParameter(request, prefix + "eq_lstm_cd", ""));
		setLccCd(JSPUtil.getParameter(request, prefix + "lcc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setOnhOrdRmk(JSPUtil.getParameter(request, prefix + "onh_ord_rmk", ""));
		setRccCd(JSPUtil.getParameter(request, prefix + "rcc_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setOnhOrdYr(JSPUtil.getParameter(request, prefix + "onh_ord_yr", ""));
		setLsePrdSeq(JSPUtil.getParameter(request, prefix + "lse_prd_seq", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrCtrlOnhOrdVO[]
	 */
	public EqrCtrlOnhOrdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrCtrlOnhOrdVO[]
	 */
	public EqrCtrlOnhOrdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrCtrlOnhOrdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] eqLstmCd = (JSPUtil.getParameter(request, prefix	+ "eq_lstm_cd", length));
			String[] lccCd = (JSPUtil.getParameter(request, prefix	+ "lcc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] onhOrdRmk = (JSPUtil.getParameter(request, prefix	+ "onh_ord_rmk", length));
			String[] rccCd = (JSPUtil.getParameter(request, prefix	+ "rcc_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] onhOrdYr = (JSPUtil.getParameter(request, prefix	+ "onh_ord_yr", length));
			String[] lsePrdSeq = (JSPUtil.getParameter(request, prefix	+ "lse_prd_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrCtrlOnhOrdVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (eqLstmCd[i] != null)
					model.setEqLstmCd(eqLstmCd[i]);
				if (lccCd[i] != null)
					model.setLccCd(lccCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (onhOrdRmk[i] != null)
					model.setOnhOrdRmk(onhOrdRmk[i]);
				if (rccCd[i] != null)
					model.setRccCd(rccCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (onhOrdYr[i] != null)
					model.setOnhOrdYr(onhOrdYr[i]);
				if (lsePrdSeq[i] != null)
					model.setLsePrdSeq(lsePrdSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrCtrlOnhOrdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrCtrlOnhOrdVO[]
	 */
	public EqrCtrlOnhOrdVO[] getEqrCtrlOnhOrdVOs(){
		EqrCtrlOnhOrdVO[] vos = (EqrCtrlOnhOrdVO[])models.toArray(new EqrCtrlOnhOrdVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		   return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
	   }

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqLstmCd = this.eqLstmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lccCd = this.lccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onhOrdRmk = this.onhOrdRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rccCd = this.rccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onhOrdYr = this.onhOrdYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lsePrdSeq = this.lsePrdSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
