/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : UserMappingDAOComUserRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.01.04
*@LastModifier : 
*@LastVersion : 1.0
* 2018.01.04 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.role.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class UserMappingDAOComUserRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * select com_user
	  * </pre>
	  */
	public UserMappingDAOComUserRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_role_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rhq_ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.role.integration").append("\n"); 
		query.append("FileName : UserMappingDAOComUserRSQL").append("\n"); 
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
		query.append("#if(${ofc_cd}!='')     " ).append("\n"); 
		query.append("	SELECT                                                               " ).append("\n"); 
		query.append("	   DECODE(B.USR_ID,NULL,'0','1') check_val,                                              " ).append("\n"); 
		query.append("	   a.usr_id,                                              " ).append("\n"); 
		query.append("	   usr_nm,                                              " ).append("\n"); 
		query.append("	   usr_locl_nm                                                       " ).append("\n"); 
		query.append("	 FROM com_user a, COM_USR_ROLE_MTCH B                                                      " ).append("\n"); 
		query.append("	 WHERE A.usr_id = B.usr_id(+)" ).append("\n"); 
		query.append("	 AND B.USR_ROLE_CD(+) = @[usr_role_cd]" ).append("\n"); 
		query.append("	 AND A.OFC_CD = @[ofc_cd]" ).append("\n"); 
		query.append("     AND a.use_flg = 'Y'" ).append("\n"); 
		query.append("	 ORDER BY a.usr_id" ).append("\n"); 
		query.append("#elseif(${usr_auth_tp_cd}=='A')" ).append("\n"); 
		query.append("	SELECT                                                               " ).append("\n"); 
		query.append("	   DECODE(B.USR_ID,NULL,'0','1') check_val,                                              " ).append("\n"); 
		query.append("	   a.usr_id,                                              " ).append("\n"); 
		query.append("	   usr_nm,                                              " ).append("\n"); 
		query.append("	   usr_locl_nm                                                       " ).append("\n"); 
		query.append("	 FROM com_user a, COM_USR_ROLE_MTCH B                                 " ).append("\n"); 
		query.append("	 WHERE A.usr_id = B.usr_id(+)" ).append("\n"); 
		query.append("	 AND B.USR_ROLE_CD(+) = @[usr_role_cd]" ).append("\n"); 
		query.append("     AND a.use_flg = 'Y'" ).append("\n"); 
		query.append("	 ORDER BY a.usr_id" ).append("\n"); 
		query.append("#elseif(${usr_auth_tp_cd}=='S')" ).append("\n"); 
		query.append("#if(${rhq_ofc_cd}=='SINHO')" ).append("\n"); 
		query.append("	SELECT                                                               " ).append("\n"); 
		query.append("	   DECODE(B.USR_ID,NULL,'0','1') check_val,                                              " ).append("\n"); 
		query.append("	   a.usr_id,                                              " ).append("\n"); 
		query.append("	   usr_nm,                                              " ).append("\n"); 
		query.append("	   usr_locl_nm                                                       " ).append("\n"); 
		query.append("	 FROM com_user a, COM_USR_ROLE_MTCH B                                 " ).append("\n"); 
		query.append("	 WHERE A.usr_id = B.usr_id(+)" ).append("\n"); 
		query.append("	 AND B.USR_ROLE_CD(+) = @[usr_role_cd]" ).append("\n"); 
		query.append("     AND a.use_flg = 'Y'" ).append("\n"); 
		query.append("	 ORDER BY a.usr_id" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("	SELECT                                                               " ).append("\n"); 
		query.append("	   DECODE(B.USR_ID,NULL,'0','1') check_val,                                              " ).append("\n"); 
		query.append("	   a.usr_id,                                              " ).append("\n"); 
		query.append("	   a.usr_nm,                                              " ).append("\n"); 
		query.append("	   a.usr_locl_nm                                                       " ).append("\n"); 
		query.append("	 FROM com_user a, COM_USR_ROLE_MTCH B, mdm_organization c                              " ).append("\n"); 
		query.append("	 WHERE A.usr_id = B.usr_id(+)" ).append("\n"); 
		query.append("	 AND B.USR_ROLE_CD(+) = @[usr_role_cd]" ).append("\n"); 
		query.append("     AND A.OFC_CD = C.OFC_CD" ).append("\n"); 
		query.append("     AND C.ar_hd_qtr_ofc_cd = @[rhq_ofc_cd]" ).append("\n"); 
		query.append("     AND a.use_flg = 'Y'" ).append("\n"); 
		query.append("	 ORDER BY a.usr_id" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}