/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PriSpCtrtPtyVO.java
*@FileTitle : PriSpCtrtPtyVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.03
*@LastModifier : 공백진
*@LastVersion : 1.0
* 2009.09.03 공백진 
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
 * @author 공백진
 * @since J2EE 1.6
 * @see AbstractValueObject
 */
public class PriSpCtrtPtyVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L;

    private Collection<PriSpCtrtPtyVO> models = new ArrayList<PriSpCtrtPtyVO>();

    /* Column Info */
    private String amdtSeq = null;

    /* Column Info */
    private String creDt = null;

    /* Column Info */
    private String ctrtPtySgnTitNm = null;

    /* Page Number */
    private String pagerows = null;

    /* Column Info */
    private String prcProgStsCd = null;

    /* Column Info */
    private String ctrtCustSlsOfcCd = null;

    /* VO Data Value( C:Creation, U:Update, D:Delete ) */
    private String ibflag = null;

    /* Column Info */
    private String prcCtrtPtyTpCd = null;

    /* Column Info */
    private String ctrtPtyAddr = null;

    /* Column Info */
    private String custCntCd = null;

    /* Column Info */
    private String updUsrId = null;

    /* Column Info */
    private String updDt = null;

    /* Column Info */
    private String acptOfcCd = null;

    /* Column Info */
    private String acptDt = null;

    /* Column Info */
    private String srcInfoCd = null;

    /* Column Info */
    private String acptUsrId = null;

    /* Column Info */
    private String custSeq = null;

    /* Column Info */
    private String ctrtPtyNm = null;

    /* Column Info */
    private String creUsrId = null;

    /* Column Info */
    private String n1stCmncAmdtSeq = null;

    /* Column Info */
    private String propNo = null;

    /* Column Info */
    private String ctrtCustSrepCd = null;

    /* Column Info */
    private String ctrtPtySgnNm = null;

    /* Column Info */
    private String ctrtCustValSgmCd = null;

    /* Column Info */
    private String n1stCmncDt = null;

    /* Column Info */
    private String custLglEngNm = null;

    /*	테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new HashMap<String, String>();

    /*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new HashMap<String, String>();

    public PriSpCtrtPtyVO() {
    }

    public PriSpCtrtPtyVO(String ibflag, String pagerows, String propNo, String amdtSeq, String prcCtrtPtyTpCd, String custCntCd, String custSeq, String ctrtCustValSgmCd, String ctrtCustSrepCd, String ctrtCustSlsOfcCd, String ctrtPtyNm, String ctrtPtyAddr, String ctrtPtySgnNm, String ctrtPtySgnTitNm, String prcProgStsCd, String srcInfoCd, String n1stCmncAmdtSeq, String n1stCmncDt, String acptUsrId, String acptOfcCd, String acptDt, String creUsrId, String creDt, String updUsrId, String updDt, String custLglEngNm) {
        this.amdtSeq = amdtSeq;
        this.creDt = creDt;
        this.ctrtPtySgnTitNm = ctrtPtySgnTitNm;
        this.pagerows = pagerows;
        this.prcProgStsCd = prcProgStsCd;
        this.ctrtCustSlsOfcCd = ctrtCustSlsOfcCd;
        this.ibflag = ibflag;
        this.prcCtrtPtyTpCd = prcCtrtPtyTpCd;
        this.ctrtPtyAddr = ctrtPtyAddr;
        this.custCntCd = custCntCd;
        this.updUsrId = updUsrId;
        this.updDt = updDt;
        this.acptOfcCd = acptOfcCd;
        this.acptDt = acptDt;
        this.srcInfoCd = srcInfoCd;
        this.acptUsrId = acptUsrId;
        this.custSeq = custSeq;
        this.ctrtPtyNm = ctrtPtyNm;
        this.creUsrId = creUsrId;
        this.n1stCmncAmdtSeq = n1stCmncAmdtSeq;
        this.propNo = propNo;
        this.ctrtCustSrepCd = ctrtCustSrepCd;
        this.ctrtPtySgnNm = ctrtPtySgnNm;
        this.ctrtCustValSgmCd = ctrtCustValSgmCd;
        this.n1stCmncDt = n1stCmncDt;
        this.custLglEngNm = custLglEngNm;
    }

    /**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("amdt_seq", getAmdtSeq());
        this.hashColumns.put("cre_dt", getCreDt());
        this.hashColumns.put("ctrt_pty_sgn_tit_nm", getCtrtPtySgnTitNm());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("prc_prog_sts_cd", getPrcProgStsCd());
        this.hashColumns.put("ctrt_cust_sls_ofc_cd", getCtrtCustSlsOfcCd());
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("prc_ctrt_pty_tp_cd", getPrcCtrtPtyTpCd());
        this.hashColumns.put("ctrt_pty_addr", getCtrtPtyAddr());
        this.hashColumns.put("cust_cnt_cd", getCustCntCd());
        this.hashColumns.put("upd_usr_id", getUpdUsrId());
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("acpt_ofc_cd", getAcptOfcCd());
        this.hashColumns.put("acpt_dt", getAcptDt());
        this.hashColumns.put("src_info_cd", getSrcInfoCd());
        this.hashColumns.put("acpt_usr_id", getAcptUsrId());
        this.hashColumns.put("cust_seq", getCustSeq());
        this.hashColumns.put("ctrt_pty_nm", getCtrtPtyNm());
        this.hashColumns.put("cre_usr_id", getCreUsrId());
        this.hashColumns.put("n1st_cmnc_amdt_seq", getN1stCmncAmdtSeq());
        this.hashColumns.put("prop_no", getPropNo());
        this.hashColumns.put("ctrt_cust_srep_cd", getCtrtCustSrepCd());
        this.hashColumns.put("ctrt_pty_sgn_nm", getCtrtPtySgnNm());
        this.hashColumns.put("ctrt_cust_val_sgm_cd", getCtrtCustValSgmCd());
        this.hashColumns.put("n1st_cmnc_dt", getN1stCmncDt());
        this.hashColumns.put("cust_lgl_eng_nm", getCustLglEngNm());
        return this.hashColumns;
    }

    /**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("amdt_seq", "amdtSeq");
        this.hashFields.put("cre_dt", "creDt");
        this.hashFields.put("ctrt_pty_sgn_tit_nm", "ctrtPtySgnTitNm");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("prc_prog_sts_cd", "prcProgStsCd");
        this.hashFields.put("ctrt_cust_sls_ofc_cd", "ctrtCustSlsOfcCd");
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("prc_ctrt_pty_tp_cd", "prcCtrtPtyTpCd");
        this.hashFields.put("ctrt_pty_addr", "ctrtPtyAddr");
        this.hashFields.put("cust_cnt_cd", "custCntCd");
        this.hashFields.put("upd_usr_id", "updUsrId");
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("acpt_ofc_cd", "acptOfcCd");
        this.hashFields.put("acpt_dt", "acptDt");
        this.hashFields.put("src_info_cd", "srcInfoCd");
        this.hashFields.put("acpt_usr_id", "acptUsrId");
        this.hashFields.put("cust_seq", "custSeq");
        this.hashFields.put("ctrt_pty_nm", "ctrtPtyNm");
        this.hashFields.put("cre_usr_id", "creUsrId");
        this.hashFields.put("n1st_cmnc_amdt_seq", "n1stCmncAmdtSeq");
        this.hashFields.put("prop_no", "propNo");
        this.hashFields.put("ctrt_cust_srep_cd", "ctrtCustSrepCd");
        this.hashFields.put("ctrt_pty_sgn_nm", "ctrtPtySgnNm");
        this.hashFields.put("ctrt_cust_val_sgm_cd", "ctrtCustValSgmCd");
        this.hashFields.put("n1st_cmnc_dt", "n1stCmncDt");
        this.hashFields.put("cust_lgl_eng_nm", "custLglEngNm");
        return this.hashFields;
    }

    /**
	 * Column Info
	 * @return amdtSeq
	 */
    public String getAmdtSeq() {
        return this.amdtSeq;
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
	 * @return ctrtPtySgnTitNm
	 */
    public String getCtrtPtySgnTitNm() {
        return this.ctrtPtySgnTitNm;
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
	 * @return prcProgStsCd
	 */
    public String getPrcProgStsCd() {
        return this.prcProgStsCd;
    }

    /**
	 * Column Info
	 * @return ctrtCustSlsOfcCd
	 */
    public String getCtrtCustSlsOfcCd() {
        return this.ctrtCustSlsOfcCd;
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
	 * @return prcCtrtPtyTpCd
	 */
    public String getPrcCtrtPtyTpCd() {
        return this.prcCtrtPtyTpCd;
    }

    /**
	 * Column Info
	 * @return ctrtPtyAddr
	 */
    public String getCtrtPtyAddr() {
        return this.ctrtPtyAddr;
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
	 * @return acptOfcCd
	 */
    public String getAcptOfcCd() {
        return this.acptOfcCd;
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
	 * @return srcInfoCd
	 */
    public String getSrcInfoCd() {
        return this.srcInfoCd;
    }

    /**
	 * Column Info
	 * @return acptUsrId
	 */
    public String getAcptUsrId() {
        return this.acptUsrId;
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
	 * @return ctrtPtyNm
	 */
    public String getCtrtPtyNm() {
        return this.ctrtPtyNm;
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
	 * @return n1stCmncAmdtSeq
	 */
    public String getN1stCmncAmdtSeq() {
        return this.n1stCmncAmdtSeq;
    }

    /**
	 * Column Info
	 * @return propNo
	 */
    public String getPropNo() {
        return this.propNo;
    }

    /**
	 * Column Info
	 * @return ctrtCustSrepCd
	 */
    public String getCtrtCustSrepCd() {
        return this.ctrtCustSrepCd;
    }

    /**
	 * Column Info
	 * @return ctrtPtySgnNm
	 */
    public String getCtrtPtySgnNm() {
        return this.ctrtPtySgnNm;
    }

    /**
	 * Column Info
	 * @return ctrtCustValSgmCd
	 */
    public String getCtrtCustValSgmCd() {
        return this.ctrtCustValSgmCd;
    }

    /**
	 * Column Info
	 * @return n1stCmncDt
	 */
    public String getN1stCmncDt() {
        return this.n1stCmncDt;
    }

    /**
	 * Column Info
	 * @param amdtSeq
	 */
    public void setAmdtSeq(String amdtSeq) {
        this.amdtSeq = amdtSeq;
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
	 * @param ctrtPtySgnTitNm
	 */
    public void setCtrtPtySgnTitNm(String ctrtPtySgnTitNm) {
        this.ctrtPtySgnTitNm = ctrtPtySgnTitNm;
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
	 * @param prcProgStsCd
	 */
    public void setPrcProgStsCd(String prcProgStsCd) {
        this.prcProgStsCd = prcProgStsCd;
    }

    /**
	 * Column Info
	 * @param ctrtCustSlsOfcCd
	 */
    public void setCtrtCustSlsOfcCd(String ctrtCustSlsOfcCd) {
        this.ctrtCustSlsOfcCd = ctrtCustSlsOfcCd;
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
	 * @param prcCtrtPtyTpCd
	 */
    public void setPrcCtrtPtyTpCd(String prcCtrtPtyTpCd) {
        this.prcCtrtPtyTpCd = prcCtrtPtyTpCd;
    }

    /**
	 * Column Info
	 * @param ctrtPtyAddr
	 */
    public void setCtrtPtyAddr(String ctrtPtyAddr) {
        this.ctrtPtyAddr = ctrtPtyAddr;
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
	 * @param acptOfcCd
	 */
    public void setAcptOfcCd(String acptOfcCd) {
        this.acptOfcCd = acptOfcCd;
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
	 * @param srcInfoCd
	 */
    public void setSrcInfoCd(String srcInfoCd) {
        this.srcInfoCd = srcInfoCd;
    }

    /**
	 * Column Info
	 * @param acptUsrId
	 */
    public void setAcptUsrId(String acptUsrId) {
        this.acptUsrId = acptUsrId;
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
	 * @param ctrtPtyNm
	 */
    public void setCtrtPtyNm(String ctrtPtyNm) {
        this.ctrtPtyNm = ctrtPtyNm;
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
	 * @param n1stCmncAmdtSeq
	 */
    public void setN1stCmncAmdtSeq(String n1stCmncAmdtSeq) {
        this.n1stCmncAmdtSeq = n1stCmncAmdtSeq;
    }

    /**
	 * Column Info
	 * @param propNo
	 */
    public void setPropNo(String propNo) {
        this.propNo = propNo;
    }

    /**
	 * Column Info
	 * @param ctrtCustSrepCd
	 */
    public void setCtrtCustSrepCd(String ctrtCustSrepCd) {
        this.ctrtCustSrepCd = ctrtCustSrepCd;
    }

    /**
	 * Column Info
	 * @param ctrtPtySgnNm
	 */
    public void setCtrtPtySgnNm(String ctrtPtySgnNm) {
        this.ctrtPtySgnNm = ctrtPtySgnNm;
    }

    /**
	 * Column Info
	 * @param ctrtCustValSgmCd
	 */
    public void setCtrtCustValSgmCd(String ctrtCustValSgmCd) {
        this.ctrtCustValSgmCd = ctrtCustValSgmCd;
    }

    /**
	 * Column Info
	 * @param n1stCmncDt
	 */
    public void setN1stCmncDt(String n1stCmncDt) {
        this.n1stCmncDt = n1stCmncDt;
    }

    public void setCustLglEngNm(String custLglEngNm) {
        this.custLglEngNm = custLglEngNm;
    }

    public String getCustLglEngNm() {
        return this.custLglEngNm;
    }

    /**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
    public void fromRequest(HttpServletRequest request) {
        setAmdtSeq(JSPUtil.getParameter(request, "amdt_seq", ""));
        setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
        setCtrtPtySgnTitNm(JSPUtil.getParameter(request, "ctrt_pty_sgn_tit_nm", ""));
        setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
        setPrcProgStsCd(JSPUtil.getParameter(request, "prc_prog_sts_cd", ""));
        setCtrtCustSlsOfcCd(JSPUtil.getParameter(request, "ctrt_cust_sls_ofc_cd", ""));
        setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
        setPrcCtrtPtyTpCd(JSPUtil.getParameter(request, "prc_ctrt_pty_tp_cd", ""));
        setCtrtPtyAddr(JSPUtil.getParameter(request, "ctrt_pty_addr", ""));
        setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
        setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
        setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
        setAcptOfcCd(JSPUtil.getParameter(request, "acpt_ofc_cd", ""));
        setAcptDt(JSPUtil.getParameter(request, "acpt_dt", ""));
        setSrcInfoCd(JSPUtil.getParameter(request, "src_info_cd", ""));
        setAcptUsrId(JSPUtil.getParameter(request, "acpt_usr_id", ""));
        setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
        setCtrtPtyNm(JSPUtil.getParameter(request, "ctrt_pty_nm", ""));
        setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
        setN1stCmncAmdtSeq(JSPUtil.getParameter(request, "n1st_cmnc_amdt_seq", ""));
        setPropNo(JSPUtil.getParameter(request, "prop_no", ""));
        setCtrtCustSrepCd(JSPUtil.getParameter(request, "ctrt_cust_srep_cd", ""));
        setCtrtPtySgnNm(JSPUtil.getParameter(request, "ctrt_pty_sgn_nm", ""));
        setCtrtCustValSgmCd(JSPUtil.getParameter(request, "ctrt_cust_val_sgm_cd", ""));
        setN1stCmncDt(JSPUtil.getParameter(request, "n1st_cmnc_dt", ""));
    }

    /**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriSpCtrtPtyVO[]
	 */
    public PriSpCtrtPtyVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriSpCtrtPtyVO[]
	 */
    public PriSpCtrtPtyVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        PriSpCtrtPtyVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] amdtSeq = (JSPUtil.getParameter(request, prefix + "amdt_seq", length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
            String[] ctrtPtySgnTitNm = (JSPUtil.getParameter(request, prefix + "ctrt_pty_sgn_tit_nm", length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
            String[] prcProgStsCd = (JSPUtil.getParameter(request, prefix + "prc_prog_sts_cd", length));
            String[] ctrtCustSlsOfcCd = (JSPUtil.getParameter(request, prefix + "ctrt_cust_sls_ofc_cd", length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
            String[] prcCtrtPtyTpCd = (JSPUtil.getParameter(request, prefix + "prc_ctrt_pty_tp_cd", length));
            String[] ctrtPtyAddr = (JSPUtil.getParameter(request, prefix + "ctrt_pty_addr", length));
            String[] custCntCd = (JSPUtil.getParameter(request, prefix + "cust_cnt_cd", length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
            String[] acptOfcCd = (JSPUtil.getParameter(request, prefix + "acpt_ofc_cd", length));
            String[] acptDt = (JSPUtil.getParameter(request, prefix + "acpt_dt", length));
            String[] srcInfoCd = (JSPUtil.getParameter(request, prefix + "src_info_cd", length));
            String[] acptUsrId = (JSPUtil.getParameter(request, prefix + "acpt_usr_id", length));
            String[] custSeq = (JSPUtil.getParameter(request, prefix + "cust_seq", length));
            String[] ctrtPtyNm = (JSPUtil.getParameter(request, prefix + "ctrt_pty_nm", length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
            String[] n1stCmncAmdtSeq = (JSPUtil.getParameter(request, prefix + "n1st_cmnc_amdt_seq", length));
            String[] propNo = (JSPUtil.getParameter(request, prefix + "prop_no", length));
            String[] ctrtCustSrepCd = (JSPUtil.getParameter(request, prefix + "ctrt_cust_srep_cd", length));
            String[] ctrtPtySgnNm = (JSPUtil.getParameter(request, prefix + "ctrt_pty_sgn_nm", length));
            String[] ctrtCustValSgmCd = (JSPUtil.getParameter(request, prefix + "ctrt_cust_val_sgm_cd", length));
            String[] n1stCmncDt = (JSPUtil.getParameter(request, prefix + "n1st_cmnc_dt", length));
            for (int i = 0; i < length; i++) {
                model = new PriSpCtrtPtyVO();
                if (amdtSeq[i] != null)
                    model.setAmdtSeq(amdtSeq[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (ctrtPtySgnTitNm[i] != null)
                    model.setCtrtPtySgnTitNm(ctrtPtySgnTitNm[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (prcProgStsCd[i] != null)
                    model.setPrcProgStsCd(prcProgStsCd[i]);
                if (ctrtCustSlsOfcCd[i] != null)
                    model.setCtrtCustSlsOfcCd(ctrtCustSlsOfcCd[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (prcCtrtPtyTpCd[i] != null)
                    model.setPrcCtrtPtyTpCd(prcCtrtPtyTpCd[i]);
                if (ctrtPtyAddr[i] != null)
                    model.setCtrtPtyAddr(ctrtPtyAddr[i]);
                if (custCntCd[i] != null)
                    model.setCustCntCd(custCntCd[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (acptOfcCd[i] != null)
                    model.setAcptOfcCd(acptOfcCd[i]);
                if (acptDt[i] != null)
                    model.setAcptDt(acptDt[i]);
                if (srcInfoCd[i] != null)
                    model.setSrcInfoCd(srcInfoCd[i]);
                if (acptUsrId[i] != null)
                    model.setAcptUsrId(acptUsrId[i]);
                if (custSeq[i] != null)
                    model.setCustSeq(custSeq[i]);
                if (ctrtPtyNm[i] != null)
                    model.setCtrtPtyNm(ctrtPtyNm[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (n1stCmncAmdtSeq[i] != null)
                    model.setN1stCmncAmdtSeq(n1stCmncAmdtSeq[i]);
                if (propNo[i] != null)
                    model.setPropNo(propNo[i]);
                if (ctrtCustSrepCd[i] != null)
                    model.setCtrtCustSrepCd(ctrtCustSrepCd[i]);
                if (ctrtPtySgnNm[i] != null)
                    model.setCtrtPtySgnNm(ctrtPtySgnNm[i]);
                if (ctrtCustValSgmCd[i] != null)
                    model.setCtrtCustValSgmCd(ctrtCustValSgmCd[i]);
                if (n1stCmncDt[i] != null)
                    model.setN1stCmncDt(n1stCmncDt[i]);
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getPriSpCtrtPtyVOs();
    }

    /**
	 * VO 배열을 반환
	 * @return PriSpCtrtPtyVO[]
	 */
    public PriSpCtrtPtyVO[] getPriSpCtrtPtyVOs() {
        PriSpCtrtPtyVO[] vos = (PriSpCtrtPtyVO[]) models.toArray(new PriSpCtrtPtyVO[models.size()]);
        return vos;
    }

    /**
	 * VO Class의 내용을 String으로 변환
	 */
    public String toString() {
        StringBuffer ret = new StringBuffer();
        Field[] field = this.getClass().getDeclaredFields();
        String space = "";
        try {
            for (int i = 0; i < field.length; i++) {
                String[] arr = null;
                arr = getField(field, i);
                if (arr != null) {
                    for (int j = 0; j < arr.length; j++) {
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
        try {
            arr = (String[]) field[i].get(this);
        } catch (Exception ex) {
            arr = null;
        }
        return arr;
    }

    /**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
    public void unDataFormat() {
        this.amdtSeq = this.amdtSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ctrtPtySgnTitNm = this.ctrtPtySgnTitNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.prcProgStsCd = this.prcProgStsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ctrtCustSlsOfcCd = this.ctrtCustSlsOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.prcCtrtPtyTpCd = this.prcCtrtPtyTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ctrtPtyAddr = this.ctrtPtyAddr.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.custCntCd = this.custCntCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.acptOfcCd = this.acptOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.acptDt = this.acptDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.srcInfoCd = this.srcInfoCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.acptUsrId = this.acptUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.custSeq = this.custSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ctrtPtyNm = this.ctrtPtyNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n1stCmncAmdtSeq = this.n1stCmncAmdtSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.propNo = this.propNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ctrtCustSrepCd = this.ctrtCustSrepCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ctrtPtySgnNm = this.ctrtPtySgnNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ctrtCustValSgmCd = this.ctrtCustValSgmCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n1stCmncDt = this.n1stCmncDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.custLglEngNm = this.custLglEngNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
