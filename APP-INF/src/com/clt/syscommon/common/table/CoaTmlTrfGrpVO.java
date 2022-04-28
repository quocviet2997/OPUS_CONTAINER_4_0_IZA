/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaTmlTrfGrpVO.java
*@FileTitle : CoaTmlTrfGrpVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : 임옥영
*@LastVersion : 1.0
* 2009.09.25 임옥영 
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
 * @author 임옥영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CoaTmlTrfGrpVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaTmlTrfGrpVO> models = new ArrayList<CoaTmlTrfGrpVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String tmlUtCd = null;
	/* Column Info */
	private String coaCostSrcCd = null;
	/* Column Info */
	private String tmlTrfItmCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String tmlCd = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String tmlDesc = null;
	/* Column Info */
	private String tmlTrfDtlCd = null;
	/* Column Info */
	private String tmlTrfDtlDesc = null;
	/* Column Info */
	private String tmlTrfItmDesc = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaTmlTrfGrpVO() {}

	public CoaTmlTrfGrpVO(String ibflag, String pagerows, String tmlCd, String tmlTrfItmCd, String tmlTrfDtlCd, String coaCostSrcCd, String tmlDesc, String tmlTrfItmDesc, String tmlTrfDtlDesc, String tmlUtCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.tmlUtCd = tmlUtCd;
		this.coaCostSrcCd = coaCostSrcCd;
		this.tmlTrfItmCd = tmlTrfItmCd;
		this.creDt = creDt;
		this.tmlCd = tmlCd;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.tmlDesc = tmlDesc;
		this.tmlTrfDtlCd = tmlTrfDtlCd;
		this.tmlTrfDtlDesc = tmlTrfDtlDesc;
		this.tmlTrfItmDesc = tmlTrfItmDesc;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("tml_ut_cd", getTmlUtCd());
		this.hashColumns.put("coa_cost_src_cd", getCoaCostSrcCd());
		this.hashColumns.put("tml_trf_itm_cd", getTmlTrfItmCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("tml_cd", getTmlCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("tml_desc", getTmlDesc());
		this.hashColumns.put("tml_trf_dtl_cd", getTmlTrfDtlCd());
		this.hashColumns.put("tml_trf_dtl_desc", getTmlTrfDtlDesc());
		this.hashColumns.put("tml_trf_itm_desc", getTmlTrfItmDesc());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("tml_ut_cd", "tmlUtCd");
		this.hashFields.put("coa_cost_src_cd", "coaCostSrcCd");
		this.hashFields.put("tml_trf_itm_cd", "tmlTrfItmCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("tml_cd", "tmlCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("tml_desc", "tmlDesc");
		this.hashFields.put("tml_trf_dtl_cd", "tmlTrfDtlCd");
		this.hashFields.put("tml_trf_dtl_desc", "tmlTrfDtlDesc");
		this.hashFields.put("tml_trf_itm_desc", "tmlTrfItmDesc");
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
	 * @return tmlUtCd
	 */
	public String getTmlUtCd() {
		return this.tmlUtCd;
	}
	
	/**
	 * Column Info
	 * @return coaCostSrcCd
	 */
	public String getCoaCostSrcCd() {
		return this.coaCostSrcCd;
	}
	
	/**
	 * Column Info
	 * @return tmlTrfItmCd
	 */
	public String getTmlTrfItmCd() {
		return this.tmlTrfItmCd;
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
	 * @return tmlCd
	 */
	public String getTmlCd() {
		return this.tmlCd;
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
	 * @return tmlDesc
	 */
	public String getTmlDesc() {
		return this.tmlDesc;
	}
	
	/**
	 * Column Info
	 * @return tmlTrfDtlCd
	 */
	public String getTmlTrfDtlCd() {
		return this.tmlTrfDtlCd;
	}
	
	/**
	 * Column Info
	 * @return tmlTrfDtlDesc
	 */
	public String getTmlTrfDtlDesc() {
		return this.tmlTrfDtlDesc;
	}
	
	/**
	 * Column Info
	 * @return tmlTrfItmDesc
	 */
	public String getTmlTrfItmDesc() {
		return this.tmlTrfItmDesc;
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
	 * @param tmlUtCd
	 */
	public void setTmlUtCd(String tmlUtCd) {
		this.tmlUtCd = tmlUtCd;
	}
	
	/**
	 * Column Info
	 * @param coaCostSrcCd
	 */
	public void setCoaCostSrcCd(String coaCostSrcCd) {
		this.coaCostSrcCd = coaCostSrcCd;
	}
	
	/**
	 * Column Info
	 * @param tmlTrfItmCd
	 */
	public void setTmlTrfItmCd(String tmlTrfItmCd) {
		this.tmlTrfItmCd = tmlTrfItmCd;
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
	 * @param tmlCd
	 */
	public void setTmlCd(String tmlCd) {
		this.tmlCd = tmlCd;
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
	 * @param tmlDesc
	 */
	public void setTmlDesc(String tmlDesc) {
		this.tmlDesc = tmlDesc;
	}
	
	/**
	 * Column Info
	 * @param tmlTrfDtlCd
	 */
	public void setTmlTrfDtlCd(String tmlTrfDtlCd) {
		this.tmlTrfDtlCd = tmlTrfDtlCd;
	}
	
	/**
	 * Column Info
	 * @param tmlTrfDtlDesc
	 */
	public void setTmlTrfDtlDesc(String tmlTrfDtlDesc) {
		this.tmlTrfDtlDesc = tmlTrfDtlDesc;
	}
	
	/**
	 * Column Info
	 * @param tmlTrfItmDesc
	 */
	public void setTmlTrfItmDesc(String tmlTrfItmDesc) {
		this.tmlTrfItmDesc = tmlTrfItmDesc;
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
		setTmlUtCd(JSPUtil.getParameter(request, "tml_ut_cd", ""));
		setCoaCostSrcCd(JSPUtil.getParameter(request, "coa_cost_src_cd", ""));
		setTmlTrfItmCd(JSPUtil.getParameter(request, "tml_trf_itm_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTmlCd(JSPUtil.getParameter(request, "tml_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setTmlDesc(JSPUtil.getParameter(request, "tml_desc", ""));
		setTmlTrfDtlCd(JSPUtil.getParameter(request, "tml_trf_dtl_cd", ""));
		setTmlTrfDtlDesc(JSPUtil.getParameter(request, "tml_trf_dtl_desc", ""));
		setTmlTrfItmDesc(JSPUtil.getParameter(request, "tml_trf_itm_desc", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaTmlTrfGrpVO[]
	 */
	public CoaTmlTrfGrpVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaTmlTrfGrpVO[]
	 */
	public CoaTmlTrfGrpVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaTmlTrfGrpVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] tmlUtCd = (JSPUtil.getParameter(request, prefix	+ "tml_ut_cd", length));
			String[] coaCostSrcCd = (JSPUtil.getParameter(request, prefix	+ "coa_cost_src_cd", length));
			String[] tmlTrfItmCd = (JSPUtil.getParameter(request, prefix	+ "tml_trf_itm_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] tmlCd = (JSPUtil.getParameter(request, prefix	+ "tml_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] tmlDesc = (JSPUtil.getParameter(request, prefix	+ "tml_desc", length));
			String[] tmlTrfDtlCd = (JSPUtil.getParameter(request, prefix	+ "tml_trf_dtl_cd", length));
			String[] tmlTrfDtlDesc = (JSPUtil.getParameter(request, prefix	+ "tml_trf_dtl_desc", length));
			String[] tmlTrfItmDesc = (JSPUtil.getParameter(request, prefix	+ "tml_trf_itm_desc", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaTmlTrfGrpVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (tmlUtCd[i] != null)
					model.setTmlUtCd(tmlUtCd[i]);
				if (coaCostSrcCd[i] != null)
					model.setCoaCostSrcCd(coaCostSrcCd[i]);
				if (tmlTrfItmCd[i] != null)
					model.setTmlTrfItmCd(tmlTrfItmCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (tmlCd[i] != null)
					model.setTmlCd(tmlCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (tmlDesc[i] != null)
					model.setTmlDesc(tmlDesc[i]);
				if (tmlTrfDtlCd[i] != null)
					model.setTmlTrfDtlCd(tmlTrfDtlCd[i]);
				if (tmlTrfDtlDesc[i] != null)
					model.setTmlTrfDtlDesc(tmlTrfDtlDesc[i]);
				if (tmlTrfItmDesc[i] != null)
					model.setTmlTrfItmDesc(tmlTrfItmDesc[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaTmlTrfGrpVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaTmlTrfGrpVO[]
	 */
	public CoaTmlTrfGrpVO[] getCoaTmlTrfGrpVOs(){
		CoaTmlTrfGrpVO[] vos = (CoaTmlTrfGrpVO[])models.toArray(new CoaTmlTrfGrpVO[models.size()]);
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
		this.tmlUtCd = this.tmlUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaCostSrcCd = this.coaCostSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlTrfItmCd = this.tmlTrfItmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlCd = this.tmlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlDesc = this.tmlDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlTrfDtlCd = this.tmlTrfDtlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlTrfDtlDesc = this.tmlTrfDtlDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlTrfItmDesc = this.tmlTrfItmDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
