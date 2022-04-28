/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAODtrbListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.18
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.11.18 함대성
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

public class ConsultationSlipRequestMgtDBDAODtrbListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAODtrbListRSQL(){
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
		query.append("FileName : ConsultationSlipRequestMgtDBDAODtrbListRSQL").append("\n"); 
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
		query.append("SELECT Chart_of_Account pre_chart_of_account" ).append("\n"); 
		query.append(", Account_Name pre_account_name" ).append("\n"); 
		query.append(", GL_Date pre_gl_date" ).append("\n"); 
		query.append(", City pre_city" ).append("\n"); 
		query.append(", Invoice_NO pre_inv_no" ).append("\n"); 
		query.append(", Description pre_desc" ).append("\n"); 
		query.append(", Debit pre_debit" ).append("\n"); 
		query.append(", Credit pre_credit" ).append("\n"); 
		query.append(", pre_debit2" ).append("\n"); 
		query.append(", pre_credit2" ).append("\n"); 
		query.append("FROM" ).append("\n"); 
		query.append("( SELECT  Chart_of_Account" ).append("\n"); 
		query.append(", Account_Name" ).append("\n"); 
		query.append(", GL_Date" ).append("\n"); 
		query.append(", City" ).append("\n"); 
		query.append(", Invoice_NO" ).append("\n"); 
		query.append(", Description" ).append("\n"); 
		query.append(", Debit" ).append("\n"); 
		query.append(", Credit" ).append("\n"); 
		query.append(", Debit2 pre_debit2" ).append("\n"); 
		query.append(", Credit2 pre_credit2" ).append("\n"); 
		query.append("FROM" ).append("\n"); 
		query.append("( SELECT  D.DTRB_COA_CO_CD" ).append("\n"); 
		query.append("||'.'" ).append("\n"); 
		query.append("||D.DTRB_COA_RGN_CD" ).append("\n"); 
		query.append("||'.'" ).append("\n"); 
		query.append("||D.DTRB_COA_CTR_CD" ).append("\n"); 
		query.append("||'.'" ).append("\n"); 
		query.append("||D.DTRB_COA_ACCT_CD" ).append("\n"); 
		query.append("||'.'" ).append("\n"); 
		query.append("|| D.DTRB_COA_INTER_CO_CD" ).append("\n"); 
		query.append("||'.'" ).append("\n"); 
		query.append("||D.DTRB_COA_VVD_CD Chart_of_Account" ).append("\n"); 
		query.append(", (SELECT ACCT_ENG_NM" ).append("\n"); 
		query.append("FROM    MDM_ACCOUNT" ).append("\n"); 
		query.append("WHERE   ACCT_CD = D.DTRB_COA_ACCT_CD" ).append("\n"); 
		query.append(") Account_Name" ).append("\n"); 
		query.append(", SUBSTR(H.GL_DT,1,4)" ).append("\n"); 
		query.append("||'/'" ).append("\n"); 
		query.append("||SUBSTR(H.GL_DT,5,2)" ).append("\n"); 
		query.append("||'/'" ).append("\n"); 
		query.append("||SUBSTR(H.GL_DT,7,2) GL_Date" ).append("\n"); 
		query.append(", D.ATTR_CTNT3 City" ).append("\n"); 
		query.append(", D.ATTR_CTNT1 Invoice_NO" ).append("\n"); 
		query.append(", D.INV_DESC Description" ).append("\n"); 
		query.append(", TO_CHAR(ROUND(SUM(D.INV_AMT),2)) Debit" ).append("\n"); 
		query.append(", '' Credit" ).append("\n"); 
		query.append(", TO_CHAR(ROUND(SUM(D.INV_AMT),2)) Debit2" ).append("\n"); 
		query.append(", '' Credit2" ).append("\n"); 
		query.append(", D.LINE_NO NO" ).append("\n"); 
		query.append(", D.LINE_SEQ" ).append("\n"); 
		query.append("FROM     AP_INV_HDR H" ).append("\n"); 
		query.append(", AP_INV_DTRB D" ).append("\n"); 
		query.append("WHERE    H.CSR_NO = @[csr_no]" ).append("\n"); 
		query.append("AND H.CSR_NO = D.CSR_NO" ).append("\n"); 
		query.append("GROUP BY D.DTRB_COA_CO_CD" ).append("\n"); 
		query.append(", D.DTRB_COA_RGN_CD" ).append("\n"); 
		query.append(", D.DTRB_COA_CTR_CD" ).append("\n"); 
		query.append(", D.DTRB_COA_ACCT_CD" ).append("\n"); 
		query.append(", D.DTRB_COA_INTER_CO_CD" ).append("\n"); 
		query.append(", D.DTRB_COA_VVD_CD" ).append("\n"); 
		query.append(", D.INV_DESC" ).append("\n"); 
		query.append(", H.GL_DT" ).append("\n"); 
		query.append(", D.ATTR_CTNT3" ).append("\n"); 
		query.append(", D.ATTR_CTNT1" ).append("\n"); 
		query.append(", D.LINE_NO" ).append("\n"); 
		query.append(", D.LINE_SEQ" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("ORDER BY NO ASC" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("UNION ALL" ).append("\n"); 
		query.append("SELECT COA_CO_CD" ).append("\n"); 
		query.append("||'.'" ).append("\n"); 
		query.append("||COA_RGN_CD" ).append("\n"); 
		query.append("||'.'" ).append("\n"); 
		query.append("||COA_CTR_CD" ).append("\n"); 
		query.append("||'.'" ).append("\n"); 
		query.append("||COA_ACCT_CD" ).append("\n"); 
		query.append("||'.'" ).append("\n"); 
		query.append("|| COA_INTER_CO_CD" ).append("\n"); 
		query.append("||'.'" ).append("\n"); 
		query.append("||COA_VVD_CD Chart_of_Account" ).append("\n"); 
		query.append(", ( SELECT ACCT_ENG_NM" ).append("\n"); 
		query.append("FROM    MDM_ACCOUNT" ).append("\n"); 
		query.append("WHERE   ACCT_CD = COA_ACCT_CD" ).append("\n"); 
		query.append(") Account_Name" ).append("\n"); 
		query.append(", SUBSTR(GL_DT,1,4)" ).append("\n"); 
		query.append("||'/'" ).append("\n"); 
		query.append("||SUBSTR(GL_DT,5,2)" ).append("\n"); 
		query.append("||'/'" ).append("\n"); 
		query.append("||SUBSTR(GL_DT,7,2) GL_Date" ).append("\n"); 
		query.append(", '' City" ).append("\n"); 
		query.append(", '' Invoice_NO" ).append("\n"); 
		query.append(", INV_DESC Description" ).append("\n"); 
		query.append(", '' Debit" ).append("\n"); 
		query.append(", TO_CHAR(ROUND(H.CSR_AMT,2)) Credit" ).append("\n"); 
		query.append(", '' Debit2" ).append("\n"); 
		query.append(", TO_CHAR(ROUND(H.CSR_AMT,2)) Credit2" ).append("\n"); 
		query.append("FROM   AP_INV_HDR H" ).append("\n"); 
		query.append("WHERE  H.CSR_NO = @[csr_no]" ).append("\n"); 

	}
}