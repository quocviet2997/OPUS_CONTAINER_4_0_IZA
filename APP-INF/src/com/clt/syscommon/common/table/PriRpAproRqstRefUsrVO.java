/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PriRpAproRqstRefUsrVO.java
*@FileTitle : PriRpAproRqstRefUsrVO
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

public class PriRpAproRqstRefUsrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriRpAproRqstRefUsrVO> models = new ArrayList<PriRpAproRqstRefUsrVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String amdtSeq = null;
	/* Column Info */
	private String aproRqstSeq = null;
	/* Column Info */
	private String aproRqstRefUsrId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String aproRqstRefUsrSeq = null;
	/* Column Info */
	private String aproRqstRefUsrOfcCd = null;
	/* Column Info */
	private String aproRqstVrfyFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String aproRqstRefTpCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String propNo = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriRpAproRqstRefUsrVO() {}

	public PriRpAproRqstRefUsrVO(String ibflag, String pagerows, String propNo, String amdtSeq, String aproRqstSeq, String aproRqstRefTpCd, String aproRqstRefUsrSeq, String aproRqstRefUsrId, String aproRqstRefUsrOfcCd, String aproRqstVrfyFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.amdtSeq = amdtSeq;
		this.aproRqstSeq = aproRqstSeq;
		this.aproRqstRefUsrId = aproRqstRefUsrId;
		this.creDt = creDt;
		this.aproRqstRefUsrSeq = aproRqstRefUsrSeq;
		this.aproRqstRefUsrOfcCd = aproRqstRefUsrOfcCd;
		this.aproRqstVrfyFlg = aproRqstVrfyFlg;
		this.pagerows = pagerows;
		this.aproRqstRefTpCd = aproRqstRefTpCd;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.propNo = propNo;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("amdt_seq", getAmdtSeq());
		this.hashColumns.put("apro_rqst_seq", getAproRqstSeq());
		this.hashColumns.put("apro_rqst_ref_usr_id", getAproRqstRefUsrId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("apro_rqst_ref_usr_seq", getAproRqstRefUsrSeq());
		this.hashColumns.put("apro_rqst_ref_usr_ofc_cd", getAproRqstRefUsrOfcCd());
		this.hashColumns.put("apro_rqst_vrfy_flg", getAproRqstVrfyFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("apro_rqst_ref_tp_cd", getAproRqstRefTpCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("prop_no", getPropNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("amdt_seq", "amdtSeq");
		this.hashFields.put("apro_rqst_seq", "aproRqstSeq");
		this.hashFields.put("apro_rqst_ref_usr_id", "aproRqstRefUsrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("apro_rqst_ref_usr_seq", "aproRqstRefUsrSeq");
		this.hashFields.put("apro_rqst_ref_usr_ofc_cd", "aproRqstRefUsrOfcCd");
		this.hashFields.put("apro_rqst_vrfy_flg", "aproRqstVrfyFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("apro_rqst_ref_tp_cd", "aproRqstRefTpCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("prop_no", "propNo");
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
	 * @return aproRqstRefUsrId
	 */
	public String getAproRqstRefUsrId() {
		return this.aproRqstRefUsrId;
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
	 * @return aproRqstRefUsrSeq
	 */
	public String getAproRqstRefUsrSeq() {
		return this.aproRqstRefUsrSeq;
	}
	
	/**
	 * Column Info
	 * @return aproRqstRefUsrOfcCd
	 */
	public String getAproRqstRefUsrOfcCd() {
		return this.aproRqstRefUsrOfcCd;
	}
	
	/**
	 * Column Info
	 * @return aproRqstVrfyFlg
	 */
	public String getAproRqstVrfyFlg() {
		return this.aproRqstVrfyFlg;
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
	 * @return aproRqstRefTpCd
	 */
	public String getAproRqstRefTpCd() {
		return this.aproRqstRefTpCd;
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
	 * @return propNo
	 */
	public String getPropNo() {
		return this.propNo;
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
	 * @param aproRqstRefUsrId
	 */
	public void setAproRqstRefUsrId(String aproRqstRefUsrId) {
		this.aproRqstRefUsrId = aproRqstRefUsrId;
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
	 * @param aproRqstRefUsrSeq
	 */
	public void setAproRqstRefUsrSeq(String aproRqstRefUsrSeq) {
		this.aproRqstRefUsrSeq = aproRqstRefUsrSeq;
	}
	
	/**
	 * Column Info
	 * @param aproRqstRefUsrOfcCd
	 */
	public void setAproRqstRefUsrOfcCd(String aproRqstRefUsrOfcCd) {
		this.aproRqstRefUsrOfcCd = aproRqstRefUsrOfcCd;
	}
	
	/**
	 * Column Info
	 * @param aproRqstVrfyFlg
	 */
	public void setAproRqstVrfyFlg(String aproRqstVrfyFlg) {
		this.aproRqstVrfyFlg = aproRqstVrfyFlg;
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
	 * @param aproRqstRefTpCd
	 */
	public void setAproRqstRefTpCd(String aproRqstRefTpCd) {
		this.aproRqstRefTpCd = aproRqstRefTpCd;
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
	 * @param propNo
	 */
	public void setPropNo(String propNo) {
		this.propNo = propNo;
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
		setAmdtSeq(JSPUtil.getParameter(request, "amdt_seq", ""));
		setAproRqstSeq(JSPUtil.getParameter(request, "apro_rqst_seq", ""));
		setAproRqstRefUsrId(JSPUtil.getParameter(request, "apro_rqst_ref_usr_id", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setAproRqstRefUsrSeq(JSPUtil.getParameter(request, "apro_rqst_ref_usr_seq", ""));
		setAproRqstRefUsrOfcCd(JSPUtil.getParameter(request, "apro_rqst_ref_usr_ofc_cd", ""));
		setAproRqstVrfyFlg(JSPUtil.getParameter(request, "apro_rqst_vrfy_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setAproRqstRefTpCd(JSPUtil.getParameter(request, "apro_rqst_ref_tp_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPropNo(JSPUtil.getParameter(request, "prop_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriRpAproRqstRefUsrVO[]
	 */
	public PriRpAproRqstRefUsrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriRpAproRqstRefUsrVO[]
	 */
	public PriRpAproRqstRefUsrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriRpAproRqstRefUsrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] amdtSeq = (JSPUtil.getParameter(request, prefix	+ "amdt_seq", length));
			String[] aproRqstSeq = (JSPUtil.getParameter(request, prefix	+ "apro_rqst_seq", length));
			String[] aproRqstRefUsrId = (JSPUtil.getParameter(request, prefix	+ "apro_rqst_ref_usr_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] aproRqstRefUsrSeq = (JSPUtil.getParameter(request, prefix	+ "apro_rqst_ref_usr_seq", length));
			String[] aproRqstRefUsrOfcCd = (JSPUtil.getParameter(request, prefix	+ "apro_rqst_ref_usr_ofc_cd", length));
			String[] aproRqstVrfyFlg = (JSPUtil.getParameter(request, prefix	+ "apro_rqst_vrfy_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] aproRqstRefTpCd = (JSPUtil.getParameter(request, prefix	+ "apro_rqst_ref_tp_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] propNo = (JSPUtil.getParameter(request, prefix	+ "prop_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new PriRpAproRqstRefUsrVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (amdtSeq[i] != null)
					model.setAmdtSeq(amdtSeq[i]);
				if (aproRqstSeq[i] != null)
					model.setAproRqstSeq(aproRqstSeq[i]);
				if (aproRqstRefUsrId[i] != null)
					model.setAproRqstRefUsrId(aproRqstRefUsrId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (aproRqstRefUsrSeq[i] != null)
					model.setAproRqstRefUsrSeq(aproRqstRefUsrSeq[i]);
				if (aproRqstRefUsrOfcCd[i] != null)
					model.setAproRqstRefUsrOfcCd(aproRqstRefUsrOfcCd[i]);
				if (aproRqstVrfyFlg[i] != null)
					model.setAproRqstVrfyFlg(aproRqstVrfyFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (aproRqstRefTpCd[i] != null)
					model.setAproRqstRefTpCd(aproRqstRefTpCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (propNo[i] != null)
					model.setPropNo(propNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPriRpAproRqstRefUsrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PriRpAproRqstRefUsrVO[]
	 */
	public PriRpAproRqstRefUsrVO[] getPriRpAproRqstRefUsrVOs(){
		PriRpAproRqstRefUsrVO[] vos = (PriRpAproRqstRefUsrVO[])models.toArray(new PriRpAproRqstRefUsrVO[models.size()]);
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
		this.amdtSeq = this.amdtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRqstSeq = this.aproRqstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRqstRefUsrId = this.aproRqstRefUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRqstRefUsrSeq = this.aproRqstRefUsrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRqstRefUsrOfcCd = this.aproRqstRefUsrOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRqstVrfyFlg = this.aproRqstVrfyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRqstRefTpCd = this.aproRqstRefTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propNo = this.propNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
