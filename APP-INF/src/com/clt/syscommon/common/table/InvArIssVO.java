/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : InvArIssVO.java
*@FileTitle : InvArIssVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.04
*@LastModifier : 김세일
*@LastVersion : 1.0
* 2009.05.04 김세일 
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
 * @author 김세일
 * @since J2EE 1.5
 */

public class InvArIssVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<InvArIssVO> models = new ArrayList<InvArIssVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String emlSndDt = null;
	/* Column Info */
	private String rissDt = null;
	/* Column Info */
	private String actInvNo = null;
	/* Column Info */
	private String issOfcCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String invSeq = null;
	/* Column Info */
	private String emlSndNo = null;
	/* Column Info */
	private String custEml = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String issDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String invIssRmk = null;
	/* Column Info */
	private String custFaxNo = null;
	/* Column Info */
	private String faxSndDt = null;
	/* Column Info */
	private String faxSndNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String invIssCmbFlg = null;
		

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public InvArIssVO() {}

	public InvArIssVO(String ibflag, String pagerows, String invNo, String invSeq, String actInvNo, String issOfcCd, String issDt, String rissDt, String invIssRmk, String custEml, String emlSndDt, String emlSndNo, String custFaxNo, String faxSndDt, String faxSndNo, String creUsrId, String creDt, String updUsrId, String updDt, String invIssCmbFlg) {
		this.updDt = updDt;
		this.emlSndDt = emlSndDt;
		this.rissDt = rissDt;
		this.actInvNo = actInvNo;
		this.issOfcCd = issOfcCd;
		this.creDt = creDt;
		this.invSeq = invSeq;
		this.emlSndNo = emlSndNo;
		this.custEml = custEml;
		this.pagerows = pagerows;
		this.invNo = invNo;
		this.issDt = issDt;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.invIssRmk = invIssRmk;
		this.custFaxNo = custFaxNo;
		this.faxSndDt = faxSndDt;
		this.faxSndNo = faxSndNo;
		this.updUsrId = updUsrId;
		this.invIssCmbFlg = invIssCmbFlg;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("eml_snd_dt", getEmlSndDt());
		this.hashColumns.put("riss_dt", getRissDt());
		this.hashColumns.put("act_inv_no", getActInvNo());
		this.hashColumns.put("iss_ofc_cd", getIssOfcCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("inv_seq", getInvSeq());
		this.hashColumns.put("eml_snd_no", getEmlSndNo());
		this.hashColumns.put("cust_eml", getCustEml());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("iss_dt", getIssDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("inv_iss_rmk", getInvIssRmk());
		this.hashColumns.put("cust_fax_no", getCustFaxNo());
		this.hashColumns.put("fax_snd_dt", getFaxSndDt());
		this.hashColumns.put("fax_snd_no", getFaxSndNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("inv_iss_cmb_flg", getInvIssCmbFlg());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("eml_snd_dt", "emlSndDt");
		this.hashFields.put("riss_dt", "rissDt");
		this.hashFields.put("act_inv_no", "actInvNo");
		this.hashFields.put("iss_ofc_cd", "issOfcCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("inv_seq", "invSeq");
		this.hashFields.put("eml_snd_no", "emlSndNo");
		this.hashFields.put("cust_eml", "custEml");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("iss_dt", "issDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("inv_iss_rmk", "invIssRmk");
		this.hashFields.put("cust_fax_no", "custFaxNo");
		this.hashFields.put("fax_snd_dt", "faxSndDt");
		this.hashFields.put("fax_snd_no", "faxSndNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("inv_iss_cmb_flg", "invIssCmbFlg");
		return this.hashFields;
	}
	
	public String getUpdDt() {
		return this.updDt;
	}
	public String getEmlSndDt() {
		return this.emlSndDt;
	}
	public String getRissDt() {
		return this.rissDt;
	}
	public String getActInvNo() {
		return this.actInvNo;
	}
	public String getIssOfcCd() {
		return this.issOfcCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getInvSeq() {
		return this.invSeq;
	}
	public String getEmlSndNo() {
		return this.emlSndNo;
	}
	public String getCustEml() {
		return this.custEml;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getInvNo() {
		return this.invNo;
	}
	public String getIssDt() {
		return this.issDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getInvIssRmk() {
		return this.invIssRmk;
	}
	public String getCustFaxNo() {
		return this.custFaxNo;
	}
	public String getFaxSndDt() {
		return this.faxSndDt;
	}
	public String getFaxSndNo() {
		return this.faxSndNo;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setEmlSndDt(String emlSndDt) {
		this.emlSndDt = emlSndDt;
		//this.emlSndDt=true;
	}
	public void setRissDt(String rissDt) {
		this.rissDt = rissDt;
		//this.rissDt=true;
	}
	public void setActInvNo(String actInvNo) {
		this.actInvNo = actInvNo;
		//this.actInvNo=true;
	}
	public void setIssOfcCd(String issOfcCd) {
		this.issOfcCd = issOfcCd;
		//this.issOfcCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setInvSeq(String invSeq) {
		this.invSeq = invSeq;
		//this.invSeq=true;
	}
	public void setEmlSndNo(String emlSndNo) {
		this.emlSndNo = emlSndNo;
		//this.emlSndNo=true;
	}
	public void setCustEml(String custEml) {
		this.custEml = custEml;
		//this.custEml=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setInvNo(String invNo) {
		this.invNo = invNo;
		//this.invNo=true;
	}
	public void setIssDt(String issDt) {
		this.issDt = issDt;
		//this.issDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setInvIssRmk(String invIssRmk) {
		this.invIssRmk = invIssRmk;
		//this.invIssRmk=true;
	}
	public void setCustFaxNo(String custFaxNo) {
		this.custFaxNo = custFaxNo;
		//this.custFaxNo=true;
	}
	public void setFaxSndDt(String faxSndDt) {
		this.faxSndDt = faxSndDt;
		//this.faxSndDt=true;
	}
	public void setFaxSndNo(String faxSndNo) {
		this.faxSndNo = faxSndNo;
		//this.faxSndNo=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	
	/**
	 * @return the invIssSglFlg
	 */
	public String getInvIssCmbFlg() {
		return invIssCmbFlg;
	}

	/**
	 * @param invIssSglFlg the invIssSglFlg to set
	 */
	public void setInvIssCmbFlg(String invIssCmbFlg) {
		this.invIssCmbFlg = invIssCmbFlg;
	}

	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setEmlSndDt(JSPUtil.getParameter(request, "eml_snd_dt", ""));
		setRissDt(JSPUtil.getParameter(request, "riss_dt", ""));
		setActInvNo(JSPUtil.getParameter(request, "act_inv_no", ""));
		setIssOfcCd(JSPUtil.getParameter(request, "iss_ofc_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setInvSeq(JSPUtil.getParameter(request, "inv_seq", ""));
		setEmlSndNo(JSPUtil.getParameter(request, "eml_snd_no", ""));
		setCustEml(JSPUtil.getParameter(request, "cust_eml", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setInvNo(JSPUtil.getParameter(request, "inv_no", ""));
		setIssDt(JSPUtil.getParameter(request, "iss_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setInvIssRmk(JSPUtil.getParameter(request, "inv_iss_rmk", ""));
		setCustFaxNo(JSPUtil.getParameter(request, "cust_fax_no", ""));
		setFaxSndDt(JSPUtil.getParameter(request, "fax_snd_dt", ""));
		setFaxSndNo(JSPUtil.getParameter(request, "fax_snd_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setInvIssCmbFlg(JSPUtil.getParameter(request, "inv_iss_cmb_flg", ""));
	}

	public InvArIssVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public InvArIssVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		InvArIssVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] emlSndDt = (JSPUtil.getParameter(request, prefix	+ "eml_snd_dt".trim(), length));
			String[] rissDt = (JSPUtil.getParameter(request, prefix	+ "riss_dt".trim(), length));
			String[] actInvNo = (JSPUtil.getParameter(request, prefix	+ "act_inv_no".trim(), length));
			String[] issOfcCd = (JSPUtil.getParameter(request, prefix	+ "iss_ofc_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] invSeq = (JSPUtil.getParameter(request, prefix	+ "inv_seq".trim(), length));
			String[] emlSndNo = (JSPUtil.getParameter(request, prefix	+ "eml_snd_no".trim(), length));
			String[] custEml = (JSPUtil.getParameter(request, prefix	+ "cust_eml".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no".trim(), length));
			String[] issDt = (JSPUtil.getParameter(request, prefix	+ "iss_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] invIssRmk = (JSPUtil.getParameter(request, prefix	+ "inv_iss_rmk".trim(), length));
			String[] custFaxNo = (JSPUtil.getParameter(request, prefix	+ "cust_fax_no".trim(), length));
			String[] faxSndDt = (JSPUtil.getParameter(request, prefix	+ "fax_snd_dt".trim(), length));
			String[] faxSndNo = (JSPUtil.getParameter(request, prefix	+ "fax_snd_no".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] invIssSglFlg = (JSPUtil.getParameter(request, prefix	+ "inv_iss_sgl_flg".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new InvArIssVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (emlSndDt[i] != null)
					model.setEmlSndDt(emlSndDt[i]);
				if (rissDt[i] != null)
					model.setRissDt(rissDt[i]);
				if (actInvNo[i] != null)
					model.setActInvNo(actInvNo[i]);
				if (issOfcCd[i] != null)
					model.setIssOfcCd(issOfcCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (invSeq[i] != null)
					model.setInvSeq(invSeq[i]);
				if (emlSndNo[i] != null)
					model.setEmlSndNo(emlSndNo[i]);
				if (custEml[i] != null)
					model.setCustEml(custEml[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (issDt[i] != null)
					model.setIssDt(issDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (invIssRmk[i] != null)
					model.setInvIssRmk(invIssRmk[i]);
				if (custFaxNo[i] != null)
					model.setCustFaxNo(custFaxNo[i]);
				if (faxSndDt[i] != null)
					model.setFaxSndDt(faxSndDt[i]);
				if (faxSndNo[i] != null)
					model.setFaxSndNo(faxSndNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (invIssSglFlg[i] != null)
					model.setInvIssCmbFlg(invIssSglFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getInvArIssVOs();
	}

	public InvArIssVO[] getInvArIssVOs(){
		InvArIssVO[] vos = (InvArIssVO[])models.toArray(new InvArIssVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlSndDt = this.emlSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rissDt = this.rissDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actInvNo = this.actInvNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issOfcCd = this.issOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invSeq = this.invSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlSndNo = this.emlSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custEml = this.custEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issDt = this.issDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invIssRmk = this.invIssRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custFaxNo = this.custFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxSndDt = this.faxSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxSndNo = this.faxSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invIssCmbFlg = this.invIssCmbFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
