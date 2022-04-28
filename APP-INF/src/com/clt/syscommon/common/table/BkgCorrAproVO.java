/*=========================================================
*Copyright(c) 2019 CyberLogitec
*@FileName : BkgCorrAproVO.java
*@FileTitle : BkgCorrAproVO
*Open Issues :
*Change history :
*@LastModifyDate : 2019.01.10
*@LastModifier : 
*@LastVersion : 1.0
* 2019.01.10  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

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

public class BkgCorrAproVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCorrAproVO> models = new ArrayList<BkgCorrAproVO>();
	
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String cxlOfcCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String rqstDt = null;
	/* Column Info */
	private String aproUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String corrNtfyFlg = null;
	/* Column Info */
	private String aproOfcCd = null;
	/* Column Info */
	private String corrRmk = null;
	/* Column Info */
	private String rqstOfcCd = null;
	/* Column Info */
	private String corrNo = null;
	/* Column Info */
	private String cxlDt = null;
	/* Column Info */
	private String autoAproFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rqstUsrId = null;
	/* Column Info */
	private String corrStsCd = null;
	/* Column Info */
	private String cxlUsrId = null;
	/* Column Info */
	private String aproDt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String corrSeq = null;
	/* Column Info */
	private String corrNtfySndNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public BkgCorrAproVO() {}

	public BkgCorrAproVO(String ibflag, String pagerows, String bkgNo, String corrNo, String corrSeq, String corrStsCd, String autoAproFlg, String corrNtfyFlg, String corrNtfySndNo, String rqstUsrId, String rqstOfcCd, String rqstDt, String aproUsrId, String aproOfcCd, String aproDt, String cxlUsrId, String cxlOfcCd, String cxlDt, String corrRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.pagerows = pagerows;
		this.cxlOfcCd = cxlOfcCd;
		this.ibflag = ibflag;
		this.rqstDt = rqstDt;
		this.aproUsrId = aproUsrId;
		this.bkgNo = bkgNo;
		this.corrNtfyFlg = corrNtfyFlg;
		this.aproOfcCd = aproOfcCd;
		this.corrRmk = corrRmk;
		this.rqstOfcCd = rqstOfcCd;
		this.corrNo = corrNo;
		this.cxlDt = cxlDt;
		this.autoAproFlg = autoAproFlg;
		this.updUsrId = updUsrId;
		this.creUsrId = creUsrId;
		this.creDt = creDt;
		this.rqstUsrId = rqstUsrId;
		this.corrStsCd = corrStsCd;
		this.cxlUsrId = cxlUsrId;
		this.aproDt = aproDt;
		this.updDt = updDt;
		this.corrSeq = corrSeq;
		this.corrNtfySndNo = corrNtfySndNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cxl_ofc_cd", getCxlOfcCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rqst_dt", getRqstDt());
		this.hashColumns.put("apro_usr_id", getAproUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("corr_ntfy_flg", getCorrNtfyFlg());
		this.hashColumns.put("apro_ofc_cd", getAproOfcCd());
		this.hashColumns.put("corr_rmk", getCorrRmk());
		this.hashColumns.put("rqst_ofc_cd", getRqstOfcCd());
		this.hashColumns.put("corr_no", getCorrNo());
		this.hashColumns.put("cxl_dt", getCxlDt());
		this.hashColumns.put("auto_apro_flg", getAutoAproFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rqst_usr_id", getRqstUsrId());
		this.hashColumns.put("corr_sts_cd", getCorrStsCd());
		this.hashColumns.put("cxl_usr_id", getCxlUsrId());
		this.hashColumns.put("apro_dt", getAproDt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("corr_seq", getCorrSeq());
		this.hashColumns.put("corr_ntfy_snd_no", getCorrNtfySndNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cxl_ofc_cd", "cxlOfcCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rqst_dt", "rqstDt");
		this.hashFields.put("apro_usr_id", "aproUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("corr_ntfy_flg", "corrNtfyFlg");
		this.hashFields.put("apro_ofc_cd", "aproOfcCd");
		this.hashFields.put("corr_rmk", "corrRmk");
		this.hashFields.put("rqst_ofc_cd", "rqstOfcCd");
		this.hashFields.put("corr_no", "corrNo");
		this.hashFields.put("cxl_dt", "cxlDt");
		this.hashFields.put("auto_apro_flg", "autoAproFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rqst_usr_id", "rqstUsrId");
		this.hashFields.put("corr_sts_cd", "corrStsCd");
		this.hashFields.put("cxl_usr_id", "cxlUsrId");
		this.hashFields.put("apro_dt", "aproDt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("corr_seq", "corrSeq");
		this.hashFields.put("corr_ntfy_snd_no", "corrNtfySndNo");
		return this.hashFields;
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
	 * @return cxlOfcCd
	 */
	public String getCxlOfcCd() {
		return this.cxlOfcCd;
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
	 * @return rqstDt
	 */
	public String getRqstDt() {
		return this.rqstDt;
	}
	
	/**
	 * Column Info
	 * @return aproUsrId
	 */
	public String getAproUsrId() {
		return this.aproUsrId;
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
	 * @return corrNtfyFlg
	 */
	public String getCorrNtfyFlg() {
		return this.corrNtfyFlg;
	}
	
	/**
	 * Column Info
	 * @return aproOfcCd
	 */
	public String getAproOfcCd() {
		return this.aproOfcCd;
	}
	
	/**
	 * Column Info
	 * @return corrRmk
	 */
	public String getCorrRmk() {
		return this.corrRmk;
	}
	
	/**
	 * Column Info
	 * @return rqstOfcCd
	 */
	public String getRqstOfcCd() {
		return this.rqstOfcCd;
	}
	
	/**
	 * Column Info
	 * @return corrNo
	 */
	public String getCorrNo() {
		return this.corrNo;
	}
	
	/**
	 * Column Info
	 * @return cxlDt
	 */
	public String getCxlDt() {
		return this.cxlDt;
	}
	
	/**
	 * Column Info
	 * @return autoAproFlg
	 */
	public String getAutoAproFlg() {
		return this.autoAproFlg;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return rqstUsrId
	 */
	public String getRqstUsrId() {
		return this.rqstUsrId;
	}
	
	/**
	 * Column Info
	 * @return corrStsCd
	 */
	public String getCorrStsCd() {
		return this.corrStsCd;
	}
	
	/**
	 * Column Info
	 * @return cxlUsrId
	 */
	public String getCxlUsrId() {
		return this.cxlUsrId;
	}
	
	/**
	 * Column Info
	 * @return aproDt
	 */
	public String getAproDt() {
		return this.aproDt;
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
	 * @return corrSeq
	 */
	public String getCorrSeq() {
		return this.corrSeq;
	}
	
	/**
	 * Column Info
	 * @return corrNtfySndNo
	 */
	public String getCorrNtfySndNo() {
		return this.corrNtfySndNo;
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
	 * @param cxlOfcCd
	 */
	public void setCxlOfcCd(String cxlOfcCd) {
		this.cxlOfcCd = cxlOfcCd;
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
	 * @param rqstDt
	 */
	public void setRqstDt(String rqstDt) {
		this.rqstDt = rqstDt;
	}
	
	/**
	 * Column Info
	 * @param aproUsrId
	 */
	public void setAproUsrId(String aproUsrId) {
		this.aproUsrId = aproUsrId;
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
	 * @param corrNtfyFlg
	 */
	public void setCorrNtfyFlg(String corrNtfyFlg) {
		this.corrNtfyFlg = corrNtfyFlg;
	}
	
	/**
	 * Column Info
	 * @param aproOfcCd
	 */
	public void setAproOfcCd(String aproOfcCd) {
		this.aproOfcCd = aproOfcCd;
	}
	
	/**
	 * Column Info
	 * @param corrRmk
	 */
	public void setCorrRmk(String corrRmk) {
		this.corrRmk = corrRmk;
	}
	
	/**
	 * Column Info
	 * @param rqstOfcCd
	 */
	public void setRqstOfcCd(String rqstOfcCd) {
		this.rqstOfcCd = rqstOfcCd;
	}
	
	/**
	 * Column Info
	 * @param corrNo
	 */
	public void setCorrNo(String corrNo) {
		this.corrNo = corrNo;
	}
	
	/**
	 * Column Info
	 * @param cxlDt
	 */
	public void setCxlDt(String cxlDt) {
		this.cxlDt = cxlDt;
	}
	
	/**
	 * Column Info
	 * @param autoAproFlg
	 */
	public void setAutoAproFlg(String autoAproFlg) {
		this.autoAproFlg = autoAproFlg;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
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
	 * @param rqstUsrId
	 */
	public void setRqstUsrId(String rqstUsrId) {
		this.rqstUsrId = rqstUsrId;
	}
	
	/**
	 * Column Info
	 * @param corrStsCd
	 */
	public void setCorrStsCd(String corrStsCd) {
		this.corrStsCd = corrStsCd;
	}
	
	/**
	 * Column Info
	 * @param cxlUsrId
	 */
	public void setCxlUsrId(String cxlUsrId) {
		this.cxlUsrId = cxlUsrId;
	}
	
	/**
	 * Column Info
	 * @param aproDt
	 */
	public void setAproDt(String aproDt) {
		this.aproDt = aproDt;
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
	 * @param corrSeq
	 */
	public void setCorrSeq(String corrSeq) {
		this.corrSeq = corrSeq;
	}
	
	/**
	 * Column Info
	 * @param corrNtfySndNo
	 */
	public void setCorrNtfySndNo(String corrNtfySndNo) {
		this.corrNtfySndNo = corrNtfySndNo;
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
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setCxlOfcCd(JSPUtil.getParameter(request, prefix + "cxl_ofc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setRqstDt(JSPUtil.getParameter(request, prefix + "rqst_dt", ""));
		setAproUsrId(JSPUtil.getParameter(request, prefix + "apro_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, prefix + "bkg_no", ""));
		setCorrNtfyFlg(JSPUtil.getParameter(request, prefix + "corr_ntfy_flg", ""));
		setAproOfcCd(JSPUtil.getParameter(request, prefix + "apro_ofc_cd", ""));
		setCorrRmk(JSPUtil.getParameter(request, prefix + "corr_rmk", ""));
		setRqstOfcCd(JSPUtil.getParameter(request, prefix + "rqst_ofc_cd", ""));
		setCorrNo(JSPUtil.getParameter(request, prefix + "corr_no", ""));
		setCxlDt(JSPUtil.getParameter(request, prefix + "cxl_dt", ""));
		setAutoAproFlg(JSPUtil.getParameter(request, prefix + "auto_apro_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setRqstUsrId(JSPUtil.getParameter(request, prefix + "rqst_usr_id", ""));
		setCorrStsCd(JSPUtil.getParameter(request, prefix + "corr_sts_cd", ""));
		setCxlUsrId(JSPUtil.getParameter(request, prefix + "cxl_usr_id", ""));
		setAproDt(JSPUtil.getParameter(request, prefix + "apro_dt", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setCorrSeq(JSPUtil.getParameter(request, prefix + "corr_seq", ""));
		setCorrNtfySndNo(JSPUtil.getParameter(request, prefix + "corr_ntfy_snd_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCorrAproVO[]
	 */
	public BkgCorrAproVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCorrAproVO[]
	 */
	public BkgCorrAproVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCorrAproVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] cxlOfcCd = (JSPUtil.getParameter(request, prefix	+ "cxl_ofc_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] rqstDt = (JSPUtil.getParameter(request, prefix	+ "rqst_dt", length));
			String[] aproUsrId = (JSPUtil.getParameter(request, prefix	+ "apro_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] corrNtfyFlg = (JSPUtil.getParameter(request, prefix	+ "corr_ntfy_flg", length));
			String[] aproOfcCd = (JSPUtil.getParameter(request, prefix	+ "apro_ofc_cd", length));
			String[] corrRmk = (JSPUtil.getParameter(request, prefix	+ "corr_rmk", length));
			String[] rqstOfcCd = (JSPUtil.getParameter(request, prefix	+ "rqst_ofc_cd", length));
			String[] corrNo = (JSPUtil.getParameter(request, prefix	+ "corr_no", length));
			String[] cxlDt = (JSPUtil.getParameter(request, prefix	+ "cxl_dt", length));
			String[] autoAproFlg = (JSPUtil.getParameter(request, prefix	+ "auto_apro_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] rqstUsrId = (JSPUtil.getParameter(request, prefix	+ "rqst_usr_id", length));
			String[] corrStsCd = (JSPUtil.getParameter(request, prefix	+ "corr_sts_cd", length));
			String[] cxlUsrId = (JSPUtil.getParameter(request, prefix	+ "cxl_usr_id", length));
			String[] aproDt = (JSPUtil.getParameter(request, prefix	+ "apro_dt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] corrSeq = (JSPUtil.getParameter(request, prefix	+ "corr_seq", length));
			String[] corrNtfySndNo = (JSPUtil.getParameter(request, prefix	+ "corr_ntfy_snd_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCorrAproVO();
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (cxlOfcCd[i] != null)
					model.setCxlOfcCd(cxlOfcCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rqstDt[i] != null)
					model.setRqstDt(rqstDt[i]);
				if (aproUsrId[i] != null)
					model.setAproUsrId(aproUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (corrNtfyFlg[i] != null)
					model.setCorrNtfyFlg(corrNtfyFlg[i]);
				if (aproOfcCd[i] != null)
					model.setAproOfcCd(aproOfcCd[i]);
				if (corrRmk[i] != null)
					model.setCorrRmk(corrRmk[i]);
				if (rqstOfcCd[i] != null)
					model.setRqstOfcCd(rqstOfcCd[i]);
				if (corrNo[i] != null)
					model.setCorrNo(corrNo[i]);
				if (cxlDt[i] != null)
					model.setCxlDt(cxlDt[i]);
				if (autoAproFlg[i] != null)
					model.setAutoAproFlg(autoAproFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rqstUsrId[i] != null)
					model.setRqstUsrId(rqstUsrId[i]);
				if (corrStsCd[i] != null)
					model.setCorrStsCd(corrStsCd[i]);
				if (cxlUsrId[i] != null)
					model.setCxlUsrId(cxlUsrId[i]);
				if (aproDt[i] != null)
					model.setAproDt(aproDt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (corrSeq[i] != null)
					model.setCorrSeq(corrSeq[i]);
				if (corrNtfySndNo[i] != null)
					model.setCorrNtfySndNo(corrNtfySndNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCorrAproVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCorrAproVO[]
	 */
	public BkgCorrAproVO[] getBkgCorrAproVOs(){
		BkgCorrAproVO[] vos = (BkgCorrAproVO[])models.toArray(new BkgCorrAproVO[models.size()]);
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
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlOfcCd = this.cxlOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstDt = this.rqstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproUsrId = this.aproUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrNtfyFlg = this.corrNtfyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproOfcCd = this.aproOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrRmk = this.corrRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstOfcCd = this.rqstOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrNo = this.corrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlDt = this.cxlDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoAproFlg = this.autoAproFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstUsrId = this.rqstUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrStsCd = this.corrStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlUsrId = this.cxlUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproDt = this.aproDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrSeq = this.corrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrNtfySndNo = this.corrNtfySndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
