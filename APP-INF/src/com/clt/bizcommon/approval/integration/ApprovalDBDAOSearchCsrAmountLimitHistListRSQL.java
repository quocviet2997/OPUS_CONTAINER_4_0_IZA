/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : ApprovalDBDAOSearchCsrAmountLimitHistListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2017.11.02
*@LastModifier : 
*@LastVersion : 1.0
* 2017.11.02 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.approval.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ApprovalDBDAOSearchCsrAmountLimitHistListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ApprovalDBDAOSearchCsrAmountLimitHistListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("sub_sys_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.approval.integration").append("\n"); 
		query.append("FileName : ApprovalDBDAOSearchCsrAmountLimitHistListRSQL").append("\n"); 
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
		query.append("SELECT H.CRE_USR_ID USR_ID," ).append("\n"); 
		query.append("       U.USR_NM," ).append("\n"); 
		query.append("       U.OFC_CD," ).append("\n"); 
		query.append("       TO_CHAR(H.CRE_DT, 'YYYY-MM-DD HH24:MI') CURR_AMT_UPD_DT," ).append("\n"); 
		query.append("       H.CSR_CURR_CD CRNT_CURR_CD," ).append("\n"); 
		query.append("       H.CSR_AMT CRNT_AMT ," ).append("\n"); 
		query.append("       LEAD(H.CSR_CURR_CD) OVER (PARTITION BY H.SUB_SYS_CD, H.OFC_CD" ).append("\n"); 
		query.append("         ORDER BY H.APRO_ROUT_HIS_SEQ DESC) PRE_CURR_CD ," ).append("\n"); 
		query.append("       LEAD(H.CSR_AMT) OVER (PARTITION BY H.SUB_SYS_CD, H.OFC_CD" ).append("\n"); 
		query.append("         ORDER BY H.APRO_ROUT_HIS_SEQ DESC) PRE_AMT" ).append("\n"); 
		query.append("  FROM COM_APRO_ROUT_DFLT_HIS H," ).append("\n"); 
		query.append("       COM_USER U" ).append("\n"); 
		query.append(" WHERE 1=1" ).append("\n"); 
		query.append("   AND H.SUB_SYS_CD = @[sub_sys_cd]" ).append("\n"); 
		query.append("   AND H.OFC_CD = @[ofc_cd]" ).append("\n"); 
		query.append("   AND H.CRE_USR_ID = U.USR_ID(+)" ).append("\n"); 
		query.append("   AND NVL(U.USE_FLG(+), 'N') = 'Y'" ).append("\n"); 
		query.append(" ORDER BY H.APRO_ROUT_HIS_SEQ DESC" ).append("\n"); 

	}
}