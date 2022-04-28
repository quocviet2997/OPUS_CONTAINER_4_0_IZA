/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : UserRoleDAOComUsrRoleUtilRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.23
*@LastModifier : 
*@LastVersion : 1.0
* 2009.09.23 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.role.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class UserRoleDAOComUsrRoleUtilRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * User Role Util select query
	  * </pre>
	  */
	public UserRoleDAOComUsrRoleUtilRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_id",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.role.integration").append("\n"); 
		query.append("FileName : UserRoleDAOComUsrRoleUtilRSQL").append("\n"); 
		query.append("*/").append("\n"); 
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
		query.append("select a.usr_role_cd, a.usr_role_nm, a.usr_role_desc" ).append("\n"); 
		query.append("from com_usr_role a, COM_USR_ROLE_MTCH b" ).append("\n"); 
		query.append("where a.usr_role_cd = b.usr_role_cd" ).append("\n"); 
		query.append("and b.usr_id = @[usr_id]" ).append("\n"); 

	}
}