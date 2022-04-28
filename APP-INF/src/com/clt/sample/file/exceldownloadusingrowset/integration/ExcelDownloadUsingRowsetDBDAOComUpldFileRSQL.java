/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ExcelDownloadUsingRowsetDBDAOComUpldFileRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.12.09
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.12.09 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.file.exceldownloadusingrowset.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Jeong-Hoon, Kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ExcelDownloadUsingRowsetDBDAOComUpldFileRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  *    
	  * </pre>
	  */
	public ExcelDownloadUsingRowsetDBDAOComUpldFileRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.sample.file.exceldownloadusingrowset.integration").append("\n"); 
		query.append("FileName : ExcelDownloadUsingRowsetDBDAOComUpldFileRSQL").append("\n"); 
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
		query.append("select" ).append("\n"); 
		query.append("'aaa' COL1" ).append("\n"); 
		query.append(",'' COL2" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("from dual" ).append("\n"); 

	}
}