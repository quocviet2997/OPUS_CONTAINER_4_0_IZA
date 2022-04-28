/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ApprovalDBDAOCheckApprovalDuplicationRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.03.23
*@LastModifier : 
*@LastVersion : 1.0
* 2018.03.23 
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

public class ApprovalDBDAOCheckApprovalDuplicationRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 중복 Approval 체크합니다
	  * </pre>
	  */
	public ApprovalDBDAOCheckApprovalDuplicationRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("login_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.approval.integration").append("\n"); 
		query.append("FileName : ApprovalDBDAOCheckApprovalDuplicationRSQL").append("\n"); 
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
		query.append("SELECT NVL((" ).append("\n"); 
		query.append("	SELECT " ).append("\n"); 
		query.append("		CASE " ).append("\n"); 
		query.append("        WHEN SUM(DECODE(R.APSTS_CD,NULL,0,'',0,1)) = 0 AND SUM(DECODE(R.APRO_USR_ID,@[login_usr_id],1,0)) > 0" ).append("\n"); 
		query.append("		THEN 'Y'" ).append("\n"); 
		query.append("		ELSE 'N'" ).append("\n"); 
		query.append("		END " ).append("\n"); 
		query.append("	FROM COM_APRO_CSR_DTL D, COM_APRO_RQST_ROUT R, COM_APRO_RQST_HDR H" ).append("\n"); 
		query.append("	WHERE 1=1" ).append("\n"); 
		query.append("    AND D.CSR_NO = @[csr_no]" ).append("\n"); 
		query.append("    AND R.APRO_RQST_NO = D.APRO_RQST_NO" ).append("\n"); 
		query.append("    AND R.APRO_RQST_NO = H.APRO_RQST_NO" ).append("\n"); 
		query.append("    AND R.APRO_RQST_SEQ = H.CRNT_APRO_SEQ" ).append("\n"); 
		query.append("    ),'X') CHK_CURR_APRO_USR  " ).append("\n"); 
		query.append("FROM DUAL" ).append("\n"); 

	}
}