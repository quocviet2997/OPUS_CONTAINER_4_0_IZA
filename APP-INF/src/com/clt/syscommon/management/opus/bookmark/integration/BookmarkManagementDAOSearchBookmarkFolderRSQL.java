/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BookmarkManagementDAOSearchBookmarkFolderRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.23
*@LastModifier : 
*@LastVersion : 1.0
* 2009.09.23 
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

public class BookmarkManagementDAOSearchBookmarkFolderRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * select user's bookmark folder list
	  * </pre>
	  */
	public BookmarkManagementDAOSearchBookmarkFolderRSQL(){
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
		query.append("Path : com.clt.syscommon.management.opus.bookmark.integration").append("\n"); 
		query.append("FileName : BookmarkManagementDAOSearchBookmarkFolderRSQL").append("\n"); 
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
		query.append("pgm_no," ).append("\n"); 
		query.append("dp_nm" ).append("\n"); 
		query.append("from com_bookmark" ).append("\n"); 
		query.append("where usr_id=@[usr_id]" ).append("\n"); 
		query.append("and fol_flg = 'Y'" ).append("\n"); 
		query.append("and (prnt_pgm_no is null or prnt_pgm_no='')" ).append("\n"); 
		query.append("ORDER BY dp_seq" ).append("\n"); 

	}
}