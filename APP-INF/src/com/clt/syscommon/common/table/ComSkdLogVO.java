/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComSkdLogVO.java
*@FileTitle : ComSkdLogVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.30
*@LastModifier : 
*@LastVersion : 1.0
* 2009.07.30  
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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ComSkdLogVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComSkdLogVO> models = new ArrayList<ComSkdLogVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String errCtnt = null;
	/* Column Info */
	private String endDt = null;
	/* Column Info */
	private String skdId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String stDt = null;
	/* Column Info */
	private String skdTpCd = null;
	/* Column Info */
	private String pgmNo = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String jbLogId = null;
	/* Column Info */
	private String jbStsCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComSkdLogVO() {}

	public ComSkdLogVO(String ibflag, String pagerows, String jbLogId, String skdId, String pgmNo, String skdTpCd, String stDt, String endDt, String jbStsCd, String errCtnt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.errCtnt = errCtnt;
		this.endDt = endDt;
		this.skdId = skdId;
		this.creDt = creDt;
		this.stDt = stDt;
		this.skdTpCd = skdTpCd;
		this.pgmNo = pgmNo;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.jbLogId = jbLogId;
		this.jbStsCd = jbStsCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("err_ctnt", getErrCtnt());
		this.hashColumns.put("end_dt", getEndDt());
		this.hashColumns.put("skd_id", getSkdId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("st_dt", getStDt());
		this.hashColumns.put("skd_tp_cd", getSkdTpCd());
		this.hashColumns.put("pgm_no", getPgmNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("jb_log_id", getJbLogId());
		this.hashColumns.put("jb_sts_cd", getJbStsCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("err_ctnt", "errCtnt");
		this.hashFields.put("end_dt", "endDt");
		this.hashFields.put("skd_id", "skdId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("st_dt", "stDt");
		this.hashFields.put("skd_tp_cd", "skdTpCd");
		this.hashFields.put("pgm_no", "pgmNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("jb_log_id", "jbLogId");
		this.hashFields.put("jb_sts_cd", "jbStsCd");
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
	 * @return errCtnt
	 */
	public String getErrCtnt() {
		return this.errCtnt;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return skdTpCd
	 */
	public String getSkdTpCd() {
		return this.skdTpCd;
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
	 * @return jbLogId
	 */
	public String getJbLogId() {
		return this.jbLogId;
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
	 * @param errCtnt
	 */
	public void setErrCtnt(String errCtnt) {
		this.errCtnt = errCtnt;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
	 * @param skdTpCd
	 */
	public void setSkdTpCd(String skdTpCd) {
		this.skdTpCd = skdTpCd;
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
	 * @param jbLogId
	 */
	public void setJbLogId(String jbLogId) {
		this.jbLogId = jbLogId;
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
		setErrCtnt(JSPUtil.getParameter(request, "err_ctnt", ""));
		setEndDt(JSPUtil.getParameter(request, "end_dt", ""));
		setSkdId(JSPUtil.getParameter(request, "skd_id", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setStDt(JSPUtil.getParameter(request, "st_dt", ""));
		setSkdTpCd(JSPUtil.getParameter(request, "skd_tp_cd", ""));
		setPgmNo(JSPUtil.getParameter(request, "pgm_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setJbLogId(JSPUtil.getParameter(request, "jb_log_id", ""));
		setJbStsCd(JSPUtil.getParameter(request, "jb_sts_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ComSkdLogVO[]
	 */
	public ComSkdLogVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ComSkdLogVO[]
	 */
	public ComSkdLogVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComSkdLogVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] errCtnt = (JSPUtil.getParameter(request, prefix	+ "err_ctnt", length));
			String[] endDt = (JSPUtil.getParameter(request, prefix	+ "end_dt", length));
			String[] skdId = (JSPUtil.getParameter(request, prefix	+ "skd_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] stDt = (JSPUtil.getParameter(request, prefix	+ "st_dt", length));
			String[] skdTpCd = (JSPUtil.getParameter(request, prefix	+ "skd_tp_cd", length));
			String[] pgmNo = (JSPUtil.getParameter(request, prefix	+ "pgm_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] jbLogId = (JSPUtil.getParameter(request, prefix	+ "jb_log_id", length));
			String[] jbStsCd = (JSPUtil.getParameter(request, prefix	+ "jb_sts_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new ComSkdLogVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (errCtnt[i] != null)
					model.setErrCtnt(errCtnt[i]);
				if (endDt[i] != null)
					model.setEndDt(endDt[i]);
				if (skdId[i] != null)
					model.setSkdId(skdId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (stDt[i] != null)
					model.setStDt(stDt[i]);
				if (skdTpCd[i] != null)
					model.setSkdTpCd(skdTpCd[i]);
				if (pgmNo[i] != null)
					model.setPgmNo(pgmNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (jbLogId[i] != null)
					model.setJbLogId(jbLogId[i]);
				if (jbStsCd[i] != null)
					model.setJbStsCd(jbStsCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getComSkdLogVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ComSkdLogVO[]
	 */
	public ComSkdLogVO[] getComSkdLogVOs(){
		ComSkdLogVO[] vos = (ComSkdLogVO[])models.toArray(new ComSkdLogVO[models.size()]);
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
		this.errCtnt = this.errCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.endDt = this.endDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdId = this.skdId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stDt = this.stDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdTpCd = this.skdTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNo = this.pgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jbLogId = this.jbLogId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jbStsCd = this.jbStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
