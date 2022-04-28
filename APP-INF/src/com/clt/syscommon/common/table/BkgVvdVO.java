/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgVvdVO.java
*@FileTitle : BkgVvdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.01
*@LastModifier : 김병규
*@LastVersion : 1.0
* 2009.07.01 김병규 
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
 * @author 김병규
 * @since J2EE 1.6
 * @see AbstractValueObject
 */
public class BkgVvdVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L;

    private Collection<BkgVvdVO> models = new ArrayList<BkgVvdVO>();

    /* Column Info */
    private String updDt = null;

    /* Column Info */
    private String vslCd = null;

    /* Column Info */
    private String revVvdFlg = null;

    /* Column Info */
    private String podClptIndSeq = null;

    /* Column Info */
    private String creDt = null;

    /* Column Info */
    private String skdVoyNo = null;

    /* Column Info */
    private String bkgTrspMzdCd = null;

    /* Column Info */
    private String vslSeq = null;

    /* Column Info */
    private String skdDirCd = null;

    /* Page Number */
    private String pagerows = null;

    /* Column Info */
    private String podCd = null;

    /* Column Info */
    private String creUsrId = null;

    /* VO Data Value( C:Creation, U:Update, D:Delete ) */
    private String ibflag = null;

    /* Column Info */
    private String bkgNo = null;

    /* Column Info */
    private String polCd = null;

    /* Column Info */
    private String slanCd = null;

    /* Column Info */
    private String cntrLodgFlg = null;

    /* Column Info */
    private String polYdCd = null;

    /* Column Info */
    private String opCd = null;

    /* Column Info */
    private String polClptIndSeq = null;

    /* Column Info */
    private String vslPrePstCd = null;

    /* Column Info */
    private String podYdCd = null;

    /* Column Info */
    private String updUsrId = null;

    /* Column Info */
    private String splitFlg = null;

    /* Column Info */
    private String sourceBkgNo = null;
    
    /* Column Info */
    private String vslOrd = null;

    /*	테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new HashMap<String, String>();

    /*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new HashMap<String, String>();

    public BkgVvdVO() {
    }

    public BkgVvdVO(String ibflag, String pagerows, String bkgNo, String vslPrePstCd, String vslSeq, String slanCd, String vslCd, String skdVoyNo, String skdDirCd, String polClptIndSeq, String opCd, String polCd, String polYdCd, String podCd, String podYdCd, String bkgTrspMzdCd, String cntrLodgFlg, String revVvdFlg, String creUsrId, String creDt, String updUsrId, String updDt, String podClptIndSeq, String splitFlg, String sourceBkgNo, String vslOrd) {
        this.updDt = updDt;
        this.vslCd = vslCd;
        this.revVvdFlg = revVvdFlg;
        this.podClptIndSeq = podClptIndSeq;
        this.creDt = creDt;
        this.skdVoyNo = skdVoyNo;
        this.bkgTrspMzdCd = bkgTrspMzdCd;
        this.vslSeq = vslSeq;
        this.skdDirCd = skdDirCd;
        this.pagerows = pagerows;
        this.podCd = podCd;
        this.creUsrId = creUsrId;
        this.ibflag = ibflag;
        this.bkgNo = bkgNo;
        this.polCd = polCd;
        this.slanCd = slanCd;
        this.cntrLodgFlg = cntrLodgFlg;
        this.polYdCd = polYdCd;
        this.opCd = opCd;
        this.polClptIndSeq = polClptIndSeq;
        this.vslPrePstCd = vslPrePstCd;
        this.podYdCd = podYdCd;
        this.updUsrId = updUsrId;
        this.splitFlg = splitFlg;
        this.sourceBkgNo = sourceBkgNo;
        this.vslOrd = vslOrd;
    }

    /**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("vsl_cd", getVslCd());
        this.hashColumns.put("rev_vvd_flg", getRevVvdFlg());
        this.hashColumns.put("pod_clpt_ind_seq", getPodClptIndSeq());
        this.hashColumns.put("cre_dt", getCreDt());
        this.hashColumns.put("skd_voy_no", getSkdVoyNo());
        this.hashColumns.put("bkg_trsp_mzd_cd", getBkgTrspMzdCd());
        this.hashColumns.put("vsl_seq", getVslSeq());
        this.hashColumns.put("skd_dir_cd", getSkdDirCd());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("pod_cd", getPodCd());
        this.hashColumns.put("cre_usr_id", getCreUsrId());
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("bkg_no", getBkgNo());
        this.hashColumns.put("pol_cd", getPolCd());
        this.hashColumns.put("slan_cd", getSlanCd());
        this.hashColumns.put("cntr_lodg_flg", getCntrLodgFlg());
        this.hashColumns.put("pol_yd_cd", getPolYdCd());
        this.hashColumns.put("op_cd", getOpCd());
        this.hashColumns.put("pol_clpt_ind_seq", getPolClptIndSeq());
        this.hashColumns.put("vsl_pre_pst_cd", getVslPrePstCd());
        this.hashColumns.put("pod_yd_cd", getPodYdCd());
        this.hashColumns.put("upd_usr_id", getUpdUsrId());
        this.hashColumns.put("split_flg", getSplitFlg());
        this.hashColumns.put("source_bkg_no", getSourceBkgNo());
        this.hashColumns.put("vsl_ord", getVslOrd());
        return this.hashColumns;
    }

    /**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("vsl_cd", "vslCd");
        this.hashFields.put("rev_vvd_flg", "revVvdFlg");
        this.hashFields.put("pod_clpt_ind_seq", "podClptIndSeq");
        this.hashFields.put("cre_dt", "creDt");
        this.hashFields.put("skd_voy_no", "skdVoyNo");
        this.hashFields.put("bkg_trsp_mzd_cd", "bkgTrspMzdCd");
        this.hashFields.put("vsl_seq", "vslSeq");
        this.hashFields.put("skd_dir_cd", "skdDirCd");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("pod_cd", "podCd");
        this.hashFields.put("cre_usr_id", "creUsrId");
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("bkg_no", "bkgNo");
        this.hashFields.put("pol_cd", "polCd");
        this.hashFields.put("slan_cd", "slanCd");
        this.hashFields.put("cntr_lodg_flg", "cntrLodgFlg");
        this.hashFields.put("pol_yd_cd", "polYdCd");
        this.hashFields.put("op_cd", "opCd");
        this.hashFields.put("pol_clpt_ind_seq", "polClptIndSeq");
        this.hashFields.put("vsl_pre_pst_cd", "vslPrePstCd");
        this.hashFields.put("pod_yd_cd", "podYdCd");
        this.hashFields.put("upd_usr_id", "updUsrId");
        this.hashFields.put("split_flg", "splitFlg");
        this.hashFields.put("source_bkg_no", "sourceBkgNo");
        this.hashFields.put("vsl_ord", "vslOrd");
        return this.hashFields;
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
	 * @return vslCd
	 */
    public String getVslCd() {
        return this.vslCd;
    }

    /**
	 * Column Info
	 * @return revVvdFlg
	 */
    public String getRevVvdFlg() {
        return this.revVvdFlg;
    }

    /**
	 * Column Info
	 * @return podClptIndSeq
	 */
    public String getPodClptIndSeq() {
        return this.podClptIndSeq;
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
	 * @return skdVoyNo
	 */
    public String getSkdVoyNo() {
        return this.skdVoyNo;
    }

    /**
	 * Column Info
	 * @return bkgTrspMzdCd
	 */
    public String getBkgTrspMzdCd() {
        return this.bkgTrspMzdCd;
    }

    /**
	 * Column Info
	 * @return vslSeq
	 */
    public String getVslSeq() {
        return this.vslSeq;
    }

    /**
	 * Column Info
	 * @return skdDirCd
	 */
    public String getSkdDirCd() {
        return this.skdDirCd;
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
	 * @return podCd
	 */
    public String getPodCd() {
        return this.podCd;
    }

    /**
	 * Column Info
	 * @return creUsrId
	 */
    public String getCreUsrId() {
        return this.creUsrId;
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
	 * @return bkgNo
	 */
    public String getBkgNo() {
        return this.bkgNo;
    }

    /**
	 * Column Info
	 * @return polCd
	 */
    public String getPolCd() {
        return this.polCd;
    }

    /**
	 * Column Info
	 * @return slanCd
	 */
    public String getSlanCd() {
        return this.slanCd;
    }

    /**
	 * Column Info
	 * @return cntrLodgFlg
	 */
    public String getCntrLodgFlg() {
        return this.cntrLodgFlg;
    }

    /**
	 * Column Info
	 * @return polYdCd
	 */
    public String getPolYdCd() {
        return this.polYdCd;
    }

    /**
	 * Column Info
	 * @return opCd
	 */
    public String getOpCd() {
        return this.opCd;
    }

    /**
	 * Column Info
	 * @return polClptIndSeq
	 */
    public String getPolClptIndSeq() {
        return this.polClptIndSeq;
    }

    /**
	 * Column Info
	 * @return vslPrePstCd
	 */
    public String getVslPrePstCd() {
        return this.vslPrePstCd;
    }

    /**
	 * Column Info
	 * @return podYdCd
	 */
    public String getPodYdCd() {
        return this.podYdCd;
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
	 * @return vslOrd
	 */
    public String getVslOrd() {
        return this.vslOrd;
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
	 * @param vslCd
	 */
    public void setVslCd(String vslCd) {
        this.vslCd = vslCd;
    }

    /**
	 * Column Info
	 * @param revVvdFlg
	 */
    public void setRevVvdFlg(String revVvdFlg) {
        this.revVvdFlg = revVvdFlg;
    }

    /**
	 * Column Info
	 * @param podClptIndSeq
	 */
    public void setPodClptIndSeq(String podClptIndSeq) {
        this.podClptIndSeq = podClptIndSeq;
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
	 * @param skdVoyNo
	 */
    public void setSkdVoyNo(String skdVoyNo) {
        this.skdVoyNo = skdVoyNo;
    }

    /**
	 * Column Info
	 * @param bkgTrspMzdCd
	 */
    public void setBkgTrspMzdCd(String bkgTrspMzdCd) {
        this.bkgTrspMzdCd = bkgTrspMzdCd;
    }

    /**
	 * Column Info
	 * @param vslSeq
	 */
    public void setVslSeq(String vslSeq) {
        this.vslSeq = vslSeq;
    }

    /**
	 * Column Info
	 * @param skdDirCd
	 */
    public void setSkdDirCd(String skdDirCd) {
        this.skdDirCd = skdDirCd;
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
	 * @param podCd
	 */
    public void setPodCd(String podCd) {
        this.podCd = podCd;
    }

    /**
	 * Column Info
	 * @param creUsrId
	 */
    public void setCreUsrId(String creUsrId) {
        this.creUsrId = creUsrId;
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
	 * @param bkgNo
	 */
    public void setBkgNo(String bkgNo) {
        this.bkgNo = bkgNo;
    }

    /**
	 * Column Info
	 * @param polCd
	 */
    public void setPolCd(String polCd) {
        this.polCd = polCd;
    }

    /**
	 * Column Info
	 * @param slanCd
	 */
    public void setSlanCd(String slanCd) {
        this.slanCd = slanCd;
    }

    /**
	 * Column Info
	 * @param cntrLodgFlg
	 */
    public void setCntrLodgFlg(String cntrLodgFlg) {
        this.cntrLodgFlg = cntrLodgFlg;
    }

    /**
	 * Column Info
	 * @param polYdCd
	 */
    public void setPolYdCd(String polYdCd) {
        this.polYdCd = polYdCd;
    }

    /**
	 * Column Info
	 * @param opCd
	 */
    public void setOpCd(String opCd) {
        this.opCd = opCd;
    }

    /**
	 * Column Info
	 * @param polClptIndSeq
	 */
    public void setPolClptIndSeq(String polClptIndSeq) {
        this.polClptIndSeq = polClptIndSeq;
    }

    /**
	 * Column Info
	 * @param vslPrePstCd
	 */
    public void setVslPrePstCd(String vslPrePstCd) {
        this.vslPrePstCd = vslPrePstCd;
    }

    /**
	 * Column Info
	 * @param podYdCd
	 */
    public void setPodYdCd(String podYdCd) {
        this.podYdCd = podYdCd;
    }
    
    /**
	 * Column Info
	 * @param vslOrd
	 */
    public void setVslOrd(String vslOrd) {
        this.vslOrd = vslOrd;
    }

    /**
	 * Column Info
	 * @param updUsrId
	 */
    public void setUpdUsrId(String updUsrId) {
        this.updUsrId = updUsrId;
    }

    public void setSplitFlg(String splitFlg) {
        this.splitFlg = splitFlg;
    }

    public String getSplitFlg() {
        return this.splitFlg;
    }

    public void setSourceBkgNo(String sourceBkgNo) {
        this.sourceBkgNo = sourceBkgNo;
    }

    public String getSourceBkgNo() {
        return this.sourceBkgNo;
    }

    /**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
    public void fromRequest(HttpServletRequest request) {
        setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
        setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
        setRevVvdFlg(JSPUtil.getParameter(request, "rev_vvd_flg", ""));
        setPodClptIndSeq(JSPUtil.getParameter(request, "pod_clpt_ind_seq", ""));
        setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
        setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
        setBkgTrspMzdCd(JSPUtil.getParameter(request, "bkg_trsp_mzd_cd", ""));
        setVslSeq(JSPUtil.getParameter(request, "vsl_seq", ""));
        setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
        setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
        setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
        setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
        setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
        setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
        setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
        setSlanCd(JSPUtil.getParameter(request, "slan_cd", ""));
        setCntrLodgFlg(JSPUtil.getParameter(request, "cntr_lodg_flg", ""));
        setPolYdCd(JSPUtil.getParameter(request, "pol_yd_cd", ""));
        setOpCd(JSPUtil.getParameter(request, "op_cd", ""));
        setPolClptIndSeq(JSPUtil.getParameter(request, "pol_clpt_ind_seq", ""));
        setVslPrePstCd(JSPUtil.getParameter(request, "vsl_pre_pst_cd", ""));
        setPodYdCd(JSPUtil.getParameter(request, "pod_yd_cd", ""));
        setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
        setSplitFlg(JSPUtil.getParameter(request, "split_flg", ""));
        setSourceBkgNo(JSPUtil.getParameter(request, "source_bkg_no", ""));
        setVslOrd(JSPUtil.getParameter(request, "vsl_ord", ""));
    }

    /**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgVvdVO[]
	 */
    public BkgVvdVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgVvdVO[]
	 */
    public BkgVvdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        BkgVvdVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
            String[] vslCd = (JSPUtil.getParameter(request, prefix + "vsl_cd", length));
            String[] revVvdFlg = (JSPUtil.getParameter(request, prefix + "rev_vvd_flg", length));
            String[] podClptIndSeq = (JSPUtil.getParameter(request, prefix + "pod_clpt_ind_seq", length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
            String[] skdVoyNo = (JSPUtil.getParameter(request, prefix + "skd_voy_no", length));
            String[] bkgTrspMzdCd = (JSPUtil.getParameter(request, prefix + "bkg_trsp_mzd_cd", length));
            String[] vslSeq = (JSPUtil.getParameter(request, prefix + "vsl_seq", length));
            String[] skdDirCd = (JSPUtil.getParameter(request, prefix + "skd_dir_cd", length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
            String[] podCd = (JSPUtil.getParameter(request, prefix + "pod_cd", length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
            String[] bkgNo = (JSPUtil.getParameter(request, prefix + "bkg_no", length));
            String[] polCd = (JSPUtil.getParameter(request, prefix + "pol_cd", length));
            String[] slanCd = (JSPUtil.getParameter(request, prefix + "slan_cd", length));
            String[] cntrLodgFlg = (JSPUtil.getParameter(request, prefix + "cntr_lodg_flg", length));
            String[] polYdCd = (JSPUtil.getParameter(request, prefix + "pol_yd_cd", length));
            String[] opCd = (JSPUtil.getParameter(request, prefix + "op_cd", length));
            String[] polClptIndSeq = (JSPUtil.getParameter(request, prefix + "pol_clpt_ind_seq", length));
            String[] vslPrePstCd = (JSPUtil.getParameter(request, prefix + "vsl_pre_pst_cd", length));
            String[] podYdCd = (JSPUtil.getParameter(request, prefix + "pod_yd_cd", length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
            String[] splitFlg = (JSPUtil.getParameter(request, prefix + "split_flg", length));
            String[] sourceBkgNo = (JSPUtil.getParameter(request, prefix + "source_bkg_no", length));
            String[] vslOrd = (JSPUtil.getParameter(request, prefix + "vsl_ord", length));
	    	/* Add a field line, do not delete */
            for (int i = 0; i < length; i++) {
                model = new BkgVvdVO();
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (vslCd[i] != null)
                    model.setVslCd(vslCd[i]);
                if (revVvdFlg[i] != null)
                    model.setRevVvdFlg(revVvdFlg[i]);
                if (podClptIndSeq[i] != null)
                    model.setPodClptIndSeq(podClptIndSeq[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (skdVoyNo[i] != null)
                    model.setSkdVoyNo(skdVoyNo[i]);
                if (bkgTrspMzdCd[i] != null)
                    model.setBkgTrspMzdCd(bkgTrspMzdCd[i]);
                if (vslSeq[i] != null)
                    model.setVslSeq(vslSeq[i]);
                if (skdDirCd[i] != null)
                    model.setSkdDirCd(skdDirCd[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (podCd[i] != null)
                    model.setPodCd(podCd[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (bkgNo[i] != null)
                    model.setBkgNo(bkgNo[i]);
                if (polCd[i] != null)
                    model.setPolCd(polCd[i]);
                if (slanCd[i] != null)
                    model.setSlanCd(slanCd[i]);
                if (cntrLodgFlg[i] != null)
                    model.setCntrLodgFlg(cntrLodgFlg[i]);
                if (polYdCd[i] != null)
                    model.setPolYdCd(polYdCd[i]);
                if (opCd[i] != null)
                    model.setOpCd(opCd[i]);
                if (polClptIndSeq[i] != null)
                    model.setPolClptIndSeq(polClptIndSeq[i]);
                if (vslPrePstCd[i] != null)
                    model.setVslPrePstCd(vslPrePstCd[i]);
                if (podYdCd[i] != null)
                    model.setPodYdCd(podYdCd[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                if (splitFlg[i] != null)
                    model.setSplitFlg(splitFlg[i]);
                if (sourceBkgNo[i] != null) 
		    		model.setSourceBkgNo(sourceBkgNo[i]);
                if (vslOrd[i] != null) 
		    		model.setVslOrd(vslOrd[i]);
				/* Add a Method line, do not delete */
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getBkgVvdVOs();
    }

    /**
	 * VO 배열을 반환
	 * @return BkgVvdVO[]
	 */
    public BkgVvdVO[] getBkgVvdVOs() {
        BkgVvdVO[] vos = (BkgVvdVO[]) models.toArray(new BkgVvdVO[models.size()]);
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
        this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vslCd = this.vslCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.revVvdFlg = this.revVvdFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.podClptIndSeq = this.podClptIndSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.skdVoyNo = this.skdVoyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgTrspMzdCd = this.bkgTrspMzdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vslSeq = this.vslSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.skdDirCd = this.skdDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.podCd = this.podCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgNo = this.bkgNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.polCd = this.polCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.slanCd = this.slanCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cntrLodgFlg = this.cntrLodgFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.polYdCd = this.polYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.opCd = this.opCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.polClptIndSeq = this.polClptIndSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vslPrePstCd = this.vslPrePstCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.podYdCd = this.podYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.splitFlg = this.splitFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.sourceBkgNo = this.sourceBkgNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vslOrd = this.vslOrd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
