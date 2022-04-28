/*=========================================================
*Copyright(c) 2019 CyberLogitec
*@FileName : ApprovalDBDAOinsertNewApproversForUnapprovedCsrCSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2019.01.21
*@LastModifier : 
*@LastVersion : 1.0
* 2019.01.21 
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

public class ApprovalDBDAOinsertNewApproversForUnapprovedCsrCSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * insertNewApproversForUnapprovedCsr
	  * </pre>
	  */
	public ApprovalDBDAOinsertNewApproversForUnapprovedCsrCSQL(){
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
		params.put("n2nd_appred_yn",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cre_usr_id",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("n1st_appred_yn",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("apro_rqst_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.approval.integration").append("\n"); 
		query.append("FileName : ApprovalDBDAOinsertNewApproversForUnapprovedCsrCSQL").append("\n"); 
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
		query.append("INSERT INTO COM_APRO_RQST_ROUT R (" ).append("\n"); 
		query.append("APRO_RQST_NO, APRO_RQST_SEQ, APRO_USR_ID, APRO_USR_NM, APRO_OFC_CD, APRO_OFC_NM, APRO_USR_JB_TIT_NM" ).append("\n"); 
		query.append(", APRO_DT, APSTS_CD, APRO_RMK, DELT_FLG, CRE_USR_ID, CRE_DT, UPD_USR_ID, UPD_DT, EDW_UPD_DT, DP_SEQ" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("SELECT " ).append("\n"); 
		query.append("(SELECT C.APRO_RQST_NO FROM COM_APRO_CSR_DTL C WHERE C.CSR_NO = @[csr_no] AND C.APRO_RQST_NO = @[apro_rqst_no]) APRO_RQST_NO" ).append("\n"); 
		query.append(", B.APRO_SEQ APRO_RQST_SEQ" ).append("\n"); 
		query.append(", B.APRO_USR_ID, U.USR_NM, U.OFC_CD, NULL, U.JB_ENG_NM" ).append("\n"); 
		query.append(", NULL, NULL, NULL, 'N', @[cre_usr_id], SYSDATE, @[cre_usr_id], SYSDATE, NULL, B.DP_SEQ" ).append("\n"); 
		query.append("FROM COM_APRO_ROUT_DFLT A, COM_APRO_ROUT_DFLT_DTL B, COM_USER U" ).append("\n"); 
		query.append("WHERE 1=1" ).append("\n"); 
		query.append("AND A.SUB_SYS_CD NOT IN ('FLT','JOO')" ).append("\n"); 
		query.append("AND A.SUB_SYS_CD = @[sub_sys_cd]" ).append("\n"); 
		query.append("AND A.OFC_CD = @[ofc_cd]" ).append("\n"); 
		query.append("AND NVL(A.DELT_FLG,'N') <> 'Y'" ).append("\n"); 
		query.append("AND A.APRO_ROUT_SEQ = B.APRO_ROUT_SEQ" ).append("\n"); 
		query.append("AND NVL(B.DELT_FLG,'N') <> 'Y'" ).append("\n"); 
		query.append("AND B.APRO_USR_ID = U.USR_ID(+)" ).append("\n"); 
		query.append("AND B.APRO_SEQ IN (DECODE(NVL(@[n1st_appred_yn],'N'),'Y',-1,1), DECODE(NVL(@[n2nd_appred_yn],'N'),'Y',-1,2))" ).append("\n"); 
		query.append("AND DECODE(B.APRO_SEQ, 1, 'Y'," ).append("\n"); 
		query.append("            CASE" ).append("\n"); 
		query.append("            WHEN A.CSR_CURR_CD IS NOT NULL AND NVL(A.CSR_AMT,0) <> 0 " ).append("\n"); 
		query.append("            THEN" ).append("\n"); 
		query.append("                CASE " ).append("\n"); 
		query.append("                WHEN  NVL(A.CSR_AMT, -1) < " ).append("\n"); 
		query.append("                        (SELECT NVL(COM_CONV_CURR_FNC(H.CSR_CURR_CD, A.CSR_CURR_CD, H.CSR_AMT, SUBSTR(H.GL_DT,1,6)), 0) CSR_AMT" ).append("\n"); 
		query.append("                         FROM AP_INV_HDR H" ).append("\n"); 
		query.append("                         WHERE CSR_NO = @[csr_no])" ).append("\n"); 
		query.append("                THEN 'Y'" ).append("\n"); 
		query.append("                ELSE 'N'" ).append("\n"); 
		query.append("                END" ).append("\n"); 
		query.append("            ELSE 'Y'" ).append("\n"); 
		query.append("            END) = 'Y'" ).append("\n"); 

	}
}