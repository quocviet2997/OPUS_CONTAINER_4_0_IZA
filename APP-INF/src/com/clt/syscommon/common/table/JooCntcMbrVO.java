/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : JooCntcMbrVO.java
*@FileTitle : JooCntcMbrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.11
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.06.11 함대성 
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
 * @author 함대성
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class JooCntcMbrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<JooCntcMbrVO> models = new ArrayList<JooCntcMbrVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String joCrrCd = null;
	/* Column Info */
	private String custSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String svcInChgNm = null;
	/* Column Info */
	private String joCntcFaxNo = null;
	/* Column Info */
	private String cntcPsonNm = null;
	/* Column Info */
	private String crrCntcSeq = null;
	/* Column Info */
	private String joCntcEml = null;
	/* Column Info */
	private String joCntcPhnNo = null;
	/* Column Info */
	private String joCntcOfcAddr = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String custCntCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public JooCntcMbrVO() {}

	public JooCntcMbrVO(String ibflag, String pagerows, String joCrrCd, String crrCntcSeq, String cntcPsonNm, String custCntCd, String custSeq, String svcInChgNm, String joCntcPhnNo, String joCntcFaxNo, String joCntcEml, String joCntcOfcAddr, String creDt, String creUsrId, String updDt, String updUsrId) {
		this.updDt = updDt;
		this.creDt = creDt;
		this.joCrrCd = joCrrCd;
		this.custSeq = custSeq;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.svcInChgNm = svcInChgNm;
		this.joCntcFaxNo = joCntcFaxNo;
		this.cntcPsonNm = cntcPsonNm;
		this.crrCntcSeq = crrCntcSeq;
		this.joCntcEml = joCntcEml;
		this.joCntcPhnNo = joCntcPhnNo;
		this.joCntcOfcAddr = joCntcOfcAddr;
		this.updUsrId = updUsrId;
		this.custCntCd = custCntCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("jo_crr_cd", getJoCrrCd());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("svc_in_chg_nm", getSvcInChgNm());
		this.hashColumns.put("jo_cntc_fax_no", getJoCntcFaxNo());
		this.hashColumns.put("cntc_pson_nm", getCntcPsonNm());
		this.hashColumns.put("crr_cntc_seq", getCrrCntcSeq());
		this.hashColumns.put("jo_cntc_eml", getJoCntcEml());
		this.hashColumns.put("jo_cntc_phn_no", getJoCntcPhnNo());
		this.hashColumns.put("jo_cntc_ofc_addr", getJoCntcOfcAddr());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("jo_crr_cd", "joCrrCd");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("svc_in_chg_nm", "svcInChgNm");
		this.hashFields.put("jo_cntc_fax_no", "joCntcFaxNo");
		this.hashFields.put("cntc_pson_nm", "cntcPsonNm");
		this.hashFields.put("crr_cntc_seq", "crrCntcSeq");
		this.hashFields.put("jo_cntc_eml", "joCntcEml");
		this.hashFields.put("jo_cntc_phn_no", "joCntcPhnNo");
		this.hashFields.put("jo_cntc_ofc_addr", "joCntcOfcAddr");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return joCrrCd
	 */
	public String getJoCrrCd() {
		return this.joCrrCd;
	}
	
	/**
	 * Column Info
	 * @return custSeq
	 */
	public String getCustSeq() {
		return this.custSeq;
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
	 * @return svcInChgNm
	 */
	public String getSvcInChgNm() {
		return this.svcInChgNm;
	}
	
	/**
	 * Column Info
	 * @return joCntcFaxNo
	 */
	public String getJoCntcFaxNo() {
		return this.joCntcFaxNo;
	}
	
	/**
	 * Column Info
	 * @return cntcPsonNm
	 */
	public String getCntcPsonNm() {
		return this.cntcPsonNm;
	}
	
	/**
	 * Column Info
	 * @return crrCntcSeq
	 */
	public String getCrrCntcSeq() {
		return this.crrCntcSeq;
	}
	
	/**
	 * Column Info
	 * @return joCntcEml
	 */
	public String getJoCntcEml() {
		return this.joCntcEml;
	}
	
	/**
	 * Column Info
	 * @return joCntcPhnNo
	 */
	public String getJoCntcPhnNo() {
		return this.joCntcPhnNo;
	}
	
	/**
	 * Column Info
	 * @return joCntcOfcAddr
	 */
	public String getJoCntcOfcAddr() {
		return this.joCntcOfcAddr;
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
	 * @return custCntCd
	 */
	public String getCustCntCd() {
		return this.custCntCd;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param joCrrCd
	 */
	public void setJoCrrCd(String joCrrCd) {
		this.joCrrCd = joCrrCd;
	}
	
	/**
	 * Column Info
	 * @param custSeq
	 */
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
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
	 * @param svcInChgNm
	 */
	public void setSvcInChgNm(String svcInChgNm) {
		this.svcInChgNm = svcInChgNm;
	}
	
	/**
	 * Column Info
	 * @param joCntcFaxNo
	 */
	public void setJoCntcFaxNo(String joCntcFaxNo) {
		this.joCntcFaxNo = joCntcFaxNo;
	}
	
	/**
	 * Column Info
	 * @param cntcPsonNm
	 */
	public void setCntcPsonNm(String cntcPsonNm) {
		this.cntcPsonNm = cntcPsonNm;
	}
	
	/**
	 * Column Info
	 * @param crrCntcSeq
	 */
	public void setCrrCntcSeq(String crrCntcSeq) {
		this.crrCntcSeq = crrCntcSeq;
	}
	
	/**
	 * Column Info
	 * @param joCntcEml
	 */
	public void setJoCntcEml(String joCntcEml) {
		this.joCntcEml = joCntcEml;
	}
	
	/**
	 * Column Info
	 * @param joCntcPhnNo
	 */
	public void setJoCntcPhnNo(String joCntcPhnNo) {
		this.joCntcPhnNo = joCntcPhnNo;
	}
	
	/**
	 * Column Info
	 * @param joCntcOfcAddr
	 */
	public void setJoCntcOfcAddr(String joCntcOfcAddr) {
		this.joCntcOfcAddr = joCntcOfcAddr;
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
	 * @param custCntCd
	 */
	public void setCustCntCd(String custCntCd) {
		this.custCntCd = custCntCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setJoCrrCd(JSPUtil.getParameter(request, "jo_crr_cd", ""));
		setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSvcInChgNm(JSPUtil.getParameter(request, "svc_in_chg_nm", ""));
		setJoCntcFaxNo(JSPUtil.getParameter(request, "jo_cntc_fax_no", ""));
		setCntcPsonNm(JSPUtil.getParameter(request, "cntc_pson_nm", ""));
		setCrrCntcSeq(JSPUtil.getParameter(request, "crr_cntc_seq", ""));
		setJoCntcEml(JSPUtil.getParameter(request, "jo_cntc_eml", ""));
		setJoCntcPhnNo(JSPUtil.getParameter(request, "jo_cntc_phn_no", ""));
		setJoCntcOfcAddr(JSPUtil.getParameter(request, "jo_cntc_ofc_addr", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return JooCntcMbrVO[]
	 */
	public JooCntcMbrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return JooCntcMbrVO[]
	 */
	public JooCntcMbrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		JooCntcMbrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] joCrrCd = (JSPUtil.getParameter(request, prefix	+ "jo_crr_cd", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] svcInChgNm = (JSPUtil.getParameter(request, prefix	+ "svc_in_chg_nm", length));
			String[] joCntcFaxNo = (JSPUtil.getParameter(request, prefix	+ "jo_cntc_fax_no", length));
			String[] cntcPsonNm = (JSPUtil.getParameter(request, prefix	+ "cntc_pson_nm", length));
			String[] crrCntcSeq = (JSPUtil.getParameter(request, prefix	+ "crr_cntc_seq", length));
			String[] joCntcEml = (JSPUtil.getParameter(request, prefix	+ "jo_cntc_eml", length));
			String[] joCntcPhnNo = (JSPUtil.getParameter(request, prefix	+ "jo_cntc_phn_no", length));
			String[] joCntcOfcAddr = (JSPUtil.getParameter(request, prefix	+ "jo_cntc_ofc_addr", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new JooCntcMbrVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (joCrrCd[i] != null)
					model.setJoCrrCd(joCrrCd[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (svcInChgNm[i] != null)
					model.setSvcInChgNm(svcInChgNm[i]);
				if (joCntcFaxNo[i] != null)
					model.setJoCntcFaxNo(joCntcFaxNo[i]);
				if (cntcPsonNm[i] != null)
					model.setCntcPsonNm(cntcPsonNm[i]);
				if (crrCntcSeq[i] != null)
					model.setCrrCntcSeq(crrCntcSeq[i]);
				if (joCntcEml[i] != null)
					model.setJoCntcEml(joCntcEml[i]);
				if (joCntcPhnNo[i] != null)
					model.setJoCntcPhnNo(joCntcPhnNo[i]);
				if (joCntcOfcAddr[i] != null)
					model.setJoCntcOfcAddr(joCntcOfcAddr[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getJooCntcMbrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return JooCntcMbrVO[]
	 */
	public JooCntcMbrVO[] getJooCntcMbrVOs(){
		JooCntcMbrVO[] vos = (JooCntcMbrVO[])models.toArray(new JooCntcMbrVO[models.size()]);
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
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joCrrCd = this.joCrrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcInChgNm = this.svcInChgNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joCntcFaxNo = this.joCntcFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPsonNm = this.cntcPsonNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crrCntcSeq = this.crrCntcSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joCntcEml = this.joCntcEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joCntcPhnNo = this.joCntcPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joCntcOfcAddr = this.joCntcOfcAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
