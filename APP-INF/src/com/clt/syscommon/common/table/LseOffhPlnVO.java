/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : LseOffhPlnVO.java
*@FileTitle : LseOffhPlnVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.23
*@LastModifier : 노정용
*@LastVersion : 1.0
* 2009.06.23 노정용 
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
 * @author 노정용
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class LseOffhPlnVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<LseOffhPlnVO> models = new ArrayList<LseOffhPlnVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String offhLocCd = null;
	/* Column Info */
	private String offhQty = null;
	/* Column Info */
	private String offhRgnLocCd = null;
	/* Column Info */
	private String offhPlnTpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String plnSeq = null;
	/* Column Info */
	private String offhVerSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String offhYrmon = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String plnYr = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String lstmCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String offhLocTpCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public LseOffhPlnVO() {}

	public LseOffhPlnVO(String ibflag, String pagerows, String plnYr, String plnSeq, String offhVerSeq, String offhYrmon, String offhPlnTpCd, String offhLocTpCd, String offhRgnLocCd, String cntrTpszCd, String offhLocCd, String offhQty, String lstmCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.offhLocCd = offhLocCd;
		this.offhQty = offhQty;
		this.offhRgnLocCd = offhRgnLocCd;
		this.offhPlnTpCd = offhPlnTpCd;
		this.creDt = creDt;
		this.plnSeq = plnSeq;
		this.offhVerSeq = offhVerSeq;
		this.pagerows = pagerows;
		this.offhYrmon = offhYrmon;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.plnYr = plnYr;
		this.cntrTpszCd = cntrTpszCd;
		this.lstmCd = lstmCd;
		this.updUsrId = updUsrId;
		this.offhLocTpCd = offhLocTpCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("offh_loc_cd", getOffhLocCd());
		this.hashColumns.put("offh_qty", getOffhQty());
		this.hashColumns.put("offh_rgn_loc_cd", getOffhRgnLocCd());
		this.hashColumns.put("offh_pln_tp_cd", getOffhPlnTpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pln_seq", getPlnSeq());
		this.hashColumns.put("offh_ver_seq", getOffhVerSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("offh_yrmon", getOffhYrmon());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pln_yr", getPlnYr());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("lstm_cd", getLstmCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("offh_loc_tp_cd", getOffhLocTpCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("offh_loc_cd", "offhLocCd");
		this.hashFields.put("offh_qty", "offhQty");
		this.hashFields.put("offh_rgn_loc_cd", "offhRgnLocCd");
		this.hashFields.put("offh_pln_tp_cd", "offhPlnTpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pln_seq", "plnSeq");
		this.hashFields.put("offh_ver_seq", "offhVerSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("offh_yrmon", "offhYrmon");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pln_yr", "plnYr");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("lstm_cd", "lstmCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("offh_loc_tp_cd", "offhLocTpCd");
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
	 * @return offhLocCd
	 */
	public String getOffhLocCd() {
		return this.offhLocCd;
	}
	
	/**
	 * Column Info
	 * @return offhQty
	 */
	public String getOffhQty() {
		return this.offhQty;
	}
	
	/**
	 * Column Info
	 * @return offhRgnLocCd
	 */
	public String getOffhRgnLocCd() {
		return this.offhRgnLocCd;
	}
	
	/**
	 * Column Info
	 * @return offhPlnTpCd
	 */
	public String getOffhPlnTpCd() {
		return this.offhPlnTpCd;
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
	 * @return plnSeq
	 */
	public String getPlnSeq() {
		return this.plnSeq;
	}
	
	/**
	 * Column Info
	 * @return offhVerSeq
	 */
	public String getOffhVerSeq() {
		return this.offhVerSeq;
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
	 * @return offhYrmon
	 */
	public String getOffhYrmon() {
		return this.offhYrmon;
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
	 * @return plnYr
	 */
	public String getPlnYr() {
		return this.plnYr;
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
	 * @return lstmCd
	 */
	public String getLstmCd() {
		return this.lstmCd;
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
	 * @return offhLocTpCd
	 */
	public String getOffhLocTpCd() {
		return this.offhLocTpCd;
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
	 * @param offhLocCd
	 */
	public void setOffhLocCd(String offhLocCd) {
		this.offhLocCd = offhLocCd;
	}
	
	/**
	 * Column Info
	 * @param offhQty
	 */
	public void setOffhQty(String offhQty) {
		this.offhQty = offhQty;
	}
	
	/**
	 * Column Info
	 * @param offhRgnLocCd
	 */
	public void setOffhRgnLocCd(String offhRgnLocCd) {
		this.offhRgnLocCd = offhRgnLocCd;
	}
	
	/**
	 * Column Info
	 * @param offhPlnTpCd
	 */
	public void setOffhPlnTpCd(String offhPlnTpCd) {
		this.offhPlnTpCd = offhPlnTpCd;
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
	 * @param plnSeq
	 */
	public void setPlnSeq(String plnSeq) {
		this.plnSeq = plnSeq;
	}
	
	/**
	 * Column Info
	 * @param offhVerSeq
	 */
	public void setOffhVerSeq(String offhVerSeq) {
		this.offhVerSeq = offhVerSeq;
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
	 * @param offhYrmon
	 */
	public void setOffhYrmon(String offhYrmon) {
		this.offhYrmon = offhYrmon;
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
	 * @param plnYr
	 */
	public void setPlnYr(String plnYr) {
		this.plnYr = plnYr;
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
	 * @param lstmCd
	 */
	public void setLstmCd(String lstmCd) {
		this.lstmCd = lstmCd;
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
	 * @param offhLocTpCd
	 */
	public void setOffhLocTpCd(String offhLocTpCd) {
		this.offhLocTpCd = offhLocTpCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setOffhLocCd(JSPUtil.getParameter(request, "offh_loc_cd", ""));
		setOffhQty(JSPUtil.getParameter(request, "offh_qty", ""));
		setOffhRgnLocCd(JSPUtil.getParameter(request, "offh_rgn_loc_cd", ""));
		setOffhPlnTpCd(JSPUtil.getParameter(request, "offh_pln_tp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPlnSeq(JSPUtil.getParameter(request, "pln_seq", ""));
		setOffhVerSeq(JSPUtil.getParameter(request, "offh_ver_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setOffhYrmon(JSPUtil.getParameter(request, "offh_yrmon", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPlnYr(JSPUtil.getParameter(request, "pln_yr", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setLstmCd(JSPUtil.getParameter(request, "lstm_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setOffhLocTpCd(JSPUtil.getParameter(request, "offh_loc_tp_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return LseOffhPlnVO[]
	 */
	public LseOffhPlnVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return LseOffhPlnVO[]
	 */
	public LseOffhPlnVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		LseOffhPlnVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] offhLocCd = (JSPUtil.getParameter(request, prefix	+ "offh_loc_cd", length));
			String[] offhQty = (JSPUtil.getParameter(request, prefix	+ "offh_qty", length));
			String[] offhRgnLocCd = (JSPUtil.getParameter(request, prefix	+ "offh_rgn_loc_cd", length));
			String[] offhPlnTpCd = (JSPUtil.getParameter(request, prefix	+ "offh_pln_tp_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] plnSeq = (JSPUtil.getParameter(request, prefix	+ "pln_seq", length));
			String[] offhVerSeq = (JSPUtil.getParameter(request, prefix	+ "offh_ver_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] offhYrmon = (JSPUtil.getParameter(request, prefix	+ "offh_yrmon", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] plnYr = (JSPUtil.getParameter(request, prefix	+ "pln_yr", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] lstmCd = (JSPUtil.getParameter(request, prefix	+ "lstm_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] offhLocTpCd = (JSPUtil.getParameter(request, prefix	+ "offh_loc_tp_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new LseOffhPlnVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (offhLocCd[i] != null)
					model.setOffhLocCd(offhLocCd[i]);
				if (offhQty[i] != null)
					model.setOffhQty(offhQty[i]);
				if (offhRgnLocCd[i] != null)
					model.setOffhRgnLocCd(offhRgnLocCd[i]);
				if (offhPlnTpCd[i] != null)
					model.setOffhPlnTpCd(offhPlnTpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (plnSeq[i] != null)
					model.setPlnSeq(plnSeq[i]);
				if (offhVerSeq[i] != null)
					model.setOffhVerSeq(offhVerSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (offhYrmon[i] != null)
					model.setOffhYrmon(offhYrmon[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (plnYr[i] != null)
					model.setPlnYr(plnYr[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (lstmCd[i] != null)
					model.setLstmCd(lstmCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (offhLocTpCd[i] != null)
					model.setOffhLocTpCd(offhLocTpCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getLseOffhPlnVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return LseOffhPlnVO[]
	 */
	public LseOffhPlnVO[] getLseOffhPlnVOs(){
		LseOffhPlnVO[] vos = (LseOffhPlnVO[])models.toArray(new LseOffhPlnVO[models.size()]);
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
		this.offhLocCd = this.offhLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.offhQty = this.offhQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.offhRgnLocCd = this.offhRgnLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.offhPlnTpCd = this.offhPlnTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plnSeq = this.plnSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.offhVerSeq = this.offhVerSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.offhYrmon = this.offhYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plnYr = this.plnYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstmCd = this.lstmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.offhLocTpCd = this.offhLocTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
