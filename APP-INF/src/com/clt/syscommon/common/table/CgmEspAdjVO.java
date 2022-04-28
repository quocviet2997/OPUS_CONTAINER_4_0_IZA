/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmEspAdjVO.java
*@FileTitle : CgmEspAdjVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.08
*@LastModifier : 박의수
*@LastVersion : 1.0
* 2009.05.08 박의수 
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
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 박의수
 * @since J2EE 1.5
 */

public class CgmEspAdjVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmEspAdjVO> models = new ArrayList<CgmEspAdjVO>();
	
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String cntr20ftAdjVal = null;
	/* Column Info */
	private String sccCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String cntrR5AdjVal = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String cntr40ftAdjVal = null;
	/* Column Info */
	private String espAdjKndCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String cntr45ftAdjVal = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmEspAdjVO() {}

	public CgmEspAdjVO(String ibflag, String pagerows, String sccCd, String espAdjKndCd, String cntr20ftAdjVal, String cntr40ftAdjVal, String cntr45ftAdjVal, String cntrR5AdjVal, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updUsrId = updUsrId;
		this.cntr20ftAdjVal = cntr20ftAdjVal;
		this.sccCd = sccCd;
		this.ibflag = ibflag;
		this.updDt = updDt;
		this.cntrR5AdjVal = cntrR5AdjVal;
		this.creDt = creDt;
		this.creUsrId = creUsrId;
		this.cntr40ftAdjVal = cntr40ftAdjVal;
		this.espAdjKndCd = espAdjKndCd;
		this.pagerows = pagerows;
		this.cntr45ftAdjVal = cntr45ftAdjVal;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cntr_20ft_adj_val", getCntr20ftAdjVal());
		this.hashColumns.put("scc_cd", getSccCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cntr_r5_adj_val", getCntrR5AdjVal());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cntr_40ft_adj_val", getCntr40ftAdjVal());
		this.hashColumns.put("esp_adj_knd_cd", getEspAdjKndCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cntr_45ft_adj_val", getCntr45ftAdjVal());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cntr_20ft_adj_val", "cntr20ftAdjVal");
		this.hashFields.put("scc_cd", "sccCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cntr_r5_adj_val", "cntrR5AdjVal");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cntr_40ft_adj_val", "cntr40ftAdjVal");
		this.hashFields.put("esp_adj_knd_cd", "espAdjKndCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cntr_45ft_adj_val", "cntr45ftAdjVal");
		return this.hashFields;
	}
	
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getCntr20ftAdjVal() {
		return this.cntr20ftAdjVal;
	}
	public String getSccCd() {
		return this.sccCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCntrR5AdjVal() {
		return this.cntrR5AdjVal;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getCntr40ftAdjVal() {
		return this.cntr40ftAdjVal;
	}
	public String getEspAdjKndCd() {
		return this.espAdjKndCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getCntr45ftAdjVal() {
		return this.cntr45ftAdjVal;
	}

	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setCntr20ftAdjVal(String cntr20ftAdjVal) {
		this.cntr20ftAdjVal = cntr20ftAdjVal;
		//this.cntr20ftAdjVal=true;
	}
	public void setSccCd(String sccCd) {
		this.sccCd = sccCd;
		//this.sccCd=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCntrR5AdjVal(String cntrR5AdjVal) {
		this.cntrR5AdjVal = cntrR5AdjVal;
		//this.cntrR5AdjVal=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setCntr40ftAdjVal(String cntr40ftAdjVal) {
		this.cntr40ftAdjVal = cntr40ftAdjVal;
		//this.cntr40ftAdjVal=true;
	}
	public void setEspAdjKndCd(String espAdjKndCd) {
		this.espAdjKndCd = espAdjKndCd;
		//this.espAdjKndCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setCntr45ftAdjVal(String cntr45ftAdjVal) {
		this.cntr45ftAdjVal = cntr45ftAdjVal;
		//this.cntr45ftAdjVal=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCntr20ftAdjVal(JSPUtil.getParameter(request, "cntr_20ft_adj_val", ""));
		setSccCd(JSPUtil.getParameter(request, "scc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCntrR5AdjVal(JSPUtil.getParameter(request, "cntr_r5_adj_val", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCntr40ftAdjVal(JSPUtil.getParameter(request, "cntr_40ft_adj_val", ""));
		setEspAdjKndCd(JSPUtil.getParameter(request, "esp_adj_knd_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCntr45ftAdjVal(JSPUtil.getParameter(request, "cntr_45ft_adj_val", ""));
	}

	public CgmEspAdjVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmEspAdjVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmEspAdjVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] cntr20ftAdjVal = (JSPUtil.getParameter(request, prefix	+ "cntr_20ft_adj_val".trim(), length));
			String[] sccCd = (JSPUtil.getParameter(request, prefix	+ "scc_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] cntrR5AdjVal = (JSPUtil.getParameter(request, prefix	+ "cntr_r5_adj_val".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] cntr40ftAdjVal = (JSPUtil.getParameter(request, prefix	+ "cntr_40ft_adj_val".trim(), length));
			String[] espAdjKndCd = (JSPUtil.getParameter(request, prefix	+ "esp_adj_knd_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] cntr45ftAdjVal = (JSPUtil.getParameter(request, prefix	+ "cntr_45ft_adj_val".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmEspAdjVO();
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (cntr20ftAdjVal[i] != null)
					model.setCntr20ftAdjVal(cntr20ftAdjVal[i]);
				if (sccCd[i] != null)
					model.setSccCd(sccCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cntrR5AdjVal[i] != null)
					model.setCntrR5AdjVal(cntrR5AdjVal[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (cntr40ftAdjVal[i] != null)
					model.setCntr40ftAdjVal(cntr40ftAdjVal[i]);
				if (espAdjKndCd[i] != null)
					model.setEspAdjKndCd(espAdjKndCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (cntr45ftAdjVal[i] != null)
					model.setCntr45ftAdjVal(cntr45ftAdjVal[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmEspAdjVOs();
	}

	public CgmEspAdjVO[] getCgmEspAdjVOs(){
		CgmEspAdjVO[] vos = (CgmEspAdjVO[])models.toArray(new CgmEspAdjVO[models.size()]);
		return vos;
	}
	
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
		} catch (Exception ex) {}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 * @throws IllegalAccessException
	 */
	private String[] getField(Field[] field, int i) throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntr20ftAdjVal = this.cntr20ftAdjVal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sccCd = this.sccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrR5AdjVal = this.cntrR5AdjVal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntr40ftAdjVal = this.cntr40ftAdjVal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.espAdjKndCd = this.espAdjKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntr45ftAdjVal = this.cntr45ftAdjVal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
