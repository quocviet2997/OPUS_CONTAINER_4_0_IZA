/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : ComScheduleLog.java
*@FileTitle : ${FILE_TITLE}
*Open Issues :
*Change history : 
*@LastModifyDate : 2008.12.30
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2008.12.30 김경범
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
 * @author 김경범
 * @since J2EE 1.5
 */

public class ComScheduleLog implements Serializable {

	private static final long serialVersionUID = 1L;
	/* 컬럼 설명	*/
	private String pgmNo = null;
	/* 컬럼 설명	*/
	private String schId = null;
	/* 컬럼 설명	*/
	private String ibflag = null;
	/* 컬럼 설명	*/
	private String message = null;
	/* 컬럼 설명	*/
	private String logId = null;
	/* 컬럼 설명	*/
	private String startTime = null;
	/* 컬럼 설명	*/
	private String schType = null;
	/* 컬럼 설명	*/
	private String success = null;
	/* 컬럼 설명	*/
	private String pagerows = null;
	/* 컬럼 설명	*/
	private String endTime = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumn = new HashMap<String, String>();

	public ComScheduleLog() {}

	public ComScheduleLog(String ibflag, String pagerows, String logId, String schId, String schType, String pgmNo, String startTime, String endTime, String success, String message) {
		this.pgmNo = pgmNo;
		this.schId = schId;
		this.ibflag = ibflag;
		this.message = message;
		this.logId = logId;
		this.startTime = startTime;
		this.schType = schType;
		this.success = success;
		this.pagerows = pagerows;
		this.endTime = endTime;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValue(){
		this.hashColumn.put("pgm_no", getPgmNo());
		this.hashColumn.put("sch_id", getSchId());
		this.hashColumn.put("ibflag", getIbflag());
		this.hashColumn.put("message", getMessage());
		this.hashColumn.put("log_id", getLogId());
		this.hashColumn.put("start_time", getStartTime());
		this.hashColumn.put("sch_type", getSchType());
		this.hashColumn.put("success", getSuccess());
		this.hashColumn.put("pagerows", getPage_rows());
		this.hashColumn.put("end_time", getEndTime());
		return this.hashColumn;
	}
	
	public String getPgmNo() {
		return this.pgmNo;
	}
	public String getSchId() {
		return this.schId;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getMessage() {
		return this.message;
	}
	public String getLogId() {
		return this.logId;
	}
	public String getStartTime() {
		return this.startTime;
	}
	public String getSchType() {
		return this.schType;
	}
	public String getSuccess() {
		return this.success;
	}
	public String getPage_rows() {
		return this.pagerows;
	}
	public String getEndTime() {
		return this.endTime;
	}

	public void setPgmNo(String pgmNo) {
		this.pgmNo = pgmNo;
		//this.pgmNo=true;
	}
	public void setSchId(String schId) {
		this.schId = schId;
		//this.schId=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setMessage(String message) {
		this.message = message;
		//this.message=true;
	}
	public void setLogId(String logId) {
		this.logId = logId;
		//this.logId=true;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
		//this.startTime=true;
	}
	public void setSchType(String schType) {
		this.schType = schType;
		//this.schType=true;
	}
	public void setSuccess(String success) {
		this.success = success;
		//this.success=true;
	}
	public void setPage_rows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
		//this.endTime=true;
	}
	public static ComScheduleLog fromRequest(HttpServletRequest request) {
		ComScheduleLog model = new ComScheduleLog();
		try {
			model.setPgmNo(JSPUtil.getParameter(request, "pgm_no", ""));
			model.setSchId(JSPUtil.getParameter(request, "sch_id", ""));
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setMessage(JSPUtil.getParameter(request, "message", ""));
			model.setLogId(JSPUtil.getParameter(request, "log_id", ""));
			model.setStartTime(JSPUtil.getParameter(request, "start_time", ""));
			model.setSchType(JSPUtil.getParameter(request, "sch_type", ""));
			model.setSuccess(JSPUtil.getParameter(request, "success", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "pagerows", ""));
			model.setEndTime(JSPUtil.getParameter(request, "end_time", ""));
		} catch (Exception e) {}
		return model;
	}

	public static Collection<ComScheduleLog> fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public static Collection<ComScheduleLog> fromRequestGrid(HttpServletRequest request, String prefix) {
		ComScheduleLog model = null;
		Collection<ComScheduleLog> models = new ArrayList<ComScheduleLog>();

		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp==null)
   			return models;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] pgmNo = (JSPUtil.getParameter(request, prefix	+ "pgm_no".trim(), length));
			String[] schId = (JSPUtil.getParameter(request, prefix	+ "sch_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] message = (JSPUtil.getParameter(request, prefix	+ "message".trim(), length));
			String[] logId = (JSPUtil.getParameter(request, prefix	+ "log_id".trim(), length));
			String[] startTime = (JSPUtil.getParameter(request, prefix	+ "start_time".trim(), length));
			String[] schType = (JSPUtil.getParameter(request, prefix	+ "sch_type".trim(), length));
			String[] success = (JSPUtil.getParameter(request, prefix	+ "success".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] endTime = (JSPUtil.getParameter(request, prefix	+ "end_time".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new ComScheduleLog();
				if (pgmNo[i] != null)
					model.setPgmNo(pgmNo[i]);
				if (schId[i] != null)
					model.setSchId(schId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (message[i] != null)
					model.setMessage(message[i]);
				if (logId[i] != null)
					model.setLogId(logId[i]);
				if (startTime[i] != null)
					model.setStartTime(startTime[i]);
				if (schType[i] != null)
					model.setSchType(schType[i]);
				if (success[i] != null)
					model.setSuccess(success[i]);
				if (pagerows[i] != null)
					model.setPage_rows(pagerows[i]);
				if (endTime[i] != null)
					model.setEndTime(endTime[i]);
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
				try{
					arr = (String[]) field[i].get(this);
				}catch(Exception ex){
					arr = new String[1];
					arr[0] = String.valueOf(field[i].get(this));
				}
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

}
