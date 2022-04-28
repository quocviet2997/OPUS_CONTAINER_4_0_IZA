/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : UserDAOComUsrPwdHisByHisCountDSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2015.01.30
*@LastModifier : 
*@LastVersion : 1.0
* 2015.01.30 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.user.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class UserDAOComUsrPwdHisByHisCountDSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * ComUsrPwdHis Delete
	  * </pre>
	  */
	public UserDAOComUsrPwdHisByHisCountDSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("his_count",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_pwd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.user.integration").append("\n"); 
		query.append("FileName : UserDAOComUsrPwdHisByHisCountDSQL").append("\n"); 
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
		query.append("DELETE COM_USR_PWD_HIS" ).append("\n"); 
		query.append("WHERE USR_ID =   @[usr_id] " ).append("\n"); 
		query.append("AND USR_PWD  IN (  SELECT USR_PWD " ).append("\n"); 
		query.append("                FROM (  SELECT ROW_NUMBER() OVER(ORDER BY cre_dt DESC)  AS NUM,  USR_PWD  " ).append("\n"); 
		query.append("                        FROM COM_USR_PWD_HIS" ).append("\n"); 
		query.append("                        WHERE USR_ID =    @[usr_id]  " ).append("\n"); 
		query.append("                         )" ).append("\n"); 
		query.append("                WHERE NUM >  @[his_count] " ).append("\n"); 
		query.append(" 				UNION ALL" ).append("\n"); 
		query.append("                SELECT USR_PWD  " ).append("\n"); 
		query.append("                FROM  COM_USR_PWD_HIS " ).append("\n"); 
		query.append("                 WHERE USR_ID =  @[usr_id]  " ).append("\n"); 
		query.append("				 AND  USR_PWD = @[usr_pwd] " ).append("\n"); 
		query.append("				)" ).append("\n"); 

	}
}