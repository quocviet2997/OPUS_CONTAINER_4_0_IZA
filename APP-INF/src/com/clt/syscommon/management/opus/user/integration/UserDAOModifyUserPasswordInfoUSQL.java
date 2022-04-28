/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : UserDAOModifyUserPasswordInfoUSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.01.27
*@LastModifier : 
*@LastVersion : 1.0
* 2016.01.27 
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

public class UserDAOModifyUserPasswordInfoUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * ModifyUserPasswordInfo
	  * </pre>
	  */
	public UserDAOModifyUserPasswordInfoUSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_lgin_fald_knt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_lck_dt",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("usr_pwd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("upd_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.user.integration").append("\n"); 
		query.append("FileName : UserDAOModifyUserPasswordInfoUSQL").append("\n"); 
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
		query.append("UPDATE com_user" ).append("\n"); 
		query.append("SET " ).append("\n"); 
		query.append("    usr_pwd = @[usr_pwd]" ).append("\n"); 
		query.append("	, usr_pwd_cre_dt      =   SYSDATE" ).append("\n"); 
		query.append("	, usr_lck_dt          =   to_date( @[usr_lck_dt] ,'YYYYMMDDHH24MISS') " ).append("\n"); 
		query.append("	, usr_lgin_fald_knt   = @[usr_lgin_fald_knt] " ).append("\n"); 
		query.append("    , upd_usr_id = @[upd_usr_id]" ).append("\n"); 
		query.append("    , upd_dt = SYSDATE    " ).append("\n"); 
		query.append("WHERE usr_id = @[usr_id]" ).append("\n"); 

	}
}