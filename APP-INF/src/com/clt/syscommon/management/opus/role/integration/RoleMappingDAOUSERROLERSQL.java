/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : RoleMappingDAOUSERROLERSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.05.07
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2010.05.07 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.role.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author kyungbum kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class RoleMappingDAOUSERROLERSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * select user role
	  * </pre>
	  */
	public RoleMappingDAOUSERROLERSQL(){
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

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("login_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.role.integration").append("\n"); 
		query.append("FileName : RoleMappingDAOUSERROLERSQL").append("\n"); 
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
		query.append("#if(${search_flag}=='01')" ).append("\n"); 
		query.append("#if(${usr_role_adm_mtch}=='Y')" ).append("\n"); 
		query.append("select level, usr_role_cd, usr_role_nm, check_val" ).append("\n"); 
		query.append("from (" ).append("\n"); 
		query.append("	SELECT A.usr_role_cd, A.usr_role_nm, substr(a.usr_role_cd,0,3) sys," ).append("\n"); 
		query.append("			DECODE(B.usr_role_cd,NULL,'0','1') check_val   " ).append("\n"); 
		query.append("	FROM COM_USR_ROLE a, COM_USR_ROLE_ADM_MTCH B   " ).append("\n"); 
		query.append("	WHERE A.USR_ROLE_CD = B.USR_ROLE_CD(+)   " ).append("\n"); 
		query.append("	AND B.USR_ID(+) = @[usr_id]" ).append("\n"); 
		query.append(") x, com_usr_pgm_mtch y" ).append("\n"); 
		query.append("where length(y.pgm_no) = 3" ).append("\n"); 
		query.append("and x.sys = y.pgm_no" ).append("\n"); 
		query.append("and y.usr_id = @[usr_id]" ).append("\n"); 
		query.append("connect by prior usr_role_cd is null" ).append("\n"); 
		query.append("order by usr_role_cd" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("SELECT level, check_val, usr_role_cd, usr_role_nm, ADMIN_CHK" ).append("\n"); 
		query.append("FROM (" ).append("\n"); 
		query.append("	SELECT A.usr_role_cd, A.usr_role_nm,A.PRNT_USR_ROLE_CD," ).append("\n"); 
		query.append("			DECODE(B.usr_role_cd,NULL,'0','1') check_val," ).append("\n"); 
		query.append("#if(${login_usr_auth_tp_cd}=='S')" ).append("\n"); 
		query.append("			DECODE(C.usr_role_cd,NULL,'N','Y') ADMIN_CHK" ).append("\n"); 
		query.append("	FROM COM_USR_ROLE a, COM_USR_ROLE_MTCH B, COM_USR_ROLE_ADM_MTCH C" ).append("\n"); 
		query.append("	WHERE A.USR_ROLE_CD = B.USR_ROLE_CD(+)" ).append("\n"); 
		query.append("	AND A.USR_ROLE_CD = C.USR_ROLE_CD(+)" ).append("\n"); 
		query.append("	AND C.USR_ID(+) = @[login_usr_id]" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("			'' ADMIN_CHK" ).append("\n"); 
		query.append("	FROM COM_USR_ROLE a, COM_USR_ROLE_MTCH B" ).append("\n"); 
		query.append("	WHERE A.USR_ROLE_CD = B.USR_ROLE_CD(+)" ).append("\n"); 
		query.append("	" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("	AND B.USR_ID(+) = @[usr_id]" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("START WITH PRNT_USR_ROLE_CD IS NULL" ).append("\n"); 
		query.append("CONNECT BY PRIOR USR_ROLE_CD = PRNT_USR_ROLE_CD" ).append("\n"); 
		query.append("order by usr_role_cd" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("SELECT a.usr_role_cd, a.usr_role_nm" ).append("\n"); 
		query.append("FROM com_usr_role a, com_usr_role_mtch b" ).append("\n"); 
		query.append("WHERE b.usr_id = @[usr_id]" ).append("\n"); 
		query.append("AND a.usr_role_cd = b.usr_role_cd" ).append("\n"); 
		query.append("order by a.usr_role_cd" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}