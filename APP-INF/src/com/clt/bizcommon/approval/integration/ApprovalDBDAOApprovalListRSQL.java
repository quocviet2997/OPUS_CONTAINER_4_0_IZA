/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ApprovalDBDAOApprovalListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.07.24
*@LastModifier : 
*@LastVersion : 1.0
* 2018.07.24 
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

public class ApprovalDBDAOApprovalListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ApprovalDBDAOApprovalListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("vndr_seq",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("edate",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("sdate",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.approval.integration").append("\n"); 
		query.append("FileName : ApprovalDBDAOApprovalListRSQL").append("\n"); 
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
		query.append("SELECT DISTINCT" ).append("\n"); 
		query.append("CASE" ).append("\n"); 
		query.append("WHEN T.SUB_SYS_CD = 'TES' THEN TES.INV_OFC_CD" ).append("\n"); 
		query.append("WHEN T.SUB_SYS_CD = 'TRS' THEN NVL(TRS.CRE_OFC_CD,TRSW.CRE_OFC_CD)" ).append("\n"); 
		query.append("WHEN T.SUB_SYS_CD = 'ACM' THEN ''" ).append("\n"); 
		query.append("ELSE CMM.INV_OFC_CD" ).append("\n"); 
		query.append("END INV_OFC_CD, " ).append("\n"); 
		query.append("CASE WHEN LENGTH(T.GL_DT) = 8 THEN TO_CHAR(TO_DATE(T.GL_DT,'YYYYMMDD'),'YYYY-MM-DD') ELSE T.GL_DT END  GL_DT," ).append("\n"); 
		query.append("T.APRO_RQST_NO      	" ).append("\n"); 
		query.append(", T.CRNT_APRO_SEQ		" ).append("\n"); 
		query.append(", T.APSTS_CD  		" ).append("\n"); 
		query.append(", T.SUB_SYS_CD 				" ).append("\n"); 
		query.append(", T.RQST_ST_DT 		" ).append("\n"); 
		query.append(", T.COST_OFC_CD 		" ).append("\n"); 
		query.append(", T.CSR_NO  " ).append("\n"); 
		query.append(", T.INV_KNT 		" ).append("\n"); 
		query.append(", T.VNDR_SEQ 	" ).append("\n"); 
		query.append(", T.VNDR_NM		" ).append("\n"); 
		query.append(", T.PAY_DUE_DT		" ).append("\n"); 
		query.append(", T.CURR_CD  				" ).append("\n"); 
		query.append(", T.APRO_TTL_AMT  		" ).append("\n"); 
		query.append(", T.PAY_MZD_CD" ).append("\n"); 
		query.append(", T.PAY_MZD_NM" ).append("\n"); 
		query.append(", T.BANK_ACCT_FLG" ).append("\n"); 
		query.append(", T.APRO_RMK  		" ).append("\n"); 
		query.append(", T.APPYN  " ).append("\n"); 
		query.append("FROM (" ).append("\n"); 
		query.append("    SELECT" ).append("\n"); 
		query.append("    X.APRO_RQST_NO, X.CRNT_APRO_SEQ, X.APRO_RQST_SEQ, X.DP_SEQ, X.APRO_USR_ID" ).append("\n"); 
		query.append("    , CASE " ).append("\n"); 
		query.append("      WHEN X.APSTS_CD='P' THEN" ).append("\n"); 
		query.append("            CASE" ).append("\n"); 
		query.append("            WHEN X.MAX_APRO_RQST_SEQ = 2 AND X.FST_APPRED_KNT >= 1 THEN '1st Approved'" ).append("\n"); 
		query.append("            ELSE 'Requested'" ).append("\n"); 
		query.append("            END " ).append("\n"); 
		query.append("      WHEN X.APSTS_CD='R' THEN 'Disapproved'" ).append("\n"); 
		query.append("      WHEN X.APSTS_CD='C' THEN DECODE(D.IF_FLG,'E','Error','Final Approved')" ).append("\n"); 
		query.append("      WHEN X.APSTS_CD='D' THEN 'Cancelled'" ).append("\n"); 
		query.append("      END APSTS_CD" ).append("\n"); 
		query.append("    , X.SUB_SYS_CD, X.COST_OFC_CD, X.CSR_NO, X.INV_KNT" ).append("\n"); 
		query.append("    , X.VNDR_SEQ" ).append("\n"); 
		query.append("    , M.VNDR_LGL_ENG_NM VNDR_NM    " ).append("\n"); 
		query.append("    , X.RQST_ST_DT" ).append("\n"); 
		query.append("    , X.PAY_DUE_DT, X.CURR_CD, X.APRO_TTL_AMT" ).append("\n"); 
		query.append("    , DECODE(X.APSTS_CD,'P',DECODE(SIGN(X.NN_APPRED_KNT),1,'Y','N'),'Y') APPYN" ).append("\n"); 
		query.append("    , DECODE(D.IF_FLG,'E','I/F Error : '||D.IF_ERR_RSN,X.APRO_RMK) APRO_RMK" ).append("\n"); 
		query.append("    , L.PAY_MZD_CD, L.PAY_MZD_NM, L.BANK_ACCT_FLG" ).append("\n"); 
		query.append("    , D.GL_DT" ).append("\n"); 
		query.append("    FROM (" ).append("\n"); 
		query.append("        SELECT C.APRO_RQST_SEQ, C.DP_SEQ, C.APRO_USR_ID" ).append("\n"); 
		query.append("             , A.APRO_RQST_NO             " ).append("\n"); 
		query.append("	         , A.CRNT_APRO_SEQ" ).append("\n"); 
		query.append("             , SUM(DECODE(C.APSTS_CD,NULL,0,'',0,1)) OVER (PARTITION BY B.CSR_NO, C.APRO_RQST_SEQ) NN_APPRED_KNT" ).append("\n"); 
		query.append("             , SUM(DECODE(C.APRO_RQST_SEQ,1,DECODE(C.APSTS_CD,'C',1,'',0,0)))  OVER (PARTITION BY B.CSR_NO) FST_APPRED_KNT" ).append("\n"); 
		query.append("             , MAX(C.APRO_RQST_SEQ)  OVER (PARTITION BY B.CSR_NO) MAX_APRO_RQST_SEQ" ).append("\n"); 
		query.append("             , A.APSTS_CD" ).append("\n"); 
		query.append("	         , A.SUB_SYS_CD          	 " ).append("\n"); 
		query.append("	         , TO_CHAR(A.RQST_ST_DT, 'YYYY-MM-DD') RQST_ST_DT          	 " ).append("\n"); 
		query.append("             , A.RQST_OFC_CD" ).append("\n"); 
		query.append("	         , B.COST_OFC_CD          	 " ).append("\n"); 
		query.append("	         , B.CSR_NO          	 " ).append("\n"); 
		query.append("	         , B.INV_KNT          	 " ).append("\n"); 
		query.append("	         , TO_CHAR(B.VNDR_SEQ, '000000') VNDR_SEQ    " ).append("\n"); 
		query.append("	         , B.PAY_DUE_DT          	 " ).append("\n"); 
		query.append("	         , B.CURR_CD          	 " ).append("\n"); 
		query.append("	         , B.APRO_TTL_AMT          	 " ).append("\n"); 
		query.append("             , MAX(C.APRO_RMK)  OVER (PARTITION BY B.CSR_NO) APRO_RMK" ).append("\n"); 
		query.append("	      FROM COM_APRO_RQST_HDR  A" ).append("\n"); 
		query.append("	         , COM_APRO_CSR_DTL   B" ).append("\n"); 
		query.append("	         , COM_APRO_RQST_ROUT C" ).append("\n"); 
		query.append("	     WHERE 1 = 1  " ).append("\n"); 
		query.append("			AND A.SUB_SYS_CD NOT IN ('FLT','JOO')" ).append("\n"); 
		query.append("			#if (${sub_sys_cd} != '')" ).append("\n"); 
		query.append("			AND A.SUB_SYS_CD = @[sub_sys_cd]" ).append("\n"); 
		query.append("			#end   " ).append("\n"); 
		query.append("			AND NVL(A.DELT_FLG,'N') <> 'Y'    " ).append("\n"); 
		query.append("			AND A.APRO_RQST_NO = B.APRO_RQST_NO" ).append("\n"); 
		query.append("			AND A.APRO_RQST_NO = C.APRO_RQST_NO" ).append("\n"); 
		query.append("			#if (${sdate} != '')" ).append("\n"); 
		query.append("			AND TO_CHAR(A.RQST_ST_DT, 'YYYY-MM-DD') >= @[sdate]" ).append("\n"); 
		query.append("			#end  " ).append("\n"); 
		query.append("			#if (${edate} != '')" ).append("\n"); 
		query.append("			AND TO_CHAR(A.RQST_ST_DT, 'YYYY-MM-DD') <= @[edate]" ).append("\n"); 
		query.append("			#end   		   " ).append("\n"); 
		query.append("           ) X" ).append("\n"); 
		query.append("    , AP_INV_HDR D" ).append("\n"); 
		query.append("    , MDM_VENDOR M" ).append("\n"); 
		query.append("    , ( SELECT  SLD.LU_CD    AS PAY_MZD_CD" ).append("\n"); 
		query.append("                , SLD.LU_DESC AS PAY_MZD_NM" ).append("\n"); 
		query.append("                , CASE " ).append("\n"); 
		query.append("                  WHEN SLD.LU_CD IN ('T','A','F','R','S')" ).append("\n"); 
		query.append("                  THEN NVL(V.BANK_ACCT_FLG, 'N') " ).append("\n"); 
		query.append("                  ELSE 'N/A' " ).append("\n"); 
		query.append("                  END AS BANK_ACCT_FLG" ).append("\n"); 
		query.append("                , V.VNDR_SEQ" ).append("\n"); 
		query.append("        FROM    SCO_LU_HDR SLH" ).append("\n"); 
		query.append("                , SCO_LU_DTL SLD" ).append("\n"); 
		query.append("                , MDM_VENDOR V " ).append("\n"); 
		query.append("        WHERE SLH.LU_TP_CD = SLD.LU_TP_CD" ).append("\n"); 
		query.append("        AND   SLH.LU_TP_CD = 'PAYMENT METHOD'" ).append("\n"); 
		query.append("        AND   NVL(SLD.ENBL_FLG, 'Y') = 'Y'" ).append("\n"); 
		query.append("        AND   NVL(SLD.LU_ST_DT, TRIM(SYSDATE)) >= TRIM(SYSDATE)" ).append("\n"); 
		query.append("        AND   NVL(SLD.ATTR_CTNT2, SLD.LU_CD) = V.PAY_MZD_CD ) L" ).append("\n"); 
		query.append("    WHERE 1=1" ).append("\n"); 
		query.append("    AND X.CSR_NO = D.CSR_NO" ).append("\n"); 
		query.append("    AND X.VNDR_SEQ = M.VNDR_SEQ(+)" ).append("\n"); 
		query.append("    AND X.VNDR_SEQ = L.VNDR_SEQ(+)" ).append("\n"); 
		query.append("    AND X.VNDR_SEQ LIKE '%'||@[vndr_seq]||'%'" ).append("\n"); 
		query.append("	#if ($csr_no.size() > 0) " ).append("\n"); 
		query.append("	AND	X.CSR_NO IN	(" ).append("\n"); 
		query.append("		#foreach( ${key} in ${csr_no})" ).append("\n"); 
		query.append("			#if($velocityCount < $csr_no.size()) " ).append("\n"); 
		query.append("				'$key', " ).append("\n"); 
		query.append("			#else " ).append("\n"); 
		query.append("				'$key' " ).append("\n"); 
		query.append("			#end " ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("	)" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("    #if (${status} == 'P')" ).append("\n"); 
		query.append("    AND X.APSTS_CD = 'P'" ).append("\n"); 
		query.append("    AND DECODE(SIGN(X.NN_APPRED_KNT),1,'Y','N') = 'N'" ).append("\n"); 
		query.append("    AND X.CRNT_APRO_SEQ = X.APRO_RQST_SEQ" ).append("\n"); 
		query.append("    AND X.APRO_RQST_SEQ = 1" ).append("\n"); 
		query.append("    #elseif (${status} == 'F')" ).append("\n"); 
		query.append("    AND X.APSTS_CD = 'P'" ).append("\n"); 
		query.append("    AND X.MAX_APRO_RQST_SEQ = 2" ).append("\n"); 
		query.append("    AND X.FST_APPRED_KNT >= 1" ).append("\n"); 
		query.append("    #elseif (${status} == 'C')" ).append("\n"); 
		query.append("    AND NVL(X.APSTS_CD, ' ') = 'C' AND NVL(D.IF_FLG,' ') = 'Y'" ).append("\n"); 
		query.append("    #elseif (${status} == 'R')" ).append("\n"); 
		query.append("    AND NVL(X.APSTS_CD, ' ') = 'R'" ).append("\n"); 
		query.append("    #elseif (${status} == 'E')" ).append("\n"); 
		query.append("    AND D.IF_FLG = 'E'" ).append("\n"); 
		query.append("    #end" ).append("\n"); 
		query.append("    AND X.CRNT_APRO_SEQ = X.APRO_RQST_SEQ" ).append("\n"); 
		query.append("    AND EXISTS (SELECT 'A' FROM TES_TML_SO_HDR TTSH WHERE TTSH.CSR_NO = X.CSR_NO AND NVL(TTSH.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("        UNION ALL" ).append("\n"); 
		query.append("        SELECT 'A' FROM TRS_TRSP_INV_WRK TTIW WHERE TTIW.CSR_NO = X.CSR_NO AND NVL(TTIW.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("        UNION ALL" ).append("\n"); 
		query.append("        SELECT 'A' FROM TRS_TRSP_RAIL_INV_WRK TTRIW WHERE TTRIW.CSR_NO = X.CSR_NO AND NVL(TTRIW.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("        UNION ALL" ).append("\n"); 
		query.append("        SELECT 'A' FROM ACM_AGN_COMM AAC WHERE AAC.CSR_NO = X.CSR_NO" ).append("\n"); 
		query.append("        UNION ALL" ).append("\n"); 
		query.append("        SELECT 'A' FROM ACM_AGN_OTR_COMM AAOC WHERE AAOC.CSR_NO = X.CSR_NO" ).append("\n"); 
		query.append("        UNION ALL" ).append("\n"); 
		query.append("        SELECT 'A' FROM ACM_FF_CMPN AFC WHERE AFC.CSR_NO = X.CSR_NO" ).append("\n"); 
		query.append("        UNION ALL" ).append("\n"); 
		query.append("        SELECT 'A' FROM ACM_SPCL_CMPN ACMS WHERE ACMS.CSR_NO = X.CSR_NO" ).append("\n"); 
		query.append("        UNION ALL" ).append("\n"); 
		query.append("        SELECT 'A' FROM AP_PAY_INV API WHERE API.CSR_NO = X.CSR_NO AND NVL(API.DELT_FLG, 'N') <> 'Y')" ).append("\n"); 
		query.append("    #if(${c_ofc_cd_list} != '')" ).append("\n"); 
		query.append("    AND X.RQST_OFC_CD IN (" ).append("\n"); 
		query.append("        #foreach($key IN ${c_ofc_cd_list}) " ).append("\n"); 
		query.append("        #if($velocityCount < $c_ofc_cd_list.size()) " ).append("\n"); 
		query.append("        '$key', " ).append("\n"); 
		query.append("        #else " ).append("\n"); 
		query.append("        '$key' " ).append("\n"); 
		query.append("        #end " ).append("\n"); 
		query.append("        #end " ).append("\n"); 
		query.append("    )" ).append("\n"); 
		query.append("    #end" ).append("\n"); 
		query.append("    #if(${a_ofc_cd_list} != '')" ).append("\n"); 
		query.append("    AND EXISTS (" ).append("\n"); 
		query.append("        SELECT 'X'" ).append("\n"); 
		query.append("        FROM COM_APRO_RQST_ROUT R" ).append("\n"); 
		query.append("        WHERE 1=1" ).append("\n"); 
		query.append("        AND R.APRO_RQST_NO = X.APRO_RQST_NO" ).append("\n"); 
		query.append("        AND R.APRO_OFC_CD IN (" ).append("\n"); 
		query.append("            #foreach($key IN ${a_ofc_cd_list}) " ).append("\n"); 
		query.append("            #if($velocityCount < $a_ofc_cd_list.size()) " ).append("\n"); 
		query.append("            '$key', " ).append("\n"); 
		query.append("            #else " ).append("\n"); 
		query.append("            '$key' " ).append("\n"); 
		query.append("            #end " ).append("\n"); 
		query.append("            #end " ).append("\n"); 
		query.append("        )" ).append("\n"); 
		query.append("    )" ).append("\n"); 
		query.append("    #end    " ).append("\n"); 
		query.append(") T" ).append("\n"); 
		query.append(", AP_PAY_INV CMM" ).append("\n"); 
		query.append(", TES_TML_SO_HDR TES" ).append("\n"); 
		query.append(", TRS_TRSP_INV_WRK TRS" ).append("\n"); 
		query.append(", TRS_TRSP_RAIL_INV_WRK TRSW" ).append("\n"); 
		query.append("WHERE 1=1" ).append("\n"); 
		query.append("AND T.CSR_NO = CMM.CSR_NO(+)" ).append("\n"); 
		query.append("AND T.CSR_NO = TES.CSR_NO(+)" ).append("\n"); 
		query.append("AND T.CSR_NO = TRS.CSR_NO(+)" ).append("\n"); 
		query.append("AND T.CSR_NO = TRSW.CSR_NO(+)" ).append("\n"); 
		query.append("ORDER BY T.APRO_RQST_NO DESC" ).append("\n"); 

	}
}