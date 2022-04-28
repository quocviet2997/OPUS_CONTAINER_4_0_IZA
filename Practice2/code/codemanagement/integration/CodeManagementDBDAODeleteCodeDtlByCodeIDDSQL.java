/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : CodeManagementDBDAODeleteCodeDtlByCodeIDDSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2022.04.27
*@LastModifier : 
*@LastVersion : 1.0
* 2022.04.27 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.training02.codemanagement.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Viet Tran
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CodeManagementDBDAODeleteCodeDtlByCodeIDDSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Delete code detail by CodeID
	  * </pre>
	  */
	public CodeManagementDBDAODeleteCodeDtlByCodeIDDSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.esm.clv.training02.codemanagement.integration").append("\n"); 
		query.append("FileName : CodeManagementDBDAODeleteCodeDtlByCodeIDDSQL").append("\n"); 
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
		query.append("DELETE FROM COM_INTG_CD_DTL" ).append("\n"); 
		query.append("WHERE INTG_CD_ID IN (" ).append("\n"); 
		query.append("	#foreach($key IN ${codeID_list}) #if($velocityCount < $codeID_list.size()) '$key', #else '$key' #end #end" ).append("\n"); 
		query.append(")" ).append("\n"); 

	}
}