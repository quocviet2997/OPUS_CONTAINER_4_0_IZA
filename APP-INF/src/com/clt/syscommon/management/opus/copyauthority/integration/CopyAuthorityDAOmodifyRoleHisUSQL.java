/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : CopyAuthorityDAOmodifyRoleHisUSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.06.09
*@LastModifier : 
*@LastVersion : 1.0
* 2016.06.09 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.copyauthority.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CopyAuthorityDAOmodifyRoleHisUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * DESC Enter..
	  * </pre>
	  */
	public CopyAuthorityDAOmodifyRoleHisUSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("to_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.copyauthority.integration ").append("\n"); 
		query.append("FileName : CopyAuthorityDAOmodifyRoleHisUSQL").append("\n"); 
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
		query.append("UPDATE COM_USR_ROLE_MTCH_HIS" ).append("\n"); 
		query.append("   SET EXP_DT = SYSDATE," ).append("\n"); 
		query.append("       UPD_USR_ID = 'authcopy'," ).append("\n"); 
		query.append("       UPD_DT = SYSDATE" ).append("\n"); 
		query.append(" WHERE USR_ID = @[to_usr_id]" ).append("\n"); 
		query.append("   AND EXP_DT = TO_DATE('9999-12-31', 'YYYY-MM-DD')" ).append("\n"); 

	}
}