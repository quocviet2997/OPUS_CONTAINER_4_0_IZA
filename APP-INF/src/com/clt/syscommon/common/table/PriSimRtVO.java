/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : PriSimRtVO.java
*@FileTitle : PriSimRtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2015.03.10
*@LastModifier : 
*@LastVersion : 1.0
* 2015.03.10  
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
public class PriSimRtVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L;

    private Collection<PriSimRtVO> models = new ArrayList<PriSimRtVO>();

    /* Column Info */
    private String prcCgoTpCd = null;

    /* Column Info */
    private String rtAplyDt = null;

    /* Column Info */
    private String cntrSzCd = null;

    /* Column Info */
    private String creDt = null;

    /* Column Info */
    private String rtAplyDtMtchFlg = null;

    /* Column Info */
    private String socMtchFlg = null;

    /* Column Info */
    private String orgIhcMtchFlg = null;

    /* Column Info */
    private String edwUpdDt = null;

    /* Column Info */
    private String orgArbMtchFlg = null;

    /* Column Info */
    private String pctlNo = null;

    /* Page Number */
    private String pagerows = null;

    /* Column Info */
    private String ctrtNo = null;

    /* Column Info */
    private String hngrMtchFlg = null;

    /* VO Data Value( C:Creation, U:Update, D:Delete ) */
    private String ibflag = null;

    /* Column Info */
    private String cntrTpCd = null;

    /* Column Info */
    private String cmdtCd = null;

    /* Column Info */
    private String autoRatFlg = null;

    /* Column Info */
    private String rcvTermCd = null;

    /* Column Info */
    private String prcCtrtTpCd = null;

    /* Column Info */
    private String updUsrId = null;

    /* Column Info */
    private String rcvTermMtchFlg = null;

    /* Column Info */
    private String updDt = null;

    /* Column Info */
    private String ocnMtchFlg = null;

    /* Column Info */
    private String destIhcMtchFlg = null;

    /* Column Info */
    private String destArbMtchFlg = null;

    /* Column Info */
    private String deTermMtchFlg = null;

    /* Column Info */
    private String cgoTpMtchFlg = null;

    /* Column Info */
    private String deTermCd = null;

    /* Column Info */
    private String creUsrId = null;

    /* Column Info */
    private String prcHngrBarTpCd = null;

    /* Column Info */
    private String cmdtSeq = null;

    /* Column Info */
    private String cntrTpCdMtchFlg = null;

    /* Column Info */
    private String rtMtchFlg = null;

    /* Column Info */
    private String svcScpCd = null;

    /*	테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

    /*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();

    public PriSimRtVO() {
    }

    public PriSimRtVO(String ibflag, String pagerows, String pctlNo, String cntrSzCd, String cmdtCd, String prcCtrtTpCd, String ctrtNo, String rtMtchFlg, String rtAplyDt, String rtAplyDtMtchFlg, String rcvTermCd, String rcvTermMtchFlg, String deTermCd, String deTermMtchFlg, String orgIhcMtchFlg, String orgArbMtchFlg, String ocnMtchFlg, String destArbMtchFlg, String destIhcMtchFlg, String prcCgoTpCd, String cgoTpMtchFlg, String cntrTpCd, String cntrTpCdMtchFlg, String socMtchFlg, String prcHngrBarTpCd, String hngrMtchFlg, String creUsrId, String creDt, String updUsrId, String updDt, String edwUpdDt, String cmdtSeq, String autoRatFlg, String svcScpCd) {
        this.prcCgoTpCd = prcCgoTpCd;
        this.rtAplyDt = rtAplyDt;
        this.cntrSzCd = cntrSzCd;
        this.creDt = creDt;
        this.rtAplyDtMtchFlg = rtAplyDtMtchFlg;
        this.socMtchFlg = socMtchFlg;
        this.orgIhcMtchFlg = orgIhcMtchFlg;
        this.edwUpdDt = edwUpdDt;
        this.orgArbMtchFlg = orgArbMtchFlg;
        this.pctlNo = pctlNo;
        this.pagerows = pagerows;
        this.ctrtNo = ctrtNo;
        this.hngrMtchFlg = hngrMtchFlg;
        this.ibflag = ibflag;
        this.cntrTpCd = cntrTpCd;
        this.cmdtCd = cmdtCd;
        this.autoRatFlg = autoRatFlg;
        this.rcvTermCd = rcvTermCd;
        this.prcCtrtTpCd = prcCtrtTpCd;
        this.updUsrId = updUsrId;
        this.rcvTermMtchFlg = rcvTermMtchFlg;
        this.updDt = updDt;
        this.ocnMtchFlg = ocnMtchFlg;
        this.destIhcMtchFlg = destIhcMtchFlg;
        this.destArbMtchFlg = destArbMtchFlg;
        this.deTermMtchFlg = deTermMtchFlg;
        this.cgoTpMtchFlg = cgoTpMtchFlg;
        this.deTermCd = deTermCd;
        this.creUsrId = creUsrId;
        this.prcHngrBarTpCd = prcHngrBarTpCd;
        this.cmdtSeq = cmdtSeq;
        this.cntrTpCdMtchFlg = cntrTpCdMtchFlg;
        this.rtMtchFlg = rtMtchFlg;
        this.svcScpCd = svcScpCd;
    }

    /**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("prc_cgo_tp_cd", getPrcCgoTpCd());
        this.hashColumns.put("rt_aply_dt", getRtAplyDt());
        this.hashColumns.put("cntr_sz_cd", getCntrSzCd());
        this.hashColumns.put("cre_dt", getCreDt());
        this.hashColumns.put("rt_aply_dt_mtch_flg", getRtAplyDtMtchFlg());
        this.hashColumns.put("soc_mtch_flg", getSocMtchFlg());
        this.hashColumns.put("org_ihc_mtch_flg", getOrgIhcMtchFlg());
        this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
        this.hashColumns.put("org_arb_mtch_flg", getOrgArbMtchFlg());
        this.hashColumns.put("pctl_no", getPctlNo());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("ctrt_no", getCtrtNo());
        this.hashColumns.put("hngr_mtch_flg", getHngrMtchFlg());
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("cntr_tp_cd", getCntrTpCd());
        this.hashColumns.put("cmdt_cd", getCmdtCd());
        this.hashColumns.put("auto_rat_flg", getAutoRatFlg());
        this.hashColumns.put("rcv_term_cd", getRcvTermCd());
        this.hashColumns.put("prc_ctrt_tp_cd", getPrcCtrtTpCd());
        this.hashColumns.put("upd_usr_id", getUpdUsrId());
        this.hashColumns.put("rcv_term_mtch_flg", getRcvTermMtchFlg());
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("ocn_mtch_flg", getOcnMtchFlg());
        this.hashColumns.put("dest_ihc_mtch_flg", getDestIhcMtchFlg());
        this.hashColumns.put("dest_arb_mtch_flg", getDestArbMtchFlg());
        this.hashColumns.put("de_term_mtch_flg", getDeTermMtchFlg());
        this.hashColumns.put("cgo_tp_mtch_flg", getCgoTpMtchFlg());
        this.hashColumns.put("de_term_cd", getDeTermCd());
        this.hashColumns.put("cre_usr_id", getCreUsrId());
        this.hashColumns.put("prc_hngr_bar_tp_cd", getPrcHngrBarTpCd());
        this.hashColumns.put("cmdt_seq", getCmdtSeq());
        this.hashColumns.put("cntr_tp_cd_mtch_flg", getCntrTpCdMtchFlg());
        this.hashColumns.put("rt_mtch_flg", getRtMtchFlg());
        this.hashColumns.put("svc_scp_cd", getSvcScpCd());
        return this.hashColumns;
    }

    /**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("prc_cgo_tp_cd", "prcCgoTpCd");
        this.hashFields.put("rt_aply_dt", "rtAplyDt");
        this.hashFields.put("cntr_sz_cd", "cntrSzCd");
        this.hashFields.put("cre_dt", "creDt");
        this.hashFields.put("rt_aply_dt_mtch_flg", "rtAplyDtMtchFlg");
        this.hashFields.put("soc_mtch_flg", "socMtchFlg");
        this.hashFields.put("org_ihc_mtch_flg", "orgIhcMtchFlg");
        this.hashFields.put("edw_upd_dt", "edwUpdDt");
        this.hashFields.put("org_arb_mtch_flg", "orgArbMtchFlg");
        this.hashFields.put("pctl_no", "pctlNo");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("ctrt_no", "ctrtNo");
        this.hashFields.put("hngr_mtch_flg", "hngrMtchFlg");
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("cntr_tp_cd", "cntrTpCd");
        this.hashFields.put("cmdt_cd", "cmdtCd");
        this.hashFields.put("auto_rat_flg", "autoRatFlg");
        this.hashFields.put("rcv_term_cd", "rcvTermCd");
        this.hashFields.put("prc_ctrt_tp_cd", "prcCtrtTpCd");
        this.hashFields.put("upd_usr_id", "updUsrId");
        this.hashFields.put("rcv_term_mtch_flg", "rcvTermMtchFlg");
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("ocn_mtch_flg", "ocnMtchFlg");
        this.hashFields.put("dest_ihc_mtch_flg", "destIhcMtchFlg");
        this.hashFields.put("dest_arb_mtch_flg", "destArbMtchFlg");
        this.hashFields.put("de_term_mtch_flg", "deTermMtchFlg");
        this.hashFields.put("cgo_tp_mtch_flg", "cgoTpMtchFlg");
        this.hashFields.put("de_term_cd", "deTermCd");
        this.hashFields.put("cre_usr_id", "creUsrId");
        this.hashFields.put("prc_hngr_bar_tp_cd", "prcHngrBarTpCd");
        this.hashFields.put("cmdt_seq", "cmdtSeq");
        this.hashFields.put("cntr_tp_cd_mtch_flg", "cntrTpCdMtchFlg");
        this.hashFields.put("rt_mtch_flg", "rtMtchFlg");
        this.hashFields.put("svc_scp_cd", "svcScpCd");
        return this.hashFields;
    }

    /**
	 * Column Info
	 * @return prcCgoTpCd
	 */
    public String getPrcCgoTpCd() {
        return this.prcCgoTpCd;
    }

    /**
	 * Column Info
	 * @return rtAplyDt
	 */
    public String getRtAplyDt() {
        return this.rtAplyDt;
    }

    /**
	 * Column Info
	 * @return cntrSzCd
	 */
    public String getCntrSzCd() {
        return this.cntrSzCd;
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
	 * @return rtAplyDtMtchFlg
	 */
    public String getRtAplyDtMtchFlg() {
        return this.rtAplyDtMtchFlg;
    }

    /**
	 * Column Info
	 * @return socMtchFlg
	 */
    public String getSocMtchFlg() {
        return this.socMtchFlg;
    }

    /**
	 * Column Info
	 * @return orgIhcMtchFlg
	 */
    public String getOrgIhcMtchFlg() {
        return this.orgIhcMtchFlg;
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
	 * @return orgArbMtchFlg
	 */
    public String getOrgArbMtchFlg() {
        return this.orgArbMtchFlg;
    }

    /**
	 * Column Info
	 * @return pctlNo
	 */
    public String getPctlNo() {
        return this.pctlNo;
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
	 * @return ctrtNo
	 */
    public String getCtrtNo() {
        return this.ctrtNo;
    }

    /**
	 * Column Info
	 * @return hngrMtchFlg
	 */
    public String getHngrMtchFlg() {
        return this.hngrMtchFlg;
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
	 * @return cntrTpCd
	 */
    public String getCntrTpCd() {
        return this.cntrTpCd;
    }

    /**
	 * Column Info
	 * @return cmdtCd
	 */
    public String getCmdtCd() {
        return this.cmdtCd;
    }

    /**
	 * Column Info
	 * @return autoRatFlg
	 */
    public String getAutoRatFlg() {
        return this.autoRatFlg;
    }

    /**
	 * Column Info
	 * @return rcvTermCd
	 */
    public String getRcvTermCd() {
        return this.rcvTermCd;
    }

    /**
	 * Column Info
	 * @return prcCtrtTpCd
	 */
    public String getPrcCtrtTpCd() {
        return this.prcCtrtTpCd;
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
	 * @return rcvTermMtchFlg
	 */
    public String getRcvTermMtchFlg() {
        return this.rcvTermMtchFlg;
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
	 * @return ocnMtchFlg
	 */
    public String getOcnMtchFlg() {
        return this.ocnMtchFlg;
    }

    /**
	 * Column Info
	 * @return destIhcMtchFlg
	 */
    public String getDestIhcMtchFlg() {
        return this.destIhcMtchFlg;
    }

    /**
	 * Column Info
	 * @return destArbMtchFlg
	 */
    public String getDestArbMtchFlg() {
        return this.destArbMtchFlg;
    }

    /**
	 * Column Info
	 * @return deTermMtchFlg
	 */
    public String getDeTermMtchFlg() {
        return this.deTermMtchFlg;
    }

    /**
	 * Column Info
	 * @return cgoTpMtchFlg
	 */
    public String getCgoTpMtchFlg() {
        return this.cgoTpMtchFlg;
    }

    /**
	 * Column Info
	 * @return deTermCd
	 */
    public String getDeTermCd() {
        return this.deTermCd;
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
	 * @return prcHngrBarTpCd
	 */
    public String getPrcHngrBarTpCd() {
        return this.prcHngrBarTpCd;
    }

    /**
	 * Column Info
	 * @return cmdtSeq
	 */
    public String getCmdtSeq() {
        return this.cmdtSeq;
    }

    /**
	 * Column Info
	 * @return cntrTpCdMtchFlg
	 */
    public String getCntrTpCdMtchFlg() {
        return this.cntrTpCdMtchFlg;
    }

    /**
	 * Column Info
	 * @return rtMtchFlg
	 */
    public String getRtMtchFlg() {
        return this.rtMtchFlg;
    }

    /**
	 * Column Info
	 * @param prcCgoTpCd
	 */
    public void setPrcCgoTpCd(String prcCgoTpCd) {
        this.prcCgoTpCd = prcCgoTpCd;
    }

    /**
	 * Column Info
	 * @param rtAplyDt
	 */
    public void setRtAplyDt(String rtAplyDt) {
        this.rtAplyDt = rtAplyDt;
    }

    /**
	 * Column Info
	 * @param cntrSzCd
	 */
    public void setCntrSzCd(String cntrSzCd) {
        this.cntrSzCd = cntrSzCd;
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
	 * @param rtAplyDtMtchFlg
	 */
    public void setRtAplyDtMtchFlg(String rtAplyDtMtchFlg) {
        this.rtAplyDtMtchFlg = rtAplyDtMtchFlg;
    }

    /**
	 * Column Info
	 * @param socMtchFlg
	 */
    public void setSocMtchFlg(String socMtchFlg) {
        this.socMtchFlg = socMtchFlg;
    }

    /**
	 * Column Info
	 * @param orgIhcMtchFlg
	 */
    public void setOrgIhcMtchFlg(String orgIhcMtchFlg) {
        this.orgIhcMtchFlg = orgIhcMtchFlg;
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
	 * @param orgArbMtchFlg
	 */
    public void setOrgArbMtchFlg(String orgArbMtchFlg) {
        this.orgArbMtchFlg = orgArbMtchFlg;
    }

    /**
	 * Column Info
	 * @param pctlNo
	 */
    public void setPctlNo(String pctlNo) {
        this.pctlNo = pctlNo;
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
	 * @param ctrtNo
	 */
    public void setCtrtNo(String ctrtNo) {
        this.ctrtNo = ctrtNo;
    }

    /**
	 * Column Info
	 * @param hngrMtchFlg
	 */
    public void setHngrMtchFlg(String hngrMtchFlg) {
        this.hngrMtchFlg = hngrMtchFlg;
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
	 * @param cntrTpCd
	 */
    public void setCntrTpCd(String cntrTpCd) {
        this.cntrTpCd = cntrTpCd;
    }

    /**
	 * Column Info
	 * @param cmdtCd
	 */
    public void setCmdtCd(String cmdtCd) {
        this.cmdtCd = cmdtCd;
    }

    /**
	 * Column Info
	 * @param autoRatFlg
	 */
    public void setAutoRatFlg(String autoRatFlg) {
        this.autoRatFlg = autoRatFlg;
    }

    /**
	 * Column Info
	 * @param rcvTermCd
	 */
    public void setRcvTermCd(String rcvTermCd) {
        this.rcvTermCd = rcvTermCd;
    }

    /**
	 * Column Info
	 * @param prcCtrtTpCd
	 */
    public void setPrcCtrtTpCd(String prcCtrtTpCd) {
        this.prcCtrtTpCd = prcCtrtTpCd;
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
	 * @param rcvTermMtchFlg
	 */
    public void setRcvTermMtchFlg(String rcvTermMtchFlg) {
        this.rcvTermMtchFlg = rcvTermMtchFlg;
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
	 * @param ocnMtchFlg
	 */
    public void setOcnMtchFlg(String ocnMtchFlg) {
        this.ocnMtchFlg = ocnMtchFlg;
    }

    /**
	 * Column Info
	 * @param destIhcMtchFlg
	 */
    public void setDestIhcMtchFlg(String destIhcMtchFlg) {
        this.destIhcMtchFlg = destIhcMtchFlg;
    }

    /**
	 * Column Info
	 * @param destArbMtchFlg
	 */
    public void setDestArbMtchFlg(String destArbMtchFlg) {
        this.destArbMtchFlg = destArbMtchFlg;
    }

    /**
	 * Column Info
	 * @param deTermMtchFlg
	 */
    public void setDeTermMtchFlg(String deTermMtchFlg) {
        this.deTermMtchFlg = deTermMtchFlg;
    }

    /**
	 * Column Info
	 * @param cgoTpMtchFlg
	 */
    public void setCgoTpMtchFlg(String cgoTpMtchFlg) {
        this.cgoTpMtchFlg = cgoTpMtchFlg;
    }

    /**
	 * Column Info
	 * @param deTermCd
	 */
    public void setDeTermCd(String deTermCd) {
        this.deTermCd = deTermCd;
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
	 * @param prcHngrBarTpCd
	 */
    public void setPrcHngrBarTpCd(String prcHngrBarTpCd) {
        this.prcHngrBarTpCd = prcHngrBarTpCd;
    }

    /**
	 * Column Info
	 * @param cmdtSeq
	 */
    public void setCmdtSeq(String cmdtSeq) {
        this.cmdtSeq = cmdtSeq;
    }

    /**
	 * Column Info
	 * @param cntrTpCdMtchFlg
	 */
    public void setCntrTpCdMtchFlg(String cntrTpCdMtchFlg) {
        this.cntrTpCdMtchFlg = cntrTpCdMtchFlg;
    }

    /**
	 * Column Info
	 * @param rtMtchFlg
	 */
    public void setRtMtchFlg(String rtMtchFlg) {
        this.rtMtchFlg = rtMtchFlg;
    }

    public void setSvcScpCd(String svcScpCd) {
        this.svcScpCd = svcScpCd;
    }

    public String getSvcScpCd() {
        return this.svcScpCd;
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
        setPrcCgoTpCd(JSPUtil.getParameter(request, prefix + "prc_cgo_tp_cd", ""));
        setRtAplyDt(JSPUtil.getParameter(request, prefix + "rt_aply_dt", ""));
        setCntrSzCd(JSPUtil.getParameter(request, prefix + "cntr_sz_cd", ""));
        setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
        setRtAplyDtMtchFlg(JSPUtil.getParameter(request, prefix + "rt_aply_dt_mtch_flg", ""));
        setSocMtchFlg(JSPUtil.getParameter(request, prefix + "soc_mtch_flg", ""));
        setOrgIhcMtchFlg(JSPUtil.getParameter(request, prefix + "org_ihc_mtch_flg", ""));
        setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
        setOrgArbMtchFlg(JSPUtil.getParameter(request, prefix + "org_arb_mtch_flg", ""));
        setPctlNo(JSPUtil.getParameter(request, prefix + "pctl_no", ""));
        setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
        setCtrtNo(JSPUtil.getParameter(request, prefix + "ctrt_no", ""));
        setHngrMtchFlg(JSPUtil.getParameter(request, prefix + "hngr_mtch_flg", ""));
        setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
        setCntrTpCd(JSPUtil.getParameter(request, prefix + "cntr_tp_cd", ""));
        setCmdtCd(JSPUtil.getParameter(request, prefix + "cmdt_cd", ""));
        setAutoRatFlg(JSPUtil.getParameter(request, prefix + "auto_rat_flg", ""));
        setRcvTermCd(JSPUtil.getParameter(request, prefix + "rcv_term_cd", ""));
        setPrcCtrtTpCd(JSPUtil.getParameter(request, prefix + "prc_ctrt_tp_cd", ""));
        setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
        setRcvTermMtchFlg(JSPUtil.getParameter(request, prefix + "rcv_term_mtch_flg", ""));
        setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
        setOcnMtchFlg(JSPUtil.getParameter(request, prefix + "ocn_mtch_flg", ""));
        setDestIhcMtchFlg(JSPUtil.getParameter(request, prefix + "dest_ihc_mtch_flg", ""));
        setDestArbMtchFlg(JSPUtil.getParameter(request, prefix + "dest_arb_mtch_flg", ""));
        setDeTermMtchFlg(JSPUtil.getParameter(request, prefix + "de_term_mtch_flg", ""));
        setCgoTpMtchFlg(JSPUtil.getParameter(request, prefix + "cgo_tp_mtch_flg", ""));
        setDeTermCd(JSPUtil.getParameter(request, prefix + "de_term_cd", ""));
        setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
        setPrcHngrBarTpCd(JSPUtil.getParameter(request, prefix + "prc_hngr_bar_tp_cd", ""));
        setCmdtSeq(JSPUtil.getParameter(request, prefix + "cmdt_seq", ""));
        setCntrTpCdMtchFlg(JSPUtil.getParameter(request, prefix + "cntr_tp_cd_mtch_flg", ""));
        setRtMtchFlg(JSPUtil.getParameter(request, prefix + "rt_mtch_flg", ""));
        setSvcScpCd(JSPUtil.getParameter(request, prefix + "svc_scp_cd", ""));
    }

    /**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriSimRtVO[]
	 */
    public PriSimRtVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriSimRtVO[]
	 */
    public PriSimRtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        PriSimRtVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] prcCgoTpCd = (JSPUtil.getParameter(request, prefix + "prc_cgo_tp_cd", length));
            String[] rtAplyDt = (JSPUtil.getParameter(request, prefix + "rt_aply_dt", length));
            String[] cntrSzCd = (JSPUtil.getParameter(request, prefix + "cntr_sz_cd", length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
            String[] rtAplyDtMtchFlg = (JSPUtil.getParameter(request, prefix + "rt_aply_dt_mtch_flg", length));
            String[] socMtchFlg = (JSPUtil.getParameter(request, prefix + "soc_mtch_flg", length));
            String[] orgIhcMtchFlg = (JSPUtil.getParameter(request, prefix + "org_ihc_mtch_flg", length));
            String[] edwUpdDt = (JSPUtil.getParameter(request, prefix + "edw_upd_dt", length));
            String[] orgArbMtchFlg = (JSPUtil.getParameter(request, prefix + "org_arb_mtch_flg", length));
            String[] pctlNo = (JSPUtil.getParameter(request, prefix + "pctl_no", length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
            String[] ctrtNo = (JSPUtil.getParameter(request, prefix + "ctrt_no", length));
            String[] hngrMtchFlg = (JSPUtil.getParameter(request, prefix + "hngr_mtch_flg", length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
            String[] cntrTpCd = (JSPUtil.getParameter(request, prefix + "cntr_tp_cd", length));
            String[] cmdtCd = (JSPUtil.getParameter(request, prefix + "cmdt_cd", length));
            String[] autoRatFlg = (JSPUtil.getParameter(request, prefix + "auto_rat_flg", length));
            String[] rcvTermCd = (JSPUtil.getParameter(request, prefix + "rcv_term_cd", length));
            String[] prcCtrtTpCd = (JSPUtil.getParameter(request, prefix + "prc_ctrt_tp_cd", length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
            String[] rcvTermMtchFlg = (JSPUtil.getParameter(request, prefix + "rcv_term_mtch_flg", length));
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
            String[] ocnMtchFlg = (JSPUtil.getParameter(request, prefix + "ocn_mtch_flg", length));
            String[] destIhcMtchFlg = (JSPUtil.getParameter(request, prefix + "dest_ihc_mtch_flg", length));
            String[] destArbMtchFlg = (JSPUtil.getParameter(request, prefix + "dest_arb_mtch_flg", length));
            String[] deTermMtchFlg = (JSPUtil.getParameter(request, prefix + "de_term_mtch_flg", length));
            String[] cgoTpMtchFlg = (JSPUtil.getParameter(request, prefix + "cgo_tp_mtch_flg", length));
            String[] deTermCd = (JSPUtil.getParameter(request, prefix + "de_term_cd", length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
            String[] prcHngrBarTpCd = (JSPUtil.getParameter(request, prefix + "prc_hngr_bar_tp_cd", length));
            String[] cmdtSeq = (JSPUtil.getParameter(request, prefix + "cmdt_seq", length));
            String[] cntrTpCdMtchFlg = (JSPUtil.getParameter(request, prefix + "cntr_tp_cd_mtch_flg", length));
            String[] rtMtchFlg = (JSPUtil.getParameter(request, prefix + "rt_mtch_flg", length));
            for (int i = 0; i < length; i++) {
                model = new PriSimRtVO();
                if (prcCgoTpCd[i] != null)
                    model.setPrcCgoTpCd(prcCgoTpCd[i]);
                if (rtAplyDt[i] != null)
                    model.setRtAplyDt(rtAplyDt[i]);
                if (cntrSzCd[i] != null)
                    model.setCntrSzCd(cntrSzCd[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (rtAplyDtMtchFlg[i] != null)
                    model.setRtAplyDtMtchFlg(rtAplyDtMtchFlg[i]);
                if (socMtchFlg[i] != null)
                    model.setSocMtchFlg(socMtchFlg[i]);
                if (orgIhcMtchFlg[i] != null)
                    model.setOrgIhcMtchFlg(orgIhcMtchFlg[i]);
                if (edwUpdDt[i] != null)
                    model.setEdwUpdDt(edwUpdDt[i]);
                if (orgArbMtchFlg[i] != null)
                    model.setOrgArbMtchFlg(orgArbMtchFlg[i]);
                if (pctlNo[i] != null)
                    model.setPctlNo(pctlNo[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (ctrtNo[i] != null)
                    model.setCtrtNo(ctrtNo[i]);
                if (hngrMtchFlg[i] != null)
                    model.setHngrMtchFlg(hngrMtchFlg[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (cntrTpCd[i] != null)
                    model.setCntrTpCd(cntrTpCd[i]);
                if (cmdtCd[i] != null)
                    model.setCmdtCd(cmdtCd[i]);
                if (autoRatFlg[i] != null)
                    model.setAutoRatFlg(autoRatFlg[i]);
                if (rcvTermCd[i] != null)
                    model.setRcvTermCd(rcvTermCd[i]);
                if (prcCtrtTpCd[i] != null)
                    model.setPrcCtrtTpCd(prcCtrtTpCd[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                if (rcvTermMtchFlg[i] != null)
                    model.setRcvTermMtchFlg(rcvTermMtchFlg[i]);
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (ocnMtchFlg[i] != null)
                    model.setOcnMtchFlg(ocnMtchFlg[i]);
                if (destIhcMtchFlg[i] != null)
                    model.setDestIhcMtchFlg(destIhcMtchFlg[i]);
                if (destArbMtchFlg[i] != null)
                    model.setDestArbMtchFlg(destArbMtchFlg[i]);
                if (deTermMtchFlg[i] != null)
                    model.setDeTermMtchFlg(deTermMtchFlg[i]);
                if (cgoTpMtchFlg[i] != null)
                    model.setCgoTpMtchFlg(cgoTpMtchFlg[i]);
                if (deTermCd[i] != null)
                    model.setDeTermCd(deTermCd[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (prcHngrBarTpCd[i] != null)
                    model.setPrcHngrBarTpCd(prcHngrBarTpCd[i]);
                if (cmdtSeq[i] != null)
                    model.setCmdtSeq(cmdtSeq[i]);
                if (cntrTpCdMtchFlg[i] != null)
                    model.setCntrTpCdMtchFlg(cntrTpCdMtchFlg[i]);
                if (rtMtchFlg[i] != null)
                    model.setRtMtchFlg(rtMtchFlg[i]);
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getPriSimRtVOs();
    }

    /**
	 * VO 배열을 반환
	 * @return PriSimRtVO[]
	 */
    public PriSimRtVO[] getPriSimRtVOs() {
        PriSimRtVO[] vos = (PriSimRtVO[]) models.toArray(new PriSimRtVO[models.size()]);
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
        this.prcCgoTpCd = this.prcCgoTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rtAplyDt = this.rtAplyDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cntrSzCd = this.cntrSzCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rtAplyDtMtchFlg = this.rtAplyDtMtchFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.socMtchFlg = this.socMtchFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.orgIhcMtchFlg = this.orgIhcMtchFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.edwUpdDt = this.edwUpdDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.orgArbMtchFlg = this.orgArbMtchFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pctlNo = this.pctlNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ctrtNo = this.ctrtNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hngrMtchFlg = this.hngrMtchFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cntrTpCd = this.cntrTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cmdtCd = this.cmdtCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.autoRatFlg = this.autoRatFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rcvTermCd = this.rcvTermCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.prcCtrtTpCd = this.prcCtrtTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rcvTermMtchFlg = this.rcvTermMtchFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ocnMtchFlg = this.ocnMtchFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.destIhcMtchFlg = this.destIhcMtchFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.destArbMtchFlg = this.destArbMtchFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.deTermMtchFlg = this.deTermMtchFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cgoTpMtchFlg = this.cgoTpMtchFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.deTermCd = this.deTermCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.prcHngrBarTpCd = this.prcHngrBarTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cmdtSeq = this.cmdtSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cntrTpCdMtchFlg = this.cntrTpCdMtchFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rtMtchFlg = this.rtMtchFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.svcScpCd = this.svcScpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
