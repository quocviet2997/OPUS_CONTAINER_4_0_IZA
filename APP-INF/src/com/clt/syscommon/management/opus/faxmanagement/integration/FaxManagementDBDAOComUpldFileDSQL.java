/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : FaxManagementDBDAOComUpldFileDSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2015.02.04
*@LastModifier : Jeong-Hoon, KIM
*@LastVersion : 1.0
* 2015.02.04 Jeong-Hoon, KIM
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.faxmanagement.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Jeong-Hoon, KIM
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class FaxManagementDBDAOComUpldFileDSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Delete File Meta
	  * </pre>
	  */
	public FaxManagementDBDAOComUpldFileDSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("fax_snd_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.faxmanagement.integration").append("\n"); 
		query.append("FileName : FaxManagementDBDAOComUpldFileDSQL").append("\n"); 
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
		query.append("DELETE COM_UPLD_FILE WHERE FILE_SAV_ID LIKE @[fax_snd_no]||'%'" ).append("\n"); 

	}
}