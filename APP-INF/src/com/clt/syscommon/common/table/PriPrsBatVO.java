/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : PriPrsBatVO.java
*@FileTitle : PriPrsBatVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.04.08
*@LastModifier : 송민석
*@LastVersion : 1.0
* 2010.04.08 송민석 
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
 * @author 송민석
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PriPrsBatVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriPrsBatVO> models = new ArrayList<PriPrsBatVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String prsBatErrDesc = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String paraInfoCtnt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String prsBatErrVal = null;
	/* Column Info */
	private String prsBatSeq = null;
	/* Column Info */
	private String prsBatId = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String pgmNo = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriPrsBatVO() {}

	public PriPrsBatVO(String ibflag, String pagerows, String pgmNo, String paraInfoCtnt, String prsBatSeq, String prsBatId, String prsBatErrVal, String prsBatErrDesc, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.prsBatErrDesc = prsBatErrDesc;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.paraInfoCtnt = paraInfoCtnt;
		this.creDt = creDt;
		this.prsBatErrVal = prsBatErrVal;
		this.prsBatSeq = prsBatSeq;
		this.prsBatId = prsBatId;
		this.updUsrId = updUsrId;
		this.pgmNo = pgmNo;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("prs_bat_err_desc", getPrsBatErrDesc());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("para_info_ctnt", getParaInfoCtnt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("prs_bat_err_val", getPrsBatErrVal());
		this.hashColumns.put("prs_bat_seq", getPrsBatSeq());
		this.hashColumns.put("prs_bat_id", getPrsBatId());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pgm_no", getPgmNo());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("prs_bat_err_desc", "prsBatErrDesc");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("para_info_ctnt", "paraInfoCtnt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("prs_bat_err_val", "prsBatErrVal");
		this.hashFields.put("prs_bat_seq", "prsBatSeq");
		this.hashFields.put("prs_bat_id", "prsBatId");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pgm_no", "pgmNo");
		this.hashFields.put("pagerows", "pagerows");
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
	 * @return prsBatErrDesc
	 */
	public String getPrsBatErrDesc() {
		return this.prsBatErrDesc;
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
	 * @return paraInfoCtnt
	 */
	public String getParaInfoCtnt() {
		return this.paraInfoCtnt;
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
	 * @return prsBatErrVal
	 */
	public String getPrsBatErrVal() {
		return this.prsBatErrVal;
	}
	
	/**
	 * Column Info
	 * @return prsBatSeq
	 */
	public String getPrsBatSeq() {
		return this.prsBatSeq;
	}
	
	/**
	 * Column Info
	 * @return prsBatId
	 */
	public String getPrsBatId() {
		return this.prsBatId;
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
	 * @return pgmNo
	 */
	public String getPgmNo() {
		return this.pgmNo;
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
	 * @param prsBatErrDesc
	 */
	public void setPrsBatErrDesc(String prsBatErrDesc) {
		this.prsBatErrDesc = prsBatErrDesc;
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
	 * @param paraInfoCtnt
	 */
	public void setParaInfoCtnt(String paraInfoCtnt) {
		this.paraInfoCtnt = paraInfoCtnt;
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
	 * @param prsBatErrVal
	 */
	public void setPrsBatErrVal(String prsBatErrVal) {
		this.prsBatErrVal = prsBatErrVal;
	}
	
	/**
	 * Column Info
	 * @param prsBatSeq
	 */
	public void setPrsBatSeq(String prsBatSeq) {
		this.prsBatSeq = prsBatSeq;
	}
	
	/**
	 * Column Info
	 * @param prsBatId
	 */
	public void setPrsBatId(String prsBatId) {
		this.prsBatId = prsBatId;
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
	 * @param pgmNo
	 */
	public void setPgmNo(String pgmNo) {
		this.pgmNo = pgmNo;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
		setPrsBatErrDesc(JSPUtil.getParameter(request, prefix + "prs_bat_err_desc", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setParaInfoCtnt(JSPUtil.getParameter(request, prefix + "para_info_ctnt", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setPrsBatErrVal(JSPUtil.getParameter(request, prefix + "prs_bat_err_val", ""));
		setPrsBatSeq(JSPUtil.getParameter(request, prefix + "prs_bat_seq", ""));
		setPrsBatId(JSPUtil.getParameter(request, prefix + "prs_bat_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setPgmNo(JSPUtil.getParameter(request, prefix + "pgm_no", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriPrsBatVO[]
	 */
	public PriPrsBatVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriPrsBatVO[]
	 */
	public PriPrsBatVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriPrsBatVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] prsBatErrDesc = (JSPUtil.getParameter(request, prefix	+ "prs_bat_err_desc", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] paraInfoCtnt = (JSPUtil.getParameter(request, prefix	+ "para_info_ctnt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] prsBatErrVal = (JSPUtil.getParameter(request, prefix	+ "prs_bat_err_val", length));
			String[] prsBatSeq = (JSPUtil.getParameter(request, prefix	+ "prs_bat_seq", length));
			String[] prsBatId = (JSPUtil.getParameter(request, prefix	+ "prs_bat_id", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pgmNo = (JSPUtil.getParameter(request, prefix	+ "pgm_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new PriPrsBatVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (prsBatErrDesc[i] != null)
					model.setPrsBatErrDesc(prsBatErrDesc[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (paraInfoCtnt[i] != null)
					model.setParaInfoCtnt(paraInfoCtnt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (prsBatErrVal[i] != null)
					model.setPrsBatErrVal(prsBatErrVal[i]);
				if (prsBatSeq[i] != null)
					model.setPrsBatSeq(prsBatSeq[i]);
				if (prsBatId[i] != null)
					model.setPrsBatId(prsBatId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pgmNo[i] != null)
					model.setPgmNo(pgmNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPriPrsBatVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PriPrsBatVO[]
	 */
	public PriPrsBatVO[] getPriPrsBatVOs(){
		PriPrsBatVO[] vos = (PriPrsBatVO[])models.toArray(new PriPrsBatVO[models.size()]);
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
		this.prsBatErrDesc = this.prsBatErrDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.paraInfoCtnt = this.paraInfoCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsBatErrVal = this.prsBatErrVal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsBatSeq = this.prsBatSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsBatId = this.prsBatId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNo = this.pgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
