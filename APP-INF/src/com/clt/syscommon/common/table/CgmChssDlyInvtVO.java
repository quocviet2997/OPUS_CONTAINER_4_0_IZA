/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmChssDlyInvtVO.java
*@FileTitle : CgmChssDlyInvtVO
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

public class CgmChssDlyInvtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmChssDlyInvtVO> models = new ArrayList<CgmChssDlyInvtVO>();
	
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String chss40ftQty = null;
	/* Column Info */
	private String smryDt = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String locCd = null;
	/* Column Info */
	private String chss20ftQty = null;
	/* Column Info */
	private String chss45ftQty = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmChssDlyInvtVO() {}

	public CgmChssDlyInvtVO(String ibflag, String pagerows, String smryDt, String locCd, String chss20ftQty, String chss40ftQty, String chss45ftQty, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updUsrId = updUsrId;
		this.chss40ftQty = chss40ftQty;
		this.smryDt = smryDt;
		this.ibflag = ibflag;
		this.updDt = updDt;
		this.creDt = creDt;
		this.creUsrId = creUsrId;
		this.locCd = locCd;
		this.chss20ftQty = chss20ftQty;
		this.chss45ftQty = chss45ftQty;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("chss_40ft_qty", getChss40ftQty());
		this.hashColumns.put("smry_dt", getSmryDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("chss_20ft_qty", getChss20ftQty());
		this.hashColumns.put("chss_45ft_qty", getChss45ftQty());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("chss_40ft_qty", "chss40ftQty");
		this.hashFields.put("smry_dt", "smryDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("chss_20ft_qty", "chss20ftQty");
		this.hashFields.put("chss_45ft_qty", "chss45ftQty");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getChss40ftQty() {
		return this.chss40ftQty;
	}
	public String getSmryDt() {
		return this.smryDt;
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
	public String getLocCd() {
		return this.locCd;
	}
	public String getChss20ftQty() {
		return this.chss20ftQty;
	}
	public String getChss45ftQty() {
		return this.chss45ftQty;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setChss40ftQty(String chss40ftQty) {
		this.chss40ftQty = chss40ftQty;
		//this.chss40ftQty=true;
	}
	public void setSmryDt(String smryDt) {
		this.smryDt = smryDt;
		//this.smryDt=true;
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
	public void setLocCd(String locCd) {
		this.locCd = locCd;
		//this.locCd=true;
	}
	public void setChss20ftQty(String chss20ftQty) {
		this.chss20ftQty = chss20ftQty;
		//this.chss20ftQty=true;
	}
	public void setChss45ftQty(String chss45ftQty) {
		this.chss45ftQty = chss45ftQty;
		//this.chss45ftQty=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setChss40ftQty(JSPUtil.getParameter(request, "chss_40ft_qty", ""));
		setSmryDt(JSPUtil.getParameter(request, "smry_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setLocCd(JSPUtil.getParameter(request, "loc_cd", ""));
		setChss20ftQty(JSPUtil.getParameter(request, "chss_20ft_qty", ""));
		setChss45ftQty(JSPUtil.getParameter(request, "chss_45ft_qty", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public CgmChssDlyInvtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmChssDlyInvtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmChssDlyInvtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] chss40ftQty = (JSPUtil.getParameter(request, prefix	+ "chss_40ft_qty".trim(), length));
			String[] smryDt = (JSPUtil.getParameter(request, prefix	+ "smry_dt".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd".trim(), length));
			String[] chss20ftQty = (JSPUtil.getParameter(request, prefix	+ "chss_20ft_qty".trim(), length));
			String[] chss45ftQty = (JSPUtil.getParameter(request, prefix	+ "chss_45ft_qty".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmChssDlyInvtVO();
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (chss40ftQty[i] != null)
					model.setChss40ftQty(chss40ftQty[i]);
				if (smryDt[i] != null)
					model.setSmryDt(smryDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (chss20ftQty[i] != null)
					model.setChss20ftQty(chss20ftQty[i]);
				if (chss45ftQty[i] != null)
					model.setChss45ftQty(chss45ftQty[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmChssDlyInvtVOs();
	}

	public CgmChssDlyInvtVO[] getCgmChssDlyInvtVOs(){
		CgmChssDlyInvtVO[] vos = (CgmChssDlyInvtVO[])models.toArray(new CgmChssDlyInvtVO[models.size()]);
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
		this.chss40ftQty = this.chss40ftQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.smryDt = this.smryDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chss20ftQty = this.chss20ftQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chss45ftQty = this.chss45ftQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
