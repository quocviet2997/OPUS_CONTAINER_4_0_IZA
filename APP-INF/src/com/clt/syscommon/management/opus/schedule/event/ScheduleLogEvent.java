/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : ScheduleLogEvent.java
*@FileTitle : jjj
*Open Issues :
*Change history :
*@LastModifyDate : 2008.12.29
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2008.12.29 정인선
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.schedule.event;

import java.util.Collection;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.ComSchedule;
import com.clt.syscommon.common.table.ComScheduleLog;


/**
 * ScheduleLog 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  ScheduleLogHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author In Sun Jung
 * @see ScheduleLogHTMLAction 참조
 * @since J2EE 1.4
 */

public class ScheduleLogEvent extends EventSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6246793913161548175L;

	private String txtUsrId = null;
	
	private String txtUsrNm = null;

	private String skdId = null;
	private String skdTpCd = null;
	private String pgmNo = null;
	private String toDt = null;
	private String fromDt = null;
	private String stsCd = null;
	private String machine = null;

	/**
     * @return the machine
     */
    public String getMachine() {
    	return machine;
    }

	/**
     * @param p_machine the machine to set
     */
    public void setMachine(String p_machine) {
    	machine = p_machine;
    }

	public String getSkd_id() {
		return skdId;
	}

	public void setSkd_id(String skd_id) {
		this.skdId = skd_id;
	}

	public String getSkd_tp_cd() {
		return skdTpCd;
	}

	public void setSkd_tp_cd(String sch_tp_cd) {
		this.skdTpCd = sch_tp_cd;
	}

	public String getPgm_no() {
		return pgmNo;
	}

	public void setPgm_no(String pgm_no) {
		this.pgmNo = pgm_no;
	}

	public String getTo_dt() {
		return toDt;
	}

	public void setTo_dt(String to_dt) {
		this.toDt = to_dt;
	}

	public String getFrom_dt() {
		return fromDt;
	}

	public void setFrom_dt(String from_dt) {
		this.fromDt = from_dt;
	}

	/** com_user Table  Value Object */
	private ComSchedule comschedule = null;
	
	/** com_users Multi Action을 위한 Collection */
	private Collection<ComScheduleLog> comschedules = null;

	public ScheduleLogEvent(){}

	/**
	 * ScheduleLogEvent 객체 생성<br>
	 * ScheduleLogEvent 를 생성한다.<br>
	 * @param ComSchedule comschedule
	 */
	public ScheduleLogEvent(ComSchedule comschedule) {
		this.comschedule = comschedule;
    }

	/**
	 * ScheduleLogEvent 객체 생성<br>
	 * ScheduleLogEvent 를 생성한다.<br>
	 * @param ComSchedule comschedule
	 * @param Collection<ComScheduleLog> comschedules
	 */
	public ScheduleLogEvent(ComSchedule comschedule, Collection<ComScheduleLog> comschedules) {
		this.comschedule = comschedule;
		this.comschedules = comschedules;
    }

	public ComSchedule getComSchedule(){
		return comschedule;
	}

	public Collection<ComScheduleLog> getComScheduleS(){
		return comschedules;
	}

	public String getEventName() {
		return "ScheduleLogEvent";
	}

	public String toString() {
		return "ScheduleLogEvent";
	}
	
	public String getTxtUsr_id(){
		return txtUsrId;
	}
	
	public void setTxtUsr_id(String usr_id){
		txtUsrId = usr_id;
	}

	public String getTxtUsr_nm(){
		return txtUsrNm;
	}

	public void setTxtUsr_nm(String usr_nm){
		txtUsrNm = usr_nm;
	}

	public void setSts_cd(String sts_cd) {
		this.stsCd = sts_cd;
	}

	public String getSts_cd() {
		return stsCd;
	}

}
