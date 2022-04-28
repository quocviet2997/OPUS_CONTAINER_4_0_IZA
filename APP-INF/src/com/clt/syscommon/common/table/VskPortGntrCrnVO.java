/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : VskPortGntrCrnVO.java
*@FileTitle : VskPortGntrCrnVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.25
*@LastModifier : 장석현
*@LastVersion : 1.0
* 2009.05.25 장석현 
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

public class VskPortGntrCrnVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<VskPortGntrCrnVO> models = new ArrayList<VskPortGntrCrnVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String netMaxWgt = null;
	/* Column Info */
	private String cntrTrKnt = null;
	/* Column Info */
	private String vslGntrCrnMaxQty = null;
	/* Column Info */
	private String gntrRmk = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String grsMaxWgt = null;
	/* Page Number */
	private String pagerows = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String ydCd = null;
	/* Column Info */
	private String ttlGntrCrnQty = null;
	/* Column Info */
	private String clrBtwnLegWdt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String crnRchRowKnt = null;

	/*	Table Column name으로 맴버변수 value 담는다*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	Table Column name으로 맴버변수 name 	담는다*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public VskPortGntrCrnVO() {}

	public VskPortGntrCrnVO(String ibflag, String pagerows, String ydCd, String grsMaxWgt, String netMaxWgt, String clrBtwnLegWdt, String crnRchRowKnt, String cntrTrKnt, String ttlGntrCrnQty, String vslGntrCrnMaxQty, String gntrRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.netMaxWgt = netMaxWgt;
		this.cntrTrKnt = cntrTrKnt;
		this.vslGntrCrnMaxQty = vslGntrCrnMaxQty;
		this.gntrRmk = gntrRmk;
		this.creDt = creDt;
		this.grsMaxWgt = grsMaxWgt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.ydCd = ydCd;
		this.ttlGntrCrnQty = ttlGntrCrnQty;
		this.clrBtwnLegWdt = clrBtwnLegWdt;
		this.updUsrId = updUsrId;
		this.crnRchRowKnt = crnRchRowKnt;
	}
	
	/**
	 * Table Column name 으로 맴버변수에 value를 리턴한다.
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("net_max_wgt", getNetMaxWgt());
		this.hashColumns.put("cntr_tr_knt", getCntrTrKnt());
		this.hashColumns.put("vsl_gntr_crn_max_qty", getVslGntrCrnMaxQty());
		this.hashColumns.put("gntr_rmk", getGntrRmk());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("grs_max_wgt", getGrsMaxWgt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("ttl_gntr_crn_qty", getTtlGntrCrnQty());
		this.hashColumns.put("clr_btwn_leg_wdt", getClrBtwnLegWdt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("crn_rch_row_knt", getCrnRchRowKnt());
		return this.hashColumns;
	}
	
	/**
	 * Table Column name 으로 맴버변수를 호출한다
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("net_max_wgt", "netMaxWgt");
		this.hashFields.put("cntr_tr_knt", "cntrTrKnt");
		this.hashFields.put("vsl_gntr_crn_max_qty", "vslGntrCrnMaxQty");
		this.hashFields.put("gntr_rmk", "gntrRmk");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("grs_max_wgt", "grsMaxWgt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("ttl_gntr_crn_qty", "ttlGntrCrnQty");
		this.hashFields.put("clr_btwn_leg_wdt", "clrBtwnLegWdt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("crn_rch_row_knt", "crnRchRowKnt");
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
	 * @return netMaxWgt
	 */
	public String getNetMaxWgt() {
		return this.netMaxWgt;
	}
	
	/**
	 * Column Info
	 * @return cntrTrKnt
	 */
	public String getCntrTrKnt() {
		return this.cntrTrKnt;
	}
	
	/**
	 * Column Info
	 * @return vslGntrCrnMaxQty
	 */
	public String getVslGntrCrnMaxQty() {
		return this.vslGntrCrnMaxQty;
	}
	
	/**
	 * Column Info
	 * @return gntrRmk
	 */
	public String getGntrRmk() {
		return this.gntrRmk;
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
	 * @return grsMaxWgt
	 */
	public String getGrsMaxWgt() {
		return this.grsMaxWgt;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return ydCd
	 */
	public String getYdCd() {
		return this.ydCd;
	}
	
	/**
	 * Column Info
	 * @return ttlGntrCrnQty
	 */
	public String getTtlGntrCrnQty() {
		return this.ttlGntrCrnQty;
	}
	
	/**
	 * Column Info
	 * @return clrBtwnLegWdt
	 */
	public String getClrBtwnLegWdt() {
		return this.clrBtwnLegWdt;
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
	 * @return crnRchRowKnt
	 */
	public String getCrnRchRowKnt() {
		return this.crnRchRowKnt;
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
	 * @param netMaxWgt
	 */
	public void setNetMaxWgt(String netMaxWgt) {
		this.netMaxWgt = netMaxWgt;
	}
	
	/**
	 * Column Info
	 * @param cntrTrKnt
	 */
	public void setCntrTrKnt(String cntrTrKnt) {
		this.cntrTrKnt = cntrTrKnt;
	}
	
	/**
	 * Column Info
	 * @param vslGntrCrnMaxQty
	 */
	public void setVslGntrCrnMaxQty(String vslGntrCrnMaxQty) {
		this.vslGntrCrnMaxQty = vslGntrCrnMaxQty;
	}
	
	/**
	 * Column Info
	 * @param gntrRmk
	 */
	public void setGntrRmk(String gntrRmk) {
		this.gntrRmk = gntrRmk;
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
	 * @param grsMaxWgt
	 */
	public void setGrsMaxWgt(String grsMaxWgt) {
		this.grsMaxWgt = grsMaxWgt;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param ydCd
	 */
	public void setYdCd(String ydCd) {
		this.ydCd = ydCd;
	}
	
	/**
	 * Column Info
	 * @param ttlGntrCrnQty
	 */
	public void setTtlGntrCrnQty(String ttlGntrCrnQty) {
		this.ttlGntrCrnQty = ttlGntrCrnQty;
	}
	
	/**
	 * Column Info
	 * @param clrBtwnLegWdt
	 */
	public void setClrBtwnLegWdt(String clrBtwnLegWdt) {
		this.clrBtwnLegWdt = clrBtwnLegWdt;
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
	 * @param crnRchRowKnt
	 */
	public void setCrnRchRowKnt(String crnRchRowKnt) {
		this.crnRchRowKnt = crnRchRowKnt;
	}
	
	/**
	 * Request 넘어온 단건 DATA를 VO Class 에 담는다. 
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setNetMaxWgt(JSPUtil.getParameter(request, "net_max_wgt", ""));
		setCntrTrKnt(JSPUtil.getParameter(request, "cntr_tr_knt", ""));
		setVslGntrCrnMaxQty(JSPUtil.getParameter(request, "vsl_gntr_crn_max_qty", ""));
		setGntrRmk(JSPUtil.getParameter(request, "gntr_rmk", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setGrsMaxWgt(JSPUtil.getParameter(request, "grs_max_wgt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setYdCd(JSPUtil.getParameter(request, "yd_cd", ""));
		setTtlGntrCrnQty(JSPUtil.getParameter(request, "ttl_gntr_crn_qty", ""));
		setClrBtwnLegWdt(JSPUtil.getParameter(request, "clr_btwn_leg_wdt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCrnRchRowKnt(JSPUtil.getParameter(request, "crn_rch_row_knt", ""));
	}

	/**
	 * Request를 VO Class를 담는다.
	 * @param request
	 * @return VskPortGntrCrnVO[]
	 */
	public VskPortGntrCrnVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return VskPortGntrCrnVO[]
	 */
	public VskPortGntrCrnVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		VskPortGntrCrnVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] netMaxWgt = (JSPUtil.getParameter(request, prefix	+ "net_max_wgt".trim(), length));
			String[] cntrTrKnt = (JSPUtil.getParameter(request, prefix	+ "cntr_tr_knt".trim(), length));
			String[] vslGntrCrnMaxQty = (JSPUtil.getParameter(request, prefix	+ "vsl_gntr_crn_max_qty".trim(), length));
			String[] gntrRmk = (JSPUtil.getParameter(request, prefix	+ "gntr_rmk".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] grsMaxWgt = (JSPUtil.getParameter(request, prefix	+ "grs_max_wgt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd".trim(), length));
			String[] ttlGntrCrnQty = (JSPUtil.getParameter(request, prefix	+ "ttl_gntr_crn_qty".trim(), length));
			String[] clrBtwnLegWdt = (JSPUtil.getParameter(request, prefix	+ "clr_btwn_leg_wdt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] crnRchRowKnt = (JSPUtil.getParameter(request, prefix	+ "crn_rch_row_knt".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new VskPortGntrCrnVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (netMaxWgt[i] != null)
					model.setNetMaxWgt(netMaxWgt[i]);
				if (cntrTrKnt[i] != null)
					model.setCntrTrKnt(cntrTrKnt[i]);
				if (vslGntrCrnMaxQty[i] != null)
					model.setVslGntrCrnMaxQty(vslGntrCrnMaxQty[i]);
				if (gntrRmk[i] != null)
					model.setGntrRmk(gntrRmk[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (grsMaxWgt[i] != null)
					model.setGrsMaxWgt(grsMaxWgt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (ttlGntrCrnQty[i] != null)
					model.setTtlGntrCrnQty(ttlGntrCrnQty[i]);
				if (clrBtwnLegWdt[i] != null)
					model.setClrBtwnLegWdt(clrBtwnLegWdt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (crnRchRowKnt[i] != null)
					model.setCrnRchRowKnt(crnRchRowKnt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getVskPortGntrCrnVOs();
	}

	/**
	 * 여러 VO Calss를 배열화 한다 
	 * @return VskPortGntrCrnVO[]
	 */
	public VskPortGntrCrnVO[] getVskPortGntrCrnVOs(){
		VskPortGntrCrnVO[] vos = (VskPortGntrCrnVO[])models.toArray(new VskPortGntrCrnVO[models.size()]);
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
		this.netMaxWgt = this.netMaxWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTrKnt = this.cntrTrKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslGntrCrnMaxQty = this.vslGntrCrnMaxQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gntrRmk = this.gntrRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsMaxWgt = this.grsMaxWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlGntrCrnQty = this.ttlGntrCrnQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clrBtwnLegWdt = this.clrBtwnLegWdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crnRchRowKnt = this.crnRchRowKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
