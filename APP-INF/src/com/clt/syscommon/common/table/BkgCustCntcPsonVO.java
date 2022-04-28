/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCustCntcPsonVO.java
*@FileTitle : BkgCustCntcPsonVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.04
*@LastModifier : 김병규
*@LastVersion : 1.0
* 2009.08.04 김병규 
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
 * @author 김병규
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCustCntcPsonVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCustCntcPsonVO> models = new ArrayList<BkgCustCntcPsonVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String phnNo = null;
	/* Column Info */
	private String bkgCntcPsonTpCd = null;
	/* Column Info */
	private String fwrdCntCd = null;
	/* Column Info */
	private String fwrdCustSeq = null;
	/* Column Info */
	private String cntcPsonSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String cntcEml = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String cntcPsonJbNm = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String cntcPsonMphnNo = null;
	/* Column Info */
	private String cntcPsonNm = null;
	/* Column Info */
	private String faxNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String custCntCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCustCntcPsonVO() {}

	public BkgCustCntcPsonVO(String ibflag, String pagerows, String custCntCd, String custSeq, String cntcPsonSeq, String bkgCntcPsonTpCd, String cntcPsonNm, String cntcPsonJbNm, String cntcEml, String phnNo, String faxNo, String diffRmk, String fwrdCntCd, String fwrdCustSeq, String creUsrId, String creDt, String updUsrId, String updDt, String cntcPsonMphnNo) {
		this.updDt = updDt;
		this.phnNo = phnNo;
		this.bkgCntcPsonTpCd = bkgCntcPsonTpCd;
		this.fwrdCntCd = fwrdCntCd;
		this.fwrdCustSeq = fwrdCustSeq;
		this.cntcPsonSeq = cntcPsonSeq;
		this.creDt = creDt;
		this.cntcEml = cntcEml;
		this.custSeq = custSeq;
		this.cntcPsonJbNm = cntcPsonJbNm;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.diffRmk = diffRmk;
		this.cntcPsonMphnNo = cntcPsonMphnNo;
		this.cntcPsonNm = cntcPsonNm;
		this.faxNo = faxNo;
		this.updUsrId = updUsrId;
		this.custCntCd = custCntCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("phn_no", getPhnNo());
		this.hashColumns.put("bkg_cntc_pson_tp_cd", getBkgCntcPsonTpCd());
		this.hashColumns.put("fwrd_cnt_cd", getFwrdCntCd());
		this.hashColumns.put("fwrd_cust_seq", getFwrdCustSeq());
		this.hashColumns.put("cntc_pson_seq", getCntcPsonSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cntc_eml", getCntcEml());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("cntc_pson_jb_nm", getCntcPsonJbNm());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("cntc_pson_mphn_no", getCntcPsonMphnNo());
		this.hashColumns.put("cntc_pson_nm", getCntcPsonNm());
		this.hashColumns.put("fax_no", getFaxNo());
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
		this.hashFields.put("phn_no", "phnNo");
		this.hashFields.put("bkg_cntc_pson_tp_cd", "bkgCntcPsonTpCd");
		this.hashFields.put("fwrd_cnt_cd", "fwrdCntCd");
		this.hashFields.put("fwrd_cust_seq", "fwrdCustSeq");
		this.hashFields.put("cntc_pson_seq", "cntcPsonSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cntc_eml", "cntcEml");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("cntc_pson_jb_nm", "cntcPsonJbNm");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("cntc_pson_mphn_no", "cntcPsonMphnNo");
		this.hashFields.put("cntc_pson_nm", "cntcPsonNm");
		this.hashFields.put("fax_no", "faxNo");
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
	 * @return phnNo
	 */
	public String getPhnNo() {
		return this.phnNo;
	}
	
	/**
	 * Column Info
	 * @return bkgCntcPsonTpCd
	 */
	public String getBkgCntcPsonTpCd() {
		return this.bkgCntcPsonTpCd;
	}
	
	/**
	 * Column Info
	 * @return fwrdCntCd
	 */
	public String getFwrdCntCd() {
		return this.fwrdCntCd;
	}
	
	/**
	 * Column Info
	 * @return fwrdCustSeq
	 */
	public String getFwrdCustSeq() {
		return this.fwrdCustSeq;
	}
	
	/**
	 * Column Info
	 * @return cntcPsonSeq
	 */
	public String getCntcPsonSeq() {
		return this.cntcPsonSeq;
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
	 * @return cntcEml
	 */
	public String getCntcEml() {
		return this.cntcEml;
	}
	
	/**
	 * Column Info
	 * @return custSeq
	 */
	public String getCustSeq() {
		return this.custSeq;
	}
	
	/**
	 * Column Info
	 * @return cntcPsonJbNm
	 */
	public String getCntcPsonJbNm() {
		return this.cntcPsonJbNm;
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
	 * @return diffRmk
	 */
	public String getDiffRmk() {
		return this.diffRmk;
	}
	
	/**
	 * Column Info
	 * @return cntcPsonMphnNo
	 */
	public String getCntcPsonMphnNo() {
		return this.cntcPsonMphnNo;
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
	 * @return faxNo
	 */
	public String getFaxNo() {
		return this.faxNo;
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
	 * @param phnNo
	 */
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	
	/**
	 * Column Info
	 * @param bkgCntcPsonTpCd
	 */
	public void setBkgCntcPsonTpCd(String bkgCntcPsonTpCd) {
		this.bkgCntcPsonTpCd = bkgCntcPsonTpCd;
	}
	
	/**
	 * Column Info
	 * @param fwrdCntCd
	 */
	public void setFwrdCntCd(String fwrdCntCd) {
		this.fwrdCntCd = fwrdCntCd;
	}
	
	/**
	 * Column Info
	 * @param fwrdCustSeq
	 */
	public void setFwrdCustSeq(String fwrdCustSeq) {
		this.fwrdCustSeq = fwrdCustSeq;
	}
	
	/**
	 * Column Info
	 * @param cntcPsonSeq
	 */
	public void setCntcPsonSeq(String cntcPsonSeq) {
		this.cntcPsonSeq = cntcPsonSeq;
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
	 * @param cntcEml
	 */
	public void setCntcEml(String cntcEml) {
		this.cntcEml = cntcEml;
	}
	
	/**
	 * Column Info
	 * @param custSeq
	 */
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}
	
	/**
	 * Column Info
	 * @param cntcPsonJbNm
	 */
	public void setCntcPsonJbNm(String cntcPsonJbNm) {
		this.cntcPsonJbNm = cntcPsonJbNm;
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
	 * @param diffRmk
	 */
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
	}
	
	/**
	 * Column Info
	 * @param cntcPsonMphnNo
	 */
	public void setCntcPsonMphnNo(String cntcPsonMphnNo) {
		this.cntcPsonMphnNo = cntcPsonMphnNo;
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
	 * @param faxNo
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
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
		setPhnNo(JSPUtil.getParameter(request, "phn_no", ""));
		setBkgCntcPsonTpCd(JSPUtil.getParameter(request, "bkg_cntc_pson_tp_cd", ""));
		setFwrdCntCd(JSPUtil.getParameter(request, "fwrd_cnt_cd", ""));
		setFwrdCustSeq(JSPUtil.getParameter(request, "fwrd_cust_seq", ""));
		setCntcPsonSeq(JSPUtil.getParameter(request, "cntc_pson_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCntcEml(JSPUtil.getParameter(request, "cntc_eml", ""));
		setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
		setCntcPsonJbNm(JSPUtil.getParameter(request, "cntc_pson_jb_nm", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setCntcPsonMphnNo(JSPUtil.getParameter(request, "cntc_pson_mphn_no", ""));
		setCntcPsonNm(JSPUtil.getParameter(request, "cntc_pson_nm", ""));
		setFaxNo(JSPUtil.getParameter(request, "fax_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCustCntcPsonVO[]
	 */
	public BkgCustCntcPsonVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCustCntcPsonVO[]
	 */
	public BkgCustCntcPsonVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCustCntcPsonVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] phnNo = (JSPUtil.getParameter(request, prefix	+ "phn_no", length));
			String[] bkgCntcPsonTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_cntc_pson_tp_cd", length));
			String[] fwrdCntCd = (JSPUtil.getParameter(request, prefix	+ "fwrd_cnt_cd", length));
			String[] fwrdCustSeq = (JSPUtil.getParameter(request, prefix	+ "fwrd_cust_seq", length));
			String[] cntcPsonSeq = (JSPUtil.getParameter(request, prefix	+ "cntc_pson_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] cntcEml = (JSPUtil.getParameter(request, prefix	+ "cntc_eml", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			String[] cntcPsonJbNm = (JSPUtil.getParameter(request, prefix	+ "cntc_pson_jb_nm", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] cntcPsonMphnNo = (JSPUtil.getParameter(request, prefix	+ "cntc_pson_mphn_no", length));
			String[] cntcPsonNm = (JSPUtil.getParameter(request, prefix	+ "cntc_pson_nm", length));
			String[] faxNo = (JSPUtil.getParameter(request, prefix	+ "fax_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCustCntcPsonVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (phnNo[i] != null)
					model.setPhnNo(phnNo[i]);
				if (bkgCntcPsonTpCd[i] != null)
					model.setBkgCntcPsonTpCd(bkgCntcPsonTpCd[i]);
				if (fwrdCntCd[i] != null)
					model.setFwrdCntCd(fwrdCntCd[i]);
				if (fwrdCustSeq[i] != null)
					model.setFwrdCustSeq(fwrdCustSeq[i]);
				if (cntcPsonSeq[i] != null)
					model.setCntcPsonSeq(cntcPsonSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (cntcEml[i] != null)
					model.setCntcEml(cntcEml[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (cntcPsonJbNm[i] != null)
					model.setCntcPsonJbNm(cntcPsonJbNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (cntcPsonMphnNo[i] != null)
					model.setCntcPsonMphnNo(cntcPsonMphnNo[i]);
				if (cntcPsonNm[i] != null)
					model.setCntcPsonNm(cntcPsonNm[i]);
				if (faxNo[i] != null)
					model.setFaxNo(faxNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCustCntcPsonVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCustCntcPsonVO[]
	 */
	public BkgCustCntcPsonVO[] getBkgCustCntcPsonVOs(){
		BkgCustCntcPsonVO[] vos = (BkgCustCntcPsonVO[])models.toArray(new BkgCustCntcPsonVO[models.size()]);
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
		this.phnNo = this.phnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCntcPsonTpCd = this.bkgCntcPsonTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fwrdCntCd = this.fwrdCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fwrdCustSeq = this.fwrdCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPsonSeq = this.cntcPsonSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcEml = this.cntcEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPsonJbNm = this.cntcPsonJbNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPsonMphnNo = this.cntcPsonMphnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPsonNm = this.cntcPsonNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNo = this.faxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
