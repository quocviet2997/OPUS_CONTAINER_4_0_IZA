/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : scheduleEvent.java
*@FileTitle : schedule
*Open Issues :
*Change history :
*@LastModifyDate : 2008.12.23
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2008.12.23 정인선
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.schedule.event;

import java.util.Arrays;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.ComSkdMgmtVO;


/**
 * schedule 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  scheduleHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author In Sun Jung
 * @see scheduleHTMLAction 참조
 * @since J2EE 1.4
 */

public class ScheduleEvent extends EventSupport {

	private static final long serialVersionUID = 6021938978986868048L;
	private String scheduleID = null;
	private String scheduleType = null;
	private String serverCode = null;
	private String programNo = null;
	private String programName = null;
	private String txtPgmNo = null;
	private String txtPgmNm = null;
	private String selGubun = null;
	private String selSuccess = null;

	/** com_user Table  Value Object */
	private ComSkdMgmtVO comschedule = null;
	
	/** com_users Multi Action을 위한 Collection */
	private ComSkdMgmtVO[] comschedules = null;

	public ScheduleEvent(){}

	/**
	 * ScheduleEvent 객체 생성<br>
	 * ScheduleEvent 를 생성한다.<br>
	 * @param ComSkdMgmtVO comschedule
	 */
	public ScheduleEvent(ComSkdMgmtVO comschedule) {
		this.comschedule = comschedule;
    }

	/**
	 * ScheduleEvent 객체 생성<br>
	 * ScheduleEvent 를 생성한다.<br>
	 * @param ComSkdMgmtVO comschedule
	 * @param ComSkdMgmtVO[] comschedules
	 */
	public ScheduleEvent(ComSkdMgmtVO comschedule, ComSkdMgmtVO[] comschedules) {
		this.comschedule = comschedule;
		this.comschedules = comschedules;
    }

	public ComSkdMgmtVO getComSchedule(){
		return comschedule;
	}

	public ComSkdMgmtVO[] getComScheduleS(){
		ComSkdMgmtVO[] rtnVOs = null;
		if (this.comschedules != null) {
			rtnVOs = Arrays.copyOf(comschedules, comschedules.length);
		}
		return rtnVOs;
	}

	public String getEventName() {
		return "scheduleEvent";
	}

	public String toString() {
		return "scheduleEvent";
	}

	public ComSkdMgmtVO getComschedule() {
		return comschedule;
	}

	public void setComschedule(ComSkdMgmtVO comschedule) {
		this.comschedule = comschedule;
	}

	public String getSchedule_ID() {
		return scheduleID;
	}

	public void setSchedule_ID(String schedule_ID) {
		this.scheduleID = schedule_ID;
	}

	public String getSchedule_Type() {
		return scheduleType;
	}

	public void setSchedule_Type(String schedule_Type) {
		this.scheduleType = schedule_Type;
	}

	public String getServer_Code() {
		return serverCode;
	}

	public void setServer_Code(String server_Code) {
		this.serverCode = server_Code;
	}

	public String getProgram_No() {
		return programNo;
	}

	public void setProgram_No(String program_No) {
		this.programNo = program_No;
	}

	public String getProgram_Name() {
		return programName;
	}

	public void setProgram_Name(String program_Name) {
		this.programName = program_Name;
	}

	public String getTxtPgmNo() {
		return txtPgmNo;
	}

	public void setTxtPgmNo(String txtPgmNo) {
		this.txtPgmNo = txtPgmNo;
	}

	public String getTxtPgmNm() {
		return txtPgmNm;
	}

	public void setTxtPgmNm(String txtPgmNm) {
		this.txtPgmNm = txtPgmNm;
	}

	public String getSelGubun() {
		return selGubun;
	}

	public void setSelGubun(String selGubun) {
		this.selGubun = selGubun;
	}

	public String getSelSuccess() {
		return selSuccess;
	}

	public void setSelSuccess(String selSuccess) {
		this.selSuccess = selSuccess;
	}

	public ComSkdMgmtVO[] getComschedules() {
		ComSkdMgmtVO[] rtnVOs = null;
		if (this.comschedules != null) {
			rtnVOs = Arrays.copyOf(comschedules, comschedules.length);
		}
		return rtnVOs;
	}

	public void setComschedules(ComSkdMgmtVO[] comschedules) {
		if(comschedules != null){
			ComSkdMgmtVO[] tmpVOs = Arrays.copyOf(comschedules, comschedules.length);
			this.comschedules  = tmpVOs;
		}
	}
	
}
