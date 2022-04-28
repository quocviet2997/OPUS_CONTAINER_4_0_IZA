/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : BkgPkupCntrRtnYdVO.java
*@FileTitle : BkgPkupCntrRtnYdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.02.17
*@LastModifier : 박만건
*@LastVersion : 1.0
* 2010.02.17 박만건 
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
 * @author 박만건
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgPkupCntrRtnYdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgPkupCntrRtnYdVO> models = new ArrayList<BkgPkupCntrRtnYdVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String rtnYdSeq = null;
	/* Column Info */
	private String mcntrRtnYdCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String fnlDestCd = null;
	/* Column Info */
	private String rtnYdSavOfcCd = null;
	/* Column Info */
	private String pkupCntrTpId = null;
	/* Column Info */
	private String deltDt = null;
	/* Column Info */
	private String rtnYdSavUsrId = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String railDestCd = null;
	/* Column Info */
	private String pkupYdId = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String rtnYdSavDt = null;
	/* Column Info */
	private String deltUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgPkupCntrRtnYdVO() {}

	public BkgPkupCntrRtnYdVO(String ibflag, String pagerows, String rtnYdSeq, String podCd, String railDestCd, String fnlDestCd, String mcntrRtnYdCd, String rtnYdSavOfcCd, String rtnYdSavUsrId, String rtnYdSavDt, String deltFlg, String deltUsrId, String deltDt, String creUsrId, String creDt, String updUsrId, String updDt, String pkupYdId, String pkupCntrTpId) {
		this.updDt = updDt;
		this.rtnYdSeq = rtnYdSeq;
		this.mcntrRtnYdCd = mcntrRtnYdCd;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.fnlDestCd = fnlDestCd;
		this.rtnYdSavOfcCd = rtnYdSavOfcCd;
		this.pkupCntrTpId = pkupCntrTpId;
		this.deltDt = deltDt;
		this.rtnYdSavUsrId = rtnYdSavUsrId;
		this.pagerows = pagerows;
		this.podCd = podCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.railDestCd = railDestCd;
		this.pkupYdId = pkupYdId;
		this.updUsrId = updUsrId;
		this.rtnYdSavDt = rtnYdSavDt;
		this.deltUsrId = deltUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rtn_yd_seq", getRtnYdSeq());
		this.hashColumns.put("mcntr_rtn_yd_cd", getMcntrRtnYdCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("fnl_dest_cd", getFnlDestCd());
		this.hashColumns.put("rtn_yd_sav_ofc_cd", getRtnYdSavOfcCd());
		this.hashColumns.put("pkup_cntr_tp_id", getPkupCntrTpId());
		this.hashColumns.put("delt_dt", getDeltDt());
		this.hashColumns.put("rtn_yd_sav_usr_id", getRtnYdSavUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rail_dest_cd", getRailDestCd());
		this.hashColumns.put("pkup_yd_id", getPkupYdId());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("rtn_yd_sav_dt", getRtnYdSavDt());
		this.hashColumns.put("delt_usr_id", getDeltUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rtn_yd_seq", "rtnYdSeq");
		this.hashFields.put("mcntr_rtn_yd_cd", "mcntrRtnYdCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("fnl_dest_cd", "fnlDestCd");
		this.hashFields.put("rtn_yd_sav_ofc_cd", "rtnYdSavOfcCd");
		this.hashFields.put("pkup_cntr_tp_id", "pkupCntrTpId");
		this.hashFields.put("delt_dt", "deltDt");
		this.hashFields.put("rtn_yd_sav_usr_id", "rtnYdSavUsrId");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rail_dest_cd", "railDestCd");
		this.hashFields.put("pkup_yd_id", "pkupYdId");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("rtn_yd_sav_dt", "rtnYdSavDt");
		this.hashFields.put("delt_usr_id", "deltUsrId");
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
	 * @return rtnYdSeq
	 */
	public String getRtnYdSeq() {
		return this.rtnYdSeq;
	}
	
	/**
	 * Column Info
	 * @return mcntrRtnYdCd
	 */
	public String getMcntrRtnYdCd() {
		return this.mcntrRtnYdCd;
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
	 * @return fnlDestCd
	 */
	public String getFnlDestCd() {
		return this.fnlDestCd;
	}
	
	/**
	 * Column Info
	 * @return rtnYdSavOfcCd
	 */
	public String getRtnYdSavOfcCd() {
		return this.rtnYdSavOfcCd;
	}
	
	/**
	 * Column Info
	 * @return pkupCntrTpId
	 */
	public String getPkupCntrTpId() {
		return this.pkupCntrTpId;
	}
	
	/**
	 * Column Info
	 * @return deltDt
	 */
	public String getDeltDt() {
		return this.deltDt;
	}
	
	/**
	 * Column Info
	 * @return rtnYdSavUsrId
	 */
	public String getRtnYdSavUsrId() {
		return this.rtnYdSavUsrId;
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
	 * @return podCd
	 */
	public String getPodCd() {
		return this.podCd;
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
	 * @return railDestCd
	 */
	public String getRailDestCd() {
		return this.railDestCd;
	}
	
	/**
	 * Column Info
	 * @return pkupYdId
	 */
	public String getPkupYdId() {
		return this.pkupYdId;
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
	 * @return rtnYdSavDt
	 */
	public String getRtnYdSavDt() {
		return this.rtnYdSavDt;
	}
	
	/**
	 * Column Info
	 * @return deltUsrId
	 */
	public String getDeltUsrId() {
		return this.deltUsrId;
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
	 * @param rtnYdSeq
	 */
	public void setRtnYdSeq(String rtnYdSeq) {
		this.rtnYdSeq = rtnYdSeq;
	}
	
	/**
	 * Column Info
	 * @param mcntrRtnYdCd
	 */
	public void setMcntrRtnYdCd(String mcntrRtnYdCd) {
		this.mcntrRtnYdCd = mcntrRtnYdCd;
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
	 * @param fnlDestCd
	 */
	public void setFnlDestCd(String fnlDestCd) {
		this.fnlDestCd = fnlDestCd;
	}
	
	/**
	 * Column Info
	 * @param rtnYdSavOfcCd
	 */
	public void setRtnYdSavOfcCd(String rtnYdSavOfcCd) {
		this.rtnYdSavOfcCd = rtnYdSavOfcCd;
	}
	
	/**
	 * Column Info
	 * @param pkupCntrTpId
	 */
	public void setPkupCntrTpId(String pkupCntrTpId) {
		this.pkupCntrTpId = pkupCntrTpId;
	}
	
	/**
	 * Column Info
	 * @param deltDt
	 */
	public void setDeltDt(String deltDt) {
		this.deltDt = deltDt;
	}
	
	/**
	 * Column Info
	 * @param rtnYdSavUsrId
	 */
	public void setRtnYdSavUsrId(String rtnYdSavUsrId) {
		this.rtnYdSavUsrId = rtnYdSavUsrId;
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
	 * @param podCd
	 */
	public void setPodCd(String podCd) {
		this.podCd = podCd;
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
	 * @param railDestCd
	 */
	public void setRailDestCd(String railDestCd) {
		this.railDestCd = railDestCd;
	}
	
	/**
	 * Column Info
	 * @param pkupYdId
	 */
	public void setPkupYdId(String pkupYdId) {
		this.pkupYdId = pkupYdId;
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
	 * @param rtnYdSavDt
	 */
	public void setRtnYdSavDt(String rtnYdSavDt) {
		this.rtnYdSavDt = rtnYdSavDt;
	}
	
	/**
	 * Column Info
	 * @param deltUsrId
	 */
	public void setDeltUsrId(String deltUsrId) {
		this.deltUsrId = deltUsrId;
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
		setRtnYdSeq(JSPUtil.getParameter(request, prefix + "rtn_yd_seq", ""));
		setMcntrRtnYdCd(JSPUtil.getParameter(request, prefix + "mcntr_rtn_yd_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setFnlDestCd(JSPUtil.getParameter(request, prefix + "fnl_dest_cd", ""));
		setRtnYdSavOfcCd(JSPUtil.getParameter(request, prefix + "rtn_yd_sav_ofc_cd", ""));
		setPkupCntrTpId(JSPUtil.getParameter(request, prefix + "pkup_cntr_tp_id", ""));
		setDeltDt(JSPUtil.getParameter(request, prefix + "delt_dt", ""));
		setRtnYdSavUsrId(JSPUtil.getParameter(request, prefix + "rtn_yd_sav_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setPodCd(JSPUtil.getParameter(request, prefix + "pod_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setRailDestCd(JSPUtil.getParameter(request, prefix + "rail_dest_cd", ""));
		setPkupYdId(JSPUtil.getParameter(request, prefix + "pkup_yd_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setRtnYdSavDt(JSPUtil.getParameter(request, prefix + "rtn_yd_sav_dt", ""));
		setDeltUsrId(JSPUtil.getParameter(request, prefix + "delt_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgPkupCntrRtnYdVO[]
	 */
	public BkgPkupCntrRtnYdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgPkupCntrRtnYdVO[]
	 */
	public BkgPkupCntrRtnYdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgPkupCntrRtnYdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] rtnYdSeq = (JSPUtil.getParameter(request, prefix	+ "rtn_yd_seq", length));
			String[] mcntrRtnYdCd = (JSPUtil.getParameter(request, prefix	+ "mcntr_rtn_yd_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] fnlDestCd = (JSPUtil.getParameter(request, prefix	+ "fnl_dest_cd", length));
			String[] rtnYdSavOfcCd = (JSPUtil.getParameter(request, prefix	+ "rtn_yd_sav_ofc_cd", length));
			String[] pkupCntrTpId = (JSPUtil.getParameter(request, prefix	+ "pkup_cntr_tp_id", length));
			String[] deltDt = (JSPUtil.getParameter(request, prefix	+ "delt_dt", length));
			String[] rtnYdSavUsrId = (JSPUtil.getParameter(request, prefix	+ "rtn_yd_sav_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] railDestCd = (JSPUtil.getParameter(request, prefix	+ "rail_dest_cd", length));
			String[] pkupYdId = (JSPUtil.getParameter(request, prefix	+ "pkup_yd_id", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] rtnYdSavDt = (JSPUtil.getParameter(request, prefix	+ "rtn_yd_sav_dt", length));
			String[] deltUsrId = (JSPUtil.getParameter(request, prefix	+ "delt_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgPkupCntrRtnYdVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (rtnYdSeq[i] != null)
					model.setRtnYdSeq(rtnYdSeq[i]);
				if (mcntrRtnYdCd[i] != null)
					model.setMcntrRtnYdCd(mcntrRtnYdCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (fnlDestCd[i] != null)
					model.setFnlDestCd(fnlDestCd[i]);
				if (rtnYdSavOfcCd[i] != null)
					model.setRtnYdSavOfcCd(rtnYdSavOfcCd[i]);
				if (pkupCntrTpId[i] != null)
					model.setPkupCntrTpId(pkupCntrTpId[i]);
				if (deltDt[i] != null)
					model.setDeltDt(deltDt[i]);
				if (rtnYdSavUsrId[i] != null)
					model.setRtnYdSavUsrId(rtnYdSavUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (railDestCd[i] != null)
					model.setRailDestCd(railDestCd[i]);
				if (pkupYdId[i] != null)
					model.setPkupYdId(pkupYdId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (rtnYdSavDt[i] != null)
					model.setRtnYdSavDt(rtnYdSavDt[i]);
				if (deltUsrId[i] != null)
					model.setDeltUsrId(deltUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgPkupCntrRtnYdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgPkupCntrRtnYdVO[]
	 */
	public BkgPkupCntrRtnYdVO[] getBkgPkupCntrRtnYdVOs(){
		BkgPkupCntrRtnYdVO[] vos = (BkgPkupCntrRtnYdVO[])models.toArray(new BkgPkupCntrRtnYdVO[models.size()]);
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
		this.rtnYdSeq = this.rtnYdSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mcntrRtnYdCd = this.mcntrRtnYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fnlDestCd = this.fnlDestCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtnYdSavOfcCd = this.rtnYdSavOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupCntrTpId = this.pkupCntrTpId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltDt = this.deltDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtnYdSavUsrId = this.rtnYdSavUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railDestCd = this.railDestCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupYdId = this.pkupYdId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtnYdSavDt = this.rtnYdSavDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltUsrId = this.deltUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
