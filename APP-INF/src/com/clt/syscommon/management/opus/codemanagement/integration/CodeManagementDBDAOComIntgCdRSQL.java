/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : CodeManagementDBDAOComIntgCdRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.03.21
*@LastModifier : 
*@LastVersion : 1.0
* 2018.03.21 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.codemanagement.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CodeManagementDBDAOComIntgCdRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * CodeManagementDBDAOComIntgCdRSQL
	  * </pre>
	  */
	public CodeManagementDBDAOComIntgCdRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("searchCdTp",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("subsystem",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("codeVal",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.codemanagement.integration").append("\n"); 
		query.append("FileName : CodeManagementDBDAOComIntgCdRSQL").append("\n"); 
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
		query.append("SELECT" ).append("\n"); 
		query.append("A.OWNR_SUB_SYS_CD," ).append("\n"); 
		query.append("A.INTG_CD_ID," ).append("\n"); 
		query.append("REPLACE(A.INTG_CD_NM,'&','&'||'amp;') INTG_CD_NM," ).append("\n"); 
		query.append("REPLACE(A.INTG_CD_DESC,'&','&'||'amp;') INTG_CD_DESC," ).append("\n"); 
		query.append("A.INTG_CD_TP_CD," ).append("\n"); 
		query.append("A.MNG_TBL_NM," ).append("\n"); 
		query.append("A.INTG_CD_LEN," ).append("\n"); 
		query.append("NVL(A.INTG_CD_USE_FLG,'Y') INTG_CD_USE_FLG," ).append("\n"); 
		query.append("A.CRE_USR_ID," ).append("\n"); 
		query.append("TO_CHAR(A.CRE_DT, 'YYYYMMDD') CRE_DT," ).append("\n"); 
		query.append("A.UPD_USR_ID," ).append("\n"); 
		query.append("TO_CHAR(A.UPD_DT, 'YYYYMMDD') UPD_DT" ).append("\n"); 
		query.append("FROM COM_INTG_CD A" ).append("\n"); 
		query.append("WHERE 1=1" ).append("\n"); 
		query.append("AND INTG_CD_TP_CD IN ('G','T')" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${searchCdTp} != '')" ).append("\n"); 
		query.append("AND INTG_CD_TP_CD = @[searchCdTp]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${subsystem} != '')" ).append("\n"); 
		query.append("AND OWNR_SUB_SYS_CD = @[subsystem]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("  " ).append("\n"); 
		query.append("#if (${codeVal} != '')" ).append("\n"); 
		query.append("#if (${searchtype} == '0')" ).append("\n"); 
		query.append("AND INTG_CD_ID = @[codeVal]" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("AND UPPER(INTG_CD_NM) LIKE '%'||UPPER(@[codeVal])||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("ORDER BY A.INTG_CD_ID" ).append("\n"); 

	}
}