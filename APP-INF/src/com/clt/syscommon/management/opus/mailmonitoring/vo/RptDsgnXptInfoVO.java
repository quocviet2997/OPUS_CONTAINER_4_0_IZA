/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : RptDsgnXptInfoVO.java
*@FileTitle : RptDsgnXptInfoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2016.03.21
*@LastModifier : 
*@LastVersion : 1.0
* 2016.03.21  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.management.opus.mailmonitoring.vo;

import java.lang.reflect.Field;
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

public class RptDsgnXptInfoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<RptDsgnXptInfoVO> models = new ArrayList<RptDsgnXptInfoVO>();
	
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String rdApplCd = null;
	/* Column Info */
	private String rdParaCtnt = null;
	/* Column Info */
	private String xptFileNm = null;
	/* Column Info */
	private String xptDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String emlSndNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String xptFileTpCd = null;
	/* Column Info */
	private String rptXptNo = null;
	/* Column Info */
	private String xptRsltCd = null;
	/* Column Info */
	private String rdTmpltNm = null;
	/* Column Info */
	private String xptErrMsg = null;
	/* Column Info */
	private String updDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public RptDsgnXptInfoVO() {}

	public RptDsgnXptInfoVO(String ibflag, String pagerows, String rptXptNo, String emlSndNo, String rdApplCd, String rdTmpltNm, String rdParaCtnt, String xptFileNm, String xptFileTpCd, String xptRsltCd, String xptDt, String xptErrMsg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.pagerows = pagerows;
		this.rdApplCd = rdApplCd;
		this.rdParaCtnt = rdParaCtnt;
		this.xptFileNm = xptFileNm;
		this.xptDt = xptDt;
		this.ibflag = ibflag;
		this.emlSndNo = emlSndNo;
		this.updUsrId = updUsrId;
		this.creUsrId = creUsrId;
		this.creDt = creDt;
		this.xptFileTpCd = xptFileTpCd;
		this.rptXptNo = rptXptNo;
		this.xptRsltCd = xptRsltCd;
		this.rdTmpltNm = rdTmpltNm;
		this.xptErrMsg = xptErrMsg;
		this.updDt = updDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("rd_appl_cd", getRdApplCd());
		this.hashColumns.put("rd_para_ctnt", getRdParaCtnt());
		this.hashColumns.put("xpt_file_nm", getXptFileNm());
		this.hashColumns.put("xpt_dt", getXptDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("eml_snd_no", getEmlSndNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("xpt_file_tp_cd", getXptFileTpCd());
		this.hashColumns.put("rpt_xpt_no", getRptXptNo());
		this.hashColumns.put("xpt_rslt_cd", getXptRsltCd());
		this.hashColumns.put("rd_tmplt_nm", getRdTmpltNm());
		this.hashColumns.put("xpt_err_msg", getXptErrMsg());
		this.hashColumns.put("upd_dt", getUpdDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("rd_appl_cd", "rdApplCd");
		this.hashFields.put("rd_para_ctnt", "rdParaCtnt");
		this.hashFields.put("xpt_file_nm", "xptFileNm");
		this.hashFields.put("xpt_dt", "xptDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("eml_snd_no", "emlSndNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("xpt_file_tp_cd", "xptFileTpCd");
		this.hashFields.put("rpt_xpt_no", "rptXptNo");
		this.hashFields.put("xpt_rslt_cd", "xptRsltCd");
		this.hashFields.put("rd_tmplt_nm", "rdTmpltNm");
		this.hashFields.put("xpt_err_msg", "xptErrMsg");
		this.hashFields.put("upd_dt", "updDt");
		return this.hashFields;
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
	 * @return rdApplCd
	 */
	public String getRdApplCd() {
		return this.rdApplCd;
	}
	
	/**
	 * Column Info
	 * @return rdParaCtnt
	 */
	public String getRdParaCtnt() {
		return this.rdParaCtnt;
	}
	
	/**
	 * Column Info
	 * @return xptFileNm
	 */
	public String getXptFileNm() {
		return this.xptFileNm;
	}
	
	/**
	 * Column Info
	 * @return xptDt
	 */
	public String getXptDt() {
		return this.xptDt;
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
	 * @return emlSndNo
	 */
	public String getEmlSndNo() {
		return this.emlSndNo;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return xptFileTpCd
	 */
	public String getXptFileTpCd() {
		return this.xptFileTpCd;
	}
	
	/**
	 * Column Info
	 * @return rptXptNo
	 */
	public String getRptXptNo() {
		return this.rptXptNo;
	}
	
	/**
	 * Column Info
	 * @return xptRsltCd
	 */
	public String getXptRsltCd() {
		return this.xptRsltCd;
	}
	
	/**
	 * Column Info
	 * @return rdTmpltNm
	 */
	public String getRdTmpltNm() {
		return this.rdTmpltNm;
	}
	
	/**
	 * Column Info
	 * @return xptErrMsg
	 */
	public String getXptErrMsg() {
		return this.xptErrMsg;
	}
	
	/**
	 * Column Info
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
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
	 * @param rdApplCd
	 */
	public void setRdApplCd(String rdApplCd) {
		this.rdApplCd = rdApplCd;
	}
	
	/**
	 * Column Info
	 * @param rdParaCtnt
	 */
	public void setRdParaCtnt(String rdParaCtnt) {
		this.rdParaCtnt = rdParaCtnt;
	}
	
	/**
	 * Column Info
	 * @param xptFileNm
	 */
	public void setXptFileNm(String xptFileNm) {
		this.xptFileNm = xptFileNm;
	}
	
	/**
	 * Column Info
	 * @param xptDt
	 */
	public void setXptDt(String xptDt) {
		this.xptDt = xptDt;
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
	 * @param emlSndNo
	 */
	public void setEmlSndNo(String emlSndNo) {
		this.emlSndNo = emlSndNo;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
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
	 * @param xptFileTpCd
	 */
	public void setXptFileTpCd(String xptFileTpCd) {
		this.xptFileTpCd = xptFileTpCd;
	}
	
	/**
	 * Column Info
	 * @param rptXptNo
	 */
	public void setRptXptNo(String rptXptNo) {
		this.rptXptNo = rptXptNo;
	}
	
	/**
	 * Column Info
	 * @param xptRsltCd
	 */
	public void setXptRsltCd(String xptRsltCd) {
		this.xptRsltCd = xptRsltCd;
	}
	
	/**
	 * Column Info
	 * @param rdTmpltNm
	 */
	public void setRdTmpltNm(String rdTmpltNm) {
		this.rdTmpltNm = rdTmpltNm;
	}
	
	/**
	 * Column Info
	 * @param xptErrMsg
	 */
	public void setXptErrMsg(String xptErrMsg) {
		this.xptErrMsg = xptErrMsg;
	}
	
	/**
	 * Column Info
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
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
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setRdApplCd(JSPUtil.getParameter(request, prefix + "rd_appl_cd", ""));
		setRdParaCtnt(JSPUtil.getParameter(request, prefix + "rd_para_ctnt", ""));
		setXptFileNm(JSPUtil.getParameter(request, prefix + "xpt_file_nm", ""));
		setXptDt(JSPUtil.getParameter(request, prefix + "xpt_dt", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setEmlSndNo(JSPUtil.getParameter(request, prefix + "eml_snd_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setXptFileTpCd(JSPUtil.getParameter(request, prefix + "xpt_file_tp_cd", ""));
		setRptXptNo(JSPUtil.getParameter(request, prefix + "rpt_xpt_no", ""));
		setXptRsltCd(JSPUtil.getParameter(request, prefix + "xpt_rslt_cd", ""));
		setRdTmpltNm(JSPUtil.getParameter(request, prefix + "rd_tmplt_nm", ""));
		setXptErrMsg(JSPUtil.getParameter(request, prefix + "xpt_err_msg", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return RptDsgnXptInfoVO[]
	 */
	public RptDsgnXptInfoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return RptDsgnXptInfoVO[]
	 */
	public RptDsgnXptInfoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		RptDsgnXptInfoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] rdApplCd = (JSPUtil.getParameter(request, prefix	+ "rd_appl_cd", length));
			String[] rdParaCtnt = (JSPUtil.getParameter(request, prefix	+ "rd_para_ctnt", length));
			String[] xptFileNm = (JSPUtil.getParameter(request, prefix	+ "xpt_file_nm", length));
			String[] xptDt = (JSPUtil.getParameter(request, prefix	+ "xpt_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] emlSndNo = (JSPUtil.getParameter(request, prefix	+ "eml_snd_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] xptFileTpCd = (JSPUtil.getParameter(request, prefix	+ "xpt_file_tp_cd", length));
			String[] rptXptNo = (JSPUtil.getParameter(request, prefix	+ "rpt_xpt_no", length));
			String[] xptRsltCd = (JSPUtil.getParameter(request, prefix	+ "xpt_rslt_cd", length));
			String[] rdTmpltNm = (JSPUtil.getParameter(request, prefix	+ "rd_tmplt_nm", length));
			String[] xptErrMsg = (JSPUtil.getParameter(request, prefix	+ "xpt_err_msg", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new RptDsgnXptInfoVO();
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (rdApplCd[i] != null)
					model.setRdApplCd(rdApplCd[i]);
				if (rdParaCtnt[i] != null)
					model.setRdParaCtnt(rdParaCtnt[i]);
				if (xptFileNm[i] != null)
					model.setXptFileNm(xptFileNm[i]);
				if (xptDt[i] != null)
					model.setXptDt(xptDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (emlSndNo[i] != null)
					model.setEmlSndNo(emlSndNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (xptFileTpCd[i] != null)
					model.setXptFileTpCd(xptFileTpCd[i]);
				if (rptXptNo[i] != null)
					model.setRptXptNo(rptXptNo[i]);
				if (xptRsltCd[i] != null)
					model.setXptRsltCd(xptRsltCd[i]);
				if (rdTmpltNm[i] != null)
					model.setRdTmpltNm(rdTmpltNm[i]);
				if (xptErrMsg[i] != null)
					model.setXptErrMsg(xptErrMsg[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getRptDsgnXptInfoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return RptDsgnXptInfoVO[]
	 */
	public RptDsgnXptInfoVO[] getRptDsgnXptInfoVOs(){
		RptDsgnXptInfoVO[] vos = (RptDsgnXptInfoVO[])models.toArray(new RptDsgnXptInfoVO[models.size()]);
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
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdApplCd = this.rdApplCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdParaCtnt = this.rdParaCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptFileNm = this.xptFileNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptDt = this.xptDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlSndNo = this.emlSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptFileTpCd = this.xptFileTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rptXptNo = this.rptXptNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptRsltCd = this.xptRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdTmpltNm = this.rdTmpltNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptErrMsg = this.xptErrMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
