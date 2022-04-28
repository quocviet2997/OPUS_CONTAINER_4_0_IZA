/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SceCopSkdLgcVO.java
*@FileTitle : SceCopSkdLgcVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.07
*@LastModifier : 오현경
*@LastVersion : 1.0
* 2009.10.07 오현경 
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
 * @author 오현경
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SceCopSkdLgcVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SceCopSkdLgcVO> models = new ArrayList<SceCopSkdLgcVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String actCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String toEffDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String fomlPctNo = null;
	/* Column Info */
	private String copFomlCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String actFlg = null;
	/* Column Info */
	private String fmEffDt = null;
	/* Column Info */
	private String copSkdLgcNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String fomlTmHrs = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SceCopSkdLgcVO() {}

	public SceCopSkdLgcVO(String ibflag, String pagerows, String copSkdLgcNo, String actCd, String copFomlCd, String fomlTmHrs, String fomlPctNo, String fmEffDt, String toEffDt, String actFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.actCd = actCd;
		this.creDt = creDt;
		this.toEffDt = toEffDt;
		this.pagerows = pagerows;
		this.fomlPctNo = fomlPctNo;
		this.copFomlCd = copFomlCd;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.actFlg = actFlg;
		this.fmEffDt = fmEffDt;
		this.copSkdLgcNo = copSkdLgcNo;
		this.updUsrId = updUsrId;
		this.fomlTmHrs = fomlTmHrs;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("act_cd", getActCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("to_eff_dt", getToEffDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("foml_pct_no", getFomlPctNo());
		this.hashColumns.put("cop_foml_cd", getCopFomlCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("act_flg", getActFlg());
		this.hashColumns.put("fm_eff_dt", getFmEffDt());
		this.hashColumns.put("cop_skd_lgc_no", getCopSkdLgcNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("foml_tm_hrs", getFomlTmHrs());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("act_cd", "actCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("to_eff_dt", "toEffDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("foml_pct_no", "fomlPctNo");
		this.hashFields.put("cop_foml_cd", "copFomlCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("act_flg", "actFlg");
		this.hashFields.put("fm_eff_dt", "fmEffDt");
		this.hashFields.put("cop_skd_lgc_no", "copSkdLgcNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("foml_tm_hrs", "fomlTmHrs");
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
	 * @return actCd
	 */
	public String getActCd() {
		return this.actCd;
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
	 * @return toEffDt
	 */
	public String getToEffDt() {
		return this.toEffDt;
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
	 * @return fomlPctNo
	 */
	public String getFomlPctNo() {
		return this.fomlPctNo;
	}
	
	/**
	 * Column Info
	 * @return copFomlCd
	 */
	public String getCopFomlCd() {
		return this.copFomlCd;
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
	 * @return actFlg
	 */
	public String getActFlg() {
		return this.actFlg;
	}
	
	/**
	 * Column Info
	 * @return fmEffDt
	 */
	public String getFmEffDt() {
		return this.fmEffDt;
	}
	
	/**
	 * Column Info
	 * @return copSkdLgcNo
	 */
	public String getCopSkdLgcNo() {
		return this.copSkdLgcNo;
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
	 * @return fomlTmHrs
	 */
	public String getFomlTmHrs() {
		return this.fomlTmHrs;
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
	 * @param actCd
	 */
	public void setActCd(String actCd) {
		this.actCd = actCd;
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
	 * @param toEffDt
	 */
	public void setToEffDt(String toEffDt) {
		this.toEffDt = toEffDt;
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
	 * @param fomlPctNo
	 */
	public void setFomlPctNo(String fomlPctNo) {
		this.fomlPctNo = fomlPctNo;
	}
	
	/**
	 * Column Info
	 * @param copFomlCd
	 */
	public void setCopFomlCd(String copFomlCd) {
		this.copFomlCd = copFomlCd;
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
	 * @param actFlg
	 */
	public void setActFlg(String actFlg) {
		this.actFlg = actFlg;
	}
	
	/**
	 * Column Info
	 * @param fmEffDt
	 */
	public void setFmEffDt(String fmEffDt) {
		this.fmEffDt = fmEffDt;
	}
	
	/**
	 * Column Info
	 * @param copSkdLgcNo
	 */
	public void setCopSkdLgcNo(String copSkdLgcNo) {
		this.copSkdLgcNo = copSkdLgcNo;
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
	 * @param fomlTmHrs
	 */
	public void setFomlTmHrs(String fomlTmHrs) {
		this.fomlTmHrs = fomlTmHrs;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setActCd(JSPUtil.getParameter(request, "act_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setToEffDt(JSPUtil.getParameter(request, "to_eff_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setFomlPctNo(JSPUtil.getParameter(request, "foml_pct_no", ""));
		setCopFomlCd(JSPUtil.getParameter(request, "cop_foml_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setActFlg(JSPUtil.getParameter(request, "act_flg", ""));
		setFmEffDt(JSPUtil.getParameter(request, "fm_eff_dt", ""));
		setCopSkdLgcNo(JSPUtil.getParameter(request, "cop_skd_lgc_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setFomlTmHrs(JSPUtil.getParameter(request, "foml_tm_hrs", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SceCopSkdLgcVO[]
	 */
	public SceCopSkdLgcVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SceCopSkdLgcVO[]
	 */
	public SceCopSkdLgcVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SceCopSkdLgcVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] actCd = (JSPUtil.getParameter(request, prefix	+ "act_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] toEffDt = (JSPUtil.getParameter(request, prefix	+ "to_eff_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] fomlPctNo = (JSPUtil.getParameter(request, prefix	+ "foml_pct_no", length));
			String[] copFomlCd = (JSPUtil.getParameter(request, prefix	+ "cop_foml_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] actFlg = (JSPUtil.getParameter(request, prefix	+ "act_flg", length));
			String[] fmEffDt = (JSPUtil.getParameter(request, prefix	+ "fm_eff_dt", length));
			String[] copSkdLgcNo = (JSPUtil.getParameter(request, prefix	+ "cop_skd_lgc_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] fomlTmHrs = (JSPUtil.getParameter(request, prefix	+ "foml_tm_hrs", length));
			
			for (int i = 0; i < length; i++) {
				model = new SceCopSkdLgcVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (actCd[i] != null)
					model.setActCd(actCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (toEffDt[i] != null)
					model.setToEffDt(toEffDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (fomlPctNo[i] != null)
					model.setFomlPctNo(fomlPctNo[i]);
				if (copFomlCd[i] != null)
					model.setCopFomlCd(copFomlCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (actFlg[i] != null)
					model.setActFlg(actFlg[i]);
				if (fmEffDt[i] != null)
					model.setFmEffDt(fmEffDt[i]);
				if (copSkdLgcNo[i] != null)
					model.setCopSkdLgcNo(copSkdLgcNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (fomlTmHrs[i] != null)
					model.setFomlTmHrs(fomlTmHrs[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSceCopSkdLgcVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SceCopSkdLgcVO[]
	 */
	public SceCopSkdLgcVO[] getSceCopSkdLgcVOs(){
		SceCopSkdLgcVO[] vos = (SceCopSkdLgcVO[])models.toArray(new SceCopSkdLgcVO[models.size()]);
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
		this.actCd = this.actCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toEffDt = this.toEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fomlPctNo = this.fomlPctNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copFomlCd = this.copFomlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actFlg = this.actFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmEffDt = this.fmEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copSkdLgcNo = this.copSkdLgcNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fomlTmHrs = this.fomlTmHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
