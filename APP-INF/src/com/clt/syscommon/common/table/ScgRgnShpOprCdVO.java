/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ScgRgnShpOprCdVO.java
*@FileTitle : ScgRgnShpOprCdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.29
*@LastModifier : 이도형
*@LastVersion : 1.0
* 2009.05.29 이도형 
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
 * @author 이도형
 * @since J2EE 1.6
 * @see AbstractValueObject
 */
public class ScgRgnShpOprCdVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L;

    private Collection<ScgRgnShpOprCdVO> models = new ArrayList<ScgRgnShpOprCdVO>();

    /* Column Info */
    private String updDt = null;

    /* Column Info */
    private String creUsrId = null;

    /* Column Info */
    private String rgnShpOprDesc = null;

    /* Column Info */
    private String rgnShpOprCd = null;

    /* VO Data Value( C:Creation, U:Update, D:Delete ) */
    private String ibflag = null;

    /* Column Info */
    private String deltFlg = null;

    /* Column Info */
    private String creDt = null;

    /* Column Info */
    private String rgnShpOprAbbrDesc = null;

    /* Column Info */
    private String updUsrId = null;

    /* Page Number */
    private String pagerows = null;

    /* Column Info */
    private String ediUnmapFlg = null;

    /*	테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new HashMap<String, String>();

    /*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new HashMap<String, String>();

    public ScgRgnShpOprCdVO() {
    }

    public ScgRgnShpOprCdVO(String ibflag, String pagerows, String rgnShpOprCd, String rgnShpOprAbbrDesc, String rgnShpOprDesc, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt, String ediUnmapFlg) {
        this.updDt = updDt;
        this.creUsrId = creUsrId;
        this.rgnShpOprDesc = rgnShpOprDesc;
        this.rgnShpOprCd = rgnShpOprCd;
        this.ibflag = ibflag;
        this.deltFlg = deltFlg;
        this.creDt = creDt;
        this.rgnShpOprAbbrDesc = rgnShpOprAbbrDesc;
        this.updUsrId = updUsrId;
        this.pagerows = pagerows;
        this.ediUnmapFlg = ediUnmapFlg;
    }

    /**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("cre_usr_id", getCreUsrId());
        this.hashColumns.put("rgn_shp_opr_desc", getRgnShpOprDesc());
        this.hashColumns.put("rgn_shp_opr_cd", getRgnShpOprCd());
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("delt_flg", getDeltFlg());
        this.hashColumns.put("cre_dt", getCreDt());
        this.hashColumns.put("rgn_shp_opr_abbr_desc", getRgnShpOprAbbrDesc());
        this.hashColumns.put("upd_usr_id", getUpdUsrId());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("edi_unmap_flg", getEdiUnmapFlg());
        return this.hashColumns;
    }

    /**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("cre_usr_id", "creUsrId");
        this.hashFields.put("rgn_shp_opr_desc", "rgnShpOprDesc");
        this.hashFields.put("rgn_shp_opr_cd", "rgnShpOprCd");
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("delt_flg", "deltFlg");
        this.hashFields.put("cre_dt", "creDt");
        this.hashFields.put("rgn_shp_opr_abbr_desc", "rgnShpOprAbbrDesc");
        this.hashFields.put("upd_usr_id", "updUsrId");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("edi_unmap_flg", "ediUnmapFlg");
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
	 * @return creUsrId
	 */
    public String getCreUsrId() {
        return this.creUsrId;
    }

    /**
	 * Column Info
	 * @return rgnShpOprDesc
	 */
    public String getRgnShpOprDesc() {
        return this.rgnShpOprDesc;
    }

    /**
	 * Column Info
	 * @return rgnShpOprCd
	 */
    public String getRgnShpOprCd() {
        return this.rgnShpOprCd;
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
	 * @return rgnShpOprAbbrDesc
	 */
    public String getRgnShpOprAbbrDesc() {
        return this.rgnShpOprAbbrDesc;
    }

    /**
	 * Column Info
	 * @return updUsrId
	 */
    public String getUpdUsrId() {
        return this.updUsrId;
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
	 * @param updDt
	 */
    public void setUpdDt(String updDt) {
        this.updDt = updDt;
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
	 * @param rgnShpOprDesc
	 */
    public void setRgnShpOprDesc(String rgnShpOprDesc) {
        this.rgnShpOprDesc = rgnShpOprDesc;
    }

    /**
	 * Column Info
	 * @param rgnShpOprCd
	 */
    public void setRgnShpOprCd(String rgnShpOprCd) {
        this.rgnShpOprCd = rgnShpOprCd;
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
	 * @param rgnShpOprAbbrDesc
	 */
    public void setRgnShpOprAbbrDesc(String rgnShpOprAbbrDesc) {
        this.rgnShpOprAbbrDesc = rgnShpOprAbbrDesc;
    }

    /**
	 * Column Info
	 * @param updUsrId
	 */
    public void setUpdUsrId(String updUsrId) {
        this.updUsrId = updUsrId;
    }

    /**
	 * Page Number
	 * @param pagerows
	 */
    public void setPagerows(String pagerows) {
        this.pagerows = pagerows;
    }

    public void setEdiUnmapFlg(String ediUnmapFlg) {
        this.ediUnmapFlg = ediUnmapFlg;
    }

    public String getEdiUnmapFlg() {
        return this.ediUnmapFlg;
    }

    /**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
    public void fromRequest(HttpServletRequest request) {
        setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
        setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
        setRgnShpOprDesc(JSPUtil.getParameter(request, "rgn_shp_opr_desc", ""));
        setRgnShpOprCd(JSPUtil.getParameter(request, "rgn_shp_opr_cd", ""));
        setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
        setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
        setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
        setRgnShpOprAbbrDesc(JSPUtil.getParameter(request, "rgn_shp_opr_abbr_desc", ""));
        setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
        setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
    }

    /**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ScgRgnShpOprCdVO[]
	 */
    public ScgRgnShpOprCdVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ScgRgnShpOprCdVO[]
	 */
    public ScgRgnShpOprCdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        ScgRgnShpOprCdVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt".trim(), length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id".trim(), length));
            String[] rgnShpOprDesc = (JSPUtil.getParameter(request, prefix + "rgn_shp_opr_desc".trim(), length));
            String[] rgnShpOprCd = (JSPUtil.getParameter(request, prefix + "rgn_shp_opr_cd".trim(), length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag".trim(), length));
            String[] deltFlg = (JSPUtil.getParameter(request, prefix + "delt_flg".trim(), length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt".trim(), length));
            String[] rgnShpOprAbbrDesc = (JSPUtil.getParameter(request, prefix + "rgn_shp_opr_abbr_desc".trim(), length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id".trim(), length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows".trim(), length));
            String[] ediUnmapFlg = (JSPUtil.getParameter(request, prefix + "edi_unmap_flg", length));
	    	/* Add a field line, do not delete */
            for (int i = 0; i < length; i++) {
                model = new ScgRgnShpOprCdVO();
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (rgnShpOprDesc[i] != null)
                    model.setRgnShpOprDesc(rgnShpOprDesc[i]);
                if (rgnShpOprCd[i] != null)
                    model.setRgnShpOprCd(rgnShpOprCd[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (deltFlg[i] != null)
                    model.setDeltFlg(deltFlg[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (rgnShpOprAbbrDesc[i] != null)
                    model.setRgnShpOprAbbrDesc(rgnShpOprAbbrDesc[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (ediUnmapFlg[i] != null) 
		    		model.setEdiUnmapFlg(ediUnmapFlg[i]);
				/* Add a Method line, do not delete */
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getScgRgnShpOprCdVOs();
    }

    /**
	 * VO 배열을 반환
	 * @return ScgRgnShpOprCdVO[]
	 */
    public ScgRgnShpOprCdVO[] getScgRgnShpOprCdVOs() {
        ScgRgnShpOprCdVO[] vos = (ScgRgnShpOprCdVO[]) models.toArray(new ScgRgnShpOprCdVO[models.size()]);
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
        this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rgnShpOprDesc = this.rgnShpOprDesc.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rgnShpOprCd = this.rgnShpOprCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.deltFlg = this.deltFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rgnShpOprAbbrDesc = this.rgnShpOprAbbrDesc.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ediUnmapFlg = this.ediUnmapFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
