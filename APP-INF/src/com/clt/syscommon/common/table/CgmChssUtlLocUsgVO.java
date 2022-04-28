/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmChssUtlLocUsgVO.java
*@FileTitle : CgmChssUtlLocUsgVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.08
*@LastModifier : 김창식
*@LastVersion : 1.0
* 2009.05.08 김창식 
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
 * @author 김창식
 * @since J2EE 1.5
 */

public class CgmChssUtlLocUsgVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmChssUtlLocUsgVO> models = new ArrayList<CgmChssUtlLocUsgVO>();
	
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String cntrPsnStsCd = null;
	/* Column Info */
	private String cnmvStsCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String chssUsgRto = null;
	/* Column Info */
	private String cntrDryRfIndCd = null;
	/* Column Info */
	private String locCd = null;
	/* Column Info */
	private String ydCd = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmChssUtlLocUsgVO() {}

	public CgmChssUtlLocUsgVO(String ibflag, String pagerows, String locCd, String ydCd, String cntrDryRfIndCd, String cnmvStsCd, String cntrPsnStsCd, String chssUsgRto, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updUsrId = updUsrId;
		this.cntrPsnStsCd = cntrPsnStsCd;
		this.cnmvStsCd = cnmvStsCd;
		this.ibflag = ibflag;
		this.updDt = updDt;
		this.creDt = creDt;
		this.creUsrId = creUsrId;
		this.chssUsgRto = chssUsgRto;
		this.cntrDryRfIndCd = cntrDryRfIndCd;
		this.locCd = locCd;
		this.ydCd = ydCd;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cntr_psn_sts_cd", getCntrPsnStsCd());
		this.hashColumns.put("cnmv_sts_cd", getCnmvStsCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("chss_usg_rto", getChssUsgRto());
		this.hashColumns.put("cntr_dry_rf_ind_cd", getCntrDryRfIndCd());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cntr_psn_sts_cd", "cntrPsnStsCd");
		this.hashFields.put("cnmv_sts_cd", "cnmvStsCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("chss_usg_rto", "chssUsgRto");
		this.hashFields.put("cntr_dry_rf_ind_cd", "cntrDryRfIndCd");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getCntrPsnStsCd() {
		return this.cntrPsnStsCd;
	}
	public String getCnmvStsCd() {
		return this.cnmvStsCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getChssUsgRto() {
		return this.chssUsgRto;
	}
	public String getCntrDryRfIndCd() {
		return this.cntrDryRfIndCd;
	}
	public String getLocCd() {
		return this.locCd;
	}
	public String getYdCd() {
		return this.ydCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setCntrPsnStsCd(String cntrPsnStsCd) {
		this.cntrPsnStsCd = cntrPsnStsCd;
		//this.cntrPsnStsCd=true;
	}
	public void setCnmvStsCd(String cnmvStsCd) {
		this.cnmvStsCd = cnmvStsCd;
		//this.cnmvStsCd=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setChssUsgRto(String chssUsgRto) {
		this.chssUsgRto = chssUsgRto;
		//this.chssUsgRto=true;
	}
	public void setCntrDryRfIndCd(String cntrDryRfIndCd) {
		this.cntrDryRfIndCd = cntrDryRfIndCd;
		//this.cntrDryRfIndCd=true;
	}
	public void setLocCd(String locCd) {
		this.locCd = locCd;
		//this.locCd=true;
	}
	public void setYdCd(String ydCd) {
		this.ydCd = ydCd;
		//this.ydCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCntrPsnStsCd(JSPUtil.getParameter(request, "cntr_psn_sts_cd", ""));
		setCnmvStsCd(JSPUtil.getParameter(request, "cnmv_sts_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setChssUsgRto(JSPUtil.getParameter(request, "chss_usg_rto", ""));
		setCntrDryRfIndCd(JSPUtil.getParameter(request, "cntr_dry_rf_ind_cd", ""));
		setLocCd(JSPUtil.getParameter(request, "loc_cd", ""));
		setYdCd(JSPUtil.getParameter(request, "yd_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public CgmChssUtlLocUsgVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmChssUtlLocUsgVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmChssUtlLocUsgVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] cntrPsnStsCd = (JSPUtil.getParameter(request, prefix	+ "cntr_psn_sts_cd".trim(), length));
			String[] cnmvStsCd = (JSPUtil.getParameter(request, prefix	+ "cnmv_sts_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] chssUsgRto = (JSPUtil.getParameter(request, prefix	+ "chss_usg_rto".trim(), length));
			String[] cntrDryRfIndCd = (JSPUtil.getParameter(request, prefix	+ "cntr_dry_rf_ind_cd".trim(), length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd".trim(), length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmChssUtlLocUsgVO();
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (cntrPsnStsCd[i] != null)
					model.setCntrPsnStsCd(cntrPsnStsCd[i]);
				if (cnmvStsCd[i] != null)
					model.setCnmvStsCd(cnmvStsCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (chssUsgRto[i] != null)
					model.setChssUsgRto(chssUsgRto[i]);
				if (cntrDryRfIndCd[i] != null)
					model.setCntrDryRfIndCd(cntrDryRfIndCd[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmChssUtlLocUsgVOs();
	}

	public CgmChssUtlLocUsgVO[] getCgmChssUtlLocUsgVOs(){
		CgmChssUtlLocUsgVO[] vos = (CgmChssUtlLocUsgVO[])models.toArray(new CgmChssUtlLocUsgVO[models.size()]);
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
		this.cntrPsnStsCd = this.cntrPsnStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvStsCd = this.cnmvStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssUsgRto = this.chssUsgRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrDryRfIndCd = this.cntrDryRfIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
