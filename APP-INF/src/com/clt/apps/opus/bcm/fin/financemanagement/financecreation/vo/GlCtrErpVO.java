/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : GlCtrErpVO.java
*@FileTitle : GlCtrErpVO
*Open Issues :
*Change history :
*@LastModifyDate : 2012.04.23
*@LastModifier : 장영석
*@LastVersion : 1.0
* 2012.04.23 장영석 
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo;

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
 * @author 장영석
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class GlCtrErpVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<GlCtrErpVO> models = new ArrayList<GlCtrErpVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String rgnCd = null;
	/* Column Info */
	private String ctrErpNo = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String ctrErpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String ctrEngNm = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String jnlSmryTrnsFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String ctrLoclNm = null;
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String bizDivCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public GlCtrErpVO() {}

	public GlCtrErpVO(String ibflag, String pagerows, String ctrErpNo, String ctrErpCd, String ctrEngNm, String currCd, String cntCd, String rgnCd, String jnlSmryTrnsFlg, String bizDivCd, String creDt, String creUsrId, String updDt, String updUsrId, String ctrLoclNm) {
		this.updDt = updDt;
		this.rgnCd = rgnCd;
		this.ctrErpNo = ctrErpNo;
		this.currCd = currCd;
		this.ctrErpCd = ctrErpCd;
		this.creDt = creDt;
		this.ctrEngNm = ctrEngNm;
		this.pagerows = pagerows;
		this.jnlSmryTrnsFlg = jnlSmryTrnsFlg;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.ctrLoclNm = ctrLoclNm;
		this.cntCd = cntCd;
		this.updUsrId = updUsrId;
		this.bizDivCd = bizDivCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rgn_cd", getRgnCd());
		this.hashColumns.put("ctr_erp_no", getCtrErpNo());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("ctr_erp_cd", getCtrErpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ctr_eng_nm", getCtrEngNm());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("jnl_smry_trns_flg", getJnlSmryTrnsFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ctr_locl_nm", getCtrLoclNm());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("biz_div_cd", getBizDivCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rgn_cd", "rgnCd");
		this.hashFields.put("ctr_erp_no", "ctrErpNo");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("ctr_erp_cd", "ctrErpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ctr_eng_nm", "ctrEngNm");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("jnl_smry_trns_flg", "jnlSmryTrnsFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ctr_locl_nm", "ctrLoclNm");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("biz_div_cd", "bizDivCd");
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
	 * @return rgnCd
	 */
	public String getRgnCd() {
		return this.rgnCd;
	}
	
	/**
	 * Column Info
	 * @return ctrErpNo
	 */
	public String getCtrErpNo() {
		return this.ctrErpNo;
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
	 * @return ctrErpCd
	 */
	public String getCtrErpCd() {
		return this.ctrErpCd;
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
	 * @return ctrEngNm
	 */
	public String getCtrEngNm() {
		return this.ctrEngNm;
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
	 * @return jnlSmryTrnsFlg
	 */
	public String getJnlSmryTrnsFlg() {
		return this.jnlSmryTrnsFlg;
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
	 * @return ctrLoclNm
	 */
	public String getCtrLoclNm() {
		return this.ctrLoclNm;
	}
	
	/**
	 * Column Info
	 * @return cntCd
	 */
	public String getCntCd() {
		return this.cntCd;
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
	 * @return bizDivCd
	 */
	public String getBizDivCd() {
		return this.bizDivCd;
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
	 * @param rgnCd
	 */
	public void setRgnCd(String rgnCd) {
		this.rgnCd = rgnCd;
	}
	
	/**
	 * Column Info
	 * @param ctrErpNo
	 */
	public void setCtrErpNo(String ctrErpNo) {
		this.ctrErpNo = ctrErpNo;
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
	 * @param ctrErpCd
	 */
	public void setCtrErpCd(String ctrErpCd) {
		this.ctrErpCd = ctrErpCd;
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
	 * @param ctrEngNm
	 */
	public void setCtrEngNm(String ctrEngNm) {
		this.ctrEngNm = ctrEngNm;
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
	 * @param jnlSmryTrnsFlg
	 */
	public void setJnlSmryTrnsFlg(String jnlSmryTrnsFlg) {
		this.jnlSmryTrnsFlg = jnlSmryTrnsFlg;
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
	 * @param ctrLoclNm
	 */
	public void setCtrLoclNm(String ctrLoclNm) {
		this.ctrLoclNm = ctrLoclNm;
	}
	
	/**
	 * Column Info
	 * @param cntCd
	 */
	public void setCntCd(String cntCd) {
		this.cntCd = cntCd;
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
	 * @param bizDivCd
	 */
	public void setBizDivCd(String bizDivCd) {
		this.bizDivCd = bizDivCd;
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
		setRgnCd(JSPUtil.getParameter(request, prefix + "rgn_cd", ""));
		setCtrErpNo(JSPUtil.getParameter(request, prefix + "ctr_erp_no", ""));
		setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
		setCtrErpCd(JSPUtil.getParameter(request, prefix + "ctr_erp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setCtrEngNm(JSPUtil.getParameter(request, prefix + "ctr_eng_nm", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setJnlSmryTrnsFlg(JSPUtil.getParameter(request, prefix + "jnl_smry_trns_flg", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setCtrLoclNm(JSPUtil.getParameter(request, prefix + "ctr_locl_nm", ""));
		setCntCd(JSPUtil.getParameter(request, prefix + "cnt_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setBizDivCd(JSPUtil.getParameter(request, prefix + "biz_div_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return GlCtrErpVO[]
	 */
	public GlCtrErpVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return GlCtrErpVO[]
	 */
	public GlCtrErpVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		GlCtrErpVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] rgnCd = (JSPUtil.getParameter(request, prefix	+ "rgn_cd", length));
			String[] ctrErpNo = (JSPUtil.getParameter(request, prefix	+ "ctr_erp_no", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] ctrErpCd = (JSPUtil.getParameter(request, prefix	+ "ctr_erp_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] ctrEngNm = (JSPUtil.getParameter(request, prefix	+ "ctr_eng_nm", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] jnlSmryTrnsFlg = (JSPUtil.getParameter(request, prefix	+ "jnl_smry_trns_flg", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ctrLoclNm = (JSPUtil.getParameter(request, prefix	+ "ctr_locl_nm", length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] bizDivCd = (JSPUtil.getParameter(request, prefix	+ "biz_div_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new GlCtrErpVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (rgnCd[i] != null)
					model.setRgnCd(rgnCd[i]);
				if (ctrErpNo[i] != null)
					model.setCtrErpNo(ctrErpNo[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (ctrErpCd[i] != null)
					model.setCtrErpCd(ctrErpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ctrEngNm[i] != null)
					model.setCtrEngNm(ctrEngNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (jnlSmryTrnsFlg[i] != null)
					model.setJnlSmryTrnsFlg(jnlSmryTrnsFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ctrLoclNm[i] != null)
					model.setCtrLoclNm(ctrLoclNm[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (bizDivCd[i] != null)
					model.setBizDivCd(bizDivCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getGlCtrErpVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return GlCtrErpVO[]
	 */
	public GlCtrErpVO[] getGlCtrErpVOs(){
		GlCtrErpVO[] vos = (GlCtrErpVO[])models.toArray(new GlCtrErpVO[models.size()]);
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
		this.rgnCd = this.rgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrErpNo = this.ctrErpNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrErpCd = this.ctrErpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrEngNm = this.ctrEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jnlSmryTrnsFlg = this.jnlSmryTrnsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrLoclNm = this.ctrLoclNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bizDivCd = this.bizDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
