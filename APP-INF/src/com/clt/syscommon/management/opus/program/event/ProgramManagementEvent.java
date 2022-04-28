/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ProgramManagementEvent.java
*@FileTitle : Program Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.17
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.02.17 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.program.event;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.ComProgramVO;


/**
 * ProgramManagement 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  ProgramManagementHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author KyungBum Kim
 * @see ProgramManagementHTMLAction 참조
 * @since J2EE 1.4
 */
public class ProgramManagementEvent extends EventSupport {

	private static final long serialVersionUID = 1L;
	private Map<String, Object> voMap = new HashMap<String, Object>();
	
	/** com_user Table  Value Object */
	private ComProgramVO comprogramvo = null;
	
	/** com_users Multi Action을 위한 Collection */
	private ComProgramVO[] comprogramvos = null;

	public ProgramManagementEvent(){}

	/**
	 * ProgramManagementEvent 생성
	 * @param ComProgramVO comprogramvo
	 */
	public ProgramManagementEvent(ComProgramVO comprogramvo) {
		this.comprogramvo = comprogramvo;
    }

	/**
	 * ProgramManagementEvent 생성
	 * @param ComProgramVO comprogramvo
	 * @param ComProgramVO[] comprogramvos
	 */
	public ProgramManagementEvent(ComProgramVO comprogramvo, ComProgramVO[] comprogramvos) {
		this.comprogramvo = comprogramvo;
		this.comprogramvos = comprogramvos;
    }

	public ComProgramVO getComProgramVO(){
		return comprogramvo;
	}

	public ComProgramVO[] getComProgramVOS(){
		ComProgramVO[] rtnVOs = null;
		if (this.comprogramvos != null) {
			rtnVOs = Arrays.copyOf(comprogramvos, comprogramvos.length);
		}
		return rtnVOs;
	}

	public String getEventName() {
		return "ProgramManagementEvent";
	}

	public String toString() {
		return "ProgramManagementEvent";
	}
	
	public void setVO(String key, Object vo){
		voMap.put(key, vo);
	}
	
	public Object getVO(String key){
		return voMap.get(key);
	}
}