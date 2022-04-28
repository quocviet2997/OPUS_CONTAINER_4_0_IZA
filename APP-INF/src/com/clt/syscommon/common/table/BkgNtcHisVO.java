/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgNtcHisVO.java
*@FileTitle : BkgNtcHisVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.05
*@LastModifier : 박성호
*@LastVersion : 1.0
* 2009.11.05 박성호 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.common.table;

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
 * @author 박성호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */
public class BkgNtcHisVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L;

    private Collection<BkgNtcHisVO> models = new ArrayList<BkgNtcHisVO>();

    /* Column Info */
    private String tmlNtcSndStsCd = null;

    /* Column Info */
    private String sndRqstDt = null;

    /* Column Info */
    private String custCntcTpCd = null;

    /* Column Info */
    private String sndRqstGdt = null;

    /* Column Info */
    private String creDt = null;

    /* Column Info */
    private String sndDt = null;

    /* Column Info */
    private String dpHdnFlg = null;

    /* Page Number */
    private String pagerows = null;

    /* Column Info */
    private String agnCd = null;

    /* Column Info */
    private String ntcViaCd = null;

    /* Column Info */
    private String frtPpdFlg = null;

    /* VO Data Value( C:Creation, U:Update, D:Delete ) */
    private String ibflag = null;

    /* Column Info */
    private String ntcEml = null;

    /* Column Info */
    private String frtCltFlg = null;

    /* Column Info */
    private String cgorStsCd = null;

    /* Column Info */
    private String ntcFaxNo = null;

    /* Column Info */
    private String hisSeq = null;

    /* Column Info */
    private String bkgCustTpCd = null;

    /* Column Info */
    private String updUsrId = null;

    /* Column Info */
    private String updDt = null;

    /* Column Info */
    private String custCntcAmdFlg = null;

    /* Column Info */
    private String ntcFomCd = null;

    /* Column Info */
    private String esvcGrpCd = null;

    /* Column Info */
    private String ntcKndCd = null;

    /* Column Info */
    private String sndOfcCd = null;

    /* Column Info */
    private String frtAllFlg = null;

    /* Column Info */
    private String sndGdt = null;

    /* Column Info */
    private String ediId = null;

    /* Column Info */
    private String ntcSeq = null;

    /* Column Info */
    private String frtHdnFlg = null;

    /* Column Info */
    private String frtChgFlg = null;

    /* Column Info */
    private String doEdiTpCd = null;

    /* Column Info */
    private String creUsrId = null;

    /* Column Info */
    private String sndUsrId = null;

    /* Column Info */
    private String bkgNo = null;

    /* Column Info */
    private String diffRmk = null;

    /* Column Info */
    private String sndId = null;

    /* Column Info */
    private String cntrNo = null;

    /* Column Info */
    private String cgorRcvrTpCd = null;

    /* Column Info */
    private String sndRtyKnt = null;

    /* Column Info */
    private String frtArrFlg = null;

    /* Column Info */
    private String bkgNtcSndRsltCd = null;

    /* Column Info */
    private String faxNtcSndRsltMsg = null;

    /* Column Info */
    private String hisUiNm = null;

    /* Column Info */
    private String prnrSubLnkCd = null;

    /* Column Info */
    private String cntrSltNoCtnt = null;
    
    /* Column Info */
    private String emlCtnt = null;

    /*	테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new HashMap<String, String>();

    /*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new HashMap<String, String>();

    public BkgNtcHisVO() {
    }

    public BkgNtcHisVO(String ibflag, String pagerows, String bkgNo, String hisSeq, String ntcViaCd, String ntcKndCd, String cntrNo, String agnCd, String ntcFomCd, String ntcSeq, String bkgCustTpCd, String custCntcTpCd, String ntcFaxNo, String ntcEml, String sndId, String ediId, String esvcGrpCd, String bkgNtcSndRsltCd, String tmlNtcSndStsCd, String cgorRcvrTpCd, String cgorStsCd, String frtHdnFlg, String frtAllFlg, String frtCltFlg, String frtPpdFlg, String frtChgFlg, String frtArrFlg, String sndOfcCd, String sndUsrId, String sndRqstDt, String sndRtyKnt, String sndDt, String diffRmk, String custCntcAmdFlg, String dpHdnFlg, String creUsrId, String creDt, String updUsrId, String updDt, String sndGdt, String doEdiTpCd, String sndRqstGdt, String faxNtcSndRsltMsg, String hisUiNm, String prnrSubLnkCd, String cntrSltNoCtnt, String emlCtnt) {
        this.tmlNtcSndStsCd = tmlNtcSndStsCd;
        this.sndRqstDt = sndRqstDt;
        this.custCntcTpCd = custCntcTpCd;
        this.sndRqstGdt = sndRqstGdt;
        this.creDt = creDt;
        this.sndDt = sndDt;
        this.dpHdnFlg = dpHdnFlg;
        this.pagerows = pagerows;
        this.agnCd = agnCd;
        this.ntcViaCd = ntcViaCd;
        this.frtPpdFlg = frtPpdFlg;
        this.ibflag = ibflag;
        this.ntcEml = ntcEml;
        this.frtCltFlg = frtCltFlg;
        this.cgorStsCd = cgorStsCd;
        this.ntcFaxNo = ntcFaxNo;
        this.hisSeq = hisSeq;
        this.bkgCustTpCd = bkgCustTpCd;
        this.updUsrId = updUsrId;
        this.updDt = updDt;
        this.custCntcAmdFlg = custCntcAmdFlg;
        this.ntcFomCd = ntcFomCd;
        this.esvcGrpCd = esvcGrpCd;
        this.ntcKndCd = ntcKndCd;
        this.sndOfcCd = sndOfcCd;
        this.frtAllFlg = frtAllFlg;
        this.sndGdt = sndGdt;
        this.ediId = ediId;
        this.ntcSeq = ntcSeq;
        this.frtHdnFlg = frtHdnFlg;
        this.frtChgFlg = frtChgFlg;
        this.doEdiTpCd = doEdiTpCd;
        this.creUsrId = creUsrId;
        this.sndUsrId = sndUsrId;
        this.bkgNo = bkgNo;
        this.diffRmk = diffRmk;
        this.sndId = sndId;
        this.cntrNo = cntrNo;
        this.cgorRcvrTpCd = cgorRcvrTpCd;
        this.sndRtyKnt = sndRtyKnt;
        this.frtArrFlg = frtArrFlg;
        this.bkgNtcSndRsltCd = bkgNtcSndRsltCd;
        this.faxNtcSndRsltMsg = faxNtcSndRsltMsg;
        this.hisUiNm = hisUiNm;
        this.prnrSubLnkCd = prnrSubLnkCd;
        this.cntrSltNoCtnt = cntrSltNoCtnt;
        this.emlCtnt = emlCtnt;
    }

    /**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("tml_ntc_snd_sts_cd", getTmlNtcSndStsCd());
        this.hashColumns.put("snd_rqst_dt", getSndRqstDt());
        this.hashColumns.put("cust_cntc_tp_cd", getCustCntcTpCd());
        this.hashColumns.put("snd_rqst_gdt", getSndRqstGdt());
        this.hashColumns.put("cre_dt", getCreDt());
        this.hashColumns.put("snd_dt", getSndDt());
        this.hashColumns.put("dp_hdn_flg", getDpHdnFlg());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("agn_cd", getAgnCd());
        this.hashColumns.put("ntc_via_cd", getNtcViaCd());
        this.hashColumns.put("frt_ppd_flg", getFrtPpdFlg());
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("ntc_eml", getNtcEml());
        this.hashColumns.put("frt_clt_flg", getFrtCltFlg());
        this.hashColumns.put("cgor_sts_cd", getCgorStsCd());
        this.hashColumns.put("ntc_fax_no", getNtcFaxNo());
        this.hashColumns.put("his_seq", getHisSeq());
        this.hashColumns.put("bkg_cust_tp_cd", getBkgCustTpCd());
        this.hashColumns.put("upd_usr_id", getUpdUsrId());
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("cust_cntc_amd_flg", getCustCntcAmdFlg());
        this.hashColumns.put("ntc_fom_cd", getNtcFomCd());
        this.hashColumns.put("esvc_grp_cd", getEsvcGrpCd());
        this.hashColumns.put("ntc_knd_cd", getNtcKndCd());
        this.hashColumns.put("snd_ofc_cd", getSndOfcCd());
        this.hashColumns.put("frt_all_flg", getFrtAllFlg());
        this.hashColumns.put("snd_gdt", getSndGdt());
        this.hashColumns.put("edi_id", getEdiId());
        this.hashColumns.put("ntc_seq", getNtcSeq());
        this.hashColumns.put("frt_hdn_flg", getFrtHdnFlg());
        this.hashColumns.put("frt_chg_flg", getFrtChgFlg());
        this.hashColumns.put("do_edi_tp_cd", getDoEdiTpCd());
        this.hashColumns.put("cre_usr_id", getCreUsrId());
        this.hashColumns.put("snd_usr_id", getSndUsrId());
        this.hashColumns.put("bkg_no", getBkgNo());
        this.hashColumns.put("diff_rmk", getDiffRmk());
        this.hashColumns.put("snd_id", getSndId());
        this.hashColumns.put("cntr_no", getCntrNo());
        this.hashColumns.put("cgor_rcvr_tp_cd", getCgorRcvrTpCd());
        this.hashColumns.put("snd_rty_knt", getSndRtyKnt());
        this.hashColumns.put("frt_arr_flg", getFrtArrFlg());
        this.hashColumns.put("bkg_ntc_snd_rslt_cd", getBkgNtcSndRsltCd());
        this.hashColumns.put("fax_ntc_snd_rslt_msg", getFaxNtcSndRsltMsg());
        this.hashColumns.put("his_ui_nm", getHisUiNm());
        this.hashColumns.put("prnr_sub_lnk_cd", getPrnrSubLnkCd());
        this.hashColumns.put("cntr_slt_no_ctnt", getCntrSltNoCtnt());
        this.hashColumns.put("eml_ctnt", getEmlCtnt());
        return this.hashColumns;
    }

    /**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("tml_ntc_snd_sts_cd", "tmlNtcSndStsCd");
        this.hashFields.put("snd_rqst_dt", "sndRqstDt");
        this.hashFields.put("cust_cntc_tp_cd", "custCntcTpCd");
        this.hashFields.put("snd_rqst_gdt", "sndRqstGdt");
        this.hashFields.put("cre_dt", "creDt");
        this.hashFields.put("snd_dt", "sndDt");
        this.hashFields.put("dp_hdn_flg", "dpHdnFlg");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("agn_cd", "agnCd");
        this.hashFields.put("ntc_via_cd", "ntcViaCd");
        this.hashFields.put("frt_ppd_flg", "frtPpdFlg");
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("ntc_eml", "ntcEml");
        this.hashFields.put("frt_clt_flg", "frtCltFlg");
        this.hashFields.put("cgor_sts_cd", "cgorStsCd");
        this.hashFields.put("ntc_fax_no", "ntcFaxNo");
        this.hashFields.put("his_seq", "hisSeq");
        this.hashFields.put("bkg_cust_tp_cd", "bkgCustTpCd");
        this.hashFields.put("upd_usr_id", "updUsrId");
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("cust_cntc_amd_flg", "custCntcAmdFlg");
        this.hashFields.put("ntc_fom_cd", "ntcFomCd");
        this.hashFields.put("esvc_grp_cd", "esvcGrpCd");
        this.hashFields.put("ntc_knd_cd", "ntcKndCd");
        this.hashFields.put("snd_ofc_cd", "sndOfcCd");
        this.hashFields.put("frt_all_flg", "frtAllFlg");
        this.hashFields.put("snd_gdt", "sndGdt");
        this.hashFields.put("edi_id", "ediId");
        this.hashFields.put("ntc_seq", "ntcSeq");
        this.hashFields.put("frt_hdn_flg", "frtHdnFlg");
        this.hashFields.put("frt_chg_flg", "frtChgFlg");
        this.hashFields.put("do_edi_tp_cd", "doEdiTpCd");
        this.hashFields.put("cre_usr_id", "creUsrId");
        this.hashFields.put("snd_usr_id", "sndUsrId");
        this.hashFields.put("bkg_no", "bkgNo");
        this.hashFields.put("diff_rmk", "diffRmk");
        this.hashFields.put("snd_id", "sndId");
        this.hashFields.put("cntr_no", "cntrNo");
        this.hashFields.put("cgor_rcvr_tp_cd", "cgorRcvrTpCd");
        this.hashFields.put("snd_rty_knt", "sndRtyKnt");
        this.hashFields.put("frt_arr_flg", "frtArrFlg");
        this.hashFields.put("bkg_ntc_snd_rslt_cd", "bkgNtcSndRsltCd");
        this.hashFields.put("fax_ntc_snd_rslt_msg", "faxNtcSndRsltMsg");
        this.hashFields.put("his_ui_nm", "hisUiNm");
        this.hashFields.put("prnr_sub_lnk_cd", "prnrSubLnkCd");
        this.hashFields.put("cntr_slt_no_ctnt", "cntrSltNoCtnt");
        this.hashFields.put("eml_ctnt", "emlCtnt");
        return this.hashFields;
    }

    /**
	 * Column Info
	 * @return tmlNtcSndStsCd
	 */
    public String getTmlNtcSndStsCd() {
        return this.tmlNtcSndStsCd;
    }

    /**
	 * Column Info
	 * @return sndRqstDt
	 */
    public String getSndRqstDt() {
        return this.sndRqstDt;
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
	 * @return sndRqstGdt
	 */
    public String getSndRqstGdt() {
        return this.sndRqstGdt;
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
	 * @return sndDt
	 */
    public String getSndDt() {
        return this.sndDt;
    }

    /**
	 * Column Info
	 * @return dpHdnFlg
	 */
    public String getDpHdnFlg() {
        return this.dpHdnFlg;
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
	 * @return agnCd
	 */
    public String getAgnCd() {
        return this.agnCd;
    }

    /**
	 * Column Info
	 * @return ntcViaCd
	 */
    public String getNtcViaCd() {
        return this.ntcViaCd;
    }

    /**
	 * Column Info
	 * @return frtPpdFlg
	 */
    public String getFrtPpdFlg() {
        return this.frtPpdFlg;
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
	 * @return ntcEml
	 */
    public String getNtcEml() {
        return this.ntcEml;
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
	 * @return cgorStsCd
	 */
    public String getCgorStsCd() {
        return this.cgorStsCd;
    }

    /**
	 * Column Info
	 * @return ntcFaxNo
	 */
    public String getNtcFaxNo() {
        return this.ntcFaxNo;
    }

    /**
	 * Column Info
	 * @return hisSeq
	 */
    public String getHisSeq() {
        return this.hisSeq;
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
	 * @return custCntcAmdFlg
	 */
    public String getCustCntcAmdFlg() {
        return this.custCntcAmdFlg;
    }

    /**
	 * Column Info
	 * @return ntcFomCd
	 */
    public String getNtcFomCd() {
        return this.ntcFomCd;
    }

    /**
	 * Column Info
	 * @return esvcGrpCd
	 */
    public String getEsvcGrpCd() {
        return this.esvcGrpCd;
    }

    /**
	 * Column Info
	 * @return ntcKndCd
	 */
    public String getNtcKndCd() {
        return this.ntcKndCd;
    }

    /**
	 * Column Info
	 * @return sndOfcCd
	 */
    public String getSndOfcCd() {
        return this.sndOfcCd;
    }

    /**
	 * Column Info
	 * @return frtAllFlg
	 */
    public String getFrtAllFlg() {
        return this.frtAllFlg;
    }

    /**
	 * Column Info
	 * @return sndGdt
	 */
    public String getSndGdt() {
        return this.sndGdt;
    }

    /**
	 * Column Info
	 * @return ediId
	 */
    public String getEdiId() {
        return this.ediId;
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
	 * @return frtHdnFlg
	 */
    public String getFrtHdnFlg() {
        return this.frtHdnFlg;
    }

    /**
	 * Column Info
	 * @return frtChgFlg
	 */
    public String getFrtChgFlg() {
        return this.frtChgFlg;
    }

    /**
	 * Column Info
	 * @return doEdiTpCd
	 */
    public String getDoEdiTpCd() {
        return this.doEdiTpCd;
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
	 * @return sndUsrId
	 */
    public String getSndUsrId() {
        return this.sndUsrId;
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
    	if(diffRmk != null && diffRmk.length() > 4000){
    		diffRmk = diffRmk.substring(0, 4000);
    	}
        return this.diffRmk;
    }

    /**
	 * Column Info
	 * @return sndId
	 */
    public String getSndId() {
        return this.sndId;
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
	 * @return cgorRcvrTpCd
	 */
    public String getCgorRcvrTpCd() {
        return this.cgorRcvrTpCd;
    }

    /**
	 * Column Info
	 * @return sndRtyKnt
	 */
    public String getSndRtyKnt() {
        return this.sndRtyKnt;
    }

    /**
	 * Column Info
	 * @return frtArrFlg
	 */
    public String getFrtArrFlg() {
        return this.frtArrFlg;
    }

    /**
	 * Column Info
	 * @return bkgNtcSndRsltCd
	 */
    public String getBkgNtcSndRsltCd() {
        return this.bkgNtcSndRsltCd;
    }
    
	/**
	 * Column Info
	 * @return emlCtnt
	 */
	public String getEmlCtnt() {
		return this.emlCtnt;
	}

    /**
	 * Column Info
	 * @param tmlNtcSndStsCd
	 */
    public void setTmlNtcSndStsCd(String tmlNtcSndStsCd) {
        this.tmlNtcSndStsCd = tmlNtcSndStsCd;
    }

    /**
	 * Column Info
	 * @param sndRqstDt
	 */
    public void setSndRqstDt(String sndRqstDt) {
        this.sndRqstDt = sndRqstDt;
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
	 * @param sndRqstGdt
	 */
    public void setSndRqstGdt(String sndRqstGdt) {
        this.sndRqstGdt = sndRqstGdt;
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
	 * @param sndDt
	 */
    public void setSndDt(String sndDt) {
        this.sndDt = sndDt;
    }

    /**
	 * Column Info
	 * @param dpHdnFlg
	 */
    public void setDpHdnFlg(String dpHdnFlg) {
        this.dpHdnFlg = dpHdnFlg;
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
	 * @param agnCd
	 */
    public void setAgnCd(String agnCd) {
        this.agnCd = agnCd;
    }

    /**
	 * Column Info
	 * @param ntcViaCd
	 */
    public void setNtcViaCd(String ntcViaCd) {
        this.ntcViaCd = ntcViaCd;
    }

    /**
	 * Column Info
	 * @param frtPpdFlg
	 */
    public void setFrtPpdFlg(String frtPpdFlg) {
        this.frtPpdFlg = frtPpdFlg;
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
	 * @param ntcEml
	 */
    public void setNtcEml(String ntcEml) {
        this.ntcEml = ntcEml;
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
	 * @param cgorStsCd
	 */
    public void setCgorStsCd(String cgorStsCd) {
        this.cgorStsCd = cgorStsCd;
    }

    /**
	 * Column Info
	 * @param ntcFaxNo
	 */
    public void setNtcFaxNo(String ntcFaxNo) {
        this.ntcFaxNo = ntcFaxNo;
    }

    /**
	 * Column Info
	 * @param hisSeq
	 */
    public void setHisSeq(String hisSeq) {
        this.hisSeq = hisSeq;
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
	 * @param custCntcAmdFlg
	 */
    public void setCustCntcAmdFlg(String custCntcAmdFlg) {
        this.custCntcAmdFlg = custCntcAmdFlg;
    }

    /**
	 * Column Info
	 * @param ntcFomCd
	 */
    public void setNtcFomCd(String ntcFomCd) {
        this.ntcFomCd = ntcFomCd;
    }

    /**
	 * Column Info
	 * @param esvcGrpCd
	 */
    public void setEsvcGrpCd(String esvcGrpCd) {
        this.esvcGrpCd = esvcGrpCd;
    }

    /**
	 * Column Info
	 * @param ntcKndCd
	 */
    public void setNtcKndCd(String ntcKndCd) {
        this.ntcKndCd = ntcKndCd;
    }

    /**
	 * Column Info
	 * @param sndOfcCd
	 */
    public void setSndOfcCd(String sndOfcCd) {
        this.sndOfcCd = sndOfcCd;
    }

    /**
	 * Column Info
	 * @param frtAllFlg
	 */
    public void setFrtAllFlg(String frtAllFlg) {
        this.frtAllFlg = frtAllFlg;
    }

    /**
	 * Column Info
	 * @param sndGdt
	 */
    public void setSndGdt(String sndGdt) {
        this.sndGdt = sndGdt;
    }

    /**
	 * Column Info
	 * @param ediId
	 */
    public void setEdiId(String ediId) {
        this.ediId = ediId;
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
	 * @param frtHdnFlg
	 */
    public void setFrtHdnFlg(String frtHdnFlg) {
        this.frtHdnFlg = frtHdnFlg;
    }

    /**
	 * Column Info
	 * @param frtChgFlg
	 */
    public void setFrtChgFlg(String frtChgFlg) {
        this.frtChgFlg = frtChgFlg;
    }

    /**
	 * Column Info
	 * @param doEdiTpCd
	 */
    public void setDoEdiTpCd(String doEdiTpCd) {
        this.doEdiTpCd = doEdiTpCd;
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
	 * @param sndUsrId
	 */
    public void setSndUsrId(String sndUsrId) {
        this.sndUsrId = sndUsrId;
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
	 * @param sndId
	 */
    public void setSndId(String sndId) {
        this.sndId = sndId;
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
	 * @param cgorRcvrTpCd
	 */
    public void setCgorRcvrTpCd(String cgorRcvrTpCd) {
        this.cgorRcvrTpCd = cgorRcvrTpCd;
    }

    /**
	 * Column Info
	 * @param sndRtyKnt
	 */
    public void setSndRtyKnt(String sndRtyKnt) {
        this.sndRtyKnt = sndRtyKnt;
    }

    /**
	 * Column Info
	 * @param frtArrFlg
	 */
    public void setFrtArrFlg(String frtArrFlg) {
        this.frtArrFlg = frtArrFlg;
    }

    /**
	 * Column Info
	 * @param bkgNtcSndRsltCd
	 */
    public void setBkgNtcSndRsltCd(String bkgNtcSndRsltCd) {
        this.bkgNtcSndRsltCd = bkgNtcSndRsltCd;
    }

    public String getFaxNtcSndRsltMsg() {
        return faxNtcSndRsltMsg;
    }

    public void setFaxNtcSndRsltMsg(String faxNtcSndRsltMsg) {
        this.faxNtcSndRsltMsg = faxNtcSndRsltMsg;
    }

    public void setHisUiNm(String hisUiNm) {
        this.hisUiNm = hisUiNm;
    }

    public String getHisUiNm() {
        return this.hisUiNm;
    }

    public void setPrnrSubLnkCd(String prnrSubLnkCd) {
        this.prnrSubLnkCd = prnrSubLnkCd;
    }

    public String getPrnrSubLnkCd() {
        return this.prnrSubLnkCd;
    }

    public void setCntrSltNoCtnt(String cntrSltNoCtnt) {
        this.cntrSltNoCtnt = cntrSltNoCtnt;
    }

    public String getCntrSltNoCtnt() {
        return this.cntrSltNoCtnt;
    }
    
	/**
	 * Column Info
	 * @param emlCtnt
	 */
	public void setEmlCtnt(String emlCtnt) {
		this.emlCtnt = emlCtnt;
	}

    /**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
    public void fromRequest(HttpServletRequest request) {
        setTmlNtcSndStsCd(JSPUtil.getParameter(request, "tml_ntc_snd_sts_cd", ""));
        setSndRqstDt(JSPUtil.getParameter(request, "snd_rqst_dt", ""));
        setCustCntcTpCd(JSPUtil.getParameter(request, "cust_cntc_tp_cd", ""));
        setSndRqstGdt(JSPUtil.getParameter(request, "snd_rqst_gdt", ""));
        setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
        setSndDt(JSPUtil.getParameter(request, "snd_dt", ""));
        setDpHdnFlg(JSPUtil.getParameter(request, "dp_hdn_flg", ""));
        setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
        setAgnCd(JSPUtil.getParameter(request, "agn_cd", ""));
        setNtcViaCd(JSPUtil.getParameter(request, "ntc_via_cd", ""));
        setFrtPpdFlg(JSPUtil.getParameter(request, "frt_ppd_flg", ""));
        setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
        setNtcEml(JSPUtil.getParameter(request, "ntc_eml", ""));
        setFrtCltFlg(JSPUtil.getParameter(request, "frt_clt_flg", ""));
        setCgorStsCd(JSPUtil.getParameter(request, "cgor_sts_cd", ""));
        setNtcFaxNo(JSPUtil.getParameter(request, "ntc_fax_no", ""));
        setHisSeq(JSPUtil.getParameter(request, "his_seq", ""));
        setBkgCustTpCd(JSPUtil.getParameter(request, "bkg_cust_tp_cd", ""));
        setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
        setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
        setCustCntcAmdFlg(JSPUtil.getParameter(request, "cust_cntc_amd_flg", ""));
        setNtcFomCd(JSPUtil.getParameter(request, "ntc_fom_cd", ""));
        setEsvcGrpCd(JSPUtil.getParameter(request, "esvc_grp_cd", ""));
        setNtcKndCd(JSPUtil.getParameter(request, "ntc_knd_cd", ""));
        setSndOfcCd(JSPUtil.getParameter(request, "snd_ofc_cd", ""));
        setFrtAllFlg(JSPUtil.getParameter(request, "frt_all_flg", ""));
        setSndGdt(JSPUtil.getParameter(request, "snd_gdt", ""));
        setEdiId(JSPUtil.getParameter(request, "edi_id", ""));
        setNtcSeq(JSPUtil.getParameter(request, "ntc_seq", ""));
        setFrtHdnFlg(JSPUtil.getParameter(request, "frt_hdn_flg", ""));
        setFrtChgFlg(JSPUtil.getParameter(request, "frt_chg_flg", ""));
        setDoEdiTpCd(JSPUtil.getParameter(request, "do_edi_tp_cd", ""));
        setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
        setSndUsrId(JSPUtil.getParameter(request, "snd_usr_id", ""));
        setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
        setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
        setSndId(JSPUtil.getParameter(request, "snd_id", ""));
        setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
        setCgorRcvrTpCd(JSPUtil.getParameter(request, "cgor_rcvr_tp_cd", ""));
        setSndRtyKnt(JSPUtil.getParameter(request, "snd_rty_knt", ""));
        setFrtArrFlg(JSPUtil.getParameter(request, "frt_arr_flg", ""));
        setBkgNtcSndRsltCd(JSPUtil.getParameter(request, "bkg_ntc_snd_rslt_cd", ""));
        setFaxNtcSndRsltMsg(JSPUtil.getParameter(request, "fax_ntc_snd_rslt_msg", ""));
        setPrnrSubLnkCd(JSPUtil.getParameter(request, "prnr_sub_lnk_cd", ""));
        setCntrSltNoCtnt(JSPUtil.getParameter(request, "cntr_slt_no_ctnt", ""));
        setEmlCtnt(JSPUtil.getParameter(request, "eml_ctnt", ""));
    }

    /**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgNtcHisVO[]
	 */
    public BkgNtcHisVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgNtcHisVO[]
	 */
    public BkgNtcHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        BkgNtcHisVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] tmlNtcSndStsCd = (JSPUtil.getParameter(request, prefix + "tml_ntc_snd_sts_cd", length));
            String[] sndRqstDt = (JSPUtil.getParameter(request, prefix + "snd_rqst_dt", length));
            String[] custCntcTpCd = (JSPUtil.getParameter(request, prefix + "cust_cntc_tp_cd", length));
            String[] sndRqstGdt = (JSPUtil.getParameter(request, prefix + "snd_rqst_gdt", length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
            String[] sndDt = (JSPUtil.getParameter(request, prefix + "snd_dt", length));
            String[] dpHdnFlg = (JSPUtil.getParameter(request, prefix + "dp_hdn_flg", length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
            String[] agnCd = (JSPUtil.getParameter(request, prefix + "agn_cd", length));
            String[] ntcViaCd = (JSPUtil.getParameter(request, prefix + "ntc_via_cd", length));
            String[] frtPpdFlg = (JSPUtil.getParameter(request, prefix + "frt_ppd_flg", length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
            String[] ntcEml = (JSPUtil.getParameter(request, prefix + "ntc_eml", length));
            String[] frtCltFlg = (JSPUtil.getParameter(request, prefix + "frt_clt_flg", length));
            String[] cgorStsCd = (JSPUtil.getParameter(request, prefix + "cgor_sts_cd", length));
            String[] ntcFaxNo = (JSPUtil.getParameter(request, prefix + "ntc_fax_no", length));
            String[] hisSeq = (JSPUtil.getParameter(request, prefix + "his_seq", length));
            String[] bkgCustTpCd = (JSPUtil.getParameter(request, prefix + "bkg_cust_tp_cd", length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
            String[] custCntcAmdFlg = (JSPUtil.getParameter(request, prefix + "cust_cntc_amd_flg", length));
            String[] ntcFomCd = (JSPUtil.getParameter(request, prefix + "ntc_fom_cd", length));
            String[] esvcGrpCd = (JSPUtil.getParameter(request, prefix + "esvc_grp_cd", length));
            String[] ntcKndCd = (JSPUtil.getParameter(request, prefix + "ntc_knd_cd", length));
            String[] sndOfcCd = (JSPUtil.getParameter(request, prefix + "snd_ofc_cd", length));
            String[] frtAllFlg = (JSPUtil.getParameter(request, prefix + "frt_all_flg", length));
            String[] sndGdt = (JSPUtil.getParameter(request, prefix + "snd_gdt", length));
            String[] ediId = (JSPUtil.getParameter(request, prefix + "edi_id", length));
            String[] ntcSeq = (JSPUtil.getParameter(request, prefix + "ntc_seq", length));
            String[] frtHdnFlg = (JSPUtil.getParameter(request, prefix + "frt_hdn_flg", length));
            String[] frtChgFlg = (JSPUtil.getParameter(request, prefix + "frt_chg_flg", length));
            String[] doEdiTpCd = (JSPUtil.getParameter(request, prefix + "do_edi_tp_cd", length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
            String[] sndUsrId = (JSPUtil.getParameter(request, prefix + "snd_usr_id", length));
            String[] bkgNo = (JSPUtil.getParameter(request, prefix + "bkg_no", length));
            String[] diffRmk = (JSPUtil.getParameter(request, prefix + "diff_rmk", length));
            String[] sndId = (JSPUtil.getParameter(request, prefix + "snd_id", length));
            String[] cntrNo = (JSPUtil.getParameter(request, prefix + "cntr_no", length));
            String[] cgorRcvrTpCd = (JSPUtil.getParameter(request, prefix + "cgor_rcvr_tp_cd", length));
            String[] sndRtyKnt = (JSPUtil.getParameter(request, prefix + "snd_rty_knt", length));
            String[] frtArrFlg = (JSPUtil.getParameter(request, prefix + "frt_arr_flg", length));
            String[] bkgNtcSndRsltCd = (JSPUtil.getParameter(request, prefix + "bkg_ntc_snd_rslt_cd", length));
            String[] faxNtcSndRsltMsg = (JSPUtil.getParameter(request, prefix + "fax_ntc_snd_rslt_msg", length));
            String[] hisUiNm = (JSPUtil.getParameter(request, prefix + "his_ui_nm", length));
            String[] prnrSubLnkCd = (JSPUtil.getParameter(request, prefix + "prnr_sub_lnk_cd", length));
            String[] cntrSltNoCtnt = (JSPUtil.getParameter(request, prefix + "cntr_slt_no_ctnt", length));
            String[] emlCtnt = (JSPUtil.getParameter(request, prefix	+ "eml_ctnt", length));
	    	/* Add a field line, do not delete */
            for (int i = 0; i < length; i++) {
                model = new BkgNtcHisVO();
                if (tmlNtcSndStsCd[i] != null)
                    model.setTmlNtcSndStsCd(tmlNtcSndStsCd[i]);
                if (sndRqstDt[i] != null)
                    model.setSndRqstDt(sndRqstDt[i]);
                if (custCntcTpCd[i] != null)
                    model.setCustCntcTpCd(custCntcTpCd[i]);
                if (sndRqstGdt[i] != null)
                    model.setSndRqstGdt(sndRqstGdt[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (sndDt[i] != null)
                    model.setSndDt(sndDt[i]);
                if (dpHdnFlg[i] != null)
                    model.setDpHdnFlg(dpHdnFlg[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (agnCd[i] != null)
                    model.setAgnCd(agnCd[i]);
                if (ntcViaCd[i] != null)
                    model.setNtcViaCd(ntcViaCd[i]);
                if (frtPpdFlg[i] != null)
                    model.setFrtPpdFlg(frtPpdFlg[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (ntcEml[i] != null)
                    model.setNtcEml(ntcEml[i]);
                if (frtCltFlg[i] != null)
                    model.setFrtCltFlg(frtCltFlg[i]);
                if (cgorStsCd[i] != null)
                    model.setCgorStsCd(cgorStsCd[i]);
                if (ntcFaxNo[i] != null)
                    model.setNtcFaxNo(ntcFaxNo[i]);
                if (hisSeq[i] != null)
                    model.setHisSeq(hisSeq[i]);
                if (bkgCustTpCd[i] != null)
                    model.setBkgCustTpCd(bkgCustTpCd[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (custCntcAmdFlg[i] != null)
                    model.setCustCntcAmdFlg(custCntcAmdFlg[i]);
                if (ntcFomCd[i] != null)
                    model.setNtcFomCd(ntcFomCd[i]);
                if (esvcGrpCd[i] != null)
                    model.setEsvcGrpCd(esvcGrpCd[i]);
                if (ntcKndCd[i] != null)
                    model.setNtcKndCd(ntcKndCd[i]);
                if (sndOfcCd[i] != null)
                    model.setSndOfcCd(sndOfcCd[i]);
                if (frtAllFlg[i] != null)
                    model.setFrtAllFlg(frtAllFlg[i]);
                if (sndGdt[i] != null)
                    model.setSndGdt(sndGdt[i]);
                if (ediId[i] != null)
                    model.setEdiId(ediId[i]);
                if (ntcSeq[i] != null)
                    model.setNtcSeq(ntcSeq[i]);
                if (frtHdnFlg[i] != null)
                    model.setFrtHdnFlg(frtHdnFlg[i]);
                if (frtChgFlg[i] != null)
                    model.setFrtChgFlg(frtChgFlg[i]);
                if (doEdiTpCd[i] != null)
                    model.setDoEdiTpCd(doEdiTpCd[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (sndUsrId[i] != null)
                    model.setSndUsrId(sndUsrId[i]);
                if (bkgNo[i] != null)
                    model.setBkgNo(bkgNo[i]);
                if (diffRmk[i] != null)
                    model.setDiffRmk(diffRmk[i]);
                if (sndId[i] != null)
                    model.setSndId(sndId[i]);
                if (cntrNo[i] != null)
                    model.setCntrNo(cntrNo[i]);
                if (cgorRcvrTpCd[i] != null)
                    model.setCgorRcvrTpCd(cgorRcvrTpCd[i]);
                if (sndRtyKnt[i] != null)
                    model.setSndRtyKnt(sndRtyKnt[i]);
                if (frtArrFlg[i] != null)
                    model.setFrtArrFlg(frtArrFlg[i]);
                if (bkgNtcSndRsltCd[i] != null)
                    model.setBkgNtcSndRsltCd(bkgNtcSndRsltCd[i]);
                if (faxNtcSndRsltMsg[i] != null)
                    model.setFaxNtcSndRsltMsg(faxNtcSndRsltMsg[i]);
                if (hisUiNm[i] != null)
                    model.setHisUiNm(hisUiNm[i]);
                if (prnrSubLnkCd[i] != null)
                    model.setPrnrSubLnkCd(prnrSubLnkCd[i]);
                if (cntrSltNoCtnt[i] != null) 
		    		model.setCntrSltNoCtnt(cntrSltNoCtnt[i]);
				if (emlCtnt[i] != null)
					model.setEmlCtnt(emlCtnt[i]);
				/* Add a Method line, do not delete */
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getBkgNtcHisVOs();
    }

    /**
	 * VO 배열을 반환
	 * @return BkgNtcHisVO[]
	 */
    public BkgNtcHisVO[] getBkgNtcHisVOs() {
        BkgNtcHisVO[] vos = (BkgNtcHisVO[]) models.toArray(new BkgNtcHisVO[models.size()]);
        return vos;
    }

    /**
	 * VO Class의 내용을 String으로 변환
	 */
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    /**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
    public void unDataFormat() {
        this.tmlNtcSndStsCd = this.tmlNtcSndStsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.sndRqstDt = this.sndRqstDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.custCntcTpCd = this.custCntcTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.sndRqstGdt = this.sndRqstGdt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.sndDt = this.sndDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.dpHdnFlg = this.dpHdnFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.agnCd = this.agnCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ntcViaCd = this.ntcViaCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.frtPpdFlg = this.frtPpdFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ntcEml = this.ntcEml.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.frtCltFlg = this.frtCltFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cgorStsCd = this.cgorStsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ntcFaxNo = this.ntcFaxNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hisSeq = this.hisSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgCustTpCd = this.bkgCustTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.custCntcAmdFlg = this.custCntcAmdFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ntcFomCd = this.ntcFomCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.esvcGrpCd = this.esvcGrpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ntcKndCd = this.ntcKndCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.sndOfcCd = this.sndOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.frtAllFlg = this.frtAllFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.sndGdt = this.sndGdt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ediId = this.ediId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ntcSeq = this.ntcSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.frtHdnFlg = this.frtHdnFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.frtChgFlg = this.frtChgFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.doEdiTpCd = this.doEdiTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.sndUsrId = this.sndUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgNo = this.bkgNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.diffRmk = this.diffRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.sndId = this.sndId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cntrNo = this.cntrNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cgorRcvrTpCd = this.cgorRcvrTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.sndRtyKnt = this.sndRtyKnt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.frtArrFlg = this.frtArrFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgNtcSndRsltCd = this.bkgNtcSndRsltCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.faxNtcSndRsltMsg = this.faxNtcSndRsltMsg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hisUiNm = this.hisUiNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.prnrSubLnkCd = this.prnrSubLnkCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cntrSltNoCtnt = this.cntrSltNoCtnt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.emlCtnt = this.emlCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
