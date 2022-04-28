/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ApprovalDBDAOsearchApprovalRouteUtilList3RSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.05.02
*@LastModifier : 
*@LastVersion : 1.0
* 2018.05.02 
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

public class ApprovalDBDAOsearchApprovalRouteUtilList3RSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ApprovalDBDAOsearchApprovalRouteUtilList3RSQL(){
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

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.approval.integration").append("\n"); 
		query.append("FileName : ApprovalDBDAOsearchApprovalRouteUtilList3RSQL").append("\n"); 
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
		query.append("SELECT APRO_ROUT_SEQ," ).append("\n"); 
		query.append("    APRO_SEQ," ).append("\n"); 
		query.append("    DP_SEQ," ).append("\n"); 
		query.append("    APRO_USR_ID," ).append("\n"); 
		query.append("    APRO_USR_NM," ).append("\n"); 
		query.append("    APRO_OFC_CD," ).append("\n"); 
		query.append("    APRO_USR_JB_TIT_NM" ).append("\n"); 
		query.append("  FROM (" ).append("\n"); 
		query.append("  SELECT A.APRO_ROUT_SEQ," ).append("\n"); 
		query.append("         A.APRO_SEQ," ).append("\n"); 
		query.append("         A.DP_SEQ," ).append("\n"); 
		query.append("         A.APRO_USR_ID," ).append("\n"); 
		query.append("         A.APRO_USR_NM," ).append("\n"); 
		query.append("         B.OFC_CD APRO_OFC_CD," ).append("\n"); 
		query.append("         A.APRO_USR_JB_TIT_NM," ).append("\n"); 
		query.append("         DECODE(A.APRO_SEQ, 1, 'Y'," ).append("\n"); 
		query.append("            CASE" ).append("\n"); 
		query.append("                WHEN (SELECT NVL(CSR_AMT, -1) FROM COM_APRO_ROUT_DFLT WHERE APRO_ROUT_SEQ = A.APRO_ROUT_SEQ) " ).append("\n"); 
		query.append("                   < (SELECT NVL(COM_CONV_CURR_FNC(CSR_CURR_CD, APRO_CURR_CD, CSR_AMT, GL_DT), 0) CSR_AMT" ).append("\n"); 
		query.append("                        FROM (SELECT CSR_AMT, SUBSTR(GL_DT, 1, 6) GL_DT, NVL(CSR_CURR_CD, 'USD') CSR_CURR_CD," ).append("\n"); 
		query.append("                                    (SELECT CSR_CURR_CD " ).append("\n"); 
		query.append("                                       FROM COM_APRO_ROUT_DFLT " ).append("\n"); 
		query.append("                                      WHERE APRO_ROUT_SEQ = A.APRO_ROUT_SEQ) APRO_CURR_CD" ).append("\n"); 
		query.append("                                FROM AP_INV_HDR" ).append("\n"); 
		query.append("                               WHERE CSR_NO = @[csr_no])) THEN 'Y'" ).append("\n"); 
		query.append("                ELSE 'N'" ).append("\n"); 
		query.append("            END) CHK" ).append("\n"); 
		query.append("  FROM COM_APRO_ROUT_DFLT_DTL A, COM_USER B" ).append("\n"); 
		query.append(" WHERE NVL(B.USE_FLG,'N') = 'Y'" ).append("\n"); 
		query.append("   AND NVL(A.DELT_FLG,'N') <> 'Y'" ).append("\n"); 
		query.append("   AND A.APRO_USR_ID = B.USR_ID" ).append("\n"); 
		query.append("   AND NVL(B.USE_FLG,'N') = 'Y'" ).append("\n"); 
		query.append("   AND A.APRO_ROUT_SEQ = ( SELECT D.APRO_ROUT_SEQ" ).append("\n"); 
		query.append("                            FROM COM_APRO_ROUT_DFLT D" ).append("\n"); 
		query.append("                            WHERE D.SUB_SYS_CD = DECODE(@[sub_sys_cd],'TLL','MNR',@[sub_sys_cd])" ).append("\n"); 
		query.append("                            AND D.OFC_CD = @[ofc_cd] )" ).append("\n"); 
		query.append(" )" ).append("\n"); 
		query.append("WHERE CHK = 'Y'" ).append("\n"); 
		query.append("ORDER BY APRO_SEQ DESC, DP_SEQ DESC" ).append("\n"); 

	}
}