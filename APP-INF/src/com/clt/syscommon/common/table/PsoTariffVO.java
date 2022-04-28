/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PsoTariffVO.java
*@FileTitle : PsoTariffVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.20
*@LastModifier : 정명훈
*@LastVersion : 1.0
* 2009.10.20 정명훈 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

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
 * @author 정명훈
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PsoTariffVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PsoTariffVO> models = new ArrayList<PsoTariffVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String chgXprSeq = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String consAlsNm = null;
	/* Column Info */
	private String dpNo = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String portTrfNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String fomlSeq = null;
	/* Column Info */
	private String psoRtTpCd = null;
	/* Column Info */
	private String psoTrfTpCd = null;
	/* Column Info */
	private String fomlNo = null;
	/* Column Info */
	private String chgXprNo = null;
	/* Column Info */
	private String objListNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String rtCondSysDesc = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PsoTariffVO() {}

	public PsoTariffVO(String ibflag, String pagerows, String portTrfNo, String psoTrfTpCd, String fomlNo, String fomlSeq, String chgXprNo, String chgXprSeq, String objListNo, String currCd, String psoRtTpCd, String dpNo, String creUsrId, String creDt, String updUsrId, String updDt, String consAlsNm, String rtCondSysDesc) {
		this.updDt = updDt;
		this.chgXprSeq = chgXprSeq;
		this.currCd = currCd;
		this.consAlsNm = consAlsNm;
		this.dpNo = dpNo;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.portTrfNo = portTrfNo;
		this.creUsrId = creUsrId;
		this.fomlSeq = fomlSeq;
		this.psoRtTpCd = psoRtTpCd;
		this.psoTrfTpCd = psoTrfTpCd;
		this.fomlNo = fomlNo;
		this.chgXprNo = chgXprNo;
		this.objListNo = objListNo;
		this.updUsrId = updUsrId;
		this.rtCondSysDesc = rtCondSysDesc;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("chg_xpr_seq", getChgXprSeq());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("cons_als_nm", getConsAlsNm());
		this.hashColumns.put("dp_no", getDpNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("port_trf_no", getPortTrfNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("foml_seq", getFomlSeq());
		this.hashColumns.put("pso_rt_tp_cd", getPsoRtTpCd());
		this.hashColumns.put("pso_trf_tp_cd", getPsoTrfTpCd());
		this.hashColumns.put("foml_no", getFomlNo());
		this.hashColumns.put("chg_xpr_no", getChgXprNo());
		this.hashColumns.put("obj_list_no", getObjListNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("rt_cond_sys_desc", getRtCondSysDesc());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("chg_xpr_seq", "chgXprSeq");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("cons_als_nm", "consAlsNm");
		this.hashFields.put("dp_no", "dpNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("port_trf_no", "portTrfNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("foml_seq", "fomlSeq");
		this.hashFields.put("pso_rt_tp_cd", "psoRtTpCd");
		this.hashFields.put("pso_trf_tp_cd", "psoTrfTpCd");
		this.hashFields.put("foml_no", "fomlNo");
		this.hashFields.put("chg_xpr_no", "chgXprNo");
		this.hashFields.put("obj_list_no", "objListNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("rt_cond_sys_desc", "rtCondSysDesc");
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
	 * @return currCd
	 */
	public String getCurrCd() {
		return this.currCd;
	}
	
	/**
	 * Column Info
	 * @return consAlsNm
	 */
	public String getConsAlsNm() {
		return this.consAlsNm;
	}
	
	/**
	 * Column Info
	 * @return dpNo
	 */
	public String getDpNo() {
		return this.dpNo;
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
	 * @return portTrfNo
	 */
	public String getPortTrfNo() {
		return this.portTrfNo;
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
	 * @return fomlSeq
	 */
	public String getFomlSeq() {
		return this.fomlSeq;
	}
	
	/**
	 * Column Info
	 * @return psoRtTpCd
	 */
	public String getPsoRtTpCd() {
		return this.psoRtTpCd;
	}
	
	/**
	 * Column Info
	 * @return psoTrfTpCd
	 */
	public String getPsoTrfTpCd() {
		return this.psoTrfTpCd;
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
	 * @return chgXprNo
	 */
	public String getChgXprNo() {
		return this.chgXprNo;
	}
	
	/**
	 * Column Info
	 * @return objListNo
	 */
	public String getObjListNo() {
		return this.objListNo;
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
	 * @return rtCondSysDesc
	 */
	public String getRtCondSysDesc() {
		return this.rtCondSysDesc;
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
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	/**
	 * Column Info
	 * @param consAlsNm
	 */
	public void setConsAlsNm(String consAlsNm) {
		this.consAlsNm = consAlsNm;
	}
	
	/**
	 * Column Info
	 * @param dpNo
	 */
	public void setDpNo(String dpNo) {
		this.dpNo = dpNo;
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
	 * @param portTrfNo
	 */
	public void setPortTrfNo(String portTrfNo) {
		this.portTrfNo = portTrfNo;
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
	 * @param fomlSeq
	 */
	public void setFomlSeq(String fomlSeq) {
		this.fomlSeq = fomlSeq;
	}
	
	/**
	 * Column Info
	 * @param psoRtTpCd
	 */
	public void setPsoRtTpCd(String psoRtTpCd) {
		this.psoRtTpCd = psoRtTpCd;
	}
	
	/**
	 * Column Info
	 * @param psoTrfTpCd
	 */
	public void setPsoTrfTpCd(String psoTrfTpCd) {
		this.psoTrfTpCd = psoTrfTpCd;
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
	 * @param chgXprNo
	 */
	public void setChgXprNo(String chgXprNo) {
		this.chgXprNo = chgXprNo;
	}
	
	/**
	 * Column Info
	 * @param objListNo
	 */
	public void setObjListNo(String objListNo) {
		this.objListNo = objListNo;
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
	 * @param rtCondSysDesc
	 */
	public void setRtCondSysDesc(String rtCondSysDesc) {
		this.rtCondSysDesc = rtCondSysDesc;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setChgXprSeq(JSPUtil.getParameter(request, "chg_xpr_seq", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setConsAlsNm(JSPUtil.getParameter(request, "cons_als_nm", ""));
		setDpNo(JSPUtil.getParameter(request, "dp_no", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPortTrfNo(JSPUtil.getParameter(request, "port_trf_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setFomlSeq(JSPUtil.getParameter(request, "foml_seq", ""));
		setPsoRtTpCd(JSPUtil.getParameter(request, "pso_rt_tp_cd", ""));
		setPsoTrfTpCd(JSPUtil.getParameter(request, "pso_trf_tp_cd", ""));
		setFomlNo(JSPUtil.getParameter(request, "foml_no", ""));
		setChgXprNo(JSPUtil.getParameter(request, "chg_xpr_no", ""));
		setObjListNo(JSPUtil.getParameter(request, "obj_list_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setRtCondSysDesc(JSPUtil.getParameter(request, "rt_cond_sys_desc", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PsoTariffVO[]
	 */
	public PsoTariffVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PsoTariffVO[]
	 */
	public PsoTariffVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PsoTariffVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] chgXprSeq = (JSPUtil.getParameter(request, prefix	+ "chg_xpr_seq", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] consAlsNm = (JSPUtil.getParameter(request, prefix	+ "cons_als_nm", length));
			String[] dpNo = (JSPUtil.getParameter(request, prefix	+ "dp_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] portTrfNo = (JSPUtil.getParameter(request, prefix	+ "port_trf_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] fomlSeq = (JSPUtil.getParameter(request, prefix	+ "foml_seq", length));
			String[] psoRtTpCd = (JSPUtil.getParameter(request, prefix	+ "pso_rt_tp_cd", length));
			String[] psoTrfTpCd = (JSPUtil.getParameter(request, prefix	+ "pso_trf_tp_cd", length));
			String[] fomlNo = (JSPUtil.getParameter(request, prefix	+ "foml_no", length));
			String[] chgXprNo = (JSPUtil.getParameter(request, prefix	+ "chg_xpr_no", length));
			String[] objListNo = (JSPUtil.getParameter(request, prefix	+ "obj_list_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] rtCondSysDesc = (JSPUtil.getParameter(request, prefix	+ "rt_cond_sys_desc", length));
			
			for (int i = 0; i < length; i++) {
				model = new PsoTariffVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (chgXprSeq[i] != null)
					model.setChgXprSeq(chgXprSeq[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (consAlsNm[i] != null)
					model.setConsAlsNm(consAlsNm[i]);
				if (dpNo[i] != null)
					model.setDpNo(dpNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (portTrfNo[i] != null)
					model.setPortTrfNo(portTrfNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (fomlSeq[i] != null)
					model.setFomlSeq(fomlSeq[i]);
				if (psoRtTpCd[i] != null)
					model.setPsoRtTpCd(psoRtTpCd[i]);
				if (psoTrfTpCd[i] != null)
					model.setPsoTrfTpCd(psoTrfTpCd[i]);
				if (fomlNo[i] != null)
					model.setFomlNo(fomlNo[i]);
				if (chgXprNo[i] != null)
					model.setChgXprNo(chgXprNo[i]);
				if (objListNo[i] != null)
					model.setObjListNo(objListNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (rtCondSysDesc[i] != null)
					model.setRtCondSysDesc(rtCondSysDesc[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPsoTariffVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PsoTariffVO[]
	 */
	public PsoTariffVO[] getPsoTariffVOs(){
		PsoTariffVO[] vos = (PsoTariffVO[])models.toArray(new PsoTariffVO[models.size()]);
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
		this.chgXprSeq = this.chgXprSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.consAlsNm = this.consAlsNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dpNo = this.dpNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portTrfNo = this.portTrfNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fomlSeq = this.fomlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psoRtTpCd = this.psoRtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psoTrfTpCd = this.psoTrfTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fomlNo = this.fomlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgXprNo = this.chgXprNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.objListNo = this.objListNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtCondSysDesc = this.rtCondSysDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
