/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ApprovalDBDAOSearchCsrAmountLimitListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.03.07
*@LastModifier : 
*@LastVersion : 1.0
* 2018.03.07 
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

public class ApprovalDBDAOSearchCsrAmountLimitListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ApprovalDBDAOSearchCsrAmountLimitListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("login_ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("sub_sys_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.approval.integration").append("\n"); 
		query.append("FileName : ApprovalDBDAOSearchCsrAmountLimitListRSQL").append("\n"); 
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
		query.append("WITH OFC_INFO AS (" ).append("\n"); 
		query.append("    SELECT X.*" ).append("\n"); 
		query.append("    FROM (" ).append("\n"); 
		query.append("        SELECT 1 SEQ, M.AR_HD_QTR_OFC_CD, M.OFC_CD" ).append("\n"); 
		query.append("        FROM MDM_ORGANIZATION M" ).append("\n"); 
		query.append("        WHERE NVL(DELT_FLG, 'N') <> 'Y' " ).append("\n"); 
		query.append("        AND OFC_TP_CD = 'HO'" ).append("\n"); 
		query.append("        UNION ALL" ).append("\n"); 
		query.append("        SELECT 2 SEQ, M.AR_HD_QTR_OFC_CD, M.OFC_CD " ).append("\n"); 
		query.append("        FROM MDM_ORGANIZATION M" ).append("\n"); 
		query.append("        WHERE NVL(DELT_FLG, 'N') <> 'Y' " ).append("\n"); 
		query.append("        AND OFC_TP_CD <> 'HO'" ).append("\n"); 
		query.append("    ) X" ).append("\n"); 
		query.append("    WHERE 1=1" ).append("\n"); 
		query.append("   #if(${ofc_cd} != '')" ).append("\n"); 
		query.append("   	AND X.OFC_CD IN (" ).append("\n"); 
		query.append("    #foreach($key IN ${ofc_cd_list}) " ).append("\n"); 
		query.append("     #if($velocityCount < $ofc_cd_list.size()) " ).append("\n"); 
		query.append("      '$key', " ).append("\n"); 
		query.append("     #else " ).append("\n"); 
		query.append("      '$key' " ).append("\n"); 
		query.append("     #end " ).append("\n"); 
		query.append("    #end " ).append("\n"); 
		query.append("    )" ).append("\n"); 
		query.append("   #end" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append(", SUB_SYS_INFO AS (" ).append("\n"); 
		query.append("    SELECT PGM_SUB_SYS_CD SUB_SYS_CD" ).append("\n"); 
		query.append("    FROM COM_PGM_SUB_SYS" ).append("\n"); 
		query.append("    WHERE PGM_APPL_CD = 'OPUS'" ).append("\n"); 
		query.append("#if(${sub_sys_cd}!='')" ).append("\n"); 
		query.append("    AND PGM_SUB_SYS_CD = @[sub_sys_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append(", OFC_N_SUBSYS AS (" ).append("\n"); 
		query.append("    SELECT " ).append("\n"); 
		query.append("    A.*, B.* " ).append("\n"); 
		query.append("    FROM OFC_INFO A, SUB_SYS_INFO B" ).append("\n"); 
		query.append("    WHERE 1=1" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append(", DFLT_APRO_STEP_INFO AS (" ).append("\n"); 
		query.append("    SELECT H.APRO_ROUT_SEQ, H.SUB_SYS_CD, H.OFC_CD, " ).append("\n"); 
		query.append("    T.CSR_CURR_CD, T.CSR_AMT, T.APR_USR_NM_1ST, T.APR_USR_ID_1ST, T.APR_OFC_CD_1ST," ).append("\n"); 
		query.append("    T.APR_USR_NM_2ND, T.APR_USR_ID_2ND, T.APR_OFC_CD_2ND FROM (" ).append("\n"); 
		query.append("    SELECT " ).append("\n"); 
		query.append("    A.SUB_SYS_CD, A.OFC_CD, A.CSR_CURR_CD, A.CSR_AMT" ).append("\n"); 
		query.append("    , MAX(A.APR_USR_NM_1ST) APR_USR_NM_1ST, MAX(A.APR_USR_ID_1ST) APR_USR_ID_1ST, MAX(A.APR_OFC_CD_1ST) APR_OFC_CD_1ST" ).append("\n"); 
		query.append("    , MAX(A.APR_USR_NM_2ND) APR_USR_NM_2ND, MAX(A.APR_USR_ID_2ND) APR_USR_ID_2ND, MAX(A.APR_OFC_CD_2ND) APR_OFC_CD_2ND" ).append("\n"); 
		query.append("    FROM (" ).append("\n"); 
		query.append("        SELECT " ).append("\n"); 
		query.append("        DENSE_RANK() OVER (PARTITION BY R.SUB_SYS_CD, R.OFC_CD, D.APRO_SEQ ORDER BY D.DP_SEQ ASC) RNK, " ).append("\n"); 
		query.append("        R.SUB_SYS_CD, R.OFC_CD, R.CSR_CURR_CD, R.CSR_AMT" ).append("\n"); 
		query.append("        , CASE WHEN D.APRO_SEQ = 1 THEN D.APRO_USR_NM ELSE '' END APR_USR_NM_1ST" ).append("\n"); 
		query.append("        , CASE WHEN D.APRO_SEQ = 1 THEN D.APRO_USR_ID ELSE '' END APR_USR_ID_1ST" ).append("\n"); 
		query.append("        , CASE WHEN D.APRO_SEQ = 1 THEN D.APRO_OFC_CD ELSE '' END APR_OFC_CD_1ST" ).append("\n"); 
		query.append("        , CASE WHEN D.APRO_SEQ = 2 THEN D.APRO_USR_NM ELSE '' END APR_USR_NM_2ND" ).append("\n"); 
		query.append("        , CASE WHEN D.APRO_SEQ = 2 THEN D.APRO_USR_ID ELSE '' END APR_USR_ID_2ND" ).append("\n"); 
		query.append("        , CASE WHEN D.APRO_SEQ = 2 THEN D.APRO_OFC_CD ELSE '' END APR_OFC_CD_2ND" ).append("\n"); 
		query.append("        FROM COM_APRO_ROUT_DFLT_DTL D, COM_APRO_ROUT_DFLT R" ).append("\n"); 
		query.append("        WHERE 1=1" ).append("\n"); 
		query.append("        AND D.APRO_ROUT_SEQ(+) = R.APRO_ROUT_SEQ" ).append("\n"); 
		query.append("    ) A" ).append("\n"); 
		query.append("    WHERE A.RNK = 1" ).append("\n"); 
		query.append("    GROUP BY A.SUB_SYS_CD, A.OFC_CD, A.CSR_CURR_CD, A.CSR_AMT" ).append("\n"); 
		query.append("    ORDER BY A.SUB_SYS_CD, A.OFC_CD" ).append("\n"); 
		query.append("    ) T, COM_APRO_ROUT_DFLT H" ).append("\n"); 
		query.append("    WHERE H.SUB_SYS_CD = T.SUB_SYS_CD(+)" ).append("\n"); 
		query.append("      AND H.OFC_CD = T.OFC_CD(+)" ).append("\n"); 
		query.append("      AND H.DELT_FLG = 'N' " ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("SELECT " ).append("\n"); 
		query.append("CASE " ).append("\n"); 
		query.append("WHEN (SELECT M.OFC_TP_CD FROM MDM_ORGANIZATION M WHERE NVL(DELT_FLG,'N') <> 'Y' AND M.OFC_CD = @[login_ofc_cd]) IN ('HO')" ).append("\n"); 
		query.append("THEN 'Y'" ).append("\n"); 
		query.append("WHEN (SELECT M.OFC_TP_CD FROM MDM_ORGANIZATION M WHERE NVL(DELT_FLG,'N') <> 'Y' AND M.OFC_CD = @[login_ofc_cd]) IN ('HQ')" ).append("\n"); 
		query.append("THEN DECODE(A.AR_HD_QTR_OFC_CD,@[login_ofc_cd],'Y','N')" ).append("\n"); 
		query.append("ELSE DECODE(A.OFC_CD,@[login_ofc_cd],'Y','N')" ).append("\n"); 
		query.append("END AUTH_YN" ).append("\n"); 
		query.append(", A.AR_HD_QTR_OFC_CD, A.OFC_CD, A.SUB_SYS_CD" ).append("\n"); 
		query.append(", D.CSR_CURR_CD, D.CSR_AMT" ).append("\n"); 
		query.append(", D.APR_USR_NM_1ST, D.APR_OFC_CD_1ST" ).append("\n"); 
		query.append(", D.APR_USR_NM_2ND, D.APR_OFC_CD_2ND" ).append("\n"); 
		query.append(", (SELECT X.USR_ID || ', ' || X.CURR_AMT_UPD_DT HIS_RMK" ).append("\n"); 
		query.append("     FROM (" ).append("\n"); 
		query.append("           SELECT H.CRE_USR_ID USR_ID, TO_CHAR(H.CRE_DT,'YYYY-MM-DD HH24:MI') CURR_AMT_UPD_DT" ).append("\n"); 
		query.append("                , DENSE_RANK() OVER (PARTITION BY H.SUB_SYS_CD, H.OFC_CD ORDER BY H.APRO_ROUT_HIS_SEQ DESC) RNK" ).append("\n"); 
		query.append("                , H.SUB_SYS_CD" ).append("\n"); 
		query.append("                , H.OFC_CD" ).append("\n"); 
		query.append("    	     FROM COM_APRO_ROUT_DFLT_HIS H, COM_USER U" ).append("\n"); 
		query.append("             WHERE H.CRE_USR_ID = U.USR_ID(+)" ).append("\n"); 
		query.append("               AND NVL(U.USE_FLG(+),'N') = 'Y'" ).append("\n"); 
		query.append("          ) X" ).append("\n"); 
		query.append("  WHERE X.RNK = 1" ).append("\n"); 
		query.append("    AND X.SUB_SYS_CD = A.SUB_SYS_CD" ).append("\n"); 
		query.append("    AND X.OFC_CD = A.OFC_CD) HISTORY" ).append("\n"); 
		query.append(", D.APRO_ROUT_SEQ" ).append("\n"); 
		query.append(", (SELECT NVL(DP_PRCS_KNT,0) FROM MDM_CURRENCY WHERE CURR_CD=D.CSR_CURR_CD) DP_PRCS_KNT, D.APR_USR_ID_1ST, D.APR_USR_ID_2ND" ).append("\n"); 
		query.append("FROM OFC_N_SUBSYS A, DFLT_APRO_STEP_INFO D" ).append("\n"); 
		query.append("WHERE 1=1" ).append("\n"); 
		query.append("AND A.OFC_CD = D.OFC_CD(+)" ).append("\n"); 
		query.append("AND A.SUB_SYS_CD = D.SUB_SYS_CD(+)" ).append("\n"); 
		query.append("ORDER BY A.SEQ, A.AR_HD_QTR_OFC_CD, A.OFC_CD, A.SUB_SYS_CD" ).append("\n"); 

	}
}