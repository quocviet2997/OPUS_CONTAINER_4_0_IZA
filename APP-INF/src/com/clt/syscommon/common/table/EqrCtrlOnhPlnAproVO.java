/*=========================================================
*Copyright(c) 2013 CyberLogitec
*@FileName : EqrCtrlOnhPlnAproVO.java
*@FileTitle : EqrCtrlOnhPlnAproVO
*Open Issues :
*Change history :
*@LastModifyDate : 2013.12.18
*@LastModifier : 
*@LastVersion : 1.0
* 2013.12.18  
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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EqrCtrlOnhPlnAproVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrCtrlOnhPlnAproVO> models = new ArrayList<EqrCtrlOnhPlnAproVO>();
	
	/* Column Info */
	private String aproRmk = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String onhPkupYrwk = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rccCd = null;
	/* Column Info */
	private String lseRqstNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String eqLstmCd = null;
	/* Column Info */
	private String lccCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String onhPlnYrwk = null;
	/* Column Info */
	private String onhOrdYr = null;
	/* Column Info */
	private String lsePlnSeq = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrCtrlOnhPlnAproVO() {}

	public EqrCtrlOnhPlnAproVO(String ibflag, String pagerows, String onhPlnYrwk, String lccCd, String eqLstmCd, String lsePlnSeq, String lseRqstNo, String rccCd, String aproRmk, String creUsrId, String creDt, String updUsrId, String updDt, String onhPkupYrwk, String onhOrdYr) {
		this.aproRmk = aproRmk;
		this.updDt = updDt;
		this.onhPkupYrwk = onhPkupYrwk;
		this.creDt = creDt;
		this.rccCd = rccCd;
		this.lseRqstNo = lseRqstNo;
		this.pagerows = pagerows;
		this.eqLstmCd = eqLstmCd;
		this.lccCd = lccCd;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.onhPlnYrwk = onhPlnYrwk;
		this.onhOrdYr = onhOrdYr;
		this.lsePlnSeq = lsePlnSeq;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("apro_rmk", getAproRmk());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("onh_pkup_yrwk", getOnhPkupYrwk());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rcc_cd", getRccCd());
		this.hashColumns.put("lse_rqst_no", getLseRqstNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("eq_lstm_cd", getEqLstmCd());
		this.hashColumns.put("lcc_cd", getLccCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("onh_pln_yrwk", getOnhPlnYrwk());
		this.hashColumns.put("onh_ord_yr", getOnhOrdYr());
		this.hashColumns.put("lse_pln_seq", getLsePlnSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("apro_rmk", "aproRmk");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("onh_pkup_yrwk", "onhPkupYrwk");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rcc_cd", "rccCd");
		this.hashFields.put("lse_rqst_no", "lseRqstNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("eq_lstm_cd", "eqLstmCd");
		this.hashFields.put("lcc_cd", "lccCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("onh_pln_yrwk", "onhPlnYrwk");
		this.hashFields.put("onh_ord_yr", "onhOrdYr");
		this.hashFields.put("lse_pln_seq", "lsePlnSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return aproRmk
	 */
	public String getAproRmk() {
		return this.aproRmk;
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
	 * @return onhPkupYrwk
	 */
	public String getOnhPkupYrwk() {
		return this.onhPkupYrwk;
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
	 * @return rccCd
	 */
	public String getRccCd() {
		return this.rccCd;
	}
	
	/**
	 * Column Info
	 * @return lseRqstNo
	 */
	public String getLseRqstNo() {
		return this.lseRqstNo;
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
	 * @return onhPlnYrwk
	 */
	public String getOnhPlnYrwk() {
		return this.onhPlnYrwk;
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
	 * @return lsePlnSeq
	 */
	public String getLsePlnSeq() {
		return this.lsePlnSeq;
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
	 * @param aproRmk
	 */
	public void setAproRmk(String aproRmk) {
		this.aproRmk = aproRmk;
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
	 * @param onhPkupYrwk
	 */
	public void setOnhPkupYrwk(String onhPkupYrwk) {
		this.onhPkupYrwk = onhPkupYrwk;
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
	 * @param rccCd
	 */
	public void setRccCd(String rccCd) {
		this.rccCd = rccCd;
	}
	
	/**
	 * Column Info
	 * @param lseRqstNo
	 */
	public void setLseRqstNo(String lseRqstNo) {
		this.lseRqstNo = lseRqstNo;
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
	 * @param onhPlnYrwk
	 */
	public void setOnhPlnYrwk(String onhPlnYrwk) {
		this.onhPlnYrwk = onhPlnYrwk;
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
	 * @param lsePlnSeq
	 */
	public void setLsePlnSeq(String lsePlnSeq) {
		this.lsePlnSeq = lsePlnSeq;
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
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setAproRmk(JSPUtil.getParameter(request, prefix + "apro_rmk", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setOnhPkupYrwk(JSPUtil.getParameter(request, prefix + "onh_pkup_yrwk", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setRccCd(JSPUtil.getParameter(request, prefix + "rcc_cd", ""));
		setLseRqstNo(JSPUtil.getParameter(request, prefix + "lse_rqst_no", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setEqLstmCd(JSPUtil.getParameter(request, prefix + "eq_lstm_cd", ""));
		setLccCd(JSPUtil.getParameter(request, prefix + "lcc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setOnhPlnYrwk(JSPUtil.getParameter(request, prefix + "onh_pln_yrwk", ""));
		setOnhOrdYr(JSPUtil.getParameter(request, prefix + "onh_ord_yr", ""));
		setLsePlnSeq(JSPUtil.getParameter(request, prefix + "lse_pln_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrCtrlOnhPlnAproVO[]
	 */
	public EqrCtrlOnhPlnAproVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrCtrlOnhPlnAproVO[]
	 */
	public EqrCtrlOnhPlnAproVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrCtrlOnhPlnAproVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] aproRmk = (JSPUtil.getParameter(request, prefix	+ "apro_rmk", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] onhPkupYrwk = (JSPUtil.getParameter(request, prefix	+ "onh_pkup_yrwk", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] rccCd = (JSPUtil.getParameter(request, prefix	+ "rcc_cd", length));
			String[] lseRqstNo = (JSPUtil.getParameter(request, prefix	+ "lse_rqst_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] eqLstmCd = (JSPUtil.getParameter(request, prefix	+ "eq_lstm_cd", length));
			String[] lccCd = (JSPUtil.getParameter(request, prefix	+ "lcc_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] onhPlnYrwk = (JSPUtil.getParameter(request, prefix	+ "onh_pln_yrwk", length));
			String[] onhOrdYr = (JSPUtil.getParameter(request, prefix	+ "onh_ord_yr", length));
			String[] lsePlnSeq = (JSPUtil.getParameter(request, prefix	+ "lse_pln_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrCtrlOnhPlnAproVO();
				if (aproRmk[i] != null)
					model.setAproRmk(aproRmk[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (onhPkupYrwk[i] != null)
					model.setOnhPkupYrwk(onhPkupYrwk[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rccCd[i] != null)
					model.setRccCd(rccCd[i]);
				if (lseRqstNo[i] != null)
					model.setLseRqstNo(lseRqstNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (eqLstmCd[i] != null)
					model.setEqLstmCd(eqLstmCd[i]);
				if (lccCd[i] != null)
					model.setLccCd(lccCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (onhPlnYrwk[i] != null)
					model.setOnhPlnYrwk(onhPlnYrwk[i]);
				if (onhOrdYr[i] != null)
					model.setOnhOrdYr(onhOrdYr[i]);
				if (lsePlnSeq[i] != null)
					model.setLsePlnSeq(lsePlnSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrCtrlOnhPlnAproVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrCtrlOnhPlnAproVO[]
	 */
	public EqrCtrlOnhPlnAproVO[] getEqrCtrlOnhPlnAproVOs(){
		EqrCtrlOnhPlnAproVO[] vos = (EqrCtrlOnhPlnAproVO[])models.toArray(new EqrCtrlOnhPlnAproVO[models.size()]);
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
		this.aproRmk = this.aproRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onhPkupYrwk = this.onhPkupYrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rccCd = this.rccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseRqstNo = this.lseRqstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqLstmCd = this.eqLstmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lccCd = this.lccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onhPlnYrwk = this.onhPlnYrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onhOrdYr = this.onhOrdYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lsePlnSeq = this.lsePlnSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
