/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UI_COM_SYS_008Event.java
*@FileTitle : 역할 매핑
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
 * UI_COM_SYS_008 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - UI_COM_SYS_008HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author SeongWook Kim
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComSys008Event extends EventSupport {

	private static final long serialVersionUID = 9153108782368809460L;

	/** com_role Table  Value Object */
//	private COM_USR_ROLE_MTCH com_role = null;
	private ComUsrRoleMtchVO comRole = null;

	private ComUsrRoleMtchVO[] comUsrRoleMtchVOs = null;

	/** usr_id 변수 (Form 객체) */
	private String usrId = null;

	/** usrId 변수 (Form 객체) */
	private String usrNm = null;

	/** User의 권한 */
	private String usrAuthTpCd = null;
	
	/** Super User's Role 관리 화면 여부 */
	private String usrRoleAdmMtch = null;
	
	/** Search 구분 */
	private String searchFlag = null;

	/**
	 * 
	 */
	public ComSys008Event(){}

	/**
	 * @return ComUsrRoleMtchVO
	 */
	public ComUsrRoleMtchVO getComUsrRoleMtchVO() {
		return comRole;
	}

	/**
	 * @param com_role
	 */
	public void setComUsrRoleMtchVO(ComUsrRoleMtchVO comRole) {
		this.comRole = comRole;
	}
	
	/**
	 * @return
	 */
	public ComUsrRoleMtchVO[] getComUsrRoleMtchVOs() {
		ComUsrRoleMtchVO[] rtnVOs = null;
		if (this.comUsrRoleMtchVOs != null) {
			rtnVOs = Arrays.copyOf(comUsrRoleMtchVOs, comUsrRoleMtchVOs.length);
		}
		return rtnVOs;
	}

	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	public String getUsrId() {
		return usrId;
	}

	public void setUsrNm(String usrNm) {
		this.usrNm = usrNm;
	}

	public String getUsrNm() {
		return usrNm;
	}

	public void setComUsrRoleMtchVOs(ComUsrRoleMtchVO[] comUsrRoleMtchVOs) {
		if(comUsrRoleMtchVOs != null){
			ComUsrRoleMtchVO[] tmpVOs = Arrays.copyOf(comUsrRoleMtchVOs, comUsrRoleMtchVOs.length);
			this.comUsrRoleMtchVOs  = tmpVOs;
		}
	}

	/**
	 * @param usrAuthTpCd the usrAuthTpCd to set
	 */
	public void setUsrAuthTpCd(String usrAuthTpCd) {
		this.usrAuthTpCd = usrAuthTpCd;
	}

	/**
	 * @return the usrAuthTpCd
	 */
	public String getUsrAuthTpCd() {
		return usrAuthTpCd;
	}

	/**
	 * @param usrRoleAdmMtch the usrRoleAdmMtch to set
	 */
	public void setUsrRoleAdmMtch(String usrRoleAdmMtch) {
		this.usrRoleAdmMtch = usrRoleAdmMtch;
	}

	/**
	 * @return the usrRoleAdmMtch
	 */
	public String getUsrRoleAdmMtch() {
		return usrRoleAdmMtch;
	}

	/**
	 * @param searchFlag the searchFlag to set
	 */
	public void setSearchFlag(String searchFlag) {
		this.searchFlag = searchFlag;
	}

	/**
	 * @return the searchFlag
	 */
	public String getSearchFlag() {
		return searchFlag;
	}

}
