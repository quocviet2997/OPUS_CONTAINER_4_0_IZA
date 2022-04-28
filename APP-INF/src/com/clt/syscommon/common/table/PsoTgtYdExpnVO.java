/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PsoTgtYdExpnVO.java
*@FileTitle : PsoTgtYdExpnVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.21
*@LastModifier : 김진일
*@LastVersion : 1.0
* 2009.09.21 김진일 
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
 * @author 김진일 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */
public class PsoTgtYdExpnVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L;

    private Collection<PsoTgtYdExpnVO> models = new ArrayList<PsoTgtYdExpnVO>();

    /* Column Info */
    private String updDt = null;

    /* Column Info */
    private String vslCd = null;

    /* Column Info */
    private String invUsdAmt = null;

    /* Column Info */
    private String revYrmon = null;

    /* Column Info */
    private String fomlDesc = null;

    /* Column Info */
    private String psoBztpCd = null;

    /* Column Info */
    private String loclCurrCd = null;

    /* Column Info */
    private String creDt = null;

    /* Column Info */
    private String skdVoyNo = null;

    /* Column Info */
    private String invLoclAmt = null;

    /* Column Info */
    private String rlaneCd = null;

    /* Column Info */
    private String ioBndCd = null;

    /* Column Info */
    private String skdDirCd = null;

    /* Page Number */
    private String pagerows = null;

    /* Column Info */
    private String creUsrId = null;

    /* VO Data Value( C:Creation, U:Update, D:Delete ) */
    private String ibflag = null;

    /* Column Info */
    private String ydChgVerSeq = null;

    /* Column Info */
    private String ydCd = null;

    /* Column Info */
    private String lgsCostCd = null;

    /* Column Info */
    private String xprDesc = null;

    /* Column Info */
    private String ydChgNo = null;

    /* Column Info */
    private String updUsrId = null;

    /* Column Info */
    private String vndrSeq = null;

    /* Column Info */
    private String actDt = null;

    /* Column Info */
    private String exeYrmon = null;

    /* Column Info */
    private String turnPortFlg = null;

    /* Column Info */
    private String turnPortIndCd = null;

    /* Column Info */
    private String pfTurnPortIndCd = null;

    /* Column Info */
    private String pendulumFlg = null;

    /* Column Info */
    private String clptIndSeq = null;

    /* Column Info */
    private String clptSeq = null;

    /* Column Info */
    private String revDirCd = null;

    /* Column Info */
    private String rlaneDirCd = null;

    /*	테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new HashMap<String, String>();

    /*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new HashMap<String, String>();

    public PsoTgtYdExpnVO() {
    }

    public PsoTgtYdExpnVO(String ibflag, String pagerows, String psoBztpCd, String vslCd, String skdVoyNo, String skdDirCd, String ydCd, String lgsCostCd, String ioBndCd, String revYrmon, String loclCurrCd, String invLoclAmt, String invUsdAmt, String xprDesc, String fomlDesc, String ydChgNo, String ydChgVerSeq, String creUsrId, String creDt, String updUsrId, String updDt, String rlaneCd, String vndrSeq, String actDt, String exeYrmon, String turnPortFlg, String turnPortIndCd, String pfTurnPortIndCd, String pendulumFlg, String clptIndSeq, String clptSeq, String revDirCd, String rlaneDirCd) {
        this.updDt = updDt;
        this.vslCd = vslCd;
        this.invUsdAmt = invUsdAmt;
        this.revYrmon = revYrmon;
        this.fomlDesc = fomlDesc;
        this.psoBztpCd = psoBztpCd;
        this.loclCurrCd = loclCurrCd;
        this.creDt = creDt;
        this.skdVoyNo = skdVoyNo;
        this.invLoclAmt = invLoclAmt;
        this.rlaneCd = rlaneCd;
        this.ioBndCd = ioBndCd;
        this.skdDirCd = skdDirCd;
        this.pagerows = pagerows;
        this.creUsrId = creUsrId;
        this.ibflag = ibflag;
        this.ydChgVerSeq = ydChgVerSeq;
        this.ydCd = ydCd;
        this.lgsCostCd = lgsCostCd;
        this.xprDesc = xprDesc;
        this.ydChgNo = ydChgNo;
        this.updUsrId = updUsrId;
        this.vndrSeq = vndrSeq;
        this.actDt = actDt;
        this.exeYrmon = exeYrmon;
        this.turnPortFlg = turnPortFlg;
        this.turnPortIndCd = turnPortIndCd;
        this.pfTurnPortIndCd = pfTurnPortIndCd;
        this.pendulumFlg = pendulumFlg;
        this.clptIndSeq = clptIndSeq;
        this.clptSeq = clptSeq;
        this.revDirCd = revDirCd;
        this.rlaneDirCd = rlaneDirCd;
    }

    /**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("vsl_cd", getVslCd());
        this.hashColumns.put("inv_usd_amt", getInvUsdAmt());
        this.hashColumns.put("rev_yrmon", getRevYrmon());
        this.hashColumns.put("foml_desc", getFomlDesc());
        this.hashColumns.put("pso_bztp_cd", getPsoBztpCd());
        this.hashColumns.put("locl_curr_cd", getLoclCurrCd());
        this.hashColumns.put("cre_dt", getCreDt());
        this.hashColumns.put("skd_voy_no", getSkdVoyNo());
        this.hashColumns.put("inv_locl_amt", getInvLoclAmt());
        this.hashColumns.put("rlane_cd", getRlaneCd());
        this.hashColumns.put("io_bnd_cd", getIoBndCd());
        this.hashColumns.put("skd_dir_cd", getSkdDirCd());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("cre_usr_id", getCreUsrId());
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("yd_chg_ver_seq", getYdChgVerSeq());
        this.hashColumns.put("yd_cd", getYdCd());
        this.hashColumns.put("lgs_cost_cd", getLgsCostCd());
        this.hashColumns.put("xpr_desc", getXprDesc());
        this.hashColumns.put("yd_chg_no", getYdChgNo());
        this.hashColumns.put("upd_usr_id", getUpdUsrId());
        this.hashColumns.put("vndr_seq", getVndrSeq());
        this.hashColumns.put("act_dt", getActDt());
        this.hashColumns.put("exe_yrmon", getExeYrmon());
        this.hashColumns.put("turn_port_flg", getTurnPortFlg());
        this.hashColumns.put("turn_port_ind_cd", getTurnPortIndCd());
        this.hashColumns.put("pf_turn_port_ind_cd", getPfTurnPortIndCd());
        this.hashColumns.put("pendulum_flg", getPendulumFlg());
        this.hashColumns.put("clpt_ind_seq", getClptIndSeq());
        this.hashColumns.put("clpt_seq", getClptSeq());
        this.hashColumns.put("rev_dir_cd", getRevDirCd());
        this.hashColumns.put("rlane_dir_cd", getRlaneDirCd());
        return this.hashColumns;
    }

    /**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("vsl_cd", "vslCd");
        this.hashFields.put("inv_usd_amt", "invUsdAmt");
        this.hashFields.put("rev_yrmon", "revYrmon");
        this.hashFields.put("foml_desc", "fomlDesc");
        this.hashFields.put("pso_bztp_cd", "psoBztpCd");
        this.hashFields.put("locl_curr_cd", "loclCurrCd");
        this.hashFields.put("cre_dt", "creDt");
        this.hashFields.put("skd_voy_no", "skdVoyNo");
        this.hashFields.put("inv_locl_amt", "invLoclAmt");
        this.hashFields.put("rlane_cd", "rlaneCd");
        this.hashFields.put("io_bnd_cd", "ioBndCd");
        this.hashFields.put("skd_dir_cd", "skdDirCd");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("cre_usr_id", "creUsrId");
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("yd_chg_ver_seq", "ydChgVerSeq");
        this.hashFields.put("yd_cd", "ydCd");
        this.hashFields.put("lgs_cost_cd", "lgsCostCd");
        this.hashFields.put("xpr_desc", "xprDesc");
        this.hashFields.put("yd_chg_no", "ydChgNo");
        this.hashFields.put("upd_usr_id", "updUsrId");
        this.hashFields.put("vndr_seq", "vndrSeq");
        this.hashFields.put("act_dt", "actDt");
        this.hashFields.put("exe_yrmon", "exeYrmon");
        this.hashFields.put("turn_port_flg", "turnPortFlg");
        this.hashFields.put("turn_port_ind_cd", "turnPortIndCd");
        this.hashFields.put("pf_turn_port_ind_cd", "pfTurnPortIndCd");
        this.hashFields.put("pendulum_flg", "pendulumFlg");
        this.hashFields.put("clpt_ind_seq", "clptIndSeq");
        this.hashFields.put("clpt_seq", "clptSeq");
        this.hashFields.put("rev_dir_cd", "revDirCd");
        this.hashFields.put("rlane_dir_cd", "rlaneDirCd");
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
	 * @return invUsdAmt
	 */
    public String getInvUsdAmt() {
        return this.invUsdAmt;
    }

    /**
	 * Column Info
	 * @return revYrmon
	 */
    public String getRevYrmon() {
        return this.revYrmon;
    }

    /**
	 * Column Info
	 * @return fomlDesc
	 */
    public String getFomlDesc() {
        return this.fomlDesc;
    }

    /**
	 * Column Info
	 * @return psoBztpCd
	 */
    public String getPsoBztpCd() {
        return this.psoBztpCd;
    }

    /**
	 * Column Info
	 * @return loclCurrCd
	 */
    public String getLoclCurrCd() {
        return this.loclCurrCd;
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
	 * @return invLoclAmt
	 */
    public String getInvLoclAmt() {
        return this.invLoclAmt;
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
	 * @return ioBndCd
	 */
    public String getIoBndCd() {
        return this.ioBndCd;
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
	 * @return ydChgVerSeq
	 */
    public String getYdChgVerSeq() {
        return this.ydChgVerSeq;
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
	 * @return lgsCostCd
	 */
    public String getLgsCostCd() {
        return this.lgsCostCd;
    }

    /**
	 * Column Info
	 * @return xprDesc
	 */
    public String getXprDesc() {
        return this.xprDesc;
    }

    /**
	 * Column Info
	 * @return ydChgNo
	 */
    public String getYdChgNo() {
        return this.ydChgNo;
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
	 * @return vndrSeq
	 */
    public String getVndrSeq() {
        return this.vndrSeq;
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
	 * @param invUsdAmt
	 */
    public void setInvUsdAmt(String invUsdAmt) {
        this.invUsdAmt = invUsdAmt;
    }

    /**
	 * Column Info
	 * @param revYrmon
	 */
    public void setRevYrmon(String revYrmon) {
        this.revYrmon = revYrmon;
    }

    /**
	 * Column Info
	 * @param fomlDesc
	 */
    public void setFomlDesc(String fomlDesc) {
        this.fomlDesc = fomlDesc;
    }

    /**
	 * Column Info
	 * @param psoBztpCd
	 */
    public void setPsoBztpCd(String psoBztpCd) {
        this.psoBztpCd = psoBztpCd;
    }

    /**
	 * Column Info
	 * @param loclCurrCd
	 */
    public void setLoclCurrCd(String loclCurrCd) {
        this.loclCurrCd = loclCurrCd;
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
	 * @param invLoclAmt
	 */
    public void setInvLoclAmt(String invLoclAmt) {
        this.invLoclAmt = invLoclAmt;
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
	 * @param ioBndCd
	 */
    public void setIoBndCd(String ioBndCd) {
        this.ioBndCd = ioBndCd;
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
	 * @param ydChgVerSeq
	 */
    public void setYdChgVerSeq(String ydChgVerSeq) {
        this.ydChgVerSeq = ydChgVerSeq;
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
	 * @param lgsCostCd
	 */
    public void setLgsCostCd(String lgsCostCd) {
        this.lgsCostCd = lgsCostCd;
    }

    /**
	 * Column Info
	 * @param xprDesc
	 */
    public void setXprDesc(String xprDesc) {
        this.xprDesc = xprDesc;
    }

    /**
	 * Column Info
	 * @param ydChgNo
	 */
    public void setYdChgNo(String ydChgNo) {
        this.ydChgNo = ydChgNo;
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
	 * @param vndrSeq
	 */
    public void setVndrSeq(String vndrSeq) {
        this.vndrSeq = vndrSeq;
    }

    public void setActDt(String actDt) {
        this.actDt = actDt;
    }

    public String getActDt() {
        return this.actDt;
    }

    public void setExeYrmon(String exeYrmon) {
        this.exeYrmon = exeYrmon;
    }

    public String getExeYrmon() {
        return this.exeYrmon;
    }

    public void setTurnPortFlg(String turnPortFlg) {
        this.turnPortFlg = turnPortFlg;
    }

    public String getTurnPortFlg() {
        return this.turnPortFlg;
    }

    public void setTurnPortIndCd(String turnPortIndCd) {
        this.turnPortIndCd = turnPortIndCd;
    }

    public String getTurnPortIndCd() {
        return this.turnPortIndCd;
    }

    public void setPfTurnPortIndCd(String pfTurnPortIndCd) {
        this.pfTurnPortIndCd = pfTurnPortIndCd;
    }

    public String getPfTurnPortIndCd() {
        return this.pfTurnPortIndCd;
    }

    public void setPendulumFlg(String pendulumFlg) {
        this.pendulumFlg = pendulumFlg;
    }

    public String getPendulumFlg() {
        return this.pendulumFlg;
    }

    public void setClptIndSeq(String clptIndSeq) {
        this.clptIndSeq = clptIndSeq;
    }

    public String getClptIndSeq() {
        return this.clptIndSeq;
    }

    public void setClptSeq(String clptSeq) {
        this.clptSeq = clptSeq;
    }

    public String getClptSeq() {
        return this.clptSeq;
    }

    public void setRevDirCd(String revDirCd) {
        this.revDirCd = revDirCd;
    }

    public String getRevDirCd() {
        return this.revDirCd;
    }

    public void setRlaneDirCd(String rlaneDirCd) {
        this.rlaneDirCd = rlaneDirCd;
    }

    public String getRlaneDirCd() {
        return this.rlaneDirCd;
    }

    /**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
    public void fromRequest(HttpServletRequest request) {
        setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
        setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
        setInvUsdAmt(JSPUtil.getParameter(request, "inv_usd_amt", ""));
        setRevYrmon(JSPUtil.getParameter(request, "rev_yrmon", ""));
        setFomlDesc(JSPUtil.getParameter(request, "foml_desc", ""));
        setPsoBztpCd(JSPUtil.getParameter(request, "pso_bztp_cd", ""));
        setLoclCurrCd(JSPUtil.getParameter(request, "locl_curr_cd", ""));
        setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
        setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
        setInvLoclAmt(JSPUtil.getParameter(request, "inv_locl_amt", ""));
        setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
        setIoBndCd(JSPUtil.getParameter(request, "io_bnd_cd", ""));
        setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
        setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
        setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
        setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
        setYdChgVerSeq(JSPUtil.getParameter(request, "yd_chg_ver_seq", ""));
        setYdCd(JSPUtil.getParameter(request, "yd_cd", ""));
        setLgsCostCd(JSPUtil.getParameter(request, "lgs_cost_cd", ""));
        setXprDesc(JSPUtil.getParameter(request, "xpr_desc", ""));
        setYdChgNo(JSPUtil.getParameter(request, "yd_chg_no", ""));
        setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
        setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
        setActDt(JSPUtil.getParameter(request, "act_dt", ""));
        setExeYrmon(JSPUtil.getParameter(request, "exe_yrmon", ""));
        setTurnPortFlg(JSPUtil.getParameter(request, "turn_port_flg", ""));
        setTurnPortIndCd(JSPUtil.getParameter(request, "turn_port_ind_cd", ""));
        setPfTurnPortIndCd(JSPUtil.getParameter(request, "pf_turn_port_ind_cd", ""));
        setPendulumFlg(JSPUtil.getParameter(request, "pendulum_flg", ""));
        setClptIndSeq(JSPUtil.getParameter(request, "clpt_ind_seq", ""));
        setClptSeq(JSPUtil.getParameter(request, "clpt_seq", ""));
        setRevDirCd(JSPUtil.getParameter(request, "rev_dir_cd", ""));
        setRlaneDirCd(JSPUtil.getParameter(request, "rlane_dir_cd", ""));
    }

    /**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PsoTgtYdExpnVO[]
	 */
    public PsoTgtYdExpnVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PsoTgtYdExpnVO[]
	 */
    public PsoTgtYdExpnVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        PsoTgtYdExpnVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
            String[] vslCd = (JSPUtil.getParameter(request, prefix + "vsl_cd", length));
            String[] invUsdAmt = (JSPUtil.getParameter(request, prefix + "inv_usd_amt", length));
            String[] revYrmon = (JSPUtil.getParameter(request, prefix + "rev_yrmon", length));
            String[] fomlDesc = (JSPUtil.getParameter(request, prefix + "foml_desc", length));
            String[] psoBztpCd = (JSPUtil.getParameter(request, prefix + "pso_bztp_cd", length));
            String[] loclCurrCd = (JSPUtil.getParameter(request, prefix + "locl_curr_cd", length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
            String[] skdVoyNo = (JSPUtil.getParameter(request, prefix + "skd_voy_no", length));
            String[] invLoclAmt = (JSPUtil.getParameter(request, prefix + "inv_locl_amt", length));
            String[] rlaneCd = (JSPUtil.getParameter(request, prefix + "rlane_cd", length));
            String[] ioBndCd = (JSPUtil.getParameter(request, prefix + "io_bnd_cd", length));
            String[] skdDirCd = (JSPUtil.getParameter(request, prefix + "skd_dir_cd", length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
            String[] ydChgVerSeq = (JSPUtil.getParameter(request, prefix + "yd_chg_ver_seq", length));
            String[] ydCd = (JSPUtil.getParameter(request, prefix + "yd_cd", length));
            String[] lgsCostCd = (JSPUtil.getParameter(request, prefix + "lgs_cost_cd", length));
            String[] xprDesc = (JSPUtil.getParameter(request, prefix + "xpr_desc", length));
            String[] ydChgNo = (JSPUtil.getParameter(request, prefix + "yd_chg_no", length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
            String[] vndrSeq = (JSPUtil.getParameter(request, prefix + "vndr_seq", length));
            String[] actDt = (JSPUtil.getParameter(request, prefix + "act_dt", length));
            String[] exeYrmon = (JSPUtil.getParameter(request, prefix + "exe_yrmon", length));
            String[] turnPortFlg = (JSPUtil.getParameter(request, prefix + "turn_port_flg", length));
            String[] turnPortIndCd = (JSPUtil.getParameter(request, prefix + "turn_port_ind_cd", length));
            String[] pfTurnPortIndCd = (JSPUtil.getParameter(request, prefix + "pf_turn_port_ind_cd", length));
            String[] pendulumFlg = (JSPUtil.getParameter(request, prefix + "pendulum_flg", length));
            String[] clptIndSeq = (JSPUtil.getParameter(request, prefix + "clpt_ind_seq", length));
            String[] clptSeq = (JSPUtil.getParameter(request, prefix + "clpt_seq", length));
            String[] revDirCd = (JSPUtil.getParameter(request, prefix + "rev_dir_cd", length));
            String[] rlaneDirCd = (JSPUtil.getParameter(request, prefix + "rlane_dir_cd", length));
	    	/* Add a field line, do not delete */
            for (int i = 0; i < length; i++) {
                model = new PsoTgtYdExpnVO();
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (vslCd[i] != null)
                    model.setVslCd(vslCd[i]);
                if (invUsdAmt[i] != null)
                    model.setInvUsdAmt(invUsdAmt[i]);
                if (revYrmon[i] != null)
                    model.setRevYrmon(revYrmon[i]);
                if (fomlDesc[i] != null)
                    model.setFomlDesc(fomlDesc[i]);
                if (psoBztpCd[i] != null)
                    model.setPsoBztpCd(psoBztpCd[i]);
                if (loclCurrCd[i] != null)
                    model.setLoclCurrCd(loclCurrCd[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (skdVoyNo[i] != null)
                    model.setSkdVoyNo(skdVoyNo[i]);
                if (invLoclAmt[i] != null)
                    model.setInvLoclAmt(invLoclAmt[i]);
                if (rlaneCd[i] != null)
                    model.setRlaneCd(rlaneCd[i]);
                if (ioBndCd[i] != null)
                    model.setIoBndCd(ioBndCd[i]);
                if (skdDirCd[i] != null)
                    model.setSkdDirCd(skdDirCd[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (ydChgVerSeq[i] != null)
                    model.setYdChgVerSeq(ydChgVerSeq[i]);
                if (ydCd[i] != null)
                    model.setYdCd(ydCd[i]);
                if (lgsCostCd[i] != null)
                    model.setLgsCostCd(lgsCostCd[i]);
                if (xprDesc[i] != null)
                    model.setXprDesc(xprDesc[i]);
                if (ydChgNo[i] != null)
                    model.setYdChgNo(ydChgNo[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                if (vndrSeq[i] != null)
                    model.setVndrSeq(vndrSeq[i]);
                if (actDt[i] != null)
                    model.setActDt(actDt[i]);
                if (exeYrmon[i] != null)
                    model.setExeYrmon(exeYrmon[i]);
                if (turnPortFlg[i] != null)
                    model.setTurnPortFlg(turnPortFlg[i]);
                if (turnPortIndCd[i] != null)
                    model.setTurnPortIndCd(turnPortIndCd[i]);
                if (pfTurnPortIndCd[i] != null)
                    model.setPfTurnPortIndCd(pfTurnPortIndCd[i]);
                if (pendulumFlg[i] != null)
                    model.setPendulumFlg(pendulumFlg[i]);
                if (clptIndSeq[i] != null)
                    model.setClptIndSeq(clptIndSeq[i]);
                if (clptSeq[i] != null)
                    model.setClptSeq(clptSeq[i]);
                if (revDirCd[i] != null)
                    model.setRevDirCd(revDirCd[i]);
                if (rlaneDirCd[i] != null) 
		    		model.setRlaneDirCd(rlaneDirCd[i]);
				/* Add a Method line, do not delete */
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getPsoTgtYdExpnVOs();
    }

    /**
	 * VO 배열을 반환
	 * @return PsoTgtYdExpnVO[]
	 */
    public PsoTgtYdExpnVO[] getPsoTgtYdExpnVOs() {
        PsoTgtYdExpnVO[] vos = (PsoTgtYdExpnVO[]) models.toArray(new PsoTgtYdExpnVO[models.size()]);
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
        this.invUsdAmt = this.invUsdAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.revYrmon = this.revYrmon.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fomlDesc = this.fomlDesc.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.psoBztpCd = this.psoBztpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.loclCurrCd = this.loclCurrCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.skdVoyNo = this.skdVoyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.invLoclAmt = this.invLoclAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rlaneCd = this.rlaneCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ioBndCd = this.ioBndCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.skdDirCd = this.skdDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ydChgVerSeq = this.ydChgVerSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ydCd = this.ydCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.lgsCostCd = this.lgsCostCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.xprDesc = this.xprDesc.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ydChgNo = this.ydChgNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vndrSeq = this.vndrSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.actDt = this.actDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.exeYrmon = this.exeYrmon.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.turnPortFlg = this.turnPortFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.turnPortIndCd = this.turnPortIndCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pfTurnPortIndCd = this.pfTurnPortIndCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pendulumFlg = this.pendulumFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.clptIndSeq = this.clptIndSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.clptSeq = this.clptSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.revDirCd = this.revDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rlaneDirCd = this.rlaneDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
