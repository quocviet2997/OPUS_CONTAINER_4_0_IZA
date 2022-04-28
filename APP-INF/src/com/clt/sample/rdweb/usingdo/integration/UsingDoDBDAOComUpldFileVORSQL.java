/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : UsingDoDBDAOComUpldFileVORSQL.java
*@FileTitle : RdWebSample
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.18
*@LastModifier : 
*@LastVersion : 1.0
* 2009.05.18 
* 1.0 Creation
=========================================================*/
package com.clt.sample.rdweb.usingdo.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.4
 */

public class UsingDoDBDAOComUpldFileVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  *    
	  * </pre>
	  */
	public UsingDoDBDAOComUpldFileVORSQL(){
		setQuery();
		
		params = new HashMap<String,String[]>();
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
		query.append("file_sav_id" ).append("\n"); 
		query.append(",	file_upld_nm" ).append("\n"); 
		query.append(",	file_sz_capa" ).append("\n"); 
		query.append("FROM com_upld_file" ).append("\n"); 
		query.append("where rownum < 5" ).append("\n"); 

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.sample.rdweb.usingdo.integration").append("\n"); 
		query.append("FileName : UsingDoDBDAOComUpldFileVORSQL").append("\n"); 
		query.append("*/").append("\n"); 
	}
}