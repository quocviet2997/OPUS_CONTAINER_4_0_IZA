/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UI_COM_SYS_010Event.java
*@FileTitle : 프로그램 매핑
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.role.event;

import java.util.Arrays;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.ComPgmRoleVO;



/**
 * UI_COM_SYS_010 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - UI_COM_SYS_010HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author SeongWook Kim
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComSys010Event extends EventSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5649550083856271058L;

	/** com_pgm_role Table  Value Object */
	private ComPgmRoleVO comPgmRole = null;

	/** comPgmRoles Multi Action을 위한 Collection */
	private ComPgmRoleVO[] comPgmRoleVOs = null;

	/** role_cd 변수 (Form 객체) */
	private String roleCd = null;

	/** role_nm 변수 (Form 객체) */
	private String roleNm = null;

	/** pgmNoForm 변수 (Form 정보) */
	private String pgmNoForm = null;

	/** usr_auth_tp_cd 변수 (Session 정보) */
	private String loginUserUsrAuthTpCd = null;

	/** ofc_cd 변수 (Session 정보) */
	private String loginUserOfcCd = null;

	/**
	 * 
	 */
	public ComSys010Event(){}

	/**
	 * @param roleCd
	 * @param roleNm
	 * @param pgmNoForm
	 */
	public ComSys010Event(String roleCd, String roleNm, String pgmNoForm) {
		this.roleCd = roleCd;
		this.roleNm = roleNm;
		this.pgmNoForm = pgmNoForm;
	}

	/**
	 * @param ComPgmRoleVO comPgmRole
	 * @param roleCd
	 * @param roleNm
	 * @param pgmNoForm
	 */
	public ComSys010Event(ComPgmRoleVO comPgmRole, String roleCd, String roleNm, String pgmNoForm) {
		this.comPgmRole = comPgmRole;
		this.roleCd = roleCd;
		this.roleNm = roleNm;
		this.pgmNoForm = pgmNoForm;
	}

	/**
	 * @return
	 */
	public String getRoleCd(){
		return roleCd;
	}

	/**
	 * @param roleCd
	 */
	public void setRoleCd(String roleCd) {
		this.roleCd = roleCd;
	}

	/**
	 * @return
	 */
	public String getRoleNm() {
		return roleNm;
	}

	/**
	 * @param roleNm
	 */
	public void setRoleNm(String roleNm) {
		this.roleNm = roleNm;
	}

	/**
	 * @return
	 */
	public ComPgmRoleVO getComPgmRoleVO() {
		return comPgmRole;
	}

	/**
	 * @param com_role
	 */
	public void setComPgmRoleVO(ComPgmRoleVO comPgmRole) {
		this.comPgmRole = comPgmRole;
	}

	/**
	 * @return
	 */
	public ComPgmRoleVO[] getComPgmRoleVOS() {
		ComPgmRoleVO[] rtnVOs = null;
		if (this.comPgmRoleVOs != null) {
			rtnVOs = Arrays.copyOf(comPgmRoleVOs, comPgmRoleVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param comPgmRoles
	 */
	public void setComPgmRoleVOS(ComPgmRoleVO[] comPgmRoleVOs) {
		if(comPgmRoleVOs != null){
			ComPgmRoleVO[] tmpVOs = Arrays.copyOf(comPgmRoleVOs, comPgmRoleVOs.length);
			this.comPgmRoleVOs  = tmpVOs;
		}
	}

	/**
	 * @return
	 */
	public String getLogin_user_ofc_cd() {
		return loginUserOfcCd;
	}

	/**
	 * @param login_user_ofc_cd
	 */
	public void setLogin_user_ofc_cd(String loginUserOfcCd) {
		this.loginUserOfcCd = loginUserOfcCd;
	}

	/**
	 * @return
	 */
	public String getLogin_user_usr_auth_tp_cd() {
		return loginUserUsrAuthTpCd;
	}

	/**
	 * @param loginUserUsrAuthTpCd
	 */
	public void setLogin_user_usr_auth_tp_cd(String loginUserUsrAuthTpCd) {
		this.loginUserUsrAuthTpCd = loginUserUsrAuthTpCd;
	}

	/**
	 * @return
	 */
	public String getPgmNoForm() {
		return pgmNoForm;
	}

	/**
	 * @param pgmNoForm
	 */
	public void setPgmNoForm(String pgmNoForm) {
		this.pgmNoForm = pgmNoForm;
	}


	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "UI_COM_SYS_010Event";
	}
}
