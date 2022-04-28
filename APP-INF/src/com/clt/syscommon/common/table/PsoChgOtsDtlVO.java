/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : PsoChgOtsDtlVO.java
*@FileTitle : PsoChgOtsDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2018.01.03
*@LastModifier : 
*@LastVersion : 1.0
* 2018.01.03  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

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

public class PsoChgOtsDtlVO extends AbstractValueObject { 
 
	private static final long serialVersionUID = 1L;
	
	private Collection<PsoChgOtsDtlVO> models = new ArrayList<PsoChgOtsDtlVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String vndrNm = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String vslNm = null;
	/* Column Info */
	private String vvd = null;
	/* Column Info */
	private String acctCd = null;
	/* Column Info */
	private String csrNo = null;
	/* Column Info */
	private String fmCreDt = null;
	/* Column Info */
	private String toCreDt = null;
	/* Column Info */
	private String stlCondFlg = null;
	/* Column Info */
	private String glDt = null;
	/* Column Info */
	private String soSeq = null;
	/* Column Info */
	private String otsIssCtyCd = null;
	/* Column Info */
	private String otsSoSeq = null;
	/* Column Info */
	private String otsSoDtlSeq = null;
	/* Column Info */
	private String rmnUsdAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String loclAmt = null;
	/* Column Info */
	private String stlUsdAmt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String edwUpdDt = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Column Info */
	private String issCtyCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String revDirCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String stlInvRgstNo = null;
	/* Column Info */
	private String usdAmt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String rmnLoclAmt = null;
	/* Column Info */
	private String stlLoclAmt = null;
	/* Column Info */
	private String soDtlSeq = null;
	/* Column Info */
	private String lgsCostCd = null;
	/* Column Info */
	private String lgsCostFullNm = null;
	/* Column Info */
	private String soStlSeq = null;
    /* Column Info */
    private String diffRmk = null;
	/* Column Info */
	private String updUsrId = null;
    /* Column Info */
    private String invOfcCd = null;
    /* Column Info */
    private String invNo = null;
    /* Column Info */
    private String ydCd = null;
    /* Column Info */
    private String fmSoStlSeq = null;
    /* Column Info */
    private String otsStlLoclAmt = null;
    /* Column Info */
    private String otsStlUsdAmt = null;
    /* Column Info */
    private String issDt = null;
    /* Column Info */
    private String currCd = null;
    /* Column Info */
    private String stlCsrNo = null;
	/* Column Info */
	private String stlInvLoclAmt = null;
	/* Column Info */
	private String stlInvUsdAmt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public PsoChgOtsDtlVO() {}

