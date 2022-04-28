/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : JooStlItmAcctVO.java
*@FileTitle : JooStlItmAcctVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.16
*@LastModifier : 박희동
*@LastVersion : 1.0
* 2009.10.16 박희동 
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
 * @author 박희동
 * @since J2EE 1.6
 * @see AbstractValueObject
 */
public class JooStlItmAcctVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L;

    private Collection<JooStlItmAcctVO> models = new ArrayList<JooStlItmAcctVO>();

    /* Column Info */
    private String updDt = null;

    /* Column Info */
    private String joEstmAcctCd = null;

    /* Column Info */
    private String crAcctCd = null;

    /* Column Info */
    private String creUsrId = null;

    /* VO Data Value( C:Creation, U:Update, D:Delete ) */
    private String ibflag = null;

    /* Column Info */
    private String reDivrCd = null;

    /* Column Info */
    private String creDt = null;

    /* Column Info */
    private String drAcctCd = null;

    /* Column Info */
    private String updUsrId = null;

    /* Column Info */
    private String joStlItmCd = null;

    /* Page Number */
    private String pagerows = null;

    /* Column Info */
    private String clrAcctCd = null;

    /*	테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new HashMap<String, String>();

    /*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new HashMap<String, String>();

    public JooStlItmAcctVO() {
    }

    public JooStlItmAcctVO(String ibflag, String pagerows, String reDivrCd, String joStlItmCd, String drAcctCd, String crAcctCd, String creDt, String creUsrId, String updDt, String updUsrId, String joEstmAcctCd, String clrAcctCd) {
        this.updDt = updDt;
        this.joEstmAcctCd = joEstmAcctCd;
        this.crAcctCd = crAcctCd;
        this.creUsrId = creUsrId;
        this.ibflag = ibflag;
        this.reDivrCd = reDivrCd;
        this.creDt = creDt;
        this.drAcctCd = drAcctCd;
        this.updUsrId = updUsrId;
        this.joStlItmCd = joStlItmCd;
        this.pagerows = pagerows;
        this.clrAcctCd = clrAcctCd;
    }

    /**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("jo_estm_acct_cd", getJoEstmAcctCd());
        this.hashColumns.put("cr_acct_cd", getCrAcctCd());
        this.hashColumns.put("cre_usr_id", getCreUsrId());
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("re_divr_cd", getReDivrCd());
        this.hashColumns.put("cre_dt", getCreDt());
        this.hashColumns.put("dr_acct_cd", getDrAcctCd());
        this.hashColumns.put("upd_usr_id", getUpdUsrId());
        this.hashColumns.put("jo_stl_itm_cd", getJoStlItmCd());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("clr_acct_cd", getClrAcctCd());
        return this.hashColumns;
    }

    /**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("jo_estm_acct_cd", "joEstmAcctCd");
        this.hashFields.put("cr_acct_cd", "crAcctCd");
        this.hashFields.put("cre_usr_id", "creUsrId");
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("re_divr_cd", "reDivrCd");
        this.hashFields.put("cre_dt", "creDt");
        this.hashFields.put("dr_acct_cd", "drAcctCd");
        this.hashFields.put("upd_usr_id", "updUsrId");
        this.hashFields.put("jo_stl_itm_cd", "joStlItmCd");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("clr_acct_cd", "clrAcctCd");
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
	 * @return joEstmAcctCd
	 */
    public String getJoEstmAcctCd() {
        return this.joEstmAcctCd;
    }

    /**
	 * Column Info
	 * @return crAcctCd
	 */
    public String getCrAcctCd() {
        return this.crAcctCd;
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
	 * @return reDivrCd
	 */
    public String getReDivrCd() {
        return this.reDivrCd;
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
	 * @return drAcctCd
	 */
    public String getDrAcctCd() {
        return this.drAcctCd;
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
	 * @return joStlItmCd
	 */
    public String getJoStlItmCd() {
        return this.joStlItmCd;
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
	 * @param joEstmAcctCd
	 */
    public void setJoEstmAcctCd(String joEstmAcctCd) {
        this.joEstmAcctCd = joEstmAcctCd;
    }

    /**
	 * Column Info
	 * @param crAcctCd
	 */
    public void setCrAcctCd(String crAcctCd) {
        this.crAcctCd = crAcctCd;
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
	 * @param reDivrCd
	 */
    public void setReDivrCd(String reDivrCd) {
        this.reDivrCd = reDivrCd;
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
	 * @param drAcctCd
	 */
    public void setDrAcctCd(String drAcctCd) {
        this.drAcctCd = drAcctCd;
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
	 * @param joStlItmCd
	 */
    public void setJoStlItmCd(String joStlItmCd) {
        this.joStlItmCd = joStlItmCd;
    }

    /**
	 * Page Number
	 * @param pagerows
	 */
    public void setPagerows(String pagerows) {
        this.pagerows = pagerows;
    }

    public void setClrAcctCd(String clrAcctCd) {
        this.clrAcctCd = clrAcctCd;
    }

    public String getClrAcctCd() {
        return this.clrAcctCd;
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
        setJoEstmAcctCd(JSPUtil.getParameter(request, prefix + "jo_estm_acct_cd", ""));
        setCrAcctCd(JSPUtil.getParameter(request, prefix + "cr_acct_cd", ""));
        setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
        setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
        setReDivrCd(JSPUtil.getParameter(request, prefix + "re_divr_cd", ""));
        setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
        setDrAcctCd(JSPUtil.getParameter(request, prefix + "dr_acct_cd", ""));
        setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
        setJoStlItmCd(JSPUtil.getParameter(request, prefix + "jo_stl_itm_cd", ""));
        setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
        setClrAcctCd(JSPUtil.getParameter(request, prefix + "clr_acct_cd", ""));
    }

    /**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return JooStlItmAcctVO[]
	 */
    public JooStlItmAcctVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return JooStlItmAcctVO[]
	 */
    public JooStlItmAcctVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        JooStlItmAcctVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
            String[] joEstmAcctCd = (JSPUtil.getParameter(request, prefix + "jo_estm_acct_cd", length));
            String[] crAcctCd = (JSPUtil.getParameter(request, prefix + "cr_acct_cd", length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
            String[] reDivrCd = (JSPUtil.getParameter(request, prefix + "re_divr_cd", length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
            String[] drAcctCd = (JSPUtil.getParameter(request, prefix + "dr_acct_cd", length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
            String[] joStlItmCd = (JSPUtil.getParameter(request, prefix + "jo_stl_itm_cd", length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
            String[] clrAcctCd = (JSPUtil.getParameter(request, prefix + "clr_acct_cd", length));
	    	/* Add a field line, do not delete */
            for (int i = 0; i < length; i++) {
                model = new JooStlItmAcctVO();
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (joEstmAcctCd[i] != null)
                    model.setJoEstmAcctCd(joEstmAcctCd[i]);
                if (crAcctCd[i] != null)
                    model.setCrAcctCd(crAcctCd[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (reDivrCd[i] != null)
                    model.setReDivrCd(reDivrCd[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (drAcctCd[i] != null)
                    model.setDrAcctCd(drAcctCd[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                if (joStlItmCd[i] != null)
                    model.setJoStlItmCd(joStlItmCd[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (clrAcctCd[i] != null) 
		    		model.setClrAcctCd(clrAcctCd[i]);
				/* Add a Method line, do not delete */
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getJooStlItmAcctVOs();
    }

    /**
	 * VO 배열을 반환
	 * @return JooStlItmAcctVO[]
	 */
    public JooStlItmAcctVO[] getJooStlItmAcctVOs() {
        JooStlItmAcctVO[] vos = (JooStlItmAcctVO[]) models.toArray(new JooStlItmAcctVO[models.size()]);
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
        this.joEstmAcctCd = this.joEstmAcctCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.crAcctCd = this.crAcctCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.reDivrCd = this.reDivrCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.drAcctCd = this.drAcctCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.joStlItmCd = this.joStlItmCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.clrAcctCd = this.clrAcctCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
