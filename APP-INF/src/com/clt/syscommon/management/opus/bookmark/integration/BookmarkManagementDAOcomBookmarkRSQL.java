/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : BookmarkManagementDAOcomBookmarkRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2015.09.07
*@LastModifier : 
*@LastVersion : 1.0
* 2015.09.07 
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

public class BookmarkManagementDAOcomBookmarkRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * select bookmark
	  * </pre>
	  */
	public BookmarkManagementDAOcomBookmarkRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("que_mk",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_id",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.bookmark.integration").append("\n"); 
		query.append("FileName : BookmarkManagementDAOcomBookmarkRSQL").append("\n"); 
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
		query.append("SELECT " ).append("\n"); 
		query.append("	A.DP_NM," ).append("\n"); 
		query.append("	A.PGM_NO, " ).append("\n"); 
		query.append("	A.DP_SEQ," ).append("\n"); 
		query.append("	DECODE(INSTR(PGM_URL, @[que_mk]),0," ).append("\n"); 
		query.append("	   B.PGM_URL||@[que_mk]||'pid='||A.PRNT_PGM_NO||'&MENU=Y&pgmNo='||A.PGM_NO||'&main_page=true&mainMenuLinkFlag=true&menuflag=true&parentPgmNo='||C.CHD_PGM_NO," ).append("\n"); 
		query.append("	   B.PGM_URL||'&pid='||A.PRNT_PGM_NO||'&MENU=Y&pgmNo='||A.PGM_NO||'&parentPgmNo='||C.CHD_PGM_NO||'&main_page=true&mainMenuLinkFlag=true') PGM_FULL_URL" ).append("\n"); 
		query.append("FROM COM_BOOKMARK A, COM_PROGRAM B, (" ).append("\n"); 
		query.append("        SELECT DISTINCT A.PGM_NO, A.CHD_PGM_NO, B.PRNT_PGM_NO" ).append("\n"); 
		query.append("        FROM (" ).append("\n"); 
		query.append("        SELECT " ).append("\n"); 
		query.append("            LEVEL LVL" ).append("\n"); 
		query.append("        	, A.CHD_PGM_NO" ).append("\n"); 
		query.append("			, A.PRNT_PGM_NO" ).append("\n"); 
		query.append("        	, CONNECT_BY_ISLEAF LEAF_FLG" ).append("\n"); 
		query.append("        	, CONNECT_BY_ROOT CHD_PGM_NO AS PGM_NO" ).append("\n"); 
		query.append("        FROM  COM_MNU_CFG A, COM_PROGRAM B" ).append("\n"); 
		query.append("        WHERE A.PRNT_PGM_NO = B.PGM_NO" ).append("\n"); 
		query.append("        START WITH A.CHD_PGM_NO IN (SELECT PGM_NO FROM COM_BOOKMARK WHERE USR_ID = @[usr_id]) " ).append("\n"); 
		query.append("        CONNECT BY A.CHD_PGM_NO = PRIOR A.PRNT_PGM_NO" ).append("\n"); 
		query.append("        ) A, COM_BOOKMARK B" ).append("\n"); 
		query.append("        WHERE A.LEAF_FLG = 1" ).append("\n"); 
		query.append("        AND A.PGM_NO = B.PGM_NO" ).append("\n"); 
		query.append("        AND B.USR_ID = @[usr_id]" ).append("\n"); 
		query.append("        AND SUBSTR(A.CHD_PGM_NO,0,7) = SUBSTR(B.PRNT_PGM_NO,0,7)" ).append("\n"); 
		query.append(") C" ).append("\n"); 
		query.append("WHERE A.USR_ID = @[usr_id]" ).append("\n"); 
		query.append("AND A.PGM_NO = B.PGM_NO" ).append("\n"); 
		query.append("AND A.PGM_NO = C.PGM_NO" ).append("\n"); 
		query.append("AND A.PRNT_PGM_NO = C.PRNT_PGM_NO" ).append("\n"); 
		query.append("ORDER BY A.DP_NM" ).append("\n"); 

	}
}