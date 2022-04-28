/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgRevUmchBkgVO.java
*@FileTitle : BkgRevUmchBkgVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.22
*@LastModifier : 이승준
*@LastVersion : 1.0
* 2009.06.22 이승준 
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
 * @author 이승준
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgRevUmchBkgVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgRevUmchBkgVO> models = new ArrayList<BkgRevUmchBkgVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String rgnGrpAvcRmk = null;
	/* Column Info */
	private String umchBkgSeq = null;
	/* Column Info */
	private String bkgCorrNo = null;
	/* Column Info */
	private String stlMnlDiffAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String stlSysDiffAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String revAudStsCd = null;
	/* Column Info */
	private String stlDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String umchRsnRmk = null;
	/* Column Info */
	private String stlBkgCorrNo = null;
	/* Column Info */
	private String revAudStlKndCd = null;
	/* Column Info */
	private String umchFndDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String stlUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgRevUmchBkgVO() {}

	public BkgRevUmchBkgVO(String ibflag, String pagerows, String bkgNo, String umchBkgSeq, String bkgCorrNo, String stlBkgCorrNo, String stlSysDiffAmt, String stlMnlDiffAmt, String umchFndDt, String revAudStsCd, String revAudStlKndCd, String stlDt, String umchRsnRmk, String rgnGrpAvcRmk, String stlUsrId, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.rgnGrpAvcRmk = rgnGrpAvcRmk;
		this.umchBkgSeq = umchBkgSeq;
		this.bkgCorrNo = bkgCorrNo;
		this.stlMnlDiffAmt = stlMnlDiffAmt;
		this.creDt = creDt;
		this.stlSysDiffAmt = stlSysDiffAmt;
		this.pagerows = pagerows;
		this.revAudStsCd = revAudStsCd;
		this.stlDt = stlDt;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.umchRsnRmk = umchRsnRmk;
		this.stlBkgCorrNo = stlBkgCorrNo;
		this.revAudStlKndCd = revAudStlKndCd;
		this.umchFndDt = umchFndDt;
		this.updUsrId = updUsrId;
		this.stlUsrId = stlUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rgn_grp_avc_rmk", getRgnGrpAvcRmk());
		this.hashColumns.put("umch_bkg_seq", getUmchBkgSeq());
		this.hashColumns.put("bkg_corr_no", getBkgCorrNo());
		this.hashColumns.put("stl_mnl_diff_amt", getStlMnlDiffAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("stl_sys_diff_amt", getStlSysDiffAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("rev_aud_sts_cd", getRevAudStsCd());
		this.hashColumns.put("stl_dt", getStlDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("umch_rsn_rmk", getUmchRsnRmk());
		this.hashColumns.put("stl_bkg_corr_no", getStlBkgCorrNo());
		this.hashColumns.put("rev_aud_stl_knd_cd", getRevAudStlKndCd());
		this.hashColumns.put("umch_fnd_dt", getUmchFndDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("stl_usr_id", getStlUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rgn_grp_avc_rmk", "rgnGrpAvcRmk");
		this.hashFields.put("umch_bkg_seq", "umchBkgSeq");
		this.hashFields.put("bkg_corr_no", "bkgCorrNo");
		this.hashFields.put("stl_mnl_diff_amt", "stlMnlDiffAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("stl_sys_diff_amt", "stlSysDiffAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("rev_aud_sts_cd", "revAudStsCd");
		this.hashFields.put("stl_dt", "stlDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("umch_rsn_rmk", "umchRsnRmk");
		this.hashFields.put("stl_bkg_corr_no", "stlBkgCorrNo");
		this.hashFields.put("rev_aud_stl_knd_cd", "revAudStlKndCd");
		this.hashFields.put("umch_fnd_dt", "umchFndDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("stl_usr_id", "stlUsrId");
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
	 * @return rgnGrpAvcRmk
	 */
	public String getRgnGrpAvcRmk() {
		return this.rgnGrpAvcRmk;
	}
	
	/**
	 * Column Info
	 * @return umchBkgSeq
	 */
	public String getUmchBkgSeq() {
		return this.umchBkgSeq;
	}
	
	/**
	 * Column Info
	 * @return bkgCorrNo
	 */
	public String getBkgCorrNo() {
		return this.bkgCorrNo;
	}
	
	/**
	 * Column Info
	 * @return stlMnlDiffAmt
	 */
	public String getStlMnlDiffAmt() {
		return this.stlMnlDiffAmt;
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
	 * @return stlSysDiffAmt
	 */
	public String getStlSysDiffAmt() {
		return this.stlSysDiffAmt;
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
	 * @return revAudStsCd
	 */
	public String getRevAudStsCd() {
		return this.revAudStsCd;
	}
	
	/**
	 * Column Info
	 * @return stlDt
	 */
	public String getStlDt() {
		return this.stlDt;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return umchRsnRmk
	 */
	public String getUmchRsnRmk() {
		return this.umchRsnRmk;
	}
	
	/**
	 * Column Info
	 * @return stlBkgCorrNo
	 */
	public String getStlBkgCorrNo() {
		return this.stlBkgCorrNo;
	}
	
	/**
	 * Column Info
	 * @return revAudStlKndCd
	 */
	public String getRevAudStlKndCd() {
		return this.revAudStlKndCd;
	}
	
	/**
	 * Column Info
	 * @return umchFndDt
	 */
	public String getUmchFndDt() {
		return this.umchFndDt;
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
	 * @return stlUsrId
	 */
	public String getStlUsrId() {
		return this.stlUsrId;
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
	 * @param rgnGrpAvcRmk
	 */
	public void setRgnGrpAvcRmk(String rgnGrpAvcRmk) {
		this.rgnGrpAvcRmk = rgnGrpAvcRmk;
	}
	
	/**
	 * Column Info
	 * @param umchBkgSeq
	 */
	public void setUmchBkgSeq(String umchBkgSeq) {
		this.umchBkgSeq = umchBkgSeq;
	}
	
	/**
	 * Column Info
	 * @param bkgCorrNo
	 */
	public void setBkgCorrNo(String bkgCorrNo) {
		this.bkgCorrNo = bkgCorrNo;
	}
	
	/**
	 * Column Info
	 * @param stlMnlDiffAmt
	 */
	public void setStlMnlDiffAmt(String stlMnlDiffAmt) {
		this.stlMnlDiffAmt = stlMnlDiffAmt;
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
	 * @param stlSysDiffAmt
	 */
	public void setStlSysDiffAmt(String stlSysDiffAmt) {
		this.stlSysDiffAmt = stlSysDiffAmt;
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
	 * @param revAudStsCd
	 */
	public void setRevAudStsCd(String revAudStsCd) {
		this.revAudStsCd = revAudStsCd;
	}
	
	/**
	 * Column Info
	 * @param stlDt
	 */
	public void setStlDt(String stlDt) {
		this.stlDt = stlDt;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param umchRsnRmk
	 */
	public void setUmchRsnRmk(String umchRsnRmk) {
		this.umchRsnRmk = umchRsnRmk;
	}
	
	/**
	 * Column Info
	 * @param stlBkgCorrNo
	 */
	public void setStlBkgCorrNo(String stlBkgCorrNo) {
		this.stlBkgCorrNo = stlBkgCorrNo;
	}
	
	/**
	 * Column Info
	 * @param revAudStlKndCd
	 */
	public void setRevAudStlKndCd(String revAudStlKndCd) {
		this.revAudStlKndCd = revAudStlKndCd;
	}
	
	/**
	 * Column Info
	 * @param umchFndDt
	 */
	public void setUmchFndDt(String umchFndDt) {
		this.umchFndDt = umchFndDt;
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
	 * @param stlUsrId
	 */
	public void setStlUsrId(String stlUsrId) {
		this.stlUsrId = stlUsrId;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setRgnGrpAvcRmk(JSPUtil.getParameter(request, "rgn_grp_avc_rmk", ""));
		setUmchBkgSeq(JSPUtil.getParameter(request, "umch_bkg_seq", ""));
		setBkgCorrNo(JSPUtil.getParameter(request, "bkg_corr_no", ""));
		setStlMnlDiffAmt(JSPUtil.getParameter(request, "stl_mnl_diff_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setStlSysDiffAmt(JSPUtil.getParameter(request, "stl_sys_diff_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setRevAudStsCd(JSPUtil.getParameter(request, "rev_aud_sts_cd", ""));
		setStlDt(JSPUtil.getParameter(request, "stl_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setUmchRsnRmk(JSPUtil.getParameter(request, "umch_rsn_rmk", ""));
		setStlBkgCorrNo(JSPUtil.getParameter(request, "stl_bkg_corr_no", ""));
		setRevAudStlKndCd(JSPUtil.getParameter(request, "rev_aud_stl_knd_cd", ""));
		setUmchFndDt(JSPUtil.getParameter(request, "umch_fnd_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setStlUsrId(JSPUtil.getParameter(request, "stl_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgRevUmchBkgVO[]
	 */
	public BkgRevUmchBkgVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgRevUmchBkgVO[]
	 */
	public BkgRevUmchBkgVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgRevUmchBkgVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] rgnGrpAvcRmk = (JSPUtil.getParameter(request, prefix	+ "rgn_grp_avc_rmk", length));
			String[] umchBkgSeq = (JSPUtil.getParameter(request, prefix	+ "umch_bkg_seq", length));
			String[] bkgCorrNo = (JSPUtil.getParameter(request, prefix	+ "bkg_corr_no", length));
			String[] stlMnlDiffAmt = (JSPUtil.getParameter(request, prefix	+ "stl_mnl_diff_amt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] stlSysDiffAmt = (JSPUtil.getParameter(request, prefix	+ "stl_sys_diff_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] revAudStsCd = (JSPUtil.getParameter(request, prefix	+ "rev_aud_sts_cd", length));
			String[] stlDt = (JSPUtil.getParameter(request, prefix	+ "stl_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] umchRsnRmk = (JSPUtil.getParameter(request, prefix	+ "umch_rsn_rmk", length));
			String[] stlBkgCorrNo = (JSPUtil.getParameter(request, prefix	+ "stl_bkg_corr_no", length));
			String[] revAudStlKndCd = (JSPUtil.getParameter(request, prefix	+ "rev_aud_stl_knd_cd", length));
			String[] umchFndDt = (JSPUtil.getParameter(request, prefix	+ "umch_fnd_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] stlUsrId = (JSPUtil.getParameter(request, prefix	+ "stl_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgRevUmchBkgVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (rgnGrpAvcRmk[i] != null)
					model.setRgnGrpAvcRmk(rgnGrpAvcRmk[i]);
				if (umchBkgSeq[i] != null)
					model.setUmchBkgSeq(umchBkgSeq[i]);
				if (bkgCorrNo[i] != null)
					model.setBkgCorrNo(bkgCorrNo[i]);
				if (stlMnlDiffAmt[i] != null)
					model.setStlMnlDiffAmt(stlMnlDiffAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (stlSysDiffAmt[i] != null)
					model.setStlSysDiffAmt(stlSysDiffAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (revAudStsCd[i] != null)
					model.setRevAudStsCd(revAudStsCd[i]);
				if (stlDt[i] != null)
					model.setStlDt(stlDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (umchRsnRmk[i] != null)
					model.setUmchRsnRmk(umchRsnRmk[i]);
				if (stlBkgCorrNo[i] != null)
					model.setStlBkgCorrNo(stlBkgCorrNo[i]);
				if (revAudStlKndCd[i] != null)
					model.setRevAudStlKndCd(revAudStlKndCd[i]);
				if (umchFndDt[i] != null)
					model.setUmchFndDt(umchFndDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (stlUsrId[i] != null)
					model.setStlUsrId(stlUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgRevUmchBkgVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgRevUmchBkgVO[]
	 */
	public BkgRevUmchBkgVO[] getBkgRevUmchBkgVOs(){
		BkgRevUmchBkgVO[] vos = (BkgRevUmchBkgVO[])models.toArray(new BkgRevUmchBkgVO[models.size()]);
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
		this.rgnGrpAvcRmk = this.rgnGrpAvcRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.umchBkgSeq = this.umchBkgSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCorrNo = this.bkgCorrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlMnlDiffAmt = this.stlMnlDiffAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlSysDiffAmt = this.stlSysDiffAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revAudStsCd = this.revAudStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlDt = this.stlDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.umchRsnRmk = this.umchRsnRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlBkgCorrNo = this.stlBkgCorrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revAudStlKndCd = this.revAudStlKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.umchFndDt = this.umchFndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlUsrId = this.stlUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
