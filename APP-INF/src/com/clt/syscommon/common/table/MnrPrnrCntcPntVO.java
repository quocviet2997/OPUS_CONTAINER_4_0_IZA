/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MnrPrnrCntcPntVO.java
*@FileTitle : MnrPrnrCntcPntVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.18
*@LastModifier : 안준상
*@LastVersion : 1.0
* 2009.06.18 안준상 
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
 * @author 안준상
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class MnrPrnrCntcPntVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MnrPrnrCntcPntVO> models = new ArrayList<MnrPrnrCntcPntVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String phnNo = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String mnrPrnrAddr = null;
	/* Column Info */
	private String mnrPrnrCreDtlSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String mnrPrnrCreSeq = null;
	/* Column Info */
	private String cntcDivCd = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String mnrPrnrRmk = null;
	/* Column Info */
	private String mnrPrnrEml = null;
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String prmryChkFlg = null;
	/* Column Info */
	private String mnrCntcPrnrNm = null;
	/* Column Info */
	private String faxNo = null;
	/* Column Info */
	private String intlFaxNo = null;
	/* Column Info */
	private String aplyFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String intlPhnNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MnrPrnrCntcPntVO() {}

	public MnrPrnrCntcPntVO(String ibflag, String pagerows, String mnrPrnrCreSeq, String mnrPrnrCreDtlSeq, String cntCd, String ofcCd, String mnrCntcPrnrNm, String intlPhnNo, String phnNo, String intlFaxNo, String faxNo, String mnrPrnrEml, String prmryChkFlg, String cntcDivCd, String mnrPrnrAddr, String mnrPrnrRmk, String aplyFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.phnNo = phnNo;
		this.creDt = creDt;
		this.mnrPrnrAddr = mnrPrnrAddr;
		this.mnrPrnrCreDtlSeq = mnrPrnrCreDtlSeq;
		this.pagerows = pagerows;
		this.mnrPrnrCreSeq = mnrPrnrCreSeq;
		this.cntcDivCd = cntcDivCd;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.mnrPrnrRmk = mnrPrnrRmk;
		this.mnrPrnrEml = mnrPrnrEml;
		this.cntCd = cntCd;
		this.prmryChkFlg = prmryChkFlg;
		this.mnrCntcPrnrNm = mnrCntcPrnrNm;
		this.faxNo = faxNo;
		this.intlFaxNo = intlFaxNo;
		this.aplyFlg = aplyFlg;
		this.updUsrId = updUsrId;
		this.intlPhnNo = intlPhnNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("phn_no", getPhnNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("mnr_prnr_addr", getMnrPrnrAddr());
		this.hashColumns.put("mnr_prnr_cre_dtl_seq", getMnrPrnrCreDtlSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("mnr_prnr_cre_seq", getMnrPrnrCreSeq());
		this.hashColumns.put("cntc_div_cd", getCntcDivCd());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("mnr_prnr_rmk", getMnrPrnrRmk());
		this.hashColumns.put("mnr_prnr_eml", getMnrPrnrEml());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("prmry_chk_flg", getPrmryChkFlg());
		this.hashColumns.put("mnr_cntc_prnr_nm", getMnrCntcPrnrNm());
		this.hashColumns.put("fax_no", getFaxNo());
		this.hashColumns.put("intl_fax_no", getIntlFaxNo());
		this.hashColumns.put("aply_flg", getAplyFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("intl_phn_no", getIntlPhnNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("phn_no", "phnNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("mnr_prnr_addr", "mnrPrnrAddr");
		this.hashFields.put("mnr_prnr_cre_dtl_seq", "mnrPrnrCreDtlSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("mnr_prnr_cre_seq", "mnrPrnrCreSeq");
		this.hashFields.put("cntc_div_cd", "cntcDivCd");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("mnr_prnr_rmk", "mnrPrnrRmk");
		this.hashFields.put("mnr_prnr_eml", "mnrPrnrEml");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("prmry_chk_flg", "prmryChkFlg");
		this.hashFields.put("mnr_cntc_prnr_nm", "mnrCntcPrnrNm");
		this.hashFields.put("fax_no", "faxNo");
		this.hashFields.put("intl_fax_no", "intlFaxNo");
		this.hashFields.put("aply_flg", "aplyFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("intl_phn_no", "intlPhnNo");
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return mnrPrnrAddr
	 */
	public String getMnrPrnrAddr() {
		return this.mnrPrnrAddr;
	}
	
	/**
	 * Column Info
	 * @return mnrPrnrCreDtlSeq
	 */
	public String getMnrPrnrCreDtlSeq() {
		return this.mnrPrnrCreDtlSeq;
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
	 * @return mnrPrnrCreSeq
	 */
	public String getMnrPrnrCreSeq() {
		return this.mnrPrnrCreSeq;
	}
	
	/**
	 * Column Info
	 * @return cntcDivCd
	 */
	public String getCntcDivCd() {
		return this.cntcDivCd;
	}
	
	/**
	 * Column Info
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
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
	 * @return mnrPrnrRmk
	 */
	public String getMnrPrnrRmk() {
		return this.mnrPrnrRmk;
	}
	
	/**
	 * Column Info
	 * @return mnrPrnrEml
	 */
	public String getMnrPrnrEml() {
		return this.mnrPrnrEml;
	}
	
	/**
	 * Column Info
	 * @return cntCd
	 */
	public String getCntCd() {
		return this.cntCd;
	}
	
	/**
	 * Column Info
	 * @return prmryChkFlg
	 */
	public String getPrmryChkFlg() {
		return this.prmryChkFlg;
	}
	
	/**
	 * Column Info
	 * @return mnrCntcPrnrNm
	 */
	public String getMnrCntcPrnrNm() {
		return this.mnrCntcPrnrNm;
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
	 * @return intlFaxNo
	 */
	public String getIntlFaxNo() {
		return this.intlFaxNo;
	}
	
	/**
	 * Column Info
	 * @return aplyFlg
	 */
	public String getAplyFlg() {
		return this.aplyFlg;
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
	 * @return intlPhnNo
	 */
	public String getIntlPhnNo() {
		return this.intlPhnNo;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param mnrPrnrAddr
	 */
	public void setMnrPrnrAddr(String mnrPrnrAddr) {
		this.mnrPrnrAddr = mnrPrnrAddr;
	}
	
	/**
	 * Column Info
	 * @param mnrPrnrCreDtlSeq
	 */
	public void setMnrPrnrCreDtlSeq(String mnrPrnrCreDtlSeq) {
		this.mnrPrnrCreDtlSeq = mnrPrnrCreDtlSeq;
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
	 * @param mnrPrnrCreSeq
	 */
	public void setMnrPrnrCreSeq(String mnrPrnrCreSeq) {
		this.mnrPrnrCreSeq = mnrPrnrCreSeq;
	}
	
	/**
	 * Column Info
	 * @param cntcDivCd
	 */
	public void setCntcDivCd(String cntcDivCd) {
		this.cntcDivCd = cntcDivCd;
	}
	
	/**
	 * Column Info
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
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
	 * @param mnrPrnrRmk
	 */
	public void setMnrPrnrRmk(String mnrPrnrRmk) {
		this.mnrPrnrRmk = mnrPrnrRmk;
	}
	
	/**
	 * Column Info
	 * @param mnrPrnrEml
	 */
	public void setMnrPrnrEml(String mnrPrnrEml) {
		this.mnrPrnrEml = mnrPrnrEml;
	}
	
	/**
	 * Column Info
	 * @param cntCd
	 */
	public void setCntCd(String cntCd) {
		this.cntCd = cntCd;
	}
	
	/**
	 * Column Info
	 * @param prmryChkFlg
	 */
	public void setPrmryChkFlg(String prmryChkFlg) {
		this.prmryChkFlg = prmryChkFlg;
	}
	
	/**
	 * Column Info
	 * @param mnrCntcPrnrNm
	 */
	public void setMnrCntcPrnrNm(String mnrCntcPrnrNm) {
		this.mnrCntcPrnrNm = mnrCntcPrnrNm;
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
	 * @param intlFaxNo
	 */
	public void setIntlFaxNo(String intlFaxNo) {
		this.intlFaxNo = intlFaxNo;
	}
	
	/**
	 * Column Info
	 * @param aplyFlg
	 */
	public void setAplyFlg(String aplyFlg) {
		this.aplyFlg = aplyFlg;
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
	 * @param intlPhnNo
	 */
	public void setIntlPhnNo(String intlPhnNo) {
		this.intlPhnNo = intlPhnNo;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setPhnNo(JSPUtil.getParameter(request, "phn_no", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setMnrPrnrAddr(JSPUtil.getParameter(request, "mnr_prnr_addr", ""));
		setMnrPrnrCreDtlSeq(JSPUtil.getParameter(request, "mnr_prnr_cre_dtl_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setMnrPrnrCreSeq(JSPUtil.getParameter(request, "mnr_prnr_cre_seq", ""));
		setCntcDivCd(JSPUtil.getParameter(request, "cntc_div_cd", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setMnrPrnrRmk(JSPUtil.getParameter(request, "mnr_prnr_rmk", ""));
		setMnrPrnrEml(JSPUtil.getParameter(request, "mnr_prnr_eml", ""));
		setCntCd(JSPUtil.getParameter(request, "cnt_cd", ""));
		setPrmryChkFlg(JSPUtil.getParameter(request, "prmry_chk_flg", ""));
		setMnrCntcPrnrNm(JSPUtil.getParameter(request, "mnr_cntc_prnr_nm", ""));
		setFaxNo(JSPUtil.getParameter(request, "fax_no", ""));
		setIntlFaxNo(JSPUtil.getParameter(request, "intl_fax_no", ""));
		setAplyFlg(JSPUtil.getParameter(request, "aply_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setIntlPhnNo(JSPUtil.getParameter(request, "intl_phn_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MnrPrnrCntcPntVO[]
	 */
	public MnrPrnrCntcPntVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MnrPrnrCntcPntVO[]
	 */
	public MnrPrnrCntcPntVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MnrPrnrCntcPntVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] phnNo = (JSPUtil.getParameter(request, prefix	+ "phn_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] mnrPrnrAddr = (JSPUtil.getParameter(request, prefix	+ "mnr_prnr_addr", length));
			String[] mnrPrnrCreDtlSeq = (JSPUtil.getParameter(request, prefix	+ "mnr_prnr_cre_dtl_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] mnrPrnrCreSeq = (JSPUtil.getParameter(request, prefix	+ "mnr_prnr_cre_seq", length));
			String[] cntcDivCd = (JSPUtil.getParameter(request, prefix	+ "cntc_div_cd", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] mnrPrnrRmk = (JSPUtil.getParameter(request, prefix	+ "mnr_prnr_rmk", length));
			String[] mnrPrnrEml = (JSPUtil.getParameter(request, prefix	+ "mnr_prnr_eml", length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd", length));
			String[] prmryChkFlg = (JSPUtil.getParameter(request, prefix	+ "prmry_chk_flg", length));
			String[] mnrCntcPrnrNm = (JSPUtil.getParameter(request, prefix	+ "mnr_cntc_prnr_nm", length));
			String[] faxNo = (JSPUtil.getParameter(request, prefix	+ "fax_no", length));
			String[] intlFaxNo = (JSPUtil.getParameter(request, prefix	+ "intl_fax_no", length));
			String[] aplyFlg = (JSPUtil.getParameter(request, prefix	+ "aply_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] intlPhnNo = (JSPUtil.getParameter(request, prefix	+ "intl_phn_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new MnrPrnrCntcPntVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (phnNo[i] != null)
					model.setPhnNo(phnNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (mnrPrnrAddr[i] != null)
					model.setMnrPrnrAddr(mnrPrnrAddr[i]);
				if (mnrPrnrCreDtlSeq[i] != null)
					model.setMnrPrnrCreDtlSeq(mnrPrnrCreDtlSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (mnrPrnrCreSeq[i] != null)
					model.setMnrPrnrCreSeq(mnrPrnrCreSeq[i]);
				if (cntcDivCd[i] != null)
					model.setCntcDivCd(cntcDivCd[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (mnrPrnrRmk[i] != null)
					model.setMnrPrnrRmk(mnrPrnrRmk[i]);
				if (mnrPrnrEml[i] != null)
					model.setMnrPrnrEml(mnrPrnrEml[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (prmryChkFlg[i] != null)
					model.setPrmryChkFlg(prmryChkFlg[i]);
				if (mnrCntcPrnrNm[i] != null)
					model.setMnrCntcPrnrNm(mnrCntcPrnrNm[i]);
				if (faxNo[i] != null)
					model.setFaxNo(faxNo[i]);
				if (intlFaxNo[i] != null)
					model.setIntlFaxNo(intlFaxNo[i]);
				if (aplyFlg[i] != null)
					model.setAplyFlg(aplyFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (intlPhnNo[i] != null)
					model.setIntlPhnNo(intlPhnNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMnrPrnrCntcPntVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MnrPrnrCntcPntVO[]
	 */
	public MnrPrnrCntcPntVO[] getMnrPrnrCntcPntVOs(){
		MnrPrnrCntcPntVO[] vos = (MnrPrnrCntcPntVO[])models.toArray(new MnrPrnrCntcPntVO[models.size()]);
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
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPrnrAddr = this.mnrPrnrAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPrnrCreDtlSeq = this.mnrPrnrCreDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPrnrCreSeq = this.mnrPrnrCreSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcDivCd = this.cntcDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPrnrRmk = this.mnrPrnrRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPrnrEml = this.mnrPrnrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prmryChkFlg = this.prmryChkFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrCntcPrnrNm = this.mnrCntcPrnrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNo = this.faxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intlFaxNo = this.intlFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aplyFlg = this.aplyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intlPhnNo = this.intlPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
