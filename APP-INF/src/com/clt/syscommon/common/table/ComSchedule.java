/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : ComSchedule.java
*@FileTitle : BATCH
*Open Issues :
*Change history :
*@LastModifyDate : 2008.12.29
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2008.12.29 정인선
* 1.0 최초 생성
=========================================================*/

package com.clt.syscommon.common.table;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 정윤태
 * @see EsmHjs010HTMLAction 참조
 * @since J2EE 1.5
 */

public class ComSchedule implements Serializable {

	private static final long serialVersionUID = 1L;
	/* 컬럼 설명	*/
	private String schMin = null;
	/* 컬럼 설명	*/
	private String schParam = null;
	/* 컬럼 설명	*/
	private String prvPgmNo = null;
	/* 컬럼 설명	*/
	private String schMonth = null;
	/* 컬럼 설명	*/
	private String schDesc = null;
	/* 컬럼 설명	*/
	private String schDay = null;
	/* 컬럼 설명	*/
	private String schHour = null;
	/* 컬럼 설명	*/
	private String pgmNo = null;
	/* 컬럼 설명	*/
	private String pagerows = null;
	/* 컬럼 설명	*/
	private String schWeek = null;
	/* 컬럼 설명	*/
	private String ibflag = null;
	/* 컬럼 설명	*/
	private String schId = null;
	/* 컬럼 설명	*/
	private String rsvTime = null;
	/* 컬럼 설명	*/
	private String schType = null;
	/* 컬럼 설명	*/
	private String svrCode = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumn = new HashMap<String, String>();

	public ComSchedule() {}

