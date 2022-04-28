/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : BkgOutstandingVO.java
*@FileTitle : BkgOutstandingVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.03.26
*@LastModifier : 박성호
*@LastVersion : 1.0
* 2010.03.26 박성호 
* 1.0 Creation
*  --------------------------------------------------------------------------------------
* History
* 2010.09.06 이지영 [CHM-201005721-01] [ESM-BKG] VVD별 OTS 미수금 수신
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
 * @author 박성호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgOutstandingVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgOutstandingVO> models = new ArrayList<BkgOutstandingVO>();
	
	/* Column Info */
	private String xchRtTpCd = null;
	/* Column Info */
	private String n3rdCltRqstDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String n2ndCltRqstDt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String otsStlFlg = null;
	/* Column Info */
	private String otsBkgNo = null;
	/* Column Info */
	private String otsBndTpCd = null;
	/* Column Info */
	private String otsGrpTpCd = null;
	/* Column Info */
	private String ofcCurrCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String otsOccrTpCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String otsDueDt = null;
	/* Column Info */
	private String otsTjSeq = null;
	/* Column Info */
	private String cltBlNo = null;
	/* Column Info */
	private String crFlg = null;
	/* Column Info */
	private String bilToCustCd = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String lstCltOfcCd = null;
	/* Column Info */
	private String lstUpdChkDt = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String n1stCltRqstDt = null;
	/* Column Info */
	private String xtraRmk2 = null;
	/* Column Info */
	private String xtraRmk1 = null;
	/* Column Info */
	private String xtraRmk3 = null;
	/* Column Info */
	private String cltRmk = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgOutstandingVO() {}

	public BkgOutstandingVO(String ibflag, String pagerows, String ofcCd, String cltBlNo, String invNo, String ofcCurrCd, String bilToCustCd, String crFlg, String otsBndTpCd, String otsBkgNo, String otsDueDt, String otsStlFlg, String xchRtTpCd, String cltRmk, String otsGrpTpCd, String otsOccrTpCd, String n1stCltRqstDt, String n2ndCltRqstDt, String n3rdCltRqstDt, String lstCltOfcCd, String lstUpdChkDt, String xtraRmk1, String xtraRmk2, String xtraRmk3, String creDt, String creUsrId, String updDt, String updUsrId, String otsTjSeq) {
		this.xchRtTpCd = xchRtTpCd;
		this.n3rdCltRqstDt = n3rdCltRqstDt;
		this.creDt = creDt;
		this.n2ndCltRqstDt = n2ndCltRqstDt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.otsStlFlg = otsStlFlg;
		this.otsBkgNo = otsBkgNo;
		this.otsBndTpCd = otsBndTpCd;
		this.otsGrpTpCd = otsGrpTpCd;
		this.ofcCurrCd = ofcCurrCd;
		this.updUsrId = updUsrId;
		this.otsOccrTpCd = otsOccrTpCd;
		this.updDt = updDt;
		this.otsDueDt = otsDueDt;
		this.otsTjSeq = otsTjSeq;
		this.cltBlNo = cltBlNo;
		this.crFlg = crFlg;
		this.bilToCustCd = bilToCustCd;
		this.invNo = invNo;
		this.lstCltOfcCd = lstCltOfcCd;
		this.lstUpdChkDt = lstUpdChkDt;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.n1stCltRqstDt = n1stCltRqstDt;
		this.xtraRmk2 = xtraRmk2;
		this.xtraRmk1 = xtraRmk1;
		this.xtraRmk3 = xtraRmk3;
		this.cltRmk = cltRmk;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("xch_rt_tp_cd", getXchRtTpCd());
		this.hashColumns.put("n3rd_clt_rqst_dt", getN3rdCltRqstDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("n2nd_clt_rqst_dt", getN2ndCltRqstDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ots_stl_flg", getOtsStlFlg());
		this.hashColumns.put("ots_bkg_no", getOtsBkgNo());
		this.hashColumns.put("ots_bnd_tp_cd", getOtsBndTpCd());
		this.hashColumns.put("ots_grp_tp_cd", getOtsGrpTpCd());
		this.hashColumns.put("ofc_curr_cd", getOfcCurrCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("ots_occr_tp_cd", getOtsOccrTpCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ots_due_dt", getOtsDueDt());
		this.hashColumns.put("ots_tj_seq", getOtsTjSeq());
		this.hashColumns.put("clt_bl_no", getCltBlNo());
		this.hashColumns.put("cr_flg", getCrFlg());
		this.hashColumns.put("bil_to_cust_cd", getBilToCustCd());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("lst_clt_ofc_cd", getLstCltOfcCd());
		this.hashColumns.put("lst_upd_chk_dt", getLstUpdChkDt());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("n1st_clt_rqst_dt", getN1stCltRqstDt());
		this.hashColumns.put("xtra_rmk2", getXtraRmk2());
		this.hashColumns.put("xtra_rmk1", getXtraRmk1());
		this.hashColumns.put("xtra_rmk3", getXtraRmk3());
		this.hashColumns.put("clt_rmk", getCltRmk());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("xch_rt_tp_cd", "xchRtTpCd");
		this.hashFields.put("n3rd_clt_rqst_dt", "n3rdCltRqstDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("n2nd_clt_rqst_dt", "n2ndCltRqstDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ots_stl_flg", "otsStlFlg");
		this.hashFields.put("ots_bkg_no", "otsBkgNo");
		this.hashFields.put("ots_bnd_tp_cd", "otsBndTpCd");
		this.hashFields.put("ots_grp_tp_cd", "otsGrpTpCd");
		this.hashFields.put("ofc_curr_cd", "ofcCurrCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("ots_occr_tp_cd", "otsOccrTpCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ots_due_dt", "otsDueDt");
		this.hashFields.put("ots_tj_seq", "otsTjSeq");
		this.hashFields.put("clt_bl_no", "cltBlNo");
		this.hashFields.put("cr_flg", "crFlg");
		this.hashFields.put("bil_to_cust_cd", "bilToCustCd");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("lst_clt_ofc_cd", "lstCltOfcCd");
		this.hashFields.put("lst_upd_chk_dt", "lstUpdChkDt");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("n1st_clt_rqst_dt", "n1stCltRqstDt");
		this.hashFields.put("xtra_rmk2", "xtraRmk2");
		this.hashFields.put("xtra_rmk1", "xtraRmk1");
		this.hashFields.put("xtra_rmk3", "xtraRmk3");
		this.hashFields.put("clt_rmk", "cltRmk");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return xchRtTpCd
	 */
	public String getXchRtTpCd() {
		return this.xchRtTpCd;
	}
	
	/**
	 * Column Info
	 * @return n3rdCltRqstDt
	 */
	public String getN3rdCltRqstDt() {
		return this.n3rdCltRqstDt;
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
	 * @return n2ndCltRqstDt
	 */
	public String getN2ndCltRqstDt() {
		return this.n2ndCltRqstDt;
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
	 * @return otsStlFlg
	 */
	public String getOtsStlFlg() {
		return this.otsStlFlg;
	}
	
	/**
	 * Column Info
	 * @return otsBkgNo
	 */
	public String getOtsBkgNo() {
		return this.otsBkgNo;
	}
	
	/**
	 * Column Info
	 * @return otsBndTpCd
	 */
	public String getOtsBndTpCd() {
		return this.otsBndTpCd;
	}
	
	/**
	 * Column Info
	 * @return otsGrpTpCd
	 */
	public String getOtsGrpTpCd() {
		return this.otsGrpTpCd;
	}
	
	/**
	 * Column Info
	 * @return ofcCurrCd
	 */
	public String getOfcCurrCd() {
		return this.ofcCurrCd;
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
	 * @return otsOccrTpCd
	 */
	public String getOtsOccrTpCd() {
		return this.otsOccrTpCd;
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
	 * @return otsDueDt
	 */
	public String getOtsDueDt() {
		return this.otsDueDt;
	}
	
	/**
	 * Column Info
	 * @return otsTjSeq
	 */
	public String getOtsTjSeq() {
		return this.otsTjSeq;
	}
	
	/**
	 * Column Info
	 * @return cltBlNo
	 */
	public String getCltBlNo() {
		return this.cltBlNo;
	}
	
	/**
	 * Column Info
	 * @return crFlg
	 */
	public String getCrFlg() {
		return this.crFlg;
	}
	
	/**
	 * Column Info
	 * @return bilToCustCd
	 */
	public String getBilToCustCd() {
		return this.bilToCustCd;
	}
	
	/**
	 * Column Info
	 * @return invNo
	 */
	public String getInvNo() {
		return this.invNo;
	}
	
	/**
	 * Column Info
	 * @return lstCltOfcCd
	 */
	public String getLstCltOfcCd() {
		return this.lstCltOfcCd;
	}
	
	/**
	 * Column Info
	 * @return lstUpdChkDt
	 */
	public String getLstUpdChkDt() {
		return this.lstUpdChkDt;
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
	 * Column Info
	 * @return n1stCltRqstDt
	 */
	public String getN1stCltRqstDt() {
		return this.n1stCltRqstDt;
	}
	
	/**
	 * Column Info
	 * @return xtraRmk2
	 */
	public String getXtraRmk2() {
		return this.xtraRmk2;
	}
	
	/**
	 * Column Info
	 * @return xtraRmk1
	 */
	public String getXtraRmk1() {
		return this.xtraRmk1;
	}
	
	/**
	 * Column Info
	 * @return xtraRmk3
	 */
	public String getXtraRmk3() {
		return this.xtraRmk3;
	}
	
	/**
	 * Column Info
	 * @return cltRmk
	 */
	public String getCltRmk() {
		return this.cltRmk;
	}
	

	/**
	 * Column Info
	 * @param xchRtTpCd
	 */
	public void setXchRtTpCd(String xchRtTpCd) {
		this.xchRtTpCd = xchRtTpCd;
	}
	
	/**
	 * Column Info
	 * @param n3rdCltRqstDt
	 */
	public void setN3rdCltRqstDt(String n3rdCltRqstDt) {
		this.n3rdCltRqstDt = n3rdCltRqstDt;
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
	 * @param n2ndCltRqstDt
	 */
	public void setN2ndCltRqstDt(String n2ndCltRqstDt) {
		this.n2ndCltRqstDt = n2ndCltRqstDt;
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
	 * @param otsStlFlg
	 */
	public void setOtsStlFlg(String otsStlFlg) {
		this.otsStlFlg = otsStlFlg;
	}
	
	/**
	 * Column Info
	 * @param otsBkgNo
	 */
	public void setOtsBkgNo(String otsBkgNo) {
		this.otsBkgNo = otsBkgNo;
	}
	
	/**
	 * Column Info
	 * @param otsBndTpCd
	 */
	public void setOtsBndTpCd(String otsBndTpCd) {
		this.otsBndTpCd = otsBndTpCd;
	}
	
	/**
	 * Column Info
	 * @param otsGrpTpCd
	 */
	public void setOtsGrpTpCd(String otsGrpTpCd) {
		this.otsGrpTpCd = otsGrpTpCd;
	}
	
	/**
	 * Column Info
	 * @param ofcCurrCd
	 */
	public void setOfcCurrCd(String ofcCurrCd) {
		this.ofcCurrCd = ofcCurrCd;
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
	 * @param otsOccrTpCd
	 */
	public void setOtsOccrTpCd(String otsOccrTpCd) {
		this.otsOccrTpCd = otsOccrTpCd;
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
	 * @param otsDueDt
	 */
	public void setOtsDueDt(String otsDueDt) {
		this.otsDueDt = otsDueDt;
	}
	
	/**
	 * Column Info
	 * @param otsTjSeq
	 */
	public void setOtsTjSeq(String otsTjSeq) {
		this.otsTjSeq = otsTjSeq;
	}
	
	/**
	 * Column Info
	 * @param cltBlNo
	 */
	public void setCltBlNo(String cltBlNo) {
		this.cltBlNo = cltBlNo;
	}
	
	/**
	 * Column Info
	 * @param crFlg
	 */
	public void setCrFlg(String crFlg) {
		this.crFlg = crFlg;
	}
	
	/**
	 * Column Info
	 * @param bilToCustCd
	 */
	public void setBilToCustCd(String bilToCustCd) {
		this.bilToCustCd = bilToCustCd;
	}
	
	/**
	 * Column Info
	 * @param invNo
	 */
	public void setInvNo(String invNo) {
		this.invNo = invNo;
	}
	
	/**
	 * Column Info
	 * @param lstCltOfcCd
	 */
	public void setLstCltOfcCd(String lstCltOfcCd) {
		this.lstCltOfcCd = lstCltOfcCd;
	}
	
	/**
	 * Column Info
	 * @param lstUpdChkDt
	 */
	public void setLstUpdChkDt(String lstUpdChkDt) {
		this.lstUpdChkDt = lstUpdChkDt;
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
	 * Column Info
	 * @param n1stCltRqstDt
	 */
	public void setN1stCltRqstDt(String n1stCltRqstDt) {
		this.n1stCltRqstDt = n1stCltRqstDt;
	}
	
	/**
	 * Column Info
	 * @param xtraRmk2
	 */
	public void setXtraRmk2(String xtraRmk2) {
		this.xtraRmk2 = xtraRmk2;
	}
	
	/**
	 * Column Info
	 * @param xtraRmk1
	 */
	public void setXtraRmk1(String xtraRmk1) {
		this.xtraRmk1 = xtraRmk1;
	}
	
	/**
	 * Column Info
	 * @param xtraRmk3
	 */
	public void setXtraRmk3(String xtraRmk3) {
		this.xtraRmk3 = xtraRmk3;
	}
	
	/**
	 * Column Info
	 * @param cltRmk
	 */
	public void setCltRmk(String cltRmk) {
		this.cltRmk = cltRmk;
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
		setXchRtTpCd(JSPUtil.getParameter(request, prefix + "xch_rt_tp_cd", ""));
		setN3rdCltRqstDt(JSPUtil.getParameter(request, prefix + "n3rd_clt_rqst_dt", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setN2ndCltRqstDt(JSPUtil.getParameter(request, prefix + "n2nd_clt_rqst_dt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setOtsStlFlg(JSPUtil.getParameter(request, prefix + "ots_stl_flg", ""));
		setOtsBkgNo(JSPUtil.getParameter(request, prefix + "ots_bkg_no", ""));
		setOtsBndTpCd(JSPUtil.getParameter(request, prefix + "ots_bnd_tp_cd", ""));
		setOtsGrpTpCd(JSPUtil.getParameter(request, prefix + "ots_grp_tp_cd", ""));
		setOfcCurrCd(JSPUtil.getParameter(request, prefix + "ofc_curr_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setOtsOccrTpCd(JSPUtil.getParameter(request, prefix + "ots_occr_tp_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setOtsDueDt(JSPUtil.getParameter(request, prefix + "ots_due_dt", ""));
		setOtsTjSeq(JSPUtil.getParameter(request, prefix + "ots_tj_seq", ""));
		setCltBlNo(JSPUtil.getParameter(request, prefix + "clt_bl_no", ""));
		setCrFlg(JSPUtil.getParameter(request, prefix + "cr_flg", ""));
		setBilToCustCd(JSPUtil.getParameter(request, prefix + "bil_to_cust_cd", ""));
		setInvNo(JSPUtil.getParameter(request, prefix + "inv_no", ""));
		setLstCltOfcCd(JSPUtil.getParameter(request, prefix + "lst_clt_ofc_cd", ""));
		setLstUpdChkDt(JSPUtil.getParameter(request, prefix + "lst_upd_chk_dt", ""));
		setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setN1stCltRqstDt(JSPUtil.getParameter(request, prefix + "n1st_clt_rqst_dt", ""));
		setXtraRmk2(JSPUtil.getParameter(request, prefix + "xtra_rmk2", ""));
		setXtraRmk1(JSPUtil.getParameter(request, prefix + "xtra_rmk1", ""));
		setXtraRmk3(JSPUtil.getParameter(request, prefix + "xtra_rmk3", ""));
		setCltRmk(JSPUtil.getParameter(request, prefix + "clt_rmk", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgOutstandingVO[]
	 */
	public BkgOutstandingVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgOutstandingVO[]
	 */
	public BkgOutstandingVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgOutstandingVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] xchRtTpCd = (JSPUtil.getParameter(request, prefix	+ "xch_rt_tp_cd", length));
			String[] n3rdCltRqstDt = (JSPUtil.getParameter(request, prefix	+ "n3rd_clt_rqst_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] n2ndCltRqstDt = (JSPUtil.getParameter(request, prefix	+ "n2nd_clt_rqst_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] otsStlFlg = (JSPUtil.getParameter(request, prefix	+ "ots_stl_flg", length));
			String[] otsBkgNo = (JSPUtil.getParameter(request, prefix	+ "ots_bkg_no", length));
			String[] otsBndTpCd = (JSPUtil.getParameter(request, prefix	+ "ots_bnd_tp_cd", length));
			String[] otsGrpTpCd = (JSPUtil.getParameter(request, prefix	+ "ots_grp_tp_cd", length));
			String[] ofcCurrCd = (JSPUtil.getParameter(request, prefix	+ "ofc_curr_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] otsOccrTpCd = (JSPUtil.getParameter(request, prefix	+ "ots_occr_tp_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] otsDueDt = (JSPUtil.getParameter(request, prefix	+ "ots_due_dt", length));
			String[] otsTjSeq = (JSPUtil.getParameter(request, prefix	+ "ots_tj_seq", length));
			String[] cltBlNo = (JSPUtil.getParameter(request, prefix	+ "clt_bl_no", length));
			String[] crFlg = (JSPUtil.getParameter(request, prefix	+ "cr_flg", length));
			String[] bilToCustCd = (JSPUtil.getParameter(request, prefix	+ "bil_to_cust_cd", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] lstCltOfcCd = (JSPUtil.getParameter(request, prefix	+ "lst_clt_ofc_cd", length));
			String[] lstUpdChkDt = (JSPUtil.getParameter(request, prefix	+ "lst_upd_chk_dt", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] n1stCltRqstDt = (JSPUtil.getParameter(request, prefix	+ "n1st_clt_rqst_dt", length));
			String[] xtraRmk2 = (JSPUtil.getParameter(request, prefix	+ "xtra_rmk2", length));
			String[] xtraRmk1 = (JSPUtil.getParameter(request, prefix	+ "xtra_rmk1", length));
			String[] xtraRmk3 = (JSPUtil.getParameter(request, prefix	+ "xtra_rmk3", length));
			String[] cltRmk = (JSPUtil.getParameter(request, prefix	+ "clt_rmk", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgOutstandingVO();
				if (xchRtTpCd[i] != null)
					model.setXchRtTpCd(xchRtTpCd[i]);
				if (n3rdCltRqstDt[i] != null)
					model.setN3rdCltRqstDt(n3rdCltRqstDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (n2ndCltRqstDt[i] != null)
					model.setN2ndCltRqstDt(n2ndCltRqstDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (otsStlFlg[i] != null)
					model.setOtsStlFlg(otsStlFlg[i]);
				if (otsBkgNo[i] != null)
					model.setOtsBkgNo(otsBkgNo[i]);
				if (otsBndTpCd[i] != null)
					model.setOtsBndTpCd(otsBndTpCd[i]);
				if (otsGrpTpCd[i] != null)
					model.setOtsGrpTpCd(otsGrpTpCd[i]);
				if (ofcCurrCd[i] != null)
					model.setOfcCurrCd(ofcCurrCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (otsOccrTpCd[i] != null)
					model.setOtsOccrTpCd(otsOccrTpCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (otsDueDt[i] != null)
					model.setOtsDueDt(otsDueDt[i]);
				if (otsTjSeq[i] != null)
					model.setOtsTjSeq(otsTjSeq[i]);
				if (cltBlNo[i] != null)
					model.setCltBlNo(cltBlNo[i]);
				if (crFlg[i] != null)
					model.setCrFlg(crFlg[i]);
				if (bilToCustCd[i] != null)
					model.setBilToCustCd(bilToCustCd[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (lstCltOfcCd[i] != null)
					model.setLstCltOfcCd(lstCltOfcCd[i]);
				if (lstUpdChkDt[i] != null)
					model.setLstUpdChkDt(lstUpdChkDt[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (n1stCltRqstDt[i] != null)
					model.setN1stCltRqstDt(n1stCltRqstDt[i]);
				if (xtraRmk2[i] != null)
					model.setXtraRmk2(xtraRmk2[i]);
				if (xtraRmk1[i] != null)
					model.setXtraRmk1(xtraRmk1[i]);
				if (xtraRmk3[i] != null)
					model.setXtraRmk3(xtraRmk3[i]);
				if (cltRmk[i] != null)
					model.setCltRmk(cltRmk[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgOutstandingVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgOutstandingVO[]
	 */
	public BkgOutstandingVO[] getBkgOutstandingVOs(){
		BkgOutstandingVO[] vos = (BkgOutstandingVO[])models.toArray(new BkgOutstandingVO[models.size()]);
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
		this.xchRtTpCd = this.xchRtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdCltRqstDt = this.n3rdCltRqstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndCltRqstDt = this.n2ndCltRqstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otsStlFlg = this.otsStlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otsBkgNo = this.otsBkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otsBndTpCd = this.otsBndTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otsGrpTpCd = this.otsGrpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCurrCd = this.ofcCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otsOccrTpCd = this.otsOccrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otsDueDt = this.otsDueDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otsTjSeq = this.otsTjSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cltBlNo = this.cltBlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crFlg = this.crFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilToCustCd = this.bilToCustCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstCltOfcCd = this.lstCltOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstUpdChkDt = this.lstUpdChkDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stCltRqstDt = this.n1stCltRqstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xtraRmk2 = this.xtraRmk2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xtraRmk1 = this.xtraRmk1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xtraRmk3 = this.xtraRmk3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cltRmk = this.cltRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
