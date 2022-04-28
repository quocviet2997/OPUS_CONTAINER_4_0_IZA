/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : BookmarkManagementDAOComBookmarkCSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2015.05.04
*@LastModifier : Jeong-Hoon, KIM
*@LastVersion : 1.0
* 2015.05.04 Jeong-Hoon, KIM
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.bookmark.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Jeong-Hoon, KIM
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class BookmarkManagementDAOComBookmarkCSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * insert com_Bookmark
	  * </pre>
	  */
	public BookmarkManagementDAOComBookmarkCSQL(){
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

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("dp_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("prnt_pgm_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.bookmark.integration").append("\n"); 
		query.append("FileName : BookmarkManagementDAOComBookmarkCSQL").append("\n"); 
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
		query.append("INSERT INTO COM_BOOKMARK (" ).append("\n"); 
		query.append("USR_ID, " ).append("\n"); 
		query.append("FOL_FLG," ).append("\n"); 
		query.append("PGM_NO," ).append("\n"); 
		query.append("DP_SEQ," ).append("\n"); 
		query.append("DP_NM," ).append("\n"); 
		query.append("PRNT_PGM_NO," ).append("\n"); 
		query.append("CRE_DT," ).append("\n"); 
		query.append("CRE_USR_ID," ).append("\n"); 
		query.append("UPD_DT," ).append("\n"); 
		query.append("UPD_USR_ID" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("SELECT" ).append("\n"); 
		query.append("	@[usr_id]," ).append("\n"); 
		query.append("	'N'," ).append("\n"); 
		query.append("	@[pgm_no]," ).append("\n"); 
		query.append("	(SELECT NVL(MAX(DP_SEQ) +1,1) FROM COM_BOOKMARK WHERE USR_ID=@[usr_id])," ).append("\n"); 
		query.append("	@[dp_nm]," ).append("\n"); 
		query.append("	@[prnt_pgm_no]," ).append("\n"); 
		query.append("	sysdate," ).append("\n"); 
		query.append("	@[usr_id]," ).append("\n"); 
		query.append("	sysdate," ).append("\n"); 
		query.append("	@[usr_id]" ).append("\n"); 
		query.append("from dual" ).append("\n"); 

	}
}