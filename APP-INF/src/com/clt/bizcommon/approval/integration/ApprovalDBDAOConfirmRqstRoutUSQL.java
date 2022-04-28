/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ApprovalDBDAOConfirmRqstRoutUSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.03.12
*@LastModifier : 
*@LastVersion : 1.0
* 2018.03.12 
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

public class ApprovalDBDAOConfirmRqstRoutUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * COM_APRO_RQST_ROUT 승인정보를 수정한다
	  * </pre>
	  */
	public ApprovalDBDAOConfirmRqstRoutUSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("apro_usr_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("apro_rqst_seq",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("apro_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("apro_rmk",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("apro_rqst_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.approval.integration").append("\n"); 
		query.append("FileName : ApprovalDBDAOConfirmRqstRoutUSQL").append("\n"); 
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
		query.append("UPDATE COM_APRO_RQST_ROUT A 	" ).append("\n"); 
		query.append("   SET APRO_DT  = GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC((SELECT RQST_OFC_CD FROM COM_APRO_RQST_HDR WHERE APRO_RQST_NO=A.APRO_RQST_NO AND ROWNUM=1))" ).append("\n"); 
		query.append("     , APSTS_CD = 'C'" ).append("\n"); 
		query.append("    , APRO_RMK = @[apro_rmk]  " ).append("\n"); 
		query.append("     , APRO_USR_ID = @[apro_usr_id]" ).append("\n"); 
		query.append("     , APRO_USR_NM = @[apro_usr_nm]		   " ).append("\n"); 
		query.append(" WHERE APRO_RQST_NO  = @[apro_rqst_no]" ).append("\n"); 
		query.append("   AND APRO_RQST_SEQ = @[apro_rqst_seq]" ).append("\n"); 
		query.append("   AND APRO_USR_ID = @[apro_usr_id]" ).append("\n"); 

	}
}