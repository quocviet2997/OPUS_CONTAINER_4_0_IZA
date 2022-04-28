/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : PsoChargeVO.java
*@FileTitle : PsoChargeVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.04.08
*@LastModifier : 정명훈
*@LastVersion : 1.0
* 2010.04.08 정명훈 
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
 * @author 정명훈
 * @since J2EE 1.6
 * @see AbstractValueObject
 */
public class PsoChargeVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L;

    private Collection<PsoChargeVO> models = new ArrayList<PsoChargeVO>();

    /* Column Info */
    private String currCd = null;
    
    /* Column Info */
    private String csrNo = null;
    
    /* Column Info */
    private String glDt = null;

    /* Column Info */
    private String ppdNo = null;

    /* Column Info */
    private String ppdDtrbNo = null;

    /* Column Info */
    private String ppdAplyAmt = null;

    /* Column Info */
    private String ppdGlDt = null;

    /* Column Info */
    private String ownrVndrSeq = null;

    /* Column Info */
    private String ppayAplyFlg = null;

    /* Column Info */
    private String psoTrnsSlpCtnt = null;

    /* Column Info */
    private String soSeq = null;

    /* Column Info */
    private String creDt = null;

    /* Column Info */
    private String invLoclAmt = null;

    /* Column Info */
    private String loclTaxAmt = null;

    /* Column Info */
    private String loclWhldTaxAmt = null;

    /* Column Info */
    private String issCtyCd = null;

    /* Page Number */
    private String pagerows = null;

    /* Column Info */
    private String apEffDt = null;

    /* Column Info */
    private String issDt = null;

    /* VO Data Value( C:Creation, U:Update, D:Delete ) */
    private String ibflag = null;

    /* Column Info */
    private String effDt = null;

    /* Column Info */
    private String dueDt = null;

    /* Column Info */
    private String updUsrId = null;

    /* Column Info */
    private String invOfcCd = null;

    /* Column Info */
    private String invRgstNo = null;

    /* Column Info */
    private String updDt = null;

    /* Column Info */
    private String costOfcCd = null;

    /* Column Info */
    private String acptDt = null;

    /* Column Info */
    private String loclNetAmt = null;

    /* Column Info */
    private String payTermDys = null;

    /* Column Info */
    private String ttlUsdAmt = null;

    /* Column Info */
    private String invNo = null;

    /* Column Info */
    private String creUsrId = null;

    /* Column Info */
    private String ttlLoclAmt = null;

    /* Column Info */
    private String ydCd = null;

    /* Column Info */
    private String vndrSeq = null;

    /* Column Info */
    private String loclDdctAmt = null;

    /* Column Info */
    private String psoChgStsCd = null;

    /* Column Info */
    private String existDtlYn = null;

    /* Column Info */
    private String steGoveGdsSvcTaxAmt = null;

    /* Column Info */
    private String centGoveGdsSvcTaxAmt = null;

    /* Column Info */
    private String intgGoveGdsSvcTaxAmt = null;

    /* Column Info */
    private String cessAmt = null;

    /* Column Info */
    private String idaWhldTaxAmt = null;

    /* Column Info */
    private String idaGstTaxDdctSrcAmt = null;

    /* Column Info */
    private String svcAcctgCd = null;

    /*	테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new HashMap<String, String>();

    /*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new HashMap<String, String>();

    public PsoChargeVO() {
    }

    public PsoChargeVO(String ibflag, String pagerows, String issCtyCd, String soSeq, String ydCd, String vndrSeq, String costOfcCd, String invOfcCd, String invNo, String currCd, String csrNo, String glDt, String ppdNo, String ppdDtrbNo, String ppdAplyAmt,String ppdGlDt, String ppayAplyFlg, String ownrVndrSeq, String ttlLoclAmt, String ttlUsdAmt, String invLoclAmt, String loclTaxAmt, String loclNetAmt, String loclDdctAmt, String loclWhldTaxAmt, String acptDt, String issDt, String effDt, String payTermDys, String dueDt, String apEffDt, String psoChgStsCd, String invRgstNo, String psoTrnsSlpCtnt, String creUsrId, String creDt, String updUsrId, String updDt, String existDtlYn, String steGoveGdsSvcTaxAmt, String centGoveGdsSvcTaxAmt, String intgGoveGdsSvcTaxAmt, String cessAmt, String idaWhldTaxAmt, String idaGstTaxDdctSrcAmt, String svcAcctgCd) {
        this.currCd = currCd;
        this.csrNo = csrNo;
        this.glDt = glDt;
        this.ppdNo = ppdNo;
        this.ppdDtrbNo = ppdDtrbNo;
        this.ppdAplyAmt = ppdAplyAmt;
        this.ppdGlDt = ppdGlDt;
        this.ppayAplyFlg = ppayAplyFlg;
        this.ownrVndrSeq = ownrVndrSeq;
        this.psoTrnsSlpCtnt = psoTrnsSlpCtnt;
        this.soSeq = soSeq;
        this.creDt = creDt;
        this.invLoclAmt = invLoclAmt;
        this.loclTaxAmt = loclTaxAmt;
        this.loclWhldTaxAmt = loclWhldTaxAmt;
        this.issCtyCd = issCtyCd;
        this.pagerows = pagerows;
        this.apEffDt = apEffDt;
        this.issDt = issDt;
        this.ibflag = ibflag;
        this.effDt = effDt;
        this.dueDt = dueDt;
        this.updUsrId = updUsrId;
        this.invOfcCd = invOfcCd;
        this.invRgstNo = invRgstNo;
        this.updDt = updDt;
        this.costOfcCd = costOfcCd;
        this.acptDt = acptDt;
        this.loclNetAmt = loclNetAmt;
        this.payTermDys = payTermDys;
        this.ttlUsdAmt = ttlUsdAmt;
        this.invNo = invNo;
        this.creUsrId = creUsrId;
        this.ttlLoclAmt = ttlLoclAmt;
        this.ydCd = ydCd;
        this.vndrSeq = vndrSeq;
        this.loclDdctAmt = loclDdctAmt;
        this.psoChgStsCd = psoChgStsCd;
        this.existDtlYn = existDtlYn;
        this.steGoveGdsSvcTaxAmt = steGoveGdsSvcTaxAmt;
        this.centGoveGdsSvcTaxAmt = centGoveGdsSvcTaxAmt;
        this.intgGoveGdsSvcTaxAmt = intgGoveGdsSvcTaxAmt;
        this.cessAmt = cessAmt;
        this.idaWhldTaxAmt = idaWhldTaxAmt;
        this.idaGstTaxDdctSrcAmt = idaGstTaxDdctSrcAmt;
        this.svcAcctgCd = svcAcctgCd;
    }

    /**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("curr_cd", getCurrCd());
        this.hashColumns.put("csr_no", getCsrNo());
        this.hashColumns.put("gl_dt", getGlDt());
        this.hashColumns.put("ppd_no", getPpdNo());
        this.hashColumns.put("ppd_dtrb_no", getPpdDtrbNo());
        this.hashColumns.put("ppd_aply_amt", getPpdAplyAmt());
        this.hashColumns.put("ppd_gl_dt", getPpdGlDt());
        this.hashColumns.put("ppay_aply_flg", getPpayAplyFlg());
        this.hashColumns.put("ownr_vndr_seq", getOwnrVndrSeq());
        this.hashColumns.put("pso_trns_slp_ctnt", getPsoTrnsSlpCtnt());
        this.hashColumns.put("so_seq", getSoSeq());
        this.hashColumns.put("cre_dt", getCreDt());
        this.hashColumns.put("inv_locl_amt", getInvLoclAmt());
        this.hashColumns.put("locl_tax_amt", getLoclTaxAmt());
        this.hashColumns.put("locl_whld_tax_amt", getLoclWhldTaxAmt());
        this.hashColumns.put("iss_cty_cd", getIssCtyCd());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("ap_eff_dt", getApEffDt());
        this.hashColumns.put("iss_dt", getIssDt());
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("eff_dt", getEffDt());
        this.hashColumns.put("due_dt", getDueDt());
        this.hashColumns.put("upd_usr_id", getUpdUsrId());
        this.hashColumns.put("inv_ofc_cd", getInvOfcCd());
        this.hashColumns.put("inv_rgst_no", getInvRgstNo());
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("cost_ofc_cd", getCostOfcCd());
        this.hashColumns.put("acpt_dt", getAcptDt());
        this.hashColumns.put("locl_net_amt", getLoclNetAmt());
        this.hashColumns.put("pay_term_dys", getPayTermDys());
        this.hashColumns.put("ttl_usd_amt", getTtlUsdAmt());
        this.hashColumns.put("inv_no", getInvNo());
        this.hashColumns.put("cre_usr_id", getCreUsrId());
        this.hashColumns.put("ttl_locl_amt", getTtlLoclAmt());
        this.hashColumns.put("yd_cd", getYdCd());
        this.hashColumns.put("vndr_seq", getVndrSeq());
        this.hashColumns.put("locl_ddct_amt", getLoclDdctAmt());
        this.hashColumns.put("pso_chg_sts_cd", getPsoChgStsCd());
        this.hashColumns.put("exist_dtl_yn", getExistDtlYn());
        this.hashColumns.put("ste_gove_gds_svc_tax_amt", getSteGoveGdsSvcTaxAmt());
        this.hashColumns.put("cent_gove_gds_svc_tax_amt", getCentGoveGdsSvcTaxAmt());
        this.hashColumns.put("intg_gove_gds_svc_tax_amt", getIntgGoveGdsSvcTaxAmt());
        this.hashColumns.put("cess_amt", getCessAmt());
        this.hashColumns.put("ida_whld_tax_amt", getIdaWhldTaxAmt());
        this.hashColumns.put("ida_gst_tax_ddct_src_amt", getIdaGstTaxDdctSrcAmt());
        this.hashColumns.put("svc_acctg_cd", getSvcAcctgCd());
        return this.hashColumns;
    }

    /**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("curr_cd", "currCd");
        this.hashFields.put("csr_no", "csrNo");
        this.hashFields.put("gl_dt", "glDt");
        this.hashFields.put("ppd_no", "ppdNo");
        this.hashFields.put("ppd_dtrb_no", "ppdDtrbNo");
        this.hashFields.put("ppd_aply_amt", "ppdAplyAmt");
        this.hashFields.put("ppd_gl_dt", "ppdGlDt");
        this.hashFields.put("ppay_aply_flg", "ppayAplyFlg");
        this.hashFields.put("ownr_vndr_seq", "ownrVndrSeq");
        this.hashFields.put("pso_trns_slp_ctnt", "psoTrnsSlpCtnt");
        this.hashFields.put("so_seq", "soSeq");
        this.hashFields.put("cre_dt", "creDt");
        this.hashFields.put("inv_locl_amt", "invLoclAmt");
        this.hashFields.put("locl_tax_amt", "loclTaxAmt");
        this.hashFields.put("locl_whld_tax_amt", "loclWhldTaxAmt");
        this.hashFields.put("iss_cty_cd", "issCtyCd");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("ap_eff_dt", "apEffDt");
        this.hashFields.put("iss_dt", "issDt");
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("eff_dt", "effDt");
        this.hashFields.put("due_dt", "dueDt");
        this.hashFields.put("upd_usr_id", "updUsrId");
        this.hashFields.put("inv_ofc_cd", "invOfcCd");
        this.hashFields.put("inv_rgst_no", "invRgstNo");
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("cost_ofc_cd", "costOfcCd");
        this.hashFields.put("acpt_dt", "acptDt");
        this.hashFields.put("locl_net_amt", "loclNetAmt");
        this.hashFields.put("pay_term_dys", "payTermDys");
        this.hashFields.put("ttl_usd_amt", "ttlUsdAmt");
        this.hashFields.put("inv_no", "invNo");
        this.hashFields.put("cre_usr_id", "creUsrId");
        this.hashFields.put("ttl_locl_amt", "ttlLoclAmt");
        this.hashFields.put("yd_cd", "ydCd");
        this.hashFields.put("vndr_seq", "vndrSeq");
        this.hashFields.put("locl_ddct_amt", "loclDdctAmt");
        this.hashFields.put("pso_chg_sts_cd", "psoChgStsCd");
        this.hashFields.put("exist_dtl_yn", "existDtlYn");
        this.hashFields.put("ste_gove_gds_svc_tax_amt", "steGoveGdsSvcTaxAmt");
        this.hashFields.put("cent_gove_gds_svc_tax_amt", "centGoveGdsSvcTaxAmt");
        this.hashFields.put("intg_gove_gds_svc_tax_amt", "intgGoveGdsSvcTaxAmt");
        this.hashFields.put("cess_amt", "cessAmt");
        this.hashFields.put("ida_whld_tax_amt", "idaWhldTaxAmt");
        this.hashFields.put("ida_gst_tax_ddct_src_amt", "idaGstTaxDdctSrcAmt");
        this.hashFields.put("svc_acctg_cd", "svcAcctgCd");
        return this.hashFields;
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
	 * @return csrNo
	 */
    public String getCsrNo() {
        return this.csrNo;
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
	 * @return ppdNo
	 */
    public String getPpdNo() {
        return this.ppdNo;
    }
    
    /**
	 * Column Info
	 * @return ppdDtrbNo
	 */
    public String getPpdDtrbNo() {
        return this.ppdDtrbNo;
    }
    
    /**
	 * Column Info
	 * @return ppdAplyAmt
	 */
    public String getPpdAplyAmt() {
        return this.ppdAplyAmt;
    }
    
    /**
	 * Column Info
	 * @return ppdGlDt
	 */
    public String getPpdGlDt() {
        return this.ppdGlDt;
    }
    
    /**
	 * Column Info
	 * @return ppayAplyFlg
	 */
    public String getPpayAplyFlg() {
        return this.ppayAplyFlg;
    }
    
    /**
	 * Column Info
	 * @return ownrVndrSeq
	 */
    public String getOwnrVndrSeq() {
        return this.ownrVndrSeq;
    }
    
    
    /**
	 * Column Info
	 * @return psoTrnsSlpCtnt
	 */
    public String getPsoTrnsSlpCtnt() {
        return this.psoTrnsSlpCtnt;
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
	 * @return creDt
	 */
    public String getCreDt() {
        return this.creDt;
    }

    /**
	 * Column Info
	 * @return invLoclAmt
	 */
    public String getInvLoclAmt() {
        return this.invLoclAmt;
    }

    /**
	 * Column Info
	 * @return loclTaxAmt
	 */
    public String getLoclTaxAmt() {
        return this.loclTaxAmt;
    }

    /**
	 * Column Info
	 * @return loclWhldTaxAmt
	 */
    public String getLoclWhldTaxAmt() {
        return this.loclWhldTaxAmt;
    }

    /**
	 * Column Info
	 * @return issCtyCd
	 */
    public String getIssCtyCd() {
        return this.issCtyCd;
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
	 * @return apEffDt
	 */
    public String getApEffDt() {
        return this.apEffDt;
    }

    /**
	 * Column Info
	 * @return issDt
	 */
    public String getIssDt() {
        return this.issDt;
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
	 * @return effDt
	 */
    public String getEffDt() {
        return this.effDt;
    }

    /**
	 * Column Info
	 * @return dueDt
	 */
    public String getDueDt() {
        return this.dueDt;
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
	 * @return invRgstNo
	 */
    public String getInvRgstNo() {
        return this.invRgstNo;
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
	 * @return costOfcCd
	 */
    public String getCostOfcCd() {
        return this.costOfcCd;
    }

    /**
	 * Column Info
	 * @return acptDt
	 */
    public String getAcptDt() {
        return this.acptDt;
    }

    /**
	 * Column Info
	 * @return loclNetAmt
	 */
    public String getLoclNetAmt() {
        return this.loclNetAmt;
    }

    /**
	 * Column Info
	 * @return payTermDys
	 */
    public String getPayTermDys() {
        return this.payTermDys;
    }

    /**
	 * Column Info
	 * @return ttlUsdAmt
	 */
    public String getTtlUsdAmt() {
        return this.ttlUsdAmt;
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
	 * @return creUsrId
	 */
    public String getCreUsrId() {
        return this.creUsrId;
    }

    /**
	 * Column Info
	 * @return ttlLoclAmt
	 */
    public String getTtlLoclAmt() {
        return this.ttlLoclAmt;
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
	 * @return vndrSeq
	 */
    public String getVndrSeq() {
        return this.vndrSeq;
    }

    /**
	 * Column Info
	 * @return loclDdctAmt
	 */
    public String getLoclDdctAmt() {
        return this.loclDdctAmt;
    }

    /**
	 * Column Info
	 * @return psoChgStsCd
	 */
    public String getPsoChgStsCd() {
        return this.psoChgStsCd;
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
	 * @param csrNo
	 */
    public void setCsrNo(String csrNo) {
        this.csrNo = csrNo;
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
	 * @param ppdNo
	 */
    public void setPpdNo(String ppdNo) {
        this.ppdNo = ppdNo;
    }
    
    /**
	 * Column Info
	 * @param ppdDtrbNo
	 */
    public void setPpdDtrbNo(String ppdDtrbNo) {
        this.ppdDtrbNo = ppdDtrbNo;
    }
    
    /**
	 * Column Info
	 * @param ppdAplyAmt
	 */
    public void setPpdAplyAmt(String ppdAplyAmt) {
        this.ppdAplyAmt = ppdAplyAmt;
    }
    
    /**
	 * Column Info
	 * @param ppdGlDt
	 */
    public void setPpdGlDt(String ppdGlDt) {
        this.ppdGlDt = ppdGlDt;
    }
    
    /**
	 * Column Info
	 * @param ppayAplyFlg
	 */
    public void setPpayAplyFlg(String ppayAplyFlg) {
        this.ppayAplyFlg = ppayAplyFlg;
    }
    
    /**
	 * Column Info
	 * @param ownrVndrSeq
	 */
    public void setOwnrVndrSeq(String ownrVndrSeq) {
        this.ownrVndrSeq = ownrVndrSeq;
    }
    

    /**
	 * Column Info
	 * @param psoTrnsSlpCtnt
	 */
    public void setPsoTrnsSlpCtnt(String psoTrnsSlpCtnt) {
        this.psoTrnsSlpCtnt = psoTrnsSlpCtnt;
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
	 * @param creDt
	 */
    public void setCreDt(String creDt) {
        this.creDt = creDt;
    }

    /**
	 * Column Info
	 * @param invLoclAmt
	 */
    public void setInvLoclAmt(String invLoclAmt) {
        this.invLoclAmt = invLoclAmt;
    }

    /**
	 * Column Info
	 * @param loclTaxAmt
	 */
    public void setLoclTaxAmt(String loclTaxAmt) {
        this.loclTaxAmt = loclTaxAmt;
    }

    /**
	 * Column Info
	 * @param loclWhldTaxAmt
	 */
    public void setLoclWhldTaxAmt(String loclWhldTaxAmt) {
        this.loclWhldTaxAmt = loclWhldTaxAmt;
    }

    /**
	 * Column Info
	 * @param issCtyCd
	 */
    public void setIssCtyCd(String issCtyCd) {
        this.issCtyCd = issCtyCd;
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
	 * @param apEffDt
	 */
    public void setApEffDt(String apEffDt) {
        this.apEffDt = apEffDt;
    }

    /**
	 * Column Info
	 * @param issDt
	 */
    public void setIssDt(String issDt) {
        this.issDt = issDt;
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
	 * @param effDt
	 */
    public void setEffDt(String effDt) {
        this.effDt = effDt;
    }

    /**
	 * Column Info
	 * @param dueDt
	 */
    public void setDueDt(String dueDt) {
        this.dueDt = dueDt;
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
	 * @param invRgstNo
	 */
    public void setInvRgstNo(String invRgstNo) {
        this.invRgstNo = invRgstNo;
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
	 * @param costOfcCd
	 */
    public void setCostOfcCd(String costOfcCd) {
        this.costOfcCd = costOfcCd;
    }

    /**
	 * Column Info
	 * @param acptDt
	 */
    public void setAcptDt(String acptDt) {
        this.acptDt = acptDt;
    }

    /**
	 * Column Info
	 * @param loclNetAmt
	 */
    public void setLoclNetAmt(String loclNetAmt) {
        this.loclNetAmt = loclNetAmt;
    }

    /**
	 * Column Info
	 * @param payTermDys
	 */
    public void setPayTermDys(String payTermDys) {
        this.payTermDys = payTermDys;
    }

    /**
	 * Column Info
	 * @param ttlUsdAmt
	 */
    public void setTtlUsdAmt(String ttlUsdAmt) {
        this.ttlUsdAmt = ttlUsdAmt;
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
	 * @param creUsrId
	 */
    public void setCreUsrId(String creUsrId) {
        this.creUsrId = creUsrId;
    }

    /**
	 * Column Info
	 * @param ttlLoclAmt
	 */
    public void setTtlLoclAmt(String ttlLoclAmt) {
        this.ttlLoclAmt = ttlLoclAmt;
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
	 * @param vndrSeq
	 */
    public void setVndrSeq(String vndrSeq) {
        this.vndrSeq = vndrSeq;
    }

    /**
	 * Column Info
	 * @param loclDdctAmt
	 */
    public void setLoclDdctAmt(String loclDdctAmt) {
        this.loclDdctAmt = loclDdctAmt;
    }

    /**
	 * Column Info
	 * @param psoChgStsCd
	 */
    public void setPsoChgStsCd(String psoChgStsCd) {
        this.psoChgStsCd = psoChgStsCd;
    }

    public void setExistDtlYn(String existDtlYn) {
        this.existDtlYn = existDtlYn;
    }

    public String getExistDtlYn() {
        return this.existDtlYn;
    }

    public void setSteGoveGdsSvcTaxAmt(String steGoveGdsSvcTaxAmt) {
        this.steGoveGdsSvcTaxAmt = steGoveGdsSvcTaxAmt;
    }

    public String getSteGoveGdsSvcTaxAmt() {
        return this.steGoveGdsSvcTaxAmt;
    }

    public void setCentGoveGdsSvcTaxAmt(String centGoveGdsSvcTaxAmt) {
        this.centGoveGdsSvcTaxAmt = centGoveGdsSvcTaxAmt;
    }

    public String getCentGoveGdsSvcTaxAmt() {
        return this.centGoveGdsSvcTaxAmt;
    }

    public void setIntgGoveGdsSvcTaxAmt(String intgGoveGdsSvcTaxAmt) {
        this.intgGoveGdsSvcTaxAmt = intgGoveGdsSvcTaxAmt;
    }

    public String getIntgGoveGdsSvcTaxAmt() {
        return this.intgGoveGdsSvcTaxAmt;
    }

    public void setCessAmt(String cessAmt) {
        this.cessAmt = cessAmt;
    }

    public String getCessAmt() {
        return this.cessAmt;
    }

    public void setIdaWhldTaxAmt(String idaWhldTaxAmt) {
        this.idaWhldTaxAmt = idaWhldTaxAmt;
    }

    public String getIdaWhldTaxAmt() {
        return this.idaWhldTaxAmt;
    }

    public void setIdaGstTaxDdctSrcAmt(String idaGstTaxDdctSrcAmt) {
        this.idaGstTaxDdctSrcAmt = idaGstTaxDdctSrcAmt;
    }

    public String getIdaGstTaxDdctSrcAmt() {
        return this.idaGstTaxDdctSrcAmt;
    }

    public void setSvcAcctgCd(String svcAcctgCd) {
        this.svcAcctgCd = svcAcctgCd;
    }

    public String getSvcAcctgCd() {
        return this.svcAcctgCd;
    }

    /**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
    public void fromRequest(HttpServletRequest request) {
        fromRequest(request, "");
    }

    /**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
    public void fromRequest(HttpServletRequest request, String prefix) {
        setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
        setCsrNo(JSPUtil.getParameter(request, prefix + "csr_no", ""));
        setGlDt(JSPUtil.getParameter(request, prefix + "gl_dt", ""));
        setPpdNo(JSPUtil.getParameter(request, prefix + "ppd_no", ""));
        setPpdDtrbNo(JSPUtil.getParameter(request, prefix + "ppd_dtrb_no", ""));
        setPpdAplyAmt(JSPUtil.getParameter(request, prefix + "ppd_aply_amt", ""));
        setPpdGlDt(JSPUtil.getParameter(request, prefix + "ppd_gl_dt", ""));
        setPpayAplyFlg(JSPUtil.getParameter(request, prefix + "ppay_aply_flg", ""));
        setOwnrVndrSeq(JSPUtil.getParameter(request, prefix + "ownr_vndr_seq", ""));
        setPsoTrnsSlpCtnt(JSPUtil.getParameter(request, prefix + "pso_trns_slp_ctnt", ""));
        setSoSeq(JSPUtil.getParameter(request, prefix + "so_seq", ""));
        setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
        setInvLoclAmt(JSPUtil.getParameter(request, prefix + "inv_locl_amt", ""));
        setLoclTaxAmt(JSPUtil.getParameter(request, prefix + "locl_tax_amt", ""));
        setLoclWhldTaxAmt(JSPUtil.getParameter(request, prefix + "locl_whld_tax_amt", ""));
        setIssCtyCd(JSPUtil.getParameter(request, prefix + "iss_cty_cd", ""));
        setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
        setApEffDt(JSPUtil.getParameter(request, prefix + "ap_eff_dt", ""));
        setIssDt(JSPUtil.getParameter(request, prefix + "iss_dt", ""));
        setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
        setEffDt(JSPUtil.getParameter(request, prefix + "eff_dt", ""));
        setDueDt(JSPUtil.getParameter(request, prefix + "due_dt", ""));
        setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
        setInvOfcCd(JSPUtil.getParameter(request, prefix + "inv_ofc_cd", ""));
        setInvRgstNo(JSPUtil.getParameter(request, prefix + "inv_rgst_no", ""));
        setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
        setCostOfcCd(JSPUtil.getParameter(request, prefix + "cost_ofc_cd", ""));
        setAcptDt(JSPUtil.getParameter(request, prefix + "acpt_dt", ""));
        setLoclNetAmt(JSPUtil.getParameter(request, prefix + "locl_net_amt", ""));
        setPayTermDys(JSPUtil.getParameter(request, prefix + "pay_term_dys", ""));
        setTtlUsdAmt(JSPUtil.getParameter(request, prefix + "ttl_usd_amt", ""));
        setInvNo(JSPUtil.getParameter(request, prefix + "inv_no", ""));
        setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
        setTtlLoclAmt(JSPUtil.getParameter(request, prefix + "ttl_locl_amt", ""));
        setYdCd(JSPUtil.getParameter(request, prefix + "yd_cd", ""));
        setVndrSeq(JSPUtil.getParameter(request, prefix + "vndr_seq", ""));
        setLoclDdctAmt(JSPUtil.getParameter(request, prefix + "locl_ddct_amt", ""));
        setPsoChgStsCd(JSPUtil.getParameter(request, prefix + "pso_chg_sts_cd", ""));
        setExistDtlYn(JSPUtil.getParameter(request, prefix + "exist_dtl_yn", ""));
        setSteGoveGdsSvcTaxAmt(JSPUtil.getParameter(request, prefix + "ste_gove_gds_svc_tax_amt", ""));
        setCentGoveGdsSvcTaxAmt(JSPUtil.getParameter(request, prefix + "cent_gove_gds_svc_tax_amt", ""));
        setIntgGoveGdsSvcTaxAmt(JSPUtil.getParameter(request, prefix + "intg_gove_gds_svc_tax_amt", ""));
        setCessAmt(JSPUtil.getParameter(request, prefix + "cess_amt", ""));
        setIdaWhldTaxAmt(JSPUtil.getParameter(request, prefix + "ida_whld_tax_amt", ""));
        setIdaGstTaxDdctSrcAmt(JSPUtil.getParameter(request, prefix + "ida_gst_tax_ddct_src_amt", ""));
        setSvcAcctgCd(JSPUtil.getParameter(request, prefix + "svc_acctg_cd", ""));
    }

    /**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PsoChargeVO[]
	 */
    public PsoChargeVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PsoChargeVO[]
	 */
    public PsoChargeVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        PsoChargeVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] currCd = (JSPUtil.getParameter(request, prefix + "curr_cd", length));
            String[] csrNo = (JSPUtil.getParameter(request, prefix + "csr_no", length));
            String[] glDt = (JSPUtil.getParameter(request, prefix + "gl_dt", length));
            String[] ppdNo = (JSPUtil.getParameter(request, prefix + "ppd_no", length));
            String[] ppdDtrbNo = (JSPUtil.getParameter(request, prefix + "ppd_dtrb_no", length));
            String[] ppdAplyAmt = (JSPUtil.getParameter(request, prefix + "ppd_aply_amt", length));
            String[] ppdGlDt = (JSPUtil.getParameter(request, prefix + "ppd_gl_dt", length));
            String[] ppayAplyFlg = (JSPUtil.getParameter(request, prefix + "ppay_aply_flg", length));
            String[] ownrVndrSeq = (JSPUtil.getParameter(request, prefix + "ownr_vndr_seq", length));
            String[] psoTrnsSlpCtnt = (JSPUtil.getParameter(request, prefix + "pso_trns_slp_ctnt", length));
            String[] soSeq = (JSPUtil.getParameter(request, prefix + "so_seq", length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
            String[] invLoclAmt = (JSPUtil.getParameter(request, prefix + "inv_locl_amt", length));
            String[] loclTaxAmt = (JSPUtil.getParameter(request, prefix + "locl_tax_amt", length));
            String[] loclWhldTaxAmt = (JSPUtil.getParameter(request, prefix + "locl_whld_tax_amt", length));
            String[] issCtyCd = (JSPUtil.getParameter(request, prefix + "iss_cty_cd", length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
            String[] apEffDt = (JSPUtil.getParameter(request, prefix + "ap_eff_dt", length));
            String[] issDt = (JSPUtil.getParameter(request, prefix + "iss_dt", length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
            String[] effDt = (JSPUtil.getParameter(request, prefix + "eff_dt", length));
            String[] dueDt = (JSPUtil.getParameter(request, prefix + "due_dt", length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
            String[] invOfcCd = (JSPUtil.getParameter(request, prefix + "inv_ofc_cd", length));
            String[] invRgstNo = (JSPUtil.getParameter(request, prefix + "inv_rgst_no", length));
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
            String[] costOfcCd = (JSPUtil.getParameter(request, prefix + "cost_ofc_cd", length));
            String[] acptDt = (JSPUtil.getParameter(request, prefix + "acpt_dt", length));
            String[] loclNetAmt = (JSPUtil.getParameter(request, prefix + "locl_net_amt", length));
            String[] payTermDys = (JSPUtil.getParameter(request, prefix + "pay_term_dys", length));
            String[] ttlUsdAmt = (JSPUtil.getParameter(request, prefix + "ttl_usd_amt", length));
            String[] invNo = (JSPUtil.getParameter(request, prefix + "inv_no", length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
            String[] ttlLoclAmt = (JSPUtil.getParameter(request, prefix + "ttl_locl_amt", length));
            String[] ydCd = (JSPUtil.getParameter(request, prefix + "yd_cd", length));
            String[] vndrSeq = (JSPUtil.getParameter(request, prefix + "vndr_seq", length));
            String[] loclDdctAmt = (JSPUtil.getParameter(request, prefix + "locl_ddct_amt", length));
            String[] psoChgStsCd = (JSPUtil.getParameter(request, prefix + "pso_chg_sts_cd", length));
            String[] existDtlYn = (JSPUtil.getParameter(request, prefix + "exist_dtl_yn", length));
            String[] steGoveGdsSvcTaxAmt = (JSPUtil.getParameter(request, prefix + "ste_gove_gds_svc_tax_amt", length));
            String[] centGoveGdsSvcTaxAmt = (JSPUtil.getParameter(request, prefix + "cent_gove_gds_svc_tax_amt", length));
            String[] intgGoveGdsSvcTaxAmt = (JSPUtil.getParameter(request, prefix + "intg_gove_gds_svc_tax_amt", length));
            String[] cessAmt = (JSPUtil.getParameter(request, prefix + "cess_amt", length));
            String[] idaWhldTaxAmt = (JSPUtil.getParameter(request, prefix + "ida_whld_tax_amt", length));
            String[] idaGstTaxDdctSrcAmt = (JSPUtil.getParameter(request, prefix + "ida_gst_tax_ddct_src_amt", length));
            String[] svcAcctgCd = (JSPUtil.getParameter(request, prefix + "svc_acctg_cd", length));
	    	/* Add a field line, do not delete */
            for (int i = 0; i < length; i++) {
                model = new PsoChargeVO();
                if (currCd[i] != null)
                    model.setCurrCd(currCd[i]);
                if (csrNo[i] != null)
                    model.setCsrNo(csrNo[i]);  
                if (glDt[i] != null)
                    model.setGlDt(glDt[i]);  
                if (ppdNo[i] != null)
                    model.setPpdNo(ppdNo[i]);
                if (ppdDtrbNo[i] != null)
                    model.setPpdDtrbNo(ppdDtrbNo[i]);
                if (ppdAplyAmt[i] != null)
                    model.setPpdAplyAmt(ppdAplyAmt[i]);
                if (ppdGlDt[i] != null)
                    model.setPpdGlDt(ppdGlDt[i]);
                if (ppayAplyFlg[i] != null)
                    model.setPpayAplyFlg(ppayAplyFlg[i]);
                if (ownrVndrSeq[i] != null)
                    model.setOwnrVndrSeq(ownrVndrSeq[i]);
                if (psoTrnsSlpCtnt[i] != null)
                    model.setPsoTrnsSlpCtnt(psoTrnsSlpCtnt[i]);
                if (soSeq[i] != null)
                    model.setSoSeq(soSeq[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (invLoclAmt[i] != null)
                    model.setInvLoclAmt(invLoclAmt[i]);
                if (loclTaxAmt[i] != null)
                    model.setLoclTaxAmt(loclTaxAmt[i]);
                if (loclWhldTaxAmt[i] != null)
                    model.setLoclWhldTaxAmt(loclWhldTaxAmt[i]);
                if (issCtyCd[i] != null)
                    model.setIssCtyCd(issCtyCd[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (apEffDt[i] != null)
                    model.setApEffDt(apEffDt[i]);
                if (issDt[i] != null)
                    model.setIssDt(issDt[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (effDt[i] != null)
                    model.setEffDt(effDt[i]);
                if (dueDt[i] != null)
                    model.setDueDt(dueDt[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                if (invOfcCd[i] != null)
                    model.setInvOfcCd(invOfcCd[i]);
                if (invRgstNo[i] != null)
                    model.setInvRgstNo(invRgstNo[i]);
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (costOfcCd[i] != null)
                    model.setCostOfcCd(costOfcCd[i]);
                if (acptDt[i] != null)
                    model.setAcptDt(acptDt[i]);
                if (loclNetAmt[i] != null)
                    model.setLoclNetAmt(loclNetAmt[i]);
                if (payTermDys[i] != null)
                    model.setPayTermDys(payTermDys[i]);
                if (ttlUsdAmt[i] != null)
                    model.setTtlUsdAmt(ttlUsdAmt[i]);
                if (invNo[i] != null)
                    model.setInvNo(invNo[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (ttlLoclAmt[i] != null)
                    model.setTtlLoclAmt(ttlLoclAmt[i]);
                if (ydCd[i] != null)
                    model.setYdCd(ydCd[i]);
                if (vndrSeq[i] != null)
                    model.setVndrSeq(vndrSeq[i]);
                if (loclDdctAmt[i] != null)
                    model.setLoclDdctAmt(loclDdctAmt[i]);
                if (psoChgStsCd[i] != null)
                    model.setPsoChgStsCd(psoChgStsCd[i]);
                if (existDtlYn[i] != null)
                    model.setExistDtlYn(existDtlYn[i]);
                if (steGoveGdsSvcTaxAmt[i] != null)
                    model.setSteGoveGdsSvcTaxAmt(steGoveGdsSvcTaxAmt[i]);
                if (centGoveGdsSvcTaxAmt[i] != null)
                    model.setCentGoveGdsSvcTaxAmt(centGoveGdsSvcTaxAmt[i]);
                if (intgGoveGdsSvcTaxAmt[i] != null)
                    model.setIntgGoveGdsSvcTaxAmt(intgGoveGdsSvcTaxAmt[i]);
                if (cessAmt[i] != null)
                    model.setCessAmt(cessAmt[i]);
                if (idaWhldTaxAmt[i] != null)
                    model.setIdaWhldTaxAmt(idaWhldTaxAmt[i]);
                if (idaGstTaxDdctSrcAmt[i] != null)
                    model.setIdaGstTaxDdctSrcAmt(idaGstTaxDdctSrcAmt[i]);
                if (svcAcctgCd[i] != null) 
		    		model.setSvcAcctgCd(svcAcctgCd[i]);
				/* Add a Method line, do not delete */
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getPsoChargeVOs();
    }

    /**
	 * VO 배열을 반환
	 * @return PsoChargeVO[]
	 */
    public PsoChargeVO[] getPsoChargeVOs() {
        PsoChargeVO[] vos = (PsoChargeVO[]) models.toArray(new PsoChargeVO[models.size()]);
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
    	this.currCd = this.currCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    	this.csrNo = this.csrNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    	this.glDt = this.glDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    	this.ppdNo = this.ppdNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    	this.ppdDtrbNo = this.ppdDtrbNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    	this.ppdAplyAmt = this.ppdAplyAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    	this.ppdGlDt = this.ppdGlDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    	this.ppayAplyFlg = this.ppayAplyFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ownrVndrSeq = this.ownrVndrSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    	this.psoTrnsSlpCtnt = this.psoTrnsSlpCtnt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.soSeq = this.soSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.invLoclAmt = this.invLoclAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.loclTaxAmt = this.loclTaxAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.loclWhldTaxAmt = this.loclWhldTaxAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.issCtyCd = this.issCtyCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.apEffDt = this.apEffDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.issDt = this.issDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.effDt = this.effDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.dueDt = this.dueDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.invOfcCd = this.invOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.invRgstNo = this.invRgstNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.costOfcCd = this.costOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.acptDt = this.acptDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.loclNetAmt = this.loclNetAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.payTermDys = this.payTermDys.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ttlUsdAmt = this.ttlUsdAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.invNo = this.invNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ttlLoclAmt = this.ttlLoclAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ydCd = this.ydCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vndrSeq = this.vndrSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.loclDdctAmt = this.loclDdctAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.psoChgStsCd = this.psoChgStsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.existDtlYn = this.existDtlYn.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.steGoveGdsSvcTaxAmt = this.steGoveGdsSvcTaxAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.centGoveGdsSvcTaxAmt = this.centGoveGdsSvcTaxAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.intgGoveGdsSvcTaxAmt = this.intgGoveGdsSvcTaxAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cessAmt = this.cessAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.idaWhldTaxAmt = this.idaWhldTaxAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.idaGstTaxDdctSrcAmt = this.idaGstTaxDdctSrcAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.svcAcctgCd = this.svcAcctgCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
