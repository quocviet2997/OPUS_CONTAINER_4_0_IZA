/*=========================================================
*Copyright(c) 2013 CyberLogitec
*@FileName : ValueManageDBDAOsearchSetupModuleListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2013.07.17
*@LastModifier : 
*@LastVersion : 1.0
* 2013.07.17 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.sup.valuemanage.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ValueManageDBDAOsearchSetupModuleListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * searchSetupModuleList
	  * </pre>
	  */
	public ValueManageDBDAOsearchSetupModuleListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.sup.valuemanage.integration").append("\n"); 
		query.append("FileName : ValueManageDBDAOsearchSetupModuleListRSQL").append("\n"); 
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
		query.append("SELECT PGM_SUB_SYS_CD " ).append("\n"); 
		query.append("      , APLY_FLG" ).append("\n"); 
		query.append("FROM COM_STUP_MDL_USE_INFO" ).append("\n"); 

	}
}