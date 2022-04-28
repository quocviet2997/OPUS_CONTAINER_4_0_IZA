/*=========================================================
 *Copyright(c) 2008 CyberLogitec
 *@FileName : UI_COM_SYS_015Event.java
 *@FileTitle : 오피스체인지
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2009.03.19
 *@LastModifier : SeongWook LEE
 *@LastVersion : 1.0
 * 2009.06.30 SeongWook LEE
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.user.event;

import java.util.Arrays;
import java.util.Collection;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.COM_USER2;
import com.clt.syscommon.common.table.ComUsrOfcCngVO;



/**
 *
 * @author SeongWook LEE
 * @see HTMLAction 참조
 * @since J2EE 1.4
 * @author 이성욱
 */
public class UiComSys015Event extends EventSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7194121085597809892L;

	/** com_user Table  Value Object */
	private COM_USER2 comUser = null;

	/** gni_usr_files BMS 추가정보 Multi Action을 위한 Collection */
	private Collection<Object> gniUsrFiles = null;

	/** usr_id 변수 (Form 객체) */
	private String usrId = null;

	/** usr_nm 변수 (Form 객체) */
	private String usrNm = null;

	/** usr_nm 변수 (Form 객체) */
	private String authType = null;
	
	/** Admin 기능 여부 (Form 객체) */
	private String adminPage = null;
	
	/** Change Office Code */
	private String cngOfcCd = null;
	
	/** Default Login Office Code */
	private String defaultOfcCd = null;

	/** User Basic Info를 세팅하기 위한 Row 정보 */
	private String sRow = null;

	private ComUsrOfcCngVO[] comUsers = null;
	/**
	 * 
	 */
	public UiComSys015Event(){}

	public String getDefault_ofc_cd() {
		return defaultOfcCd;
	}

	public void setDefault_ofc_cd(String default_ofc_cd) {
		this.defaultOfcCd = default_ofc_cd;
	}

	/**
	 * @param COM_USER2 com_user
	 */
	public UiComSys015Event(COM_USER2 com_user) {
		this.comUser = com_user;
    }

	/**
	 * @param COM_USER2 com_user
	 * @param ComUsrOfcCngVO[] com_users
	 */
	public UiComSys015Event(COM_USER2 com_user, ComUsrOfcCngVO[] com_users) {
		this.comUser = com_user;
		this.comUsers = com_users;
    }

	/**
	 * @param COM_USER2 com_user
	 * @param ComUsrOfcCngVO[] com_users
	 * @param String usr_id
	 */
	public UiComSys015Event(COM_USER2 com_user, ComUsrOfcCngVO[] com_users, String usr_id) {
		this.comUser = com_user;
		this.comUsers = com_users;
		this.usrId = usr_id;
    }

	/**
	 * @param COM_USER2 com_user
	 * @param ComUsrOfcCngVO[] com_users
	 * @param String usr_id
	 * @param String usr_nm
	 */
	public UiComSys015Event(COM_USER2 com_user, ComUsrOfcCngVO[] com_users, String usr_id, String usr_nm) {
		this.comUser = com_user;
		this.comUsers = com_users;
		this.usrId = usr_id;
		this.usrNm = usr_nm;
    }

	/**
	 * @param COM_USER2 com_user
	 * @param ComUsrOfcCngVO[] com_users
	 * @param Collection<Object> gni_usr_files
	 * @param String usr_id
	 * @param String usr_nm
	 */
	public UiComSys015Event(COM_USER2 com_user, ComUsrOfcCngVO[] com_users, Collection<Object> gni_usr_files, String usr_id, String usr_nm) {
		this.comUser = com_user;
		this.comUsers = com_users;
		this.gniUsrFiles = gni_usr_files;
		this.usrId = usr_id;
		this.usrNm = usr_nm;
    }

	/**
	 * @param COM_USER2 com_user
	 * @param ComUsrOfcCngVO[] com_users
	 * @param Collection<Object> gni_usr_files
	 * @param String usr_id
	 * @param String usr_nm
	 * @param String auth_type
	 */
	public UiComSys015Event(COM_USER2 com_user, ComUsrOfcCngVO[] com_users, Collection<Object> gni_usr_files, String usr_id, String usr_nm, String auth_type) {
		this.comUser = com_user;
		this.comUsers = com_users;
		this.gniUsrFiles = gni_usr_files;
		this.usrId = usr_id;
		this.usrNm = usr_nm;
		this.authType = auth_type;
	}

	/**
	 * @param COM_USER2 com_user
	 * @param String usr_id
	 * @param String usr_nm
	 */
	public UiComSys015Event(COM_USER2 com_user, String usr_id, String usr_nm) {
		this.comUser = com_user;
		this.usrId = usr_id;
		this.usrNm = usr_nm;
    }

	/**
	 * @return
	 */
	public COM_USER2 getCOM_USER2(){
		return comUser;
	}

	/**
	 * @return
	 */
	public Collection<Object> getGNI_USR_FILES(){
		return gniUsrFiles;
	}

	/**
	 * @return
	 */
	public String getUsr_id(){
		return usrId;
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
	public String getAuth_type() {
		return authType;
	}

	/** (non-Javadoc)
	 * @see com.clt.framework.support.layer.event.EventSupport#getEventName()
	 */
	public String getEventName() {
		return "UiComSys015Event";
	}

	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "UiComSys015Event";
	}

	public String getAdmin_page() {
		return adminPage;
	}

	public void setAdmin_page(String admin_page) {
		this.adminPage = admin_page;
	}

	public String getCng_ofc_cd() {
		return cngOfcCd;
	}

	public void setCng_ofc_cd(String cng_ofc_cd) {
		this.cngOfcCd = cng_ofc_cd;
	}

	public String getSRow() {
		return sRow;
	}

	public void setSRow(String row) {
		sRow = row;
	}

	public void setUsr_id(String usr_id) {
		this.usrId = usr_id;
	}

	public void setUsr_nm(String usr_nm) {
		this.usrNm = usr_nm;
	}
	
	public void setAuth_type(String auth_type) {
		this.authType = auth_type;
	}

	public ComUsrOfcCngVO[] getComUserVO() {
		ComUsrOfcCngVO[] rtnVOs = null;
		if (this.comUsers != null) {
			rtnVOs = Arrays.copyOf(comUsers, comUsers.length);
		}
		return rtnVOs;
	}

	public void setComUserVO(ComUsrOfcCngVO[] comUsers) {
		if(comUsers != null){
			ComUsrOfcCngVO[] tmpVOs = Arrays.copyOf(comUsers, comUsers.length);
			this.comUsers  = tmpVOs;
		}
	}

}
