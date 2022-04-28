/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ApprovalDBDAOupdateCurrentApprovalSeqForUnapprovedCsrUSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.09.05
*@LastModifier : 
*@LastVersion : 1.0
* 2018.09.05 
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

public class ApprovalDBDAOupdateCurrentApprovalSeqForUnapprovedCsrUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * ApprovalDBDAO  updateCurrentApprovalSeqForUnapprovedCsr USQL
	  * </pre>
	  */
	public ApprovalDBDAOupdateCurrentApprovalSeqForUnapprovedCsrUSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("upd_1st_apro_step_yn",new String[]{arrTmp[0],arrTmp[1]});

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
		query.append("FileName : ApprovalDBDAOupdateCurrentApprovalSeqForUnapprovedCsrUSQL").append("\n"); 
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
		query.append("UPDATE COM_APRO_RQST_HDR RH" ).append("\n"); 
		query.append("SET RH.CRNT_APRO_SEQ = 1" ).append("\n"); 
		query.append("WHERE 1=1" ).append("\n"); 
		query.append("AND DECODE(@[upd_1st_apro_step_yn],'Y',1,0) = DECODE(@[upd_1st_apro_step_yn],'Y',1,-1)" ).append("\n"); 
		query.append("AND RH.APRO_RQST_NO IN (" ).append("\n"); 
		query.append("    SELECT " ).append("\n"); 
		query.append("    A.APRO_RQST_NO" ).append("\n"); 
		query.append("    FROM COM_APRO_CSR_DTL D, COM_APRO_RQST_HDR A" ).append("\n"); 
		query.append("    WHERE 1=1" ).append("\n"); 
		query.append("    AND D.CSR_NO = @[csr_no]" ).append("\n"); 
		query.append("    AND D.APRO_RQST_NO = @[apro_rqst_no]" ).append("\n"); 
		query.append("    AND D.APRO_RQST_NO = A.APRO_RQST_NO" ).append("\n"); 
		query.append("    AND A.CRNT_APRO_SEQ > 1" ).append("\n"); 
		query.append("    AND NVL(A.DELT_FLG,'N') <> 'Y'" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("AND NVL(RH.DELT_FLG,'N') <> 'Y'" ).append("\n"); 
		query.append("AND NOT EXISTS (" ).append("\n"); 
		query.append("    SELECT '1'" ).append("\n"); 
		query.append("    FROM COM_APRO_RQST_ROUT RR" ).append("\n"); 
		query.append("    WHERE 1=1" ).append("\n"); 
		query.append("    AND RR.APRO_RQST_NO = RH.APRO_RQST_NO" ).append("\n"); 
		query.append("    AND RR.APSTS_CD IS NOT NULL" ).append("\n"); 
		query.append(")" ).append("\n"); 

	}
}