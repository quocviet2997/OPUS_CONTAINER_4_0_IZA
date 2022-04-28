/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : BkgCstmsDuVvdVO.java
*@FileTitle : BkgCstmsDuVvdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.03.12
*@LastModifier : 김민정
*@LastVersion : 1.0
* 2010.03.12 김민정 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

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
 * @author 김민정
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCstmsDuVvdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsDuVvdVO> models = new ArrayList<BkgCstmsDuVvdVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String duMfSeqNo = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String duLineId = null;
	/* Column Info */
	private String etaDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String vslNm = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String clptSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String duInstlNo = null;
	/* Column Info */
	private String duMsgTpId = null;
	/* Column Info */
	private String duRotnNo = null;
	/* Column Info */
	private String duVoyAgnId = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String duMrnNo = null;
	/* Column Info */
	private String mrnDt = null;


	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsDuVvdVO() {}

	public BkgCstmsDuVvdVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String podCd, String clptSeq, String polCd, String vslNm, String duLineId, String duVoyAgnId, String duRotnNo, String etaDt, String duMsgTpId, String duInstlNo, String duMfSeqNo, String creUsrId, String creDt, String updUsrId, String updDt, String duMrnNo, String mrnDt) {
		this.updDt = updDt;
		this.duMfSeqNo = duMfSeqNo;
		this.vslCd = vslCd;
		this.duLineId = duLineId;
		this.etaDt = etaDt;
		this.creDt = creDt;
		this.skdVoyNo = skdVoyNo;
		this.vslNm = vslNm;
		this.skdDirCd = skdDirCd;
		this.pagerows = pagerows;
		this.podCd = podCd;
		this.clptSeq = clptSeq;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.polCd = polCd;
		this.duInstlNo = duInstlNo;
		this.duMsgTpId = duMsgTpId;
		this.duRotnNo = duRotnNo;
		this.duVoyAgnId = duVoyAgnId;
		this.updUsrId = updUsrId;
		this.duMrnNo = duMrnNo;
		this.mrnDt  = mrnDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("du_mf_seq_no", getDuMfSeqNo());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("du_line_id", getDuLineId());
		this.hashColumns.put("eta_dt", getEtaDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("vsl_nm", getVslNm());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("clpt_seq", getClptSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("du_instl_no", getDuInstlNo());
		this.hashColumns.put("du_msg_tp_id", getDuMsgTpId());
		this.hashColumns.put("du_rotn_no", getDuRotnNo());
		this.hashColumns.put("du_voy_agn_id", getDuVoyAgnId());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("du_mrn_no", getDuMrnNo());
		this.hashColumns.put("mrn_dt", getMrnDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("du_mf_seq_no", "duMfSeqNo");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("du_line_id", "duLineId");
		this.hashFields.put("eta_dt", "etaDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("vsl_nm", "vslNm");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("clpt_seq", "clptSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("du_instl_no", "duInstlNo");
		this.hashFields.put("du_msg_tp_id", "duMsgTpId");
		this.hashFields.put("du_rotn_no", "duRotnNo");
		this.hashFields.put("du_voy_agn_id", "duVoyAgnId");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("du_mrn_no", "duMrnNo");
		this.hashFields.put("mrn_dt", "mrnDt");
		return this.hashFields;
	}
	/**
	 * Column Info
	 * @return duMrnNo
	 */
	public String getDuMrnNo() {
		return this.duMrnNo;
	}
	
	
	/**
	 * Column Info
	 * @return mrnDt
	 */
	public String getMrnDt() {
		return this.mrnDt;
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
	 * @return duMfSeqNo
	 */
	public String getDuMfSeqNo() {
		return this.duMfSeqNo;
	}
	
	/**
	 * Column Info
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
	}
	
	/**
	 * Column Info
	 * @return duLineId
	 */
	public String getDuLineId() {
		return this.duLineId;
	}
	
	/**
	 * Column Info
	 * @return etaDt
	 */
	public String getEtaDt() {
		return this.etaDt;
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
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return vslNm
	 */
	public String getVslNm() {
		return this.vslNm;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
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
	 * @return podCd
	 */
	public String getPodCd() {
		return this.podCd;
	}
	
	/**
	 * Column Info
	 * @return clptSeq
	 */
	public String getClptSeq() {
		return this.clptSeq;
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
	 * @return polCd
	 */
	public String getPolCd() {
		return this.polCd;
	}
	
	/**
	 * Column Info
	 * @return duInstlNo
	 */
	public String getDuInstlNo() {
		return this.duInstlNo;
	}
	
	/**
	 * Column Info
	 * @return duMsgTpId
	 */
	public String getDuMsgTpId() {
		return this.duMsgTpId;
	}
	
	/**
	 * Column Info
	 * @return duRotnNo
	 */
	public String getDuRotnNo() {
		return this.duRotnNo;
	}
	
	/**
	 * Column Info
	 * @return duVoyAgnId
	 */
	public String getDuVoyAgnId() {
		return this.duVoyAgnId;
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
	 * @param duMrnNo
	 */
	public void setDuMrnNo(String duMrnNo) {
		this.duMrnNo = duMrnNo;
	}

	
	/**
	 * Column Info
	 * @param mrnDt
	 */
	public void setMrnDt(String mrnDt) {
		this.mrnDt = mrnDt;
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
	 * @param duMfSeqNo
	 */
	public void setDuMfSeqNo(String duMfSeqNo) {
		this.duMfSeqNo = duMfSeqNo;
	}
	
	/**
	 * Column Info
	 * @param vslCd
	 */
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
	}
	
	/**
	 * Column Info
	 * @param duLineId
	 */
	public void setDuLineId(String duLineId) {
		this.duLineId = duLineId;
	}
	
	/**
	 * Column Info
	 * @param etaDt
	 */
	public void setEtaDt(String etaDt) {
		this.etaDt = etaDt;
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
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param vslNm
	 */
	public void setVslNm(String vslNm) {
		this.vslNm = vslNm;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
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
	 * @param podCd
	 */
	public void setPodCd(String podCd) {
		this.podCd = podCd;
	}
	
	/**
	 * Column Info
	 * @param clptSeq
	 */
	public void setClptSeq(String clptSeq) {
		this.clptSeq = clptSeq;
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
	 * @param polCd
	 */
	public void setPolCd(String polCd) {
		this.polCd = polCd;
	}
	
	/**
	 * Column Info
	 * @param duInstlNo
	 */
	public void setDuInstlNo(String duInstlNo) {
		this.duInstlNo = duInstlNo;
	}
	
	/**
	 * Column Info
	 * @param duMsgTpId
	 */
	public void setDuMsgTpId(String duMsgTpId) {
		this.duMsgTpId = duMsgTpId;
	}
	
	/**
	 * Column Info
	 * @param duRotnNo
	 */
	public void setDuRotnNo(String duRotnNo) {
		this.duRotnNo = duRotnNo;
	}
	
	/**
	 * Column Info
	 * @param duVoyAgnId
	 */
	public void setDuVoyAgnId(String duVoyAgnId) {
		this.duVoyAgnId = duVoyAgnId;
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
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setDuMfSeqNo(JSPUtil.getParameter(request, prefix + "du_mf_seq_no", ""));
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setDuLineId(JSPUtil.getParameter(request, prefix + "du_line_id", ""));
		setEtaDt(JSPUtil.getParameter(request, prefix + "eta_dt", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setVslNm(JSPUtil.getParameter(request, prefix + "vsl_nm", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setPodCd(JSPUtil.getParameter(request, prefix + "pod_cd", ""));
		setClptSeq(JSPUtil.getParameter(request, prefix + "clpt_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setPolCd(JSPUtil.getParameter(request, prefix + "pol_cd", ""));
		setDuInstlNo(JSPUtil.getParameter(request, prefix + "du_instl_no", ""));
		setDuMsgTpId(JSPUtil.getParameter(request, prefix + "du_msg_tp_id", ""));
		setDuRotnNo(JSPUtil.getParameter(request, prefix + "du_rotn_no", ""));
		setDuVoyAgnId(JSPUtil.getParameter(request, prefix + "du_voy_agn_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setDuMrnNo(JSPUtil.getParameter(request, prefix + "du_mrn_no", ""));
		setMrnDt(JSPUtil.getParameter(request, prefix + "mrn_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsDuVvdVO[]
	 */
	public BkgCstmsDuVvdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsDuVvdVO[]
	 */
	public BkgCstmsDuVvdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsDuVvdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] duMfSeqNo = (JSPUtil.getParameter(request, prefix	+ "du_mf_seq_no", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] duLineId = (JSPUtil.getParameter(request, prefix	+ "du_line_id", length));
			String[] etaDt = (JSPUtil.getParameter(request, prefix	+ "eta_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] vslNm = (JSPUtil.getParameter(request, prefix	+ "vsl_nm", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] clptSeq = (JSPUtil.getParameter(request, prefix	+ "clpt_seq", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd", length));
			String[] duInstlNo = (JSPUtil.getParameter(request, prefix	+ "du_instl_no", length));
			String[] duMsgTpId = (JSPUtil.getParameter(request, prefix	+ "du_msg_tp_id", length));
			String[] duRotnNo = (JSPUtil.getParameter(request, prefix	+ "du_rotn_no", length));
			String[] duVoyAgnId = (JSPUtil.getParameter(request, prefix	+ "du_voy_agn_id", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] duMrnNo = (JSPUtil.getParameter(request, prefix	+ "du_mrn_no", length));
			String[] mrnDt = (JSPUtil.getParameter(request, prefix	+ "mrn_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsDuVvdVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (duMfSeqNo[i] != null)
					model.setDuMfSeqNo(duMfSeqNo[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (duLineId[i] != null)
					model.setDuLineId(duLineId[i]);
				if (etaDt[i] != null)
					model.setEtaDt(etaDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (vslNm[i] != null)
					model.setVslNm(vslNm[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (clptSeq[i] != null)
					model.setClptSeq(clptSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (duInstlNo[i] != null)
					model.setDuInstlNo(duInstlNo[i]);
				if (duMsgTpId[i] != null)
					model.setDuMsgTpId(duMsgTpId[i]);
				if (duRotnNo[i] != null)
					model.setDuRotnNo(duRotnNo[i]);
				if (duVoyAgnId[i] != null)
					model.setDuVoyAgnId(duVoyAgnId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (duMrnNo[i] != null)
					model.setDuMrnNo(duMrnNo[i]);
				if (mrnDt[i] != null)
					model.setMrnDt(mrnDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsDuVvdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsDuVvdVO[]
	 */
	public BkgCstmsDuVvdVO[] getBkgCstmsDuVvdVOs(){
		BkgCstmsDuVvdVO[] vos = (BkgCstmsDuVvdVO[])models.toArray(new BkgCstmsDuVvdVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duMfSeqNo = this.duMfSeqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duLineId = this.duLineId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.etaDt = this.etaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslNm = this.vslNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clptSeq = this.clptSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duInstlNo = this.duInstlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duMsgTpId = this.duMsgTpId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duRotnNo = this.duRotnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duVoyAgnId = this.duVoyAgnId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duMrnNo = this.duMrnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mrnDt = this.mrnDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
