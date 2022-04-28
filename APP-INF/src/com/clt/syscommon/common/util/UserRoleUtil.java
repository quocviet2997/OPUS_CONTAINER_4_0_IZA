/*=========================================================
 *Copyright(c) 2008 CyberLogitec
 *@FileName : UserRoleUtil.java
 *@FileTitle : UserRoleUtil
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2009.09.23
 *@LastModifier : 김경범
 *@LastVersion : 1.0
 * 2009.08.24 김경범
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.util;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;

import com.clt.framework.core.layer.integration.DAOException;
import com.clt.syscommon.common.table.ComUsrRoleVO;
import com.clt.syscommon.management.opus.role.integration.RoleDBDAO;
import com.clt.syscommon.management.opus.superuser.integration.SuperUserDBDAO;
import com.clt.syscommon.management.opus.superuser.vo.SuperUserVO;

/**
 * UserRoleUtil.
 * 
 * @author desis
 * @see RoleDBDAO
 * @since J2EE 1.4
 */
public class UserRoleUtil {

	private Logger log = Logger.getLogger(this.getClass());
	
	/**
	  * 유저의 롤 코드를 구한다.
	 * @param usrId	유저아이디
	 * @return		ComUsrRoleVO 배열
	 */
	public ComUsrRoleVO[] getUserRole(String usrId){
		ComUsrRoleVO[] roleList = null;
		if( !usrId.equals("") ) {
			try {
				roleList = (new RoleDBDAO()).searchUserRoleList(usrId);
			} catch (DAOException e) {
				log.error(e.getMessage());
				Logger.getLogger(this.getClass()).debug("UserRoleUtil.getUserRole error!");
			}
		}

		return roleList;
	}
	
	/**
	  * 유저의           롤 코드를 구한다.
	 * @param usrId	유저아이디
	 * @return	String
	 */
	public String getUserAdminFlag(String usrId){
		String adminFlag = "N";
		List<SuperUserVO> list = null;
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("usr_id", usrId);
		param.put("opt", "C");
		if( !usrId.equals("") ) {
			try {
				list = (new SuperUserDBDAO()).getSuperUser(param);
				if(!list.isEmpty()) adminFlag = list.get(0).getAdmin();
			} catch (DAOException e) {
				log.error(e.getMessage());
				Logger.getLogger(this.getClass()).debug("UserRoleUtil.getUserAdminFlag error!");
			}
		}

		return adminFlag;
	}
}
