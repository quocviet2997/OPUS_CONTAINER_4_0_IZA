/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : VskPortGngStrcVO.java
*@FileTitle : VskPortGngStrcVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.29
*@LastModifier : 장석현
*@LastVersion : 1.0
* 2009.05.29 장석현 
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

public class VskPortGngStrcVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<VskPortGngStrcVO> models = new ArrayList<VskPortGngStrcVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String gngWrkEndHrmnt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String gngNworkEndHrmnt = null;
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
	private String gngWrkStHrmnt = null;
	/* Column Info */
	private String gngNworkStHrmnt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String gngRmk = null;

	/*	Table Column name으로 맴버변수 value 담는다*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	Table Column name으로 맴버변수 name 	담는다*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public VskPortGngStrcVO() {}

	public VskPortGngStrcVO(String ibflag, String pagerows, String locCd, String crnSeq, String gngWrkStHrmnt, String gngWrkEndHrmnt, String gngNworkStHrmnt, String gngNworkEndHrmnt, String gngRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.gngWrkEndHrmnt = gngWrkEndHrmnt;
		this.creDt = creDt;
		this.gngNworkEndHrmnt = gngNworkEndHrmnt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.locCd = locCd;
		this.creUsrId = creUsrId;
		this.crnSeq = crnSeq;
		this.gngWrkStHrmnt = gngWrkStHrmnt;
		this.gngNworkStHrmnt = gngNworkStHrmnt;
		this.updUsrId = updUsrId;
		this.gngRmk = gngRmk;
	}
	
	/**
	 * Table Column name 으로 맴버변수에 value를 리턴한다.
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("gng_wrk_end_hrmnt", getGngWrkEndHrmnt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("gng_nwork_end_hrmnt", getGngNworkEndHrmnt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("crn_seq", getCrnSeq());
		this.hashColumns.put("crn_view_seq", getCrnViewSeq());
		this.hashColumns.put("gng_wrk_st_hrmnt", getGngWrkStHrmnt());
		this.hashColumns.put("gng_nwork_st_hrmnt", getGngNworkStHrmnt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("gng_rmk", getGngRmk());
		return this.hashColumns;
	}
	
	/**
	 * Table Column name 으로 맴버변수를 호출한다
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("gng_wrk_end_hrmnt", "gngWrkEndHrmnt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("gng_nwork_end_hrmnt", "gngNworkEndHrmnt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("crn_seq", "crnSeq");
		this.hashFields.put("crn_view_seq", "crnViewSeq");
		this.hashFields.put("gng_wrk_st_hrmnt", "gngWrkStHrmnt");
		this.hashFields.put("gng_nwork_st_hrmnt", "gngNworkStHrmnt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("gng_rmk", "gngRmk");
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
	 * @return gngWrkEndHrmnt
	 */
	public String getGngWrkEndHrmnt() {
		return this.gngWrkEndHrmnt;
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
	 * @return gngNworkEndHrmnt
	 */
	public String getGngNworkEndHrmnt() {
		return this.gngNworkEndHrmnt;
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
	 * @return gngWrkStHrmnt
	 */
	public String getGngWrkStHrmnt() {
		return this.gngWrkStHrmnt;
	}
	
	/**
	 * Column Info
	 * @return gngNworkStHrmnt
	 */
	public String getGngNworkStHrmnt() {
		return this.gngNworkStHrmnt;
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
	 * @return gngRmk
	 */
	public String getGngRmk() {
		return this.gngRmk;
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
	 * @param gngWrkEndHrmnt
	 */
	public void setGngWrkEndHrmnt(String gngWrkEndHrmnt) {
		this.gngWrkEndHrmnt = gngWrkEndHrmnt;
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
	 * @param gngNworkEndHrmnt
	 */
	public void setGngNworkEndHrmnt(String gngNworkEndHrmnt) {
		this.gngNworkEndHrmnt = gngNworkEndHrmnt;
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
	 * @param gngWrkStHrmnt
	 */
	public void setGngWrkStHrmnt(String gngWrkStHrmnt) {
		this.gngWrkStHrmnt = gngWrkStHrmnt;
	}
	
	/**
	 * Column Info
	 * @param gngNworkStHrmnt
	 */
	public void setGngNworkStHrmnt(String gngNworkStHrmnt) {
		this.gngNworkStHrmnt = gngNworkStHrmnt;
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
	 * @param gngRmk
	 */
	public void setGngRmk(String gngRmk) {
		this.gngRmk = gngRmk;
	}
	
	/**
	 * Request 넘어온 단건 DATA를 VO Class 에 담는다. 
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setGngWrkEndHrmnt(JSPUtil.getParameter(request, "gng_wrk_end_hrmnt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setGngNworkEndHrmnt(JSPUtil.getParameter(request, "gng_nwork_end_hrmnt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setLocCd(JSPUtil.getParameter(request, "loc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCrnSeq(JSPUtil.getParameter(request, "crn_seq", ""));
		setCrnViewSeq(JSPUtil.getParameter(request, "crn_view_seq", ""));
		setGngWrkStHrmnt(JSPUtil.getParameter(request, "gng_wrk_st_hrmnt", ""));
		setGngNworkStHrmnt(JSPUtil.getParameter(request, "gng_nwork_st_hrmnt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setGngRmk(JSPUtil.getParameter(request, "gng_rmk", ""));
	}

	/**
	 * Request를 VO Class를 담는다.
	 * @param request
	 * @return VskPortGngStrcVO[]
	 */
	public VskPortGngStrcVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return VskPortGngStrcVO[]
	 */
	public VskPortGngStrcVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		VskPortGngStrcVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] gngWrkEndHrmnt = (JSPUtil.getParameter(request, prefix	+ "gng_wrk_end_hrmnt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] gngNworkEndHrmnt = (JSPUtil.getParameter(request, prefix	+ "gng_nwork_end_hrmnt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] crnSeq = (JSPUtil.getParameter(request, prefix	+ "crn_seq".trim(), length));
			String[] crnViewSeq = (JSPUtil.getParameter(request, prefix	+ "crn_view_seq".trim(), length));
			String[] gngWrkStHrmnt = (JSPUtil.getParameter(request, prefix	+ "gng_wrk_st_hrmnt".trim(), length));
			String[] gngNworkStHrmnt = (JSPUtil.getParameter(request, prefix	+ "gng_nwork_st_hrmnt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] gngRmk = (JSPUtil.getParameter(request, prefix	+ "gng_rmk".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new VskPortGngStrcVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (gngWrkEndHrmnt[i] != null)
					model.setGngWrkEndHrmnt(gngWrkEndHrmnt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (gngNworkEndHrmnt[i] != null)
					model.setGngNworkEndHrmnt(gngNworkEndHrmnt[i]);
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
				if (gngWrkStHrmnt[i] != null)
					model.setGngWrkStHrmnt(gngWrkStHrmnt[i]);
				if (gngNworkStHrmnt[i] != null)
					model.setGngNworkStHrmnt(gngNworkStHrmnt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (gngRmk[i] != null)
					model.setGngRmk(gngRmk[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getVskPortGngStrcVOs();
	}

	/**
	 * 여러 VO Calss를 배열화 한다 
	 * @return VskPortGngStrcVO[]
	 */
	public VskPortGngStrcVO[] getVskPortGngStrcVOs(){
		VskPortGngStrcVO[] vos = (VskPortGngStrcVO[])models.toArray(new VskPortGngStrcVO[models.size()]);
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
		this.gngWrkEndHrmnt = this.gngWrkEndHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gngNworkEndHrmnt = this.gngNworkEndHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crnSeq = this.crnSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gngWrkStHrmnt = this.gngWrkStHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gngNworkStHrmnt = this.gngNworkStHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gngRmk = this.gngRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
