/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ApprovalDBDAOSearchApprovalByCsrNoRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.06
*@LastModifier : 김현욱
*@LastVersion : 1.0
* 2010.07.06 김현욱
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.approval.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Kim Hyun Uk
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ApprovalDBDAOSearchApprovalByCsrNoRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Approval 목록을 가져온다
	  * </pre>
	  */
	public ApprovalDBDAOSearchApprovalByCsrNoRSQL(){
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
		query.append("Path : com.clt.bizcommon.approval.integration ").append("\n"); 
		query.append("FileName : ApprovalDBDAOSearchApprovalByCsrNoRSQL").append("\n"); 
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
		query.append("SELECT ROUT.APRO_RQST_SEQ AS APRO_SEQ," ).append("\n"); 
		query.append("ROUT.APRO_USR_ID ," ).append("\n"); 
		query.append("ROUT.APRO_USR_NM ," ).append("\n"); 
		query.append("ROUT.APRO_OFC_CD ," ).append("\n"); 
		query.append("ROUT.APRO_USR_JB_TIT_NM" ).append("\n"); 
		query.append("--(CASE WHEN ROUT.APSTS_CD = 'C' THEN 'Approved' END) AS APSTS_CD" ).append("\n"); 
		query.append("FROM COM_APRO_RQST_ROUT ROUT ," ).append("\n"); 
		query.append("COM_APRO_CSR_DTL CSR ," ).append("\n"); 
		query.append("COM_APRO_RQST_HDR HDR" ).append("\n"); 
		query.append("WHERE HDR.APRO_RQST_NO = ROUT.APRO_RQST_NO" ).append("\n"); 
		query.append("AND HDR.APRO_RQST_NO = CSR.APRO_RQST_NO" ).append("\n"); 
		query.append("AND CSR.CSR_NO = @[csr_no]" ).append("\n"); 
		query.append("AND (ROUT.APSTS_CD <> 'D'" ).append("\n"); 
		query.append("OR ROUT.APSTS_CD IS NULL)" ).append("\n"); 
		query.append("ORDER BY ROUT.APRO_RQST_SEQ DESC" ).append("\n"); 

	}
}