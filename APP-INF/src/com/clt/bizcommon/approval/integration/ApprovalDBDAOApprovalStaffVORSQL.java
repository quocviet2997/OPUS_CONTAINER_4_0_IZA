/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ApprovalDBDAOApprovalStaffVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.08
*@LastModifier : 김현욱
*@LastVersion : 1.0
* 2010.07.08 김현욱
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.approval.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Kim Hyun Uk
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ApprovalDBDAOApprovalStaffVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Staff의 모든 목록을 가져온다.
	  * </pre>
	  */
	public ApprovalDBDAOApprovalStaffVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ofc_cd_deptsrch",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.approval.integration").append("\n"); 
		query.append("FileName : ApprovalDBDAOApprovalStaffVORSQL").append("\n"); 
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
		query.append("SELECT USR_NM" ).append("\n"); 
		query.append(", OFC_CD" ).append("\n"); 
		query.append(", PSN_ENG_NM" ).append("\n"); 
		query.append(", USR_ID" ).append("\n"); 
		query.append(", '' OFC_CD_DEPTSRCH" ).append("\n"); 
		query.append(", '' SUB_SYS_CD" ).append("\n"); 
		query.append(", '' MODEE" ).append("\n"); 
		query.append(", '' CSR_NO" ).append("\n"); 
		query.append(", '' STATUS" ).append("\n"); 
		query.append(", '' SDATE" ).append("\n"); 
		query.append(", '' EDATE" ).append("\n"); 
		query.append(", '' APRO_ROUT_SEQ" ).append("\n"); 
		query.append("FROM COM_USER" ).append("\n"); 
		query.append("WHERE USE_FLG = 'Y'" ).append("\n"); 
		query.append("#if (${ofc_cd_deptsrch} != '')" ).append("\n"); 
		query.append("AND OFC_CD LIKE	'%'||@[ofc_cd_deptsrch]||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("ORDER BY" ).append("\n"); 
		query.append("PSN_ENG_NM" ).append("\n"); 
		query.append(", USR_NM" ).append("\n"); 

	}
}