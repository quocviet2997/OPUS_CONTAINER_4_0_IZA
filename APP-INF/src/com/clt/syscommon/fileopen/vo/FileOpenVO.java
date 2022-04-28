/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : FileOpenVO.java
*@FileTitle : FileOpenVO
*Open Issues :
*Change history :
*@LastModifyDate : 2016.05.31
*@LastModifier : 
*@LastVersion : 1.0
* 2016.05.31 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.fileopen.vo;

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
public class FileOpenVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L;

    private Collection<FileOpenVO> models = new ArrayList<FileOpenVO>();

    /* VO Data Value( C:Creation, U:Update, D:Delete ) */
    private String ibflag = null;

    /* Page Number */
    private String pagerows = null;

    /* Column Info */
    private String serId = null;

    /* Column Info */
    private String docId = null;

    /* Column Info */
    private String bkgNo = null;

    /* Column Info */
    private String seq = null;

    /* Column Info */
    private String authdt = null;

    /* Column Info */
    private String permType = null;

    /* Column Info */
    private String msg = null;

    /* Column Info */
    private String count = null;

    /*	테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

    /*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();

    public FileOpenVO() {
    }

    public FileOpenVO(String ibflag, String pagerows, String serId, String docId, String bkgNo, String seq, String authdt, String permType, String msg, String count) {
        this.ibflag = ibflag;
        this.pagerows = pagerows;
        this.serId = serId;
        this.docId = docId;
        this.bkgNo = bkgNo;
        this.seq = seq;
        this.authdt = authdt;
        this.permType = permType;
        this.msg = msg;
        this.count = count;
    }

    /**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("ser_id", getSerId());
        this.hashColumns.put("doc_id", getDocId());
        this.hashColumns.put("bkg_no", getBkgNo());
        this.hashColumns.put("seq", getSeq());
        this.hashColumns.put("authdt", getAuthdt());
        this.hashColumns.put("perm_type", getPermType());
        this.hashColumns.put("msg", getMsg());
        this.hashColumns.put("count", getCount());
        return this.hashColumns;
    }

    /**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("ser_id", "serId");
        this.hashFields.put("doc_id", "docId");
        this.hashFields.put("bkg_no", "bkgNo");
        this.hashFields.put("seq", "seq");
        this.hashFields.put("authdt", "authdt");
        this.hashFields.put("perm_type", "permType");
        this.hashFields.put("msg", "msg");
        this.hashFields.put("count", "count");
        return this.hashFields;
    }

    /**
	 *
	 * @param String ibflag
	 */
    public void setIbflag(String ibflag) {
        this.ibflag = ibflag;
    }

    /**
	 * 
	 * @return String ibflag
	 */
    public String getIbflag() {
        return this.ibflag;
    }

    /**
	 *
	 * @param String pagerows
	 */
    public void setPagerows(String pagerows) {
        this.pagerows = pagerows;
    }

    /**
	 * 
	 * @return String pagerows
	 */
    public String getPagerows() {
        return this.pagerows;
    }

    /**
	 *
	 * @param String serId
	 */
    public void setSerId(String serId) {
        this.serId = serId;
    }

    /**
	 * 
	 * @return String serId
	 */
    public String getSerId() {
        return this.serId;
    }

    /**
	 *
	 * @param String docId
	 */
    public void setDocId(String docId) {
        this.docId = docId;
    }

    /**
	 * 
	 * @return String docId
	 */
    public String getDocId() {
        return this.docId;
    }

    /**
	 *
	 * @param String bkgNo
	 */
    public void setBkgNo(String bkgNo) {
        this.bkgNo = bkgNo;
    }

    /**
	 * 
	 * @return String bkgNo
	 */
    public String getBkgNo() {
        return this.bkgNo;
    }

    /**
	 *
	 * @param String seq
	 */
    public void setSeq(String seq) {
        this.seq = seq;
    }

    /**
	 * 
	 * @return String seq
	 */
    public String getSeq() {
        return this.seq;
    }

    /**
	 *
	 * @param String authdt
	 */
    public void setAuthdt(String authdt) {
        this.authdt = authdt;
    }

    /**
	 * 
	 * @return String authdt
	 */
    public String getAuthdt() {
        return this.authdt;
    }

    /**
	 *
	 * @param String permType
	 */
    public void setPermType(String permType) {
        this.permType = permType;
    }

    /**
	 * 
	 * @return String permType
	 */
    public String getPermType() {
        return this.permType;
    }

    /**
	 *
	 * @param String msg
	 */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
	 * 
	 * @return String msg
	 */
    public String getMsg() {
        return this.msg;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getCount() {
        return this.count;
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
        setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
        setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
        setSerId(JSPUtil.getParameter(request, prefix + "ServiceID", ""));
        setDocId(JSPUtil.getParameter(request, prefix + "DocumentID", ""));
        setBkgNo(JSPUtil.getParameter(request, prefix + "bkgNo", ""));
        setSeq(JSPUtil.getParameter(request, prefix + "infoSeq", ""));
        setAuthdt(JSPUtil.getParameter(request, prefix + "authDt", ""));
        setPermType(JSPUtil.getParameter(request, prefix + "Request", ""));
        setMsg(JSPUtil.getParameter(request, prefix + "msg", ""));
        setCount(JSPUtil.getParameter(request, prefix + "Count", ""));
    }

    /**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return FileOpenVO[]
	 */
    public FileOpenVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return FileOpenVO[]
	 */
    public FileOpenVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        FileOpenVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
            String[] serId = (JSPUtil.getParameter(request, prefix + "ser_id", length));
            String[] docId = (JSPUtil.getParameter(request, prefix + "doc_id", length));
            String[] bkgNo = (JSPUtil.getParameter(request, prefix + "bkg_no", length));
            String[] seq = (JSPUtil.getParameter(request, prefix + "seq", length));
            String[] authdt = (JSPUtil.getParameter(request, prefix + "authdt", length));
            String[] permType = (JSPUtil.getParameter(request, prefix + "perm_type", length));
            String[] msg = (JSPUtil.getParameter(request, prefix + "msg", length));
            String[] count = (JSPUtil.getParameter(request, prefix + "count", length));
	    	/* Add a field line, do not delete */
            for (int i = 0; i < length; i++) {
                model = new FileOpenVO();
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (serId[i] != null)
                    model.setSerId(serId[i]);
                if (docId[i] != null)
                    model.setDocId(docId[i]);
                if (bkgNo[i] != null)
                    model.setBkgNo(bkgNo[i]);
                if (seq[i] != null)
                    model.setSeq(seq[i]);
                if (authdt[i] != null)
                    model.setAuthdt(authdt[i]);
                if (permType[i] != null)
                    model.setPermType(permType[i]);
                if (msg[i] != null)
                    model.setMsg(msg[i]);
                if (count[i] != null) 
		    		model.setCount(count[i]);
				/* Add a Method line, do not delete */
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getFileOpenVOs();
    }

    /**
	 * VO 배열을 반환
	 * @return FileOpenVO[]
	 */
    public FileOpenVO[] getFileOpenVOs() {
        FileOpenVO[] vos = (FileOpenVO[]) models.toArray(new FileOpenVO[models.size()]);
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
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.serId = this.serId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.docId = this.docId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgNo = this.bkgNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.seq = this.seq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.authdt = this.authdt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.permType = this.permType.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.msg = this.msg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.count = this.count.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
