/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : ApprovalDBDAOSearchLastApprovalRouteRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2017.07.11
*@LastModifier : 
*@LastVersion : 1.0
* 2017.07.11 
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

public class ApprovalDBDAOSearchLastApprovalRouteRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Last Approval Route 정보를 조회합니다
	  * </pre>
	  */
	public ApprovalDBDAOSearchLastApprovalRouteRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("apro_rqst_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.approval.integration").append("\n"); 
		query.append("FileName : ApprovalDBDAOSearchLastApprovalRouteRSQL").append("\n"); 
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
		query.append("SELECT COUNT(APRO_RQST_NO) CNT " ).append("\n"); 
		query.append("  FROM COM_APRO_RQST_HDR  " ).append("\n"); 
		query.append(" WHERE APRO_RQST_NO = @[apro_rqst_no]" ).append("\n"); 
		query.append("   AND CRNT_APRO_SEQ = ( " ).append("\n"); 
		query.append("                        SELECT MAX(APRO_RQST_SEQ) " ).append("\n"); 
		query.append("                          FROM COM_APRO_RQST_ROUT " ).append("\n"); 
		query.append("                         WHERE APRO_RQST_NO = @[apro_rqst_no]" ).append("\n"); 
		query.append("                           AND APSTS_CD = 'C'" ).append("\n"); 
		query.append("       )" ).append("\n"); 

	}
}