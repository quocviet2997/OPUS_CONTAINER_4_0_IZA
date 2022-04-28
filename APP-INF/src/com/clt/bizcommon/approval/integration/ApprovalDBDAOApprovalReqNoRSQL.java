/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ApprovalDBDAOApprovalReqNoRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.13
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2010.07.13 함대성
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.approval.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author HAM DAE SUNG
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ApprovalDBDAOApprovalReqNoRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Approval Request Number를 조회합니다
	  * </pre>
	  */
	public ApprovalDBDAOApprovalReqNoRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.approval.integration").append("\n"); 
		query.append("FileName : ApprovalDBDAOApprovalReqNoRSQL").append("\n"); 
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
		query.append("SELECT DISTINCT A.APRO_RQST_NO" ).append("\n"); 
		query.append("FROM COM_APRO_RQST_HDR  A" ).append("\n"); 
		query.append(", COM_APRO_CSR_DTL   B" ).append("\n"); 
		query.append(", COM_APRO_RQST_ROUT C" ).append("\n"); 
		query.append("WHERE A.APSTS_CD      = 'P'" ).append("\n"); 
		query.append("AND A.APRO_RQST_NO  = B.APRO_RQST_NO" ).append("\n"); 
		query.append("AND A.APRO_RQST_NO  = C.APRO_RQST_NO" ).append("\n"); 
		query.append("--AND A.CRNT_APRO_SEQ = C.APRO_RQST_SEQ" ).append("\n"); 
		query.append("AND CSR_NO          = @[csr_no]" ).append("\n"); 
		query.append("AND NVL(A.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 

	}
}