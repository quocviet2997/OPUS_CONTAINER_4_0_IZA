/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ExcelDownloadDBDAOComUpldFileRSQL.java
*@FileTitle : ExcelDownload
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.22
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.09.22 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.file.exceldownload.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Jeong-Hoon, Kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ExcelDownloadDBDAOComUpldFileRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 
	  * </pre>
	  */
	public ExcelDownloadDBDAOComUpldFileRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.sample.file.exceldownload.integration").append("\n"); 
		query.append("FileName : ExcelDownloadDBDAOComUpldFileRSQL").append("\n"); 
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
		
	}
}