/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaLaneTsCmmtVO.java
*@FileTitle : CoaLaneTsCmmtVO
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

public class CoaLaneTsCmmtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaLaneTsCmmtVO> models = new ArrayList<CoaLaneTsCmmtVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String toIocCd = null;
	/* Column Info */
	private String toTrdCd = null;
	/* Column Info */
	private String toRlaneCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String tsRtAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String fmTrdCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String fmSkdDirCd = null;
	/* Column Info */
	private String fmRlaneCd = null;
	/* Column Info */
	private String fmIocCd = null;
	/* Column Info */
	private String toSkdDirCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaLaneTsCmmtVO() {}

	public CoaLaneTsCmmtVO(String ibflag, String pagerows, String costYrmon, String fmTrdCd, String fmRlaneCd, String fmIocCd, String fmSkdDirCd, String toTrdCd, String toRlaneCd, String toIocCd, String toSkdDirCd, String tsRtAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.toIocCd = toIocCd;
		this.toTrdCd = toTrdCd;
		this.toRlaneCd = toRlaneCd;
		this.creDt = creDt;
		this.tsRtAmt = tsRtAmt;
		this.pagerows = pagerows;
		this.fmTrdCd = fmTrdCd;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.costYrmon = costYrmon;
		this.fmSkdDirCd = fmSkdDirCd;
		this.fmRlaneCd = fmRlaneCd;
		this.fmIocCd = fmIocCd;
		this.toSkdDirCd = toSkdDirCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("to_ioc_cd", getToIocCd());
		this.hashColumns.put("to_trd_cd", getToTrdCd());
		this.hashColumns.put("to_rlane_cd", getToRlaneCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ts_rt_amt", getTsRtAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("fm_trd_cd", getFmTrdCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("fm_skd_dir_cd", getFmSkdDirCd());
		this.hashColumns.put("fm_rlane_cd", getFmRlaneCd());
		this.hashColumns.put("fm_ioc_cd", getFmIocCd());
		this.hashColumns.put("to_skd_dir_cd", getToSkdDirCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("to_ioc_cd", "toIocCd");
		this.hashFields.put("to_trd_cd", "toTrdCd");
		this.hashFields.put("to_rlane_cd", "toRlaneCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ts_rt_amt", "tsRtAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("fm_trd_cd", "fmTrdCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("fm_skd_dir_cd", "fmSkdDirCd");
		this.hashFields.put("fm_rlane_cd", "fmRlaneCd");
		this.hashFields.put("fm_ioc_cd", "fmIocCd");
		this.hashFields.put("to_skd_dir_cd", "toSkdDirCd");
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
	 * @return toIocCd
	 */
	public String getToIocCd() {
		return this.toIocCd;
	}
	
	/**
	 * Column Info
	 * @return toTrdCd
	 */
	public String getToTrdCd() {
		return this.toTrdCd;
	}
	
	/**
	 * Column Info
	 * @return toRlaneCd
	 */
	public String getToRlaneCd() {
		return this.toRlaneCd;
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
	 * @return tsRtAmt
	 */
	public String getTsRtAmt() {
		return this.tsRtAmt;
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
	 * @return fmTrdCd
	 */
	public String getFmTrdCd() {
		return this.fmTrdCd;
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
	 * @return costYrmon
	 */
	public String getCostYrmon() {
		return this.costYrmon;
	}
	
	/**
	 * Column Info
	 * @return fmSkdDirCd
	 */
	public String getFmSkdDirCd() {
		return this.fmSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return fmRlaneCd
	 */
	public String getFmRlaneCd() {
		return this.fmRlaneCd;
	}
	
	/**
	 * Column Info
	 * @return fmIocCd
	 */
	public String getFmIocCd() {
		return this.fmIocCd;
	}
	
	/**
	 * Column Info
	 * @return toSkdDirCd
	 */
	public String getToSkdDirCd() {
		return this.toSkdDirCd;
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
	 * @param toIocCd
	 */
	public void setToIocCd(String toIocCd) {
		this.toIocCd = toIocCd;
	}
	
	/**
	 * Column Info
	 * @param toTrdCd
	 */
	public void setToTrdCd(String toTrdCd) {
		this.toTrdCd = toTrdCd;
	}
	
	/**
	 * Column Info
	 * @param toRlaneCd
	 */
	public void setToRlaneCd(String toRlaneCd) {
		this.toRlaneCd = toRlaneCd;
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
	 * @param tsRtAmt
	 */
	public void setTsRtAmt(String tsRtAmt) {
		this.tsRtAmt = tsRtAmt;
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
	 * @param fmTrdCd
	 */
	public void setFmTrdCd(String fmTrdCd) {
		this.fmTrdCd = fmTrdCd;
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
	 * @param costYrmon
	 */
	public void setCostYrmon(String costYrmon) {
		this.costYrmon = costYrmon;
	}
	
	/**
	 * Column Info
	 * @param fmSkdDirCd
	 */
	public void setFmSkdDirCd(String fmSkdDirCd) {
		this.fmSkdDirCd = fmSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param fmRlaneCd
	 */
	public void setFmRlaneCd(String fmRlaneCd) {
		this.fmRlaneCd = fmRlaneCd;
	}
	
	/**
	 * Column Info
	 * @param fmIocCd
	 */
	public void setFmIocCd(String fmIocCd) {
		this.fmIocCd = fmIocCd;
	}
	
	/**
	 * Column Info
	 * @param toSkdDirCd
	 */
	public void setToSkdDirCd(String toSkdDirCd) {
		this.toSkdDirCd = toSkdDirCd;
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
		setToIocCd(JSPUtil.getParameter(request, "to_ioc_cd", ""));
		setToTrdCd(JSPUtil.getParameter(request, "to_trd_cd", ""));
		setToRlaneCd(JSPUtil.getParameter(request, "to_rlane_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTsRtAmt(JSPUtil.getParameter(request, "ts_rt_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setFmTrdCd(JSPUtil.getParameter(request, "fm_trd_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setFmSkdDirCd(JSPUtil.getParameter(request, "fm_skd_dir_cd", ""));
		setFmRlaneCd(JSPUtil.getParameter(request, "fm_rlane_cd", ""));
		setFmIocCd(JSPUtil.getParameter(request, "fm_ioc_cd", ""));
		setToSkdDirCd(JSPUtil.getParameter(request, "to_skd_dir_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaLaneTsCmmtVO[]
	 */
	public CoaLaneTsCmmtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaLaneTsCmmtVO[]
	 */
	public CoaLaneTsCmmtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaLaneTsCmmtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] toIocCd = (JSPUtil.getParameter(request, prefix	+ "to_ioc_cd", length));
			String[] toTrdCd = (JSPUtil.getParameter(request, prefix	+ "to_trd_cd", length));
			String[] toRlaneCd = (JSPUtil.getParameter(request, prefix	+ "to_rlane_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] tsRtAmt = (JSPUtil.getParameter(request, prefix	+ "ts_rt_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] fmTrdCd = (JSPUtil.getParameter(request, prefix	+ "fm_trd_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon", length));
			String[] fmSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "fm_skd_dir_cd", length));
			String[] fmRlaneCd = (JSPUtil.getParameter(request, prefix	+ "fm_rlane_cd", length));
			String[] fmIocCd = (JSPUtil.getParameter(request, prefix	+ "fm_ioc_cd", length));
			String[] toSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "to_skd_dir_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaLaneTsCmmtVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (toIocCd[i] != null)
					model.setToIocCd(toIocCd[i]);
				if (toTrdCd[i] != null)
					model.setToTrdCd(toTrdCd[i]);
				if (toRlaneCd[i] != null)
					model.setToRlaneCd(toRlaneCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (tsRtAmt[i] != null)
					model.setTsRtAmt(tsRtAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (fmTrdCd[i] != null)
					model.setFmTrdCd(fmTrdCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (fmSkdDirCd[i] != null)
					model.setFmSkdDirCd(fmSkdDirCd[i]);
				if (fmRlaneCd[i] != null)
					model.setFmRlaneCd(fmRlaneCd[i]);
				if (fmIocCd[i] != null)
					model.setFmIocCd(fmIocCd[i]);
				if (toSkdDirCd[i] != null)
					model.setToSkdDirCd(toSkdDirCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaLaneTsCmmtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaLaneTsCmmtVO[]
	 */
	public CoaLaneTsCmmtVO[] getCoaLaneTsCmmtVOs(){
		CoaLaneTsCmmtVO[] vos = (CoaLaneTsCmmtVO[])models.toArray(new CoaLaneTsCmmtVO[models.size()]);
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
		this.toIocCd = this.toIocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toTrdCd = this.toTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toRlaneCd = this.toRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsRtAmt = this.tsRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmTrdCd = this.fmTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmSkdDirCd = this.fmSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmRlaneCd = this.fmRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmIocCd = this.fmIocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toSkdDirCd = this.toSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
