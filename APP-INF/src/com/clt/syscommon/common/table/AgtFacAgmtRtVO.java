/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : AgtFacAgmtRtVO.java
*@FileTitle : AgtFacAgmtRtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.01.25
*@LastModifier : 박성진
*@LastVersion : 1.0
* 2010.01.25 박성진 
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
 * @author 박성진
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class AgtFacAgmtRtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<AgtFacAgmtRtVO> models = new ArrayList<AgtFacAgmtRtVO>();
	
	/* Column Info */
	private String frtFwrdCntNm = null;
	/* Column Info */
	private String bkgFacBlAmt = null;
	/* Column Info */
	private String svcScpCd = null;
	/* Column Info */
	private String commProcStsCd = null;
	/* Column Info */
	private String porGrpTpCd = null;
	/* Column Info */
	private String facOfcCd = null;
	/* Column Info */
	private String facBxRt = null;
	/* Column Info */
	private String grsNetDivCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String podRoutCd = null;
	/* Column Info */
	private String scNo = null;
	/* Column Info */
	private String fmEffDt = null;
	/* Column Info */
	private String porRoutCd = null;
	/* Column Info */
	private String delGrpTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String recipientsName = null;
	/* Column Info */
	private String facSpclCntrTpCtnt1 = null;
	/* Column Info */
	private String shprCntCd = null;
	/* Column Info */
	private String facAproUsrId = null;
	/* Column Info */
	private String toEffDt = null;
	/* Column Info */
	private String facSpclCntrTpCtnt2 = null;
	/* Column Info */
	private String recipientsEml = null;
	/* Column Info */
	private String facSpclTeuRt = null;
	/* Column Info */
	private String frtFwrdCustSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String facChgCtnt = null;
	/* Column Info */
	private String podGrpTpCd = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String facFeuRt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String bkgRcvTermCd = null;
	/* Column Info */
	private String facAproDt = null;
	/* Column Info */
	private String facRqstUsrEml = null;
	/* Column Info */
	private String facRqstUsrId = null;
	/* Column Info */
	private String rfaNo = null;
	/* Column Info */
	private String frtFwrdCntCdSeq = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String facDblFlg = null;
	/* Column Info */
	private String bkgFacRt = null;
	/* Column Info */
	private String cmdtCd = null;
	/* Column Info */
	private String facSglFlg = null;
	/* Column Info */
	private String facTpCd = null;
	/* Column Info */
	private String shprCntNm = null;
	/* Column Info */
	private String facRqstDt = null;
	/* Column Info */
	private String facTeuRt = null;
	/* Column Info */
	private String delRoutCd = null;
	/* Column Info */
	private String facDivCd = null;
	/* Column Info */
	private String polRoutCd = null;
	/* Column Info */
	private String facRtSeq = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String commProcRsltRsn = null;
	/* Column Info */
	private String facAproUsrEml = null;
	/* Column Info */
	private String facSpclCntrRt2 = null;
	/* Column Info */
	private String polGrpTpCd = null;
	/* Column Info */
	private String facSpclCntrRt1 = null;
	/* Column Info */
	private String cnt = null;
	/* Column Info */
	private String check = null;
	/* Column Info */
	private String facRfTeuRt = null;
	/* Column Info */
	private String sStsCd = null;
	/* Column Info */
	private String cmdtTpCd = null;
	/* Column Info */
	private String shprCntCdSeq = null;
	/* Column Info */
	private String ffCntCd = null;
	/* Column Info */
	private String shprCustSeq = null;
	/* Column Info */
	private String facSpclFeuRt = null;
	/* Column Info */
	private String facRfFeuRt = null;
	/* Column Info */
	private String bkgDeTermCd = null;
	/* Column Info */
	private String frtFwrdCntCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public AgtFacAgmtRtVO() {}

	public AgtFacAgmtRtVO(String ibflag, String pagerows, String svcScpCd, String commProcStsCd, String porGrpTpCd, String facOfcCd, String facBxRt, String grsNetDivCd, String podRoutCd, String scNo, String fmEffDt, String porRoutCd, String delGrpTpCd, String updUsrId, String facSpclCntrTpCtnt1, String shprCntCd, String facAproUsrId, String toEffDt, String facSpclCntrTpCtnt2, String frtFwrdCustSeq, String facSpclTeuRt, String creUsrId, String facChgCtnt, String podGrpTpCd, String currCd, String facFeuRt, String creDt, String bkgRcvTermCd, String facAproDt, String facRqstUsrEml, String facRqstUsrId, String rfaNo, String facDblFlg, String bkgFacRt, String cmdtCd, String facSglFlg, String facTpCd, String facRqstDt, String facTeuRt, String delRoutCd, String facDivCd, String polRoutCd, String facRtSeq, String updDt, String commProcRsltRsn, String facAproUsrEml, String facSpclCntrRt2, String polGrpTpCd, String facSpclCntrRt1, String facRfTeuRt, String cmdtTpCd, String shprCustSeq, String facSpclFeuRt, String facRfFeuRt, String frtFwrdCntCd, String bkgDeTermCd, String frtFwrdCntNm, String shprCntCdSeq, String shprCntNm, String frtFwrdCntCdSeq, String bkgFacBlAmt, String check, String recipientsEml, String recipientsName, String cnt, String ffCntCd, String sStsCd) {
		this.frtFwrdCntNm = frtFwrdCntNm;
		this.bkgFacBlAmt = bkgFacBlAmt;
		this.svcScpCd = svcScpCd;
		this.commProcStsCd = commProcStsCd;
		this.porGrpTpCd = porGrpTpCd;
		this.facOfcCd = facOfcCd;
		this.facBxRt = facBxRt;
		this.grsNetDivCd = grsNetDivCd;
		this.pagerows = pagerows;
		this.podRoutCd = podRoutCd;
		this.scNo = scNo;
		this.fmEffDt = fmEffDt;
		this.porRoutCd = porRoutCd;
		this.delGrpTpCd = delGrpTpCd;
		this.updUsrId = updUsrId;
		this.recipientsName = recipientsName;
		this.facSpclCntrTpCtnt1 = facSpclCntrTpCtnt1;
		this.shprCntCd = shprCntCd;
		this.facAproUsrId = facAproUsrId;
		this.toEffDt = toEffDt;
		this.facSpclCntrTpCtnt2 = facSpclCntrTpCtnt2;
		this.recipientsEml = recipientsEml;
		this.facSpclTeuRt = facSpclTeuRt;
		this.frtFwrdCustSeq = frtFwrdCustSeq;
		this.creUsrId = creUsrId;
		this.facChgCtnt = facChgCtnt;
		this.podGrpTpCd = podGrpTpCd;
		this.currCd = currCd;
		this.facFeuRt = facFeuRt;
		this.creDt = creDt;
		this.bkgRcvTermCd = bkgRcvTermCd;
		this.facAproDt = facAproDt;
		this.facRqstUsrEml = facRqstUsrEml;
		this.facRqstUsrId = facRqstUsrId;
		this.rfaNo = rfaNo;
		this.frtFwrdCntCdSeq = frtFwrdCntCdSeq;
		this.ibflag = ibflag;
		this.facDblFlg = facDblFlg;
		this.bkgFacRt = bkgFacRt;
		this.cmdtCd = cmdtCd;
		this.facSglFlg = facSglFlg;
		this.facTpCd = facTpCd;
		this.shprCntNm = shprCntNm;
		this.facRqstDt = facRqstDt;
		this.facTeuRt = facTeuRt;
		this.delRoutCd = delRoutCd;
		this.facDivCd = facDivCd;
		this.polRoutCd = polRoutCd;
		this.facRtSeq = facRtSeq;
		this.updDt = updDt;
		this.commProcRsltRsn = commProcRsltRsn;
		this.facAproUsrEml = facAproUsrEml;
		this.facSpclCntrRt2 = facSpclCntrRt2;
		this.polGrpTpCd = polGrpTpCd;
		this.facSpclCntrRt1 = facSpclCntrRt1;
		this.cnt = cnt;
		this.check = check;
		this.facRfTeuRt = facRfTeuRt;
		this.sStsCd = sStsCd;
		this.cmdtTpCd = cmdtTpCd;
		this.shprCntCdSeq = shprCntCdSeq;
		this.ffCntCd = ffCntCd;
		this.shprCustSeq = shprCustSeq;
		this.facSpclFeuRt = facSpclFeuRt;
		this.facRfFeuRt = facRfFeuRt;
		this.bkgDeTermCd = bkgDeTermCd;
		this.frtFwrdCntCd = frtFwrdCntCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("frt_fwrd_cnt_nm", getFrtFwrdCntNm());
		this.hashColumns.put("bkg_fac_bl_amt", getBkgFacBlAmt());
		this.hashColumns.put("svc_scp_cd", getSvcScpCd());
		this.hashColumns.put("comm_proc_sts_cd", getCommProcStsCd());
		this.hashColumns.put("por_grp_tp_cd", getPorGrpTpCd());
		this.hashColumns.put("fac_ofc_cd", getFacOfcCd());
		this.hashColumns.put("fac_bx_rt", getFacBxRt());
		this.hashColumns.put("grs_net_div_cd", getGrsNetDivCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pod_rout_cd", getPodRoutCd());
		this.hashColumns.put("sc_no", getScNo());
		this.hashColumns.put("fm_eff_dt", getFmEffDt());
		this.hashColumns.put("por_rout_cd", getPorRoutCd());
		this.hashColumns.put("del_grp_tp_cd", getDelGrpTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("recipients_name", getRecipientsName());
		this.hashColumns.put("fac_spcl_cntr_tp_ctnt1", getFacSpclCntrTpCtnt1());
		this.hashColumns.put("shpr_cnt_cd", getShprCntCd());
		this.hashColumns.put("fac_apro_usr_id", getFacAproUsrId());
		this.hashColumns.put("to_eff_dt", getToEffDt());
		this.hashColumns.put("fac_spcl_cntr_tp_ctnt2", getFacSpclCntrTpCtnt2());
		this.hashColumns.put("recipients_eml", getRecipientsEml());
		this.hashColumns.put("fac_spcl_teu_rt", getFacSpclTeuRt());
		this.hashColumns.put("frt_fwrd_cust_seq", getFrtFwrdCustSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("fac_chg_ctnt", getFacChgCtnt());
		this.hashColumns.put("pod_grp_tp_cd", getPodGrpTpCd());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("fac_feu_rt", getFacFeuRt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bkg_rcv_term_cd", getBkgRcvTermCd());
		this.hashColumns.put("fac_apro_dt", getFacAproDt());
		this.hashColumns.put("fac_rqst_usr_eml", getFacRqstUsrEml());
		this.hashColumns.put("fac_rqst_usr_id", getFacRqstUsrId());
		this.hashColumns.put("rfa_no", getRfaNo());
		this.hashColumns.put("frt_fwrd_cnt_cd_seq", getFrtFwrdCntCdSeq());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("fac_dbl_flg", getFacDblFlg());
		this.hashColumns.put("bkg_fac_rt", getBkgFacRt());
		this.hashColumns.put("cmdt_cd", getCmdtCd());
		this.hashColumns.put("fac_sgl_flg", getFacSglFlg());
		this.hashColumns.put("fac_tp_cd", getFacTpCd());
		this.hashColumns.put("shpr_cnt_nm", getShprCntNm());
		this.hashColumns.put("fac_rqst_dt", getFacRqstDt());
		this.hashColumns.put("fac_teu_rt", getFacTeuRt());
		this.hashColumns.put("del_rout_cd", getDelRoutCd());
		this.hashColumns.put("fac_div_cd", getFacDivCd());
		this.hashColumns.put("pol_rout_cd", getPolRoutCd());
		this.hashColumns.put("fac_rt_seq", getFacRtSeq());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("comm_proc_rslt_rsn", getCommProcRsltRsn());
		this.hashColumns.put("fac_apro_usr_eml", getFacAproUsrEml());
		this.hashColumns.put("fac_spcl_cntr_rt2", getFacSpclCntrRt2());
		this.hashColumns.put("pol_grp_tp_cd", getPolGrpTpCd());
		this.hashColumns.put("fac_spcl_cntr_rt1", getFacSpclCntrRt1());
		this.hashColumns.put("cnt", getCnt());
		this.hashColumns.put("check", getCheck());
		this.hashColumns.put("fac_rf_teu_rt", getFacRfTeuRt());
		this.hashColumns.put("s_sts_cd", getSStsCd());
		this.hashColumns.put("cmdt_tp_cd", getCmdtTpCd());
		this.hashColumns.put("shpr_cnt_cd_seq", getShprCntCdSeq());
		this.hashColumns.put("ff_cnt_cd", getFfCntCd());
		this.hashColumns.put("shpr_cust_seq", getShprCustSeq());
		this.hashColumns.put("fac_spcl_feu_rt", getFacSpclFeuRt());
		this.hashColumns.put("fac_rf_feu_rt", getFacRfFeuRt());
		this.hashColumns.put("bkg_de_term_cd", getBkgDeTermCd());
		this.hashColumns.put("frt_fwrd_cnt_cd", getFrtFwrdCntCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("frt_fwrd_cnt_nm", "frtFwrdCntNm");
		this.hashFields.put("bkg_fac_bl_amt", "bkgFacBlAmt");
		this.hashFields.put("svc_scp_cd", "svcScpCd");
		this.hashFields.put("comm_proc_sts_cd", "commProcStsCd");
		this.hashFields.put("por_grp_tp_cd", "porGrpTpCd");
		this.hashFields.put("fac_ofc_cd", "facOfcCd");
		this.hashFields.put("fac_bx_rt", "facBxRt");
		this.hashFields.put("grs_net_div_cd", "grsNetDivCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pod_rout_cd", "podRoutCd");
		this.hashFields.put("sc_no", "scNo");
		this.hashFields.put("fm_eff_dt", "fmEffDt");
		this.hashFields.put("por_rout_cd", "porRoutCd");
		this.hashFields.put("del_grp_tp_cd", "delGrpTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("recipients_name", "recipientsName");
		this.hashFields.put("fac_spcl_cntr_tp_ctnt1", "facSpclCntrTpCtnt1");
		this.hashFields.put("shpr_cnt_cd", "shprCntCd");
		this.hashFields.put("fac_apro_usr_id", "facAproUsrId");
		this.hashFields.put("to_eff_dt", "toEffDt");
		this.hashFields.put("fac_spcl_cntr_tp_ctnt2", "facSpclCntrTpCtnt2");
		this.hashFields.put("recipients_eml", "recipientsEml");
		this.hashFields.put("fac_spcl_teu_rt", "facSpclTeuRt");
		this.hashFields.put("frt_fwrd_cust_seq", "frtFwrdCustSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("fac_chg_ctnt", "facChgCtnt");
		this.hashFields.put("pod_grp_tp_cd", "podGrpTpCd");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("fac_feu_rt", "facFeuRt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bkg_rcv_term_cd", "bkgRcvTermCd");
		this.hashFields.put("fac_apro_dt", "facAproDt");
		this.hashFields.put("fac_rqst_usr_eml", "facRqstUsrEml");
		this.hashFields.put("fac_rqst_usr_id", "facRqstUsrId");
		this.hashFields.put("rfa_no", "rfaNo");
		this.hashFields.put("frt_fwrd_cnt_cd_seq", "frtFwrdCntCdSeq");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("fac_dbl_flg", "facDblFlg");
		this.hashFields.put("bkg_fac_rt", "bkgFacRt");
		this.hashFields.put("cmdt_cd", "cmdtCd");
		this.hashFields.put("fac_sgl_flg", "facSglFlg");
		this.hashFields.put("fac_tp_cd", "facTpCd");
		this.hashFields.put("shpr_cnt_nm", "shprCntNm");
		this.hashFields.put("fac_rqst_dt", "facRqstDt");
		this.hashFields.put("fac_teu_rt", "facTeuRt");
		this.hashFields.put("del_rout_cd", "delRoutCd");
		this.hashFields.put("fac_div_cd", "facDivCd");
		this.hashFields.put("pol_rout_cd", "polRoutCd");
		this.hashFields.put("fac_rt_seq", "facRtSeq");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("comm_proc_rslt_rsn", "commProcRsltRsn");
		this.hashFields.put("fac_apro_usr_eml", "facAproUsrEml");
		this.hashFields.put("fac_spcl_cntr_rt2", "facSpclCntrRt2");
		this.hashFields.put("pol_grp_tp_cd", "polGrpTpCd");
		this.hashFields.put("fac_spcl_cntr_rt1", "facSpclCntrRt1");
		this.hashFields.put("cnt", "cnt");
		this.hashFields.put("check", "check");
		this.hashFields.put("fac_rf_teu_rt", "facRfTeuRt");
		this.hashFields.put("s_sts_cd", "sStsCd");
		this.hashFields.put("cmdt_tp_cd", "cmdtTpCd");
		this.hashFields.put("shpr_cnt_cd_seq", "shprCntCdSeq");
		this.hashFields.put("ff_cnt_cd", "ffCntCd");
		this.hashFields.put("shpr_cust_seq", "shprCustSeq");
		this.hashFields.put("fac_spcl_feu_rt", "facSpclFeuRt");
		this.hashFields.put("fac_rf_feu_rt", "facRfFeuRt");
		this.hashFields.put("bkg_de_term_cd", "bkgDeTermCd");
		this.hashFields.put("frt_fwrd_cnt_cd", "frtFwrdCntCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return frtFwrdCntNm
	 */
	public String getFrtFwrdCntNm() {
		return this.frtFwrdCntNm;
	}
	
	/**
	 * Column Info
	 * @return bkgFacBlAmt
	 */
	public String getBkgFacBlAmt() {
		return this.bkgFacBlAmt;
	}
	
	/**
	 * Column Info
	 * @return svcScpCd
	 */
	public String getSvcScpCd() {
		return this.svcScpCd;
	}
	
	/**
	 * Column Info
	 * @return commProcStsCd
	 */
	public String getCommProcStsCd() {
		return this.commProcStsCd;
	}
	
	/**
	 * Column Info
	 * @return porGrpTpCd
	 */
	public String getPorGrpTpCd() {
		return this.porGrpTpCd;
	}
	
	/**
	 * Column Info
	 * @return facOfcCd
	 */
	public String getFacOfcCd() {
		return this.facOfcCd;
	}
	
	/**
	 * Column Info
	 * @return facBxRt
	 */
	public String getFacBxRt() {
		return this.facBxRt;
	}
	
	/**
	 * Column Info
	 * @return grsNetDivCd
	 */
	public String getGrsNetDivCd() {
		return this.grsNetDivCd;
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
	 * @return podRoutCd
	 */
	public String getPodRoutCd() {
		return this.podRoutCd;
	}
	
	/**
	 * Column Info
	 * @return scNo
	 */
	public String getScNo() {
		return this.scNo;
	}
	
	/**
	 * Column Info
	 * @return fmEffDt
	 */
	public String getFmEffDt() {
		return this.fmEffDt;
	}
	
	/**
	 * Column Info
	 * @return porRoutCd
	 */
	public String getPorRoutCd() {
		return this.porRoutCd;
	}
	
	/**
	 * Column Info
	 * @return delGrpTpCd
	 */
	public String getDelGrpTpCd() {
		return this.delGrpTpCd;
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
	 * @return recipientsName
	 */
	public String getRecipientsName() {
		return this.recipientsName;
	}
	
	/**
	 * Column Info
	 * @return facSpclCntrTpCtnt1
	 */
	public String getFacSpclCntrTpCtnt1() {
		return this.facSpclCntrTpCtnt1;
	}
	
	/**
	 * Column Info
	 * @return shprCntCd
	 */
	public String getShprCntCd() {
		return this.shprCntCd;
	}
	
	/**
	 * Column Info
	 * @return facAproUsrId
	 */
	public String getFacAproUsrId() {
		return this.facAproUsrId;
	}
	
	/**
	 * Column Info
	 * @return toEffDt
	 */
	public String getToEffDt() {
		return this.toEffDt;
	}
	
	/**
	 * Column Info
	 * @return facSpclCntrTpCtnt2
	 */
	public String getFacSpclCntrTpCtnt2() {
		return this.facSpclCntrTpCtnt2;
	}
	
	/**
	 * Column Info
	 * @return recipientsEml
	 */
	public String getRecipientsEml() {
		return this.recipientsEml;
	}
	
	/**
	 * Column Info
	 * @return facSpclTeuRt
	 */
	public String getFacSpclTeuRt() {
		return this.facSpclTeuRt;
	}
	
	/**
	 * Column Info
	 * @return frtFwrdCustSeq
	 */
	public String getFrtFwrdCustSeq() {
		return this.frtFwrdCustSeq;
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
	 * @return facChgCtnt
	 */
	public String getFacChgCtnt() {
		return this.facChgCtnt;
	}
	
	/**
	 * Column Info
	 * @return podGrpTpCd
	 */
	public String getPodGrpTpCd() {
		return this.podGrpTpCd;
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
	 * @return facFeuRt
	 */
	public String getFacFeuRt() {
		return this.facFeuRt;
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
	 * @return bkgRcvTermCd
	 */
	public String getBkgRcvTermCd() {
		return this.bkgRcvTermCd;
	}
	
	/**
	 * Column Info
	 * @return facAproDt
	 */
	public String getFacAproDt() {
		return this.facAproDt;
	}
	
	/**
	 * Column Info
	 * @return facRqstUsrEml
	 */
	public String getFacRqstUsrEml() {
		return this.facRqstUsrEml;
	}
	
	/**
	 * Column Info
	 * @return facRqstUsrId
	 */
	public String getFacRqstUsrId() {
		return this.facRqstUsrId;
	}
	
	/**
	 * Column Info
	 * @return rfaNo
	 */
	public String getRfaNo() {
		return this.rfaNo;
	}
	
	/**
	 * Column Info
	 * @return frtFwrdCntCdSeq
	 */
	public String getFrtFwrdCntCdSeq() {
		return this.frtFwrdCntCdSeq;
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
	 * @return facDblFlg
	 */
	public String getFacDblFlg() {
		return this.facDblFlg;
	}
	
	/**
	 * Column Info
	 * @return bkgFacRt
	 */
	public String getBkgFacRt() {
		return this.bkgFacRt;
	}
	
	/**
	 * Column Info
	 * @return cmdtCd
	 */
	public String getCmdtCd() {
		return this.cmdtCd;
	}
	
	/**
	 * Column Info
	 * @return facSglFlg
	 */
	public String getFacSglFlg() {
		return this.facSglFlg;
	}
	
	/**
	 * Column Info
	 * @return facTpCd
	 */
	public String getFacTpCd() {
		return this.facTpCd;
	}
	
	/**
	 * Column Info
	 * @return shprCntNm
	 */
	public String getShprCntNm() {
		return this.shprCntNm;
	}
	
	/**
	 * Column Info
	 * @return facRqstDt
	 */
	public String getFacRqstDt() {
		return this.facRqstDt;
	}
	
	/**
	 * Column Info
	 * @return facTeuRt
	 */
	public String getFacTeuRt() {
		return this.facTeuRt;
	}
	
	/**
	 * Column Info
	 * @return delRoutCd
	 */
	public String getDelRoutCd() {
		return this.delRoutCd;
	}
	
	/**
	 * Column Info
	 * @return facDivCd
	 */
	public String getFacDivCd() {
		return this.facDivCd;
	}
	
	/**
	 * Column Info
	 * @return polRoutCd
	 */
	public String getPolRoutCd() {
		return this.polRoutCd;
	}
	
	/**
	 * Column Info
	 * @return facRtSeq
	 */
	public String getFacRtSeq() {
		return this.facRtSeq;
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
	 * @return commProcRsltRsn
	 */
	public String getCommProcRsltRsn() {
		return this.commProcRsltRsn;
	}
	
	/**
	 * Column Info
	 * @return facAproUsrEml
	 */
	public String getFacAproUsrEml() {
		return this.facAproUsrEml;
	}
	
	/**
	 * Column Info
	 * @return facSpclCntrRt2
	 */
	public String getFacSpclCntrRt2() {
		return this.facSpclCntrRt2;
	}
	
	/**
	 * Column Info
	 * @return polGrpTpCd
	 */
	public String getPolGrpTpCd() {
		return this.polGrpTpCd;
	}
	
	/**
	 * Column Info
	 * @return facSpclCntrRt1
	 */
	public String getFacSpclCntrRt1() {
		return this.facSpclCntrRt1;
	}
	
	/**
	 * Column Info
	 * @return cnt
	 */
	public String getCnt() {
		return this.cnt;
	}
	
	/**
	 * Column Info
	 * @return check
	 */
	public String getCheck() {
		return this.check;
	}
	
	/**
	 * Column Info
	 * @return facRfTeuRt
	 */
	public String getFacRfTeuRt() {
		return this.facRfTeuRt;
	}
	
	/**
	 * Column Info
	 * @return sStsCd
	 */
	public String getSStsCd() {
		return this.sStsCd;
	}
	
	/**
	 * Column Info
	 * @return cmdtTpCd
	 */
	public String getCmdtTpCd() {
		return this.cmdtTpCd;
	}
	
	/**
	 * Column Info
	 * @return shprCntCdSeq
	 */
	public String getShprCntCdSeq() {
		return this.shprCntCdSeq;
	}
	
	/**
	 * Column Info
	 * @return ffCntCd
	 */
	public String getFfCntCd() {
		return this.ffCntCd;
	}
	
	/**
	 * Column Info
	 * @return shprCustSeq
	 */
	public String getShprCustSeq() {
		return this.shprCustSeq;
	}
	
	/**
	 * Column Info
	 * @return facSpclFeuRt
	 */
	public String getFacSpclFeuRt() {
		return this.facSpclFeuRt;
	}
	
	/**
	 * Column Info
	 * @return facRfFeuRt
	 */
	public String getFacRfFeuRt() {
		return this.facRfFeuRt;
	}
	
	/**
	 * Column Info
	 * @return bkgDeTermCd
	 */
	public String getBkgDeTermCd() {
		return this.bkgDeTermCd;
	}
	
	/**
	 * Column Info
	 * @return frtFwrdCntCd
	 */
	public String getFrtFwrdCntCd() {
		return this.frtFwrdCntCd;
	}
	

	/**
	 * Column Info
	 * @param frtFwrdCntNm
	 */
	public void setFrtFwrdCntNm(String frtFwrdCntNm) {
		this.frtFwrdCntNm = frtFwrdCntNm;
	}
	
	/**
	 * Column Info
	 * @param bkgFacBlAmt
	 */
	public void setBkgFacBlAmt(String bkgFacBlAmt) {
		this.bkgFacBlAmt = bkgFacBlAmt;
	}
	
	/**
	 * Column Info
	 * @param svcScpCd
	 */
	public void setSvcScpCd(String svcScpCd) {
		this.svcScpCd = svcScpCd;
	}
	
	/**
	 * Column Info
	 * @param commProcStsCd
	 */
	public void setCommProcStsCd(String commProcStsCd) {
		this.commProcStsCd = commProcStsCd;
	}
	
	/**
	 * Column Info
	 * @param porGrpTpCd
	 */
	public void setPorGrpTpCd(String porGrpTpCd) {
		this.porGrpTpCd = porGrpTpCd;
	}
	
	/**
	 * Column Info
	 * @param facOfcCd
	 */
	public void setFacOfcCd(String facOfcCd) {
		this.facOfcCd = facOfcCd;
	}
	
	/**
	 * Column Info
	 * @param facBxRt
	 */
	public void setFacBxRt(String facBxRt) {
		this.facBxRt = facBxRt;
	}
	
	/**
	 * Column Info
	 * @param grsNetDivCd
	 */
	public void setGrsNetDivCd(String grsNetDivCd) {
		this.grsNetDivCd = grsNetDivCd;
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
	 * @param podRoutCd
	 */
	public void setPodRoutCd(String podRoutCd) {
		this.podRoutCd = podRoutCd;
	}
	
	/**
	 * Column Info
	 * @param scNo
	 */
	public void setScNo(String scNo) {
		this.scNo = scNo;
	}
	
	/**
	 * Column Info
	 * @param fmEffDt
	 */
	public void setFmEffDt(String fmEffDt) {
		this.fmEffDt = fmEffDt;
	}
	
	/**
	 * Column Info
	 * @param porRoutCd
	 */
	public void setPorRoutCd(String porRoutCd) {
		this.porRoutCd = porRoutCd;
	}
	
	/**
	 * Column Info
	 * @param delGrpTpCd
	 */
	public void setDelGrpTpCd(String delGrpTpCd) {
		this.delGrpTpCd = delGrpTpCd;
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
	 * @param recipientsName
	 */
	public void setRecipientsName(String recipientsName) {
		this.recipientsName = recipientsName;
	}
	
	/**
	 * Column Info
	 * @param facSpclCntrTpCtnt1
	 */
	public void setFacSpclCntrTpCtnt1(String facSpclCntrTpCtnt1) {
		this.facSpclCntrTpCtnt1 = facSpclCntrTpCtnt1;
	}
	
	/**
	 * Column Info
	 * @param shprCntCd
	 */
	public void setShprCntCd(String shprCntCd) {
		this.shprCntCd = shprCntCd;
	}
	
	/**
	 * Column Info
	 * @param facAproUsrId
	 */
	public void setFacAproUsrId(String facAproUsrId) {
		this.facAproUsrId = facAproUsrId;
	}
	
	/**
	 * Column Info
	 * @param toEffDt
	 */
	public void setToEffDt(String toEffDt) {
		this.toEffDt = toEffDt;
	}
	
	/**
	 * Column Info
	 * @param facSpclCntrTpCtnt2
	 */
	public void setFacSpclCntrTpCtnt2(String facSpclCntrTpCtnt2) {
		this.facSpclCntrTpCtnt2 = facSpclCntrTpCtnt2;
	}
	
	/**
	 * Column Info
	 * @param recipientsEml
	 */
	public void setRecipientsEml(String recipientsEml) {
		this.recipientsEml = recipientsEml;
	}
	
	/**
	 * Column Info
	 * @param facSpclTeuRt
	 */
	public void setFacSpclTeuRt(String facSpclTeuRt) {
		this.facSpclTeuRt = facSpclTeuRt;
	}
	
	/**
	 * Column Info
	 * @param frtFwrdCustSeq
	 */
	public void setFrtFwrdCustSeq(String frtFwrdCustSeq) {
		this.frtFwrdCustSeq = frtFwrdCustSeq;
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
	 * @param facChgCtnt
	 */
	public void setFacChgCtnt(String facChgCtnt) {
		this.facChgCtnt = facChgCtnt;
	}
	
	/**
	 * Column Info
	 * @param podGrpTpCd
	 */
	public void setPodGrpTpCd(String podGrpTpCd) {
		this.podGrpTpCd = podGrpTpCd;
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
	 * @param facFeuRt
	 */
	public void setFacFeuRt(String facFeuRt) {
		this.facFeuRt = facFeuRt;
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
	 * @param bkgRcvTermCd
	 */
	public void setBkgRcvTermCd(String bkgRcvTermCd) {
		this.bkgRcvTermCd = bkgRcvTermCd;
	}
	
	/**
	 * Column Info
	 * @param facAproDt
	 */
	public void setFacAproDt(String facAproDt) {
		this.facAproDt = facAproDt;
	}
	
	/**
	 * Column Info
	 * @param facRqstUsrEml
	 */
	public void setFacRqstUsrEml(String facRqstUsrEml) {
		this.facRqstUsrEml = facRqstUsrEml;
	}
	
	/**
	 * Column Info
	 * @param facRqstUsrId
	 */
	public void setFacRqstUsrId(String facRqstUsrId) {
		this.facRqstUsrId = facRqstUsrId;
	}
	
	/**
	 * Column Info
	 * @param rfaNo
	 */
	public void setRfaNo(String rfaNo) {
		this.rfaNo = rfaNo;
	}
	
	/**
	 * Column Info
	 * @param frtFwrdCntCdSeq
	 */
	public void setFrtFwrdCntCdSeq(String frtFwrdCntCdSeq) {
		this.frtFwrdCntCdSeq = frtFwrdCntCdSeq;
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
	 * @param facDblFlg
	 */
	public void setFacDblFlg(String facDblFlg) {
		this.facDblFlg = facDblFlg;
	}
	
	/**
	 * Column Info
	 * @param bkgFacRt
	 */
	public void setBkgFacRt(String bkgFacRt) {
		this.bkgFacRt = bkgFacRt;
	}
	
	/**
	 * Column Info
	 * @param cmdtCd
	 */
	public void setCmdtCd(String cmdtCd) {
		this.cmdtCd = cmdtCd;
	}
	
	/**
	 * Column Info
	 * @param facSglFlg
	 */
	public void setFacSglFlg(String facSglFlg) {
		this.facSglFlg = facSglFlg;
	}
	
	/**
	 * Column Info
	 * @param facTpCd
	 */
	public void setFacTpCd(String facTpCd) {
		this.facTpCd = facTpCd;
	}
	
	/**
	 * Column Info
	 * @param shprCntNm
	 */
	public void setShprCntNm(String shprCntNm) {
		this.shprCntNm = shprCntNm;
	}
	
	/**
	 * Column Info
	 * @param facRqstDt
	 */
	public void setFacRqstDt(String facRqstDt) {
		this.facRqstDt = facRqstDt;
	}
	
	/**
	 * Column Info
	 * @param facTeuRt
	 */
	public void setFacTeuRt(String facTeuRt) {
		this.facTeuRt = facTeuRt;
	}
	
	/**
	 * Column Info
	 * @param delRoutCd
	 */
	public void setDelRoutCd(String delRoutCd) {
		this.delRoutCd = delRoutCd;
	}
	
	/**
	 * Column Info
	 * @param facDivCd
	 */
	public void setFacDivCd(String facDivCd) {
		this.facDivCd = facDivCd;
	}
	
	/**
	 * Column Info
	 * @param polRoutCd
	 */
	public void setPolRoutCd(String polRoutCd) {
		this.polRoutCd = polRoutCd;
	}
	
	/**
	 * Column Info
	 * @param facRtSeq
	 */
	public void setFacRtSeq(String facRtSeq) {
		this.facRtSeq = facRtSeq;
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
	 * @param commProcRsltRsn
	 */
	public void setCommProcRsltRsn(String commProcRsltRsn) {
		this.commProcRsltRsn = commProcRsltRsn;
	}
	
	/**
	 * Column Info
	 * @param facAproUsrEml
	 */
	public void setFacAproUsrEml(String facAproUsrEml) {
		this.facAproUsrEml = facAproUsrEml;
	}
	
	/**
	 * Column Info
	 * @param facSpclCntrRt2
	 */
	public void setFacSpclCntrRt2(String facSpclCntrRt2) {
		this.facSpclCntrRt2 = facSpclCntrRt2;
	}
	
	/**
	 * Column Info
	 * @param polGrpTpCd
	 */
	public void setPolGrpTpCd(String polGrpTpCd) {
		this.polGrpTpCd = polGrpTpCd;
	}
	
	/**
	 * Column Info
	 * @param facSpclCntrRt1
	 */
	public void setFacSpclCntrRt1(String facSpclCntrRt1) {
		this.facSpclCntrRt1 = facSpclCntrRt1;
	}
	
	/**
	 * Column Info
	 * @param cnt
	 */
	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
	
	/**
	 * Column Info
	 * @param check
	 */
	public void setCheck(String check) {
		this.check = check;
	}
	
	/**
	 * Column Info
	 * @param facRfTeuRt
	 */
	public void setFacRfTeuRt(String facRfTeuRt) {
		this.facRfTeuRt = facRfTeuRt;
	}
	
	/**
	 * Column Info
	 * @param sStsCd
	 */
	public void setSStsCd(String sStsCd) {
		this.sStsCd = sStsCd;
	}
	
	/**
	 * Column Info
	 * @param cmdtTpCd
	 */
	public void setCmdtTpCd(String cmdtTpCd) {
		this.cmdtTpCd = cmdtTpCd;
	}
	
	/**
	 * Column Info
	 * @param shprCntCdSeq
	 */
	public void setShprCntCdSeq(String shprCntCdSeq) {
		this.shprCntCdSeq = shprCntCdSeq;
	}
	
	/**
	 * Column Info
	 * @param ffCntCd
	 */
	public void setFfCntCd(String ffCntCd) {
		this.ffCntCd = ffCntCd;
	}
	
	/**
	 * Column Info
	 * @param shprCustSeq
	 */
	public void setShprCustSeq(String shprCustSeq) {
		this.shprCustSeq = shprCustSeq;
	}
	
	/**
	 * Column Info
	 * @param facSpclFeuRt
	 */
	public void setFacSpclFeuRt(String facSpclFeuRt) {
		this.facSpclFeuRt = facSpclFeuRt;
	}
	
	/**
	 * Column Info
	 * @param facRfFeuRt
	 */
	public void setFacRfFeuRt(String facRfFeuRt) {
		this.facRfFeuRt = facRfFeuRt;
	}
	
	/**
	 * Column Info
	 * @param bkgDeTermCd
	 */
	public void setBkgDeTermCd(String bkgDeTermCd) {
		this.bkgDeTermCd = bkgDeTermCd;
	}
	
	/**
	 * Column Info
	 * @param frtFwrdCntCd
	 */
	public void setFrtFwrdCntCd(String frtFwrdCntCd) {
		this.frtFwrdCntCd = frtFwrdCntCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setFrtFwrdCntNm(JSPUtil.getParameter(request, "frt_fwrd_cnt_nm", ""));
		setBkgFacBlAmt(JSPUtil.getParameter(request, "bkg_fac_bl_amt", ""));
		setSvcScpCd(JSPUtil.getParameter(request, "svc_scp_cd", ""));
		setCommProcStsCd(JSPUtil.getParameter(request, "comm_proc_sts_cd", ""));
		setPorGrpTpCd(JSPUtil.getParameter(request, "por_grp_tp_cd", ""));
		setFacOfcCd(JSPUtil.getParameter(request, "fac_ofc_cd", ""));
		setFacBxRt(JSPUtil.getParameter(request, "fac_bx_rt", ""));
		setGrsNetDivCd(JSPUtil.getParameter(request, "grs_net_div_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPodRoutCd(JSPUtil.getParameter(request, "pod_rout_cd", ""));
		setScNo(JSPUtil.getParameter(request, "sc_no", ""));
		setFmEffDt(JSPUtil.getParameter(request, "fm_eff_dt", ""));
		setPorRoutCd(JSPUtil.getParameter(request, "por_rout_cd", ""));
		setDelGrpTpCd(JSPUtil.getParameter(request, "del_grp_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setRecipientsName(JSPUtil.getParameter(request, "recipients_name", ""));
		setFacSpclCntrTpCtnt1(JSPUtil.getParameter(request, "fac_spcl_cntr_tp_ctnt1", ""));
		setShprCntCd(JSPUtil.getParameter(request, "shpr_cnt_cd", ""));
		setFacAproUsrId(JSPUtil.getParameter(request, "fac_apro_usr_id", ""));
		setToEffDt(JSPUtil.getParameter(request, "to_eff_dt", ""));
		setFacSpclCntrTpCtnt2(JSPUtil.getParameter(request, "fac_spcl_cntr_tp_ctnt2", ""));
		setRecipientsEml(JSPUtil.getParameter(request, "recipients_eml", ""));
		setFacSpclTeuRt(JSPUtil.getParameter(request, "fac_spcl_teu_rt", ""));
		setFrtFwrdCustSeq(JSPUtil.getParameter(request, "frt_fwrd_cust_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setFacChgCtnt(JSPUtil.getParameter(request, "fac_chg_ctnt", ""));
		setPodGrpTpCd(JSPUtil.getParameter(request, "pod_grp_tp_cd", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setFacFeuRt(JSPUtil.getParameter(request, "fac_feu_rt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setBkgRcvTermCd(JSPUtil.getParameter(request, "bkg_rcv_term_cd", ""));
		setFacAproDt(JSPUtil.getParameter(request, "fac_apro_dt", ""));
		setFacRqstUsrEml(JSPUtil.getParameter(request, "fac_rqst_usr_eml", ""));
		setFacRqstUsrId(JSPUtil.getParameter(request, "fac_rqst_usr_id", ""));
		setRfaNo(JSPUtil.getParameter(request, "rfa_no", ""));
		setFrtFwrdCntCdSeq(JSPUtil.getParameter(request, "frt_fwrd_cnt_cd_seq", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setFacDblFlg(JSPUtil.getParameter(request, "fac_dbl_flg", ""));
		setBkgFacRt(JSPUtil.getParameter(request, "bkg_fac_rt", ""));
		setCmdtCd(JSPUtil.getParameter(request, "cmdt_cd", ""));
		setFacSglFlg(JSPUtil.getParameter(request, "fac_sgl_flg", ""));
		setFacTpCd(JSPUtil.getParameter(request, "fac_tp_cd", ""));
		setShprCntNm(JSPUtil.getParameter(request, "shpr_cnt_nm", ""));
		setFacRqstDt(JSPUtil.getParameter(request, "fac_rqst_dt", ""));
		setFacTeuRt(JSPUtil.getParameter(request, "fac_teu_rt", ""));
		setDelRoutCd(JSPUtil.getParameter(request, "del_rout_cd", ""));
		setFacDivCd(JSPUtil.getParameter(request, "fac_div_cd", ""));
		setPolRoutCd(JSPUtil.getParameter(request, "pol_rout_cd", ""));
		setFacRtSeq(JSPUtil.getParameter(request, "fac_rt_seq", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCommProcRsltRsn(JSPUtil.getParameter(request, "comm_proc_rslt_rsn", ""));
		setFacAproUsrEml(JSPUtil.getParameter(request, "fac_apro_usr_eml", ""));
		setFacSpclCntrRt2(JSPUtil.getParameter(request, "fac_spcl_cntr_rt2", ""));
		setPolGrpTpCd(JSPUtil.getParameter(request, "pol_grp_tp_cd", ""));
		setFacSpclCntrRt1(JSPUtil.getParameter(request, "fac_spcl_cntr_rt1", ""));
		setCnt(JSPUtil.getParameter(request, "cnt", ""));
		setCheck(JSPUtil.getParameter(request, "check", ""));
		setFacRfTeuRt(JSPUtil.getParameter(request, "fac_rf_teu_rt", ""));
		setSStsCd(JSPUtil.getParameter(request, "s_sts_cd", ""));
		setCmdtTpCd(JSPUtil.getParameter(request, "cmdt_tp_cd", ""));
		setShprCntCdSeq(JSPUtil.getParameter(request, "shpr_cnt_cd_seq", ""));
		setFfCntCd(JSPUtil.getParameter(request, "ff_cnt_cd", ""));
		setShprCustSeq(JSPUtil.getParameter(request, "shpr_cust_seq", ""));
		setFacSpclFeuRt(JSPUtil.getParameter(request, "fac_spcl_feu_rt", ""));
		setFacRfFeuRt(JSPUtil.getParameter(request, "fac_rf_feu_rt", ""));
		setBkgDeTermCd(JSPUtil.getParameter(request, "bkg_de_term_cd", ""));
		setFrtFwrdCntCd(JSPUtil.getParameter(request, "frt_fwrd_cnt_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return AgtFacAgmtRtVO[]
	 */
	public AgtFacAgmtRtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return AgtFacAgmtRtVO[]
	 */
	public AgtFacAgmtRtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		AgtFacAgmtRtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] frtFwrdCntNm = (JSPUtil.getParameter(request, prefix	+ "frt_fwrd_cnt_nm", length));
			String[] bkgFacBlAmt = (JSPUtil.getParameter(request, prefix	+ "bkg_fac_bl_amt", length));
			String[] svcScpCd = (JSPUtil.getParameter(request, prefix	+ "svc_scp_cd", length));
			String[] commProcStsCd = (JSPUtil.getParameter(request, prefix	+ "comm_proc_sts_cd", length));
			String[] porGrpTpCd = (JSPUtil.getParameter(request, prefix	+ "por_grp_tp_cd", length));
			String[] facOfcCd = (JSPUtil.getParameter(request, prefix	+ "fac_ofc_cd", length));
			String[] facBxRt = (JSPUtil.getParameter(request, prefix	+ "fac_bx_rt", length));
			String[] grsNetDivCd = (JSPUtil.getParameter(request, prefix	+ "grs_net_div_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] podRoutCd = (JSPUtil.getParameter(request, prefix	+ "pod_rout_cd", length));
			String[] scNo = (JSPUtil.getParameter(request, prefix	+ "sc_no", length));
			String[] fmEffDt = (JSPUtil.getParameter(request, prefix	+ "fm_eff_dt", length));
			String[] porRoutCd = (JSPUtil.getParameter(request, prefix	+ "por_rout_cd", length));
			String[] delGrpTpCd = (JSPUtil.getParameter(request, prefix	+ "del_grp_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] recipientsName = (JSPUtil.getParameter(request, prefix	+ "recipients_name", length));
			String[] facSpclCntrTpCtnt1 = (JSPUtil.getParameter(request, prefix	+ "fac_spcl_cntr_tp_ctnt1", length));
			String[] shprCntCd = (JSPUtil.getParameter(request, prefix	+ "shpr_cnt_cd", length));
			String[] facAproUsrId = (JSPUtil.getParameter(request, prefix	+ "fac_apro_usr_id", length));
			String[] toEffDt = (JSPUtil.getParameter(request, prefix	+ "to_eff_dt", length));
			String[] facSpclCntrTpCtnt2 = (JSPUtil.getParameter(request, prefix	+ "fac_spcl_cntr_tp_ctnt2", length));
			String[] recipientsEml = (JSPUtil.getParameter(request, prefix	+ "recipients_eml", length));
			String[] facSpclTeuRt = (JSPUtil.getParameter(request, prefix	+ "fac_spcl_teu_rt", length));
			String[] frtFwrdCustSeq = (JSPUtil.getParameter(request, prefix	+ "frt_fwrd_cust_seq", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] facChgCtnt = (JSPUtil.getParameter(request, prefix	+ "fac_chg_ctnt", length));
			String[] podGrpTpCd = (JSPUtil.getParameter(request, prefix	+ "pod_grp_tp_cd", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] facFeuRt = (JSPUtil.getParameter(request, prefix	+ "fac_feu_rt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] bkgRcvTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_rcv_term_cd", length));
			String[] facAproDt = (JSPUtil.getParameter(request, prefix	+ "fac_apro_dt", length));
			String[] facRqstUsrEml = (JSPUtil.getParameter(request, prefix	+ "fac_rqst_usr_eml", length));
			String[] facRqstUsrId = (JSPUtil.getParameter(request, prefix	+ "fac_rqst_usr_id", length));
			String[] rfaNo = (JSPUtil.getParameter(request, prefix	+ "rfa_no", length));
			String[] frtFwrdCntCdSeq = (JSPUtil.getParameter(request, prefix	+ "frt_fwrd_cnt_cd_seq", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] facDblFlg = (JSPUtil.getParameter(request, prefix	+ "fac_dbl_flg", length));
			String[] bkgFacRt = (JSPUtil.getParameter(request, prefix	+ "bkg_fac_rt", length));
			String[] cmdtCd = (JSPUtil.getParameter(request, prefix	+ "cmdt_cd", length));
			String[] facSglFlg = (JSPUtil.getParameter(request, prefix	+ "fac_sgl_flg", length));
			String[] facTpCd = (JSPUtil.getParameter(request, prefix	+ "fac_tp_cd", length));
			String[] shprCntNm = (JSPUtil.getParameter(request, prefix	+ "shpr_cnt_nm", length));
			String[] facRqstDt = (JSPUtil.getParameter(request, prefix	+ "fac_rqst_dt", length));
			String[] facTeuRt = (JSPUtil.getParameter(request, prefix	+ "fac_teu_rt", length));
			String[] delRoutCd = (JSPUtil.getParameter(request, prefix	+ "del_rout_cd", length));
			String[] facDivCd = (JSPUtil.getParameter(request, prefix	+ "fac_div_cd", length));
			String[] polRoutCd = (JSPUtil.getParameter(request, prefix	+ "pol_rout_cd", length));
			String[] facRtSeq = (JSPUtil.getParameter(request, prefix	+ "fac_rt_seq", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] commProcRsltRsn = (JSPUtil.getParameter(request, prefix	+ "comm_proc_rslt_rsn", length));
			String[] facAproUsrEml = (JSPUtil.getParameter(request, prefix	+ "fac_apro_usr_eml", length));
			String[] facSpclCntrRt2 = (JSPUtil.getParameter(request, prefix	+ "fac_spcl_cntr_rt2", length));
			String[] polGrpTpCd = (JSPUtil.getParameter(request, prefix	+ "pol_grp_tp_cd", length));
			String[] facSpclCntrRt1 = (JSPUtil.getParameter(request, prefix	+ "fac_spcl_cntr_rt1", length));
			String[] cnt = (JSPUtil.getParameter(request, prefix	+ "cnt", length));
			String[] check = (JSPUtil.getParameter(request, prefix	+ "check", length));
			String[] facRfTeuRt = (JSPUtil.getParameter(request, prefix	+ "fac_rf_teu_rt", length));
			String[] sStsCd = (JSPUtil.getParameter(request, prefix	+ "s_sts_cd", length));
			String[] cmdtTpCd = (JSPUtil.getParameter(request, prefix	+ "cmdt_tp_cd", length));
			String[] shprCntCdSeq = (JSPUtil.getParameter(request, prefix	+ "shpr_cnt_cd_seq", length));
			String[] ffCntCd = (JSPUtil.getParameter(request, prefix	+ "ff_cnt_cd", length));
			String[] shprCustSeq = (JSPUtil.getParameter(request, prefix	+ "shpr_cust_seq", length));
			String[] facSpclFeuRt = (JSPUtil.getParameter(request, prefix	+ "fac_spcl_feu_rt", length));
			String[] facRfFeuRt = (JSPUtil.getParameter(request, prefix	+ "fac_rf_feu_rt", length));
			String[] bkgDeTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_de_term_cd", length));
			String[] frtFwrdCntCd = (JSPUtil.getParameter(request, prefix	+ "frt_fwrd_cnt_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new AgtFacAgmtRtVO();
				if (frtFwrdCntNm[i] != null)
					model.setFrtFwrdCntNm(frtFwrdCntNm[i]);
				if (bkgFacBlAmt[i] != null)
					model.setBkgFacBlAmt(bkgFacBlAmt[i]);
				if (svcScpCd[i] != null)
					model.setSvcScpCd(svcScpCd[i]);
				if (commProcStsCd[i] != null)
					model.setCommProcStsCd(commProcStsCd[i]);
				if (porGrpTpCd[i] != null)
					model.setPorGrpTpCd(porGrpTpCd[i]);
				if (facOfcCd[i] != null)
					model.setFacOfcCd(facOfcCd[i]);
				if (facBxRt[i] != null)
					model.setFacBxRt(facBxRt[i]);
				if (grsNetDivCd[i] != null)
					model.setGrsNetDivCd(grsNetDivCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (podRoutCd[i] != null)
					model.setPodRoutCd(podRoutCd[i]);
				if (scNo[i] != null)
					model.setScNo(scNo[i]);
				if (fmEffDt[i] != null)
					model.setFmEffDt(fmEffDt[i]);
				if (porRoutCd[i] != null)
					model.setPorRoutCd(porRoutCd[i]);
				if (delGrpTpCd[i] != null)
					model.setDelGrpTpCd(delGrpTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (recipientsName[i] != null)
					model.setRecipientsName(recipientsName[i]);
				if (facSpclCntrTpCtnt1[i] != null)
					model.setFacSpclCntrTpCtnt1(facSpclCntrTpCtnt1[i]);
				if (shprCntCd[i] != null)
					model.setShprCntCd(shprCntCd[i]);
				if (facAproUsrId[i] != null)
					model.setFacAproUsrId(facAproUsrId[i]);
				if (toEffDt[i] != null)
					model.setToEffDt(toEffDt[i]);
				if (facSpclCntrTpCtnt2[i] != null)
					model.setFacSpclCntrTpCtnt2(facSpclCntrTpCtnt2[i]);
				if (recipientsEml[i] != null)
					model.setRecipientsEml(recipientsEml[i]);
				if (facSpclTeuRt[i] != null)
					model.setFacSpclTeuRt(facSpclTeuRt[i]);
				if (frtFwrdCustSeq[i] != null)
					model.setFrtFwrdCustSeq(frtFwrdCustSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (facChgCtnt[i] != null)
					model.setFacChgCtnt(facChgCtnt[i]);
				if (podGrpTpCd[i] != null)
					model.setPodGrpTpCd(podGrpTpCd[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (facFeuRt[i] != null)
					model.setFacFeuRt(facFeuRt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (bkgRcvTermCd[i] != null)
					model.setBkgRcvTermCd(bkgRcvTermCd[i]);
				if (facAproDt[i] != null)
					model.setFacAproDt(facAproDt[i]);
				if (facRqstUsrEml[i] != null)
					model.setFacRqstUsrEml(facRqstUsrEml[i]);
				if (facRqstUsrId[i] != null)
					model.setFacRqstUsrId(facRqstUsrId[i]);
				if (rfaNo[i] != null)
					model.setRfaNo(rfaNo[i]);
				if (frtFwrdCntCdSeq[i] != null)
					model.setFrtFwrdCntCdSeq(frtFwrdCntCdSeq[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (facDblFlg[i] != null)
					model.setFacDblFlg(facDblFlg[i]);
				if (bkgFacRt[i] != null)
					model.setBkgFacRt(bkgFacRt[i]);
				if (cmdtCd[i] != null)
					model.setCmdtCd(cmdtCd[i]);
				if (facSglFlg[i] != null)
					model.setFacSglFlg(facSglFlg[i]);
				if (facTpCd[i] != null)
					model.setFacTpCd(facTpCd[i]);
				if (shprCntNm[i] != null)
					model.setShprCntNm(shprCntNm[i]);
				if (facRqstDt[i] != null)
					model.setFacRqstDt(facRqstDt[i]);
				if (facTeuRt[i] != null)
					model.setFacTeuRt(facTeuRt[i]);
				if (delRoutCd[i] != null)
					model.setDelRoutCd(delRoutCd[i]);
				if (facDivCd[i] != null)
					model.setFacDivCd(facDivCd[i]);
				if (polRoutCd[i] != null)
					model.setPolRoutCd(polRoutCd[i]);
				if (facRtSeq[i] != null)
					model.setFacRtSeq(facRtSeq[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (commProcRsltRsn[i] != null)
					model.setCommProcRsltRsn(commProcRsltRsn[i]);
				if (facAproUsrEml[i] != null)
					model.setFacAproUsrEml(facAproUsrEml[i]);
				if (facSpclCntrRt2[i] != null)
					model.setFacSpclCntrRt2(facSpclCntrRt2[i]);
				if (polGrpTpCd[i] != null)
					model.setPolGrpTpCd(polGrpTpCd[i]);
				if (facSpclCntrRt1[i] != null)
					model.setFacSpclCntrRt1(facSpclCntrRt1[i]);
				if (cnt[i] != null)
					model.setCnt(cnt[i]);
				if (check[i] != null)
					model.setCheck(check[i]);
				if (facRfTeuRt[i] != null)
					model.setFacRfTeuRt(facRfTeuRt[i]);
				if (sStsCd[i] != null)
					model.setSStsCd(sStsCd[i]);
				if (cmdtTpCd[i] != null)
					model.setCmdtTpCd(cmdtTpCd[i]);
				if (shprCntCdSeq[i] != null)
					model.setShprCntCdSeq(shprCntCdSeq[i]);
				if (ffCntCd[i] != null)
					model.setFfCntCd(ffCntCd[i]);
				if (shprCustSeq[i] != null)
					model.setShprCustSeq(shprCustSeq[i]);
				if (facSpclFeuRt[i] != null)
					model.setFacSpclFeuRt(facSpclFeuRt[i]);
				if (facRfFeuRt[i] != null)
					model.setFacRfFeuRt(facRfFeuRt[i]);
				if (bkgDeTermCd[i] != null)
					model.setBkgDeTermCd(bkgDeTermCd[i]);
				if (frtFwrdCntCd[i] != null)
					model.setFrtFwrdCntCd(frtFwrdCntCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getAgtFacAgmtRtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return AgtFacAgmtRtVO[]
	 */
	public AgtFacAgmtRtVO[] getAgtFacAgmtRtVOs(){
		AgtFacAgmtRtVO[] vos = (AgtFacAgmtRtVO[])models.toArray(new AgtFacAgmtRtVO[models.size()]);
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
		this.frtFwrdCntNm = this.frtFwrdCntNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgFacBlAmt = this.bkgFacBlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcScpCd = this.svcScpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commProcStsCd = this.commProcStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porGrpTpCd = this.porGrpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facOfcCd = this.facOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facBxRt = this.facBxRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsNetDivCd = this.grsNetDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podRoutCd = this.podRoutCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scNo = this.scNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmEffDt = this.fmEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porRoutCd = this.porRoutCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delGrpTpCd = this.delGrpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.recipientsName = this.recipientsName .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facSpclCntrTpCtnt1 = this.facSpclCntrTpCtnt1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCntCd = this.shprCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facAproUsrId = this.facAproUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toEffDt = this.toEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facSpclCntrTpCtnt2 = this.facSpclCntrTpCtnt2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.recipientsEml = this.recipientsEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facSpclTeuRt = this.facSpclTeuRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frtFwrdCustSeq = this.frtFwrdCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facChgCtnt = this.facChgCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podGrpTpCd = this.podGrpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facFeuRt = this.facFeuRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRcvTermCd = this.bkgRcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facAproDt = this.facAproDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facRqstUsrEml = this.facRqstUsrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facRqstUsrId = this.facRqstUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfaNo = this.rfaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frtFwrdCntCdSeq = this.frtFwrdCntCdSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facDblFlg = this.facDblFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgFacRt = this.bkgFacRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtCd = this.cmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facSglFlg = this.facSglFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facTpCd = this.facTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCntNm = this.shprCntNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facRqstDt = this.facRqstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facTeuRt = this.facTeuRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delRoutCd = this.delRoutCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facDivCd = this.facDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polRoutCd = this.polRoutCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facRtSeq = this.facRtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commProcRsltRsn = this.commProcRsltRsn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facAproUsrEml = this.facAproUsrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facSpclCntrRt2 = this.facSpclCntrRt2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polGrpTpCd = this.polGrpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facSpclCntrRt1 = this.facSpclCntrRt1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnt = this.cnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.check = this.check .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facRfTeuRt = this.facRfTeuRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sStsCd = this.sStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtTpCd = this.cmdtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCntCdSeq = this.shprCntCdSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ffCntCd = this.ffCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCustSeq = this.shprCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facSpclFeuRt = this.facSpclFeuRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facRfFeuRt = this.facRfFeuRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgDeTermCd = this.bkgDeTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frtFwrdCntCd = this.frtFwrdCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
