/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ApprovalDBDAOSearchApprovalByAproRoutSeqRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.03.20
*@LastModifier : 
*@LastVersion : 1.0
* 2018.03.20 
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

public class ApprovalDBDAOSearchApprovalByAproRoutSeqRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Approval 목록을 가져온다
	  * </pre>
	  */
	public ApprovalDBDAOSearchApprovalByAproRoutSeqRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("apro_rout_seq",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.approval.integration").append("\n"); 
		query.append("FileName : ApprovalDBDAOSearchApprovalByAproRoutSeqRSQL").append("\n"); 
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
		query.append("SELECT APRO_SEQ," ).append("\n"); 
		query.append("       ROWNUM DP_SEQ," ).append("\n"); 
		query.append("       APRO_USR_ID," ).append("\n"); 
		query.append("       APRO_USR_NM," ).append("\n"); 
		query.append("       APRO_OFC_CD," ).append("\n"); 
		query.append("       APRO_USR_JB_TIT_NM" ).append("\n"); 
		query.append("FROM (SELECT ROW_NUMBER() OVER (ORDER BY A.APRO_SEQ DESC) no," ).append("\n"); 
		query.append("		A.APRO_SEQ," ).append("\n"); 
		query.append("        A.DP_SEQ," ).append("\n"); 
		query.append("		A.APRO_USR_ID," ).append("\n"); 
		query.append("		A.APRO_USR_NM," ).append("\n"); 
		query.append("		B.OFC_CD APRO_OFC_CD," ).append("\n"); 
		query.append("		A.APRO_USR_JB_TIT_NM" ).append("\n"); 
		query.append("		FROM COM_APRO_ROUT_DFLT_DTL A, COM_USER B" ).append("\n"); 
		query.append("		WHERE B.USE_FLG = 'Y'" ).append("\n"); 
		query.append("		--AND A.APRO_USR_ID = B.USR_ID" ).append("\n"); 
		query.append("          AND A.APRO_USR_ID IN (B.USR_ID," ).append("\n"); 
		query.append("              B.EP_ID)" ).append("\n"); 
		query.append("		  AND A.APRO_ROUT_SEQ = @[apro_rout_seq]" ).append("\n"); 
		query.append("		ORDER BY A.APRO_SEQ, DP_SEQ" ).append("\n"); 
		query.append(")A" ).append("\n"); 

	}
}