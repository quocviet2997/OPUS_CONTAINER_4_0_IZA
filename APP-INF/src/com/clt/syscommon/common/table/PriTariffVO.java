/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : PriTariffVO.java
*@FileTitle : PriTariffVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.11.17
*@LastModifier : 서미진
*@LastVersion : 1.0
* 2010.11.17 서미진 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 서미진
 * @since J2EE 1.6
 * @see AbstractValueObject
 */
public class PriTariffVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L;

    private Collection<PriTariffVO> models = new ArrayList<PriTariffVO>();

    /* Column Info */
    private String updDt = null;

    /* Column Info */
    private String deltFlg = null;

    /* Column Info */
    private String creDt = null;

    /* Column Info */
    private String trfClssCd = null;

    /* Column Info */
    private String trfOrzNm = null;

    /* Page Number */
    private String pagerows = null;

    /* VO Data Value( C:Creation, U:Update, D:Delete ) */
    private String ibflag = null;

    /* Column Info */
    private String creUsrId = null;

    /* Column Info */
    private String trfOrzTpNm = null;

    /* Column Info */
    private String trfNo = null;

    /* Column Info */
    private String trfNm = null;

    /* Column Info */
    private String trfInlndFlg = null;

    /* Column Info */
    private String trfPfxCd = null;

    /* Column Info */
    private String updUsrId = null;

    /* Column Info */
    private String fmcFileFlg = null;

    /*	테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new HashMap<String, String>();

    /*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new HashMap<String, String>();

    public PriTariffVO() {
    }

    public PriTariffVO(String ibflag, String pagerows, String trfPfxCd, String trfNo, String trfNm, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt, String trfOrzNm, String trfOrzTpNm, String trfClssCd, String trfInlndFlg, String fmcFileFlg) {
        this.updDt = updDt;
        this.deltFlg = deltFlg;
        this.creDt = creDt;
        this.trfClssCd = trfClssCd;
        this.trfOrzNm = trfOrzNm;
        this.pagerows = pagerows;
        this.ibflag = ibflag;
        this.creUsrId = creUsrId;
        this.trfOrzTpNm = trfOrzTpNm;
        this.trfNo = trfNo;
        this.trfNm = trfNm;
        this.trfInlndFlg = trfInlndFlg;
        this.trfPfxCd = trfPfxCd;
        this.updUsrId = updUsrId;
        this.fmcFileFlg = fmcFileFlg;
    }

    /**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("delt_flg", getDeltFlg());
        this.hashColumns.put("cre_dt", getCreDt());
        this.hashColumns.put("trf_clss_cd", getTrfClssCd());
        this.hashColumns.put("trf_orz_nm", getTrfOrzNm());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("cre_usr_id", getCreUsrId());
        this.hashColumns.put("trf_orz_tp_nm", getTrfOrzTpNm());
        this.hashColumns.put("trf_no", getTrfNo());
        this.hashColumns.put("trf_nm", getTrfNm());
        this.hashColumns.put("trf_inlnd_flg", getTrfInlndFlg());
        this.hashColumns.put("trf_pfx_cd", getTrfPfxCd());
        this.hashColumns.put("upd_usr_id", getUpdUsrId());
        this.hashColumns.put("fmc_file_flg", getFmcFileFlg());
        return this.hashColumns;
    }

    /**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("delt_flg", "deltFlg");
        this.hashFields.put("cre_dt", "creDt");
        this.hashFields.put("trf_clss_cd", "trfClssCd");
        this.hashFields.put("trf_orz_nm", "trfOrzNm");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("cre_usr_id", "creUsrId");
        this.hashFields.put("trf_orz_tp_nm", "trfOrzTpNm");
        this.hashFields.put("trf_no", "trfNo");
        this.hashFields.put("trf_nm", "trfNm");
        this.hashFields.put("trf_inlnd_flg", "trfInlndFlg");
        this.hashFields.put("trf_pfx_cd", "trfPfxCd");
        this.hashFields.put("upd_usr_id", "updUsrId");
        this.hashFields.put("fmc_file_flg", "fmcFileFlg");
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
	 * @return deltFlg
	 */
    public String getDeltFlg() {
        return this.deltFlg;
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
	 * @return trfClssCd
	 */
    public String getTrfClssCd() {
        return this.trfClssCd;
    }

    /**
	 * Column Info
	 * @return trfOrzNm
	 */
    public String getTrfOrzNm() {
        return this.trfOrzNm;
    }

    /**
	 * Page Number
	 * @return pagerows
	 */
    public String getPagerows() {
        return this.pagerows;
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
	 * @return creUsrId
	 */
    public String getCreUsrId() {
        return this.creUsrId;
    }

    /**
	 * Column Info
	 * @return trfOrzTpNm
	 */
    public String getTrfOrzTpNm() {
        return this.trfOrzTpNm;
    }

    /**
	 * Column Info
	 * @return trfNo
	 */
    public String getTrfNo() {
        return this.trfNo;
    }

    /**
	 * Column Info
	 * @return trfNm
	 */
    public String getTrfNm() {
        return this.trfNm;
    }

    /**
	 * Column Info
	 * @return trfInlndFlg
	 */
    public String getTrfInlndFlg() {
        return this.trfInlndFlg;
    }

    /**
	 * Column Info
	 * @return trfPfxCd
	 */
    public String getTrfPfxCd() {
        return this.trfPfxCd;
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
	 * @param deltFlg
	 */
    public void setDeltFlg(String deltFlg) {
        this.deltFlg = deltFlg;
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
	 * @param trfClssCd
	 */
    public void setTrfClssCd(String trfClssCd) {
        this.trfClssCd = trfClssCd;
    }

    /**
	 * Column Info
	 * @param trfOrzNm
	 */
    public void setTrfOrzNm(String trfOrzNm) {
        this.trfOrzNm = trfOrzNm;
    }

    /**
	 * Page Number
	 * @param pagerows
	 */
    public void setPagerows(String pagerows) {
        this.pagerows = pagerows;
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
	 * @param creUsrId
	 */
    public void setCreUsrId(String creUsrId) {
        this.creUsrId = creUsrId;
    }

    /**
	 * Column Info
	 * @param trfOrzTpNm
	 */
    public void setTrfOrzTpNm(String trfOrzTpNm) {
        this.trfOrzTpNm = trfOrzTpNm;
    }

    /**
	 * Column Info
	 * @param trfNo
	 */
    public void setTrfNo(String trfNo) {
        this.trfNo = trfNo;
    }

    /**
	 * Column Info
	 * @param trfNm
	 */
    public void setTrfNm(String trfNm) {
        this.trfNm = trfNm;
    }

    /**
	 * Column Info
	 * @param trfInlndFlg
	 */
    public void setTrfInlndFlg(String trfInlndFlg) {
        this.trfInlndFlg = trfInlndFlg;
    }

    /**
	 * Column Info
	 * @param trfPfxCd
	 */
    public void setTrfPfxCd(String trfPfxCd) {
        this.trfPfxCd = trfPfxCd;
    }

    /**
	 * Column Info
	 * @param updUsrId
	 */
    public void setUpdUsrId(String updUsrId) {
        this.updUsrId = updUsrId;
    }

    public void setFmcFileFlg(String fmcFileFlg) {
        this.fmcFileFlg = fmcFileFlg;
    }

    public String getFmcFileFlg() {
        return this.fmcFileFlg;
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
        setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
        setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
        setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
        setTrfClssCd(JSPUtil.getParameter(request, prefix + "trf_clss_cd", ""));
        setTrfOrzNm(JSPUtil.getParameter(request, prefix + "trf_orz_nm", ""));
        setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
        setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
        setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
        setTrfOrzTpNm(JSPUtil.getParameter(request, prefix + "trf_orz_tp_nm", ""));
        setTrfNo(JSPUtil.getParameter(request, prefix + "trf_no", ""));
        setTrfNm(JSPUtil.getParameter(request, prefix + "trf_nm", ""));
        setTrfInlndFlg(JSPUtil.getParameter(request, prefix + "trf_inlnd_flg", ""));
        setTrfPfxCd(JSPUtil.getParameter(request, prefix + "trf_pfx_cd", ""));
        setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
        setFmcFileFlg(JSPUtil.getParameter(request, prefix + "fmc_file_flg", ""));
    }

    /**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriTariffVO[]
	 */
    public PriTariffVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriTariffVO[]
	 */
    public PriTariffVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        PriTariffVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
            String[] deltFlg = (JSPUtil.getParameter(request, prefix + "delt_flg", length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
            String[] trfClssCd = (JSPUtil.getParameter(request, prefix + "trf_clss_cd", length));
            String[] trfOrzNm = (JSPUtil.getParameter(request, prefix + "trf_orz_nm", length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
            String[] trfOrzTpNm = (JSPUtil.getParameter(request, prefix + "trf_orz_tp_nm", length));
            String[] trfNo = (JSPUtil.getParameter(request, prefix + "trf_no", length));
            String[] trfNm = (JSPUtil.getParameter(request, prefix + "trf_nm", length));
            String[] trfInlndFlg = (JSPUtil.getParameter(request, prefix + "trf_inlnd_flg", length));
            String[] trfPfxCd = (JSPUtil.getParameter(request, prefix + "trf_pfx_cd", length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
            String[] fmcFileFlg = (JSPUtil.getParameter(request, prefix + "fmc_file_flg", length));
            for (int i = 0; i < length; i++) {
                model = new PriTariffVO();
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (deltFlg[i] != null)
                    model.setDeltFlg(deltFlg[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (trfClssCd[i] != null)
                    model.setTrfClssCd(trfClssCd[i]);
                if (trfOrzNm[i] != null)
                    model.setTrfOrzNm(trfOrzNm[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (trfOrzTpNm[i] != null)
                    model.setTrfOrzTpNm(trfOrzTpNm[i]);
                if (trfNo[i] != null)
                    model.setTrfNo(trfNo[i]);
                if (trfNm[i] != null)
                    model.setTrfNm(trfNm[i]);
                if (trfInlndFlg[i] != null)
                    model.setTrfInlndFlg(trfInlndFlg[i]);
                if (trfPfxCd[i] != null)
                    model.setTrfPfxCd(trfPfxCd[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                if (fmcFileFlg[i] != null)
                	model.setFmcFileFlg(fmcFileFlg[i]);
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getPriTariffVOs();
    }

    /**
	 * VO 배열을 반환
	 * @return PriTariffVO[]
	 */
    public PriTariffVO[] getPriTariffVOs() {
        PriTariffVO[] vos = (PriTariffVO[]) models.toArray(new PriTariffVO[models.size()]);
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
        this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.deltFlg = this.deltFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.trfClssCd = this.trfClssCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.trfOrzNm = this.trfOrzNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.trfOrzTpNm = this.trfOrzTpNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.trfNo = this.trfNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.trfNm = this.trfNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.trfInlndFlg = this.trfInlndFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.trfPfxCd = this.trfPfxCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fmcFileFlg = this.fmcFileFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
