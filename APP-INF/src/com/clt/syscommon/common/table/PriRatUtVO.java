/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PriRatUtVO.java
*@FileTitle : PriRatUtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.11
*@LastModifier : 이승준
*@LastVersion : 1.0
* 2009.05.11 이승준 
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
 * @author 이승준
 * @since J2EE 1.5
 * @see ..
 */

public class PriRatUtVO extends AbstractValueObject {

private static final long serialVersionUID = 1L;
	
	private Collection<PriRatUtVO> models = new ArrayList<PriRatUtVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String cntrWgt = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String ratUtDesc = null;
	/* Column Info */
	private String cntrSzCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String ratUtGrpCd = null;
	/* Column Info */
	private String cntrWdt = null;
	/* Column Info */
	private String ratUtCd = null;
	/* Column Info */
	private String cntrHgt = null;
	/* Page Number */
	private String pagerows = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String ctrtUseOnyFlg = null;
	/* Column Info */
	private String cntrLen = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String fDeltFlg = null;

	/*	Table Column name으로 맴버변수 value 담는다*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	Table Column name으로 맴버변수 name 	담는다*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriRatUtVO() {}

	public PriRatUtVO(String ibflag, String pagerows, String ratUtCd, String ratUtDesc, String ratUtGrpCd, String cntrSzCd, String cntrLen, String cntrWdt, String cntrHgt, String cntrWgt, String deltFlg, String ctrtUseOnyFlg, String creUsrId, String creDt, String updUsrId, String updDt, String fDeltFlg) {
		this.updDt = updDt;
		this.cntrWgt = cntrWgt;
		this.deltFlg = deltFlg;
		this.ratUtDesc = ratUtDesc;
		this.cntrSzCd = cntrSzCd;
		this.creDt = creDt;
		this.ratUtGrpCd = ratUtGrpCd;
		this.cntrWdt = cntrWdt;
		this.ratUtCd = ratUtCd;
		this.cntrHgt = cntrHgt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.ctrtUseOnyFlg = ctrtUseOnyFlg;
		this.cntrLen = cntrLen;
		this.updUsrId = updUsrId;
		this.fDeltFlg = fDeltFlg;
	}
	
	/**
	 * Table Column name 으로 맴버변수에 value를 리턴한다.
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cntr_wgt", getCntrWgt());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("rat_ut_desc", getRatUtDesc());
		this.hashColumns.put("cntr_sz_cd", getCntrSzCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rat_ut_grp_cd", getRatUtGrpCd());
		this.hashColumns.put("cntr_wdt", getCntrWdt());
		this.hashColumns.put("rat_ut_cd", getRatUtCd());
		this.hashColumns.put("cntr_hgt", getCntrHgt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ctrt_use_ony_flg", getCtrtUseOnyFlg());
		this.hashColumns.put("cntr_len", getCntrLen());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("f_delt_flg", getFDeltFlg());
		return this.hashColumns;
	}
	
	/**
	 * Table Column name 으로 맴버변수를 호출한다
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cntr_wgt", "cntrWgt");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("rat_ut_desc", "ratUtDesc");
		this.hashFields.put("cntr_sz_cd", "cntrSzCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rat_ut_grp_cd", "ratUtGrpCd");
		this.hashFields.put("cntr_wdt", "cntrWdt");
		this.hashFields.put("rat_ut_cd", "ratUtCd");
		this.hashFields.put("cntr_hgt", "cntrHgt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ctrt_use_ony_flg", "ctrtUseOnyFlg");
		this.hashFields.put("cntr_len", "cntrLen");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("f_delt_flg", "fDeltFlg");
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
	 * @return cntrWgt
	 */
	public String getCntrWgt() {
		return this.cntrWgt;
	}
	
	/**
	 * Column Info
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}
	
	/**
	 * Column Info
	 * @return ratUtDesc
	 */
	public String getRatUtDesc() {
		return this.ratUtDesc;
	}
	
