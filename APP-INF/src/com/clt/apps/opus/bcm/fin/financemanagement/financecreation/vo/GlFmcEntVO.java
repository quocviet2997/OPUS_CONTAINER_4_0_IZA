/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : GlFmcEntVO.java
*@FileTitle : GlFmcEntVO
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion :
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo;

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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class GlFmcEntVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<GlFmcEntVO> models = new ArrayList<GlFmcEntVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String glMiscN2ndCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String entNm = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String glMiscN1stCd = null;
	/* Column Info */
	private String glMiscN3rdCd = null;
	/* Column Info */
	private String entAbbrNm = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public GlFmcEntVO() {}

	public GlFmcEntVO(String ibflag, String pagerows, String glMiscN1stCd, String glMiscN2ndCd, String glMiscN3rdCd, String entNm, String entAbbrNm, String deltFlg, String creDt, String updUsrId, String updDt, String eaiEvntDt, String creUsrId) {
		this.updDt = updDt;
		this.glMiscN2ndCd = glMiscN2ndCd;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.eaiEvntDt = eaiEvntDt;
		this.pagerows = pagerows;
		this.entNm = entNm;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.glMiscN1stCd = glMiscN1stCd;
		this.glMiscN3rdCd = glMiscN3rdCd;
		this.entAbbrNm = entAbbrNm;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("gl_misc_n2nd_cd", getGlMiscN2ndCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ent_nm", getEntNm());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("gl_misc_n1st_cd", getGlMiscN1stCd());
		this.hashColumns.put("gl_misc_n3rd_cd", getGlMiscN3rdCd());
		this.hashColumns.put("ent_abbr_nm", getEntAbbrNm());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("gl_misc_n2nd_cd", "glMiscN2ndCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ent_nm", "entNm");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("gl_misc_n1st_cd", "glMiscN1stCd");
		this.hashFields.put("gl_misc_n3rd_cd", "glMiscN3rdCd");
		this.hashFields.put("ent_abbr_nm", "entAbbrNm");
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
	 * @return glMiscN2ndCd
	 */
	public String getGlMiscN2ndCd() {
		return this.glMiscN2ndCd;
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
	 * @return eaiEvntDt
	 */
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
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
	 * @return entNm
	 */
	public String getEntNm() {
		return this.entNm;
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
	 * @return glMiscN1stCd
	 */
	public String getGlMiscN1stCd() {
		return this.glMiscN1stCd;
	}
	
	/**
	 * Column Info
	 * @return glMiscN3rdCd
	 */
	public String getGlMiscN3rdCd() {
		return this.glMiscN3rdCd;
	}
	
	/**
	 * Column Info
	 * @return entAbbrNm
	 */
	public String getEntAbbrNm() {
		return this.entAbbrNm;
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
	 * @param glMiscN2ndCd
	 */
	public void setGlMiscN2ndCd(String glMiscN2ndCd) {
		this.glMiscN2ndCd = glMiscN2ndCd;
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
	 * @param eaiEvntDt
	 */
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
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
	 * @param entNm
	 */
	public void setEntNm(String entNm) {
		this.entNm = entNm;
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
	 * @param glMiscN1stCd
	 */
	public void setGlMiscN1stCd(String glMiscN1stCd) {
		this.glMiscN1stCd = glMiscN1stCd;
	}
	
	/**
	 * Column Info
	 * @param glMiscN3rdCd
	 */
	public void setGlMiscN3rdCd(String glMiscN3rdCd) {
		this.glMiscN3rdCd = glMiscN3rdCd;
	}
	
	/**
	 * Column Info
	 * @param entAbbrNm
	 */
	public void setEntAbbrNm(String entAbbrNm) {
		this.entAbbrNm = entAbbrNm;
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
		setGlMiscN2ndCd(JSPUtil.getParameter(request, prefix + "gl_misc_n2nd_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, prefix + "eai_evnt_dt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setEntNm(JSPUtil.getParameter(request, prefix + "ent_nm", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setGlMiscN1stCd(JSPUtil.getParameter(request, prefix + "gl_misc_n1st_cd", ""));
		setGlMiscN3rdCd(JSPUtil.getParameter(request, prefix + "gl_misc_n3rd_cd", ""));
		setEntAbbrNm(JSPUtil.getParameter(request, prefix + "ent_abbr_nm", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return GlFmcEntVO[]
	 */
	public GlFmcEntVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return GlFmcEntVO[]
	 */
	public GlFmcEntVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		GlFmcEntVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] glMiscN2ndCd = (JSPUtil.getParameter(request, prefix	+ "gl_misc_n2nd_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] entNm = (JSPUtil.getParameter(request, prefix	+ "ent_nm", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] glMiscN1stCd = (JSPUtil.getParameter(request, prefix	+ "gl_misc_n1st_cd", length));
			String[] glMiscN3rdCd = (JSPUtil.getParameter(request, prefix	+ "gl_misc_n3rd_cd", length));
			String[] entAbbrNm = (JSPUtil.getParameter(request, prefix	+ "ent_abbr_nm", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new GlFmcEntVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (glMiscN2ndCd[i] != null)
					model.setGlMiscN2ndCd(glMiscN2ndCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (entNm[i] != null)
					model.setEntNm(entNm[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (glMiscN1stCd[i] != null)
					model.setGlMiscN1stCd(glMiscN1stCd[i]);
				if (glMiscN3rdCd[i] != null)
					model.setGlMiscN3rdCd(glMiscN3rdCd[i]);
				if (entAbbrNm[i] != null)
					model.setEntAbbrNm(entAbbrNm[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getGlFmcEntVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return GlFmcEntVO[]
	 */
	public GlFmcEntVO[] getGlFmcEntVOs(){
		GlFmcEntVO[] vos = (GlFmcEntVO[])models.toArray(new GlFmcEntVO[models.size()]);
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
		this.glMiscN2ndCd = this.glMiscN2ndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.entNm = this.entNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glMiscN1stCd = this.glMiscN1stCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glMiscN3rdCd = this.glMiscN3rdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.entAbbrNm = this.entAbbrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
