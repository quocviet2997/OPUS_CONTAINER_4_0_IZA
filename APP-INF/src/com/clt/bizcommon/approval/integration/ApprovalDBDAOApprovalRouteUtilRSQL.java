/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ApprovalDBDAOApprovalRouteUtilRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.08.18
*@LastModifier : 김경섭
*@LastVersion : 1.0
* 2010.08.18 김경섭
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.approval.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Kim Gyoung Sub
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ApprovalDBDAOApprovalRouteUtilRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ApprovalDBDAOApprovalRouteUtilRSQL(){
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
		query.append("FileName : ApprovalDBDAOApprovalRouteUtilRSQL").append("\n"); 
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
		query.append("SELECT A.APRO_RQST_SEQ AS APRO_SEQ," ).append("\n"); 
		query.append("A.APRO_USR_ID," ).append("\n"); 
		query.append("A.APRO_USR_NM," ).append("\n"); 
		query.append("A.APRO_OFC_CD," ).append("\n"); 
		query.append("A.APRO_USR_JB_TIT_NM" ).append("\n"); 
		query.append("FROM   COM_APRO_RQST_ROUT A," ).append("\n"); 
		query.append("COM_APRO_CSR_DTL   B" ).append("\n"); 
		query.append("WHERE  A.APRO_RQST_NO = B.APRO_RQST_NO" ).append("\n"); 
		query.append("AND    B.CSR_NO       = @[csr_no]" ).append("\n"); 
		query.append("AND    NVL(A.DELT_FLG,'N') = 'N'" ).append("\n"); 
		query.append("ORDER BY A.APRO_RQST_SEQ" ).append("\n"); 

	}
}