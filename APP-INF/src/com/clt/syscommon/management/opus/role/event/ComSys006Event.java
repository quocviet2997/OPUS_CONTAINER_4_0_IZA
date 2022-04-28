/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UI_COM_SYS_006Event.java
*@FileTitle : 사용자, 역할, 프로그램
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.role.event;

import java.util.Collection;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.COM_ROLE;



/**
 * UI_COM_SYS_006 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - UI_COM_SYS_006HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author SeongWook Kim
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComSys006Event extends EventSupport {

	/** com_role Table  Value Object */
	private COM_ROLE comRole = null;

	/** com_roles Multi Action을 위한 Collection */
	private Collection comRoles = null;

	/** usr_id 변수 (Form 객체) */
	private String usrId = null;

	/** usr_nm 변수 (Form 객체) */
	private String usrNm = null;

	/** roleNm 변수 (Form 객체) */
	private String roleCd = null;

	/** pgm_nm 변수 (Form 객체) */
	private String pgmNo = null;

	/** roleNm 변수 (Form 객체) */
	private String roleNm = null;

	/** pgm_nm 변수 (Form 객체) */
	private String pgmNm = null;

	/**
	 * 
	 */
	public ComSys006Event(){}

	/**
	 * @param usrNm
	 */
	public ComSys006Event(String usrNm) {
		this.usrNm = usrNm;
	}

	/**
	 * @param usrNm
	 * @param roleNm
	 */
	public ComSys006Event(String usrNm, String roleNm) {
		this.usrNm = usrNm;
		this.roleNm = roleNm;
	}

	/**
	 * @param usrNm
	 * @param roleNm
	 * @param pgmNm
	 */
	public ComSys006Event(String usrNm, String roleNm, String pgmNm) {
		this.usrNm = usrNm;
		this.roleNm = roleNm;
		this.pgmNm = pgmNm;
	}

	/**
	 * @param comRole
	 * @param usrNm
	 * @param roleNm
	 * @param pgmNm
	 */
	public ComSys006Event(COM_ROLE comRole, String usrNm, String roleNm, String pgmNm) {
		this.comRole = comRole;
		this.usrNm = usrNm;
		this.roleNm = roleNm;
		this.pgmNm = pgmNm;
	}

	/**
	 * @param comRole
	 * @param comRoles
	 * @param usrNm
	 * @param roleNm
	 * @param pgmNm
	 */
	public ComSys006Event(COM_ROLE comRole, Collection comRoles, String usrNm, String roleNm, String pgmNm) {
		this.comRole = comRole;
		this.comRoles = comRoles;
		this.usrNm = usrNm;
		this.roleNm = roleNm;
		this.pgmNm = pgmNm;
	}

	/**
	 * @return
	 */
	public String getUsr_nm(){
		return usrNm;
	}

	/**
	 * @return
	 */
	public String getRole_nm(){
		return roleNm;
	}

	/**
	 * @return
	 */
	public String getPgm_nm(){
		return pgmNm;
	}



	/**
	 * @return
	 */
	public COM_ROLE getCOM_ROLE() {
		return comRole;
	}

	/**
	 * @param comRole
	 */
	public void setCOM_ROLE(COM_ROLE comRole) {
		this.comRole = comRole;
	}

	/**
	 * @return
	 */
	public Collection getCOM_ROLES() {
		return comRoles;
	}

	/**
	 * @param comRoles
	 */
	public void setCOM_ROLES(Collection comRoles) {
		this.comRoles = comRoles;
	}

	/**
	 * @param usrId the usrId to set
	 */
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	/**
	 * @return the usrId
	 */
	public String getUsrId() {
		return usrId;
	}

	public void setRoleCd(String roleCd) {
		this.roleCd = roleCd;
	}

	public String getRoleCd() {
		return roleCd;
	}

	public void setPgmNo(String pgmNo) {
		this.pgmNo = pgmNo;
	}

	public String getPgmNo() {
		return pgmNo;
	}

}
