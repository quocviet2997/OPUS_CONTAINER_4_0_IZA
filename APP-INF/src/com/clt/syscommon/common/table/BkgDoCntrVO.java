/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgDoCntrVO.java
*@FileTitle : BkgDoCntrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.28
*@LastModifier : 
*@LastVersion : 1.0
* 2009.08.28  
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

public class BkgDoCntrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgDoCntrVO> models = new ArrayList<BkgDoCntrVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String trkrMvmtRefNo = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rlseSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String trkrMtyRtnYdCd = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String trkrPhnNo = null;
	/* Column Info */
	private String trkrNm = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgDoCntrVO() {}

	public BkgDoCntrVO(String ibflag, String pagerows, String bkgNo, String rlseSeq, String cntrNo, String creUsrId, String creDt, String updUsrId, String updDt, String trkrNm, String trkrPhnNo, String trkrMvmtRefNo, String trkrMtyRtnYdCd) {
		this.updDt = updDt;
		this.trkrMvmtRefNo = trkrMvmtRefNo;
		this.creDt = creDt;
		this.rlseSeq = rlseSeq;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.creUsrId = creUsrId;
		this.trkrMtyRtnYdCd = trkrMtyRtnYdCd;
		this.cntrNo = cntrNo;
		this.trkrPhnNo = trkrPhnNo;
		this.trkrNm = trkrNm;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("trkr_mvmt_ref_no", getTrkrMvmtRefNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rlse_seq", getRlseSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("trkr_mty_rtn_yd_cd", getTrkrMtyRtnYdCd());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("trkr_phn_no", getTrkrPhnNo());
		this.hashColumns.put("trkr_nm", getTrkrNm());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("trkr_mvmt_ref_no", "trkrMvmtRefNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rlse_seq", "rlseSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("trkr_mty_rtn_yd_cd", "trkrMtyRtnYdCd");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("trkr_phn_no", "trkrPhnNo");
		this.hashFields.put("trkr_nm", "trkrNm");
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
	 * @return trkrMvmtRefNo
	 */
	public String getTrkrMvmtRefNo() {
		return this.trkrMvmtRefNo;
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
	 * @return rlseSeq
	 */
	public String getRlseSeq() {
		return this.rlseSeq;
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
	 * @return trkrMtyRtnYdCd
	 */
	public String getTrkrMtyRtnYdCd() {
		return this.trkrMtyRtnYdCd;
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
	 * @return trkrPhnNo
	 */
	public String getTrkrPhnNo() {
		return this.trkrPhnNo;
	}
	
	/**
	 * Column Info
	 * @return trkrNm
	 */
	public String getTrkrNm() {
		return this.trkrNm;
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
	 * @param trkrMvmtRefNo
	 */
	public void setTrkrMvmtRefNo(String trkrMvmtRefNo) {
		this.trkrMvmtRefNo = trkrMvmtRefNo;
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
	 * @param rlseSeq
	 */
	public void setRlseSeq(String rlseSeq) {
		this.rlseSeq = rlseSeq;
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
	 * @param trkrMtyRtnYdCd
	 */
	public void setTrkrMtyRtnYdCd(String trkrMtyRtnYdCd) {
		this.trkrMtyRtnYdCd = trkrMtyRtnYdCd;
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
	 * @param trkrPhnNo
	 */
	public void setTrkrPhnNo(String trkrPhnNo) {
		this.trkrPhnNo = trkrPhnNo;
	}
	
	/**
	 * Column Info
	 * @param trkrNm
	 */
	public void setTrkrNm(String trkrNm) {
		this.trkrNm = trkrNm;
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
		setTrkrMvmtRefNo(JSPUtil.getParameter(request, "trkr_mvmt_ref_no", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRlseSeq(JSPUtil.getParameter(request, "rlse_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setTrkrMtyRtnYdCd(JSPUtil.getParameter(request, "trkr_mty_rtn_yd_cd", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setTrkrPhnNo(JSPUtil.getParameter(request, "trkr_phn_no", ""));
		setTrkrNm(JSPUtil.getParameter(request, "trkr_nm", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgDoCntrVO[]
	 */
	public BkgDoCntrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgDoCntrVO[]
	 */
	public BkgDoCntrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgDoCntrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] trkrMvmtRefNo = (JSPUtil.getParameter(request, prefix	+ "trkr_mvmt_ref_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] rlseSeq = (JSPUtil.getParameter(request, prefix	+ "rlse_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] trkrMtyRtnYdCd = (JSPUtil.getParameter(request, prefix	+ "trkr_mty_rtn_yd_cd", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] trkrPhnNo = (JSPUtil.getParameter(request, prefix	+ "trkr_phn_no", length));
			String[] trkrNm = (JSPUtil.getParameter(request, prefix	+ "trkr_nm", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgDoCntrVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (trkrMvmtRefNo[i] != null)
					model.setTrkrMvmtRefNo(trkrMvmtRefNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rlseSeq[i] != null)
					model.setRlseSeq(rlseSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (trkrMtyRtnYdCd[i] != null)
					model.setTrkrMtyRtnYdCd(trkrMtyRtnYdCd[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (trkrPhnNo[i] != null)
					model.setTrkrPhnNo(trkrPhnNo[i]);
				if (trkrNm[i] != null)
					model.setTrkrNm(trkrNm[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgDoCntrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgDoCntrVO[]
	 */
	public BkgDoCntrVO[] getBkgDoCntrVOs(){
		BkgDoCntrVO[] vos = (BkgDoCntrVO[])models.toArray(new BkgDoCntrVO[models.size()]);
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
		this.trkrMvmtRefNo = this.trkrMvmtRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlseSeq = this.rlseSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trkrMtyRtnYdCd = this.trkrMtyRtnYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trkrPhnNo = this.trkrPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trkrNm = this.trkrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
