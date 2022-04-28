/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SpcDlyFcastCustVO.java
*@FileTitle : SpcDlyFcastCustVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 최윤성
*@LastVersion : 1.0
* 2009.07.23 최윤성 
* 1.0 Creation
* 2009.09.11 최윤성 
* - fromRequestGridDate 메소드 추가
* 2010.07.09 CHOI.Y.S - [프로젝트] Ticket ID : CHM-201004171
* - [프로젝트] 53FT 관련 필드 추가
=========================================================*/
package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 최윤성
 * @since J2EE 1.6
 * @see AbstractValueObject
 */
public class SpcDlyFcastCustVO extends AbstractValueObject { 

    private static final long serialVersionUID = 1L;

    private Collection<SpcDlyFcastCustVO> models = new ArrayList<SpcDlyFcastCustVO>();

    /* Column Info */
    private String cfm40ftHcQty = null;

    /* Column Info */
    private String vslCd = null;

    /* Column Info */
    private String cfmRfQty = null;

    /* Column Info */
    private String trdCd = null;

    /* Column Info */
    private String rlaneCd = null;

    /* Column Info */
    private String repTrdCd = null;

    /* Column Info */
    private String usdBkg40ftQty = null;

    /* Page Number */
    private String pagerows = null;

    /* Column Info */
    private String slsOfcCd = null;

    /* Column Info */
    private String cfmUsrId = null;

    /* Column Info */
    private String usdBkg40ftHcQty = null;

    /* Column Info */
    private String ctrlLvlCd = null;

    /* Column Info */
    private String custCntCd = null;

    /* Column Info */
    private String updUsrId = null;

    /* Column Info */
    private String slsAqCd = null;

    /* Column Info */
    private String modiGdt = null;

    /* Column Info */
    private String cfmDt = null;

    /* Column Info */
    private String skdVoyNo = null;

    /* Column Info */
    private String slsRhqCd = null;

    /* Column Info */
    private String srepUsrId = null;

    /* Column Info */
    private String fcastRfQty = null;

    /* Column Info */
    private String creUsrId = null;

    /* Column Info */
    private String usdBkg45ftHcQty = null;

    /* Column Info */
    private String fcastOfcCd = null;

    /* Column Info */
    private String fcastCustTpCd = null;

    /* Column Info */
    private String fcast40ftHcQty = null;

    /* Column Info */
    private String cfm45ftHcQty = null;

    /* Column Info */
    private String subTrdCd = null;

    /* Column Info */
    private String usdBkg20ftQty = null;

    /* Column Info */
    private String creDt = null;

    /* Column Info */
    private String cfmTtlQty = null;

    /* VO Data Value( C:Creation, U:Update, D:Delete ) */
    private String ibflag = null;

    /* Column Info */
    private String fcastTtlQty = null;

    /* Column Info */
    private String usdBkgTtlQty = null;

    /* Column Info */
    private String usdBkgRfQty = null;

    /* Column Info */
    private String dirCd = null;

    /* Column Info */
    private String fcastTtlWgt = null;

    /* Column Info */
    private String podYdCd = null;

    /* Column Info */
    private String iocCd = null;

    /* Column Info */
    private String updDt = null;

    /* Column Info */
    private String iocTsCd = null;

    /* Column Info */
    private String cfmTtlWgt = null;

    /* Column Info */
    private String custSeq = null;

    /* Column Info */
    private String skdDirCd = null;

    /* Column Info */
    private String fcast45ftHcQty = null;

    /* Column Info */
    private String polYdCd = null;

    /* Column Info */
    private String usdBkgTtlWgt = null;

    /* Column Info */
    private String slsRgnOfcCd = null;

    /* Column Info */
    private String repSubTrdCd = null;

    /* Column Info */
    private String usdBkg53ftQty = null;

    /* Column Info */
    private String cfm53ftQty = null;

    /* Column Info */
    private String fcast53ftQty = null;

    /* Column Info */
    private String ctrtCustCntCd = null;

    /* Column Info */
    private String ctrtCustSeq = null;

    /* Column Info */
    private String scNo = null;

    /* Column Info */
    private String rfaNo = null;
    
    /* Column Info */
    private String ctrtNo = null;

