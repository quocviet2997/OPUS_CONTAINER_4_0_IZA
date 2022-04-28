/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : TesTmlSoHdrVO.java
*@FileTitle : TesTmlSoHdrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2015.11.11
*@LastModifier : 
*@LastVersion : 1.0
* 2015.11.11  
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
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
public class TesTmlSoHdrVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L;

    private Collection<TesTmlSoHdrVO> models = new ArrayList<TesTmlSoHdrVO>();

    /* Column Info */
    private String payDt = null;

    /* Column Info */
    private String ediFlg = null;

    /* Column Info */
    private String hpcCreFlg = null;

    /* Column Info */
    private String tmlInvTpCd = null;

    /* Column Info */
    private String apPayDt = null;

    /* Page Number */
    private String pagerows = null;

    /* Column Info */
    private String effDt = null;

    /* Column Info */
    private String tmlCostGrpCd = null;

    /* Column Info */
    private String leaCreFlg = null;

    /* Column Info */
    private String apRvsCngFlg = null;

    /* Column Info */
    private String rcvDt = null;

    /* Column Info */
    private String payDueDt = null;

    /* Column Info */
    private String tmlInvRjctStsCd = null;

    /* Column Info */
    private String hpcDeltFlg = null;

    /* Column Info */
    private String fmPrdDt = null;

    /* Column Info */
    private String updUsrId = null;

    /* Column Info */
    private String csrNo = null;

    /* Column Info */
    private String apCxlDt = null;

    /* Column Info */
    private String invRjctRmk = null;

    /* Column Info */
    private String rtroTmlInvFlg = null;

    /* Column Info */
    private String whldTaxAmt = null;

    /* Column Info */
    private String creUsrId = null;

    /* Column Info */
    private String costCdFtrRmk = null;

    /* Column Info */
    private String vndrSeq = null;

    /* Column Info */
    private String tmlOdckFlg = null;

    /* Column Info */
    private String tmlSoSeq = null;

    /* Column Info */
    private String invRjctDt = null;

    /* Column Info */
    private String loclUpdDt = null;

    /* Column Info */
    private String currCd = null;

    /* Column Info */
    private String deltFlg = null;

    /* Column Info */
    private String errInvNo = null;

    /* Column Info */
    private String payFlg = null;

    /* Column Info */
    private String creDt = null;

    /* Column Info */
    private String edwUpdDt = null;

    /* Column Info */
    private String tmlCalcIndCd = null;

    /* Column Info */
    private String issDt = null;

    /* VO Data Value( C:Creation, U:Update, D:Delete ) */
    private String ibflag = null;

    /* Column Info */
    private String ttlCalcAmt = null;

    /* Column Info */
    private String apIfDt = null;

    /* Column Info */
    private String wrkDt = null;

    /* Column Info */
    private String invOfcCd = null;

    /* Column Info */
    private String updDt = null;

    /* Column Info */
    private String costOfcCd = null;

    /* Column Info */
    private String hpcCxlFlg = null;

    /* Column Info */
    private String invCfmDt = null;

    /* Column Info */
    private String loclCreDt = null;

    /* Column Info */
    private String toPrdDt = null;

    /* Column Info */
    private String invNo = null;

    /* Column Info */
    private String vatAmt = null;

    /* Column Info */
    private String hldRmk = null;

    /* Column Info */
    private String ydCd = null;

    /* Column Info */
    private String tmlInvStsCd = null;

    /* Column Info */
    private String leaCxlFlg = null;

    /* Column Info */
    private String stoDysIndCd = null;

    /* Column Info */
    private String hldFlg = null;

    /* Column Info */
    private String ttlInvAmt = null;

    /* Column Info */
    private String tmlSoOfcCtyCd = null;

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

    /* Column Info */
    private String idaInvFlg = null;

    /*	테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

    /*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();

    public TesTmlSoHdrVO() {
    }

    public TesTmlSoHdrVO(String ibflag, String pagerows, String tmlSoOfcCtyCd, String tmlSoSeq, String invOfcCd, String costOfcCd, String invNo, String errInvNo, String vndrSeq, String ydCd, String currCd, String ttlInvAmt, String vatAmt, String whldTaxAmt, String ttlCalcAmt, String fmPrdDt, String hldFlg, String hldRmk, String toPrdDt, String tmlInvTpCd, String tmlCostGrpCd, String tmlCalcIndCd, String stoDysIndCd, String issDt, String rcvDt, String effDt, String payDueDt, String payDt, String payFlg, String tmlInvStsCd, String tmlInvRjctStsCd, String invCfmDt, String invRjctDt, String invRjctRmk, String csrNo, String deltFlg, String apIfDt, String apCxlDt, String apPayDt, String leaCreFlg, String leaCxlFlg, String hpcCreFlg, String hpcCxlFlg, String hpcDeltFlg, String ediFlg, String rtroTmlInvFlg, String loclCreDt, String loclUpdDt, String creUsrId, String creDt, String updUsrId, String updDt, String apRvsCngFlg, String wrkDt, String tmlOdckFlg, String edwUpdDt, String costCdFtrRmk, String steGoveGdsSvcTaxAmt, String centGoveGdsSvcTaxAmt, String intgGoveGdsSvcTaxAmt, String cessAmt, String idaWhldTaxAmt, String idaGstTaxDdctSrcAmt, String svcAcctgCd, String idaInvFlg) {
        this.payDt = payDt;
        this.ediFlg = ediFlg;
        this.hpcCreFlg = hpcCreFlg;
        this.tmlInvTpCd = tmlInvTpCd;
        this.apPayDt = apPayDt;
        this.pagerows = pagerows;
        this.effDt = effDt;
        this.tmlCostGrpCd = tmlCostGrpCd;
        this.leaCreFlg = leaCreFlg;
        this.apRvsCngFlg = apRvsCngFlg;
        this.rcvDt = rcvDt;
        this.payDueDt = payDueDt;
        this.tmlInvRjctStsCd = tmlInvRjctStsCd;
        this.hpcDeltFlg = hpcDeltFlg;
        this.fmPrdDt = fmPrdDt;
        this.updUsrId = updUsrId;
        this.csrNo = csrNo;
        this.apCxlDt = apCxlDt;
        this.invRjctRmk = invRjctRmk;
        this.rtroTmlInvFlg = rtroTmlInvFlg;
        this.whldTaxAmt = whldTaxAmt;
        this.creUsrId = creUsrId;
        this.costCdFtrRmk = costCdFtrRmk;
        this.vndrSeq = vndrSeq;
        this.tmlOdckFlg = tmlOdckFlg;
        this.tmlSoSeq = tmlSoSeq;
        this.invRjctDt = invRjctDt;
        this.loclUpdDt = loclUpdDt;
        this.currCd = currCd;
        this.deltFlg = deltFlg;
        this.errInvNo = errInvNo;
        this.payFlg = payFlg;
        this.creDt = creDt;
        this.edwUpdDt = edwUpdDt;
        this.tmlCalcIndCd = tmlCalcIndCd;
        this.issDt = issDt;
        this.ibflag = ibflag;
        this.ttlCalcAmt = ttlCalcAmt;
        this.apIfDt = apIfDt;
        this.wrkDt = wrkDt;
        this.invOfcCd = invOfcCd;
        this.updDt = updDt;
        this.costOfcCd = costOfcCd;
        this.hpcCxlFlg = hpcCxlFlg;
        this.invCfmDt = invCfmDt;
        this.loclCreDt = loclCreDt;
        this.toPrdDt = toPrdDt;
        this.invNo = invNo;
        this.vatAmt = vatAmt;
        this.hldRmk = hldRmk;
        this.ydCd = ydCd;
        this.tmlInvStsCd = tmlInvStsCd;
        this.leaCxlFlg = leaCxlFlg;
        this.stoDysIndCd = stoDysIndCd;
        this.hldFlg = hldFlg;
        this.ttlInvAmt = ttlInvAmt;
        this.tmlSoOfcCtyCd = tmlSoOfcCtyCd;
        this.steGoveGdsSvcTaxAmt = steGoveGdsSvcTaxAmt;
        this.centGoveGdsSvcTaxAmt = centGoveGdsSvcTaxAmt;
        this.intgGoveGdsSvcTaxAmt = intgGoveGdsSvcTaxAmt;
        this.cessAmt = cessAmt;
        this.idaWhldTaxAmt = idaWhldTaxAmt;
        this.idaGstTaxDdctSrcAmt = idaGstTaxDdctSrcAmt;
        this.svcAcctgCd = svcAcctgCd;
        this.idaInvFlg = idaInvFlg;
    }

    /**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("pay_dt", getPayDt());
        this.hashColumns.put("edi_flg", getEdiFlg());
        this.hashColumns.put("hpc_cre_flg", getHpcCreFlg());
        this.hashColumns.put("tml_inv_tp_cd", getTmlInvTpCd());
        this.hashColumns.put("ap_pay_dt", getApPayDt());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("eff_dt", getEffDt());
        this.hashColumns.put("tml_cost_grp_cd", getTmlCostGrpCd());
        this.hashColumns.put("lea_cre_flg", getLeaCreFlg());
        this.hashColumns.put("ap_rvs_cng_flg", getApRvsCngFlg());
        this.hashColumns.put("rcv_dt", getRcvDt());
        this.hashColumns.put("pay_due_dt", getPayDueDt());
        this.hashColumns.put("tml_inv_rjct_sts_cd", getTmlInvRjctStsCd());
        this.hashColumns.put("hpc_delt_flg", getHpcDeltFlg());
        this.hashColumns.put("fm_prd_dt", getFmPrdDt());
        this.hashColumns.put("upd_usr_id", getUpdUsrId());
        this.hashColumns.put("csr_no", getCsrNo());
        this.hashColumns.put("ap_cxl_dt", getApCxlDt());
        this.hashColumns.put("inv_rjct_rmk", getInvRjctRmk());
        this.hashColumns.put("rtro_tml_inv_flg", getRtroTmlInvFlg());
        this.hashColumns.put("whld_tax_amt", getWhldTaxAmt());
        this.hashColumns.put("cre_usr_id", getCreUsrId());
        this.hashColumns.put("cost_cd_ftr_rmk", getCostCdFtrRmk());
        this.hashColumns.put("vndr_seq", getVndrSeq());
        this.hashColumns.put("tml_odck_flg", getTmlOdckFlg());
        this.hashColumns.put("tml_so_seq", getTmlSoSeq());
        this.hashColumns.put("inv_rjct_dt", getInvRjctDt());
        this.hashColumns.put("locl_upd_dt", getLoclUpdDt());
        this.hashColumns.put("curr_cd", getCurrCd());
        this.hashColumns.put("delt_flg", getDeltFlg());
        this.hashColumns.put("err_inv_no", getErrInvNo());
        this.hashColumns.put("pay_flg", getPayFlg());
        this.hashColumns.put("cre_dt", getCreDt());
        this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
        this.hashColumns.put("tml_calc_ind_cd", getTmlCalcIndCd());
        this.hashColumns.put("iss_dt", getIssDt());
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("ttl_calc_amt", getTtlCalcAmt());
        this.hashColumns.put("ap_if_dt", getApIfDt());
        this.hashColumns.put("wrk_dt", getWrkDt());
        this.hashColumns.put("inv_ofc_cd", getInvOfcCd());
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("cost_ofc_cd", getCostOfcCd());
        this.hashColumns.put("hpc_cxl_flg", getHpcCxlFlg());
        this.hashColumns.put("inv_cfm_dt", getInvCfmDt());
        this.hashColumns.put("locl_cre_dt", getLoclCreDt());
        this.hashColumns.put("to_prd_dt", getToPrdDt());
        this.hashColumns.put("inv_no", getInvNo());
        this.hashColumns.put("vat_amt", getVatAmt());
        this.hashColumns.put("hld_rmk", getHldRmk());
        this.hashColumns.put("yd_cd", getYdCd());
        this.hashColumns.put("tml_inv_sts_cd", getTmlInvStsCd());
        this.hashColumns.put("lea_cxl_flg", getLeaCxlFlg());
        this.hashColumns.put("sto_dys_ind_cd", getStoDysIndCd());
        this.hashColumns.put("hld_flg", getHldFlg());
        this.hashColumns.put("ttl_inv_amt", getTtlInvAmt());
        this.hashColumns.put("tml_so_ofc_cty_cd", getTmlSoOfcCtyCd());
        this.hashColumns.put("ste_gove_gds_svc_tax_amt", getSteGoveGdsSvcTaxAmt());
        this.hashColumns.put("cent_gove_gds_svc_tax_amt", getCentGoveGdsSvcTaxAmt());
        this.hashColumns.put("intg_gove_gds_svc_tax_amt", getIntgGoveGdsSvcTaxAmt());
        this.hashColumns.put("cess_amt", getCessAmt());
        this.hashColumns.put("ida_whld_tax_amt", getIdaWhldTaxAmt());
        this.hashColumns.put("ida_gst_tax_ddct_src_amt", getIdaGstTaxDdctSrcAmt());
        this.hashColumns.put("svc_acctg_cd", getSvcAcctgCd());
        this.hashColumns.put("ida_inv_flg", getIdaInvFlg());
        return this.hashColumns;
    }

    /**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("pay_dt", "payDt");
        this.hashFields.put("edi_flg", "ediFlg");
        this.hashFields.put("hpc_cre_flg", "hpcCreFlg");
        this.hashFields.put("tml_inv_tp_cd", "tmlInvTpCd");
        this.hashFields.put("ap_pay_dt", "apPayDt");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("eff_dt", "effDt");
        this.hashFields.put("tml_cost_grp_cd", "tmlCostGrpCd");
        this.hashFields.put("lea_cre_flg", "leaCreFlg");
        this.hashFields.put("ap_rvs_cng_flg", "apRvsCngFlg");
        this.hashFields.put("rcv_dt", "rcvDt");
        this.hashFields.put("pay_due_dt", "payDueDt");
        this.hashFields.put("tml_inv_rjct_sts_cd", "tmlInvRjctStsCd");
        this.hashFields.put("hpc_delt_flg", "hpcDeltFlg");
        this.hashFields.put("fm_prd_dt", "fmPrdDt");
        this.hashFields.put("upd_usr_id", "updUsrId");
        this.hashFields.put("csr_no", "csrNo");
        this.hashFields.put("ap_cxl_dt", "apCxlDt");
        this.hashFields.put("inv_rjct_rmk", "invRjctRmk");
        this.hashFields.put("rtro_tml_inv_flg", "rtroTmlInvFlg");
        this.hashFields.put("whld_tax_amt", "whldTaxAmt");
        this.hashFields.put("cre_usr_id", "creUsrId");
        this.hashFields.put("cost_cd_ftr_rmk", "costCdFtrRmk");
        this.hashFields.put("vndr_seq", "vndrSeq");
        this.hashFields.put("tml_odck_flg", "tmlOdckFlg");
        this.hashFields.put("tml_so_seq", "tmlSoSeq");
        this.hashFields.put("inv_rjct_dt", "invRjctDt");
        this.hashFields.put("locl_upd_dt", "loclUpdDt");
        this.hashFields.put("curr_cd", "currCd");
        this.hashFields.put("delt_flg", "deltFlg");
        this.hashFields.put("err_inv_no", "errInvNo");
        this.hashFields.put("pay_flg", "payFlg");
        this.hashFields.put("cre_dt", "creDt");
        this.hashFields.put("edw_upd_dt", "edwUpdDt");
        this.hashFields.put("tml_calc_ind_cd", "tmlCalcIndCd");
        this.hashFields.put("iss_dt", "issDt");
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("ttl_calc_amt", "ttlCalcAmt");
        this.hashFields.put("ap_if_dt", "apIfDt");
        this.hashFields.put("wrk_dt", "wrkDt");
        this.hashFields.put("inv_ofc_cd", "invOfcCd");
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("cost_ofc_cd", "costOfcCd");
        this.hashFields.put("hpc_cxl_flg", "hpcCxlFlg");
        this.hashFields.put("inv_cfm_dt", "invCfmDt");
        this.hashFields.put("locl_cre_dt", "loclCreDt");
        this.hashFields.put("to_prd_dt", "toPrdDt");
        this.hashFields.put("inv_no", "invNo");
        this.hashFields.put("vat_amt", "vatAmt");
        this.hashFields.put("hld_rmk", "hldRmk");
        this.hashFields.put("yd_cd", "ydCd");
        this.hashFields.put("tml_inv_sts_cd", "tmlInvStsCd");
        this.hashFields.put("lea_cxl_flg", "leaCxlFlg");
        this.hashFields.put("sto_dys_ind_cd", "stoDysIndCd");
        this.hashFields.put("hld_flg", "hldFlg");
        this.hashFields.put("ttl_inv_amt", "ttlInvAmt");
        this.hashFields.put("tml_so_ofc_cty_cd", "tmlSoOfcCtyCd");
        this.hashFields.put("ste_gove_gds_svc_tax_amt", "steGoveGdsSvcTaxAmt");
        this.hashFields.put("cent_gove_gds_svc_tax_amt", "centGoveGdsSvcTaxAmt");
        this.hashFields.put("intg_gove_gds_svc_tax_amt", "intgGoveGdsSvcTaxAmt");
        this.hashFields.put("cess_amt", "cessAmt");
        this.hashFields.put("ida_whld_tax_amt", "idaWhldTaxAmt");
        this.hashFields.put("ida_gst_tax_ddct_src_amt", "idaGstTaxDdctSrcAmt");
        this.hashFields.put("svc_acctg_cd", "svcAcctgCd");
        this.hashFields.put("ida_inv_flg", "idaInvFlg");
        return this.hashFields;
    }

    /**
	 * Column Info
	 * @return payDt
	 */
    public String getPayDt() {
        return this.payDt;
    }

    /**
	 * Column Info
	 * @return ediFlg
	 */
    public String getEdiFlg() {
        return this.ediFlg;
    }

    /**
	 * Column Info
	 * @return hpcCreFlg
	 */
    public String getHpcCreFlg() {
        return this.hpcCreFlg;
    }

    /**
	 * Column Info
	 * @return tmlInvTpCd
	 */
    public String getTmlInvTpCd() {
        return this.tmlInvTpCd;
    }

    /**
	 * Column Info
	 * @return apPayDt
	 */
    public String getApPayDt() {
        return this.apPayDt;
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
	 * @return effDt
	 */
    public String getEffDt() {
        return this.effDt;
    }

    /**
	 * Column Info
	 * @return tmlCostGrpCd
	 */
    public String getTmlCostGrpCd() {
        return this.tmlCostGrpCd;
    }

    /**
	 * Column Info
	 * @return leaCreFlg
	 */
    public String getLeaCreFlg() {
        return this.leaCreFlg;
    }

    /**
	 * Column Info
	 * @return apRvsCngFlg
	 */
    public String getApRvsCngFlg() {
        return this.apRvsCngFlg;
    }

    /**
	 * Column Info
	 * @return rcvDt
	 */
    public String getRcvDt() {
        return this.rcvDt;
    }

    /**
	 * Column Info
	 * @return payDueDt
	 */
    public String getPayDueDt() {
        return this.payDueDt;
    }

    /**
	 * Column Info
	 * @return tmlInvRjctStsCd
	 */
    public String getTmlInvRjctStsCd() {
        return this.tmlInvRjctStsCd;
    }

    /**
	 * Column Info
	 * @return hpcDeltFlg
	 */
    public String getHpcDeltFlg() {
        return this.hpcDeltFlg;
    }

    /**
	 * Column Info
	 * @return fmPrdDt
	 */
    public String getFmPrdDt() {
        return this.fmPrdDt;
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
	 * @return csrNo
	 */
    public String getCsrNo() {
        return this.csrNo;
    }

    /**
	 * Column Info
	 * @return apCxlDt
	 */
    public String getApCxlDt() {
        return this.apCxlDt;
    }

    /**
	 * Column Info
	 * @return invRjctRmk
	 */
    public String getInvRjctRmk() {
        return this.invRjctRmk;
    }

    /**
	 * Column Info
	 * @return rtroTmlInvFlg
	 */
    public String getRtroTmlInvFlg() {
        return this.rtroTmlInvFlg;
    }

    /**
	 * Column Info
	 * @return whldTaxAmt
	 */
    public String getWhldTaxAmt() {
        return this.whldTaxAmt;
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
	 * @return costCdFtrRmk
	 */
    public String getCostCdFtrRmk() {
        return this.costCdFtrRmk;
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
	 * @return tmlOdckFlg
	 */
    public String getTmlOdckFlg() {
        return this.tmlOdckFlg;
    }

    /**
	 * Column Info
	 * @return tmlSoSeq
	 */
    public String getTmlSoSeq() {
        return this.tmlSoSeq;
    }

    /**
	 * Column Info
	 * @return invRjctDt
	 */
    public String getInvRjctDt() {
        return this.invRjctDt;
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
	 * @return currCd
	 */
    public String getCurrCd() {
        return this.currCd;
    }

    /**
	 * Column Info
	 * @return deltFlg
	 */
    public String getDeltFlg() {
        return this.deltFlg;
    }

    /**
	 * Column Info
	 * @return errInvNo
	 */
    public String getErrInvNo() {
        return this.errInvNo;
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
	 * @return edwUpdDt
	 */
    public String getEdwUpdDt() {
        return this.edwUpdDt;
    }

    /**
	 * Column Info
	 * @return tmlCalcIndCd
	 */
    public String getTmlCalcIndCd() {
        return this.tmlCalcIndCd;
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
	 * @return ttlCalcAmt
	 */
    public String getTtlCalcAmt() {
        return this.ttlCalcAmt;
    }

    /**
	 * Column Info
	 * @return apIfDt
	 */
    public String getApIfDt() {
        return this.apIfDt;
    }

    /**
	 * Column Info
	 * @return wrkDt
	 */
    public String getWrkDt() {
        return this.wrkDt;
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
	 * @return hpcCxlFlg
	 */
    public String getHpcCxlFlg() {
        return this.hpcCxlFlg;
    }

    /**
	 * Column Info
	 * @return invCfmDt
	 */
    public String getInvCfmDt() {
        return this.invCfmDt;
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
	 * @return toPrdDt
	 */
    public String getToPrdDt() {
        return this.toPrdDt;
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
	 * @return vatAmt
	 */
    public String getVatAmt() {
        return this.vatAmt;
    }

    /**
	 * Column Info
	 * @return hldRmk
	 */
    public String getHldRmk() {
        return this.hldRmk;
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
	 * @return tmlInvStsCd
	 */
    public String getTmlInvStsCd() {
        return this.tmlInvStsCd;
    }

    /**
	 * Column Info
	 * @return leaCxlFlg
	 */
    public String getLeaCxlFlg() {
        return this.leaCxlFlg;
    }

    /**
	 * Column Info
	 * @return stoDysIndCd
	 */
    public String getStoDysIndCd() {
        return this.stoDysIndCd;
    }

    /**
	 * Column Info
	 * @return hldFlg
	 */
    public String getHldFlg() {
        return this.hldFlg;
    }

    /**
	 * Column Info
	 * @return ttlInvAmt
	 */
    public String getTtlInvAmt() {
        return this.ttlInvAmt;
    }

    /**
	 * Column Info
	 * @return tmlSoOfcCtyCd
	 */
    public String getTmlSoOfcCtyCd() {
        return this.tmlSoOfcCtyCd;
    }

    /**
	 * Column Info
	 * @param payDt
	 */
    public void setPayDt(String payDt) {
        this.payDt = payDt;
    }

    /**
	 * Column Info
	 * @param ediFlg
	 */
    public void setEdiFlg(String ediFlg) {
        this.ediFlg = ediFlg;
    }

    /**
	 * Column Info
	 * @param hpcCreFlg
	 */
    public void setHpcCreFlg(String hpcCreFlg) {
        this.hpcCreFlg = hpcCreFlg;
    }

    /**
	 * Column Info
	 * @param tmlInvTpCd
	 */
    public void setTmlInvTpCd(String tmlInvTpCd) {
        this.tmlInvTpCd = tmlInvTpCd;
    }

    /**
	 * Column Info
	 * @param apPayDt
	 */
    public void setApPayDt(String apPayDt) {
        this.apPayDt = apPayDt;
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
	 * @param effDt
	 */
    public void setEffDt(String effDt) {
        this.effDt = effDt;
    }

    /**
	 * Column Info
	 * @param tmlCostGrpCd
	 */
    public void setTmlCostGrpCd(String tmlCostGrpCd) {
        this.tmlCostGrpCd = tmlCostGrpCd;
    }

    /**
	 * Column Info
	 * @param leaCreFlg
	 */
    public void setLeaCreFlg(String leaCreFlg) {
        this.leaCreFlg = leaCreFlg;
    }

    /**
	 * Column Info
	 * @param apRvsCngFlg
	 */
    public void setApRvsCngFlg(String apRvsCngFlg) {
        this.apRvsCngFlg = apRvsCngFlg;
    }

    /**
	 * Column Info
	 * @param rcvDt
	 */
    public void setRcvDt(String rcvDt) {
        this.rcvDt = rcvDt;
    }

    /**
	 * Column Info
	 * @param payDueDt
	 */
    public void setPayDueDt(String payDueDt) {
        this.payDueDt = payDueDt;
    }

    /**
	 * Column Info
	 * @param tmlInvRjctStsCd
	 */
    public void setTmlInvRjctStsCd(String tmlInvRjctStsCd) {
        this.tmlInvRjctStsCd = tmlInvRjctStsCd;
    }

    /**
	 * Column Info
	 * @param hpcDeltFlg
	 */
    public void setHpcDeltFlg(String hpcDeltFlg) {
        this.hpcDeltFlg = hpcDeltFlg;
    }

    /**
	 * Column Info
	 * @param fmPrdDt
	 */
    public void setFmPrdDt(String fmPrdDt) {
        this.fmPrdDt = fmPrdDt;
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
	 * @param csrNo
	 */
    public void setCsrNo(String csrNo) {
        this.csrNo = csrNo;
    }

    /**
	 * Column Info
	 * @param apCxlDt
	 */
    public void setApCxlDt(String apCxlDt) {
        this.apCxlDt = apCxlDt;
    }

    /**
	 * Column Info
	 * @param invRjctRmk
	 */
    public void setInvRjctRmk(String invRjctRmk) {
        this.invRjctRmk = invRjctRmk;
    }

    /**
	 * Column Info
	 * @param rtroTmlInvFlg
	 */
    public void setRtroTmlInvFlg(String rtroTmlInvFlg) {
        this.rtroTmlInvFlg = rtroTmlInvFlg;
    }

    /**
	 * Column Info
	 * @param whldTaxAmt
	 */
    public void setWhldTaxAmt(String whldTaxAmt) {
        this.whldTaxAmt = whldTaxAmt;
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
	 * @param costCdFtrRmk
	 */
    public void setCostCdFtrRmk(String costCdFtrRmk) {
        this.costCdFtrRmk = costCdFtrRmk;
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
	 * @param tmlOdckFlg
	 */
    public void setTmlOdckFlg(String tmlOdckFlg) {
        this.tmlOdckFlg = tmlOdckFlg;
    }

    /**
	 * Column Info
	 * @param tmlSoSeq
	 */
    public void setTmlSoSeq(String tmlSoSeq) {
        this.tmlSoSeq = tmlSoSeq;
    }

    /**
	 * Column Info
	 * @param invRjctDt
	 */
    public void setInvRjctDt(String invRjctDt) {
        this.invRjctDt = invRjctDt;
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
	 * @param currCd
	 */
    public void setCurrCd(String currCd) {
        this.currCd = currCd;
    }

    /**
	 * Column Info
	 * @param deltFlg
	 */
    public void setDeltFlg(String deltFlg) {
        this.deltFlg = deltFlg;
    }

    /**
	 * Column Info
	 * @param errInvNo
	 */
    public void setErrInvNo(String errInvNo) {
        this.errInvNo = errInvNo;
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
	 * @param edwUpdDt
	 */
    public void setEdwUpdDt(String edwUpdDt) {
        this.edwUpdDt = edwUpdDt;
    }

    /**
	 * Column Info
	 * @param tmlCalcIndCd
	 */
    public void setTmlCalcIndCd(String tmlCalcIndCd) {
        this.tmlCalcIndCd = tmlCalcIndCd;
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
	 * @param ttlCalcAmt
	 */
    public void setTtlCalcAmt(String ttlCalcAmt) {
        this.ttlCalcAmt = ttlCalcAmt;
    }

    /**
	 * Column Info
	 * @param apIfDt
	 */
    public void setApIfDt(String apIfDt) {
        this.apIfDt = apIfDt;
    }

    /**
	 * Column Info
	 * @param wrkDt
	 */
    public void setWrkDt(String wrkDt) {
        this.wrkDt = wrkDt;
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
	 * @param hpcCxlFlg
	 */
    public void setHpcCxlFlg(String hpcCxlFlg) {
        this.hpcCxlFlg = hpcCxlFlg;
    }

    /**
	 * Column Info
	 * @param invCfmDt
	 */
    public void setInvCfmDt(String invCfmDt) {
        this.invCfmDt = invCfmDt;
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
	 * @param toPrdDt
	 */
    public void setToPrdDt(String toPrdDt) {
        this.toPrdDt = toPrdDt;
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
	 * @param vatAmt
	 */
    public void setVatAmt(String vatAmt) {
        this.vatAmt = vatAmt;
    }

    /**
	 * Column Info
	 * @param hldRmk
	 */
    public void setHldRmk(String hldRmk) {
        this.hldRmk = hldRmk;
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
	 * @param tmlInvStsCd
	 */
    public void setTmlInvStsCd(String tmlInvStsCd) {
        this.tmlInvStsCd = tmlInvStsCd;
    }

    /**
	 * Column Info
	 * @param leaCxlFlg
	 */
    public void setLeaCxlFlg(String leaCxlFlg) {
        this.leaCxlFlg = leaCxlFlg;
    }

    /**
	 * Column Info
	 * @param stoDysIndCd
	 */
    public void setStoDysIndCd(String stoDysIndCd) {
        this.stoDysIndCd = stoDysIndCd;
    }

    /**
	 * Column Info
	 * @param hldFlg
	 */
    public void setHldFlg(String hldFlg) {
        this.hldFlg = hldFlg;
    }

    /**
	 * Column Info
	 * @param ttlInvAmt
	 */
    public void setTtlInvAmt(String ttlInvAmt) {
        this.ttlInvAmt = ttlInvAmt;
    }

    /**
	 * Column Info
	 * @param tmlSoOfcCtyCd
	 */
    public void setTmlSoOfcCtyCd(String tmlSoOfcCtyCd) {
        this.tmlSoOfcCtyCd = tmlSoOfcCtyCd;
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

    public void setIdaInvFlg(String idaInvFlg) {
        this.idaInvFlg = idaInvFlg;
    }

    public String getIdaInvFlg() {
        return this.idaInvFlg;
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
        setPayDt(JSPUtil.getParameter(request, prefix + "pay_dt", ""));
        setEdiFlg(JSPUtil.getParameter(request, prefix + "edi_flg", ""));
        setHpcCreFlg(JSPUtil.getParameter(request, prefix + "hpc_cre_flg", ""));
        setTmlInvTpCd(JSPUtil.getParameter(request, prefix + "tml_inv_tp_cd", ""));
        setApPayDt(JSPUtil.getParameter(request, prefix + "ap_pay_dt", ""));
        setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
        setEffDt(JSPUtil.getParameter(request, prefix + "eff_dt", ""));
        setTmlCostGrpCd(JSPUtil.getParameter(request, prefix + "tml_cost_grp_cd", ""));
        setLeaCreFlg(JSPUtil.getParameter(request, prefix + "lea_cre_flg", ""));
        setApRvsCngFlg(JSPUtil.getParameter(request, prefix + "ap_rvs_cng_flg", ""));
        setRcvDt(JSPUtil.getParameter(request, prefix + "rcv_dt", ""));
        setPayDueDt(JSPUtil.getParameter(request, prefix + "pay_due_dt", ""));
        setTmlInvRjctStsCd(JSPUtil.getParameter(request, prefix + "tml_inv_rjct_sts_cd", ""));
        setHpcDeltFlg(JSPUtil.getParameter(request, prefix + "hpc_delt_flg", ""));
        setFmPrdDt(JSPUtil.getParameter(request, prefix + "fm_prd_dt", ""));
        setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
        setCsrNo(JSPUtil.getParameter(request, prefix + "csr_no", ""));
        setApCxlDt(JSPUtil.getParameter(request, prefix + "ap_cxl_dt", ""));
        setInvRjctRmk(JSPUtil.getParameter(request, prefix + "inv_rjct_rmk", ""));
        setRtroTmlInvFlg(JSPUtil.getParameter(request, prefix + "rtro_tml_inv_flg", ""));
        setWhldTaxAmt(JSPUtil.getParameter(request, prefix + "whld_tax_amt", ""));
        setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
        setCostCdFtrRmk(JSPUtil.getParameter(request, prefix + "cost_cd_ftr_rmk", ""));
        setVndrSeq(JSPUtil.getParameter(request, prefix + "vndr_seq", ""));
        setTmlOdckFlg(JSPUtil.getParameter(request, prefix + "tml_odck_flg", ""));
        setTmlSoSeq(JSPUtil.getParameter(request, prefix + "tml_so_seq", ""));
        setInvRjctDt(JSPUtil.getParameter(request, prefix + "inv_rjct_dt", ""));
        setLoclUpdDt(JSPUtil.getParameter(request, prefix + "locl_upd_dt", ""));
        setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
        setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
        setErrInvNo(JSPUtil.getParameter(request, prefix + "err_inv_no", ""));
        setPayFlg(JSPUtil.getParameter(request, prefix + "pay_flg", ""));
        setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
        setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
        setTmlCalcIndCd(JSPUtil.getParameter(request, prefix + "tml_calc_ind_cd", ""));
        setIssDt(JSPUtil.getParameter(request, prefix + "iss_dt", ""));
        setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
        setTtlCalcAmt(JSPUtil.getParameter(request, prefix + "ttl_calc_amt", ""));
        setApIfDt(JSPUtil.getParameter(request, prefix + "ap_if_dt", ""));
        setWrkDt(JSPUtil.getParameter(request, prefix + "wrk_dt", ""));
        setInvOfcCd(JSPUtil.getParameter(request, prefix + "inv_ofc_cd", ""));
        setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
        setCostOfcCd(JSPUtil.getParameter(request, prefix + "cost_ofc_cd", ""));
        setHpcCxlFlg(JSPUtil.getParameter(request, prefix + "hpc_cxl_flg", ""));
        setInvCfmDt(JSPUtil.getParameter(request, prefix + "inv_cfm_dt", ""));
        setLoclCreDt(JSPUtil.getParameter(request, prefix + "locl_cre_dt", ""));
        setToPrdDt(JSPUtil.getParameter(request, prefix + "to_prd_dt", ""));
        setInvNo(JSPUtil.getParameter(request, prefix + "inv_no", ""));
        setVatAmt(JSPUtil.getParameter(request, prefix + "vat_amt", ""));
        setHldRmk(JSPUtil.getParameter(request, prefix + "hld_rmk", ""));
        setYdCd(JSPUtil.getParameter(request, prefix + "yd_cd", ""));
        setTmlInvStsCd(JSPUtil.getParameter(request, prefix + "tml_inv_sts_cd", ""));
        setLeaCxlFlg(JSPUtil.getParameter(request, prefix + "lea_cxl_flg", ""));
        setStoDysIndCd(JSPUtil.getParameter(request, prefix + "sto_dys_ind_cd", ""));
        setHldFlg(JSPUtil.getParameter(request, prefix + "hld_flg", ""));
        setTtlInvAmt(JSPUtil.getParameter(request, prefix + "ttl_inv_amt", ""));
        setTmlSoOfcCtyCd(JSPUtil.getParameter(request, prefix + "tml_so_ofc_cty_cd", ""));
        setSteGoveGdsSvcTaxAmt(JSPUtil.getParameter(request, prefix + "ste_gove_gds_svc_tax_amt", ""));
        setCentGoveGdsSvcTaxAmt(JSPUtil.getParameter(request, prefix + "cent_gove_gds_svc_tax_amt", ""));
        setIntgGoveGdsSvcTaxAmt(JSPUtil.getParameter(request, prefix + "intg_gove_gds_svc_tax_amt", ""));
        setCessAmt(JSPUtil.getParameter(request, prefix + "cess_amt", ""));
        setIdaWhldTaxAmt(JSPUtil.getParameter(request, prefix + "ida_whld_tax_amt", ""));
        setIdaGstTaxDdctSrcAmt(JSPUtil.getParameter(request, prefix + "ida_gst_tax_ddct_src_amt", ""));
        setSvcAcctgCd(JSPUtil.getParameter(request, prefix + "svc_acctg_cd", ""));
        setIdaInvFlg(JSPUtil.getParameter(request, prefix + "ida_inv_flg", ""));
    }

    /**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesTmlSoHdrVO[]
	 */
    public TesTmlSoHdrVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesTmlSoHdrVO[]
	 */
    public TesTmlSoHdrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        TesTmlSoHdrVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] payDt = (JSPUtil.getParameter(request, prefix + "pay_dt", length));
            String[] ediFlg = (JSPUtil.getParameter(request, prefix + "edi_flg", length));
            String[] hpcCreFlg = (JSPUtil.getParameter(request, prefix + "hpc_cre_flg", length));
            String[] tmlInvTpCd = (JSPUtil.getParameter(request, prefix + "tml_inv_tp_cd", length));
            String[] apPayDt = (JSPUtil.getParameter(request, prefix + "ap_pay_dt", length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
            String[] effDt = (JSPUtil.getParameter(request, prefix + "eff_dt", length));
            String[] tmlCostGrpCd = (JSPUtil.getParameter(request, prefix + "tml_cost_grp_cd", length));
            String[] leaCreFlg = (JSPUtil.getParameter(request, prefix + "lea_cre_flg", length));
            String[] apRvsCngFlg = (JSPUtil.getParameter(request, prefix + "ap_rvs_cng_flg", length));
            String[] rcvDt = (JSPUtil.getParameter(request, prefix + "rcv_dt", length));
            String[] payDueDt = (JSPUtil.getParameter(request, prefix + "pay_due_dt", length));
            String[] tmlInvRjctStsCd = (JSPUtil.getParameter(request, prefix + "tml_inv_rjct_sts_cd", length));
            String[] hpcDeltFlg = (JSPUtil.getParameter(request, prefix + "hpc_delt_flg", length));
            String[] fmPrdDt = (JSPUtil.getParameter(request, prefix + "fm_prd_dt", length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
            String[] csrNo = (JSPUtil.getParameter(request, prefix + "csr_no", length));
            String[] apCxlDt = (JSPUtil.getParameter(request, prefix + "ap_cxl_dt", length));
            String[] invRjctRmk = (JSPUtil.getParameter(request, prefix + "inv_rjct_rmk", length));
            String[] rtroTmlInvFlg = (JSPUtil.getParameter(request, prefix + "rtro_tml_inv_flg", length));
            String[] whldTaxAmt = (JSPUtil.getParameter(request, prefix + "whld_tax_amt", length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
            String[] costCdFtrRmk = (JSPUtil.getParameter(request, prefix + "cost_cd_ftr_rmk", length));
            String[] vndrSeq = (JSPUtil.getParameter(request, prefix + "vndr_seq", length));
            String[] tmlOdckFlg = (JSPUtil.getParameter(request, prefix + "tml_odck_flg", length));
            String[] tmlSoSeq = (JSPUtil.getParameter(request, prefix + "tml_so_seq", length));
            String[] invRjctDt = (JSPUtil.getParameter(request, prefix + "inv_rjct_dt", length));
            String[] loclUpdDt = (JSPUtil.getParameter(request, prefix + "locl_upd_dt", length));
            String[] currCd = (JSPUtil.getParameter(request, prefix + "curr_cd", length));
            String[] deltFlg = (JSPUtil.getParameter(request, prefix + "delt_flg", length));
            String[] errInvNo = (JSPUtil.getParameter(request, prefix + "err_inv_no", length));
            String[] payFlg = (JSPUtil.getParameter(request, prefix + "pay_flg", length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
            String[] edwUpdDt = (JSPUtil.getParameter(request, prefix + "edw_upd_dt", length));
            String[] tmlCalcIndCd = (JSPUtil.getParameter(request, prefix + "tml_calc_ind_cd", length));
            String[] issDt = (JSPUtil.getParameter(request, prefix + "iss_dt", length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
            String[] ttlCalcAmt = (JSPUtil.getParameter(request, prefix + "ttl_calc_amt", length));
            String[] apIfDt = (JSPUtil.getParameter(request, prefix + "ap_if_dt", length));
            String[] wrkDt = (JSPUtil.getParameter(request, prefix + "wrk_dt", length));
            String[] invOfcCd = (JSPUtil.getParameter(request, prefix + "inv_ofc_cd", length));
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
            String[] costOfcCd = (JSPUtil.getParameter(request, prefix + "cost_ofc_cd", length));
            String[] hpcCxlFlg = (JSPUtil.getParameter(request, prefix + "hpc_cxl_flg", length));
            String[] invCfmDt = (JSPUtil.getParameter(request, prefix + "inv_cfm_dt", length));
            String[] loclCreDt = (JSPUtil.getParameter(request, prefix + "locl_cre_dt", length));
            String[] toPrdDt = (JSPUtil.getParameter(request, prefix + "to_prd_dt", length));
            String[] invNo = (JSPUtil.getParameter(request, prefix + "inv_no", length));
            String[] vatAmt = (JSPUtil.getParameter(request, prefix + "vat_amt", length));
            String[] hldRmk = (JSPUtil.getParameter(request, prefix + "hld_rmk", length));
            String[] ydCd = (JSPUtil.getParameter(request, prefix + "yd_cd", length));
            String[] tmlInvStsCd = (JSPUtil.getParameter(request, prefix + "tml_inv_sts_cd", length));
            String[] leaCxlFlg = (JSPUtil.getParameter(request, prefix + "lea_cxl_flg", length));
            String[] stoDysIndCd = (JSPUtil.getParameter(request, prefix + "sto_dys_ind_cd", length));
            String[] hldFlg = (JSPUtil.getParameter(request, prefix + "hld_flg", length));
            String[] ttlInvAmt = (JSPUtil.getParameter(request, prefix + "ttl_inv_amt", length));
            String[] tmlSoOfcCtyCd = (JSPUtil.getParameter(request, prefix + "tml_so_ofc_cty_cd", length));
            String[] steGoveGdsSvcTaxAmt = (JSPUtil.getParameter(request, prefix + "ste_gove_gds_svc_tax_amt", length));
            String[] centGoveGdsSvcTaxAmt = (JSPUtil.getParameter(request, prefix + "cent_gove_gds_svc_tax_amt", length));
            String[] intgGoveGdsSvcTaxAmt = (JSPUtil.getParameter(request, prefix + "intg_gove_gds_svc_tax_amt", length));
            String[] cessAmt = (JSPUtil.getParameter(request, prefix + "cess_amt", length));
            String[] idaWhldTaxAmt = (JSPUtil.getParameter(request, prefix + "ida_whld_tax_amt", length));
            String[] idaGstTaxDdctSrcAmt = (JSPUtil.getParameter(request, prefix + "ida_gst_tax_ddct_src_amt", length));
            String[] svcAcctgCd = (JSPUtil.getParameter(request, prefix + "svc_acctg_cd", length));
            String[] idaInvFlg = (JSPUtil.getParameter(request, prefix + "ida_inv_flg", length));

            for (int i = 0; i < length; i++) {
                model = new TesTmlSoHdrVO();
                if (payDt[i] != null)
                    model.setPayDt(payDt[i]);
                if (ediFlg[i] != null)
                    model.setEdiFlg(ediFlg[i]);
                if (hpcCreFlg[i] != null)
                    model.setHpcCreFlg(hpcCreFlg[i]);
                if (tmlInvTpCd[i] != null)
                    model.setTmlInvTpCd(tmlInvTpCd[i]);
                if (apPayDt[i] != null)
                    model.setApPayDt(apPayDt[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (effDt[i] != null)
                    model.setEffDt(effDt[i]);
                if (tmlCostGrpCd[i] != null)
                    model.setTmlCostGrpCd(tmlCostGrpCd[i]);
                if (leaCreFlg[i] != null)
                    model.setLeaCreFlg(leaCreFlg[i]);
                if (apRvsCngFlg[i] != null)
                    model.setApRvsCngFlg(apRvsCngFlg[i]);
                if (rcvDt[i] != null)
                    model.setRcvDt(rcvDt[i]);
                if (payDueDt[i] != null)
                    model.setPayDueDt(payDueDt[i]);
                if (tmlInvRjctStsCd[i] != null)
                    model.setTmlInvRjctStsCd(tmlInvRjctStsCd[i]);
                if (hpcDeltFlg[i] != null)
                    model.setHpcDeltFlg(hpcDeltFlg[i]);
                if (fmPrdDt[i] != null)
                    model.setFmPrdDt(fmPrdDt[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                if (csrNo[i] != null)
                    model.setCsrNo(csrNo[i]);
                if (apCxlDt[i] != null)
                    model.setApCxlDt(apCxlDt[i]);
                if (invRjctRmk[i] != null)
                    model.setInvRjctRmk(invRjctRmk[i]);
                if (rtroTmlInvFlg[i] != null)
                    model.setRtroTmlInvFlg(rtroTmlInvFlg[i]);
                if (whldTaxAmt[i] != null)
                    model.setWhldTaxAmt(whldTaxAmt[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (costCdFtrRmk[i] != null)
                    model.setCostCdFtrRmk(costCdFtrRmk[i]);
                if (vndrSeq[i] != null)
                    model.setVndrSeq(vndrSeq[i]);
                if (tmlOdckFlg[i] != null)
                    model.setTmlOdckFlg(tmlOdckFlg[i]);
                if (tmlSoSeq[i] != null)
                    model.setTmlSoSeq(tmlSoSeq[i]);
                if (invRjctDt[i] != null)
                    model.setInvRjctDt(invRjctDt[i]);
                if (loclUpdDt[i] != null)
                    model.setLoclUpdDt(loclUpdDt[i]);
                if (currCd[i] != null)
                    model.setCurrCd(currCd[i]);
                if (deltFlg[i] != null)
                    model.setDeltFlg(deltFlg[i]);
                if (errInvNo[i] != null)
                    model.setErrInvNo(errInvNo[i]);
                if (payFlg[i] != null)
                    model.setPayFlg(payFlg[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (edwUpdDt[i] != null)
                    model.setEdwUpdDt(edwUpdDt[i]);
                if (tmlCalcIndCd[i] != null)
                    model.setTmlCalcIndCd(tmlCalcIndCd[i]);
                if (issDt[i] != null)
                    model.setIssDt(issDt[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (ttlCalcAmt[i] != null)
                    model.setTtlCalcAmt(ttlCalcAmt[i]);
                if (apIfDt[i] != null)
                    model.setApIfDt(apIfDt[i]);
                if (wrkDt[i] != null)
                    model.setWrkDt(wrkDt[i]);
                if (invOfcCd[i] != null)
                    model.setInvOfcCd(invOfcCd[i]);
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (costOfcCd[i] != null)
                    model.setCostOfcCd(costOfcCd[i]);
                if (hpcCxlFlg[i] != null)
                    model.setHpcCxlFlg(hpcCxlFlg[i]);
                if (invCfmDt[i] != null)
                    model.setInvCfmDt(invCfmDt[i]);
                if (loclCreDt[i] != null)
                    model.setLoclCreDt(loclCreDt[i]);
                if (toPrdDt[i] != null)
                    model.setToPrdDt(toPrdDt[i]);
                if (invNo[i] != null)
                    model.setInvNo(invNo[i]);
                if (vatAmt[i] != null)
                    model.setVatAmt(vatAmt[i]);
                if (hldRmk[i] != null)
                    model.setHldRmk(hldRmk[i]);
                if (ydCd[i] != null)
                    model.setYdCd(ydCd[i]);
                if (tmlInvStsCd[i] != null)
                    model.setTmlInvStsCd(tmlInvStsCd[i]);
                if (leaCxlFlg[i] != null)
                    model.setLeaCxlFlg(leaCxlFlg[i]);
                if (stoDysIndCd[i] != null)
                    model.setStoDysIndCd(stoDysIndCd[i]);
                if (hldFlg[i] != null)
                    model.setHldFlg(hldFlg[i]);
                if (ttlInvAmt[i] != null)
                    model.setTtlInvAmt(ttlInvAmt[i]);
                if (tmlSoOfcCtyCd[i] != null)
                    model.setTmlSoOfcCtyCd(tmlSoOfcCtyCd[i]);
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
                if (idaInvFlg[i] != null)
                	model.setIdaInvFlg(idaInvFlg[i]);
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getTesTmlSoHdrVOs();
    }

    /**
	 * VO 배열을 반환
	 * @return TesTmlSoHdrVO[]
	 */
    public TesTmlSoHdrVO[] getTesTmlSoHdrVOs() {
        TesTmlSoHdrVO[] vos = (TesTmlSoHdrVO[]) models.toArray(new TesTmlSoHdrVO[models.size()]);
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
        this.payDt = this.payDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ediFlg = this.ediFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hpcCreFlg = this.hpcCreFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlInvTpCd = this.tmlInvTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.apPayDt = this.apPayDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.effDt = this.effDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlCostGrpCd = this.tmlCostGrpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.leaCreFlg = this.leaCreFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.apRvsCngFlg = this.apRvsCngFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rcvDt = this.rcvDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.payDueDt = this.payDueDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlInvRjctStsCd = this.tmlInvRjctStsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hpcDeltFlg = this.hpcDeltFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fmPrdDt = this.fmPrdDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.csrNo = this.csrNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.apCxlDt = this.apCxlDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.invRjctRmk = this.invRjctRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rtroTmlInvFlg = this.rtroTmlInvFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.whldTaxAmt = this.whldTaxAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.costCdFtrRmk = this.costCdFtrRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vndrSeq = this.vndrSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlOdckFlg = this.tmlOdckFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlSoSeq = this.tmlSoSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.invRjctDt = this.invRjctDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.loclUpdDt = this.loclUpdDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.currCd = this.currCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.deltFlg = this.deltFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.errInvNo = this.errInvNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.payFlg = this.payFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.edwUpdDt = this.edwUpdDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlCalcIndCd = this.tmlCalcIndCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.issDt = this.issDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ttlCalcAmt = this.ttlCalcAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.apIfDt = this.apIfDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.wrkDt = this.wrkDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.invOfcCd = this.invOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.costOfcCd = this.costOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hpcCxlFlg = this.hpcCxlFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.invCfmDt = this.invCfmDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.loclCreDt = this.loclCreDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.toPrdDt = this.toPrdDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.invNo = this.invNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vatAmt = this.vatAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hldRmk = this.hldRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ydCd = this.ydCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlInvStsCd = this.tmlInvStsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.leaCxlFlg = this.leaCxlFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.stoDysIndCd = this.stoDysIndCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hldFlg = this.hldFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ttlInvAmt = this.ttlInvAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlSoOfcCtyCd = this.tmlSoOfcCtyCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.steGoveGdsSvcTaxAmt = this.steGoveGdsSvcTaxAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.centGoveGdsSvcTaxAmt = this.centGoveGdsSvcTaxAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.intgGoveGdsSvcTaxAmt = this.intgGoveGdsSvcTaxAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cessAmt = this.cessAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.idaWhldTaxAmt = this.idaWhldTaxAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.idaGstTaxDdctSrcAmt = this.idaGstTaxDdctSrcAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.svcAcctgCd = this.svcAcctgCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.idaInvFlg = this.idaInvFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
