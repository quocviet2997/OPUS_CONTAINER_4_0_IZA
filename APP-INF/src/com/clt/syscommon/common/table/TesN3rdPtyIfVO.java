/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TesN3rdPtyIfVO.java
*@FileTitle : TesN3rdPtyIfVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.20
*@LastModifier : yOng hO lEE
*@LastVersion : 1.0
* 2009.11.20 yOng hO lEE 
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
 * @author yOng hO lEE
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TesN3rdPtyIfVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TesN3rdPtyIfVO> models = new ArrayList<TesN3rdPtyIfVO>();
	
	/* Column Info */
	private String vndrCntCd = null;
	/* Column Info */
	private String n3ptyCsrCurrCd = null;
	/* Column Info */
	private String glDt = null;
	/* Column Info */
	private String cxlFlg = null;
	/* Column Info */
	private String n3ptyTermDt = null;
	/* Column Info */
	private String n3ptyInvDt = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String tmlInvTpCd = null;
	/* Column Info */
	private String fincVslCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String n3ptyDesc = null;
	/* Column Info */
	private String n3ptyOfcCd = null;
	/* Column Info */
	private String n3ptyBilTpCd = null;
	/* Column Info */
	private String vvdCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String tmlSoDtlSeq = null;
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String csrNo = null;
	/* Column Info */
	private String tmlN3ptyIfStsCd = null;
	/* Column Info */
	private String n3ptyVndrSeq = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String tmlN3ptyTpCd = null;
	/* Column Info */
	private String ifAmt = null;
	/* Column Info */
	private String tmlSoSeq = null;
	/* Column Info */
	private String loclUpdDt = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String errInvNo = null;
	/* Column Info */
	private String fincSkdDirCd = null;
	/* Column Info */
	private String n3ptyAmt = null;
	/* Column Info */
	private String tmlIfSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String tmlCrrCd = null;
	/* Column Info */
	private String calcCostGrpCd = null;
	/* Column Info */
	private String vndrCustDivCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String acctCd = null;
	/* Column Info */
	private String tmlIfOfcCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String ifRmk = null;
	/* Column Info */
	private String fincSkdVoyNo = null;
	/* Column Info */
	private String refVndrSeq = null;
	/* Column Info */
	private String loclCreDt = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String gnteDivFlg = null;
	/* Column Info */
	private String ydCd = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String lgsCostCd = null;
	/* Column Info */
	private String tmlSoOfcCtyCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TesN3rdPtyIfVO() {}

	public TesN3rdPtyIfVO(String ibflag, String pagerows, String tmlIfOfcCd, String tmlIfSeq, String tmlN3ptyTpCd, String tmlN3ptyIfStsCd, String calcCostGrpCd, String tmlInvTpCd, String invNo, String errInvNo, String vndrSeq, String ydCd, String lgsCostCd, String acctCd, String tmlSoOfcCtyCd, String tmlSoSeq, String tmlSoDtlSeq, String csrNo, String n3ptyBilTpCd, String cntrNo, String cntrTpszCd, String bkgNo, String blNo, String fincVslCd, String fincSkdVoyNo, String fincSkdDirCd, String ioBndCd, String refVndrSeq, String tmlCrrCd, String vndrCustDivCd, String vndrCntCd, String n3ptyVndrSeq, String custCntCd, String custSeq, String n3ptyOfcCd, String currCd, String ifAmt, String ifRmk, String n3ptyInvDt, String n3ptyTermDt, String n3ptyCsrCurrCd, String n3ptyAmt, String n3ptyDesc, String cxlFlg, String glDt, String vvdCd, String creUsrId, String creDt, String updUsrId, String updDt, String loclCreDt, String loclUpdDt, String gnteDivFlg) {
		this.vndrCntCd = vndrCntCd;
		this.n3ptyCsrCurrCd = n3ptyCsrCurrCd;
		this.glDt = glDt;
		this.cxlFlg = cxlFlg;
		this.n3ptyTermDt = n3ptyTermDt;
		this.n3ptyInvDt = n3ptyInvDt;
		this.blNo = blNo;
		this.tmlInvTpCd = tmlInvTpCd;
		this.fincVslCd = fincVslCd;
		this.pagerows = pagerows;
		this.n3ptyDesc = n3ptyDesc;
		this.n3ptyOfcCd = n3ptyOfcCd;
		this.n3ptyBilTpCd = n3ptyBilTpCd;
		this.vvdCd = vvdCd;
		this.cntrTpszCd = cntrTpszCd;
		this.tmlSoDtlSeq = tmlSoDtlSeq;
		this.custCntCd = custCntCd;
		this.updUsrId = updUsrId;
		this.csrNo = csrNo;
		this.tmlN3ptyIfStsCd = tmlN3ptyIfStsCd;
		this.n3ptyVndrSeq = n3ptyVndrSeq;
		this.bkgNo = bkgNo;
		this.creUsrId = creUsrId;
		this.vndrSeq = vndrSeq;
		this.tmlN3ptyTpCd = tmlN3ptyTpCd;
		this.ifAmt = ifAmt;
		this.tmlSoSeq = tmlSoSeq;
		this.loclUpdDt = loclUpdDt;
		this.currCd = currCd;
		this.errInvNo = errInvNo;
		this.fincSkdDirCd = fincSkdDirCd;
		this.n3ptyAmt = n3ptyAmt;
		this.tmlIfSeq = tmlIfSeq;
		this.creDt = creDt;
		this.tmlCrrCd = tmlCrrCd;
		this.calcCostGrpCd = calcCostGrpCd;
		this.vndrCustDivCd = vndrCustDivCd;
		this.ibflag = ibflag;
		this.acctCd = acctCd;
		this.tmlIfOfcCd = tmlIfOfcCd;
		this.updDt = updDt;
		this.ifRmk = ifRmk;
		this.fincSkdVoyNo = fincSkdVoyNo;
		this.refVndrSeq = refVndrSeq;
		this.loclCreDt = loclCreDt;
		this.ioBndCd = ioBndCd;
		this.custSeq = custSeq;
		this.invNo = invNo;
		this.gnteDivFlg = gnteDivFlg;
		this.ydCd = ydCd;
		this.cntrNo = cntrNo;
		this.lgsCostCd = lgsCostCd;
		this.tmlSoOfcCtyCd = tmlSoOfcCtyCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vndr_cnt_cd", getVndrCntCd());
		this.hashColumns.put("n3pty_csr_curr_cd", getN3ptyCsrCurrCd());
		this.hashColumns.put("gl_dt", getGlDt());
		this.hashColumns.put("cxl_flg", getCxlFlg());
		this.hashColumns.put("n3pty_term_dt", getN3ptyTermDt());
		this.hashColumns.put("n3pty_inv_dt", getN3ptyInvDt());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("tml_inv_tp_cd", getTmlInvTpCd());
		this.hashColumns.put("finc_vsl_cd", getFincVslCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("n3pty_desc", getN3ptyDesc());
		this.hashColumns.put("n3pty_ofc_cd", getN3ptyOfcCd());
		this.hashColumns.put("n3pty_bil_tp_cd", getN3ptyBilTpCd());
		this.hashColumns.put("vvd_cd", getVvdCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("tml_so_dtl_seq", getTmlSoDtlSeq());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("csr_no", getCsrNo());
		this.hashColumns.put("tml_n3pty_if_sts_cd", getTmlN3ptyIfStsCd());
		this.hashColumns.put("n3pty_vndr_seq", getN3ptyVndrSeq());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("tml_n3pty_tp_cd", getTmlN3ptyTpCd());
		this.hashColumns.put("if_amt", getIfAmt());
		this.hashColumns.put("tml_so_seq", getTmlSoSeq());
		this.hashColumns.put("locl_upd_dt", getLoclUpdDt());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("err_inv_no", getErrInvNo());
		this.hashColumns.put("finc_skd_dir_cd", getFincSkdDirCd());
		this.hashColumns.put("n3pty_amt", getN3ptyAmt());
		this.hashColumns.put("tml_if_seq", getTmlIfSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("tml_crr_cd", getTmlCrrCd());
		this.hashColumns.put("calc_cost_grp_cd", getCalcCostGrpCd());
		this.hashColumns.put("vndr_cust_div_cd", getVndrCustDivCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("acct_cd", getAcctCd());
		this.hashColumns.put("tml_if_ofc_cd", getTmlIfOfcCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("if_rmk", getIfRmk());
		this.hashColumns.put("finc_skd_voy_no", getFincSkdVoyNo());
		this.hashColumns.put("ref_vndr_seq", getRefVndrSeq());
		this.hashColumns.put("locl_cre_dt", getLoclCreDt());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("gnte_div_flg", getGnteDivFlg());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("lgs_cost_cd", getLgsCostCd());
		this.hashColumns.put("tml_so_ofc_cty_cd", getTmlSoOfcCtyCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vndr_cnt_cd", "vndrCntCd");
		this.hashFields.put("n3pty_csr_curr_cd", "n3ptyCsrCurrCd");
		this.hashFields.put("gl_dt", "glDt");
		this.hashFields.put("cxl_flg", "cxlFlg");
		this.hashFields.put("n3pty_term_dt", "n3ptyTermDt");
		this.hashFields.put("n3pty_inv_dt", "n3ptyInvDt");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("tml_inv_tp_cd", "tmlInvTpCd");
		this.hashFields.put("finc_vsl_cd", "fincVslCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("n3pty_desc", "n3ptyDesc");
		this.hashFields.put("n3pty_ofc_cd", "n3ptyOfcCd");
		this.hashFields.put("n3pty_bil_tp_cd", "n3ptyBilTpCd");
		this.hashFields.put("vvd_cd", "vvdCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("tml_so_dtl_seq", "tmlSoDtlSeq");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("csr_no", "csrNo");
		this.hashFields.put("tml_n3pty_if_sts_cd", "tmlN3ptyIfStsCd");
		this.hashFields.put("n3pty_vndr_seq", "n3ptyVndrSeq");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("tml_n3pty_tp_cd", "tmlN3ptyTpCd");
		this.hashFields.put("if_amt", "ifAmt");
		this.hashFields.put("tml_so_seq", "tmlSoSeq");
		this.hashFields.put("locl_upd_dt", "loclUpdDt");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("err_inv_no", "errInvNo");
		this.hashFields.put("finc_skd_dir_cd", "fincSkdDirCd");
		this.hashFields.put("n3pty_amt", "n3ptyAmt");
		this.hashFields.put("tml_if_seq", "tmlIfSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("tml_crr_cd", "tmlCrrCd");
		this.hashFields.put("calc_cost_grp_cd", "calcCostGrpCd");
		this.hashFields.put("vndr_cust_div_cd", "vndrCustDivCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("acct_cd", "acctCd");
		this.hashFields.put("tml_if_ofc_cd", "tmlIfOfcCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("if_rmk", "ifRmk");
		this.hashFields.put("finc_skd_voy_no", "fincSkdVoyNo");
		this.hashFields.put("ref_vndr_seq", "refVndrSeq");
		this.hashFields.put("locl_cre_dt", "loclCreDt");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("gnte_div_flg", "gnteDivFlg");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("lgs_cost_cd", "lgsCostCd");
		this.hashFields.put("tml_so_ofc_cty_cd", "tmlSoOfcCtyCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return vndrCntCd
	 */
	public String getVndrCntCd() {
		return this.vndrCntCd;
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
	 * @return glDt
	 */
	public String getGlDt() {
		return this.glDt;
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
	 * Column Info
	 * @return tmlInvTpCd
	 */
	public String getTmlInvTpCd() {
		return this.tmlInvTpCd;
	}
	
	/**
	 * Column Info
	 * @return fincVslCd
	 */
	public String getFincVslCd() {
		return this.fincVslCd;
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
	 * @return vvdCd
	 */
	public String getVvdCd() {
		return this.vvdCd;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return tmlSoDtlSeq
	 */
	public String getTmlSoDtlSeq() {
		return this.tmlSoDtlSeq;
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
	 * @return tmlN3ptyIfStsCd
	 */
	public String getTmlN3ptyIfStsCd() {
		return this.tmlN3ptyIfStsCd;
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
	 * @return tmlN3ptyTpCd
	 */
	public String getTmlN3ptyTpCd() {
		return this.tmlN3ptyTpCd;
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
	 * @return tmlSoSeq
	 */
	public String getTmlSoSeq() {
		return this.tmlSoSeq;
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
	 * @return errInvNo
	 */
	public String getErrInvNo() {
		return this.errInvNo;
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
	 * @return tmlIfSeq
	 */
	public String getTmlIfSeq() {
		return this.tmlIfSeq;
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
	 * @return tmlCrrCd
	 */
	public String getTmlCrrCd() {
		return this.tmlCrrCd;
	}
	
	/**
	 * Column Info
	 * @return calcCostGrpCd
	 */
	public String getCalcCostGrpCd() {
		return this.calcCostGrpCd;
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
	 * @return acctCd
	 */
	public String getAcctCd() {
		return this.acctCd;
	}
	
	/**
	 * Column Info
	 * @return tmlIfOfcCd
	 */
	public String getTmlIfOfcCd() {
		return this.tmlIfOfcCd;
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
	 * @return fincSkdVoyNo
	 */
	public String getFincSkdVoyNo() {
		return this.fincSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return refVndrSeq
	 */
	public String getRefVndrSeq() {
		return this.refVndrSeq;
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
	 * @return ioBndCd
	 */
	public String getIoBndCd() {
		return this.ioBndCd;
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
	 * @return invNo
	 */
	public String getInvNo() {
		return this.invNo;
	}
	
	/**
	 * Column Info
	 * @return gnteDivFlg
	 */
	public String getGnteDivFlg() {
		return this.gnteDivFlg;
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
	 * @return cntrNo
	 */
	public String getCntrNo() {
		return this.cntrNo;
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
	 * @return tmlSoOfcCtyCd
	 */
	public String getTmlSoOfcCtyCd() {
		return this.tmlSoOfcCtyCd;
	}
	

	/**
	 * Column Info
	 * @param vndrCntCd
	 */
	public void setVndrCntCd(String vndrCntCd) {
		this.vndrCntCd = vndrCntCd;
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
	 * @param glDt
	 */
	public void setGlDt(String glDt) {
		this.glDt = glDt;
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
	 * Column Info
	 * @param tmlInvTpCd
	 */
	public void setTmlInvTpCd(String tmlInvTpCd) {
		this.tmlInvTpCd = tmlInvTpCd;
	}
	
	/**
	 * Column Info
	 * @param fincVslCd
	 */
	public void setFincVslCd(String fincVslCd) {
		this.fincVslCd = fincVslCd;
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
	 * @param vvdCd
	 */
	public void setVvdCd(String vvdCd) {
		this.vvdCd = vvdCd;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param tmlSoDtlSeq
	 */
	public void setTmlSoDtlSeq(String tmlSoDtlSeq) {
		this.tmlSoDtlSeq = tmlSoDtlSeq;
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
	 * @param tmlN3ptyIfStsCd
	 */
	public void setTmlN3ptyIfStsCd(String tmlN3ptyIfStsCd) {
		this.tmlN3ptyIfStsCd = tmlN3ptyIfStsCd;
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
	 * @param tmlN3ptyTpCd
	 */
	public void setTmlN3ptyTpCd(String tmlN3ptyTpCd) {
		this.tmlN3ptyTpCd = tmlN3ptyTpCd;
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
	 * @param tmlSoSeq
	 */
	public void setTmlSoSeq(String tmlSoSeq) {
		this.tmlSoSeq = tmlSoSeq;
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
	 * @param errInvNo
	 */
	public void setErrInvNo(String errInvNo) {
		this.errInvNo = errInvNo;
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
	 * @param tmlIfSeq
	 */
	public void setTmlIfSeq(String tmlIfSeq) {
		this.tmlIfSeq = tmlIfSeq;
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
	 * @param tmlCrrCd
	 */
	public void setTmlCrrCd(String tmlCrrCd) {
		this.tmlCrrCd = tmlCrrCd;
	}
	
	/**
	 * Column Info
	 * @param calcCostGrpCd
	 */
	public void setCalcCostGrpCd(String calcCostGrpCd) {
		this.calcCostGrpCd = calcCostGrpCd;
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
	 * @param acctCd
	 */
	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;
	}
	
	/**
	 * Column Info
	 * @param tmlIfOfcCd
	 */
	public void setTmlIfOfcCd(String tmlIfOfcCd) {
		this.tmlIfOfcCd = tmlIfOfcCd;
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
	 * @param fincSkdVoyNo
	 */
	public void setFincSkdVoyNo(String fincSkdVoyNo) {
		this.fincSkdVoyNo = fincSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param refVndrSeq
	 */
	public void setRefVndrSeq(String refVndrSeq) {
		this.refVndrSeq = refVndrSeq;
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
	 * @param ioBndCd
	 */
	public void setIoBndCd(String ioBndCd) {
		this.ioBndCd = ioBndCd;
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
	 * @param invNo
	 */
	public void setInvNo(String invNo) {
		this.invNo = invNo;
	}
	
	/**
	 * Column Info
	 * @param gnteDivFlg
	 */
	public void setGnteDivFlg(String gnteDivFlg) {
		this.gnteDivFlg = gnteDivFlg;
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
	 * @param cntrNo
	 */
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
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
		setVndrCntCd(JSPUtil.getParameter(request, "vndr_cnt_cd", ""));
		setN3ptyCsrCurrCd(JSPUtil.getParameter(request, "n3pty_csr_curr_cd", ""));
		setGlDt(JSPUtil.getParameter(request, "gl_dt", ""));
		setCxlFlg(JSPUtil.getParameter(request, "cxl_flg", ""));
		setN3ptyTermDt(JSPUtil.getParameter(request, "n3pty_term_dt", ""));
		setN3ptyInvDt(JSPUtil.getParameter(request, "n3pty_inv_dt", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setTmlInvTpCd(JSPUtil.getParameter(request, "tml_inv_tp_cd", ""));
		setFincVslCd(JSPUtil.getParameter(request, "finc_vsl_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setN3ptyDesc(JSPUtil.getParameter(request, "n3pty_desc", ""));
		setN3ptyOfcCd(JSPUtil.getParameter(request, "n3pty_ofc_cd", ""));
		setN3ptyBilTpCd(JSPUtil.getParameter(request, "n3pty_bil_tp_cd", ""));
		setVvdCd(JSPUtil.getParameter(request, "vvd_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setTmlSoDtlSeq(JSPUtil.getParameter(request, "tml_so_dtl_seq", ""));
		setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCsrNo(JSPUtil.getParameter(request, "csr_no", ""));
		setTmlN3ptyIfStsCd(JSPUtil.getParameter(request, "tml_n3pty_if_sts_cd", ""));
		setN3ptyVndrSeq(JSPUtil.getParameter(request, "n3pty_vndr_seq", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setTmlN3ptyTpCd(JSPUtil.getParameter(request, "tml_n3pty_tp_cd", ""));
		setIfAmt(JSPUtil.getParameter(request, "if_amt", ""));
		setTmlSoSeq(JSPUtil.getParameter(request, "tml_so_seq", ""));
		setLoclUpdDt(JSPUtil.getParameter(request, "locl_upd_dt", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setErrInvNo(JSPUtil.getParameter(request, "err_inv_no", ""));
		setFincSkdDirCd(JSPUtil.getParameter(request, "finc_skd_dir_cd", ""));
		setN3ptyAmt(JSPUtil.getParameter(request, "n3pty_amt", ""));
		setTmlIfSeq(JSPUtil.getParameter(request, "tml_if_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTmlCrrCd(JSPUtil.getParameter(request, "tml_crr_cd", ""));
		setCalcCostGrpCd(JSPUtil.getParameter(request, "calc_cost_grp_cd", ""));
		setVndrCustDivCd(JSPUtil.getParameter(request, "vndr_cust_div_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAcctCd(JSPUtil.getParameter(request, "acct_cd", ""));
		setTmlIfOfcCd(JSPUtil.getParameter(request, "tml_if_ofc_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setIfRmk(JSPUtil.getParameter(request, "if_rmk", ""));
		setFincSkdVoyNo(JSPUtil.getParameter(request, "finc_skd_voy_no", ""));
		setRefVndrSeq(JSPUtil.getParameter(request, "ref_vndr_seq", ""));
		setLoclCreDt(JSPUtil.getParameter(request, "locl_cre_dt", ""));
		setIoBndCd(JSPUtil.getParameter(request, "io_bnd_cd", ""));
		setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
		setInvNo(JSPUtil.getParameter(request, "inv_no", ""));
		setGnteDivFlg(JSPUtil.getParameter(request, "gnte_div_flg", ""));
		setYdCd(JSPUtil.getParameter(request, "yd_cd", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setLgsCostCd(JSPUtil.getParameter(request, "lgs_cost_cd", ""));
		setTmlSoOfcCtyCd(JSPUtil.getParameter(request, "tml_so_ofc_cty_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesN3rdPtyIfVO[]
	 */
	public TesN3rdPtyIfVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesN3rdPtyIfVO[]
	 */
	public TesN3rdPtyIfVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TesN3rdPtyIfVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vndrCntCd = (JSPUtil.getParameter(request, prefix	+ "vndr_cnt_cd", length));
			String[] n3ptyCsrCurrCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_csr_curr_cd", length));
			String[] glDt = (JSPUtil.getParameter(request, prefix	+ "gl_dt", length));
			String[] cxlFlg = (JSPUtil.getParameter(request, prefix	+ "cxl_flg", length));
			String[] n3ptyTermDt = (JSPUtil.getParameter(request, prefix	+ "n3pty_term_dt", length));
			String[] n3ptyInvDt = (JSPUtil.getParameter(request, prefix	+ "n3pty_inv_dt", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] tmlInvTpCd = (JSPUtil.getParameter(request, prefix	+ "tml_inv_tp_cd", length));
			String[] fincVslCd = (JSPUtil.getParameter(request, prefix	+ "finc_vsl_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] n3ptyDesc = (JSPUtil.getParameter(request, prefix	+ "n3pty_desc", length));
			String[] n3ptyOfcCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_ofc_cd", length));
			String[] n3ptyBilTpCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_bil_tp_cd", length));
			String[] vvdCd = (JSPUtil.getParameter(request, prefix	+ "vvd_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] tmlSoDtlSeq = (JSPUtil.getParameter(request, prefix	+ "tml_so_dtl_seq", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] csrNo = (JSPUtil.getParameter(request, prefix	+ "csr_no", length));
			String[] tmlN3ptyIfStsCd = (JSPUtil.getParameter(request, prefix	+ "tml_n3pty_if_sts_cd", length));
			String[] n3ptyVndrSeq = (JSPUtil.getParameter(request, prefix	+ "n3pty_vndr_seq", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] tmlN3ptyTpCd = (JSPUtil.getParameter(request, prefix	+ "tml_n3pty_tp_cd", length));
			String[] ifAmt = (JSPUtil.getParameter(request, prefix	+ "if_amt", length));
			String[] tmlSoSeq = (JSPUtil.getParameter(request, prefix	+ "tml_so_seq", length));
			String[] loclUpdDt = (JSPUtil.getParameter(request, prefix	+ "locl_upd_dt", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] errInvNo = (JSPUtil.getParameter(request, prefix	+ "err_inv_no", length));
			String[] fincSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "finc_skd_dir_cd", length));
			String[] n3ptyAmt = (JSPUtil.getParameter(request, prefix	+ "n3pty_amt", length));
			String[] tmlIfSeq = (JSPUtil.getParameter(request, prefix	+ "tml_if_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] tmlCrrCd = (JSPUtil.getParameter(request, prefix	+ "tml_crr_cd", length));
			String[] calcCostGrpCd = (JSPUtil.getParameter(request, prefix	+ "calc_cost_grp_cd", length));
			String[] vndrCustDivCd = (JSPUtil.getParameter(request, prefix	+ "vndr_cust_div_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] acctCd = (JSPUtil.getParameter(request, prefix	+ "acct_cd", length));
			String[] tmlIfOfcCd = (JSPUtil.getParameter(request, prefix	+ "tml_if_ofc_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] ifRmk = (JSPUtil.getParameter(request, prefix	+ "if_rmk", length));
			String[] fincSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "finc_skd_voy_no", length));
			String[] refVndrSeq = (JSPUtil.getParameter(request, prefix	+ "ref_vndr_seq", length));
			String[] loclCreDt = (JSPUtil.getParameter(request, prefix	+ "locl_cre_dt", length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] gnteDivFlg = (JSPUtil.getParameter(request, prefix	+ "gnte_div_flg", length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] lgsCostCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd", length));
			String[] tmlSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "tml_so_ofc_cty_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new TesN3rdPtyIfVO();
				if (vndrCntCd[i] != null)
					model.setVndrCntCd(vndrCntCd[i]);
				if (n3ptyCsrCurrCd[i] != null)
					model.setN3ptyCsrCurrCd(n3ptyCsrCurrCd[i]);
				if (glDt[i] != null)
					model.setGlDt(glDt[i]);
				if (cxlFlg[i] != null)
					model.setCxlFlg(cxlFlg[i]);
				if (n3ptyTermDt[i] != null)
					model.setN3ptyTermDt(n3ptyTermDt[i]);
				if (n3ptyInvDt[i] != null)
					model.setN3ptyInvDt(n3ptyInvDt[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (tmlInvTpCd[i] != null)
					model.setTmlInvTpCd(tmlInvTpCd[i]);
				if (fincVslCd[i] != null)
					model.setFincVslCd(fincVslCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (n3ptyDesc[i] != null)
					model.setN3ptyDesc(n3ptyDesc[i]);
				if (n3ptyOfcCd[i] != null)
					model.setN3ptyOfcCd(n3ptyOfcCd[i]);
				if (n3ptyBilTpCd[i] != null)
					model.setN3ptyBilTpCd(n3ptyBilTpCd[i]);
				if (vvdCd[i] != null)
					model.setVvdCd(vvdCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (tmlSoDtlSeq[i] != null)
					model.setTmlSoDtlSeq(tmlSoDtlSeq[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (csrNo[i] != null)
					model.setCsrNo(csrNo[i]);
				if (tmlN3ptyIfStsCd[i] != null)
					model.setTmlN3ptyIfStsCd(tmlN3ptyIfStsCd[i]);
				if (n3ptyVndrSeq[i] != null)
					model.setN3ptyVndrSeq(n3ptyVndrSeq[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (tmlN3ptyTpCd[i] != null)
					model.setTmlN3ptyTpCd(tmlN3ptyTpCd[i]);
				if (ifAmt[i] != null)
					model.setIfAmt(ifAmt[i]);
				if (tmlSoSeq[i] != null)
					model.setTmlSoSeq(tmlSoSeq[i]);
				if (loclUpdDt[i] != null)
					model.setLoclUpdDt(loclUpdDt[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (errInvNo[i] != null)
					model.setErrInvNo(errInvNo[i]);
				if (fincSkdDirCd[i] != null)
					model.setFincSkdDirCd(fincSkdDirCd[i]);
				if (n3ptyAmt[i] != null)
					model.setN3ptyAmt(n3ptyAmt[i]);
				if (tmlIfSeq[i] != null)
					model.setTmlIfSeq(tmlIfSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (tmlCrrCd[i] != null)
					model.setTmlCrrCd(tmlCrrCd[i]);
				if (calcCostGrpCd[i] != null)
					model.setCalcCostGrpCd(calcCostGrpCd[i]);
				if (vndrCustDivCd[i] != null)
					model.setVndrCustDivCd(vndrCustDivCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (acctCd[i] != null)
					model.setAcctCd(acctCd[i]);
				if (tmlIfOfcCd[i] != null)
					model.setTmlIfOfcCd(tmlIfOfcCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (ifRmk[i] != null)
					model.setIfRmk(ifRmk[i]);
				if (fincSkdVoyNo[i] != null)
					model.setFincSkdVoyNo(fincSkdVoyNo[i]);
				if (refVndrSeq[i] != null)
					model.setRefVndrSeq(refVndrSeq[i]);
				if (loclCreDt[i] != null)
					model.setLoclCreDt(loclCreDt[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (gnteDivFlg[i] != null)
					model.setGnteDivFlg(gnteDivFlg[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (lgsCostCd[i] != null)
					model.setLgsCostCd(lgsCostCd[i]);
				if (tmlSoOfcCtyCd[i] != null)
					model.setTmlSoOfcCtyCd(tmlSoOfcCtyCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTesN3rdPtyIfVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TesN3rdPtyIfVO[]
	 */
	public TesN3rdPtyIfVO[] getTesN3rdPtyIfVOs(){
		TesN3rdPtyIfVO[] vos = (TesN3rdPtyIfVO[])models.toArray(new TesN3rdPtyIfVO[models.size()]);
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
		this.vndrCntCd = this.vndrCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyCsrCurrCd = this.n3ptyCsrCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glDt = this.glDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlFlg = this.cxlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyTermDt = this.n3ptyTermDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyInvDt = this.n3ptyInvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlInvTpCd = this.tmlInvTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincVslCd = this.fincVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyDesc = this.n3ptyDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyOfcCd = this.n3ptyOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyBilTpCd = this.n3ptyBilTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdCd = this.vvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlSoDtlSeq = this.tmlSoDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrNo = this.csrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlN3ptyIfStsCd = this.tmlN3ptyIfStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyVndrSeq = this.n3ptyVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlN3ptyTpCd = this.tmlN3ptyTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifAmt = this.ifAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlSoSeq = this.tmlSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclUpdDt = this.loclUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.errInvNo = this.errInvNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincSkdDirCd = this.fincSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyAmt = this.n3ptyAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlIfSeq = this.tmlIfSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlCrrCd = this.tmlCrrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.calcCostGrpCd = this.calcCostGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrCustDivCd = this.vndrCustDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctCd = this.acctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlIfOfcCd = this.tmlIfOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifRmk = this.ifRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincSkdVoyNo = this.fincSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refVndrSeq = this.refVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCreDt = this.loclCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gnteDivFlg = this.gnteDivFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCd = this.lgsCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlSoOfcCtyCd = this.tmlSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
