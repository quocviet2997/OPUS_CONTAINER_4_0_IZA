/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : BkgFullCgoRlseOrdVO.java
*@FileTitle : BkgFullCgoRlseOrdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.06.08
*@LastModifier : 윤한
*@LastVersion : 1.0
* 2010.06.08 윤한 
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
 * @author 윤한
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgFullCgoRlseOrdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgFullCgoRlseOrdVO> models = new ArrayList<BkgFullCgoRlseOrdVO>();
	
	/* Column Info */
	private String rlseOfcCd = null;
	/* Column Info */
	private String custNm = null;
	/* Column Info */
	private String emlSndId = null;
	/* Column Info */
	private String rlseUsrId = null;
	/* Column Info */
	private String rlseOrdSeq = null;
	/* Column Info */
	private String rlseInstrCtnt = null;
	/* Column Info */
	private String cxlFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rlseCreDt = null;
	/* Column Info */
	private String rlseCreGdt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String rlseHdrCtnt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String doNoSplit = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String doNo = null;
	/* Column Info */
	private String bkgTrspModCd = null;
	/* Column Info */
	private String rlseNtcEml = null;
	/* Column Info */
	private String cgoPkupDt = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String doIssDt = null;
	/* Column Info */
	private String cgorMzdCd = null;
	/* Column Info */
	private String ydCd = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String rlseFtrCtnt = null;
	/* Column Info */
	private String coBdgId = null;
	/* Column Info */
	private String cgoCrrId = null;
	/* Column Info */
	private String rlseExpDt = null;
	/* Column Info */
	private String pinNo = null;
	/* Column Info */
	private String vehRgstId = null;
	/* Column Info */
	private String roadHlgId = null;
	/* Column Info */
	private String uqVslIdNo = null;
	/* Column Info */
	private String mtyRtnYdCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgFullCgoRlseOrdVO() {}

	public BkgFullCgoRlseOrdVO(String ibflag, String pagerows, String bkgNo, String cntrNo, String rlseOrdSeq, String podCd, String ydCd, String cgoPkupDt, String bkgTrspModCd, String custNm, String rlseUsrId, String rlseOfcCd, String cgorMzdCd, String doNo, String doNoSplit, String doIssDt, String rlseCreDt, String rlseCreGdt, String rlseHdrCtnt, String rlseFtrCtnt, String rlseInstrCtnt, String diffRmk, String cxlFlg, String creUsrId, String creDt, String updUsrId, String updDt, String rlseNtcEml, String emlSndId, String coBdgId, String cgoCrrId, String rlseExpDt, String pinNo, String vehRgstId, String roadHlgId, String uqVslIdNo, String mtyRtnYdCd) {
		this.rlseOfcCd = rlseOfcCd;
		this.custNm = custNm;
		this.emlSndId = emlSndId;
		this.rlseUsrId = rlseUsrId;
		this.rlseOrdSeq = rlseOrdSeq;
		this.rlseInstrCtnt = rlseInstrCtnt;
		this.cxlFlg = cxlFlg;
		this.creDt = creDt;
		this.rlseCreDt = rlseCreDt;
		this.rlseCreGdt = rlseCreGdt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.rlseHdrCtnt = rlseHdrCtnt;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.doNoSplit = doNoSplit;
		this.podCd = podCd;
		this.doNo = doNo;
		this.bkgTrspModCd = bkgTrspModCd;
		this.rlseNtcEml = rlseNtcEml;
		this.cgoPkupDt = cgoPkupDt;
		this.bkgNo = bkgNo;
		this.creUsrId = creUsrId;
		this.diffRmk = diffRmk;
		this.doIssDt = doIssDt;
		this.cgorMzdCd = cgorMzdCd;
		this.ydCd = ydCd;
		this.cntrNo = cntrNo;
		this.rlseFtrCtnt = rlseFtrCtnt;
		this.coBdgId = coBdgId;
		this.cgoCrrId = cgoCrrId;
		this.rlseExpDt = rlseExpDt;
		this.pinNo = pinNo;
		this.vehRgstId = vehRgstId;
		this.roadHlgId = roadHlgId;
		this.uqVslIdNo = uqVslIdNo;
		this.mtyRtnYdCd = mtyRtnYdCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("rlse_ofc_cd", getRlseOfcCd());
		this.hashColumns.put("cust_nm", getCustNm());
		this.hashColumns.put("eml_snd_id", getEmlSndId());
		this.hashColumns.put("rlse_usr_id", getRlseUsrId());
		this.hashColumns.put("rlse_ord_seq", getRlseOrdSeq());
		this.hashColumns.put("rlse_instr_ctnt", getRlseInstrCtnt());
		this.hashColumns.put("cxl_flg", getCxlFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rlse_cre_dt", getRlseCreDt());
		this.hashColumns.put("rlse_cre_gdt", getRlseCreGdt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rlse_hdr_ctnt", getRlseHdrCtnt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("do_no_split", getDoNoSplit());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("do_no", getDoNo());
		this.hashColumns.put("bkg_trsp_mod_cd", getBkgTrspModCd());
		this.hashColumns.put("rlse_ntc_eml", getRlseNtcEml());
		this.hashColumns.put("cgo_pkup_dt", getCgoPkupDt());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("do_iss_dt", getDoIssDt());
		this.hashColumns.put("cgor_mzd_cd", getCgorMzdCd());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("rlse_ftr_ctnt", getRlseFtrCtnt());
		this.hashColumns.put("co_bdg_id", getCoBdgId());
		this.hashColumns.put("cgo_crr_id", getCgoCrrId());
		this.hashColumns.put("rlse_exp_dt", getRlseExpDt());
		this.hashColumns.put("pin_no", getPinNo());
		this.hashColumns.put("veh_rgst_id", getVehRgstId());
		this.hashColumns.put("road_hlg_id", getRoadHlgId());
		this.hashColumns.put("uq_vsl_id_no", getUqVslIdNo());
		this.hashColumns.put("mty_rtn_yd_cd", getMtyRtnYdCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("rlse_ofc_cd", "rlseOfcCd");
		this.hashFields.put("cust_nm", "custNm");
		this.hashFields.put("eml_snd_id", "emlSndId");
		this.hashFields.put("rlse_usr_id", "rlseUsrId");
		this.hashFields.put("rlse_ord_seq", "rlseOrdSeq");
		this.hashFields.put("rlse_instr_ctnt", "rlseInstrCtnt");
		this.hashFields.put("cxl_flg", "cxlFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rlse_cre_dt", "rlseCreDt");
		this.hashFields.put("rlse_cre_gdt", "rlseCreGdt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rlse_hdr_ctnt", "rlseHdrCtnt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("do_no_split", "doNoSplit");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("do_no", "doNo");
		this.hashFields.put("bkg_trsp_mod_cd", "bkgTrspModCd");
		this.hashFields.put("rlse_ntc_eml", "rlseNtcEml");
		this.hashFields.put("cgo_pkup_dt", "cgoPkupDt");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("do_iss_dt", "doIssDt");
		this.hashFields.put("cgor_mzd_cd", "cgorMzdCd");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("rlse_ftr_ctnt", "rlseFtrCtnt");
		this.hashFields.put("co_bdg_id", "coBdgId");
		this.hashFields.put("cgo_crr_id", "cgoCrrId");
		this.hashFields.put("rlse_exp_dt", "rlseExpDt");
		this.hashFields.put("pin_no", "pinNo");
		this.hashFields.put("veh_rgst_id", "vehRgstId");
		this.hashFields.put("road_hlg_id", "roadHlgId");
		this.hashFields.put("uq_vsl_id_no", "uqVslIdNo");
		this.hashFields.put("mty_rtn_yd_cd", "mtyRtnYdCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return rlseOfcCd
	 */
	public String getRlseOfcCd() {
		return this.rlseOfcCd;
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
	 * @return emlSndId
	 */
	public String getEmlSndId() {
		return this.emlSndId;
	}
	
	/**
	 * Column Info
	 * @return rlseUsrId
	 */
	public String getRlseUsrId() {
		return this.rlseUsrId;
	}
	
	/**
	 * Column Info
	 * @return rlseOrdSeq
	 */
	public String getRlseOrdSeq() {
		return this.rlseOrdSeq;
	}
	
	/**
	 * Column Info
	 * @return rlseInstrCtnt
	 */
	public String getRlseInstrCtnt() {
		return this.rlseInstrCtnt;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return rlseCreDt
	 */
	public String getRlseCreDt() {
		return this.rlseCreDt;
	}
	
	/**
	 * Column Info
	 * @return rlseCreGdt
	 */
	public String getRlseCreGdt() {
		return this.rlseCreGdt;
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
	 * @return rlseHdrCtnt
	 */
	public String getRlseHdrCtnt() {
		return this.rlseHdrCtnt;
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
	 * @return doNoSplit
	 */
	public String getDoNoSplit() {
		return this.doNoSplit;
	}
	
	/**
	 * Column Info
	 * @return podCd
	 */
	public String getPodCd() {
		return this.podCd;
	}
	
	/**
	 * Column Info
	 * @return doNo
	 */
	public String getDoNo() {
		return this.doNo;
	}
	
	/**
	 * Column Info
	 * @return bkgTrspModCd
	 */
	public String getBkgTrspModCd() {
		return this.bkgTrspModCd;
	}
	
	/**
	 * Column Info
	 * @return rlseNtcEml
	 */
	public String getRlseNtcEml() {
		return this.rlseNtcEml;
	}
	
	/**
	 * Column Info
	 * @return cgoPkupDt
	 */
	public String getCgoPkupDt() {
		return this.cgoPkupDt;
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
	 * @return diffRmk
	 */
	public String getDiffRmk() {
		return this.diffRmk;
	}
	
	/**
	 * Column Info
	 * @return doIssDt
	 */
	public String getDoIssDt() {
		return this.doIssDt;
	}
	
	/**
	 * Column Info
	 * @return cgorMzdCd
	 */
	public String getCgorMzdCd() {
		return this.cgorMzdCd;
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
	 * @return rlseFtrCtnt
	 */
	public String getRlseFtrCtnt() {
		return this.rlseFtrCtnt;
	}
	
	/**
	 * Column Info
	 * @return coBdgId
	 */
	public String getCoBdgId() {
		return coBdgId;
	}

	/**
	 * Column Info
	 * @return cgoCrrId
	 */
	public String getCgoCrrId() {
		return cgoCrrId;
	}

	/**
	 * Column Info
	 * @return rlseExpDt
	 */
	public String getRlseExpDt() {
		return rlseExpDt;
	}
	
	/**
	 * Column Info
	 * @return pinNo
	 */
	public String getPinNo() {
		return pinNo;
	}

	/**
	 * Column Info
	 * @return vehRgstId
	 */
	public String getVehRgstId() {
		return vehRgstId;
	}

	/**
	 * Column Info
	 * @return roadHlgId
	 */
	public String getRoadHlgId() {
		return roadHlgId;
	}

	/**
	 * Column Info
	 * @return uqVslIdNo
	 */
	public String getUqVslIdNo() {
		return uqVslIdNo;
	}
	
	/**
	 * Column Info
	 * @return mtyRtnYdCd
	 */
	public String getMtyRtnYdCd() {
		return this.mtyRtnYdCd;
	}

	/**
	 * Column Info
	 * @param rlseOfcCd
	 */
	public void setRlseOfcCd(String rlseOfcCd) {
		this.rlseOfcCd = rlseOfcCd;
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
	 * @param emlSndId
	 */
	public void setEmlSndId(String emlSndId) {
		this.emlSndId = emlSndId;
	}
	
	/**
	 * Column Info
	 * @param rlseUsrId
	 */
	public void setRlseUsrId(String rlseUsrId) {
		this.rlseUsrId = rlseUsrId;
	}
	
	/**
	 * Column Info
	 * @param rlseOrdSeq
	 */
	public void setRlseOrdSeq(String rlseOrdSeq) {
		this.rlseOrdSeq = rlseOrdSeq;
	}
	
	/**
	 * Column Info
	 * @param rlseInstrCtnt
	 */
	public void setRlseInstrCtnt(String rlseInstrCtnt) {
		this.rlseInstrCtnt = rlseInstrCtnt;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param rlseCreDt
	 */
	public void setRlseCreDt(String rlseCreDt) {
		this.rlseCreDt = rlseCreDt;
	}
	
	/**
	 * Column Info
	 * @param rlseCreGdt
	 */
	public void setRlseCreGdt(String rlseCreGdt) {
		this.rlseCreGdt = rlseCreGdt;
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
	 * @param rlseHdrCtnt
	 */
	public void setRlseHdrCtnt(String rlseHdrCtnt) {
		this.rlseHdrCtnt = rlseHdrCtnt;
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
	 * @param doNoSplit
	 */
	public void setDoNoSplit(String doNoSplit) {
		this.doNoSplit = doNoSplit;
	}
	
	/**
	 * Column Info
	 * @param podCd
	 */
	public void setPodCd(String podCd) {
		this.podCd = podCd;
	}
	
	/**
	 * Column Info
	 * @param doNo
	 */
	public void setDoNo(String doNo) {
		this.doNo = doNo;
	}
	
	/**
	 * Column Info
	 * @param bkgTrspModCd
	 */
	public void setBkgTrspModCd(String bkgTrspModCd) {
		this.bkgTrspModCd = bkgTrspModCd;
	}
	
	/**
	 * Column Info
	 * @param rlseNtcEml
	 */
	public void setRlseNtcEml(String rlseNtcEml) {
		this.rlseNtcEml = rlseNtcEml;
	}
	
	/**
	 * Column Info
	 * @param cgoPkupDt
	 */
	public void setCgoPkupDt(String cgoPkupDt) {
		this.cgoPkupDt = cgoPkupDt;
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
	 * @param diffRmk
	 */
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
	}
	
	/**
	 * Column Info
	 * @param doIssDt
	 */
	public void setDoIssDt(String doIssDt) {
		this.doIssDt = doIssDt;
	}
	
	/**
	 * Column Info
	 * @param cgorMzdCd
	 */
	public void setCgorMzdCd(String cgorMzdCd) {
		this.cgorMzdCd = cgorMzdCd;
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
	 * @param rlseFtrCtnt
	 */
	public void setRlseFtrCtnt(String rlseFtrCtnt) {
		this.rlseFtrCtnt = rlseFtrCtnt;
	}
	
	/**
	 * Column Info
	 * @param coBdgId
	 */
	public void setCoBdgId(String coBdgId) {
		this.coBdgId = coBdgId;
	}

	/**
	 * Column Info
	 * @param cgoCrrId
	 */
	public void setCgoCrrId(String cgoCrrId) {
		this.cgoCrrId = cgoCrrId;
	}

	/**
	 * Column Info
	 * @param rlseExpDt
	 */
	public void setRlseExpDt(String rlseExpDt) {
		this.rlseExpDt = rlseExpDt;
	}
	
	/**
	 * Column Info
	 * @param pinNo
	 */
	public void setPinNo(String pinNo) {
		this.pinNo = pinNo;
	}

	/**
	 * Column Info
	 * @param vehRgstId
	 */
	public void setVehRgstId(String vehRgstId) {
		this.vehRgstId = vehRgstId;
	}

	/**
	 * Column Info
	 * @param roadHlgId
	 */
	public void setRoadHlgId(String roadHlgId) {
		this.roadHlgId = roadHlgId;
	}

	/**
	 * Column Info
	 * @param uqVslIdNo
	 */
	public void setUqVslIdNo(String uqVslIdNo) {
		this.uqVslIdNo = uqVslIdNo;
	}
	
	/**
	 * Column Info
	 * @param mtyRtnYdCd
	 */
	public void setMtyRtnYdCd(String mtyRtnYdCd) {
		this.mtyRtnYdCd = mtyRtnYdCd;
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
		setRlseOfcCd(JSPUtil.getParameter(request, prefix + "rlse_ofc_cd", ""));
		setCustNm(JSPUtil.getParameter(request, prefix + "cust_nm", ""));
		setEmlSndId(JSPUtil.getParameter(request, prefix + "eml_snd_id", ""));
		setRlseUsrId(JSPUtil.getParameter(request, prefix + "rlse_usr_id", ""));
		setRlseOrdSeq(JSPUtil.getParameter(request, prefix + "rlse_ord_seq", ""));
		setRlseInstrCtnt(JSPUtil.getParameter(request, prefix + "rlse_instr_ctnt", ""));
		setCxlFlg(JSPUtil.getParameter(request, prefix + "cxl_flg", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setRlseCreDt(JSPUtil.getParameter(request, prefix + "rlse_cre_dt", ""));
		setRlseCreGdt(JSPUtil.getParameter(request, prefix + "rlse_cre_gdt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setRlseHdrCtnt(JSPUtil.getParameter(request, prefix + "rlse_hdr_ctnt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setDoNoSplit(JSPUtil.getParameter(request, prefix + "do_no_split", ""));
		setPodCd(JSPUtil.getParameter(request, prefix + "pod_cd", ""));
		setDoNo(JSPUtil.getParameter(request, prefix + "do_no", ""));
		setBkgTrspModCd(JSPUtil.getParameter(request, prefix + "bkg_trsp_mod_cd", ""));
		setRlseNtcEml(JSPUtil.getParameter(request, prefix + "rlse_ntc_eml", ""));
		setCgoPkupDt(JSPUtil.getParameter(request, prefix + "cgo_pkup_dt", ""));
		setBkgNo(JSPUtil.getParameter(request, prefix + "bkg_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setDiffRmk(JSPUtil.getParameter(request, prefix + "diff_rmk", ""));
		setDoIssDt(JSPUtil.getParameter(request, prefix + "do_iss_dt", ""));
		setCgorMzdCd(JSPUtil.getParameter(request, prefix + "cgor_mzd_cd", ""));
		setYdCd(JSPUtil.getParameter(request, prefix + "yd_cd", ""));
		setCntrNo(JSPUtil.getParameter(request, prefix + "cntr_no", ""));
		setRlseFtrCtnt(JSPUtil.getParameter(request, prefix + "rlse_ftr_ctnt", ""));
		setCoBdgId(JSPUtil.getParameter(request, prefix + "co_bdg_id", ""));
		setCgoCrrId(JSPUtil.getParameter(request, prefix + "cgo_crr_id", ""));
		setRlseExpDt(JSPUtil.getParameter(request, prefix + "rlse_exp_dt", ""));
		setRlseCreDt(JSPUtil.getParameter(request, prefix + "rlse_cre_dt", ""));
		setPinNo(JSPUtil.getParameter(request, prefix + "pin_no", ""));
		setVehRgstId(JSPUtil.getParameter(request, prefix + "veh_rgst_id", ""));
		setRoadHlgId(JSPUtil.getParameter(request, prefix + "road_hlg_id", ""));
		setUqVslIdNo(JSPUtil.getParameter(request, prefix + "uq_vsl_id_no", ""));
		setMtyRtnYdCd(JSPUtil.getParameter(request, "mty_rtn_yd_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgFullCgoRlseOrdVO[]
	 */
	public BkgFullCgoRlseOrdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgFullCgoRlseOrdVO[]
	 */
	public BkgFullCgoRlseOrdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgFullCgoRlseOrdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] rlseOfcCd = (JSPUtil.getParameter(request, prefix	+ "rlse_ofc_cd", length));
			String[] custNm = (JSPUtil.getParameter(request, prefix	+ "cust_nm", length));
			String[] emlSndId = (JSPUtil.getParameter(request, prefix	+ "eml_snd_id", length));
			String[] rlseUsrId = (JSPUtil.getParameter(request, prefix	+ "rlse_usr_id", length));
			String[] rlseOrdSeq = (JSPUtil.getParameter(request, prefix	+ "rlse_ord_seq", length));
			String[] rlseInstrCtnt = (JSPUtil.getParameter(request, prefix	+ "rlse_instr_ctnt", length));
			String[] cxlFlg = (JSPUtil.getParameter(request, prefix	+ "cxl_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] rlseCreDt = (JSPUtil.getParameter(request, prefix	+ "rlse_cre_dt", length));
			String[] rlseCreGdt = (JSPUtil.getParameter(request, prefix	+ "rlse_cre_gdt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] rlseHdrCtnt = (JSPUtil.getParameter(request, prefix	+ "rlse_hdr_ctnt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] doNoSplit = (JSPUtil.getParameter(request, prefix	+ "do_no_split", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] doNo = (JSPUtil.getParameter(request, prefix	+ "do_no", length));
			String[] bkgTrspModCd = (JSPUtil.getParameter(request, prefix	+ "bkg_trsp_mod_cd", length));
			String[] rlseNtcEml = (JSPUtil.getParameter(request, prefix	+ "rlse_ntc_eml", length));
			String[] cgoPkupDt = (JSPUtil.getParameter(request, prefix	+ "cgo_pkup_dt", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] doIssDt = (JSPUtil.getParameter(request, prefix	+ "do_iss_dt", length));
			String[] cgorMzdCd = (JSPUtil.getParameter(request, prefix	+ "cgor_mzd_cd", length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] rlseFtrCtnt = (JSPUtil.getParameter(request, prefix	+ "rlse_ftr_ctnt", length));
			String[] coBdgId = (JSPUtil.getParameter(request, prefix	+ "co_bdg_id", length));
			String[] cgoCrrId = (JSPUtil.getParameter(request, prefix	+ "cgo_crr_id", length));
			String[] rlseExpDt = (JSPUtil.getParameter(request, prefix	+ "rlse_exp_dt", length));
			String[] pinNo = (JSPUtil.getParameter(request, prefix	+ "pin_no", length));
			String[] vehRgstId = (JSPUtil.getParameter(request, prefix	+ "veh_rgst_id", length));
			String[] roadHlgId = (JSPUtil.getParameter(request, prefix	+ "road_hlg_id", length));
			String[] uqVslIdNo = (JSPUtil.getParameter(request, prefix	+ "uq_vsl_id_no", length));
			String[] mtyRtnYdCd = (JSPUtil.getParameter(request, prefix	+ "mty_rtn_yd_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgFullCgoRlseOrdVO();
				if (rlseOfcCd[i] != null)
					model.setRlseOfcCd(rlseOfcCd[i]);
				if (custNm[i] != null)
					model.setCustNm(custNm[i]);
				if (emlSndId[i] != null)
					model.setEmlSndId(emlSndId[i]);
				if (rlseUsrId[i] != null)
					model.setRlseUsrId(rlseUsrId[i]);
				if (rlseOrdSeq[i] != null)
					model.setRlseOrdSeq(rlseOrdSeq[i]);
				if (rlseInstrCtnt[i] != null)
					model.setRlseInstrCtnt(rlseInstrCtnt[i]);
				if (cxlFlg[i] != null)
					model.setCxlFlg(cxlFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rlseCreDt[i] != null)
					model.setRlseCreDt(rlseCreDt[i]);
				if (rlseCreGdt[i] != null)
					model.setRlseCreGdt(rlseCreGdt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rlseHdrCtnt[i] != null)
					model.setRlseHdrCtnt(rlseHdrCtnt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (doNoSplit[i] != null)
					model.setDoNoSplit(doNoSplit[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (doNo[i] != null)
					model.setDoNo(doNo[i]);
				if (bkgTrspModCd[i] != null)
					model.setBkgTrspModCd(bkgTrspModCd[i]);
				if (rlseNtcEml[i] != null)
					model.setRlseNtcEml(rlseNtcEml[i]);
				if (cgoPkupDt[i] != null)
					model.setCgoPkupDt(cgoPkupDt[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (doIssDt[i] != null)
					model.setDoIssDt(doIssDt[i]);
				if (cgorMzdCd[i] != null)
					model.setCgorMzdCd(cgorMzdCd[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (rlseFtrCtnt[i] != null)
					model.setRlseFtrCtnt(rlseFtrCtnt[i]);
				if (coBdgId[i] != null)
					model.setCoBdgId(coBdgId[i]);
				if (cgoCrrId[i] != null)
					model.setCgoCrrId(cgoCrrId[i]);
				if (rlseExpDt[i] != null)
					model.setRlseExpDt(rlseExpDt[i]);
				if (pinNo[i] != null)
					model.setPinNo(pinNo[i]);
				if (vehRgstId[i] != null)
					model.setVehRgstId(vehRgstId[i]);
				if (roadHlgId[i] != null)
					model.setRoadHlgId(roadHlgId[i]);
				if (uqVslIdNo[i] != null)
					model.setUqVslIdNo(uqVslIdNo[i]);
				if (mtyRtnYdCd[i] != null)
					model.setMtyRtnYdCd(mtyRtnYdCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgFullCgoRlseOrdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgFullCgoRlseOrdVO[]
	 */
	public BkgFullCgoRlseOrdVO[] getBkgFullCgoRlseOrdVOs(){
		BkgFullCgoRlseOrdVO[] vos = (BkgFullCgoRlseOrdVO[])models.toArray(new BkgFullCgoRlseOrdVO[models.size()]);
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
		this.rlseOfcCd = this.rlseOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custNm = this.custNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlSndId = this.emlSndId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlseUsrId = this.rlseUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlseOrdSeq = this.rlseOrdSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlseInstrCtnt = this.rlseInstrCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlFlg = this.cxlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlseCreDt = this.rlseCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlseCreGdt = this.rlseCreGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlseHdrCtnt = this.rlseHdrCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.doNoSplit = this.doNoSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.doNo = this.doNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgTrspModCd = this.bkgTrspModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlseNtcEml = this.rlseNtcEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoPkupDt = this.cgoPkupDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.doIssDt = this.doIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgorMzdCd = this.cgorMzdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlseFtrCtnt = this.rlseFtrCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coBdgId = this.coBdgId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoCrrId = this.cgoCrrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlseExpDt = this.rlseExpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pinNo = this.pinNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vehRgstId = this.vehRgstId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.roadHlgId = this.roadHlgId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.uqVslIdNo = this.uqVslIdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyRtnYdCd = this.mtyRtnYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
