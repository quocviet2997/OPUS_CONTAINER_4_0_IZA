/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ApprovalDBDAOApprovalCurCsrRouteRSQL.java
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

public class ApprovalDBDAOApprovalCurCsrRouteRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 현 결재자 정보를 조회한다
	  * </pre>
	  */
	public ApprovalDBDAOApprovalCurCsrRouteRSQL(){
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
		query.append("Path : com.clt.bizcommon.approval.integration ").append("\n"); 
		query.append("FileName : ApprovalDBDAOApprovalCurCsrRouteRSQL").append("\n"); 
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
		query.append("SELECT APRO_RQST_NO" ).append("\n"); 
		query.append(", APRO_RQST_SEQ" ).append("\n"); 
		query.append(", APRO_USR_ID" ).append("\n"); 
		query.append(", APRO_USR_NM" ).append("\n"); 
		query.append(", APRO_OFC_CD" ).append("\n"); 
		query.append(", APRO_OFC_NM" ).append("\n"); 
		query.append(", APRO_USR_JB_TIT_NM" ).append("\n"); 
		query.append(", APRO_DT" ).append("\n"); 
		query.append(", APSTS_CD" ).append("\n"); 
		query.append(", APRO_RMK" ).append("\n"); 
		query.append("FROM COM_APRO_RQST_ROUT" ).append("\n"); 
		query.append("WHERE 1 = 1" ).append("\n"); 
		query.append("AND APRO_RQST_NO = @[apro_rqst_no]" ).append("\n"); 
		query.append("AND APRO_RQST_SEQ = (" ).append("\n"); 
		query.append("SELECT CRNT_APRO_SEQ" ).append("\n"); 
		query.append("FROM COM_APRO_RQST_HDR" ).append("\n"); 
		query.append("WHERE APRO_RQST_NO = @[apro_rqst_no]" ).append("\n"); 
		query.append(")" ).append("\n"); 

	}
}