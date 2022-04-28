/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SendDBDAOComFtpSndInfoVORSQL.java
*@FileTitle : FTP_SEND
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.04
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.09.04 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.ftp.send.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Jeong-Hoon, Kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class SendDBDAOComFtpSndInfoVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 
	  * </pre>
	  */
	public SendDBDAOComFtpSndInfoVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.sample.ftp.send.integration").append("\n"); 
		query.append("FileName : SendDBDAOComFtpSndInfoVORSQL").append("\n"); 
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