/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgKrWhfVolVO.java
*@FileTitle : BkgKrWhfVolVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.05
*@LastModifier : 정재엽
*@LastVersion : 1.0
* 2009.08.05 정재엽 
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
 * @author 정재엽
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgKrWhfVolVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgKrWhfVolVO> models = new ArrayList<BkgKrWhfVolVO>();
	
	/* Column Info */
	private String ediMsgSndId = null;
	/* Column Info */
	private String full40ftCntrQty = null;
	/* Column Info */
	private String payDt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String exptTonWgt = null;
	/* Column Info */
	private String whfBndCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String ediTrsmCd = null;
	/* Column Info */
	private String arrYr = null;
	/* Column Info */
	private String rtonWgt = null;
	/* Column Info */
	private String tmlCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String mfRefNo = null;
	/* Column Info */
	private String arrTmsNo = null;
	/* Column Info */
	private String portNm = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String rducAmt = null;
	/* Column Info */
	private String whfVolDcCd = null;
	/* Column Info */
	private String declDt = null;
	/* Column Info */
	private String full45ftCntrQty = null;
	/* Column Info */
	private String unldTpCd = null;
	/* Column Info */
	private String vslCallSgnCd = null;
	/* Column Info */
	private String cfmUsrId = null;
	/* Column Info */
	private String portCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String whfUsrNm = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String whfPayDt = null;
	/* Column Info */
	private String cfmDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String vslNm = null;
	/* Column Info */
	private String unldAgnCd = null;
	/* Column Info */
	private String ntcAmt = null;
	/* Column Info */
	private String cfmFlg = null;
	/* Column Info */
	private String whfNtcDt = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String sailDt = null;
	/* Column Info */
	private String commAmt = null;
	/* Column Info */
	private String whfRtAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String mty20ftCntrQty = null;
	/* Column Info */
	private String ioPortCd = null;
	/* Column Info */
	private String whfCustKndCd = null;
	/* Column Info */
	private String mty45ftCntrQty = null;
	/* Column Info */
	private String declAuthFlg = null;
	/* Column Info */
	private String full20ftCntrQty = null;
	/* Column Info */
	private String mty40ftCntrQty = null;
	/* Column Info */
	private String whfRt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgKrWhfVolVO() {}

	public BkgKrWhfVolVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String portCd, String whfBndCd, String vslCallSgnCd, String tmlCd, String arrTmsNo, String ioPortCd, String unldTpCd, String unldAgnCd, String whfRt, String declAuthFlg, String mfRefNo, String declDt, String full40ftCntrQty, String mty40ftCntrQty, String full20ftCntrQty, String mty20ftCntrQty, String full45ftCntrQty, String mty45ftCntrQty, String whfRtAmt, String ntcAmt, String commAmt, String whfUsrNm, String whfPayDt, String whfNtcDt, String whfVolDcCd, String rducAmt, String rtonWgt, String ediMsgSndId, String arrYr, String vslNm, String exptTonWgt, String payDt, String ediTrsmCd, String sailDt, String portNm, String whfCustKndCd, String cfmFlg, String cfmUsrId, String cfmDt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.ediMsgSndId = ediMsgSndId;
		this.full40ftCntrQty = full40ftCntrQty;
		this.payDt = payDt;
		this.vslCd = vslCd;
		this.exptTonWgt = exptTonWgt;
		this.whfBndCd = whfBndCd;
		this.creDt = creDt;
		this.ediTrsmCd = ediTrsmCd;
		this.arrYr = arrYr;
		this.rtonWgt = rtonWgt;
		this.tmlCd = tmlCd;
		this.pagerows = pagerows;
		this.mfRefNo = mfRefNo;
		this.arrTmsNo = arrTmsNo;
		this.portNm = portNm;
		this.ibflag = ibflag;
		this.rducAmt = rducAmt;
		this.whfVolDcCd = whfVolDcCd;
		this.declDt = declDt;
		this.full45ftCntrQty = full45ftCntrQty;
		this.unldTpCd = unldTpCd;
		this.vslCallSgnCd = vslCallSgnCd;
		this.cfmUsrId = cfmUsrId;
		this.portCd = portCd;
		this.updUsrId = updUsrId;
		this.whfUsrNm = whfUsrNm;
		this.updDt = updDt;
		this.whfPayDt = whfPayDt;
		this.cfmDt = cfmDt;
		this.skdVoyNo = skdVoyNo;
		this.vslNm = vslNm;
		this.unldAgnCd = unldAgnCd;
		this.ntcAmt = ntcAmt;
		this.cfmFlg = cfmFlg;
		this.whfNtcDt = whfNtcDt;
		this.skdDirCd = skdDirCd;
		this.sailDt = sailDt;
		this.commAmt = commAmt;
		this.whfRtAmt = whfRtAmt;
		this.creUsrId = creUsrId;
		this.mty20ftCntrQty = mty20ftCntrQty;
		this.ioPortCd = ioPortCd;
		this.whfCustKndCd = whfCustKndCd;
		this.mty45ftCntrQty = mty45ftCntrQty;
		this.declAuthFlg = declAuthFlg;
		this.full20ftCntrQty = full20ftCntrQty;
		this.mty40ftCntrQty = mty40ftCntrQty;
		this.whfRt = whfRt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("edi_msg_snd_id", getEdiMsgSndId());
		this.hashColumns.put("full_40ft_cntr_qty", getFull40ftCntrQty());
		this.hashColumns.put("pay_dt", getPayDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("expt_ton_wgt", getExptTonWgt());
		this.hashColumns.put("whf_bnd_cd", getWhfBndCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("edi_trsm_cd", getEdiTrsmCd());
		this.hashColumns.put("arr_yr", getArrYr());
		this.hashColumns.put("rton_wgt", getRtonWgt());
		this.hashColumns.put("tml_cd", getTmlCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("mf_ref_no", getMfRefNo());
		this.hashColumns.put("arr_tms_no", getArrTmsNo());
		this.hashColumns.put("port_nm", getPortNm());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rduc_amt", getRducAmt());
		this.hashColumns.put("whf_vol_dc_cd", getWhfVolDcCd());
		this.hashColumns.put("decl_dt", getDeclDt());
		this.hashColumns.put("full_45ft_cntr_qty", getFull45ftCntrQty());
		this.hashColumns.put("unld_tp_cd", getUnldTpCd());
		this.hashColumns.put("vsl_call_sgn_cd", getVslCallSgnCd());
		this.hashColumns.put("cfm_usr_id", getCfmUsrId());
		this.hashColumns.put("port_cd", getPortCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("whf_usr_nm", getWhfUsrNm());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("whf_pay_dt", getWhfPayDt());
		this.hashColumns.put("cfm_dt", getCfmDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("vsl_nm", getVslNm());
		this.hashColumns.put("unld_agn_cd", getUnldAgnCd());
		this.hashColumns.put("ntc_amt", getNtcAmt());
		this.hashColumns.put("cfm_flg", getCfmFlg());
		this.hashColumns.put("whf_ntc_dt", getWhfNtcDt());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("sail_dt", getSailDt());
		this.hashColumns.put("comm_amt", getCommAmt());
		this.hashColumns.put("whf_rt_amt", getWhfRtAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("mty_20ft_cntr_qty", getMty20ftCntrQty());
		this.hashColumns.put("io_port_cd", getIoPortCd());
		this.hashColumns.put("whf_cust_knd_cd", getWhfCustKndCd());
		this.hashColumns.put("mty_45ft_cntr_qty", getMty45ftCntrQty());
		this.hashColumns.put("decl_auth_flg", getDeclAuthFlg());
		this.hashColumns.put("full_20ft_cntr_qty", getFull20ftCntrQty());
		this.hashColumns.put("mty_40ft_cntr_qty", getMty40ftCntrQty());
		this.hashColumns.put("whf_rt", getWhfRt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("edi_msg_snd_id", "ediMsgSndId");
		this.hashFields.put("full_40ft_cntr_qty", "full40ftCntrQty");
		this.hashFields.put("pay_dt", "payDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("expt_ton_wgt", "exptTonWgt");
		this.hashFields.put("whf_bnd_cd", "whfBndCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("edi_trsm_cd", "ediTrsmCd");
		this.hashFields.put("arr_yr", "arrYr");
		this.hashFields.put("rton_wgt", "rtonWgt");
		this.hashFields.put("tml_cd", "tmlCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("mf_ref_no", "mfRefNo");
		this.hashFields.put("arr_tms_no", "arrTmsNo");
		this.hashFields.put("port_nm", "portNm");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rduc_amt", "rducAmt");
		this.hashFields.put("whf_vol_dc_cd", "whfVolDcCd");
		this.hashFields.put("decl_dt", "declDt");
		this.hashFields.put("full_45ft_cntr_qty", "full45ftCntrQty");
		this.hashFields.put("unld_tp_cd", "unldTpCd");
		this.hashFields.put("vsl_call_sgn_cd", "vslCallSgnCd");
		this.hashFields.put("cfm_usr_id", "cfmUsrId");
		this.hashFields.put("port_cd", "portCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("whf_usr_nm", "whfUsrNm");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("whf_pay_dt", "whfPayDt");
		this.hashFields.put("cfm_dt", "cfmDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("vsl_nm", "vslNm");
		this.hashFields.put("unld_agn_cd", "unldAgnCd");
		this.hashFields.put("ntc_amt", "ntcAmt");
		this.hashFields.put("cfm_flg", "cfmFlg");
		this.hashFields.put("whf_ntc_dt", "whfNtcDt");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("sail_dt", "sailDt");
		this.hashFields.put("comm_amt", "commAmt");
		this.hashFields.put("whf_rt_amt", "whfRtAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("mty_20ft_cntr_qty", "mty20ftCntrQty");
		this.hashFields.put("io_port_cd", "ioPortCd");
		this.hashFields.put("whf_cust_knd_cd", "whfCustKndCd");
		this.hashFields.put("mty_45ft_cntr_qty", "mty45ftCntrQty");
		this.hashFields.put("decl_auth_flg", "declAuthFlg");
		this.hashFields.put("full_20ft_cntr_qty", "full20ftCntrQty");
		this.hashFields.put("mty_40ft_cntr_qty", "mty40ftCntrQty");
		this.hashFields.put("whf_rt", "whfRt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return ediMsgSndId
	 */
	public String getEdiMsgSndId() {
		return this.ediMsgSndId;
	}
	
	/**
	 * Column Info
	 * @return full40ftCntrQty
	 */
	public String getFull40ftCntrQty() {
		return this.full40ftCntrQty;
	}
	
	/**
	 * Column Info
	 * @return payDt
	 */
	public String getPayDt() {
		return this.payDt;
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
	 * @return exptTonWgt
	 */
	public String getExptTonWgt() {
		return this.exptTonWgt;
	}
	
	/**
	 * Column Info
	 * @return whfBndCd
	 */
	public String getWhfBndCd() {
		return this.whfBndCd;
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
	 * @return ediTrsmCd
	 */
	public String getEdiTrsmCd() {
		return this.ediTrsmCd;
	}
	
	/**
	 * Column Info
	 * @return arrYr
	 */
	public String getArrYr() {
		return this.arrYr;
	}
	
	/**
	 * Column Info
	 * @return rtonWgt
	 */
	public String getRtonWgt() {
		return this.rtonWgt;
	}
	
	/**
	 * Column Info
	 * @return tmlCd
	 */
	public String getTmlCd() {
		return this.tmlCd;
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
	 * @return mfRefNo
	 */
	public String getMfRefNo() {
		return this.mfRefNo;
	}
	
	/**
	 * Column Info
	 * @return arrTmsNo
	 */
	public String getArrTmsNo() {
		return this.arrTmsNo;
	}
	
	/**
	 * Column Info
	 * @return portNm
	 */
	public String getPortNm() {
		return this.portNm;
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
	 * @return rducAmt
	 */
	public String getRducAmt() {
		return this.rducAmt;
	}
	
	/**
	 * Column Info
	 * @return whfVolDcCd
	 */
	public String getWhfVolDcCd() {
		return this.whfVolDcCd;
	}
	
	/**
	 * Column Info
	 * @return declDt
	 */
	public String getDeclDt() {
		return this.declDt;
	}
	
	/**
	 * Column Info
	 * @return full45ftCntrQty
	 */
	public String getFull45ftCntrQty() {
		return this.full45ftCntrQty;
	}
	
	/**
	 * Column Info
	 * @return unldTpCd
	 */
	public String getUnldTpCd() {
		return this.unldTpCd;
	}
	
	/**
	 * Column Info
	 * @return vslCallSgnCd
	 */
	public String getVslCallSgnCd() {
		return this.vslCallSgnCd;
	}
	
	/**
	 * Column Info
	 * @return cfmUsrId
	 */
	public String getCfmUsrId() {
		return this.cfmUsrId;
	}
	
	/**
	 * Column Info
	 * @return portCd
	 */
	public String getPortCd() {
		return this.portCd;
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
	 * @return whfUsrNm
	 */
	public String getWhfUsrNm() {
		return this.whfUsrNm;
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
	 * @return whfPayDt
	 */
	public String getWhfPayDt() {
		return this.whfPayDt;
	}
	
	/**
	 * Column Info
	 * @return cfmDt
	 */
	public String getCfmDt() {
		return this.cfmDt;
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
	 * @return unldAgnCd
	 */
	public String getUnldAgnCd() {
		return this.unldAgnCd;
	}
	
	/**
	 * Column Info
	 * @return ntcAmt
	 */
	public String getNtcAmt() {
		return this.ntcAmt;
	}
	
	/**
	 * Column Info
	 * @return cfmFlg
	 */
	public String getCfmFlg() {
		return this.cfmFlg;
	}
	
	/**
	 * Column Info
	 * @return whfNtcDt
	 */
	public String getWhfNtcDt() {
		return this.whfNtcDt;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	
	/**
	 * Column Info
	 * @return sailDt
	 */
	public String getSailDt() {
		return this.sailDt;
	}
	
	/**
	 * Column Info
	 * @return commAmt
	 */
	public String getCommAmt() {
		return this.commAmt;
	}
	
	/**
	 * Column Info
	 * @return whfRtAmt
	 */
	public String getWhfRtAmt() {
		return this.whfRtAmt;
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
	 * @return mty20ftCntrQty
	 */
	public String getMty20ftCntrQty() {
		return this.mty20ftCntrQty;
	}
	
	/**
	 * Column Info
	 * @return ioPortCd
	 */
	public String getIoPortCd() {
		return this.ioPortCd;
	}
	
	/**
	 * Column Info
	 * @return whfCustKndCd
	 */
	public String getWhfCustKndCd() {
		return this.whfCustKndCd;
	}
	
	/**
	 * Column Info
	 * @return mty45ftCntrQty
	 */
	public String getMty45ftCntrQty() {
		return this.mty45ftCntrQty;
	}
	
	/**
	 * Column Info
	 * @return declAuthFlg
	 */
	public String getDeclAuthFlg() {
		return this.declAuthFlg;
	}
	
	/**
	 * Column Info
	 * @return full20ftCntrQty
	 */
	public String getFull20ftCntrQty() {
		return this.full20ftCntrQty;
	}
	
	/**
	 * Column Info
	 * @return mty40ftCntrQty
	 */
	public String getMty40ftCntrQty() {
		return this.mty40ftCntrQty;
	}
	
	/**
	 * Column Info
	 * @return whfRt
	 */
	public String getWhfRt() {
		return this.whfRt;
	}
	

	/**
	 * Column Info
	 * @param ediMsgSndId
	 */
	public void setEdiMsgSndId(String ediMsgSndId) {
		this.ediMsgSndId = ediMsgSndId;
	}
	
	/**
	 * Column Info
	 * @param full40ftCntrQty
	 */
	public void setFull40ftCntrQty(String full40ftCntrQty) {
		this.full40ftCntrQty = full40ftCntrQty;
	}
	
	/**
	 * Column Info
	 * @param payDt
	 */
	public void setPayDt(String payDt) {
		this.payDt = payDt;
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
	 * @param exptTonWgt
	 */
	public void setExptTonWgt(String exptTonWgt) {
		this.exptTonWgt = exptTonWgt;
	}
	
	/**
	 * Column Info
	 * @param whfBndCd
	 */
	public void setWhfBndCd(String whfBndCd) {
		this.whfBndCd = whfBndCd;
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
	 * @param ediTrsmCd
	 */
	public void setEdiTrsmCd(String ediTrsmCd) {
		this.ediTrsmCd = ediTrsmCd;
	}
	
	/**
	 * Column Info
	 * @param arrYr
	 */
	public void setArrYr(String arrYr) {
		this.arrYr = arrYr;
	}
	
	/**
	 * Column Info
	 * @param rtonWgt
	 */
	public void setRtonWgt(String rtonWgt) {
		this.rtonWgt = rtonWgt;
	}
	
	/**
	 * Column Info
	 * @param tmlCd
	 */
	public void setTmlCd(String tmlCd) {
		this.tmlCd = tmlCd;
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
	 * @param mfRefNo
	 */
	public void setMfRefNo(String mfRefNo) {
		this.mfRefNo = mfRefNo;
	}
	
	/**
	 * Column Info
	 * @param arrTmsNo
	 */
	public void setArrTmsNo(String arrTmsNo) {
		this.arrTmsNo = arrTmsNo;
	}
	
	/**
	 * Column Info
	 * @param portNm
	 */
	public void setPortNm(String portNm) {
		this.portNm = portNm;
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
	 * @param rducAmt
	 */
	public void setRducAmt(String rducAmt) {
		this.rducAmt = rducAmt;
	}
	
	/**
	 * Column Info
	 * @param whfVolDcCd
	 */
	public void setWhfVolDcCd(String whfVolDcCd) {
		this.whfVolDcCd = whfVolDcCd;
	}
	
	/**
	 * Column Info
	 * @param declDt
	 */
	public void setDeclDt(String declDt) {
		this.declDt = declDt;
	}
	
	/**
	 * Column Info
	 * @param full45ftCntrQty
	 */
	public void setFull45ftCntrQty(String full45ftCntrQty) {
		this.full45ftCntrQty = full45ftCntrQty;
	}
	
	/**
	 * Column Info
	 * @param unldTpCd
	 */
	public void setUnldTpCd(String unldTpCd) {
		this.unldTpCd = unldTpCd;
	}
	
	/**
	 * Column Info
	 * @param vslCallSgnCd
	 */
	public void setVslCallSgnCd(String vslCallSgnCd) {
		this.vslCallSgnCd = vslCallSgnCd;
	}
	
	/**
	 * Column Info
	 * @param cfmUsrId
	 */
	public void setCfmUsrId(String cfmUsrId) {
		this.cfmUsrId = cfmUsrId;
	}
	
	/**
	 * Column Info
	 * @param portCd
	 */
	public void setPortCd(String portCd) {
		this.portCd = portCd;
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
	 * @param whfUsrNm
	 */
	public void setWhfUsrNm(String whfUsrNm) {
		this.whfUsrNm = whfUsrNm;
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
	 * @param whfPayDt
	 */
	public void setWhfPayDt(String whfPayDt) {
		this.whfPayDt = whfPayDt;
	}
	
	/**
	 * Column Info
	 * @param cfmDt
	 */
	public void setCfmDt(String cfmDt) {
		this.cfmDt = cfmDt;
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
	 * @param unldAgnCd
	 */
	public void setUnldAgnCd(String unldAgnCd) {
		this.unldAgnCd = unldAgnCd;
	}
	
	/**
	 * Column Info
	 * @param ntcAmt
	 */
	public void setNtcAmt(String ntcAmt) {
		this.ntcAmt = ntcAmt;
	}
	
	/**
	 * Column Info
	 * @param cfmFlg
	 */
	public void setCfmFlg(String cfmFlg) {
		this.cfmFlg = cfmFlg;
	}
	
	/**
	 * Column Info
	 * @param whfNtcDt
	 */
	public void setWhfNtcDt(String whfNtcDt) {
		this.whfNtcDt = whfNtcDt;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
	}
	
	/**
	 * Column Info
	 * @param sailDt
	 */
	public void setSailDt(String sailDt) {
		this.sailDt = sailDt;
	}
	
	/**
	 * Column Info
	 * @param commAmt
	 */
	public void setCommAmt(String commAmt) {
		this.commAmt = commAmt;
	}
	
	/**
	 * Column Info
	 * @param whfRtAmt
	 */
	public void setWhfRtAmt(String whfRtAmt) {
		this.whfRtAmt = whfRtAmt;
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
	 * @param mty20ftCntrQty
	 */
	public void setMty20ftCntrQty(String mty20ftCntrQty) {
		this.mty20ftCntrQty = mty20ftCntrQty;
	}
	
	/**
	 * Column Info
	 * @param ioPortCd
	 */
	public void setIoPortCd(String ioPortCd) {
		this.ioPortCd = ioPortCd;
	}
	
	/**
	 * Column Info
	 * @param whfCustKndCd
	 */
	public void setWhfCustKndCd(String whfCustKndCd) {
		this.whfCustKndCd = whfCustKndCd;
	}
	
	/**
	 * Column Info
	 * @param mty45ftCntrQty
	 */
	public void setMty45ftCntrQty(String mty45ftCntrQty) {
		this.mty45ftCntrQty = mty45ftCntrQty;
	}
	
	/**
	 * Column Info
	 * @param declAuthFlg
	 */
	public void setDeclAuthFlg(String declAuthFlg) {
		this.declAuthFlg = declAuthFlg;
	}
	
	/**
	 * Column Info
	 * @param full20ftCntrQty
	 */
	public void setFull20ftCntrQty(String full20ftCntrQty) {
		this.full20ftCntrQty = full20ftCntrQty;
	}
	
	/**
	 * Column Info
	 * @param mty40ftCntrQty
	 */
	public void setMty40ftCntrQty(String mty40ftCntrQty) {
		this.mty40ftCntrQty = mty40ftCntrQty;
	}
	
	/**
	 * Column Info
	 * @param whfRt
	 */
	public void setWhfRt(String whfRt) {
		this.whfRt = whfRt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setEdiMsgSndId(JSPUtil.getParameter(request, "edi_msg_snd_id", ""));
		setFull40ftCntrQty(JSPUtil.getParameter(request, "full_40ft_cntr_qty", ""));
		setPayDt(JSPUtil.getParameter(request, "pay_dt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setExptTonWgt(JSPUtil.getParameter(request, "expt_ton_wgt", ""));
		setWhfBndCd(JSPUtil.getParameter(request, "whf_bnd_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEdiTrsmCd(JSPUtil.getParameter(request, "edi_trsm_cd", ""));
		setArrYr(JSPUtil.getParameter(request, "arr_yr", ""));
		setRtonWgt(JSPUtil.getParameter(request, "rton_wgt", ""));
		setTmlCd(JSPUtil.getParameter(request, "tml_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setMfRefNo(JSPUtil.getParameter(request, "mf_ref_no", ""));
		setArrTmsNo(JSPUtil.getParameter(request, "arr_tms_no", ""));
		setPortNm(JSPUtil.getParameter(request, "port_nm", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setRducAmt(JSPUtil.getParameter(request, "rduc_amt", ""));
		setWhfVolDcCd(JSPUtil.getParameter(request, "whf_vol_dc_cd", ""));
		setDeclDt(JSPUtil.getParameter(request, "decl_dt", ""));
		setFull45ftCntrQty(JSPUtil.getParameter(request, "full_45ft_cntr_qty", ""));
		setUnldTpCd(JSPUtil.getParameter(request, "unld_tp_cd", ""));
		setVslCallSgnCd(JSPUtil.getParameter(request, "vsl_call_sgn_cd", ""));
		setCfmUsrId(JSPUtil.getParameter(request, "cfm_usr_id", ""));
		setPortCd(JSPUtil.getParameter(request, "port_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setWhfUsrNm(JSPUtil.getParameter(request, "whf_usr_nm", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setWhfPayDt(JSPUtil.getParameter(request, "whf_pay_dt", ""));
		setCfmDt(JSPUtil.getParameter(request, "cfm_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setVslNm(JSPUtil.getParameter(request, "vsl_nm", ""));
		setUnldAgnCd(JSPUtil.getParameter(request, "unld_agn_cd", ""));
		setNtcAmt(JSPUtil.getParameter(request, "ntc_amt", ""));
		setCfmFlg(JSPUtil.getParameter(request, "cfm_flg", ""));
		setWhfNtcDt(JSPUtil.getParameter(request, "whf_ntc_dt", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setSailDt(JSPUtil.getParameter(request, "sail_dt", ""));
		setCommAmt(JSPUtil.getParameter(request, "comm_amt", ""));
		setWhfRtAmt(JSPUtil.getParameter(request, "whf_rt_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setMty20ftCntrQty(JSPUtil.getParameter(request, "mty_20ft_cntr_qty", ""));
		setIoPortCd(JSPUtil.getParameter(request, "io_port_cd", ""));
		setWhfCustKndCd(JSPUtil.getParameter(request, "whf_cust_knd_cd", ""));
		setMty45ftCntrQty(JSPUtil.getParameter(request, "mty_45ft_cntr_qty", ""));
		setDeclAuthFlg(JSPUtil.getParameter(request, "decl_auth_flg", ""));
		setFull20ftCntrQty(JSPUtil.getParameter(request, "full_20ft_cntr_qty", ""));
		setMty40ftCntrQty(JSPUtil.getParameter(request, "mty_40ft_cntr_qty", ""));
		setWhfRt(JSPUtil.getParameter(request, "whf_rt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgKrWhfVolVO[]
	 */
	public BkgKrWhfVolVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgKrWhfVolVO[]
	 */
	public BkgKrWhfVolVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgKrWhfVolVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ediMsgSndId = (JSPUtil.getParameter(request, prefix	+ "edi_msg_snd_id", length));
			String[] full40ftCntrQty = (JSPUtil.getParameter(request, prefix	+ "full_40ft_cntr_qty", length));
			String[] payDt = (JSPUtil.getParameter(request, prefix	+ "pay_dt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] exptTonWgt = (JSPUtil.getParameter(request, prefix	+ "expt_ton_wgt", length));
			String[] whfBndCd = (JSPUtil.getParameter(request, prefix	+ "whf_bnd_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] ediTrsmCd = (JSPUtil.getParameter(request, prefix	+ "edi_trsm_cd", length));
			String[] arrYr = (JSPUtil.getParameter(request, prefix	+ "arr_yr", length));
			String[] rtonWgt = (JSPUtil.getParameter(request, prefix	+ "rton_wgt", length));
			String[] tmlCd = (JSPUtil.getParameter(request, prefix	+ "tml_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] mfRefNo = (JSPUtil.getParameter(request, prefix	+ "mf_ref_no", length));
			String[] arrTmsNo = (JSPUtil.getParameter(request, prefix	+ "arr_tms_no", length));
			String[] portNm = (JSPUtil.getParameter(request, prefix	+ "port_nm", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] rducAmt = (JSPUtil.getParameter(request, prefix	+ "rduc_amt", length));
			String[] whfVolDcCd = (JSPUtil.getParameter(request, prefix	+ "whf_vol_dc_cd", length));
			String[] declDt = (JSPUtil.getParameter(request, prefix	+ "decl_dt", length));
			String[] full45ftCntrQty = (JSPUtil.getParameter(request, prefix	+ "full_45ft_cntr_qty", length));
			String[] unldTpCd = (JSPUtil.getParameter(request, prefix	+ "unld_tp_cd", length));
			String[] vslCallSgnCd = (JSPUtil.getParameter(request, prefix	+ "vsl_call_sgn_cd", length));
			String[] cfmUsrId = (JSPUtil.getParameter(request, prefix	+ "cfm_usr_id", length));
			String[] portCd = (JSPUtil.getParameter(request, prefix	+ "port_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] whfUsrNm = (JSPUtil.getParameter(request, prefix	+ "whf_usr_nm", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] whfPayDt = (JSPUtil.getParameter(request, prefix	+ "whf_pay_dt", length));
			String[] cfmDt = (JSPUtil.getParameter(request, prefix	+ "cfm_dt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] vslNm = (JSPUtil.getParameter(request, prefix	+ "vsl_nm", length));
			String[] unldAgnCd = (JSPUtil.getParameter(request, prefix	+ "unld_agn_cd", length));
			String[] ntcAmt = (JSPUtil.getParameter(request, prefix	+ "ntc_amt", length));
			String[] cfmFlg = (JSPUtil.getParameter(request, prefix	+ "cfm_flg", length));
			String[] whfNtcDt = (JSPUtil.getParameter(request, prefix	+ "whf_ntc_dt", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] sailDt = (JSPUtil.getParameter(request, prefix	+ "sail_dt", length));
			String[] commAmt = (JSPUtil.getParameter(request, prefix	+ "comm_amt", length));
			String[] whfRtAmt = (JSPUtil.getParameter(request, prefix	+ "whf_rt_amt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] mty20ftCntrQty = (JSPUtil.getParameter(request, prefix	+ "mty_20ft_cntr_qty", length));
			String[] ioPortCd = (JSPUtil.getParameter(request, prefix	+ "io_port_cd", length));
			String[] whfCustKndCd = (JSPUtil.getParameter(request, prefix	+ "whf_cust_knd_cd", length));
			String[] mty45ftCntrQty = (JSPUtil.getParameter(request, prefix	+ "mty_45ft_cntr_qty", length));
			String[] declAuthFlg = (JSPUtil.getParameter(request, prefix	+ "decl_auth_flg", length));
			String[] full20ftCntrQty = (JSPUtil.getParameter(request, prefix	+ "full_20ft_cntr_qty", length));
			String[] mty40ftCntrQty = (JSPUtil.getParameter(request, prefix	+ "mty_40ft_cntr_qty", length));
			String[] whfRt = (JSPUtil.getParameter(request, prefix	+ "whf_rt", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgKrWhfVolVO();
				if (ediMsgSndId[i] != null)
					model.setEdiMsgSndId(ediMsgSndId[i]);
				if (full40ftCntrQty[i] != null)
					model.setFull40ftCntrQty(full40ftCntrQty[i]);
				if (payDt[i] != null)
					model.setPayDt(payDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (exptTonWgt[i] != null)
					model.setExptTonWgt(exptTonWgt[i]);
				if (whfBndCd[i] != null)
					model.setWhfBndCd(whfBndCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ediTrsmCd[i] != null)
					model.setEdiTrsmCd(ediTrsmCd[i]);
				if (arrYr[i] != null)
					model.setArrYr(arrYr[i]);
				if (rtonWgt[i] != null)
					model.setRtonWgt(rtonWgt[i]);
				if (tmlCd[i] != null)
					model.setTmlCd(tmlCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (mfRefNo[i] != null)
					model.setMfRefNo(mfRefNo[i]);
				if (arrTmsNo[i] != null)
					model.setArrTmsNo(arrTmsNo[i]);
				if (portNm[i] != null)
					model.setPortNm(portNm[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rducAmt[i] != null)
					model.setRducAmt(rducAmt[i]);
				if (whfVolDcCd[i] != null)
					model.setWhfVolDcCd(whfVolDcCd[i]);
				if (declDt[i] != null)
					model.setDeclDt(declDt[i]);
				if (full45ftCntrQty[i] != null)
					model.setFull45ftCntrQty(full45ftCntrQty[i]);
				if (unldTpCd[i] != null)
					model.setUnldTpCd(unldTpCd[i]);
				if (vslCallSgnCd[i] != null)
					model.setVslCallSgnCd(vslCallSgnCd[i]);
				if (cfmUsrId[i] != null)
					model.setCfmUsrId(cfmUsrId[i]);
				if (portCd[i] != null)
					model.setPortCd(portCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (whfUsrNm[i] != null)
					model.setWhfUsrNm(whfUsrNm[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (whfPayDt[i] != null)
					model.setWhfPayDt(whfPayDt[i]);
				if (cfmDt[i] != null)
					model.setCfmDt(cfmDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (vslNm[i] != null)
					model.setVslNm(vslNm[i]);
				if (unldAgnCd[i] != null)
					model.setUnldAgnCd(unldAgnCd[i]);
				if (ntcAmt[i] != null)
					model.setNtcAmt(ntcAmt[i]);
				if (cfmFlg[i] != null)
					model.setCfmFlg(cfmFlg[i]);
				if (whfNtcDt[i] != null)
					model.setWhfNtcDt(whfNtcDt[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (sailDt[i] != null)
					model.setSailDt(sailDt[i]);
				if (commAmt[i] != null)
					model.setCommAmt(commAmt[i]);
				if (whfRtAmt[i] != null)
					model.setWhfRtAmt(whfRtAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (mty20ftCntrQty[i] != null)
					model.setMty20ftCntrQty(mty20ftCntrQty[i]);
				if (ioPortCd[i] != null)
					model.setIoPortCd(ioPortCd[i]);
				if (whfCustKndCd[i] != null)
					model.setWhfCustKndCd(whfCustKndCd[i]);
				if (mty45ftCntrQty[i] != null)
					model.setMty45ftCntrQty(mty45ftCntrQty[i]);
				if (declAuthFlg[i] != null)
					model.setDeclAuthFlg(declAuthFlg[i]);
				if (full20ftCntrQty[i] != null)
					model.setFull20ftCntrQty(full20ftCntrQty[i]);
				if (mty40ftCntrQty[i] != null)
					model.setMty40ftCntrQty(mty40ftCntrQty[i]);
				if (whfRt[i] != null)
					model.setWhfRt(whfRt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgKrWhfVolVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgKrWhfVolVO[]
	 */
	public BkgKrWhfVolVO[] getBkgKrWhfVolVOs(){
		BkgKrWhfVolVO[] vos = (BkgKrWhfVolVO[])models.toArray(new BkgKrWhfVolVO[models.size()]);
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
		this.ediMsgSndId = this.ediMsgSndId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.full40ftCntrQty = this.full40ftCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payDt = this.payDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exptTonWgt = this.exptTonWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfBndCd = this.whfBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediTrsmCd = this.ediTrsmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrYr = this.arrYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtonWgt = this.rtonWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlCd = this.tmlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfRefNo = this.mfRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrTmsNo = this.arrTmsNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portNm = this.portNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rducAmt = this.rducAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfVolDcCd = this.whfVolDcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.declDt = this.declDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.full45ftCntrQty = this.full45ftCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.unldTpCd = this.unldTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCallSgnCd = this.vslCallSgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmUsrId = this.cfmUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portCd = this.portCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfUsrNm = this.whfUsrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfPayDt = this.whfPayDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmDt = this.cfmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslNm = this.vslNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.unldAgnCd = this.unldAgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntcAmt = this.ntcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmFlg = this.cfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfNtcDt = this.whfNtcDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sailDt = this.sailDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commAmt = this.commAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfRtAmt = this.whfRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mty20ftCntrQty = this.mty20ftCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioPortCd = this.ioPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfCustKndCd = this.whfCustKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mty45ftCntrQty = this.mty45ftCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.declAuthFlg = this.declAuthFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.full20ftCntrQty = this.full20ftCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mty40ftCntrQty = this.mty40ftCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfRt = this.whfRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
