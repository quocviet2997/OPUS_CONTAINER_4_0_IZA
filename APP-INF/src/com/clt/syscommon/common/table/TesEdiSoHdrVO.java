/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : TesEdiSoHdrVO.java
*@FileTitle : TesEdiSoHdrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2012.06.18
*@LastModifier : 
*@LastVersion : 1.0
* 2012.06.18  
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

public class TesEdiSoHdrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TesEdiSoHdrVO> models = new ArrayList<TesEdiSoHdrVO>();
	
	/* Column Info */
	private String vldChkFlg = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String ibVvdCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String rcvrId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String atchTpCd = null;
	/* Column Info */
	private String tmlInvTpCd = null;
	/* Column Info */
	private String atbDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String issDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String tmlInvRjctStsCd = null;
	/* Column Info */
	private String rcvDt = null;
	/* Column Info */
	private String sndrId = null;
	/* Column Info */
	private String ioIndCd = null;
	/* Column Info */
	private String fmPrdDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String invOfcCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String costOfcCd = null;
	/* Column Info */
	private String tmlEdiSoOfcCtyCd = null;
	/* Column Info */
	private String invRjctRmk = null;
	/* Column Info */
	private String ediMsg = null;
	/* Column Info */
	private String loclCreDt = null;
	/* Column Info */
	private String toPrdDt = null;
	/* Column Info */
	private String whldTaxAmt = null;
	/* Column Info */
	private String tmlInvEdiSeq = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String vatAmt = null;
	/* Column Info */
	private String ydCd = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String tmlInvStsCd = null;
	/* Column Info */
	private String ediRcvRuleMnSeq = null;
	/* Column Info */
	private String obVvdCd = null;
	/* Column Info */
	private String tmlSoSeq = null;
	/* Column Info */
	private String fltFileMsgId = null;
	/* Column Info */
	private String stoDysIndCd = null;
	/* Column Info */
	private String loclUpdDt = null;
	/* Column Info */
	private String tmlEdiSoSeq = null;
	/* Column Info */
	private String ttlInvAmt = null;
	/* Column Info */
	private String tmlSoOfcCtyCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TesEdiSoHdrVO() {}

	public TesEdiSoHdrVO(String ibflag, String pagerows, String tmlEdiSoOfcCtyCd, String tmlEdiSoSeq, String tmlInvTpCd, String tmlInvStsCd, String tmlInvRjctStsCd, String invOfcCd, String costOfcCd, String vndrSeq, String ydCd, String invNo, String currCd, String rcvDt, String issDt, String ttlInvAmt, String vatAmt, String whldTaxAmt, String atchTpCd, String ioIndCd, String tmlSoOfcCtyCd, String tmlSoSeq, String deltFlg, String ibVvdCd, String obVvdCd, String invRjctRmk, String stoDysIndCd, String vldChkFlg, String loclCreDt, String loclUpdDt, String creUsrId, String creDt, String updUsrId, String updDt, String fmPrdDt, String toPrdDt, String tmlInvEdiSeq, String fltFileMsgId, String sndrId, String rcvrId, String ediMsg, String ediRcvRuleMnSeq, String atbDt) {
		this.vldChkFlg = vldChkFlg;
		this.currCd = currCd;
		this.ibVvdCd = ibVvdCd;
		this.deltFlg = deltFlg;
		this.rcvrId = rcvrId;
		this.creDt = creDt;
		this.atchTpCd = atchTpCd;
		this.tmlInvTpCd = tmlInvTpCd;
		this.atbDt = atbDt;
		this.pagerows = pagerows;
		this.issDt = issDt;
		this.ibflag = ibflag;
		this.tmlInvRjctStsCd = tmlInvRjctStsCd;
		this.rcvDt = rcvDt;
		this.sndrId = sndrId;
		this.ioIndCd = ioIndCd;
		this.fmPrdDt = fmPrdDt;
		this.updUsrId = updUsrId;
		this.invOfcCd = invOfcCd;
		this.updDt = updDt;
		this.costOfcCd = costOfcCd;
		this.tmlEdiSoOfcCtyCd = tmlEdiSoOfcCtyCd;
		this.invRjctRmk = invRjctRmk;
		this.ediMsg = ediMsg;
		this.loclCreDt = loclCreDt;
		this.toPrdDt = toPrdDt;
		this.whldTaxAmt = whldTaxAmt;
		this.tmlInvEdiSeq = tmlInvEdiSeq;
		this.invNo = invNo;
		this.creUsrId = creUsrId;
		this.vatAmt = vatAmt;
		this.ydCd = ydCd;
		this.vndrSeq = vndrSeq;
		this.tmlInvStsCd = tmlInvStsCd;
		this.ediRcvRuleMnSeq = ediRcvRuleMnSeq;
		this.obVvdCd = obVvdCd;
		this.tmlSoSeq = tmlSoSeq;
		this.fltFileMsgId = fltFileMsgId;
		this.stoDysIndCd = stoDysIndCd;
		this.loclUpdDt = loclUpdDt;
		this.tmlEdiSoSeq = tmlEdiSoSeq;
		this.ttlInvAmt = ttlInvAmt;
		this.tmlSoOfcCtyCd = tmlSoOfcCtyCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vld_chk_flg", getVldChkFlg());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("ib_vvd_cd", getIbVvdCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("rcvr_id", getRcvrId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("atch_tp_cd", getAtchTpCd());
		this.hashColumns.put("tml_inv_tp_cd", getTmlInvTpCd());
		this.hashColumns.put("atb_dt", getAtbDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("iss_dt", getIssDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("tml_inv_rjct_sts_cd", getTmlInvRjctStsCd());
		this.hashColumns.put("rcv_dt", getRcvDt());
		this.hashColumns.put("sndr_id", getSndrId());
		this.hashColumns.put("io_ind_cd", getIoIndCd());
		this.hashColumns.put("fm_prd_dt", getFmPrdDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("inv_ofc_cd", getInvOfcCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cost_ofc_cd", getCostOfcCd());
		this.hashColumns.put("tml_edi_so_ofc_cty_cd", getTmlEdiSoOfcCtyCd());
		this.hashColumns.put("inv_rjct_rmk", getInvRjctRmk());
		this.hashColumns.put("edi_msg", getEdiMsg());
		this.hashColumns.put("locl_cre_dt", getLoclCreDt());
		this.hashColumns.put("to_prd_dt", getToPrdDt());
		this.hashColumns.put("whld_tax_amt", getWhldTaxAmt());
		this.hashColumns.put("tml_inv_edi_seq", getTmlInvEdiSeq());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("vat_amt", getVatAmt());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("tml_inv_sts_cd", getTmlInvStsCd());
		this.hashColumns.put("edi_rcv_rule_mn_seq", getEdiRcvRuleMnSeq());
		this.hashColumns.put("ob_vvd_cd", getObVvdCd());
		this.hashColumns.put("tml_so_seq", getTmlSoSeq());
		this.hashColumns.put("flt_file_msg_id", getFltFileMsgId());
		this.hashColumns.put("sto_dys_ind_cd", getStoDysIndCd());
		this.hashColumns.put("locl_upd_dt", getLoclUpdDt());
		this.hashColumns.put("tml_edi_so_seq", getTmlEdiSoSeq());
		this.hashColumns.put("ttl_inv_amt", getTtlInvAmt());
		this.hashColumns.put("tml_so_ofc_cty_cd", getTmlSoOfcCtyCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vld_chk_flg", "vldChkFlg");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("ib_vvd_cd", "ibVvdCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("rcvr_id", "rcvrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("atch_tp_cd", "atchTpCd");
		this.hashFields.put("tml_inv_tp_cd", "tmlInvTpCd");
		this.hashFields.put("atb_dt", "atbDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("iss_dt", "issDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("tml_inv_rjct_sts_cd", "tmlInvRjctStsCd");
		this.hashFields.put("rcv_dt", "rcvDt");
		this.hashFields.put("sndr_id", "sndrId");
		this.hashFields.put("io_ind_cd", "ioIndCd");
		this.hashFields.put("fm_prd_dt", "fmPrdDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("inv_ofc_cd", "invOfcCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cost_ofc_cd", "costOfcCd");
		this.hashFields.put("tml_edi_so_ofc_cty_cd", "tmlEdiSoOfcCtyCd");
		this.hashFields.put("inv_rjct_rmk", "invRjctRmk");
		this.hashFields.put("edi_msg", "ediMsg");
		this.hashFields.put("locl_cre_dt", "loclCreDt");
		this.hashFields.put("to_prd_dt", "toPrdDt");
		this.hashFields.put("whld_tax_amt", "whldTaxAmt");
		this.hashFields.put("tml_inv_edi_seq", "tmlInvEdiSeq");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("vat_amt", "vatAmt");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("tml_inv_sts_cd", "tmlInvStsCd");
		this.hashFields.put("edi_rcv_rule_mn_seq", "ediRcvRuleMnSeq");
		this.hashFields.put("ob_vvd_cd", "obVvdCd");
		this.hashFields.put("tml_so_seq", "tmlSoSeq");
		this.hashFields.put("flt_file_msg_id", "fltFileMsgId");
		this.hashFields.put("sto_dys_ind_cd", "stoDysIndCd");
		this.hashFields.put("locl_upd_dt", "loclUpdDt");
		this.hashFields.put("tml_edi_so_seq", "tmlEdiSoSeq");
		this.hashFields.put("ttl_inv_amt", "ttlInvAmt");
		this.hashFields.put("tml_so_ofc_cty_cd", "tmlSoOfcCtyCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return vldChkFlg
	 */
	public String getVldChkFlg() {
		return this.vldChkFlg;
	}
	
	/**
	 * Column Info
	 * @return currCd
	 */
	public String getCurrCd() {
		return this.currCd;
	}
	
	/**
	 * Column Info
	 * @return ibVvdCd
	 */
	public String getIbVvdCd() {
		return this.ibVvdCd;
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
	 * @return rcvrId
	 */
	public String getRcvrId() {
		return this.rcvrId;
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
	 * @return atchTpCd
	 */
	public String getAtchTpCd() {
		return this.atchTpCd;
	}
	
	/**
	 * Column Info
	 * @return tmlInvTpCd
	 */
	public String getTmlInvTpCd() {
		return this.tmlInvTpCd;
	}
	
	/**
	 * Column Info
	 * @return atbDt
	 */
	public String getAtbDt() {
		return this.atbDt;
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
	 * @return issDt
	 */
	public String getIssDt() {
		return this.issDt;
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
	 * @return tmlInvRjctStsCd
	 */
	public String getTmlInvRjctStsCd() {
		return this.tmlInvRjctStsCd;
	}
	
	/**
	 * Column Info
	 * @return rcvDt
	 */
	public String getRcvDt() {
		return this.rcvDt;
	}
	
	/**
	 * Column Info
	 * @return sndrId
	 */
	public String getSndrId() {
		return this.sndrId;
	}
	
	/**
	 * Column Info
	 * @return ioIndCd
	 */
	public String getIoIndCd() {
		return this.ioIndCd;
	}
	
	/**
	 * Column Info
	 * @return fmPrdDt
	 */
	public String getFmPrdDt() {
		return this.fmPrdDt;
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
	 * @return invOfcCd
	 */
	public String getInvOfcCd() {
		return this.invOfcCd;
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
	 * @return costOfcCd
	 */
	public String getCostOfcCd() {
		return this.costOfcCd;
	}
	
	/**
	 * Column Info
	 * @return tmlEdiSoOfcCtyCd
	 */
	public String getTmlEdiSoOfcCtyCd() {
		return this.tmlEdiSoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return invRjctRmk
	 */
	public String getInvRjctRmk() {
		return this.invRjctRmk;
	}
	
	/**
	 * Column Info
	 * @return ediMsg
	 */
	public String getEdiMsg() {
		return this.ediMsg;
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
	 * @return toPrdDt
	 */
	public String getToPrdDt() {
		return this.toPrdDt;
	}
	
	/**
	 * Column Info
	 * @return whldTaxAmt
	 */
	public String getWhldTaxAmt() {
		return this.whldTaxAmt;
	}
	
	/**
	 * Column Info
	 * @return tmlInvEdiSeq
	 */
	public String getTmlInvEdiSeq() {
		return this.tmlInvEdiSeq;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return vatAmt
	 */
	public String getVatAmt() {
		return this.vatAmt;
	}
	
	/**
	 * Column Info
	 * @return ydCd
	 */
	public String getYdCd() {
		return this.ydCd;
	}
	
	/**
	 * Column Info
	 * @return vndrSeq
	 */
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	
	/**
	 * Column Info
	 * @return tmlInvStsCd
	 */
	public String getTmlInvStsCd() {
		return this.tmlInvStsCd;
	}
	
	/**
	 * Column Info
	 * @return ediRcvRuleMnSeq
	 */
	public String getEdiRcvRuleMnSeq() {
		return this.ediRcvRuleMnSeq;
	}
	
	/**
	 * Column Info
	 * @return obVvdCd
	 */
	public String getObVvdCd() {
		return this.obVvdCd;
	}
	
	/**
	 * Column Info
	 * @return tmlSoSeq
	 */
	public String getTmlSoSeq() {
		return this.tmlSoSeq;
	}
	
	/**
	 * Column Info
	 * @return fltFileMsgId
	 */
	public String getFltFileMsgId() {
		return this.fltFileMsgId;
	}
	
	/**
	 * Column Info
	 * @return stoDysIndCd
	 */
	public String getStoDysIndCd() {
		return this.stoDysIndCd;
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
	 * @return tmlEdiSoSeq
	 */
	public String getTmlEdiSoSeq() {
		return this.tmlEdiSoSeq;
	}
	
	/**
	 * Column Info
	 * @return ttlInvAmt
	 */
	public String getTtlInvAmt() {
		return this.ttlInvAmt;
	}
	
	/**
	 * Column Info
	 * @return tmlSoOfcCtyCd
	 */
	public String getTmlSoOfcCtyCd() {
		return this.tmlSoOfcCtyCd;
	}
	

	/**
	 * Column Info
	 * @param vldChkFlg
	 */
	public void setVldChkFlg(String vldChkFlg) {
		this.vldChkFlg = vldChkFlg;
	}
	
	/**
	 * Column Info
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	/**
	 * Column Info
	 * @param ibVvdCd
	 */
	public void setIbVvdCd(String ibVvdCd) {
		this.ibVvdCd = ibVvdCd;
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
	 * @param rcvrId
	 */
	public void setRcvrId(String rcvrId) {
		this.rcvrId = rcvrId;
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
	 * @param atchTpCd
	 */
	public void setAtchTpCd(String atchTpCd) {
		this.atchTpCd = atchTpCd;
	}
	
	/**
	 * Column Info
	 * @param tmlInvTpCd
	 */
	public void setTmlInvTpCd(String tmlInvTpCd) {
		this.tmlInvTpCd = tmlInvTpCd;
	}
	
	/**
	 * Column Info
	 * @param atbDt
	 */
	public void setAtbDt(String atbDt) {
		this.atbDt = atbDt;
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
	 * @param issDt
	 */
	public void setIssDt(String issDt) {
		this.issDt = issDt;
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
	 * @param tmlInvRjctStsCd
	 */
	public void setTmlInvRjctStsCd(String tmlInvRjctStsCd) {
		this.tmlInvRjctStsCd = tmlInvRjctStsCd;
	}
	
	/**
	 * Column Info
	 * @param rcvDt
	 */
	public void setRcvDt(String rcvDt) {
		this.rcvDt = rcvDt;
	}
	
	/**
	 * Column Info
	 * @param sndrId
	 */
	public void setSndrId(String sndrId) {
		this.sndrId = sndrId;
	}
	
	/**
	 * Column Info
	 * @param ioIndCd
	 */
	public void setIoIndCd(String ioIndCd) {
		this.ioIndCd = ioIndCd;
	}
	
	/**
	 * Column Info
	 * @param fmPrdDt
	 */
	public void setFmPrdDt(String fmPrdDt) {
		this.fmPrdDt = fmPrdDt;
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
	 * @param invOfcCd
	 */
	public void setInvOfcCd(String invOfcCd) {
		this.invOfcCd = invOfcCd;
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
	 * @param costOfcCd
	 */
	public void setCostOfcCd(String costOfcCd) {
		this.costOfcCd = costOfcCd;
	}
	
	/**
	 * Column Info
	 * @param tmlEdiSoOfcCtyCd
	 */
	public void setTmlEdiSoOfcCtyCd(String tmlEdiSoOfcCtyCd) {
		this.tmlEdiSoOfcCtyCd = tmlEdiSoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param invRjctRmk
	 */
	public void setInvRjctRmk(String invRjctRmk) {
		this.invRjctRmk = invRjctRmk;
	}
	
	/**
	 * Column Info
	 * @param ediMsg
	 */
	public void setEdiMsg(String ediMsg) {
		this.ediMsg = ediMsg;
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
	 * @param toPrdDt
	 */
	public void setToPrdDt(String toPrdDt) {
		this.toPrdDt = toPrdDt;
	}
	
	/**
	 * Column Info
	 * @param whldTaxAmt
	 */
	public void setWhldTaxAmt(String whldTaxAmt) {
		this.whldTaxAmt = whldTaxAmt;
	}
	
	/**
	 * Column Info
	 * @param tmlInvEdiSeq
	 */
	public void setTmlInvEdiSeq(String tmlInvEdiSeq) {
		this.tmlInvEdiSeq = tmlInvEdiSeq;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param vatAmt
	 */
	public void setVatAmt(String vatAmt) {
		this.vatAmt = vatAmt;
	}
	
	/**
	 * Column Info
	 * @param ydCd
	 */
	public void setYdCd(String ydCd) {
		this.ydCd = ydCd;
	}
	
	/**
	 * Column Info
	 * @param vndrSeq
	 */
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
	}
	
	/**
	 * Column Info
	 * @param tmlInvStsCd
	 */
	public void setTmlInvStsCd(String tmlInvStsCd) {
		this.tmlInvStsCd = tmlInvStsCd;
	}
	
	/**
	 * Column Info
	 * @param ediRcvRuleMnSeq
	 */
	public void setEdiRcvRuleMnSeq(String ediRcvRuleMnSeq) {
		this.ediRcvRuleMnSeq = ediRcvRuleMnSeq;
	}
	
	/**
	 * Column Info
	 * @param obVvdCd
	 */
	public void setObVvdCd(String obVvdCd) {
		this.obVvdCd = obVvdCd;
	}
	
	/**
	 * Column Info
	 * @param tmlSoSeq
	 */
	public void setTmlSoSeq(String tmlSoSeq) {
		this.tmlSoSeq = tmlSoSeq;
	}
	
	/**
	 * Column Info
	 * @param fltFileMsgId
	 */
	public void setFltFileMsgId(String fltFileMsgId) {
		this.fltFileMsgId = fltFileMsgId;
	}
	
	/**
	 * Column Info
	 * @param stoDysIndCd
	 */
	public void setStoDysIndCd(String stoDysIndCd) {
		this.stoDysIndCd = stoDysIndCd;
	}
	
	/**
	 * Column Info
	 * @param loclUpdDt
	 */
	public void setLoclUpdDt(String loclUpdDt) {
		this.loclUpdDt = loclUpdDt;
	}
	
	/**
	 * Column Info
	 * @param tmlEdiSoSeq
	 */
	public void setTmlEdiSoSeq(String tmlEdiSoSeq) {
		this.tmlEdiSoSeq = tmlEdiSoSeq;
	}
	
	/**
	 * Column Info
	 * @param ttlInvAmt
	 */
	public void setTtlInvAmt(String ttlInvAmt) {
		this.ttlInvAmt = ttlInvAmt;
	}
	
	/**
	 * Column Info
	 * @param tmlSoOfcCtyCd
	 */
	public void setTmlSoOfcCtyCd(String tmlSoOfcCtyCd) {
		this.tmlSoOfcCtyCd = tmlSoOfcCtyCd;
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
		setVldChkFlg(JSPUtil.getParameter(request, prefix + "vld_chk_flg", ""));
		setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
		setIbVvdCd(JSPUtil.getParameter(request, prefix + "ib_vvd_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setRcvrId(JSPUtil.getParameter(request, prefix + "rcvr_id", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setAtchTpCd(JSPUtil.getParameter(request, prefix + "atch_tp_cd", ""));
		setTmlInvTpCd(JSPUtil.getParameter(request, prefix + "tml_inv_tp_cd", ""));
		setAtbDt(JSPUtil.getParameter(request, prefix + "atb_dt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setIssDt(JSPUtil.getParameter(request, prefix + "iss_dt", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setTmlInvRjctStsCd(JSPUtil.getParameter(request, prefix + "tml_inv_rjct_sts_cd", ""));
		setRcvDt(JSPUtil.getParameter(request, prefix + "rcv_dt", ""));
		setSndrId(JSPUtil.getParameter(request, prefix + "sndr_id", ""));
		setIoIndCd(JSPUtil.getParameter(request, prefix + "io_ind_cd", ""));
		setFmPrdDt(JSPUtil.getParameter(request, prefix + "fm_prd_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setInvOfcCd(JSPUtil.getParameter(request, prefix + "inv_ofc_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setCostOfcCd(JSPUtil.getParameter(request, prefix + "cost_ofc_cd", ""));
		setTmlEdiSoOfcCtyCd(JSPUtil.getParameter(request, prefix + "tml_edi_so_ofc_cty_cd", ""));
		setInvRjctRmk(JSPUtil.getParameter(request, prefix + "inv_rjct_rmk", ""));
		setEdiMsg(JSPUtil.getParameter(request, prefix + "edi_msg", ""));
		setLoclCreDt(JSPUtil.getParameter(request, prefix + "locl_cre_dt", ""));
		setToPrdDt(JSPUtil.getParameter(request, prefix + "to_prd_dt", ""));
		setWhldTaxAmt(JSPUtil.getParameter(request, prefix + "whld_tax_amt", ""));
		setTmlInvEdiSeq(JSPUtil.getParameter(request, prefix + "tml_inv_edi_seq", ""));
		setInvNo(JSPUtil.getParameter(request, prefix + "inv_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setVatAmt(JSPUtil.getParameter(request, prefix + "vat_amt", ""));
		setYdCd(JSPUtil.getParameter(request, prefix + "yd_cd", ""));
		setVndrSeq(JSPUtil.getParameter(request, prefix + "vndr_seq", ""));
		setTmlInvStsCd(JSPUtil.getParameter(request, prefix + "tml_inv_sts_cd", ""));
		setEdiRcvRuleMnSeq(JSPUtil.getParameter(request, prefix + "edi_rcv_rule_mn_seq", ""));
		setObVvdCd(JSPUtil.getParameter(request, prefix + "ob_vvd_cd", ""));
		setTmlSoSeq(JSPUtil.getParameter(request, prefix + "tml_so_seq", ""));
		setFltFileMsgId(JSPUtil.getParameter(request, prefix + "flt_file_msg_id", ""));
		setStoDysIndCd(JSPUtil.getParameter(request, prefix + "sto_dys_ind_cd", ""));
		setLoclUpdDt(JSPUtil.getParameter(request, prefix + "locl_upd_dt", ""));
		setTmlEdiSoSeq(JSPUtil.getParameter(request, prefix + "tml_edi_so_seq", ""));
		setTtlInvAmt(JSPUtil.getParameter(request, prefix + "ttl_inv_amt", ""));
		setTmlSoOfcCtyCd(JSPUtil.getParameter(request, prefix + "tml_so_ofc_cty_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesEdiSoHdrVO[]
	 */
	public TesEdiSoHdrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesEdiSoHdrVO[]
	 */
	public TesEdiSoHdrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TesEdiSoHdrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vldChkFlg = (JSPUtil.getParameter(request, prefix	+ "vld_chk_flg", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] ibVvdCd = (JSPUtil.getParameter(request, prefix	+ "ib_vvd_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] rcvrId = (JSPUtil.getParameter(request, prefix	+ "rcvr_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] atchTpCd = (JSPUtil.getParameter(request, prefix	+ "atch_tp_cd", length));
			String[] tmlInvTpCd = (JSPUtil.getParameter(request, prefix	+ "tml_inv_tp_cd", length));
			String[] atbDt = (JSPUtil.getParameter(request, prefix	+ "atb_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] issDt = (JSPUtil.getParameter(request, prefix	+ "iss_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] tmlInvRjctStsCd = (JSPUtil.getParameter(request, prefix	+ "tml_inv_rjct_sts_cd", length));
			String[] rcvDt = (JSPUtil.getParameter(request, prefix	+ "rcv_dt", length));
			String[] sndrId = (JSPUtil.getParameter(request, prefix	+ "sndr_id", length));
			String[] ioIndCd = (JSPUtil.getParameter(request, prefix	+ "io_ind_cd", length));
			String[] fmPrdDt = (JSPUtil.getParameter(request, prefix	+ "fm_prd_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] invOfcCd = (JSPUtil.getParameter(request, prefix	+ "inv_ofc_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] costOfcCd = (JSPUtil.getParameter(request, prefix	+ "cost_ofc_cd", length));
			String[] tmlEdiSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "tml_edi_so_ofc_cty_cd", length));
			String[] invRjctRmk = (JSPUtil.getParameter(request, prefix	+ "inv_rjct_rmk", length));
			String[] ediMsg = (JSPUtil.getParameter(request, prefix	+ "edi_msg", length));
			String[] loclCreDt = (JSPUtil.getParameter(request, prefix	+ "locl_cre_dt", length));
			String[] toPrdDt = (JSPUtil.getParameter(request, prefix	+ "to_prd_dt", length));
			String[] whldTaxAmt = (JSPUtil.getParameter(request, prefix	+ "whld_tax_amt", length));
			String[] tmlInvEdiSeq = (JSPUtil.getParameter(request, prefix	+ "tml_inv_edi_seq", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] vatAmt = (JSPUtil.getParameter(request, prefix	+ "vat_amt", length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] tmlInvStsCd = (JSPUtil.getParameter(request, prefix	+ "tml_inv_sts_cd", length));
			String[] ediRcvRuleMnSeq = (JSPUtil.getParameter(request, prefix	+ "edi_rcv_rule_mn_seq", length));
			String[] obVvdCd = (JSPUtil.getParameter(request, prefix	+ "ob_vvd_cd", length));
			String[] tmlSoSeq = (JSPUtil.getParameter(request, prefix	+ "tml_so_seq", length));
			String[] fltFileMsgId = (JSPUtil.getParameter(request, prefix	+ "flt_file_msg_id", length));
			String[] stoDysIndCd = (JSPUtil.getParameter(request, prefix	+ "sto_dys_ind_cd", length));
			String[] loclUpdDt = (JSPUtil.getParameter(request, prefix	+ "locl_upd_dt", length));
			String[] tmlEdiSoSeq = (JSPUtil.getParameter(request, prefix	+ "tml_edi_so_seq", length));
			String[] ttlInvAmt = (JSPUtil.getParameter(request, prefix	+ "ttl_inv_amt", length));
			String[] tmlSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "tml_so_ofc_cty_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new TesEdiSoHdrVO();
				if (vldChkFlg[i] != null)
					model.setVldChkFlg(vldChkFlg[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (ibVvdCd[i] != null)
					model.setIbVvdCd(ibVvdCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (rcvrId[i] != null)
					model.setRcvrId(rcvrId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (atchTpCd[i] != null)
					model.setAtchTpCd(atchTpCd[i]);
				if (tmlInvTpCd[i] != null)
					model.setTmlInvTpCd(tmlInvTpCd[i]);
				if (atbDt[i] != null)
					model.setAtbDt(atbDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (issDt[i] != null)
					model.setIssDt(issDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (tmlInvRjctStsCd[i] != null)
					model.setTmlInvRjctStsCd(tmlInvRjctStsCd[i]);
				if (rcvDt[i] != null)
					model.setRcvDt(rcvDt[i]);
				if (sndrId[i] != null)
					model.setSndrId(sndrId[i]);
				if (ioIndCd[i] != null)
					model.setIoIndCd(ioIndCd[i]);
				if (fmPrdDt[i] != null)
					model.setFmPrdDt(fmPrdDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (invOfcCd[i] != null)
					model.setInvOfcCd(invOfcCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (costOfcCd[i] != null)
					model.setCostOfcCd(costOfcCd[i]);
				if (tmlEdiSoOfcCtyCd[i] != null)
					model.setTmlEdiSoOfcCtyCd(tmlEdiSoOfcCtyCd[i]);
				if (invRjctRmk[i] != null)
					model.setInvRjctRmk(invRjctRmk[i]);
				if (ediMsg[i] != null)
					model.setEdiMsg(ediMsg[i]);
				if (loclCreDt[i] != null)
					model.setLoclCreDt(loclCreDt[i]);
				if (toPrdDt[i] != null)
					model.setToPrdDt(toPrdDt[i]);
				if (whldTaxAmt[i] != null)
					model.setWhldTaxAmt(whldTaxAmt[i]);
				if (tmlInvEdiSeq[i] != null)
					model.setTmlInvEdiSeq(tmlInvEdiSeq[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (vatAmt[i] != null)
					model.setVatAmt(vatAmt[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (tmlInvStsCd[i] != null)
					model.setTmlInvStsCd(tmlInvStsCd[i]);
				if (ediRcvRuleMnSeq[i] != null)
					model.setEdiRcvRuleMnSeq(ediRcvRuleMnSeq[i]);
				if (obVvdCd[i] != null)
					model.setObVvdCd(obVvdCd[i]);
				if (tmlSoSeq[i] != null)
					model.setTmlSoSeq(tmlSoSeq[i]);
				if (fltFileMsgId[i] != null)
					model.setFltFileMsgId(fltFileMsgId[i]);
				if (stoDysIndCd[i] != null)
					model.setStoDysIndCd(stoDysIndCd[i]);
				if (loclUpdDt[i] != null)
					model.setLoclUpdDt(loclUpdDt[i]);
				if (tmlEdiSoSeq[i] != null)
					model.setTmlEdiSoSeq(tmlEdiSoSeq[i]);
				if (ttlInvAmt[i] != null)
					model.setTtlInvAmt(ttlInvAmt[i]);
				if (tmlSoOfcCtyCd[i] != null)
					model.setTmlSoOfcCtyCd(tmlSoOfcCtyCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTesEdiSoHdrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TesEdiSoHdrVO[]
	 */
	public TesEdiSoHdrVO[] getTesEdiSoHdrVOs(){
		TesEdiSoHdrVO[] vos = (TesEdiSoHdrVO[])models.toArray(new TesEdiSoHdrVO[models.size()]);
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
		this.vldChkFlg = this.vldChkFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibVvdCd = this.ibVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvrId = this.rcvrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.atchTpCd = this.atchTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlInvTpCd = this.tmlInvTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.atbDt = this.atbDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issDt = this.issDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlInvRjctStsCd = this.tmlInvRjctStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvDt = this.rcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndrId = this.sndrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioIndCd = this.ioIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmPrdDt = this.fmPrdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invOfcCd = this.invOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costOfcCd = this.costOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlEdiSoOfcCtyCd = this.tmlEdiSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRjctRmk = this.invRjctRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediMsg = this.ediMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCreDt = this.loclCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toPrdDt = this.toPrdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whldTaxAmt = this.whldTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlInvEdiSeq = this.tmlInvEdiSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vatAmt = this.vatAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlInvStsCd = this.tmlInvStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRcvRuleMnSeq = this.ediRcvRuleMnSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obVvdCd = this.obVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlSoSeq = this.tmlSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fltFileMsgId = this.fltFileMsgId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stoDysIndCd = this.stoDysIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclUpdDt = this.loclUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlEdiSoSeq = this.tmlEdiSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlInvAmt = this.ttlInvAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlSoOfcCtyCd = this.tmlSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
