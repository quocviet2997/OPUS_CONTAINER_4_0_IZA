/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : RoleDAOComUsrRoleRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.02.26
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2010.02.26 김경범
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

public class RoleDAOComUsrRoleRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * select com_usr_role
	  * </pre>
	  */
	public RoleDAOComUsrRoleRSQL(){
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
		params.put("usr_role_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_role_nm",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.role.integration").append("\n"); 
		query.append("FileName : RoleDAOComUsrRoleRSQL").append("\n"); 
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
		query.append("#if(${usr_auth_tp_cd}=='A')     " ).append("\n"); 
		query.append("   SELECT                     " ).append("\n"); 
		query.append("     			level, " ).append("\n"); 
		query.append("         '' delcheck, " ).append("\n"); 
		query.append("         '' status, " ).append("\n"); 
		query.append("         '' lvl,     " ).append("\n"); 
		query.append("    usr_role_cd, " ).append("\n"); 
		query.append("    usr_role_nm,     " ).append("\n"); 
		query.append("    usr_role_desc, " ).append("\n"); 
		query.append("    prnt_usr_role_cd, " ).append("\n"); 
		query.append("    user_assign, " ).append("\n"); 
		query.append("    prog_assign, " ).append("\n"); 
		query.append("    cre_dt," ).append("\n"); 
		query.append("	ADM_YN" ).append("\n"); 
		query.append("   FROM (     " ).append("\n"); 
		query.append("    SELECT A.usr_role_cd, " ).append("\n"); 
		query.append("          A.usr_role_nm, " ).append("\n"); 
		query.append("          A.USR_ROLE_DESC, " ).append("\n"); 
		query.append("       A.PRNT_USR_ROLE_CD, " ).append("\n"); 
		query.append("          DECODE(B.USR_ROLE_CD,NULL,'X',0,'X','O') USER_ASSIGN, " ).append("\n"); 
		query.append("          DECODE(C.USR_ROLE_CD,NULL,'X',0,'X','O') PROG_ASSIGN, " ).append("\n"); 
		query.append("       TO_CHAR(A.CRE_DT,'YYYYMMDD') CRE_DT," ).append("\n"); 
		query.append("		'Y' ADM_YN" ).append("\n"); 
		query.append("   FROM COM_USR_ROLE a," ).append("\n"); 
		query.append("			(SELECT DISTINCT B1.USR_ROLE_CD FROM COM_USR_ROLE_MTCH B1) B," ).append("\n"); 
		query.append("			(SELECT DISTINCT C1.USR_ROLE_CD FROM COM_PGM_ROLE C1) C     " ).append("\n"); 
		query.append("     WHERE 1=1     " ).append("\n"); 
		query.append("      AND A.USR_ROLE_CD = B.USR_ROLE_CD(+)     " ).append("\n"); 
		query.append("      AND A.USR_ROLE_CD = C.USR_ROLE_CD(+)     " ).append("\n"); 
		query.append("      AND ('ALL' = @[usr_role_cd] OR a.usr_role_cd LIKE '%' || @[usr_role_cd] || '%' )     " ).append("\n"); 
		query.append("      AND ('ALL' = @[usr_role_nm] OR a.usr_role_nm LIKE '%' || @[usr_role_nm] || '%' )     " ).append("\n"); 
		query.append("         )     " ).append("\n"); 
		query.append("   START WITH PRNT_USR_ROLE_CD IS NULL     " ).append("\n"); 
		query.append("   CONNECT BY PRIOR USR_ROLE_CD = PRNT_USR_ROLE_CD" ).append("\n"); 
		query.append("   ORDER SIBLINGS BY usr_role_cd" ).append("\n"); 
		query.append("#elseif(${usr_auth_tp_cd}=='S')" ).append("\n"); 
		query.append("   SELECT                     " ).append("\n"); 
		query.append("     	level, " ).append("\n"); 
		query.append("      '' delcheck, " ).append("\n"); 
		query.append("      '' status, " ).append("\n"); 
		query.append("      '' lvl, " ).append("\n"); 
		query.append("    usr_role_cd, " ).append("\n"); 
		query.append("    usr_role_nm, " ).append("\n"); 
		query.append("    usr_role_desc, " ).append("\n"); 
		query.append("    prnt_usr_role_cd, " ).append("\n"); 
		query.append("    user_assign, " ).append("\n"); 
		query.append("    prog_assign, " ).append("\n"); 
		query.append("    cre_dt," ).append("\n"); 
		query.append("	adm_yn" ).append("\n"); 
		query.append("   FROM (     " ).append("\n"); 
		query.append("   SELECT A.usr_role_cd, " ).append("\n"); 
		query.append("         A.usr_role_nm, " ).append("\n"); 
		query.append("         A.USR_ROLE_DESC, " ).append("\n"); 
		query.append("         A.PRNT_USR_ROLE_CD, " ).append("\n"); 
		query.append("         DECODE(B.USR_ROLE_CD,NULL,'X',0,'X','O') USER_ASSIGN, " ).append("\n"); 
		query.append("         DECODE(C.USR_ROLE_CD,NULL,'X',0,'X','O') PROG_ASSIGN, " ).append("\n"); 
		query.append("          TO_CHAR(A.CRE_DT,'YYYYMMDD') CRE_DT," ).append("\n"); 
		query.append("		DECODE(D.USR_ID, NULL, 'N', 'Y') ADM_YN     " ).append("\n"); 
		query.append("     FROM COM_USR_ROLE a," ).append("\n"); 
		query.append("				(SELECT DISTINCT B1.USR_ROLE_CD FROM COM_USR_ROLE_MTCH B1) B, " ).append("\n"); 
		query.append("				(SELECT DISTINCT C1.USR_ROLE_CD FROM COM_PGM_ROLE C1) C," ).append("\n"); 
		query.append("				COM_USR_ROLE_ADM_MTCH D" ).append("\n"); 
		query.append("     WHERE 1=1     " ).append("\n"); 
		query.append("      AND A.USR_ROLE_CD = B.USR_ROLE_CD(+)     " ).append("\n"); 
		query.append("      AND A.USR_ROLE_CD = C.USR_ROLE_CD(+)" ).append("\n"); 
		query.append("	  AND A.USR_ROLE_CD = D.USR_ROLE_CD(+) " ).append("\n"); 
		query.append("	  AND D.USR_ID(+) = @[usr_id]" ).append("\n"); 
		query.append("      AND ('ALL' = @[usr_role_cd] OR a.usr_role_cd LIKE '%' || @[usr_role_cd] || '%' )     " ).append("\n"); 
		query.append("      AND ('ALL' = @[usr_role_nm] OR a.usr_role_nm LIKE '%' || @[usr_role_nm] || '%' )     " ).append("\n"); 
		query.append("         )     " ).append("\n"); 
		query.append("   START WITH PRNT_USR_ROLE_CD IS NULL     " ).append("\n"); 
		query.append("   CONNECT BY PRIOR USR_ROLE_CD = PRNT_USR_ROLE_CD" ).append("\n"); 
		query.append("   ORDER SIBLINGS BY usr_role_cd" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}