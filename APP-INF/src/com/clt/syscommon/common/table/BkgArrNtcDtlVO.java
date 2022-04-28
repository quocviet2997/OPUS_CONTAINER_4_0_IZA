/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : BkgArrNtcDtlVO.java
*@FileTitle : BkgArrNtcDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2018.03.06
*@LastModifier : 
*@LastVersion : 1.0
* 2018.03.06  
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

public class BkgArrNtcDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgArrNtcDtlVO> models = new ArrayList<BkgArrNtcDtlVO>();
	
	/* Column Info */
	private String emlSndDt = null;
	/* Column Info */
	private String faxSndGdt = null;
	/* Column Info */
	private String faxTpCd = null;
	/* Column Info */
	private String ediSndUsrId = null;
	/* Column Info */
	private String custCntcTpCd = null;
	/* Column Info */
	private String emlEvntFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String emlSndGdt = null;
	/* Column Info */
	private String faxSndUsrId = null;
	/* Column Info */
	private String edwUpdDt = null;
	/* Column Info */
	private String emlNtcSndId = null;
	/* Column Info */
	private String emlSndFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String faxSndFlg = null;
	/* Column Info */
	private String ntcEml = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String ntcEdiId = null;
	/* Column Info */
	private String ediAckDt = null;
	/* Column Info */
	private String bkgCustTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String faxChgDpFlg = null;
	/* Column Info */
	private String nrthAmerFaxChgDpFlg = null;
	/* Column Info */
	private String ediNtcSndId = null;
	/* Column Info */
	private String emlSndUsrId = null;
	/* Column Info */
	private String emlTpCd = null;
	/* Column Info */
	private String emlChgDpFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String faxNtcSndRsltCd = null;
	/* Column Info */
	private String nrthAmerEmlChgDpFlg = null;
	/* Column Info */
	private String faxNtcSndId = null;
	/* Column Info */
	private String ediAckCd = null;
	/* Column Info */
	private String faxEvntFlg = null;
	/* Column Info */
	private String emlNtcSndRsltCd = null;
	/* Column Info */
	private String faxNo = null;
	/* Column Info */
	private String faxSndDt = null;
	/* Column Info */
	private String ediSndDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public BkgArrNtcDtlVO() {}

	public BkgArrNtcDtlVO(String ibflag, String pagerows, String bkgCustTpCd, String bkgNo, String creDt, String creUsrId, String custCntcTpCd, String ediAckCd, String ediAckDt, String ediNtcSndId, String ediSndDt, String ediSndUsrId, String edwUpdDt, String emlChgDpFlg, String emlEvntFlg, String emlNtcSndId, String emlNtcSndRsltCd, String emlSndDt, String emlSndFlg, String emlSndGdt, String emlSndUsrId, String emlTpCd, String faxChgDpFlg, String faxEvntFlg, String faxNo, String faxNtcSndId, String faxNtcSndRsltCd, String faxSndDt, String faxSndFlg, String faxSndGdt, String faxSndUsrId, String faxTpCd, String nrthAmerEmlChgDpFlg, String nrthAmerFaxChgDpFlg, String ntcEdiId, String ntcEml, String updDt, String updUsrId) {
		this.emlSndDt = emlSndDt;
		this.faxSndGdt = faxSndGdt;
		this.faxTpCd = faxTpCd;
		this.ediSndUsrId = ediSndUsrId;
		this.custCntcTpCd = custCntcTpCd;
		this.emlEvntFlg = emlEvntFlg;
		this.creDt = creDt;
		this.emlSndGdt = emlSndGdt;
		this.faxSndUsrId = faxSndUsrId;
		this.edwUpdDt = edwUpdDt;
		this.emlNtcSndId = emlNtcSndId;
		this.emlSndFlg = emlSndFlg;
		this.pagerows = pagerows;
		this.faxSndFlg = faxSndFlg;
		this.ntcEml = ntcEml;
		this.ibflag = ibflag;
		this.ntcEdiId = ntcEdiId;
		this.ediAckDt = ediAckDt;
		this.bkgCustTpCd = bkgCustTpCd;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.faxChgDpFlg = faxChgDpFlg;
		this.nrthAmerFaxChgDpFlg = nrthAmerFaxChgDpFlg;
		this.ediNtcSndId = ediNtcSndId;
		this.emlSndUsrId = emlSndUsrId;
		this.emlTpCd = emlTpCd;
		this.emlChgDpFlg = emlChgDpFlg;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.faxNtcSndRsltCd = faxNtcSndRsltCd;
		this.nrthAmerEmlChgDpFlg = nrthAmerEmlChgDpFlg;
		this.faxNtcSndId = faxNtcSndId;
		this.ediAckCd = ediAckCd;
		this.faxEvntFlg = faxEvntFlg;
		this.emlNtcSndRsltCd = emlNtcSndRsltCd;
		this.faxNo = faxNo;
		this.faxSndDt = faxSndDt;
		this.ediSndDt = ediSndDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("eml_snd_dt", getEmlSndDt());
		this.hashColumns.put("fax_snd_gdt", getFaxSndGdt());
		this.hashColumns.put("fax_tp_cd", getFaxTpCd());
		this.hashColumns.put("edi_snd_usr_id", getEdiSndUsrId());
		this.hashColumns.put("cust_cntc_tp_cd", getCustCntcTpCd());
		this.hashColumns.put("eml_evnt_flg", getEmlEvntFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eml_snd_gdt", getEmlSndGdt());
		this.hashColumns.put("fax_snd_usr_id", getFaxSndUsrId());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("eml_ntc_snd_id", getEmlNtcSndId());
		this.hashColumns.put("eml_snd_flg", getEmlSndFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("fax_snd_flg", getFaxSndFlg());
		this.hashColumns.put("ntc_eml", getNtcEml());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ntc_edi_id", getNtcEdiId());
		this.hashColumns.put("edi_ack_dt", getEdiAckDt());
		this.hashColumns.put("bkg_cust_tp_cd", getBkgCustTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("fax_chg_dp_flg", getFaxChgDpFlg());
		this.hashColumns.put("nrth_amer_fax_chg_dp_flg", getNrthAmerFaxChgDpFlg());
		this.hashColumns.put("edi_ntc_snd_id", getEdiNtcSndId());
		this.hashColumns.put("eml_snd_usr_id", getEmlSndUsrId());
		this.hashColumns.put("eml_tp_cd", getEmlTpCd());
		this.hashColumns.put("eml_chg_dp_flg", getEmlChgDpFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("fax_ntc_snd_rslt_cd", getFaxNtcSndRsltCd());
		this.hashColumns.put("nrth_amer_eml_chg_dp_flg", getNrthAmerEmlChgDpFlg());
		this.hashColumns.put("fax_ntc_snd_id", getFaxNtcSndId());
		this.hashColumns.put("edi_ack_cd", getEdiAckCd());
		this.hashColumns.put("fax_evnt_flg", getFaxEvntFlg());
		this.hashColumns.put("eml_ntc_snd_rslt_cd", getEmlNtcSndRsltCd());
		this.hashColumns.put("fax_no", getFaxNo());
		this.hashColumns.put("fax_snd_dt", getFaxSndDt());
		this.hashColumns.put("edi_snd_dt", getEdiSndDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("eml_snd_dt", "emlSndDt");
		this.hashFields.put("fax_snd_gdt", "faxSndGdt");
		this.hashFields.put("fax_tp_cd", "faxTpCd");
		this.hashFields.put("edi_snd_usr_id", "ediSndUsrId");
		this.hashFields.put("cust_cntc_tp_cd", "custCntcTpCd");
		this.hashFields.put("eml_evnt_flg", "emlEvntFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eml_snd_gdt", "emlSndGdt");
		this.hashFields.put("fax_snd_usr_id", "faxSndUsrId");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("eml_ntc_snd_id", "emlNtcSndId");
		this.hashFields.put("eml_snd_flg", "emlSndFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("fax_snd_flg", "faxSndFlg");
		this.hashFields.put("ntc_eml", "ntcEml");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ntc_edi_id", "ntcEdiId");
		this.hashFields.put("edi_ack_dt", "ediAckDt");
		this.hashFields.put("bkg_cust_tp_cd", "bkgCustTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("fax_chg_dp_flg", "faxChgDpFlg");
		this.hashFields.put("nrth_amer_fax_chg_dp_flg", "nrthAmerFaxChgDpFlg");
		this.hashFields.put("edi_ntc_snd_id", "ediNtcSndId");
		this.hashFields.put("eml_snd_usr_id", "emlSndUsrId");
		this.hashFields.put("eml_tp_cd", "emlTpCd");
		this.hashFields.put("eml_chg_dp_flg", "emlChgDpFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("fax_ntc_snd_rslt_cd", "faxNtcSndRsltCd");
		this.hashFields.put("nrth_amer_eml_chg_dp_flg", "nrthAmerEmlChgDpFlg");
		this.hashFields.put("fax_ntc_snd_id", "faxNtcSndId");
		this.hashFields.put("edi_ack_cd", "ediAckCd");
		this.hashFields.put("fax_evnt_flg", "faxEvntFlg");
		this.hashFields.put("eml_ntc_snd_rslt_cd", "emlNtcSndRsltCd");
		this.hashFields.put("fax_no", "faxNo");
		this.hashFields.put("fax_snd_dt", "faxSndDt");
		this.hashFields.put("edi_snd_dt", "ediSndDt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return emlSndDt
	 */
	public String getEmlSndDt() {
		return this.emlSndDt;
	}
	
	/**
	 * Column Info
	 * @return faxSndGdt
	 */
	public String getFaxSndGdt() {
		return this.faxSndGdt;
	}
	
	/**
	 * Column Info
	 * @return faxTpCd
	 */
	public String getFaxTpCd() {
		return this.faxTpCd;
	}
	
	/**
	 * Column Info
	 * @return ediSndUsrId
	 */
	public String getEdiSndUsrId() {
		return this.ediSndUsrId;
	}
	
	/**
	 * Column Info
	 * @return custCntcTpCd
	 */
	public String getCustCntcTpCd() {
		return this.custCntcTpCd;
	}
	
	/**
	 * Column Info
	 * @return emlEvntFlg
	 */
	public String getEmlEvntFlg() {
		return this.emlEvntFlg;
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
	 * @return emlSndGdt
	 */
	public String getEmlSndGdt() {
		return this.emlSndGdt;
	}
	
	/**
	 * Column Info
	 * @return faxSndUsrId
	 */
	public String getFaxSndUsrId() {
		return this.faxSndUsrId;
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
	 * @return emlNtcSndId
	 */
	public String getEmlNtcSndId() {
		return this.emlNtcSndId;
	}
	
	/**
	 * Column Info
	 * @return emlSndFlg
	 */
	public String getEmlSndFlg() {
		return this.emlSndFlg;
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
	 * @return faxSndFlg
	 */
	public String getFaxSndFlg() {
		return this.faxSndFlg;
	}
	
	/**
	 * Column Info
	 * @return ntcEml
	 */
	public String getNtcEml() {
		return this.ntcEml;
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
	 * @return ntcEdiId
	 */
	public String getNtcEdiId() {
		return this.ntcEdiId;
	}
	
	/**
	 * Column Info
	 * @return ediAckDt
	 */
	public String getEdiAckDt() {
		return this.ediAckDt;
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
	 * @return faxChgDpFlg
	 */
	public String getFaxChgDpFlg() {
		return this.faxChgDpFlg;
	}
	
	/**
	 * Column Info
	 * @return nrthAmerFaxChgDpFlg
	 */
	public String getNrthAmerFaxChgDpFlg() {
		return this.nrthAmerFaxChgDpFlg;
	}
	
	/**
	 * Column Info
	 * @return ediNtcSndId
	 */
	public String getEdiNtcSndId() {
		return this.ediNtcSndId;
	}
	
	/**
	 * Column Info
	 * @return emlSndUsrId
	 */
	public String getEmlSndUsrId() {
		return this.emlSndUsrId;
	}
	
	/**
	 * Column Info
	 * @return emlTpCd
	 */
	public String getEmlTpCd() {
		return this.emlTpCd;
	}
	
	/**
	 * Column Info
	 * @return emlChgDpFlg
	 */
	public String getEmlChgDpFlg() {
		return this.emlChgDpFlg;
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
	 * @return faxNtcSndRsltCd
	 */
	public String getFaxNtcSndRsltCd() {
		return this.faxNtcSndRsltCd;
	}
	
	/**
	 * Column Info
	 * @return nrthAmerEmlChgDpFlg
	 */
	public String getNrthAmerEmlChgDpFlg() {
		return this.nrthAmerEmlChgDpFlg;
	}
	
	/**
	 * Column Info
	 * @return faxNtcSndId
	 */
	public String getFaxNtcSndId() {
		return this.faxNtcSndId;
	}
	
	/**
	 * Column Info
	 * @return ediAckCd
	 */
	public String getEdiAckCd() {
		return this.ediAckCd;
	}
	
	/**
	 * Column Info
	 * @return faxEvntFlg
	 */
	public String getFaxEvntFlg() {
		return this.faxEvntFlg;
	}
	
	/**
	 * Column Info
	 * @return emlNtcSndRsltCd
	 */
	public String getEmlNtcSndRsltCd() {
		return this.emlNtcSndRsltCd;
	}
	
	/**
	 * Column Info
	 * @return faxNo
	 */
	public String getFaxNo() {
		return this.faxNo;
	}
	
	/**
	 * Column Info
	 * @return faxSndDt
	 */
	public String getFaxSndDt() {
		return this.faxSndDt;
	}
	
	/**
	 * Column Info
	 * @return ediSndDt
	 */
	public String getEdiSndDt() {
		return this.ediSndDt;
	}
	

	/**
	 * Column Info
	 * @param emlSndDt
	 */
	public void setEmlSndDt(String emlSndDt) {
		this.emlSndDt = emlSndDt;
	}
	
	/**
	 * Column Info
	 * @param faxSndGdt
	 */
	public void setFaxSndGdt(String faxSndGdt) {
		this.faxSndGdt = faxSndGdt;
	}
	
	/**
	 * Column Info
	 * @param faxTpCd
	 */
	public void setFaxTpCd(String faxTpCd) {
		this.faxTpCd = faxTpCd;
	}
	
	/**
	 * Column Info
	 * @param ediSndUsrId
	 */
	public void setEdiSndUsrId(String ediSndUsrId) {
		this.ediSndUsrId = ediSndUsrId;
	}
	
	/**
	 * Column Info
	 * @param custCntcTpCd
	 */
	public void setCustCntcTpCd(String custCntcTpCd) {
		this.custCntcTpCd = custCntcTpCd;
	}
	
	/**
	 * Column Info
	 * @param emlEvntFlg
	 */
	public void setEmlEvntFlg(String emlEvntFlg) {
		this.emlEvntFlg = emlEvntFlg;
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
	 * @param emlSndGdt
	 */
	public void setEmlSndGdt(String emlSndGdt) {
		this.emlSndGdt = emlSndGdt;
	}
	
	/**
	 * Column Info
	 * @param faxSndUsrId
	 */
	public void setFaxSndUsrId(String faxSndUsrId) {
		this.faxSndUsrId = faxSndUsrId;
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
	 * @param emlNtcSndId
	 */
	public void setEmlNtcSndId(String emlNtcSndId) {
		this.emlNtcSndId = emlNtcSndId;
	}
	
	/**
	 * Column Info
	 * @param emlSndFlg
	 */
	public void setEmlSndFlg(String emlSndFlg) {
		this.emlSndFlg = emlSndFlg;
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
	 * @param faxSndFlg
	 */
	public void setFaxSndFlg(String faxSndFlg) {
		this.faxSndFlg = faxSndFlg;
	}
	
	/**
	 * Column Info
	 * @param ntcEml
	 */
	public void setNtcEml(String ntcEml) {
		this.ntcEml = ntcEml;
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
	 * @param ntcEdiId
	 */
	public void setNtcEdiId(String ntcEdiId) {
		this.ntcEdiId = ntcEdiId;
	}
	
	/**
	 * Column Info
	 * @param ediAckDt
	 */
	public void setEdiAckDt(String ediAckDt) {
		this.ediAckDt = ediAckDt;
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
	 * @param faxChgDpFlg
	 */
	public void setFaxChgDpFlg(String faxChgDpFlg) {
		this.faxChgDpFlg = faxChgDpFlg;
	}
	
	/**
	 * Column Info
	 * @param nrthAmerFaxChgDpFlg
	 */
	public void setNrthAmerFaxChgDpFlg(String nrthAmerFaxChgDpFlg) {
		this.nrthAmerFaxChgDpFlg = nrthAmerFaxChgDpFlg;
	}
	
	/**
	 * Column Info
	 * @param ediNtcSndId
	 */
	public void setEdiNtcSndId(String ediNtcSndId) {
		this.ediNtcSndId = ediNtcSndId;
	}
	
	/**
	 * Column Info
	 * @param emlSndUsrId
	 */
	public void setEmlSndUsrId(String emlSndUsrId) {
		this.emlSndUsrId = emlSndUsrId;
	}
	
	/**
	 * Column Info
	 * @param emlTpCd
	 */
	public void setEmlTpCd(String emlTpCd) {
		this.emlTpCd = emlTpCd;
	}
	
	/**
	 * Column Info
	 * @param emlChgDpFlg
	 */
	public void setEmlChgDpFlg(String emlChgDpFlg) {
		this.emlChgDpFlg = emlChgDpFlg;
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
	 * @param faxNtcSndRsltCd
	 */
	public void setFaxNtcSndRsltCd(String faxNtcSndRsltCd) {
		this.faxNtcSndRsltCd = faxNtcSndRsltCd;
	}
	
	/**
	 * Column Info
	 * @param nrthAmerEmlChgDpFlg
	 */
	public void setNrthAmerEmlChgDpFlg(String nrthAmerEmlChgDpFlg) {
		this.nrthAmerEmlChgDpFlg = nrthAmerEmlChgDpFlg;
	}
	
	/**
	 * Column Info
	 * @param faxNtcSndId
	 */
	public void setFaxNtcSndId(String faxNtcSndId) {
		this.faxNtcSndId = faxNtcSndId;
	}
	
	/**
	 * Column Info
	 * @param ediAckCd
	 */
	public void setEdiAckCd(String ediAckCd) {
		this.ediAckCd = ediAckCd;
	}
	
	/**
	 * Column Info
	 * @param faxEvntFlg
	 */
	public void setFaxEvntFlg(String faxEvntFlg) {
		this.faxEvntFlg = faxEvntFlg;
	}
	
	/**
	 * Column Info
	 * @param emlNtcSndRsltCd
	 */
	public void setEmlNtcSndRsltCd(String emlNtcSndRsltCd) {
		this.emlNtcSndRsltCd = emlNtcSndRsltCd;
	}
	
	/**
	 * Column Info
	 * @param faxNo
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}
	
	/**
	 * Column Info
	 * @param faxSndDt
	 */
	public void setFaxSndDt(String faxSndDt) {
		this.faxSndDt = faxSndDt;
	}
	
	/**
	 * Column Info
	 * @param ediSndDt
	 */
	public void setEdiSndDt(String ediSndDt) {
		this.ediSndDt = ediSndDt;
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
		setEmlSndDt(JSPUtil.getParameter(request, prefix + "eml_snd_dt", ""));
		setFaxSndGdt(JSPUtil.getParameter(request, prefix + "fax_snd_gdt", ""));
		setFaxTpCd(JSPUtil.getParameter(request, prefix + "fax_tp_cd", ""));
		setEdiSndUsrId(JSPUtil.getParameter(request, prefix + "edi_snd_usr_id", ""));
		setCustCntcTpCd(JSPUtil.getParameter(request, prefix + "cust_cntc_tp_cd", ""));
		setEmlEvntFlg(JSPUtil.getParameter(request, prefix + "eml_evnt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setEmlSndGdt(JSPUtil.getParameter(request, prefix + "eml_snd_gdt", ""));
		setFaxSndUsrId(JSPUtil.getParameter(request, prefix + "fax_snd_usr_id", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setEmlNtcSndId(JSPUtil.getParameter(request, prefix + "eml_ntc_snd_id", ""));
		setEmlSndFlg(JSPUtil.getParameter(request, prefix + "eml_snd_flg", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setFaxSndFlg(JSPUtil.getParameter(request, prefix + "fax_snd_flg", ""));
		setNtcEml(JSPUtil.getParameter(request, prefix + "ntc_eml", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setNtcEdiId(JSPUtil.getParameter(request, prefix + "ntc_edi_id", ""));
		setEdiAckDt(JSPUtil.getParameter(request, prefix + "edi_ack_dt", ""));
		setBkgCustTpCd(JSPUtil.getParameter(request, prefix + "bkg_cust_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setFaxChgDpFlg(JSPUtil.getParameter(request, prefix + "fax_chg_dp_flg", ""));
		setNrthAmerFaxChgDpFlg(JSPUtil.getParameter(request, prefix + "nrth_amer_fax_chg_dp_flg", ""));
		setEdiNtcSndId(JSPUtil.getParameter(request, prefix + "edi_ntc_snd_id", ""));
		setEmlSndUsrId(JSPUtil.getParameter(request, prefix + "eml_snd_usr_id", ""));
		setEmlTpCd(JSPUtil.getParameter(request, prefix + "eml_tp_cd", ""));
		setEmlChgDpFlg(JSPUtil.getParameter(request, prefix + "eml_chg_dp_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, prefix + "bkg_no", ""));
		setFaxNtcSndRsltCd(JSPUtil.getParameter(request, prefix + "fax_ntc_snd_rslt_cd", ""));
		setNrthAmerEmlChgDpFlg(JSPUtil.getParameter(request, prefix + "nrth_amer_eml_chg_dp_flg", ""));
		setFaxNtcSndId(JSPUtil.getParameter(request, prefix + "fax_ntc_snd_id", ""));
		setEdiAckCd(JSPUtil.getParameter(request, prefix + "edi_ack_cd", ""));
		setFaxEvntFlg(JSPUtil.getParameter(request, prefix + "fax_evnt_flg", ""));
		setEmlNtcSndRsltCd(JSPUtil.getParameter(request, prefix + "eml_ntc_snd_rslt_cd", ""));
		setFaxNo(JSPUtil.getParameter(request, prefix + "fax_no", ""));
		setFaxSndDt(JSPUtil.getParameter(request, prefix + "fax_snd_dt", ""));
		setEdiSndDt(JSPUtil.getParameter(request, prefix + "edi_snd_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgArrNtcDtlVO[]
	 */
	public BkgArrNtcDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgArrNtcDtlVO[]
	 */
	public BkgArrNtcDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgArrNtcDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] emlSndDt = (JSPUtil.getParameter(request, prefix	+ "eml_snd_dt", length));
			String[] faxSndGdt = (JSPUtil.getParameter(request, prefix	+ "fax_snd_gdt", length));
			String[] faxTpCd = (JSPUtil.getParameter(request, prefix	+ "fax_tp_cd", length));
			String[] ediSndUsrId = (JSPUtil.getParameter(request, prefix	+ "edi_snd_usr_id", length));
			String[] custCntcTpCd = (JSPUtil.getParameter(request, prefix	+ "cust_cntc_tp_cd", length));
			String[] emlEvntFlg = (JSPUtil.getParameter(request, prefix	+ "eml_evnt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] emlSndGdt = (JSPUtil.getParameter(request, prefix	+ "eml_snd_gdt", length));
			String[] faxSndUsrId = (JSPUtil.getParameter(request, prefix	+ "fax_snd_usr_id", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix	+ "edw_upd_dt", length));
			String[] emlNtcSndId = (JSPUtil.getParameter(request, prefix	+ "eml_ntc_snd_id", length));
			String[] emlSndFlg = (JSPUtil.getParameter(request, prefix	+ "eml_snd_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] faxSndFlg = (JSPUtil.getParameter(request, prefix	+ "fax_snd_flg", length));
			String[] ntcEml = (JSPUtil.getParameter(request, prefix	+ "ntc_eml", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] ntcEdiId = (JSPUtil.getParameter(request, prefix	+ "ntc_edi_id", length));
			String[] ediAckDt = (JSPUtil.getParameter(request, prefix	+ "edi_ack_dt", length));
			String[] bkgCustTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_cust_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] faxChgDpFlg = (JSPUtil.getParameter(request, prefix	+ "fax_chg_dp_flg", length));
			String[] nrthAmerFaxChgDpFlg = (JSPUtil.getParameter(request, prefix	+ "nrth_amer_fax_chg_dp_flg", length));
			String[] ediNtcSndId = (JSPUtil.getParameter(request, prefix	+ "edi_ntc_snd_id", length));
			String[] emlSndUsrId = (JSPUtil.getParameter(request, prefix	+ "eml_snd_usr_id", length));
			String[] emlTpCd = (JSPUtil.getParameter(request, prefix	+ "eml_tp_cd", length));
			String[] emlChgDpFlg = (JSPUtil.getParameter(request, prefix	+ "eml_chg_dp_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] faxNtcSndRsltCd = (JSPUtil.getParameter(request, prefix	+ "fax_ntc_snd_rslt_cd", length));
			String[] nrthAmerEmlChgDpFlg = (JSPUtil.getParameter(request, prefix	+ "nrth_amer_eml_chg_dp_flg", length));
			String[] faxNtcSndId = (JSPUtil.getParameter(request, prefix	+ "fax_ntc_snd_id", length));
			String[] ediAckCd = (JSPUtil.getParameter(request, prefix	+ "edi_ack_cd", length));
			String[] faxEvntFlg = (JSPUtil.getParameter(request, prefix	+ "fax_evnt_flg", length));
			String[] emlNtcSndRsltCd = (JSPUtil.getParameter(request, prefix	+ "eml_ntc_snd_rslt_cd", length));
			String[] faxNo = (JSPUtil.getParameter(request, prefix	+ "fax_no", length));
			String[] faxSndDt = (JSPUtil.getParameter(request, prefix	+ "fax_snd_dt", length));
			String[] ediSndDt = (JSPUtil.getParameter(request, prefix	+ "edi_snd_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgArrNtcDtlVO();
				if (emlSndDt[i] != null)
					model.setEmlSndDt(emlSndDt[i]);
				if (faxSndGdt[i] != null)
					model.setFaxSndGdt(faxSndGdt[i]);
				if (faxTpCd[i] != null)
					model.setFaxTpCd(faxTpCd[i]);
				if (ediSndUsrId[i] != null)
					model.setEdiSndUsrId(ediSndUsrId[i]);
				if (custCntcTpCd[i] != null)
					model.setCustCntcTpCd(custCntcTpCd[i]);
				if (emlEvntFlg[i] != null)
					model.setEmlEvntFlg(emlEvntFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (emlSndGdt[i] != null)
					model.setEmlSndGdt(emlSndGdt[i]);
				if (faxSndUsrId[i] != null)
					model.setFaxSndUsrId(faxSndUsrId[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
				if (emlNtcSndId[i] != null)
					model.setEmlNtcSndId(emlNtcSndId[i]);
				if (emlSndFlg[i] != null)
					model.setEmlSndFlg(emlSndFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (faxSndFlg[i] != null)
					model.setFaxSndFlg(faxSndFlg[i]);
				if (ntcEml[i] != null)
					model.setNtcEml(ntcEml[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ntcEdiId[i] != null)
					model.setNtcEdiId(ntcEdiId[i]);
				if (ediAckDt[i] != null)
					model.setEdiAckDt(ediAckDt[i]);
				if (bkgCustTpCd[i] != null)
					model.setBkgCustTpCd(bkgCustTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (faxChgDpFlg[i] != null)
					model.setFaxChgDpFlg(faxChgDpFlg[i]);
				if (nrthAmerFaxChgDpFlg[i] != null)
					model.setNrthAmerFaxChgDpFlg(nrthAmerFaxChgDpFlg[i]);
				if (ediNtcSndId[i] != null)
					model.setEdiNtcSndId(ediNtcSndId[i]);
				if (emlSndUsrId[i] != null)
					model.setEmlSndUsrId(emlSndUsrId[i]);
				if (emlTpCd[i] != null)
					model.setEmlTpCd(emlTpCd[i]);
				if (emlChgDpFlg[i] != null)
					model.setEmlChgDpFlg(emlChgDpFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (faxNtcSndRsltCd[i] != null)
					model.setFaxNtcSndRsltCd(faxNtcSndRsltCd[i]);
				if (nrthAmerEmlChgDpFlg[i] != null)
					model.setNrthAmerEmlChgDpFlg(nrthAmerEmlChgDpFlg[i]);
				if (faxNtcSndId[i] != null)
					model.setFaxNtcSndId(faxNtcSndId[i]);
				if (ediAckCd[i] != null)
					model.setEdiAckCd(ediAckCd[i]);
				if (faxEvntFlg[i] != null)
					model.setFaxEvntFlg(faxEvntFlg[i]);
				if (emlNtcSndRsltCd[i] != null)
					model.setEmlNtcSndRsltCd(emlNtcSndRsltCd[i]);
				if (faxNo[i] != null)
					model.setFaxNo(faxNo[i]);
				if (faxSndDt[i] != null)
					model.setFaxSndDt(faxSndDt[i]);
				if (ediSndDt[i] != null)
					model.setEdiSndDt(ediSndDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgArrNtcDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgArrNtcDtlVO[]
	 */
	public BkgArrNtcDtlVO[] getBkgArrNtcDtlVOs(){
		BkgArrNtcDtlVO[] vos = (BkgArrNtcDtlVO[])models.toArray(new BkgArrNtcDtlVO[models.size()]);
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
		this.emlSndDt = this.emlSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxSndGdt = this.faxSndGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxTpCd = this.faxTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndUsrId = this.ediSndUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntcTpCd = this.custCntcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlEvntFlg = this.emlEvntFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlSndGdt = this.emlSndGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxSndUsrId = this.faxSndUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlNtcSndId = this.emlNtcSndId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlSndFlg = this.emlSndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxSndFlg = this.faxSndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntcEml = this.ntcEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntcEdiId = this.ntcEdiId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediAckDt = this.ediAckDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCustTpCd = this.bkgCustTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxChgDpFlg = this.faxChgDpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nrthAmerFaxChgDpFlg = this.nrthAmerFaxChgDpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediNtcSndId = this.ediNtcSndId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlSndUsrId = this.emlSndUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlTpCd = this.emlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlChgDpFlg = this.emlChgDpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNtcSndRsltCd = this.faxNtcSndRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nrthAmerEmlChgDpFlg = this.nrthAmerEmlChgDpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNtcSndId = this.faxNtcSndId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediAckCd = this.ediAckCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxEvntFlg = this.faxEvntFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlNtcSndRsltCd = this.emlNtcSndRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNo = this.faxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxSndDt = this.faxSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndDt = this.ediSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
