/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgRevDrNoteVO.java
*@FileTitle : BkgRevDrNoteVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.22
*@LastModifier : 이승준
*@LastVersion : 1.0
* 2009.05.22 이승준 
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

public class BkgRevDrNoteVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgRevDrNoteVO> models = new ArrayList<BkgRevDrNoteVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String rctOfcCd = null;
	/* Column Info */
	private String rdnIssRsnCd = null;
	/* Column Info */
	private String bkgCorrNo = null;
	/* Column Info */
	private String bkgNoSplit = null;
	/* Column Info */
	private String issOfcCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String umchRmk = null;
	/* Column Info */
	private String rdnNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String rvisSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String umchSubTpCd = null;
	/* Column Info */
	private String umchTpCd = null;
	/* Column Info */
	private String rdnIssDt = null;
	/* Column Info */
	private String rdnStsCd = null;
	/* Column Info */
	private String respbOfcCd = null;
	/* Column Info */
	private String rctRhqCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgRevDrNoteVO() {}

	public BkgRevDrNoteVO(String ibflag, String pagerows, String rdnNo, String rvisSeq, String bkgNo, String bkgNoSplit, String issOfcCd, String rctRhqCd, String rctOfcCd, String respbOfcCd, String umchTpCd, String umchSubTpCd, String rdnIssRsnCd, String umchRmk, String bkgCorrNo, String rdnStsCd, String rdnIssDt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.rctOfcCd = rctOfcCd;
		this.rdnIssRsnCd = rdnIssRsnCd;
		this.bkgCorrNo = bkgCorrNo;
		this.bkgNoSplit = bkgNoSplit;
		this.issOfcCd = issOfcCd;
		this.creDt = creDt;
		this.umchRmk = umchRmk;
		this.rdnNo = rdnNo;
		this.pagerows = pagerows;
		this.rvisSeq = rvisSeq;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.umchSubTpCd = umchSubTpCd;
		this.umchTpCd = umchTpCd;
		this.rdnIssDt = rdnIssDt;
		this.rdnStsCd = rdnStsCd;
		this.respbOfcCd = respbOfcCd;
		this.rctRhqCd = rctRhqCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rct_ofc_cd", getRctOfcCd());
		this.hashColumns.put("rdn_iss_rsn_cd", getRdnIssRsnCd());
		this.hashColumns.put("bkg_corr_no", getBkgCorrNo());
		this.hashColumns.put("bkg_no_split", getBkgNoSplit());
		this.hashColumns.put("iss_ofc_cd", getIssOfcCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("umch_rmk", getUmchRmk());
		this.hashColumns.put("rdn_no", getRdnNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("rvis_seq", getRvisSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("umch_sub_tp_cd", getUmchSubTpCd());
		this.hashColumns.put("umch_tp_cd", getUmchTpCd());
		this.hashColumns.put("rdn_iss_dt", getRdnIssDt());
		this.hashColumns.put("rdn_sts_cd", getRdnStsCd());
		this.hashColumns.put("respb_ofc_cd", getRespbOfcCd());
		this.hashColumns.put("rct_rhq_cd", getRctRhqCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rct_ofc_cd", "rctOfcCd");
		this.hashFields.put("rdn_iss_rsn_cd", "rdnIssRsnCd");
		this.hashFields.put("bkg_corr_no", "bkgCorrNo");
		this.hashFields.put("bkg_no_split", "bkgNoSplit");
		this.hashFields.put("iss_ofc_cd", "issOfcCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("umch_rmk", "umchRmk");
		this.hashFields.put("rdn_no", "rdnNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("rvis_seq", "rvisSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("umch_sub_tp_cd", "umchSubTpCd");
		this.hashFields.put("umch_tp_cd", "umchTpCd");
		this.hashFields.put("rdn_iss_dt", "rdnIssDt");
		this.hashFields.put("rdn_sts_cd", "rdnStsCd");
		this.hashFields.put("respb_ofc_cd", "respbOfcCd");
		this.hashFields.put("rct_rhq_cd", "rctRhqCd");
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
	 * @return rctOfcCd
	 */
	public String getRctOfcCd() {
		return this.rctOfcCd;
	}
	
	/**
	 * Column Info
	 * @return rdnIssRsnCd
	 */
	public String getRdnIssRsnCd() {
		return this.rdnIssRsnCd;
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
	 * @return bkgNoSplit
	 */
	public String getBkgNoSplit() {
		return this.bkgNoSplit;
	}
	
	/**
	 * Column Info
	 * @return issOfcCd
	 */
	public String getIssOfcCd() {
		return this.issOfcCd;
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
	 * @return umchRmk
	 */
	public String getUmchRmk() {
		return this.umchRmk;
	}
	
	/**
	 * Column Info
	 * @return rdnNo
	 */
	public String getRdnNo() {
		return this.rdnNo;
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
	 * @return rvisSeq
	 */
	public String getRvisSeq() {
		return this.rvisSeq;
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
	 * @return umchSubTpCd
	 */
	public String getUmchSubTpCd() {
		return this.umchSubTpCd;
	}
	
	/**
	 * Column Info
	 * @return umchTpCd
	 */
	public String getUmchTpCd() {
		return this.umchTpCd;
	}
	
	/**
	 * Column Info
	 * @return rdnIssDt
	 */
	public String getRdnIssDt() {
		return this.rdnIssDt;
	}
	
	/**
	 * Column Info
	 * @return rdnStsCd
	 */
	public String getRdnStsCd() {
		return this.rdnStsCd;
	}
	
	/**
	 * Column Info
	 * @return respbOfcCd
	 */
	public String getRespbOfcCd() {
		return this.respbOfcCd;
	}
	
	/**
	 * Column Info
	 * @return rctRhqCd
	 */
	public String getRctRhqCd() {
		return this.rctRhqCd;
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
	 * @param rctOfcCd
	 */
	public void setRctOfcCd(String rctOfcCd) {
		this.rctOfcCd = rctOfcCd;
	}
	
	/**
	 * Column Info
	 * @param rdnIssRsnCd
	 */
	public void setRdnIssRsnCd(String rdnIssRsnCd) {
		this.rdnIssRsnCd = rdnIssRsnCd;
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
	 * @param bkgNoSplit
	 */
	public void setBkgNoSplit(String bkgNoSplit) {
		this.bkgNoSplit = bkgNoSplit;
	}
	
	/**
	 * Column Info
	 * @param issOfcCd
	 */
	public void setIssOfcCd(String issOfcCd) {
		this.issOfcCd = issOfcCd;
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
	 * @param umchRmk
	 */
	public void setUmchRmk(String umchRmk) {
		this.umchRmk = umchRmk;
	}
	
	/**
	 * Column Info
	 * @param rdnNo
	 */
	public void setRdnNo(String rdnNo) {
		this.rdnNo = rdnNo;
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
	 * @param rvisSeq
	 */
	public void setRvisSeq(String rvisSeq) {
		this.rvisSeq = rvisSeq;
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
	 * @param umchSubTpCd
	 */
	public void setUmchSubTpCd(String umchSubTpCd) {
		this.umchSubTpCd = umchSubTpCd;
	}
	
	/**
	 * Column Info
	 * @param umchTpCd
	 */
	public void setUmchTpCd(String umchTpCd) {
		this.umchTpCd = umchTpCd;
	}
	
	/**
	 * Column Info
	 * @param rdnIssDt
	 */
	public void setRdnIssDt(String rdnIssDt) {
		this.rdnIssDt = rdnIssDt;
	}
	
	/**
	 * Column Info
	 * @param rdnStsCd
	 */
	public void setRdnStsCd(String rdnStsCd) {
		this.rdnStsCd = rdnStsCd;
	}
	
	/**
	 * Column Info
	 * @param respbOfcCd
	 */
	public void setRespbOfcCd(String respbOfcCd) {
		this.respbOfcCd = respbOfcCd;
	}
	
	/**
	 * Column Info
	 * @param rctRhqCd
	 */
	public void setRctRhqCd(String rctRhqCd) {
		this.rctRhqCd = rctRhqCd;
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
		setRctOfcCd(JSPUtil.getParameter(request, "rct_ofc_cd", ""));
		setRdnIssRsnCd(JSPUtil.getParameter(request, "rdn_iss_rsn_cd", ""));
		setBkgCorrNo(JSPUtil.getParameter(request, "bkg_corr_no", ""));
		setBkgNoSplit(JSPUtil.getParameter(request, "bkg_no_split", ""));
		setIssOfcCd(JSPUtil.getParameter(request, "iss_ofc_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setUmchRmk(JSPUtil.getParameter(request, "umch_rmk", ""));
		setRdnNo(JSPUtil.getParameter(request, "rdn_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setRvisSeq(JSPUtil.getParameter(request, "rvis_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setUmchSubTpCd(JSPUtil.getParameter(request, "umch_sub_tp_cd", ""));
		setUmchTpCd(JSPUtil.getParameter(request, "umch_tp_cd", ""));
		setRdnIssDt(JSPUtil.getParameter(request, "rdn_iss_dt", ""));
		setRdnStsCd(JSPUtil.getParameter(request, "rdn_sts_cd", ""));
		setRespbOfcCd(JSPUtil.getParameter(request, "respb_ofc_cd", ""));
		setRctRhqCd(JSPUtil.getParameter(request, "rct_rhq_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgRevDrNoteVO[]
	 */
	public BkgRevDrNoteVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgRevDrNoteVO[]
	 */
	public BkgRevDrNoteVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgRevDrNoteVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] rctOfcCd = (JSPUtil.getParameter(request, prefix	+ "rct_ofc_cd".trim(), length));
			String[] rdnIssRsnCd = (JSPUtil.getParameter(request, prefix	+ "rdn_iss_rsn_cd".trim(), length));
			String[] bkgCorrNo = (JSPUtil.getParameter(request, prefix	+ "bkg_corr_no".trim(), length));
			String[] bkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "bkg_no_split".trim(), length));
			String[] issOfcCd = (JSPUtil.getParameter(request, prefix	+ "iss_ofc_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] umchRmk = (JSPUtil.getParameter(request, prefix	+ "umch_rmk".trim(), length));
			String[] rdnNo = (JSPUtil.getParameter(request, prefix	+ "rdn_no".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] rvisSeq = (JSPUtil.getParameter(request, prefix	+ "rvis_seq".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no".trim(), length));
			String[] umchSubTpCd = (JSPUtil.getParameter(request, prefix	+ "umch_sub_tp_cd".trim(), length));
			String[] umchTpCd = (JSPUtil.getParameter(request, prefix	+ "umch_tp_cd".trim(), length));
			String[] rdnIssDt = (JSPUtil.getParameter(request, prefix	+ "rdn_iss_dt".trim(), length));
			String[] rdnStsCd = (JSPUtil.getParameter(request, prefix	+ "rdn_sts_cd".trim(), length));
			String[] respbOfcCd = (JSPUtil.getParameter(request, prefix	+ "respb_ofc_cd".trim(), length));
			String[] rctRhqCd = (JSPUtil.getParameter(request, prefix	+ "rct_rhq_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgRevDrNoteVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (rctOfcCd[i] != null)
					model.setRctOfcCd(rctOfcCd[i]);
				if (rdnIssRsnCd[i] != null)
					model.setRdnIssRsnCd(rdnIssRsnCd[i]);
				if (bkgCorrNo[i] != null)
					model.setBkgCorrNo(bkgCorrNo[i]);
				if (bkgNoSplit[i] != null)
					model.setBkgNoSplit(bkgNoSplit[i]);
				if (issOfcCd[i] != null)
					model.setIssOfcCd(issOfcCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (umchRmk[i] != null)
					model.setUmchRmk(umchRmk[i]);
				if (rdnNo[i] != null)
					model.setRdnNo(rdnNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (rvisSeq[i] != null)
					model.setRvisSeq(rvisSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (umchSubTpCd[i] != null)
					model.setUmchSubTpCd(umchSubTpCd[i]);
				if (umchTpCd[i] != null)
					model.setUmchTpCd(umchTpCd[i]);
				if (rdnIssDt[i] != null)
					model.setRdnIssDt(rdnIssDt[i]);
				if (rdnStsCd[i] != null)
					model.setRdnStsCd(rdnStsCd[i]);
				if (respbOfcCd[i] != null)
					model.setRespbOfcCd(respbOfcCd[i]);
				if (rctRhqCd[i] != null)
					model.setRctRhqCd(rctRhqCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgRevDrNoteVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgRevDrNoteVO[]
	 */
	public BkgRevDrNoteVO[] getBkgRevDrNoteVOs(){
		BkgRevDrNoteVO[] vos = (BkgRevDrNoteVO[])models.toArray(new BkgRevDrNoteVO[models.size()]);
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
		this.rctOfcCd = this.rctOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdnIssRsnCd = this.rdnIssRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCorrNo = this.bkgCorrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNoSplit = this.bkgNoSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issOfcCd = this.issOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.umchRmk = this.umchRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdnNo = this.rdnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rvisSeq = this.rvisSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.umchSubTpCd = this.umchSubTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.umchTpCd = this.umchTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdnIssDt = this.rdnIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdnStsCd = this.rdnStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.respbOfcCd = this.respbOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rctRhqCd = this.rctRhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
