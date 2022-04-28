/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TrsTrspCfmMsgHisVO.java
*@FileTitle : TrsTrspCfmMsgHisVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.02
*@LastModifier : 
*@LastVersion : 1.0
* 2009.11.02  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

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

public class TrsTrspCfmMsgHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsTrspCfmMsgHisVO> models = new ArrayList<TrsTrspCfmMsgHisVO>();
	
	/* Column Info */
	private String trspSoSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String sndTpCd = null;
	/* Column Info */
	private String shprEml = null;
	/* Column Info */
	private String sndDt = null;
	/* Column Info */
	private String trspSoOfcCtyCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String rltTrkrNm = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String eqNo = null;
	/* Column Info */
	private String shprFaxNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String rltTrkrFaxNo = null;
	/* Column Info */
	private String shprCustNm = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String sndOfcCd = null;
	/* Column Info */
	private String loclCreDt = null;
	/* Column Info */
	private String rltTrkrSeq = null;
	/* Column Info */
	private String rltTrkrEml = null;
	/* Column Info */
	private String msgTpCd = null;
	/* Column Info */
	private String eqTpszCd = null;
	/* Column Info */
	private String sndSeq = null;
	/* Column Info */
	private String sndUsrId = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String loclUpdDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TrsTrspCfmMsgHisVO() {}

	public TrsTrspCfmMsgHisVO(String ibflag, String pagerows, String trspSoOfcCtyCd, String trspSoSeq, String sndSeq, String eqNo, String msgTpCd, String sndTpCd, String eqTpszCd, String rltTrkrSeq, String rltTrkrNm, String rltTrkrFaxNo, String rltTrkrEml, String shprCustNm, String shprFaxNo, String shprEml, String sndDt, String sndOfcCd, String sndUsrId, String creUsrId, String creDt, String updUsrId, String updDt, String loclCreDt, String loclUpdDt) {
		this.trspSoSeq = trspSoSeq;
		this.creDt = creDt;
		this.sndTpCd = sndTpCd;
		this.shprEml = shprEml;
		this.sndDt = sndDt;
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
		this.pagerows = pagerows;
		this.rltTrkrNm = rltTrkrNm;
		this.ibflag = ibflag;
		this.eqNo = eqNo;
		this.shprFaxNo = shprFaxNo;
		this.updUsrId = updUsrId;
		this.rltTrkrFaxNo = rltTrkrFaxNo;
		this.shprCustNm = shprCustNm;
		this.updDt = updDt;
		this.sndOfcCd = sndOfcCd;
		this.loclCreDt = loclCreDt;
		this.rltTrkrSeq = rltTrkrSeq;
		this.rltTrkrEml = rltTrkrEml;
		this.msgTpCd = msgTpCd;
		this.eqTpszCd = eqTpszCd;
		this.sndSeq = sndSeq;
		this.sndUsrId = sndUsrId;
		this.creUsrId = creUsrId;
		this.loclUpdDt = loclUpdDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("trsp_so_seq", getTrspSoSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("snd_tp_cd", getSndTpCd());
		this.hashColumns.put("shpr_eml", getShprEml());
		this.hashColumns.put("snd_dt", getSndDt());
		this.hashColumns.put("trsp_so_ofc_cty_cd", getTrspSoOfcCtyCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("rlt_trkr_nm", getRltTrkrNm());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("eq_no", getEqNo());
		this.hashColumns.put("shpr_fax_no", getShprFaxNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("rlt_trkr_fax_no", getRltTrkrFaxNo());
		this.hashColumns.put("shpr_cust_nm", getShprCustNm());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("snd_ofc_cd", getSndOfcCd());
		this.hashColumns.put("locl_cre_dt", getLoclCreDt());
		this.hashColumns.put("rlt_trkr_seq", getRltTrkrSeq());
		this.hashColumns.put("rlt_trkr_eml", getRltTrkrEml());
		this.hashColumns.put("msg_tp_cd", getMsgTpCd());
		this.hashColumns.put("eq_tpsz_cd", getEqTpszCd());
		this.hashColumns.put("snd_seq", getSndSeq());
		this.hashColumns.put("snd_usr_id", getSndUsrId());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("locl_upd_dt", getLoclUpdDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("trsp_so_seq", "trspSoSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("snd_tp_cd", "sndTpCd");
		this.hashFields.put("shpr_eml", "shprEml");
		this.hashFields.put("snd_dt", "sndDt");
		this.hashFields.put("trsp_so_ofc_cty_cd", "trspSoOfcCtyCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("rlt_trkr_nm", "rltTrkrNm");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("eq_no", "eqNo");
		this.hashFields.put("shpr_fax_no", "shprFaxNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("rlt_trkr_fax_no", "rltTrkrFaxNo");
		this.hashFields.put("shpr_cust_nm", "shprCustNm");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("snd_ofc_cd", "sndOfcCd");
		this.hashFields.put("locl_cre_dt", "loclCreDt");
		this.hashFields.put("rlt_trkr_seq", "rltTrkrSeq");
		this.hashFields.put("rlt_trkr_eml", "rltTrkrEml");
		this.hashFields.put("msg_tp_cd", "msgTpCd");
		this.hashFields.put("eq_tpsz_cd", "eqTpszCd");
		this.hashFields.put("snd_seq", "sndSeq");
		this.hashFields.put("snd_usr_id", "sndUsrId");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("locl_upd_dt", "loclUpdDt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return trspSoSeq
	 */
	public String getTrspSoSeq() {
		return this.trspSoSeq;
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
	 * @return sndTpCd
	 */
	public String getSndTpCd() {
		return this.sndTpCd;
	}
	
	/**
	 * Column Info
	 * @return shprEml
	 */
	public String getShprEml() {
		return this.shprEml;
	}
	
	/**
	 * Column Info
	 * @return sndDt
	 */
	public String getSndDt() {
		return this.sndDt;
	}
	
	/**
	 * Column Info
	 * @return trspSoOfcCtyCd
	 */
	public String getTrspSoOfcCtyCd() {
		return this.trspSoOfcCtyCd;
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
	 * @return rltTrkrNm
	 */
	public String getRltTrkrNm() {
		return this.rltTrkrNm;
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
	 * @return eqNo
	 */
	public String getEqNo() {
		return this.eqNo;
	}
	
	/**
	 * Column Info
	 * @return shprFaxNo
	 */
	public String getShprFaxNo() {
		return this.shprFaxNo;
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
	 * @return rltTrkrFaxNo
	 */
	public String getRltTrkrFaxNo() {
		return this.rltTrkrFaxNo;
	}
	
	/**
	 * Column Info
	 * @return shprCustNm
	 */
	public String getShprCustNm() {
		return this.shprCustNm;
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
	 * @return sndOfcCd
	 */
	public String getSndOfcCd() {
		return this.sndOfcCd;
	}
	
	/**
	 * Column Info
	 * @return loclCreDt
	 */
	public String getLoclCreDt() {
		return this.loclCreDt;
	}
	
	/**
	 * Column Info
	 * @return rltTrkrSeq
	 */
	public String getRltTrkrSeq() {
		return this.rltTrkrSeq;
	}
	
	/**
	 * Column Info
	 * @return rltTrkrEml
	 */
	public String getRltTrkrEml() {
		return this.rltTrkrEml;
	}
	
	/**
	 * Column Info
	 * @return msgTpCd
	 */
	public String getMsgTpCd() {
		return this.msgTpCd;
	}
	
	/**
	 * Column Info
	 * @return eqTpszCd
	 */
	public String getEqTpszCd() {
		return this.eqTpszCd;
	}
	
	/**
	 * Column Info
	 * @return sndSeq
	 */
	public String getSndSeq() {
		return this.sndSeq;
	}
	
	/**
	 * Column Info
	 * @return sndUsrId
	 */
	public String getSndUsrId() {
		return this.sndUsrId;
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
	 * @return loclUpdDt
	 */
	public String getLoclUpdDt() {
		return this.loclUpdDt;
	}
	

	/**
	 * Column Info
	 * @param trspSoSeq
	 */
	public void setTrspSoSeq(String trspSoSeq) {
		this.trspSoSeq = trspSoSeq;
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
	 * @param sndTpCd
	 */
	public void setSndTpCd(String sndTpCd) {
		this.sndTpCd = sndTpCd;
	}
	
	/**
	 * Column Info
	 * @param shprEml
	 */
	public void setShprEml(String shprEml) {
		this.shprEml = shprEml;
	}
	
	/**
	 * Column Info
	 * @param sndDt
	 */
	public void setSndDt(String sndDt) {
		this.sndDt = sndDt;
	}
	
	/**
	 * Column Info
	 * @param trspSoOfcCtyCd
	 */
	public void setTrspSoOfcCtyCd(String trspSoOfcCtyCd) {
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
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
	 * @param rltTrkrNm
	 */
	public void setRltTrkrNm(String rltTrkrNm) {
		this.rltTrkrNm = rltTrkrNm;
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
	 * @param eqNo
	 */
	public void setEqNo(String eqNo) {
		this.eqNo = eqNo;
	}
	
	/**
	 * Column Info
	 * @param shprFaxNo
	 */
	public void setShprFaxNo(String shprFaxNo) {
		this.shprFaxNo = shprFaxNo;
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
	 * @param rltTrkrFaxNo
	 */
	public void setRltTrkrFaxNo(String rltTrkrFaxNo) {
		this.rltTrkrFaxNo = rltTrkrFaxNo;
	}
	
	/**
	 * Column Info
	 * @param shprCustNm
	 */
	public void setShprCustNm(String shprCustNm) {
		this.shprCustNm = shprCustNm;
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
	 * @param sndOfcCd
	 */
	public void setSndOfcCd(String sndOfcCd) {
		this.sndOfcCd = sndOfcCd;
	}
	
	/**
	 * Column Info
	 * @param loclCreDt
	 */
	public void setLoclCreDt(String loclCreDt) {
		this.loclCreDt = loclCreDt;
	}
	
	/**
	 * Column Info
	 * @param rltTrkrSeq
	 */
	public void setRltTrkrSeq(String rltTrkrSeq) {
		this.rltTrkrSeq = rltTrkrSeq;
	}
	
	/**
	 * Column Info
	 * @param rltTrkrEml
	 */
	public void setRltTrkrEml(String rltTrkrEml) {
		this.rltTrkrEml = rltTrkrEml;
	}
	
	/**
	 * Column Info
	 * @param msgTpCd
	 */
	public void setMsgTpCd(String msgTpCd) {
		this.msgTpCd = msgTpCd;
	}
	
	/**
	 * Column Info
	 * @param eqTpszCd
	 */
	public void setEqTpszCd(String eqTpszCd) {
		this.eqTpszCd = eqTpszCd;
	}
	
	/**
	 * Column Info
	 * @param sndSeq
	 */
	public void setSndSeq(String sndSeq) {
		this.sndSeq = sndSeq;
	}
	
	/**
	 * Column Info
	 * @param sndUsrId
	 */
	public void setSndUsrId(String sndUsrId) {
		this.sndUsrId = sndUsrId;
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
	 * @param loclUpdDt
	 */
	public void setLoclUpdDt(String loclUpdDt) {
		this.loclUpdDt = loclUpdDt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setTrspSoSeq(JSPUtil.getParameter(request, "trsp_so_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSndTpCd(JSPUtil.getParameter(request, "snd_tp_cd", ""));
		setShprEml(JSPUtil.getParameter(request, "shpr_eml", ""));
		setSndDt(JSPUtil.getParameter(request, "snd_dt", ""));
		setTrspSoOfcCtyCd(JSPUtil.getParameter(request, "trsp_so_ofc_cty_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setRltTrkrNm(JSPUtil.getParameter(request, "rlt_trkr_nm", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setEqNo(JSPUtil.getParameter(request, "eq_no", ""));
		setShprFaxNo(JSPUtil.getParameter(request, "shpr_fax_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setRltTrkrFaxNo(JSPUtil.getParameter(request, "rlt_trkr_fax_no", ""));
		setShprCustNm(JSPUtil.getParameter(request, "shpr_cust_nm", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setSndOfcCd(JSPUtil.getParameter(request, "snd_ofc_cd", ""));
		setLoclCreDt(JSPUtil.getParameter(request, "locl_cre_dt", ""));
		setRltTrkrSeq(JSPUtil.getParameter(request, "rlt_trkr_seq", ""));
		setRltTrkrEml(JSPUtil.getParameter(request, "rlt_trkr_eml", ""));
		setMsgTpCd(JSPUtil.getParameter(request, "msg_tp_cd", ""));
		setEqTpszCd(JSPUtil.getParameter(request, "eq_tpsz_cd", ""));
		setSndSeq(JSPUtil.getParameter(request, "snd_seq", ""));
		setSndUsrId(JSPUtil.getParameter(request, "snd_usr_id", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setLoclUpdDt(JSPUtil.getParameter(request, "locl_upd_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsTrspCfmMsgHisVO[]
	 */
	public TrsTrspCfmMsgHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsTrspCfmMsgHisVO[]
	 */
	public TrsTrspCfmMsgHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspCfmMsgHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] trspSoSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_so_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] sndTpCd = (JSPUtil.getParameter(request, prefix	+ "snd_tp_cd", length));
			String[] shprEml = (JSPUtil.getParameter(request, prefix	+ "shpr_eml", length));
			String[] sndDt = (JSPUtil.getParameter(request, prefix	+ "snd_dt", length));
			String[] trspSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_so_ofc_cty_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] rltTrkrNm = (JSPUtil.getParameter(request, prefix	+ "rlt_trkr_nm", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] eqNo = (JSPUtil.getParameter(request, prefix	+ "eq_no", length));
			String[] shprFaxNo = (JSPUtil.getParameter(request, prefix	+ "shpr_fax_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] rltTrkrFaxNo = (JSPUtil.getParameter(request, prefix	+ "rlt_trkr_fax_no", length));
			String[] shprCustNm = (JSPUtil.getParameter(request, prefix	+ "shpr_cust_nm", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] sndOfcCd = (JSPUtil.getParameter(request, prefix	+ "snd_ofc_cd", length));
			String[] loclCreDt = (JSPUtil.getParameter(request, prefix	+ "locl_cre_dt", length));
			String[] rltTrkrSeq = (JSPUtil.getParameter(request, prefix	+ "rlt_trkr_seq", length));
			String[] rltTrkrEml = (JSPUtil.getParameter(request, prefix	+ "rlt_trkr_eml", length));
			String[] msgTpCd = (JSPUtil.getParameter(request, prefix	+ "msg_tp_cd", length));
			String[] eqTpszCd = (JSPUtil.getParameter(request, prefix	+ "eq_tpsz_cd", length));
			String[] sndSeq = (JSPUtil.getParameter(request, prefix	+ "snd_seq", length));
			String[] sndUsrId = (JSPUtil.getParameter(request, prefix	+ "snd_usr_id", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] loclUpdDt = (JSPUtil.getParameter(request, prefix	+ "locl_upd_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsTrspCfmMsgHisVO();
				if (trspSoSeq[i] != null)
					model.setTrspSoSeq(trspSoSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (sndTpCd[i] != null)
					model.setSndTpCd(sndTpCd[i]);
				if (shprEml[i] != null)
					model.setShprEml(shprEml[i]);
				if (sndDt[i] != null)
					model.setSndDt(sndDt[i]);
				if (trspSoOfcCtyCd[i] != null)
					model.setTrspSoOfcCtyCd(trspSoOfcCtyCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (rltTrkrNm[i] != null)
					model.setRltTrkrNm(rltTrkrNm[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (eqNo[i] != null)
					model.setEqNo(eqNo[i]);
				if (shprFaxNo[i] != null)
					model.setShprFaxNo(shprFaxNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (rltTrkrFaxNo[i] != null)
					model.setRltTrkrFaxNo(rltTrkrFaxNo[i]);
				if (shprCustNm[i] != null)
					model.setShprCustNm(shprCustNm[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (sndOfcCd[i] != null)
					model.setSndOfcCd(sndOfcCd[i]);
				if (loclCreDt[i] != null)
					model.setLoclCreDt(loclCreDt[i]);
				if (rltTrkrSeq[i] != null)
					model.setRltTrkrSeq(rltTrkrSeq[i]);
				if (rltTrkrEml[i] != null)
					model.setRltTrkrEml(rltTrkrEml[i]);
				if (msgTpCd[i] != null)
					model.setMsgTpCd(msgTpCd[i]);
				if (eqTpszCd[i] != null)
					model.setEqTpszCd(eqTpszCd[i]);
				if (sndSeq[i] != null)
					model.setSndSeq(sndSeq[i]);
				if (sndUsrId[i] != null)
					model.setSndUsrId(sndUsrId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (loclUpdDt[i] != null)
					model.setLoclUpdDt(loclUpdDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsTrspCfmMsgHisVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsTrspCfmMsgHisVO[]
	 */
	public TrsTrspCfmMsgHisVO[] getTrsTrspCfmMsgHisVOs(){
		TrsTrspCfmMsgHisVO[] vos = (TrsTrspCfmMsgHisVO[])models.toArray(new TrsTrspCfmMsgHisVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		   return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
	   }

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.trspSoSeq = this.trspSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndTpCd = this.sndTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprEml = this.shprEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndDt = this.sndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoOfcCtyCd = this.trspSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rltTrkrNm = this.rltTrkrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqNo = this.eqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprFaxNo = this.shprFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rltTrkrFaxNo = this.rltTrkrFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCustNm = this.shprCustNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndOfcCd = this.sndOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCreDt = this.loclCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rltTrkrSeq = this.rltTrkrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rltTrkrEml = this.rltTrkrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgTpCd = this.msgTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqTpszCd = this.eqTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndSeq = this.sndSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndUsrId = this.sndUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclUpdDt = this.loclUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
