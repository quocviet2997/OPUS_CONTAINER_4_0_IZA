/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOModifyAPInvoiceByStmSapUSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2014.07.01
*@LastModifier : 
*@LastVersion : 1.0
* 2014.07.01 
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

public class ConsultationSlipRequestMgtDBDAOModifyAPInvoiceByStmSapUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * STM SAP 모듈에서 payment 가 일어날때 호출
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOModifyAPInvoiceByStmSapUSQL(){
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
		query.append("FileName : ConsultationSlipRequestMgtDBDAOModifyAPInvoiceByStmSapUSQL").append("\n"); 
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
		query.append("UPDATE AP_INV_HDR A" ).append("\n"); 
		query.append("SET (A.PAY_AMT, A.PAY_DT, A.PAY_MZD_LU_CD)" ).append("\n"); 
		query.append("    = (" ).append("\n"); 
		query.append("       SELECT SUM(SPD.PAY_AMT) AS PAY_AMT" ).append("\n"); 
		query.append("             ,TO_CHAR(MAX(SPH.PAY_DT),'YYYYMMDD') PAY_DT" ).append("\n"); 
		query.append("             ,SIH.PAY_MZD_LU_CD" ).append("\n"); 
		query.append("       FROM  SAP_INV_HDR SIH" ).append("\n"); 
		query.append("            ,SAP_PAY_HDR SPH " ).append("\n"); 
		query.append("            ,SAP_PAY_DTL SPD" ).append("\n"); 
		query.append("       WHERE SPH.PAY_SEQ = SPD.PAY_SEQ" ).append("\n"); 
		query.append("       AND   SIH.INV_SEQ = SPD.INV_SEQ" ).append("\n"); 
		query.append("       AND   SIH.INV_NO = A.CSR_NO" ).append("\n"); 
		query.append("       GROUP BY SIH.INV_NO, SIH.PAY_MZD_LU_CD" ).append("\n"); 
		query.append("      ) " ).append("\n"); 
		query.append("   ,EAI_EVNT_DT = SYSDATE" ).append("\n"); 
		query.append("WHERE   A.CSR_NO = @[csr_no]" ).append("\n"); 
		query.append("AND EXISTS  (" ).append("\n"); 
		query.append("              SELECT 'Y'" ).append("\n"); 
		query.append("              FROM  SAP_INV_HDR SIH" ).append("\n"); 
		query.append("              WHERE 1=1" ).append("\n"); 
		query.append("              AND SIH.INV_NO = A.CSR_NO              " ).append("\n"); 
		query.append("            )" ).append("\n"); 

	}
}