/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComUsrRoleConditionVO.java
*@FileTitle : ComUsrRoleConditionVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.16
*@LastModifier : 이승열
*@LastVersion : 1.0
* 2009.02.16 이승열 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.role.vo;
  
import java.util.HashMap;

import com.clt.framework.component.common.AbstractValueObject;

/**
 * 사용자별 Role mapping정보를 조회하는 조건을 저장하는 VO<br>
 * 
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 이승열
 * @see
 * @since J2EE 1.5
 */
public class ComUsrRoleConditionVO extends AbstractValueObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2313362567802816396L;
	private String usrRoleCd =null;
	private String usrRoleNm = null;
	private String usrAuthTpCd	=  null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();
	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();

	
	@Override
	public HashMap<String, String> getColumnValues() {
		this.hashColumns.put("usr_role_cd", getUsrRoleCd());
		this.hashColumns.put("usr_role_nm", getUsrRoleNm());
		this.hashColumns.put("usr_auth_tp_cd", getUsrAuthTpCd());
		return this.hashColumns;
	}

	@Override
	public HashMap<String, String> getFieldNames() {
		this.hashFields.put("usr_role_cd", "usrRoleCd");
		this.hashFields.put("usr_role_nm", "usrRoleNm");
		this.hashFields.put("usr_auth_tp_cd", "usrAuthTpCd");
		return this.hashFields;
	}

	public void setUsrRoleCd(String usrRoleCd) {
		this.usrRoleCd = usrRoleCd;
	}

	public String getUsrRoleCd() {
		return usrRoleCd;
	}

	public void setUsrRoleNm(String usrRoleNm) {
		this.usrRoleNm = usrRoleNm;
	}

	public String getUsrRoleNm() {
		return usrRoleNm;
	}

	public void setUsrAuthTpCd(String usrAuthTpCd) {
		this.usrAuthTpCd = usrAuthTpCd;
	}

	public String getUsrAuthTpCd() {
		return usrAuthTpCd;
	}

}
