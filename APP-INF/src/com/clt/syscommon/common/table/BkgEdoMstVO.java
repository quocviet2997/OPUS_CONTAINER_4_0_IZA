/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgEdoMstVO.java
*@FileTitle : BkgEdoMstVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.20
*@LastModifier : 박만건
*@LastVersion : 1.0
* 2009.11.20 박만건 
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
 * @author 박만건
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgEdoMstVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgEdoMstVO> models = new ArrayList<BkgEdoMstVO>();
	
	/* Column Info */
	private String edoAckDt = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String edoAckCd = null;
	/* Column Info */
	private String edoRctLocCd = null;
	/* Column Info */
	private String edoSkdVoyNo = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String edoRjctRsn = null;
	/* Column Info */
	private String edoRqstSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String edoAckUsrId = null;
	/* Column Info */
	private String edoRctDt = null;
	/* Column Info */
	private String edoAckOfcCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String edoFuncCd = null;
	/* Column Info */
	private String edoTpCd = null;
	/* Column Info */
	private String deltDt = null;
	/* Column Info */
	private String vslArrDt = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String edoSkdDirCd = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String edoRqstNo = null;
	/* Column Info */
	private String mfSeqNo = null;
	/* Column Info */
	private String edoVslNm = null;
	/* Column Info */
	private String deltUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgEdoMstVO() {}

	public BkgEdoMstVO(String ibflag, String pagerows, String edoRqstNo, String edoRqstSeq, String edoTpCd, String edoFuncCd, String bkgNo, String blNo, String mfSeqNo, String edoVslNm, String edoSkdVoyNo, String edoSkdDirCd, String podCd, String vslArrDt, String edoRctDt, String edoRctLocCd, String edoAckCd, String edoAckDt, String edoAckUsrId, String edoRjctRsn, String deltFlg, String deltDt, String deltUsrId, String diffRmk, String creUsrId, String creDt, String updUsrId, String updDt, String edoAckOfcCd) {
		this.edoAckDt = edoAckDt;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.edoAckCd = edoAckCd;
		this.edoRctLocCd = edoRctLocCd;
		this.edoSkdVoyNo = edoSkdVoyNo;
		this.blNo = blNo;
		this.edoRjctRsn = edoRjctRsn;
		this.edoRqstSeq = edoRqstSeq;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.edoAckUsrId = edoAckUsrId;
		this.edoRctDt = edoRctDt;
		this.edoAckOfcCd = edoAckOfcCd;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.edoFuncCd = edoFuncCd;
		this.edoTpCd = edoTpCd;
		this.deltDt = deltDt;
		this.vslArrDt = vslArrDt;
		this.podCd = podCd;
		this.edoSkdDirCd = edoSkdDirCd;
		this.bkgNo = bkgNo;
		this.creUsrId = creUsrId;
		this.diffRmk = diffRmk;
		this.edoRqstNo = edoRqstNo;
		this.mfSeqNo = mfSeqNo;
		this.edoVslNm = edoVslNm;
		this.deltUsrId = deltUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("edo_ack_dt", getEdoAckDt());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("edo_ack_cd", getEdoAckCd());
		this.hashColumns.put("edo_rct_loc_cd", getEdoRctLocCd());
		this.hashColumns.put("edo_skd_voy_no", getEdoSkdVoyNo());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("edo_rjct_rsn", getEdoRjctRsn());
		this.hashColumns.put("edo_rqst_seq", getEdoRqstSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("edo_ack_usr_id", getEdoAckUsrId());
		this.hashColumns.put("edo_rct_dt", getEdoRctDt());
		this.hashColumns.put("edo_ack_ofc_cd", getEdoAckOfcCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("edo_func_cd", getEdoFuncCd());
		this.hashColumns.put("edo_tp_cd", getEdoTpCd());
		this.hashColumns.put("delt_dt", getDeltDt());
		this.hashColumns.put("vsl_arr_dt", getVslArrDt());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("edo_skd_dir_cd", getEdoSkdDirCd());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("edo_rqst_no", getEdoRqstNo());
		this.hashColumns.put("mf_seq_no", getMfSeqNo());
		this.hashColumns.put("edo_vsl_nm", getEdoVslNm());
		this.hashColumns.put("delt_usr_id", getDeltUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("edo_ack_dt", "edoAckDt");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("edo_ack_cd", "edoAckCd");
		this.hashFields.put("edo_rct_loc_cd", "edoRctLocCd");
		this.hashFields.put("edo_skd_voy_no", "edoSkdVoyNo");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("edo_rjct_rsn", "edoRjctRsn");
		this.hashFields.put("edo_rqst_seq", "edoRqstSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("edo_ack_usr_id", "edoAckUsrId");
		this.hashFields.put("edo_rct_dt", "edoRctDt");
		this.hashFields.put("edo_ack_ofc_cd", "edoAckOfcCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("edo_func_cd", "edoFuncCd");
		this.hashFields.put("edo_tp_cd", "edoTpCd");
		this.hashFields.put("delt_dt", "deltDt");
		this.hashFields.put("vsl_arr_dt", "vslArrDt");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("edo_skd_dir_cd", "edoSkdDirCd");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("edo_rqst_no", "edoRqstNo");
		this.hashFields.put("mf_seq_no", "mfSeqNo");
		this.hashFields.put("edo_vsl_nm", "edoVslNm");
		this.hashFields.put("delt_usr_id", "deltUsrId");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return edoAckDt
	 */
	public String getEdoAckDt() {
		return this.edoAckDt;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return edoAckCd
	 */
	public String getEdoAckCd() {
		return this.edoAckCd;
	}
	
	/**
	 * Column Info
	 * @return edoRctLocCd
	 */
	public String getEdoRctLocCd() {
		return this.edoRctLocCd;
	}
	
	/**
	 * Column Info
	 * @return edoSkdVoyNo
	 */
	public String getEdoSkdVoyNo() {
		return this.edoSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return blNo
	 */
	public String getBlNo() {
		return this.blNo;
	}
	
	/**
	 * Column Info
	 * @return edoRjctRsn
	 */
	public String getEdoRjctRsn() {
		return this.edoRjctRsn;
	}
	
	/**
	 * Column Info
	 * @return edoRqstSeq
	 */
	public String getEdoRqstSeq() {
		return this.edoRqstSeq;
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
	 * @return edoAckUsrId
	 */
	public String getEdoAckUsrId() {
		return this.edoAckUsrId;
	}
	
	/**
	 * Column Info
	 * @return edoRctDt
	 */
	public String getEdoRctDt() {
		return this.edoRctDt;
	}
	
	/**
	 * Column Info
	 * @return edoAckOfcCd
	 */
	public String getEdoAckOfcCd() {
		return this.edoAckOfcCd;
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
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return edoFuncCd
	 */
	public String getEdoFuncCd() {
		return this.edoFuncCd;
	}
	
	/**
	 * Column Info
	 * @return edoTpCd
	 */
	public String getEdoTpCd() {
		return this.edoTpCd;
	}
	
	/**
	 * Column Info
	 * @return deltDt
	 */
	public String getDeltDt() {
		return this.deltDt;
	}
	
	/**
	 * Column Info
	 * @return vslArrDt
	 */
	public String getVslArrDt() {
		return this.vslArrDt;
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
	 * @return edoSkdDirCd
	 */
	public String getEdoSkdDirCd() {
		return this.edoSkdDirCd;
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
	 * @return diffRmk
	 */
	public String getDiffRmk() {
		return this.diffRmk;
	}
	
	/**
	 * Column Info
	 * @return edoRqstNo
	 */
	public String getEdoRqstNo() {
		return this.edoRqstNo;
	}
	
	/**
	 * Column Info
	 * @return mfSeqNo
	 */
	public String getMfSeqNo() {
		return this.mfSeqNo;
	}
	
	/**
	 * Column Info
	 * @return edoVslNm
	 */
	public String getEdoVslNm() {
		return this.edoVslNm;
	}
	
	/**
	 * Column Info
	 * @return deltUsrId
	 */
	public String getDeltUsrId() {
		return this.deltUsrId;
	}
	

	/**
	 * Column Info
	 * @param edoAckDt
	 */
	public void setEdoAckDt(String edoAckDt) {
		this.edoAckDt = edoAckDt;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param edoAckCd
	 */
	public void setEdoAckCd(String edoAckCd) {
		this.edoAckCd = edoAckCd;
	}
	
	/**
	 * Column Info
	 * @param edoRctLocCd
	 */
	public void setEdoRctLocCd(String edoRctLocCd) {
		this.edoRctLocCd = edoRctLocCd;
	}
	
	/**
	 * Column Info
	 * @param edoSkdVoyNo
	 */
	public void setEdoSkdVoyNo(String edoSkdVoyNo) {
		this.edoSkdVoyNo = edoSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param blNo
	 */
	public void setBlNo(String blNo) {
		this.blNo = blNo;
	}
	
	/**
	 * Column Info
	 * @param edoRjctRsn
	 */
	public void setEdoRjctRsn(String edoRjctRsn) {
		this.edoRjctRsn = edoRjctRsn;
	}
	
	/**
	 * Column Info
	 * @param edoRqstSeq
	 */
	public void setEdoRqstSeq(String edoRqstSeq) {
		this.edoRqstSeq = edoRqstSeq;
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
	 * @param edoAckUsrId
	 */
	public void setEdoAckUsrId(String edoAckUsrId) {
		this.edoAckUsrId = edoAckUsrId;
	}
	
	/**
	 * Column Info
	 * @param edoRctDt
	 */
	public void setEdoRctDt(String edoRctDt) {
		this.edoRctDt = edoRctDt;
	}
	
	/**
	 * Column Info
	 * @param edoAckOfcCd
	 */
	public void setEdoAckOfcCd(String edoAckOfcCd) {
		this.edoAckOfcCd = edoAckOfcCd;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param edoFuncCd
	 */
	public void setEdoFuncCd(String edoFuncCd) {
		this.edoFuncCd = edoFuncCd;
	}
	
	/**
	 * Column Info
	 * @param edoTpCd
	 */
	public void setEdoTpCd(String edoTpCd) {
		this.edoTpCd = edoTpCd;
	}
	
	/**
	 * Column Info
	 * @param deltDt
	 */
	public void setDeltDt(String deltDt) {
		this.deltDt = deltDt;
	}
	
	/**
	 * Column Info
	 * @param vslArrDt
	 */
	public void setVslArrDt(String vslArrDt) {
		this.vslArrDt = vslArrDt;
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
	 * @param edoSkdDirCd
	 */
	public void setEdoSkdDirCd(String edoSkdDirCd) {
		this.edoSkdDirCd = edoSkdDirCd;
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
	 * @param diffRmk
	 */
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
	}
	
	/**
	 * Column Info
	 * @param edoRqstNo
	 */
	public void setEdoRqstNo(String edoRqstNo) {
		this.edoRqstNo = edoRqstNo;
	}
	
	/**
	 * Column Info
	 * @param mfSeqNo
	 */
	public void setMfSeqNo(String mfSeqNo) {
		this.mfSeqNo = mfSeqNo;
	}
	
	/**
	 * Column Info
	 * @param edoVslNm
	 */
	public void setEdoVslNm(String edoVslNm) {
		this.edoVslNm = edoVslNm;
	}
	
	/**
	 * Column Info
	 * @param deltUsrId
	 */
	public void setDeltUsrId(String deltUsrId) {
		this.deltUsrId = deltUsrId;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setEdoAckDt(JSPUtil.getParameter(request, "edo_ack_dt", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEdoAckCd(JSPUtil.getParameter(request, "edo_ack_cd", ""));
		setEdoRctLocCd(JSPUtil.getParameter(request, "edo_rct_loc_cd", ""));
		setEdoSkdVoyNo(JSPUtil.getParameter(request, "edo_skd_voy_no", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setEdoRjctRsn(JSPUtil.getParameter(request, "edo_rjct_rsn", ""));
		setEdoRqstSeq(JSPUtil.getParameter(request, "edo_rqst_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setEdoAckUsrId(JSPUtil.getParameter(request, "edo_ack_usr_id", ""));
		setEdoRctDt(JSPUtil.getParameter(request, "edo_rct_dt", ""));
		setEdoAckOfcCd(JSPUtil.getParameter(request, "edo_ack_ofc_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setEdoFuncCd(JSPUtil.getParameter(request, "edo_func_cd", ""));
		setEdoTpCd(JSPUtil.getParameter(request, "edo_tp_cd", ""));
		setDeltDt(JSPUtil.getParameter(request, "delt_dt", ""));
		setVslArrDt(JSPUtil.getParameter(request, "vsl_arr_dt", ""));
		setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
		setEdoSkdDirCd(JSPUtil.getParameter(request, "edo_skd_dir_cd", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setEdoRqstNo(JSPUtil.getParameter(request, "edo_rqst_no", ""));
		setMfSeqNo(JSPUtil.getParameter(request, "mf_seq_no", ""));
		setEdoVslNm(JSPUtil.getParameter(request, "edo_vsl_nm", ""));
		setDeltUsrId(JSPUtil.getParameter(request, "delt_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgEdoMstVO[]
	 */
	public BkgEdoMstVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgEdoMstVO[]
	 */
	public BkgEdoMstVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgEdoMstVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] edoAckDt = (JSPUtil.getParameter(request, prefix	+ "edo_ack_dt", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] edoAckCd = (JSPUtil.getParameter(request, prefix	+ "edo_ack_cd", length));
			String[] edoRctLocCd = (JSPUtil.getParameter(request, prefix	+ "edo_rct_loc_cd", length));
			String[] edoSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "edo_skd_voy_no", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] edoRjctRsn = (JSPUtil.getParameter(request, prefix	+ "edo_rjct_rsn", length));
			String[] edoRqstSeq = (JSPUtil.getParameter(request, prefix	+ "edo_rqst_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] edoAckUsrId = (JSPUtil.getParameter(request, prefix	+ "edo_ack_usr_id", length));
			String[] edoRctDt = (JSPUtil.getParameter(request, prefix	+ "edo_rct_dt", length));
			String[] edoAckOfcCd = (JSPUtil.getParameter(request, prefix	+ "edo_ack_ofc_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] edoFuncCd = (JSPUtil.getParameter(request, prefix	+ "edo_func_cd", length));
			String[] edoTpCd = (JSPUtil.getParameter(request, prefix	+ "edo_tp_cd", length));
			String[] deltDt = (JSPUtil.getParameter(request, prefix	+ "delt_dt", length));
			String[] vslArrDt = (JSPUtil.getParameter(request, prefix	+ "vsl_arr_dt", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] edoSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "edo_skd_dir_cd", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] edoRqstNo = (JSPUtil.getParameter(request, prefix	+ "edo_rqst_no", length));
			String[] mfSeqNo = (JSPUtil.getParameter(request, prefix	+ "mf_seq_no", length));
			String[] edoVslNm = (JSPUtil.getParameter(request, prefix	+ "edo_vsl_nm", length));
			String[] deltUsrId = (JSPUtil.getParameter(request, prefix	+ "delt_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgEdoMstVO();
				if (edoAckDt[i] != null)
					model.setEdoAckDt(edoAckDt[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (edoAckCd[i] != null)
					model.setEdoAckCd(edoAckCd[i]);
				if (edoRctLocCd[i] != null)
					model.setEdoRctLocCd(edoRctLocCd[i]);
				if (edoSkdVoyNo[i] != null)
					model.setEdoSkdVoyNo(edoSkdVoyNo[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (edoRjctRsn[i] != null)
					model.setEdoRjctRsn(edoRjctRsn[i]);
				if (edoRqstSeq[i] != null)
					model.setEdoRqstSeq(edoRqstSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (edoAckUsrId[i] != null)
					model.setEdoAckUsrId(edoAckUsrId[i]);
				if (edoRctDt[i] != null)
					model.setEdoRctDt(edoRctDt[i]);
				if (edoAckOfcCd[i] != null)
					model.setEdoAckOfcCd(edoAckOfcCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (edoFuncCd[i] != null)
					model.setEdoFuncCd(edoFuncCd[i]);
				if (edoTpCd[i] != null)
					model.setEdoTpCd(edoTpCd[i]);
				if (deltDt[i] != null)
					model.setDeltDt(deltDt[i]);
				if (vslArrDt[i] != null)
					model.setVslArrDt(vslArrDt[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (edoSkdDirCd[i] != null)
					model.setEdoSkdDirCd(edoSkdDirCd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (edoRqstNo[i] != null)
					model.setEdoRqstNo(edoRqstNo[i]);
				if (mfSeqNo[i] != null)
					model.setMfSeqNo(mfSeqNo[i]);
				if (edoVslNm[i] != null)
					model.setEdoVslNm(edoVslNm[i]);
				if (deltUsrId[i] != null)
					model.setDeltUsrId(deltUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgEdoMstVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgEdoMstVO[]
	 */
	public BkgEdoMstVO[] getBkgEdoMstVOs(){
		BkgEdoMstVO[] vos = (BkgEdoMstVO[])models.toArray(new BkgEdoMstVO[models.size()]);
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
		this.edoAckDt = this.edoAckDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoAckCd = this.edoAckCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoRctLocCd = this.edoRctLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoSkdVoyNo = this.edoSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoRjctRsn = this.edoRjctRsn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoRqstSeq = this.edoRqstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoAckUsrId = this.edoAckUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoRctDt = this.edoRctDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoAckOfcCd = this.edoAckOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoFuncCd = this.edoFuncCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoTpCd = this.edoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltDt = this.deltDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslArrDt = this.vslArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoSkdDirCd = this.edoSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoRqstNo = this.edoRqstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfSeqNo = this.mfSeqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoVslNm = this.edoVslNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltUsrId = this.deltUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
