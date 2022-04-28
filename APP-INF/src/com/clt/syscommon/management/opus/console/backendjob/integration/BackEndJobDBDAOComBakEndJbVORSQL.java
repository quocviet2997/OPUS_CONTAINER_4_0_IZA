/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BackEndJobDBDAOComBakEndJbVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.07
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.07.07 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.console.backendjob.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Jeong-Hoon, Kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class BackEndJobDBDAOComBakEndJbVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  *    
	  * </pre>
	  */
	public BackEndJobDBDAOComBakEndJbVORSQL(){
		setQuery();
		
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("jb_sts_flg",new String[]{arrTmp[0],arrTmp[1]});

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
		query.append("JB_ID" ).append("\n"); 
		query.append(",	THD_ID" ).append("\n"); 
		query.append(",	JB_MSG" ).append("\n"); 
		query.append(",	JB_STS_FLG" ).append("\n"); 
		query.append(",	CRE_USR_ID" ).append("\n"); 
		query.append(",	CRE_DT" ).append("\n"); 
		query.append(",	UPD_USR_ID" ).append("\n"); 
		query.append(",	UPD_DT" ).append("\n"); 
		query.append("FROM COM_BAK_END_JB" ).append("\n"); 
		query.append("WHERE	JB_STS_FLG = @[jb_sts_flg]" ).append("\n"); 

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.nis2010.management.console.backendjob.integration").append("\n"); 
		query.append("FileName : BackEndJobDBDAOComBakEndJbVORSQL").append("\n"); 
		query.append("*/").append("\n"); 
	}
}