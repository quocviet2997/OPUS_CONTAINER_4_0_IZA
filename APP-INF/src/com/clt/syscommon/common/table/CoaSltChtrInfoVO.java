/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : CoaSltChtrInfoVO.java
*@FileTitle : CoaSltChtrInfoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2015.06.19
*@LastModifier : 
*@LastVersion : 1.0
* 2015.06.19  
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

public class CoaSltChtrInfoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaSltChtrInfoVO> models = new ArrayList<CoaSltChtrInfoVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String expnSubChtrCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String vopCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creSlctFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String incmCrsChtrCd = null;
	/* Column Info */
	private String expnBzcChtrCd = null;
	/* Column Info */
	private String expnCrsChtrCd = null;
	/* Column Info */
	private String incmSubLseCd = null;
	/* Column Info */
	private String sltTpCd = null;
	/* Column Info */
	private String opCreStsCd = null;
	/* Column Info */
	private String incmBzcChtrCd = null;
	/* Column Info */
	private String sltTpNm = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String stndCostCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public CoaSltChtrInfoVO() {}

	public CoaSltChtrInfoVO(String ibflag, String pagerows, String expnSubChtrCd, String vopCd, String creSlctFlg, String incmCrsChtrCd, String expnBzcChtrCd, String expnCrsChtrCd, String incmSubLseCd, String sltTpCd, String opCreStsCd, String incmBzcChtrCd, String sltTpNm, String stndCostCd, String updUsrId, String creUsrId, String updDt, String creDt) {
		this.updDt = updDt;
		this.expnSubChtrCd = expnSubChtrCd;
		this.creDt = creDt;
		this.vopCd = vopCd;
		this.pagerows = pagerows;
		this.creSlctFlg = creSlctFlg;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.incmCrsChtrCd = incmCrsChtrCd;
		this.expnBzcChtrCd = expnBzcChtrCd;
		this.expnCrsChtrCd = expnCrsChtrCd;
		this.incmSubLseCd = incmSubLseCd;
		this.sltTpCd = sltTpCd;
		this.opCreStsCd = opCreStsCd;
		this.incmBzcChtrCd = incmBzcChtrCd;
		this.sltTpNm = sltTpNm;
		this.updUsrId = updUsrId;
		this.stndCostCd = stndCostCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("expn_sub_chtr_cd", getExpnSubChtrCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("vop_cd", getVopCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_slct_flg", getCreSlctFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("incm_crs_chtr_cd", getIncmCrsChtrCd());
		this.hashColumns.put("expn_bzc_chtr_cd", getExpnBzcChtrCd());
		this.hashColumns.put("expn_crs_chtr_cd", getExpnCrsChtrCd());
		this.hashColumns.put("incm_sub_lse_cd", getIncmSubLseCd());
		this.hashColumns.put("slt_tp_cd", getSltTpCd());
		this.hashColumns.put("op_cre_sts_cd", getOpCreStsCd());
		this.hashColumns.put("incm_bzc_chtr_cd", getIncmBzcChtrCd());
		this.hashColumns.put("slt_tp_nm", getSltTpNm());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("stnd_cost_cd", getStndCostCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("expn_sub_chtr_cd", "expnSubChtrCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("vop_cd", "vopCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_slct_flg", "creSlctFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("incm_crs_chtr_cd", "incmCrsChtrCd");
		this.hashFields.put("expn_bzc_chtr_cd", "expnBzcChtrCd");
		this.hashFields.put("expn_crs_chtr_cd", "expnCrsChtrCd");
		this.hashFields.put("incm_sub_lse_cd", "incmSubLseCd");
		this.hashFields.put("slt_tp_cd", "sltTpCd");
		this.hashFields.put("op_cre_sts_cd", "opCreStsCd");
		this.hashFields.put("incm_bzc_chtr_cd", "incmBzcChtrCd");
		this.hashFields.put("slt_tp_nm", "sltTpNm");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("stnd_cost_cd", "stndCostCd");
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
	 * @return expnSubChtrCd
	 */
	public String getExpnSubChtrCd() {
		return this.expnSubChtrCd;
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
	 * @return vopCd
	 */
	public String getVopCd() {
		return this.vopCd;
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
	 * @return creSlctFlg
	 */
	public String getCreSlctFlg() {
		return this.creSlctFlg;
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
	 * @return incmCrsChtrCd
	 */
	public String getIncmCrsChtrCd() {
		return this.incmCrsChtrCd;
	}
	
	/**
	 * Column Info
	 * @return expnBzcChtrCd
	 */
	public String getExpnBzcChtrCd() {
		return this.expnBzcChtrCd;
	}
	
	/**
	 * Column Info
	 * @return expnCrsChtrCd
	 */
	public String getExpnCrsChtrCd() {
		return this.expnCrsChtrCd;
	}
	
	/**
	 * Column Info
	 * @return incmSubLseCd
	 */
	public String getIncmSubLseCd() {
		return this.incmSubLseCd;
	}
	
	/**
	 * Column Info
	 * @return sltTpCd
	 */
	public String getSltTpCd() {
		return this.sltTpCd;
	}
	
	/**
	 * Column Info
	 * @return opCreStsCd
	 */
	public String getOpCreStsCd() {
		return this.opCreStsCd;
	}
	
	/**
	 * Column Info
	 * @return incmBzcChtrCd
	 */
	public String getIncmBzcChtrCd() {
		return this.incmBzcChtrCd;
	}
	
	/**
	 * Column Info
	 * @return sltTpNm
	 */
	public String getSltTpNm() {
		return this.sltTpNm;
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
	 * @return stndCostCd
	 */
	public String getStndCostCd() {
		return this.stndCostCd;
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
	 * @param expnSubChtrCd
	 */
	public void setExpnSubChtrCd(String expnSubChtrCd) {
		this.expnSubChtrCd = expnSubChtrCd;
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
	 * @param vopCd
	 */
	public void setVopCd(String vopCd) {
		this.vopCd = vopCd;
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
	 * @param creSlctFlg
	 */
	public void setCreSlctFlg(String creSlctFlg) {
		this.creSlctFlg = creSlctFlg;
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
	 * @param incmCrsChtrCd
	 */
	public void setIncmCrsChtrCd(String incmCrsChtrCd) {
		this.incmCrsChtrCd = incmCrsChtrCd;
	}
	
	/**
	 * Column Info
	 * @param expnBzcChtrCd
	 */
	public void setExpnBzcChtrCd(String expnBzcChtrCd) {
		this.expnBzcChtrCd = expnBzcChtrCd;
	}
	
	/**
	 * Column Info
	 * @param expnCrsChtrCd
	 */
	public void setExpnCrsChtrCd(String expnCrsChtrCd) {
		this.expnCrsChtrCd = expnCrsChtrCd;
	}
	
	/**
	 * Column Info
	 * @param incmSubLseCd
	 */
	public void setIncmSubLseCd(String incmSubLseCd) {
		this.incmSubLseCd = incmSubLseCd;
	}
	
	/**
	 * Column Info
	 * @param sltTpCd
	 */
	public void setSltTpCd(String sltTpCd) {
		this.sltTpCd = sltTpCd;
	}
	
	/**
	 * Column Info
	 * @param opCreStsCd
	 */
	public void setOpCreStsCd(String opCreStsCd) {
		this.opCreStsCd = opCreStsCd;
	}
	
	/**
	 * Column Info
	 * @param incmBzcChtrCd
	 */
	public void setIncmBzcChtrCd(String incmBzcChtrCd) {
		this.incmBzcChtrCd = incmBzcChtrCd;
	}
	
	/**
	 * Column Info
	 * @param sltTpNm
	 */
	public void setSltTpNm(String sltTpNm) {
		this.sltTpNm = sltTpNm;
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
	 * @param stndCostCd
	 */
	public void setStndCostCd(String stndCostCd) {
		this.stndCostCd = stndCostCd;
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
		setExpnSubChtrCd(JSPUtil.getParameter(request, prefix + "expn_sub_chtr_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setVopCd(JSPUtil.getParameter(request, prefix + "vop_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setCreSlctFlg(JSPUtil.getParameter(request, prefix + "cre_slct_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setIncmCrsChtrCd(JSPUtil.getParameter(request, prefix + "incm_crs_chtr_cd", ""));
		setExpnBzcChtrCd(JSPUtil.getParameter(request, prefix + "expn_bzc_chtr_cd", ""));
		setExpnCrsChtrCd(JSPUtil.getParameter(request, prefix + "expn_crs_chtr_cd", ""));
		setIncmSubLseCd(JSPUtil.getParameter(request, prefix + "incm_sub_lse_cd", ""));
		setSltTpCd(JSPUtil.getParameter(request, prefix + "slt_tp_cd", ""));
		setOpCreStsCd(JSPUtil.getParameter(request, prefix + "op_cre_sts_cd", ""));
		setIncmBzcChtrCd(JSPUtil.getParameter(request, prefix + "incm_bzc_chtr_cd", ""));
		setSltTpNm(JSPUtil.getParameter(request, prefix + "slt_tp_nm", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setStndCostCd(JSPUtil.getParameter(request, prefix + "stnd_cost_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaSltChtrInfoVO[]
	 */
	public CoaSltChtrInfoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaSltChtrInfoVO[]
	 */
	public CoaSltChtrInfoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaSltChtrInfoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] expnSubChtrCd = (JSPUtil.getParameter(request, prefix	+ "expn_sub_chtr_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] vopCd = (JSPUtil.getParameter(request, prefix	+ "vop_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creSlctFlg = (JSPUtil.getParameter(request, prefix	+ "cre_slct_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] incmCrsChtrCd = (JSPUtil.getParameter(request, prefix	+ "incm_crs_chtr_cd", length));
			String[] expnBzcChtrCd = (JSPUtil.getParameter(request, prefix	+ "expn_bzc_chtr_cd", length));
			String[] expnCrsChtrCd = (JSPUtil.getParameter(request, prefix	+ "expn_crs_chtr_cd", length));
			String[] incmSubLseCd = (JSPUtil.getParameter(request, prefix	+ "incm_sub_lse_cd", length));
			String[] sltTpCd = (JSPUtil.getParameter(request, prefix	+ "slt_tp_cd", length));
			String[] opCreStsCd = (JSPUtil.getParameter(request, prefix	+ "op_cre_sts_cd", length));
			String[] incmBzcChtrCd = (JSPUtil.getParameter(request, prefix	+ "incm_bzc_chtr_cd", length));
			String[] sltTpNm = (JSPUtil.getParameter(request, prefix	+ "slt_tp_nm", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] stndCostCd = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaSltChtrInfoVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (expnSubChtrCd[i] != null)
					model.setExpnSubChtrCd(expnSubChtrCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (vopCd[i] != null)
					model.setVopCd(vopCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creSlctFlg[i] != null)
					model.setCreSlctFlg(creSlctFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (incmCrsChtrCd[i] != null)
					model.setIncmCrsChtrCd(incmCrsChtrCd[i]);
				if (expnBzcChtrCd[i] != null)
					model.setExpnBzcChtrCd(expnBzcChtrCd[i]);
				if (expnCrsChtrCd[i] != null)
					model.setExpnCrsChtrCd(expnCrsChtrCd[i]);
				if (incmSubLseCd[i] != null)
					model.setIncmSubLseCd(incmSubLseCd[i]);
				if (sltTpCd[i] != null)
					model.setSltTpCd(sltTpCd[i]);
				if (opCreStsCd[i] != null)
					model.setOpCreStsCd(opCreStsCd[i]);
				if (incmBzcChtrCd[i] != null)
					model.setIncmBzcChtrCd(incmBzcChtrCd[i]);
				if (sltTpNm[i] != null)
					model.setSltTpNm(sltTpNm[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (stndCostCd[i] != null)
					model.setStndCostCd(stndCostCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaSltChtrInfoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaSltChtrInfoVO[]
	 */
	public CoaSltChtrInfoVO[] getCoaSltChtrInfoVOs(){
		CoaSltChtrInfoVO[] vos = (CoaSltChtrInfoVO[])models.toArray(new CoaSltChtrInfoVO[models.size()]);
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
		this.expnSubChtrCd = this.expnSubChtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vopCd = this.vopCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creSlctFlg = this.creSlctFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.incmCrsChtrCd = this.incmCrsChtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expnBzcChtrCd = this.expnBzcChtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expnCrsChtrCd = this.expnCrsChtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.incmSubLseCd = this.incmSubLseCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sltTpCd = this.sltTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opCreStsCd = this.opCreStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.incmBzcChtrCd = this.incmBzcChtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sltTpNm = this.sltTpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostCd = this.stndCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
