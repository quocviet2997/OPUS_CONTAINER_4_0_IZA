/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : BookmarkManagementDAOcomBookmarkCheckRoleRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.06.15
*@LastModifier : 
*@LastVersion : 1.0
* 2016.06.15 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.bookmark.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class BookmarkManagementDAOcomBookmarkCheckRoleRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * get Rolecodes
	  * </pre>
	  */
	public BookmarkManagementDAOcomBookmarkCheckRoleRSQL(){
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
		params.put("pgm_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.bookmark.integration").append("\n"); 
		query.append("FileName : BookmarkManagementDAOcomBookmarkCheckRoleRSQL").append("\n"); 
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
		query.append("SELECT count(*)" ).append("\n"); 
		query.append("FROM COM_PGM_ROLE A, COM_USR_ROLE_MTCH B" ).append("\n"); 
		query.append("WHERE A.USR_ROLE_CD = B.USR_ROLE_CD" ).append("\n"); 
		query.append("AND A.PGM_NO = @[pgm_no]" ).append("\n"); 
		query.append("AND B.USR_ID = @[usr_id]" ).append("\n"); 

	}
}