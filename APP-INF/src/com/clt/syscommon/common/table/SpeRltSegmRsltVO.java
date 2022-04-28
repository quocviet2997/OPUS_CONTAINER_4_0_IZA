/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SpeRltSegmRsltVO.java
*@FileTitle : SpeRltSegmRsltVO
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

public class SpeRltSegmRsltVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SpeRltSegmRsltVO> models = new ArrayList<SpeRltSegmRsltVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String siScre = null;
	/* Column Info */
	private String modiSiScre = null;
	/* Column Info */
	private String srsGrpNm = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String raScre = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String srsGrpCd = null;
	/* Column Info */
	private String siGrpNm = null;
	/* Column Info */
	private String modiRaScre = null;
	/* Column Info */
	private String srsScre = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String siGrpCd = null;
	/* Column Info */
	private String evYr = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SpeRltSegmRsltVO() {}

	public SpeRltSegmRsltVO(String ibflag, String pagerows, String vndrSeq, String evYr, String siScre, String modiSiScre, String raScre, String modiRaScre, String srsScre, String srsGrpCd, String srsGrpNm, String siGrpCd, String siGrpNm, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.siScre = siScre;
		this.modiSiScre = modiSiScre;
		this.srsGrpNm = srsGrpNm;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.raScre = raScre;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.srsGrpCd = srsGrpCd;
		this.siGrpNm = siGrpNm;
		this.modiRaScre = modiRaScre;
		this.srsScre = srsScre;
		this.vndrSeq = vndrSeq;
		this.siGrpCd = siGrpCd;
		this.evYr = evYr;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("si_scre", getSiScre());
		this.hashColumns.put("modi_si_scre", getModiSiScre());
		this.hashColumns.put("srs_grp_nm", getSrsGrpNm());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ra_scre", getRaScre());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("srs_grp_cd", getSrsGrpCd());
		this.hashColumns.put("si_grp_nm", getSiGrpNm());
		this.hashColumns.put("modi_ra_scre", getModiRaScre());
		this.hashColumns.put("srs_scre", getSrsScre());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("si_grp_cd", getSiGrpCd());
		this.hashColumns.put("ev_yr", getEvYr());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("si_scre", "siScre");
		this.hashFields.put("modi_si_scre", "modiSiScre");
		this.hashFields.put("srs_grp_nm", "srsGrpNm");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ra_scre", "raScre");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("srs_grp_cd", "srsGrpCd");
		this.hashFields.put("si_grp_nm", "siGrpNm");
		this.hashFields.put("modi_ra_scre", "modiRaScre");
		this.hashFields.put("srs_scre", "srsScre");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("si_grp_cd", "siGrpCd");
		this.hashFields.put("ev_yr", "evYr");
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
	 * @return siScre
	 */
	public String getSiScre() {
		return this.siScre;
	}
	
	/**
	 * Column Info
	 * @return modiSiScre
	 */
	public String getModiSiScre() {
		return this.modiSiScre;
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
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}
	
	/**
	 * Column Info
	 * @return raScre
	 */
	public String getRaScre() {
		return this.raScre;
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
	 * @return srsGrpCd
	 */
	public String getSrsGrpCd() {
		return this.srsGrpCd;
	}
	
	/**
	 * Column Info
	 * @return siGrpNm
	 */
	public String getSiGrpNm() {
		return this.siGrpNm;
	}
	
	/**
	 * Column Info
	 * @return modiRaScre
	 */
	public String getModiRaScre() {
		return this.modiRaScre;
	}
	
	/**
	 * Column Info
	 * @return srsScre
	 */
	public String getSrsScre() {
		return this.srsScre;
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
	 * @return siGrpCd
	 */
	public String getSiGrpCd() {
		return this.siGrpCd;
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
	 * @param siScre
	 */
	public void setSiScre(String siScre) {
		this.siScre = siScre;
	}
	
	/**
	 * Column Info
	 * @param modiSiScre
	 */
	public void setModiSiScre(String modiSiScre) {
		this.modiSiScre = modiSiScre;
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
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Column Info
	 * @param raScre
	 */
	public void setRaScre(String raScre) {
		this.raScre = raScre;
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
	 * @param srsGrpCd
	 */
	public void setSrsGrpCd(String srsGrpCd) {
		this.srsGrpCd = srsGrpCd;
	}
	
	/**
	 * Column Info
	 * @param siGrpNm
	 */
	public void setSiGrpNm(String siGrpNm) {
		this.siGrpNm = siGrpNm;
	}
	
	/**
	 * Column Info
	 * @param modiRaScre
	 */
	public void setModiRaScre(String modiRaScre) {
		this.modiRaScre = modiRaScre;
	}
	
	/**
	 * Column Info
	 * @param srsScre
	 */
	public void setSrsScre(String srsScre) {
		this.srsScre = srsScre;
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
	 * @param siGrpCd
	 */
	public void setSiGrpCd(String siGrpCd) {
		this.siGrpCd = siGrpCd;
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
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setSiScre(JSPUtil.getParameter(request, "si_scre", ""));
		setModiSiScre(JSPUtil.getParameter(request, "modi_si_scre", ""));
		setSrsGrpNm(JSPUtil.getParameter(request, "srs_grp_nm", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setRaScre(JSPUtil.getParameter(request, "ra_scre", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSrsGrpCd(JSPUtil.getParameter(request, "srs_grp_cd", ""));
		setSiGrpNm(JSPUtil.getParameter(request, "si_grp_nm", ""));
		setModiRaScre(JSPUtil.getParameter(request, "modi_ra_scre", ""));
		setSrsScre(JSPUtil.getParameter(request, "srs_scre", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setSiGrpCd(JSPUtil.getParameter(request, "si_grp_cd", ""));
		setEvYr(JSPUtil.getParameter(request, "ev_yr", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SpeRltSegmRsltVO[]
	 */
	public SpeRltSegmRsltVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SpeRltSegmRsltVO[]
	 */
	public SpeRltSegmRsltVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SpeRltSegmRsltVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] siScre = (JSPUtil.getParameter(request, prefix	+ "si_scre", length));
			String[] modiSiScre = (JSPUtil.getParameter(request, prefix	+ "modi_si_scre", length));
			String[] srsGrpNm = (JSPUtil.getParameter(request, prefix	+ "srs_grp_nm", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] raScre = (JSPUtil.getParameter(request, prefix	+ "ra_scre", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] srsGrpCd = (JSPUtil.getParameter(request, prefix	+ "srs_grp_cd", length));
			String[] siGrpNm = (JSPUtil.getParameter(request, prefix	+ "si_grp_nm", length));
			String[] modiRaScre = (JSPUtil.getParameter(request, prefix	+ "modi_ra_scre", length));
			String[] srsScre = (JSPUtil.getParameter(request, prefix	+ "srs_scre", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] siGrpCd = (JSPUtil.getParameter(request, prefix	+ "si_grp_cd", length));
			String[] evYr = (JSPUtil.getParameter(request, prefix	+ "ev_yr", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new SpeRltSegmRsltVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (siScre[i] != null)
					model.setSiScre(siScre[i]);
				if (modiSiScre[i] != null)
					model.setModiSiScre(modiSiScre[i]);
				if (srsGrpNm[i] != null)
					model.setSrsGrpNm(srsGrpNm[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (raScre[i] != null)
					model.setRaScre(raScre[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (srsGrpCd[i] != null)
					model.setSrsGrpCd(srsGrpCd[i]);
				if (siGrpNm[i] != null)
					model.setSiGrpNm(siGrpNm[i]);
				if (modiRaScre[i] != null)
					model.setModiRaScre(modiRaScre[i]);
				if (srsScre[i] != null)
					model.setSrsScre(srsScre[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (siGrpCd[i] != null)
					model.setSiGrpCd(siGrpCd[i]);
				if (evYr[i] != null)
					model.setEvYr(evYr[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSpeRltSegmRsltVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SpeRltSegmRsltVO[]
	 */
	public SpeRltSegmRsltVO[] getSpeRltSegmRsltVOs(){
		SpeRltSegmRsltVO[] vos = (SpeRltSegmRsltVO[])models.toArray(new SpeRltSegmRsltVO[models.size()]);
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
		this.siScre = this.siScre .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.modiSiScre = this.modiSiScre .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srsGrpNm = this.srsGrpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raScre = this.raScre .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srsGrpCd = this.srsGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.siGrpNm = this.siGrpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.modiRaScre = this.modiRaScre .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srsScre = this.srsScre .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.siGrpCd = this.siGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.evYr = this.evYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
