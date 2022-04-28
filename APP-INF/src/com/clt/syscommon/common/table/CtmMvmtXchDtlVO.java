/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CtmMvmtXchDtlVO.java
*@FileTitle : CtmMvmtXchDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.27
*@LastModifier : 우경민
*@LastVersion : 1.0
* 2009.04.27 우경민 
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
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 우경민
 * @since J2EE 1.5
 */

public class CtmMvmtXchDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CtmMvmtXchDtlVO> models = new ArrayList<CtmMvmtXchDtlVO>();
	
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String cntrXchSeq = null;
	/* Column Info */
	private String cnmvYr = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String cntrXchRsnSeq = null;
	/* Column Info */
	private String cntrXchRefSeq = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String cnmvIdNo = null;
	/* Column Info */
	private String xchRsnCd = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CtmMvmtXchDtlVO() {}

	public CtmMvmtXchDtlVO(String ibflag, String pagerows, String cntrNo, String cnmvYr, String cnmvIdNo, String cntrXchRefSeq, String cntrXchSeq, String cntrXchRsnSeq, String xchRsnCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.ibflag = ibflag;
		this.cntrXchSeq = cntrXchSeq;
		this.cnmvYr = cnmvYr;
		this.updUsrId = updUsrId;
		this.cntrXchRsnSeq = cntrXchRsnSeq;
		this.cntrXchRefSeq = cntrXchRefSeq;
		this.updDt = updDt;
		this.creDt = creDt;
		this.creUsrId = creUsrId;
		this.cntrNo = cntrNo;
		this.cnmvIdNo = cnmvIdNo;
		this.xchRsnCd = xchRsnCd;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cntr_xch_seq", getCntrXchSeq());
		this.hashColumns.put("cnmv_yr", getCnmvYr());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cntr_xch_rsn_seq", getCntrXchRsnSeq());
		this.hashColumns.put("cntr_xch_ref_seq", getCntrXchRefSeq());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("cnmv_id_no", getCnmvIdNo());
		this.hashColumns.put("xch_rsn_cd", getXchRsnCd());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cntr_xch_seq", "cntrXchSeq");
		this.hashFields.put("cnmv_yr", "cnmvYr");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cntr_xch_rsn_seq", "cntrXchRsnSeq");
		this.hashFields.put("cntr_xch_ref_seq", "cntrXchRefSeq");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("cnmv_id_no", "cnmvIdNo");
		this.hashFields.put("xch_rsn_cd", "xchRsnCd");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getIbflag() {
		return this.ibflag;
	}
	public String getCntrXchSeq() {
		return this.cntrXchSeq;
	}
	public String getCnmvYr() {
		return this.cnmvYr;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getCntrXchRsnSeq() {
		return this.cntrXchRsnSeq;
	}
	public String getCntrXchRefSeq() {
		return this.cntrXchRefSeq;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getCntrNo() {
		return this.cntrNo;
	}
	public String getCnmvIdNo() {
		return this.cnmvIdNo;
	}
	public String getXchRsnCd() {
		return this.xchRsnCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setCntrXchSeq(String cntrXchSeq) {
		this.cntrXchSeq = cntrXchSeq;
		//this.cntrXchSeq=true;
	}
	public void setCnmvYr(String cnmvYr) {
		this.cnmvYr = cnmvYr;
		//this.cnmvYr=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setCntrXchRsnSeq(String cntrXchRsnSeq) {
		this.cntrXchRsnSeq = cntrXchRsnSeq;
		//this.cntrXchRsnSeq=true;
	}
	public void setCntrXchRefSeq(String cntrXchRefSeq) {
		this.cntrXchRefSeq = cntrXchRefSeq;
		//this.cntrXchRefSeq=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
		//this.cntrNo=true;
	}
	public void setCnmvIdNo(String cnmvIdNo) {
		this.cnmvIdNo = cnmvIdNo;
		//this.cnmvIdNo=true;
	}
	public void setXchRsnCd(String xchRsnCd) {
		this.xchRsnCd = xchRsnCd;
		//this.xchRsnCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCntrXchSeq(JSPUtil.getParameter(request, "cntr_xch_seq", ""));
		setCnmvYr(JSPUtil.getParameter(request, "cnmv_yr", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCntrXchRsnSeq(JSPUtil.getParameter(request, "cntr_xch_rsn_seq", ""));
		setCntrXchRefSeq(JSPUtil.getParameter(request, "cntr_xch_ref_seq", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setCnmvIdNo(JSPUtil.getParameter(request, "cnmv_id_no", ""));
		setXchRsnCd(JSPUtil.getParameter(request, "xch_rsn_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public CtmMvmtXchDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CtmMvmtXchDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CtmMvmtXchDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] cntrXchSeq = (JSPUtil.getParameter(request, prefix	+ "cntr_xch_seq".trim(), length));
			String[] cnmvYr = (JSPUtil.getParameter(request, prefix	+ "cnmv_yr".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] cntrXchRsnSeq = (JSPUtil.getParameter(request, prefix	+ "cntr_xch_rsn_seq".trim(), length));
			String[] cntrXchRefSeq = (JSPUtil.getParameter(request, prefix	+ "cntr_xch_ref_seq".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no".trim(), length));
			String[] cnmvIdNo = (JSPUtil.getParameter(request, prefix	+ "cnmv_id_no".trim(), length));
			String[] xchRsnCd = (JSPUtil.getParameter(request, prefix	+ "xch_rsn_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CtmMvmtXchDtlVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cntrXchSeq[i] != null)
					model.setCntrXchSeq(cntrXchSeq[i]);
				if (cnmvYr[i] != null)
					model.setCnmvYr(cnmvYr[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (cntrXchRsnSeq[i] != null)
					model.setCntrXchRsnSeq(cntrXchRsnSeq[i]);
				if (cntrXchRefSeq[i] != null)
					model.setCntrXchRefSeq(cntrXchRefSeq[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (cnmvIdNo[i] != null)
					model.setCnmvIdNo(cnmvIdNo[i]);
				if (xchRsnCd[i] != null)
					model.setXchRsnCd(xchRsnCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCtmMvmtXchDtlVOs();
	}

	public CtmMvmtXchDtlVO[] getCtmMvmtXchDtlVOs(){
		CtmMvmtXchDtlVO[] vos = (CtmMvmtXchDtlVO[])models.toArray(new CtmMvmtXchDtlVO[models.size()]);
		return vos;
	}
	
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
		} catch (Exception ex) {}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 * @throws IllegalAccessException
	 */
	private String[] getField(Field[] field, int i) throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrXchSeq = this.cntrXchSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvYr = this.cnmvYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrXchRsnSeq = this.cntrXchRsnSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrXchRefSeq = this.cntrXchRefSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvIdNo = this.cnmvIdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xchRsnCd = this.xchRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
