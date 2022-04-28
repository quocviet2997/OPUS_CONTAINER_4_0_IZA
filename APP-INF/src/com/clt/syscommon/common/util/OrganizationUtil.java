/*=========================================================
 *Copyright(c) 2008 CyberLogitec
 *@FileName : OrganizationUtil.java
 *@FileTitle : OrganizationUtil
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2009.08.24
 *@LastModifier : 김경범
 *@LastVersion : 1.0
 * 2009.08.24 김경범
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.util;

import org.apache.log4j.Logger;

import com.clt.framework.core.layer.integration.DAOException;
import com.clt.syscommon.management.opus.user.integration.UserDAO;

/**
 * OrganizationUtil.
 * 
 * @author desis
 * @see UserDAO
 * @since J2EE 1.4
 */
public class OrganizationUtil {
	private final Logger log = Logger.getLogger(this.getClass());
	
	/**
	  * 유저의 지역본부코드를 구한다.
	 * @param String usrId	유저아이디
	 * @return	String rHQ	지역본부코드
	 */
	public String getHeadQuaterCode(String usrId){
		String rHQ = null;
		if( !usrId.equals("") ) {
			try {
				rHQ = (new UserDAO()).searchUserHeadQuarterInfo(usrId);
			} catch (DAOException e) {
				log.error(e.getMessage());
				Logger.getLogger(this.getClass()).debug("OrganizationUtil.getHeadQuaterCode error!");
			}
		}

		return rHQ;
	}
	
	/**
	  * 오피스의        지역본부코드를 구한다.
	 * @param String ofcCd	유저아이디
	 * @return String rHQ	지역본부코드
	 */
	public String getHeadQuaterCodeByOfcCd(String ofcCd){
		String rHQ = null;
		if( !ofcCd.equals("") ) {
			try {
				rHQ = (new UserDAO()).searchUserHeadQuarterInfoByOfcCd(ofcCd);
			} catch (DAOException e) {
				log.error(e.getMessage());
				Logger.getLogger(this.getClass()).debug("OrganizationUtil.getHeadQuaterCodeByOfcCd error!");
			}
		}

		return rHQ;
	}
	
	/**
	  * 오피스의        지역본부코드를 구한다.
	 * @param String ofcCd	유저아이디
	 * @return String rHQ	지역본부코드
	 */
	public String getParentOffice(String usrId){
		String office = null;
		if( !usrId.equals("") ) {
			try {
				office = (new UserDAO()).searchUserParentOffice(usrId);
			} catch (DAOException e) {
				log.error(e.getMessage());
				Logger.getLogger(this.getClass()).debug("OrganizationUtil.getParentOffice error!");
			}
		}

		return office;
	}
}
