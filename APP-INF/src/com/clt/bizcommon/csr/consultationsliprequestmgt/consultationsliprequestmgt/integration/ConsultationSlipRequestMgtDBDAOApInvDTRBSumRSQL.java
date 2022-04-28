/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOApInvDTRBSumRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.17
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.09.17 함대성
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

public class ConsultationSlipRequestMgtDBDAOApInvDTRBSumRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOApInvDTRBSumRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("vndr_seq",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("inv_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOApInvDTRBSumRSQL").append("\n"); 
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
		query.append("SELECT ATTR_CTNT1" ).append("\n"); 
		query.append(", FTU_USE_CTNT1 AS COST_CD" ).append("\n"); 
		query.append(", CNTR_TPSZ_CD" ).append("\n"); 
		query.append(", GAP" ).append("\n"); 
		query.append("FROM" ).append("\n"); 
		query.append("( SELECT A.ATTR_CTNT1" ).append("\n"); 
		query.append(", A.FTU_USE_CTNT1" ).append("\n"); 
		query.append(", A.CNTR_TPSZ_CD" ).append("\n"); 
		query.append(", NVL(CSR_AMT,0) - NVL(DTRB,0) GAP" ).append("\n"); 
		query.append("FROM" ).append("\n"); 
		query.append("( SELECT  ATTR_CTNT1" ).append("\n"); 
		query.append(", FTU_USE_CTNT1" ).append("\n"); 
		query.append(", CNTR_TPSZ_CD" ).append("\n"); 
		query.append(", SUM(INV_AMT) DTRB" ).append("\n"); 
		query.append("FROM     AP_INV_DTRB" ).append("\n"); 
		query.append("WHERE    CSR_NO               = @[csr_no]" ).append("\n"); 
		query.append("AND ATTR_CTNT1           = @[inv_no]" ).append("\n"); 
		query.append("AND NVL(INV_AMT,0)      <> 0" ).append("\n"); 
		query.append("AND NVL(ATTR_CTNT15,'N') = 'A' ---- 추가(20071018)" ).append("\n"); 
		query.append("GROUP BY ATTR_CTNT1" ).append("\n"); 
		query.append(", FTU_USE_CTNT1" ).append("\n"); 
		query.append(", CNTR_TPSZ_CD" ).append("\n"); 
		query.append(") A" ).append("\n"); 
		query.append(", ( SELECT  H.INV_NO" ).append("\n"); 
		query.append(", D.LGS_COST_CD" ).append("\n"); 
		query.append(", D.CNTR_TPSZ_CD" ).append("\n"); 
		query.append(", SUM(D.INV_AMT) CSR_AMT" ).append("\n"); 
		query.append("FROM     AP_PAY_INV H" ).append("\n"); 
		query.append(", AP_PAY_INV_DTL D" ).append("\n"); 
		query.append("WHERE    H.INV_NO                = @[inv_no]" ).append("\n"); 
		query.append("AND H.VNDR_SEQ              = @[vndr_seq]" ).append("\n"); 
		query.append("AND H.INV_STS_CD        = 'C'" ).append("\n"); 
		query.append("AND NVL(H.DELT_FLG,'N')    <> 'Y'" ).append("\n"); 
		query.append("AND NVL(D.INV_AMT,0)       <> 0" ).append("\n"); 
		query.append("AND H.inv_rgst_no = D.inv_rgst_no" ).append("\n"); 
		query.append("GROUP BY H.INV_NO" ).append("\n"); 
		query.append(", D.LGS_COST_CD" ).append("\n"); 
		query.append(", D.CNTR_TPSZ_CD" ).append("\n"); 
		query.append(") S" ).append("\n"); 
		query.append("WHERE   A.ATTR_CTNT1            = S.INV_NO" ).append("\n"); 
		query.append("AND A.FTU_USE_CTNT1         = S.LGS_COST_CD" ).append("\n"); 
		query.append("AND NVL(A.CNTR_TPSZ_CD,'N') = NVL(S.CNTR_TPSZ_CD,'N')" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("WHERE  NVL(GAP,0) <> 0" ).append("\n"); 

	}
}