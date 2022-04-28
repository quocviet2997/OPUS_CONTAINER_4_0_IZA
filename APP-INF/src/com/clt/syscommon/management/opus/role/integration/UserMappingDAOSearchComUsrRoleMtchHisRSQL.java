/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : UserMappingDAOSearchComUsrRoleMtchHisRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.06.03
*@LastModifier : 
*@LastVersion : 1.0
* 2016.06.03 
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

public class UserMappingDAOSearchComUsrRoleMtchHisRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * DESC Enter..
	  * </pre>
	  */
	public UserMappingDAOSearchComUsrRoleMtchHisRSQL(){
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
		query.append("FileName : UserMappingDAOSearchComUsrRoleMtchHisRSQL").append("\n"); 
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
		query.append("SELECT A.USR_ROLE_CD," ).append("\n"); 
		query.append("       TO_CHAR(A.EFF_DT, 'YYYY-MM-DD HH24:MI:SS') EFF_DT," ).append("\n"); 
		query.append("       DECODE(A.EXP_DT, TO_DATE('9999-12-31', 'YYYY-MM-DD'), NULL, TO_CHAR(A.EXP_DT, 'YYYY-MM-DD HH24:MI:SS')) EXP_DT," ).append("\n"); 
		query.append("       A.UPD_USR_ID," ).append("\n"); 
		query.append("       (SELECT B.USR_ROLE_NM" ).append("\n"); 
		query.append("          FROM COM_USR_ROLE B" ).append("\n"); 
		query.append("         WHERE B.USR_ROLE_CD = A.USR_ROLE_CD) USR_ROLE_NM" ).append("\n"); 
		query.append("  FROM COM_USR_ROLE_MTCH_HIS A" ).append("\n"); 
		query.append(" WHERE A.USR_ID = @[usr_id]" ).append("\n"); 
		query.append("ORDER BY A.USR_ROLE_CD, A.USR_ROLE_HIS_SEQ" ).append("\n"); 

	}
}