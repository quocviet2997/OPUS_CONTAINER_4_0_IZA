/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOApPayInvListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.10.29
*@LastModifier : 
*@LastVersion : 1.0
* 2018.10.29 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ConsultationSlipRequestMgtDBDAOApPayInvListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOApPayInvListRSQL(){
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
		params.put("inv_sub_sys_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("inv_ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("inv_cfm_dt",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOApPayInvListRSQL").append("\n"); 
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
		query.append("SELECT COST_OFC_CD," ).append("\n"); 
		query.append("       TO_CHAR(VNDR_NO, '000000') VNDR_NO," ).append("\n"); 
		query.append("       VNDR_SEQ_NAME," ).append("\n"); 
		query.append("       COUNT(VNDR_NO) CNT_INV," ).append("\n"); 
		query.append("       INV_CURR_CD," ).append("\n"); 
		query.append("       SUM(INV_TTL_AMT) TOTAL_AMT," ).append("\n"); 
		query.append("       TO_CHAR(MAX(INV_ISS_DT),'YYYY-MM-DD') INV_ISS_DT," ).append("\n"); 
		query.append("       TO_CHAR(MAX(INV_RCV_DT),'YYYY-MM-DD') INV_RCV_DT, " ).append("\n"); 
		query.append("       MDM_GET_PAY_TERM_CD_FNC(MIN(INV_ISS_DT), GEN_PAY_TERM_CD) GEN_PAY_TERM_CD, --GEN_PAY_TERM_CD," ).append("\n"); 
		query.append("       MDM_GET_PAY_TERM_CD_FNC(MIN(INV_ISS_DT), GEN_PAY_TERM_CD) GEN_PAY_TERM_DESC, --GEN_PAY_TERM_DESC" ).append("\n"); 
		query.append("       TO_CHAR(MDM_GET_PAY_DUE_DT_FNC(MIN(INV_ISS_DT), GEN_PAY_TERM_CD), 'YYYY-MM-DD') PAYMENT_DUE_DT," ).append("\n"); 
		query.append("--       DECODE(GEN_PAY_TERM_CD,'IN',  TO_CHAR(MAX(INV_ISS_DT) + 5, 'YYYY-MM-DD')" ).append("\n"); 
		query.append("--                             ,'OUT', TO_CHAR(MAX(INV_ISS_DT) + 60, 'YYYY-MM-DD')" ).append("\n"); 
		query.append("--                             ,'O60', TO_CHAR(MAX(INV_ISS_DT) , 'YYYY-MM-DD')" ).append("\n"); 
		query.append("--                             ,'O45', TO_CHAR(MAX(INV_ISS_DT) , 'YYYY-MM-DD')" ).append("\n"); 
		query.append("--                             ,TO_CHAR(MAX(INV_ISS_DT) + TO_NUMBER(GEN_PAY_TERM_CD), 'YYYY-MM-DD')) PAYMENT_DUE_DT," ).append("\n"); 
		query.append("       PAY_TERM_TP_CD," ).append("\n"); 
		query.append("	   INV_SUB_SYS_CD," ).append("\n"); 
		query.append("	   PSO_TRNS_SLP_CTNT," ).append("\n"); 
		query.append("       '' INV_CFM_DT," ).append("\n"); 
		query.append("       '' VNDR_SEQ," ).append("\n"); 
		query.append("       '' INV_OFC_CD " ).append("\n"); 
		query.append("FROM ( " ).append("\n"); 
		query.append("	SELECT DISTINCT" ).append("\n"); 
		query.append("              A.COST_OFC_CD     COST_OFC_CD," ).append("\n"); 
		query.append("              A.VNDR_SEQ        VNDR_NO," ).append("\n"); 
		query.append("              B.VNDR_LGL_ENG_NM VNDR_SEQ_NAME," ).append("\n"); 
		query.append("              A.INV_CURR_CD     INV_CURR_CD," ).append("\n"); 
		query.append("			  DECODE(A.INV_CURR_CD, 'KRW', ROUND(NVL(A.INV_TTL_AMT,0),0)" ).append("\n"); 
		query.append("			      				  , 'JPY', ROUND(NVL(A.INV_TTL_AMT,0),0)" ).append("\n"); 
		query.append("								  , ROUND(NVL(A.INV_TTL_AMT,0),2)) INV_TTL_AMT," ).append("\n"); 
		query.append("              A.INV_VAT_AMT," ).append("\n"); 
		query.append("              A.INV_ISS_DT," ).append("\n"); 
		query.append("              A.INV_RCV_DT," ).append("\n"); 
		query.append("              B.GEN_PAY_TERM_CD," ).append("\n"); 
		query.append("              DECODE(B.GEN_PAY_TERM_CD, 'O60', 'KR H/O Payment_60', B.GEN_PAY_TERM_CD) GEN_PAY_TERM_DESC," ).append("\n"); 
		query.append("              B.PAY_TERM_TP_CD," ).append("\n"); 
		query.append("              A.INV_SUB_SYS_CD," ).append("\n"); 
		query.append("			  A.INV_NO," ).append("\n"); 
		query.append("			  A.PSO_TRNS_SLP_CTNT" ).append("\n"); 
		query.append("       FROM   AP_PAY_INV A, " ).append("\n"); 
		query.append("			  MDM_VENDOR B" ).append("\n"); 
		query.append("       WHERE  A.INV_OFC_CD      = @[inv_ofc_cd]" ).append("\n"); 
		query.append("#if (${inv_sub_sys_cd} == 'MNR')" ).append("\n"); 
		query.append("  		 AND A.INV_SUB_SYS_CD IN (@[inv_sub_sys_cd], 'TLL')" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("  	     AND A.INV_SUB_SYS_CD = @[inv_sub_sys_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("  		 AND A.INV_STS_CD IN ('C', 'X')" ).append("\n"); 
		query.append("  	     AND A.VNDR_SEQ   = B.VNDR_SEQ " ).append("\n"); 
		query.append("#if (${inv_cfm_dt} != '')" ).append("\n"); 
		query.append("	     AND TO_CHAR(a.INV_CFM_DT,'YYYY-MM-DD') = @[inv_cfm_dt] " ).append("\n"); 
		query.append("#end " ).append("\n"); 
		query.append("#if (${vndr_seq} != '')" ).append("\n"); 
		query.append("         AND A.VNDR_SEQ                         = @[vndr_seq]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("         AND NVL(A.DELT_FLG,'N')               <> 'Y' " ).append("\n"); 
		query.append("         AND NOT EXISTS (" ).append("\n"); 
		query.append("        				SELECT 'X'" ).append("\n"); 
		query.append("          				  FROM AP_INV_HDR C" ).append("\n"); 
		query.append("         				 WHERE A.CSR_NO = C.CSR_NO" ).append("\n"); 
		query.append("          				   AND C.IF_ERR_RSN = 'Sending...'" ).append("\n"); 
		query.append("      					)" ).append("\n"); 
		query.append("       )" ).append("\n"); 
		query.append("GROUP BY COST_OFC_CD," ).append("\n"); 
		query.append("         VNDR_NO," ).append("\n"); 
		query.append("         VNDR_SEQ_NAME," ).append("\n"); 
		query.append("         INV_CURR_CD," ).append("\n"); 
		query.append("         GEN_PAY_TERM_CD," ).append("\n"); 
		query.append("         GEN_PAY_TERM_DESC," ).append("\n"); 
		query.append("         PAY_TERM_TP_CD," ).append("\n"); 
		query.append("		 INV_SUB_SYS_CD," ).append("\n"); 
		query.append("		 PSO_TRNS_SLP_CTNT" ).append("\n"); 

	}
}