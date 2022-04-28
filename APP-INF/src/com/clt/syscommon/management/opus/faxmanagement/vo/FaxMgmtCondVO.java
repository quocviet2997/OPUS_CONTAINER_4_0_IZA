/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CodeMgmtCondVO.java
*@FileTitle : CodeMgmtCondVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.25
*@LastModifier : 이선영
*@LastVersion : 1.0
* 2009.05.25 이선영 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.management.opus.faxmanagement.vo;

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
 * @author 이선영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class FaxMgmtCondVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<FaxMgmtCondVO> models = new ArrayList<FaxMgmtCondVO>();
	
	/* Column Info */
	private String ibflag = null;	
	
	/* Column Info */
	private String chk= null;	
	
	/* Column Info */
	private String faxSndNo = null;
	/* Column Info */
	private String rdApplCd = null;
	/* Column Info */
	private String rcvrInfoCtnt = null; 
	/* Column Info */
	private String rdSubSysCd  = null;
	/* Column Info */
	private String creUsrId  = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String faxSndDate= null;
	/* Column Info */
	private String faxTitNm  = null;
	/* Column Info */
	private String faxProcStsCd = null;
	/* Column Info */
	private String xptErrMsg= null;
	/* Column Info */
	private String updUsrId = null;
	
	
	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public FaxMgmtCondVO() {}

	public FaxMgmtCondVO(String faxSndNo, String rdApplCd, String rcvrInfoCtnt, String rdSubSysCd, String creUsrId, 
						String ofcCd, String faxSndDate, String faxTitNm, String faxProcStsCd, String xptErrMsg) {
		this.faxSndNo = faxSndNo;
		this.rdApplCd = rdApplCd;
		this.rcvrInfoCtnt = rcvrInfoCtnt;
		this.rdSubSysCd = rdSubSysCd;
		this.creUsrId = creUsrId;
		
		this.ofcCd = ofcCd;
		this.faxSndDate = faxSndDate;
		this.faxTitNm = faxTitNm;
		this.faxProcStsCd = faxProcStsCd;
		this.xptErrMsg = xptErrMsg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		
		this.hashColumns.put("fax_snd_no", 		getFaxSndNo());
		this.hashColumns.put("rd_appl_cd", 		getRdApplCd() );
		this.hashColumns.put("rcvr_info_ctnt", 	getRcvrInfoCtnt());
		this.hashColumns.put("rd_sub_sys_cd", 	getRdSubSysCd());
		this.hashColumns.put("cre_usr_id", 		getCreUsrId());
		
		this.hashColumns.put("ofc_cd", 			getOfcCd() );
		this.hashColumns.put("fax_snd_date", 	getFaxSndDate() );
		this.hashColumns.put("fax_tit_nm",		getFaxTitNm());
		this.hashColumns.put("fax_proc_sts_cd", getFaxProcStsCd());
		this.hashColumns.put("xpt_err_msg", 	getXptErrMsg());
		
		this.hashColumns.put("upd_usr_id", 	getUpdUsrId());
		
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		
		this.hashFields.put("fax_snd_no", 		"faxSndNo");
		this.hashFields.put("rd_appl_cd", 		"rdApplCd");
		this.hashFields.put("rcvr_info_ctnt", 	"rcvrInfoCtnt");
		this.hashFields.put("rd_sub_sys_cd", 	"rdSubSysCd");
		this.hashFields.put("cre_usr_id", 		"creUsrId");
		
		this.hashFields.put("ofc_cd", 			"ofcCd");
		this.hashFields.put("fax_snd_date", 	"faxSndDate");
		this.hashFields.put("fax_tit_nm", 		"faxTitNm");
		this.hashFields.put("fax_proc_sts_cd", 	"faxProcStsCd");
		this.hashFields.put("xpt_err_msg", 		"xptErrMsg");
		
		return this.hashFields;
	}
	
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public String getIbflag() {
		return ibflag;
	}

	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public void setIbflag(String ibflag) {
		ibflag = ibflag;
	}

	
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public String getFaxSndNo() {
		return faxSndNo;
	}
	
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public void setFaxSndNo(String faxSndNo) {
		this.faxSndNo = faxSndNo;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public String getRdApplCd() {
		return rdApplCd;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public void setRdApplCd(String rdApplCd) {
		this.rdApplCd = rdApplCd;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public String getRcvrInfoCtnt() {
		return rcvrInfoCtnt;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public void setRcvrInfoCtnt(String rcvrInfoCtnt) {
		this.rcvrInfoCtnt = rcvrInfoCtnt;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public String getRdSubSysCd() {
		return rdSubSysCd;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public void setRdSubSysCd(String rdSubSysCd) {
		this.rdSubSysCd = rdSubSysCd;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public String getCreUsrId() {
		return creUsrId;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public String getOfcCd() {
		return ofcCd;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public String getFaxSndDate() {
		return faxSndDate;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public void setFaxSndDate(String faxSndDate) {
		this.faxSndDate = faxSndDate;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public String getFaxTitNm() {
		return faxTitNm;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public void setFaxTitNm(String faxTitNm) {
		this.faxTitNm = faxTitNm;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public String getFaxProcStsCd() {
		return faxProcStsCd;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public void setFaxProcStsCd(String faxProcStsCd) {
		this.faxProcStsCd = faxProcStsCd;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public String getXptErrMsg() {
		return xptErrMsg;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */	
	public void setXptErrMsg(String xptErrMsg) {
		this.xptErrMsg = xptErrMsg;
	}
		

	/**
	 * Column Info
	 * @return searchtype
	 */
	public String getChk() {
		return chk;
	}

	/**
	 * Column Info
	 * @return searchtype
	 */
	public void setChk(String chk) {
		this.chk = chk;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */
	public String getUpdUsrId() {
		return updUsrId;
	}
	
	/**
	 * Column Info
	 * @return searchtype
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setFaxSndNo(JSPUtil.getParameter(request, "faxSndNo", ""));
		setRdApplCd(JSPUtil.getParameter(request, "rdApplCd", ""));
		setRcvrInfoCtnt(JSPUtil.getParameter(request, "rcvrInfoCtnt", ""));
		setRdSubSysCd(JSPUtil.getParameter(request, "rdSubSysCd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "creUsrId", ""));
		
		setOfcCd(JSPUtil.getParameter(request, "ofcCd", ""));
		setFaxSndDate(JSPUtil.getParameter(request, "faxSndDate", ""));
		setFaxProcStsCd(JSPUtil.getParameter(request, "faxProcStsCd", ""));
		setFaxTitNm(JSPUtil.getParameter(request, "faxTitNm", ""));
		setXptErrMsg(JSPUtil.getParameter(request, "xptErrMsg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CodeMgmtCondVO[]
	 */
	public FaxMgmtCondVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CodeMgmtCondVO[]
	 */
	public FaxMgmtCondVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
				
		FaxMgmtCondVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			
			String[] ibflag = (JSPUtil.getParameter(request, 			prefix	+ "ibflag".trim(), length));			
			String[] chk = (JSPUtil.getParameter(request, 				prefix	+ "chk".trim(), length));
			
			String[] faxSndNo = (JSPUtil.getParameter(request, 			prefix	+ "fax_snd_no".trim(), length));
			String[] rdApplCd = (JSPUtil.getParameter(request, 			prefix	+ "rd_appl_cd".trim(), length));
			String[] rcvrInfoCtnt = (JSPUtil.getParameter(request, 		prefix	+ "rcvr_info_ctnt".trim(), length));
			String[] rdSubSysCd = (JSPUtil.getParameter(request, 		prefix	+ "rd_sub_sys_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, 			prefix	+ "cre_usr_id".trim(), length));
			
			String[] ofcCd = (JSPUtil.getParameter(request, 			prefix	+ "ofc_cd".trim(), length));
			String[] faxSndDate = (JSPUtil.getParameter(request, 		prefix	+ "fax_snd_date".trim(), length));
			String[] faxTitNm = (JSPUtil.getParameter(request, 			prefix	+ "fax_tit_nm".trim(), length));
			String[] faxProcStsCd = (JSPUtil.getParameter(request, 		prefix	+ "fax_proc_sts_cd".trim(), length));
			String[] xptErrMsg = (JSPUtil.getParameter(request, 		prefix	+ "xpt_err_msg".trim(), length));
			
				
			for (int i = 0; i < length; i++) {
				
				model = new FaxMgmtCondVO();
				
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);				
				
				if (chk[i] != null)					
					model.setChk(chk[i]);			
				
					
				if (faxSndNo[i] != null)
					model.setFaxSndNo(faxSndNo[i]);
				if (rdApplCd[i] != null)
					model.setRdApplCd(rdApplCd[i]);
				if (rcvrInfoCtnt[i] != null)
					model.setRcvrInfoCtnt(rcvrInfoCtnt[i]);
				if (rdSubSysCd[i] != null)
					model.setRdSubSysCd(rdSubSysCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				
			
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (faxSndDate[i] != null)
					model.setFaxSndDate(faxSndDate[i]);
				if (faxTitNm[i] != null)
					model.setFaxTitNm(faxTitNm[i]);
				if (faxProcStsCd[i] != null)
					model.setFaxProcStsCd(faxProcStsCd[i]);
				if (xptErrMsg[i] != null)
					model.setXptErrMsg(xptErrMsg[i]);	
					
					
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getFaxMgmtCondVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CodeMgmtCondVO[]
	 */
	public FaxMgmtCondVO[] getFaxMgmtCondVOs(){
		FaxMgmtCondVO[] vos = (FaxMgmtCondVO[])models.toArray(new FaxMgmtCondVO[models.size()]);
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
		
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		
		this.faxSndNo = this.faxSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdApplCd = this.rdApplCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvrInfoCtnt = this.rcvrInfoCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdSubSysCd = this.rdSubSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxSndDate = this.faxSndDate .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxTitNm = this.faxTitNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxProcStsCd = this.faxProcStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptErrMsg = this.xptErrMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
