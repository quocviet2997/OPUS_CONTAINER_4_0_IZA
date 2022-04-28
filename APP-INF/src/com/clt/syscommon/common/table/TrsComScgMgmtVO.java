/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName       : TrsComScgMgmtVO.java
*@FileTitle      : TrsComScgMgmtVO
*Open Issues     :
*Change history  :
*@LastModifyDate : 2014.11.05
*@LastModifier   : 
*@LastVersion    : 1.0
* 2014.11.05  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

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

public class TrsComScgMgmtVO extends AbstractValueObject
{
    private Collection<TrsComScgMgmtVO> models = new ArrayList<TrsComScgMgmtVO>();
    
    /* Column Info */
    private String updDt = null;
    /* Column Info */
    private String comScgSeq = null;
    /* Column Info */
    private String currCd = null;
    /* Column Info */
    private String woAplyFlg = null;
    /* Column Info */
    private String rtTpCd = null;
    /* Column Info */
    private String bndCd = null;
    /* Column Info */
    private String creDt = null;
    /* Column Info */
    private String cgoTpCd = null;
    /* Column Info */
    private String comScgKndCd = null;
    /* Column Info */
    private String rccCd = null;
    /* Column Info */
    private String eqKndCd = null;
    /* Page Number */
    private String pagerows = null;
    /* Column Info */
    private String eqTpszCd = null;
    /* Column Info */
    private String lccCd = null;
    /* Column Info */
    private String creUsrId = null;
    /* Column Info */
    private String oneWyRt = null;
    /* VO Data Value( C:Creation, U:Update, D:Delete ) */
    private String ibflag = null;
    /* Column Info */
    private String sccCd = null;
    /* Column Info */
    private String rndRt = null;
    /* Column Info */
    private String effFmDt = null;
    /* Column Info */
    private String effToDt = null;
    /* Column Info */
    private String updUsrId = null;

    /*    테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

    /*    테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
    
    public TrsComScgMgmtVO() {}

    public TrsComScgMgmtVO(String ibflag, String pagerows, String comScgKndCd, String comScgSeq, String rccCd, String lccCd, String sccCd, String eqKndCd, String eqTpszCd, String cgoTpCd, String bndCd, String rtTpCd, String currCd, String oneWyRt, String rndRt, String effFmDt, String effToDt, String woAplyFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
        this.updDt = updDt;
        this.comScgSeq = comScgSeq;
        this.currCd = currCd;
        this.woAplyFlg = woAplyFlg;
        this.rtTpCd = rtTpCd;
        this.bndCd = bndCd;
        this.creDt = creDt;
        this.cgoTpCd = cgoTpCd;
        this.comScgKndCd = comScgKndCd;
        this.rccCd = rccCd;
        this.eqKndCd = eqKndCd;
        this.pagerows = pagerows;
        this.eqTpszCd = eqTpszCd;
        this.lccCd = lccCd;
        this.creUsrId = creUsrId;
        this.oneWyRt = oneWyRt;
        this.ibflag = ibflag;
        this.sccCd = sccCd;
        this.rndRt = rndRt;
        this.effFmDt = effFmDt;
        this.effToDt = effToDt;
        this.updUsrId = updUsrId;
    }
    
    /**
     * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
     * @return HashMap
     */
    public HashMap<String, String> getColumnValues(){
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("com_scg_seq", getComScgSeq());
        this.hashColumns.put("curr_cd", getCurrCd());
        this.hashColumns.put("wo_aply_flg", getWoAplyFlg());
        this.hashColumns.put("rt_tp_cd", getRtTpCd());
        this.hashColumns.put("bnd_cd", getBndCd());
        this.hashColumns.put("cre_dt", getCreDt());
        this.hashColumns.put("cgo_tp_cd", getCgoTpCd());
        this.hashColumns.put("com_scg_knd_cd", getComScgKndCd());
        this.hashColumns.put("rcc_cd", getRccCd());
        this.hashColumns.put("eq_knd_cd", getEqKndCd());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("eq_tpsz_cd", getEqTpszCd());
        this.hashColumns.put("lcc_cd", getLccCd());
        this.hashColumns.put("cre_usr_id", getCreUsrId());
        this.hashColumns.put("one_wy_rt", getOneWyRt());
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("scc_cd", getSccCd());
        this.hashColumns.put("rnd_rt", getRndRt());
        this.hashColumns.put("eff_fm_dt", getEffFmDt());
        this.hashColumns.put("eff_to_dt", getEffToDt());
        this.hashColumns.put("upd_usr_id", getUpdUsrId());
        return this.hashColumns;
    }
    
