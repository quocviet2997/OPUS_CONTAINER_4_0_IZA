/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PriRpAproRqstRefVO.java
*@FileTitle : PriRpAproRqstRefVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.01
*@LastModifier : 문동규
*@LastVersion : 1.0
* 2009.10.01 문동규 
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
 * @author 문동규
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PriRpAproRqstRefVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriRpAproRqstRefVO> models = new ArrayList<PriRpAproRqstRefVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String aproRqstRmk = null;
	/* Column Info */
	private String amdtSeq = null;
	/* Column Info */
	private String aproRqstSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String aproRqstUsrId = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String propNo = null;
	/* Column Info */
	private String prcAproRqstStsCd = null;
	/* Column Info */
	private String aproRqstUsrOfcCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriRpAproRqstRefVO() {}

	public PriRpAproRqstRefVO(String ibflag, String pagerows, String propNo, String amdtSeq, String aproRqstSeq, String aproRqstUsrId, String aproRqstUsrOfcCd, String prcAproRqstStsCd, String aproRqstRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.aproRqstRmk = aproRqstRmk;
		this.amdtSeq = amdtSeq;
		this.aproRqstSeq = aproRqstSeq;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.aproRqstUsrId = aproRqstUsrId;
		this.creUsrId = creUsrId;
		this.propNo = propNo;
		this.prcAproRqstStsCd = prcAproRqstStsCd;
		this.aproRqstUsrOfcCd = aproRqstUsrOfcCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("apro_rqst_rmk", getAproRqstRmk());
		this.hashColumns.put("amdt_seq", getAmdtSeq());
		this.hashColumns.put("apro_rqst_seq", getAproRqstSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("apro_rqst_usr_id", getAproRqstUsrId());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("prop_no", getPropNo());
		this.hashColumns.put("prc_apro_rqst_sts_cd", getPrcAproRqstStsCd());
		this.hashColumns.put("apro_rqst_usr_ofc_cd", getAproRqstUsrOfcCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("apro_rqst_rmk", "aproRqstRmk");
		this.hashFields.put("amdt_seq", "amdtSeq");
		this.hashFields.put("apro_rqst_seq", "aproRqstSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("apro_rqst_usr_id", "aproRqstUsrId");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("prop_no", "propNo");
		this.hashFields.put("prc_apro_rqst_sts_cd", "prcAproRqstStsCd");
		this.hashFields.put("apro_rqst_usr_ofc_cd", "aproRqstUsrOfcCd");
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
	 * @return aproRqstRmk
	 */
	public String getAproRqstRmk() {
		return this.aproRqstRmk;
	}
	
	/**
	 * Column Info
	 * @return amdtSeq
	 */
	public String getAmdtSeq() {
		return this.amdtSeq;
	}
	
	/**
	 * Column Info
	 * @return aproRqstSeq
	 */
	public String getAproRqstSeq() {
		return this.aproRqstSeq;
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
	 * @return aproRqstUsrId
	 */
	public String getAproRqstUsrId() {
		return this.aproRqstUsrId;
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
	 * @return propNo
	 */
	public String getPropNo() {
		return this.propNo;
	}
	
	/**
	 * Column Info
	 * @return prcAproRqstStsCd
	 */
	public String getPrcAproRqstStsCd() {
		return this.prcAproRqstStsCd;
	}
	
	/**
	 * Column Info
	 * @return aproRqstUsrOfcCd
	 */
	public String getAproRqstUsrOfcCd() {
		return this.aproRqstUsrOfcCd;
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
	 * @param aproRqstRmk
	 */
	public void setAproRqstRmk(String aproRqstRmk) {
		this.aproRqstRmk = aproRqstRmk;
	}
	
	/**
	 * Column Info
	 * @param amdtSeq
	 */
	public void setAmdtSeq(String amdtSeq) {
		this.amdtSeq = amdtSeq;
	}
	
	/**
	 * Column Info
	 * @param aproRqstSeq
	 */
	public void setAproRqstSeq(String aproRqstSeq) {
		this.aproRqstSeq = aproRqstSeq;
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
	 * @param aproRqstUsrId
	 */
	public void setAproRqstUsrId(String aproRqstUsrId) {
		this.aproRqstUsrId = aproRqstUsrId;
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
	 * @param propNo
	 */
	public void setPropNo(String propNo) {
		this.propNo = propNo;
	}
	
	/**
	 * Column Info
	 * @param prcAproRqstStsCd
	 */
	public void setPrcAproRqstStsCd(String prcAproRqstStsCd) {
		this.prcAproRqstStsCd = prcAproRqstStsCd;
	}
	
	/**
	 * Column Info
	 * @param aproRqstUsrOfcCd
	 */
	public void setAproRqstUsrOfcCd(String aproRqstUsrOfcCd) {
		this.aproRqstUsrOfcCd = aproRqstUsrOfcCd;
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
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setAproRqstRmk(JSPUtil.getParameter(request, "apro_rqst_rmk", ""));
		setAmdtSeq(JSPUtil.getParameter(request, "amdt_seq", ""));
		setAproRqstSeq(JSPUtil.getParameter(request, "apro_rqst_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAproRqstUsrId(JSPUtil.getParameter(request, "apro_rqst_usr_id", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPropNo(JSPUtil.getParameter(request, "prop_no", ""));
		setPrcAproRqstStsCd(JSPUtil.getParameter(request, "prc_apro_rqst_sts_cd", ""));
		setAproRqstUsrOfcCd(JSPUtil.getParameter(request, "apro_rqst_usr_ofc_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriRpAproRqstRefVO[]
	 */
	public PriRpAproRqstRefVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriRpAproRqstRefVO[]
	 */
	public PriRpAproRqstRefVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriRpAproRqstRefVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] aproRqstRmk = (JSPUtil.getParameter(request, prefix	+ "apro_rqst_rmk", length));
			String[] amdtSeq = (JSPUtil.getParameter(request, prefix	+ "amdt_seq", length));
			String[] aproRqstSeq = (JSPUtil.getParameter(request, prefix	+ "apro_rqst_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] aproRqstUsrId = (JSPUtil.getParameter(request, prefix	+ "apro_rqst_usr_id", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] propNo = (JSPUtil.getParameter(request, prefix	+ "prop_no", length));
			String[] prcAproRqstStsCd = (JSPUtil.getParameter(request, prefix	+ "prc_apro_rqst_sts_cd", length));
			String[] aproRqstUsrOfcCd = (JSPUtil.getParameter(request, prefix	+ "apro_rqst_usr_ofc_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new PriRpAproRqstRefVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (aproRqstRmk[i] != null)
					model.setAproRqstRmk(aproRqstRmk[i]);
				if (amdtSeq[i] != null)
					model.setAmdtSeq(amdtSeq[i]);
				if (aproRqstSeq[i] != null)
					model.setAproRqstSeq(aproRqstSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (aproRqstUsrId[i] != null)
					model.setAproRqstUsrId(aproRqstUsrId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (propNo[i] != null)
					model.setPropNo(propNo[i]);
				if (prcAproRqstStsCd[i] != null)
					model.setPrcAproRqstStsCd(prcAproRqstStsCd[i]);
				if (aproRqstUsrOfcCd[i] != null)
					model.setAproRqstUsrOfcCd(aproRqstUsrOfcCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPriRpAproRqstRefVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PriRpAproRqstRefVO[]
	 */
	public PriRpAproRqstRefVO[] getPriRpAproRqstRefVOs(){
		PriRpAproRqstRefVO[] vos = (PriRpAproRqstRefVO[])models.toArray(new PriRpAproRqstRefVO[models.size()]);
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
	public void unDataFormat(){
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRqstRmk = this.aproRqstRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amdtSeq = this.amdtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRqstSeq = this.aproRqstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRqstUsrId = this.aproRqstUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propNo = this.propNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcAproRqstStsCd = this.prcAproRqstStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRqstUsrOfcCd = this.aproRqstUsrOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
