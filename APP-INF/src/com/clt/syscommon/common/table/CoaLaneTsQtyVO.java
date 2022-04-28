/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaLaneTsQtyVO.java
*@FileTitle : CoaLaneTsQtyVO
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

public class CoaLaneTsQtyVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaLaneTsQtyVO> models = new ArrayList<CoaLaneTsQtyVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String tsRto = null;
	/* Column Info */
	private String toIocCd = null;
	/* Column Info */
	private String fmSkdVoyNo = null;
	/* Column Info */
	private String toTrdCd = null;
	/* Column Info */
	private String toRlaneCd = null;
	/* Column Info */
	private String toVslCd = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String fmTrdCd = null;
	/* Column Info */
	private String toSkdVoyNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String fmVslCd = null;
	/* Column Info */
	private String fmSkdDirCd = null;
	/* Column Info */
	private String fmRlaneCd = null;
	/* Column Info */
	private String toSkdDirCd = null;
	/* Column Info */
	private String fmIocCd = null;
	/* Column Info */
	private String tsQty = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaLaneTsQtyVO() {}

	public CoaLaneTsQtyVO(String ibflag, String pagerows, String fmTrdCd, String fmRlaneCd, String fmIocCd, String fmVslCd, String fmSkdVoyNo, String fmSkdDirCd, String toTrdCd, String toRlaneCd, String toIocCd, String toVslCd, String toSkdVoyNo, String toSkdDirCd, String tsQty, String tsRto, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.tsRto = tsRto;
		this.toIocCd = toIocCd;
		this.fmSkdVoyNo = fmSkdVoyNo;
		this.toTrdCd = toTrdCd;
		this.toRlaneCd = toRlaneCd;
		this.toVslCd = toVslCd;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.fmTrdCd = fmTrdCd;
		this.toSkdVoyNo = toSkdVoyNo;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.fmVslCd = fmVslCd;
		this.fmSkdDirCd = fmSkdDirCd;
		this.fmRlaneCd = fmRlaneCd;
		this.toSkdDirCd = toSkdDirCd;
		this.fmIocCd = fmIocCd;
		this.tsQty = tsQty;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ts_rto", getTsRto());
		this.hashColumns.put("to_ioc_cd", getToIocCd());
		this.hashColumns.put("fm_skd_voy_no", getFmSkdVoyNo());
		this.hashColumns.put("to_trd_cd", getToTrdCd());
		this.hashColumns.put("to_rlane_cd", getToRlaneCd());
		this.hashColumns.put("to_vsl_cd", getToVslCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("fm_trd_cd", getFmTrdCd());
		this.hashColumns.put("to_skd_voy_no", getToSkdVoyNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("fm_vsl_cd", getFmVslCd());
		this.hashColumns.put("fm_skd_dir_cd", getFmSkdDirCd());
		this.hashColumns.put("fm_rlane_cd", getFmRlaneCd());
		this.hashColumns.put("to_skd_dir_cd", getToSkdDirCd());
		this.hashColumns.put("fm_ioc_cd", getFmIocCd());
		this.hashColumns.put("ts_qty", getTsQty());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ts_rto", "tsRto");
		this.hashFields.put("to_ioc_cd", "toIocCd");
		this.hashFields.put("fm_skd_voy_no", "fmSkdVoyNo");
		this.hashFields.put("to_trd_cd", "toTrdCd");
		this.hashFields.put("to_rlane_cd", "toRlaneCd");
		this.hashFields.put("to_vsl_cd", "toVslCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("fm_trd_cd", "fmTrdCd");
		this.hashFields.put("to_skd_voy_no", "toSkdVoyNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("fm_vsl_cd", "fmVslCd");
		this.hashFields.put("fm_skd_dir_cd", "fmSkdDirCd");
		this.hashFields.put("fm_rlane_cd", "fmRlaneCd");
		this.hashFields.put("to_skd_dir_cd", "toSkdDirCd");
		this.hashFields.put("fm_ioc_cd", "fmIocCd");
		this.hashFields.put("ts_qty", "tsQty");
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
	 * @return tsRto
	 */
	public String getTsRto() {
		return this.tsRto;
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
	 * @return fmSkdVoyNo
	 */
	public String getFmSkdVoyNo() {
		return this.fmSkdVoyNo;
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
	 * @return toVslCd
	 */
	public String getToVslCd() {
		return this.toVslCd;
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
	 * @return fmTrdCd
	 */
	public String getFmTrdCd() {
		return this.fmTrdCd;
	}
	
	/**
	 * Column Info
	 * @return toSkdVoyNo
	 */
	public String getToSkdVoyNo() {
		return this.toSkdVoyNo;
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
	 * @return fmVslCd
	 */
	public String getFmVslCd() {
		return this.fmVslCd;
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
	 * @return toSkdDirCd
	 */
	public String getToSkdDirCd() {
		return this.toSkdDirCd;
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
	 * @return tsQty
	 */
	public String getTsQty() {
		return this.tsQty;
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
	 * @param tsRto
	 */
	public void setTsRto(String tsRto) {
		this.tsRto = tsRto;
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
	 * @param fmSkdVoyNo
	 */
	public void setFmSkdVoyNo(String fmSkdVoyNo) {
		this.fmSkdVoyNo = fmSkdVoyNo;
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
	 * @param toVslCd
	 */
	public void setToVslCd(String toVslCd) {
		this.toVslCd = toVslCd;
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
	 * @param fmTrdCd
	 */
	public void setFmTrdCd(String fmTrdCd) {
		this.fmTrdCd = fmTrdCd;
	}
	
	/**
	 * Column Info
	 * @param toSkdVoyNo
	 */
	public void setToSkdVoyNo(String toSkdVoyNo) {
		this.toSkdVoyNo = toSkdVoyNo;
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
	 * @param fmVslCd
	 */
	public void setFmVslCd(String fmVslCd) {
		this.fmVslCd = fmVslCd;
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
	 * @param toSkdDirCd
	 */
	public void setToSkdDirCd(String toSkdDirCd) {
		this.toSkdDirCd = toSkdDirCd;
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
	 * @param tsQty
	 */
	public void setTsQty(String tsQty) {
		this.tsQty = tsQty;
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
		setTsRto(JSPUtil.getParameter(request, "ts_rto", ""));
		setToIocCd(JSPUtil.getParameter(request, "to_ioc_cd", ""));
		setFmSkdVoyNo(JSPUtil.getParameter(request, "fm_skd_voy_no", ""));
		setToTrdCd(JSPUtil.getParameter(request, "to_trd_cd", ""));
		setToRlaneCd(JSPUtil.getParameter(request, "to_rlane_cd", ""));
		setToVslCd(JSPUtil.getParameter(request, "to_vsl_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setFmTrdCd(JSPUtil.getParameter(request, "fm_trd_cd", ""));
		setToSkdVoyNo(JSPUtil.getParameter(request, "to_skd_voy_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setFmVslCd(JSPUtil.getParameter(request, "fm_vsl_cd", ""));
		setFmSkdDirCd(JSPUtil.getParameter(request, "fm_skd_dir_cd", ""));
		setFmRlaneCd(JSPUtil.getParameter(request, "fm_rlane_cd", ""));
		setToSkdDirCd(JSPUtil.getParameter(request, "to_skd_dir_cd", ""));
		setFmIocCd(JSPUtil.getParameter(request, "fm_ioc_cd", ""));
		setTsQty(JSPUtil.getParameter(request, "ts_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaLaneTsQtyVO[]
	 */
	public CoaLaneTsQtyVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaLaneTsQtyVO[]
	 */
	public CoaLaneTsQtyVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaLaneTsQtyVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] tsRto = (JSPUtil.getParameter(request, prefix	+ "ts_rto", length));
			String[] toIocCd = (JSPUtil.getParameter(request, prefix	+ "to_ioc_cd", length));
			String[] fmSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "fm_skd_voy_no", length));
			String[] toTrdCd = (JSPUtil.getParameter(request, prefix	+ "to_trd_cd", length));
			String[] toRlaneCd = (JSPUtil.getParameter(request, prefix	+ "to_rlane_cd", length));
			String[] toVslCd = (JSPUtil.getParameter(request, prefix	+ "to_vsl_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] fmTrdCd = (JSPUtil.getParameter(request, prefix	+ "fm_trd_cd", length));
			String[] toSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "to_skd_voy_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] fmVslCd = (JSPUtil.getParameter(request, prefix	+ "fm_vsl_cd", length));
			String[] fmSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "fm_skd_dir_cd", length));
			String[] fmRlaneCd = (JSPUtil.getParameter(request, prefix	+ "fm_rlane_cd", length));
			String[] toSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "to_skd_dir_cd", length));
			String[] fmIocCd = (JSPUtil.getParameter(request, prefix	+ "fm_ioc_cd", length));
			String[] tsQty = (JSPUtil.getParameter(request, prefix	+ "ts_qty", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaLaneTsQtyVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (tsRto[i] != null)
					model.setTsRto(tsRto[i]);
				if (toIocCd[i] != null)
					model.setToIocCd(toIocCd[i]);
				if (fmSkdVoyNo[i] != null)
					model.setFmSkdVoyNo(fmSkdVoyNo[i]);
				if (toTrdCd[i] != null)
					model.setToTrdCd(toTrdCd[i]);
				if (toRlaneCd[i] != null)
					model.setToRlaneCd(toRlaneCd[i]);
				if (toVslCd[i] != null)
					model.setToVslCd(toVslCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (fmTrdCd[i] != null)
					model.setFmTrdCd(fmTrdCd[i]);
				if (toSkdVoyNo[i] != null)
					model.setToSkdVoyNo(toSkdVoyNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (fmVslCd[i] != null)
					model.setFmVslCd(fmVslCd[i]);
				if (fmSkdDirCd[i] != null)
					model.setFmSkdDirCd(fmSkdDirCd[i]);
				if (fmRlaneCd[i] != null)
					model.setFmRlaneCd(fmRlaneCd[i]);
				if (toSkdDirCd[i] != null)
					model.setToSkdDirCd(toSkdDirCd[i]);
				if (fmIocCd[i] != null)
					model.setFmIocCd(fmIocCd[i]);
				if (tsQty[i] != null)
					model.setTsQty(tsQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaLaneTsQtyVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaLaneTsQtyVO[]
	 */
	public CoaLaneTsQtyVO[] getCoaLaneTsQtyVOs(){
		CoaLaneTsQtyVO[] vos = (CoaLaneTsQtyVO[])models.toArray(new CoaLaneTsQtyVO[models.size()]);
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
		this.tsRto = this.tsRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toIocCd = this.toIocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmSkdVoyNo = this.fmSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toTrdCd = this.toTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toRlaneCd = this.toRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toVslCd = this.toVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmTrdCd = this.fmTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toSkdVoyNo = this.toSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmVslCd = this.fmVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmSkdDirCd = this.fmSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmRlaneCd = this.fmRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toSkdDirCd = this.toSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmIocCd = this.fmIocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsQty = this.tsQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
