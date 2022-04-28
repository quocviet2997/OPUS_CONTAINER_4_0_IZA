/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComScheduleVO.java
*@FileTitle : ComScheduleVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.06
*@LastModifier : 문동규
*@LastVersion : 1.0
* 2009.04.06 문동규 
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
 * @author 문동규
 * @since J2EE 1.5
 */

public class ComScheduleVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComScheduleVO> models = new ArrayList<ComScheduleVO>();
	
	/* Column Inpo */
	private String schDesc = null;
	/* Status */
	private String ibflag = null;
	/* ABC */
	private String svrCode = null;
	/* ������ ���� */
	private String schType = null;
	/* ������ */
	private String prvPgmNo = null;
	/* Column Inpo */
	private String schWeek = null;
	/* �������� ���� */
	private String pgmNo = null;
	/* ������ ID */
	private String schId = null;
	/* ���� */
	private String rsvTime = null;
	/* Column Inpo */
	private String schParam = null;
	/* Column Inpo */
	private String schDay = null;
	/* Column Inpo */
	private String schMin = null;
	/* Column Inpo */
	private String schHour = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Inpo */
	private String schMonth = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComScheduleVO() {}

	public ComScheduleVO(String ibflag, String pagerows, String schId, String schType, String svrCode, String rsvTime, String prvPgmNo, String pgmNo, String schMin, String schHour, String schDay, String schMonth, String schWeek, String schParam, String schDesc) {
		this.schDesc = schDesc;
		this.ibflag = ibflag;
		this.svrCode = svrCode;
		this.schType = schType;
		this.prvPgmNo = prvPgmNo;
		this.schWeek = schWeek;
		this.pgmNo = pgmNo;
		this.schId = schId;
		this.rsvTime = rsvTime;
		this.schParam = schParam;
		this.schDay = schDay;
		this.schMin = schMin;
		this.schHour = schHour;
		this.pagerows = pagerows;
		this.schMonth = schMonth;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("sch_desc", getSchDesc());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("svr_code", getSvrCode());
		this.hashColumns.put("sch_type", getSchType());
		this.hashColumns.put("prv_pgm_no", getPrvPgmNo());
		this.hashColumns.put("sch_week", getSchWeek());
		this.hashColumns.put("pgm_no", getPgmNo());
		this.hashColumns.put("sch_id", getSchId());
		this.hashColumns.put("rsv_time", getRsvTime());
		this.hashColumns.put("sch_param", getSchParam());
		this.hashColumns.put("sch_day", getSchDay());
		this.hashColumns.put("sch_min", getSchMin());
		this.hashColumns.put("sch_hour", getSchHour());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("sch_month", getSchMonth());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("sch_desc", "schDesc");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("svr_code", "svrCode");
		this.hashFields.put("sch_type", "schType");
		this.hashFields.put("prv_pgm_no", "prvPgmNo");
		this.hashFields.put("sch_week", "schWeek");
		this.hashFields.put("pgm_no", "pgmNo");
		this.hashFields.put("sch_id", "schId");
		this.hashFields.put("rsv_time", "rsvTime");
		this.hashFields.put("sch_param", "schParam");
		this.hashFields.put("sch_day", "schDay");
		this.hashFields.put("sch_min", "schMin");
		this.hashFields.put("sch_hour", "schHour");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("sch_month", "schMonth");
		return this.hashFields;
	}
	
	public String getSchDesc() {
		return this.schDesc;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getSvrCode() {
		return this.svrCode;
	}
	public String getSchType() {
		return this.schType;
	}
	public String getPrvPgmNo() {
		return this.prvPgmNo;
	}
	public String getSchWeek() {
		return this.schWeek;
	}
	public String getPgmNo() {
		return this.pgmNo;
	}
	public String getSchId() {
		return this.schId;
	}
	public String getRsvTime() {
		return this.rsvTime;
	}
	public String getSchParam() {
		return this.schParam;
	}
	public String getSchDay() {
		return this.schDay;
	}
	public String getSchMin() {
		return this.schMin;
	}
	public String getSchHour() {
		return this.schHour;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getSchMonth() {
		return this.schMonth;
	}

	public void setSchDesc(String schDesc) {
		this.schDesc = schDesc;
		//this.schDesc=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setSvrCode(String svrCode) {
		this.svrCode = svrCode;
		//this.svrCode=true;
	}
	public void setSchType(String schType) {
		this.schType = schType;
		//this.schType=true;
	}
	public void setPrvPgmNo(String prvPgmNo) {
		this.prvPgmNo = prvPgmNo;
		//this.prvPgmNo=true;
	}
	public void setSchWeek(String schWeek) {
		this.schWeek = schWeek;
		//this.schWeek=true;
	}
	public void setPgmNo(String pgmNo) {
		this.pgmNo = pgmNo;
		//this.pgmNo=true;
	}
	public void setSchId(String schId) {
		this.schId = schId;
		//this.schId=true;
	}
	public void setRsvTime(String rsvTime) {
		this.rsvTime = rsvTime;
		//this.rsvTime=true;
	}
	public void setSchParam(String schParam) {
		this.schParam = schParam;
		//this.schParam=true;
	}
	public void setSchDay(String schDay) {
		this.schDay = schDay;
		//this.schDay=true;
	}
	public void setSchMin(String schMin) {
		this.schMin = schMin;
		//this.schMin=true;
	}
	public void setSchHour(String schHour) {
		this.schHour = schHour;
		//this.schHour=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setSchMonth(String schMonth) {
		this.schMonth = schMonth;
		//this.schMonth=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setSchDesc(JSPUtil.getParameter(request, "sch_desc", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSvrCode(JSPUtil.getParameter(request, "svr_code", ""));
		setSchType(JSPUtil.getParameter(request, "sch_type", ""));
		setPrvPgmNo(JSPUtil.getParameter(request, "prv_pgm_no", ""));
		setSchWeek(JSPUtil.getParameter(request, "sch_week", ""));
		setPgmNo(JSPUtil.getParameter(request, "pgm_no", ""));
		setSchId(JSPUtil.getParameter(request, "sch_id", ""));
		setRsvTime(JSPUtil.getParameter(request, "rsv_time", ""));
		setSchParam(JSPUtil.getParameter(request, "sch_param", ""));
		setSchDay(JSPUtil.getParameter(request, "sch_day", ""));
		setSchMin(JSPUtil.getParameter(request, "sch_min", ""));
		setSchHour(JSPUtil.getParameter(request, "sch_hour", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setSchMonth(JSPUtil.getParameter(request, "sch_month", ""));
	}

	public ComScheduleVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public ComScheduleVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComScheduleVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] schDesc = (JSPUtil.getParameter(request, prefix	+ "sch_desc".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] svrCode = (JSPUtil.getParameter(request, prefix	+ "svr_code".trim(), length));
			String[] schType = (JSPUtil.getParameter(request, prefix	+ "sch_type".trim(), length));
			String[] prvPgmNo = (JSPUtil.getParameter(request, prefix	+ "prv_pgm_no".trim(), length));
			String[] schWeek = (JSPUtil.getParameter(request, prefix	+ "sch_week".trim(), length));
			String[] pgmNo = (JSPUtil.getParameter(request, prefix	+ "pgm_no".trim(), length));
			String[] schId = (JSPUtil.getParameter(request, prefix	+ "sch_id".trim(), length));
			String[] rsvTime = (JSPUtil.getParameter(request, prefix	+ "rsv_time".trim(), length));
			String[] schParam = (JSPUtil.getParameter(request, prefix	+ "sch_param".trim(), length));
			String[] schDay = (JSPUtil.getParameter(request, prefix	+ "sch_day".trim(), length));
			String[] schMin = (JSPUtil.getParameter(request, prefix	+ "sch_min".trim(), length));
			String[] schHour = (JSPUtil.getParameter(request, prefix	+ "sch_hour".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] schMonth = (JSPUtil.getParameter(request, prefix	+ "sch_month".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new ComScheduleVO();
				if (schDesc[i] != null)
					model.setSchDesc(schDesc[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (svrCode[i] != null)
					model.setSvrCode(svrCode[i]);
				if (schType[i] != null)
					model.setSchType(schType[i]);
				if (prvPgmNo[i] != null)
					model.setPrvPgmNo(prvPgmNo[i]);
				if (schWeek[i] != null)
					model.setSchWeek(schWeek[i]);
				if (pgmNo[i] != null)
					model.setPgmNo(pgmNo[i]);
				if (schId[i] != null)
					model.setSchId(schId[i]);
				if (rsvTime[i] != null)
					model.setRsvTime(rsvTime[i]);
				if (schParam[i] != null)
					model.setSchParam(schParam[i]);
				if (schDay[i] != null)
					model.setSchDay(schDay[i]);
				if (schMin[i] != null)
					model.setSchMin(schMin[i]);
				if (schHour[i] != null)
					model.setSchHour(schHour[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (schMonth[i] != null)
					model.setSchMonth(schMonth[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getComScheduleVOs();
	}

	public ComScheduleVO[] getComScheduleVOs(){
		ComScheduleVO[] vos = (ComScheduleVO[])models.toArray(new ComScheduleVO[models.size()]);
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
		this.schDesc = this.schDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svrCode = this.svrCode .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.schType = this.schType .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prvPgmNo = this.prvPgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.schWeek = this.schWeek .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNo = this.pgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.schId = this.schId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rsvTime = this.rsvTime .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.schParam = this.schParam .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.schDay = this.schDay .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.schMin = this.schMin .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.schHour = this.schHour .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.schMonth = this.schMonth .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
