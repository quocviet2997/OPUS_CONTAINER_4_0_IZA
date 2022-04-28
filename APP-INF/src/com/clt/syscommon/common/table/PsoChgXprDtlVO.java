/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PsoChgXprDtlVO.java
*@FileTitle : PsoChgXprDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.18
*@LastModifier : 박명종
*@LastVersion : 1.0
* 2009.06.18 박명종 
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
 * @author 박명종
 * @since J2EE 1.6
 * @see AbstractValueObject
 */
public class PsoChgXprDtlVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L;

    private Collection<PsoChgXprDtlVO> models = new ArrayList<PsoChgXprDtlVO>();

    /* Column Info */
    private String updDt = null;

    /* Column Info */
    private String chgXprSeq = null;

    /* Column Info */
    private String creDt = null;

    /* Page Number */
    private String pagerows = null;

    /* VO Data Value( C:Creation, U:Update, D:Delete ) */
    private String ibflag = null;

    /* Column Info */
    private String creUsrId = null;

    /* Column Info */
    private String psoCtrlStmtTpCd = null;

    /* Column Info */
    private String dfltFomlFlg = null;

    /* Column Info */
    private String chgXprNo = null;

    /* Column Info */
    private String fomlNo = null;

    /* Column Info */
    private String upprChgXprSeq = null;

    /* Column Info */
    private String condNo = null;

    /* Column Info */
    private String updUsrId = null;

    /* Column Info */
    private String condAlsNm = null;

    /*	테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new HashMap<String, String>();

    /*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new HashMap<String, String>();

    public PsoChgXprDtlVO() {
    }

    public PsoChgXprDtlVO(String ibflag, String pagerows, String chgXprNo, String chgXprSeq, String psoCtrlStmtTpCd, String condNo, String dfltFomlFlg, String fomlNo, String upprChgXprSeq, String creUsrId, String creDt, String updUsrId, String updDt, String condAlsNm) {
        this.updDt = updDt;
        this.chgXprSeq = chgXprSeq;
        this.creDt = creDt;
        this.pagerows = pagerows;
        this.ibflag = ibflag;
        this.creUsrId = creUsrId;
        this.psoCtrlStmtTpCd = psoCtrlStmtTpCd;
        this.dfltFomlFlg = dfltFomlFlg;
        this.chgXprNo = chgXprNo;
        this.fomlNo = fomlNo;
        this.upprChgXprSeq = upprChgXprSeq;
        this.condNo = condNo;
        this.updUsrId = updUsrId;
        this.condAlsNm = condAlsNm;
    }

    /**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("chg_xpr_seq", getChgXprSeq());
        this.hashColumns.put("cre_dt", getCreDt());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("cre_usr_id", getCreUsrId());
        this.hashColumns.put("pso_ctrl_stmt_tp_cd", getPsoCtrlStmtTpCd());
        this.hashColumns.put("dflt_foml_flg", getDfltFomlFlg());
        this.hashColumns.put("chg_xpr_no", getChgXprNo());
        this.hashColumns.put("foml_no", getFomlNo());
        this.hashColumns.put("uppr_chg_xpr_seq", getUpprChgXprSeq());
        this.hashColumns.put("cond_no", getCondNo());
        this.hashColumns.put("upd_usr_id", getUpdUsrId());
        this.hashColumns.put("cond_als_nm", getCondAlsNm());
        return this.hashColumns;
    }

    /**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("chg_xpr_seq", "chgXprSeq");
        this.hashFields.put("cre_dt", "creDt");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("cre_usr_id", "creUsrId");
        this.hashFields.put("pso_ctrl_stmt_tp_cd", "psoCtrlStmtTpCd");
        this.hashFields.put("dflt_foml_flg", "dfltFomlFlg");
        this.hashFields.put("chg_xpr_no", "chgXprNo");
        this.hashFields.put("foml_no", "fomlNo");
        this.hashFields.put("uppr_chg_xpr_seq", "upprChgXprSeq");
        this.hashFields.put("cond_no", "condNo");
        this.hashFields.put("upd_usr_id", "updUsrId");
        this.hashFields.put("cond_als_nm", "condAlsNm");
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
	 * @return chgXprSeq
	 */
    public String getChgXprSeq() {
        return this.chgXprSeq;
    }

    /**
	 * Column Info
	 * @return creDt
	 */
    public String getCreDt() {
        return this.creDt;
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
	 * @return psoCtrlStmtTpCd
	 */
    public String getPsoCtrlStmtTpCd() {
        return this.psoCtrlStmtTpCd;
    }

    /**
	 * Column Info
	 * @return dfltFomlFlg
	 */
    public String getDfltFomlFlg() {
        return this.dfltFomlFlg;
    }

    /**
	 * Column Info
	 * @return chgXprNo
	 */
    public String getChgXprNo() {
        return this.chgXprNo;
    }

    /**
	 * Column Info
	 * @return fomlNo
	 */
    public String getFomlNo() {
        return this.fomlNo;
    }

    /**
	 * Column Info
	 * @return upprChgXprSeq
	 */
    public String getUpprChgXprSeq() {
        return this.upprChgXprSeq;
    }

    /**
	 * Column Info
	 * @return condNo
	 */
    public String getCondNo() {
        return this.condNo;
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
	 * @param chgXprSeq
	 */
    public void setChgXprSeq(String chgXprSeq) {
        this.chgXprSeq = chgXprSeq;
    }

    /**
	 * Column Info
	 * @param creDt
	 */
    public void setCreDt(String creDt) {
        this.creDt = creDt;
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
	 * @param psoCtrlStmtTpCd
	 */
    public void setPsoCtrlStmtTpCd(String psoCtrlStmtTpCd) {
        this.psoCtrlStmtTpCd = psoCtrlStmtTpCd;
    }

    /**
	 * Column Info
	 * @param dfltFomlFlg
	 */
    public void setDfltFomlFlg(String dfltFomlFlg) {
        this.dfltFomlFlg = dfltFomlFlg;
    }

    /**
	 * Column Info
	 * @param chgXprNo
	 */
    public void setChgXprNo(String chgXprNo) {
        this.chgXprNo = chgXprNo;
    }

    /**
	 * Column Info
	 * @param fomlNo
	 */
    public void setFomlNo(String fomlNo) {
        this.fomlNo = fomlNo;
    }

    /**
	 * Column Info
	 * @param upprChgXprSeq
	 */
    public void setUpprChgXprSeq(String upprChgXprSeq) {
        this.upprChgXprSeq = upprChgXprSeq;
    }

    /**
	 * Column Info
	 * @param condNo
	 */
    public void setCondNo(String condNo) {
        this.condNo = condNo;
    }

    /**
	 * Column Info
	 * @param updUsrId
	 */
    public void setUpdUsrId(String updUsrId) {
        this.updUsrId = updUsrId;
    }

    public void setCondAlsNm(String condAlsNm) {
        this.condAlsNm = condAlsNm;
    }

    public String getCondAlsNm() {
        return this.condAlsNm;
    }

    /**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
    public void fromRequest(HttpServletRequest request) {
        setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
        setChgXprSeq(JSPUtil.getParameter(request, "chg_xpr_seq", ""));
        setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
        setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
        setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
        setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
        setPsoCtrlStmtTpCd(JSPUtil.getParameter(request, "pso_ctrl_stmt_tp_cd", ""));
        setDfltFomlFlg(JSPUtil.getParameter(request, "dflt_foml_flg", ""));
        setChgXprNo(JSPUtil.getParameter(request, "chg_xpr_no", ""));
        setFomlNo(JSPUtil.getParameter(request, "foml_no", ""));
        setUpprChgXprSeq(JSPUtil.getParameter(request, "uppr_chg_xpr_seq", ""));
        setCondNo(JSPUtil.getParameter(request, "cond_no", ""));
        setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
        setCondAlsNm(JSPUtil.getParameter(request, "cond_als_nm", ""));
    }

    /**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PsoChgXprDtlVO[]
	 */
    public PsoChgXprDtlVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PsoChgXprDtlVO[]
	 */
    public PsoChgXprDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        PsoChgXprDtlVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt".trim(), length));
            String[] chgXprSeq = (JSPUtil.getParameter(request, prefix + "chg_xpr_seq".trim(), length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt".trim(), length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows".trim(), length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag".trim(), length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id".trim(), length));
            String[] psoCtrlStmtTpCd = (JSPUtil.getParameter(request, prefix + "pso_ctrl_stmt_tp_cd".trim(), length));
            String[] dfltFomlFlg = (JSPUtil.getParameter(request, prefix + "dflt_foml_flg".trim(), length));
            String[] chgXprNo = (JSPUtil.getParameter(request, prefix + "chg_xpr_no".trim(), length));
            String[] fomlNo = (JSPUtil.getParameter(request, prefix + "foml_no".trim(), length));
            String[] upprChgXprSeq = (JSPUtil.getParameter(request, prefix + "uppr_chg_xpr_seq".trim(), length));
            String[] condNo = (JSPUtil.getParameter(request, prefix + "cond_no".trim(), length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id".trim(), length));
            String[] condAlsNm = (JSPUtil.getParameter(request, prefix + "cond_als_nm", length));
	    	/* Add a field line, do not delete */
            for (int i = 0; i < length; i++) {
                model = new PsoChgXprDtlVO();
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (chgXprSeq[i] != null)
                    model.setChgXprSeq(chgXprSeq[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (psoCtrlStmtTpCd[i] != null)
                    model.setPsoCtrlStmtTpCd(psoCtrlStmtTpCd[i]);
                if (dfltFomlFlg[i] != null)
                    model.setDfltFomlFlg(dfltFomlFlg[i]);
                if (chgXprNo[i] != null)
                    model.setChgXprNo(chgXprNo[i]);
                if (fomlNo[i] != null)
                    model.setFomlNo(fomlNo[i]);
                if (upprChgXprSeq[i] != null)
                    model.setUpprChgXprSeq(upprChgXprSeq[i]);
                if (condNo[i] != null)
                    model.setCondNo(condNo[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                if (condAlsNm[i] != null) 
		    		model.setCondAlsNm(condAlsNm[i]);
				/* Add a Method line, do not delete */
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getPsoChgXprDtlVOs();
    }

    /**
	 * VO 배열을 반환
	 * @return PsoChgXprDtlVO[]
	 */
    public PsoChgXprDtlVO[] getPsoChgXprDtlVOs() {
        PsoChgXprDtlVO[] vos = (PsoChgXprDtlVO[]) models.toArray(new PsoChgXprDtlVO[models.size()]);
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
        this.chgXprSeq = this.chgXprSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.psoCtrlStmtTpCd = this.psoCtrlStmtTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.dfltFomlFlg = this.dfltFomlFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.chgXprNo = this.chgXprNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fomlNo = this.fomlNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.upprChgXprSeq = this.upprChgXprSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.condNo = this.condNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.condAlsNm = this.condAlsNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
