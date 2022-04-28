/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOCSRSOlistRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.05.04
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2010.05.04 함대성
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author HAM DAE SUNG
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ConsultationSlipRequestMgtDBDAOCSRSOlistRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOCSRSOlistRSQL(){
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
		query.append("FileName : ConsultationSlipRequestMgtDBDAOCSRSOlistRSQL").append("\n"); 
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
		query.append("SELECT A.AFT_ACT_FLG" ).append("\n"); 
		query.append(", CASE" ).append("\n"); 
		query.append("WHEN T.INV_STS_CD  ='C'" ).append("\n"); 
		query.append("THEN 0" ).append("\n"); 
		query.append("WHEN T.INV_STS_CD  ='R' OR T.INV_STS_CD  ='J' OR T.INV_STS_CD  ='B' OR T.INV_STS_CD  ='G'" ).append("\n"); 
		query.append("THEN 1" ).append("\n"); 
		query.append("ELSE 0" ).append("\n"); 
		query.append("END CHK" ).append("\n"); 
		query.append(", CASE" ).append("\n"); 
		query.append("WHEN T.INV_STS_CD  ='B' OR T.INV_STS_CD  ='G'" ).append("\n"); 
		query.append("THEN 'Y'" ).append("\n"); 
		query.append("ELSE 'N'" ).append("\n"); 
		query.append("END TML_INV_RJCT_STS_CD" ).append("\n"); 
		query.append(", T.INV_NO" ).append("\n"); 
		query.append(", NVL(T.INV_NET_AMT ,0) TTL_INV_AMT" ).append("\n"); 
		query.append(", NVL(T.INV_VAT_AMT ,0) VAT_AMT" ).append("\n"); 
		query.append(", NVL(T.WHLD_TAX_AMT,0) WHLD_TAX_AMT" ).append("\n"); 
		query.append(", NVL(T.INV_NET_AMT , 0) + NVL(T.INV_VAT_AMT , 0) - NVL(T.WHLD_TAX_AMT, 0) TOTAL_AMT" ).append("\n"); 
		query.append(", TO_CHAR(T.INV_ISS_DT,'YYYY-MM-DD') ISS_DT" ).append("\n"); 
		query.append(", TO_CHAR(T.INV_RCV_DT,'YYYY-MM-DD') RCV_DT" ).append("\n"); 
		query.append(", TO_CHAR(T.INV_CFM_DT,'YYYY-MM-DD') INV_CFM_DT" ).append("\n"); 
		query.append(", T.CSR_NO AS CSR_NO" ).append("\n"); 
		query.append(", T.INV_RGST_NO AS INV_RGST_NO" ).append("\n"); 
		query.append(", TO_CHAR(TO_DATE(A.GL_DT, 'YYYY-MM-DD'), 'YYYY-MM-DD') GL_DT" ).append("\n"); 
		query.append(", T.INV_STS_CD" ).append("\n"); 
		query.append("FROM   AP_PAY_INV T" ).append("\n"); 
		query.append(", AP_INV_HDR A" ).append("\n"); 
		query.append("WHERE  T.CSR_NO     = A.CSR_NO" ).append("\n"); 
		query.append("AND T.CSR_NO      = @[csr_no]" ).append("\n"); 
		query.append("AND NVL(T.DELT_FLG,'N') <> 'Y'" ).append("\n"); 

	}
}