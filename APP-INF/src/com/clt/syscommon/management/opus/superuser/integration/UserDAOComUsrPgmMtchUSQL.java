/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : UserDAOComUsrPgmMtchUSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.05.06
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2010.05.06 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.superuser.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author kyungbum kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class UserDAOComUsrPgmMtchUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * update com_usr_pgm_mtch
	  * </pre>
	  */
	public UserDAOComUsrPgmMtchUSQL(){
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
		params.put("admin",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("upd_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.superuser.integration").append("\n"); 
		query.append("FileName : UserDAOComUsrPgmMtchUSQL").append("\n"); 
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
		query.append("update com_usr_pgm_mtch set " ).append("\n"); 
		query.append("	add_flg = @[admin]," ).append("\n"); 
		query.append("	upd_usr_id = @[upd_usr_id]," ).append("\n"); 
		query.append("	upd_dt = sysdate" ).append("\n"); 
		query.append("where	usr_id = @[usr_id]" ).append("\n"); 

	}
}