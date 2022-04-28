/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComUsrOfcCngVO.java
*@FileTitle : ComUsrOfcCngVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.17
*@LastModifier : 
*@LastVersion : 1.0
* 2009.08.17  
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

public class ComUsrOfcCngVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComUsrOfcCngVO> models = new ArrayList<ComUsrOfcCngVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String cngOfcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String rqstCtnt = null;
	/* Column Info */
	private String usrId = null;
	/* Column Info */
	private String cngOfcToDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String cngOfcFmDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComUsrOfcCngVO() {}

	public ComUsrOfcCngVO(String ibflag, String pagerows, String usrId, String cngOfcCd, String cngOfcFmDt, String cngOfcToDt, String rqstCtnt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.cngOfcCd = cngOfcCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.rqstCtnt = rqstCtnt;
		this.usrId = usrId;
		this.cngOfcToDt = cngOfcToDt;
		this.creDt = creDt;
		this.cngOfcFmDt = cngOfcFmDt;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cng_ofc_cd", getCngOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rqst_ctnt", getRqstCtnt());
		this.hashColumns.put("usr_id", getUsrId());
		this.hashColumns.put("cng_ofc_to_dt", getCngOfcToDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cng_ofc_fm_dt", getCngOfcFmDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cng_ofc_cd", "cngOfcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rqst_ctnt", "rqstCtnt");
		this.hashFields.put("usr_id", "usrId");
		this.hashFields.put("cng_ofc_to_dt", "cngOfcToDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cng_ofc_fm_dt", "cngOfcFmDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
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
	 * @return cngOfcCd
	 */
	public String getCngOfcCd() {
		return this.cngOfcCd;
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
	 * @return rqstCtnt
	 */
	public String getRqstCtnt() {
		return this.rqstCtnt;
	}
	
	/**
	 * Column Info
	 * @return usrId
	 */
	public String getUsrId() {
		return this.usrId;
	}
	
	/**
	 * Column Info
	 * @return cngOfcToDt
	 */
	public String getCngOfcToDt() {
		return this.cngOfcToDt;
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
	 * @return cngOfcFmDt
	 */
	public String getCngOfcFmDt() {
		return this.cngOfcFmDt;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
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
	 * @param cngOfcCd
	 */
	public void setCngOfcCd(String cngOfcCd) {
		this.cngOfcCd = cngOfcCd;
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
	 * @param rqstCtnt
	 */
	public void setRqstCtnt(String rqstCtnt) {
		this.rqstCtnt = rqstCtnt;
	}
	
	/**
	 * Column Info
	 * @param usrId
	 */
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}
	
	/**
	 * Column Info
	 * @param cngOfcToDt
	 */
	public void setCngOfcToDt(String cngOfcToDt) {
		this.cngOfcToDt = cngOfcToDt;
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
	 * @param cngOfcFmDt
	 */
	public void setCngOfcFmDt(String cngOfcFmDt) {
		this.cngOfcFmDt = cngOfcFmDt;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
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
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCngOfcCd(JSPUtil.getParameter(request, "cng_ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setRqstCtnt(JSPUtil.getParameter(request, "rqst_ctnt", ""));
		setUsrId(JSPUtil.getParameter(request, "usr_id", ""));
		setCngOfcToDt(JSPUtil.getParameter(request, "cng_ofc_to_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCngOfcFmDt(JSPUtil.getParameter(request, "cng_ofc_fm_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ComUsrOfcCngVO[]
	 */
	public ComUsrOfcCngVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ComUsrOfcCngVO[]
	 */
	public ComUsrOfcCngVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComUsrOfcCngVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] cngOfcCd = (JSPUtil.getParameter(request, prefix	+ "cng_ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] rqstCtnt = (JSPUtil.getParameter(request, prefix	+ "rqst_ctnt", length));
			String[] usrId = (JSPUtil.getParameter(request, prefix	+ "usr_id", length));
			String[] cngOfcToDt = (JSPUtil.getParameter(request, prefix	+ "cng_ofc_to_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] cngOfcFmDt = (JSPUtil.getParameter(request, prefix	+ "cng_ofc_fm_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new ComUsrOfcCngVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cngOfcCd[i] != null)
					model.setCngOfcCd(cngOfcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rqstCtnt[i] != null)
					model.setRqstCtnt(rqstCtnt[i]);
				if (usrId[i] != null)
					model.setUsrId(usrId[i]);
				if (cngOfcToDt[i] != null)
					model.setCngOfcToDt(cngOfcToDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (cngOfcFmDt[i] != null)
					model.setCngOfcFmDt(cngOfcFmDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getComUsrOfcCngVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ComUsrOfcCngVO[]
	 */
	public ComUsrOfcCngVO[] getComUsrOfcCngVOs(){
		ComUsrOfcCngVO[] vos = (ComUsrOfcCngVO[])models.toArray(new ComUsrOfcCngVO[models.size()]);
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
		this.cngOfcCd = this.cngOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstCtnt = this.rqstCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrId = this.usrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cngOfcToDt = this.cngOfcToDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cngOfcFmDt = this.cngOfcFmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
