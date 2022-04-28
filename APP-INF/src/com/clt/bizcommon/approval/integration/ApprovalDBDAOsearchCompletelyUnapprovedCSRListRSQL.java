/*=========================================================
*Copyright(c) 2019 CyberLogitec
*@FileName : ApprovalDBDAOsearchCompletelyUnapprovedCSRListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2019.01.22
*@LastModifier : 
*@LastVersion : 1.0
* 2019.01.22 
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

public class ApprovalDBDAOsearchCompletelyUnapprovedCSRListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * searchCompletelyUnapprovedCSRList
	  * </pre>
	  */
	public ApprovalDBDAOsearchCompletelyUnapprovedCSRListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("apro_evnt_desc",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("sub_sys_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.approval.integration").append("\n"); 
		query.append("FileName : ApprovalDBDAOsearchCompletelyUnapprovedCSRListRSQL").append("\n"); 
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
		query.append("SELECT " ).append("\n"); 
		query.append("E.CSR_NO, E.APRO_RQST_NO, E.SUB_SYS_CD, E.OFC_CD" ).append("\n"); 
		query.append(", DECODE(SIGN(E.N1ST_APPRED_KNT),1,'Y','N') N1ST_APPRED_YN" ).append("\n"); 
		query.append(", DECODE(SIGN(E.N2ND_APPRED_KNT),1,'Y','N') N2ND_APPRED_YN" ).append("\n"); 
		query.append(", @[usr_id] USR_ID, @[usr_id] CRE_USR_ID, @[usr_id] UPD_USR_ID, @[apro_evnt_desc] APRO_EVNT_DESC" ).append("\n"); 
		query.append(", CASE " ).append("\n"); 
		query.append("  WHEN E.N1ST_APPRED_KNT > 0 AND E.N2ND_APPRED_KNT = 0 AND E.MAX_APRO_RQST_SEQ = 2 AND E.MAX_DFLT_APRO_SEQ = 1 " ).append("\n"); 
		query.append("  THEN 'Y'" ).append("\n"); 
		query.append("  WHEN E.N1ST_APPRED_KNT > 0 AND E.N2ND_APPRED_KNT = 0 AND E.MAX_APRO_RQST_SEQ = 2 AND E.MAX_DFLT_APRO_SEQ = 2 " ).append("\n"); 
		query.append("        AND E.DFLT_CURR_CD IS NOT NULL AND NVL(E.DFLT_AMT,0) <> 0 AND NVL(E.DFLT_AMT,-1) >= NVL(E.CONV_CSR_AMT,0)" ).append("\n"); 
		query.append("  THEN 'Y'" ).append("\n"); 
		query.append("  ELSE 'N'" ).append("\n"); 
		query.append("  END UPD_1ST_APRO_STEP_YN" ).append("\n"); 
		query.append("FROM (" ).append("\n"); 
		query.append("SELECT" ).append("\n"); 
		query.append("C.CSR_NO, C.APRO_RQST_NO, D.SUB_SYS_CD, D.OFC_CD" ).append("\n"); 
		query.append(", C.CSR_AMT, C.CSR_CURR_CD, C.GL_DT, D.CSR_CURR_CD DFLT_CURR_CD, D.CSR_AMT DFLT_AMT" ).append("\n"); 
		query.append(", NVL(COM_CONV_CURR_FNC(C.CSR_CURR_CD, D.CSR_CURR_CD, C.CSR_AMT, SUBSTR(C.GL_DT,1,6)), 0) CONV_CSR_AMT" ).append("\n"); 
		query.append(", NVL(C.N1ST_APPRED_KNT,0) N1ST_APPRED_KNT" ).append("\n"); 
		query.append(", NVL(C.N2ND_APPRED_KNT,0) N2ND_APPRED_KNT" ).append("\n"); 
		query.append(", " ).append("\n"); 
		query.append("CASE " ).append("\n"); 
		query.append("WHEN NVL(D.N1ST_USR_ID_GROUP,'########') <> NVL(C.N1ST_USR_ID_GROUP,'########')" ).append("\n"); 
		query.append("THEN 'Y'" ).append("\n"); 
		query.append("ELSE 'N'" ).append("\n"); 
		query.append("END CHK_N1ST_DIFF" ).append("\n"); 
		query.append(", " ).append("\n"); 
		query.append("CASE " ).append("\n"); 
		query.append("WHEN NVL(D.N2ND_USR_ID_GROUP,'########') <> NVL(C.N2ND_USR_ID_GROUP,'########')" ).append("\n"); 
		query.append("THEN 'Y'" ).append("\n"); 
		query.append("ELSE 'N'" ).append("\n"); 
		query.append("END CHK_N2ND_DIFF" ).append("\n"); 
		query.append(", D.N1ST_USR_ID_GROUP, D.N2ND_USR_ID_GROUP, C.MAX_APRO_RQST_SEQ, D.MAX_DFLT_APRO_SEQ" ).append("\n"); 
		query.append("FROM (" ).append("\n"); 
		query.append("    SELECT " ).append("\n"); 
		query.append("    E.APRO_ROUT_SEQ, E.SUB_SYS_CD, E.OFC_CD, E.CSR_CURR_CD, E.CSR_AMT," ).append("\n"); 
		query.append("    MAX(E.N1ST_USR_ID_GROUP) N1ST_USR_ID_GROUP, MAX(N2ND_USR_ID_GROUP) N2ND_USR_ID_GROUP, MAX(E.APRO_SEQ) MAX_DFLT_APRO_SEQ" ).append("\n"); 
		query.append("    FROM (" ).append("\n"); 
		query.append("        SELECT " ).append("\n"); 
		query.append("        D.APRO_ROUT_SEQ, D.SUB_SYS_CD, D.OFC_CD, D.CSR_CURR_CD, D.CSR_AMT" ).append("\n"); 
		query.append("        , CASE WHEN D.APRO_SEQ = 1 THEN D.USR_ID_GROUP ELSE '' END N1ST_USR_ID_GROUP" ).append("\n"); 
		query.append("        , CASE WHEN D.APRO_SEQ = 2 THEN D.USR_ID_GROUP ELSE '' END N2ND_USR_ID_GROUP" ).append("\n"); 
		query.append("        , D.APRO_SEQ" ).append("\n"); 
		query.append("        FROM (" ).append("\n"); 
		query.append("            SELECT " ).append("\n"); 
		query.append("            A.APRO_ROUT_SEQ, B.APRO_SEQ, A.SUB_SYS_CD, A.OFC_CD, A.CSR_CURR_CD, A.CSR_AMT" ).append("\n"); 
		query.append("            , LISTAGG(B.APRO_USR_ID,'||') WITHIN GROUP (ORDER BY B.APRO_SEQ, UPPER(B.APRO_USR_ID)) USR_ID_GROUP" ).append("\n"); 
		query.append("            FROM COM_APRO_ROUT_DFLT A, COM_APRO_ROUT_DFLT_DTL B" ).append("\n"); 
		query.append("            WHERE 1=1" ).append("\n"); 
		query.append("            AND A.SUB_SYS_CD NOT IN ('FLT','JOO')" ).append("\n"); 
		query.append("            AND A.SUB_SYS_CD = @[sub_sys_cd]" ).append("\n"); 
		query.append("            AND A.OFC_CD = @[ofc_cd]" ).append("\n"); 
		query.append("            AND NVL(A.DELT_FLG,'N') <> 'Y'" ).append("\n"); 
		query.append("            AND A.APRO_ROUT_SEQ = B.APRO_ROUT_SEQ" ).append("\n"); 
		query.append("            AND NVL(B.DELT_FLG,'N') <> 'Y'" ).append("\n"); 
		query.append("            GROUP BY A.APRO_ROUT_SEQ, B.APRO_SEQ, A.SUB_SYS_CD, A.OFC_CD, A.CSR_CURR_CD, A.CSR_AMT" ).append("\n"); 
		query.append("        ) D" ).append("\n"); 
		query.append("    ) E" ).append("\n"); 
		query.append("    GROUP BY E.APRO_ROUT_SEQ, E.SUB_SYS_CD, E.OFC_CD, E.CSR_CURR_CD, E.CSR_AMT" ).append("\n"); 
		query.append("    ) D, (" ).append("\n"); 
		query.append("    SELECT " ).append("\n"); 
		query.append("    E.CSR_NO, E.APRO_RQST_NO, E.SUB_SYS_CD, E.DFLT_APRO_OFC_CD" ).append("\n"); 
		query.append("    , MAX(E.N1ST_USR_ID_GROUP) N1ST_USR_ID_GROUP, MAX(N2ND_USR_ID_GROUP) N2ND_USR_ID_GROUP" ).append("\n"); 
		query.append("    , MAX(E.N1ST_APPRED_KNT) N1ST_APPRED_KNT, MAX(N2ND_APPRED_KNT) N2ND_APPRED_KNT" ).append("\n"); 
		query.append("    , MAX(E.ROUT_APRO_RQST_SEQ) MAX_APRO_RQST_SEQ" ).append("\n"); 
		query.append("    , E.CSR_AMT, E.CSR_CURR_CD, E.GL_DT" ).append("\n"); 
		query.append("    FROM (" ).append("\n"); 
		query.append("        SELECT " ).append("\n"); 
		query.append("        D.CSR_NO, D.APRO_RQST_NO, D.SUB_SYS_CD, D.DFLT_APRO_OFC_CD" ).append("\n"); 
		query.append("        , CASE WHEN D.APRO_RQST_SEQ = 1 THEN D.USR_ID_GROUP ELSE '' END N1ST_USR_ID_GROUP" ).append("\n"); 
		query.append("        , CASE WHEN D.APRO_RQST_SEQ = 2 THEN D.USR_ID_GROUP ELSE '' END N2ND_USR_ID_GROUP" ).append("\n"); 
		query.append("        , CASE WHEN D.APRO_RQST_SEQ = 1 THEN D.NN_APPRED_KNT||'' ELSE '' END N1ST_APPRED_KNT" ).append("\n"); 
		query.append("        , CASE WHEN D.APRO_RQST_SEQ = 2 THEN D.NN_APPRED_KNT||'' ELSE '' END N2ND_APPRED_KNT" ).append("\n"); 
		query.append("        , D.APRO_RQST_SEQ ROUT_APRO_RQST_SEQ" ).append("\n"); 
		query.append("        , D.CSR_AMT, D.CSR_CURR_CD, D.GL_DT" ).append("\n"); 
		query.append("        FROM (" ).append("\n"); 
		query.append("            SELECT " ).append("\n"); 
		query.append("            X.CSR_NO, X.APRO_RQST_NO, X.SUB_SYS_CD, X.DFLT_APRO_OFC_CD" ).append("\n"); 
		query.append("            , R.APRO_RQST_SEQ" ).append("\n"); 
		query.append("            , LISTAGG(R.APRO_USR_ID,'||') WITHIN GROUP (ORDER BY R.APRO_RQST_SEQ, UPPER(R.APRO_USR_ID)) USR_ID_GROUP    " ).append("\n"); 
		query.append("            , X.NN_APPRED_KNT" ).append("\n"); 
		query.append("            , X.CSR_AMT, X.CSR_CURR_CD, X.GL_DT" ).append("\n"); 
		query.append("            FROM (" ).append("\n"); 
		query.append("                SELECT " ).append("\n"); 
		query.append("                DISTINCT" ).append("\n"); 
		query.append("                SUM(DECODE(RR.APSTS_CD,NULL,0,'',0,1)) OVER (PARTITION BY CD.CSR_NO, RR.APRO_RQST_SEQ) NN_APPRED_KNT," ).append("\n"); 
		query.append("                CD.CSR_NO, RH.APRO_RQST_NO, RH.SUB_SYS_CD, RH.DFLT_APRO_OFC_CD, RH.APSTS_CD, RR.APRO_RQST_SEQ, CD.COST_OFC_CD" ).append("\n"); 
		query.append("                , A.CSR_AMT, A.CSR_CURR_CD, A.GL_DT" ).append("\n"); 
		query.append("                FROM COM_APRO_RQST_HDR RH, COM_APRO_CSR_DTL CD, COM_APRO_RQST_ROUT RR, AP_INV_HDR A" ).append("\n"); 
		query.append("                WHERE 1=1" ).append("\n"); 
		query.append("                AND RH.SUB_SYS_CD NOT IN ('FLT','JOO')" ).append("\n"); 
		query.append("                AND RH.SUB_SYS_CD = @[sub_sys_cd]" ).append("\n"); 
		query.append("                AND RH.DFLT_APRO_OFC_CD = @[ofc_cd]" ).append("\n"); 
		query.append("                AND NVL(RH.DELT_FLG,'N') <> 'Y'" ).append("\n"); 
		query.append("                AND RH.APRO_RQST_NO = CD.APRO_RQST_NO" ).append("\n"); 
		query.append("                AND NVL(CD.DELT_FLG,'N') <> 'Y'" ).append("\n"); 
		query.append("                AND RH.APRO_RQST_NO = RR.APRO_RQST_NO" ).append("\n"); 
		query.append("                AND RH.APSTS_CD = 'P'" ).append("\n"); 
		query.append("                AND NVL(RR.DELT_FLG,'N') <> 'Y'" ).append("\n"); 
		query.append("                AND RH.DFLT_APRO_OFC_CD IS NOT NULL" ).append("\n"); 
		query.append("                AND CD.CSR_NO = A.CSR_NO" ).append("\n"); 
		query.append("                AND A.IF_FLG IS NULL" ).append("\n"); 
		query.append("                AND A.AFT_ACT_FLG IS NULL" ).append("\n"); 
		query.append("                AND A.RCV_ERR_FLG IS NULL" ).append("\n"); 
		query.append("                GROUP BY CD.CSR_NO, RH.APRO_RQST_NO, RH.SUB_SYS_CD, RH.DFLT_APRO_OFC_CD, RH.APRO_ROUT_SEQ, RH.APSTS_CD, RR.APRO_RQST_SEQ, RR.APSTS_CD" ).append("\n"); 
		query.append("                ,CD.COST_OFC_CD, A.CSR_AMT, A.CSR_CURR_CD, A.GL_DT" ).append("\n"); 
		query.append("            ) X, COM_APRO_RQST_ROUT R" ).append("\n"); 
		query.append("            WHERE 1=1" ).append("\n"); 
		query.append("            AND X.APRO_RQST_NO = R.APRO_RQST_NO" ).append("\n"); 
		query.append("            AND X.APRO_RQST_SEQ = R.APRO_RQST_SEQ" ).append("\n"); 
		query.append("            AND NVL(R.DELT_FLG,'N') <> 'Y'" ).append("\n"); 
		query.append("            GROUP BY X.CSR_NO, X.APRO_RQST_NO, X.SUB_SYS_CD, X.DFLT_APRO_OFC_CD, R.APRO_RQST_SEQ, NN_APPRED_KNT, X.CSR_AMT, X.CSR_CURR_CD, X.GL_DT" ).append("\n"); 
		query.append("            ) D" ).append("\n"); 
		query.append("        ) E" ).append("\n"); 
		query.append("        GROUP BY E.CSR_NO, E.APRO_RQST_NO, E.SUB_SYS_CD, E.DFLT_APRO_OFC_CD, E.CSR_AMT, E.CSR_CURR_CD, E.GL_DT" ).append("\n"); 
		query.append("    ) C" ).append("\n"); 
		query.append("WHERE 1=1" ).append("\n"); 
		query.append("AND D.SUB_SYS_CD = C.SUB_SYS_CD" ).append("\n"); 
		query.append("AND D.OFC_CD = C.DFLT_APRO_OFC_CD" ).append("\n"); 
		query.append(") E" ).append("\n"); 
		query.append("WHERE 1=1" ).append("\n"); 
		query.append("AND (" ).append("\n"); 
		query.append("        (NVL(E.N1ST_APPRED_KNT,0) = 0 AND NVL(E.CHK_N1ST_DIFF,'N') = 'Y')" ).append("\n"); 
		query.append("        OR " ).append("\n"); 
		query.append("        (NVL(E.N2ND_APPRED_KNT,0) = 0 AND NVL(E.CHK_N2ND_DIFF,'N') = 'Y')" ).append("\n"); 
		query.append("        OR" ).append("\n"); 
		query.append("        (" ).append("\n"); 
		query.append("            CASE " ).append("\n"); 
		query.append("            WHEN E.MAX_APRO_RQST_SEQ > 1 AND E.DFLT_CURR_CD IS NOT NULL AND NVL(E.DFLT_AMT,0) <> 0 AND NVL(E.DFLT_AMT,-1) >= NVL(E.CONV_CSR_AMT,0) " ).append("\n"); 
		query.append("            THEN 'Y' " ).append("\n"); 
		query.append("            ELSE 'N' " ).append("\n"); 
		query.append("            END = 'Y'" ).append("\n"); 
		query.append("        )" ).append("\n"); 
		query.append("    )" ).append("\n"); 
		query.append("ORDER BY E.CSR_NO, E.APRO_RQST_NO" ).append("\n"); 

	}
}