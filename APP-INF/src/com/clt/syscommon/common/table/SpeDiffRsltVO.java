/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SpeDiffRsltVO.java
*@FileTitle : SpeDiffRsltVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.20
*@LastModifier : 남궁진호
*@LastVersion : 1.0
* 2009.07.20 남궁진호 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 남궁진호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SpeDiffRsltVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SpeDiffRsltVO> models = new ArrayList<SpeDiffRsltVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String srsGrpNm = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String spDiffGrpNm = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String yryPaGrpCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String spDiffGrpScre = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String srsGrpCd = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String spDiffGrpCd = null;
	/* Column Info */
	private String evYr = null;
	/* Column Info */
	private String yryPaGrpNm = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String yryPaGrpScre = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SpeDiffRsltVO() {}

	public SpeDiffRsltVO(String ibflag, String pagerows, String vndrSeq, String evYr, String srsGrpCd, String srsGrpNm, String yryPaGrpCd, String yryPaGrpNm, String yryPaGrpScre, String spDiffGrpCd, String spDiffGrpNm, String spDiffGrpScre, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.srsGrpNm = srsGrpNm;
		this.creDt = creDt;
		this.spDiffGrpNm = spDiffGrpNm;
		this.pagerows = pagerows;
		this.yryPaGrpCd = yryPaGrpCd;
		this.ibflag = ibflag;
		this.spDiffGrpScre = spDiffGrpScre;
		this.creUsrId = creUsrId;
		this.srsGrpCd = srsGrpCd;
		this.vndrSeq = vndrSeq;
		this.spDiffGrpCd = spDiffGrpCd;
		this.evYr = evYr;
		this.yryPaGrpNm = yryPaGrpNm;
		this.updUsrId = updUsrId;
		this.yryPaGrpScre = yryPaGrpScre;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("srs_grp_nm", getSrsGrpNm());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("sp_diff_grp_nm", getSpDiffGrpNm());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("yry_pa_grp_cd", getYryPaGrpCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("sp_diff_grp_scre", getSpDiffGrpScre());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("srs_grp_cd", getSrsGrpCd());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("sp_diff_grp_cd", getSpDiffGrpCd());
		this.hashColumns.put("ev_yr", getEvYr());
		this.hashColumns.put("yry_pa_grp_nm", getYryPaGrpNm());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("yry_pa_grp_scre", getYryPaGrpScre());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("srs_grp_nm", "srsGrpNm");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("sp_diff_grp_nm", "spDiffGrpNm");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("yry_pa_grp_cd", "yryPaGrpCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("sp_diff_grp_scre", "spDiffGrpScre");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("srs_grp_cd", "srsGrpCd");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("sp_diff_grp_cd", "spDiffGrpCd");
		this.hashFields.put("ev_yr", "evYr");
		this.hashFields.put("yry_pa_grp_nm", "yryPaGrpNm");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("yry_pa_grp_scre", "yryPaGrpScre");
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
	 * @return srsGrpNm
	 */
	public String getSrsGrpNm() {
		return this.srsGrpNm;
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
	 * @return spDiffGrpNm
	 */
	public String getSpDiffGrpNm() {
		return this.spDiffGrpNm;
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
	 * @return yryPaGrpCd
	 */
	public String getYryPaGrpCd() {
		return this.yryPaGrpCd;
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
	 * @return spDiffGrpScre
	 */
	public String getSpDiffGrpScre() {
		return this.spDiffGrpScre;
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
	 * @return srsGrpCd
	 */
	public String getSrsGrpCd() {
		return this.srsGrpCd;
	}
	
	/**
	 * Column Info
	 * @return vndrSeq
	 */
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	
	/**
	 * Column Info
	 * @return spDiffGrpCd
	 */
	public String getSpDiffGrpCd() {
		return this.spDiffGrpCd;
	}
	
	/**
	 * Column Info
	 * @return evYr
	 */
	public String getEvYr() {
		return this.evYr;
	}
	
	/**
	 * Column Info
	 * @return yryPaGrpNm
	 */
	public String getYryPaGrpNm() {
		return this.yryPaGrpNm;
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
	 * @return yryPaGrpScre
	 */
	public String getYryPaGrpScre() {
		return this.yryPaGrpScre;
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
	 * @param srsGrpNm
	 */
	public void setSrsGrpNm(String srsGrpNm) {
		this.srsGrpNm = srsGrpNm;
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
	 * @param spDiffGrpNm
	 */
	public void setSpDiffGrpNm(String spDiffGrpNm) {
		this.spDiffGrpNm = spDiffGrpNm;
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
	 * @param yryPaGrpCd
	 */
	public void setYryPaGrpCd(String yryPaGrpCd) {
		this.yryPaGrpCd = yryPaGrpCd;
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
	 * @param spDiffGrpScre
	 */
	public void setSpDiffGrpScre(String spDiffGrpScre) {
		this.spDiffGrpScre = spDiffGrpScre;
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
	 * @param srsGrpCd
	 */
	public void setSrsGrpCd(String srsGrpCd) {
		this.srsGrpCd = srsGrpCd;
	}
	
	/**
	 * Column Info
	 * @param vndrSeq
	 */
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
	}
	
	/**
	 * Column Info
	 * @param spDiffGrpCd
	 */
	public void setSpDiffGrpCd(String spDiffGrpCd) {
		this.spDiffGrpCd = spDiffGrpCd;
	}
	
	/**
	 * Column Info
	 * @param evYr
	 */
	public void setEvYr(String evYr) {
		this.evYr = evYr;
	}
	
	/**
	 * Column Info
	 * @param yryPaGrpNm
	 */
	public void setYryPaGrpNm(String yryPaGrpNm) {
		this.yryPaGrpNm = yryPaGrpNm;
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
	 * @param yryPaGrpScre
	 */
	public void setYryPaGrpScre(String yryPaGrpScre) {
		this.yryPaGrpScre = yryPaGrpScre;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setSrsGrpNm(JSPUtil.getParameter(request, "srs_grp_nm", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSpDiffGrpNm(JSPUtil.getParameter(request, "sp_diff_grp_nm", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setYryPaGrpCd(JSPUtil.getParameter(request, "yry_pa_grp_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSpDiffGrpScre(JSPUtil.getParameter(request, "sp_diff_grp_scre", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSrsGrpCd(JSPUtil.getParameter(request, "srs_grp_cd", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setSpDiffGrpCd(JSPUtil.getParameter(request, "sp_diff_grp_cd", ""));
		setEvYr(JSPUtil.getParameter(request, "ev_yr", ""));
		setYryPaGrpNm(JSPUtil.getParameter(request, "yry_pa_grp_nm", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setYryPaGrpScre(JSPUtil.getParameter(request, "yry_pa_grp_scre", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SpeDiffRsltVO[]
	 */
	public SpeDiffRsltVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SpeDiffRsltVO[]
	 */
	public SpeDiffRsltVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SpeDiffRsltVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] srsGrpNm = (JSPUtil.getParameter(request, prefix	+ "srs_grp_nm", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] spDiffGrpNm = (JSPUtil.getParameter(request, prefix	+ "sp_diff_grp_nm", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] yryPaGrpCd = (JSPUtil.getParameter(request, prefix	+ "yry_pa_grp_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] spDiffGrpScre = (JSPUtil.getParameter(request, prefix	+ "sp_diff_grp_scre", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] srsGrpCd = (JSPUtil.getParameter(request, prefix	+ "srs_grp_cd", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] spDiffGrpCd = (JSPUtil.getParameter(request, prefix	+ "sp_diff_grp_cd", length));
			String[] evYr = (JSPUtil.getParameter(request, prefix	+ "ev_yr", length));
			String[] yryPaGrpNm = (JSPUtil.getParameter(request, prefix	+ "yry_pa_grp_nm", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] yryPaGrpScre = (JSPUtil.getParameter(request, prefix	+ "yry_pa_grp_scre", length));
			
			for (int i = 0; i < length; i++) {
				model = new SpeDiffRsltVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (srsGrpNm[i] != null)
					model.setSrsGrpNm(srsGrpNm[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (spDiffGrpNm[i] != null)
					model.setSpDiffGrpNm(spDiffGrpNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (yryPaGrpCd[i] != null)
					model.setYryPaGrpCd(yryPaGrpCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (spDiffGrpScre[i] != null)
					model.setSpDiffGrpScre(spDiffGrpScre[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (srsGrpCd[i] != null)
					model.setSrsGrpCd(srsGrpCd[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (spDiffGrpCd[i] != null)
					model.setSpDiffGrpCd(spDiffGrpCd[i]);
				if (evYr[i] != null)
					model.setEvYr(evYr[i]);
				if (yryPaGrpNm[i] != null)
					model.setYryPaGrpNm(yryPaGrpNm[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (yryPaGrpScre[i] != null)
					model.setYryPaGrpScre(yryPaGrpScre[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSpeDiffRsltVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SpeDiffRsltVO[]
	 */
	public SpeDiffRsltVO[] getSpeDiffRsltVOs(){
		SpeDiffRsltVO[] vos = (SpeDiffRsltVO[])models.toArray(new SpeDiffRsltVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space = "";
		try{
			for(int i = 0; i < field.length; i++){
				String[] arr = null;
				arr = getField(field, i);
				if(arr != null){
					for(int j = 0; j < arr.length; j++) {
						ret.append(field[i].getName().concat(space).substring(0, 30).concat("= ") + arr[j] + "\n");
					}
				} else {
					ret.append(field[i].getName() + " =  null \n");
				}
			}
		} catch (Exception ex) {
			return null;
		}
		return ret.toString();
	}
	
	/**
	 * 필드에 있는 값을 스트링 배열로 반환.
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = null;
		}
		return arr;
	}

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srsGrpNm = this.srsGrpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spDiffGrpNm = this.spDiffGrpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.yryPaGrpCd = this.yryPaGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spDiffGrpScre = this.spDiffGrpScre .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srsGrpCd = this.srsGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spDiffGrpCd = this.spDiffGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.evYr = this.evYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.yryPaGrpNm = this.yryPaGrpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.yryPaGrpScre = this.yryPaGrpScre .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
