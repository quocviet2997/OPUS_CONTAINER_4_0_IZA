/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UI_COM_SYS_011Event.java
*@FileTitle : 프로그램별 역할매핑 관리
*Open Issues :
*Change history :
*@LastModifyDate : 2006-11-10
*@LastModifier : Kildong_hong
*@LastVersion : 1.0
* 2006-11-10 Kildong_hong
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.role.event;

import java.util.Arrays;
import java.util.Collection;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.ComPgmRoleVO;
import com.clt.syscommon.common.table.ComUsrOfcCngVO;



/**
 * UI_COM_SYS_011 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - UI_COM_SYS_011HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Kildong_hong
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComSys011Event extends EventSupport {

	/** com_pgm_role Table  Value Object */
	private ComPgmRoleVO comPgmRole = null;

	/** comPgmRoles Multi Action을 위한 Collection */
	private ComPgmRoleVO[] comPgmRoles = null;

	/** prog_id 변수 (Form 객체) */
	private String progId = null;

	/** prog_nm 변수 (Form 객체) */
	private String progNm = null;

	/**
	 * 
	 */
	public ComSys011Event(){}

	/**
	 * @param comPgmRole
	 */
	public ComSys011Event(ComPgmRoleVO comPgmRole) {
		this.comPgmRole = comPgmRole;
	}

	/**
	 * @param comPgmRole
	 * @param comPgmRoles
	 */
	public ComSys011Event(ComPgmRoleVO comPgmRole, ComPgmRoleVO[] comPgmRoles) {
		this.comPgmRole = comPgmRole;
		this.comPgmRoles = comPgmRoles;
	}

	/**
	 * @param comPgmRole
	 * @param comPgmRoles
	 * @param progId
	 * @param progNm
	 */
	public ComSys011Event(ComPgmRoleVO comPgmRole, ComPgmRoleVO[] comPgmRoles, String progId, String progNm) {
		this.comPgmRole = comPgmRole;
		this.comPgmRoles = comPgmRoles;
		this.progId = progId;
		this.progNm = progNm;
	}

	/**
	 * @return
	 */
	public ComPgmRoleVO getComPgmRoleVO(){
		return comPgmRole;
	}

	/**
	 * @return
	 */
	public ComPgmRoleVO[] getComPgmRoleVOS(){
		ComPgmRoleVO[] rtnVOs = null;
		if (this.comPgmRoles != null) {
			rtnVOs = Arrays.copyOf(comPgmRoles, comPgmRoles.length);
		}
		return rtnVOs;
	}


	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "UI_COM_SYS_011Event";
	}

	/**
	 * @return
	 */
	public String getProg_id() {
		return progId;
	}

	/**
	 * @return
	 */
	public String getProg_nm() {
		return progNm;
	}
	
	public void setProg_id(String prog_id) {
		this.progId = prog_id;
	}

	public void setProg_nm(String prog_nm) {
		this.progNm = prog_nm;
	}
	
	public void setComPgmRoleVOS(ComPgmRoleVO[] comPgmRoleVOs) {
		if(comPgmRoleVOs != null){
			ComPgmRoleVO[] tmpVOs = Arrays.copyOf(comPgmRoleVOs, comPgmRoleVOs.length);
			this.comPgmRoles  = tmpVOs;
		}
	}

}
