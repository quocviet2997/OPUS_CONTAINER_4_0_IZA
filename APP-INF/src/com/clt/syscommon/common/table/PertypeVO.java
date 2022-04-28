/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PertypeVO.java
*@FileTitle : PertypeVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.16
*@LastModifier : 박광석
*@LastVersion : 1.0
* 2009.04.16 박광석 
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
 * @author 박광석
 * @since J2EE 1.5
 */

public class PertypeVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PertypeVO> models = new ArrayList<PertypeVO>();
	
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String pertpCd = null;
	/* Column Inpo */
	private String usrId = null;
	/* Column Inpo */
	private String pertpHanCd = null;
	/* Column Inpo */
	private String hanIfCd = null;
	/* Column Inpo */
	private String crDt = null;
	/* Column Inpo */
	private String pertpDesc = null;
	/* Column Inpo */
	private String upDt = null;
	/* Column Inpo */
	private String nisEventDt = null;
	/* Column Inpo */
	private String pertpSz = null;
	/* Column Inpo */
	private String cxlInd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Inpo */
	private String pertpChar = null;
	/* Column Inpo */
	private String pertpImsCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PertypeVO() {}

	public PertypeVO(String ibflag, String pagerows, String pertpCd, String pertpDesc, String pertpChar, String pertpSz, String cxlInd, String crDt, String upDt, String usrId, String pertpImsCd, String pertpHanCd, String hanIfCd, String nisEventDt) {
		this.ibflag = ibflag;
		this.pertpCd = pertpCd;
		this.usrId = usrId;
		this.pertpHanCd = pertpHanCd;
		this.hanIfCd = hanIfCd;
		this.crDt = crDt;
		this.pertpDesc = pertpDesc;
		this.upDt = upDt;
		this.nisEventDt = nisEventDt;
		this.pertpSz = pertpSz;
		this.cxlInd = cxlInd;
		this.pagerows = pagerows;
		this.pertpChar = pertpChar;
		this.pertpImsCd = pertpImsCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pertp_cd", getPertpCd());
		this.hashColumns.put("usr_id", getUsrId());
		this.hashColumns.put("pertp_han_cd", getPertpHanCd());
		this.hashColumns.put("han_if_cd", getHanIfCd());
		this.hashColumns.put("cr_dt", getCrDt());
		this.hashColumns.put("pertp_desc", getPertpDesc());
		this.hashColumns.put("up_dt", getUpDt());
		this.hashColumns.put("nis_event_dt", getNisEventDt());
		this.hashColumns.put("pertp_sz", getPertpSz());
		this.hashColumns.put("cxl_ind", getCxlInd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pertp_char", getPertpChar());
		this.hashColumns.put("pertp_ims_cd", getPertpImsCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pertp_cd", "pertpCd");
		this.hashFields.put("usr_id", "usrId");
		this.hashFields.put("pertp_han_cd", "pertpHanCd");
		this.hashFields.put("han_if_cd", "hanIfCd");
		this.hashFields.put("cr_dt", "crDt");
		this.hashFields.put("pertp_desc", "pertpDesc");
		this.hashFields.put("up_dt", "upDt");
		this.hashFields.put("nis_event_dt", "nisEventDt");
		this.hashFields.put("pertp_sz", "pertpSz");
		this.hashFields.put("cxl_ind", "cxlInd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pertp_char", "pertpChar");
		this.hashFields.put("pertp_ims_cd", "pertpImsCd");
		return this.hashFields;
	}
	
	public String getIbflag() {
		return this.ibflag;
	}
	public String getPertpCd() {
		return this.pertpCd;
	}
	public String getUsrId() {
		return this.usrId;
	}
	public String getPertpHanCd() {
		return this.pertpHanCd;
	}
	public String getHanIfCd() {
		return this.hanIfCd;
	}
	public String getCrDt() {
		return this.crDt;
	}
	public String getPertpDesc() {
		return this.pertpDesc;
	}
	public String getUpDt() {
		return this.upDt;
	}
	public String getNisEventDt() {
		return this.nisEventDt;
	}
	public String getPertpSz() {
		return this.pertpSz;
	}
	public String getCxlInd() {
		return this.cxlInd;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getPertpChar() {
		return this.pertpChar;
	}
	public String getPertpImsCd() {
		return this.pertpImsCd;
	}

	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setPertpCd(String pertpCd) {
		this.pertpCd = pertpCd;
		//this.pertpCd=true;
	}
	public void setUsrId(String usrId) {
		this.usrId = usrId;
		//this.usrId=true;
	}
	public void setPertpHanCd(String pertpHanCd) {
		this.pertpHanCd = pertpHanCd;
		//this.pertpHanCd=true;
	}
	public void setHanIfCd(String hanIfCd) {
		this.hanIfCd = hanIfCd;
		//this.hanIfCd=true;
	}
	public void setCrDt(String crDt) {
		this.crDt = crDt;
		//this.crDt=true;
	}
	public void setPertpDesc(String pertpDesc) {
		this.pertpDesc = pertpDesc;
		//this.pertpDesc=true;
	}
	public void setUpDt(String upDt) {
		this.upDt = upDt;
		//this.upDt=true;
	}
	public void setNisEventDt(String nisEventDt) {
		this.nisEventDt = nisEventDt;
		//this.nisEventDt=true;
	}
	public void setPertpSz(String pertpSz) {
		this.pertpSz = pertpSz;
		//this.pertpSz=true;
	}
	public void setCxlInd(String cxlInd) {
		this.cxlInd = cxlInd;
		//this.cxlInd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setPertpChar(String pertpChar) {
		this.pertpChar = pertpChar;
		//this.pertpChar=true;
	}
	public void setPertpImsCd(String pertpImsCd) {
		this.pertpImsCd = pertpImsCd;
		//this.pertpImsCd=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPertpCd(JSPUtil.getParameter(request, "pertp_cd", ""));
		setUsrId(JSPUtil.getParameter(request, "usr_id", ""));
		setPertpHanCd(JSPUtil.getParameter(request, "pertp_han_cd", ""));
		setHanIfCd(JSPUtil.getParameter(request, "han_if_cd", ""));
		setCrDt(JSPUtil.getParameter(request, "cr_dt", ""));
		setPertpDesc(JSPUtil.getParameter(request, "pertp_desc", ""));
		setUpDt(JSPUtil.getParameter(request, "up_dt", ""));
		setNisEventDt(JSPUtil.getParameter(request, "nis_event_dt", ""));
		setPertpSz(JSPUtil.getParameter(request, "pertp_sz", ""));
		setCxlInd(JSPUtil.getParameter(request, "cxl_ind", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPertpChar(JSPUtil.getParameter(request, "pertp_char", ""));
		setPertpImsCd(JSPUtil.getParameter(request, "pertp_ims_cd", ""));
	}

	public PertypeVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public PertypeVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PertypeVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] pertpCd = (JSPUtil.getParameter(request, prefix	+ "pertp_cd".trim(), length));
			String[] usrId = (JSPUtil.getParameter(request, prefix	+ "usr_id".trim(), length));
			String[] pertpHanCd = (JSPUtil.getParameter(request, prefix	+ "pertp_han_cd".trim(), length));
			String[] hanIfCd = (JSPUtil.getParameter(request, prefix	+ "han_if_cd".trim(), length));
			String[] crDt = (JSPUtil.getParameter(request, prefix	+ "cr_dt".trim(), length));
			String[] pertpDesc = (JSPUtil.getParameter(request, prefix	+ "pertp_desc".trim(), length));
			String[] upDt = (JSPUtil.getParameter(request, prefix	+ "up_dt".trim(), length));
			String[] nisEventDt = (JSPUtil.getParameter(request, prefix	+ "nis_event_dt".trim(), length));
			String[] pertpSz = (JSPUtil.getParameter(request, prefix	+ "pertp_sz".trim(), length));
			String[] cxlInd = (JSPUtil.getParameter(request, prefix	+ "cxl_ind".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] pertpChar = (JSPUtil.getParameter(request, prefix	+ "pertp_char".trim(), length));
			String[] pertpImsCd = (JSPUtil.getParameter(request, prefix	+ "pertp_ims_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new PertypeVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (pertpCd[i] != null)
					model.setPertpCd(pertpCd[i]);
				if (usrId[i] != null)
					model.setUsrId(usrId[i]);
				if (pertpHanCd[i] != null)
					model.setPertpHanCd(pertpHanCd[i]);
				if (hanIfCd[i] != null)
					model.setHanIfCd(hanIfCd[i]);
				if (crDt[i] != null)
					model.setCrDt(crDt[i]);
				if (pertpDesc[i] != null)
					model.setPertpDesc(pertpDesc[i]);
				if (upDt[i] != null)
					model.setUpDt(upDt[i]);
				if (nisEventDt[i] != null)
					model.setNisEventDt(nisEventDt[i]);
				if (pertpSz[i] != null)
					model.setPertpSz(pertpSz[i]);
				if (cxlInd[i] != null)
					model.setCxlInd(cxlInd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (pertpChar[i] != null)
					model.setPertpChar(pertpChar[i]);
				if (pertpImsCd[i] != null)
					model.setPertpImsCd(pertpImsCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getPertypeVOs();
	}

	public PertypeVO[] getPertypeVOs(){
		PertypeVO[] vos = (PertypeVO[])models.toArray(new PertypeVO[models.size()]);
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
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pertpCd = this.pertpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrId = this.usrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pertpHanCd = this.pertpHanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hanIfCd = this.hanIfCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crDt = this.crDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pertpDesc = this.pertpDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.upDt = this.upDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nisEventDt = this.nisEventDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pertpSz = this.pertpSz .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlInd = this.cxlInd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pertpChar = this.pertpChar .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pertpImsCd = this.pertpImsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
