/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UI_COM_SYS_007Event.java
*@FileTitle : 역할관리
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-15
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-15 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.role.event;

import java.util.Arrays;
import java.util.Collection;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.ComPgmRoleVO;
import com.clt.syscommon.common.table.ComUserVO;
import com.clt.syscommon.common.table.ComUsrRoleVO;
import com.clt.syscommon.management.opus.role.vo.ComUsrRoleConditionVO;



/**
 * UI_COM_SYS_007 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - UI_COM_SYS_007HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author SeongWook Kim
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComSys007Event extends EventSupport {

	/** com_usr_roles Multi Action을 위한 Collection */
	private ComUsrRoleVO[] comUsrRoles = null;

	private ComUsrRoleConditionVO comUsrRoleConditionVO = null;

	/**
	 * 
	 */
	public ComSys007Event(){}

	public void setComUsrRoleConditionVO(ComUsrRoleConditionVO comUsrRoleConditionVO) {
		this.comUsrRoleConditionVO = comUsrRoleConditionVO;
	}

	public ComUsrRoleConditionVO getComUsrRoleConditionVO() {
		return comUsrRoleConditionVO;
	}

	public void setComUsrRoles(ComUsrRoleVO[] comUsrRoles) {
		if(comUsrRoles != null){
			ComUsrRoleVO[] tmpVOs = Arrays.copyOf(comUsrRoles, comUsrRoles.length);
			this.comUsrRoles  = tmpVOs;
		}
	}

	public ComUsrRoleVO[] getComUsrRoles() {
		ComUsrRoleVO[] rtnVOs = null;
		if (this.comUsrRoles != null) {
			rtnVOs = Arrays.copyOf(comUsrRoles, comUsrRoles.length);
		}
		return rtnVOs;
	}

}
