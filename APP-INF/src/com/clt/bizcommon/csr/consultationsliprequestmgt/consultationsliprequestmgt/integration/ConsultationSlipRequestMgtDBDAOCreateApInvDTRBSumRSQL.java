/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOCreateApInvDTRBSumRSQL.java
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

public class ConsultationSlipRequestMgtDBDAOCreateApInvDTRBSumRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOCreateApInvDTRBSumRSQL(){
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
		query.append("FileName : ConsultationSlipRequestMgtDBDAOCreateApInvDTRBSumRSQL").append("\n"); 
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
		query.append("SELECT ATTR_CTNT1 ," ).append("\n"); 
		query.append("		  FTU_USE_CTNT1  ," ).append("\n"); 
		query.append("		  CNTR_TPSZ_CD ," ).append("\n"); 
		query.append("		  GAP" ).append("\n"); 
		query.append("		FROM (" ).append("\n"); 
		query.append("		    SELECT A.ATTR_CTNT1 ," ).append("\n"); 
		query.append("		      NVL(A.FTU_USE_CTNT1 ,'XXXXXX') FTU_USE_CTNT1," ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("		      A.CNTR_TPSZ_CD ," ).append("\n"); 
		query.append("		      NVL(CSR_AMT, 0) - NVL(DTRB, 0) GAP" ).append("\n"); 
		query.append("		    FROM (" ).append("\n"); 
		query.append("		        SELECT ATTR_CTNT1 ," ).append("\n"); 
		query.append("		          NVL(FTU_USE_CTNT1 , 'XXXXXX') FTU_USE_CTNT1," ).append("\n"); 
		query.append("		          DTRB_COA_ACCT_CD," ).append("\n"); 
		query.append("		          NVL(CNTR_TPSZ_CD, 'XX') CNTR_TPSZ_CD ," ).append("\n"); 
		query.append("		          SUM(INV_AMT) DTRB" ).append("\n"); 
		query.append("		        FROM AP_INV_DTRB" ).append("\n"); 
		query.append("		        WHERE CSR_NO = @[csr_no]" ).append("\n"); 
		query.append("		          AND ATTR_CTNT1 = @[inv_no]" ).append("\n"); 
		query.append("		          AND NVL(INV_AMT, 0) <> 0 " ).append("\n"); 
		query.append("				  AND DTRB_COA_ACCT_CD IN (SELECT ACCT_CD FROM MDM_ACCOUNT WHERE ACCT_CD LIKE COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','OPER_EXP')||'%' AND DELT_FLG = 'N')" ).append("\n"); 
		query.append("		        GROUP BY ATTR_CTNT1 , NVL(FTU_USE_CTNT1 , 'XXXXXX'), DTRB_COA_ACCT_CD, NVL(CNTR_TPSZ_CD, 'XX') ) A ," ).append("\n"); 
		query.append("		      (" ).append("\n"); 
		query.append("		        SELECT H.INV_NO ," ).append("\n"); 
		query.append("				  NVL(D.LGS_COST_CD, 'XXXXXX') 	LGS_COST_CD	," ).append("\n"); 
		query.append("				  D.ACCT_CD," ).append("\n"); 
		query.append("		          NVL(D.CNTR_TPSZ_CD, 'XX') CNTR_TPSZ_CD," ).append("\n"); 
		query.append("		          SUM(D.INV_AMT) CSR_AMT" ).append("\n"); 
		query.append("		        FROM AP_PAY_INV H ," ).append("\n"); 
		query.append("		          AP_PAY_INV_DTL D" ).append("\n"); 
		query.append("		        WHERE H.INV_NO = @[inv_no]" ).append("\n"); 
		query.append("		          AND H.VNDR_SEQ = @[vndr_seq]" ).append("\n"); 
		query.append("		          AND H.INV_STS_CD = 'C'" ).append("\n"); 
		query.append("		          AND NVL(H.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("		          AND NVL(D.INV_AMT, 0) <> 0 AND D.ACCT_CD IN (SELECT ACCT_CD FROM MDM_ACCOUNT WHERE ACCT_CD LIKE COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','OPER_EXP')||'%' AND DELT_FLG = 'N')" ).append("\n"); 
		query.append("		          AND H.inv_rgst_no = D.inv_rgst_no" ).append("\n"); 
		query.append("		        GROUP BY H.INV_NO , NVL(D.LGS_COST_CD, 'XXXXXX'), D.ACCT_CD, NVL(D.CNTR_TPSZ_CD, 'XX') ) S" ).append("\n"); 
		query.append("		    WHERE A.ATTR_CTNT1 = S.INV_NO" ).append("\n"); 
		query.append("		      AND A.FTU_USE_CTNT1 = S.LGS_COST_CD" ).append("\n"); 
		query.append("		      AND NVL(A.CNTR_TPSZ_CD, 'N') = NVL(S.CNTR_TPSZ_CD, 'N') )" ).append("\n"); 
		query.append("		WHERE NVL(GAP, 0) <> 0" ).append("\n"); 

	}
}