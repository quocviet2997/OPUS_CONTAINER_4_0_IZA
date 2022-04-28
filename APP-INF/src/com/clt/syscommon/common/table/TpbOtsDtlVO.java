/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TpbOtsDtlVO.java
*@FileTitle : TpbOtsDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.10
*@LastModifier : 박성진
*@LastVersion : 1.0
* 2009.08.10 박성진 
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
 * @author 박성진
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TpbOtsDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TpbOtsDtlVO> models = new ArrayList<TpbOtsDtlVO>();
	
	/* Column Info */
	private String ifDt = null;
	/* Column Info */
	private String toNodCd = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String vndrCntCd = null;
	/* Column Info */
	private String glDt = null;
	/* Column Info */
	private String n3ptyExpnTpCd = null;
	/* Column Info */
	private String ifOfcCd = null;
	/* Column Info */
	private String cxlFlg = null;
	/* Column Info */
	private String n3ptyDeltTpCd = null;
	/* Column Info */
	private String estmSvrId = null;
	/* Column Info */
	private String otsDtlSeq = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String tmlInvTpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String n3ptyOfcCd = null;
	/* Column Info */
	private String n3ptyBilTpCd = null;
	/* Column Info */
	private String vvdCd = null;
	/* Column Info */
	private String cfmCurrCd = null;
	/* Column Info */
	private String rvwOfcCd = null;
	/* Column Info */
	private String cfmUsrId = null;
	/* Column Info */
	private String fileNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String csrNo = null;
	/* Column Info */
	private String soNo = null;
	/* Column Info */
	private String n3ptyIfTpCd = null;
	/* Column Info */
	private String cfmDt = null;
	/* Column Info */
	private String mnlInpTpCd = null;
	/* Column Info */
	private String adjAmt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String ifRhqCd = null;
	/* Column Info */
	private String eqTpszCd = null;
	/* Column Info */
	private String custLglEngNm = null;
	/* Column Info */
	private String fmCltCngOfcN3ptyNo = null;
	/* Column Info */
	private String n3ptyNoDpSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String estmRvisNo = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String n3ptyCfmCd = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String otsAmt = null;
	/* Column Info */
	private String revAmt = null;
	/* Column Info */
	private String srcVndrCntCd = null;
	/* Column Info */
	private String ifAmt = null;
	/* Column Info */
	private String lgsCostCdSeq = null;
	/* Column Info */
	private String n3ptyNonCfmRsnCd = null;
	/* Column Info */
	private String n3ptySrcSubSysCd = null;
	/* Column Info */
	private String rvwDt = null;
	/* Column Info */
	private String cltAmt = null;
	/* Column Info */
	private String costExptFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String vndrLglEngNm = null;
	/* Column Info */
	private String rvwUsrId = null;
	/* Column Info */
	private String srcIfSeqNo = null;
	/* Column Info */
	private String balAmt = null;
	/* Column Info */
	private String vndrCustDivCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String eqNo = null;
	/* Column Info */
	private String cfmAmt = null;
	/* Column Info */
	private String n3ptyNo = null;
	/* Column Info */
	private String acctCd = null;
	/* Column Info */
	private String fincDirCd = null;
	/* Column Info */
	private String dorNodCd = null;
	/* Column Info */
	private String estmSeqNo = null;
	/* Column Info */
	private String invAmt = null;
	/* Column Info */
	private String srcVndrSeq = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String ifUsrId = null;
	/* Column Info */
	private String ifRmk = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String cfmRmk = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String fmNodCd = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String cfmOfcCd = null;
	/* Column Info */
	private String ydCd = null;
	/* Column Info */
	private String lgsCostCd = null;
	/* Column Info */
	private String estmDtlSeqNo = null;
	/* Column Info */
	private String viaNodCd = null;
	/* Column Info */
	private String ifCurrCd = null;
	/* Column Info */
	private String eqTpCd = null;
	/* Column Info */
	private String eacTpCd = null;
	/* Column Info */
	private String n3ptySrcNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TpbOtsDtlVO() {}

	public TpbOtsDtlVO(String ibflag, String pagerows, String otsDtlSeq, String n3ptyNo, String n3ptyNoDpSeq, String n3ptyBilTpCd, String n3ptyExpnTpCd, String ifRhqCd, String ifOfcCd, String ofcCd, String n3ptySrcSubSysCd, String n3ptySrcNo, String soNo, String csrNo, String glDt, String vvdCd, String tmlInvTpCd, String srcVndrCntCd, String srcVndrSeq, String eacTpCd, String bkgNo, String blNo, String vslCd, String skdVoyNo, String skdDirCd, String fincDirCd, String ydCd, String fmNodCd, String toNodCd, String viaNodCd, String dorNodCd, String eqTpCd, String eqTpszCd, String eqNo, String vndrCustDivCd, String vndrCntCd, String vndrSeq, String vndrLglEngNm, String custCntCd, String custSeq, String custLglEngNm, String n3ptyOfcCd, String ifCurrCd, String ifAmt, String ifRmk, String cfmCurrCd, String cfmAmt, String cfmRmk, String otsAmt, String invAmt, String cltAmt, String adjAmt, String balAmt, String revAmt, String acctCd, String n3ptyDeltTpCd, String lgsCostCd, String lgsCostCdSeq, String fileNo, String costExptFlg, String cfmDt, String estmSeqNo, String estmRvisNo, String estmDtlSeqNo, String n3ptyNonCfmRsnCd, String n3ptyIfTpCd, String ifUsrId, String ifDt, String n3ptyCfmCd, String cfmOfcCd, String cfmUsrId, String fmCltCngOfcN3ptyNo, String rvwOfcCd, String rvwUsrId, String rvwDt, String estmSvrId, String srcIfSeqNo, String mnlInpTpCd, String cxlFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.ifDt = ifDt;
		this.toNodCd = toNodCd;
		this.vslCd = vslCd;
		this.vndrCntCd = vndrCntCd;
		this.glDt = glDt;
		this.n3ptyExpnTpCd = n3ptyExpnTpCd;
		this.ifOfcCd = ifOfcCd;
		this.cxlFlg = cxlFlg;
		this.n3ptyDeltTpCd = n3ptyDeltTpCd;
		this.estmSvrId = estmSvrId;
		this.otsDtlSeq = otsDtlSeq;
		this.blNo = blNo;
		this.tmlInvTpCd = tmlInvTpCd;
		this.pagerows = pagerows;
		this.n3ptyOfcCd = n3ptyOfcCd;
		this.n3ptyBilTpCd = n3ptyBilTpCd;
		this.vvdCd = vvdCd;
		this.cfmCurrCd = cfmCurrCd;
		this.rvwOfcCd = rvwOfcCd;
		this.cfmUsrId = cfmUsrId;
		this.fileNo = fileNo;
		this.updUsrId = updUsrId;
		this.custCntCd = custCntCd;
		this.csrNo = csrNo;
		this.soNo = soNo;
		this.n3ptyIfTpCd = n3ptyIfTpCd;
		this.cfmDt = cfmDt;
		this.mnlInpTpCd = mnlInpTpCd;
		this.adjAmt = adjAmt;
		this.skdVoyNo = skdVoyNo;
		this.ifRhqCd = ifRhqCd;
		this.eqTpszCd = eqTpszCd;
		this.custLglEngNm = custLglEngNm;
		this.fmCltCngOfcN3ptyNo = fmCltCngOfcN3ptyNo;
		this.n3ptyNoDpSeq = n3ptyNoDpSeq;
		this.creUsrId = creUsrId;
		this.estmRvisNo = estmRvisNo;
		this.bkgNo = bkgNo;
		this.n3ptyCfmCd = n3ptyCfmCd;
		this.vndrSeq = vndrSeq;
		this.otsAmt = otsAmt;
		this.revAmt = revAmt;
		this.srcVndrCntCd = srcVndrCntCd;
		this.ifAmt = ifAmt;
		this.lgsCostCdSeq = lgsCostCdSeq;
		this.n3ptyNonCfmRsnCd = n3ptyNonCfmRsnCd;
		this.n3ptySrcSubSysCd = n3ptySrcSubSysCd;
		this.rvwDt = rvwDt;
		this.cltAmt = cltAmt;
		this.costExptFlg = costExptFlg;
		this.creDt = creDt;
		this.vndrLglEngNm = vndrLglEngNm;
		this.rvwUsrId = rvwUsrId;
		this.srcIfSeqNo = srcIfSeqNo;
		this.balAmt = balAmt;
		this.vndrCustDivCd = vndrCustDivCd;
		this.ibflag = ibflag;
		this.eqNo = eqNo;
		this.cfmAmt = cfmAmt;
		this.n3ptyNo = n3ptyNo;
		this.acctCd = acctCd;
		this.fincDirCd = fincDirCd;
		this.dorNodCd = dorNodCd;
		this.estmSeqNo = estmSeqNo;
		this.invAmt = invAmt;
		this.srcVndrSeq = srcVndrSeq;
		this.updDt = updDt;
		this.ifUsrId = ifUsrId;
		this.ifRmk = ifRmk;
		this.custSeq = custSeq;
		this.cfmRmk = cfmRmk;
		this.skdDirCd = skdDirCd;
		this.fmNodCd = fmNodCd;
		this.ofcCd = ofcCd;
		this.cfmOfcCd = cfmOfcCd;
		this.ydCd = ydCd;
		this.lgsCostCd = lgsCostCd;
		this.estmDtlSeqNo = estmDtlSeqNo;
		this.viaNodCd = viaNodCd;
		this.ifCurrCd = ifCurrCd;
		this.eqTpCd = eqTpCd;
		this.eacTpCd = eacTpCd;
		this.n3ptySrcNo = n3ptySrcNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("if_dt", getIfDt());
		this.hashColumns.put("to_nod_cd", getToNodCd());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("vndr_cnt_cd", getVndrCntCd());
		this.hashColumns.put("gl_dt", getGlDt());
		this.hashColumns.put("n3pty_expn_tp_cd", getN3ptyExpnTpCd());
		this.hashColumns.put("if_ofc_cd", getIfOfcCd());
		this.hashColumns.put("cxl_flg", getCxlFlg());
		this.hashColumns.put("n3pty_delt_tp_cd", getN3ptyDeltTpCd());
		this.hashColumns.put("estm_svr_id", getEstmSvrId());
		this.hashColumns.put("ots_dtl_seq", getOtsDtlSeq());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("tml_inv_tp_cd", getTmlInvTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("n3pty_ofc_cd", getN3ptyOfcCd());
		this.hashColumns.put("n3pty_bil_tp_cd", getN3ptyBilTpCd());
		this.hashColumns.put("vvd_cd", getVvdCd());
		this.hashColumns.put("cfm_curr_cd", getCfmCurrCd());
		this.hashColumns.put("rvw_ofc_cd", getRvwOfcCd());
		this.hashColumns.put("cfm_usr_id", getCfmUsrId());
		this.hashColumns.put("file_no", getFileNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("csr_no", getCsrNo());
		this.hashColumns.put("so_no", getSoNo());
		this.hashColumns.put("n3pty_if_tp_cd", getN3ptyIfTpCd());
		this.hashColumns.put("cfm_dt", getCfmDt());
		this.hashColumns.put("mnl_inp_tp_cd", getMnlInpTpCd());
		this.hashColumns.put("adj_amt", getAdjAmt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("if_rhq_cd", getIfRhqCd());
		this.hashColumns.put("eq_tpsz_cd", getEqTpszCd());
		this.hashColumns.put("cust_lgl_eng_nm", getCustLglEngNm());
		this.hashColumns.put("fm_clt_cng_ofc_n3pty_no", getFmCltCngOfcN3ptyNo());
		this.hashColumns.put("n3pty_no_dp_seq", getN3ptyNoDpSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("estm_rvis_no", getEstmRvisNo());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("n3pty_cfm_cd", getN3ptyCfmCd());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("ots_amt", getOtsAmt());
		this.hashColumns.put("rev_amt", getRevAmt());
		this.hashColumns.put("src_vndr_cnt_cd", getSrcVndrCntCd());
		this.hashColumns.put("if_amt", getIfAmt());
		this.hashColumns.put("lgs_cost_cd_seq", getLgsCostCdSeq());
		this.hashColumns.put("n3pty_non_cfm_rsn_cd", getN3ptyNonCfmRsnCd());
		this.hashColumns.put("n3pty_src_sub_sys_cd", getN3ptySrcSubSysCd());
		this.hashColumns.put("rvw_dt", getRvwDt());
		this.hashColumns.put("clt_amt", getCltAmt());
		this.hashColumns.put("cost_expt_flg", getCostExptFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("vndr_lgl_eng_nm", getVndrLglEngNm());
		this.hashColumns.put("rvw_usr_id", getRvwUsrId());
		this.hashColumns.put("src_if_seq_no", getSrcIfSeqNo());
		this.hashColumns.put("bal_amt", getBalAmt());
		this.hashColumns.put("vndr_cust_div_cd", getVndrCustDivCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("eq_no", getEqNo());
		this.hashColumns.put("cfm_amt", getCfmAmt());
		this.hashColumns.put("n3pty_no", getN3ptyNo());
		this.hashColumns.put("acct_cd", getAcctCd());
		this.hashColumns.put("finc_dir_cd", getFincDirCd());
		this.hashColumns.put("dor_nod_cd", getDorNodCd());
		this.hashColumns.put("estm_seq_no", getEstmSeqNo());
		this.hashColumns.put("inv_amt", getInvAmt());
		this.hashColumns.put("src_vndr_seq", getSrcVndrSeq());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("if_usr_id", getIfUsrId());
		this.hashColumns.put("if_rmk", getIfRmk());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("cfm_rmk", getCfmRmk());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("fm_nod_cd", getFmNodCd());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cfm_ofc_cd", getCfmOfcCd());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("lgs_cost_cd", getLgsCostCd());
		this.hashColumns.put("estm_dtl_seq_no", getEstmDtlSeqNo());
		this.hashColumns.put("via_nod_cd", getViaNodCd());
		this.hashColumns.put("if_curr_cd", getIfCurrCd());
		this.hashColumns.put("eq_tp_cd", getEqTpCd());
		this.hashColumns.put("eac_tp_cd", getEacTpCd());
		this.hashColumns.put("n3pty_src_no", getN3ptySrcNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("if_dt", "ifDt");
		this.hashFields.put("to_nod_cd", "toNodCd");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("vndr_cnt_cd", "vndrCntCd");
		this.hashFields.put("gl_dt", "glDt");
		this.hashFields.put("n3pty_expn_tp_cd", "n3ptyExpnTpCd");
		this.hashFields.put("if_ofc_cd", "ifOfcCd");
		this.hashFields.put("cxl_flg", "cxlFlg");
		this.hashFields.put("n3pty_delt_tp_cd", "n3ptyDeltTpCd");
		this.hashFields.put("estm_svr_id", "estmSvrId");
		this.hashFields.put("ots_dtl_seq", "otsDtlSeq");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("tml_inv_tp_cd", "tmlInvTpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("n3pty_ofc_cd", "n3ptyOfcCd");
		this.hashFields.put("n3pty_bil_tp_cd", "n3ptyBilTpCd");
		this.hashFields.put("vvd_cd", "vvdCd");
		this.hashFields.put("cfm_curr_cd", "cfmCurrCd");
		this.hashFields.put("rvw_ofc_cd", "rvwOfcCd");
		this.hashFields.put("cfm_usr_id", "cfmUsrId");
		this.hashFields.put("file_no", "fileNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("csr_no", "csrNo");
		this.hashFields.put("so_no", "soNo");
		this.hashFields.put("n3pty_if_tp_cd", "n3ptyIfTpCd");
		this.hashFields.put("cfm_dt", "cfmDt");
		this.hashFields.put("mnl_inp_tp_cd", "mnlInpTpCd");
		this.hashFields.put("adj_amt", "adjAmt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("if_rhq_cd", "ifRhqCd");
		this.hashFields.put("eq_tpsz_cd", "eqTpszCd");
		this.hashFields.put("cust_lgl_eng_nm", "custLglEngNm");
		this.hashFields.put("fm_clt_cng_ofc_n3pty_no", "fmCltCngOfcN3ptyNo");
		this.hashFields.put("n3pty_no_dp_seq", "n3ptyNoDpSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("estm_rvis_no", "estmRvisNo");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("n3pty_cfm_cd", "n3ptyCfmCd");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("ots_amt", "otsAmt");
		this.hashFields.put("rev_amt", "revAmt");
		this.hashFields.put("src_vndr_cnt_cd", "srcVndrCntCd");
		this.hashFields.put("if_amt", "ifAmt");
		this.hashFields.put("lgs_cost_cd_seq", "lgsCostCdSeq");
		this.hashFields.put("n3pty_non_cfm_rsn_cd", "n3ptyNonCfmRsnCd");
		this.hashFields.put("n3pty_src_sub_sys_cd", "n3ptySrcSubSysCd");
		this.hashFields.put("rvw_dt", "rvwDt");
		this.hashFields.put("clt_amt", "cltAmt");
		this.hashFields.put("cost_expt_flg", "costExptFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("vndr_lgl_eng_nm", "vndrLglEngNm");
		this.hashFields.put("rvw_usr_id", "rvwUsrId");
		this.hashFields.put("src_if_seq_no", "srcIfSeqNo");
		this.hashFields.put("bal_amt", "balAmt");
		this.hashFields.put("vndr_cust_div_cd", "vndrCustDivCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("eq_no", "eqNo");
		this.hashFields.put("cfm_amt", "cfmAmt");
		this.hashFields.put("n3pty_no", "n3ptyNo");
		this.hashFields.put("acct_cd", "acctCd");
		this.hashFields.put("finc_dir_cd", "fincDirCd");
		this.hashFields.put("dor_nod_cd", "dorNodCd");
		this.hashFields.put("estm_seq_no", "estmSeqNo");
		this.hashFields.put("inv_amt", "invAmt");
		this.hashFields.put("src_vndr_seq", "srcVndrSeq");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("if_usr_id", "ifUsrId");
		this.hashFields.put("if_rmk", "ifRmk");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("cfm_rmk", "cfmRmk");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("fm_nod_cd", "fmNodCd");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cfm_ofc_cd", "cfmOfcCd");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("lgs_cost_cd", "lgsCostCd");
		this.hashFields.put("estm_dtl_seq_no", "estmDtlSeqNo");
		this.hashFields.put("via_nod_cd", "viaNodCd");
		this.hashFields.put("if_curr_cd", "ifCurrCd");
		this.hashFields.put("eq_tp_cd", "eqTpCd");
		this.hashFields.put("eac_tp_cd", "eacTpCd");
		this.hashFields.put("n3pty_src_no", "n3ptySrcNo");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return ifDt
	 */
	public String getIfDt() {
		return this.ifDt;
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
	 * @return vndrCntCd
	 */
	public String getVndrCntCd() {
		return this.vndrCntCd;
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
	 * @return n3ptyExpnTpCd
	 */
	public String getN3ptyExpnTpCd() {
		return this.n3ptyExpnTpCd;
	}
	
	/**
	 * Column Info
	 * @return ifOfcCd
	 */
	public String getIfOfcCd() {
		return this.ifOfcCd;
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
	 * @return n3ptyDeltTpCd
	 */
	public String getN3ptyDeltTpCd() {
		return this.n3ptyDeltTpCd;
	}
	
	/**
	 * Column Info
	 * @return estmSvrId
	 */
	public String getEstmSvrId() {
		return this.estmSvrId;
	}
	
	/**
	 * Column Info
	 * @return otsDtlSeq
	 */
	public String getOtsDtlSeq() {
		return this.otsDtlSeq;
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
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
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
	 * @return cfmCurrCd
	 */
	public String getCfmCurrCd() {
		return this.cfmCurrCd;
	}
	
	/**
	 * Column Info
	 * @return rvwOfcCd
	 */
	public String getRvwOfcCd() {
		return this.rvwOfcCd;
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
	 * @return fileNo
	 */
	public String getFileNo() {
		return this.fileNo;
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
	 * @return custCntCd
	 */
	public String getCustCntCd() {
		return this.custCntCd;
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
	 * @return soNo
	 */
	public String getSoNo() {
		return this.soNo;
	}
	
	/**
	 * Column Info
	 * @return n3ptyIfTpCd
	 */
	public String getN3ptyIfTpCd() {
		return this.n3ptyIfTpCd;
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
	 * @return mnlInpTpCd
	 */
	public String getMnlInpTpCd() {
		return this.mnlInpTpCd;
	}
	
	/**
	 * Column Info
	 * @return adjAmt
	 */
	public String getAdjAmt() {
		return this.adjAmt;
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
	 * @return ifRhqCd
	 */
	public String getIfRhqCd() {
		return this.ifRhqCd;
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
	 * @return custLglEngNm
	 */
	public String getCustLglEngNm() {
		return this.custLglEngNm;
	}
	
	/**
	 * Column Info
	 * @return fmCltCngOfcN3ptyNo
	 */
	public String getFmCltCngOfcN3ptyNo() {
		return this.fmCltCngOfcN3ptyNo;
	}
	
	/**
	 * Column Info
	 * @return n3ptyNoDpSeq
	 */
	public String getN3ptyNoDpSeq() {
		return this.n3ptyNoDpSeq;
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
	 * @return estmRvisNo
	 */
	public String getEstmRvisNo() {
		return this.estmRvisNo;
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
	 * @return n3ptyCfmCd
	 */
	public String getN3ptyCfmCd() {
		return this.n3ptyCfmCd;
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
	 * @return otsAmt
	 */
	public String getOtsAmt() {
		return this.otsAmt;
	}
	
	/**
	 * Column Info
	 * @return revAmt
	 */
	public String getRevAmt() {
		return this.revAmt;
	}
	
	/**
	 * Column Info
	 * @return srcVndrCntCd
	 */
	public String getSrcVndrCntCd() {
		return this.srcVndrCntCd;
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
	 * @return lgsCostCdSeq
	 */
	public String getLgsCostCdSeq() {
		return this.lgsCostCdSeq;
	}
	
	/**
	 * Column Info
	 * @return n3ptyNonCfmRsnCd
	 */
	public String getN3ptyNonCfmRsnCd() {
		return this.n3ptyNonCfmRsnCd;
	}
	
	/**
	 * Column Info
	 * @return n3ptySrcSubSysCd
	 */
	public String getN3ptySrcSubSysCd() {
		return this.n3ptySrcSubSysCd;
	}
	
	/**
	 * Column Info
	 * @return rvwDt
	 */
	public String getRvwDt() {
		return this.rvwDt;
	}
	
	/**
	 * Column Info
	 * @return cltAmt
	 */
	public String getCltAmt() {
		return this.cltAmt;
	}
	
	/**
	 * Column Info
	 * @return costExptFlg
	 */
	public String getCostExptFlg() {
		return this.costExptFlg;
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
	 * @return vndrLglEngNm
	 */
	public String getVndrLglEngNm() {
		return this.vndrLglEngNm;
	}
	
	/**
	 * Column Info
	 * @return rvwUsrId
	 */
	public String getRvwUsrId() {
		return this.rvwUsrId;
	}
	
	/**
	 * Column Info
	 * @return srcIfSeqNo
	 */
	public String getSrcIfSeqNo() {
		return this.srcIfSeqNo;
	}
	
	/**
	 * Column Info
	 * @return balAmt
	 */
	public String getBalAmt() {
		return this.balAmt;
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
	 * @return cfmAmt
	 */
	public String getCfmAmt() {
		return this.cfmAmt;
	}
	
	/**
	 * Column Info
	 * @return n3ptyNo
	 */
	public String getN3ptyNo() {
		return this.n3ptyNo;
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
	 * @return fincDirCd
	 */
	public String getFincDirCd() {
		return this.fincDirCd;
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
	 * @return estmSeqNo
	 */
	public String getEstmSeqNo() {
		return this.estmSeqNo;
	}
	
	/**
	 * Column Info
	 * @return invAmt
	 */
	public String getInvAmt() {
		return this.invAmt;
	}
	
	/**
	 * Column Info
	 * @return srcVndrSeq
	 */
	public String getSrcVndrSeq() {
		return this.srcVndrSeq;
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
	 * @return ifUsrId
	 */
	public String getIfUsrId() {
		return this.ifUsrId;
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
	 * @return custSeq
	 */
	public String getCustSeq() {
		return this.custSeq;
	}
	
	/**
	 * Column Info
	 * @return cfmRmk
	 */
	public String getCfmRmk() {
		return this.cfmRmk;
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
	 * @return fmNodCd
	 */
	public String getFmNodCd() {
		return this.fmNodCd;
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
	 * @return cfmOfcCd
	 */
	public String getCfmOfcCd() {
		return this.cfmOfcCd;
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
	 * @return lgsCostCd
	 */
	public String getLgsCostCd() {
		return this.lgsCostCd;
	}
	
	/**
	 * Column Info
	 * @return estmDtlSeqNo
	 */
	public String getEstmDtlSeqNo() {
		return this.estmDtlSeqNo;
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
	 * @return ifCurrCd
	 */
	public String getIfCurrCd() {
		return this.ifCurrCd;
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
	 * @return eacTpCd
	 */
	public String getEacTpCd() {
		return this.eacTpCd;
	}
	
	/**
	 * Column Info
	 * @return n3ptySrcNo
	 */
	public String getN3ptySrcNo() {
		return this.n3ptySrcNo;
	}
	

	/**
	 * Column Info
	 * @param ifDt
	 */
	public void setIfDt(String ifDt) {
		this.ifDt = ifDt;
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
	 * @param vndrCntCd
	 */
	public void setVndrCntCd(String vndrCntCd) {
		this.vndrCntCd = vndrCntCd;
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
	 * @param n3ptyExpnTpCd
	 */
	public void setN3ptyExpnTpCd(String n3ptyExpnTpCd) {
		this.n3ptyExpnTpCd = n3ptyExpnTpCd;
	}
	
	/**
	 * Column Info
	 * @param ifOfcCd
	 */
	public void setIfOfcCd(String ifOfcCd) {
		this.ifOfcCd = ifOfcCd;
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
	 * @param n3ptyDeltTpCd
	 */
	public void setN3ptyDeltTpCd(String n3ptyDeltTpCd) {
		this.n3ptyDeltTpCd = n3ptyDeltTpCd;
	}
	
	/**
	 * Column Info
	 * @param estmSvrId
	 */
	public void setEstmSvrId(String estmSvrId) {
		this.estmSvrId = estmSvrId;
	}
	
	/**
	 * Column Info
	 * @param otsDtlSeq
	 */
	public void setOtsDtlSeq(String otsDtlSeq) {
		this.otsDtlSeq = otsDtlSeq;
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
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
	 * @param cfmCurrCd
	 */
	public void setCfmCurrCd(String cfmCurrCd) {
		this.cfmCurrCd = cfmCurrCd;
	}
	
	/**
	 * Column Info
	 * @param rvwOfcCd
	 */
	public void setRvwOfcCd(String rvwOfcCd) {
		this.rvwOfcCd = rvwOfcCd;
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
	 * @param fileNo
	 */
	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
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
	 * @param custCntCd
	 */
	public void setCustCntCd(String custCntCd) {
		this.custCntCd = custCntCd;
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
	 * @param soNo
	 */
	public void setSoNo(String soNo) {
		this.soNo = soNo;
	}
	
	/**
	 * Column Info
	 * @param n3ptyIfTpCd
	 */
	public void setN3ptyIfTpCd(String n3ptyIfTpCd) {
		this.n3ptyIfTpCd = n3ptyIfTpCd;
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
	 * @param mnlInpTpCd
	 */
	public void setMnlInpTpCd(String mnlInpTpCd) {
		this.mnlInpTpCd = mnlInpTpCd;
	}
	
	/**
	 * Column Info
	 * @param adjAmt
	 */
	public void setAdjAmt(String adjAmt) {
		this.adjAmt = adjAmt;
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
	 * @param ifRhqCd
	 */
	public void setIfRhqCd(String ifRhqCd) {
		this.ifRhqCd = ifRhqCd;
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
	 * @param custLglEngNm
	 */
	public void setCustLglEngNm(String custLglEngNm) {
		this.custLglEngNm = custLglEngNm;
	}
	
	/**
	 * Column Info
	 * @param fmCltCngOfcN3ptyNo
	 */
	public void setFmCltCngOfcN3ptyNo(String fmCltCngOfcN3ptyNo) {
		this.fmCltCngOfcN3ptyNo = fmCltCngOfcN3ptyNo;
	}
	
	/**
	 * Column Info
	 * @param n3ptyNoDpSeq
	 */
	public void setN3ptyNoDpSeq(String n3ptyNoDpSeq) {
		this.n3ptyNoDpSeq = n3ptyNoDpSeq;
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
	 * @param estmRvisNo
	 */
	public void setEstmRvisNo(String estmRvisNo) {
		this.estmRvisNo = estmRvisNo;
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
	 * @param n3ptyCfmCd
	 */
	public void setN3ptyCfmCd(String n3ptyCfmCd) {
		this.n3ptyCfmCd = n3ptyCfmCd;
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
	 * @param otsAmt
	 */
	public void setOtsAmt(String otsAmt) {
		this.otsAmt = otsAmt;
	}
	
	/**
	 * Column Info
	 * @param revAmt
	 */
	public void setRevAmt(String revAmt) {
		this.revAmt = revAmt;
	}
	
	/**
	 * Column Info
	 * @param srcVndrCntCd
	 */
	public void setSrcVndrCntCd(String srcVndrCntCd) {
		this.srcVndrCntCd = srcVndrCntCd;
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
	 * @param lgsCostCdSeq
	 */
	public void setLgsCostCdSeq(String lgsCostCdSeq) {
		this.lgsCostCdSeq = lgsCostCdSeq;
	}
	
	/**
	 * Column Info
	 * @param n3ptyNonCfmRsnCd
	 */
	public void setN3ptyNonCfmRsnCd(String n3ptyNonCfmRsnCd) {
		this.n3ptyNonCfmRsnCd = n3ptyNonCfmRsnCd;
	}
	
	/**
	 * Column Info
	 * @param n3ptySrcSubSysCd
	 */
	public void setN3ptySrcSubSysCd(String n3ptySrcSubSysCd) {
		this.n3ptySrcSubSysCd = n3ptySrcSubSysCd;
	}
	
	/**
	 * Column Info
	 * @param rvwDt
	 */
	public void setRvwDt(String rvwDt) {
		this.rvwDt = rvwDt;
	}
	
	/**
	 * Column Info
	 * @param cltAmt
	 */
	public void setCltAmt(String cltAmt) {
		this.cltAmt = cltAmt;
	}
	
	/**
	 * Column Info
	 * @param costExptFlg
	 */
	public void setCostExptFlg(String costExptFlg) {
		this.costExptFlg = costExptFlg;
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
	 * @param vndrLglEngNm
	 */
	public void setVndrLglEngNm(String vndrLglEngNm) {
		this.vndrLglEngNm = vndrLglEngNm;
	}
	
	/**
	 * Column Info
	 * @param rvwUsrId
	 */
	public void setRvwUsrId(String rvwUsrId) {
		this.rvwUsrId = rvwUsrId;
	}
	
	/**
	 * Column Info
	 * @param srcIfSeqNo
	 */
	public void setSrcIfSeqNo(String srcIfSeqNo) {
		this.srcIfSeqNo = srcIfSeqNo;
	}
	
	/**
	 * Column Info
	 * @param balAmt
	 */
	public void setBalAmt(String balAmt) {
		this.balAmt = balAmt;
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
	 * @param cfmAmt
	 */
	public void setCfmAmt(String cfmAmt) {
		this.cfmAmt = cfmAmt;
	}
	
	/**
	 * Column Info
	 * @param n3ptyNo
	 */
	public void setN3ptyNo(String n3ptyNo) {
		this.n3ptyNo = n3ptyNo;
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
	 * @param fincDirCd
	 */
	public void setFincDirCd(String fincDirCd) {
		this.fincDirCd = fincDirCd;
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
	 * @param estmSeqNo
	 */
	public void setEstmSeqNo(String estmSeqNo) {
		this.estmSeqNo = estmSeqNo;
	}
	
	/**
	 * Column Info
	 * @param invAmt
	 */
	public void setInvAmt(String invAmt) {
		this.invAmt = invAmt;
	}
	
	/**
	 * Column Info
	 * @param srcVndrSeq
	 */
	public void setSrcVndrSeq(String srcVndrSeq) {
		this.srcVndrSeq = srcVndrSeq;
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
	 * @param ifUsrId
	 */
	public void setIfUsrId(String ifUsrId) {
		this.ifUsrId = ifUsrId;
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
	 * @param custSeq
	 */
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}
	
	/**
	 * Column Info
	 * @param cfmRmk
	 */
	public void setCfmRmk(String cfmRmk) {
		this.cfmRmk = cfmRmk;
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
	 * @param fmNodCd
	 */
	public void setFmNodCd(String fmNodCd) {
		this.fmNodCd = fmNodCd;
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
	 * @param cfmOfcCd
	 */
	public void setCfmOfcCd(String cfmOfcCd) {
		this.cfmOfcCd = cfmOfcCd;
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
	 * @param lgsCostCd
	 */
	public void setLgsCostCd(String lgsCostCd) {
		this.lgsCostCd = lgsCostCd;
	}
	
	/**
	 * Column Info
	 * @param estmDtlSeqNo
	 */
	public void setEstmDtlSeqNo(String estmDtlSeqNo) {
		this.estmDtlSeqNo = estmDtlSeqNo;
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
	 * @param ifCurrCd
	 */
	public void setIfCurrCd(String ifCurrCd) {
		this.ifCurrCd = ifCurrCd;
	}
	
	/**
	 * Column Info
	 * @param eqTpCd
	 */
	public void setEqTpCd(String eqTpCd) {
		this.eqTpCd = eqTpCd;
	}
	
	/**
	 * Column Info
	 * @param eacTpCd
	 */
	public void setEacTpCd(String eacTpCd) {
		this.eacTpCd = eacTpCd;
	}
	
	/**
	 * Column Info
	 * @param n3ptySrcNo
	 */
	public void setN3ptySrcNo(String n3ptySrcNo) {
		this.n3ptySrcNo = n3ptySrcNo;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setIfDt(JSPUtil.getParameter(request, "if_dt", ""));
		setToNodCd(JSPUtil.getParameter(request, "to_nod_cd", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setVndrCntCd(JSPUtil.getParameter(request, "vndr_cnt_cd", ""));
		setGlDt(JSPUtil.getParameter(request, "gl_dt", ""));
		setN3ptyExpnTpCd(JSPUtil.getParameter(request, "n3pty_expn_tp_cd", ""));
		setIfOfcCd(JSPUtil.getParameter(request, "if_ofc_cd", ""));
		setCxlFlg(JSPUtil.getParameter(request, "cxl_flg", ""));
		setN3ptyDeltTpCd(JSPUtil.getParameter(request, "n3pty_delt_tp_cd", ""));
		setEstmSvrId(JSPUtil.getParameter(request, "estm_svr_id", ""));
		setOtsDtlSeq(JSPUtil.getParameter(request, "ots_dtl_seq", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setTmlInvTpCd(JSPUtil.getParameter(request, "tml_inv_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setN3ptyOfcCd(JSPUtil.getParameter(request, "n3pty_ofc_cd", ""));
		setN3ptyBilTpCd(JSPUtil.getParameter(request, "n3pty_bil_tp_cd", ""));
		setVvdCd(JSPUtil.getParameter(request, "vvd_cd", ""));
		setCfmCurrCd(JSPUtil.getParameter(request, "cfm_curr_cd", ""));
		setRvwOfcCd(JSPUtil.getParameter(request, "rvw_ofc_cd", ""));
		setCfmUsrId(JSPUtil.getParameter(request, "cfm_usr_id", ""));
		setFileNo(JSPUtil.getParameter(request, "file_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
		setCsrNo(JSPUtil.getParameter(request, "csr_no", ""));
		setSoNo(JSPUtil.getParameter(request, "so_no", ""));
		setN3ptyIfTpCd(JSPUtil.getParameter(request, "n3pty_if_tp_cd", ""));
		setCfmDt(JSPUtil.getParameter(request, "cfm_dt", ""));
		setMnlInpTpCd(JSPUtil.getParameter(request, "mnl_inp_tp_cd", ""));
		setAdjAmt(JSPUtil.getParameter(request, "adj_amt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setIfRhqCd(JSPUtil.getParameter(request, "if_rhq_cd", ""));
		setEqTpszCd(JSPUtil.getParameter(request, "eq_tpsz_cd", ""));
		setCustLglEngNm(JSPUtil.getParameter(request, "cust_lgl_eng_nm", ""));
		setFmCltCngOfcN3ptyNo(JSPUtil.getParameter(request, "fm_clt_cng_ofc_n3pty_no", ""));
		setN3ptyNoDpSeq(JSPUtil.getParameter(request, "n3pty_no_dp_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setEstmRvisNo(JSPUtil.getParameter(request, "estm_rvis_no", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setN3ptyCfmCd(JSPUtil.getParameter(request, "n3pty_cfm_cd", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setOtsAmt(JSPUtil.getParameter(request, "ots_amt", ""));
		setRevAmt(JSPUtil.getParameter(request, "rev_amt", ""));
		setSrcVndrCntCd(JSPUtil.getParameter(request, "src_vndr_cnt_cd", ""));
		setIfAmt(JSPUtil.getParameter(request, "if_amt", ""));
		setLgsCostCdSeq(JSPUtil.getParameter(request, "lgs_cost_cd_seq", ""));
		setN3ptyNonCfmRsnCd(JSPUtil.getParameter(request, "n3pty_non_cfm_rsn_cd", ""));
		setN3ptySrcSubSysCd(JSPUtil.getParameter(request, "n3pty_src_sub_sys_cd", ""));
		setRvwDt(JSPUtil.getParameter(request, "rvw_dt", ""));
		setCltAmt(JSPUtil.getParameter(request, "clt_amt", ""));
		setCostExptFlg(JSPUtil.getParameter(request, "cost_expt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setVndrLglEngNm(JSPUtil.getParameter(request, "vndr_lgl_eng_nm", ""));
		setRvwUsrId(JSPUtil.getParameter(request, "rvw_usr_id", ""));
		setSrcIfSeqNo(JSPUtil.getParameter(request, "src_if_seq_no", ""));
		setBalAmt(JSPUtil.getParameter(request, "bal_amt", ""));
		setVndrCustDivCd(JSPUtil.getParameter(request, "vndr_cust_div_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setEqNo(JSPUtil.getParameter(request, "eq_no", ""));
		setCfmAmt(JSPUtil.getParameter(request, "cfm_amt", ""));
		setN3ptyNo(JSPUtil.getParameter(request, "n3pty_no", ""));
		setAcctCd(JSPUtil.getParameter(request, "acct_cd", ""));
		setFincDirCd(JSPUtil.getParameter(request, "finc_dir_cd", ""));
		setDorNodCd(JSPUtil.getParameter(request, "dor_nod_cd", ""));
		setEstmSeqNo(JSPUtil.getParameter(request, "estm_seq_no", ""));
		setInvAmt(JSPUtil.getParameter(request, "inv_amt", ""));
		setSrcVndrSeq(JSPUtil.getParameter(request, "src_vndr_seq", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setIfUsrId(JSPUtil.getParameter(request, "if_usr_id", ""));
		setIfRmk(JSPUtil.getParameter(request, "if_rmk", ""));
		setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
		setCfmRmk(JSPUtil.getParameter(request, "cfm_rmk", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setFmNodCd(JSPUtil.getParameter(request, "fm_nod_cd", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setCfmOfcCd(JSPUtil.getParameter(request, "cfm_ofc_cd", ""));
		setYdCd(JSPUtil.getParameter(request, "yd_cd", ""));
		setLgsCostCd(JSPUtil.getParameter(request, "lgs_cost_cd", ""));
		setEstmDtlSeqNo(JSPUtil.getParameter(request, "estm_dtl_seq_no", ""));
		setViaNodCd(JSPUtil.getParameter(request, "via_nod_cd", ""));
		setIfCurrCd(JSPUtil.getParameter(request, "if_curr_cd", ""));
		setEqTpCd(JSPUtil.getParameter(request, "eq_tp_cd", ""));
		setEacTpCd(JSPUtil.getParameter(request, "eac_tp_cd", ""));
		setN3ptySrcNo(JSPUtil.getParameter(request, "n3pty_src_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TpbOtsDtlVO[]
	 */
	public TpbOtsDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TpbOtsDtlVO[]
	 */
	public TpbOtsDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TpbOtsDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ifDt = (JSPUtil.getParameter(request, prefix	+ "if_dt", length));
			String[] toNodCd = (JSPUtil.getParameter(request, prefix	+ "to_nod_cd", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] vndrCntCd = (JSPUtil.getParameter(request, prefix	+ "vndr_cnt_cd", length));
			String[] glDt = (JSPUtil.getParameter(request, prefix	+ "gl_dt", length));
			String[] n3ptyExpnTpCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_expn_tp_cd", length));
			String[] ifOfcCd = (JSPUtil.getParameter(request, prefix	+ "if_ofc_cd", length));
			String[] cxlFlg = (JSPUtil.getParameter(request, prefix	+ "cxl_flg", length));
			String[] n3ptyDeltTpCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_delt_tp_cd", length));
			String[] estmSvrId = (JSPUtil.getParameter(request, prefix	+ "estm_svr_id", length));
			String[] otsDtlSeq = (JSPUtil.getParameter(request, prefix	+ "ots_dtl_seq", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] tmlInvTpCd = (JSPUtil.getParameter(request, prefix	+ "tml_inv_tp_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] n3ptyOfcCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_ofc_cd", length));
			String[] n3ptyBilTpCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_bil_tp_cd", length));
			String[] vvdCd = (JSPUtil.getParameter(request, prefix	+ "vvd_cd", length));
			String[] cfmCurrCd = (JSPUtil.getParameter(request, prefix	+ "cfm_curr_cd", length));
			String[] rvwOfcCd = (JSPUtil.getParameter(request, prefix	+ "rvw_ofc_cd", length));
			String[] cfmUsrId = (JSPUtil.getParameter(request, prefix	+ "cfm_usr_id", length));
			String[] fileNo = (JSPUtil.getParameter(request, prefix	+ "file_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			String[] csrNo = (JSPUtil.getParameter(request, prefix	+ "csr_no", length));
			String[] soNo = (JSPUtil.getParameter(request, prefix	+ "so_no", length));
			String[] n3ptyIfTpCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_if_tp_cd", length));
			String[] cfmDt = (JSPUtil.getParameter(request, prefix	+ "cfm_dt", length));
			String[] mnlInpTpCd = (JSPUtil.getParameter(request, prefix	+ "mnl_inp_tp_cd", length));
			String[] adjAmt = (JSPUtil.getParameter(request, prefix	+ "adj_amt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] ifRhqCd = (JSPUtil.getParameter(request, prefix	+ "if_rhq_cd", length));
			String[] eqTpszCd = (JSPUtil.getParameter(request, prefix	+ "eq_tpsz_cd", length));
			String[] custLglEngNm = (JSPUtil.getParameter(request, prefix	+ "cust_lgl_eng_nm", length));
			String[] fmCltCngOfcN3ptyNo = (JSPUtil.getParameter(request, prefix	+ "fm_clt_cng_ofc_n3pty_no", length));
			String[] n3ptyNoDpSeq = (JSPUtil.getParameter(request, prefix	+ "n3pty_no_dp_seq", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] estmRvisNo = (JSPUtil.getParameter(request, prefix	+ "estm_rvis_no", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] n3ptyCfmCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_cfm_cd", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] otsAmt = (JSPUtil.getParameter(request, prefix	+ "ots_amt", length));
			String[] revAmt = (JSPUtil.getParameter(request, prefix	+ "rev_amt", length));
			String[] srcVndrCntCd = (JSPUtil.getParameter(request, prefix	+ "src_vndr_cnt_cd", length));
			String[] ifAmt = (JSPUtil.getParameter(request, prefix	+ "if_amt", length));
			String[] lgsCostCdSeq = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd_seq", length));
			String[] n3ptyNonCfmRsnCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_non_cfm_rsn_cd", length));
			String[] n3ptySrcSubSysCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_src_sub_sys_cd", length));
			String[] rvwDt = (JSPUtil.getParameter(request, prefix	+ "rvw_dt", length));
			String[] cltAmt = (JSPUtil.getParameter(request, prefix	+ "clt_amt", length));
			String[] costExptFlg = (JSPUtil.getParameter(request, prefix	+ "cost_expt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] vndrLglEngNm = (JSPUtil.getParameter(request, prefix	+ "vndr_lgl_eng_nm", length));
			String[] rvwUsrId = (JSPUtil.getParameter(request, prefix	+ "rvw_usr_id", length));
			String[] srcIfSeqNo = (JSPUtil.getParameter(request, prefix	+ "src_if_seq_no", length));
			String[] balAmt = (JSPUtil.getParameter(request, prefix	+ "bal_amt", length));
			String[] vndrCustDivCd = (JSPUtil.getParameter(request, prefix	+ "vndr_cust_div_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] eqNo = (JSPUtil.getParameter(request, prefix	+ "eq_no", length));
			String[] cfmAmt = (JSPUtil.getParameter(request, prefix	+ "cfm_amt", length));
			String[] n3ptyNo = (JSPUtil.getParameter(request, prefix	+ "n3pty_no", length));
			String[] acctCd = (JSPUtil.getParameter(request, prefix	+ "acct_cd", length));
			String[] fincDirCd = (JSPUtil.getParameter(request, prefix	+ "finc_dir_cd", length));
			String[] dorNodCd = (JSPUtil.getParameter(request, prefix	+ "dor_nod_cd", length));
			String[] estmSeqNo = (JSPUtil.getParameter(request, prefix	+ "estm_seq_no", length));
			String[] invAmt = (JSPUtil.getParameter(request, prefix	+ "inv_amt", length));
			String[] srcVndrSeq = (JSPUtil.getParameter(request, prefix	+ "src_vndr_seq", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] ifUsrId = (JSPUtil.getParameter(request, prefix	+ "if_usr_id", length));
			String[] ifRmk = (JSPUtil.getParameter(request, prefix	+ "if_rmk", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			String[] cfmRmk = (JSPUtil.getParameter(request, prefix	+ "cfm_rmk", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] fmNodCd = (JSPUtil.getParameter(request, prefix	+ "fm_nod_cd", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] cfmOfcCd = (JSPUtil.getParameter(request, prefix	+ "cfm_ofc_cd", length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd", length));
			String[] lgsCostCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd", length));
			String[] estmDtlSeqNo = (JSPUtil.getParameter(request, prefix	+ "estm_dtl_seq_no", length));
			String[] viaNodCd = (JSPUtil.getParameter(request, prefix	+ "via_nod_cd", length));
			String[] ifCurrCd = (JSPUtil.getParameter(request, prefix	+ "if_curr_cd", length));
			String[] eqTpCd = (JSPUtil.getParameter(request, prefix	+ "eq_tp_cd", length));
			String[] eacTpCd = (JSPUtil.getParameter(request, prefix	+ "eac_tp_cd", length));
			String[] n3ptySrcNo = (JSPUtil.getParameter(request, prefix	+ "n3pty_src_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new TpbOtsDtlVO();
				if (ifDt[i] != null)
					model.setIfDt(ifDt[i]);
				if (toNodCd[i] != null)
					model.setToNodCd(toNodCd[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (vndrCntCd[i] != null)
					model.setVndrCntCd(vndrCntCd[i]);
				if (glDt[i] != null)
					model.setGlDt(glDt[i]);
				if (n3ptyExpnTpCd[i] != null)
					model.setN3ptyExpnTpCd(n3ptyExpnTpCd[i]);
				if (ifOfcCd[i] != null)
					model.setIfOfcCd(ifOfcCd[i]);
				if (cxlFlg[i] != null)
					model.setCxlFlg(cxlFlg[i]);
				if (n3ptyDeltTpCd[i] != null)
					model.setN3ptyDeltTpCd(n3ptyDeltTpCd[i]);
				if (estmSvrId[i] != null)
					model.setEstmSvrId(estmSvrId[i]);
				if (otsDtlSeq[i] != null)
					model.setOtsDtlSeq(otsDtlSeq[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (tmlInvTpCd[i] != null)
					model.setTmlInvTpCd(tmlInvTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (n3ptyOfcCd[i] != null)
					model.setN3ptyOfcCd(n3ptyOfcCd[i]);
				if (n3ptyBilTpCd[i] != null)
					model.setN3ptyBilTpCd(n3ptyBilTpCd[i]);
				if (vvdCd[i] != null)
					model.setVvdCd(vvdCd[i]);
				if (cfmCurrCd[i] != null)
					model.setCfmCurrCd(cfmCurrCd[i]);
				if (rvwOfcCd[i] != null)
					model.setRvwOfcCd(rvwOfcCd[i]);
				if (cfmUsrId[i] != null)
					model.setCfmUsrId(cfmUsrId[i]);
				if (fileNo[i] != null)
					model.setFileNo(fileNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (csrNo[i] != null)
					model.setCsrNo(csrNo[i]);
				if (soNo[i] != null)
					model.setSoNo(soNo[i]);
				if (n3ptyIfTpCd[i] != null)
					model.setN3ptyIfTpCd(n3ptyIfTpCd[i]);
				if (cfmDt[i] != null)
					model.setCfmDt(cfmDt[i]);
				if (mnlInpTpCd[i] != null)
					model.setMnlInpTpCd(mnlInpTpCd[i]);
				if (adjAmt[i] != null)
					model.setAdjAmt(adjAmt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (ifRhqCd[i] != null)
					model.setIfRhqCd(ifRhqCd[i]);
				if (eqTpszCd[i] != null)
					model.setEqTpszCd(eqTpszCd[i]);
				if (custLglEngNm[i] != null)
					model.setCustLglEngNm(custLglEngNm[i]);
				if (fmCltCngOfcN3ptyNo[i] != null)
					model.setFmCltCngOfcN3ptyNo(fmCltCngOfcN3ptyNo[i]);
				if (n3ptyNoDpSeq[i] != null)
					model.setN3ptyNoDpSeq(n3ptyNoDpSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (estmRvisNo[i] != null)
					model.setEstmRvisNo(estmRvisNo[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (n3ptyCfmCd[i] != null)
					model.setN3ptyCfmCd(n3ptyCfmCd[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (otsAmt[i] != null)
					model.setOtsAmt(otsAmt[i]);
				if (revAmt[i] != null)
					model.setRevAmt(revAmt[i]);
				if (srcVndrCntCd[i] != null)
					model.setSrcVndrCntCd(srcVndrCntCd[i]);
				if (ifAmt[i] != null)
					model.setIfAmt(ifAmt[i]);
				if (lgsCostCdSeq[i] != null)
					model.setLgsCostCdSeq(lgsCostCdSeq[i]);
				if (n3ptyNonCfmRsnCd[i] != null)
					model.setN3ptyNonCfmRsnCd(n3ptyNonCfmRsnCd[i]);
				if (n3ptySrcSubSysCd[i] != null)
					model.setN3ptySrcSubSysCd(n3ptySrcSubSysCd[i]);
				if (rvwDt[i] != null)
					model.setRvwDt(rvwDt[i]);
				if (cltAmt[i] != null)
					model.setCltAmt(cltAmt[i]);
				if (costExptFlg[i] != null)
					model.setCostExptFlg(costExptFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (vndrLglEngNm[i] != null)
					model.setVndrLglEngNm(vndrLglEngNm[i]);
				if (rvwUsrId[i] != null)
					model.setRvwUsrId(rvwUsrId[i]);
				if (srcIfSeqNo[i] != null)
					model.setSrcIfSeqNo(srcIfSeqNo[i]);
				if (balAmt[i] != null)
					model.setBalAmt(balAmt[i]);
				if (vndrCustDivCd[i] != null)
					model.setVndrCustDivCd(vndrCustDivCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (eqNo[i] != null)
					model.setEqNo(eqNo[i]);
				if (cfmAmt[i] != null)
					model.setCfmAmt(cfmAmt[i]);
				if (n3ptyNo[i] != null)
					model.setN3ptyNo(n3ptyNo[i]);
				if (acctCd[i] != null)
					model.setAcctCd(acctCd[i]);
				if (fincDirCd[i] != null)
					model.setFincDirCd(fincDirCd[i]);
				if (dorNodCd[i] != null)
					model.setDorNodCd(dorNodCd[i]);
				if (estmSeqNo[i] != null)
					model.setEstmSeqNo(estmSeqNo[i]);
				if (invAmt[i] != null)
					model.setInvAmt(invAmt[i]);
				if (srcVndrSeq[i] != null)
					model.setSrcVndrSeq(srcVndrSeq[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (ifUsrId[i] != null)
					model.setIfUsrId(ifUsrId[i]);
				if (ifRmk[i] != null)
					model.setIfRmk(ifRmk[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (cfmRmk[i] != null)
					model.setCfmRmk(cfmRmk[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (fmNodCd[i] != null)
					model.setFmNodCd(fmNodCd[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (cfmOfcCd[i] != null)
					model.setCfmOfcCd(cfmOfcCd[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (lgsCostCd[i] != null)
					model.setLgsCostCd(lgsCostCd[i]);
				if (estmDtlSeqNo[i] != null)
					model.setEstmDtlSeqNo(estmDtlSeqNo[i]);
				if (viaNodCd[i] != null)
					model.setViaNodCd(viaNodCd[i]);
				if (ifCurrCd[i] != null)
					model.setIfCurrCd(ifCurrCd[i]);
				if (eqTpCd[i] != null)
					model.setEqTpCd(eqTpCd[i]);
				if (eacTpCd[i] != null)
					model.setEacTpCd(eacTpCd[i]);
				if (n3ptySrcNo[i] != null)
					model.setN3ptySrcNo(n3ptySrcNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTpbOtsDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TpbOtsDtlVO[]
	 */
	public TpbOtsDtlVO[] getTpbOtsDtlVOs(){
		TpbOtsDtlVO[] vos = (TpbOtsDtlVO[])models.toArray(new TpbOtsDtlVO[models.size()]);
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
		this.ifDt = this.ifDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toNodCd = this.toNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrCntCd = this.vndrCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glDt = this.glDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyExpnTpCd = this.n3ptyExpnTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifOfcCd = this.ifOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlFlg = this.cxlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyDeltTpCd = this.n3ptyDeltTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmSvrId = this.estmSvrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otsDtlSeq = this.otsDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlInvTpCd = this.tmlInvTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyOfcCd = this.n3ptyOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyBilTpCd = this.n3ptyBilTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdCd = this.vvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmCurrCd = this.cfmCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rvwOfcCd = this.rvwOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmUsrId = this.cfmUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fileNo = this.fileNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrNo = this.csrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soNo = this.soNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyIfTpCd = this.n3ptyIfTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmDt = this.cfmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnlInpTpCd = this.mnlInpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjAmt = this.adjAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifRhqCd = this.ifRhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqTpszCd = this.eqTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custLglEngNm = this.custLglEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmCltCngOfcN3ptyNo = this.fmCltCngOfcN3ptyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyNoDpSeq = this.n3ptyNoDpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmRvisNo = this.estmRvisNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyCfmCd = this.n3ptyCfmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otsAmt = this.otsAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revAmt = this.revAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srcVndrCntCd = this.srcVndrCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifAmt = this.ifAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCdSeq = this.lgsCostCdSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyNonCfmRsnCd = this.n3ptyNonCfmRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptySrcSubSysCd = this.n3ptySrcSubSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rvwDt = this.rvwDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cltAmt = this.cltAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costExptFlg = this.costExptFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrLglEngNm = this.vndrLglEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rvwUsrId = this.rvwUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srcIfSeqNo = this.srcIfSeqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.balAmt = this.balAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrCustDivCd = this.vndrCustDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqNo = this.eqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmAmt = this.cfmAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyNo = this.n3ptyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctCd = this.acctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincDirCd = this.fincDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dorNodCd = this.dorNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmSeqNo = this.estmSeqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invAmt = this.invAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srcVndrSeq = this.srcVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifUsrId = this.ifUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifRmk = this.ifRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmRmk = this.cfmRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmNodCd = this.fmNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmOfcCd = this.cfmOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCd = this.lgsCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmDtlSeqNo = this.estmDtlSeqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.viaNodCd = this.viaNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifCurrCd = this.ifCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqTpCd = this.eqTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eacTpCd = this.eacTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptySrcNo = this.n3ptySrcNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
