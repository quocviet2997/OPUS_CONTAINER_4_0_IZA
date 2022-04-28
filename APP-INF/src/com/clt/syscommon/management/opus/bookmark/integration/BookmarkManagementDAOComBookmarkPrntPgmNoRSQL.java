/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : BookmarkManagementDAOComBookmarkPrntPgmNoRSQL.java
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

public class BookmarkManagementDAOComBookmarkPrntPgmNoRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * SELECT PRNT_PGM_NO FROM COM_MNU_CFG WHERE CHD_PGM_NO =@[pgm_no]
	  * </pre>
	  */
	public BookmarkManagementDAOComBookmarkPrntPgmNoRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pgm_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.bookmark.integration").append("\n"); 
		query.append("FileName : BookmarkManagementDAOComBookmarkPrntPgmNoRSQL").append("\n"); 
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
		query.append("SELECT PRNT_PGM_NO FROM COM_MNU_CFG WHERE CHD_PGM_NO =@[pgm_no] AND ROWNUM = 1" ).append("\n"); 

	}
}