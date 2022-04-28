/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ApprovalDBDAOApprovalHeaderCSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.05.02
*@LastModifier : 
*@LastVersion : 1.0
* 2018.05.02 
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

public class ApprovalDBDAOApprovalHeaderCSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Approval Header 정보를 생성합니다
	  * </pre>
	  */
	public ApprovalDBDAOApprovalHeaderCSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("apro_knd_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rqst_ofc_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("dflt_apro_ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("sub_sys_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rqst_tit_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rqst_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("apro_rout_seq",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rqst_ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("rqst_usr_nm",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.approval.integration").append("\n"); 
		query.append("FileName : ApprovalDBDAOApprovalHeaderCSQL").append("\n"); 
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
		query.append("INSERT INTO COM_APRO_RQST_HDR ( 	" ).append("\n"); 
		query.append("  APRO_RQST_NO                 	" ).append("\n"); 
		query.append(", SUB_SYS_CD              		" ).append("\n"); 
		query.append(", APRO_KND_CD              		" ).append("\n"); 
		query.append(", APSTS_CD                 " ).append("\n"); 
		query.append(", CRNT_APRO_SEQ             		" ).append("\n"); 
		query.append(", RQST_USR_ID             		" ).append("\n"); 
		query.append(", RQST_USR_NM             		" ).append("\n"); 
		query.append(", RQST_OFC_CD             		" ).append("\n"); 
		query.append(", RQST_OFC_NM             		" ).append("\n"); 
		query.append(", RQST_USR_JB_TIT_NM             		" ).append("\n"); 
		query.append(", RQST_ST_DT             		" ).append("\n"); 
		query.append(", RQST_TIT_NM             		" ).append("\n"); 
		query.append(", RQST_RMK          " ).append("\n"); 
		query.append(", DFLT_APRO_OFC_CD" ).append("\n"); 
		query.append(", APRO_ROUT_SEQ" ).append("\n"); 
		query.append(", CRE_USR_ID                  	" ).append("\n"); 
		query.append(", CRE_DT              		" ).append("\n"); 
		query.append(", UPD_USR_ID              	" ).append("\n"); 
		query.append(", DELT_FLG )      			" ).append("\n"); 
		query.append(" VALUES (" ).append("\n"); 
		query.append("  @[apro_rqst_no]" ).append("\n"); 
		query.append(", @[sub_sys_cd]" ).append("\n"); 
		query.append(", @[apro_knd_cd]" ).append("\n"); 
		query.append(", 'P'" ).append("\n"); 
		query.append(", '1'" ).append("\n"); 
		query.append(", @[rqst_usr_id]" ).append("\n"); 
		query.append(", @[rqst_usr_nm]" ).append("\n"); 
		query.append(", @[rqst_ofc_cd]" ).append("\n"); 
		query.append(", @[rqst_ofc_nm]" ).append("\n"); 
		query.append(", @[rqst_tit_nm]" ).append("\n"); 
		query.append(", GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[rqst_ofc_cd])" ).append("\n"); 
		query.append(", ''" ).append("\n"); 
		query.append(", ''" ).append("\n"); 
		query.append(", @[dflt_apro_ofc_cd]" ).append("\n"); 
		query.append(", @[apro_rout_seq]" ).append("\n"); 
		query.append(", @[rqst_usr_id]" ).append("\n"); 
		query.append(", sysdate" ).append("\n"); 
		query.append(", ' '" ).append("\n"); 
		query.append(", 'N')" ).append("\n"); 

	}
}