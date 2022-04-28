/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : BkgCstmsAdvIbdVO.java
*@FileTitle : BkgCstmsAdvIbdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.03.15
*@LastModifier : 김민정
*@LastVersion : 1.0
* 2010.03.15 김민정 
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
 * @author 김민정
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCstmsAdvIbdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsAdvIbdVO> models = new ArrayList<BkgCstmsAdvIbdVO>();
	
	/* Column Info */
	private String ibdTrspXptAcptDt = null;
	/* Column Info */
	private String ibdTrspArrDt = null;
	/* Column Info */
	private String ibdTrspArrAcptDt = null;
	/* Column Info */
	private String cstmsClrCngFlg = null;
	/* Column Info */
	private String ibdTrspArrSndFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String cstmsClrRsltCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ibdTrspAcptDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cstmsClrTpCd = null;
	/* Column Info */
	private String pttSndUsrId = null;
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String ibdTrspIssDt = null;
	/* Column Info */
	private String freeTrdZnFlg = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String ibdTrspNo = null;
	/* Column Info */
	private String ibdTrspTpCd = null;
	/* Column Info */
	private String ibdTrspXptDt = null;
	/* Column Info */
	private String ibdTrspXptSndFlg = null;
	/* Column Info */
	private String pttSndDt = null;
	/* Column Info */
	private String pttSndOfcCd = null;
	/* Column Info */
	private String loclClrIpiMvmtFlg = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsAdvIbdVO() {}

	public BkgCstmsAdvIbdVO(String ibflag, String pagerows, String cntCd, String blNo, String cstmsClrTpCd, String pttSndOfcCd, String pttSndUsrId, String pttSndDt, String loclClrIpiMvmtFlg, String ibdTrspTpCd, String ibdTrspNo, String ibdTrspIssDt, String ibdTrspAcptDt, String ibdTrspArrDt, String ibdTrspArrSndFlg, String ibdTrspArrAcptDt, String ibdTrspXptDt, String ibdTrspXptSndFlg, String ibdTrspXptAcptDt, String freeTrdZnFlg, String cstmsClrRsltCd, String ofcCd, String cstmsClrCngFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.ibdTrspXptAcptDt = ibdTrspXptAcptDt;
		this.ibdTrspArrDt = ibdTrspArrDt;
		this.ibdTrspArrAcptDt = ibdTrspArrAcptDt;
		this.cstmsClrCngFlg = cstmsClrCngFlg;
		this.ibdTrspArrSndFlg = ibdTrspArrSndFlg;
		this.creDt = creDt;
		this.blNo = blNo;
		this.cstmsClrRsltCd = cstmsClrRsltCd;
		this.pagerows = pagerows;
		this.ibdTrspAcptDt = ibdTrspAcptDt;
		this.ibflag = ibflag;
		this.cstmsClrTpCd = cstmsClrTpCd;
		this.pttSndUsrId = pttSndUsrId;
		this.cntCd = cntCd;
		this.updUsrId = updUsrId;
		this.ibdTrspIssDt = ibdTrspIssDt;
		this.freeTrdZnFlg = freeTrdZnFlg;
		this.updDt = updDt;
		this.ibdTrspNo = ibdTrspNo;
		this.ibdTrspTpCd = ibdTrspTpCd;
		this.ibdTrspXptDt = ibdTrspXptDt;
		this.ibdTrspXptSndFlg = ibdTrspXptSndFlg;
		this.pttSndDt = pttSndDt;
		this.pttSndOfcCd = pttSndOfcCd;
		this.loclClrIpiMvmtFlg = loclClrIpiMvmtFlg;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibd_trsp_xpt_acpt_dt", getIbdTrspXptAcptDt());
		this.hashColumns.put("ibd_trsp_arr_dt", getIbdTrspArrDt());
		this.hashColumns.put("ibd_trsp_arr_acpt_dt", getIbdTrspArrAcptDt());
		this.hashColumns.put("cstms_clr_cng_flg", getCstmsClrCngFlg());
		this.hashColumns.put("ibd_trsp_arr_snd_flg", getIbdTrspArrSndFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("cstms_clr_rslt_cd", getCstmsClrRsltCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibd_trsp_acpt_dt", getIbdTrspAcptDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cstms_clr_tp_cd", getCstmsClrTpCd());
		this.hashColumns.put("ptt_snd_usr_id", getPttSndUsrId());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("ibd_trsp_iss_dt", getIbdTrspIssDt());
		this.hashColumns.put("free_trd_zn_flg", getFreeTrdZnFlg());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ibd_trsp_no", getIbdTrspNo());
		this.hashColumns.put("ibd_trsp_tp_cd", getIbdTrspTpCd());
		this.hashColumns.put("ibd_trsp_xpt_dt", getIbdTrspXptDt());
		this.hashColumns.put("ibd_trsp_xpt_snd_flg", getIbdTrspXptSndFlg());
		this.hashColumns.put("ptt_snd_dt", getPttSndDt());
		this.hashColumns.put("ptt_snd_ofc_cd", getPttSndOfcCd());
		this.hashColumns.put("locl_clr_ipi_mvmt_flg", getLoclClrIpiMvmtFlg());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibd_trsp_xpt_acpt_dt", "ibdTrspXptAcptDt");
		this.hashFields.put("ibd_trsp_arr_dt", "ibdTrspArrDt");
		this.hashFields.put("ibd_trsp_arr_acpt_dt", "ibdTrspArrAcptDt");
		this.hashFields.put("cstms_clr_cng_flg", "cstmsClrCngFlg");
		this.hashFields.put("ibd_trsp_arr_snd_flg", "ibdTrspArrSndFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("cstms_clr_rslt_cd", "cstmsClrRsltCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibd_trsp_acpt_dt", "ibdTrspAcptDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cstms_clr_tp_cd", "cstmsClrTpCd");
		this.hashFields.put("ptt_snd_usr_id", "pttSndUsrId");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("ibd_trsp_iss_dt", "ibdTrspIssDt");
		this.hashFields.put("free_trd_zn_flg", "freeTrdZnFlg");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ibd_trsp_no", "ibdTrspNo");
		this.hashFields.put("ibd_trsp_tp_cd", "ibdTrspTpCd");
		this.hashFields.put("ibd_trsp_xpt_dt", "ibdTrspXptDt");
		this.hashFields.put("ibd_trsp_xpt_snd_flg", "ibdTrspXptSndFlg");
		this.hashFields.put("ptt_snd_dt", "pttSndDt");
		this.hashFields.put("ptt_snd_ofc_cd", "pttSndOfcCd");
		this.hashFields.put("locl_clr_ipi_mvmt_flg", "loclClrIpiMvmtFlg");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return ibdTrspXptAcptDt
	 */
	public String getIbdTrspXptAcptDt() {
		return this.ibdTrspXptAcptDt;
	}
	
	/**
	 * Column Info
	 * @return ibdTrspArrDt
	 */
	public String getIbdTrspArrDt() {
		return this.ibdTrspArrDt;
	}
	
	/**
	 * Column Info
	 * @return ibdTrspArrAcptDt
	 */
	public String getIbdTrspArrAcptDt() {
		return this.ibdTrspArrAcptDt;
	}
	
	/**
	 * Column Info
	 * @return cstmsClrCngFlg
	 */
	public String getCstmsClrCngFlg() {
		return this.cstmsClrCngFlg;
	}
	
	/**
	 * Column Info
	 * @return ibdTrspArrSndFlg
	 */
	public String getIbdTrspArrSndFlg() {
		return this.ibdTrspArrSndFlg;
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
	 * @return blNo
	 */
	public String getBlNo() {
		return this.blNo;
	}
	
	/**
	 * Column Info
	 * @return cstmsClrRsltCd
	 */
	public String getCstmsClrRsltCd() {
		return this.cstmsClrRsltCd;
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
	 * @return ibdTrspAcptDt
	 */
	public String getIbdTrspAcptDt() {
		return this.ibdTrspAcptDt;
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
	 * @return cstmsClrTpCd
	 */
	public String getCstmsClrTpCd() {
		return this.cstmsClrTpCd;
	}
	
	/**
	 * Column Info
	 * @return pttSndUsrId
	 */
	public String getPttSndUsrId() {
		return this.pttSndUsrId;
	}
	
	/**
	 * Column Info
	 * @return cntCd
	 */
	public String getCntCd() {
		return this.cntCd;
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
	 * @return ibdTrspIssDt
	 */
	public String getIbdTrspIssDt() {
		return this.ibdTrspIssDt;
	}
	
	/**
	 * Column Info
	 * @return freeTrdZnFlg
	 */
	public String getFreeTrdZnFlg() {
		return this.freeTrdZnFlg;
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
	 * @return ibdTrspNo
	 */
	public String getIbdTrspNo() {
		return this.ibdTrspNo;
	}
	
	/**
	 * Column Info
	 * @return ibdTrspTpCd
	 */
	public String getIbdTrspTpCd() {
		return this.ibdTrspTpCd;
	}
	
	/**
	 * Column Info
	 * @return ibdTrspXptDt
	 */
	public String getIbdTrspXptDt() {
		return this.ibdTrspXptDt;
	}
	
	/**
	 * Column Info
	 * @return ibdTrspXptSndFlg
	 */
	public String getIbdTrspXptSndFlg() {
		return this.ibdTrspXptSndFlg;
	}
	
	/**
	 * Column Info
	 * @return pttSndDt
	 */
	public String getPttSndDt() {
		return this.pttSndDt;
	}
	
	/**
	 * Column Info
	 * @return pttSndOfcCd
	 */
	public String getPttSndOfcCd() {
		return this.pttSndOfcCd;
	}
	
	/**
	 * Column Info
	 * @return loclClrIpiMvmtFlg
	 */
	public String getLoclClrIpiMvmtFlg() {
		return this.loclClrIpiMvmtFlg;
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
	 * @param ibdTrspXptAcptDt
	 */
	public void setIbdTrspXptAcptDt(String ibdTrspXptAcptDt) {
		this.ibdTrspXptAcptDt = ibdTrspXptAcptDt;
	}
	
	/**
	 * Column Info
	 * @param ibdTrspArrDt
	 */
	public void setIbdTrspArrDt(String ibdTrspArrDt) {
		this.ibdTrspArrDt = ibdTrspArrDt;
	}
	
	/**
	 * Column Info
	 * @param ibdTrspArrAcptDt
	 */
	public void setIbdTrspArrAcptDt(String ibdTrspArrAcptDt) {
		this.ibdTrspArrAcptDt = ibdTrspArrAcptDt;
	}
	
	/**
	 * Column Info
	 * @param cstmsClrCngFlg
	 */
	public void setCstmsClrCngFlg(String cstmsClrCngFlg) {
		this.cstmsClrCngFlg = cstmsClrCngFlg;
	}
	
	/**
	 * Column Info
	 * @param ibdTrspArrSndFlg
	 */
	public void setIbdTrspArrSndFlg(String ibdTrspArrSndFlg) {
		this.ibdTrspArrSndFlg = ibdTrspArrSndFlg;
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
	 * @param blNo
	 */
	public void setBlNo(String blNo) {
		this.blNo = blNo;
	}
	
	/**
	 * Column Info
	 * @param cstmsClrRsltCd
	 */
	public void setCstmsClrRsltCd(String cstmsClrRsltCd) {
		this.cstmsClrRsltCd = cstmsClrRsltCd;
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
	 * @param ibdTrspAcptDt
	 */
	public void setIbdTrspAcptDt(String ibdTrspAcptDt) {
		this.ibdTrspAcptDt = ibdTrspAcptDt;
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
	 * @param cstmsClrTpCd
	 */
	public void setCstmsClrTpCd(String cstmsClrTpCd) {
		this.cstmsClrTpCd = cstmsClrTpCd;
	}
	
	/**
	 * Column Info
	 * @param pttSndUsrId
	 */
	public void setPttSndUsrId(String pttSndUsrId) {
		this.pttSndUsrId = pttSndUsrId;
	}
	
	/**
	 * Column Info
	 * @param cntCd
	 */
	public void setCntCd(String cntCd) {
		this.cntCd = cntCd;
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
	 * @param ibdTrspIssDt
	 */
	public void setIbdTrspIssDt(String ibdTrspIssDt) {
		this.ibdTrspIssDt = ibdTrspIssDt;
	}
	
	/**
	 * Column Info
	 * @param freeTrdZnFlg
	 */
	public void setFreeTrdZnFlg(String freeTrdZnFlg) {
		this.freeTrdZnFlg = freeTrdZnFlg;
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
	 * @param ibdTrspNo
	 */
	public void setIbdTrspNo(String ibdTrspNo) {
		this.ibdTrspNo = ibdTrspNo;
	}
	
	/**
	 * Column Info
	 * @param ibdTrspTpCd
	 */
	public void setIbdTrspTpCd(String ibdTrspTpCd) {
		this.ibdTrspTpCd = ibdTrspTpCd;
	}
	
	/**
	 * Column Info
	 * @param ibdTrspXptDt
	 */
	public void setIbdTrspXptDt(String ibdTrspXptDt) {
		this.ibdTrspXptDt = ibdTrspXptDt;
	}
	
	/**
	 * Column Info
	 * @param ibdTrspXptSndFlg
	 */
	public void setIbdTrspXptSndFlg(String ibdTrspXptSndFlg) {
		this.ibdTrspXptSndFlg = ibdTrspXptSndFlg;
	}
	
	/**
	 * Column Info
	 * @param pttSndDt
	 */
	public void setPttSndDt(String pttSndDt) {
		this.pttSndDt = pttSndDt;
	}
	
	/**
	 * Column Info
	 * @param pttSndOfcCd
	 */
	public void setPttSndOfcCd(String pttSndOfcCd) {
		this.pttSndOfcCd = pttSndOfcCd;
	}
	
	/**
	 * Column Info
	 * @param loclClrIpiMvmtFlg
	 */
	public void setLoclClrIpiMvmtFlg(String loclClrIpiMvmtFlg) {
		this.loclClrIpiMvmtFlg = loclClrIpiMvmtFlg;
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
		setIbdTrspXptAcptDt(JSPUtil.getParameter(request, prefix + "ibd_trsp_xpt_acpt_dt", ""));
		setIbdTrspArrDt(JSPUtil.getParameter(request, prefix + "ibd_trsp_arr_dt", ""));
		setIbdTrspArrAcptDt(JSPUtil.getParameter(request, prefix + "ibd_trsp_arr_acpt_dt", ""));
		setCstmsClrCngFlg(JSPUtil.getParameter(request, prefix + "cstms_clr_cng_flg", ""));
		setIbdTrspArrSndFlg(JSPUtil.getParameter(request, prefix + "ibd_trsp_arr_snd_flg", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setBlNo(JSPUtil.getParameter(request, prefix + "bl_no", ""));
		setCstmsClrRsltCd(JSPUtil.getParameter(request, prefix + "cstms_clr_rslt_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setIbdTrspAcptDt(JSPUtil.getParameter(request, prefix + "ibd_trsp_acpt_dt", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCstmsClrTpCd(JSPUtil.getParameter(request, prefix + "cstms_clr_tp_cd", ""));
		setPttSndUsrId(JSPUtil.getParameter(request, prefix + "ptt_snd_usr_id", ""));
		setCntCd(JSPUtil.getParameter(request, prefix + "cnt_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setIbdTrspIssDt(JSPUtil.getParameter(request, prefix + "ibd_trsp_iss_dt", ""));
		setFreeTrdZnFlg(JSPUtil.getParameter(request, prefix + "free_trd_zn_flg", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setIbdTrspNo(JSPUtil.getParameter(request, prefix + "ibd_trsp_no", ""));
		setIbdTrspTpCd(JSPUtil.getParameter(request, prefix + "ibd_trsp_tp_cd", ""));
		setIbdTrspXptDt(JSPUtil.getParameter(request, prefix + "ibd_trsp_xpt_dt", ""));
		setIbdTrspXptSndFlg(JSPUtil.getParameter(request, prefix + "ibd_trsp_xpt_snd_flg", ""));
		setPttSndDt(JSPUtil.getParameter(request, prefix + "ptt_snd_dt", ""));
		setPttSndOfcCd(JSPUtil.getParameter(request, prefix + "ptt_snd_ofc_cd", ""));
		setLoclClrIpiMvmtFlg(JSPUtil.getParameter(request, prefix + "locl_clr_ipi_mvmt_flg", ""));
		setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsAdvIbdVO[]
	 */
	public BkgCstmsAdvIbdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsAdvIbdVO[]
	 */
	public BkgCstmsAdvIbdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsAdvIbdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibdTrspXptAcptDt = (JSPUtil.getParameter(request, prefix	+ "ibd_trsp_xpt_acpt_dt", length));
			String[] ibdTrspArrDt = (JSPUtil.getParameter(request, prefix	+ "ibd_trsp_arr_dt", length));
			String[] ibdTrspArrAcptDt = (JSPUtil.getParameter(request, prefix	+ "ibd_trsp_arr_acpt_dt", length));
			String[] cstmsClrCngFlg = (JSPUtil.getParameter(request, prefix	+ "cstms_clr_cng_flg", length));
			String[] ibdTrspArrSndFlg = (JSPUtil.getParameter(request, prefix	+ "ibd_trsp_arr_snd_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] cstmsClrRsltCd = (JSPUtil.getParameter(request, prefix	+ "cstms_clr_rslt_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibdTrspAcptDt = (JSPUtil.getParameter(request, prefix	+ "ibd_trsp_acpt_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cstmsClrTpCd = (JSPUtil.getParameter(request, prefix	+ "cstms_clr_tp_cd", length));
			String[] pttSndUsrId = (JSPUtil.getParameter(request, prefix	+ "ptt_snd_usr_id", length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] ibdTrspIssDt = (JSPUtil.getParameter(request, prefix	+ "ibd_trsp_iss_dt", length));
			String[] freeTrdZnFlg = (JSPUtil.getParameter(request, prefix	+ "free_trd_zn_flg", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] ibdTrspNo = (JSPUtil.getParameter(request, prefix	+ "ibd_trsp_no", length));
			String[] ibdTrspTpCd = (JSPUtil.getParameter(request, prefix	+ "ibd_trsp_tp_cd", length));
			String[] ibdTrspXptDt = (JSPUtil.getParameter(request, prefix	+ "ibd_trsp_xpt_dt", length));
			String[] ibdTrspXptSndFlg = (JSPUtil.getParameter(request, prefix	+ "ibd_trsp_xpt_snd_flg", length));
			String[] pttSndDt = (JSPUtil.getParameter(request, prefix	+ "ptt_snd_dt", length));
			String[] pttSndOfcCd = (JSPUtil.getParameter(request, prefix	+ "ptt_snd_ofc_cd", length));
			String[] loclClrIpiMvmtFlg = (JSPUtil.getParameter(request, prefix	+ "locl_clr_ipi_mvmt_flg", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsAdvIbdVO();
				if (ibdTrspXptAcptDt[i] != null)
					model.setIbdTrspXptAcptDt(ibdTrspXptAcptDt[i]);
				if (ibdTrspArrDt[i] != null)
					model.setIbdTrspArrDt(ibdTrspArrDt[i]);
				if (ibdTrspArrAcptDt[i] != null)
					model.setIbdTrspArrAcptDt(ibdTrspArrAcptDt[i]);
				if (cstmsClrCngFlg[i] != null)
					model.setCstmsClrCngFlg(cstmsClrCngFlg[i]);
				if (ibdTrspArrSndFlg[i] != null)
					model.setIbdTrspArrSndFlg(ibdTrspArrSndFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (cstmsClrRsltCd[i] != null)
					model.setCstmsClrRsltCd(cstmsClrRsltCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibdTrspAcptDt[i] != null)
					model.setIbdTrspAcptDt(ibdTrspAcptDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cstmsClrTpCd[i] != null)
					model.setCstmsClrTpCd(cstmsClrTpCd[i]);
				if (pttSndUsrId[i] != null)
					model.setPttSndUsrId(pttSndUsrId[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (ibdTrspIssDt[i] != null)
					model.setIbdTrspIssDt(ibdTrspIssDt[i]);
				if (freeTrdZnFlg[i] != null)
					model.setFreeTrdZnFlg(freeTrdZnFlg[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (ibdTrspNo[i] != null)
					model.setIbdTrspNo(ibdTrspNo[i]);
				if (ibdTrspTpCd[i] != null)
					model.setIbdTrspTpCd(ibdTrspTpCd[i]);
				if (ibdTrspXptDt[i] != null)
					model.setIbdTrspXptDt(ibdTrspXptDt[i]);
				if (ibdTrspXptSndFlg[i] != null)
					model.setIbdTrspXptSndFlg(ibdTrspXptSndFlg[i]);
				if (pttSndDt[i] != null)
					model.setPttSndDt(pttSndDt[i]);
				if (pttSndOfcCd[i] != null)
					model.setPttSndOfcCd(pttSndOfcCd[i]);
				if (loclClrIpiMvmtFlg[i] != null)
					model.setLoclClrIpiMvmtFlg(loclClrIpiMvmtFlg[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsAdvIbdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsAdvIbdVO[]
	 */
	public BkgCstmsAdvIbdVO[] getBkgCstmsAdvIbdVOs(){
		BkgCstmsAdvIbdVO[] vos = (BkgCstmsAdvIbdVO[])models.toArray(new BkgCstmsAdvIbdVO[models.size()]);
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
		this.ibdTrspXptAcptDt = this.ibdTrspXptAcptDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdTrspArrDt = this.ibdTrspArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdTrspArrAcptDt = this.ibdTrspArrAcptDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsClrCngFlg = this.cstmsClrCngFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdTrspArrSndFlg = this.ibdTrspArrSndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsClrRsltCd = this.cstmsClrRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdTrspAcptDt = this.ibdTrspAcptDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsClrTpCd = this.cstmsClrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pttSndUsrId = this.pttSndUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdTrspIssDt = this.ibdTrspIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.freeTrdZnFlg = this.freeTrdZnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdTrspNo = this.ibdTrspNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdTrspTpCd = this.ibdTrspTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdTrspXptDt = this.ibdTrspXptDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdTrspXptSndFlg = this.ibdTrspXptSndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pttSndDt = this.pttSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pttSndOfcCd = this.pttSndOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclClrIpiMvmtFlg = this.loclClrIpiMvmtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
