/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PriCrmSlsLdVO.java
*@FileTitle : PriCrmSlsLdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.11
*@LastModifier : 문동규
*@LastVersion : 1.0
* 2009.08.11 문동규 
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
 * @author 문동규
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PriCrmSlsLdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriCrmSlsLdVO> models = new ArrayList<PriCrmSlsLdVO>();
	
	/* Column Info */
	private String slsLdSrepCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String slsLdCustSeq = null;
	/* Column Info */
	private String slsLdStsCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String slsLdCustCntCd = null;
	/* Column Info */
	private String slsLdStDt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String slsLdNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String slsLdNm = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriCrmSlsLdVO() {}

	public PriCrmSlsLdVO(String ibflag, String pagerows, String slsLdNo, String slsLdNm, String slsLdCustCntCd, String slsLdCustSeq, String slsLdSrepCd, String slsLdStDt, String slsLdStsCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.slsLdSrepCd = slsLdSrepCd;
		this.updDt = updDt;
		this.slsLdCustSeq = slsLdCustSeq;
		this.slsLdStsCd = slsLdStsCd;
		this.creDt = creDt;
		this.slsLdCustCntCd = slsLdCustCntCd;
		this.slsLdStDt = slsLdStDt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.slsLdNo = slsLdNo;
		this.updUsrId = updUsrId;
		this.slsLdNm = slsLdNm;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("sls_ld_srep_cd", getSlsLdSrepCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("sls_ld_cust_seq", getSlsLdCustSeq());
		this.hashColumns.put("sls_ld_sts_cd", getSlsLdStsCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("sls_ld_cust_cnt_cd", getSlsLdCustCntCd());
		this.hashColumns.put("sls_ld_st_dt", getSlsLdStDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("sls_ld_no", getSlsLdNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("sls_ld_nm", getSlsLdNm());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("sls_ld_srep_cd", "slsLdSrepCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("sls_ld_cust_seq", "slsLdCustSeq");
		this.hashFields.put("sls_ld_sts_cd", "slsLdStsCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("sls_ld_cust_cnt_cd", "slsLdCustCntCd");
		this.hashFields.put("sls_ld_st_dt", "slsLdStDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("sls_ld_no", "slsLdNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("sls_ld_nm", "slsLdNm");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return slsLdSrepCd
	 */
	public String getSlsLdSrepCd() {
		return this.slsLdSrepCd;
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
	 * @return slsLdCustSeq
	 */
	public String getSlsLdCustSeq() {
		return this.slsLdCustSeq;
	}
	
	/**
	 * Column Info
	 * @return slsLdStsCd
	 */
	public String getSlsLdStsCd() {
		return this.slsLdStsCd;
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
	 * @return slsLdCustCntCd
	 */
	public String getSlsLdCustCntCd() {
		return this.slsLdCustCntCd;
	}
	
	/**
	 * Column Info
	 * @return slsLdStDt
	 */
	public String getSlsLdStDt() {
		return this.slsLdStDt;
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
	 * @return slsLdNo
	 */
	public String getSlsLdNo() {
		return this.slsLdNo;
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
	 * @return slsLdNm
	 */
	public String getSlsLdNm() {
		return this.slsLdNm;
	}
	

	/**
	 * Column Info
	 * @param slsLdSrepCd
	 */
	public void setSlsLdSrepCd(String slsLdSrepCd) {
		this.slsLdSrepCd = slsLdSrepCd;
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
	 * @param slsLdCustSeq
	 */
	public void setSlsLdCustSeq(String slsLdCustSeq) {
		this.slsLdCustSeq = slsLdCustSeq;
	}
	
	/**
	 * Column Info
	 * @param slsLdStsCd
	 */
	public void setSlsLdStsCd(String slsLdStsCd) {
		this.slsLdStsCd = slsLdStsCd;
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
	 * @param slsLdCustCntCd
	 */
	public void setSlsLdCustCntCd(String slsLdCustCntCd) {
		this.slsLdCustCntCd = slsLdCustCntCd;
	}
	
	/**
	 * Column Info
	 * @param slsLdStDt
	 */
	public void setSlsLdStDt(String slsLdStDt) {
		this.slsLdStDt = slsLdStDt;
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
	 * @param slsLdNo
	 */
	public void setSlsLdNo(String slsLdNo) {
		this.slsLdNo = slsLdNo;
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
	 * @param slsLdNm
	 */
	public void setSlsLdNm(String slsLdNm) {
		this.slsLdNm = slsLdNm;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setSlsLdSrepCd(JSPUtil.getParameter(request, "sls_ld_srep_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setSlsLdCustSeq(JSPUtil.getParameter(request, "sls_ld_cust_seq", ""));
		setSlsLdStsCd(JSPUtil.getParameter(request, "sls_ld_sts_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSlsLdCustCntCd(JSPUtil.getParameter(request, "sls_ld_cust_cnt_cd", ""));
		setSlsLdStDt(JSPUtil.getParameter(request, "sls_ld_st_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSlsLdNo(JSPUtil.getParameter(request, "sls_ld_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setSlsLdNm(JSPUtil.getParameter(request, "sls_ld_nm", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriCrmSlsLdVO[]
	 */
	public PriCrmSlsLdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriCrmSlsLdVO[]
	 */
	public PriCrmSlsLdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriCrmSlsLdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] slsLdSrepCd = (JSPUtil.getParameter(request, prefix	+ "sls_ld_srep_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] slsLdCustSeq = (JSPUtil.getParameter(request, prefix	+ "sls_ld_cust_seq", length));
			String[] slsLdStsCd = (JSPUtil.getParameter(request, prefix	+ "sls_ld_sts_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] slsLdCustCntCd = (JSPUtil.getParameter(request, prefix	+ "sls_ld_cust_cnt_cd", length));
			String[] slsLdStDt = (JSPUtil.getParameter(request, prefix	+ "sls_ld_st_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] slsLdNo = (JSPUtil.getParameter(request, prefix	+ "sls_ld_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] slsLdNm = (JSPUtil.getParameter(request, prefix	+ "sls_ld_nm", length));
			
			for (int i = 0; i < length; i++) {
				model = new PriCrmSlsLdVO();
				if (slsLdSrepCd[i] != null)
					model.setSlsLdSrepCd(slsLdSrepCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (slsLdCustSeq[i] != null)
					model.setSlsLdCustSeq(slsLdCustSeq[i]);
				if (slsLdStsCd[i] != null)
					model.setSlsLdStsCd(slsLdStsCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (slsLdCustCntCd[i] != null)
					model.setSlsLdCustCntCd(slsLdCustCntCd[i]);
				if (slsLdStDt[i] != null)
					model.setSlsLdStDt(slsLdStDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (slsLdNo[i] != null)
					model.setSlsLdNo(slsLdNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (slsLdNm[i] != null)
					model.setSlsLdNm(slsLdNm[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPriCrmSlsLdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PriCrmSlsLdVO[]
	 */
	public PriCrmSlsLdVO[] getPriCrmSlsLdVOs(){
		PriCrmSlsLdVO[] vos = (PriCrmSlsLdVO[])models.toArray(new PriCrmSlsLdVO[models.size()]);
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
		this.slsLdSrepCd = this.slsLdSrepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsLdCustSeq = this.slsLdCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsLdStsCd = this.slsLdStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsLdCustCntCd = this.slsLdCustCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsLdStDt = this.slsLdStDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsLdNo = this.slsLdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsLdNm = this.slsLdNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
