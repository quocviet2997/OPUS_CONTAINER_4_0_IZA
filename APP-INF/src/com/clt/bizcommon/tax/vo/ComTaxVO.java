/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : ComTaxVO.java
*@FileTitle : ComTaxVO
*Open Issues :
*Change history :
*@LastModifyDate : 2017.06.01
*@LastModifier : 
*@LastVersion : 1.0
* 2017.06.01 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.tax.vo;

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
public class ComTaxVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L;

    private Collection<ComTaxVO> models = new ArrayList<ComTaxVO>();

    /* VO Data Value( C:Creation, U:Update, D:Delete ) */
    private String ibflag = null;

    /* Page Number */
    private String pagerows = null;

    /* Column Info */
    private String vndrSeq = null;

    /* Column Info */
    private String ofcCd = null;

    /* Column Info */
    private String cntCd = null;

    /* Column Info */
    private String inCntFlg = null;

    /* Column Info */
    private String vndrGstNo = null;

    /* Column Info */
    private String idaGstNo = null;

    /* Column Info */
    private String svcAcctgCd = null;

    /* Column Info */
    private String vatAmt = null;

    /* Column Info */
    private String sgstAmt = null;

    /* Column Info */
    private String cgstAmt = null;

    /* Column Info */
    private String igstAmt = null;

    /* Column Info */
    private String cessAmt = null;

    /* Column Info */
    private String whldAmt = null;

    /* Column Info */
    private String whld2Amt = null;

    /* Column Info */
    private String gsttdsAmt = null;

    /* Column Info */
    private String svcAcctgCds = null;

    /* Column Info */
    private String vndrCostCd = null;

    /* Column Info */
    private String vndrCostNm = null;

    /* Column Info */
    private String cntrVndrSvcCd = null;

    /* Column Info */
    private String cntrVndrSvcNm = null;

    /* Column Info */
    private String useFlg = null;

    /*	테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

    /*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();

    public ComTaxVO() {
    }

    public ComTaxVO(String ibflag, String pagerows, String vndrSeq, String ofcCd, String cntCd, String inCntFlg, String vndrGstNo, String idaGstNo, String svcAcctgCd, String vatAmt, String sgstAmt, String cgstAmt, String igstAmt, String cessAmt, String whldAmt, String whld2Amt, String gsttdsAmt, String svcAcctgCds, String vndrCostCd, String vndrCostNm, String cntrVndrSvcCd, String cntrVndrSvcNm, String useFlg) {
        this.ibflag = ibflag;
        this.pagerows = pagerows;
        this.vndrSeq = vndrSeq;
        this.ofcCd = ofcCd;
        this.cntCd = cntCd;
        this.inCntFlg = inCntFlg;
        this.vndrGstNo = vndrGstNo;
        this.idaGstNo = idaGstNo;
        this.svcAcctgCd = svcAcctgCd;
        this.vatAmt = vatAmt;
        this.sgstAmt = sgstAmt;
        this.cgstAmt = cgstAmt;
        this.igstAmt = igstAmt;
        this.cessAmt = cessAmt;
        this.whldAmt = whldAmt;
        this.whld2Amt = whld2Amt;
        this.gsttdsAmt = gsttdsAmt;
        this.svcAcctgCds = svcAcctgCds;
        this.vndrCostCd = vndrCostCd;
        this.vndrCostNm = vndrCostNm;
        this.cntrVndrSvcCd = cntrVndrSvcCd;
        this.cntrVndrSvcNm = cntrVndrSvcNm;
        this.useFlg = useFlg;
    }

    /**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("vndr_seq", getVndrSeq());
        this.hashColumns.put("ofc_cd", getOfcCd());
        this.hashColumns.put("cnt_cd", getCntCd());
        this.hashColumns.put("in_cnt_flg", getInCntFlg());
        this.hashColumns.put("vndr_gst_no", getVndrGstNo());
        this.hashColumns.put("ida_gst_no", getIdaGstNo());
        this.hashColumns.put("svc_acctg_cd", getSvcAcctgCd());
        this.hashColumns.put("vat_amt", getVatAmt());
        this.hashColumns.put("sgst_amt", getSgstAmt());
        this.hashColumns.put("cgst_amt", getCgstAmt());
        this.hashColumns.put("igst_amt", getIgstAmt());
        this.hashColumns.put("cess_amt", getCessAmt());
        this.hashColumns.put("whld_amt", getWhldAmt());
        this.hashColumns.put("whld2amt", getWhld2Amt());
        this.hashColumns.put("gsttds_amt", getGsttdsAmt());
        this.hashColumns.put("svc_acctg_cds", getSvcAcctgCds());
        this.hashColumns.put("vndr_cost_cd", getVndrCostCd());
        this.hashColumns.put("vndr_cost_nm", getVndrCostNm());
        this.hashColumns.put("cntr_vndr_svc_cd", getCntrVndrSvcCd());
        this.hashColumns.put("cntr_vndr_svc_nm", getCntrVndrSvcNm());
        this.hashColumns.put("use_flg", getUseFlg());
        return this.hashColumns;
    }

    /**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("vndr_seq", "vndrSeq");
        this.hashFields.put("ofc_cd", "ofcCd");
        this.hashFields.put("cnt_cd", "cntCd");
        this.hashFields.put("in_cnt_flg", "inCntFlg");
        this.hashFields.put("vndr_gst_no", "vndrGstNo");
        this.hashFields.put("ida_gst_no", "idaGstNo");
        this.hashFields.put("svc_acctg_cd", "svcAcctgCd");
        this.hashFields.put("vat_amt", "vatAmt");
        this.hashFields.put("sgst_amt", "sgstAmt");
        this.hashFields.put("cgst_amt", "cgstAmt");
        this.hashFields.put("igst_amt", "igstAmt");
        this.hashFields.put("cess_amt", "cessAmt");
        this.hashFields.put("whld_amt", "whldAmt");
        this.hashFields.put("whld2amt", "whld2Amt");
        this.hashFields.put("gsttds_amt", "gsttdsAmt");
        this.hashFields.put("svc_acctg_cds", "svcAcctgCds");
        this.hashFields.put("vndr_cost_cd", "vndrCostCd");
        this.hashFields.put("vndr_cost_nm", "vndrCostNm");
        this.hashFields.put("cntr_vndr_svc_cd", "cntrVndrSvcCd");
        this.hashFields.put("cntr_vndr_svc_nm", "cntrVndrSvcNm");
        this.hashFields.put("use_flg", "useFlg");
        return this.hashFields;
    }

    /**
	 *
	 * @param String ibflag
	 */
    public void setIbflag(String ibflag) {
        this.ibflag = ibflag;
    }

    /**
	 * 
	 * @return String ibflag
	 */
    public String getIbflag() {
        return this.ibflag;
    }

    /**
	 *
	 * @param String pagerows
	 */
    public void setPagerows(String pagerows) {
        this.pagerows = pagerows;
    }

    /**
	 * 
	 * @return String pagerows
	 */
    public String getPagerows() {
        return this.pagerows;
    }

    /**
	 *
	 * @param String vndrSeq
	 */
    public void setVndrSeq(String vndrSeq) {
        this.vndrSeq = vndrSeq;
    }

    /**
	 * 
	 * @return String vndrSeq
	 */
    public String getVndrSeq() {
        return this.vndrSeq;
    }

    /**
	 *
	 * @param String ofcCd
	 */
    public void setOfcCd(String ofcCd) {
        this.ofcCd = ofcCd;
    }

    /**
	 * 
	 * @return String ofcCd
	 */
    public String getOfcCd() {
        return this.ofcCd;
    }

    /**
	 *
	 * @param String cntCd
	 */
    public void setCntCd(String cntCd) {
        this.cntCd = cntCd;
    }

    /**
	 * 
	 * @return String cntCd
	 */
    public String getCntCd() {
        return this.cntCd;
    }

    /**
	 *
	 * @param String inCntFlg
	 */
    public void setInCntFlg(String inCntFlg) {
        this.inCntFlg = inCntFlg;
    }

    /**
	 * 
	 * @return String inCntFlg
	 */
    public String getInCntFlg() {
        return this.inCntFlg;
    }

    /**
	 *
	 * @param String vndrGstNo
	 */
    public void setVndrGstNo(String vndrGstNo) {
        this.vndrGstNo = vndrGstNo;
    }

    /**
	 * 
	 * @return String vndrGstNo
	 */
    public String getVndrGstNo() {
        return this.vndrGstNo;
    }

    /**
	 *
	 * @param String idaGstNo
	 */
    public void setIdaGstNo(String idaGstNo) {
        this.idaGstNo = idaGstNo;
    }

    /**
	 * 
	 * @return String idaGstNo
	 */
    public String getIdaGstNo() {
        return this.idaGstNo;
    }

    /**
	 *
	 * @param String svcAcctgCd
	 */
    public void setSvcAcctgCd(String svcAcctgCd) {
        this.svcAcctgCd = svcAcctgCd;
    }

    /**
	 * 
	 * @return String svcAcctgCd
	 */
    public String getSvcAcctgCd() {
        return this.svcAcctgCd;
    }

    /**
	 *
	 * @param String vatAmt
	 */
    public void setVatAmt(String vatAmt) {
        this.vatAmt = vatAmt;
    }

    /**
	 * 
	 * @return String vatAmt
	 */
    public String getVatAmt() {
        return this.vatAmt;
    }

    /**
	 *
	 * @param String sgstAmt
	 */
    public void setSgstAmt(String sgstAmt) {
        this.sgstAmt = sgstAmt;
    }

    /**
	 * 
	 * @return String sgstAmt
	 */
    public String getSgstAmt() {
        return this.sgstAmt;
    }

    /**
	 *
	 * @param String cgstAmt
	 */
    public void setCgstAmt(String cgstAmt) {
        this.cgstAmt = cgstAmt;
    }

    /**
	 * 
	 * @return String cgstAmt
	 */
    public String getCgstAmt() {
        return this.cgstAmt;
    }

    /**
	 *
	 * @param String igstAmt
	 */
    public void setIgstAmt(String igstAmt) {
        this.igstAmt = igstAmt;
    }

    /**
	 * 
	 * @return String igstAmt
	 */
    public String getIgstAmt() {
        return this.igstAmt;
    }

    /**
	 *
	 * @param String cessAmt
	 */
    public void setCessAmt(String cessAmt) {
        this.cessAmt = cessAmt;
    }

    /**
	 * 
	 * @return String cessAmt
	 */
    public String getCessAmt() {
        return this.cessAmt;
    }

    /**
	 *
	 * @param String whldAmt
	 */
    public void setWhldAmt(String whldAmt) {
        this.whldAmt = whldAmt;
    }

    /**
	 * 
	 * @return String whldAmt
	 */
    public String getWhldAmt() {
        return this.whldAmt;
    }

    /**
	 *
	 * @param String whld2Amt
	 */
    public void setWhld2Amt(String whld2Amt) {
        this.whld2Amt = whld2Amt;
    }

    /**
	 * 
	 * @return String whld2Amt
	 */
    public String getWhld2Amt() {
        return this.whld2Amt;
    }

    /**
	 *
	 * @param String gsttdsAmt
	 */
    public void setGsttdsAmt(String gsttdsAmt) {
        this.gsttdsAmt = gsttdsAmt;
    }

    /**
	 * 
	 * @return String gsttdsAmt
	 */
    public String getGsttdsAmt() {
        return this.gsttdsAmt;
    }

    public void setSvcAcctgCds(String svcAcctgCds) {
        this.svcAcctgCds = svcAcctgCds;
    }

    public String getSvcAcctgCds() {
        return this.svcAcctgCds;
    }

    public void setVndrCostCd(String vndrCostCd) {
        this.vndrCostCd = vndrCostCd;
    }

    public String getVndrCostCd() {
        return this.vndrCostCd;
    }

    public void setVndrCostNm(String vndrCostNm) {
        this.vndrCostNm = vndrCostNm;
    }

    public String getVndrCostNm() {
        return this.vndrCostNm;
    }

    public void setCntrVndrSvcCd(String cntrVndrSvcCd) {
        this.cntrVndrSvcCd = cntrVndrSvcCd;
    }

    public String getCntrVndrSvcCd() {
        return this.cntrVndrSvcCd;
    }

    public void setCntrVndrSvcNm(String cntrVndrSvcNm) {
        this.cntrVndrSvcNm = cntrVndrSvcNm;
    }

    public String getCntrVndrSvcNm() {
        return this.cntrVndrSvcNm;
    }

    public void setUseFlg(String useFlg) {
        this.useFlg = useFlg;
    }

    public String getUseFlg() {
        return this.useFlg;
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
        setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
        setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
        setVndrSeq(JSPUtil.getParameter(request, prefix + "vndr_seq", ""));
        setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
        setCntCd(JSPUtil.getParameter(request, prefix + "cnt_cd", ""));
        setInCntFlg(JSPUtil.getParameter(request, prefix + "in_cnt_flg", ""));
        setVndrGstNo(JSPUtil.getParameter(request, prefix + "vndr_gst_no", ""));
        setIdaGstNo(JSPUtil.getParameter(request, prefix + "ida_gst_no", ""));
        setSvcAcctgCd(JSPUtil.getParameter(request, prefix + "svc_acctg_cd", ""));
        setVatAmt(JSPUtil.getParameter(request, prefix + "vat_amt", ""));
        setSgstAmt(JSPUtil.getParameter(request, prefix + "sgst_amt", ""));
        setCgstAmt(JSPUtil.getParameter(request, prefix + "cgst_amt", ""));
        setIgstAmt(JSPUtil.getParameter(request, prefix + "igst_amt", ""));
        setCessAmt(JSPUtil.getParameter(request, prefix + "cess_amt", ""));
        setWhldAmt(JSPUtil.getParameter(request, prefix + "whld_amt", ""));
        setWhld2Amt(JSPUtil.getParameter(request, prefix + "whld2amt", ""));
        setGsttdsAmt(JSPUtil.getParameter(request, prefix + "gsttds_amt", ""));
        setSvcAcctgCds(JSPUtil.getParameter(request, prefix + "svc_acctg_cds", ""));
        setVndrCostCd(JSPUtil.getParameter(request, prefix + "vndr_cost_cd", ""));
        setVndrCostNm(JSPUtil.getParameter(request, prefix + "vndr_cost_nm", ""));
        setCntrVndrSvcCd(JSPUtil.getParameter(request, prefix + "cntr_vndr_svc_cd", ""));
        setCntrVndrSvcNm(JSPUtil.getParameter(request, prefix + "cntr_vndr_svc_nm", ""));
        setUseFlg(JSPUtil.getParameter(request, prefix + "use_flg", ""));
    }

    /**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ComTaxVO[]
	 */
    public ComTaxVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ComTaxVO[]
	 */
    public ComTaxVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        ComTaxVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
            String[] vndrSeq = (JSPUtil.getParameter(request, prefix + "vndr_seq", length));
            String[] ofcCd = (JSPUtil.getParameter(request, prefix + "ofc_cd", length));
            String[] cntCd = (JSPUtil.getParameter(request, prefix + "cnt_cd", length));
            String[] inCntFlg = (JSPUtil.getParameter(request, prefix + "in_cnt_flg", length));
            String[] vndrGstNo = (JSPUtil.getParameter(request, prefix + "vndr_gst_no", length));
            String[] idaGstNo = (JSPUtil.getParameter(request, prefix + "ida_gst_no", length));
            String[] svcAcctgCd = (JSPUtil.getParameter(request, prefix + "svc_acctg_cd", length));
            String[] vatAmt = (JSPUtil.getParameter(request, prefix + "vat_amt", length));
            String[] sgstAmt = (JSPUtil.getParameter(request, prefix + "sgst_amt", length));
            String[] cgstAmt = (JSPUtil.getParameter(request, prefix + "cgst_amt", length));
            String[] igstAmt = (JSPUtil.getParameter(request, prefix + "igst_amt", length));
            String[] cessAmt = (JSPUtil.getParameter(request, prefix + "cess_amt", length));
            String[] whldAmt = (JSPUtil.getParameter(request, prefix + "whld_amt", length));
            String[] whld2Amt = (JSPUtil.getParameter(request, prefix + "whld2amt", length));
            String[] gsttdsAmt = (JSPUtil.getParameter(request, prefix + "gsttds_amt", length));
            String[] svcAcctgCds = (JSPUtil.getParameter(request, prefix + "svc_acctg_cds", length));
            String[] vndrCostCd = (JSPUtil.getParameter(request, prefix + "vndr_cost_cd", length));
            String[] vndrCostNm = (JSPUtil.getParameter(request, prefix + "vndr_cost_nm", length));
            String[] cntrVndrSvcCd = (JSPUtil.getParameter(request, prefix + "cntr_vndr_svc_cd", length));
            String[] cntrVndrSvcNm = (JSPUtil.getParameter(request, prefix + "cntr_vndr_svc_nm", length));
            String[] useFlg = (JSPUtil.getParameter(request, prefix + "use_flg", length));
	    	/* Add a field line, do not delete */
            for (int i = 0; i < length; i++) {
                model = new ComTaxVO();
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (vndrSeq[i] != null)
                    model.setVndrSeq(vndrSeq[i]);
                if (ofcCd[i] != null)
                    model.setOfcCd(ofcCd[i]);
                if (cntCd[i] != null)
                    model.setCntCd(cntCd[i]);
                if (inCntFlg[i] != null)
                    model.setInCntFlg(inCntFlg[i]);
                if (vndrGstNo[i] != null)
                    model.setVndrGstNo(vndrGstNo[i]);
                if (idaGstNo[i] != null)
                    model.setIdaGstNo(idaGstNo[i]);
                if (svcAcctgCd[i] != null)
                    model.setSvcAcctgCd(svcAcctgCd[i]);
                if (vatAmt[i] != null)
                    model.setVatAmt(vatAmt[i]);
                if (sgstAmt[i] != null)
                    model.setSgstAmt(sgstAmt[i]);
                if (cgstAmt[i] != null)
                    model.setCgstAmt(cgstAmt[i]);
                if (igstAmt[i] != null)
                    model.setIgstAmt(igstAmt[i]);
                if (cessAmt[i] != null)
                    model.setCessAmt(cessAmt[i]);
                if (whldAmt[i] != null)
                    model.setWhldAmt(whldAmt[i]);
                if (whld2Amt[i] != null)
                    model.setWhld2Amt(whld2Amt[i]);
                if (gsttdsAmt[i] != null)
                    model.setGsttdsAmt(gsttdsAmt[i]);
                if (svcAcctgCds[i] != null)
                    model.setSvcAcctgCds(svcAcctgCds[i]);
                if (vndrCostCd[i] != null)
                    model.setVndrCostCd(vndrCostCd[i]);
                if (vndrCostNm[i] != null)
                    model.setVndrCostNm(vndrCostNm[i]);
                if (cntrVndrSvcCd[i] != null)
                    model.setCntrVndrSvcCd(cntrVndrSvcCd[i]);
                if (cntrVndrSvcNm[i] != null)
                    model.setCntrVndrSvcNm(cntrVndrSvcNm[i]);
                if (useFlg[i] != null) 
		    		model.setUseFlg(useFlg[i]);
				/* Add a Method line, do not delete */
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getComTaxVOs();
    }

    /**
	 * VO 배열을 반환
	 * @return ComTaxVO[]
	 */
    public ComTaxVO[] getComTaxVOs() {
        ComTaxVO[] vos = (ComTaxVO[]) models.toArray(new ComTaxVO[models.size()]);
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
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vndrSeq = this.vndrSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ofcCd = this.ofcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cntCd = this.cntCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.inCntFlg = this.inCntFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vndrGstNo = this.vndrGstNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.idaGstNo = this.idaGstNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.svcAcctgCd = this.svcAcctgCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vatAmt = this.vatAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.sgstAmt = this.sgstAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cgstAmt = this.cgstAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.igstAmt = this.igstAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cessAmt = this.cessAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.whldAmt = this.whldAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.whld2Amt = this.whld2Amt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.gsttdsAmt = this.gsttdsAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.svcAcctgCds = this.svcAcctgCds.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vndrCostCd = this.vndrCostCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vndrCostNm = this.vndrCostNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cntrVndrSvcCd = this.cntrVndrSvcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cntrVndrSvcNm = this.cntrVndrSvcNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.useFlg = this.useFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
