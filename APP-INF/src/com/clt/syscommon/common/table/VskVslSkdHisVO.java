/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : VskVslSkdHisVO.java
*@FileTitle : VskVslSkdHisVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.18
*@LastModifier : 서창열
*@LastVersion : 1.0
* 2009.05.18 서창열 
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
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 서창열
 * @since J2EE 1.5
 * @see AbstractValueObject
 */
public class VskVslSkdHisVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L;

    private Collection<VskVslSkdHisVO> models = new ArrayList<VskVslSkdHisVO>();

    /* Column Info */
    private String bfrVslCd = null;

    /* Column Info */
    private String aftVpsPortCd = null;

    /* Column Info */
    private String bfrVpsEtaDt = null;

    /* Column Info */
    private String aftSkdVoyNo = null;

    /* Column Info */
    private String bfrVslSlanCd = null;

    /* Column Info */
    private String bfrYdCd = null;

    /* Column Info */
    private String aftVpsEtdDt = null;

    /* Column Info */
    private String vslDlayRsnLocCd = null;

    /* Column Info */
    private String bfrSkdDirCd = null;

    /* Column Info */
    private String bfrVpsEtbDt = null;

    /* Column Info */
    private String bfrVpsPortCd = null;

    /* Column Info */
    private String bfrSkdVoyNo = null;

    /* Column Info */
    private String updUsrId = null;

    /* Column Info */
    private String updDt = null;

    /* Column Info */
    private String vskdTpCd = null;

    /* Column Info */
    private String bfrVpsEtdDt = null;

    /* Column Info */
    private String aftVslSlanCd = null;

    /* Column Info */
    private String vslDlayRsnCd = null;

    /* Column Info */
    private String vskdCngTpCd = null;

    /* Status */
    private String ibflag = null;

    /* Column Info */
    private String aftYdCd = null;

    /* Column Info */
    private String vskdCngNo = null;

    /* Column Info */
    private String aftVslCd = null;

    /* Column Info */
    private String aftVpsEtaDt = null;

    /* Column Info */
    private String diffRmk = null;

    /* Column Info */
    private String bfrClptIndSeq = null;

    /* Column Info */
    private String aftSkdDirCd = null;

    /* Column Info */
    private String creDt = null;

    /* Column Info */
    private String aftClptIndSeq = null;

    /* Column Info */
    private String creUsrId = null;

    /* Column Info */
    private String aftVpsEtbDt = null;

    /* Page Number */
    private String pagerows = null;

    /* Column Info */
    private String bkgAtchFlg = null;

    /* Column Info */
    private String bfrPfSvcTpCd = null;

    /* Column Info */
    private String vtAddCallFlg = null;

    /* Column Info */
    private String bfrActCrrCd = null;

    /* Column Info */
    private String bfrPfSkdTpCd = null;

    /*	Table Column name으로 맴버변수 value 담는다*/
    private HashMap<String, String> hashColumns = new HashMap<String, String>();

    /*	Table Column name으로 맴버변수 name 	담는다*/
    private HashMap<String, String> hashFields = new HashMap<String, String>();

    public VskVslSkdHisVO() {
    }

    public VskVslSkdHisVO(String ibflag, String pagerows, String vskdCngNo, String vskdTpCd, String bfrVslCd, String bfrSkdVoyNo, String bfrSkdDirCd, String bfrVpsPortCd, String bfrClptIndSeq, String bfrYdCd, String bfrVslSlanCd, String bfrVpsEtaDt, String bfrVpsEtbDt, String bfrVpsEtdDt, String aftVslCd, String aftSkdVoyNo, String aftSkdDirCd, String aftVpsPortCd, String aftClptIndSeq, String aftYdCd, String aftVslSlanCd, String aftVpsEtaDt, String aftVpsEtbDt, String aftVpsEtdDt, String vskdCngTpCd, String diffRmk, String vslDlayRsnCd, String vslDlayRsnLocCd, String creUsrId, String creDt, String updUsrId, String updDt, String vtAddCallFlg, String bfrActCrrCd, String bfrPfSkdTpCd) {
        this.bfrVslCd = bfrVslCd;
        this.aftVpsPortCd = aftVpsPortCd;
        this.bfrVpsEtaDt = bfrVpsEtaDt;
        this.aftSkdVoyNo = aftSkdVoyNo;
        this.bfrVslSlanCd = bfrVslSlanCd;
        this.bfrYdCd = bfrYdCd;
        this.aftVpsEtdDt = aftVpsEtdDt;
        this.vslDlayRsnLocCd = vslDlayRsnLocCd;
        this.bfrSkdDirCd = bfrSkdDirCd;
        this.bfrVpsEtbDt = bfrVpsEtbDt;
        this.bfrVpsPortCd = bfrVpsPortCd;
        this.bfrSkdVoyNo = bfrSkdVoyNo;
        this.updUsrId = updUsrId;
        this.updDt = updDt;
        this.vskdTpCd = vskdTpCd;
        this.bfrVpsEtdDt = bfrVpsEtdDt;
        this.aftVslSlanCd = aftVslSlanCd;
        this.vslDlayRsnCd = vslDlayRsnCd;
        this.vskdCngTpCd = vskdCngTpCd;
        this.ibflag = ibflag;
        this.aftYdCd = aftYdCd;
        this.vskdCngNo = vskdCngNo;
        this.aftVslCd = aftVslCd;
        this.aftVpsEtaDt = aftVpsEtaDt;
        this.diffRmk = diffRmk;
        this.bfrClptIndSeq = bfrClptIndSeq;
        this.aftSkdDirCd = aftSkdDirCd;
        this.creDt = creDt;
        this.aftClptIndSeq = aftClptIndSeq;
        this.creUsrId = creUsrId;
        this.aftVpsEtbDt = aftVpsEtbDt;
        this.pagerows = pagerows;
        this.vtAddCallFlg = vtAddCallFlg;
        this.bfrActCrrCd = bfrActCrrCd;
        this.bfrPfSkdTpCd = bfrPfSkdTpCd;
    }

    /**
	 * Table Column name 으로 맴버변수에 value를 리턴한다.
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("bfr_vsl_cd", getBfrVslCd());
        this.hashColumns.put("aft_vps_port_cd", getAftVpsPortCd());
        this.hashColumns.put("bfr_vps_eta_dt", getBfrVpsEtaDt());
        this.hashColumns.put("aft_skd_voy_no", getAftSkdVoyNo());
        this.hashColumns.put("bfr_vsl_slan_cd", getBfrVslSlanCd());
        this.hashColumns.put("bfr_yd_cd", getBfrYdCd());
        this.hashColumns.put("aft_vps_etd_dt", getAftVpsEtdDt());
        this.hashColumns.put("vsl_dlay_rsn_loc_cd", getVslDlayRsnLocCd());
        this.hashColumns.put("bfr_skd_dir_cd", getBfrSkdDirCd());
        this.hashColumns.put("bfr_vps_etb_dt", getBfrVpsEtbDt());
        this.hashColumns.put("bfr_vps_port_cd", getBfrVpsPortCd());
        this.hashColumns.put("bfr_skd_voy_no", getBfrSkdVoyNo());
        this.hashColumns.put("upd_usr_id", getUpdUsrId());
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("vskd_tp_cd", getVskdTpCd());
        this.hashColumns.put("bfr_vps_etd_dt", getBfrVpsEtdDt());
        this.hashColumns.put("aft_vsl_slan_cd", getAftVslSlanCd());
        this.hashColumns.put("vsl_dlay_rsn_cd", getVslDlayRsnCd());
        this.hashColumns.put("vskd_cng_tp_cd", getVskdCngTpCd());
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("aft_yd_cd", getAftYdCd());
        this.hashColumns.put("vskd_cng_no", getVskdCngNo());
        this.hashColumns.put("aft_vsl_cd", getAftVslCd());
        this.hashColumns.put("aft_vps_eta_dt", getAftVpsEtaDt());
        this.hashColumns.put("diff_rmk", getDiffRmk());
        this.hashColumns.put("bfr_clpt_ind_seq", getBfrClptIndSeq());
        this.hashColumns.put("aft_skd_dir_cd", getAftSkdDirCd());
        this.hashColumns.put("cre_dt", getCreDt());
        this.hashColumns.put("aft_clpt_ind_seq", getAftClptIndSeq());
        this.hashColumns.put("cre_usr_id", getCreUsrId());
        this.hashColumns.put("aft_vps_etb_dt", getAftVpsEtbDt());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("bkg_atch_flg", getBkgAtchFlg());
        this.hashColumns.put("bfr_pf_svc_tp_cd", getBfrPfSvcTpCd());
        this.hashColumns.put("vt_add_call_flg", getVtAddCallFlg());
        this.hashColumns.put("bfr_act_crr_cd", getBfrActCrrCd());
        this.hashColumns.put("bfr_pf_skd_tp_cd", getBfrPfSkdTpCd());
        return this.hashColumns;
    }

    /**
	 * Table Column name 으로 맴버변수를 호출한다
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("bfr_vsl_cd", "bfrVslCd");
        this.hashFields.put("aft_vps_port_cd", "aftVpsPortCd");
        this.hashFields.put("bfr_vps_eta_dt", "bfrVpsEtaDt");
        this.hashFields.put("aft_skd_voy_no", "aftSkdVoyNo");
        this.hashFields.put("bfr_vsl_slan_cd", "bfrVslSlanCd");
        this.hashFields.put("bfr_yd_cd", "bfrYdCd");
        this.hashFields.put("aft_vps_etd_dt", "aftVpsEtdDt");
        this.hashFields.put("vsl_dlay_rsn_loc_cd", "vslDlayRsnLocCd");
        this.hashFields.put("bfr_skd_dir_cd", "bfrSkdDirCd");
        this.hashFields.put("bfr_vps_etb_dt", "bfrVpsEtbDt");
        this.hashFields.put("bfr_vps_port_cd", "bfrVpsPortCd");
        this.hashFields.put("bfr_skd_voy_no", "bfrSkdVoyNo");
        this.hashFields.put("upd_usr_id", "updUsrId");
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("vskd_tp_cd", "vskdTpCd");
        this.hashFields.put("bfr_vps_etd_dt", "bfrVpsEtdDt");
        this.hashFields.put("aft_vsl_slan_cd", "aftVslSlanCd");
        this.hashFields.put("vsl_dlay_rsn_cd", "vslDlayRsnCd");
        this.hashFields.put("vskd_cng_tp_cd", "vskdCngTpCd");
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("aft_yd_cd", "aftYdCd");
        this.hashFields.put("vskd_cng_no", "vskdCngNo");
        this.hashFields.put("aft_vsl_cd", "aftVslCd");
        this.hashFields.put("aft_vps_eta_dt", "aftVpsEtaDt");
        this.hashFields.put("diff_rmk", "diffRmk");
        this.hashFields.put("bfr_clpt_ind_seq", "bfrClptIndSeq");
        this.hashFields.put("aft_skd_dir_cd", "aftSkdDirCd");
        this.hashFields.put("cre_dt", "creDt");
        this.hashFields.put("aft_clpt_ind_seq", "aftClptIndSeq");
        this.hashFields.put("cre_usr_id", "creUsrId");
        this.hashFields.put("aft_vps_etb_dt", "aftVpsEtbDt");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("bkg_atch_flg", "bkgAtchFlg");
        this.hashFields.put("bfr_pf_svc_tp_cd", "bfrPfSvcTpCd");
        this.hashFields.put("vt_add_call_flg", "vtAddCallFlg");
        this.hashFields.put("bfr_act_crr_cd", "bfrActCrrCd");
        this.hashFields.put("bfr_pf_skd_tp_cd", "bfrPfSkdTpCd");
        return this.hashFields;
    }

    /**
	 * Column Info
	 * @return bfrVslCd
	 */
    public String getBfrVslCd() {
        return this.bfrVslCd;
    }

    /**
	 * Column Info
	 * @return aftVpsPortCd
	 */
    public String getAftVpsPortCd() {
        return this.aftVpsPortCd;
    }

    /**
	 * Column Info
	 * @return bfrVpsEtaDt
	 */
    public String getBfrVpsEtaDt() {
        return this.bfrVpsEtaDt;
    }

    /**
	 * Column Info
	 * @return aftSkdVoyNo
	 */
    public String getAftSkdVoyNo() {
        return this.aftSkdVoyNo;
    }

    /**
	 * Column Info
	 * @return bfrVslSlanCd
	 */
    public String getBfrVslSlanCd() {
        return this.bfrVslSlanCd;
    }

    /**
	 * Column Info
	 * @return bfrYdCd
	 */
    public String getBfrYdCd() {
        return this.bfrYdCd;
    }

    /**
	 * Column Info
	 * @return aftVpsEtdDt
	 */
    public String getAftVpsEtdDt() {
        return this.aftVpsEtdDt;
    }

    /**
	 * Column Info
	 * @return vslDlayRsnLocCd
	 */
    public String getVslDlayRsnLocCd() {
        return this.vslDlayRsnLocCd;
    }

    /**
	 * Column Info
	 * @return bfrSkdDirCd
	 */
    public String getBfrSkdDirCd() {
        return this.bfrSkdDirCd;
    }

    /**
	 * Column Info
	 * @return bfrVpsEtbDt
	 */
    public String getBfrVpsEtbDt() {
        return this.bfrVpsEtbDt;
    }

    /**
	 * Column Info
	 * @return bfrVpsPortCd
	 */
    public String getBfrVpsPortCd() {
        return this.bfrVpsPortCd;
    }

    /**
	 * Column Info
	 * @return bfrSkdVoyNo
	 */
    public String getBfrSkdVoyNo() {
        return this.bfrSkdVoyNo;
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
	 * @return vskdTpCd
	 */
    public String getVskdTpCd() {
        return this.vskdTpCd;
    }

    /**
	 * Column Info
	 * @return bfrVpsEtdDt
	 */
    public String getBfrVpsEtdDt() {
        return this.bfrVpsEtdDt;
    }

    /**
	 * Column Info
	 * @return aftVslSlanCd
	 */
    public String getAftVslSlanCd() {
        return this.aftVslSlanCd;
    }

    /**
	 * Column Info
	 * @return vslDlayRsnCd
	 */
    public String getVslDlayRsnCd() {
        return this.vslDlayRsnCd;
    }

    /**
	 * Column Info
	 * @return vskdCngTpCd
	 */
    public String getVskdCngTpCd() {
        return this.vskdCngTpCd;
    }

    /**
	 * Status
	 * @return ibflag
	 */
    public String getIbflag() {
        return this.ibflag;
    }

    /**
	 * Column Info
	 * @return aftYdCd
	 */
    public String getAftYdCd() {
        return this.aftYdCd;
    }

    /**
	 * Column Info
	 * @return vskdCngNo
	 */
    public String getVskdCngNo() {
        return this.vskdCngNo;
    }

    /**
	 * Column Info
	 * @return aftVslCd
	 */
    public String getAftVslCd() {
        return this.aftVslCd;
    }

    /**
	 * Column Info
	 * @return aftVpsEtaDt
	 */
    public String getAftVpsEtaDt() {
        return this.aftVpsEtaDt;
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
	 * @return bfrClptIndSeq
	 */
    public String getBfrClptIndSeq() {
        return this.bfrClptIndSeq;
    }

    /**
	 * Column Info
	 * @return aftSkdDirCd
	 */
    public String getAftSkdDirCd() {
        return this.aftSkdDirCd;
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
	 * @return aftClptIndSeq
	 */
    public String getAftClptIndSeq() {
        return this.aftClptIndSeq;
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
	 * @return aftVpsEtbDt
	 */
    public String getAftVpsEtbDt() {
        return this.aftVpsEtbDt;
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
	 * @return bkgAtchFlg
	 */
    public String getBkgAtchFlg() {
        return this.bkgAtchFlg;
    }

    /**
	 * Column Info
	 * @return bfrPfSvcTpCd
	 */
    public String getBfrPfSvcTpCd() {
        return this.bfrPfSvcTpCd;
    }

    /**
	 * Column Info
	 * @param bfrPfSvcTpCd
	 */
    public void setBfrPfSvcTpCd(String bfrPfSvcTpCd) {
        this.bfrPfSvcTpCd = bfrPfSvcTpCd;
    }

    /**
	 * Column Info
	 * @param bkgAtchFlg
	 */
    public void setBkgAtchFlg(String bkgAtchFlg) {
        this.bkgAtchFlg = bkgAtchFlg;
    }

    /**
	 * Column Info
	 * @param bfrVslCd
	 */
    public void setBfrVslCd(String bfrVslCd) {
        this.bfrVslCd = bfrVslCd;
    }

    /**
	 * Column Info
	 * @param aftVpsPortCd
	 */
    public void setAftVpsPortCd(String aftVpsPortCd) {
        this.aftVpsPortCd = aftVpsPortCd;
    }

    /**
	 * Column Info
	 * @param bfrVpsEtaDt
	 */
    public void setBfrVpsEtaDt(String bfrVpsEtaDt) {
        this.bfrVpsEtaDt = bfrVpsEtaDt;
    }

    /**
	 * Column Info
	 * @param aftSkdVoyNo
	 */
    public void setAftSkdVoyNo(String aftSkdVoyNo) {
        this.aftSkdVoyNo = aftSkdVoyNo;
    }

    /**
	 * Column Info
	 * @param bfrVslSlanCd
	 */
    public void setBfrVslSlanCd(String bfrVslSlanCd) {
        this.bfrVslSlanCd = bfrVslSlanCd;
    }

    /**
	 * Column Info
	 * @param bfrYdCd
	 */
    public void setBfrYdCd(String bfrYdCd) {
        this.bfrYdCd = bfrYdCd;
    }

    /**
	 * Column Info
	 * @param aftVpsEtdDt
	 */
    public void setAftVpsEtdDt(String aftVpsEtdDt) {
        this.aftVpsEtdDt = aftVpsEtdDt;
    }

    /**
	 * Column Info
	 * @param vslDlayRsnLocCd
	 */
    public void setVslDlayRsnLocCd(String vslDlayRsnLocCd) {
        this.vslDlayRsnLocCd = vslDlayRsnLocCd;
    }

    /**
	 * Column Info
	 * @param bfrSkdDirCd
	 */
    public void setBfrSkdDirCd(String bfrSkdDirCd) {
        this.bfrSkdDirCd = bfrSkdDirCd;
    }

    /**
	 * Column Info
	 * @param bfrVpsEtbDt
	 */
    public void setBfrVpsEtbDt(String bfrVpsEtbDt) {
        this.bfrVpsEtbDt = bfrVpsEtbDt;
    }

    /**
	 * Column Info
	 * @param bfrVpsPortCd
	 */
    public void setBfrVpsPortCd(String bfrVpsPortCd) {
        this.bfrVpsPortCd = bfrVpsPortCd;
    }

    /**
	 * Column Info
	 * @param bfrSkdVoyNo
	 */
    public void setBfrSkdVoyNo(String bfrSkdVoyNo) {
        this.bfrSkdVoyNo = bfrSkdVoyNo;
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
	 * @param vskdTpCd
	 */
    public void setVskdTpCd(String vskdTpCd) {
        this.vskdTpCd = vskdTpCd;
    }

    /**
	 * Column Info
	 * @param bfrVpsEtdDt
	 */
    public void setBfrVpsEtdDt(String bfrVpsEtdDt) {
        this.bfrVpsEtdDt = bfrVpsEtdDt;
    }

    /**
	 * Column Info
	 * @param aftVslSlanCd
	 */
    public void setAftVslSlanCd(String aftVslSlanCd) {
        this.aftVslSlanCd = aftVslSlanCd;
    }

    /**
	 * Column Info
	 * @param vslDlayRsnCd
	 */
    public void setVslDlayRsnCd(String vslDlayRsnCd) {
        this.vslDlayRsnCd = vslDlayRsnCd;
    }

    /**
	 * Column Info
	 * @param vskdCngTpCd
	 */
    public void setVskdCngTpCd(String vskdCngTpCd) {
        this.vskdCngTpCd = vskdCngTpCd;
    }

    /**
	 * Status
	 * @param ibflag
	 */
    public void setIbflag(String ibflag) {
        this.ibflag = ibflag;
    }

    /**
	 * Column Info
	 * @param aftYdCd
	 */
    public void setAftYdCd(String aftYdCd) {
        this.aftYdCd = aftYdCd;
    }

    /**
	 * Column Info
	 * @param vskdCngNo
	 */
    public void setVskdCngNo(String vskdCngNo) {
        this.vskdCngNo = vskdCngNo;
    }

    /**
	 * Column Info
	 * @param aftVslCd
	 */
    public void setAftVslCd(String aftVslCd) {
        this.aftVslCd = aftVslCd;
    }

    /**
	 * Column Info
	 * @param aftVpsEtaDt
	 */
    public void setAftVpsEtaDt(String aftVpsEtaDt) {
        this.aftVpsEtaDt = aftVpsEtaDt;
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
	 * @param bfrClptIndSeq
	 */
    public void setBfrClptIndSeq(String bfrClptIndSeq) {
        this.bfrClptIndSeq = bfrClptIndSeq;
    }

    /**
	 * Column Info
	 * @param aftSkdDirCd
	 */
    public void setAftSkdDirCd(String aftSkdDirCd) {
        this.aftSkdDirCd = aftSkdDirCd;
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
	 * @param aftClptIndSeq
	 */
    public void setAftClptIndSeq(String aftClptIndSeq) {
        this.aftClptIndSeq = aftClptIndSeq;
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
	 * @param aftVpsEtbDt
	 */
    public void setAftVpsEtbDt(String aftVpsEtbDt) {
        this.aftVpsEtbDt = aftVpsEtbDt;
    }

    /**
	 * Page Number
	 * @param pagerows
	 */
    public void setPagerows(String pagerows) {
        this.pagerows = pagerows;
    }

    public void setVtAddCallFlg(String vtAddCallFlg) {
        this.vtAddCallFlg = vtAddCallFlg;
    }

    public String getVtAddCallFlg() {
        return this.vtAddCallFlg;
    }

    public void setBfrActCrrCd(String bfrActCrrCd) {
        this.bfrActCrrCd = bfrActCrrCd;
    }

    public String getBfrActCrrCd() {
        return this.bfrActCrrCd;
    }

    public void setBfrPfSkdTpCd(String bfrPfSkdTpCd) {
        this.bfrPfSkdTpCd = bfrPfSkdTpCd;
    }

    public String getBfrPfSkdTpCd() {
        return this.bfrPfSkdTpCd;
    }

    /**
	 * Request 넘어온 단건 DATA를 VO Class 에 담는다. 
	 * @param request
	 */
    public void fromRequest(HttpServletRequest request) {
        setBfrVslCd(JSPUtil.getParameter(request, "bfr_vsl_cd", ""));
        setAftVpsPortCd(JSPUtil.getParameter(request, "aft_vps_port_cd", ""));
        setBfrVpsEtaDt(JSPUtil.getParameter(request, "bfr_vps_eta_dt", ""));
        setAftSkdVoyNo(JSPUtil.getParameter(request, "aft_skd_voy_no", ""));
        setBfrVslSlanCd(JSPUtil.getParameter(request, "bfr_vsl_slan_cd", ""));
        setBfrYdCd(JSPUtil.getParameter(request, "bfr_yd_cd", ""));
        setAftVpsEtdDt(JSPUtil.getParameter(request, "aft_vps_etd_dt", ""));
        setVslDlayRsnLocCd(JSPUtil.getParameter(request, "vsl_dlay_rsn_loc_cd", ""));
        setBfrSkdDirCd(JSPUtil.getParameter(request, "bfr_skd_dir_cd", ""));
        setBfrVpsEtbDt(JSPUtil.getParameter(request, "bfr_vps_etb_dt", ""));
        setBfrVpsPortCd(JSPUtil.getParameter(request, "bfr_vps_port_cd", ""));
        setBfrSkdVoyNo(JSPUtil.getParameter(request, "bfr_skd_voy_no", ""));
        setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
        setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
        setVskdTpCd(JSPUtil.getParameter(request, "vskd_tp_cd", ""));
        setBfrVpsEtdDt(JSPUtil.getParameter(request, "bfr_vps_etd_dt", ""));
        setAftVslSlanCd(JSPUtil.getParameter(request, "aft_vsl_slan_cd", ""));
        setVslDlayRsnCd(JSPUtil.getParameter(request, "vsl_dlay_rsn_cd", ""));
        setVskdCngTpCd(JSPUtil.getParameter(request, "vskd_cng_tp_cd", ""));
        setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
        setAftYdCd(JSPUtil.getParameter(request, "aft_yd_cd", ""));
        setVskdCngNo(JSPUtil.getParameter(request, "vskd_cng_no", ""));
        setAftVslCd(JSPUtil.getParameter(request, "aft_vsl_cd", ""));
        setAftVpsEtaDt(JSPUtil.getParameter(request, "aft_vps_eta_dt", ""));
        setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
        setBfrClptIndSeq(JSPUtil.getParameter(request, "bfr_clpt_ind_seq", ""));
        setAftSkdDirCd(JSPUtil.getParameter(request, "aft_skd_dir_cd", ""));
        setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
        setAftClptIndSeq(JSPUtil.getParameter(request, "aft_clpt_ind_seq", ""));
        setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
        setAftVpsEtbDt(JSPUtil.getParameter(request, "aft_vps_etb_dt", ""));
        setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
    }

    /**
	 * Request를 VO Class를 담는다.
	 * @param request
	 * @return VskVslSkdHisVO[]
	 */
    public VskVslSkdHisVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return VskVslSkdHisVO[]
	 */
    public VskVslSkdHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        VskVslSkdHisVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] bfrVslCd = (JSPUtil.getParameter(request, prefix + "bfr_vsl_cd".trim(), length));
            String[] aftVpsPortCd = (JSPUtil.getParameter(request, prefix + "aft_vps_port_cd".trim(), length));
            String[] bfrVpsEtaDt = (JSPUtil.getParameter(request, prefix + "bfr_vps_eta_dt".trim(), length));
            String[] aftSkdVoyNo = (JSPUtil.getParameter(request, prefix + "aft_skd_voy_no".trim(), length));
            String[] bfrVslSlanCd = (JSPUtil.getParameter(request, prefix + "bfr_vsl_slan_cd".trim(), length));
            String[] bfrYdCd = (JSPUtil.getParameter(request, prefix + "bfr_yd_cd".trim(), length));
            String[] aftVpsEtdDt = (JSPUtil.getParameter(request, prefix + "aft_vps_etd_dt".trim(), length));
            String[] vslDlayRsnLocCd = (JSPUtil.getParameter(request, prefix + "vsl_dlay_rsn_loc_cd".trim(), length));
            String[] bfrSkdDirCd = (JSPUtil.getParameter(request, prefix + "bfr_skd_dir_cd".trim(), length));
            String[] bfrVpsEtbDt = (JSPUtil.getParameter(request, prefix + "bfr_vps_etb_dt".trim(), length));
            String[] bfrVpsPortCd = (JSPUtil.getParameter(request, prefix + "bfr_vps_port_cd".trim(), length));
            String[] bfrSkdVoyNo = (JSPUtil.getParameter(request, prefix + "bfr_skd_voy_no".trim(), length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id".trim(), length));
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt".trim(), length));
            String[] vskdTpCd = (JSPUtil.getParameter(request, prefix + "vskd_tp_cd".trim(), length));
            String[] bfrVpsEtdDt = (JSPUtil.getParameter(request, prefix + "bfr_vps_etd_dt".trim(), length));
            String[] aftVslSlanCd = (JSPUtil.getParameter(request, prefix + "aft_vsl_slan_cd".trim(), length));
            String[] vslDlayRsnCd = (JSPUtil.getParameter(request, prefix + "vsl_dlay_rsn_cd".trim(), length));
            String[] vskdCngTpCd = (JSPUtil.getParameter(request, prefix + "vskd_cng_tp_cd".trim(), length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag".trim(), length));
            String[] aftYdCd = (JSPUtil.getParameter(request, prefix + "aft_yd_cd".trim(), length));
            String[] vskdCngNo = (JSPUtil.getParameter(request, prefix + "vskd_cng_no".trim(), length));
            String[] aftVslCd = (JSPUtil.getParameter(request, prefix + "aft_vsl_cd".trim(), length));
            String[] aftVpsEtaDt = (JSPUtil.getParameter(request, prefix + "aft_vps_eta_dt".trim(), length));
            String[] diffRmk = (JSPUtil.getParameter(request, prefix + "diff_rmk".trim(), length));
            String[] bfrClptIndSeq = (JSPUtil.getParameter(request, prefix + "bfr_clpt_ind_seq".trim(), length));
            String[] aftSkdDirCd = (JSPUtil.getParameter(request, prefix + "aft_skd_dir_cd".trim(), length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt".trim(), length));
            String[] aftClptIndSeq = (JSPUtil.getParameter(request, prefix + "aft_clpt_ind_seq".trim(), length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id".trim(), length));
            String[] aftVpsEtbDt = (JSPUtil.getParameter(request, prefix + "aft_vps_etb_dt".trim(), length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows".trim(), length));
            String[] vtAddCallFlg = (JSPUtil.getParameter(request, prefix + "vt_add_call_flg", length));
            String[] bfrActCrrCd = (JSPUtil.getParameter(request, prefix + "bfr_act_crr_cd", length));
            String[] bfrPfSkdTpCd = (JSPUtil.getParameter(request, prefix + "bfr_pf_skd_tp_cd", length));
	    	/* Add a field line, do not delete */
            for (int i = 0; i < length; i++) {
                model = new VskVslSkdHisVO();
                if (bfrVslCd[i] != null)
                    model.setBfrVslCd(bfrVslCd[i]);
                if (aftVpsPortCd[i] != null)
                    model.setAftVpsPortCd(aftVpsPortCd[i]);
                if (bfrVpsEtaDt[i] != null)
                    model.setBfrVpsEtaDt(bfrVpsEtaDt[i]);
                if (aftSkdVoyNo[i] != null)
                    model.setAftSkdVoyNo(aftSkdVoyNo[i]);
                if (bfrVslSlanCd[i] != null)
                    model.setBfrVslSlanCd(bfrVslSlanCd[i]);
                if (bfrYdCd[i] != null)
                    model.setBfrYdCd(bfrYdCd[i]);
                if (aftVpsEtdDt[i] != null)
                    model.setAftVpsEtdDt(aftVpsEtdDt[i]);
                if (vslDlayRsnLocCd[i] != null)
                    model.setVslDlayRsnLocCd(vslDlayRsnLocCd[i]);
                if (bfrSkdDirCd[i] != null)
                    model.setBfrSkdDirCd(bfrSkdDirCd[i]);
                if (bfrVpsEtbDt[i] != null)
                    model.setBfrVpsEtbDt(bfrVpsEtbDt[i]);
                if (bfrVpsPortCd[i] != null)
                    model.setBfrVpsPortCd(bfrVpsPortCd[i]);
                if (bfrSkdVoyNo[i] != null)
                    model.setBfrSkdVoyNo(bfrSkdVoyNo[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (vskdTpCd[i] != null)
                    model.setVskdTpCd(vskdTpCd[i]);
                if (bfrVpsEtdDt[i] != null)
                    model.setBfrVpsEtdDt(bfrVpsEtdDt[i]);
                if (aftVslSlanCd[i] != null)
                    model.setAftVslSlanCd(aftVslSlanCd[i]);
                if (vslDlayRsnCd[i] != null)
                    model.setVslDlayRsnCd(vslDlayRsnCd[i]);
                if (vskdCngTpCd[i] != null)
                    model.setVskdCngTpCd(vskdCngTpCd[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (aftYdCd[i] != null)
                    model.setAftYdCd(aftYdCd[i]);
                if (vskdCngNo[i] != null)
                    model.setVskdCngNo(vskdCngNo[i]);
                if (aftVslCd[i] != null)
                    model.setAftVslCd(aftVslCd[i]);
                if (aftVpsEtaDt[i] != null)
                    model.setAftVpsEtaDt(aftVpsEtaDt[i]);
                if (diffRmk[i] != null)
                    model.setDiffRmk(diffRmk[i]);
                if (bfrClptIndSeq[i] != null)
                    model.setBfrClptIndSeq(bfrClptIndSeq[i]);
                if (aftSkdDirCd[i] != null)
                    model.setAftSkdDirCd(aftSkdDirCd[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (aftClptIndSeq[i] != null)
                    model.setAftClptIndSeq(aftClptIndSeq[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (aftVpsEtbDt[i] != null)
                    model.setAftVpsEtbDt(aftVpsEtbDt[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (vtAddCallFlg[i] != null)
                    model.setVtAddCallFlg(vtAddCallFlg[i]);
                if (bfrActCrrCd[i] != null)
                    model.setBfrActCrrCd(bfrActCrrCd[i]);
                if (bfrPfSkdTpCd[i] != null) 
		    		model.setBfrPfSkdTpCd(bfrPfSkdTpCd[i]);
				/* Add a Method line, do not delete */
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getVskVslSkdHisVOs();
    }

    /**
	 * 여러 VO Calss를 배열화 한다 
	 * @return VskVslSkdHisVO[]
	 */
    public VskVslSkdHisVO[] getVskVslSkdHisVOs() {
        VskVslSkdHisVO[] vos = (VskVslSkdHisVO[]) models.toArray(new VskVslSkdHisVO[models.size()]);
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
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 */
    private String[] getField(Field[] field, int i) {
        String[] arr = null;
        try {
            arr = (String[]) field[i].get(this);
        } catch (Exception ex) {
            arr = getFieldCatct(field, i, arr);
        }
        return arr;
    }

    /**
	 * getField 에서 catch문에 대한 로직
	 * @param field
	 * @param i
	 * @param arr
	 * @return arr
	 */
    private String[] getFieldCatct(Field[] field, int i, String[] arr) {
        try {
            arr = new String[1];
            arr[0] = String.valueOf(field[i].get(this));
        } catch (IllegalAccessException e) {
            return null;
        }
        return arr;
    }

    /**
	* DataFormat 설정
	*/
    public void unDataFormat() {
        this.bfrVslCd = this.bfrVslCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.aftVpsPortCd = this.aftVpsPortCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bfrVpsEtaDt = this.bfrVpsEtaDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.aftSkdVoyNo = this.aftSkdVoyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bfrVslSlanCd = this.bfrVslSlanCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bfrYdCd = this.bfrYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.aftVpsEtdDt = this.aftVpsEtdDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vslDlayRsnLocCd = this.vslDlayRsnLocCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bfrSkdDirCd = this.bfrSkdDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bfrVpsEtbDt = this.bfrVpsEtbDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bfrVpsPortCd = this.bfrVpsPortCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bfrSkdVoyNo = this.bfrSkdVoyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vskdTpCd = this.vskdTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bfrVpsEtdDt = this.bfrVpsEtdDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.aftVslSlanCd = this.aftVslSlanCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vslDlayRsnCd = this.vslDlayRsnCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vskdCngTpCd = this.vskdCngTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.aftYdCd = this.aftYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vskdCngNo = this.vskdCngNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.aftVslCd = this.aftVslCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.aftVpsEtaDt = this.aftVpsEtaDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.diffRmk = this.diffRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bfrClptIndSeq = this.bfrClptIndSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.aftSkdDirCd = this.aftSkdDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.aftClptIndSeq = this.aftClptIndSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.aftVpsEtbDt = this.aftVpsEtbDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vtAddCallFlg = this.vtAddCallFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bfrActCrrCd = this.bfrActCrrCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bfrPfSkdTpCd = this.bfrPfSkdTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
