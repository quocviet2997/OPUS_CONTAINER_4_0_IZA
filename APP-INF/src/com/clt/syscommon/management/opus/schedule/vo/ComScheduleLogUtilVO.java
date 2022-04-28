/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComScheduleLogUtilVO.java
*@FileTitle : ComScheduleLogUtilVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.31
*@LastModifier : 
*@LastVersion : 1.0
* 2009.08.31  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.management.opus.schedule.vo;

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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ComScheduleLogUtilVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComScheduleLogUtilVO> models = new ArrayList<ComScheduleLogUtilVO>();
	
	/* Column Info */
	private String errCtnt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String jbLogId = null;
	/* Column Info */
	private String endDt = null;
	/* Column Info */
	private String skdId = null;
	/* Column Info */
	private String jbStsCd = null;
	/* Column Info */
	private String stDt = null;
	/* Column Info */
	private String pgmNm = null;
	/* Column Info */
	private String skdTpCd = null;
	/* Column Info */
	private String elapsedTime = null;
	/* Column Info */
	private String pgmNo = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComScheduleLogUtilVO() {}

	public ComScheduleLogUtilVO(String ibflag, String pagerows, String jbLogId, String skdId, String skdTpCd, String pgmNo, String pgmNm, String stDt, String endDt, String elapsedTime, String jbStsCd, String errCtnt) {
		this.errCtnt = errCtnt;
		this.ibflag = ibflag;
		this.jbLogId = jbLogId;
		this.endDt = endDt;
		this.skdId = skdId;
		this.jbStsCd = jbStsCd;
		this.stDt = stDt;
		this.pgmNm = pgmNm;
		this.skdTpCd = skdTpCd;
		this.elapsedTime = elapsedTime;
		this.pgmNo = pgmNo;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("err_ctnt", getErrCtnt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("jb_log_id", getJbLogId());
		this.hashColumns.put("end_dt", getEndDt());
		this.hashColumns.put("skd_id", getSkdId());
		this.hashColumns.put("jb_sts_cd", getJbStsCd());
		this.hashColumns.put("st_dt", getStDt());
		this.hashColumns.put("pgm_nm", getPgmNm());
		this.hashColumns.put("skd_tp_cd", getSkdTpCd());
		this.hashColumns.put("elapsed_time", getElapsedTime());
		this.hashColumns.put("pgm_no", getPgmNo());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("err_ctnt", "errCtnt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("jb_log_id", "jbLogId");
		this.hashFields.put("end_dt", "endDt");
		this.hashFields.put("skd_id", "skdId");
		this.hashFields.put("jb_sts_cd", "jbStsCd");
		this.hashFields.put("st_dt", "stDt");
		this.hashFields.put("pgm_nm", "pgmNm");
		this.hashFields.put("skd_tp_cd", "skdTpCd");
		this.hashFields.put("elapsed_time", "elapsedTime");
		this.hashFields.put("pgm_no", "pgmNo");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return errCtnt
	 */
	public String getErrCtnt() {
		return this.errCtnt;
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
	 * @return jbLogId
	 */
	public String getJbLogId() {
		return this.jbLogId;
	}
	
	/**
	 * Column Info
	 * @return endDt
	 */
	public String getEndDt() {
		return this.endDt;
	}
	
	/**
	 * Column Info
	 * @return skdId
	 */
	public String getSkdId() {
		return this.skdId;
	}
	
	/**
	 * Column Info
	 * @return jbStsCd
	 */
	public String getJbStsCd() {
		return this.jbStsCd;
	}
	
	/**
	 * Column Info
	 * @return stDt
	 */
	public String getStDt() {
		return this.stDt;
	}
	
	/**
	 * Column Info
	 * @return pgmNm
	 */
	public String getPgmNm() {
		return this.pgmNm;
	}
	
	/**
	 * Column Info
	 * @return skdTpCd
	 */
	public String getSkdTpCd() {
		return this.skdTpCd;
	}
	
	/**
	 * Column Info
	 * @return elapsedTime
	 */
	public String getElapsedTime() {
		return this.elapsedTime;
	}
	
	/**
	 * Column Info
	 * @return pgmNo
	 */
	public String getPgmNo() {
		return this.pgmNo;
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
	 * @param errCtnt
	 */
	public void setErrCtnt(String errCtnt) {
		this.errCtnt = errCtnt;
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
	 * @param jbLogId
	 */
	public void setJbLogId(String jbLogId) {
		this.jbLogId = jbLogId;
	}
	
	/**
	 * Column Info
	 * @param endDt
	 */
	public void setEndDt(String endDt) {
		this.endDt = endDt;
	}
	
	/**
	 * Column Info
	 * @param skdId
	 */
	public void setSkdId(String skdId) {
		this.skdId = skdId;
	}
	
	/**
	 * Column Info
	 * @param jbStsCd
	 */
	public void setJbStsCd(String jbStsCd) {
		this.jbStsCd = jbStsCd;
	}
	
	/**
	 * Column Info
	 * @param stDt
	 */
	public void setStDt(String stDt) {
		this.stDt = stDt;
	}
	
	/**
	 * Column Info
	 * @param pgmNm
	 */
	public void setPgmNm(String pgmNm) {
		this.pgmNm = pgmNm;
	}
	
	/**
	 * Column Info
	 * @param skdTpCd
	 */
	public void setSkdTpCd(String skdTpCd) {
		this.skdTpCd = skdTpCd;
	}
	
	/**
	 * Column Info
	 * @param elapsedTime
	 */
	public void setElapsedTime(String elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
	
	/**
	 * Column Info
	 * @param pgmNo
	 */
	public void setPgmNo(String pgmNo) {
		this.pgmNo = pgmNo;
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
		setErrCtnt(JSPUtil.getParameter(request, "err_ctnt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setJbLogId(JSPUtil.getParameter(request, "jb_log_id", ""));
		setEndDt(JSPUtil.getParameter(request, "end_dt", ""));
		setSkdId(JSPUtil.getParameter(request, "skd_id", ""));
		setJbStsCd(JSPUtil.getParameter(request, "jb_sts_cd", ""));
		setStDt(JSPUtil.getParameter(request, "st_dt", ""));
		setPgmNm(JSPUtil.getParameter(request, "pgm_nm", ""));
		setSkdTpCd(JSPUtil.getParameter(request, "skd_tp_cd", ""));
		setElapsedTime(JSPUtil.getParameter(request, "elapsed_time", ""));
		setPgmNo(JSPUtil.getParameter(request, "pgm_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ComScheduleLogUtilVO[]
	 */
	public ComScheduleLogUtilVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ComScheduleLogUtilVO[]
	 */
	public ComScheduleLogUtilVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComScheduleLogUtilVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] errCtnt = (JSPUtil.getParameter(request, prefix	+ "err_ctnt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] jbLogId = (JSPUtil.getParameter(request, prefix	+ "jb_log_id", length));
			String[] endDt = (JSPUtil.getParameter(request, prefix	+ "end_dt", length));
			String[] skdId = (JSPUtil.getParameter(request, prefix	+ "skd_id", length));
			String[] jbStsCd = (JSPUtil.getParameter(request, prefix	+ "jb_sts_cd", length));
			String[] stDt = (JSPUtil.getParameter(request, prefix	+ "st_dt", length));
			String[] pgmNm = (JSPUtil.getParameter(request, prefix	+ "pgm_nm", length));
			String[] skdTpCd = (JSPUtil.getParameter(request, prefix	+ "skd_tp_cd", length));
			String[] elapsedTime = (JSPUtil.getParameter(request, prefix	+ "elapsed_time", length));
			String[] pgmNo = (JSPUtil.getParameter(request, prefix	+ "pgm_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new ComScheduleLogUtilVO();
				if (errCtnt[i] != null)
					model.setErrCtnt(errCtnt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (jbLogId[i] != null)
					model.setJbLogId(jbLogId[i]);
				if (endDt[i] != null)
					model.setEndDt(endDt[i]);
				if (skdId[i] != null)
					model.setSkdId(skdId[i]);
				if (jbStsCd[i] != null)
					model.setJbStsCd(jbStsCd[i]);
				if (stDt[i] != null)
					model.setStDt(stDt[i]);
				if (pgmNm[i] != null)
					model.setPgmNm(pgmNm[i]);
				if (skdTpCd[i] != null)
					model.setSkdTpCd(skdTpCd[i]);
				if (elapsedTime[i] != null)
					model.setElapsedTime(elapsedTime[i]);
				if (pgmNo[i] != null)
					model.setPgmNo(pgmNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getComScheduleLogUtilVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ComScheduleLogUtilVO[]
	 */
	public ComScheduleLogUtilVO[] getComScheduleLogUtilVOs(){
		ComScheduleLogUtilVO[] vos = (ComScheduleLogUtilVO[])models.toArray(new ComScheduleLogUtilVO[models.size()]);
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
		this.errCtnt = this.errCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jbLogId = this.jbLogId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.endDt = this.endDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdId = this.skdId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jbStsCd = this.jbStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stDt = this.stDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNm = this.pgmNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdTpCd = this.skdTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.elapsedTime = this.elapsedTime .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNo = this.pgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
