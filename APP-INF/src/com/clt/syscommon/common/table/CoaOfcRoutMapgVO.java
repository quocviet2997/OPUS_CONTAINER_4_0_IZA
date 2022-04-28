/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaOfcRoutMapgVO.java
*@FileTitle : CoaOfcRoutMapgVO
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

public class CoaOfcRoutMapgVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaOfcRoutMapgVO> models = new ArrayList<CoaOfcRoutMapgVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String slsOfcClssNm = null;
	/* Column Info */
	private String ofcClssCd = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String divMeasNm = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String slsActCd = null;
	/* Column Info */
	private String divMeasCd = null;
	/* Column Info */
	private String slsActDesc = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaOfcRoutMapgVO() {}

	public CoaOfcRoutMapgVO(String ibflag, String pagerows, String costYrmon, String ofcClssCd, String slsActCd, String divMeasCd, String slsOfcClssNm, String slsActDesc, String divMeasNm, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.slsOfcClssNm = slsOfcClssNm;
		this.ofcClssCd = ofcClssCd;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.divMeasNm = divMeasNm;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.costYrmon = costYrmon;
		this.slsActCd = slsActCd;
		this.divMeasCd = divMeasCd;
		this.slsActDesc = slsActDesc;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("sls_ofc_clss_nm", getSlsOfcClssNm());
		this.hashColumns.put("ofc_clss_cd", getOfcClssCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("div_meas_nm", getDivMeasNm());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("sls_act_cd", getSlsActCd());
		this.hashColumns.put("div_meas_cd", getDivMeasCd());
		this.hashColumns.put("sls_act_desc", getSlsActDesc());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("sls_ofc_clss_nm", "slsOfcClssNm");
		this.hashFields.put("ofc_clss_cd", "ofcClssCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("div_meas_nm", "divMeasNm");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("sls_act_cd", "slsActCd");
		this.hashFields.put("div_meas_cd", "divMeasCd");
		this.hashFields.put("sls_act_desc", "slsActDesc");
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
	 * @return slsOfcClssNm
	 */
	public String getSlsOfcClssNm() {
		return this.slsOfcClssNm;
	}
	
	/**
	 * Column Info
	 * @return ofcClssCd
	 */
	public String getOfcClssCd() {
		return this.ofcClssCd;
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
	 * @return divMeasNm
	 */
	public String getDivMeasNm() {
		return this.divMeasNm;
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
	 * @return costYrmon
	 */
	public String getCostYrmon() {
		return this.costYrmon;
	}
	
	/**
	 * Column Info
	 * @return slsActCd
	 */
	public String getSlsActCd() {
		return this.slsActCd;
	}
	
	/**
	 * Column Info
	 * @return divMeasCd
	 */
	public String getDivMeasCd() {
		return this.divMeasCd;
	}
	
	/**
	 * Column Info
	 * @return slsActDesc
	 */
	public String getSlsActDesc() {
		return this.slsActDesc;
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
	 * @param slsOfcClssNm
	 */
	public void setSlsOfcClssNm(String slsOfcClssNm) {
		this.slsOfcClssNm = slsOfcClssNm;
	}
	
	/**
	 * Column Info
	 * @param ofcClssCd
	 */
	public void setOfcClssCd(String ofcClssCd) {
		this.ofcClssCd = ofcClssCd;
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
	 * @param divMeasNm
	 */
	public void setDivMeasNm(String divMeasNm) {
		this.divMeasNm = divMeasNm;
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
	 * @param costYrmon
	 */
	public void setCostYrmon(String costYrmon) {
		this.costYrmon = costYrmon;
	}
	
	/**
	 * Column Info
	 * @param slsActCd
	 */
	public void setSlsActCd(String slsActCd) {
		this.slsActCd = slsActCd;
	}
	
	/**
	 * Column Info
	 * @param divMeasCd
	 */
	public void setDivMeasCd(String divMeasCd) {
		this.divMeasCd = divMeasCd;
	}
	
	/**
	 * Column Info
	 * @param slsActDesc
	 */
	public void setSlsActDesc(String slsActDesc) {
		this.slsActDesc = slsActDesc;
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
		setSlsOfcClssNm(JSPUtil.getParameter(request, "sls_ofc_clss_nm", ""));
		setOfcClssCd(JSPUtil.getParameter(request, "ofc_clss_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setDivMeasNm(JSPUtil.getParameter(request, "div_meas_nm", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setSlsActCd(JSPUtil.getParameter(request, "sls_act_cd", ""));
		setDivMeasCd(JSPUtil.getParameter(request, "div_meas_cd", ""));
		setSlsActDesc(JSPUtil.getParameter(request, "sls_act_desc", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaOfcRoutMapgVO[]
	 */
	public CoaOfcRoutMapgVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaOfcRoutMapgVO[]
	 */
	public CoaOfcRoutMapgVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaOfcRoutMapgVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] slsOfcClssNm = (JSPUtil.getParameter(request, prefix	+ "sls_ofc_clss_nm", length));
			String[] ofcClssCd = (JSPUtil.getParameter(request, prefix	+ "ofc_clss_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] divMeasNm = (JSPUtil.getParameter(request, prefix	+ "div_meas_nm", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon", length));
			String[] slsActCd = (JSPUtil.getParameter(request, prefix	+ "sls_act_cd", length));
			String[] divMeasCd = (JSPUtil.getParameter(request, prefix	+ "div_meas_cd", length));
			String[] slsActDesc = (JSPUtil.getParameter(request, prefix	+ "sls_act_desc", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaOfcRoutMapgVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (slsOfcClssNm[i] != null)
					model.setSlsOfcClssNm(slsOfcClssNm[i]);
				if (ofcClssCd[i] != null)
					model.setOfcClssCd(ofcClssCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (divMeasNm[i] != null)
					model.setDivMeasNm(divMeasNm[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (slsActCd[i] != null)
					model.setSlsActCd(slsActCd[i]);
				if (divMeasCd[i] != null)
					model.setDivMeasCd(divMeasCd[i]);
				if (slsActDesc[i] != null)
					model.setSlsActDesc(slsActDesc[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaOfcRoutMapgVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaOfcRoutMapgVO[]
	 */
	public CoaOfcRoutMapgVO[] getCoaOfcRoutMapgVOs(){
		CoaOfcRoutMapgVO[] vos = (CoaOfcRoutMapgVO[])models.toArray(new CoaOfcRoutMapgVO[models.size()]);
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
		this.slsOfcClssNm = this.slsOfcClssNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcClssCd = this.ofcClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.divMeasNm = this.divMeasNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsActCd = this.slsActCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.divMeasCd = this.divMeasCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsActDesc = this.slsActDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