    /*	테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new HashMap<String, String>();

    /*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new HashMap<String, String>();

    public SpcDlyFcastCustVO() {
    }

    public SpcDlyFcastCustVO(String ibflag, String pagerows, String rlaneCd, String dirCd, String vslCd, String skdVoyNo, String skdDirCd, String iocTsCd, String srepUsrId, String custCntCd, String custSeq, String polYdCd, String podYdCd, String fcastOfcCd, String fcastCustTpCd, String iocCd, String repTrdCd, String repSubTrdCd, String trdCd, String subTrdCd, String slsRhqCd, String slsAqCd, String slsRgnOfcCd, String slsOfcCd, String fcastTtlQty, String fcast40ftHcQty, String fcast45ftHcQty, String fcastRfQty, String fcastTtlWgt, String cfmTtlQty, String cfm40ftHcQty, String cfm45ftHcQty, String cfmRfQty, String cfmTtlWgt, String ctrlLvlCd, String modiGdt, String cfmUsrId, String cfmDt, String usdBkgTtlQty, String usdBkg20ftQty, String usdBkg40ftQty, String usdBkg40ftHcQty, String usdBkg45ftHcQty, String usdBkgRfQty, String usdBkgTtlWgt, String creUsrId, String creDt, String updUsrId, String updDt, String usdBkg53ftQty, String cfm53ftQty, String fcast53ftQty, String ctrtCustCntCd, String ctrtCustSeq, String scNo, String rfaNo,String ctrtNo) {
        this.cfm40ftHcQty = cfm40ftHcQty;
        this.vslCd = vslCd;
        this.cfmRfQty = cfmRfQty;
        this.trdCd = trdCd;
        this.rlaneCd = rlaneCd;
        this.repTrdCd = repTrdCd;
        this.usdBkg40ftQty = usdBkg40ftQty;
        this.pagerows = pagerows;
        this.slsOfcCd = slsOfcCd;
        this.cfmUsrId = cfmUsrId;
        this.usdBkg40ftHcQty = usdBkg40ftHcQty;
        this.ctrlLvlCd = ctrlLvlCd;
        this.custCntCd = custCntCd;
        this.updUsrId = updUsrId;
        this.slsAqCd = slsAqCd;
        this.modiGdt = modiGdt;
        this.cfmDt = cfmDt;
        this.skdVoyNo = skdVoyNo;
        this.slsRhqCd = slsRhqCd;
        this.srepUsrId = srepUsrId;
        this.fcastRfQty = fcastRfQty;
        this.creUsrId = creUsrId;
        this.usdBkg45ftHcQty = usdBkg45ftHcQty;
        this.fcastOfcCd = fcastOfcCd;
        this.fcastCustTpCd = fcastCustTpCd;
        this.fcast40ftHcQty = fcast40ftHcQty;
        this.cfm45ftHcQty = cfm45ftHcQty;
        this.subTrdCd = subTrdCd;
        this.usdBkg20ftQty = usdBkg20ftQty;
        this.creDt = creDt;
        this.cfmTtlQty = cfmTtlQty;
        this.ibflag = ibflag;
        this.fcastTtlQty = fcastTtlQty;
        this.usdBkgTtlQty = usdBkgTtlQty;
        this.usdBkgRfQty = usdBkgRfQty;
        this.dirCd = dirCd;
        this.fcastTtlWgt = fcastTtlWgt;
        this.podYdCd = podYdCd;
        this.iocCd = iocCd;
        this.updDt = updDt;
        this.iocTsCd = iocTsCd;
        this.cfmTtlWgt = cfmTtlWgt;
        this.custSeq = custSeq;
        this.skdDirCd = skdDirCd;
        this.fcast45ftHcQty = fcast45ftHcQty;
        this.polYdCd = polYdCd;
        this.usdBkgTtlWgt = usdBkgTtlWgt;
        this.slsRgnOfcCd = slsRgnOfcCd;
        this.repSubTrdCd = repSubTrdCd;
        this.usdBkg53ftQty = usdBkg53ftQty;
        this.cfm53ftQty = cfm53ftQty;
        this.fcast53ftQty = fcast53ftQty;
        this.ctrtCustCntCd = ctrtCustCntCd;
        this.ctrtCustSeq = ctrtCustSeq;
        this.scNo = scNo;
        this.rfaNo = rfaNo;
        this.ctrtNo = ctrtNo;
    }

    /**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("cfm_40ft_hc_qty", getCfm40ftHcQty());
        this.hashColumns.put("vsl_cd", getVslCd());
        this.hashColumns.put("cfm_rf_qty", getCfmRfQty());
        this.hashColumns.put("trd_cd", getTrdCd());
        this.hashColumns.put("rlane_cd", getRlaneCd());
        this.hashColumns.put("rep_trd_cd", getRepTrdCd());
        this.hashColumns.put("usd_bkg_40ft_qty", getUsdBkg40ftQty());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("sls_ofc_cd", getSlsOfcCd());
        this.hashColumns.put("cfm_usr_id", getCfmUsrId());
        this.hashColumns.put("usd_bkg_40ft_hc_qty", getUsdBkg40ftHcQty());
        this.hashColumns.put("ctrl_lvl_cd", getCtrlLvlCd());
        this.hashColumns.put("cust_cnt_cd", getCustCntCd());
        this.hashColumns.put("upd_usr_id", getUpdUsrId());
        this.hashColumns.put("sls_aq_cd", getSlsAqCd());
        this.hashColumns.put("modi_gdt", getModiGdt());
        this.hashColumns.put("cfm_dt", getCfmDt());
        this.hashColumns.put("skd_voy_no", getSkdVoyNo());
        this.hashColumns.put("sls_rhq_cd", getSlsRhqCd());
        this.hashColumns.put("srep_usr_id", getSrepUsrId());
        this.hashColumns.put("fcast_rf_qty", getFcastRfQty());
        this.hashColumns.put("cre_usr_id", getCreUsrId());
        this.hashColumns.put("usd_bkg_45ft_hc_qty", getUsdBkg45ftHcQty());
        this.hashColumns.put("fcast_ofc_cd", getFcastOfcCd());
        this.hashColumns.put("fcast_cust_tp_cd", getFcastCustTpCd());
        this.hashColumns.put("fcast_40ft_hc_qty", getFcast40ftHcQty());
        this.hashColumns.put("cfm_45ft_hc_qty", getCfm45ftHcQty());
        this.hashColumns.put("sub_trd_cd", getSubTrdCd());
        this.hashColumns.put("usd_bkg_20ft_qty", getUsdBkg20ftQty());
        this.hashColumns.put("cre_dt", getCreDt());
        this.hashColumns.put("cfm_ttl_qty", getCfmTtlQty());
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("fcast_ttl_qty", getFcastTtlQty());
        this.hashColumns.put("usd_bkg_ttl_qty", getUsdBkgTtlQty());
        this.hashColumns.put("usd_bkg_rf_qty", getUsdBkgRfQty());
        this.hashColumns.put("dir_cd", getDirCd());
        this.hashColumns.put("fcast_ttl_wgt", getFcastTtlWgt());
        this.hashColumns.put("pod_yd_cd", getPodYdCd());
        this.hashColumns.put("ioc_cd", getIocCd());
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("ioc_ts_cd", getIocTsCd());
        this.hashColumns.put("cfm_ttl_wgt", getCfmTtlWgt());
        this.hashColumns.put("cust_seq", getCustSeq());
        this.hashColumns.put("skd_dir_cd", getSkdDirCd());
        this.hashColumns.put("fcast_45ft_hc_qty", getFcast45ftHcQty());
        this.hashColumns.put("pol_yd_cd", getPolYdCd());
        this.hashColumns.put("usd_bkg_ttl_wgt", getUsdBkgTtlWgt());
        this.hashColumns.put("sls_rgn_ofc_cd", getSlsRgnOfcCd());
        this.hashColumns.put("rep_sub_trd_cd", getRepSubTrdCd());
        this.hashColumns.put("usd_bkg_53ft_qty", getUsdBkg53ftQty());
        this.hashColumns.put("cfm_53ft_qty", getCfm53ftQty());
        this.hashColumns.put("fcast_53ft_qty", getFcast53ftQty());
        this.hashColumns.put("ctrt_cust_cnt_cd", getCtrtCustCntCd());
        this.hashColumns.put("ctrt_cust_seq", getCtrtCustSeq());
        this.hashColumns.put("sc_no", getScNo());
        this.hashColumns.put("rfa_no", getRfaNo());
        this.hashColumns.put("ctrt_no", getCtrtNo());
        return this.hashColumns;
    }

    /**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("cfm_40ft_hc_qty", "cfm40ftHcQty");
        this.hashFields.put("vsl_cd", "vslCd");
        this.hashFields.put("cfm_rf_qty", "cfmRfQty");
        this.hashFields.put("trd_cd", "trdCd");
        this.hashFields.put("rlane_cd", "rlaneCd");
        this.hashFields.put("rep_trd_cd", "repTrdCd");
        this.hashFields.put("usd_bkg_40ft_qty", "usdBkg40ftQty");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("sls_ofc_cd", "slsOfcCd");
        this.hashFields.put("cfm_usr_id", "cfmUsrId");
        this.hashFields.put("usd_bkg_40ft_hc_qty", "usdBkg40ftHcQty");
        this.hashFields.put("ctrl_lvl_cd", "ctrlLvlCd");
        this.hashFields.put("cust_cnt_cd", "custCntCd");
        this.hashFields.put("upd_usr_id", "updUsrId");
        this.hashFields.put("sls_aq_cd", "slsAqCd");
        this.hashFields.put("modi_gdt", "modiGdt");
        this.hashFields.put("cfm_dt", "cfmDt");
        this.hashFields.put("skd_voy_no", "skdVoyNo");
        this.hashFields.put("sls_rhq_cd", "slsRhqCd");
        this.hashFields.put("srep_usr_id", "srepUsrId");
        this.hashFields.put("fcast_rf_qty", "fcastRfQty");
        this.hashFields.put("cre_usr_id", "creUsrId");
        this.hashFields.put("usd_bkg_45ft_hc_qty", "usdBkg45ftHcQty");
        this.hashFields.put("fcast_ofc_cd", "fcastOfcCd");
        this.hashFields.put("fcast_cust_tp_cd", "fcastCustTpCd");
        this.hashFields.put("fcast_40ft_hc_qty", "fcast40ftHcQty");
        this.hashFields.put("cfm_45ft_hc_qty", "cfm45ftHcQty");
        this.hashFields.put("sub_trd_cd", "subTrdCd");
        this.hashFields.put("usd_bkg_20ft_qty", "usdBkg20ftQty");
        this.hashFields.put("cre_dt", "creDt");
        this.hashFields.put("cfm_ttl_qty", "cfmTtlQty");
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("fcast_ttl_qty", "fcastTtlQty");
        this.hashFields.put("usd_bkg_ttl_qty", "usdBkgTtlQty");
        this.hashFields.put("usd_bkg_rf_qty", "usdBkgRfQty");
        this.hashFields.put("dir_cd", "dirCd");
        this.hashFields.put("fcast_ttl_wgt", "fcastTtlWgt");
        this.hashFields.put("pod_yd_cd", "podYdCd");
        this.hashFields.put("ioc_cd", "iocCd");
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("ioc_ts_cd", "iocTsCd");
        this.hashFields.put("cfm_ttl_wgt", "cfmTtlWgt");
        this.hashFields.put("cust_seq", "custSeq");
        this.hashFields.put("skd_dir_cd", "skdDirCd");
        this.hashFields.put("fcast_45ft_hc_qty", "fcast45ftHcQty");
        this.hashFields.put("pol_yd_cd", "polYdCd");
        this.hashFields.put("usd_bkg_ttl_wgt", "usdBkgTtlWgt");
        this.hashFields.put("sls_rgn_ofc_cd", "slsRgnOfcCd");
        this.hashFields.put("rep_sub_trd_cd", "repSubTrdCd");
        this.hashFields.put("usd_bkg_53ft_qty", "usdBkg53ftQty");
        this.hashFields.put("cfm_53ft_qty", "cfm53ftQty");
        this.hashFields.put("fcast_53ft_qty", "fcast53ftQty");
        this.hashFields.put("ctrt_cust_cnt_cd", "ctrtCustCntCd");
        this.hashFields.put("ctrt_cust_seq", "ctrtCustSeq");
        this.hashFields.put("sc_no", "scNo");
        this.hashFields.put("rfa_no", "rfaNo");
        this.hashFields.put("ctrt_no", "ctrtNo");
        return this.hashFields;
    }

    /**
	 * Column Info
	 * @return cfm40ftHcQty
	 */
    public String getCfm40ftHcQty() {
        return this.cfm40ftHcQty;
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
	 * @return cfmRfQty
	 */
    public String getCfmRfQty() {
        return this.cfmRfQty;
    }

    /**
	 * Column Info
	 * @return trdCd
	 */
    public String getTrdCd() {
        return this.trdCd;
    }

    /**
	 * Column Info
	 * @return rlaneCd
	 */
    public String getRlaneCd() {
        return this.rlaneCd;
    }

    /**
	 * Column Info
	 * @return repTrdCd
	 */
    public String getRepTrdCd() {
        return this.repTrdCd;
    }

    /**
	 * Column Info
	 * @return usdBkg40ftQty
	 */
    public String getUsdBkg40ftQty() {
        return this.usdBkg40ftQty;
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
	 * @return slsOfcCd
	 */
    public String getSlsOfcCd() {
        return this.slsOfcCd;
    }

    /**
	 * Column Info
	 * @return cfmUsrId
	 */
    public String getCfmUsrId() {
        return this.cfmUsrId;
    }

    /**
	 * Column Info
	 * @return usdBkg40ftHcQty
	 */
    public String getUsdBkg40ftHcQty() {
        return this.usdBkg40ftHcQty;
    }

    /**
	 * Column Info
	 * @return ctrlLvlCd
	 */
    public String getCtrlLvlCd() {
        return this.ctrlLvlCd;
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
	 * @return slsAqCd
	 */
    public String getSlsAqCd() {
        return this.slsAqCd;
    }

    /**
	 * Column Info
	 * @return modiGdt
	 */
    public String getModiGdt() {
        return this.modiGdt;
    }

    /**
	 * Column Info
	 * @return cfmDt
	 */
    public String getCfmDt() {
        return this.cfmDt;
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
	 * @return slsRhqCd
	 */
    public String getSlsRhqCd() {
        return this.slsRhqCd;
    }

    /**
	 * Column Info
	 * @return srepUsrId
	 */
    public String getSrepUsrId() {
        return this.srepUsrId;
    }

    /**
	 * Column Info
	 * @return fcastRfQty
	 */
    public String getFcastRfQty() {
        return this.fcastRfQty;
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
	 * @return usdBkg45ftHcQty
	 */
    public String getUsdBkg45ftHcQty() {
        return this.usdBkg45ftHcQty;
    }

    /**
	 * Column Info
	 * @return fcastOfcCd
	 */
    public String getFcastOfcCd() {
        return this.fcastOfcCd;
    }

    /**
	 * Column Info
	 * @return fcastCustTpCd
	 */
    public String getFcastCustTpCd() {
        return this.fcastCustTpCd;
    }

    /**
	 * Column Info
	 * @return fcast40ftHcQty
	 */
    public String getFcast40ftHcQty() {
        return this.fcast40ftHcQty;
    }

    /**
	 * Column Info
	 * @return cfm45ftHcQty
	 */
    public String getCfm45ftHcQty() {
        return this.cfm45ftHcQty;
    }

    /**
	 * Column Info
	 * @return subTrdCd
	 */
    public String getSubTrdCd() {
        return this.subTrdCd;
    }

    /**
	 * Column Info
	 * @return usdBkg20ftQty
	 */
    public String getUsdBkg20ftQty() {
        return this.usdBkg20ftQty;
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
	 * @return cfmTtlQty
	 */
    public String getCfmTtlQty() {
        return this.cfmTtlQty;
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
	 * @return fcastTtlQty
	 */
    public String getFcastTtlQty() {
        return this.fcastTtlQty;
    }

    /**
	 * Column Info
	 * @return usdBkgTtlQty
	 */
    public String getUsdBkgTtlQty() {
        return this.usdBkgTtlQty;
    }

    /**
	 * Column Info
	 * @return usdBkgRfQty
	 */
    public String getUsdBkgRfQty() {
        return this.usdBkgRfQty;
    }

    /**
	 * Column Info
	 * @return dirCd
	 */
    public String getDirCd() {
        return this.dirCd;
    }

    /**
	 * Column Info
	 * @return fcastTtlWgt
	 */
    public String getFcastTtlWgt() {
        return this.fcastTtlWgt;
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
	 * @return iocCd
	 */
    public String getIocCd() {
        return this.iocCd;
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
	 * @return iocTsCd
	 */
    public String getIocTsCd() {
        return this.iocTsCd;
    }

    /**
	 * Column Info
	 * @return cfmTtlWgt
	 */
    public String getCfmTtlWgt() {
        return this.cfmTtlWgt;
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
	 * @return skdDirCd
	 */
    public String getSkdDirCd() {
        return this.skdDirCd;
    }

    /**
	 * Column Info
	 * @return fcast45ftHcQty
	 */
    public String getFcast45ftHcQty() {
        return this.fcast45ftHcQty;
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
	 * @return usdBkgTtlWgt
	 */
    public String getUsdBkgTtlWgt() {
        return this.usdBkgTtlWgt;
    }

    /**
	 * Column Info
	 * @return slsRgnOfcCd
	 */
    public String getSlsRgnOfcCd() {
        return this.slsRgnOfcCd;
    }

    /**
	 * Column Info
	 * @return repSubTrdCd
	 */
    public String getRepSubTrdCd() {
        return this.repSubTrdCd;
    }

    /**
	 * Column Info
	 * @return usdBkg53ftQty
	 */
    public String getUsdBkg53ftQty() {
        return this.usdBkg53ftQty;
    }

    /**
	 * Column Info
	 * @return cfm53ftQty
	 */
    public String getCfm53ftQty() {
        return this.cfm53ftQty;
    }

    /**
	 * Column Info
	 * @return fcast53ftQty
	 */
    public String getFcast53ftQty() {
        return this.fcast53ftQty;
    }
   
    /**
   	 * Column Info
   	 * @return ctrtNo
   	 */
       public String getCtrtNo() {
           return this.ctrtNo;
       }
    
    /**
	 * Column Info
	 * @param cfm40ftHcQty
	 */
    public void setCfm40ftHcQty(String cfm40ftHcQty) {
        this.cfm40ftHcQty = cfm40ftHcQty;
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
	 * @param cfmRfQty
	 */
    public void setCfmRfQty(String cfmRfQty) {
        this.cfmRfQty = cfmRfQty;
    }

    /**
	 * Column Info
	 * @param trdCd
	 */
    public void setTrdCd(String trdCd) {
        this.trdCd = trdCd;
    }

    /**
	 * Column Info
	 * @param rlaneCd
	 */
    public void setRlaneCd(String rlaneCd) {
        this.rlaneCd = rlaneCd;
    }

    /**
	 * Column Info
	 * @param repTrdCd
	 */
    public void setRepTrdCd(String repTrdCd) {
        this.repTrdCd = repTrdCd;
    }

    /**
	 * Column Info
	 * @param usdBkg40ftQty
	 */
    public void setUsdBkg40ftQty(String usdBkg40ftQty) {
        this.usdBkg40ftQty = usdBkg40ftQty;
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
	 * @param slsOfcCd
	 */
    public void setSlsOfcCd(String slsOfcCd) {
        this.slsOfcCd = slsOfcCd;
    }

    /**
	 * Column Info
	 * @param cfmUsrId
	 */
    public void setCfmUsrId(String cfmUsrId) {
        this.cfmUsrId = cfmUsrId;
    }

    /**
	 * Column Info
	 * @param usdBkg40ftHcQty
	 */
    public void setUsdBkg40ftHcQty(String usdBkg40ftHcQty) {
        this.usdBkg40ftHcQty = usdBkg40ftHcQty;
    }

    /**
	 * Column Info
	 * @param ctrlLvlCd
	 */
    public void setCtrlLvlCd(String ctrlLvlCd) {
        this.ctrlLvlCd = ctrlLvlCd;
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
	 * @param slsAqCd
	 */
    public void setSlsAqCd(String slsAqCd) {
        this.slsAqCd = slsAqCd;
    }

    /**
	 * Column Info
	 * @param modiGdt
	 */
    public void setModiGdt(String modiGdt) {
        this.modiGdt = modiGdt;
    }

    /**
	 * Column Info
	 * @param cfmDt
	 */
    public void setCfmDt(String cfmDt) {
        this.cfmDt = cfmDt;
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
	 * @param slsRhqCd
	 */
    public void setSlsRhqCd(String slsRhqCd) {
        this.slsRhqCd = slsRhqCd;
    }

    /**
	 * Column Info
	 * @param srepUsrId
	 */
    public void setSrepUsrId(String srepUsrId) {
        this.srepUsrId = srepUsrId;
    }

    /**
	 * Column Info
	 * @param fcastRfQty
	 */
    public void setFcastRfQty(String fcastRfQty) {
        this.fcastRfQty = fcastRfQty;
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
	 * @param usdBkg45ftHcQty
	 */
    public void setUsdBkg45ftHcQty(String usdBkg45ftHcQty) {
        this.usdBkg45ftHcQty = usdBkg45ftHcQty;
    }

    /**
	 * Column Info
	 * @param fcastOfcCd
	 */
    public void setFcastOfcCd(String fcastOfcCd) {
        this.fcastOfcCd = fcastOfcCd;
    }

    /**
	 * Column Info
	 * @param fcastCustTpCd
	 */
    public void setFcastCustTpCd(String fcastCustTpCd) {
        this.fcastCustTpCd = fcastCustTpCd;
    }

    /**
	 * Column Info
	 * @param fcast40ftHcQty
	 */
    public void setFcast40ftHcQty(String fcast40ftHcQty) {
        this.fcast40ftHcQty = fcast40ftHcQty;
    }

    /**
	 * Column Info
	 * @param cfm45ftHcQty
	 */
    public void setCfm45ftHcQty(String cfm45ftHcQty) {
        this.cfm45ftHcQty = cfm45ftHcQty;
    }

    /**
	 * Column Info
	 * @param subTrdCd
	 */
    public void setSubTrdCd(String subTrdCd) {
        this.subTrdCd = subTrdCd;
    }

    /**
	 * Column Info
	 * @param usdBkg20ftQty
	 */
    public void setUsdBkg20ftQty(String usdBkg20ftQty) {
        this.usdBkg20ftQty = usdBkg20ftQty;
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
	 * @param cfmTtlQty
	 */
    public void setCfmTtlQty(String cfmTtlQty) {
        this.cfmTtlQty = cfmTtlQty;
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
	 * @param fcastTtlQty
	 */
    public void setFcastTtlQty(String fcastTtlQty) {
        this.fcastTtlQty = fcastTtlQty;
    }

    /**
	 * Column Info
	 * @param usdBkgTtlQty
	 */
    public void setUsdBkgTtlQty(String usdBkgTtlQty) {
        this.usdBkgTtlQty = usdBkgTtlQty;
    }

    /**
	 * Column Info
	 * @param usdBkgRfQty
	 */
    public void setUsdBkgRfQty(String usdBkgRfQty) {
        this.usdBkgRfQty = usdBkgRfQty;
    }

    /**
	 * Column Info
	 * @param dirCd
	 */
    public void setDirCd(String dirCd) {
        this.dirCd = dirCd;
    }

    /**
	 * Column Info
	 * @param fcastTtlWgt
	 */
    public void setFcastTtlWgt(String fcastTtlWgt) {
        this.fcastTtlWgt = fcastTtlWgt;
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
	 * @param iocCd
	 */
    public void setIocCd(String iocCd) {
        this.iocCd = iocCd;
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
	 * @param iocTsCd
	 */
    public void setIocTsCd(String iocTsCd) {
        this.iocTsCd = iocTsCd;
    }

    /**
	 * Column Info
	 * @param cfmTtlWgt
	 */
    public void setCfmTtlWgt(String cfmTtlWgt) {
        this.cfmTtlWgt = cfmTtlWgt;
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
	 * @param skdDirCd
	 */
    public void setSkdDirCd(String skdDirCd) {
        this.skdDirCd = skdDirCd;
    }

    /**
	 * Column Info
	 * @param fcast45ftHcQty
	 */
    public void setFcast45ftHcQty(String fcast45ftHcQty) {
        this.fcast45ftHcQty = fcast45ftHcQty;
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
	 * @param usdBkgTtlWgt
	 */
    public void setUsdBkgTtlWgt(String usdBkgTtlWgt) {
        this.usdBkgTtlWgt = usdBkgTtlWgt;
    }

    /**
	 * Column Info
	 * @param slsRgnOfcCd
	 */
    public void setSlsRgnOfcCd(String slsRgnOfcCd) {
        this.slsRgnOfcCd = slsRgnOfcCd;
    }

    /**
	 * Column Info
	 * @param repSubTrdCd
	 */
    public void setRepSubTrdCd(String repSubTrdCd) {
        this.repSubTrdCd = repSubTrdCd;
    }

    /**
	 * Column Info
	 * @param usdBkg53ftQty
	 */
    public void setUsdBkg53ftQty(String usdBkg53ftQty) {
        this.usdBkg53ftQty = usdBkg53ftQty;
    }

    /**
	 * Column Info
	 * @param cfm53ftQty
	 */
    public void setCfm53ftQty(String cfm53ftQty) {
        this.cfm53ftQty = cfm53ftQty;
    }

    /**
	 * Column Info
	 * @param fcast53ftQty
	 */
    public void setFcast53ftQty(String fcast53ftQty) {
        this.fcast53ftQty = fcast53ftQty;
    }
    
    /**
   	 * Column Info
   	 * @param ctrtCustCntCd
   	 */
    public void setCtrtCustCntCd(String ctrtCustCntCd) {
        this.ctrtCustCntCd = ctrtCustCntCd;
    }

    /**
   	 * Column Info
   	 * @param ctrtCustCntCd
   	 */
    public String getCtrtCustCntCd() {
        return this.ctrtCustCntCd;
    }
  
    /**
   	 * Column Info
   	 * @param ctrtCustSeq
   	 */
    public void setCtrtCustSeq(String ctrtCustSeq) {
        this.ctrtCustSeq = ctrtCustSeq;
    }
  
    /**
   	 * Column Info
   	 * @param ctrtCustSeq
   	 */
    public String getCtrtCustSeq() {
        return this.ctrtCustSeq;
    }
  
    /**
   	 * Column Info
   	 * @param scNo
   	 */
    
    public void setScNo(String scNo) {
        this.scNo = scNo;
    }
   
    /**
   	 * Column Info
   	 * @param scNo
   	 */
    public String getScNo() {
        return this.scNo;
    }
    
    /**
   	 * Column Info
   	 * @param rfaNo
   	 */

    public void setRfaNo(String rfaNo) {
        this.rfaNo = rfaNo;
    }
  
    /**
   	 * Column Info
   	 * @param rfaNo
   	 */
    public String getRfaNo() {
        return this.rfaNo;
    }
    
    /**
   	 * Column Info
   	 * @param ctrtNo
   	 */
       public void setCtrtNo(String ctrtNo) {
           this.ctrtNo = ctrtNo;
       }

    /**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
    public void fromRequest(HttpServletRequest request) {
        setCfm40ftHcQty(JSPUtil.getParameter(request, "cfm_40ft_hc_qty", ""));
        setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
        setCfmRfQty(JSPUtil.getParameter(request, "cfm_rf_qty", ""));
        setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
        setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
        setRepTrdCd(JSPUtil.getParameter(request, "rep_trd_cd", ""));
        setUsdBkg40ftQty(JSPUtil.getParameter(request, "usd_bkg_40ft_qty", ""));
        setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
        setSlsOfcCd(JSPUtil.getParameter(request, "sls_ofc_cd", ""));
        setCfmUsrId(JSPUtil.getParameter(request, "cfm_usr_id", ""));
        setUsdBkg40ftHcQty(JSPUtil.getParameter(request, "usd_bkg_40ft_hc_qty", ""));
        setCtrlLvlCd(JSPUtil.getParameter(request, "ctrl_lvl_cd", ""));
        setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
        setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
        setSlsAqCd(JSPUtil.getParameter(request, "sls_aq_cd", ""));
        setModiGdt(JSPUtil.getParameter(request, "modi_gdt", ""));
        setCfmDt(JSPUtil.getParameter(request, "cfm_dt", ""));
        setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
        setSlsRhqCd(JSPUtil.getParameter(request, "sls_rhq_cd", ""));
        setSrepUsrId(JSPUtil.getParameter(request, "srep_usr_id", ""));
        setFcastRfQty(JSPUtil.getParameter(request, "fcast_rf_qty", ""));
        setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
        setUsdBkg45ftHcQty(JSPUtil.getParameter(request, "usd_bkg_45ft_hc_qty", ""));
        setFcastOfcCd(JSPUtil.getParameter(request, "fcast_ofc_cd", ""));
        setFcastCustTpCd(JSPUtil.getParameter(request, "fcast_cust_tp_cd", ""));
        setFcast40ftHcQty(JSPUtil.getParameter(request, "fcast_40ft_hc_qty", ""));
        setCfm45ftHcQty(JSPUtil.getParameter(request, "cfm_45ft_hc_qty", ""));
        setSubTrdCd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
        setUsdBkg20ftQty(JSPUtil.getParameter(request, "usd_bkg_20ft_qty", ""));
        setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
        setCfmTtlQty(JSPUtil.getParameter(request, "cfm_ttl_qty", ""));
        setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
        setFcastTtlQty(JSPUtil.getParameter(request, "fcast_ttl_qty", ""));
        setUsdBkgTtlQty(JSPUtil.getParameter(request, "usd_bkg_ttl_qty", ""));
        setUsdBkgRfQty(JSPUtil.getParameter(request, "usd_bkg_rf_qty", ""));
        setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
        setFcastTtlWgt(JSPUtil.getParameter(request, "fcast_ttl_wgt", ""));
        setPodYdCd(JSPUtil.getParameter(request, "pod_yd_cd", ""));
        setIocCd(JSPUtil.getParameter(request, "ioc_cd", ""));
        setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
        setIocTsCd(JSPUtil.getParameter(request, "ioc_ts_cd", ""));
        setCfmTtlWgt(JSPUtil.getParameter(request, "cfm_ttl_wgt", ""));
        setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
        setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
        setFcast45ftHcQty(JSPUtil.getParameter(request, "fcast_45ft_hc_qty", ""));
        setPolYdCd(JSPUtil.getParameter(request, "pol_yd_cd", ""));
        setUsdBkgTtlWgt(JSPUtil.getParameter(request, "usd_bkg_ttl_wgt", ""));
        setSlsRgnOfcCd(JSPUtil.getParameter(request, "sls_rgn_ofc_cd", ""));
        setRepSubTrdCd(JSPUtil.getParameter(request, "rep_sub_trd_cd", ""));
        setUsdBkg53ftQty(JSPUtil.getParameter(request, "usd_bkg_53ft_qty", ""));
        setCfm53ftQty(JSPUtil.getParameter(request, "cfm_53ft_qty", ""));
        setFcast53ftQty(JSPUtil.getParameter(request, "fcast_53ft_qty", ""));
    }

    /**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SpcDlyFcastCustVO[]
	 */
    public SpcDlyFcastCustVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SpcDlyFcastCustVO[]
	 */
    public SpcDlyFcastCustVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        SpcDlyFcastCustVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] cfm40ftHcQty = (JSPUtil.getParameter(request, prefix + "cfm_40ft_hc_qty", length));
            String[] vslCd = (JSPUtil.getParameter(request, prefix + "vsl_cd", length));
            String[] cfmRfQty = (JSPUtil.getParameter(request, prefix + "cfm_rf_qty", length));
            String[] trdCd = (JSPUtil.getParameter(request, prefix + "trd_cd", length));
            String[] rlaneCd = (JSPUtil.getParameter(request, prefix + "rlane_cd", length));
            String[] repTrdCd = (JSPUtil.getParameter(request, prefix + "rep_trd_cd", length));
            String[] usdBkg40ftQty = (JSPUtil.getParameter(request, prefix + "usd_bkg_40ft_qty", length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
            String[] slsOfcCd = (JSPUtil.getParameter(request, prefix + "sls_ofc_cd", length));
            String[] cfmUsrId = (JSPUtil.getParameter(request, prefix + "cfm_usr_id", length));
            String[] usdBkg40ftHcQty = (JSPUtil.getParameter(request, prefix + "usd_bkg_40ft_hc_qty", length));
            String[] ctrlLvlCd = (JSPUtil.getParameter(request, prefix + "ctrl_lvl_cd", length));
            String[] custCntCd = (JSPUtil.getParameter(request, prefix + "cust_cnt_cd", length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
            String[] slsAqCd = (JSPUtil.getParameter(request, prefix + "sls_aq_cd", length));
            String[] modiGdt = (JSPUtil.getParameter(request, prefix + "modi_gdt", length));
            String[] cfmDt = (JSPUtil.getParameter(request, prefix + "cfm_dt", length));
            String[] skdVoyNo = (JSPUtil.getParameter(request, prefix + "skd_voy_no", length));
            String[] slsRhqCd = (JSPUtil.getParameter(request, prefix + "sls_rhq_cd", length));
            String[] srepUsrId = (JSPUtil.getParameter(request, prefix + "srep_usr_id", length));
            String[] fcastRfQty = (JSPUtil.getParameter(request, prefix + "fcast_rf_qty", length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
            String[] usdBkg45ftHcQty = (JSPUtil.getParameter(request, prefix + "usd_bkg_45ft_hc_qty", length));
            String[] fcastOfcCd = (JSPUtil.getParameter(request, prefix + "fcast_ofc_cd", length));
            String[] fcastCustTpCd = (JSPUtil.getParameter(request, prefix + "fcast_cust_tp_cd", length));
            String[] fcast40ftHcQty = (JSPUtil.getParameter(request, prefix + "fcast_40ft_hc_qty", length));
            String[] cfm45ftHcQty = (JSPUtil.getParameter(request, prefix + "cfm_45ft_hc_qty", length));
            String[] subTrdCd = (JSPUtil.getParameter(request, prefix + "sub_trd_cd", length));
            String[] usdBkg20ftQty = (JSPUtil.getParameter(request, prefix + "usd_bkg_20ft_qty", length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
            String[] cfmTtlQty = (JSPUtil.getParameter(request, prefix + "cfm_ttl_qty", length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
            String[] fcastTtlQty = (JSPUtil.getParameter(request, prefix + "fcast_ttl_qty", length));
            String[] usdBkgTtlQty = (JSPUtil.getParameter(request, prefix + "usd_bkg_ttl_qty", length));
            String[] usdBkgRfQty = (JSPUtil.getParameter(request, prefix + "usd_bkg_rf_qty", length));
            String[] dirCd = (JSPUtil.getParameter(request, prefix + "dir_cd", length));
            String[] fcastTtlWgt = (JSPUtil.getParameter(request, prefix + "fcast_ttl_wgt", length));
            String[] podYdCd = (JSPUtil.getParameter(request, prefix + "pod_yd_cd", length));
            String[] iocCd = (JSPUtil.getParameter(request, prefix + "ioc_cd", length));
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
            String[] iocTsCd = (JSPUtil.getParameter(request, prefix + "ioc_ts_cd", length));
            String[] cfmTtlWgt = (JSPUtil.getParameter(request, prefix + "cfm_ttl_wgt", length));
            String[] custSeq = (JSPUtil.getParameter(request, prefix + "cust_seq", length));
            String[] skdDirCd = (JSPUtil.getParameter(request, prefix + "skd_dir_cd", length));
            String[] fcast45ftHcQty = (JSPUtil.getParameter(request, prefix + "fcast_45ft_hc_qty", length));
            String[] polYdCd = (JSPUtil.getParameter(request, prefix + "pol_yd_cd", length));
            String[] usdBkgTtlWgt = (JSPUtil.getParameter(request, prefix + "usd_bkg_ttl_wgt", length));
            String[] slsRgnOfcCd = (JSPUtil.getParameter(request, prefix + "sls_rgn_ofc_cd", length));
            String[] repSubTrdCd = (JSPUtil.getParameter(request, prefix + "rep_sub_trd_cd", length));
            String[] usdBkg53ftQty = (JSPUtil.getParameter(request, prefix + "usd_bkg_53ft_qty", length));
            String[] cfm53ftQty = (JSPUtil.getParameter(request, prefix + "cfm_53ft_qty", length));
            String[] fcast53ftQty = (JSPUtil.getParameter(request, prefix + "fcast_53ft_qty", length));
            for (int i = 0; i < length; i++) {
                model = new SpcDlyFcastCustVO();
                if (cfm40ftHcQty[i] != null)
                    model.setCfm40ftHcQty(cfm40ftHcQty[i]);
                if (vslCd[i] != null)
                    model.setVslCd(vslCd[i]);
                if (cfmRfQty[i] != null)
                    model.setCfmRfQty(cfmRfQty[i]);
                if (trdCd[i] != null)
                    model.setTrdCd(trdCd[i]);
                if (rlaneCd[i] != null)
                    model.setRlaneCd(rlaneCd[i]);
                if (repTrdCd[i] != null)
                    model.setRepTrdCd(repTrdCd[i]);
                if (usdBkg40ftQty[i] != null)
                    model.setUsdBkg40ftQty(usdBkg40ftQty[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (slsOfcCd[i] != null)
                    model.setSlsOfcCd(slsOfcCd[i]);
                if (cfmUsrId[i] != null)
                    model.setCfmUsrId(cfmUsrId[i]);
                if (usdBkg40ftHcQty[i] != null)
                    model.setUsdBkg40ftHcQty(usdBkg40ftHcQty[i]);
                if (ctrlLvlCd[i] != null)
                    model.setCtrlLvlCd(ctrlLvlCd[i]);
                if (custCntCd[i] != null)
                    model.setCustCntCd(custCntCd[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                if (slsAqCd[i] != null)
                    model.setSlsAqCd(slsAqCd[i]);
                if (modiGdt[i] != null)
                    model.setModiGdt(modiGdt[i]);
                if (cfmDt[i] != null)
                    model.setCfmDt(cfmDt[i]);
                if (skdVoyNo[i] != null)
                    model.setSkdVoyNo(skdVoyNo[i]);
                if (slsRhqCd[i] != null)
                    model.setSlsRhqCd(slsRhqCd[i]);
                if (srepUsrId[i] != null)
                    model.setSrepUsrId(srepUsrId[i]);
                if (fcastRfQty[i] != null)
                    model.setFcastRfQty(fcastRfQty[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (usdBkg45ftHcQty[i] != null)
                    model.setUsdBkg45ftHcQty(usdBkg45ftHcQty[i]);
                if (fcastOfcCd[i] != null)
                    model.setFcastOfcCd(fcastOfcCd[i]);
                if (fcastCustTpCd[i] != null)
                    model.setFcastCustTpCd(fcastCustTpCd[i]);
                if (fcast40ftHcQty[i] != null)
                    model.setFcast40ftHcQty(fcast40ftHcQty[i]);
                if (cfm45ftHcQty[i] != null)
                    model.setCfm45ftHcQty(cfm45ftHcQty[i]);
                if (subTrdCd[i] != null)
                    model.setSubTrdCd(subTrdCd[i]);
                if (usdBkg20ftQty[i] != null)
                    model.setUsdBkg20ftQty(usdBkg20ftQty[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (cfmTtlQty[i] != null)
                    model.setCfmTtlQty(cfmTtlQty[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (fcastTtlQty[i] != null)
                    model.setFcastTtlQty(fcastTtlQty[i]);
                if (usdBkgTtlQty[i] != null)
                    model.setUsdBkgTtlQty(usdBkgTtlQty[i]);
                if (usdBkgRfQty[i] != null)
                    model.setUsdBkgRfQty(usdBkgRfQty[i]);
                if (dirCd[i] != null)
                    model.setDirCd(dirCd[i]);
                if (fcastTtlWgt[i] != null)
                    model.setFcastTtlWgt(fcastTtlWgt[i]);
                if (podYdCd[i] != null)
                    model.setPodYdCd(podYdCd[i]);
                if (iocCd[i] != null)
                    model.setIocCd(iocCd[i]);
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (iocTsCd[i] != null)
                    model.setIocTsCd(iocTsCd[i]);
                if (cfmTtlWgt[i] != null)
                    model.setCfmTtlWgt(cfmTtlWgt[i]);
                if (custSeq[i] != null)
                    model.setCustSeq(custSeq[i]);
                if (skdDirCd[i] != null)
                    model.setSkdDirCd(skdDirCd[i]);
                if (fcast45ftHcQty[i] != null)
                    model.setFcast45ftHcQty(fcast45ftHcQty[i]);
                if (polYdCd[i] != null)
                    model.setPolYdCd(polYdCd[i]);
                if (usdBkgTtlWgt[i] != null)
                    model.setUsdBkgTtlWgt(usdBkgTtlWgt[i]);
                if (slsRgnOfcCd[i] != null)
                    model.setSlsRgnOfcCd(slsRgnOfcCd[i]);
                if (repSubTrdCd[i] != null)
                    model.setRepSubTrdCd(repSubTrdCd[i]);
                if (usdBkg53ftQty[i] != null)
                    model.setUsdBkg53ftQty(usdBkg53ftQty[i]);
                if (cfm53ftQty[i] != null)
                    model.setCfm53ftQty(cfm53ftQty[i]);
                if (fcast53ftQty[i] != null)
                    model.setFcast53ftQty(fcast53ftQty[i]);
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getSpcDlyFcastCustVOs();
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * 
	 * pol_cd, pod_cd 받아서 -> pol_yd_cd, pod_yd_cd 넣는다.
	 * 
	 * @param request
	 * @param prefix
	 * @return SpcDlyFcastCustVO[]
	 */
    public SpcDlyFcastCustVO[] fromRequestGridDate(HttpServletRequest request, String prefix) {
        SpcDlyFcastCustVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        Calendar calendar = Calendar.getInstance();
        String date = "" + calendar.get(Calendar.YEAR) + "/" + (calendar.get(Calendar.MONTH) + 1) + "/" + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND);
        try {
            String[] cfm40ftHcQty = (JSPUtil.getParameter(request, prefix + "cfm_40ft_hc_qty", length));
            String[] vslCd = (JSPUtil.getParameter(request, prefix + "vsl_cd", length));
            String[] cfmRfQty = (JSPUtil.getParameter(request, prefix + "cfm_rf_qty", length));
            String[] trdCd = (JSPUtil.getParameter(request, prefix + "trd_cd", length));
            String[] rlaneCd = (JSPUtil.getParameter(request, prefix + "rlane_cd", length));
            String[] repTrdCd = (JSPUtil.getParameter(request, prefix + "rep_trd_cd", length));
            String[] usdBkg40ftQty = (JSPUtil.getParameter(request, prefix + "usd_bkg_40ft_qty", length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
            String[] slsOfcCd = (JSPUtil.getParameter(request, prefix + "sls_ofc_cd", length));
            String[] cfmUsrId = (JSPUtil.getParameter(request, prefix + "cfm_usr_id", length));
            String[] usdBkg40ftHcQty = (JSPUtil.getParameter(request, prefix + "usd_bkg_40ft_hc_qty", length));
            String[] ctrlLvlCd = (JSPUtil.getParameter(request, prefix + "ctrl_lvl_cd", length));
            String[] custCntCd = (JSPUtil.getParameter(request, prefix + "cust_cnt_cd", length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
            String[] slsAqCd = (JSPUtil.getParameter(request, prefix + "sls_aq_cd", length));
            String modiGdt = date;
            String[] cfmDt = (JSPUtil.getParameter(request, prefix + "cfm_dt", length));
            String[] skdVoyNo = (JSPUtil.getParameter(request, prefix + "skd_voy_no", length));
            String[] slsRhqCd = (JSPUtil.getParameter(request, prefix + "sls_rhq_cd", length));
            String[] srepUsrId = (JSPUtil.getParameter(request, prefix + "srep_usr_id", length));
            String[] fcastRfQty = (JSPUtil.getParameter(request, prefix + "fcast_rf_qty", length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
            String[] usdBkg45ftHcQty = (JSPUtil.getParameter(request, prefix + "usd_bkg_45ft_hc_qty", length));
            String[] fcastOfcCd = (JSPUtil.getParameter(request, prefix + "fcast_ofc_cd", length));
            String[] fcastCustTpCd = (JSPUtil.getParameter(request, prefix + "fcast_cust_tp_cd", length));
            String[] fcast40ftHcQty = (JSPUtil.getParameter(request, prefix + "fcast_40ft_hc_qty", length));
            String[] cfm45ftHcQty = (JSPUtil.getParameter(request, prefix + "cfm_45ft_hc_qty", length));
            String[] subTrdCd = (JSPUtil.getParameter(request, prefix + "sub_trd_cd", length));
            String[] usdBkg20ftQty = (JSPUtil.getParameter(request, prefix + "usd_bkg_20ft_qty", length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
            String[] cfmTtlQty = (JSPUtil.getParameter(request, prefix + "cfm_ttl_qty", length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
            String[] fcastTtlQty = (JSPUtil.getParameter(request, prefix + "fcast_ttl_qty", length));
            String[] usdBkgTtlQty = (JSPUtil.getParameter(request, prefix + "usd_bkg_ttl_qty", length));
            String[] usdBkgRfQty = (JSPUtil.getParameter(request, prefix + "usd_bkg_rf_qty", length));
            String[] dirCd = (JSPUtil.getParameter(request, prefix + "dir_cd", length));
            String[] fcastTtlWgt = (JSPUtil.getParameter(request, prefix + "fcast_ttl_wgt", length));
            String[] podYdCd = (JSPUtil.getParameter(request, prefix + "pod_cd", length));
            String[] iocCd = (JSPUtil.getParameter(request, prefix + "ioc_cd", length));
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
            String[] iocTsCd = (JSPUtil.getParameter(request, prefix + "ioc_ts_cd", length));
            String[] cfmTtlWgt = (JSPUtil.getParameter(request, prefix + "cfm_ttl_wgt", length));
            String[] custSeq = (JSPUtil.getParameter(request, prefix + "cust_seq", length));
            String[] skdDirCd = (JSPUtil.getParameter(request, prefix + "skd_dir_cd", length));
            String[] fcast45ftHcQty = (JSPUtil.getParameter(request, prefix + "fcast_45ft_hc_qty", length));
            String[] polYdCd = (JSPUtil.getParameter(request, prefix + "pol_cd", length));
            String[] usdBkgTtlWgt = (JSPUtil.getParameter(request, prefix + "usd_bkg_ttl_wgt", length));
            String[] slsRgnOfcCd = (JSPUtil.getParameter(request, prefix + "sls_rgn_ofc_cd", length));
            String[] repSubTrdCd = (JSPUtil.getParameter(request, prefix + "rep_sub_trd_cd", length));
            String[] usdBkg53ftQty = (JSPUtil.getParameter(request, prefix + "usd_bkg_53ft_qty", length));
            String[] cfm53ftQty = (JSPUtil.getParameter(request, prefix + "cfm_53ft_qty", length));
            String[] fcast53ftQty = (JSPUtil.getParameter(request, prefix + "fcast_53ft_qty", length));
            String[] ctrtCustCntCd = (JSPUtil.getParameter(request, prefix + "ctrt_cust_cnt_cd", length));
            String[] ctrtCustSeq = (JSPUtil.getParameter(request, prefix + "ctrt_cust_seq", length));
            String[] scNo = (JSPUtil.getParameter(request, prefix + "sc_no", length));
	    	String[] rfaNo = (JSPUtil.getParameter(request, prefix + "rfa_no", length));
	    	String[] ctrtNo = (JSPUtil.getParameter(request, prefix + "ctrt_no", length));
	    	/* Add a field line, do not delete */
            for (int i = 0; i < length; i++) {
                model = new SpcDlyFcastCustVO();
                if (cfm40ftHcQty[i] != null)
                    model.setCfm40ftHcQty(cfm40ftHcQty[i]);
                if (vslCd[i] != null)
                    model.setVslCd(vslCd[i]);
                if (cfmRfQty[i] != null)
                    model.setCfmRfQty(cfmRfQty[i]);
                if (trdCd[i] != null)
                    model.setTrdCd(trdCd[i]);
                if (rlaneCd[i] != null)
                    model.setRlaneCd(rlaneCd[i]);
                if (repTrdCd[i] != null)
                    model.setRepTrdCd(repTrdCd[i]);
                if (usdBkg40ftQty[i] != null)
                    model.setUsdBkg40ftQty(usdBkg40ftQty[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (slsOfcCd[i] != null)
                    model.setSlsOfcCd(slsOfcCd[i]);
                if (cfmUsrId[i] != null)
                    model.setCfmUsrId(cfmUsrId[i]);
                if (usdBkg40ftHcQty[i] != null)
                    model.setUsdBkg40ftHcQty(usdBkg40ftHcQty[i]);
                if (ctrlLvlCd[i] != null)
                    model.setCtrlLvlCd(ctrlLvlCd[i]);
                if (custCntCd[i] != null)
                    model.setCustCntCd(custCntCd[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                if (slsAqCd[i] != null)
                    model.setSlsAqCd(slsAqCd[i]);
                if (modiGdt != null)
                    model.setModiGdt(modiGdt);
                if (cfmDt[i] != null)
                    model.setCfmDt(cfmDt[i]);
                if (skdVoyNo[i] != null)
                    model.setSkdVoyNo(skdVoyNo[i]);
                if (slsRhqCd[i] != null)
                    model.setSlsRhqCd(slsRhqCd[i]);
                if (srepUsrId[i] != null)
                    model.setSrepUsrId(srepUsrId[i]);
                if (fcastRfQty[i] != null)
                    model.setFcastRfQty(fcastRfQty[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (usdBkg45ftHcQty[i] != null)
                    model.setUsdBkg45ftHcQty(usdBkg45ftHcQty[i]);
                if (fcastOfcCd[i] != null)
                    model.setFcastOfcCd(fcastOfcCd[i]);
                if (fcastCustTpCd[i] != null)
                    model.setFcastCustTpCd(fcastCustTpCd[i]);
                if (fcast40ftHcQty[i] != null)
                    model.setFcast40ftHcQty(fcast40ftHcQty[i]);
                if (cfm45ftHcQty[i] != null)
                    model.setCfm45ftHcQty(cfm45ftHcQty[i]);
                if (subTrdCd[i] != null)
                    model.setSubTrdCd(subTrdCd[i]);
                if (usdBkg20ftQty[i] != null)
                    model.setUsdBkg20ftQty(usdBkg20ftQty[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (cfmTtlQty[i] != null)
                    model.setCfmTtlQty(cfmTtlQty[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (fcastTtlQty[i] != null)
                    model.setFcastTtlQty(fcastTtlQty[i]);
                if (usdBkgTtlQty[i] != null)
                    model.setUsdBkgTtlQty(usdBkgTtlQty[i]);
                if (usdBkgRfQty[i] != null)
                    model.setUsdBkgRfQty(usdBkgRfQty[i]);
                if (dirCd[i] != null)
                    model.setDirCd(dirCd[i]);
                if (fcastTtlWgt[i] != null)
                    model.setFcastTtlWgt(fcastTtlWgt[i]);
                if (podYdCd[i] != null)
                    model.setPodYdCd(podYdCd[i]);
                if (iocCd[i] != null)
                    model.setIocCd(iocCd[i]);
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (iocTsCd[i] != null)
                    model.setIocTsCd(iocTsCd[i]);
                if (cfmTtlWgt[i] != null)
                    model.setCfmTtlWgt(cfmTtlWgt[i]);
                if (custSeq[i] != null)
                    model.setCustSeq(custSeq[i]);
                if (skdDirCd[i] != null)
                    model.setSkdDirCd(skdDirCd[i]);
                if (fcast45ftHcQty[i] != null)
                    model.setFcast45ftHcQty(fcast45ftHcQty[i]);
                if (polYdCd[i] != null)
                    model.setPolYdCd(polYdCd[i]);
                if (usdBkgTtlWgt[i] != null)
                    model.setUsdBkgTtlWgt(usdBkgTtlWgt[i]);
                if (slsRgnOfcCd[i] != null)
                    model.setSlsRgnOfcCd(slsRgnOfcCd[i]);
                if (repSubTrdCd[i] != null)
                    model.setRepSubTrdCd(repSubTrdCd[i]);
                if (usdBkg53ftQty[i] != null)
                    model.setUsdBkg53ftQty(usdBkg53ftQty[i]);
                if (cfm53ftQty[i] != null)
                    model.setCfm53ftQty(cfm53ftQty[i]);
                if (fcast53ftQty[i] != null)
                    model.setFcast53ftQty(fcast53ftQty[i]);
                if (ctrtCustCntCd[i] != null)
                    model.setCtrtCustCntCd(ctrtCustCntCd[i]);
                if (ctrtCustSeq[i] != null)
                    model.setCtrtCustSeq(ctrtCustSeq[i]);
                if (scNo[i] != null) 
		    		model.setScNo(scNo[i]);
				if (rfaNo[i] != null) 
		    		model.setRfaNo(rfaNo[i]);
				if (ctrtNo[i] != null) 
		    		model.setCtrtNo(ctrtNo[i]);
				/* Add a Method line, do not delete */
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getSpcDlyFcastCustVOs();
    }

    /**
	 * VO 배열을 반환
	 * @return SpcDlyFcastCustVO[]
	 */
    public SpcDlyFcastCustVO[] getSpcDlyFcastCustVOs() {
        SpcDlyFcastCustVO[] vos = (SpcDlyFcastCustVO[]) models.toArray(new SpcDlyFcastCustVO[models.size()]);
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
        this.cfm40ftHcQty = this.cfm40ftHcQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vslCd = this.vslCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cfmRfQty = this.cfmRfQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.trdCd = this.trdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rlaneCd = this.rlaneCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.repTrdCd = this.repTrdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.usdBkg40ftQty = this.usdBkg40ftQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.slsOfcCd = this.slsOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cfmUsrId = this.cfmUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.usdBkg40ftHcQty = this.usdBkg40ftHcQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ctrlLvlCd = this.ctrlLvlCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.custCntCd = this.custCntCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.slsAqCd = this.slsAqCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.modiGdt = this.modiGdt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cfmDt = this.cfmDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.skdVoyNo = this.skdVoyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.slsRhqCd = this.slsRhqCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.srepUsrId = this.srepUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fcastRfQty = this.fcastRfQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.usdBkg45ftHcQty = this.usdBkg45ftHcQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fcastOfcCd = this.fcastOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fcastCustTpCd = this.fcastCustTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fcast40ftHcQty = this.fcast40ftHcQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cfm45ftHcQty = this.cfm45ftHcQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.subTrdCd = this.subTrdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.usdBkg20ftQty = this.usdBkg20ftQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cfmTtlQty = this.cfmTtlQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fcastTtlQty = this.fcastTtlQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.usdBkgTtlQty = this.usdBkgTtlQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.usdBkgRfQty = this.usdBkgRfQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.dirCd = this.dirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fcastTtlWgt = this.fcastTtlWgt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.podYdCd = this.podYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.iocCd = this.iocCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.iocTsCd = this.iocTsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cfmTtlWgt = this.cfmTtlWgt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.custSeq = this.custSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.skdDirCd = this.skdDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fcast45ftHcQty = this.fcast45ftHcQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.polYdCd = this.polYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.usdBkgTtlWgt = this.usdBkgTtlWgt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.slsRgnOfcCd = this.slsRgnOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.repSubTrdCd = this.repSubTrdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.usdBkg53ftQty = this.usdBkg53ftQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cfm53ftQty = this.cfm53ftQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fcast53ftQty = this.fcast53ftQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ctrtCustCntCd = this.ctrtCustCntCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ctrtCustSeq = this.ctrtCustSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.scNo = this.scNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rfaNo = this.rfaNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ctrtNo = this.ctrtNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
