/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : BkgPkupNtcVO.java
*@FileTitle : BkgPkupNtcVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.04.30
*@LastModifier : 박미옥
*@LastVersion : 1.0
* 2010.04.30 박미옥 
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
 * @author 박미옥
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgPkupNtcVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgPkupNtcVO> models = new ArrayList<BkgPkupNtcVO>();
	
	/* Column Info */
	private String autoSndStopFlg = null;
	/* Column Info */
	private String custNm = null;
	/* Column Info */
	private String expSndKrDt = null;
	/* Column Info */
	private String oblCltFlg = null;
	/* Column Info */
	private String trspSoSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String pkupNtcEvntDt = null;
	/* Column Info */
	private String pkupNtcTpCd = null;
	/* Column Info */
	private String trspSoOfcCtyCd = null;
	/* Column Info */
	private String autoSndResmFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String pkupYdCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String railLodDt = null;
	/* Column Info */
	private String frtCltFlg = null;
	/* Column Info */
	private String pkupAvalDt = null;
	/* Column Info */
	private String edi322MvmtCd = null;
	/* Column Info */
	private String autoSndStopDt = null;
	/* Column Info */
	private String lstFreeDt = null;
	/* Column Info */
	private String bkgCustTpCd = null;
	/* Column Info */
	private String ntfcDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String pkupNtcFomCd = null;
	/* Column Info */
	private String railRmpFreeDys = null;
	/* Column Info */
	private String dorTrkrWoFlg = null;
	/* Column Info */
	private String mnlCngFlg = null;
	/* Column Info */
	private String autoSndStopUsrId = null;
	/* Column Info */
	private String rtnYdCd = null;
	/* Column Info */
	private String ibdTrspHubCd = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String ntcSeq = null;
	/* Column Info */
	private String expSndGdt = null;
	/* Column Info */
	private String autoSndResmUsrId = null;
	/* Column Info */
	private String expSndDt = null;
	/* Column Info */
	private String autoSndResmDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String eclzOblCpyFlg = null;
	/* Column Info */
	private String pkupNtcSndStsCd = null;
	/* Column Info */
	private String cstmsClrFlg = null;
	/* Column Info */
	private String mnlFlg = null;
	/* Column Info */
	private String pkupNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgPkupNtcVO() {}

	public BkgPkupNtcVO(String ibflag, String pagerows, String bkgNo, String ntcSeq, String pkupNtcTpCd, String pkupNtcFomCd, String eclzOblCpyFlg, String bkgCustTpCd, String custCntCd, String custSeq, String custNm, String pkupNtcEvntDt, String expSndDt, String expSndGdt, String expSndKrDt, String cntrNo, String railLodDt, String ntfcDt, String frtCltFlg, String oblCltFlg, String cstmsClrFlg, String pkupNo, String railRmpFreeDys, String pkupAvalDt, String lstFreeDt, String mnlCngFlg, String edi322MvmtCd, String pkupYdCd, String rtnYdCd, String dorTrkrWoFlg, String pkupNtcSndStsCd, String ibdTrspHubCd, String diffRmk, String autoSndStopFlg, String autoSndStopDt, String autoSndStopUsrId, String autoSndResmFlg, String autoSndResmDt, String autoSndResmUsrId, String trspSoOfcCtyCd, String trspSoSeq, String creUsrId, String creDt, String updUsrId, String updDt, String mnlFlg) {
		this.autoSndStopFlg = autoSndStopFlg;
		this.custNm = custNm;
		this.expSndKrDt = expSndKrDt;
		this.oblCltFlg = oblCltFlg;
		this.trspSoSeq = trspSoSeq;
		this.creDt = creDt;
		this.pkupNtcEvntDt = pkupNtcEvntDt;
		this.pkupNtcTpCd = pkupNtcTpCd;
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
		this.autoSndResmFlg = autoSndResmFlg;
		this.pagerows = pagerows;
		this.pkupYdCd = pkupYdCd;
		this.ibflag = ibflag;
		this.railLodDt = railLodDt;
		this.frtCltFlg = frtCltFlg;
		this.pkupAvalDt = pkupAvalDt;
		this.edi322MvmtCd = edi322MvmtCd;
		this.autoSndStopDt = autoSndStopDt;
		this.lstFreeDt = lstFreeDt;
		this.bkgCustTpCd = bkgCustTpCd;
		this.ntfcDt = ntfcDt;
		this.updUsrId = updUsrId;
		this.custCntCd = custCntCd;
		this.updDt = updDt;
		this.pkupNtcFomCd = pkupNtcFomCd;
		this.railRmpFreeDys = railRmpFreeDys;
		this.dorTrkrWoFlg = dorTrkrWoFlg;
		this.mnlCngFlg = mnlCngFlg;
		this.autoSndStopUsrId = autoSndStopUsrId;
		this.rtnYdCd = rtnYdCd;
		this.ibdTrspHubCd = ibdTrspHubCd;
		this.custSeq = custSeq;
		this.ntcSeq = ntcSeq;
		this.expSndGdt = expSndGdt;
		this.autoSndResmUsrId = autoSndResmUsrId;
		this.expSndDt = expSndDt;
		this.autoSndResmDt = autoSndResmDt;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.diffRmk = diffRmk;
		this.cntrNo = cntrNo;
		this.eclzOblCpyFlg = eclzOblCpyFlg;
		this.pkupNtcSndStsCd = pkupNtcSndStsCd;
		this.cstmsClrFlg = cstmsClrFlg;
		this.mnlFlg = mnlFlg;
		this.pkupNo = pkupNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("auto_snd_stop_flg", getAutoSndStopFlg());
		this.hashColumns.put("cust_nm", getCustNm());
		this.hashColumns.put("exp_snd_kr_dt", getExpSndKrDt());
		this.hashColumns.put("obl_clt_flg", getOblCltFlg());
		this.hashColumns.put("trsp_so_seq", getTrspSoSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pkup_ntc_evnt_dt", getPkupNtcEvntDt());
		this.hashColumns.put("pkup_ntc_tp_cd", getPkupNtcTpCd());
		this.hashColumns.put("trsp_so_ofc_cty_cd", getTrspSoOfcCtyCd());
		this.hashColumns.put("auto_snd_resm_flg", getAutoSndResmFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pkup_yd_cd", getPkupYdCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rail_lod_dt", getRailLodDt());
		this.hashColumns.put("frt_clt_flg", getFrtCltFlg());
		this.hashColumns.put("pkup_aval_dt", getPkupAvalDt());
		this.hashColumns.put("edi_322_mvmt_cd", getEdi322MvmtCd());
		this.hashColumns.put("auto_snd_stop_dt", getAutoSndStopDt());
		this.hashColumns.put("lst_free_dt", getLstFreeDt());
		this.hashColumns.put("bkg_cust_tp_cd", getBkgCustTpCd());
		this.hashColumns.put("ntfc_dt", getNtfcDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("pkup_ntc_fom_cd", getPkupNtcFomCd());
		this.hashColumns.put("rail_rmp_free_dys", getRailRmpFreeDys());
		this.hashColumns.put("dor_trkr_wo_flg", getDorTrkrWoFlg());
		this.hashColumns.put("mnl_cng_flg", getMnlCngFlg());
		this.hashColumns.put("auto_snd_stop_usr_id", getAutoSndStopUsrId());
		this.hashColumns.put("rtn_yd_cd", getRtnYdCd());
		this.hashColumns.put("ibd_trsp_hub_cd", getIbdTrspHubCd());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("ntc_seq", getNtcSeq());
		this.hashColumns.put("exp_snd_gdt", getExpSndGdt());
		this.hashColumns.put("auto_snd_resm_usr_id", getAutoSndResmUsrId());
		this.hashColumns.put("exp_snd_dt", getExpSndDt());
		this.hashColumns.put("auto_snd_resm_dt", getAutoSndResmDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("eclz_obl_cpy_flg", getEclzOblCpyFlg());
		this.hashColumns.put("pkup_ntc_snd_sts_cd", getPkupNtcSndStsCd());
		this.hashColumns.put("cstms_clr_flg", getCstmsClrFlg());
		this.hashColumns.put("mnl_flg", getMnlFlg());
		this.hashColumns.put("pkup_no", getPkupNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("auto_snd_stop_flg", "autoSndStopFlg");
		this.hashFields.put("cust_nm", "custNm");
		this.hashFields.put("exp_snd_kr_dt", "expSndKrDt");
		this.hashFields.put("obl_clt_flg", "oblCltFlg");
		this.hashFields.put("trsp_so_seq", "trspSoSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pkup_ntc_evnt_dt", "pkupNtcEvntDt");
		this.hashFields.put("pkup_ntc_tp_cd", "pkupNtcTpCd");
		this.hashFields.put("trsp_so_ofc_cty_cd", "trspSoOfcCtyCd");
		this.hashFields.put("auto_snd_resm_flg", "autoSndResmFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pkup_yd_cd", "pkupYdCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rail_lod_dt", "railLodDt");
		this.hashFields.put("frt_clt_flg", "frtCltFlg");
		this.hashFields.put("pkup_aval_dt", "pkupAvalDt");
		this.hashFields.put("edi_322_mvmt_cd", "edi322MvmtCd");
		this.hashFields.put("auto_snd_stop_dt", "autoSndStopDt");
		this.hashFields.put("lst_free_dt", "lstFreeDt");
		this.hashFields.put("bkg_cust_tp_cd", "bkgCustTpCd");
		this.hashFields.put("ntfc_dt", "ntfcDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("pkup_ntc_fom_cd", "pkupNtcFomCd");
		this.hashFields.put("rail_rmp_free_dys", "railRmpFreeDys");
		this.hashFields.put("dor_trkr_wo_flg", "dorTrkrWoFlg");
		this.hashFields.put("mnl_cng_flg", "mnlCngFlg");
		this.hashFields.put("auto_snd_stop_usr_id", "autoSndStopUsrId");
		this.hashFields.put("rtn_yd_cd", "rtnYdCd");
		this.hashFields.put("ibd_trsp_hub_cd", "ibdTrspHubCd");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("ntc_seq", "ntcSeq");
		this.hashFields.put("exp_snd_gdt", "expSndGdt");
		this.hashFields.put("auto_snd_resm_usr_id", "autoSndResmUsrId");
		this.hashFields.put("exp_snd_dt", "expSndDt");
		this.hashFields.put("auto_snd_resm_dt", "autoSndResmDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("eclz_obl_cpy_flg", "eclzOblCpyFlg");
		this.hashFields.put("pkup_ntc_snd_sts_cd", "pkupNtcSndStsCd");
		this.hashFields.put("cstms_clr_flg", "cstmsClrFlg");
		this.hashFields.put("mnl_flg", "mnlFlg");
		this.hashFields.put("pkup_no", "pkupNo");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return autoSndStopFlg
	 */
	public String getAutoSndStopFlg() {
		return this.autoSndStopFlg;
	}
	
	/**
	 * Column Info
	 * @return custNm
	 */
	public String getCustNm() {
		return this.custNm;
	}
	
	/**
	 * Column Info
	 * @return expSndKrDt
	 */
	public String getExpSndKrDt() {
		return this.expSndKrDt;
	}
	
	/**
	 * Column Info
	 * @return oblCltFlg
	 */
	public String getOblCltFlg() {
		return this.oblCltFlg;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return pkupNtcEvntDt
	 */
	public String getPkupNtcEvntDt() {
		return this.pkupNtcEvntDt;
	}
	
	/**
	 * Column Info
	 * @return pkupNtcTpCd
	 */
	public String getPkupNtcTpCd() {
		return this.pkupNtcTpCd;
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
	 * @return autoSndResmFlg
	 */
	public String getAutoSndResmFlg() {
		return this.autoSndResmFlg;
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
	 * @return pkupYdCd
	 */
	public String getPkupYdCd() {
		return this.pkupYdCd;
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
	 * @return railLodDt
	 */
	public String getRailLodDt() {
		return this.railLodDt;
	}
	
	/**
	 * Column Info
	 * @return frtCltFlg
	 */
	public String getFrtCltFlg() {
		return this.frtCltFlg;
	}
	
	/**
	 * Column Info
	 * @return pkupAvalDt
	 */
	public String getPkupAvalDt() {
		return this.pkupAvalDt;
	}
	
	/**
	 * Column Info
	 * @return edi322MvmtCd
	 */
	public String getEdi322MvmtCd() {
		return this.edi322MvmtCd;
	}
	
	/**
	 * Column Info
	 * @return autoSndStopDt
	 */
	public String getAutoSndStopDt() {
		return this.autoSndStopDt;
	}
	
	/**
	 * Column Info
	 * @return lstFreeDt
	 */
	public String getLstFreeDt() {
		return this.lstFreeDt;
	}
	
	/**
	 * Column Info
	 * @return bkgCustTpCd
	 */
	public String getBkgCustTpCd() {
		return this.bkgCustTpCd;
	}
	
	/**
	 * Column Info
	 * @return ntfcDt
	 */
	public String getNtfcDt() {
		return this.ntfcDt;
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
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return pkupNtcFomCd
	 */
	public String getPkupNtcFomCd() {
		return this.pkupNtcFomCd;
	}
	
	/**
	 * Column Info
	 * @return railRmpFreeDys
	 */
	public String getRailRmpFreeDys() {
		return this.railRmpFreeDys;
	}
	
	/**
	 * Column Info
	 * @return dorTrkrWoFlg
	 */
	public String getDorTrkrWoFlg() {
		return this.dorTrkrWoFlg;
	}
	
	/**
	 * Column Info
	 * @return mnlCngFlg
	 */
	public String getMnlCngFlg() {
		return this.mnlCngFlg;
	}
	
	/**
	 * Column Info
	 * @return autoSndStopUsrId
	 */
	public String getAutoSndStopUsrId() {
		return this.autoSndStopUsrId;
	}
	
	/**
	 * Column Info
	 * @return rtnYdCd
	 */
	public String getRtnYdCd() {
		return this.rtnYdCd;
	}
	
	/**
	 * Column Info
	 * @return ibdTrspHubCd
	 */
	public String getIbdTrspHubCd() {
		return this.ibdTrspHubCd;
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
	 * @return ntcSeq
	 */
	public String getNtcSeq() {
		return this.ntcSeq;
	}
	
	/**
	 * Column Info
	 * @return expSndGdt
	 */
	public String getExpSndGdt() {
		return this.expSndGdt;
	}
	
	/**
	 * Column Info
	 * @return autoSndResmUsrId
	 */
	public String getAutoSndResmUsrId() {
		return this.autoSndResmUsrId;
	}
	
	/**
	 * Column Info
	 * @return expSndDt
	 */
	public String getExpSndDt() {
		return this.expSndDt;
	}
	
	/**
	 * Column Info
	 * @return autoSndResmDt
	 */
	public String getAutoSndResmDt() {
		return this.autoSndResmDt;
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
	 * @return diffRmk
	 */
	public String getDiffRmk() {
		return this.diffRmk;
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
	 * @return eclzOblCpyFlg
	 */
	public String getEclzOblCpyFlg() {
		return this.eclzOblCpyFlg;
	}
	
	/**
	 * Column Info
	 * @return pkupNtcSndStsCd
	 */
	public String getPkupNtcSndStsCd() {
		return this.pkupNtcSndStsCd;
	}
	
	/**
	 * Column Info
	 * @return cstmsClrFlg
	 */
	public String getCstmsClrFlg() {
		return this.cstmsClrFlg;
	}
	
	/**
	 * Column Info
	 * @return mnlFlg
	 */
	public String getMnlFlg() {
		return this.mnlFlg;
	}
	
	/**
	 * Column Info
	 * @return pkupNo
	 */
	public String getPkupNo() {
		return this.pkupNo;
	}
	

	/**
	 * Column Info
	 * @param autoSndStopFlg
	 */
	public void setAutoSndStopFlg(String autoSndStopFlg) {
		this.autoSndStopFlg = autoSndStopFlg;
	}
	
	/**
	 * Column Info
	 * @param custNm
	 */
	public void setCustNm(String custNm) {
		this.custNm = custNm;
	}
	
	/**
	 * Column Info
	 * @param expSndKrDt
	 */
	public void setExpSndKrDt(String expSndKrDt) {
		this.expSndKrDt = expSndKrDt;
	}
	
	/**
	 * Column Info
	 * @param oblCltFlg
	 */
	public void setOblCltFlg(String oblCltFlg) {
		this.oblCltFlg = oblCltFlg;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param pkupNtcEvntDt
	 */
	public void setPkupNtcEvntDt(String pkupNtcEvntDt) {
		this.pkupNtcEvntDt = pkupNtcEvntDt;
	}
	
	/**
	 * Column Info
	 * @param pkupNtcTpCd
	 */
	public void setPkupNtcTpCd(String pkupNtcTpCd) {
		this.pkupNtcTpCd = pkupNtcTpCd;
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
	 * @param autoSndResmFlg
	 */
	public void setAutoSndResmFlg(String autoSndResmFlg) {
		this.autoSndResmFlg = autoSndResmFlg;
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
	 * @param pkupYdCd
	 */
	public void setPkupYdCd(String pkupYdCd) {
		this.pkupYdCd = pkupYdCd;
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
	 * @param railLodDt
	 */
	public void setRailLodDt(String railLodDt) {
		this.railLodDt = railLodDt;
	}
	
	/**
	 * Column Info
	 * @param frtCltFlg
	 */
	public void setFrtCltFlg(String frtCltFlg) {
		this.frtCltFlg = frtCltFlg;
	}
	
	/**
	 * Column Info
	 * @param pkupAvalDt
	 */
	public void setPkupAvalDt(String pkupAvalDt) {
		this.pkupAvalDt = pkupAvalDt;
	}
	
	/**
	 * Column Info
	 * @param edi322MvmtCd
	 */
	public void setEdi322MvmtCd(String edi322MvmtCd) {
		this.edi322MvmtCd = edi322MvmtCd;
	}
	
	/**
	 * Column Info
	 * @param autoSndStopDt
	 */
	public void setAutoSndStopDt(String autoSndStopDt) {
		this.autoSndStopDt = autoSndStopDt;
	}
	
	/**
	 * Column Info
	 * @param lstFreeDt
	 */
	public void setLstFreeDt(String lstFreeDt) {
		this.lstFreeDt = lstFreeDt;
	}
	
	/**
	 * Column Info
	 * @param bkgCustTpCd
	 */
	public void setBkgCustTpCd(String bkgCustTpCd) {
		this.bkgCustTpCd = bkgCustTpCd;
	}
	
	/**
	 * Column Info
	 * @param ntfcDt
	 */
	public void setNtfcDt(String ntfcDt) {
		this.ntfcDt = ntfcDt;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param pkupNtcFomCd
	 */
	public void setPkupNtcFomCd(String pkupNtcFomCd) {
		this.pkupNtcFomCd = pkupNtcFomCd;
	}
	
	/**
	 * Column Info
	 * @param railRmpFreeDys
	 */
	public void setRailRmpFreeDys(String railRmpFreeDys) {
		this.railRmpFreeDys = railRmpFreeDys;
	}
	
	/**
	 * Column Info
	 * @param dorTrkrWoFlg
	 */
	public void setDorTrkrWoFlg(String dorTrkrWoFlg) {
		this.dorTrkrWoFlg = dorTrkrWoFlg;
	}
	
	/**
	 * Column Info
	 * @param mnlCngFlg
	 */
	public void setMnlCngFlg(String mnlCngFlg) {
		this.mnlCngFlg = mnlCngFlg;
	}
	
	/**
	 * Column Info
	 * @param autoSndStopUsrId
	 */
	public void setAutoSndStopUsrId(String autoSndStopUsrId) {
		this.autoSndStopUsrId = autoSndStopUsrId;
	}
	
	/**
	 * Column Info
	 * @param rtnYdCd
	 */
	public void setRtnYdCd(String rtnYdCd) {
		this.rtnYdCd = rtnYdCd;
	}
	
	/**
	 * Column Info
	 * @param ibdTrspHubCd
	 */
	public void setIbdTrspHubCd(String ibdTrspHubCd) {
		this.ibdTrspHubCd = ibdTrspHubCd;
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
	 * @param ntcSeq
	 */
	public void setNtcSeq(String ntcSeq) {
		this.ntcSeq = ntcSeq;
	}
	
	/**
	 * Column Info
	 * @param expSndGdt
	 */
	public void setExpSndGdt(String expSndGdt) {
		this.expSndGdt = expSndGdt;
	}
	
	/**
	 * Column Info
	 * @param autoSndResmUsrId
	 */
	public void setAutoSndResmUsrId(String autoSndResmUsrId) {
		this.autoSndResmUsrId = autoSndResmUsrId;
	}
	
	/**
	 * Column Info
	 * @param expSndDt
	 */
	public void setExpSndDt(String expSndDt) {
		this.expSndDt = expSndDt;
	}
	
	/**
	 * Column Info
	 * @param autoSndResmDt
	 */
	public void setAutoSndResmDt(String autoSndResmDt) {
		this.autoSndResmDt = autoSndResmDt;
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
	 * @param diffRmk
	 */
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
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
	 * @param eclzOblCpyFlg
	 */
	public void setEclzOblCpyFlg(String eclzOblCpyFlg) {
		this.eclzOblCpyFlg = eclzOblCpyFlg;
	}
	
	/**
	 * Column Info
	 * @param pkupNtcSndStsCd
	 */
	public void setPkupNtcSndStsCd(String pkupNtcSndStsCd) {
		this.pkupNtcSndStsCd = pkupNtcSndStsCd;
	}
	
	/**
	 * Column Info
	 * @param cstmsClrFlg
	 */
	public void setCstmsClrFlg(String cstmsClrFlg) {
		this.cstmsClrFlg = cstmsClrFlg;
	}
	
	/**
	 * Column Info
	 * @param mnlFlg
	 */
	public void setMnlFlg(String mnlFlg) {
		this.mnlFlg = mnlFlg;
	}
	
	/**
	 * Column Info
	 * @param pkupNo
	 */
	public void setPkupNo(String pkupNo) {
		this.pkupNo = pkupNo;
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
		setAutoSndStopFlg(JSPUtil.getParameter(request, prefix + "auto_snd_stop_flg", ""));
		setCustNm(JSPUtil.getParameter(request, prefix + "cust_nm", ""));
		setExpSndKrDt(JSPUtil.getParameter(request, prefix + "exp_snd_kr_dt", ""));
		setOblCltFlg(JSPUtil.getParameter(request, prefix + "obl_clt_flg", ""));
		setTrspSoSeq(JSPUtil.getParameter(request, prefix + "trsp_so_seq", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setPkupNtcEvntDt(JSPUtil.getParameter(request, prefix + "pkup_ntc_evnt_dt", ""));
		setPkupNtcTpCd(JSPUtil.getParameter(request, prefix + "pkup_ntc_tp_cd", ""));
		setTrspSoOfcCtyCd(JSPUtil.getParameter(request, prefix + "trsp_so_ofc_cty_cd", ""));
		setAutoSndResmFlg(JSPUtil.getParameter(request, prefix + "auto_snd_resm_flg", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setPkupYdCd(JSPUtil.getParameter(request, prefix + "pkup_yd_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setRailLodDt(JSPUtil.getParameter(request, prefix + "rail_lod_dt", ""));
		setFrtCltFlg(JSPUtil.getParameter(request, prefix + "frt_clt_flg", ""));
		setPkupAvalDt(JSPUtil.getParameter(request, prefix + "pkup_aval_dt", ""));
		setEdi322MvmtCd(JSPUtil.getParameter(request, prefix + "edi_322_mvmt_cd", ""));
		setAutoSndStopDt(JSPUtil.getParameter(request, prefix + "auto_snd_stop_dt", ""));
		setLstFreeDt(JSPUtil.getParameter(request, prefix + "lst_free_dt", ""));
		setBkgCustTpCd(JSPUtil.getParameter(request, prefix + "bkg_cust_tp_cd", ""));
		setNtfcDt(JSPUtil.getParameter(request, prefix + "ntfc_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setCustCntCd(JSPUtil.getParameter(request, prefix + "cust_cnt_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setPkupNtcFomCd(JSPUtil.getParameter(request, prefix + "pkup_ntc_fom_cd", ""));
		setRailRmpFreeDys(JSPUtil.getParameter(request, prefix + "rail_rmp_free_dys", ""));
		setDorTrkrWoFlg(JSPUtil.getParameter(request, prefix + "dor_trkr_wo_flg", ""));
		setMnlCngFlg(JSPUtil.getParameter(request, prefix + "mnl_cng_flg", ""));
		setAutoSndStopUsrId(JSPUtil.getParameter(request, prefix + "auto_snd_stop_usr_id", ""));
		setRtnYdCd(JSPUtil.getParameter(request, prefix + "rtn_yd_cd", ""));
		setIbdTrspHubCd(JSPUtil.getParameter(request, prefix + "ibd_trsp_hub_cd", ""));
		setCustSeq(JSPUtil.getParameter(request, prefix + "cust_seq", ""));
		setNtcSeq(JSPUtil.getParameter(request, prefix + "ntc_seq", ""));
		setExpSndGdt(JSPUtil.getParameter(request, prefix + "exp_snd_gdt", ""));
		setAutoSndResmUsrId(JSPUtil.getParameter(request, prefix + "auto_snd_resm_usr_id", ""));
		setExpSndDt(JSPUtil.getParameter(request, prefix + "exp_snd_dt", ""));
		setAutoSndResmDt(JSPUtil.getParameter(request, prefix + "auto_snd_resm_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, prefix + "bkg_no", ""));
		setDiffRmk(JSPUtil.getParameter(request, prefix + "diff_rmk", ""));
		setCntrNo(JSPUtil.getParameter(request, prefix + "cntr_no", ""));
		setEclzOblCpyFlg(JSPUtil.getParameter(request, prefix + "eclz_obl_cpy_flg", ""));
		setPkupNtcSndStsCd(JSPUtil.getParameter(request, prefix + "pkup_ntc_snd_sts_cd", ""));
		setCstmsClrFlg(JSPUtil.getParameter(request, prefix + "cstms_clr_flg", ""));
		setMnlFlg(JSPUtil.getParameter(request, prefix + "mnl_flg", ""));
		setPkupNo(JSPUtil.getParameter(request, prefix + "pkup_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgPkupNtcVO[]
	 */
	public BkgPkupNtcVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgPkupNtcVO[]
	 */
	public BkgPkupNtcVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgPkupNtcVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] autoSndStopFlg = (JSPUtil.getParameter(request, prefix	+ "auto_snd_stop_flg", length));
			String[] custNm = (JSPUtil.getParameter(request, prefix	+ "cust_nm", length));
			String[] expSndKrDt = (JSPUtil.getParameter(request, prefix	+ "exp_snd_kr_dt", length));
			String[] oblCltFlg = (JSPUtil.getParameter(request, prefix	+ "obl_clt_flg", length));
			String[] trspSoSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_so_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pkupNtcEvntDt = (JSPUtil.getParameter(request, prefix	+ "pkup_ntc_evnt_dt", length));
			String[] pkupNtcTpCd = (JSPUtil.getParameter(request, prefix	+ "pkup_ntc_tp_cd", length));
			String[] trspSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_so_ofc_cty_cd", length));
			String[] autoSndResmFlg = (JSPUtil.getParameter(request, prefix	+ "auto_snd_resm_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] pkupYdCd = (JSPUtil.getParameter(request, prefix	+ "pkup_yd_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] railLodDt = (JSPUtil.getParameter(request, prefix	+ "rail_lod_dt", length));
			String[] frtCltFlg = (JSPUtil.getParameter(request, prefix	+ "frt_clt_flg", length));
			String[] pkupAvalDt = (JSPUtil.getParameter(request, prefix	+ "pkup_aval_dt", length));
			String[] edi322MvmtCd = (JSPUtil.getParameter(request, prefix	+ "edi_322_mvmt_cd", length));
			String[] autoSndStopDt = (JSPUtil.getParameter(request, prefix	+ "auto_snd_stop_dt", length));
			String[] lstFreeDt = (JSPUtil.getParameter(request, prefix	+ "lst_free_dt", length));
			String[] bkgCustTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_cust_tp_cd", length));
			String[] ntfcDt = (JSPUtil.getParameter(request, prefix	+ "ntfc_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] pkupNtcFomCd = (JSPUtil.getParameter(request, prefix	+ "pkup_ntc_fom_cd", length));
			String[] railRmpFreeDys = (JSPUtil.getParameter(request, prefix	+ "rail_rmp_free_dys", length));
			String[] dorTrkrWoFlg = (JSPUtil.getParameter(request, prefix	+ "dor_trkr_wo_flg", length));
			String[] mnlCngFlg = (JSPUtil.getParameter(request, prefix	+ "mnl_cng_flg", length));
			String[] autoSndStopUsrId = (JSPUtil.getParameter(request, prefix	+ "auto_snd_stop_usr_id", length));
			String[] rtnYdCd = (JSPUtil.getParameter(request, prefix	+ "rtn_yd_cd", length));
			String[] ibdTrspHubCd = (JSPUtil.getParameter(request, prefix	+ "ibd_trsp_hub_cd", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			String[] ntcSeq = (JSPUtil.getParameter(request, prefix	+ "ntc_seq", length));
			String[] expSndGdt = (JSPUtil.getParameter(request, prefix	+ "exp_snd_gdt", length));
			String[] autoSndResmUsrId = (JSPUtil.getParameter(request, prefix	+ "auto_snd_resm_usr_id", length));
			String[] expSndDt = (JSPUtil.getParameter(request, prefix	+ "exp_snd_dt", length));
			String[] autoSndResmDt = (JSPUtil.getParameter(request, prefix	+ "auto_snd_resm_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] eclzOblCpyFlg = (JSPUtil.getParameter(request, prefix	+ "eclz_obl_cpy_flg", length));
			String[] pkupNtcSndStsCd = (JSPUtil.getParameter(request, prefix	+ "pkup_ntc_snd_sts_cd", length));
			String[] cstmsClrFlg = (JSPUtil.getParameter(request, prefix	+ "cstms_clr_flg", length));
			String[] mnlFlg = (JSPUtil.getParameter(request, prefix	+ "mnl_flg", length));
			String[] pkupNo = (JSPUtil.getParameter(request, prefix	+ "pkup_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgPkupNtcVO();
				if (autoSndStopFlg[i] != null)
					model.setAutoSndStopFlg(autoSndStopFlg[i]);
				if (custNm[i] != null)
					model.setCustNm(custNm[i]);
				if (expSndKrDt[i] != null)
					model.setExpSndKrDt(expSndKrDt[i]);
				if (oblCltFlg[i] != null)
					model.setOblCltFlg(oblCltFlg[i]);
				if (trspSoSeq[i] != null)
					model.setTrspSoSeq(trspSoSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pkupNtcEvntDt[i] != null)
					model.setPkupNtcEvntDt(pkupNtcEvntDt[i]);
				if (pkupNtcTpCd[i] != null)
					model.setPkupNtcTpCd(pkupNtcTpCd[i]);
				if (trspSoOfcCtyCd[i] != null)
					model.setTrspSoOfcCtyCd(trspSoOfcCtyCd[i]);
				if (autoSndResmFlg[i] != null)
					model.setAutoSndResmFlg(autoSndResmFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (pkupYdCd[i] != null)
					model.setPkupYdCd(pkupYdCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (railLodDt[i] != null)
					model.setRailLodDt(railLodDt[i]);
				if (frtCltFlg[i] != null)
					model.setFrtCltFlg(frtCltFlg[i]);
				if (pkupAvalDt[i] != null)
					model.setPkupAvalDt(pkupAvalDt[i]);
				if (edi322MvmtCd[i] != null)
					model.setEdi322MvmtCd(edi322MvmtCd[i]);
				if (autoSndStopDt[i] != null)
					model.setAutoSndStopDt(autoSndStopDt[i]);
				if (lstFreeDt[i] != null)
					model.setLstFreeDt(lstFreeDt[i]);
				if (bkgCustTpCd[i] != null)
					model.setBkgCustTpCd(bkgCustTpCd[i]);
				if (ntfcDt[i] != null)
					model.setNtfcDt(ntfcDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (pkupNtcFomCd[i] != null)
					model.setPkupNtcFomCd(pkupNtcFomCd[i]);
				if (railRmpFreeDys[i] != null)
					model.setRailRmpFreeDys(railRmpFreeDys[i]);
				if (dorTrkrWoFlg[i] != null)
					model.setDorTrkrWoFlg(dorTrkrWoFlg[i]);
				if (mnlCngFlg[i] != null)
					model.setMnlCngFlg(mnlCngFlg[i]);
				if (autoSndStopUsrId[i] != null)
					model.setAutoSndStopUsrId(autoSndStopUsrId[i]);
				if (rtnYdCd[i] != null)
					model.setRtnYdCd(rtnYdCd[i]);
				if (ibdTrspHubCd[i] != null)
					model.setIbdTrspHubCd(ibdTrspHubCd[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (ntcSeq[i] != null)
					model.setNtcSeq(ntcSeq[i]);
				if (expSndGdt[i] != null)
					model.setExpSndGdt(expSndGdt[i]);
				if (autoSndResmUsrId[i] != null)
					model.setAutoSndResmUsrId(autoSndResmUsrId[i]);
				if (expSndDt[i] != null)
					model.setExpSndDt(expSndDt[i]);
				if (autoSndResmDt[i] != null)
					model.setAutoSndResmDt(autoSndResmDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (eclzOblCpyFlg[i] != null)
					model.setEclzOblCpyFlg(eclzOblCpyFlg[i]);
				if (pkupNtcSndStsCd[i] != null)
					model.setPkupNtcSndStsCd(pkupNtcSndStsCd[i]);
				if (cstmsClrFlg[i] != null)
					model.setCstmsClrFlg(cstmsClrFlg[i]);
				if (mnlFlg[i] != null)
					model.setMnlFlg(mnlFlg[i]);
				if (pkupNo[i] != null)
					model.setPkupNo(pkupNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgPkupNtcVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgPkupNtcVO[]
	 */
	public BkgPkupNtcVO[] getBkgPkupNtcVOs(){
		BkgPkupNtcVO[] vos = (BkgPkupNtcVO[])models.toArray(new BkgPkupNtcVO[models.size()]);
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
		this.autoSndStopFlg = this.autoSndStopFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custNm = this.custNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expSndKrDt = this.expSndKrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblCltFlg = this.oblCltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoSeq = this.trspSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupNtcEvntDt = this.pkupNtcEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupNtcTpCd = this.pkupNtcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoOfcCtyCd = this.trspSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoSndResmFlg = this.autoSndResmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupYdCd = this.pkupYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railLodDt = this.railLodDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frtCltFlg = this.frtCltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupAvalDt = this.pkupAvalDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edi322MvmtCd = this.edi322MvmtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoSndStopDt = this.autoSndStopDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstFreeDt = this.lstFreeDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCustTpCd = this.bkgCustTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfcDt = this.ntfcDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupNtcFomCd = this.pkupNtcFomCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railRmpFreeDys = this.railRmpFreeDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dorTrkrWoFlg = this.dorTrkrWoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnlCngFlg = this.mnlCngFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoSndStopUsrId = this.autoSndStopUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtnYdCd = this.rtnYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdTrspHubCd = this.ibdTrspHubCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntcSeq = this.ntcSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expSndGdt = this.expSndGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoSndResmUsrId = this.autoSndResmUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expSndDt = this.expSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoSndResmDt = this.autoSndResmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eclzOblCpyFlg = this.eclzOblCpyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupNtcSndStsCd = this.pkupNtcSndStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsClrFlg = this.cstmsClrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnlFlg = this.mnlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupNo = this.pkupNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
