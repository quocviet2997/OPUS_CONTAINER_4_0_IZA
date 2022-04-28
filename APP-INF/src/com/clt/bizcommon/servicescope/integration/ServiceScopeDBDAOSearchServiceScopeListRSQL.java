/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : ServiceScopeDBDAOSearchServiceScopeListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2014.09.03
*@LastModifier : 
*@LastVersion : 1.0
* 2014.09.03 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.servicescope.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ServiceScopeDBDAOSearchServiceScopeListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * ServiceScope의 모든 목록을 가져온다
	  * </pre>
	  */
	public ServiceScopeDBDAOSearchServiceScopeListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("svc_scp_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("startpart",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("delt_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("endpart",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("svc_scp_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.servicescope.integration").append("\n"); 
		query.append("FileName : ServiceScopeDBDAOSearchServiceScopeListRSQL").append("\n"); 
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
		query.append("SELECT svc_scp_cd," ).append("\n"); 
		query.append("	svc_scp_nm," ).append("\n"); 
		query.append("DECODE(DELT_FLG,'Y','Delete','Active') AS DELT_FLG" ).append("\n"); 
		query.append("FROM (	SELECT ROW_NUMBER() OVER (ORDER BY svc_scp_cd ASC) no," ).append("\n"); 
		query.append("			svc_scp_cd," ).append("\n"); 
		query.append("			svc_scp_nm," ).append("\n"); 
		query.append("			delt_flg" ).append("\n"); 
		query.append("		FROM mdm_svc_scp" ).append("\n"); 
		query.append("		WHERE 1 = 1 " ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("	#if (${mdm_yn} != '')" ).append("\n"); 
		query.append("		#if (${delt_flg} == 'Y') " ).append("\n"); 
		query.append("			AND DELT_FLG = @[delt_flg]" ).append("\n"); 
		query.append("		#elseif (${delt_flg} == 'ALL') " ).append("\n"); 
		query.append("		#else " ).append("\n"); 
		query.append("			AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("	#else	" ).append("\n"); 
		query.append("		AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("		#if (${svc_scp_cd} != '') " ).append("\n"); 
		query.append("		AND svc_scp_cd like @[svc_scp_cd] || '%'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("		#if (${svc_scp_nm} != '') " ).append("\n"); 
		query.append("		AND upper(svc_scp_nm) like '%' || upper(@[svc_scp_nm]) || '%'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("	) a" ).append("\n"); 
		query.append("ORDER BY svc_scp_cd" ).append("\n"); 

	}
}