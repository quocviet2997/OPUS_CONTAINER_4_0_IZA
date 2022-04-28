/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SpeEvGrpStrgImptRsltVO.java
*@FileTitle : SpeEvGrpStrgImptRsltVO
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

public class SpeEvGrpStrgImptRsltVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SpeEvGrpStrgImptRsltVO> models = new ArrayList<SpeEvGrpStrgImptRsltVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String siScre = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String dsScre = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String siGrpNm = null;
	/* Column Info */
	private String egIdSeq = null;
	/* Column Info */
	private String siGrpCd = null;
	/* Column Info */
	private String biScre = null;
	/* Column Info */
	private String egId = null;
	/* Column Info */
	private String evYr = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SpeEvGrpStrgImptRsltVO() {}

	public SpeEvGrpStrgImptRsltVO(String ibflag, String pagerows, String egId, String egIdSeq, String evYr, String biScre, String dsScre, String siScre, String siGrpCd, String siGrpNm, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.siScre = siScre;
		this.creDt = creDt;
		this.dsScre = dsScre;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.siGrpNm = siGrpNm;
		this.egIdSeq = egIdSeq;
		this.siGrpCd = siGrpCd;
		this.biScre = biScre;
		this.egId = egId;
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
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ds_scre", getDsScre());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("si_grp_nm", getSiGrpNm());
		this.hashColumns.put("eg_id_seq", getEgIdSeq());
		this.hashColumns.put("si_grp_cd", getSiGrpCd());
		this.hashColumns.put("bi_scre", getBiScre());
		this.hashColumns.put("eg_id", getEgId());
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
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ds_scre", "dsScre");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("si_grp_nm", "siGrpNm");
		this.hashFields.put("eg_id_seq", "egIdSeq");
		this.hashFields.put("si_grp_cd", "siGrpCd");
		this.hashFields.put("bi_scre", "biScre");
		this.hashFields.put("eg_id", "egId");
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return dsScre
	 */
	public String getDsScre() {
		return this.dsScre;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return egIdSeq
	 */
	public String getEgIdSeq() {
		return this.egIdSeq;
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
	 * @return biScre
	 */
	public String getBiScre() {
		return this.biScre;
	}
	
	/**
	 * Column Info
	 * @return egId
	 */
	public String getEgId() {
		return this.egId;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param dsScre
	 */
	public void setDsScre(String dsScre) {
		this.dsScre = dsScre;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
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
	 * @param egIdSeq
	 */
	public void setEgIdSeq(String egIdSeq) {
		this.egIdSeq = egIdSeq;
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
	 * @param biScre
	 */
	public void setBiScre(String biScre) {
		this.biScre = biScre;
	}
	
	/**
	 * Column Info
	 * @param egId
	 */
	public void setEgId(String egId) {
		this.egId = egId;
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
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setDsScre(JSPUtil.getParameter(request, "ds_scre", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSiGrpNm(JSPUtil.getParameter(request, "si_grp_nm", ""));
		setEgIdSeq(JSPUtil.getParameter(request, "eg_id_seq", ""));
		setSiGrpCd(JSPUtil.getParameter(request, "si_grp_cd", ""));
		setBiScre(JSPUtil.getParameter(request, "bi_scre", ""));
		setEgId(JSPUtil.getParameter(request, "eg_id", ""));
		setEvYr(JSPUtil.getParameter(request, "ev_yr", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SpeEvGrpStrgImptRsltVO[]
	 */
	public SpeEvGrpStrgImptRsltVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SpeEvGrpStrgImptRsltVO[]
	 */
	public SpeEvGrpStrgImptRsltVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SpeEvGrpStrgImptRsltVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] siScre = (JSPUtil.getParameter(request, prefix	+ "si_scre", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] dsScre = (JSPUtil.getParameter(request, prefix	+ "ds_scre", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] siGrpNm = (JSPUtil.getParameter(request, prefix	+ "si_grp_nm", length));
			String[] egIdSeq = (JSPUtil.getParameter(request, prefix	+ "eg_id_seq", length));
			String[] siGrpCd = (JSPUtil.getParameter(request, prefix	+ "si_grp_cd", length));
			String[] biScre = (JSPUtil.getParameter(request, prefix	+ "bi_scre", length));
			String[] egId = (JSPUtil.getParameter(request, prefix	+ "eg_id", length));
			String[] evYr = (JSPUtil.getParameter(request, prefix	+ "ev_yr", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new SpeEvGrpStrgImptRsltVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (siScre[i] != null)
					model.setSiScre(siScre[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (dsScre[i] != null)
					model.setDsScre(dsScre[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (siGrpNm[i] != null)
					model.setSiGrpNm(siGrpNm[i]);
				if (egIdSeq[i] != null)
					model.setEgIdSeq(egIdSeq[i]);
				if (siGrpCd[i] != null)
					model.setSiGrpCd(siGrpCd[i]);
				if (biScre[i] != null)
					model.setBiScre(biScre[i]);
				if (egId[i] != null)
					model.setEgId(egId[i]);
				if (evYr[i] != null)
					model.setEvYr(evYr[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSpeEvGrpStrgImptRsltVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SpeEvGrpStrgImptRsltVO[]
	 */
	public SpeEvGrpStrgImptRsltVO[] getSpeEvGrpStrgImptRsltVOs(){
		SpeEvGrpStrgImptRsltVO[] vos = (SpeEvGrpStrgImptRsltVO[])models.toArray(new SpeEvGrpStrgImptRsltVO[models.size()]);
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
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dsScre = this.dsScre .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.siGrpNm = this.siGrpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.egIdSeq = this.egIdSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.siGrpCd = this.siGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.biScre = this.biScre .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.egId = this.egId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.evYr = this.evYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