    /**
     * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
     * @return
     */
    public HashMap<String, String> getFieldNames(){
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("com_scg_seq", "comScgSeq");
        this.hashFields.put("curr_cd", "currCd");
        this.hashFields.put("wo_aply_flg", "woAplyFlg");
        this.hashFields.put("rt_tp_cd", "rtTpCd");
        this.hashFields.put("bnd_cd", "bndCd");
        this.hashFields.put("cre_dt", "creDt");
        this.hashFields.put("cgo_tp_cd", "cgoTpCd");
        this.hashFields.put("com_scg_knd_cd", "comScgKndCd");
        this.hashFields.put("rcc_cd", "rccCd");
        this.hashFields.put("eq_knd_cd", "eqKndCd");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("eq_tpsz_cd", "eqTpszCd");
        this.hashFields.put("lcc_cd", "lccCd");
        this.hashFields.put("cre_usr_id", "creUsrId");
        this.hashFields.put("one_wy_rt", "oneWyRt");
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("scc_cd", "sccCd");
        this.hashFields.put("rnd_rt", "rndRt");
        this.hashFields.put("eff_fm_dt", "effFmDt");
        this.hashFields.put("eff_to_dt", "effToDt");
        this.hashFields.put("upd_usr_id", "updUsrId");
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
     * @return comScgSeq
     */
    public String getComScgSeq() {
        return this.comScgSeq;
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
     * @return woAplyFlg
     */
    public String getWoAplyFlg() {
        return this.woAplyFlg;
    }
    
    /**
     * Column Info
     * @return rtTpCd
     */
    public String getRtTpCd() {
        return this.rtTpCd;
    }
    
    /**
     * Column Info
     * @return bndCd
     */
    public String getBndCd() {
        return this.bndCd;
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
     * @return cgoTpCd
     */
    public String getCgoTpCd() {
        return this.cgoTpCd;
    }
    
    /**
     * Column Info
     * @return comScgKndCd
     */
    public String getComScgKndCd() {
        return this.comScgKndCd;
    }
    
    /**
     * Column Info
     * @return rccCd
     */
    public String getRccCd() {
        return this.rccCd;
    }
    
    /**
     * Column Info
     * @return eqKndCd
     */
    public String getEqKndCd() {
        return this.eqKndCd;
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
     * @return eqTpszCd
     */
    public String getEqTpszCd() {
        return this.eqTpszCd;
    }
    
    /**
     * Column Info
     * @return lccCd
     */
    public String getLccCd() {
        return this.lccCd;
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
     * @return oneWyRt
     */
    public String getOneWyRt() {
        return this.oneWyRt;
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
     * @return sccCd
     */
    public String getSccCd() {
        return this.sccCd;
    }
    
    /**
     * Column Info
     * @return rndRt
     */
    public String getRndRt() {
        return this.rndRt;
    }
    
    /**
     * Column Info
     * @return effFmDt
     */
    public String getEffFmDt() {
        return this.effFmDt;
    }
    
    /**
     * Column Info
     * @return effToDt
     */
    public String getEffToDt() {
        return this.effToDt;
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
     * @param updDt
     */
    public void setUpdDt(String updDt) {
        this.updDt = updDt;
    }
    
    /**
     * Column Info
     * @param comScgSeq
     */
    public void setComScgSeq(String comScgSeq) {
        this.comScgSeq = comScgSeq;
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
     * @param woAplyFlg
     */
    public void setWoAplyFlg(String woAplyFlg) {
        this.woAplyFlg = woAplyFlg;
    }
    
    /**
     * Column Info
     * @param rtTpCd
     */
    public void setRtTpCd(String rtTpCd) {
        this.rtTpCd = rtTpCd;
    }
    
    /**
     * Column Info
     * @param bndCd
     */
    public void setBndCd(String bndCd) {
        this.bndCd = bndCd;
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
     * @param cgoTpCd
     */
    public void setCgoTpCd(String cgoTpCd) {
        this.cgoTpCd = cgoTpCd;
    }
    
    /**
     * Column Info
     * @param comScgKndCd
     */
    public void setComScgKndCd(String comScgKndCd) {
        this.comScgKndCd = comScgKndCd;
    }
    
    /**
     * Column Info
     * @param rccCd
     */
    public void setRccCd(String rccCd) {
        this.rccCd = rccCd;
    }
    
    /**
     * Column Info
     * @param eqKndCd
     */
    public void setEqKndCd(String eqKndCd) {
        this.eqKndCd = eqKndCd;
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
     * @param eqTpszCd
     */
    public void setEqTpszCd(String eqTpszCd) {
        this.eqTpszCd = eqTpszCd;
    }
    
    /**
     * Column Info
     * @param lccCd
     */
    public void setLccCd(String lccCd) {
        this.lccCd = lccCd;
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
     * @param oneWyRt
     */
    public void setOneWyRt(String oneWyRt) {
        this.oneWyRt = oneWyRt;
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
     * @param sccCd
     */
    public void setSccCd(String sccCd) {
        this.sccCd = sccCd;
    }
    
    /**
     * Column Info
     * @param rndRt
     */
    public void setRndRt(String rndRt) {
        this.rndRt = rndRt;
    }
    
    /**
     * Column Info
     * @param effFmDt
     */
    public void setEffFmDt(String effFmDt) {
        this.effFmDt = effFmDt;
    }
    
    /**
     * Column Info
     * @param effToDt
     */
    public void setEffToDt(String effToDt) {
        this.effToDt = effToDt;
    }
    
    /**
     * Column Info
     * @param updUsrId
     */
    public void setUpdUsrId(String updUsrId) {
        this.updUsrId = updUsrId;
    }
    
/**
     * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
     * @param request
     */
    public void fromRequest(HttpServletRequest request) {
        fromRequest(request,"");
    }

    /**
     * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
     * @param request
     */
    public void fromRequest(HttpServletRequest request, String prefix) {
        setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
        setComScgSeq(JSPUtil.getParameter(request, prefix + "com_scg_seq", ""));
        setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
        setWoAplyFlg(JSPUtil.getParameter(request, prefix + "wo_aply_flg", ""));
        setRtTpCd(JSPUtil.getParameter(request, prefix + "rt_tp_cd", ""));
        setBndCd(JSPUtil.getParameter(request, prefix + "bnd_cd", ""));
        setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
        setCgoTpCd(JSPUtil.getParameter(request, prefix + "cgo_tp_cd", ""));
        setComScgKndCd(JSPUtil.getParameter(request, prefix + "com_scg_knd_cd", ""));
        setRccCd(JSPUtil.getParameter(request, prefix + "rcc_cd", ""));
        setEqKndCd(JSPUtil.getParameter(request, prefix + "eq_knd_cd", ""));
        setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
        setEqTpszCd(JSPUtil.getParameter(request, prefix + "eq_tpsz_cd", ""));
        setLccCd(JSPUtil.getParameter(request, prefix + "lcc_cd", ""));
        setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
        setOneWyRt(JSPUtil.getParameter(request, prefix + "one_wy_rt", ""));
        setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
        setSccCd(JSPUtil.getParameter(request, prefix + "scc_cd", ""));
        setRndRt(JSPUtil.getParameter(request, prefix + "rnd_rt", ""));
        setEffFmDt(JSPUtil.getParameter(request, prefix + "eff_fm_dt", ""));
        setEffToDt(JSPUtil.getParameter(request, prefix + "eff_to_dt", ""));
        setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
    }

    /**
     * Request 의 데이터를 VO 배열로 변환하여 반환.
     * @param request
     * @return TrsComScgMgmtVO[]
     */
    public TrsComScgMgmtVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
     * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
     * @param request
     * @param prefix
     * @return TrsComScgMgmtVO[]
     */
    public TrsComScgMgmtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        TrsComScgMgmtVO model = null;
        
        String[] tmp = request.getParameterValues(prefix + "ibflag");
          if(tmp == null)
               return null;

          int length = request.getParameterValues(prefix + "ibflag").length;
  
        try {
            String[] updDt = (JSPUtil.getParameter(request, prefix    + "upd_dt", length));
            String[] comScgSeq = (JSPUtil.getParameter(request, prefix    + "com_scg_seq", length));
            String[] currCd = (JSPUtil.getParameter(request, prefix    + "curr_cd", length));
            String[] woAplyFlg = (JSPUtil.getParameter(request, prefix    + "wo_aply_flg", length));
            String[] rtTpCd = (JSPUtil.getParameter(request, prefix    + "rt_tp_cd", length));
            String[] bndCd = (JSPUtil.getParameter(request, prefix    + "bnd_cd", length));
            String[] creDt = (JSPUtil.getParameter(request, prefix    + "cre_dt", length));
            String[] cgoTpCd = (JSPUtil.getParameter(request, prefix    + "cgo_tp_cd", length));
            String[] comScgKndCd = (JSPUtil.getParameter(request, prefix    + "com_scg_knd_cd", length));
            String[] rccCd = (JSPUtil.getParameter(request, prefix    + "rcc_cd", length));
            String[] eqKndCd = (JSPUtil.getParameter(request, prefix    + "eq_knd_cd", length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix    + "pagerows", length));
            String[] eqTpszCd = (JSPUtil.getParameter(request, prefix    + "eq_tpsz_cd", length));
            String[] lccCd = (JSPUtil.getParameter(request, prefix    + "lcc_cd", length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix    + "cre_usr_id", length));
            String[] oneWyRt = (JSPUtil.getParameter(request, prefix    + "one_wy_rt", length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix    + "ibflag", length));
            String[] sccCd = (JSPUtil.getParameter(request, prefix    + "scc_cd", length));
            String[] rndRt = (JSPUtil.getParameter(request, prefix    + "rnd_rt", length));
            String[] effFmDt = (JSPUtil.getParameter(request, prefix    + "eff_fm_dt", length));
            String[] effToDt = (JSPUtil.getParameter(request, prefix    + "eff_to_dt", length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix    + "upd_usr_id", length));
            
            for (int i = 0; i < length; i++) {
                model = new TrsComScgMgmtVO();
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (comScgSeq[i] != null)
                    model.setComScgSeq(comScgSeq[i]);
                if (currCd[i] != null)
                    model.setCurrCd(currCd[i]);
                if (woAplyFlg[i] != null)
                    model.setWoAplyFlg(woAplyFlg[i]);
                if (rtTpCd[i] != null)
                    model.setRtTpCd(rtTpCd[i]);
                if (bndCd[i] != null)
                    model.setBndCd(bndCd[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (cgoTpCd[i] != null)
                    model.setCgoTpCd(cgoTpCd[i]);
                if (comScgKndCd[i] != null)
                    model.setComScgKndCd(comScgKndCd[i]);
                if (rccCd[i] != null)
                    model.setRccCd(rccCd[i]);
                if (eqKndCd[i] != null)
                    model.setEqKndCd(eqKndCd[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (eqTpszCd[i] != null)
                    model.setEqTpszCd(eqTpszCd[i]);
                if (lccCd[i] != null)
                    model.setLccCd(lccCd[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (oneWyRt[i] != null)
                    model.setOneWyRt(oneWyRt[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (sccCd[i] != null)
                    model.setSccCd(sccCd[i]);
                if (rndRt[i] != null)
                    model.setRndRt(rndRt[i]);
                if (effFmDt[i] != null)
                    model.setEffFmDt(effFmDt[i]);
                if (effToDt[i] != null)
                    model.setEffToDt(effToDt[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                models.add(model);
            }

        } catch (Exception e) {
            return null;
        }
        return getTrsComScgMgmtVOs();
    }

    /**
     * VO 배열을 반환
     * @return TrsComScgMgmtVO[]
     */
    public TrsComScgMgmtVO[] getTrsComScgMgmtVOs(){
        TrsComScgMgmtVO[] vos = (TrsComScgMgmtVO[])models.toArray(new TrsComScgMgmtVO[models.size()]);
        return vos;
    }
    
    /**
     * VO Class의 내용을 String으로 변환
     */
    public String toString() {
           return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
       }

    /**
    * 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
    */
    public void unDataFormat()
    {
        this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.comScgSeq = this.comScgSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.woAplyFlg = this.woAplyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rtTpCd = this.rtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bndCd = this.bndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cgoTpCd = this.cgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.comScgKndCd = this.comScgKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rccCd = this.rccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.eqKndCd = this.eqKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.eqTpszCd = this.eqTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.lccCd = this.lccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.oneWyRt = this.oneWyRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.sccCd = this.sccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rndRt = this.rndRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.effFmDt = this.effFmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.effToDt = this.effToDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
