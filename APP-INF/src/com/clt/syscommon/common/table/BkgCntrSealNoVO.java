/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCntrSealNoVO.java
*@FileTitle : BkgCntrSealNoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2015.07.14
*@LastModifier : 문경일
*@LastVersion : 1.0
* 2015.07.14 문경일 
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
 * @author 문경일
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCntrSealNoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCntrSealNoVO> models = new ArrayList<BkgCntrSealNoVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String cntrSealSeq = null;
	/* Column Info */
	private String sealKndCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String sealPtyNm = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String sealPtyTpCd = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String cntrSealNo = null;
	/* Column Info */
	private String prnFlg = null;
	/* Column Info */
	private String sealInpTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String oldCntrNo = null;
	/* Column Info */
	private String oldCntrSealNo = null;
	/* Column Info */
	private String oldSealInpTpCd = null;
	
	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCntrSealNoVO() {}

	public BkgCntrSealNoVO(String ibflag, String pagerows, String bkgNo, String cntrNo, String cntrSealSeq, String cntrSealNo, String sealPtyNm, String prnFlg, String sealInpTpCd, String creUsrId, String creDt, String updUsrId, String updDt, String sealPtyTpCd, String sealKndCd, String oldCntrNo, String oldCntrSealNo, String oldSealInpTpCd) {
		this.updDt = updDt;
		this.cntrSealSeq = cntrSealSeq;
		this.sealKndCd = sealKndCd;
		this.creDt = creDt;
		this.sealPtyNm = sealPtyNm;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.creUsrId = creUsrId;
		this.sealPtyTpCd = sealPtyTpCd;
		this.cntrNo = cntrNo;
		this.cntrSealNo = cntrSealNo;
		this.prnFlg = prnFlg;
		this.sealInpTpCd = sealInpTpCd;
		this.updUsrId = updUsrId;
		this.oldCntrNo = oldCntrNo;
		this.oldCntrSealNo = oldCntrSealNo;
		this.oldSealInpTpCd = oldSealInpTpCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cntr_seal_seq", getCntrSealSeq());
		this.hashColumns.put("seal_knd_cd", getSealKndCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("seal_pty_nm", getSealPtyNm());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("seal_pty_tp_cd", getSealPtyTpCd());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("cntr_seal_no", getCntrSealNo());
		this.hashColumns.put("prn_flg", getPrnFlg());
		this.hashColumns.put("seal_inp_tp_cd", getSealInpTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("old_cntr_no", getOldCntrNo());
		this.hashColumns.put("old_cntr_seal_no", getOldCntrSealNo());
		this.hashColumns.put("old_seal_inp_tp_cd", getOldSealInpTpCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cntr_seal_seq", "cntrSealSeq");
		this.hashFields.put("seal_knd_cd", "sealKndCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("seal_pty_nm", "sealPtyNm");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("seal_pty_tp_cd", "sealPtyTpCd");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("cntr_seal_no", "cntrSealNo");
		this.hashFields.put("prn_flg", "prnFlg");
		this.hashFields.put("seal_inp_tp_cd", "sealInpTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("old_cntr_no", "oldCntrNo");
		this.hashFields.put("old_cntr_seal_no", "oldCntrSealNo");
		this.hashFields.put("old_seal_inp_tp_cd", "oldSealInpTpCd");
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
	 * @return cntrSealSeq
	 */
	public String getCntrSealSeq() {
		return this.cntrSealSeq;
	}
	
	/**
	 * Column Info
	 * @return sealKndCd
	 */
	public String getSealKndCd() {
		return this.sealKndCd;
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
	 * @return sealPtyNm
	 */
	public String getSealPtyNm() {
		return this.sealPtyNm;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
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
	 * @return sealPtyTpCd
	 */
	public String getSealPtyTpCd() {
		return this.sealPtyTpCd;
	}
	
	/**
	 * Column Info
	 * @return cntrNo
	 */
	public String getCntrNo() {
		return this.cntrNo;
	}
	
	/**
	 * Column Info
	 * @return cntrSealNo
	 */
	public String getCntrSealNo() {
		return this.cntrSealNo;
	}
	
	/**
	 * Column Info
	 * @return prnFlg
	 */
	public String getPrnFlg() {
		return this.prnFlg;
	}
	
	/**
	 * Column Info
	 * @return sealInpTpCd
	 */
	public String getSealInpTpCd() {
		return this.sealInpTpCd;
	}
	
	/**
	 * Column Info
	 * @return oldCntrNo
	 */
	public String getOldCntrNo() {
		return this.oldCntrNo;
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
	 * @return oldSealInpTpCd
	 */
	public String getOldCntrSealNo() {
		return this.oldCntrSealNo;
	}
	
	/**
	 * Column Info
	 * @return oldSealInpTpCd
	 */
	public String getOldSealInpTpCd() {
		return this.oldSealInpTpCd;
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
	 * @param cntrSealSeq
	 */
	public void setCntrSealSeq(String cntrSealSeq) {
		this.cntrSealSeq = cntrSealSeq;
	}
	
	/**
	 * Column Info
	 * @param sealKndCd
	 */
	public void setSealKndCd(String sealKndCd) {
		this.sealKndCd = sealKndCd;
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
	 * @param sealPtyNm
	 */
	public void setSealPtyNm(String sealPtyNm) {
		this.sealPtyNm = sealPtyNm;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
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
	 * @param sealPtyTpCd
	 */
	public void setSealPtyTpCd(String sealPtyTpCd) {
		this.sealPtyTpCd = sealPtyTpCd;
	}
	
	/**
	 * Column Info
	 * @param cntrNo
	 */
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
	}
	
	/**
	 * Column Info
	 * @param cntrSealNo
	 */
	public void setCntrSealNo(String cntrSealNo) {
		this.cntrSealNo = cntrSealNo;
	}
	
	/**
	 * Column Info
	 * @param prnFlg
	 */
	public void setPrnFlg(String prnFlg) {
		this.prnFlg = prnFlg;
	}
	
	/**
	 * Column Info
	 * @param sealInpTpCd
	 */
	public void setSealInpTpCd(String sealInpTpCd) {
		this.sealInpTpCd = sealInpTpCd;
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
	 * @param oldCntrNo
	 */
	public void setOldCntrNo(String oldCntrNo) {
		this.oldCntrNo = oldCntrNo;
	}

	/**
	 * @param oldCntrSealNo the oldCntrSealNo to set
	 */
	public void setOldCntrSealNo(String oldCntrSealNo) {
		this.oldCntrSealNo = oldCntrSealNo;
	}
	
	/**
	 * @param oldSealInpTpCd the oldSealInpTpCd to set
	 */
	public void setOldSealInpTpCd(String oldSealInpTpCd) {
		this.oldSealInpTpCd = oldSealInpTpCd;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCntrSealSeq(JSPUtil.getParameter(request, "cntr_seal_seq", ""));
		setSealKndCd(JSPUtil.getParameter(request, "seal_knd_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSealPtyNm(JSPUtil.getParameter(request, "seal_pty_nm", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSealPtyTpCd(JSPUtil.getParameter(request, "seal_pty_tp_cd", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setCntrSealNo(JSPUtil.getParameter(request, "cntr_seal_no", ""));
		setPrnFlg(JSPUtil.getParameter(request, "prn_flg", ""));
		setSealInpTpCd(JSPUtil.getParameter(request, "seal_inp_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setOldCntrNo(JSPUtil.getParameter(request, "old_cntr_no", ""));
		setOldCntrSealNo(JSPUtil.getParameter(request, "old_cntr_seal_no", ""));
		setOldSealInpTpCd(JSPUtil.getParameter(request, "old_seal_inp_tp_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCntrSealNoVO[]
	 */
	public BkgCntrSealNoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCntrSealNoVO[]
	 */
	public BkgCntrSealNoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCntrSealNoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] cntrSealSeq = (JSPUtil.getParameter(request, prefix	+ "cntr_seal_seq", length));
			String[] sealKndCd = (JSPUtil.getParameter(request, prefix	+ "seal_knd_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] sealPtyNm = (JSPUtil.getParameter(request, prefix	+ "seal_pty_nm", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] sealPtyTpCd = (JSPUtil.getParameter(request, prefix	+ "seal_pty_tp_cd", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] cntrSealNo = (JSPUtil.getParameter(request, prefix	+ "cntr_seal_no", length));
			String[] prnFlg = (JSPUtil.getParameter(request, prefix	+ "prn_flg", length));
			String[] sealInpTpCd = (JSPUtil.getParameter(request, prefix	+ "seal_inp_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] oldCntrNo = (JSPUtil.getParameter(request, prefix + "old_cntr_no", length));
			String[] oldCntrSealNo = (JSPUtil.getParameter(request, "old_cntr_seal_no", length));
			String[] oldSealInpTpCd = (JSPUtil.getParameter(request, "old_seal_inp_tp_cd", length));
			
			
			for (int i = 0; i < length; i++) {
				model = new BkgCntrSealNoVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cntrSealSeq[i] != null)
					model.setCntrSealSeq(cntrSealSeq[i]);
				if (sealKndCd[i] != null)
					model.setSealKndCd(sealKndCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (sealPtyNm[i] != null)
					model.setSealPtyNm(sealPtyNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (sealPtyTpCd[i] != null)
					model.setSealPtyTpCd(sealPtyTpCd[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (cntrSealNo[i] != null)
					model.setCntrSealNo(cntrSealNo[i]);
				if (prnFlg[i] != null)
					model.setPrnFlg(prnFlg[i]);
				if (sealInpTpCd[i] != null)
					model.setSealInpTpCd(sealInpTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (oldCntrNo[i] != null)
					model.setOldCntrNo(oldCntrNo[i]);
				if (oldCntrSealNo[i] != null)
					model.setOldCntrSealNo(oldCntrSealNo[i]);
				if (oldSealInpTpCd[i] != null)
					model.setOldSealInpTpCd(oldSealInpTpCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCntrSealNoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCntrSealNoVO[]
	 */
	public BkgCntrSealNoVO[] getBkgCntrSealNoVOs(){
		BkgCntrSealNoVO[] vos = (BkgCntrSealNoVO[])models.toArray(new BkgCntrSealNoVO[models.size()]);
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
		this.cntrSealSeq = this.cntrSealSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sealKndCd = this.sealKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sealPtyNm = this.sealPtyNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sealPtyTpCd = this.sealPtyTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSealNo = this.cntrSealNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prnFlg = this.prnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sealInpTpCd = this.sealInpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldCntrNo = this.oldCntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldCntrSealNo = this.oldCntrSealNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldSealInpTpCd = this.oldSealInpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