	/**
	 * Column Info
	 * @return cntrSzCd
	 */
	public String getCntrSzCd() {
		return this.cntrSzCd;
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
	 * @return ratUtGrpCd
	 */
	public String getRatUtGrpCd() {
		return this.ratUtGrpCd;
	}
	
	/**
	 * Column Info
	 * @return cntrWdt
	 */
	public String getCntrWdt() {
		return this.cntrWdt;
	}
	
	/**
	 * Column Info
	 * @return ratUtCd
	 */
	public String getRatUtCd() {
		return this.ratUtCd;
	}
	
	/**
	 * Column Info
	 * @return cntrHgt
	 */
	public String getCntrHgt() {
		return this.cntrHgt;
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
	 * @return ctrtUseOnyFlg
	 */
	public String getCtrtUseOnyFlg() {
		return this.ctrtUseOnyFlg;
	}
	
	/**
	 * Column Info
	 * @return cntrLen
	 */
	public String getCntrLen() {
		return this.cntrLen;
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
	 * @return fDeltFlg
	 */
	public String getFDeltFlg() {
		return this.fDeltFlg;
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
	 * @param cntrWgt
	 */
	public void setCntrWgt(String cntrWgt) {
		this.cntrWgt = cntrWgt;
	}
	
	/**
	 * Column Info
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}
	
	/**
	 * Column Info
	 * @param ratUtDesc
	 */
	public void setRatUtDesc(String ratUtDesc) {
		this.ratUtDesc = ratUtDesc;
	}
	
	/**
	 * Column Info
	 * @param cntrSzCd
	 */
	public void setCntrSzCd(String cntrSzCd) {
		this.cntrSzCd = cntrSzCd;
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
	 * @param ratUtGrpCd
	 */
	public void setRatUtGrpCd(String ratUtGrpCd) {
		this.ratUtGrpCd = ratUtGrpCd;
	}
	
	/**
	 * Column Info
	 * @param cntrWdt
	 */
	public void setCntrWdt(String cntrWdt) {
		this.cntrWdt = cntrWdt;
	}
	
	/**
	 * Column Info
	 * @param ratUtCd
	 */
	public void setRatUtCd(String ratUtCd) {
		this.ratUtCd = ratUtCd;
	}
	
	/**
	 * Column Info
	 * @param cntrHgt
	 */
	public void setCntrHgt(String cntrHgt) {
		this.cntrHgt = cntrHgt;
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
	 * @param ctrtUseOnyFlg
	 */
	public void setCtrtUseOnyFlg(String ctrtUseOnyFlg) {
		this.ctrtUseOnyFlg = ctrtUseOnyFlg;
	}
	
	/**
	 * Column Info
	 * @param cntrLen
	 */
	public void setCntrLen(String cntrLen) {
		this.cntrLen = cntrLen;
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
	 * @param updUsrId
	 */
	public void setFDeltFlg(String fDeltFlg) {
		this.fDeltFlg = fDeltFlg;
	}
	
	/**
	 * Request 넘어온 단건 DATA를 VO Class 에 담는다. 
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCntrWgt(JSPUtil.getParameter(request, "cntr_wgt", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setRatUtDesc(JSPUtil.getParameter(request, "rat_ut_desc", ""));
		setCntrSzCd(JSPUtil.getParameter(request, "cntr_sz_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRatUtGrpCd(JSPUtil.getParameter(request, "rat_ut_grp_cd", ""));
		setCntrWdt(JSPUtil.getParameter(request, "cntr_wdt", ""));
		setRatUtCd(JSPUtil.getParameter(request, "rat_ut_cd", ""));
		setCntrHgt(JSPUtil.getParameter(request, "cntr_hgt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCtrtUseOnyFlg(JSPUtil.getParameter(request, "ctrt_use_ony_flg", ""));
		setCntrLen(JSPUtil.getParameter(request, "cntr_len", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setFDeltFlg(JSPUtil.getParameter(request, "f_delt_flg", ""));
	}

	/**
	 * Request를 VO Class를 담는다.
	 * @param request
	 * @return PriRatUtVO[]
	 */
	public PriRatUtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriRatUtVO[]
	 */
	public PriRatUtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriRatUtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] cntrWgt = (JSPUtil.getParameter(request, prefix	+ "cntr_wgt".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] ratUtDesc = (JSPUtil.getParameter(request, prefix	+ "rat_ut_desc".trim(), length));
			String[] cntrSzCd = (JSPUtil.getParameter(request, prefix	+ "cntr_sz_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] ratUtGrpCd = (JSPUtil.getParameter(request, prefix	+ "rat_ut_grp_cd".trim(), length));
			String[] cntrWdt = (JSPUtil.getParameter(request, prefix	+ "cntr_wdt".trim(), length));
			String[] ratUtCd = (JSPUtil.getParameter(request, prefix	+ "rat_ut_cd".trim(), length));
			String[] cntrHgt = (JSPUtil.getParameter(request, prefix	+ "cntr_hgt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ctrtUseOnyFlg = (JSPUtil.getParameter(request, prefix	+ "ctrt_use_ony_flg".trim(), length));
			String[] cntrLen = (JSPUtil.getParameter(request, prefix	+ "cntr_len".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new PriRatUtVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cntrWgt[i] != null)
					model.setCntrWgt(cntrWgt[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (ratUtDesc[i] != null)
					model.setRatUtDesc(ratUtDesc[i]);
				if (cntrSzCd[i] != null)
					model.setCntrSzCd(cntrSzCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ratUtGrpCd[i] != null)
					model.setRatUtGrpCd(ratUtGrpCd[i]);
				if (cntrWdt[i] != null)
					model.setCntrWdt(cntrWdt[i]);
				if (ratUtCd[i] != null)
					model.setRatUtCd(ratUtCd[i]);
				if (cntrHgt[i] != null)
					model.setCntrHgt(cntrHgt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ctrtUseOnyFlg[i] != null)
					model.setCtrtUseOnyFlg(ctrtUseOnyFlg[i]);
				if (cntrLen[i] != null)
					model.setCntrLen(cntrLen[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPriRatUtVOs();
	}

	/**
	 * 여러 VO Calss를 배열화 한다 
	 * @return PriRatUtVO[]
	 */
	public PriRatUtVO[] getPriRatUtVOs(){
		PriRatUtVO[] vos = (PriRatUtVO[])models.toArray(new PriRatUtVO[models.size()]);
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
		this.cntrWgt = this.cntrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ratUtDesc = this.ratUtDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSzCd = this.cntrSzCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ratUtGrpCd = this.ratUtGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrWdt = this.cntrWdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ratUtCd = this.ratUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrHgt = this.cntrHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtUseOnyFlg = this.ctrtUseOnyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrLen = this.cntrLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