	public ComSchedule(String ibflag, String pagerows, String schId, String schType, String svrCode, String rsvTime, String prvPgmNo, String pgmNo, String schMin, String schHour, String schDay, String schMonth, String schWeek, String schParam, String schDesc) {
		this.schMin = schMin;
		this.schParam = schParam;
		this.prvPgmNo = prvPgmNo;
		this.schMonth = schMonth;
		this.schDesc = schDesc;
		this.schDay = schDay;
		this.schHour = schHour;
		this.pgmNo = pgmNo;
		this.pagerows = pagerows;
		this.schWeek = schWeek;
		this.ibflag = ibflag;
		this.schId = schId;
		this.rsvTime = rsvTime;
		this.schType = schType;
		this.svrCode = svrCode;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValue(){
		this.hashColumn.put("sch_min", getSchMi());
		this.hashColumn.put("sch_param", getSchPara());
		this.hashColumn.put("prv_pgm_no", getPrvPgmN());
		this.hashColumn.put("sch_month", getSchMont());
		this.hashColumn.put("sch_desc", getSchDes());
		this.hashColumn.put("sch_day", getSchDa());
		this.hashColumn.put("sch_hour", getSchHou());
		this.hashColumn.put("pgm_no", getPgmN());
		this.hashColumn.put("pagerows", getPage_rows());
		this.hashColumn.put("sch_week", getSchWee());
		this.hashColumn.put("ibflag", getIbflag());
		this.hashColumn.put("sch_id", getSchI());
		this.hashColumn.put("rsv_time", getRsvTim());
		this.hashColumn.put("sch_type", getSchTyp());
		this.hashColumn.put("svr_code", getSvrCod());
		return this.hashColumn;
	}
	
	public String getSchMi() {
		return this.schMin;
	}
	public String getSchPara() {
		return this.schParam;
	}
	public String getPrvPgmN() {
		return this.prvPgmNo;
	}
	public String getSchMont() {
		return this.schMonth;
	}
	public String getSchDes() {
		return this.schDesc;
	}
	public String getSchDa() {
		return this.schDay;
	}
	public String getSchHou() {
		return this.schHour;
	}
	public String getPgmN() {
		return this.pgmNo;
	}
	public String getPage_rows() {
		return this.pagerows;
	}
	public String getSchWee() {
		return this.schWeek;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getSchI() {
		return this.schId;
	}
	public String getRsvTim() {
		return this.rsvTime;
	}
	public String getSchTyp() {
		return this.schType;
	}
	public String getSvrCod() {
		return this.svrCode;
	}

	public void setSchMi(String schMin) {
		this.schMin = schMin;
		//this.schMin=true;
	}
	public void setSchPara(String schParam) {
		this.schParam = schParam;
		//this.schParam=true;
	}
	public void setPrvPgmN(String prvPgmNo) {
		this.prvPgmNo = prvPgmNo;
		//this.prvPgmNo=true;
	}
	public void setSchMont(String schMonth) {
		this.schMonth = schMonth;
		//this.schMonth=true;
	}
	public void setSchDes(String schDesc) {
		this.schDesc = schDesc;
		//this.schDesc=true;
	}
	public void setSchDa(String schDay) {
		this.schDay = schDay;
		//this.schDay=true;
	}
	public void setSchHou(String schHour) {
		this.schHour = schHour;
		//this.schHour=true;
	}
	public void setPgmN(String pgmNo) {
		this.pgmNo = pgmNo;
		//this.pgmNo=true;
	}
	public void setPage_rows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setSchWee(String schWeek) {
		this.schWeek = schWeek;
		//this.schWeek=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setSchI(String schId) {
		this.schId = schId;
		//this.schId=true;
	}
	public void setRsvTim(String rsvTime) {
		this.rsvTime = rsvTime;
		//this.rsvTime=true;
	}
	public void setSchTyp(String schType) {
		this.schType = schType;
		//this.schType=true;
	}
	public void setSvrCod(String svrCode) {
		this.svrCode = svrCode;
		//this.svrCode=true;
	}
	public static ComSchedule fromRequest(HttpServletRequest request) {
		ComSchedule model = new ComSchedule();
		try {
			model.setSchMi(JSPUtil.getParameter(request, "sch_min", ""));
			model.setSchPara(JSPUtil.getParameter(request, "sch_param", ""));
			model.setPrvPgmN(JSPUtil.getParameter(request, "prv_pgm_no", ""));
			model.setSchMont(JSPUtil.getParameter(request, "sch_month", ""));
			model.setSchDes(JSPUtil.getParameter(request, "sch_desc", ""));
			model.setSchDa(JSPUtil.getParameter(request, "sch_day", ""));
			model.setSchHou(JSPUtil.getParameter(request, "sch_hour", ""));
			model.setPgmN(JSPUtil.getParameter(request, "pgm_no", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "pagerows", ""));
			model.setSchWee(JSPUtil.getParameter(request, "sch_week", ""));
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setSchI(JSPUtil.getParameter(request, "sch_id", ""));
			model.setRsvTim(JSPUtil.getParameter(request, "rsv_time", ""));
			model.setSchTyp(JSPUtil.getParameter(request, "sch_type", ""));
			model.setSvrCod(JSPUtil.getParameter(request, "svr_code", ""));
		} catch (Exception e) {}
		return model;
	}

	public static Collection<ComSchedule> fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public static Collection<ComSchedule> fromRequestGrid(HttpServletRequest request, String prefix) {
		ComSchedule model = null;
		Collection<ComSchedule> models = new ArrayList<ComSchedule>();

		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp==null)
   			return models;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] schMin = (JSPUtil.getParameter(request, prefix	+ "sch_min".trim(), length));
			String[] schParam = (JSPUtil.getParameter(request, prefix	+ "sch_param".trim(), length));
			String[] prvPgmNo = (JSPUtil.getParameter(request, prefix	+ "prv_pgm_no".trim(), length));
			String[] schMonth = (JSPUtil.getParameter(request, prefix	+ "sch_month".trim(), length));
			String[] schDesc = (JSPUtil.getParameter(request, prefix	+ "sch_desc".trim(), length));
			String[] schDay = (JSPUtil.getParameter(request, prefix	+ "sch_day".trim(), length));
			String[] schHour = (JSPUtil.getParameter(request, prefix	+ "sch_hour".trim(), length));
			String[] pgmNo = (JSPUtil.getParameter(request, prefix	+ "pgm_no".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] schWeek = (JSPUtil.getParameter(request, prefix	+ "sch_week".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] schId = (JSPUtil.getParameter(request, prefix	+ "sch_id".trim(), length));
			String[] rsvTime = (JSPUtil.getParameter(request, prefix	+ "rsv_time".trim(), length));
			String[] schType = (JSPUtil.getParameter(request, prefix	+ "sch_type".trim(), length));
			String[] svrCode = (JSPUtil.getParameter(request, prefix	+ "svr_code".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new ComSchedule();
				if (schMin[i] != null)
					model.setSchMi(schMin[i]);
				if (schParam[i] != null)
					model.setSchPara(schParam[i]);
				if (prvPgmNo[i] != null)
					model.setPrvPgmN(prvPgmNo[i]);
				if (schMonth[i] != null)
					model.setSchMont(schMonth[i]);
				if (schDesc[i] != null)
					model.setSchDes(schDesc[i]);
				if (schDay[i] != null)
					model.setSchDa(schDay[i]);
				if (schHour[i] != null)
					model.setSchHou(schHour[i]);
				if (pgmNo[i] != null)
					model.setPgmN(pgmNo[i]);
				if (pagerows[i] != null)
					model.setPage_rows(pagerows[i]);
				if (schWeek[i] != null)
					model.setSchWee(schWeek[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (schId[i] != null)
					model.setSchI(schId[i]);
				if (rsvTime[i] != null)
					model.setRsvTim(rsvTime[i]);
				if (schType[i] != null)
					model.setSchTyp(schType[i]);
				if (svrCode[i] != null)
					model.setSvrCod(svrCode[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return models;
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

}
