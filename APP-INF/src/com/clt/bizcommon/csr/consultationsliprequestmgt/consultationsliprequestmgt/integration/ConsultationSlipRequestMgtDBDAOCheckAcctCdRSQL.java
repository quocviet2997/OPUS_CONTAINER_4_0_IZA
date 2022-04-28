/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOCheckAcctCdRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2017.07.18
*@LastModifier : 
*@LastVersion : 1.0
* 2017.07.18 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ConsultationSlipRequestMgtDBDAOCheckAcctCdRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOCheckAcctCdRSQL(){
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
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOCheckAcctCdRSQL").append("\n"); 
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
		query.append("SELECT DTRB_COA_ACCT_CD," ).append("\n"); 
		query.append("	   LINE_SEQ," ).append("\n"); 
		query.append("	   LINE_NO," ).append("\n"); 
		query.append("       INV_AMT," ).append("\n"); 
		query.append("       FTU_USE_CTNT1," ).append("\n"); 
		query.append("       ATTR_CTNT11," ).append("\n"); 
		query.append("       ATTR_CTNT12," ).append("\n"); 
		query.append("       ATTR_CTNT14," ).append("\n"); 
		query.append("       DECODE(DTRB_COA_ACCT_CD" ).append("\n"); 
		query.append("			 ,(SELECT C.ATTR_CTNT1 FROM COM_ACCT_HRD_CDG_DESC D, COM_ACCT_HRD_CDG_CTNT C " ).append("\n"); 
		query.append("				WHERE D.SRC_MDL_CD = C.SRC_MDL_CD AND D.HRD_CDG_ID = C.HRD_CDG_ID " ).append("\n"); 
		query.append("				  AND D.SRC_MDL_CD = 'CSR' AND D.HRD_CDG_ID = 'AGT_ACCT_RCV')" ).append("\n"); 
		query.append("             ,'Y'" ).append("\n"); 
		query.append("			 ,(SELECT C.ATTR_CTNT1 FROM COM_ACCT_HRD_CDG_DESC D, COM_ACCT_HRD_CDG_CTNT C " ).append("\n"); 
		query.append("				WHERE D.SRC_MDL_CD = C.SRC_MDL_CD AND D.HRD_CDG_ID = C.HRD_CDG_ID " ).append("\n"); 
		query.append("				  AND D.SRC_MDL_CD = 'CSR' AND D.HRD_CDG_ID = 'OA_INTER_OFC_ACCT')" ).append("\n"); 
		query.append("             ,'Y'" ).append("\n"); 
		query.append("             ,'N') MOD_FLG" ).append("\n"); 
		query.append("FROM AP_INV_DTRB" ).append("\n"); 
		query.append("WHERE CSR_NO = @[csr_no]" ).append("\n"); 

	}
}