	public PsoChgOtsDtlVO(String ibflag, String pagerows, String issCtyCd, String soSeq, String soDtlSeq, String soStlSeq, String diffRmk, String vndrSeq, String vndrNm, String vslCd, String vslNm, String vvd, String acctCd, String csrNo, String fmCreDt, String toCreDt, String stlCondFlg, String glDt, String skdVoyNo, String skdDirCd, String revDirCd, String rlaneCd, String lgsCostCd, String lgsCostFullNm, String ioBndCd, String loclAmt, String usdAmt, String stlLoclAmt, String stlUsdAmt, String rmnLoclAmt, String rmnUsdAmt, String otsIssCtyCd, String otsSoSeq, String otsSoDtlSeq, String stlInvRgstNo, String creUsrId, String creDt, String updUsrId, String invOfcCd, String invNo, String updDt, String edwUpdDt, String ydCd, String fmSoStlSeq, String otsStlLoclAmt, String otsStlUsdAmt, String issDt, String currCd, String stlCsrNo, String stlInvLoclAmt, String stlInvUsdAmt) {
		this.updDt = updDt;
		this.vslCd = vslCd;
		this.vslNm = vslNm;
		this.vvd   = vvd;
		this.acctCd = acctCd;
		this.csrNo = csrNo;
		this.vndrSeq = vndrSeq;
		this.vndrNm = vndrNm;
		this.fmCreDt = fmCreDt;
		this.toCreDt = toCreDt;
		this.stlCondFlg = stlCondFlg;
		this.glDt = glDt;
		this.soSeq = soSeq;
		this.rmnUsdAmt = rmnUsdAmt;
		this.otsIssCtyCd = otsIssCtyCd;
		this.otsSoSeq = otsSoSeq;
		this.otsSoDtlSeq = otsSoDtlSeq;
		this.creDt = creDt;
		this.loclAmt = loclAmt;
		this.stlUsdAmt = stlUsdAmt;
		this.skdVoyNo = skdVoyNo;
		this.rlaneCd = rlaneCd;
		this.edwUpdDt = edwUpdDt;
		this.ioBndCd = ioBndCd;
		this.issCtyCd = issCtyCd;
		this.skdDirCd = skdDirCd;
		this.pagerows = pagerows;
		this.revDirCd = revDirCd;
		this.creUsrId = creUsrId;
		this.stlInvRgstNo = stlInvRgstNo;
		this.usdAmt = usdAmt;
		this.ibflag = ibflag;
		this.rmnLoclAmt = rmnLoclAmt;
		this.stlLoclAmt = stlLoclAmt;
		this.soDtlSeq = soDtlSeq;
		this.lgsCostCd = lgsCostCd;
		this.lgsCostFullNm = lgsCostFullNm;
		this.soStlSeq = soStlSeq;
		this.diffRmk = diffRmk;
		this.updUsrId = updUsrId;
		this.invOfcCd = invOfcCd;
		this.invNo = invNo;
		this.ydCd = ydCd;
		this.fmSoStlSeq = fmSoStlSeq;
		this.otsStlLoclAmt = otsStlLoclAmt;
		this.otsStlUsdAmt = otsStlUsdAmt;
		this.issDt = issDt;
		this.currCd = currCd;
		this.stlCsrNo = stlCsrNo;
		this.stlInvLoclAmt = stlInvLoclAmt;
		this.stlInvUsdAmt = stlInvUsdAmt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("vsl_nm", getVslNm());
		this.hashColumns.put("vvd", getVvd());
		this.hashColumns.put("acct_cd", getAcctCd());
		this.hashColumns.put("csr_no", getCsrNo());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("vndr_nm", getVndrNm());
		this.hashColumns.put("fm_cre_dt", getFmCreDt());
		this.hashColumns.put("to_cre_dt", getToCreDt());
		this.hashColumns.put("stl_cond_flg", getStlCondFlg());
		this.hashColumns.put("gl_dt", getGlDt());
		this.hashColumns.put("so_seq", getSoSeq());
		this.hashColumns.put("rmn_usd_amt", getRmnUsdAmt());
		this.hashColumns.put("ots_iss_cty_cd", getOtsIssCtyCd());
		this.hashColumns.put("ots_so_seq", getOtsSoSeq());
		this.hashColumns.put("ots_so_dtl_seq", getOtsSoDtlSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("locl_amt", getLoclAmt());
		this.hashColumns.put("stl_usd_amt", getStlUsdAmt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("iss_cty_cd", getIssCtyCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("rev_dir_cd", getRevDirCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("stl_inv_rgst_no", getStlInvRgstNo());
		this.hashColumns.put("usd_amt", getUsdAmt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rmn_locl_amt", getRmnLoclAmt());
		this.hashColumns.put("stl_locl_amt", getStlLoclAmt());
		this.hashColumns.put("so_dtl_seq", getSoDtlSeq());
		this.hashColumns.put("lgs_cost_cd", getLgsCostCd());
		this.hashColumns.put("lgs_cost_full_nm", getLgsCostFullNm());
		this.hashColumns.put("so_stl_seq", getSoStlSeq());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("inv_ofc_cd", getInvOfcCd());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("fm_so_stl_seq", getFmSoStlSeq());
		this.hashColumns.put("ots_stl_locl_amt", getOtsStlLoclAmt());
		this.hashColumns.put("ots_stl_usd_amt", getOtsStlUsdAmt());
		this.hashColumns.put("iss_dt", getIssDt());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("stl_csr_no", getStlCsrNo());
		this.hashColumns.put("stl_inv_locl_amt", getStlInvLoclAmt());
		this.hashColumns.put("stl_inv_usd_amt", getStlInvUsdAmt());
		 
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("vsl_nm", "vslNm");
		this.hashFields.put("vvd", "vvd");
		this.hashFields.put("acct_cd", "acctCd");
		this.hashFields.put("csr_no", "csrNo");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("vndr_nm", "vndrNm");
		this.hashFields.put("fm_cre_dt", "fmCreDt");
		this.hashFields.put("to_cre_dt", "toCreDt");
		this.hashFields.put("stl_cond_flg", "stlCondFlg");
		this.hashFields.put("gl_dt", "glDt");
		this.hashFields.put("so_seq", "soSeq");
		this.hashFields.put("rmn_usd_amt", "rmnUsdAmt");
		this.hashFields.put("ots_iss_cty_cd", "otsIssCtyCd");
		this.hashFields.put("ots_so_seq", "otsSoseq");
		this.hashFields.put("ots_so_dtl_seq", "otsSoDtlseq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("locl_amt", "loclAmt");
		this.hashFields.put("stl_usd_amt", "stlUsdAmt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("iss_cty_cd", "issCtyCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("rev_dir_cd", "revDirCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("stl_inv_rgst_no", "stlInvRgstNo");
		this.hashFields.put("usd_amt", "usdAmt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rmn_locl_amt", "rmnLoclAmt");
		this.hashFields.put("stl_locl_amt", "stlLoclAmt");
		this.hashFields.put("so_dtl_seq", "soDtlSeq");
		this.hashFields.put("lgs_cost_cd", "lgsCostCd");
		this.hashFields.put("lgs_cost_full_nm", "lgsCostFullNm");
		this.hashFields.put("so_stl_seq", "soStlSeq");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("inv_ofc_cd", "invOfcCd");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("fm_so_stl_seq", "fmSoStlSeq");
		this.hashFields.put("ots_stl_locl_amt", "otsStlLoclAmt");
		this.hashFields.put("ots_stl_usd_amt", "otsStlUsdAmt");
		this.hashFields.put("iss_dt", "issDt");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("stl_csr_no", "stlCsrNo");
		this.hashFields.put("stl_inv_locl_amt", "stlInvLoclAmt");
		this.hashFields.put("stl_inv_usd_amt", "stlInvUsdAmt");
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
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
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
	 * @return csrNo
	 */
	public String getCsrNo() {
		return this.csrNo;
	}
	
	/**
	 * Column Info
	 * @return stlInvLoclAmt
	 */
	public String getStlInvLoclAmt() {
		return stlInvLoclAmt;
	}
	
	/**
	 * Column Info
	 * @return stlInvUsdAmt
	 */
	public String getStlInvUsdAmt() {
		return stlInvUsdAmt;
	}
	
	/**
	 * Column Info
	 * @return stlCsrNo
	 */
	public String getStlCsrNo() {
		return stlCsrNo;
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
	 * @return vndrNm
	 */
	public String getVndrNm() {
		return vndrNm;
	}

	/**
	 * Column Info
	 * @return fmCreDt
	 */
	public String getFmCreDt() {
		return this.fmCreDt;
	}
	
	/**
	 * Column Info
	 * @return toCreDt
	 */
	public String getToCreDt() {
		return this.toCreDt;
	}
	
	/**
	 * Column Info
	 * @return stlCondFlg
	 */
	public String getStlCondFlg() {
		return this.stlCondFlg;
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
	 * @return vslNm
	 */
	public String getVslNm() {
		return this.vslNm;
	}
	
	/**
	 * Column Info
	 * @return vvd
	 */
	public String getVvd() {
		return this.vvd;
	}
	
	/**
	 * Column Info
	 * @return soSeq
	 */
	public String getSoSeq() {
		return this.soSeq;
	}
	
	/**
	 * Column Info
	 * @return rmnUsdAmt
	 */
	public String getRmnUsdAmt() {
		return this.rmnUsdAmt;
	}
	
	/**
	 * Column Info
	 * @return otsIssCtyCd
	 */
	public String getOtsIssCtyCd() {
		return this.otsIssCtyCd;
	}
	
	/**
	 * Column Info
	 * @return otsSoSeq
	 */
	public String getOtsSoSeq() {
		return this.otsSoSeq;
	}
	
	/**
	 * Column Info
	 * @return otsSoDtlSeq
	 */
	public String getOtsSoDtlSeq() {
		return this.otsSoDtlSeq;
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
	 * @return loclAmt
	 */
	public String getLoclAmt() {
		return this.loclAmt;
	}
	
	/**
	 * Column Info
	 * @return stlUsdAmt
	 */
	public String getStlUsdAmt() {
		return this.stlUsdAmt;
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
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	
	/**
	 * Column Info
	 * @return edwUpdDt
	 */
	public String getEdwUpdDt() {
		return this.edwUpdDt;
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
	 * @return issCtyCd
	 */
	public String getIssCtyCd() {
		return this.issCtyCd;
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
	 * @return revDirCd
	 */
	public String getRevDirCd() {
		return this.revDirCd;
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
	 * @return stlInvRgstNo
	 */
	public String getStlInvRgstNo() {
		return this.stlInvRgstNo;
	}
	
	/**
	 * Column Info
	 * @return usdAmt
	 */
	public String getUsdAmt() {
		return this.usdAmt;
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
	 * @return rmnLoclAmt
	 */
	public String getRmnLoclAmt() {
		return this.rmnLoclAmt;
	}
	
	/**
	 * Column Info
	 * @return stlLoclAmt
	 */
	public String getStlLoclAmt() {
		return this.stlLoclAmt;
	}
	
	/**
	 * Column Info
	 * @return soDtlSeq
	 */
	public String getSoDtlSeq() {
		return this.soDtlSeq;
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
	 * @return lgsCostFullNm
	 */
	public String getLgsCostFullNm() {
		return this.lgsCostFullNm;
	}

	/**
	 * Column Info
	 * @return soStlSeq
	 */
	public String getSoStlSeq() {
		return this.soStlSeq;
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
	 * @return invNo
	 */
	public String getInvNo() {
		return this.invNo;
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
	 * @return fmSoStlSeq
	 */
	public String getFmSoStlSeq() {
		return this.fmSoStlSeq;
	}
	
	/**
	 * Column Info
	 * @return otsStlLoclAmt
	 */
	public String getOtsStlLoclAmt() {
		return this.otsStlLoclAmt;
	}
	
	/**
	 * Column Info
	 * @return otsStlUsdAmt
	 */
	public String getOtsStlUsdAmt() {
		return this.otsStlUsdAmt;
	}
	
	/**
	 * Column Info
	 * @return issDt
	 */
	public String getIssDt() {
		return this.issDt;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
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
	 * @param acctCd
	 */
	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;
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
	 * @param stlInvLoclAmt
	 */
	public void setStlInvLoclAmt(String stlInvLoclAmt) {
		this.stlInvLoclAmt = stlInvLoclAmt;
	}
	
	/**
	 * Column Info
	 * @param stlInvUsdAmt
	 */
	public void setStlInvUsdAmt(String stlInvUsdAmt) {
		this.stlInvUsdAmt = stlInvUsdAmt;
	}
	
	/**
	 * Column Info
	 * @param stlCsrNo
	 */
	public void setStlCsrNo(String stlCsrNo) {
		this.stlCsrNo = stlCsrNo;
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
	 * @param vndrNm
	 */
	public void setVndrNm(String vndrNm) {
		this.vndrNm = vndrNm;
	}
	
	/**
	 * Column Info
	 * @param fmCreDt
	 */
	public void setFmCreDt(String fmCreDt) {
		this.fmCreDt = fmCreDt;
	}
	
	/**
	 * Column Info
	 * @param toCreDt
	 */
	public void setToCreDt(String toCreDt) {
		this.toCreDt = toCreDt;
	}
	
	/**
	 * Column Info
	 * @param stlCondFlg
	 */
	public void setStlCondFlg(String stlCondFlg) {
		this.stlCondFlg = stlCondFlg;
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
	 * @param vslNm
	 */
	public void setVslNm(String vslNm) {
		this.vslNm = vslNm;
	}
	
	/**
	 * Column Info
	 * @param vvd
	 */
	public void setVvd(String vvd) {
		this.vvd = vvd;
	}
	
	/**
	 * Column Info
	 * @param soSeq
	 */
	public void setSoSeq(String soSeq) {
		this.soSeq = soSeq;
	}
	
	/**
	 * Column Info
	 * @param rmnUsdAmt
	 */
	public void setRmnUsdAmt(String rmnUsdAmt) {
		this.rmnUsdAmt = rmnUsdAmt;
	}
	
	/**
	 * Column Info
	 * @param otsIssCtyCd
	 */
	public void setOtsIssCtyCd(String otsIssCtyCd) {
		this.otsIssCtyCd = otsIssCtyCd;
	}
	
	/**
	 * Column Info
	 * @param otsSoSeq
	 */
	public void setOtsSoSeq(String otsSoSeq) {
		this.otsSoSeq = otsSoSeq;
	}
	
	/**
	 * Column Info
	 * @param otsSoDtlSeq
	 */
	public void setOtsSoDtlSeq(String otsSoDtlSeq) {
		this.otsSoDtlSeq = otsSoDtlSeq;
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
	 * @param loclAmt
	 */
	public void setLoclAmt(String loclAmt) {
		this.loclAmt = loclAmt;
	}
	
	/**
	 * Column Info
	 * @param stlUsdAmt
	 */
	public void setStlUsdAmt(String stlUsdAmt) {
		this.stlUsdAmt = stlUsdAmt;
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
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	/**
	 * Column Info
	 * @param edwUpdDt
	 */
	public void setEdwUpdDt(String edwUpdDt) {
		this.edwUpdDt = edwUpdDt;
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
	 * @param issCtyCd
	 */
	public void setIssCtyCd(String issCtyCd) {
		this.issCtyCd = issCtyCd;
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
	 * @param revDirCd
	 */
	public void setRevDirCd(String revDirCd) {
		this.revDirCd = revDirCd;
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
	 * @param stlInvRgstNo
	 */
	public void setStlInvRgstNo(String stlInvRgstNo) {
		this.stlInvRgstNo = stlInvRgstNo;
	}
	
	/**
	 * Column Info
	 * @param usdAmt
	 */
	public void setUsdAmt(String usdAmt) {
		this.usdAmt = usdAmt;
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
	 * @param rmnLoclAmt
	 */
	public void setRmnLoclAmt(String rmnLoclAmt) {
		this.rmnLoclAmt = rmnLoclAmt;
	}
	
	/**
	 * Column Info
	 * @param stlLoclAmt
	 */
	public void setStlLoclAmt(String stlLoclAmt) {
		this.stlLoclAmt = stlLoclAmt;
	}
	
	/**
	 * Column Info
	 * @param soDtlSeq
	 */
	public void setSoDtlSeq(String soDtlSeq) {
		this.soDtlSeq = soDtlSeq;
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
	 * @param lgsCostFullNm
	 */
	public void setLgsCostFullNm(String lgsCostFullNm) {
		this.lgsCostFullNm = lgsCostFullNm;
	}
	
	/**
	 * Column Info
	 * @param soStlSeq
	 */
	public void setSoStlSeq(String soStlSeq) {
		this.soStlSeq = soStlSeq;
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
	 * @param invNo
	 */
	public void setInvNo(String invNo) {
		this.invNo = invNo;
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
	 * @param fmSoStlSeq
	 */
	public void setFmSoStlSeq(String fmSoStlSeq) {
		this.fmSoStlSeq = fmSoStlSeq;
	}
	
	/**
	 * Column Info
	 * @param otsStlLoclAmt
	 */
	public void setOtsStlLoclAmt(String otsStlLoclAmt) {
		this.otsStlLoclAmt = otsStlLoclAmt;
	}
	
	/**
	 * Column Info
	 * @param otsStlUsdAmt
	 */
	public void setOtsStlUsdAmt(String otsStlUsdAmt) {
		this.otsStlUsdAmt = otsStlUsdAmt;
	}
	
	/**
	 * Column Info
	 * @param issDt
	 */
	public void setIssDt(String issDt) {
		this.issDt = issDt;
	}
	
	/**
	 * Column Info
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
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
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setVslNm(JSPUtil.getParameter(request, prefix + "vsl_nm", ""));
		setVvd(JSPUtil.getParameter(request, prefix + "vvd", ""));
		setAcctCd(JSPUtil.getParameter(request, prefix + "acct_cd", ""));
		setCsrNo(JSPUtil.getParameter(request, prefix + "csr_no", ""));
		setVndrSeq(JSPUtil.getParameter(request, prefix + "vndr_seq", ""));
		setVndrNm(JSPUtil.getParameter(request, prefix + "vndr_nm", ""));
		setFmCreDt(JSPUtil.getParameter(request, prefix + "fm_cre_dt", ""));
		setToCreDt(JSPUtil.getParameter(request, prefix + "to_cre_dt", ""));
		setStlCondFlg(JSPUtil.getParameter(request, prefix + "stl_cond_flg", ""));
		setGlDt(JSPUtil.getParameter(request, prefix + "gl_dt", ""));
		setSoSeq(JSPUtil.getParameter(request, prefix + "so_seq", ""));
		setRmnUsdAmt(JSPUtil.getParameter(request, prefix + "rmn_usd_amt", ""));
		setOtsIssCtyCd(JSPUtil.getParameter(request, prefix + "ots_iss_cty_cd", ""));
		setOtsSoSeq(JSPUtil.getParameter(request, prefix + "ots_so_seq", ""));
		setOtsSoDtlSeq(JSPUtil.getParameter(request, prefix + "ots_so_dtl_seq", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setLoclAmt(JSPUtil.getParameter(request, prefix + "locl_amt", ""));
		setStlUsdAmt(JSPUtil.getParameter(request, prefix + "stl_usd_amt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setRlaneCd(JSPUtil.getParameter(request, prefix + "rlane_cd", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setIoBndCd(JSPUtil.getParameter(request, prefix + "io_bnd_cd", ""));
		setIssCtyCd(JSPUtil.getParameter(request, prefix + "iss_cty_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setRevDirCd(JSPUtil.getParameter(request, prefix + "rev_dir_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setStlInvRgstNo(JSPUtil.getParameter(request, prefix + "stl_inv_rgst_no", ""));
		setUsdAmt(JSPUtil.getParameter(request, prefix + "usd_amt", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setRmnLoclAmt(JSPUtil.getParameter(request, prefix + "rmn_locl_amt", ""));
		setStlLoclAmt(JSPUtil.getParameter(request, prefix + "stl_locl_amt", ""));
		setSoDtlSeq(JSPUtil.getParameter(request, prefix + "so_dtl_seq", ""));
		setLgsCostCd(JSPUtil.getParameter(request, prefix + "lgs_cost_cd", ""));
		setLgsCostFullNm(JSPUtil.getParameter(request, prefix + "lgs_cost_full_nm", ""));
		setSoStlSeq(JSPUtil.getParameter(request, prefix + "so_stl_seq", ""));
		setDiffRmk(JSPUtil.getParameter(request, prefix + "diff_rmk", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setInvOfcCd(JSPUtil.getParameter(request, prefix + "inv_ofc_cd", ""));
		setInvNo(JSPUtil.getParameter(request, prefix + "inv_no", ""));
		setYdCd(JSPUtil.getParameter(request, prefix + "yd_cd", ""));
		setFmSoStlSeq(JSPUtil.getParameter(request, prefix + "fm_so_stl_seq", ""));
		setOtsStlLoclAmt(JSPUtil.getParameter(request, prefix + "ots_stl_locl_amt", ""));
		setOtsStlUsdAmt(JSPUtil.getParameter(request, prefix + "ots_stl_usd_amt", ""));
		setIssDt(JSPUtil.getParameter(request, prefix + "iss_dt", ""));
		setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
		setStlCsrNo(JSPUtil.getParameter(request, prefix + "stl_csr_no", ""));
		setStlInvLoclAmt(JSPUtil.getParameter(request, prefix + "stl_inv_locl_amt", ""));
		setStlInvUsdAmt(JSPUtil.getParameter(request, prefix + "stl_inv_usd_amt", ""));
		
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PsoChgOtsDtlVO[]
	 */
	public PsoChgOtsDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PsoChgOtsDtlVO[]
	 */
	public PsoChgOtsDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PsoChgOtsDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] vslNm = (JSPUtil.getParameter(request, prefix	+ "vsl_nm", length));
			String[] vvd = (JSPUtil.getParameter(request, prefix	+ "vvd", length));
			String[] acctCd = (JSPUtil.getParameter(request, prefix	+ "acct_cd", length));
			String[] csrNo = (JSPUtil.getParameter(request, prefix	+ "csr_no", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] vndrNm = (JSPUtil.getParameter(request, prefix	+ "vndr_nm", length));
			String[] fmCreDt = (JSPUtil.getParameter(request, prefix	+ "fm_cre_dt", length));
			String[] toCreDt = (JSPUtil.getParameter(request, prefix	+ "to_cre_dt", length));
			String[] stlCondFlg = (JSPUtil.getParameter(request, prefix	+ "stl_cond_flg", length));
			String[] glDt = (JSPUtil.getParameter(request, prefix	+ "gl_dt", length));
			String[] soSeq = (JSPUtil.getParameter(request, prefix	+ "so_seq", length));
			String[] rmnUsdAmt = (JSPUtil.getParameter(request, prefix	+ "rmn_usd_amt", length));
			String[] otsIssCtyCd = (JSPUtil.getParameter(request, prefix	+ "ots_iss_cty_cd", length));
			String[] otsSoSeq = (JSPUtil.getParameter(request, prefix	+ "ots_so_seq", length));
			String[] otsSoDtlSeq = (JSPUtil.getParameter(request, prefix	+ "ots_so_dtl_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] loclAmt = (JSPUtil.getParameter(request, prefix	+ "locl_amt", length));
			String[] stlUsdAmt = (JSPUtil.getParameter(request, prefix	+ "stl_usd_amt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix	+ "edw_upd_dt", length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd", length));
			String[] issCtyCd = (JSPUtil.getParameter(request, prefix	+ "iss_cty_cd", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] revDirCd = (JSPUtil.getParameter(request, prefix	+ "rev_dir_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] stlInvRgstNo = (JSPUtil.getParameter(request, prefix	+ "stl_inv_rgst_no", length));
			String[] usdAmt = (JSPUtil.getParameter(request, prefix	+ "usd_amt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] rmnLoclAmt = (JSPUtil.getParameter(request, prefix	+ "rmn_locl_amt", length));
			String[] stlLoclAmt = (JSPUtil.getParameter(request, prefix	+ "stl_locl_amt", length));
			String[] soDtlSeq = (JSPUtil.getParameter(request, prefix	+ "so_dtl_seq", length));
			String[] lgsCostCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd", length));
			String[] lgsCostFullNm = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_full_nm", length));
			String[] soStlSeq = (JSPUtil.getParameter(request, prefix	+ "so_stl_seq", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] invOfcCd = (JSPUtil.getParameter(request, prefix	+ "inv_ofc_cd", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd", length));
			String[] fmSoStlSeq = (JSPUtil.getParameter(request, prefix	+ "fm_so_stl_seq", length));
			String[] otsStlLoclAmt = (JSPUtil.getParameter(request, prefix	+ "ots_stl_locl_amt", length));
			String[] otsStlUsdAmt = (JSPUtil.getParameter(request, prefix	+ "ots_stl_usd_amt", length));
			String[] issDt = (JSPUtil.getParameter(request, prefix	+ "iss_dt", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] stlCsrNo = (JSPUtil.getParameter(request, prefix	+ "stl_csr_no", length));
			String[] stlInvLoclAmt = (JSPUtil.getParameter(request, prefix	+ "stl_inv_locl_amt", length));
			String[] stlInvUsdAmt = (JSPUtil.getParameter(request, prefix	+ "stl_inv_usd_amt", length));
			
			for (int i = 0; i < length; i++) {
				model = new PsoChgOtsDtlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (vslNm[i] != null)
					model.setVslNm(vslNm[i]);
				if (vvd[i] != null)
					model.setVvd(vvd[i]);
				if (acctCd[i] != null)
					model.setAcctCd(acctCd[i]);
				if (csrNo[i] != null)
					model.setCsrNo(csrNo[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (vndrNm[i] != null)
					model.setVndrNm(vndrNm[i]);
				if (fmCreDt[i] != null)
					model.setFmCreDt(fmCreDt[i]);
				if (toCreDt[i] != null)
					model.setToCreDt(toCreDt[i]);
				if (stlCondFlg[i] != null)
					model.setStlCondFlg(stlCondFlg[i]);
				if (glDt[i] != null)
					model.setGlDt(glDt[i]);
				if (soSeq[i] != null)
					model.setSoSeq(soSeq[i]);
				if (rmnUsdAmt[i] != null)
					model.setRmnUsdAmt(rmnUsdAmt[i]);
				if (otsIssCtyCd[i] != null)
					model.setOtsIssCtyCd(otsIssCtyCd[i]);
				if (otsSoSeq[i] != null)
					model.setOtsSoSeq(otsSoSeq[i]);
				if (otsSoDtlSeq[i] != null)
					model.setOtsSoDtlSeq(otsSoDtlSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (loclAmt[i] != null)
					model.setLoclAmt(loclAmt[i]);
				if (stlUsdAmt[i] != null)
					model.setStlUsdAmt(stlUsdAmt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (issCtyCd[i] != null)
					model.setIssCtyCd(issCtyCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (revDirCd[i] != null)
					model.setRevDirCd(revDirCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (stlInvRgstNo[i] != null)
					model.setStlInvRgstNo(stlInvRgstNo[i]);
				if (usdAmt[i] != null)
					model.setUsdAmt(usdAmt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rmnLoclAmt[i] != null)
					model.setRmnLoclAmt(rmnLoclAmt[i]);
				if (stlLoclAmt[i] != null)
					model.setStlLoclAmt(stlLoclAmt[i]);
				if (soDtlSeq[i] != null)
					model.setSoDtlSeq(soDtlSeq[i]);
				if (lgsCostCd[i] != null)
					model.setLgsCostCd(lgsCostCd[i]);
				if (lgsCostFullNm[i] != null)
					model.setLgsCostFullNm(lgsCostFullNm[i]);
				if (soStlSeq[i] != null)
					model.setSoStlSeq(soStlSeq[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (invOfcCd[i] != null)
					model.setInvOfcCd(invOfcCd[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (fmSoStlSeq[i] != null)
					model.setFmSoStlSeq(fmSoStlSeq[i]);
				if (otsStlLoclAmt[i] != null)
					model.setOtsStlLoclAmt(otsStlLoclAmt[i]);
				if (otsStlUsdAmt[i] != null)
					model.setOtsStlUsdAmt(otsStlUsdAmt[i]);
				if (issDt[i] != null)
					model.setIssDt(issDt[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (stlCsrNo[i] != null)
					model.setStlCsrNo(stlCsrNo[i]);
				if (stlInvLoclAmt[i] != null)
					model.setStlInvLoclAmt(stlInvLoclAmt[i]);
				if (stlInvUsdAmt[i] != null)
					model.setStlInvUsdAmt(stlInvUsdAmt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPsoChgOtsDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PsoChgOtsDtlVO[]
	 */
	public PsoChgOtsDtlVO[] getPsoChgOtsDtlVOs(){
		PsoChgOtsDtlVO[] vos = (PsoChgOtsDtlVO[])models.toArray(new PsoChgOtsDtlVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslNm = this.vslNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvd = this.vvd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctCd = this.acctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrNo = this.csrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrNm = this.vndrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmCreDt = this.fmCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toCreDt = this.toCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlCondFlg = this.stlCondFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glDt = this.glDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soSeq = this.soSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rmnUsdAmt = this.rmnUsdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otsIssCtyCd = this.otsIssCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otsSoSeq = this.otsSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otsSoDtlSeq = this.otsSoDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclAmt = this.loclAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlUsdAmt = this.stlUsdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issCtyCd = this.issCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revDirCd = this.revDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlInvRgstNo = this.stlInvRgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usdAmt = this.usdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rmnLoclAmt = this.rmnLoclAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlLoclAmt = this.stlLoclAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soDtlSeq = this.soDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCd = this.lgsCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostFullNm = this.lgsCostFullNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soStlSeq = this.soStlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invOfcCd = this.invOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmSoStlSeq = this.fmSoStlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otsStlLoclAmt = this.otsStlLoclAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otsStlUsdAmt = this.otsStlUsdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issDt = this.issDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlCsrNo = this.stlCsrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlInvLoclAmt = this.stlInvLoclAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlInvUsdAmt = this.stlInvUsdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		
	}
}
