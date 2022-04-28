/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : LseIntRtHisVO.java
*@FileTitle : LseIntRtHisVO
*Open Issues :
*Change history :
*@LastModifyDate : 2018.11.22
*@LastModifier : 
*@LastVersion : 1.0
* 2018.11.22  
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

public class LseIntRtHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<LseIntRtHisVO> models = new ArrayList<LseIntRtHisVO>();
	
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String effYr = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String sepRt = null;
	/* Column Info */
	private String octRt = null;
	/* Column Info */
	private String febRt = null;
	/* Column Info */
	private String junRt = null;
	/* Column Info */
	private String mayRt = null;
	/* Column Info */
	private String marRt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String aprRt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String julRt = null;
	/* Column Info */
	private String decRt = null;
	/* Column Info */
	private String novRt = null;
	/* Column Info */
	private String fmDt = null;
	/* Column Info */
	private String hisSeq = null;
	/* Column Info */
	private String augRt = null;
	/* Column Info */
	private String janRt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String toDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public LseIntRtHisVO() {}

	public LseIntRtHisVO(String ibflag, String pagerows, String effYr, String fmDt, String toDt, String hisSeq, String janRt, String febRt, String marRt, String aprRt, String mayRt, String junRt, String julRt, String augRt, String sepRt, String octRt, String novRt, String decRt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.pagerows = pagerows;
		this.effYr = effYr;
		this.ibflag = ibflag;
		this.sepRt = sepRt;
		this.octRt = octRt;
		this.febRt = febRt;
		this.junRt = junRt;
		this.mayRt = mayRt;
		this.marRt = marRt;
		this.updUsrId = updUsrId;
		this.aprRt = aprRt;
		this.creUsrId = creUsrId;
		this.creDt = creDt;
		this.julRt = julRt;
		this.decRt = decRt;
		this.novRt = novRt;
		this.fmDt = fmDt;
		this.hisSeq = hisSeq;
		this.augRt = augRt;
		this.janRt = janRt;
		this.updDt = updDt;
		this.toDt = toDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("eff_yr", getEffYr());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("sep_rt", getSepRt());
		this.hashColumns.put("oct_rt", getOctRt());
		this.hashColumns.put("feb_rt", getFebRt());
		this.hashColumns.put("jun_rt", getJunRt());
		this.hashColumns.put("may_rt", getMayRt());
		this.hashColumns.put("mar_rt", getMarRt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("apr_rt", getAprRt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("jul_rt", getJulRt());
		this.hashColumns.put("dec_rt", getDecRt());
		this.hashColumns.put("nov_rt", getNovRt());
		this.hashColumns.put("fm_dt", getFmDt());
		this.hashColumns.put("his_seq", getHisSeq());
		this.hashColumns.put("aug_rt", getAugRt());
		this.hashColumns.put("jan_rt", getJanRt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("to_dt", getToDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("eff_yr", "effYr");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("sep_rt", "sepRt");
		this.hashFields.put("oct_rt", "octRt");
		this.hashFields.put("feb_rt", "febRt");
		this.hashFields.put("jun_rt", "junRt");
		this.hashFields.put("may_rt", "mayRt");
		this.hashFields.put("mar_rt", "marRt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("apr_rt", "aprRt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("jul_rt", "julRt");
		this.hashFields.put("dec_rt", "decRt");
		this.hashFields.put("nov_rt", "novRt");
		this.hashFields.put("fm_dt", "fmDt");
		this.hashFields.put("his_seq", "hisSeq");
		this.hashFields.put("aug_rt", "augRt");
		this.hashFields.put("jan_rt", "janRt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("to_dt", "toDt");
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
	 * @return effYr
	 */
	public String getEffYr() {
		return this.effYr;
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
	 * @return sepRt
	 */
	public String getSepRt() {
		return this.sepRt;
	}
	
	/**
	 * Column Info
	 * @return octRt
	 */
	public String getOctRt() {
		return this.octRt;
	}
	
	/**
	 * Column Info
	 * @return febRt
	 */
	public String getFebRt() {
		return this.febRt;
	}
	
	/**
	 * Column Info
	 * @return junRt
	 */
	public String getJunRt() {
		return this.junRt;
	}
	
	/**
	 * Column Info
	 * @return mayRt
	 */
	public String getMayRt() {
		return this.mayRt;
	}
	
	/**
	 * Column Info
	 * @return marRt
	 */
	public String getMarRt() {
		return this.marRt;
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
	 * @return aprRt
	 */
	public String getAprRt() {
		return this.aprRt;
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
	 * @return julRt
	 */
	public String getJulRt() {
		return this.julRt;
	}
	
	/**
	 * Column Info
	 * @return decRt
	 */
	public String getDecRt() {
		return this.decRt;
	}
	
	/**
	 * Column Info
	 * @return novRt
	 */
	public String getNovRt() {
		return this.novRt;
	}
	
	/**
	 * Column Info
	 * @return fmDt
	 */
	public String getFmDt() {
		return this.fmDt;
	}
	
	/**
	 * Column Info
	 * @return hisSeq
	 */
	public String getHisSeq() {
		return this.hisSeq;
	}
	
	/**
	 * Column Info
	 * @return augRt
	 */
	public String getAugRt() {
		return this.augRt;
	}
	
	/**
	 * Column Info
	 * @return janRt
	 */
	public String getJanRt() {
		return this.janRt;
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
	 * @return toDt
	 */
	public String getToDt() {
		return this.toDt;
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
	 * @param effYr
	 */
	public void setEffYr(String effYr) {
		this.effYr = effYr;
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
	 * @param sepRt
	 */
	public void setSepRt(String sepRt) {
		this.sepRt = sepRt;
	}
	
	/**
	 * Column Info
	 * @param octRt
	 */
	public void setOctRt(String octRt) {
		this.octRt = octRt;
	}
	
	/**
	 * Column Info
	 * @param febRt
	 */
	public void setFebRt(String febRt) {
		this.febRt = febRt;
	}
	
	/**
	 * Column Info
	 * @param junRt
	 */
	public void setJunRt(String junRt) {
		this.junRt = junRt;
	}
	
	/**
	 * Column Info
	 * @param mayRt
	 */
	public void setMayRt(String mayRt) {
		this.mayRt = mayRt;
	}
	
	/**
	 * Column Info
	 * @param marRt
	 */
	public void setMarRt(String marRt) {
		this.marRt = marRt;
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
	 * @param aprRt
	 */
	public void setAprRt(String aprRt) {
		this.aprRt = aprRt;
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
	 * @param julRt
	 */
	public void setJulRt(String julRt) {
		this.julRt = julRt;
	}
	
	/**
	 * Column Info
	 * @param decRt
	 */
	public void setDecRt(String decRt) {
		this.decRt = decRt;
	}
	
	/**
	 * Column Info
	 * @param novRt
	 */
	public void setNovRt(String novRt) {
		this.novRt = novRt;
	}
	
	/**
	 * Column Info
	 * @param fmDt
	 */
	public void setFmDt(String fmDt) {
		this.fmDt = fmDt;
	}
	
	/**
	 * Column Info
	 * @param hisSeq
	 */
	public void setHisSeq(String hisSeq) {
		this.hisSeq = hisSeq;
	}
	
	/**
	 * Column Info
	 * @param augRt
	 */
	public void setAugRt(String augRt) {
		this.augRt = augRt;
	}
	
	/**
	 * Column Info
	 * @param janRt
	 */
	public void setJanRt(String janRt) {
		this.janRt = janRt;
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
	 * @param toDt
	 */
	public void setToDt(String toDt) {
		this.toDt = toDt;
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
		setEffYr(JSPUtil.getParameter(request, prefix + "eff_yr", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setSepRt(JSPUtil.getParameter(request, prefix + "sep_rt", ""));
		setOctRt(JSPUtil.getParameter(request, prefix + "oct_rt", ""));
		setFebRt(JSPUtil.getParameter(request, prefix + "feb_rt", ""));
		setJunRt(JSPUtil.getParameter(request, prefix + "jun_rt", ""));
		setMayRt(JSPUtil.getParameter(request, prefix + "may_rt", ""));
		setMarRt(JSPUtil.getParameter(request, prefix + "mar_rt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setAprRt(JSPUtil.getParameter(request, prefix + "apr_rt", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setJulRt(JSPUtil.getParameter(request, prefix + "jul_rt", ""));
		setDecRt(JSPUtil.getParameter(request, prefix + "dec_rt", ""));
		setNovRt(JSPUtil.getParameter(request, prefix + "nov_rt", ""));
		setFmDt(JSPUtil.getParameter(request, prefix + "fm_dt", ""));
		setHisSeq(JSPUtil.getParameter(request, prefix + "his_seq", ""));
		setAugRt(JSPUtil.getParameter(request, prefix + "aug_rt", ""));
		setJanRt(JSPUtil.getParameter(request, prefix + "jan_rt", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setToDt(JSPUtil.getParameter(request, prefix + "to_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return LseIntRtHisVO[]
	 */
	public LseIntRtHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return LseIntRtHisVO[]
	 */
	public LseIntRtHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		LseIntRtHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] effYr = (JSPUtil.getParameter(request, prefix	+ "eff_yr", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] sepRt = (JSPUtil.getParameter(request, prefix	+ "sep_rt", length));
			String[] octRt = (JSPUtil.getParameter(request, prefix	+ "oct_rt", length));
			String[] febRt = (JSPUtil.getParameter(request, prefix	+ "feb_rt", length));
			String[] junRt = (JSPUtil.getParameter(request, prefix	+ "jun_rt", length));
			String[] mayRt = (JSPUtil.getParameter(request, prefix	+ "may_rt", length));
			String[] marRt = (JSPUtil.getParameter(request, prefix	+ "mar_rt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] aprRt = (JSPUtil.getParameter(request, prefix	+ "apr_rt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] julRt = (JSPUtil.getParameter(request, prefix	+ "jul_rt", length));
			String[] decRt = (JSPUtil.getParameter(request, prefix	+ "dec_rt", length));
			String[] novRt = (JSPUtil.getParameter(request, prefix	+ "nov_rt", length));
			String[] fmDt = (JSPUtil.getParameter(request, prefix	+ "fm_dt", length));
			String[] hisSeq = (JSPUtil.getParameter(request, prefix	+ "his_seq", length));
			String[] augRt = (JSPUtil.getParameter(request, prefix	+ "aug_rt", length));
			String[] janRt = (JSPUtil.getParameter(request, prefix	+ "jan_rt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] toDt = (JSPUtil.getParameter(request, prefix	+ "to_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new LseIntRtHisVO();
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (effYr[i] != null)
					model.setEffYr(effYr[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (sepRt[i] != null)
					model.setSepRt(sepRt[i]);
				if (octRt[i] != null)
					model.setOctRt(octRt[i]);
				if (febRt[i] != null)
					model.setFebRt(febRt[i]);
				if (junRt[i] != null)
					model.setJunRt(junRt[i]);
				if (mayRt[i] != null)
					model.setMayRt(mayRt[i]);
				if (marRt[i] != null)
					model.setMarRt(marRt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (aprRt[i] != null)
					model.setAprRt(aprRt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (julRt[i] != null)
					model.setJulRt(julRt[i]);
				if (decRt[i] != null)
					model.setDecRt(decRt[i]);
				if (novRt[i] != null)
					model.setNovRt(novRt[i]);
				if (fmDt[i] != null)
					model.setFmDt(fmDt[i]);
				if (hisSeq[i] != null)
					model.setHisSeq(hisSeq[i]);
				if (augRt[i] != null)
					model.setAugRt(augRt[i]);
				if (janRt[i] != null)
					model.setJanRt(janRt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (toDt[i] != null)
					model.setToDt(toDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getLseIntRtHisVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return LseIntRtHisVO[]
	 */
	public LseIntRtHisVO[] getLseIntRtHisVOs(){
		LseIntRtHisVO[] vos = (LseIntRtHisVO[])models.toArray(new LseIntRtHisVO[models.size()]);
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
		this.effYr = this.effYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sepRt = this.sepRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.octRt = this.octRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.febRt = this.febRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.junRt = this.junRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mayRt = this.mayRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.marRt = this.marRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aprRt = this.aprRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.julRt = this.julRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.decRt = this.decRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.novRt = this.novRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmDt = this.fmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hisSeq = this.hisSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.augRt = this.augRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.janRt = this.janRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toDt = this.toDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
