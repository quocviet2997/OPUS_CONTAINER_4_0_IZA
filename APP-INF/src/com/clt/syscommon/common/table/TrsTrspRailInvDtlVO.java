/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TrsTrspRailInvDtlVO.java
*@FileTitle : TrsTrspRailInvDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.30
*@LastModifier : 박준용
*@LastVersion : 1.0
* 2009.09.30 박준용 
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
 * @author 박준용
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TrsTrspRailInvDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsTrspRailInvDtlVO> models = new ArrayList<TrsTrspRailInvDtlVO>();
	
	/* Column Info */
	private String toNodCd = null;
	/* Column Info */
	private String crntTrspRailInvAudCd = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String orgTrspRailInvAudCd = null;
	/* Column Info */
	private String invVndrSeq = null;
	/* Column Info */
	private String subRailSeq = null;
	/* Column Info */
	private String trspSoSeq = null;
	/* Column Info */
	private String payFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String cgoTpCd = null;
	/* Column Info */
	private String cngCsrNo = null;
	/* Column Info */
	private String tmpTrspRailInvAudCd = null;
	/* Column Info */
	private String trspSoOfcCtyCd = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String eqNo = null;
	/* Column Info */
	private String trspInvCoIndCd = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String acctCd = null;
	/* Column Info */
	private String wblDt = null;
	/* Column Info */
	private String invBilAmt = null;
	/* Column Info */
	private String subInvSeq = null;
	/* Column Info */
	private String invOrgNodNm = null;
	/* Column Info */
	private String ovrWgtScgAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String dwUpdDt = null;
	/* Column Info */
	private String nonBilInvFlg = null;
	/* Column Info */
	private String loclCreDt = null;
	/* Column Info */
	private String wblNo = null;
	/* Column Info */
	private String invCurrCd = null;
	/* Column Info */
	private String bzcAmt = null;
	/* Column Info */
	private String invEtcAddAmt = null;
	/* Column Info */
	private String fuelScgAmt = null;
	/* Column Info */
	private String hzdMtrlScgAmt = null;
	/* Column Info */
	private String etcAddAmt = null;
	/* Column Info */
	private String eqTpszCd = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String fmNodCd = null;
	/* Column Info */
	private String negoAmt = null;
	/* Column Info */
	private String trspInvTpCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String cnmvRmk = null;
	/* Column Info */
	private String invRmk = null;
	/* Column Info */
	private String railBilDt = null;
	/* Column Info */
	private String invDestNodNm = null;
	/* Column Info */
	private String lgsCostCd = null;
	/* Column Info */
	private String fincVvdCd = null;
	/* Column Info */
	private String invBzcAmt = null;
	/* Column Info */
	private String loclUpdDt = null;
	/* Column Info */
	private String cntrNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TrsTrspRailInvDtlVO() {}

	public TrsTrspRailInvDtlVO(String ibflag, String pagerows, String invNo, String invVndrSeq, String subInvSeq, String trspSoOfcCtyCd, String trspSoSeq, String subRailSeq, String cngCsrNo, String tmpTrspRailInvAudCd, String orgTrspRailInvAudCd, String crntTrspRailInvAudCd, String trspInvTpCd, String lgsCostCd, String acctCd, String payFlg, String eqNo, String eqTpszCd, String cgoTpCd, String fmNodCd, String toNodCd, String invOrgNodNm, String invDestNodNm, String currCd, String bzcAmt, String fuelScgAmt, String hzdMtrlScgAmt, String etcAddAmt, String ovrWgtScgAmt, String negoAmt, String nonBilInvFlg, String invCurrCd, String invBzcAmt, String invBilAmt, String invEtcAddAmt, String trspInvCoIndCd, String railBilDt, String wblDt, String wblNo, String cnmvRmk, String invRmk, String creOfcCd, String fincVvdCd, String dwUpdDt, String creUsrId, String creDt, String updUsrId, String updDt, String loclCreDt, String loclUpdDt, String CntrNo) {
		this.toNodCd = toNodCd;
		this.crntTrspRailInvAudCd = crntTrspRailInvAudCd;
		this.currCd = currCd;
		this.orgTrspRailInvAudCd = orgTrspRailInvAudCd;
		this.invVndrSeq = invVndrSeq;
		this.subRailSeq = subRailSeq;
		this.trspSoSeq = trspSoSeq;
		this.payFlg = payFlg;
		this.creDt = creDt;
		this.cgoTpCd = cgoTpCd;
		this.cngCsrNo = cngCsrNo;
		this.tmpTrspRailInvAudCd = tmpTrspRailInvAudCd;
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.eqNo = eqNo;
		this.trspInvCoIndCd = trspInvCoIndCd;
		this.creOfcCd = creOfcCd;
		this.acctCd = acctCd;
		this.wblDt = wblDt;
		this.invBilAmt = invBilAmt;
		this.subInvSeq = subInvSeq;
		this.invOrgNodNm = invOrgNodNm;
		this.ovrWgtScgAmt = ovrWgtScgAmt;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.dwUpdDt = dwUpdDt;
		this.nonBilInvFlg = nonBilInvFlg;
		this.loclCreDt = loclCreDt;
		this.wblNo = wblNo;
		this.invCurrCd = invCurrCd;
		this.bzcAmt = bzcAmt;
		this.invEtcAddAmt = invEtcAddAmt;
		this.fuelScgAmt = fuelScgAmt;
		this.hzdMtrlScgAmt = hzdMtrlScgAmt;
		this.etcAddAmt = etcAddAmt;
		this.eqTpszCd = eqTpszCd;
		this.invNo = invNo;
		this.fmNodCd = fmNodCd;
		this.negoAmt = negoAmt;
		this.trspInvTpCd = trspInvTpCd;
		this.creUsrId = creUsrId;
		this.cnmvRmk = cnmvRmk;
		this.invRmk = invRmk;
		this.railBilDt = railBilDt;
		this.invDestNodNm = invDestNodNm;
		this.lgsCostCd = lgsCostCd;
		this.fincVvdCd = fincVvdCd;
		this.invBzcAmt = invBzcAmt;
		this.loclUpdDt = loclUpdDt;
		this.cntrNo = cntrNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("to_nod_cd", getToNodCd());
		this.hashColumns.put("crnt_trsp_rail_inv_aud_cd", getCrntTrspRailInvAudCd());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("org_trsp_rail_inv_aud_cd", getOrgTrspRailInvAudCd());
		this.hashColumns.put("inv_vndr_seq", getInvVndrSeq());
		this.hashColumns.put("sub_rail_seq", getSubRailSeq());
		this.hashColumns.put("trsp_so_seq", getTrspSoSeq());
		this.hashColumns.put("pay_flg", getPayFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cgo_tp_cd", getCgoTpCd());
		this.hashColumns.put("cng_csr_no", getCngCsrNo());
		this.hashColumns.put("tmp_trsp_rail_inv_aud_cd", getTmpTrspRailInvAudCd());
		this.hashColumns.put("trsp_so_ofc_cty_cd", getTrspSoOfcCtyCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("eq_no", getEqNo());
		this.hashColumns.put("trsp_inv_co_ind_cd", getTrspInvCoIndCd());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("acct_cd", getAcctCd());
		this.hashColumns.put("wbl_dt", getWblDt());
		this.hashColumns.put("inv_bil_amt", getInvBilAmt());
		this.hashColumns.put("sub_inv_seq", getSubInvSeq());
		this.hashColumns.put("inv_org_nod_nm", getInvOrgNodNm());
		this.hashColumns.put("ovr_wgt_scg_amt", getOvrWgtScgAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("dw_upd_dt", getDwUpdDt());
		this.hashColumns.put("non_bil_inv_flg", getNonBilInvFlg());
		this.hashColumns.put("locl_cre_dt", getLoclCreDt());
		this.hashColumns.put("wbl_no", getWblNo());
		this.hashColumns.put("inv_curr_cd", getInvCurrCd());
		this.hashColumns.put("bzc_amt", getBzcAmt());
		this.hashColumns.put("inv_etc_add_amt", getInvEtcAddAmt());
		this.hashColumns.put("fuel_scg_amt", getFuelScgAmt());
		this.hashColumns.put("hzd_mtrl_scg_amt", getHzdMtrlScgAmt());
		this.hashColumns.put("etc_add_amt", getEtcAddAmt());
		this.hashColumns.put("eq_tpsz_cd", getEqTpszCd());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("fm_nod_cd", getFmNodCd());
		this.hashColumns.put("nego_amt", getNegoAmt());
		this.hashColumns.put("trsp_inv_tp_cd", getTrspInvTpCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cnmv_rmk", getCnmvRmk());
		this.hashColumns.put("inv_rmk", getInvRmk());
		this.hashColumns.put("rail_bil_dt", getRailBilDt());
		this.hashColumns.put("inv_dest_nod_nm", getInvDestNodNm());
		this.hashColumns.put("lgs_cost_cd", getLgsCostCd());
		this.hashColumns.put("finc_vvd_cd", getFincVvdCd());
		this.hashColumns.put("inv_bzc_amt", getInvBzcAmt());
		this.hashColumns.put("locl_upd_dt", getLoclUpdDt());
		this.hashColumns.put("cntr_no", getCntrNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("to_nod_cd", "toNodCd");
		this.hashFields.put("crnt_trsp_rail_inv_aud_cd", "crntTrspRailInvAudCd");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("org_trsp_rail_inv_aud_cd", "orgTrspRailInvAudCd");
		this.hashFields.put("inv_vndr_seq", "invVndrSeq");
		this.hashFields.put("sub_rail_seq", "subRailSeq");
		this.hashFields.put("trsp_so_seq", "trspSoSeq");
		this.hashFields.put("pay_flg", "payFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cgo_tp_cd", "cgoTpCd");
		this.hashFields.put("cng_csr_no", "cngCsrNo");
		this.hashFields.put("tmp_trsp_rail_inv_aud_cd", "tmpTrspRailInvAudCd");
		this.hashFields.put("trsp_so_ofc_cty_cd", "trspSoOfcCtyCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("eq_no", "eqNo");
		this.hashFields.put("trsp_inv_co_ind_cd", "trspInvCoIndCd");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("acct_cd", "acctCd");
		this.hashFields.put("wbl_dt", "wblDt");
		this.hashFields.put("inv_bil_amt", "invBilAmt");
		this.hashFields.put("sub_inv_seq", "subInvSeq");
		this.hashFields.put("inv_org_nod_nm", "invOrgNodNm");
		this.hashFields.put("ovr_wgt_scg_amt", "ovrWgtScgAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("dw_upd_dt", "dwUpdDt");
		this.hashFields.put("non_bil_inv_flg", "nonBilInvFlg");
		this.hashFields.put("locl_cre_dt", "loclCreDt");
		this.hashFields.put("wbl_no", "wblNo");
		this.hashFields.put("inv_curr_cd", "invCurrCd");
		this.hashFields.put("bzc_amt", "bzcAmt");
		this.hashFields.put("inv_etc_add_amt", "invEtcAddAmt");
		this.hashFields.put("fuel_scg_amt", "fuelScgAmt");
		this.hashFields.put("hzd_mtrl_scg_amt", "hzdMtrlScgAmt");
		this.hashFields.put("etc_add_amt", "etcAddAmt");
		this.hashFields.put("eq_tpsz_cd", "eqTpszCd");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("fm_nod_cd", "fmNodCd");
		this.hashFields.put("nego_amt", "negoAmt");
		this.hashFields.put("trsp_inv_tp_cd", "trspInvTpCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cnmv_rmk", "cnmvRmk");
		this.hashFields.put("inv_rmk", "invRmk");
		this.hashFields.put("rail_bil_dt", "railBilDt");
		this.hashFields.put("inv_dest_nod_nm", "invDestNodNm");
		this.hashFields.put("lgs_cost_cd", "lgsCostCd");
		this.hashFields.put("finc_vvd_cd", "fincVvdCd");
		this.hashFields.put("inv_bzc_amt", "invBzcAmt");
		this.hashFields.put("locl_upd_dt", "loclUpdDt");
		this.hashFields.put("cntr_no", "cntrNo");
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
	 * @return crntTrspRailInvAudCd
	 */
	public String getCrntTrspRailInvAudCd() {
		return this.crntTrspRailInvAudCd;
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
	 * @return orgTrspRailInvAudCd
	 */
	public String getOrgTrspRailInvAudCd() {
		return this.orgTrspRailInvAudCd;
	}
	
	/**
	 * Column Info
	 * @return invVndrSeq
	 */
	public String getInvVndrSeq() {
		return this.invVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return subRailSeq
	 */
	public String getSubRailSeq() {
		return this.subRailSeq;
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
	 * @return payFlg
	 */
	public String getPayFlg() {
		return this.payFlg;
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
	 * @return cgoTpCd
	 */
	public String getCgoTpCd() {
		return this.cgoTpCd;
	}
	
	/**
	 * Column Info
	 * @return cngCsrNo
	 */
	public String getCngCsrNo() {
		return this.cngCsrNo;
	}
	
	/**
	 * Column Info
	 * @return tmpTrspRailInvAudCd
	 */
	public String getTmpTrspRailInvAudCd() {
		return this.tmpTrspRailInvAudCd;
	}
	
	/**
	 * Column Info
	 * @return trspSoOfcCtyCd
	 */
	public String getTrspSoOfcCtyCd() {
		return this.trspSoOfcCtyCd;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
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
	 * @return trspInvCoIndCd
	 */
	public String getTrspInvCoIndCd() {
		return this.trspInvCoIndCd;
	}
	
	/**
	 * Column Info
	 * @return creOfcCd
	 */
	public String getCreOfcCd() {
		return this.creOfcCd;
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
	 * @return wblDt
	 */
	public String getWblDt() {
		return this.wblDt;
	}
	
	/**
	 * Column Info
	 * @return invBilAmt
	 */
	public String getInvBilAmt() {
		return this.invBilAmt;
	}
	
	/**
	 * Column Info
	 * @return subInvSeq
	 */
	public String getSubInvSeq() {
		return this.subInvSeq;
	}
	
	/**
	 * Column Info
	 * @return invOrgNodNm
	 */
	public String getInvOrgNodNm() {
		return this.invOrgNodNm;
	}
	
	/**
	 * Column Info
	 * @return ovrWgtScgAmt
	 */
	public String getOvrWgtScgAmt() {
		return this.ovrWgtScgAmt;
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
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return dwUpdDt
	 */
	public String getDwUpdDt() {
		return this.dwUpdDt;
	}
	
	/**
	 * Column Info
	 * @return nonBilInvFlg
	 */
	public String getNonBilInvFlg() {
		return this.nonBilInvFlg;
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
	 * @return wblNo
	 */
	public String getWblNo() {
		return this.wblNo;
	}
	
	/**
	 * Column Info
	 * @return invCurrCd
	 */
	public String getInvCurrCd() {
		return this.invCurrCd;
	}
	
	/**
	 * Column Info
	 * @return bzcAmt
	 */
	public String getBzcAmt() {
		return this.bzcAmt;
	}
	
	/**
	 * Column Info
	 * @return invEtcAddAmt
	 */
	public String getInvEtcAddAmt() {
		return this.invEtcAddAmt;
	}
	
	/**
	 * Column Info
	 * @return fuelScgAmt
	 */
	public String getFuelScgAmt() {
		return this.fuelScgAmt;
	}
	
	/**
	 * Column Info
	 * @return hzdMtrlScgAmt
	 */
	public String getHzdMtrlScgAmt() {
		return this.hzdMtrlScgAmt;
	}
	
	/**
	 * Column Info
	 * @return etcAddAmt
	 */
	public String getEtcAddAmt() {
		return this.etcAddAmt;
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
	 * @return negoAmt
	 */
	public String getNegoAmt() {
		return this.negoAmt;
	}
	
	/**
	 * Column Info
	 * @return trspInvTpCd
	 */
	public String getTrspInvTpCd() {
		return this.trspInvTpCd;
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
	 * @return cnmvRmk
	 */
	public String getCnmvRmk() {
		return this.cnmvRmk;
	}
	
	/**
	 * Column Info
	 * @return invRmk
	 */
	public String getInvRmk() {
		return this.invRmk;
	}
	
	/**
	 * Column Info
	 * @return railBilDt
	 */
	public String getRailBilDt() {
		return this.railBilDt;
	}
	
	/**
	 * Column Info
	 * @return invDestNodNm
	 */
	public String getInvDestNodNm() {
		return this.invDestNodNm;
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
	 * @return fincVvdCd
	 */
	public String getFincVvdCd() {
		return this.fincVvdCd;
	}
	
	/**
	 * Column Info
	 * @return invBzcAmt
	 */
	public String getInvBzcAmt() {
		return this.invBzcAmt;
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
	 * @return cntrNo
	 */
	public String getCntrNo() {
		return cntrNo;
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
	 * @param crntTrspRailInvAudCd
	 */
	public void setCrntTrspRailInvAudCd(String crntTrspRailInvAudCd) {
		this.crntTrspRailInvAudCd = crntTrspRailInvAudCd;
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
	 * @param orgTrspRailInvAudCd
	 */
	public void setOrgTrspRailInvAudCd(String orgTrspRailInvAudCd) {
		this.orgTrspRailInvAudCd = orgTrspRailInvAudCd;
	}
	
	/**
	 * Column Info
	 * @param invVndrSeq
	 */
	public void setInvVndrSeq(String invVndrSeq) {
		this.invVndrSeq = invVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param subRailSeq
	 */
	public void setSubRailSeq(String subRailSeq) {
		this.subRailSeq = subRailSeq;
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
	 * @param payFlg
	 */
	public void setPayFlg(String payFlg) {
		this.payFlg = payFlg;
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
	 * @param cgoTpCd
	 */
	public void setCgoTpCd(String cgoTpCd) {
		this.cgoTpCd = cgoTpCd;
	}
	
	/**
	 * Column Info
	 * @param cngCsrNo
	 */
	public void setCngCsrNo(String cngCsrNo) {
		this.cngCsrNo = cngCsrNo;
	}
	
	/**
	 * Column Info
	 * @param tmpTrspRailInvAudCd
	 */
	public void setTmpTrspRailInvAudCd(String tmpTrspRailInvAudCd) {
		this.tmpTrspRailInvAudCd = tmpTrspRailInvAudCd;
	}
	
	/**
	 * Column Info
	 * @param trspSoOfcCtyCd
	 */
	public void setTrspSoOfcCtyCd(String trspSoOfcCtyCd) {
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
	 * @param trspInvCoIndCd
	 */
	public void setTrspInvCoIndCd(String trspInvCoIndCd) {
		this.trspInvCoIndCd = trspInvCoIndCd;
	}
	
	/**
	 * Column Info
	 * @param creOfcCd
	 */
	public void setCreOfcCd(String creOfcCd) {
		this.creOfcCd = creOfcCd;
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
	 * @param wblDt
	 */
	public void setWblDt(String wblDt) {
		this.wblDt = wblDt;
	}
	
	/**
	 * Column Info
	 * @param invBilAmt
	 */
	public void setInvBilAmt(String invBilAmt) {
		this.invBilAmt = invBilAmt;
	}
	
	/**
	 * Column Info
	 * @param subInvSeq
	 */
	public void setSubInvSeq(String subInvSeq) {
		this.subInvSeq = subInvSeq;
	}
	
	/**
	 * Column Info
	 * @param invOrgNodNm
	 */
	public void setInvOrgNodNm(String invOrgNodNm) {
		this.invOrgNodNm = invOrgNodNm;
	}
	
	/**
	 * Column Info
	 * @param ovrWgtScgAmt
	 */
	public void setOvrWgtScgAmt(String ovrWgtScgAmt) {
		this.ovrWgtScgAmt = ovrWgtScgAmt;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param dwUpdDt
	 */
	public void setDwUpdDt(String dwUpdDt) {
		this.dwUpdDt = dwUpdDt;
	}
	
	/**
	 * Column Info
	 * @param nonBilInvFlg
	 */
	public void setNonBilInvFlg(String nonBilInvFlg) {
		this.nonBilInvFlg = nonBilInvFlg;
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
	 * @param wblNo
	 */
	public void setWblNo(String wblNo) {
		this.wblNo = wblNo;
	}
	
	/**
	 * Column Info
	 * @param invCurrCd
	 */
	public void setInvCurrCd(String invCurrCd) {
		this.invCurrCd = invCurrCd;
	}
	
	/**
	 * Column Info
	 * @param bzcAmt
	 */
	public void setBzcAmt(String bzcAmt) {
		this.bzcAmt = bzcAmt;
	}
	
	/**
	 * Column Info
	 * @param invEtcAddAmt
	 */
	public void setInvEtcAddAmt(String invEtcAddAmt) {
		this.invEtcAddAmt = invEtcAddAmt;
	}
	
	/**
	 * Column Info
	 * @param fuelScgAmt
	 */
	public void setFuelScgAmt(String fuelScgAmt) {
		this.fuelScgAmt = fuelScgAmt;
	}
	
	/**
	 * Column Info
	 * @param hzdMtrlScgAmt
	 */
	public void setHzdMtrlScgAmt(String hzdMtrlScgAmt) {
		this.hzdMtrlScgAmt = hzdMtrlScgAmt;
	}
	
	/**
	 * Column Info
	 * @param etcAddAmt
	 */
	public void setEtcAddAmt(String etcAddAmt) {
		this.etcAddAmt = etcAddAmt;
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
	 * @param negoAmt
	 */
	public void setNegoAmt(String negoAmt) {
		this.negoAmt = negoAmt;
	}
	
	/**
	 * Column Info
	 * @param trspInvTpCd
	 */
	public void setTrspInvTpCd(String trspInvTpCd) {
		this.trspInvTpCd = trspInvTpCd;
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
	 * @param cnmvRmk
	 */
	public void setCnmvRmk(String cnmvRmk) {
		this.cnmvRmk = cnmvRmk;
	}
	
	/**
	 * Column Info
	 * @param invRmk
	 */
	public void setInvRmk(String invRmk) {
		this.invRmk = invRmk;
	}
	
	/**
	 * Column Info
	 * @param railBilDt
	 */
	public void setRailBilDt(String railBilDt) {
		this.railBilDt = railBilDt;
	}
	
	/**
	 * Column Info
	 * @param invDestNodNm
	 */
	public void setInvDestNodNm(String invDestNodNm) {
		this.invDestNodNm = invDestNodNm;
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
	 * @param fincVvdCd
	 */
	public void setFincVvdCd(String fincVvdCd) {
		this.fincVvdCd = fincVvdCd;
	}
	
	/**
	 * Column Info
	 * @param invBzcAmt
	 */
	public void setInvBzcAmt(String invBzcAmt) {
		this.invBzcAmt = invBzcAmt;
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
	 * @param cntrNo
	 */
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setToNodCd(JSPUtil.getParameter(request, "to_nod_cd", ""));
		setCrntTrspRailInvAudCd(JSPUtil.getParameter(request, "crnt_trsp_rail_inv_aud_cd", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setOrgTrspRailInvAudCd(JSPUtil.getParameter(request, "org_trsp_rail_inv_aud_cd", ""));
		setInvVndrSeq(JSPUtil.getParameter(request, "inv_vndr_seq", ""));
		setSubRailSeq(JSPUtil.getParameter(request, "sub_rail_seq", ""));
		setTrspSoSeq(JSPUtil.getParameter(request, "trsp_so_seq", ""));
		setPayFlg(JSPUtil.getParameter(request, "pay_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCgoTpCd(JSPUtil.getParameter(request, "cgo_tp_cd", ""));
		setCngCsrNo(JSPUtil.getParameter(request, "cng_csr_no", ""));
		setTmpTrspRailInvAudCd(JSPUtil.getParameter(request, "tmp_trsp_rail_inv_aud_cd", ""));
		setTrspSoOfcCtyCd(JSPUtil.getParameter(request, "trsp_so_ofc_cty_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setEqNo(JSPUtil.getParameter(request, "eq_no", ""));
		setTrspInvCoIndCd(JSPUtil.getParameter(request, "trsp_inv_co_ind_cd", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setAcctCd(JSPUtil.getParameter(request, "acct_cd", ""));
		setWblDt(JSPUtil.getParameter(request, "wbl_dt", ""));
		setInvBilAmt(JSPUtil.getParameter(request, "inv_bil_amt", ""));
		setSubInvSeq(JSPUtil.getParameter(request, "sub_inv_seq", ""));
		setInvOrgNodNm(JSPUtil.getParameter(request, "inv_org_nod_nm", ""));
		setOvrWgtScgAmt(JSPUtil.getParameter(request, "ovr_wgt_scg_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setDwUpdDt(JSPUtil.getParameter(request, "dw_upd_dt", ""));
		setNonBilInvFlg(JSPUtil.getParameter(request, "non_bil_inv_flg", ""));
		setLoclCreDt(JSPUtil.getParameter(request, "locl_cre_dt", ""));
		setWblNo(JSPUtil.getParameter(request, "wbl_no", ""));
		setInvCurrCd(JSPUtil.getParameter(request, "inv_curr_cd", ""));
		setBzcAmt(JSPUtil.getParameter(request, "bzc_amt", ""));
		setInvEtcAddAmt(JSPUtil.getParameter(request, "inv_etc_add_amt", ""));
		setFuelScgAmt(JSPUtil.getParameter(request, "fuel_scg_amt", ""));
		setHzdMtrlScgAmt(JSPUtil.getParameter(request, "hzd_mtrl_scg_amt", ""));
		setEtcAddAmt(JSPUtil.getParameter(request, "etc_add_amt", ""));
		setEqTpszCd(JSPUtil.getParameter(request, "eq_tpsz_cd", ""));
		setInvNo(JSPUtil.getParameter(request, "inv_no", ""));
		setFmNodCd(JSPUtil.getParameter(request, "fm_nod_cd", ""));
		setNegoAmt(JSPUtil.getParameter(request, "nego_amt", ""));
		setTrspInvTpCd(JSPUtil.getParameter(request, "trsp_inv_tp_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCnmvRmk(JSPUtil.getParameter(request, "cnmv_rmk", ""));
		setInvRmk(JSPUtil.getParameter(request, "inv_rmk", ""));
		setRailBilDt(JSPUtil.getParameter(request, "rail_bil_dt", ""));
		setInvDestNodNm(JSPUtil.getParameter(request, "inv_dest_nod_nm", ""));
		setLgsCostCd(JSPUtil.getParameter(request, "lgs_cost_cd", ""));
		setFincVvdCd(JSPUtil.getParameter(request, "finc_vvd_cd", ""));
		setInvBzcAmt(JSPUtil.getParameter(request, "inv_bzc_amt", ""));
		setLoclUpdDt(JSPUtil.getParameter(request, "locl_upd_dt", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsTrspRailInvDtlVO[]
	 */
	public TrsTrspRailInvDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsTrspRailInvDtlVO[]
	 */
	public TrsTrspRailInvDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspRailInvDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] toNodCd = (JSPUtil.getParameter(request, prefix	+ "to_nod_cd", length));
			String[] crntTrspRailInvAudCd = (JSPUtil.getParameter(request, prefix	+ "crnt_trsp_rail_inv_aud_cd", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] orgTrspRailInvAudCd = (JSPUtil.getParameter(request, prefix	+ "org_trsp_rail_inv_aud_cd", length));
			String[] invVndrSeq = (JSPUtil.getParameter(request, prefix	+ "inv_vndr_seq", length));
			String[] subRailSeq = (JSPUtil.getParameter(request, prefix	+ "sub_rail_seq", length));
			String[] trspSoSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_so_seq", length));
			String[] payFlg = (JSPUtil.getParameter(request, prefix	+ "pay_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] cgoTpCd = (JSPUtil.getParameter(request, prefix	+ "cgo_tp_cd", length));
			String[] cngCsrNo = (JSPUtil.getParameter(request, prefix	+ "cng_csr_no", length));
			String[] tmpTrspRailInvAudCd = (JSPUtil.getParameter(request, prefix	+ "tmp_trsp_rail_inv_aud_cd", length));
			String[] trspSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_so_ofc_cty_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] eqNo = (JSPUtil.getParameter(request, prefix	+ "eq_no", length));
			String[] trspInvCoIndCd = (JSPUtil.getParameter(request, prefix	+ "trsp_inv_co_ind_cd", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] acctCd = (JSPUtil.getParameter(request, prefix	+ "acct_cd", length));
			String[] wblDt = (JSPUtil.getParameter(request, prefix	+ "wbl_dt", length));
			String[] invBilAmt = (JSPUtil.getParameter(request, prefix	+ "inv_bil_amt", length));
			String[] subInvSeq = (JSPUtil.getParameter(request, prefix	+ "sub_inv_seq", length));
			String[] invOrgNodNm = (JSPUtil.getParameter(request, prefix	+ "inv_org_nod_nm", length));
			String[] ovrWgtScgAmt = (JSPUtil.getParameter(request, prefix	+ "ovr_wgt_scg_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] dwUpdDt = (JSPUtil.getParameter(request, prefix	+ "dw_upd_dt", length));
			String[] nonBilInvFlg = (JSPUtil.getParameter(request, prefix	+ "non_bil_inv_flg", length));
			String[] loclCreDt = (JSPUtil.getParameter(request, prefix	+ "locl_cre_dt", length));
			String[] wblNo = (JSPUtil.getParameter(request, prefix	+ "wbl_no", length));
			String[] invCurrCd = (JSPUtil.getParameter(request, prefix	+ "inv_curr_cd", length));
			String[] bzcAmt = (JSPUtil.getParameter(request, prefix	+ "bzc_amt", length));
			String[] invEtcAddAmt = (JSPUtil.getParameter(request, prefix	+ "inv_etc_add_amt", length));
			String[] fuelScgAmt = (JSPUtil.getParameter(request, prefix	+ "fuel_scg_amt", length));
			String[] hzdMtrlScgAmt = (JSPUtil.getParameter(request, prefix	+ "hzd_mtrl_scg_amt", length));
			String[] etcAddAmt = (JSPUtil.getParameter(request, prefix	+ "etc_add_amt", length));
			String[] eqTpszCd = (JSPUtil.getParameter(request, prefix	+ "eq_tpsz_cd", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] fmNodCd = (JSPUtil.getParameter(request, prefix	+ "fm_nod_cd", length));
			String[] negoAmt = (JSPUtil.getParameter(request, prefix	+ "nego_amt", length));
			String[] trspInvTpCd = (JSPUtil.getParameter(request, prefix	+ "trsp_inv_tp_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] cnmvRmk = (JSPUtil.getParameter(request, prefix	+ "cnmv_rmk", length));
			String[] invRmk = (JSPUtil.getParameter(request, prefix	+ "inv_rmk", length));
			String[] railBilDt = (JSPUtil.getParameter(request, prefix	+ "rail_bil_dt", length));
			String[] invDestNodNm = (JSPUtil.getParameter(request, prefix	+ "inv_dest_nod_nm", length));
			String[] lgsCostCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd", length));
			String[] fincVvdCd = (JSPUtil.getParameter(request, prefix	+ "finc_vvd_cd", length));
			String[] invBzcAmt = (JSPUtil.getParameter(request, prefix	+ "inv_bzc_amt", length));
			String[] loclUpdDt = (JSPUtil.getParameter(request, prefix	+ "locl_upd_dt", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsTrspRailInvDtlVO();
				if (toNodCd[i] != null)
					model.setToNodCd(toNodCd[i]);
				if (crntTrspRailInvAudCd[i] != null)
					model.setCrntTrspRailInvAudCd(crntTrspRailInvAudCd[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (orgTrspRailInvAudCd[i] != null)
					model.setOrgTrspRailInvAudCd(orgTrspRailInvAudCd[i]);
				if (invVndrSeq[i] != null)
					model.setInvVndrSeq(invVndrSeq[i]);
				if (subRailSeq[i] != null)
					model.setSubRailSeq(subRailSeq[i]);
				if (trspSoSeq[i] != null)
					model.setTrspSoSeq(trspSoSeq[i]);
				if (payFlg[i] != null)
					model.setPayFlg(payFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (cgoTpCd[i] != null)
					model.setCgoTpCd(cgoTpCd[i]);
				if (cngCsrNo[i] != null)
					model.setCngCsrNo(cngCsrNo[i]);
				if (tmpTrspRailInvAudCd[i] != null)
					model.setTmpTrspRailInvAudCd(tmpTrspRailInvAudCd[i]);
				if (trspSoOfcCtyCd[i] != null)
					model.setTrspSoOfcCtyCd(trspSoOfcCtyCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (eqNo[i] != null)
					model.setEqNo(eqNo[i]);
				if (trspInvCoIndCd[i] != null)
					model.setTrspInvCoIndCd(trspInvCoIndCd[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (acctCd[i] != null)
					model.setAcctCd(acctCd[i]);
				if (wblDt[i] != null)
					model.setWblDt(wblDt[i]);
				if (invBilAmt[i] != null)
					model.setInvBilAmt(invBilAmt[i]);
				if (subInvSeq[i] != null)
					model.setSubInvSeq(subInvSeq[i]);
				if (invOrgNodNm[i] != null)
					model.setInvOrgNodNm(invOrgNodNm[i]);
				if (ovrWgtScgAmt[i] != null)
					model.setOvrWgtScgAmt(ovrWgtScgAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (dwUpdDt[i] != null)
					model.setDwUpdDt(dwUpdDt[i]);
				if (nonBilInvFlg[i] != null)
					model.setNonBilInvFlg(nonBilInvFlg[i]);
				if (loclCreDt[i] != null)
					model.setLoclCreDt(loclCreDt[i]);
				if (wblNo[i] != null)
					model.setWblNo(wblNo[i]);
				if (invCurrCd[i] != null)
					model.setInvCurrCd(invCurrCd[i]);
				if (bzcAmt[i] != null)
					model.setBzcAmt(bzcAmt[i]);
				if (invEtcAddAmt[i] != null)
					model.setInvEtcAddAmt(invEtcAddAmt[i]);
				if (fuelScgAmt[i] != null)
					model.setFuelScgAmt(fuelScgAmt[i]);
				if (hzdMtrlScgAmt[i] != null)
					model.setHzdMtrlScgAmt(hzdMtrlScgAmt[i]);
				if (etcAddAmt[i] != null)
					model.setEtcAddAmt(etcAddAmt[i]);
				if (eqTpszCd[i] != null)
					model.setEqTpszCd(eqTpszCd[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (fmNodCd[i] != null)
					model.setFmNodCd(fmNodCd[i]);
				if (negoAmt[i] != null)
					model.setNegoAmt(negoAmt[i]);
				if (trspInvTpCd[i] != null)
					model.setTrspInvTpCd(trspInvTpCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (cnmvRmk[i] != null)
					model.setCnmvRmk(cnmvRmk[i]);
				if (invRmk[i] != null)
					model.setInvRmk(invRmk[i]);
				if (railBilDt[i] != null)
					model.setRailBilDt(railBilDt[i]);
				if (invDestNodNm[i] != null)
					model.setInvDestNodNm(invDestNodNm[i]);
				if (lgsCostCd[i] != null)
					model.setLgsCostCd(lgsCostCd[i]);
				if (fincVvdCd[i] != null)
					model.setFincVvdCd(fincVvdCd[i]);
				if (invBzcAmt[i] != null)
					model.setInvBzcAmt(invBzcAmt[i]);
				if (loclUpdDt[i] != null)
					model.setLoclUpdDt(loclUpdDt[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsTrspRailInvDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsTrspRailInvDtlVO[]
	 */
	public TrsTrspRailInvDtlVO[] getTrsTrspRailInvDtlVOs(){
		TrsTrspRailInvDtlVO[] vos = (TrsTrspRailInvDtlVO[])models.toArray(new TrsTrspRailInvDtlVO[models.size()]);
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
		this.crntTrspRailInvAudCd = this.crntTrspRailInvAudCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgTrspRailInvAudCd = this.orgTrspRailInvAudCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invVndrSeq = this.invVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subRailSeq = this.subRailSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoSeq = this.trspSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payFlg = this.payFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoTpCd = this.cgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cngCsrNo = this.cngCsrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmpTrspRailInvAudCd = this.tmpTrspRailInvAudCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoOfcCtyCd = this.trspSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqNo = this.eqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspInvCoIndCd = this.trspInvCoIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctCd = this.acctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wblDt = this.wblDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invBilAmt = this.invBilAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subInvSeq = this.subInvSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invOrgNodNm = this.invOrgNodNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovrWgtScgAmt = this.ovrWgtScgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dwUpdDt = this.dwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nonBilInvFlg = this.nonBilInvFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCreDt = this.loclCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wblNo = this.wblNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCurrCd = this.invCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bzcAmt = this.bzcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invEtcAddAmt = this.invEtcAddAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fuelScgAmt = this.fuelScgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hzdMtrlScgAmt = this.hzdMtrlScgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.etcAddAmt = this.etcAddAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqTpszCd = this.eqTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmNodCd = this.fmNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.negoAmt = this.negoAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspInvTpCd = this.trspInvTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvRmk = this.cnmvRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRmk = this.invRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railBilDt = this.railBilDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invDestNodNm = this.invDestNodNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCd = this.lgsCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincVvdCd = this.fincVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invBzcAmt = this.invBzcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclUpdDt = this.loclUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
