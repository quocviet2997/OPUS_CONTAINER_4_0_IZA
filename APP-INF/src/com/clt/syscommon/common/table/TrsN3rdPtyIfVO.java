/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : TrsN3rdPtyIfVO.java
*@FileTitle : TrsN3rdPtyIfVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.01.07
*@LastModifier : 최종혁
*@LastVersion : 1.0
* 2010.01.07 최종혁 
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
 * @author 최종혁
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TrsN3rdPtyIfVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsN3rdPtyIfVO> models = new ArrayList<TrsN3rdPtyIfVO>();
	
	/* Column Info */
	private String toNodCd = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String n3ptyVndrCntCd = null;
	/* Column Info */
	private String n3ptyCsrCurrCd = null;
	/* Column Info */
	private String trspIfOfcCd = null;
	/* Column Info */
	private String trspSoSeq = null;
	/* Column Info */
	private String cxlFlg = null;
	/* Column Info */
	private String n3ptyTermDt = null;
	/* Column Info */
	private String n3ptyInvDt = null;
	/* Column Info */
	private String blNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String n3ptyDesc = null;
	/* Column Info */
	private String n3ptyOfcCd = null;
	/* Column Info */
	private String n3ptyBilTpCd = null;
	/* Column Info */
	private String trspIfSeq = null;
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String csrNo = null;
	/* Column Info */
	private String n3ptyVndrSeq = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String ifFlg = null;
	/* Column Info */
	private String eqTpszCd = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String ifAmt = null;
	/* Column Info */
	private String trspN3ptyIfStsCd = null;
	/* Column Info */
	private String loclUpdDt = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String fincSkdDirCd = null;
	/* Column Info */
	private String n3ptyAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trspSoOfcCtyCd = null;
	/* Column Info */
	private String vndrCustDivCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String eqNo = null;
	/* Column Info */
	private String acctCd = null;
	/* Column Info */
	private String dorNodCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String ifRmk = null;
	/* Column Info */
	private String loclCreDt = null;
	/* Column Info */
	private String eqKndCd = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String fmNodCd = null;
	/* Column Info */
	private String lgsCostCd = null;
	/* Column Info */
	private String viaNodCd = null;
	/* Column Info */
	private String eqTpCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TrsN3rdPtyIfVO() {}

	public TrsN3rdPtyIfVO(String ibflag, String pagerows, String trspIfOfcCd, String trspIfSeq, String trspSoOfcCtyCd, String trspSoSeq, String trspN3ptyIfStsCd, String invNo, String vndrSeq, String fmNodCd, String toNodCd, String viaNodCd, String dorNodCd, String eqTpCd, String eqTpszCd, String eqNo, String csrNo, String lgsCostCd, String acctCd, String n3ptyBilTpCd, String bkgNo, String blNo, String vslCd, String skdVoyNo, String skdDirCd, String fincSkdDirCd, String vndrCustDivCd, String n3ptyVndrCntCd, String n3ptyVndrSeq, String custCntCd, String custSeq, String n3ptyOfcCd, String currCd, String ifAmt, String ifRmk, String n3ptyInvDt, String n3ptyTermDt, String n3ptyCsrCurrCd, String n3ptyAmt, String n3ptyDesc, String cxlFlg, String ifFlg, String creUsrId, String creDt, String updUsrId, String updDt, String loclCreDt, String loclUpdDt, String eqKndCd) {
		this.toNodCd = toNodCd;
		this.vslCd = vslCd;
		this.n3ptyVndrCntCd = n3ptyVndrCntCd;
		this.n3ptyCsrCurrCd = n3ptyCsrCurrCd;
		this.trspIfOfcCd = trspIfOfcCd;
		this.trspSoSeq = trspSoSeq;
		this.cxlFlg = cxlFlg;
		this.n3ptyTermDt = n3ptyTermDt;
		this.n3ptyInvDt = n3ptyInvDt;
		this.blNo = blNo;
		this.pagerows = pagerows;
		this.n3ptyDesc = n3ptyDesc;
		this.n3ptyOfcCd = n3ptyOfcCd;
		this.n3ptyBilTpCd = n3ptyBilTpCd;
		this.trspIfSeq = trspIfSeq;
		this.custCntCd = custCntCd;
		this.updUsrId = updUsrId;
		this.csrNo = csrNo;
		this.n3ptyVndrSeq = n3ptyVndrSeq;
		this.skdVoyNo = skdVoyNo;
		this.ifFlg = ifFlg;
		this.eqTpszCd = eqTpszCd;
		this.bkgNo = bkgNo;
		this.creUsrId = creUsrId;
		this.vndrSeq = vndrSeq;
		this.ifAmt = ifAmt;
		this.trspN3ptyIfStsCd = trspN3ptyIfStsCd;
		this.loclUpdDt = loclUpdDt;
		this.currCd = currCd;
		this.fincSkdDirCd = fincSkdDirCd;
		this.n3ptyAmt = n3ptyAmt;
		this.creDt = creDt;
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
		this.vndrCustDivCd = vndrCustDivCd;
		this.ibflag = ibflag;
		this.eqNo = eqNo;
		this.acctCd = acctCd;
		this.dorNodCd = dorNodCd;
		this.updDt = updDt;
		this.ifRmk = ifRmk;
		this.loclCreDt = loclCreDt;
		this.eqKndCd = eqKndCd;
		this.custSeq = custSeq;
		this.skdDirCd = skdDirCd;
		this.invNo = invNo;
		this.fmNodCd = fmNodCd;
		this.lgsCostCd = lgsCostCd;
		this.viaNodCd = viaNodCd;
		this.eqTpCd = eqTpCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("to_nod_cd", getToNodCd());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("n3pty_vndr_cnt_cd", getN3ptyVndrCntCd());
		this.hashColumns.put("n3pty_csr_curr_cd", getN3ptyCsrCurrCd());
		this.hashColumns.put("trsp_if_ofc_cd", getTrspIfOfcCd());
		this.hashColumns.put("trsp_so_seq", getTrspSoSeq());
		this.hashColumns.put("cxl_flg", getCxlFlg());
		this.hashColumns.put("n3pty_term_dt", getN3ptyTermDt());
		this.hashColumns.put("n3pty_inv_dt", getN3ptyInvDt());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("n3pty_desc", getN3ptyDesc());
		this.hashColumns.put("n3pty_ofc_cd", getN3ptyOfcCd());
		this.hashColumns.put("n3pty_bil_tp_cd", getN3ptyBilTpCd());
		this.hashColumns.put("trsp_if_seq", getTrspIfSeq());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("csr_no", getCsrNo());
		this.hashColumns.put("n3pty_vndr_seq", getN3ptyVndrSeq());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("if_flg", getIfFlg());
		this.hashColumns.put("eq_tpsz_cd", getEqTpszCd());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("if_amt", getIfAmt());
		this.hashColumns.put("trsp_n3pty_if_sts_cd", getTrspN3ptyIfStsCd());
		this.hashColumns.put("locl_upd_dt", getLoclUpdDt());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("finc_skd_dir_cd", getFincSkdDirCd());
		this.hashColumns.put("n3pty_amt", getN3ptyAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trsp_so_ofc_cty_cd", getTrspSoOfcCtyCd());
		this.hashColumns.put("vndr_cust_div_cd", getVndrCustDivCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("eq_no", getEqNo());
		this.hashColumns.put("acct_cd", getAcctCd());
		this.hashColumns.put("dor_nod_cd", getDorNodCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("if_rmk", getIfRmk());
		this.hashColumns.put("locl_cre_dt", getLoclCreDt());
		this.hashColumns.put("eq_knd_cd", getEqKndCd());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("fm_nod_cd", getFmNodCd());
		this.hashColumns.put("lgs_cost_cd", getLgsCostCd());
		this.hashColumns.put("via_nod_cd", getViaNodCd());
		this.hashColumns.put("eq_tp_cd", getEqTpCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("to_nod_cd", "toNodCd");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("n3pty_vndr_cnt_cd", "n3ptyVndrCntCd");
		this.hashFields.put("n3pty_csr_curr_cd", "n3ptyCsrCurrCd");
		this.hashFields.put("trsp_if_ofc_cd", "trspIfOfcCd");
		this.hashFields.put("trsp_so_seq", "trspSoSeq");
		this.hashFields.put("cxl_flg", "cxlFlg");
		this.hashFields.put("n3pty_term_dt", "n3ptyTermDt");
		this.hashFields.put("n3pty_inv_dt", "n3ptyInvDt");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("n3pty_desc", "n3ptyDesc");
		this.hashFields.put("n3pty_ofc_cd", "n3ptyOfcCd");
		this.hashFields.put("n3pty_bil_tp_cd", "n3ptyBilTpCd");
		this.hashFields.put("trsp_if_seq", "trspIfSeq");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("csr_no", "csrNo");
		this.hashFields.put("n3pty_vndr_seq", "n3ptyVndrSeq");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("if_flg", "ifFlg");
		this.hashFields.put("eq_tpsz_cd", "eqTpszCd");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("if_amt", "ifAmt");
		this.hashFields.put("trsp_n3pty_if_sts_cd", "trspN3ptyIfStsCd");
		this.hashFields.put("locl_upd_dt", "loclUpdDt");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("finc_skd_dir_cd", "fincSkdDirCd");
		this.hashFields.put("n3pty_amt", "n3ptyAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trsp_so_ofc_cty_cd", "trspSoOfcCtyCd");
		this.hashFields.put("vndr_cust_div_cd", "vndrCustDivCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("eq_no", "eqNo");
		this.hashFields.put("acct_cd", "acctCd");
		this.hashFields.put("dor_nod_cd", "dorNodCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("if_rmk", "ifRmk");
		this.hashFields.put("locl_cre_dt", "loclCreDt");
		this.hashFields.put("eq_knd_cd", "eqKndCd");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("fm_nod_cd", "fmNodCd");
		this.hashFields.put("lgs_cost_cd", "lgsCostCd");
		this.hashFields.put("via_nod_cd", "viaNodCd");
		this.hashFields.put("eq_tp_cd", "eqTpCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return toNodCd
	 */
	public String getToNodCd() {
		return this.toNodCd;
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
	 * @return n3ptyVndrCntCd
	 */
	public String getN3ptyVndrCntCd() {
		return this.n3ptyVndrCntCd;
	}
	
	/**
	 * Column Info
	 * @return n3ptyCsrCurrCd
	 */
	public String getN3ptyCsrCurrCd() {
		return this.n3ptyCsrCurrCd;
	}
	
	/**
	 * Column Info
	 * @return trspIfOfcCd
	 */
	public String getTrspIfOfcCd() {
		return this.trspIfOfcCd;
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
	 * @return cxlFlg
	 */
	public String getCxlFlg() {
		return this.cxlFlg;
	}
	
	/**
	 * Column Info
	 * @return n3ptyTermDt
	 */
	public String getN3ptyTermDt() {
		return this.n3ptyTermDt;
	}
	
	/**
	 * Column Info
	 * @return n3ptyInvDt
	 */
	public String getN3ptyInvDt() {
		return this.n3ptyInvDt;
	}
	
	/**
	 * Column Info
	 * @return blNo
	 */
	public String getBlNo() {
		return this.blNo;
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
	 * @return n3ptyDesc
	 */
	public String getN3ptyDesc() {
		return this.n3ptyDesc;
	}
	
	/**
	 * Column Info
	 * @return n3ptyOfcCd
	 */
	public String getN3ptyOfcCd() {
		return this.n3ptyOfcCd;
	}
	
	/**
	 * Column Info
	 * @return n3ptyBilTpCd
	 */
	public String getN3ptyBilTpCd() {
		return this.n3ptyBilTpCd;
	}
	
	/**
	 * Column Info
	 * @return trspIfSeq
	 */
	public String getTrspIfSeq() {
		return this.trspIfSeq;
	}
	
	/**
	 * Column Info
	 * @return custCntCd
	 */
	public String getCustCntCd() {
		return this.custCntCd;
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
	 * @return csrNo
	 */
	public String getCsrNo() {
		return this.csrNo;
	}
	
	/**
	 * Column Info
	 * @return n3ptyVndrSeq
	 */
	public String getN3ptyVndrSeq() {
		return this.n3ptyVndrSeq;
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
	 * @return ifFlg
	 */
	public String getIfFlg() {
		return this.ifFlg;
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
	 * @return vndrSeq
	 */
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	
	/**
	 * Column Info
	 * @return ifAmt
	 */
	public String getIfAmt() {
		return this.ifAmt;
	}
	
	/**
	 * Column Info
	 * @return trspN3ptyIfStsCd
	 */
	public String getTrspN3ptyIfStsCd() {
		return this.trspN3ptyIfStsCd;
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
	 * @return currCd
	 */
	public String getCurrCd() {
		return this.currCd;
	}
	
	/**
	 * Column Info
	 * @return fincSkdDirCd
	 */
	public String getFincSkdDirCd() {
		return this.fincSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return n3ptyAmt
	 */
	public String getN3ptyAmt() {
		return this.n3ptyAmt;
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
	 * @return trspSoOfcCtyCd
	 */
	public String getTrspSoOfcCtyCd() {
		return this.trspSoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return vndrCustDivCd
	 */
	public String getVndrCustDivCd() {
		return this.vndrCustDivCd;
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
	 * @return acctCd
	 */
	public String getAcctCd() {
		return this.acctCd;
	}
	
	/**
	 * Column Info
	 * @return dorNodCd
	 */
	public String getDorNodCd() {
		return this.dorNodCd;
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
	 * @return ifRmk
	 */
	public String getIfRmk() {
		return this.ifRmk;
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
	 * @return eqKndCd
	 */
	public String getEqKndCd() {
		return this.eqKndCd;
	}
	
	/**
	 * Column Info
	 * @return custSeq
	 */
	public String getCustSeq() {
		return this.custSeq;
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
	 * @return invNo
	 */
	public String getInvNo() {
		return this.invNo;
	}
	
	/**
	 * Column Info
	 * @return fmNodCd
	 */
	public String getFmNodCd() {
		return this.fmNodCd;
	}
	
	/**
	 * Column Info
	 * @return lgsCostCd
	 */
	public String getLgsCostCd() {
		return this.lgsCostCd;
	}
	
	/**
	 * Column Info
	 * @return viaNodCd
	 */
	public String getViaNodCd() {
		return this.viaNodCd;
	}
	
	/**
	 * Column Info
	 * @return eqTpCd
	 */
	public String getEqTpCd() {
		return this.eqTpCd;
	}
	

	/**
	 * Column Info
	 * @param toNodCd
	 */
	public void setToNodCd(String toNodCd) {
		this.toNodCd = toNodCd;
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
	 * @param n3ptyVndrCntCd
	 */
	public void setN3ptyVndrCntCd(String n3ptyVndrCntCd) {
		this.n3ptyVndrCntCd = n3ptyVndrCntCd;
	}
	
	/**
	 * Column Info
	 * @param n3ptyCsrCurrCd
	 */
	public void setN3ptyCsrCurrCd(String n3ptyCsrCurrCd) {
		this.n3ptyCsrCurrCd = n3ptyCsrCurrCd;
	}
	
	/**
	 * Column Info
	 * @param trspIfOfcCd
	 */
	public void setTrspIfOfcCd(String trspIfOfcCd) {
		this.trspIfOfcCd = trspIfOfcCd;
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
	 * @param cxlFlg
	 */
	public void setCxlFlg(String cxlFlg) {
		this.cxlFlg = cxlFlg;
	}
	
	/**
	 * Column Info
	 * @param n3ptyTermDt
	 */
	public void setN3ptyTermDt(String n3ptyTermDt) {
		this.n3ptyTermDt = n3ptyTermDt;
	}
	
	/**
	 * Column Info
	 * @param n3ptyInvDt
	 */
	public void setN3ptyInvDt(String n3ptyInvDt) {
		this.n3ptyInvDt = n3ptyInvDt;
	}
	
	/**
	 * Column Info
	 * @param blNo
	 */
	public void setBlNo(String blNo) {
		this.blNo = blNo;
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
	 * @param n3ptyDesc
	 */
	public void setN3ptyDesc(String n3ptyDesc) {
		this.n3ptyDesc = n3ptyDesc;
	}
	
	/**
	 * Column Info
	 * @param n3ptyOfcCd
	 */
	public void setN3ptyOfcCd(String n3ptyOfcCd) {
		this.n3ptyOfcCd = n3ptyOfcCd;
	}
	
	/**
	 * Column Info
	 * @param n3ptyBilTpCd
	 */
	public void setN3ptyBilTpCd(String n3ptyBilTpCd) {
		this.n3ptyBilTpCd = n3ptyBilTpCd;
	}
	
	/**
	 * Column Info
	 * @param trspIfSeq
	 */
	public void setTrspIfSeq(String trspIfSeq) {
		this.trspIfSeq = trspIfSeq;
	}
	
	/**
	 * Column Info
	 * @param custCntCd
	 */
	public void setCustCntCd(String custCntCd) {
		this.custCntCd = custCntCd;
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
	 * @param csrNo
	 */
	public void setCsrNo(String csrNo) {
		this.csrNo = csrNo;
	}
	
	/**
	 * Column Info
	 * @param n3ptyVndrSeq
	 */
	public void setN3ptyVndrSeq(String n3ptyVndrSeq) {
		this.n3ptyVndrSeq = n3ptyVndrSeq;
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
	 * @param ifFlg
	 */
	public void setIfFlg(String ifFlg) {
		this.ifFlg = ifFlg;
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
	 * @param vndrSeq
	 */
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
	}
	
	/**
	 * Column Info
	 * @param ifAmt
	 */
	public void setIfAmt(String ifAmt) {
		this.ifAmt = ifAmt;
	}
	
	/**
	 * Column Info
	 * @param trspN3ptyIfStsCd
	 */
	public void setTrspN3ptyIfStsCd(String trspN3ptyIfStsCd) {
		this.trspN3ptyIfStsCd = trspN3ptyIfStsCd;
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
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	/**
	 * Column Info
	 * @param fincSkdDirCd
	 */
	public void setFincSkdDirCd(String fincSkdDirCd) {
		this.fincSkdDirCd = fincSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param n3ptyAmt
	 */
	public void setN3ptyAmt(String n3ptyAmt) {
		this.n3ptyAmt = n3ptyAmt;
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
	 * @param trspSoOfcCtyCd
	 */
	public void setTrspSoOfcCtyCd(String trspSoOfcCtyCd) {
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param vndrCustDivCd
	 */
	public void setVndrCustDivCd(String vndrCustDivCd) {
		this.vndrCustDivCd = vndrCustDivCd;
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
	 * @param acctCd
	 */
	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;
	}
	
	/**
	 * Column Info
	 * @param dorNodCd
	 */
	public void setDorNodCd(String dorNodCd) {
		this.dorNodCd = dorNodCd;
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
	 * @param ifRmk
	 */
	public void setIfRmk(String ifRmk) {
		this.ifRmk = ifRmk;
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
	 * @param eqKndCd
	 */
	public void setEqKndCd(String eqKndCd) {
		this.eqKndCd = eqKndCd;
	}
	
	/**
	 * Column Info
	 * @param custSeq
	 */
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
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
	 * @param invNo
	 */
	public void setInvNo(String invNo) {
		this.invNo = invNo;
	}
	
	/**
	 * Column Info
	 * @param fmNodCd
	 */
	public void setFmNodCd(String fmNodCd) {
		this.fmNodCd = fmNodCd;
	}
	
	/**
	 * Column Info
	 * @param lgsCostCd
	 */
	public void setLgsCostCd(String lgsCostCd) {
		this.lgsCostCd = lgsCostCd;
	}
	
	/**
	 * Column Info
	 * @param viaNodCd
	 */
	public void setViaNodCd(String viaNodCd) {
		this.viaNodCd = viaNodCd;
	}
	
	/**
	 * Column Info
	 * @param eqTpCd
	 */
	public void setEqTpCd(String eqTpCd) {
		this.eqTpCd = eqTpCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setToNodCd(JSPUtil.getParameter(request, "to_nod_cd", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setN3ptyVndrCntCd(JSPUtil.getParameter(request, "n3pty_vndr_cnt_cd", ""));
		setN3ptyCsrCurrCd(JSPUtil.getParameter(request, "n3pty_csr_curr_cd", ""));
		setTrspIfOfcCd(JSPUtil.getParameter(request, "trsp_if_ofc_cd", ""));
		setTrspSoSeq(JSPUtil.getParameter(request, "trsp_so_seq", ""));
		setCxlFlg(JSPUtil.getParameter(request, "cxl_flg", ""));
		setN3ptyTermDt(JSPUtil.getParameter(request, "n3pty_term_dt", ""));
		setN3ptyInvDt(JSPUtil.getParameter(request, "n3pty_inv_dt", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setN3ptyDesc(JSPUtil.getParameter(request, "n3pty_desc", ""));
		setN3ptyOfcCd(JSPUtil.getParameter(request, "n3pty_ofc_cd", ""));
		setN3ptyBilTpCd(JSPUtil.getParameter(request, "n3pty_bil_tp_cd", ""));
		setTrspIfSeq(JSPUtil.getParameter(request, "trsp_if_seq", ""));
		setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCsrNo(JSPUtil.getParameter(request, "csr_no", ""));
		setN3ptyVndrSeq(JSPUtil.getParameter(request, "n3pty_vndr_seq", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setIfFlg(JSPUtil.getParameter(request, "if_flg", ""));
		setEqTpszCd(JSPUtil.getParameter(request, "eq_tpsz_cd", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setIfAmt(JSPUtil.getParameter(request, "if_amt", ""));
		setTrspN3ptyIfStsCd(JSPUtil.getParameter(request, "trsp_n3pty_if_sts_cd", ""));
		setLoclUpdDt(JSPUtil.getParameter(request, "locl_upd_dt", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setFincSkdDirCd(JSPUtil.getParameter(request, "finc_skd_dir_cd", ""));
		setN3ptyAmt(JSPUtil.getParameter(request, "n3pty_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrspSoOfcCtyCd(JSPUtil.getParameter(request, "trsp_so_ofc_cty_cd", ""));
		setVndrCustDivCd(JSPUtil.getParameter(request, "vndr_cust_div_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setEqNo(JSPUtil.getParameter(request, "eq_no", ""));
		setAcctCd(JSPUtil.getParameter(request, "acct_cd", ""));
		setDorNodCd(JSPUtil.getParameter(request, "dor_nod_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setIfRmk(JSPUtil.getParameter(request, "if_rmk", ""));
		setLoclCreDt(JSPUtil.getParameter(request, "locl_cre_dt", ""));
		setEqKndCd(JSPUtil.getParameter(request, "eq_knd_cd", ""));
		setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setInvNo(JSPUtil.getParameter(request, "inv_no", ""));
		setFmNodCd(JSPUtil.getParameter(request, "fm_nod_cd", ""));
		setLgsCostCd(JSPUtil.getParameter(request, "lgs_cost_cd", ""));
		setViaNodCd(JSPUtil.getParameter(request, "via_nod_cd", ""));
		setEqTpCd(JSPUtil.getParameter(request, "eq_tp_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsN3rdPtyIfVO[]
	 */
	public TrsN3rdPtyIfVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsN3rdPtyIfVO[]
	 */
	public TrsN3rdPtyIfVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsN3rdPtyIfVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] toNodCd = (JSPUtil.getParameter(request, prefix	+ "to_nod_cd", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] n3ptyVndrCntCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_vndr_cnt_cd", length));
			String[] n3ptyCsrCurrCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_csr_curr_cd", length));
			String[] trspIfOfcCd = (JSPUtil.getParameter(request, prefix	+ "trsp_if_ofc_cd", length));
			String[] trspSoSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_so_seq", length));
			String[] cxlFlg = (JSPUtil.getParameter(request, prefix	+ "cxl_flg", length));
			String[] n3ptyTermDt = (JSPUtil.getParameter(request, prefix	+ "n3pty_term_dt", length));
			String[] n3ptyInvDt = (JSPUtil.getParameter(request, prefix	+ "n3pty_inv_dt", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] n3ptyDesc = (JSPUtil.getParameter(request, prefix	+ "n3pty_desc", length));
			String[] n3ptyOfcCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_ofc_cd", length));
			String[] n3ptyBilTpCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_bil_tp_cd", length));
			String[] trspIfSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_if_seq", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] csrNo = (JSPUtil.getParameter(request, prefix	+ "csr_no", length));
			String[] n3ptyVndrSeq = (JSPUtil.getParameter(request, prefix	+ "n3pty_vndr_seq", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] ifFlg = (JSPUtil.getParameter(request, prefix	+ "if_flg", length));
			String[] eqTpszCd = (JSPUtil.getParameter(request, prefix	+ "eq_tpsz_cd", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] ifAmt = (JSPUtil.getParameter(request, prefix	+ "if_amt", length));
			String[] trspN3ptyIfStsCd = (JSPUtil.getParameter(request, prefix	+ "trsp_n3pty_if_sts_cd", length));
			String[] loclUpdDt = (JSPUtil.getParameter(request, prefix	+ "locl_upd_dt", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] fincSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "finc_skd_dir_cd", length));
			String[] n3ptyAmt = (JSPUtil.getParameter(request, prefix	+ "n3pty_amt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trspSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_so_ofc_cty_cd", length));
			String[] vndrCustDivCd = (JSPUtil.getParameter(request, prefix	+ "vndr_cust_div_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] eqNo = (JSPUtil.getParameter(request, prefix	+ "eq_no", length));
			String[] acctCd = (JSPUtil.getParameter(request, prefix	+ "acct_cd", length));
			String[] dorNodCd = (JSPUtil.getParameter(request, prefix	+ "dor_nod_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] ifRmk = (JSPUtil.getParameter(request, prefix	+ "if_rmk", length));
			String[] loclCreDt = (JSPUtil.getParameter(request, prefix	+ "locl_cre_dt", length));
			String[] eqKndCd = (JSPUtil.getParameter(request, prefix	+ "eq_knd_cd", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] fmNodCd = (JSPUtil.getParameter(request, prefix	+ "fm_nod_cd", length));
			String[] lgsCostCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd", length));
			String[] viaNodCd = (JSPUtil.getParameter(request, prefix	+ "via_nod_cd", length));
			String[] eqTpCd = (JSPUtil.getParameter(request, prefix	+ "eq_tp_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsN3rdPtyIfVO();
				if (toNodCd[i] != null)
					model.setToNodCd(toNodCd[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (n3ptyVndrCntCd[i] != null)
					model.setN3ptyVndrCntCd(n3ptyVndrCntCd[i]);
				if (n3ptyCsrCurrCd[i] != null)
					model.setN3ptyCsrCurrCd(n3ptyCsrCurrCd[i]);
				if (trspIfOfcCd[i] != null)
					model.setTrspIfOfcCd(trspIfOfcCd[i]);
				if (trspSoSeq[i] != null)
					model.setTrspSoSeq(trspSoSeq[i]);
				if (cxlFlg[i] != null)
					model.setCxlFlg(cxlFlg[i]);
				if (n3ptyTermDt[i] != null)
					model.setN3ptyTermDt(n3ptyTermDt[i]);
				if (n3ptyInvDt[i] != null)
					model.setN3ptyInvDt(n3ptyInvDt[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (n3ptyDesc[i] != null)
					model.setN3ptyDesc(n3ptyDesc[i]);
				if (n3ptyOfcCd[i] != null)
					model.setN3ptyOfcCd(n3ptyOfcCd[i]);
				if (n3ptyBilTpCd[i] != null)
					model.setN3ptyBilTpCd(n3ptyBilTpCd[i]);
				if (trspIfSeq[i] != null)
					model.setTrspIfSeq(trspIfSeq[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (csrNo[i] != null)
					model.setCsrNo(csrNo[i]);
				if (n3ptyVndrSeq[i] != null)
					model.setN3ptyVndrSeq(n3ptyVndrSeq[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (ifFlg[i] != null)
					model.setIfFlg(ifFlg[i]);
				if (eqTpszCd[i] != null)
					model.setEqTpszCd(eqTpszCd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (ifAmt[i] != null)
					model.setIfAmt(ifAmt[i]);
				if (trspN3ptyIfStsCd[i] != null)
					model.setTrspN3ptyIfStsCd(trspN3ptyIfStsCd[i]);
				if (loclUpdDt[i] != null)
					model.setLoclUpdDt(loclUpdDt[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (fincSkdDirCd[i] != null)
					model.setFincSkdDirCd(fincSkdDirCd[i]);
				if (n3ptyAmt[i] != null)
					model.setN3ptyAmt(n3ptyAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trspSoOfcCtyCd[i] != null)
					model.setTrspSoOfcCtyCd(trspSoOfcCtyCd[i]);
				if (vndrCustDivCd[i] != null)
					model.setVndrCustDivCd(vndrCustDivCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (eqNo[i] != null)
					model.setEqNo(eqNo[i]);
				if (acctCd[i] != null)
					model.setAcctCd(acctCd[i]);
				if (dorNodCd[i] != null)
					model.setDorNodCd(dorNodCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (ifRmk[i] != null)
					model.setIfRmk(ifRmk[i]);
				if (loclCreDt[i] != null)
					model.setLoclCreDt(loclCreDt[i]);
				if (eqKndCd[i] != null)
					model.setEqKndCd(eqKndCd[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (fmNodCd[i] != null)
					model.setFmNodCd(fmNodCd[i]);
				if (lgsCostCd[i] != null)
					model.setLgsCostCd(lgsCostCd[i]);
				if (viaNodCd[i] != null)
					model.setViaNodCd(viaNodCd[i]);
				if (eqTpCd[i] != null)
					model.setEqTpCd(eqTpCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsN3rdPtyIfVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsN3rdPtyIfVO[]
	 */
	public TrsN3rdPtyIfVO[] getTrsN3rdPtyIfVOs(){
		TrsN3rdPtyIfVO[] vos = (TrsN3rdPtyIfVO[])models.toArray(new TrsN3rdPtyIfVO[models.size()]);
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
		this.toNodCd = this.toNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyVndrCntCd = this.n3ptyVndrCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyCsrCurrCd = this.n3ptyCsrCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspIfOfcCd = this.trspIfOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoSeq = this.trspSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlFlg = this.cxlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyTermDt = this.n3ptyTermDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyInvDt = this.n3ptyInvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyDesc = this.n3ptyDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyOfcCd = this.n3ptyOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyBilTpCd = this.n3ptyBilTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspIfSeq = this.trspIfSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrNo = this.csrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyVndrSeq = this.n3ptyVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifFlg = this.ifFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqTpszCd = this.eqTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifAmt = this.ifAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspN3ptyIfStsCd = this.trspN3ptyIfStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclUpdDt = this.loclUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincSkdDirCd = this.fincSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyAmt = this.n3ptyAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoOfcCtyCd = this.trspSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrCustDivCd = this.vndrCustDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqNo = this.eqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctCd = this.acctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dorNodCd = this.dorNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifRmk = this.ifRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCreDt = this.loclCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqKndCd = this.eqKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmNodCd = this.fmNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCd = this.lgsCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.viaNodCd = this.viaNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqTpCd = this.eqTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
