/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : SarAsaMstVO.java
*@FileTitle : SarAsaMstVO
*Open Issues :
*Change history :
*@LastModifyDate : 2014.05.12
*@LastModifier : 
*@LastVersion : 1.0
* 2014.05.12  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

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

public class SarAsaMstVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SarAsaMstVO> models = new ArrayList<SarAsaMstVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String preAsaNo = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String actBalAmt = null;
	/* Column Info */
	private String asaStsCd = null;
	/* Column Info */
	private String asaPrdToDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String agnCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String asaNoCtnt1 = null;
	/* Column Info */
	private String asaNoCtnt2 = null;
	/* Column Info */
	private String asaPrdFmDt = null;
	/* Column Info */
	private String asaNoCtnt3 = null;
	/* Column Info */
	private String asaFshUsrId = null;
	/* Column Info */
	private String asaNo = null;
	/* Column Info */
	private String asaAproUsrId = null;
	/* Column Info */
	private String asaFshDt = null;
	/* Column Info */
	private String asaAproDt = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public SarAsaMstVO() {}

	public SarAsaMstVO(String ibflag, String pagerows, String asaNo, String agnCd, String asaPrdFmDt, String asaPrdToDt, String currCd, String actBalAmt, String asaFshDt, String asaFshUsrId, String asaAproUsrId, String asaAproDt, String asaNoCtnt1, String asaNoCtnt2, String asaNoCtnt3, String asaStsCd, String preAsaNo, String ofcCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.currCd = currCd;
		this.preAsaNo = preAsaNo;
		this.creDt = creDt;
		this.actBalAmt = actBalAmt;
		this.asaStsCd = asaStsCd;
		this.asaPrdToDt = asaPrdToDt;
		this.pagerows = pagerows;
		this.ofcCd = ofcCd;
		this.agnCd = agnCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.asaNoCtnt1 = asaNoCtnt1;
		this.asaNoCtnt2 = asaNoCtnt2;
		this.asaPrdFmDt = asaPrdFmDt;
		this.asaNoCtnt3 = asaNoCtnt3;
		this.asaFshUsrId = asaFshUsrId;
		this.asaNo = asaNo;
		this.asaAproUsrId = asaAproUsrId;
		this.asaFshDt = asaFshDt;
		this.asaAproDt = asaAproDt;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("pre_asa_no", getPreAsaNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("act_bal_amt", getActBalAmt());
		this.hashColumns.put("asa_sts_cd", getAsaStsCd());
		this.hashColumns.put("asa_prd_to_dt", getAsaPrdToDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("agn_cd", getAgnCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("asa_no_ctnt1", getAsaNoCtnt1());
		this.hashColumns.put("asa_no_ctnt2", getAsaNoCtnt2());
		this.hashColumns.put("asa_prd_fm_dt", getAsaPrdFmDt());
		this.hashColumns.put("asa_no_ctnt3", getAsaNoCtnt3());
		this.hashColumns.put("asa_fsh_usr_id", getAsaFshUsrId());
		this.hashColumns.put("asa_no", getAsaNo());
		this.hashColumns.put("asa_apro_usr_id", getAsaAproUsrId());
		this.hashColumns.put("asa_fsh_dt", getAsaFshDt());
		this.hashColumns.put("asa_apro_dt", getAsaAproDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("pre_asa_no", "preAsaNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("act_bal_amt", "actBalAmt");
		this.hashFields.put("asa_sts_cd", "asaStsCd");
		this.hashFields.put("asa_prd_to_dt", "asaPrdToDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("agn_cd", "agnCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("asa_no_ctnt1", "asaNoCtnt1");
		this.hashFields.put("asa_no_ctnt2", "asaNoCtnt2");
		this.hashFields.put("asa_prd_fm_dt", "asaPrdFmDt");
		this.hashFields.put("asa_no_ctnt3", "asaNoCtnt3");
		this.hashFields.put("asa_fsh_usr_id", "asaFshUsrId");
		this.hashFields.put("asa_no", "asaNo");
		this.hashFields.put("asa_apro_usr_id", "asaAproUsrId");
		this.hashFields.put("asa_fsh_dt", "asaFshDt");
		this.hashFields.put("asa_apro_dt", "asaAproDt");
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
	 * @return currCd
	 */
	public String getCurrCd() {
		return this.currCd;
	}
	
	/**
	 * Column Info
	 * @return preAsaNo
	 */
	public String getPreAsaNo() {
		return this.preAsaNo;
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
	 * @return actBalAmt
	 */
	public String getActBalAmt() {
		return this.actBalAmt;
	}
	
	/**
	 * Column Info
	 * @return asaStsCd
	 */
	public String getAsaStsCd() {
		return this.asaStsCd;
	}
	
	/**
	 * Column Info
	 * @return asaPrdToDt
	 */
	public String getAsaPrdToDt() {
		return this.asaPrdToDt;
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
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
	}
	
	/**
	 * Column Info
	 * @return agnCd
	 */
	public String getAgnCd() {
		return this.agnCd;
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
	 * @return asaNoCtnt1
	 */
	public String getAsaNoCtnt1() {
		return this.asaNoCtnt1;
	}
	
	/**
	 * Column Info
	 * @return asaNoCtnt2
	 */
	public String getAsaNoCtnt2() {
		return this.asaNoCtnt2;
	}
	
	/**
	 * Column Info
	 * @return asaPrdFmDt
	 */
	public String getAsaPrdFmDt() {
		return this.asaPrdFmDt;
	}
	
	/**
	 * Column Info
	 * @return asaNoCtnt3
	 */
	public String getAsaNoCtnt3() {
		return this.asaNoCtnt3;
	}
	
	/**
	 * Column Info
	 * @return asaFshUsrId
	 */
	public String getAsaFshUsrId() {
		return this.asaFshUsrId;
	}
	
	/**
	 * Column Info
	 * @return asaNo
	 */
	public String getAsaNo() {
		return this.asaNo;
	}
	
	/**
	 * Column Info
	 * @return asaAproUsrId
	 */
	public String getAsaAproUsrId() {
		return this.asaAproUsrId;
	}
	
	/**
	 * Column Info
	 * @return asaFshDt
	 */
	public String getAsaFshDt() {
		return this.asaFshDt;
	}
	
	/**
	 * Column Info
	 * @return asaAproDt
	 */
	public String getAsaAproDt() {
		return this.asaAproDt;
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
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	/**
	 * Column Info
	 * @param preAsaNo
	 */
	public void setPreAsaNo(String preAsaNo) {
		this.preAsaNo = preAsaNo;
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
	 * @param actBalAmt
	 */
	public void setActBalAmt(String actBalAmt) {
		this.actBalAmt = actBalAmt;
	}
	
	/**
	 * Column Info
	 * @param asaStsCd
	 */
	public void setAsaStsCd(String asaStsCd) {
		this.asaStsCd = asaStsCd;
	}
	
	/**
	 * Column Info
	 * @param asaPrdToDt
	 */
	public void setAsaPrdToDt(String asaPrdToDt) {
		this.asaPrdToDt = asaPrdToDt;
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
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
	}
	
	/**
	 * Column Info
	 * @param agnCd
	 */
	public void setAgnCd(String agnCd) {
		this.agnCd = agnCd;
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
	 * @param asaNoCtnt1
	 */
	public void setAsaNoCtnt1(String asaNoCtnt1) {
		this.asaNoCtnt1 = asaNoCtnt1;
	}
	
	/**
	 * Column Info
	 * @param asaNoCtnt2
	 */
	public void setAsaNoCtnt2(String asaNoCtnt2) {
		this.asaNoCtnt2 = asaNoCtnt2;
	}
	
	/**
	 * Column Info
	 * @param asaPrdFmDt
	 */
	public void setAsaPrdFmDt(String asaPrdFmDt) {
		this.asaPrdFmDt = asaPrdFmDt;
	}
	
	/**
	 * Column Info
	 * @param asaNoCtnt3
	 */
	public void setAsaNoCtnt3(String asaNoCtnt3) {
		this.asaNoCtnt3 = asaNoCtnt3;
	}
	
	/**
	 * Column Info
	 * @param asaFshUsrId
	 */
	public void setAsaFshUsrId(String asaFshUsrId) {
		this.asaFshUsrId = asaFshUsrId;
	}
	
	/**
	 * Column Info
	 * @param asaNo
	 */
	public void setAsaNo(String asaNo) {
		this.asaNo = asaNo;
	}
	
	/**
	 * Column Info
	 * @param asaAproUsrId
	 */
	public void setAsaAproUsrId(String asaAproUsrId) {
		this.asaAproUsrId = asaAproUsrId;
	}
	
	/**
	 * Column Info
	 * @param asaFshDt
	 */
	public void setAsaFshDt(String asaFshDt) {
		this.asaFshDt = asaFshDt;
	}
	
	/**
	 * Column Info
	 * @param asaAproDt
	 */
	public void setAsaAproDt(String asaAproDt) {
		this.asaAproDt = asaAproDt;
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
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
		setPreAsaNo(JSPUtil.getParameter(request, prefix + "pre_asa_no", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setActBalAmt(JSPUtil.getParameter(request, prefix + "act_bal_amt", ""));
		setAsaStsCd(JSPUtil.getParameter(request, prefix + "asa_sts_cd", ""));
		setAsaPrdToDt(JSPUtil.getParameter(request, prefix + "asa_prd_to_dt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
		setAgnCd(JSPUtil.getParameter(request, prefix + "agn_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setAsaNoCtnt1(JSPUtil.getParameter(request, prefix + "asa_no_ctnt1", ""));
		setAsaNoCtnt2(JSPUtil.getParameter(request, prefix + "asa_no_ctnt2", ""));
		setAsaPrdFmDt(JSPUtil.getParameter(request, prefix + "asa_prd_fm_dt", ""));
		setAsaNoCtnt3(JSPUtil.getParameter(request, prefix + "asa_no_ctnt3", ""));
		setAsaFshUsrId(JSPUtil.getParameter(request, prefix + "asa_fsh_usr_id", ""));
		setAsaNo(JSPUtil.getParameter(request, prefix + "asa_no", ""));
		setAsaAproUsrId(JSPUtil.getParameter(request, prefix + "asa_apro_usr_id", ""));
		setAsaFshDt(JSPUtil.getParameter(request, prefix + "asa_fsh_dt", ""));
		setAsaAproDt(JSPUtil.getParameter(request, prefix + "asa_apro_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SarAsaMstVO[]
	 */
	public SarAsaMstVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SarAsaMstVO[]
	 */
	public SarAsaMstVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SarAsaMstVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] preAsaNo = (JSPUtil.getParameter(request, prefix	+ "pre_asa_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] actBalAmt = (JSPUtil.getParameter(request, prefix	+ "act_bal_amt", length));
			String[] asaStsCd = (JSPUtil.getParameter(request, prefix	+ "asa_sts_cd", length));
			String[] asaPrdToDt = (JSPUtil.getParameter(request, prefix	+ "asa_prd_to_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] agnCd = (JSPUtil.getParameter(request, prefix	+ "agn_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] asaNoCtnt1 = (JSPUtil.getParameter(request, prefix	+ "asa_no_ctnt1", length));
			String[] asaNoCtnt2 = (JSPUtil.getParameter(request, prefix	+ "asa_no_ctnt2", length));
			String[] asaPrdFmDt = (JSPUtil.getParameter(request, prefix	+ "asa_prd_fm_dt", length));
			String[] asaNoCtnt3 = (JSPUtil.getParameter(request, prefix	+ "asa_no_ctnt3", length));
			String[] asaFshUsrId = (JSPUtil.getParameter(request, prefix	+ "asa_fsh_usr_id", length));
			String[] asaNo = (JSPUtil.getParameter(request, prefix	+ "asa_no", length));
			String[] asaAproUsrId = (JSPUtil.getParameter(request, prefix	+ "asa_apro_usr_id", length));
			String[] asaFshDt = (JSPUtil.getParameter(request, prefix	+ "asa_fsh_dt", length));
			String[] asaAproDt = (JSPUtil.getParameter(request, prefix	+ "asa_apro_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new SarAsaMstVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (preAsaNo[i] != null)
					model.setPreAsaNo(preAsaNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (actBalAmt[i] != null)
					model.setActBalAmt(actBalAmt[i]);
				if (asaStsCd[i] != null)
					model.setAsaStsCd(asaStsCd[i]);
				if (asaPrdToDt[i] != null)
					model.setAsaPrdToDt(asaPrdToDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (agnCd[i] != null)
					model.setAgnCd(agnCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (asaNoCtnt1[i] != null)
					model.setAsaNoCtnt1(asaNoCtnt1[i]);
				if (asaNoCtnt2[i] != null)
					model.setAsaNoCtnt2(asaNoCtnt2[i]);
				if (asaPrdFmDt[i] != null)
					model.setAsaPrdFmDt(asaPrdFmDt[i]);
				if (asaNoCtnt3[i] != null)
					model.setAsaNoCtnt3(asaNoCtnt3[i]);
				if (asaFshUsrId[i] != null)
					model.setAsaFshUsrId(asaFshUsrId[i]);
				if (asaNo[i] != null)
					model.setAsaNo(asaNo[i]);
				if (asaAproUsrId[i] != null)
					model.setAsaAproUsrId(asaAproUsrId[i]);
				if (asaFshDt[i] != null)
					model.setAsaFshDt(asaFshDt[i]);
				if (asaAproDt[i] != null)
					model.setAsaAproDt(asaAproDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSarAsaMstVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SarAsaMstVO[]
	 */
	public SarAsaMstVO[] getSarAsaMstVOs(){
		SarAsaMstVO[] vos = (SarAsaMstVO[])models.toArray(new SarAsaMstVO[models.size()]);
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
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preAsaNo = this.preAsaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actBalAmt = this.actBalAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaStsCd = this.asaStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaPrdToDt = this.asaPrdToDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnCd = this.agnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaNoCtnt1 = this.asaNoCtnt1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaNoCtnt2 = this.asaNoCtnt2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaPrdFmDt = this.asaPrdFmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaNoCtnt3 = this.asaNoCtnt3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaFshUsrId = this.asaFshUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaNo = this.asaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaAproUsrId = this.asaAproUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaFshDt = this.asaFshDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaAproDt = this.asaAproDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
