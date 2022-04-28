/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ${FILE_NAME}.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.20
*@LastModifier : 이승열
*@LastVersion : 1.0
* 2009.02.20 이승열
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.role.integration;

import java.util.HashMap;

import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author seungyol lee
 * @see 
 * @since J2EE 1.4
 */

public class RoleDAOComUsrRolePopupRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * select com_usr_role
	  * </pre>
	  */
	public RoleDAOComUsrRolePopupRSQL(){
		setQuery();
		
		params = new HashMap<String,String[]>();
	}
	
	public String getSQL(){
		return query.toString();
	}
	
	public HashMap<String,String[]> getParams() {
		return params;
	}
	
	/**
	 * Query 생성
	 */
	public void setQuery(){
		query.append("SELECT" ).append("\n"); 
		query.append("level," ).append("\n"); 
		query.append("'' lvl," ).append("\n"); 
		query.append("usr_role_cd," ).append("\n"); 
		query.append("usr_role_nm," ).append("\n"); 
		query.append("usr_role_desc," ).append("\n"); 
		query.append("prnt_usr_role_cd," ).append("\n"); 
		query.append("cre_dt" ).append("\n"); 
		query.append("FROM (" ).append("\n"); 
		query.append("SELECT A.usr_role_cd" ).append("\n"); 
		query.append(",A.usr_role_nm" ).append("\n"); 
		query.append(",A.USR_ROLE_DESC" ).append("\n"); 
		query.append(",A.PRNT_USR_ROLE_CD" ).append("\n"); 
		query.append(",( SELECT DECODE(COUNT(B.USR_ROLE_CD),0,'X','O')" ).append("\n"); 
		query.append("FROM COM_PGM_ROLE B" ).append("\n"); 
		query.append("WHERE A.USR_ROLE_CD = B.USR_ROLE_CD" ).append("\n"); 
		query.append(") USER_ASSIGN" ).append("\n"); 
		query.append(",( SELECT DECODE(COUNT(C.USR_ROLE_CD),0,'X','O')" ).append("\n"); 
		query.append("FROM COM_USR_ROLE_MTCH C" ).append("\n"); 
		query.append("WHERE A.USR_ROLE_CD = C.USR_ROLE_CD" ).append("\n"); 
		query.append(") PROG_ASSIGN" ).append("\n"); 
		query.append(",TO_CHAR(A.CRE_DT,'YYYYMMDD') CRE_DT" ).append("\n"); 
		query.append("FROM COM_USR_ROLE a" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("START WITH PRNT_USR_ROLE_CD IS NULL" ).append("\n"); 
		query.append("CONNECT BY PRIOR USR_ROLE_CD = PRNT_USR_ROLE_CD" ).append("\n"); 

	}
}