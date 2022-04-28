/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : UserRoleProgramDAOSearchUserRoleProgramListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.02.13
*@LastModifier : 
*@LastVersion : 1.0
* 2018.02.13 
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

public class UserRoleProgramDAOSearchUserRoleProgramListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * select user program mapping information
	  * </pre>
	  */
	public UserRoleProgramDAOSearchUserRoleProgramListRSQL(){
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
		params.put("usr_nm",new String[]{arrTmp[0],arrTmp[1]});

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

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pgm_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pgm_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.role.integration").append("\n"); 
		query.append("FileName : UserRoleProgramDAOSearchUserRoleProgramListRSQL").append("\n"); 
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
		query.append("SELECT" ).append("\n"); 
		query.append("	A.USR_ID," ).append("\n"); 
		query.append("	A.USR_NM," ).append("\n"); 
		query.append("	A.USR_LOCL_NM," ).append("\n"); 
		query.append("	A.OFC_CD," ).append("\n"); 
		query.append("	C.USR_ROLE_CD," ).append("\n"); 
		query.append("	C.USR_ROLE_NM," ).append("\n"); 
		query.append("	E.PGM_NO," ).append("\n"); 
		query.append("	E.PGM_NM" ).append("\n"); 
		query.append("FROM COM_USER A," ).append("\n"); 
		query.append("       		COM_USR_ROLE_MTCH B,                               " ).append("\n"); 
		query.append("  			COM_USR_ROLE C," ).append("\n"); 
		query.append("			COM_PGM_ROLE D," ).append("\n"); 
		query.append("			COM_PROGRAM E" ).append("\n"); 
		query.append("WHERE A.USR_ID = B.USR_ID" ).append("\n"); 
		query.append("        AND B.USR_ROLE_CD = C.USR_ROLE_CD" ).append("\n"); 
		query.append("      	AND C.USR_ROLE_CD = D.USR_ROLE_CD " ).append("\n"); 
		query.append("      	AND D.PGM_NO = E.PGM_NO" ).append("\n"); 
		query.append("        AND A.USE_FLG = 'Y'" ).append("\n"); 
		query.append("       	AND ('ALL' = @[usr_id] OR A.USR_ID = @[usr_id] )          " ).append("\n"); 
		query.append("#if(${usr_id} == 'ALL')" ).append("\n"); 
		query.append("       	AND ('ALL' = @[usr_nm] OR upper(A.USR_NM) = upper(@[usr_nm]) OR upper(A.USR_LOCL_NM) = upper(@[usr_nm]) )          " ).append("\n"); 
		query.append("       	AND ('ALL' = @[usr_role_cd] OR C.USR_ROLE_CD = @[usr_role_cd] )     " ).append("\n"); 
		query.append("       	AND ('ALL' = @[usr_role_nm] OR upper(C.USR_ROLE_NM) = upper(@[usr_role_nm]) )     " ).append("\n"); 
		query.append("       	AND ('ALL' = @[pgm_no] OR E.PGM_NO = @[pgm_no] )" ).append("\n"); 
		query.append("       	AND ('ALL' = @[pgm_nm] OR upper(E.PGM_NM) = upper(@[pgm_nm]) )" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("       	AND ('ALL' = @[usr_nm] OR upper(A.USR_NM) LIKE '%' || upper(@[usr_nm]) || '%'  OR upper(A.USR_LOCL_NM) LIKE '%' || upper(@[usr_nm]) || '%' )          " ).append("\n"); 
		query.append("       	AND ('ALL' = @[usr_role_cd] OR C.USR_ROLE_CD LIKE '%' || @[usr_role_cd] || '%' )     " ).append("\n"); 
		query.append("       	AND ('ALL' = @[usr_role_nm] OR upper(C.USR_ROLE_NM) LIKE '%' || upper(@[usr_role_nm]) || '%' )     " ).append("\n"); 
		query.append("       	AND ('ALL' = @[pgm_no] OR E.PGM_NO LIKE '%' || @[pgm_no] || '%' )" ).append("\n"); 
		query.append("       	AND ('ALL' = @[pgm_nm] OR upper(E.PGM_NM) LIKE '%' || upper(@[pgm_nm]) || '%' )" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}