/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UI_COM_SYS_014Event.java
*@FileTitle : 부모역할 조회팝업
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-11
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2007-01-11 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.role.event;

import java.util.Collection;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.COM_USR_ROLE;



/**
 * UI_COM_SYS_014 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - UI_COM_SYS_014HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author SeongWook Kim
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComSys014Event extends EventSupport {

	/** com_usr_role Table  Value Object */
	private COM_USR_ROLE comUsrRole = null;

	/** comUsrRoles Multi Action을 위한 Collection */
	private Collection comUsrRoles = null;

	/** role_cd 변수 (Session 정보) */
	private String roleCd = null;

	/** role_nm 변수 (Session 정보) */
	private String roleNm = null;

	/**
	 * 
	 */
	public ComSys014Event(){}

	/**
	 * @param roleCd
	 * @param roleNm
	 */
	public ComSys014Event(String roleCd, String roleNm) {
		this.roleCd = roleCd;
		this.roleNm = roleNm;
	}

	/**
	 * @param comUsrRole
	 * @param comUsrRoles
	 */
	public ComSys014Event(COM_USR_ROLE comUsrRole, Collection comUsrRoles) {
		this.comUsrRole = comUsrRole;
		this.comUsrRoles = comUsrRoles;
	}

	/**
	 * @param comUsrRole
	 * @param comUsrRoles
	 * @param roleCd
	 * @param roleNm
	 */
	public ComSys014Event(COM_USR_ROLE comUsrRole, Collection comUsrRoles, String roleCd, String roleNm) {
		this.comUsrRole = comUsrRole;
		this.comUsrRoles = comUsrRoles;
		this.roleCd = roleCd;
		this.roleNm = roleNm;
	}

	public String getRole_cd() {
		return roleCd;
	}

	public void setRole_cd(String roleCd) {
		this.roleCd = roleCd;
	}

	public String getRole_nm() {
		return roleNm;
	}

	public void setRole_nm(String roleNm) {
		this.roleNm = roleNm;
	}

	/**
	 * @return
	 */
	public COM_USR_ROLE getCOM_USR_ROLE() {
		return comUsrRole;
	}

	/**
	 * @param comUsrRole
	 */
	public void setCOM_USR_ROLE(COM_USR_ROLE comUsrRole) {
		this.comUsrRole = comUsrRole;
	}

	/**
	 * @return
	 */
	public Collection getCOM_USR_ROLES() {
		return comUsrRoles;
	}

	/**
	 * @param comUsrRoles
	 */
	public void setCOM_USR_ROLES(Collection comUsrRoles) {
		this.comUsrRoles = comUsrRoles;
	}

	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "UI_COM_SYS_014Event";
	}

}
