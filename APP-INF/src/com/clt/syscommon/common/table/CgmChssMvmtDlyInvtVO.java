/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmChssMvmtDlyInvtVO.java
*@FileTitle : CgmChssMvmtDlyInvtVO
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

public class CgmChssMvmtDlyInvtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmChssMvmtDlyInvtVO> models = new ArrayList<CgmChssMvmtDlyInvtVO>();
	
	/* Column Info */
	private String cntrPsnStsCd = null;
	/* Column Info */
	private String chss20ftVolQty = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String chss40ftVolQty = null;
	/* Column Info */
	private String chss45ftVolQty = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String cnmvStsCd = null;
	/* Column Info */
	private String smryDt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String locCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmChssMvmtDlyInvtVO() {}

	public CgmChssMvmtDlyInvtVO(String ibflag, String pagerows, String smryDt, String locCd, String cnmvStsCd, String cntrPsnStsCd, String chss20ftVolQty, String chss40ftVolQty, String chss45ftVolQty, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.cntrPsnStsCd = cntrPsnStsCd;
		this.chss20ftVolQty = chss20ftVolQty;
		this.ibflag = ibflag;
		this.chss40ftVolQty = chss40ftVolQty;
		this.chss45ftVolQty = chss45ftVolQty;
		this.updUsrId = updUsrId;
		this.cnmvStsCd = cnmvStsCd;
		this.smryDt = smryDt;
		this.updDt = updDt;
		this.creDt = creDt;
		this.locCd = locCd;
		this.creUsrId = creUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cntr_psn_sts_cd", getCntrPsnStsCd());
		this.hashColumns.put("chss_20ft_vol_qty", getChss20ftVolQty());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("chss_40ft_vol_qty", getChss40ftVolQty());
		this.hashColumns.put("chss_45ft_vol_qty", getChss45ftVolQty());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cnmv_sts_cd", getCnmvStsCd());
		this.hashColumns.put("smry_dt", getSmryDt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cntr_psn_sts_cd", "cntrPsnStsCd");
		this.hashFields.put("chss_20ft_vol_qty", "chss20ftVolQty");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("chss_40ft_vol_qty", "chss40ftVolQty");
		this.hashFields.put("chss_45ft_vol_qty", "chss45ftVolQty");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cnmv_sts_cd", "cnmvStsCd");
		this.hashFields.put("smry_dt", "smryDt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getCntrPsnStsCd() {
		return this.cntrPsnStsCd;
	}
	public String getChss20ftVolQty() {
		return this.chss20ftVolQty;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getChss40ftVolQty() {
		return this.chss40ftVolQty;
	}
	public String getChss45ftVolQty() {
		return this.chss45ftVolQty;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getCnmvStsCd() {
		return this.cnmvStsCd;
	}
	public String getSmryDt() {
		return this.smryDt;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getLocCd() {
		return this.locCd;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setCntrPsnStsCd(String cntrPsnStsCd) {
		this.cntrPsnStsCd = cntrPsnStsCd;
		//this.cntrPsnStsCd=true;
	}
	public void setChss20ftVolQty(String chss20ftVolQty) {
		this.chss20ftVolQty = chss20ftVolQty;
		//this.chss20ftVolQty=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setChss40ftVolQty(String chss40ftVolQty) {
		this.chss40ftVolQty = chss40ftVolQty;
		//this.chss40ftVolQty=true;
	}
	public void setChss45ftVolQty(String chss45ftVolQty) {
		this.chss45ftVolQty = chss45ftVolQty;
		//this.chss45ftVolQty=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setCnmvStsCd(String cnmvStsCd) {
		this.cnmvStsCd = cnmvStsCd;
		//this.cnmvStsCd=true;
	}
	public void setSmryDt(String smryDt) {
		this.smryDt = smryDt;
		//this.smryDt=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setLocCd(String locCd) {
		this.locCd = locCd;
		//this.locCd=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setCntrPsnStsCd(JSPUtil.getParameter(request, "cntr_psn_sts_cd", ""));
		setChss20ftVolQty(JSPUtil.getParameter(request, "chss_20ft_vol_qty", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setChss40ftVolQty(JSPUtil.getParameter(request, "chss_40ft_vol_qty", ""));
		setChss45ftVolQty(JSPUtil.getParameter(request, "chss_45ft_vol_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCnmvStsCd(JSPUtil.getParameter(request, "cnmv_sts_cd", ""));
		setSmryDt(JSPUtil.getParameter(request, "smry_dt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setLocCd(JSPUtil.getParameter(request, "loc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public CgmChssMvmtDlyInvtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmChssMvmtDlyInvtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmChssMvmtDlyInvtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cntrPsnStsCd = (JSPUtil.getParameter(request, prefix	+ "cntr_psn_sts_cd".trim(), length));
			String[] chss20ftVolQty = (JSPUtil.getParameter(request, prefix	+ "chss_20ft_vol_qty".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] chss40ftVolQty = (JSPUtil.getParameter(request, prefix	+ "chss_40ft_vol_qty".trim(), length));
			String[] chss45ftVolQty = (JSPUtil.getParameter(request, prefix	+ "chss_45ft_vol_qty".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] cnmvStsCd = (JSPUtil.getParameter(request, prefix	+ "cnmv_sts_cd".trim(), length));
			String[] smryDt = (JSPUtil.getParameter(request, prefix	+ "smry_dt".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmChssMvmtDlyInvtVO();
				if (cntrPsnStsCd[i] != null)
					model.setCntrPsnStsCd(cntrPsnStsCd[i]);
				if (chss20ftVolQty[i] != null)
					model.setChss20ftVolQty(chss20ftVolQty[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (chss40ftVolQty[i] != null)
					model.setChss40ftVolQty(chss40ftVolQty[i]);
				if (chss45ftVolQty[i] != null)
					model.setChss45ftVolQty(chss45ftVolQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (cnmvStsCd[i] != null)
					model.setCnmvStsCd(cnmvStsCd[i]);
				if (smryDt[i] != null)
					model.setSmryDt(smryDt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmChssMvmtDlyInvtVOs();
	}

	public CgmChssMvmtDlyInvtVO[] getCgmChssMvmtDlyInvtVOs(){
		CgmChssMvmtDlyInvtVO[] vos = (CgmChssMvmtDlyInvtVO[])models.toArray(new CgmChssMvmtDlyInvtVO[models.size()]);
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
		this.cntrPsnStsCd = this.cntrPsnStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chss20ftVolQty = this.chss20ftVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chss40ftVolQty = this.chss40ftVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chss45ftVolQty = this.chss45ftVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvStsCd = this.cnmvStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.smryDt = this.smryDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
