/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ApprovalDBDAOApprovalRouteUtil02RSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.04.19
*@LastModifier : 
*@LastVersion : 1.0
* 2018.04.19 
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

public class ApprovalDBDAOApprovalRouteUtil02RSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ApprovalDBDAOApprovalRouteUtil02RSQL(){
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
		query.append("FileName : ApprovalDBDAOApprovalRouteUtil02RSQL").append("\n"); 
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
		query.append("SELECT A.APRO_SEQ," ).append("\n"); 
		query.append("	       A.APRO_USR_ID," ).append("\n"); 
		query.append("	       A.APRO_USR_NM," ).append("\n"); 
		query.append("	       B.OFC_CD APRO_OFC_CD," ).append("\n"); 
		query.append("	       A.APRO_USR_JB_TIT_NM" ).append("\n"); 
		query.append("	  FROM COM_APRO_ROUT_DFLT_DTL A, COM_USER B" ).append("\n"); 
		query.append("	 WHERE B.USE_FLG = 'Y'" ).append("\n"); 
		query.append("	   AND NVL(A.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("	   AND A.APRO_USR_ID IN (B.USR_ID, B.EP_ID)" ).append("\n"); 
		query.append("	   AND A.APRO_ROUT_SEQ = @[apro_rout_seq] --// 1 -- Aapro_rout_seq를 받아야 하나 조직도 문제로 OPUS에서는 Approval Step창을 사용 할 수 없는 관계로 전창현 수석님으로 고정 (실제 사용시에는 반드시 변경 필요)" ).append("\n"); 
		query.append("	 ORDER BY A.APRO_SEQ DESC" ).append("\n"); 

	}
}