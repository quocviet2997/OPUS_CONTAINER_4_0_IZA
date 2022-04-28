/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PsoChgDtlVO.java
*@FileTitle : PsoChgDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.05
*@LastModifier : 김진일
*@LastVersion : 1.0
* 2009.10.05 김진일 
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
public class PsoChgDtlVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L; 

    private Collection<PsoChgDtlVO> models = new ArrayList<PsoChgDtlVO>();

    /* Column Info */
    private String vslCd = null;

    /* Column Info */
    private String otsSoSeq = null;

    /* Column Info */
    private String otsSoStlSeq = null;

    /* Column Info */
    private String otsSoDtlSeq = null;
    
    /* Column Info */
    private String ppayAplyFlg = null;
    
    /* Column Info */
    private String ownrVndrSeq = null;

    /* Column Info */
    private String tcCtrtNo = null;
    
    /* Column Info */
    private String invCondDesc = null;

    /* Column Info */
    private String soSeq = null;
    
    /* Column Info */
    private String soStlSeq = null;
    
    /* Column Info */
    private String fomlDesc = null;

    /* Column Info */
    private String creDt = null;

    /* Column Info */
    private String rlaneCd = null;

    /* Column Info */
    private String issCtyCd = null;

    /* Page Number */
    private String pagerows = null;

    /* Column Info */
    private String revDirCd = null;

    /* VO Data Value( C:Creation, U:Update, D:Delete ) */
    private String ibflag = null;

    /* Column Info */
    private String ydChgVerSeq = null;

    /* Column Info */
    private String arYrmon = null;

    /* Column Info */
    private String ydChgNo = null;

    /* Column Info */
    private String updUsrId = null;

    /* Column Info */
    private String updDt = null;

    /* Column Info */
    private String dpIoBndCd = null;

    /* Column Info */
    private String loclAmt = null;
    
    /* Column Info */
	private String rmnLoclAmt = null;
	
	/* Column Info */
	private String rmnUsdAmt = null;
	
	/* Column Info */
	private String stlLoclAmt = null;

	/* Column Info */
	private String stlUsdAmt = null;

    /* Column Info */
    private String skdVoyNo = null;

    /* Column Info */
    private String adjAmt = null;

    /* Column Info */
    private String ioBndCd = null;

    /* Column Info */
    private String calcAmt = null;

    /* Column Info */
    private String skdDirCd = null;

    /* Column Info */
    private String usdAmt = null;

    /* Column Info */
    private String creUsrId = null;

    /* Column Info */
    private String orgSoDtlSeq = null;

    /* Column Info */
    private String diffRmk = null;

    /* Column Info */
    private String soDtlSeq = null;

    /* Column Info */
    private String lgsCostCd = null;

    /* Column Info */
    private String xprDesc = null;

    /* Column Info */
    private String vtVvdFlg = null;

    /* Column Info */
    private String turnVvdCd = null;

    /* Column Info */
    private String clptIndSeq = null;

    /* Column Info */
    private String clptSeq = null;

    /*	테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new HashMap<String, String>();

    /*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new HashMap<String, String>();

    public PsoChgDtlVO() {
    }

    public PsoChgDtlVO(String ibflag, String pagerows, String issCtyCd, String soSeq, String soStlSeq, String soDtlSeq, String vslCd, String otsSoSeq, String otsSoStlSeq, String otsSoDtlSeq, String ppayAplyFlg, String tcCtrtNo, String ownrVndrSeq, String skdVoyNo, String skdDirCd, String revDirCd, String rlaneCd, String lgsCostCd, String ioBndCd, String loclAmt, String rmnLoclAmt, String rmnUsdAmt, String stlLoclAmt, String stlUsdAmt, String usdAmt, String calcAmt, String adjAmt, String xprDesc, String fomlDesc, String ydChgVerSeq, String ydChgNo, String diffRmk, String arYrmon, String creUsrId, String creDt, String updUsrId, String updDt, String dpIoBndCd, String orgSoDtlSeq, String invCondDesc, String vtVvdFlg, String turnVvdCd, String clptIndSeq, String clptSeq) {
        this.vslCd = vslCd;
        this.otsSoSeq = otsSoSeq;
        this.otsSoStlSeq = otsSoStlSeq;
        this.otsSoDtlSeq = otsSoDtlSeq;
        this.ppayAplyFlg = ppayAplyFlg;
        this.tcCtrtNo = tcCtrtNo;
        this.ownrVndrSeq = ownrVndrSeq;
        this.invCondDesc = invCondDesc;
        this.soSeq = soSeq;
        this.soStlSeq = soStlSeq;
        this.fomlDesc = fomlDesc;
        this.creDt = creDt;
        this.rlaneCd = rlaneCd;
        this.issCtyCd = issCtyCd;
        this.pagerows = pagerows;
        this.revDirCd = revDirCd;
        this.ibflag = ibflag;
        this.ydChgVerSeq = ydChgVerSeq;
        this.arYrmon = arYrmon;
        this.ydChgNo = ydChgNo;
        this.updUsrId = updUsrId;
        this.updDt = updDt;
        this.dpIoBndCd = dpIoBndCd;
        this.loclAmt = loclAmt;
        this.rmnLoclAmt = rmnLoclAmt;
        this.rmnUsdAmt = rmnUsdAmt;
        this.stlLoclAmt = stlLoclAmt;
        this.stlUsdAmt = stlUsdAmt;
        this.skdVoyNo = skdVoyNo;
        this.adjAmt = adjAmt;
        this.ioBndCd = ioBndCd;
        this.calcAmt = calcAmt;
        this.skdDirCd = skdDirCd;
        this.usdAmt = usdAmt;
        this.creUsrId = creUsrId;
        this.orgSoDtlSeq = orgSoDtlSeq;
        this.diffRmk = diffRmk;
        this.soDtlSeq = soDtlSeq;
        this.lgsCostCd = lgsCostCd;
        this.xprDesc = xprDesc;
        this.vtVvdFlg = vtVvdFlg;
        this.turnVvdCd = turnVvdCd;
        this.clptIndSeq = clptIndSeq;
        this.clptSeq = clptSeq;
    }

    /**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("vsl_cd", getVslCd());
        this.hashColumns.put("ots_so_seq", getOtsSoSeq());
        this.hashColumns.put("ots_so_stl_seq ", getOtsSoStlSeq());
        this.hashColumns.put("ots_so_dtl_seq", getOtsSoDtlSeq());
        this.hashColumns.put("ppay_aply_flg", getPpayAplyFlg());
        this.hashColumns.put("tc_ctrt_no", getTcCtrtNo());
        this.hashColumns.put("ownr_vndr_seq", getOwnrVndrSeq());
        this.hashColumns.put("inv_cond_desc", getInvCondDesc());
        this.hashColumns.put("so_seq", getSoSeq());
        this.hashColumns.put("so_stl_seq", getSoStlSeq());
        this.hashColumns.put("foml_desc", getFomlDesc());
        this.hashColumns.put("cre_dt", getCreDt());
        this.hashColumns.put("rlane_cd", getRlaneCd());
        this.hashColumns.put("iss_cty_cd", getIssCtyCd());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("rev_dir_cd", getRevDirCd());
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("yd_chg_ver_seq", getYdChgVerSeq());
        this.hashColumns.put("ar_yrmon", getArYrmon());
        this.hashColumns.put("yd_chg_no", getYdChgNo());
        this.hashColumns.put("upd_usr_id", getUpdUsrId());
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("dp_io_bnd_cd", getDpIoBndCd());
        this.hashColumns.put("locl_amt", getLoclAmt());
        this.hashColumns.put("rmn_locl_amt", getRmnLoclAmt());
        this.hashColumns.put("rmn_usd_amt", getRmnUsdAmt());
        this.hashColumns.put("stl_locl_amt", getStlLoclAmt());
        this.hashColumns.put("stl_usd_amt", getStlUsdAmt());
        this.hashColumns.put("skd_voy_no", getSkdVoyNo());
        this.hashColumns.put("adj_amt", getAdjAmt());
        this.hashColumns.put("io_bnd_cd", getIoBndCd());
        this.hashColumns.put("calc_amt", getCalcAmt());
        this.hashColumns.put("skd_dir_cd", getSkdDirCd());
        this.hashColumns.put("usd_amt", getUsdAmt());
        this.hashColumns.put("cre_usr_id", getCreUsrId());
        this.hashColumns.put("org_so_dtl_seq", getOrgSoDtlSeq());
        this.hashColumns.put("diff_rmk", getDiffRmk());
        this.hashColumns.put("so_dtl_seq", getSoDtlSeq());
        this.hashColumns.put("lgs_cost_cd", getLgsCostCd());
        this.hashColumns.put("xpr_desc", getXprDesc());
        this.hashColumns.put("vt_vvd_flg", getVtVvdFlg());
        this.hashColumns.put("turn_vvd_cd", getTurnVvdCd());
        this.hashColumns.put("clpt_ind_seq", getClptIndSeq());
        this.hashColumns.put("clpt_seq", getClptSeq());
        return this.hashColumns;
    }

    /**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("vsl_cd", "vslCd");
        this.hashFields.put("ots_so_seq", "otsSoSeq");
        this.hashFields.put("ots_so_stl_seq", "otsSoStlSeq");
        this.hashFields.put("ots_so_dtl_seq", "otsSoDtlSeq");
        this.hashFields.put("ppay_aply_flg", "ppayAplyFlg");
        this.hashFields.put("tc_ctrt_no", "tcCtrtNo");
        this.hashFields.put("ownr_vndr_seq","ownrVndrSeq");
        this.hashFields.put("inv_cond_desc", "invCondDesc");
        this.hashFields.put("so_seq", "soSeq");
        this.hashFields.put("so_stl_seq", "soStlSeq");
        this.hashFields.put("foml_desc", "fomlDesc");
        this.hashFields.put("cre_dt", "creDt");
        this.hashFields.put("rlane_cd", "rlaneCd");
        this.hashFields.put("iss_cty_cd", "issCtyCd");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("rev_dir_cd", "revDirCd");
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("yd_chg_ver_seq", "ydChgVerSeq");
        this.hashFields.put("ar_yrmon", "arYrmon");
        this.hashFields.put("yd_chg_no", "ydChgNo");
        this.hashFields.put("upd_usr_id", "updUsrId");
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("dp_io_bnd_cd", "dpIoBndCd");
        this.hashFields.put("locl_amt", "loclAmt");
        this.hashFields.put("rmn_locl_amt", "rmnLoclAmt");
        this.hashFields.put("rmn_usd_amt", "rmnUsdAmt");
        this.hashFields.put("stl_locl_amt", "stlLoclAmt");
        this.hashFields.put("stl_usd_amt", "stlUsdAmt");
        this.hashFields.put("skd_voy_no", "skdVoyNo");
        this.hashFields.put("adj_amt", "adjAmt");
        this.hashFields.put("io_bnd_cd", "ioBndCd");
        this.hashFields.put("calc_amt", "calcAmt");
        this.hashFields.put("skd_dir_cd", "skdDirCd");
        this.hashFields.put("usd_amt", "usdAmt");
        this.hashFields.put("cre_usr_id", "creUsrId");
        this.hashFields.put("org_so_dtl_seq", "orgSoDtlSeq");
        this.hashFields.put("diff_rmk", "diffRmk");
        this.hashFields.put("so_dtl_seq", "soDtlSeq");
        this.hashFields.put("lgs_cost_cd", "lgsCostCd");
        this.hashFields.put("xpr_desc", "xprDesc");
        this.hashFields.put("vt_vvd_flg", "vtVvdFlg");
        this.hashFields.put("turn_vvd_cd", "turnVvdCd");
        this.hashFields.put("clpt_ind_seq", "clptIndSeq");
        this.hashFields.put("clpt_seq", "clptSeq");
        return this.hashFields;
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
	 * @return otsSoSeq
	 */
    public String getOtsSoSeq() {
        return this.otsSoSeq;
    }
    
    /**
	 * Column Info
	 * @return otsSoDtlSeq
	 */
    public String getOtsSoDtlSeq() {
        return this.otsSoDtlSeq;
    }
    
    /**
	 * Column Info
	 * @return otsSoStlSeq
	 */
    public String getOtsSoStlSeq() {
        return this.otsSoStlSeq;
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
	 * @return tcCtrtNo
	 */
    public String getTcCtrtNo() {
        return this.tcCtrtNo;
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
	 * @return invCondDesc
	 */
    public String getInvCondDesc() {
        return this.invCondDesc;
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
	 * @return soStlSeq
	 */
    public String getSoStlSeq() {
        return this.soStlSeq;
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
	 * @return creDt
	 */
    public String getCreDt() {
        return this.creDt;
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
	 * @return revDirCd
	 */
    public String getRevDirCd() {
        return this.revDirCd;
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
	 * @return arYrmon
	 */
    public String getArYrmon() {
        return this.arYrmon;
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
	 * @return updDt
	 */
    public String getUpdDt() {
        return this.updDt;
    }

    /**
	 * Column Info
	 * @return dpIoBndCd
	 */
    public String getDpIoBndCd() {
        return this.dpIoBndCd;
    }

    /**
	 * Column Info
	 * @return loclAmt
	 */
    public String getLoclAmt() {
        return this.loclAmt;
    }
    
    /**
	 * Column Info
	 * @return rmnLoclAmt 
	 */
    public String getRmnLoclAmt () {
        return this.rmnLoclAmt ;
    }
    
    /**
	 * Column Info
	 * @return rmnUsdAmt
	 */
    public String getRmnUsdAmt() {
        return this.rmnUsdAmt;
    }
    
    /**
	 * Column Info
	 * @return stlLoclAmt
	 */
    public String getStlLoclAmt() {
        return this.stlLoclAmt;
    }
    
    /**
	 * Column Info
	 * @return stlUsdAmt
	 */
    public String getStlUsdAmt() {
        return this.stlUsdAmt;
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
	 * @return adjAmt
	 */
    public String getAdjAmt() {
        return this.adjAmt;
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
	 * @return calcAmt
	 */
    public String getCalcAmt() {
        return this.calcAmt;
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
	 * @return usdAmt
	 */
    public String getUsdAmt() {
        return this.usdAmt;
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
	 * @return orgSoDtlSeq
	 */
    public String getOrgSoDtlSeq() {
        return this.orgSoDtlSeq;
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
	 * @return soDtlSeq
	 */
    public String getSoDtlSeq() {
        return this.soDtlSeq;
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
	 * @param vslCd
	 */
    public void setVslCd(String vslCd) {
        this.vslCd = vslCd;
    }

    /**
	 * Column Info
	 * @param otsSoSeq
	 */
    public void setOtsSoSeq(String otsSoSeq) {
        this.otsSoSeq = otsSoSeq;
    }
    
    /**
	 * Column Info
	 * @param otsSoStlSeq
	 */
    public void setOtsSoStlSeq(String otsSoStlSeq) {
        this.otsSoStlSeq = otsSoStlSeq;
    }

    /**
	 * Column Info
	 * @param otsSoDtlSeq
	 */
    public void setOtsSoDtlSeq(String otsSoDtlSeq) {
        this.otsSoDtlSeq = otsSoDtlSeq;
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
	 * @param tcCtrtNo
	 */
    public void setTcCtrtNo(String tcCtrtNo) {
        this.tcCtrtNo = tcCtrtNo;
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
	 * @param invCondDesc
	 */
    public void setInvCondDesc(String invCondDesc) {
        this.invCondDesc = invCondDesc;
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
	 * @param soStlSeq
	 */
    public void setSoStlSeq(String soStlSeq) {
        this.soStlSeq = soStlSeq;
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
	 * @param creDt
	 */
    public void setCreDt(String creDt) {
        this.creDt = creDt;
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
	 * @param revDirCd
	 */
    public void setRevDirCd(String revDirCd) {
        this.revDirCd = revDirCd;
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
	 * @param arYrmon
	 */
    public void setArYrmon(String arYrmon) {
        this.arYrmon = arYrmon;
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
	 * @param updDt
	 */
    public void setUpdDt(String updDt) {
        this.updDt = updDt;
    }

    /**
	 * Column Info
	 * @param dpIoBndCd
	 */
    public void setDpIoBndCd(String dpIoBndCd) {
        this.dpIoBndCd = dpIoBndCd;
    }

    /**
	 * Column Info
	 * @param loclAmt
	 */
    public void setLoclAmt(String loclAmt) {
        this.loclAmt = loclAmt;
    }

    /**
	 * Column Info
	 * @param rmnLoclAmt
	 */
    public void setRmnLoclAmt(String rmnLoclAmt) {
        this.rmnLoclAmt = rmnLoclAmt;
    }
    
    /**
	 * Column Info
	 * @param rmnUsdAmt
	 */
    public void setRmnUsdAmt(String rmnUsdAmt) {
        this.rmnUsdAmt = rmnUsdAmt;
    }
    
    /**
	 * Column Info
	 * @param stlLoclAmt
	 */
    public void setStlLoclAmt(String stlLoclAmt) {
        this.stlLoclAmt = stlLoclAmt;
    }
    
    /**
	 * Column Info
	 * @param stlUsdAmt
	 */
    public void setStlUsdAmt(String stlUsdAmt) {
        this.stlUsdAmt = stlUsdAmt;
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
	 * @param adjAmt
	 */
    public void setAdjAmt(String adjAmt) {
        this.adjAmt = adjAmt;
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
	 * @param calcAmt
	 */
    public void setCalcAmt(String calcAmt) {
        this.calcAmt = calcAmt;
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
	 * @param usdAmt
	 */
    public void setUsdAmt(String usdAmt) {
        this.usdAmt = usdAmt;
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
	 * @param orgSoDtlSeq
	 */
    public void setOrgSoDtlSeq(String orgSoDtlSeq) {
        this.orgSoDtlSeq = orgSoDtlSeq;
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
	 * @param soDtlSeq
	 */
    public void setSoDtlSeq(String soDtlSeq) {
        this.soDtlSeq = soDtlSeq;
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

    public void setVtVvdFlg(String vtVvdFlg) {
        this.vtVvdFlg = vtVvdFlg;
    }

    public String getVtVvdFlg() {
        return this.vtVvdFlg;
    }

    public void setTurnVvdCd(String turnVvdCd) {
        this.turnVvdCd = turnVvdCd;
    }

    public String getTurnVvdCd() {
        return this.turnVvdCd;
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

    /**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
    public void fromRequest(HttpServletRequest request) {
        setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
        setOtsSoSeq(JSPUtil.getParameter(request, "ots_so_seq", ""));
        setOtsSoStlSeq(JSPUtil.getParameter(request, "ots_so_stl_seq", ""));
        setOtsSoDtlSeq(JSPUtil.getParameter(request, "ots_so_dtl_seq", ""));
        setPpayAplyFlg(JSPUtil.getParameter(request, "ppay_aply_flg", ""));
        setTcCtrtNo(JSPUtil.getParameter(request, "tc_ctrt_no", ""));
        setOwnrVndrSeq(JSPUtil.getParameter(request, "ownr_vndr_seq", ""));
        setInvCondDesc(JSPUtil.getParameter(request, "inv_cond_desc", ""));
        setSoSeq(JSPUtil.getParameter(request, "so_seq", ""));
        setSoStlSeq(JSPUtil.getParameter(request, "so_stl_seq", ""));
        setFomlDesc(JSPUtil.getParameter(request, "foml_desc", ""));
        setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
        setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
        setIssCtyCd(JSPUtil.getParameter(request, "iss_cty_cd", ""));
        setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
        setRevDirCd(JSPUtil.getParameter(request, "rev_dir_cd", ""));
        setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
        setYdChgVerSeq(JSPUtil.getParameter(request, "yd_chg_ver_seq", ""));
        setArYrmon(JSPUtil.getParameter(request, "ar_yrmon", ""));
        setYdChgNo(JSPUtil.getParameter(request, "yd_chg_no", ""));
        setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
        setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
        setDpIoBndCd(JSPUtil.getParameter(request, "dp_io_bnd_cd", ""));
        setLoclAmt(JSPUtil.getParameter(request, "locl_amt", ""));
        setRmnLoclAmt(JSPUtil.getParameter(request, "rmn_locl_amt ", ""));
        setRmnUsdAmt(JSPUtil.getParameter(request, "rmn_usd_amt", ""));
        setStlLoclAmt(JSPUtil.getParameter(request, "stl_locl_amt", ""));
        setStlUsdAmt(JSPUtil.getParameter(request, "stl_usd_amt", ""));
        setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
        setAdjAmt(JSPUtil.getParameter(request, "adj_amt", ""));
        setIoBndCd(JSPUtil.getParameter(request, "io_bnd_cd", ""));
        setCalcAmt(JSPUtil.getParameter(request, "calc_amt", ""));
        setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
        setUsdAmt(JSPUtil.getParameter(request, "usd_amt", ""));
        setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
        setOrgSoDtlSeq(JSPUtil.getParameter(request, "org_so_dtl_seq", ""));
        setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
        setSoDtlSeq(JSPUtil.getParameter(request, "so_dtl_seq", ""));
        setLgsCostCd(JSPUtil.getParameter(request, "lgs_cost_cd", ""));
        setXprDesc(JSPUtil.getParameter(request, "xpr_desc", ""));
        setVtVvdFlg(JSPUtil.getParameter(request, "vt_vvd_flg", ""));
        setTurnVvdCd(JSPUtil.getParameter(request, "turn_vvd_cd", ""));
        setClptIndSeq(JSPUtil.getParameter(request, "clpt_ind_seq", ""));
        setClptSeq(JSPUtil.getParameter(request, "clpt_seq", ""));
    }

    /**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PsoChgDtlVO[]
	 */
    public PsoChgDtlVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PsoChgDtlVO[]
	 */
    public PsoChgDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        PsoChgDtlVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] vslCd = (JSPUtil.getParameter(request, prefix + "vsl_cd", length));
            String[] otsSoSeq = (JSPUtil.getParameter(request, prefix + "ots_so_seq", length));
            String[] otsSoStlSeq = (JSPUtil.getParameter(request, prefix + "ots_so_stl_seq", length));
            String[] otsSoDtlSeq = (JSPUtil.getParameter(request, prefix + "ots_so_dtl_seq", length));
            String[] ppayAplyFlg = (JSPUtil.getParameter(request, prefix + "ppay_aply_flg", length));
            String[] tcCtrtNo = (JSPUtil.getParameter(request, prefix + "tc_ctrt_no", length));
            String[] ownrVndrSeq = (JSPUtil.getParameter(request, prefix + "ownr_vndr_seq", length));
            String[] invCondDesc = (JSPUtil.getParameter(request, prefix + "inv_cond_desc", length));
            String[] soSeq = (JSPUtil.getParameter(request, prefix + "so_seq", length));
            String[] soStlSeq = (JSPUtil.getParameter(request, prefix + "so_stl_seq", length));
            String[] fomlDesc = (JSPUtil.getParameter(request, prefix + "foml_desc", length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
            String[] rlaneCd = (JSPUtil.getParameter(request, prefix + "rlane_cd", length));
            String[] issCtyCd = (JSPUtil.getParameter(request, prefix + "iss_cty_cd", length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
            String[] revDirCd = (JSPUtil.getParameter(request, prefix + "rev_dir_cd", length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
            String[] ydChgVerSeq = (JSPUtil.getParameter(request, prefix + "yd_chg_ver_seq", length));
            String[] arYrmon = (JSPUtil.getParameter(request, prefix + "ar_yrmon", length));
            String[] ydChgNo = (JSPUtil.getParameter(request, prefix + "yd_chg_no", length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
            String[] dpIoBndCd = (JSPUtil.getParameter(request, prefix + "dp_io_bnd_cd", length));
            String[] loclAmt = (JSPUtil.getParameter(request, prefix + "locl_amt", length));
            String[] rmnLoclAmt = (JSPUtil.getParameter(request, prefix + "rmn_locl_amt", length));
            String[] rmnUsdAmt = (JSPUtil.getParameter(request, prefix + "rmn_usd_amt", length));
            String[] stlLoclAmt = (JSPUtil.getParameter(request, prefix + "stl_locl_amt", length));
            String[] stlUsdAmt = (JSPUtil.getParameter(request, prefix + "stl_usd_amt", length));
            String[] skdVoyNo = (JSPUtil.getParameter(request, prefix + "skd_voy_no", length));
            String[] adjAmt = (JSPUtil.getParameter(request, prefix + "adj_amt", length));
            String[] ioBndCd = (JSPUtil.getParameter(request, prefix + "io_bnd_cd", length));
            String[] calcAmt = (JSPUtil.getParameter(request, prefix + "calc_amt", length));
            String[] skdDirCd = (JSPUtil.getParameter(request, prefix + "skd_dir_cd", length));
            String[] usdAmt = (JSPUtil.getParameter(request, prefix + "usd_amt", length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
            String[] orgSoDtlSeq = (JSPUtil.getParameter(request, prefix + "org_so_dtl_seq", length));
            String[] diffRmk = (JSPUtil.getParameter(request, prefix + "diff_rmk", length));
            String[] soDtlSeq = (JSPUtil.getParameter(request, prefix + "so_dtl_seq", length));
            String[] lgsCostCd = (JSPUtil.getParameter(request, prefix + "lgs_cost_cd", length));
            String[] xprDesc = (JSPUtil.getParameter(request, prefix + "xpr_desc", length));
            String[] vtVvdFlg = (JSPUtil.getParameter(request, prefix + "vt_vvd_flg", length));
            String[] turnVvdCd = (JSPUtil.getParameter(request, prefix + "turn_vvd_cd", length));
            String[] clptIndSeq = (JSPUtil.getParameter(request, prefix + "clpt_ind_seq", length));
	    	String[] clptSeq = (JSPUtil.getParameter(request, prefix + "clpt_seq", length));
	    	/* Add a field line, do not delete */
            for (int i = 0; i < length; i++) {
                model = new PsoChgDtlVO();
                if (vslCd[i] != null)
                    model.setVslCd(vslCd[i]);
                if (otsSoSeq[i] != null)
                    model.setOtsSoSeq(otsSoSeq[i]);
                if (otsSoStlSeq[i] != null)
                    model.setOtsSoStlSeq(otsSoStlSeq[i]);
                if (otsSoDtlSeq[i] != null)
                    model.setOtsSoDtlSeq(otsSoDtlSeq[i]);
                if (ppayAplyFlg[i] != null)
                    model.setPpayAplyFlg(ppayAplyFlg[i]);
                if (tcCtrtNo[i] != null)
                    model.setTcCtrtNo(tcCtrtNo[i]);
                if (ownrVndrSeq[i] != null)
                    model.setOwnrVndrSeq(ownrVndrSeq[i]);
                if (invCondDesc[i] != null)
                    model.setInvCondDesc(invCondDesc[i]);
                if (soSeq[i] != null)
                    model.setSoSeq(soSeq[i]);
                if (soStlSeq[i] != null)
                    model.setSoStlSeq(soStlSeq[i]);
                if (fomlDesc[i] != null)
                    model.setFomlDesc(fomlDesc[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (rlaneCd[i] != null)
                    model.setRlaneCd(rlaneCd[i]);
                if (issCtyCd[i] != null)
                    model.setIssCtyCd(issCtyCd[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (revDirCd[i] != null)
                    model.setRevDirCd(revDirCd[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (ydChgVerSeq[i] != null)
                    model.setYdChgVerSeq(ydChgVerSeq[i]);
                if (arYrmon[i] != null)
                    model.setArYrmon(arYrmon[i]);
                if (ydChgNo[i] != null)
                    model.setYdChgNo(ydChgNo[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (dpIoBndCd[i] != null)
                    model.setDpIoBndCd(dpIoBndCd[i]);
                if (loclAmt[i] != null)
                    model.setLoclAmt(loclAmt[i]);
                if (rmnLoclAmt[i] != null)
                    model.setRmnLoclAmt(rmnLoclAmt[i]);
                if (rmnUsdAmt[i] != null)
                    model.setRmnUsdAmt(rmnUsdAmt[i]);
                if (stlLoclAmt[i] != null)
                    model.setStlLoclAmt(stlLoclAmt[i]);
                if (stlUsdAmt[i] != null)
                    model.setStlUsdAmt(stlUsdAmt[i]);
                if (skdVoyNo[i] != null)
                    model.setSkdVoyNo(skdVoyNo[i]);
                if (adjAmt[i] != null)
                    model.setAdjAmt(adjAmt[i]);
                if (ioBndCd[i] != null)
                    model.setIoBndCd(ioBndCd[i]);
                if (calcAmt[i] != null)
                    model.setCalcAmt(calcAmt[i]);
                if (skdDirCd[i] != null)
                    model.setSkdDirCd(skdDirCd[i]);
                if (usdAmt[i] != null)
                    model.setUsdAmt(usdAmt[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (orgSoDtlSeq[i] != null)
                    model.setOrgSoDtlSeq(orgSoDtlSeq[i]);
                if (diffRmk[i] != null)
                    model.setDiffRmk(diffRmk[i]);
                if (soDtlSeq[i] != null)
                    model.setSoDtlSeq(soDtlSeq[i]);
                if (lgsCostCd[i] != null)
                    model.setLgsCostCd(lgsCostCd[i]);
                if (xprDesc[i] != null)
                    model.setXprDesc(xprDesc[i]);
                if (vtVvdFlg[i] != null)
                    model.setVtVvdFlg(vtVvdFlg[i]);
                if (turnVvdCd[i] != null)
                    model.setTurnVvdCd(turnVvdCd[i]);
                if (clptIndSeq[i] != null) 
		    		model.setClptIndSeq(clptIndSeq[i]);
				if (clptSeq[i] != null) 
		    		model.setClptSeq(clptSeq[i]);
				/* Add a Method line, do not delete */
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getPsoChgDtlVOs();
    }

    /**
	 * VO 배열을 반환
	 * @return PsoChgDtlVO[]
	 */
    public PsoChgDtlVO[] getPsoChgDtlVOs() {
        PsoChgDtlVO[] vos = (PsoChgDtlVO[]) models.toArray(new PsoChgDtlVO[models.size()]);
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
        this.vslCd = this.vslCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.otsSoSeq = this.otsSoSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.otsSoStlSeq = this.otsSoStlSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.otsSoDtlSeq = this.otsSoDtlSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ppayAplyFlg = this.ppayAplyFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tcCtrtNo = this.tcCtrtNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ownrVndrSeq = this.ownrVndrSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.invCondDesc = this.invCondDesc.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.soSeq = this.soSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.soStlSeq = this.soStlSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fomlDesc = this.fomlDesc.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rlaneCd = this.rlaneCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.issCtyCd = this.issCtyCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.revDirCd = this.revDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ydChgVerSeq = this.ydChgVerSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.arYrmon = this.arYrmon.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ydChgNo = this.ydChgNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.dpIoBndCd = this.dpIoBndCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.loclAmt = this.loclAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rmnLoclAmt = this.rmnLoclAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rmnUsdAmt = this.rmnUsdAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.stlLoclAmt = this.stlLoclAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.stlUsdAmt = this.stlUsdAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.skdVoyNo = this.skdVoyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.adjAmt = this.adjAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ioBndCd = this.ioBndCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.calcAmt = this.calcAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.skdDirCd = this.skdDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.usdAmt = this.usdAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.orgSoDtlSeq = this.orgSoDtlSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.diffRmk = this.diffRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.soDtlSeq = this.soDtlSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.lgsCostCd = this.lgsCostCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.xprDesc = this.xprDesc.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vtVvdFlg = this.vtVvdFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.turnVvdCd = this.turnVvdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.clptIndSeq = this.clptIndSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.clptSeq = this.clptSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
