/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : MessagesDAOComMgsSndIDMexRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.11.08
*@LastModifier : 김병국
*@LastVersion : 1.0
* 2018.11.08 김병국
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.common.messages.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Kim Byung Kook
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class MessagesDAOComMgsSndIDMexRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * mgs_id mex 값을 가져온다
	  * </pre>
	  */
	public MessagesDAOComMgsSndIDMexRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.common.messages.integration").append("\n"); 
		query.append("FileName : MessagesDAOComMgsSndIDMexRSQL").append("\n"); 
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
		query.append("SELECT COM_MSG_SEQ.NEXTVAL FROM DUAL" ).append("\n"); 

	}
}