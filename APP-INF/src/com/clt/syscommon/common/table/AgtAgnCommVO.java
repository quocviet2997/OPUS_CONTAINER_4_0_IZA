/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : AgtAgnCommVO.java
*@FileTitle : AgtAgnCommVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.01.14
*@LastModifier : 박성진
*@LastVersion : 1.0
* 2010.01.14 박성진 
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

public class AgtAgnCommVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<AgtAgnCommVO> models = new ArrayList<AgtAgnCommVO>();
	
	/* Column Info */
	private String monXchRt = null;
	/* Column Info */
	private String vndrCntCd = null;
	/* Column Info */
	private String glDt = null;
	/* Column Info */
	private String commRevDirCd = null;
	/* Column Info */
	private String commSlanCd = null;
	/* Column Info */
	private String commProcStsCd = null;
	/* Column Info */
	private String commSkdDirCd = null;
	/* Column Info */
	private String commSkdVoyNo = null;
	/* Column Info */
	private String hlgDdctAmt = null;
	/* Column Info */
	private String sAgnCd = null;
	/* Column Info */
	private String sailArrDt = null;
	/* Column Info */
	private String grsNetDivCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String stsCd = null;
	/* Column Info */
	private String acIfUsrId = null;
	/* Column Info */
	private String actIfCommAmt = null;
	/* Column Info */
	private String commAproNo = null;
	/* Column Info */
	private String actCommAmt = null;
	/* Column Info */
	private String bkgCreDt = null;
	/* Column Info */
	private String actLoclCommAmt = null;
	/* Column Info */
	private String acTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String commStndCostCd = null;
	/* Column Info */
	private String estmUsdAmt = null;
	/* Column Info */
	private String csrNo = null;
	/* Column Info */
	private String apOfcCd = null;
	/* Column Info */
	private String acclFlg = null;
	/* Column Info */
	private String acRqstUsrId = null;
	/* Column Info */
	private String acAproUsrId = null;
	/* Column Info */
	private String commProcStsRsn = null;
	/* Column Info */
	private String toDate = null;
	/* Column Info */
	private String commVslCd = null;
	/* Column Info */
	private String otrCommAcctCtnt = null;
	/* Column Info */
	private String vvd = null;
	/* Column Info */
	private String fdrgDdctAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String dlyXchRt = null;
	/* Column Info */
	private String commOccrInfoCd = null;
	/* Column Info */
	private String fromDate = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String actPreLoclCommAmt = null;
	/* Column Info */
	private String acTpCdNum = null;
	/* Column Info */
	private String svcSpcCd = null;
	/* Column Info */
	private String vvdChkYn = null;
	/* Column Info */
	private String aplyDt = null;
	/* Column Info */
	private String asaNo = null;
	/* Column Info */
	private String apCtrCd = null;
	/* Column Info */
	private String acAproDt = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String acRqstDt = null;
	/* Column Info */
	private String vndrLglEngNm = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String ofcEngNm = null;
	/* Column Info */
	private String expType = null;
	/* Column Info */
	private String xchRtAplyLvl = null;
	/* Column Info */
	private String agnAgmtNo = null;
	/* Column Info */
	private String agnCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String agnAgmtRt = null;
	/* Column Info */
	private String chgDdctAmt = null;
	/* Column Info */
	private String acIfDt = null;
	/* Column Info */
	private String ofcChrLvl = null;
	/* Column Info */
	private String invTaxRt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String scnId = null;
	/* Column Info */
	private String aproNo = null;
	/* Column Info */
	private String actIfLoclCommAmt = null;
	/* Column Info */
	private String bkgNoSplit = null;
	/* Column Info */
	private String xchRt = null;
	/* Column Info */
	private String arrVal = null;
	/* Column Info */
	private String agnAproRmk = null;
	/* Column Info */
	private String localDate = null;
	/* Column Info */
	private String commYrmon = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Column Info */
	private String arOfcCd = null;
	/* Column Info */
	private String acRqstUsrEml = null;
	/* Column Info */
	private String commRlaneCd = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String vvdXchRt = null;
	/* Column Info */
	private String acSeq = null;
	/* Column Info */
	private String offstAgnFlg = null;
	/* Column Info */
	private String sAproNo = null;
	/* Column Info */
	private String actPreCommAmt = null;
	/* Column Info */
	private String acAproUsrEml = null;

	private String blNo = null;
	
	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public AgtAgnCommVO() {}

	public AgtAgnCommVO(String ibflag, String pagerows, String monXchRt, String vndrCntCd, String glDt, String fromDate, String toDate, String commRevDirCd, String commSlanCd, String commProcStsCd, String commSkdDirCd, String commSkdVoyNo, String hlgDdctAmt, String sailArrDt, String grsNetDivCd, String stsCd, String acIfUsrId, String actIfCommAmt, String commAproNo, String actCommAmt, String bkgCreDt, String acTpCd, String actLoclCommAmt, String updUsrId, String commStndCostCd, String estmUsdAmt, String csrNo, String apOfcCd, String acclFlg, String acRqstUsrId, String acAproUsrId, String commProcStsRsn, String commVslCd, String otrCommAcctCtnt, String vvd, String fdrgDdctAmt, String creUsrId, String bkgNo, String dlyXchRt, String commOccrInfoCd, String vndrSeq, String actPreLoclCommAmt, String svcSpcCd, String vvdChkYn, String aplyDt, String asaNo, String apCtrCd, String acAproDt, String currCd, String creDt, String vndrLglEngNm, String acRqstDt, String ofcEngNm, String xchRtAplyLvl, String expType, String agnAgmtNo, String agnCd, String agnAgmtRt, String acIfDt, String chgDdctAmt, String ofcChrLvl, String invTaxRt, String updDt, String scnId, String aproNo, String sAproNo, String bkgNoSplit, String actIfLoclCommAmt, String agnAproRmk, String arrVal, String commYrmon, String ioBndCd, String acRqstUsrEml, String arOfcCd, String commRlaneCd, String invNo, String ofcCd, String vvdXchRt, String acSeq, String offstAgnFlg, String actPreCommAmt, String acAproUsrEml, String xchRt, String acTpCdNum, String localDate, String sAgnCd, String blNo) {
		this.monXchRt = monXchRt;
		this.vndrCntCd = vndrCntCd;
		this.glDt = glDt;
		this.commRevDirCd = commRevDirCd;
		this.commSlanCd = commSlanCd;
		this.commProcStsCd = commProcStsCd;
		this.commSkdDirCd = commSkdDirCd;
		this.commSkdVoyNo = commSkdVoyNo;
		this.hlgDdctAmt = hlgDdctAmt;
		this.sAgnCd = sAgnCd;
		this.sailArrDt = sailArrDt;
		this.grsNetDivCd = grsNetDivCd;
		this.pagerows = pagerows;
		this.stsCd = stsCd;
		this.acIfUsrId = acIfUsrId;
		this.actIfCommAmt = actIfCommAmt;
		this.commAproNo = commAproNo;
		this.actCommAmt = actCommAmt;
		this.bkgCreDt = bkgCreDt;
		this.actLoclCommAmt = actLoclCommAmt;
		this.acTpCd = acTpCd;
		this.updUsrId = updUsrId;
		this.commStndCostCd = commStndCostCd;
		this.estmUsdAmt = estmUsdAmt;
		this.csrNo = csrNo;
		this.apOfcCd = apOfcCd;
		this.acclFlg = acclFlg;
		this.acRqstUsrId = acRqstUsrId;
		this.acAproUsrId = acAproUsrId;
		this.commProcStsRsn = commProcStsRsn;
		this.toDate = toDate;
		this.commVslCd = commVslCd;
		this.otrCommAcctCtnt = otrCommAcctCtnt;
		this.vvd = vvd;
		this.fdrgDdctAmt = fdrgDdctAmt;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.dlyXchRt = dlyXchRt;
		this.commOccrInfoCd = commOccrInfoCd;
		this.fromDate = fromDate;
		this.vndrSeq = vndrSeq;
		this.actPreLoclCommAmt = actPreLoclCommAmt;
		this.acTpCdNum = acTpCdNum;
		this.svcSpcCd = svcSpcCd;
		this.vvdChkYn = vvdChkYn;
		this.aplyDt = aplyDt;
		this.asaNo = asaNo;
		this.apCtrCd = apCtrCd;
		this.acAproDt = acAproDt;
		this.currCd = currCd;
		this.acRqstDt = acRqstDt;
		this.vndrLglEngNm = vndrLglEngNm;
		this.creDt = creDt;
		this.ofcEngNm = ofcEngNm;
		this.expType = expType;
		this.xchRtAplyLvl = xchRtAplyLvl;
		this.agnAgmtNo = agnAgmtNo;
		this.agnCd = agnCd;
		this.ibflag = ibflag;
		this.agnAgmtRt = agnAgmtRt;
		this.chgDdctAmt = chgDdctAmt;
		this.acIfDt = acIfDt;
		this.ofcChrLvl = ofcChrLvl;
		this.invTaxRt = invTaxRt;
		this.updDt = updDt;
		this.scnId = scnId;
		this.aproNo = aproNo;
		this.actIfLoclCommAmt = actIfLoclCommAmt;
		this.bkgNoSplit = bkgNoSplit;
		this.xchRt = xchRt;
		this.arrVal = arrVal;
		this.agnAproRmk = agnAproRmk;
		this.localDate = localDate;
		this.commYrmon = commYrmon;
		this.ioBndCd = ioBndCd;
		this.arOfcCd = arOfcCd;
		this.acRqstUsrEml = acRqstUsrEml;
		this.commRlaneCd = commRlaneCd;
		this.invNo = invNo;
		this.ofcCd = ofcCd;
		this.vvdXchRt = vvdXchRt;
		this.acSeq = acSeq;
		this.offstAgnFlg = offstAgnFlg;
		this.sAproNo = sAproNo;
		this.actPreCommAmt = actPreCommAmt;
		this.acAproUsrEml = acAproUsrEml;
		this.blNo = blNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("mon_xch_rt", getMonXchRt());
		this.hashColumns.put("vndr_cnt_cd", getVndrCntCd());
		this.hashColumns.put("gl_dt", getGlDt());
		this.hashColumns.put("comm_rev_dir_cd", getCommRevDirCd());
		this.hashColumns.put("comm_slan_cd", getCommSlanCd());
		this.hashColumns.put("comm_proc_sts_cd", getCommProcStsCd());
		this.hashColumns.put("comm_skd_dir_cd", getCommSkdDirCd());
		this.hashColumns.put("comm_skd_voy_no", getCommSkdVoyNo());
		this.hashColumns.put("hlg_ddct_amt", getHlgDdctAmt());
		this.hashColumns.put("s_agn_cd", getSAgnCd());
		this.hashColumns.put("sail_arr_dt", getSailArrDt());
		this.hashColumns.put("grs_net_div_cd", getGrsNetDivCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("sts_cd", getStsCd());
		this.hashColumns.put("ac_if_usr_id", getAcIfUsrId());
		this.hashColumns.put("act_if_comm_amt", getActIfCommAmt());
		this.hashColumns.put("comm_apro_no", getCommAproNo());
		this.hashColumns.put("act_comm_amt", getActCommAmt());
		this.hashColumns.put("bkg_cre_dt", getBkgCreDt());
		this.hashColumns.put("act_locl_comm_amt", getActLoclCommAmt());
		this.hashColumns.put("ac_tp_cd", getAcTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("comm_stnd_cost_cd", getCommStndCostCd());
		this.hashColumns.put("estm_usd_amt", getEstmUsdAmt());
		this.hashColumns.put("csr_no", getCsrNo());
		this.hashColumns.put("ap_ofc_cd", getApOfcCd());
		this.hashColumns.put("accl_flg", getAcclFlg());
		this.hashColumns.put("ac_rqst_usr_id", getAcRqstUsrId());
		this.hashColumns.put("ac_apro_usr_id", getAcAproUsrId());
		this.hashColumns.put("comm_proc_sts_rsn", getCommProcStsRsn());
		this.hashColumns.put("to_date", getToDate());
		this.hashColumns.put("comm_vsl_cd", getCommVslCd());
		this.hashColumns.put("otr_comm_acct_ctnt", getOtrCommAcctCtnt());
		this.hashColumns.put("vvd", getVvd());
		this.hashColumns.put("fdrg_ddct_amt", getFdrgDdctAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("dly_xch_rt", getDlyXchRt());
		this.hashColumns.put("comm_occr_info_cd", getCommOccrInfoCd());
		this.hashColumns.put("from_date", getFromDate());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("act_pre_locl_comm_amt", getActPreLoclCommAmt());
		this.hashColumns.put("ac_tp_cd_num", getAcTpCdNum());
		this.hashColumns.put("svc_spc_cd", getSvcSpcCd());
		this.hashColumns.put("vvd_chk_yn", getVvdChkYn());
		this.hashColumns.put("aply_dt", getAplyDt());
		this.hashColumns.put("asa_no", getAsaNo());
		this.hashColumns.put("ap_ctr_cd", getApCtrCd());
		this.hashColumns.put("ac_apro_dt", getAcAproDt());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("ac_rqst_dt", getAcRqstDt());
		this.hashColumns.put("vndr_lgl_eng_nm", getVndrLglEngNm());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ofc_eng_nm", getOfcEngNm());
		this.hashColumns.put("exp_type", getExpType());
		this.hashColumns.put("xch_rt_aply_lvl", getXchRtAplyLvl());
		this.hashColumns.put("agn_agmt_no", getAgnAgmtNo());
		this.hashColumns.put("agn_cd", getAgnCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("agn_agmt_rt", getAgnAgmtRt());
		this.hashColumns.put("chg_ddct_amt", getChgDdctAmt());
		this.hashColumns.put("ac_if_dt", getAcIfDt());
		this.hashColumns.put("ofc_chr_lvl", getOfcChrLvl());
		this.hashColumns.put("inv_tax_rt", getInvTaxRt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("scn_id", getScnId());
		this.hashColumns.put("apro_no", getAproNo());
		this.hashColumns.put("act_if_locl_comm_amt", getActIfLoclCommAmt());
		this.hashColumns.put("bkg_no_split", getBkgNoSplit());
		this.hashColumns.put("xch_rt", getXchRt());
		this.hashColumns.put("arr_val", getArrVal());
		this.hashColumns.put("agn_apro_rmk", getAgnAproRmk());
		this.hashColumns.put("local_date", getLocalDate());
		this.hashColumns.put("comm_yrmon", getCommYrmon());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("ar_ofc_cd", getArOfcCd());
		this.hashColumns.put("ac_rqst_usr_eml", getAcRqstUsrEml());
		this.hashColumns.put("comm_rlane_cd", getCommRlaneCd());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("vvd_xch_rt", getVvdXchRt());
		this.hashColumns.put("ac_seq", getAcSeq());
		this.hashColumns.put("offst_agn_flg", getOffstAgnFlg());
		this.hashColumns.put("s_apro_no", getSAproNo());
		this.hashColumns.put("act_pre_comm_amt", getActPreCommAmt());
		this.hashColumns.put("ac_apro_usr_eml", getAcAproUsrEml());
		this.hashColumns.put("bl_no", getBlNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("mon_xch_rt", "monXchRt");
		this.hashFields.put("vndr_cnt_cd", "vndrCntCd");
		this.hashFields.put("gl_dt", "glDt");
		this.hashFields.put("comm_rev_dir_cd", "commRevDirCd");
		this.hashFields.put("comm_slan_cd", "commSlanCd");
		this.hashFields.put("comm_proc_sts_cd", "commProcStsCd");
		this.hashFields.put("comm_skd_dir_cd", "commSkdDirCd");
		this.hashFields.put("comm_skd_voy_no", "commSkdVoyNo");
		this.hashFields.put("hlg_ddct_amt", "hlgDdctAmt");
		this.hashFields.put("s_agn_cd", "sAgnCd");
		this.hashFields.put("sail_arr_dt", "sailArrDt");
		this.hashFields.put("grs_net_div_cd", "grsNetDivCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("sts_cd", "stsCd");
		this.hashFields.put("ac_if_usr_id", "acIfUsrId");
		this.hashFields.put("act_if_comm_amt", "actIfCommAmt");
		this.hashFields.put("comm_apro_no", "commAproNo");
		this.hashFields.put("act_comm_amt", "actCommAmt");
		this.hashFields.put("bkg_cre_dt", "bkgCreDt");
		this.hashFields.put("act_locl_comm_amt", "actLoclCommAmt");
		this.hashFields.put("ac_tp_cd", "acTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("comm_stnd_cost_cd", "commStndCostCd");
		this.hashFields.put("estm_usd_amt", "estmUsdAmt");
		this.hashFields.put("csr_no", "csrNo");
		this.hashFields.put("ap_ofc_cd", "apOfcCd");
		this.hashFields.put("accl_flg", "acclFlg");
		this.hashFields.put("ac_rqst_usr_id", "acRqstUsrId");
		this.hashFields.put("ac_apro_usr_id", "acAproUsrId");
		this.hashFields.put("comm_proc_sts_rsn", "commProcStsRsn");
		this.hashFields.put("to_date", "toDate");
		this.hashFields.put("comm_vsl_cd", "commVslCd");
		this.hashFields.put("otr_comm_acct_ctnt", "otrCommAcctCtnt");
		this.hashFields.put("vvd", "vvd");
		this.hashFields.put("fdrg_ddct_amt", "fdrgDdctAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("dly_xch_rt", "dlyXchRt");
		this.hashFields.put("comm_occr_info_cd", "commOccrInfoCd");
		this.hashFields.put("from_date", "fromDate");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("act_pre_locl_comm_amt", "actPreLoclCommAmt");
		this.hashFields.put("ac_tp_cd_num", "acTpCdNum");
		this.hashFields.put("svc_spc_cd", "svcSpcCd");
		this.hashFields.put("vvd_chk_yn", "vvdChkYn");
		this.hashFields.put("aply_dt", "aplyDt");
		this.hashFields.put("asa_no", "asaNo");
		this.hashFields.put("ap_ctr_cd", "apCtrCd");
		this.hashFields.put("ac_apro_dt", "acAproDt");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("ac_rqst_dt", "acRqstDt");
		this.hashFields.put("vndr_lgl_eng_nm", "vndrLglEngNm");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ofc_eng_nm", "ofcEngNm");
		this.hashFields.put("exp_type", "expType");
		this.hashFields.put("xch_rt_aply_lvl", "xchRtAplyLvl");
		this.hashFields.put("agn_agmt_no", "agnAgmtNo");
		this.hashFields.put("agn_cd", "agnCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("agn_agmt_rt", "agnAgmtRt");
		this.hashFields.put("chg_ddct_amt", "chgDdctAmt");
		this.hashFields.put("ac_if_dt", "acIfDt");
		this.hashFields.put("ofc_chr_lvl", "ofcChrLvl");
		this.hashFields.put("inv_tax_rt", "invTaxRt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("scn_id", "scnId");
		this.hashFields.put("apro_no", "aproNo");
		this.hashFields.put("act_if_locl_comm_amt", "actIfLoclCommAmt");
		this.hashFields.put("bkg_no_split", "bkgNoSplit");
		this.hashFields.put("xch_rt", "xchRt");
		this.hashFields.put("arr_val", "arrVal");
		this.hashFields.put("agn_apro_rmk", "agnAproRmk");
		this.hashFields.put("local_date", "localDate");
		this.hashFields.put("comm_yrmon", "commYrmon");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("ar_ofc_cd", "arOfcCd");
		this.hashFields.put("ac_rqst_usr_eml", "acRqstUsrEml");
		this.hashFields.put("comm_rlane_cd", "commRlaneCd");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("vvd_xch_rt", "vvdXchRt");
		this.hashFields.put("ac_seq", "acSeq");
		this.hashFields.put("offst_agn_flg", "offstAgnFlg");
		this.hashFields.put("s_apro_no", "sAproNo");
		this.hashFields.put("act_pre_comm_amt", "actPreCommAmt");
		this.hashFields.put("ac_apro_usr_eml", "acAproUsrEml");
		this.hashFields.put("bl_no", "blNo");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return monXchRt
	 */
	public String getMonXchRt() {
		return this.monXchRt;
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
	 * @return commRevDirCd
	 */
	public String getCommRevDirCd() {
		return this.commRevDirCd;
	}
	
	/**
	 * Column Info
	 * @return commSlanCd
	 */
	public String getCommSlanCd() {
		return this.commSlanCd;
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
	 * @return commSkdDirCd
	 */
	public String getCommSkdDirCd() {
		return this.commSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return commSkdVoyNo
	 */
	public String getCommSkdVoyNo() {
		return this.commSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return hlgDdctAmt
	 */
	public String getHlgDdctAmt() {
		return this.hlgDdctAmt;
	}
	
	/**
	 * Column Info
	 * @return sAgnCd
	 */
	public String getSAgnCd() {
		return this.sAgnCd;
	}
	
	/**
	 * Column Info
	 * @return sailArrDt
	 */
	public String getSailArrDt() {
		return this.sailArrDt;
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
	 * @return stsCd
	 */
	public String getStsCd() {
		return this.stsCd;
	}
	
	/**
	 * Column Info
	 * @return acIfUsrId
	 */
	public String getAcIfUsrId() {
		return this.acIfUsrId;
	}
	
	/**
	 * Column Info
	 * @return actIfCommAmt
	 */
	public String getActIfCommAmt() {
		return this.actIfCommAmt;
	}
	
	/**
	 * Column Info
	 * @return commAproNo
	 */
	public String getCommAproNo() {
		return this.commAproNo;
	}
	
	/**
	 * Column Info
	 * @return actCommAmt
	 */
	public String getActCommAmt() {
		return this.actCommAmt;
	}
	
	/**
	 * Column Info
	 * @return bkgCreDt
	 */
	public String getBkgCreDt() {
		return this.bkgCreDt;
	}
	
	/**
	 * Column Info
	 * @return actLoclCommAmt
	 */
	public String getActLoclCommAmt() {
		return this.actLoclCommAmt;
	}
	
	/**
	 * Column Info
	 * @return acTpCd
	 */
	public String getAcTpCd() {
		return this.acTpCd;
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
	 * @return commStndCostCd
	 */
	public String getCommStndCostCd() {
		return this.commStndCostCd;
	}
	
	/**
	 * Column Info
	 * @return estmUsdAmt
	 */
	public String getEstmUsdAmt() {
		return this.estmUsdAmt;
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
	 * @return apOfcCd
	 */
	public String getApOfcCd() {
		return this.apOfcCd;
	}
	
	/**
	 * Column Info
	 * @return acclFlg
	 */
	public String getAcclFlg() {
		return this.acclFlg;
	}
	
	/**
	 * Column Info
	 * @return acRqstUsrId
	 */
	public String getAcRqstUsrId() {
		return this.acRqstUsrId;
	}
	
	/**
	 * Column Info
	 * @return acAproUsrId
	 */
	public String getAcAproUsrId() {
		return this.acAproUsrId;
	}
	
	/**
	 * Column Info
	 * @return commProcStsRsn
	 */
	public String getCommProcStsRsn() {
		return this.commProcStsRsn;
	}
	
	/**
	 * Column Info
	 * @return toDate
	 */
	public String getToDate() {
		return this.toDate;
	}
	
	/**
	 * Column Info
	 * @return commVslCd
	 */
	public String getCommVslCd() {
		return this.commVslCd;
	}
	
	/**
	 * Column Info
	 * @return otrCommAcctCtnt
	 */
	public String getOtrCommAcctCtnt() {
		return this.otrCommAcctCtnt;
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
	 * @return fdrgDdctAmt
	 */
	public String getFdrgDdctAmt() {
		return this.fdrgDdctAmt;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return dlyXchRt
	 */
	public String getDlyXchRt() {
		return this.dlyXchRt;
	}
	
	/**
	 * Column Info
	 * @return commOccrInfoCd
	 */
	public String getCommOccrInfoCd() {
		return this.commOccrInfoCd;
	}
	
	/**
	 * Column Info
	 * @return fromDate
	 */
	public String getFromDate() {
		return this.fromDate;
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
	 * @return actPreLoclCommAmt
	 */
	public String getActPreLoclCommAmt() {
		return this.actPreLoclCommAmt;
	}
	
	/**
	 * Column Info
	 * @return acTpCdNum
	 */
	public String getAcTpCdNum() {
		return this.acTpCdNum;
	}
	
	/**
	 * Column Info
	 * @return svcSpcCd
	 */
	public String getSvcSpcCd() {
		return this.svcSpcCd;
	}
	
	/**
	 * Column Info
	 * @return vvdChkYn
	 */
	public String getVvdChkYn() {
		return this.vvdChkYn;
	}
	
	/**
	 * Column Info
	 * @return aplyDt
	 */
	public String getAplyDt() {
		return this.aplyDt;
	}
	
	/**
	 * Column Info
	 * @return asaNo
	 */
	public String getAsaNo() {
		return this.asaNo;
	}
	
	/**
	 * Column Info
	 * @return apCtrCd
	 */
	public String getApCtrCd() {
		return this.apCtrCd;
	}
	
	/**
	 * Column Info
	 * @return acAproDt
	 */
	public String getAcAproDt() {
		return this.acAproDt;
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
	 * @return acRqstDt
	 */
	public String getAcRqstDt() {
		return this.acRqstDt;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return ofcEngNm
	 */
	public String getOfcEngNm() {
		return this.ofcEngNm;
	}
	
	/**
	 * Column Info
	 * @return expType
	 */
	public String getExpType() {
		return this.expType;
	}
	
	/**
	 * Column Info
	 * @return xchRtAplyLvl
	 */
	public String getXchRtAplyLvl() {
		return this.xchRtAplyLvl;
	}
	
	/**
	 * Column Info
	 * @return agnAgmtNo
	 */
	public String getAgnAgmtNo() {
		return this.agnAgmtNo;
	}
	
	/**
	 * Column Info
	 * @return agnCd
	 */
	public String getAgnCd() {
		return this.agnCd;
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
	 * @return agnAgmtRt
	 */
	public String getAgnAgmtRt() {
		return this.agnAgmtRt;
	}
	
	/**
	 * Column Info
	 * @return chgDdctAmt
	 */
	public String getChgDdctAmt() {
		return this.chgDdctAmt;
	}
	
	/**
	 * Column Info
	 * @return acIfDt
	 */
	public String getAcIfDt() {
		return this.acIfDt;
	}
	
	/**
	 * Column Info
	 * @return ofcChrLvl
	 */
	public String getOfcChrLvl() {
		return this.ofcChrLvl;
	}
	
	/**
	 * Column Info
	 * @return invTaxRt
	 */
	public String getInvTaxRt() {
		return this.invTaxRt;
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
	 * @return scnId
	 */
	public String getScnId() {
		return this.scnId;
	}
	
	/**
	 * Column Info
	 * @return aproNo
	 */
	public String getAproNo() {
		return this.aproNo;
	}
	
	/**
	 * Column Info
	 * @return actIfLoclCommAmt
	 */
	public String getActIfLoclCommAmt() {
		return this.actIfLoclCommAmt;
	}
	
	/**
	 * Column Info
	 * @return bkgNoSplit
	 */
	public String getBkgNoSplit() {
		return this.bkgNoSplit;
	}
	
	/**
	 * Column Info
	 * @return xchRt
	 */
	public String getXchRt() {
		return this.xchRt;
	}
	
	/**
	 * Column Info
	 * @return arrVal
	 */
	public String getArrVal() {
		return this.arrVal;
	}
	
	/**
	 * Column Info
	 * @return agnAproRmk
	 */
	public String getAgnAproRmk() {
		return this.agnAproRmk;
	}
	
	/**
	 * Column Info
	 * @return localDate
	 */
	public String getLocalDate() {
		return this.localDate;
	}
	
	/**
	 * Column Info
	 * @return commYrmon
	 */
	public String getCommYrmon() {
		return this.commYrmon;
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
	 * @return arOfcCd
	 */
	public String getArOfcCd() {
		return this.arOfcCd;
	}
	
	/**
	 * Column Info
	 * @return acRqstUsrEml
	 */
	public String getAcRqstUsrEml() {
		return this.acRqstUsrEml;
	}
	
	/**
	 * Column Info
	 * @return commRlaneCd
	 */
	public String getCommRlaneCd() {
		return this.commRlaneCd;
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
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
	}
	
	/**
	 * Column Info
	 * @return vvdXchRt
	 */
	public String getVvdXchRt() {
		return this.vvdXchRt;
	}
	
	/**
	 * Column Info
	 * @return acSeq
	 */
	public String getAcSeq() {
		return this.acSeq;
	}
	
	/**
	 * Column Info
	 * @return offstAgnFlg
	 */
	public String getOffstAgnFlg() {
		return this.offstAgnFlg;
	}
	
	/**
	 * Column Info
	 * @return sAproNo
	 */
	public String getSAproNo() {
		return this.sAproNo;
	}
	
	/**
	 * Column Info
	 * @return actPreCommAmt
	 */
	public String getActPreCommAmt() {
		return this.actPreCommAmt;
	}
	
	
	public String getBlNo() {
		return blNo;
	}

	public void setBlNo(String blNo) {
		this.blNo = blNo;
	}

	/**
	 * Column Info
	 * @return acAproUsrEml
	 */
	public String getAcAproUsrEml() {
		return this.acAproUsrEml;
	}
	

	/**
	 * Column Info
	 * @param monXchRt
	 */
	public void setMonXchRt(String monXchRt) {
		this.monXchRt = monXchRt;
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
	 * @param commRevDirCd
	 */
	public void setCommRevDirCd(String commRevDirCd) {
		this.commRevDirCd = commRevDirCd;
	}
	
	/**
	 * Column Info
	 * @param commSlanCd
	 */
	public void setCommSlanCd(String commSlanCd) {
		this.commSlanCd = commSlanCd;
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
	 * @param commSkdDirCd
	 */
	public void setCommSkdDirCd(String commSkdDirCd) {
		this.commSkdDirCd = commSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param commSkdVoyNo
	 */
	public void setCommSkdVoyNo(String commSkdVoyNo) {
		this.commSkdVoyNo = commSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param hlgDdctAmt
	 */
	public void setHlgDdctAmt(String hlgDdctAmt) {
		this.hlgDdctAmt = hlgDdctAmt;
	}
	
	/**
	 * Column Info
	 * @param sAgnCd
	 */
	public void setSAgnCd(String sAgnCd) {
		this.sAgnCd = sAgnCd;
	}
	
	/**
	 * Column Info
	 * @param sailArrDt
	 */
	public void setSailArrDt(String sailArrDt) {
		this.sailArrDt = sailArrDt;
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
	 * @param stsCd
	 */
	public void setStsCd(String stsCd) {
		this.stsCd = stsCd;
	}
	
	/**
	 * Column Info
	 * @param acIfUsrId
	 */
	public void setAcIfUsrId(String acIfUsrId) {
		this.acIfUsrId = acIfUsrId;
	}
	
	/**
	 * Column Info
	 * @param actIfCommAmt
	 */
	public void setActIfCommAmt(String actIfCommAmt) {
		this.actIfCommAmt = actIfCommAmt;
	}
	
	/**
	 * Column Info
	 * @param commAproNo
	 */
	public void setCommAproNo(String commAproNo) {
		this.commAproNo = commAproNo;
	}
	
	/**
	 * Column Info
	 * @param actCommAmt
	 */
	public void setActCommAmt(String actCommAmt) {
		this.actCommAmt = actCommAmt;
	}
	
	/**
	 * Column Info
	 * @param bkgCreDt
	 */
	public void setBkgCreDt(String bkgCreDt) {
		this.bkgCreDt = bkgCreDt;
	}
	
	/**
	 * Column Info
	 * @param actLoclCommAmt
	 */
	public void setActLoclCommAmt(String actLoclCommAmt) {
		this.actLoclCommAmt = actLoclCommAmt;
	}
	
	/**
	 * Column Info
	 * @param acTpCd
	 */
	public void setAcTpCd(String acTpCd) {
		this.acTpCd = acTpCd;
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
	 * @param commStndCostCd
	 */
	public void setCommStndCostCd(String commStndCostCd) {
		this.commStndCostCd = commStndCostCd;
	}
	
	/**
	 * Column Info
	 * @param estmUsdAmt
	 */
	public void setEstmUsdAmt(String estmUsdAmt) {
		this.estmUsdAmt = estmUsdAmt;
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
	 * @param apOfcCd
	 */
	public void setApOfcCd(String apOfcCd) {
		this.apOfcCd = apOfcCd;
	}
	
	/**
	 * Column Info
	 * @param acclFlg
	 */
	public void setAcclFlg(String acclFlg) {
		this.acclFlg = acclFlg;
	}
	
	/**
	 * Column Info
	 * @param acRqstUsrId
	 */
	public void setAcRqstUsrId(String acRqstUsrId) {
		this.acRqstUsrId = acRqstUsrId;
	}
	
	/**
	 * Column Info
	 * @param acAproUsrId
	 */
	public void setAcAproUsrId(String acAproUsrId) {
		this.acAproUsrId = acAproUsrId;
	}
	
	/**
	 * Column Info
	 * @param commProcStsRsn
	 */
	public void setCommProcStsRsn(String commProcStsRsn) {
		this.commProcStsRsn = commProcStsRsn;
	}
	
	/**
	 * Column Info
	 * @param toDate
	 */
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	/**
	 * Column Info
	 * @param commVslCd
	 */
	public void setCommVslCd(String commVslCd) {
		this.commVslCd = commVslCd;
	}
	
	/**
	 * Column Info
	 * @param otrCommAcctCtnt
	 */
	public void setOtrCommAcctCtnt(String otrCommAcctCtnt) {
		this.otrCommAcctCtnt = otrCommAcctCtnt;
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
	 * @param fdrgDdctAmt
	 */
	public void setFdrgDdctAmt(String fdrgDdctAmt) {
		this.fdrgDdctAmt = fdrgDdctAmt;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param dlyXchRt
	 */
	public void setDlyXchRt(String dlyXchRt) {
		this.dlyXchRt = dlyXchRt;
	}
	
	/**
	 * Column Info
	 * @param commOccrInfoCd
	 */
	public void setCommOccrInfoCd(String commOccrInfoCd) {
		this.commOccrInfoCd = commOccrInfoCd;
	}
	
	/**
	 * Column Info
	 * @param fromDate
	 */
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
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
	 * @param actPreLoclCommAmt
	 */
	public void setActPreLoclCommAmt(String actPreLoclCommAmt) {
		this.actPreLoclCommAmt = actPreLoclCommAmt;
	}
	
	/**
	 * Column Info
	 * @param acTpCdNum
	 */
	public void setAcTpCdNum(String acTpCdNum) {
		this.acTpCdNum = acTpCdNum;
	}
	
	/**
	 * Column Info
	 * @param svcSpcCd
	 */
	public void setSvcSpcCd(String svcSpcCd) {
		this.svcSpcCd = svcSpcCd;
	}
	
	/**
	 * Column Info
	 * @param vvdChkYn
	 */
	public void setVvdChkYn(String vvdChkYn) {
		this.vvdChkYn = vvdChkYn;
	}
	
	/**
	 * Column Info
	 * @param aplyDt
	 */
	public void setAplyDt(String aplyDt) {
		this.aplyDt = aplyDt;
	}
	
	/**
	 * Column Info
	 * @param asaNo
	 */
	public void setAsaNo(String asaNo) {
		this.asaNo = asaNo;
	}
	
	/**
	 * Column Info
	 * @param apCtrCd
	 */
	public void setApCtrCd(String apCtrCd) {
		this.apCtrCd = apCtrCd;
	}
	
	/**
	 * Column Info
	 * @param acAproDt
	 */
	public void setAcAproDt(String acAproDt) {
		this.acAproDt = acAproDt;
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
	 * @param acRqstDt
	 */
	public void setAcRqstDt(String acRqstDt) {
		this.acRqstDt = acRqstDt;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param ofcEngNm
	 */
	public void setOfcEngNm(String ofcEngNm) {
		this.ofcEngNm = ofcEngNm;
	}
	
	/**
	 * Column Info
	 * @param expType
	 */
	public void setExpType(String expType) {
		this.expType = expType;
	}
	
	/**
	 * Column Info
	 * @param xchRtAplyLvl
	 */
	public void setXchRtAplyLvl(String xchRtAplyLvl) {
		this.xchRtAplyLvl = xchRtAplyLvl;
	}
	
	/**
	 * Column Info
	 * @param agnAgmtNo
	 */
	public void setAgnAgmtNo(String agnAgmtNo) {
		this.agnAgmtNo = agnAgmtNo;
	}
	
	/**
	 * Column Info
	 * @param agnCd
	 */
	public void setAgnCd(String agnCd) {
		this.agnCd = agnCd;
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
	 * @param agnAgmtRt
	 */
	public void setAgnAgmtRt(String agnAgmtRt) {
		this.agnAgmtRt = agnAgmtRt;
	}
	
	/**
	 * Column Info
	 * @param chgDdctAmt
	 */
	public void setChgDdctAmt(String chgDdctAmt) {
		this.chgDdctAmt = chgDdctAmt;
	}
	
	/**
	 * Column Info
	 * @param acIfDt
	 */
	public void setAcIfDt(String acIfDt) {
		this.acIfDt = acIfDt;
	}
	
	/**
	 * Column Info
	 * @param ofcChrLvl
	 */
	public void setOfcChrLvl(String ofcChrLvl) {
		this.ofcChrLvl = ofcChrLvl;
	}
	
	/**
	 * Column Info
	 * @param invTaxRt
	 */
	public void setInvTaxRt(String invTaxRt) {
		this.invTaxRt = invTaxRt;
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
	 * @param scnId
	 */
	public void setScnId(String scnId) {
		this.scnId = scnId;
	}
	
	/**
	 * Column Info
	 * @param aproNo
	 */
	public void setAproNo(String aproNo) {
		this.aproNo = aproNo;
	}
	
	/**
	 * Column Info
	 * @param actIfLoclCommAmt
	 */
	public void setActIfLoclCommAmt(String actIfLoclCommAmt) {
		this.actIfLoclCommAmt = actIfLoclCommAmt;
	}
	
	/**
	 * Column Info
	 * @param bkgNoSplit
	 */
	public void setBkgNoSplit(String bkgNoSplit) {
		this.bkgNoSplit = bkgNoSplit;
	}
	
	/**
	 * Column Info
	 * @param xchRt
	 */
	public void setXchRt(String xchRt) {
		this.xchRt = xchRt;
	}
	
	/**
	 * Column Info
	 * @param arrVal
	 */
	public void setArrVal(String arrVal) {
		this.arrVal = arrVal;
	}
	
	/**
	 * Column Info
	 * @param agnAproRmk
	 */
	public void setAgnAproRmk(String agnAproRmk) {
		this.agnAproRmk = agnAproRmk;
	}
	
	/**
	 * Column Info
	 * @param localDate
	 */
	public void setLocalDate(String localDate) {
		this.localDate = localDate;
	}
	
	/**
	 * Column Info
	 * @param commYrmon
	 */
	public void setCommYrmon(String commYrmon) {
		this.commYrmon = commYrmon;
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
	 * @param arOfcCd
	 */
	public void setArOfcCd(String arOfcCd) {
		this.arOfcCd = arOfcCd;
	}
	
	/**
	 * Column Info
	 * @param acRqstUsrEml
	 */
	public void setAcRqstUsrEml(String acRqstUsrEml) {
		this.acRqstUsrEml = acRqstUsrEml;
	}
	
	/**
	 * Column Info
	 * @param commRlaneCd
	 */
	public void setCommRlaneCd(String commRlaneCd) {
		this.commRlaneCd = commRlaneCd;
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
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
	}
	
	/**
	 * Column Info
	 * @param vvdXchRt
	 */
	public void setVvdXchRt(String vvdXchRt) {
		this.vvdXchRt = vvdXchRt;
	}
	
	/**
	 * Column Info
	 * @param acSeq
	 */
	public void setAcSeq(String acSeq) {
		this.acSeq = acSeq;
	}
	
	/**
	 * Column Info
	 * @param offstAgnFlg
	 */
	public void setOffstAgnFlg(String offstAgnFlg) {
		this.offstAgnFlg = offstAgnFlg;
	}
	
	/**
	 * Column Info
	 * @param sAproNo
	 */
	public void setSAproNo(String sAproNo) {
		this.sAproNo = sAproNo;
	}
	
	/**
	 * Column Info
	 * @param actPreCommAmt
	 */
	public void setActPreCommAmt(String actPreCommAmt) {
		this.actPreCommAmt = actPreCommAmt;
	}
	
	/**
	 * Column Info
	 * @param acAproUsrEml
	 */
	public void setAcAproUsrEml(String acAproUsrEml) {
		this.acAproUsrEml = acAproUsrEml;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setMonXchRt(JSPUtil.getParameter(request, "mon_xch_rt", ""));
		setVndrCntCd(JSPUtil.getParameter(request, "vndr_cnt_cd", ""));
		setGlDt(JSPUtil.getParameter(request, "gl_dt", ""));
		setCommRevDirCd(JSPUtil.getParameter(request, "comm_rev_dir_cd", ""));
		setCommSlanCd(JSPUtil.getParameter(request, "comm_slan_cd", ""));
		setCommProcStsCd(JSPUtil.getParameter(request, "comm_proc_sts_cd", ""));
		setCommSkdDirCd(JSPUtil.getParameter(request, "comm_skd_dir_cd", ""));
		setCommSkdVoyNo(JSPUtil.getParameter(request, "comm_skd_voy_no", ""));
		setHlgDdctAmt(JSPUtil.getParameter(request, "hlg_ddct_amt", ""));
		setSAgnCd(JSPUtil.getParameter(request, "s_agn_cd", ""));
		setSailArrDt(JSPUtil.getParameter(request, "sail_arr_dt", ""));
		setGrsNetDivCd(JSPUtil.getParameter(request, "grs_net_div_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setStsCd(JSPUtil.getParameter(request, "sts_cd", ""));
		setAcIfUsrId(JSPUtil.getParameter(request, "ac_if_usr_id", ""));
		setActIfCommAmt(JSPUtil.getParameter(request, "act_if_comm_amt", ""));
		setCommAproNo(JSPUtil.getParameter(request, "comm_apro_no", ""));
		setActCommAmt(JSPUtil.getParameter(request, "act_comm_amt", ""));
		setBkgCreDt(JSPUtil.getParameter(request, "bkg_cre_dt", ""));
		setActLoclCommAmt(JSPUtil.getParameter(request, "act_locl_comm_amt", ""));
		setAcTpCd(JSPUtil.getParameter(request, "ac_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCommStndCostCd(JSPUtil.getParameter(request, "comm_stnd_cost_cd", ""));
		setEstmUsdAmt(JSPUtil.getParameter(request, "estm_usd_amt", ""));
		setCsrNo(JSPUtil.getParameter(request, "csr_no", ""));
		setApOfcCd(JSPUtil.getParameter(request, "ap_ofc_cd", ""));
		setAcclFlg(JSPUtil.getParameter(request, "accl_flg", ""));
		setAcRqstUsrId(JSPUtil.getParameter(request, "ac_rqst_usr_id", ""));
		setAcAproUsrId(JSPUtil.getParameter(request, "ac_apro_usr_id", ""));
		setCommProcStsRsn(JSPUtil.getParameter(request, "comm_proc_sts_rsn", ""));
		setToDate(JSPUtil.getParameter(request, "to_date", ""));
		setCommVslCd(JSPUtil.getParameter(request, "comm_vsl_cd", ""));
		setOtrCommAcctCtnt(JSPUtil.getParameter(request, "otr_comm_acct_ctnt", ""));
		setVvd(JSPUtil.getParameter(request, "vvd", ""));
		setFdrgDdctAmt(JSPUtil.getParameter(request, "fdrg_ddct_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setDlyXchRt(JSPUtil.getParameter(request, "dly_xch_rt", ""));
		setCommOccrInfoCd(JSPUtil.getParameter(request, "comm_occr_info_cd", ""));
		setFromDate(JSPUtil.getParameter(request, "from_date", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setActPreLoclCommAmt(JSPUtil.getParameter(request, "act_pre_locl_comm_amt", ""));
		setAcTpCdNum(JSPUtil.getParameter(request, "ac_tp_cd_num", ""));
		setSvcSpcCd(JSPUtil.getParameter(request, "svc_spc_cd", ""));
		setVvdChkYn(JSPUtil.getParameter(request, "vvd_chk_yn", ""));
		setAplyDt(JSPUtil.getParameter(request, "aply_dt", ""));
		setAsaNo(JSPUtil.getParameter(request, "asa_no", ""));
		setApCtrCd(JSPUtil.getParameter(request, "ap_ctr_cd", ""));
		setAcAproDt(JSPUtil.getParameter(request, "ac_apro_dt", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setAcRqstDt(JSPUtil.getParameter(request, "ac_rqst_dt", ""));
		setVndrLglEngNm(JSPUtil.getParameter(request, "vndr_lgl_eng_nm", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setOfcEngNm(JSPUtil.getParameter(request, "ofc_eng_nm", ""));
		setExpType(JSPUtil.getParameter(request, "exp_type", ""));
		setXchRtAplyLvl(JSPUtil.getParameter(request, "xch_rt_aply_lvl", ""));
		setAgnAgmtNo(JSPUtil.getParameter(request, "agn_agmt_no", ""));
		setAgnCd(JSPUtil.getParameter(request, "agn_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAgnAgmtRt(JSPUtil.getParameter(request, "agn_agmt_rt", ""));
		setChgDdctAmt(JSPUtil.getParameter(request, "chg_ddct_amt", ""));
		setAcIfDt(JSPUtil.getParameter(request, "ac_if_dt", ""));
		setOfcChrLvl(JSPUtil.getParameter(request, "ofc_chr_lvl", ""));
		setInvTaxRt(JSPUtil.getParameter(request, "inv_tax_rt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setScnId(JSPUtil.getParameter(request, "scn_id", ""));
		setAproNo(JSPUtil.getParameter(request, "apro_no", ""));
		setActIfLoclCommAmt(JSPUtil.getParameter(request, "act_if_locl_comm_amt", ""));
		setBkgNoSplit(JSPUtil.getParameter(request, "bkg_no_split", ""));
		setXchRt(JSPUtil.getParameter(request, "xch_rt", ""));
		setArrVal(JSPUtil.getParameter(request, "arr_val", ""));
		setAgnAproRmk(JSPUtil.getParameter(request, "agn_apro_rmk", ""));
		setLocalDate(JSPUtil.getParameter(request, "local_date", ""));
		setCommYrmon(JSPUtil.getParameter(request, "comm_yrmon", ""));
		setIoBndCd(JSPUtil.getParameter(request, "io_bnd_cd", ""));
		setArOfcCd(JSPUtil.getParameter(request, "ar_ofc_cd", ""));
		setAcRqstUsrEml(JSPUtil.getParameter(request, "ac_rqst_usr_eml", ""));
		setCommRlaneCd(JSPUtil.getParameter(request, "comm_rlane_cd", ""));
		setInvNo(JSPUtil.getParameter(request, "inv_no", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setVvdXchRt(JSPUtil.getParameter(request, "vvd_xch_rt", ""));
		setAcSeq(JSPUtil.getParameter(request, "ac_seq", ""));
		setOffstAgnFlg(JSPUtil.getParameter(request, "offst_agn_flg", ""));
		setSAproNo(JSPUtil.getParameter(request, "s_apro_no", ""));
		setActPreCommAmt(JSPUtil.getParameter(request, "act_pre_comm_amt", ""));
		setAcAproUsrEml(JSPUtil.getParameter(request, "ac_apro_usr_eml", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return AgtAgnCommVO[]
	 */
	public AgtAgnCommVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return AgtAgnCommVO[]
	 */
	public AgtAgnCommVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		AgtAgnCommVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] monXchRt = (JSPUtil.getParameter(request, prefix	+ "mon_xch_rt", length));
			String[] vndrCntCd = (JSPUtil.getParameter(request, prefix	+ "vndr_cnt_cd", length));
			String[] glDt = (JSPUtil.getParameter(request, prefix	+ "gl_dt", length));
			String[] commRevDirCd = (JSPUtil.getParameter(request, prefix	+ "comm_rev_dir_cd", length));
			String[] commSlanCd = (JSPUtil.getParameter(request, prefix	+ "comm_slan_cd", length));
			String[] commProcStsCd = (JSPUtil.getParameter(request, prefix	+ "comm_proc_sts_cd", length));
			String[] commSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "comm_skd_dir_cd", length));
			String[] commSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "comm_skd_voy_no", length));
			String[] hlgDdctAmt = (JSPUtil.getParameter(request, prefix	+ "hlg_ddct_amt", length));
			String[] sAgnCd = (JSPUtil.getParameter(request, prefix	+ "s_agn_cd", length));
			String[] sailArrDt = (JSPUtil.getParameter(request, prefix	+ "sail_arr_dt", length));
			String[] grsNetDivCd = (JSPUtil.getParameter(request, prefix	+ "grs_net_div_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] stsCd = (JSPUtil.getParameter(request, prefix	+ "sts_cd", length));
			String[] acIfUsrId = (JSPUtil.getParameter(request, prefix	+ "ac_if_usr_id", length));
			String[] actIfCommAmt = (JSPUtil.getParameter(request, prefix	+ "act_if_comm_amt", length));
			String[] commAproNo = (JSPUtil.getParameter(request, prefix	+ "comm_apro_no", length));
			String[] actCommAmt = (JSPUtil.getParameter(request, prefix	+ "act_comm_amt", length));
			String[] bkgCreDt = (JSPUtil.getParameter(request, prefix	+ "bkg_cre_dt", length));
			String[] actLoclCommAmt = (JSPUtil.getParameter(request, prefix	+ "act_locl_comm_amt", length));
			String[] acTpCd = (JSPUtil.getParameter(request, prefix	+ "ac_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] commStndCostCd = (JSPUtil.getParameter(request, prefix	+ "comm_stnd_cost_cd", length));
			String[] estmUsdAmt = (JSPUtil.getParameter(request, prefix	+ "estm_usd_amt", length));
			String[] csrNo = (JSPUtil.getParameter(request, prefix	+ "csr_no", length));
			String[] apOfcCd = (JSPUtil.getParameter(request, prefix	+ "ap_ofc_cd", length));
			String[] acclFlg = (JSPUtil.getParameter(request, prefix	+ "accl_flg", length));
			String[] acRqstUsrId = (JSPUtil.getParameter(request, prefix	+ "ac_rqst_usr_id", length));
			String[] acAproUsrId = (JSPUtil.getParameter(request, prefix	+ "ac_apro_usr_id", length));
			String[] commProcStsRsn = (JSPUtil.getParameter(request, prefix	+ "comm_proc_sts_rsn", length));
			String[] toDate = (JSPUtil.getParameter(request, prefix	+ "to_date", length));
			String[] commVslCd = (JSPUtil.getParameter(request, prefix	+ "comm_vsl_cd", length));
			String[] otrCommAcctCtnt = (JSPUtil.getParameter(request, prefix	+ "otr_comm_acct_ctnt", length));
			String[] vvd = (JSPUtil.getParameter(request, prefix	+ "vvd", length));
			String[] fdrgDdctAmt = (JSPUtil.getParameter(request, prefix	+ "fdrg_ddct_amt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] dlyXchRt = (JSPUtil.getParameter(request, prefix	+ "dly_xch_rt", length));
			String[] commOccrInfoCd = (JSPUtil.getParameter(request, prefix	+ "comm_occr_info_cd", length));
			String[] fromDate = (JSPUtil.getParameter(request, prefix	+ "from_date", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] actPreLoclCommAmt = (JSPUtil.getParameter(request, prefix	+ "act_pre_locl_comm_amt", length));
			String[] acTpCdNum = (JSPUtil.getParameter(request, prefix	+ "ac_tp_cd_num", length));
			String[] svcSpcCd = (JSPUtil.getParameter(request, prefix	+ "svc_spc_cd", length));
			String[] vvdChkYn = (JSPUtil.getParameter(request, prefix	+ "vvd_chk_yn", length));
			String[] aplyDt = (JSPUtil.getParameter(request, prefix	+ "aply_dt", length));
			String[] asaNo = (JSPUtil.getParameter(request, prefix	+ "asa_no", length));
			String[] apCtrCd = (JSPUtil.getParameter(request, prefix	+ "ap_ctr_cd", length));
			String[] acAproDt = (JSPUtil.getParameter(request, prefix	+ "ac_apro_dt", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] acRqstDt = (JSPUtil.getParameter(request, prefix	+ "ac_rqst_dt", length));
			String[] vndrLglEngNm = (JSPUtil.getParameter(request, prefix	+ "vndr_lgl_eng_nm", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] ofcEngNm = (JSPUtil.getParameter(request, prefix	+ "ofc_eng_nm", length));
			String[] expType = (JSPUtil.getParameter(request, prefix	+ "exp_type", length));
			String[] xchRtAplyLvl = (JSPUtil.getParameter(request, prefix	+ "xch_rt_aply_lvl", length));
			String[] agnAgmtNo = (JSPUtil.getParameter(request, prefix	+ "agn_agmt_no", length));
			String[] agnCd = (JSPUtil.getParameter(request, prefix	+ "agn_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] agnAgmtRt = (JSPUtil.getParameter(request, prefix	+ "agn_agmt_rt", length));
			String[] chgDdctAmt = (JSPUtil.getParameter(request, prefix	+ "chg_ddct_amt", length));
			String[] acIfDt = (JSPUtil.getParameter(request, prefix	+ "ac_if_dt", length));
			String[] ofcChrLvl = (JSPUtil.getParameter(request, prefix	+ "ofc_chr_lvl", length));
			String[] invTaxRt = (JSPUtil.getParameter(request, prefix	+ "inv_tax_rt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] scnId = (JSPUtil.getParameter(request, prefix	+ "scn_id", length));
			String[] aproNo = (JSPUtil.getParameter(request, prefix	+ "apro_no", length));
			String[] actIfLoclCommAmt = (JSPUtil.getParameter(request, prefix	+ "act_if_locl_comm_amt", length));
			String[] bkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "bkg_no_split", length));
			String[] xchRt = (JSPUtil.getParameter(request, prefix	+ "xch_rt", length));
			String[] arrVal = (JSPUtil.getParameter(request, prefix	+ "arr_val", length));
			String[] agnAproRmk = (JSPUtil.getParameter(request, prefix	+ "agn_apro_rmk", length));
			String[] localDate = (JSPUtil.getParameter(request, prefix	+ "local_date", length));
			String[] commYrmon = (JSPUtil.getParameter(request, prefix	+ "comm_yrmon", length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd", length));
			String[] arOfcCd = (JSPUtil.getParameter(request, prefix	+ "ar_ofc_cd", length));
			String[] acRqstUsrEml = (JSPUtil.getParameter(request, prefix	+ "ac_rqst_usr_eml", length));
			String[] commRlaneCd = (JSPUtil.getParameter(request, prefix	+ "comm_rlane_cd", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] vvdXchRt = (JSPUtil.getParameter(request, prefix	+ "vvd_xch_rt", length));
			String[] acSeq = (JSPUtil.getParameter(request, prefix	+ "ac_seq", length));
			String[] offstAgnFlg = (JSPUtil.getParameter(request, prefix	+ "offst_agn_flg", length));
			String[] sAproNo = (JSPUtil.getParameter(request, prefix	+ "s_apro_no", length));
			String[] actPreCommAmt = (JSPUtil.getParameter(request, prefix	+ "act_pre_comm_amt", length));
			String[] acAproUsrEml = (JSPUtil.getParameter(request, prefix	+ "ac_apro_usr_eml", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new AgtAgnCommVO();
				if (monXchRt[i] != null)
					model.setMonXchRt(monXchRt[i]);
				if (vndrCntCd[i] != null)
					model.setVndrCntCd(vndrCntCd[i]);
				if (glDt[i] != null)
					model.setGlDt(glDt[i]);
				if (commRevDirCd[i] != null)
					model.setCommRevDirCd(commRevDirCd[i]);
				if (commSlanCd[i] != null)
					model.setCommSlanCd(commSlanCd[i]);
				if (commProcStsCd[i] != null)
					model.setCommProcStsCd(commProcStsCd[i]);
				if (commSkdDirCd[i] != null)
					model.setCommSkdDirCd(commSkdDirCd[i]);
				if (commSkdVoyNo[i] != null)
					model.setCommSkdVoyNo(commSkdVoyNo[i]);
				if (hlgDdctAmt[i] != null)
					model.setHlgDdctAmt(hlgDdctAmt[i]);
				if (sAgnCd[i] != null)
					model.setSAgnCd(sAgnCd[i]);
				if (sailArrDt[i] != null)
					model.setSailArrDt(sailArrDt[i]);
				if (grsNetDivCd[i] != null)
					model.setGrsNetDivCd(grsNetDivCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (stsCd[i] != null)
					model.setStsCd(stsCd[i]);
				if (acIfUsrId[i] != null)
					model.setAcIfUsrId(acIfUsrId[i]);
				if (actIfCommAmt[i] != null)
					model.setActIfCommAmt(actIfCommAmt[i]);
				if (commAproNo[i] != null)
					model.setCommAproNo(commAproNo[i]);
				if (actCommAmt[i] != null)
					model.setActCommAmt(actCommAmt[i]);
				if (bkgCreDt[i] != null)
					model.setBkgCreDt(bkgCreDt[i]);
				if (actLoclCommAmt[i] != null)
					model.setActLoclCommAmt(actLoclCommAmt[i]);
				if (acTpCd[i] != null)
					model.setAcTpCd(acTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (commStndCostCd[i] != null)
					model.setCommStndCostCd(commStndCostCd[i]);
				if (estmUsdAmt[i] != null)
					model.setEstmUsdAmt(estmUsdAmt[i]);
				if (csrNo[i] != null)
					model.setCsrNo(csrNo[i]);
				if (apOfcCd[i] != null)
					model.setApOfcCd(apOfcCd[i]);
				if (acclFlg[i] != null)
					model.setAcclFlg(acclFlg[i]);
				if (acRqstUsrId[i] != null)
					model.setAcRqstUsrId(acRqstUsrId[i]);
				if (acAproUsrId[i] != null)
					model.setAcAproUsrId(acAproUsrId[i]);
				if (commProcStsRsn[i] != null)
					model.setCommProcStsRsn(commProcStsRsn[i]);
				if (toDate[i] != null)
					model.setToDate(toDate[i]);
				if (commVslCd[i] != null)
					model.setCommVslCd(commVslCd[i]);
				if (otrCommAcctCtnt[i] != null)
					model.setOtrCommAcctCtnt(otrCommAcctCtnt[i]);
				if (vvd[i] != null)
					model.setVvd(vvd[i]);
				if (fdrgDdctAmt[i] != null)
					model.setFdrgDdctAmt(fdrgDdctAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (dlyXchRt[i] != null)
					model.setDlyXchRt(dlyXchRt[i]);
				if (commOccrInfoCd[i] != null)
					model.setCommOccrInfoCd(commOccrInfoCd[i]);
				if (fromDate[i] != null)
					model.setFromDate(fromDate[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (actPreLoclCommAmt[i] != null)
					model.setActPreLoclCommAmt(actPreLoclCommAmt[i]);
				if (acTpCdNum[i] != null)
					model.setAcTpCdNum(acTpCdNum[i]);
				if (svcSpcCd[i] != null)
					model.setSvcSpcCd(svcSpcCd[i]);
				if (vvdChkYn[i] != null)
					model.setVvdChkYn(vvdChkYn[i]);
				if (aplyDt[i] != null)
					model.setAplyDt(aplyDt[i]);
				if (asaNo[i] != null)
					model.setAsaNo(asaNo[i]);
				if (apCtrCd[i] != null)
					model.setApCtrCd(apCtrCd[i]);
				if (acAproDt[i] != null)
					model.setAcAproDt(acAproDt[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (acRqstDt[i] != null)
					model.setAcRqstDt(acRqstDt[i]);
				if (vndrLglEngNm[i] != null)
					model.setVndrLglEngNm(vndrLglEngNm[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ofcEngNm[i] != null)
					model.setOfcEngNm(ofcEngNm[i]);
				if (expType[i] != null)
					model.setExpType(expType[i]);
				if (xchRtAplyLvl[i] != null)
					model.setXchRtAplyLvl(xchRtAplyLvl[i]);
				if (agnAgmtNo[i] != null)
					model.setAgnAgmtNo(agnAgmtNo[i]);
				if (agnCd[i] != null)
					model.setAgnCd(agnCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (agnAgmtRt[i] != null)
					model.setAgnAgmtRt(agnAgmtRt[i]);
				if (chgDdctAmt[i] != null)
					model.setChgDdctAmt(chgDdctAmt[i]);
				if (acIfDt[i] != null)
					model.setAcIfDt(acIfDt[i]);
				if (ofcChrLvl[i] != null)
					model.setOfcChrLvl(ofcChrLvl[i]);
				if (invTaxRt[i] != null)
					model.setInvTaxRt(invTaxRt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (scnId[i] != null)
					model.setScnId(scnId[i]);
				if (aproNo[i] != null)
					model.setAproNo(aproNo[i]);
				if (actIfLoclCommAmt[i] != null)
					model.setActIfLoclCommAmt(actIfLoclCommAmt[i]);
				if (bkgNoSplit[i] != null)
					model.setBkgNoSplit(bkgNoSplit[i]);
				if (xchRt[i] != null)
					model.setXchRt(xchRt[i]);
				if (arrVal[i] != null)
					model.setArrVal(arrVal[i]);
				if (agnAproRmk[i] != null)
					model.setAgnAproRmk(agnAproRmk[i]);
				if (localDate[i] != null)
					model.setLocalDate(localDate[i]);
				if (commYrmon[i] != null)
					model.setCommYrmon(commYrmon[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (arOfcCd[i] != null)
					model.setArOfcCd(arOfcCd[i]);
				if (acRqstUsrEml[i] != null)
					model.setAcRqstUsrEml(acRqstUsrEml[i]);
				if (commRlaneCd[i] != null)
					model.setCommRlaneCd(commRlaneCd[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (vvdXchRt[i] != null)
					model.setVvdXchRt(vvdXchRt[i]);
				if (acSeq[i] != null)
					model.setAcSeq(acSeq[i]);
				if (offstAgnFlg[i] != null)
					model.setOffstAgnFlg(offstAgnFlg[i]);
				if (sAproNo[i] != null)
					model.setSAproNo(sAproNo[i]);
				if (actPreCommAmt[i] != null)
					model.setActPreCommAmt(actPreCommAmt[i]);
				if (acAproUsrEml[i] != null)
					model.setAcAproUsrEml(acAproUsrEml[i]);
				if(blNo[i] != null)
					model.setBlNo(blNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getAgtAgnCommVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return AgtAgnCommVO[]
	 */
	public AgtAgnCommVO[] getAgtAgnCommVOs(){
		AgtAgnCommVO[] vos = (AgtAgnCommVO[])models.toArray(new AgtAgnCommVO[models.size()]);
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
		this.monXchRt = this.monXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrCntCd = this.vndrCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glDt = this.glDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commRevDirCd = this.commRevDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commSlanCd = this.commSlanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commProcStsCd = this.commProcStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commSkdDirCd = this.commSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commSkdVoyNo = this.commSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hlgDdctAmt = this.hlgDdctAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sAgnCd = this.sAgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sailArrDt = this.sailArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsNetDivCd = this.grsNetDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stsCd = this.stsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acIfUsrId = this.acIfUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actIfCommAmt = this.actIfCommAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commAproNo = this.commAproNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCommAmt = this.actCommAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCreDt = this.bkgCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actLoclCommAmt = this.actLoclCommAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acTpCd = this.acTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commStndCostCd = this.commStndCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmUsdAmt = this.estmUsdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrNo = this.csrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apOfcCd = this.apOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acclFlg = this.acclFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acRqstUsrId = this.acRqstUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acAproUsrId = this.acAproUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commProcStsRsn = this.commProcStsRsn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toDate = this.toDate .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commVslCd = this.commVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otrCommAcctCtnt = this.otrCommAcctCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvd = this.vvd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fdrgDdctAmt = this.fdrgDdctAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dlyXchRt = this.dlyXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commOccrInfoCd = this.commOccrInfoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fromDate = this.fromDate .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actPreLoclCommAmt = this.actPreLoclCommAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acTpCdNum = this.acTpCdNum .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcSpcCd = this.svcSpcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdChkYn = this.vvdChkYn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aplyDt = this.aplyDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaNo = this.asaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apCtrCd = this.apCtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acAproDt = this.acAproDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acRqstDt = this.acRqstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrLglEngNm = this.vndrLglEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcEngNm = this.ofcEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expType = this.expType .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xchRtAplyLvl = this.xchRtAplyLvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnAgmtNo = this.agnAgmtNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnCd = this.agnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnAgmtRt = this.agnAgmtRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgDdctAmt = this.chgDdctAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acIfDt = this.acIfDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcChrLvl = this.ofcChrLvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invTaxRt = this.invTaxRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scnId = this.scnId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproNo = this.aproNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actIfLoclCommAmt = this.actIfLoclCommAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNoSplit = this.bkgNoSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xchRt = this.xchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrVal = this.arrVal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnAproRmk = this.agnAproRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.localDate = this.localDate .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commYrmon = this.commYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arOfcCd = this.arOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acRqstUsrEml = this.acRqstUsrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commRlaneCd = this.commRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdXchRt = this.vvdXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acSeq = this.acSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.offstAgnFlg = this.offstAgnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sAproNo = this.sAproNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actPreCommAmt = this.actPreCommAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acAproUsrEml = this.acAproUsrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
