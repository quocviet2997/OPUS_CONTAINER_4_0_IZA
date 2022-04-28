/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ComAproRqstHdrVO.java
*@FileTitle : ComAproRqstHdrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2018.04.27
*@LastModifier : 
*@LastVersion : 1.0
* 2018.04.27  
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

public class ComAproRqstHdrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComAproRqstHdrVO> models = new ArrayList<ComAproRqstHdrVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String rqstUsrId = null;
	/* Column Info */
	private String subSysCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String crntAproSeq = null;
	/* Column Info */
	private String rqstUsrNm = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rqstUsrJbTitNm = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String rqstOfcNm = null;
	/* Column Info */
	private String rqstRmk = null;
	/* Column Info */
	private String rqstEndDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String rqstStDt = null;
	/* Column Info */
	private String aproRqstNo = null;
	/* Column Info */
	private String rqstOfcCd = null;
	/* Column Info */
	private String aproKndCd = null;
	/* Column Info */
	private String rqstTitNm = null;
	/* Column Info */
	private String apstsCd = null;
	/* Column Info */
	private String dfltAproOfcCd = null;
	/* Column Info */
	private String aproRoutSeq = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public ComAproRqstHdrVO() {}

	public ComAproRqstHdrVO(String ibflag, String pagerows, String dfltAproOfcCd, String aproRoutSeq, String updDt, String rqstUsrId, String subSysCd, String deltFlg, String crntAproSeq, String rqstUsrNm, String creDt, String rqstUsrJbTitNm, String rqstRmk, String rqstOfcNm, String creUsrId, String rqstEndDt, String aproRqstNo, String rqstStDt, String rqstTitNm, String aproKndCd, String rqstOfcCd, String apstsCd, String updUsrId) {
		this.updDt = updDt;
		this.rqstUsrId = rqstUsrId;
		this.subSysCd = subSysCd;
		this.deltFlg = deltFlg;
		this.crntAproSeq = crntAproSeq;
		this.rqstUsrNm = rqstUsrNm;
		this.creDt = creDt;
		this.rqstUsrJbTitNm = rqstUsrJbTitNm;
		this.pagerows = pagerows;
		this.rqstOfcNm = rqstOfcNm;
		this.rqstRmk = rqstRmk;
		this.rqstEndDt = rqstEndDt;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.rqstStDt = rqstStDt;
		this.aproRqstNo = aproRqstNo;
		this.rqstOfcCd = rqstOfcCd;
		this.aproKndCd = aproKndCd;
		this.rqstTitNm = rqstTitNm;
		this.apstsCd = apstsCd;
		this.dfltAproOfcCd = dfltAproOfcCd;
		this.aproRoutSeq = aproRoutSeq;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rqst_usr_id", getRqstUsrId());
		this.hashColumns.put("sub_sys_cd", getSubSysCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("crnt_apro_seq", getCrntAproSeq());
		this.hashColumns.put("rqst_usr_nm", getRqstUsrNm());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rqst_usr_jb_tit_nm", getRqstUsrJbTitNm());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("rqst_ofc_nm", getRqstOfcNm());
		this.hashColumns.put("rqst_rmk", getRqstRmk());
		this.hashColumns.put("rqst_end_dt", getRqstEndDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rqst_st_dt", getRqstStDt());
		this.hashColumns.put("apro_rqst_no", getAproRqstNo());
		this.hashColumns.put("rqst_ofc_cd", getRqstOfcCd());
		this.hashColumns.put("apro_knd_cd", getAproKndCd());
		this.hashColumns.put("rqst_tit_nm", getRqstTitNm());
		this.hashColumns.put("apsts_cd", getApstsCd());
		this.hashColumns.put("dflt_apro_ofc_cd", getDfltAproOfcCd());
		this.hashColumns.put("apro_rout_seq", getAproRoutSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rqst_usr_id", "rqstUsrId");
		this.hashFields.put("sub_sys_cd", "subSysCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("crnt_apro_seq", "crntAproSeq");
		this.hashFields.put("rqst_usr_nm", "rqstUsrNm");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rqst_usr_jb_tit_nm", "rqstUsrJbTitNm");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("rqst_ofc_nm", "rqstOfcNm");
		this.hashFields.put("rqst_rmk", "rqstRmk");
		this.hashFields.put("rqst_end_dt", "rqstEndDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rqst_st_dt", "rqstStDt");
		this.hashFields.put("apro_rqst_no", "aproRqstNo");
		this.hashFields.put("rqst_ofc_cd", "rqstOfcCd");
		this.hashFields.put("apro_knd_cd", "aproKndCd");
		this.hashFields.put("rqst_tit_nm", "rqstTitNm");
		this.hashFields.put("apsts_cd", "apstsCd");
		this.hashFields.put("dflt_apro_ofc_cd", "dfltAproOfcCd");
		this.hashFields.put("apro_rout_seq", "aproRoutSeq");
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
	 * @return rqstUsrId
	 */
	public String getRqstUsrId() {
		return this.rqstUsrId;
	}
	
	/**
	 * Column Info
	 * @return subSysCd
	 */
	public String getSubSysCd() {
		return this.subSysCd;
	}
	
	/**
	 * Column Info
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}
	
	/**
	 * Column Info
	 * @return crntAproSeq
	 */
	public String getCrntAproSeq() {
		return this.crntAproSeq;
	}
	
	/**
	 * Column Info
	 * @return rqstUsrNm
	 */
	public String getRqstUsrNm() {
		return this.rqstUsrNm;
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
	 * @return rqstUsrJbTitNm
	 */
	public String getRqstUsrJbTitNm() {
		return this.rqstUsrJbTitNm;
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
	 * @return rqstOfcNm
	 */
	public String getRqstOfcNm() {
		return this.rqstOfcNm;
	}
	
	/**
	 * Column Info
	 * @return rqstRmk
	 */
	public String getRqstRmk() {
		return this.rqstRmk;
	}
	
	/**
	 * Column Info
	 * @return rqstEndDt
	 */
	public String getRqstEndDt() {
		return this.rqstEndDt;
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
	 * @return rqstStDt
	 */
	public String getRqstStDt() {
		return this.rqstStDt;
	}
	
	/**
	 * Column Info
	 * @return aproRqstNo
	 */
	public String getAproRqstNo() {
		return this.aproRqstNo;
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
	 * @return aproKndCd
	 */
	public String getAproKndCd() {
		return this.aproKndCd;
	}
	
	/**
	 * Column Info
	 * @return rqstTitNm
	 */
	public String getRqstTitNm() {
		return this.rqstTitNm;
	}
	
	/**
	 * Column Info
	 * @return apstsCd
	 */
	public String getApstsCd() {
		return this.apstsCd;
	}
	
	/**
	 * Column Info
	 * @return dfltAproOfcCd
	 */
	public String getDfltAproOfcCd() {
		return this.dfltAproOfcCd;
	}
	
	/**
	 * Column Info
	 * @return aproRoutSeq
	 */
	public String getAproRoutSeq() {
		return this.aproRoutSeq;
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
	 * @param rqstUsrId
	 */
	public void setRqstUsrId(String rqstUsrId) {
		this.rqstUsrId = rqstUsrId;
	}
	
	/**
	 * Column Info
	 * @param subSysCd
	 */
	public void setSubSysCd(String subSysCd) {
		this.subSysCd = subSysCd;
	}
	
	/**
	 * Column Info
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}
	
	/**
	 * Column Info
	 * @param crntAproSeq
	 */
	public void setCrntAproSeq(String crntAproSeq) {
		this.crntAproSeq = crntAproSeq;
	}
	
	/**
	 * Column Info
	 * @param rqstUsrNm
	 */
	public void setRqstUsrNm(String rqstUsrNm) {
		this.rqstUsrNm = rqstUsrNm;
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
	 * @param rqstUsrJbTitNm
	 */
	public void setRqstUsrJbTitNm(String rqstUsrJbTitNm) {
		this.rqstUsrJbTitNm = rqstUsrJbTitNm;
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
	 * @param rqstOfcNm
	 */
	public void setRqstOfcNm(String rqstOfcNm) {
		this.rqstOfcNm = rqstOfcNm;
	}
	
	/**
	 * Column Info
	 * @param rqstRmk
	 */
	public void setRqstRmk(String rqstRmk) {
		this.rqstRmk = rqstRmk;
	}
	
	/**
	 * Column Info
	 * @param rqstEndDt
	 */
	public void setRqstEndDt(String rqstEndDt) {
		this.rqstEndDt = rqstEndDt;
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
	 * @param rqstStDt
	 */
	public void setRqstStDt(String rqstStDt) {
		this.rqstStDt = rqstStDt;
	}
	
	/**
	 * Column Info
	 * @param aproRqstNo
	 */
	public void setAproRqstNo(String aproRqstNo) {
		this.aproRqstNo = aproRqstNo;
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
	 * @param aproKndCd
	 */
	public void setAproKndCd(String aproKndCd) {
		this.aproKndCd = aproKndCd;
	}
	
	/**
	 * Column Info
	 * @param rqstTitNm
	 */
	public void setRqstTitNm(String rqstTitNm) {
		this.rqstTitNm = rqstTitNm;
	}
	
	/**
	 * Column Info
	 * @param apstsCd
	 */
	public void setApstsCd(String apstsCd) {
		this.apstsCd = apstsCd;
	}
	
	/**
	 * Column Info
	 * @param dfltAproOfcCd
	 */
	public void setDfltAproOfcCd(String dfltAproOfcCd) {
		this.dfltAproOfcCd = dfltAproOfcCd;
	}
	
	/**
	 * Column Info
	 * @param aproRoutSeq
	 */
	public void setAproRoutSeq(String aproRoutSeq) {
		this.aproRoutSeq = aproRoutSeq;
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
		setRqstUsrId(JSPUtil.getParameter(request, prefix + "rqst_usr_id", ""));
		setSubSysCd(JSPUtil.getParameter(request, prefix + "sub_sys_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setCrntAproSeq(JSPUtil.getParameter(request, prefix + "crnt_apro_seq", ""));
		setRqstUsrNm(JSPUtil.getParameter(request, prefix + "rqst_usr_nm", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setRqstUsrJbTitNm(JSPUtil.getParameter(request, prefix + "rqst_usr_jb_tit_nm", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setRqstOfcNm(JSPUtil.getParameter(request, prefix + "rqst_ofc_nm", ""));
		setRqstRmk(JSPUtil.getParameter(request, prefix + "rqst_rmk", ""));
		setRqstEndDt(JSPUtil.getParameter(request, prefix + "rqst_end_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setRqstStDt(JSPUtil.getParameter(request, prefix + "rqst_st_dt", ""));
		setAproRqstNo(JSPUtil.getParameter(request, prefix + "apro_rqst_no", ""));
		setRqstOfcCd(JSPUtil.getParameter(request, prefix + "rqst_ofc_cd", ""));
		setAproKndCd(JSPUtil.getParameter(request, prefix + "apro_knd_cd", ""));
		setRqstTitNm(JSPUtil.getParameter(request, prefix + "rqst_tit_nm", ""));
		setApstsCd(JSPUtil.getParameter(request, prefix + "apsts_cd", ""));
		setDfltAproOfcCd(JSPUtil.getParameter(request, prefix + "dflt_apro_ofc_cd", ""));
		setAproRoutSeq(JSPUtil.getParameter(request, prefix + "apro_rout_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ComAproRqstHdrVO[]
	 */
	public ComAproRqstHdrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ComAproRqstHdrVO[]
	 */
	public ComAproRqstHdrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComAproRqstHdrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] rqstUsrId = (JSPUtil.getParameter(request, prefix	+ "rqst_usr_id", length));
			String[] subSysCd = (JSPUtil.getParameter(request, prefix	+ "sub_sys_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] crntAproSeq = (JSPUtil.getParameter(request, prefix	+ "crnt_apro_seq", length));
			String[] rqstUsrNm = (JSPUtil.getParameter(request, prefix	+ "rqst_usr_nm", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] rqstUsrJbTitNm = (JSPUtil.getParameter(request, prefix	+ "rqst_usr_jb_tit_nm", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] rqstOfcNm = (JSPUtil.getParameter(request, prefix	+ "rqst_ofc_nm", length));
			String[] rqstRmk = (JSPUtil.getParameter(request, prefix	+ "rqst_rmk", length));
			String[] rqstEndDt = (JSPUtil.getParameter(request, prefix	+ "rqst_end_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] rqstStDt = (JSPUtil.getParameter(request, prefix	+ "rqst_st_dt", length));
			String[] aproRqstNo = (JSPUtil.getParameter(request, prefix	+ "apro_rqst_no", length));
			String[] rqstOfcCd = (JSPUtil.getParameter(request, prefix	+ "rqst_ofc_cd", length));
			String[] aproKndCd = (JSPUtil.getParameter(request, prefix	+ "apro_knd_cd", length));
			String[] rqstTitNm = (JSPUtil.getParameter(request, prefix	+ "rqst_tit_nm", length));
			String[] apstsCd = (JSPUtil.getParameter(request, prefix	+ "apsts_cd", length));
			String[] dfltAproOfcCd = (JSPUtil.getParameter(request, prefix	+ "dflt_apro_ofc_cd", length));
			String[] aproRoutSeq = (JSPUtil.getParameter(request, prefix	+ "apro_rout_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new ComAproRqstHdrVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (rqstUsrId[i] != null)
					model.setRqstUsrId(rqstUsrId[i]);
				if (subSysCd[i] != null)
					model.setSubSysCd(subSysCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (crntAproSeq[i] != null)
					model.setCrntAproSeq(crntAproSeq[i]);
				if (rqstUsrNm[i] != null)
					model.setRqstUsrNm(rqstUsrNm[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rqstUsrJbTitNm[i] != null)
					model.setRqstUsrJbTitNm(rqstUsrJbTitNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (rqstOfcNm[i] != null)
					model.setRqstOfcNm(rqstOfcNm[i]);
				if (rqstRmk[i] != null)
					model.setRqstRmk(rqstRmk[i]);
				if (rqstEndDt[i] != null)
					model.setRqstEndDt(rqstEndDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rqstStDt[i] != null)
					model.setRqstStDt(rqstStDt[i]);
				if (aproRqstNo[i] != null)
					model.setAproRqstNo(aproRqstNo[i]);
				if (rqstOfcCd[i] != null)
					model.setRqstOfcCd(rqstOfcCd[i]);
				if (aproKndCd[i] != null)
					model.setAproKndCd(aproKndCd[i]);
				if (rqstTitNm[i] != null)
					model.setRqstTitNm(rqstTitNm[i]);
				if (apstsCd[i] != null)
					model.setApstsCd(apstsCd[i]);
				if (dfltAproOfcCd[i] != null)
					model.setDfltAproOfcCd(dfltAproOfcCd[i]);
				if (aproRoutSeq[i] != null)
					model.setAproRoutSeq(aproRoutSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getComAproRqstHdrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ComAproRqstHdrVO[]
	 */
	public ComAproRqstHdrVO[] getComAproRqstHdrVOs(){
		ComAproRqstHdrVO[] vos = (ComAproRqstHdrVO[])models.toArray(new ComAproRqstHdrVO[models.size()]);
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
		this.rqstUsrId = this.rqstUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subSysCd = this.subSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntAproSeq = this.crntAproSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstUsrNm = this.rqstUsrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstUsrJbTitNm = this.rqstUsrJbTitNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstOfcNm = this.rqstOfcNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstRmk = this.rqstRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstEndDt = this.rqstEndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstStDt = this.rqstStDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRqstNo = this.aproRqstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstOfcCd = this.rqstOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproKndCd = this.aproKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstTitNm = this.rqstTitNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apstsCd = this.apstsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dfltAproOfcCd = this.dfltAproOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRoutSeq = this.aproRoutSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
