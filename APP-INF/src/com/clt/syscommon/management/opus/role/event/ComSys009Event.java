/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UI_COM_SYS_009Event.java
*@FileTitle : 사용자 매핑
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
import com.clt.syscommon.common.table.ComUsrRoleMtchVO;



/**
 * UI_COM_SYS_009 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - UI_COM_SYS_009HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author SeongWook Kim
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComSys009Event extends EventSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5255998355220046757L;

	/** com_role Table  Value Object */
	private ComUsrRoleMtchVO comUsrRoleMtch = null;

	/** com_roles Multi Action을 위한 Collection */
	private ComUsrRoleMtchVO[] comUsrRoleMtchs = null;

	/** role_cd 변수 (Form 객체) */
	private String roleCd = null;

	/** role_nm 변수 (Form 객체) */
	private String roleNm = null;

	/** ofc_cd 변수 (Form 정보) */
	private String ofcCd = null;

	/**
	 * 
	 */
	public ComSys009Event(){}

	/**
	 * @param roleCd
	 * @param roleNm
	 * @param ofcCd
	 */
	public ComSys009Event(String roleCd, String roleNm, String ofcCd) {
		this.roleCd = roleCd;
		this.roleNm = roleNm;
		this.ofcCd = ofcCd;
	}

	/**
	 * @param comUsrRoleMtch
	 * @param roleCd
	 * @param roleNm
	 * @param ofcCd
	 */
	public ComSys009Event(ComUsrRoleMtchVO comUsrRoleMtch, String roleCd, String roleNm, String ofcCd) {
		this.comUsrRoleMtch = comUsrRoleMtch;
		this.roleCd = roleCd;
		this.roleNm = roleNm;
		this.ofcCd = ofcCd;
	}

	/**
	 * @return roleCd
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
	 * @return roleNm
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
	 * @return comUsrRoleMtch
	 */
	public ComUsrRoleMtchVO getComUsrRoleMtchVO() {
		return comUsrRoleMtch;
	}

	/**
	 * @param com_role
	 */
	public void setComUsrRoleMtchVO(ComUsrRoleMtchVO comUsrRoleMtch) {
		this.comUsrRoleMtch = comUsrRoleMtch;
	}

	/**
	 * @return comUsrRoleMtchs
	 */
	public ComUsrRoleMtchVO[] getComUsrRoleMtchVOS() {
		ComUsrRoleMtchVO[] rtnVOs = null;
		if (this.comUsrRoleMtchs != null) {
			rtnVOs = Arrays.copyOf(comUsrRoleMtchs, comUsrRoleMtchs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param comUsrRoleMtchs
	 */
	public void setComUsrRoleMtchVOS(ComUsrRoleMtchVO[] comUsrRoleMtchs) {
		if(comUsrRoleMtchs != null){
			ComUsrRoleMtchVO[] tmpVOs = Arrays.copyOf(comUsrRoleMtchs, comUsrRoleMtchs.length);
			this.comUsrRoleMtchs  = tmpVOs;
		}
	}

	/**
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return ofcCd;
	}

	/**
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
	}

}
