/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ApprovalDBDAOdeleteCurrentApproversForUnapprovedCsrDSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.08.14
*@LastModifier : 
*@LastVersion : 1.0
* 2018.08.14 
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

public class ApprovalDBDAOdeleteCurrentApproversForUnapprovedCsrDSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * deleteCurrentApproversForUnapprovedCsr
	  * </pre>
	  */
	public ApprovalDBDAOdeleteCurrentApproversForUnapprovedCsrDSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("n2nd_appred_yn",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("n1st_appred_yn",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("csr_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.approval.integration").append("\n"); 
		query.append("FileName : ApprovalDBDAOdeleteCurrentApproversForUnapprovedCsrDSQL").append("\n"); 
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
		query.append("DELETE" ).append("\n"); 
		query.append("FROM COM_APRO_RQST_ROUT R" ).append("\n"); 
		query.append("WHERE R.APRO_RQST_NO = (SELECT C.APRO_RQST_NO FROM COM_APRO_CSR_DTL C WHERE C.CSR_NO = @[csr_no] AND C.APRO_RQST_NO = @[apro_rqst_no])" ).append("\n"); 
		query.append("AND R.APRO_RQST_SEQ IN (DECODE(NVL(@[n1st_appred_yn],'N'),'Y',-1,'1'), DECODE(NVL(@[n2nd_appred_yn],'N'),'Y',-1,'2'))" ).append("\n"); 

	}
}