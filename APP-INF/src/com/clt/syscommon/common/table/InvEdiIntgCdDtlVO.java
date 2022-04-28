/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : InvEdiIntgCdDtlVO.java
*@FileTitle : InvEdiIntgCdDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.11.22
*@LastModifier : 이석준
*@LastVersion : 1.0
* 2010.11.22 이석준 
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
 * @author 이석준
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class InvEdiIntgCdDtlVO extends AbstractValueObject {
 
	private static final long serialVersionUID = 1L;
	
	private Collection<InvEdiIntgCdDtlVO> models = new ArrayList<InvEdiIntgCdDtlVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String dpSeq = null;
	/* Column Info */
	private String intgCdId = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String custCdValCtnt = null;
	/* Column Info */
	private String custCdValDesc = null;
	/* Column Info */
	private String hjsCdValDesc = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String hjsCdValCtnt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public InvEdiIntgCdDtlVO() {}

	public InvEdiIntgCdDtlVO(String ibflag, String pagerows, String intgCdId, String hjsCdValCtnt, String hjsCdValDesc, String custCdValCtnt, String custCdValDesc, String dpSeq, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.dpSeq = dpSeq;
		this.intgCdId = intgCdId;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.custCdValCtnt = custCdValCtnt;
		this.custCdValDesc = custCdValDesc;
		this.hjsCdValDesc = hjsCdValDesc;
		this.creDt = creDt;
		this.hjsCdValCtnt = hjsCdValCtnt;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("dp_seq", getDpSeq());
		this.hashColumns.put("intg_cd_id", getIntgCdId());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cust_cd_val_ctnt", getCustCdValCtnt());
		this.hashColumns.put("cust_cd_val_desc", getCustCdValDesc());
		this.hashColumns.put("hjs_cd_val_desc", getHjsCdValDesc());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("hjs_cd_val_ctnt", getHjsCdValCtnt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("dp_seq", "dpSeq");
		this.hashFields.put("intg_cd_id", "intgCdId");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cust_cd_val_ctnt", "custCdValCtnt");
		this.hashFields.put("cust_cd_val_desc", "custCdValDesc");
		this.hashFields.put("hjs_cd_val_desc", "hjsCdValDesc");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("hjs_cd_val_ctnt", "hjsCdValCtnt");
		this.hashFields.put("upd_usr_id", "updUsrId");
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
	 * @return dpSeq
	 */
	public String getDpSeq() {
		return this.dpSeq;
	}
	
	/**
	 * Column Info
	 * @return intgCdId
	 */
	public String getIntgCdId() {
		return this.intgCdId;
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
	 * @return custCdValCtnt
	 */
	public String getCustCdValCtnt() {
		return this.custCdValCtnt;
	}
	
	/**
	 * Column Info
	 * @return custCdValDesc
	 */
	public String getCustCdValDesc() {
		return this.custCdValDesc;
	}
	
	/**
	 * Column Info
	 * @return hjsCdValDesc
	 */
	public String getHjsCdValDesc() {
		return this.hjsCdValDesc;
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
	 * @return hjsCdValCtnt
	 */
	public String getHjsCdValCtnt() {
		return this.hjsCdValCtnt;
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
	 * @param dpSeq
	 */
	public void setDpSeq(String dpSeq) {
		this.dpSeq = dpSeq;
	}
	
	/**
	 * Column Info
	 * @param intgCdId
	 */
	public void setIntgCdId(String intgCdId) {
		this.intgCdId = intgCdId;
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
	 * @param custCdValCtnt
	 */
	public void setCustCdValCtnt(String custCdValCtnt) {
		this.custCdValCtnt = custCdValCtnt;
	}
	
	/**
	 * Column Info
	 * @param custCdValDesc
	 */
	public void setCustCdValDesc(String custCdValDesc) {
		this.custCdValDesc = custCdValDesc;
	}
	
	/**
	 * Column Info
	 * @param hjsCdValDesc
	 */
	public void setHjsCdValDesc(String hjsCdValDesc) {
		this.hjsCdValDesc = hjsCdValDesc;
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
	 * @param hjsCdValCtnt
	 */
	public void setHjsCdValCtnt(String hjsCdValCtnt) {
		this.hjsCdValCtnt = hjsCdValCtnt;
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
		setDpSeq(JSPUtil.getParameter(request, prefix + "dp_seq", ""));
		setIntgCdId(JSPUtil.getParameter(request, prefix + "intg_cd_id", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCustCdValCtnt(JSPUtil.getParameter(request, prefix + "cust_cd_val_ctnt", ""));
		setCustCdValDesc(JSPUtil.getParameter(request, prefix + "cust_cd_val_desc", ""));
		setHjsCdValDesc(JSPUtil.getParameter(request, prefix + "hjs_cd_val_desc", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setHjsCdValCtnt(JSPUtil.getParameter(request, prefix + "hjs_cd_val_ctnt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return InvEdiIntgCdDtlVO[]
	 */
	public InvEdiIntgCdDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return InvEdiIntgCdDtlVO[]
	 */
	public InvEdiIntgCdDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		InvEdiIntgCdDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] dpSeq = (JSPUtil.getParameter(request, prefix	+ "dp_seq", length));
			String[] intgCdId = (JSPUtil.getParameter(request, prefix	+ "intg_cd_id", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] custCdValCtnt = (JSPUtil.getParameter(request, prefix	+ "cust_cd_val_ctnt", length));
			String[] custCdValDesc = (JSPUtil.getParameter(request, prefix	+ "cust_cd_val_desc", length));
			String[] hjsCdValDesc = (JSPUtil.getParameter(request, prefix	+ "hjs_cd_val_desc", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] hjsCdValCtnt = (JSPUtil.getParameter(request, prefix	+ "hjs_cd_val_ctnt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new InvEdiIntgCdDtlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (dpSeq[i] != null)
					model.setDpSeq(dpSeq[i]);
				if (intgCdId[i] != null)
					model.setIntgCdId(intgCdId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (custCdValCtnt[i] != null)
					model.setCustCdValCtnt(custCdValCtnt[i]);
				if (custCdValDesc[i] != null)
					model.setCustCdValDesc(custCdValDesc[i]);
				if (hjsCdValDesc[i] != null)
					model.setHjsCdValDesc(hjsCdValDesc[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (hjsCdValCtnt[i] != null)
					model.setHjsCdValCtnt(hjsCdValCtnt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getInvEdiIntgCdDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return InvEdiIntgCdDtlVO[]
	 */
	public InvEdiIntgCdDtlVO[] getInvEdiIntgCdDtlVOs(){
		InvEdiIntgCdDtlVO[] vos = (InvEdiIntgCdDtlVO[])models.toArray(new InvEdiIntgCdDtlVO[models.size()]);
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
		this.dpSeq = this.dpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intgCdId = this.intgCdId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCdValCtnt = this.custCdValCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCdValDesc = this.custCdValDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsCdValDesc = this.hjsCdValDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsCdValCtnt = this.hjsCdValCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
