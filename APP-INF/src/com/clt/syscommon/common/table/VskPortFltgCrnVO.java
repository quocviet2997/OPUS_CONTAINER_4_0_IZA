/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : VskPortFltgCrnVO.java
*@FileTitle : VskPortFltgCrnVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.28
*@LastModifier : 장석현
*@LastVersion : 1.0
* 2009.05.28 장석현 
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
 * @author 장석현
 * @since J2EE 1.5
 * @see AbstractValueObject
 */

public class VskPortFltgCrnVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<VskPortFltgCrnVO> models = new ArrayList<VskPortFltgCrnVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String fltgRmk = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String hndlCostRmk = null;
	/* Page Number */
	private String pagerows = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String locCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String crnSeq = null;
	
	/* Column Info */
	private String crnViewSeq = null;
	
	/* Column Info */
	private String maxRchLen = null;
	/* Column Info */
	private String maxHndlCgoWgt = null;
	/* Column Info */
	private String maxHndlCgoHgt = null;
	/* Column Info */
	private String updUsrId = null;

	/*	Table Column name으로 맴버변수 value 담는다*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	Table Column name으로 맴버변수 name 	담는다*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public VskPortFltgCrnVO() {}

	public VskPortFltgCrnVO(String ibflag, String pagerows, String locCd, String crnSeq, String maxHndlCgoWgt, String maxHndlCgoHgt, String maxRchLen, String hndlCostRmk, String fltgRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.fltgRmk = fltgRmk;
		this.creDt = creDt;
		this.hndlCostRmk = hndlCostRmk;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.locCd = locCd;
		this.creUsrId = creUsrId;
		this.crnSeq = crnSeq;
		this.maxRchLen = maxRchLen;
		this.maxHndlCgoWgt = maxHndlCgoWgt;
		this.maxHndlCgoHgt = maxHndlCgoHgt;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Table Column name 으로 맴버변수에 value를 리턴한다.
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("fltg_rmk", getFltgRmk());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("hndl_cost_rmk", getHndlCostRmk());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("crn_seq", getCrnSeq());
		this.hashColumns.put("crn_view_seq", getCrnViewSeq());
		this.hashColumns.put("max_rch_len", getMaxRchLen());
		this.hashColumns.put("max_hndl_cgo_wgt", getMaxHndlCgoWgt());
		this.hashColumns.put("max_hndl_cgo_hgt", getMaxHndlCgoHgt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * Table Column name 으로 맴버변수를 호출한다
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("fltg_rmk", "fltgRmk");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("hndl_cost_rmk", "hndlCostRmk");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("crn_seq", "crnSeq");
		this.hashFields.put("crn_view_seq", "crnViewSeq");
		this.hashFields.put("max_rch_len", "maxRchLen");
		this.hashFields.put("max_hndl_cgo_wgt", "maxHndlCgoWgt");
		this.hashFields.put("max_hndl_cgo_hgt", "maxHndlCgoHgt");
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
	 * @return fltgRmk
	 */
	public String getFltgRmk() {
		return this.fltgRmk;
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
	 * @return hndlCostRmk
	 */
	public String getHndlCostRmk() {
		return this.hndlCostRmk;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}
	
	/**
	 * Status
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return locCd
	 */
	public String getLocCd() {
		return this.locCd;
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
	 * @return crnSeq
	 */
	public String getCrnSeq() {
		return this.crnSeq;
	}
	
	/**
	 * Column Info
	 * @return crnViewSeq
	 */
	public String getCrnViewSeq() {
		return this.crnViewSeq;
	}	
	
	/**
	 * Column Info
	 * @return maxRchLen
	 */
	public String getMaxRchLen() {
		return this.maxRchLen;
	}
	
	/**
	 * Column Info
	 * @return maxHndlCgoWgt
	 */
	public String getMaxHndlCgoWgt() {
		return this.maxHndlCgoWgt;
	}
	
	/**
	 * Column Info
	 * @return maxHndlCgoHgt
	 */
	public String getMaxHndlCgoHgt() {
		return this.maxHndlCgoHgt;
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
	 * @param fltgRmk
	 */
	public void setFltgRmk(String fltgRmk) {
		this.fltgRmk = fltgRmk;
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
	 * @param hndlCostRmk
	 */
	public void setHndlCostRmk(String hndlCostRmk) {
		this.hndlCostRmk = hndlCostRmk;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Status
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param locCd
	 */
	public void setLocCd(String locCd) {
		this.locCd = locCd;
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
	 * @param crnSeq
	 */
	public void setCrnSeq(String crnSeq) {
		this.crnSeq = crnSeq;
	}
	/**
	 * Column Info
	 * @param crnViewSeq
	 */
	public void setCrnViewSeq(String crnViewSeq) {
		this.crnViewSeq = crnViewSeq;
	}	
	
	/**
	 * Column Info
	 * @param maxRchLen
	 */
	public void setMaxRchLen(String maxRchLen) {
		this.maxRchLen = maxRchLen;
	}
	
	/**
	 * Column Info
	 * @param maxHndlCgoWgt
	 */
	public void setMaxHndlCgoWgt(String maxHndlCgoWgt) {
		this.maxHndlCgoWgt = maxHndlCgoWgt;
	}
	
	/**
	 * Column Info
	 * @param maxHndlCgoHgt
	 */
	public void setMaxHndlCgoHgt(String maxHndlCgoHgt) {
		this.maxHndlCgoHgt = maxHndlCgoHgt;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Request 넘어온 단건 DATA를 VO Class 에 담는다. 
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setFltgRmk(JSPUtil.getParameter(request, "fltg_rmk", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setHndlCostRmk(JSPUtil.getParameter(request, "hndl_cost_rmk", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setLocCd(JSPUtil.getParameter(request, "loc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCrnSeq(JSPUtil.getParameter(request, "crn_seq", ""));
		setCrnViewSeq(JSPUtil.getParameter(request, "crn_view_seq", ""));
		setMaxRchLen(JSPUtil.getParameter(request, "max_rch_len", ""));
		setMaxHndlCgoWgt(JSPUtil.getParameter(request, "max_hndl_cgo_wgt", ""));
		setMaxHndlCgoHgt(JSPUtil.getParameter(request, "max_hndl_cgo_hgt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request를 VO Class를 담는다.
	 * @param request
	 * @return VskPortFltgCrnVO[]
	 */
	public VskPortFltgCrnVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return VskPortFltgCrnVO[]
	 */
	public VskPortFltgCrnVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		VskPortFltgCrnVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] fltgRmk = (JSPUtil.getParameter(request, prefix	+ "fltg_rmk".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] hndlCostRmk = (JSPUtil.getParameter(request, prefix	+ "hndl_cost_rmk".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] crnSeq = (JSPUtil.getParameter(request, prefix	+ "crn_seq".trim(), length));
			String[] crnViewSeq = (JSPUtil.getParameter(request, prefix	+ "crn_view_seq".trim(), length));
			String[] maxRchLen = (JSPUtil.getParameter(request, prefix	+ "max_rch_len".trim(), length));
			String[] maxHndlCgoWgt = (JSPUtil.getParameter(request, prefix	+ "max_hndl_cgo_wgt".trim(), length));
			String[] maxHndlCgoHgt = (JSPUtil.getParameter(request, prefix	+ "max_hndl_cgo_hgt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new VskPortFltgCrnVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (fltgRmk[i] != null)
					model.setFltgRmk(fltgRmk[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (hndlCostRmk[i] != null)
					model.setHndlCostRmk(hndlCostRmk[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (crnSeq[i] != null)
					model.setCrnSeq(crnSeq[i]);
				if (crnViewSeq[i] != null)
					model.setCrnViewSeq(crnViewSeq[i]);
				
				if (maxRchLen[i] != null)
					model.setMaxRchLen(maxRchLen[i]);
				if (maxHndlCgoWgt[i] != null)
					model.setMaxHndlCgoWgt(maxHndlCgoWgt[i]);
				if (maxHndlCgoHgt[i] != null)
					model.setMaxHndlCgoHgt(maxHndlCgoHgt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getVskPortFltgCrnVOs();
	}

	/**
	 * 여러 VO Calss를 배열화 한다 
	 * @return VskPortFltgCrnVO[]
	 */
	public VskPortFltgCrnVO[] getVskPortFltgCrnVOs(){
		VskPortFltgCrnVO[] vos = (VskPortFltgCrnVO[])models.toArray(new VskPortFltgCrnVO[models.size()]);
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
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = getFieldCatct(field, i, arr);
		}
		return arr;
	}
	
	/**
	 * getField 에서 catch문에 대한 로직
	 * @param field
	 * @param i
	 * @param arr
	 * @return arr
	 */
	private String[] getFieldCatct(Field[] field, int i, String[] arr) {
		try {
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		} catch (IllegalAccessException e) {
			return null;
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void unDataFormat(){
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fltgRmk = this.fltgRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hndlCostRmk = this.hndlCostRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crnSeq = this.crnSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxRchLen = this.maxRchLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxHndlCgoWgt = this.maxHndlCgoWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxHndlCgoHgt = this.maxHndlCgoHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
