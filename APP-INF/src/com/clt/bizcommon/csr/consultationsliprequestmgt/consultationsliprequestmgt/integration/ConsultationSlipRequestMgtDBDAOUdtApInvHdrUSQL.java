/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOUdtApInvHdrUSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.03
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.09.03 함대성
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author HAM DAE SUNG
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ConsultationSlipRequestMgtDBDAOUdtApInvHdrUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOUdtApInvHdrUSQL(){
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
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration ").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOUdtApInvHdrUSQL").append("\n"); 
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
		query.append("UPDATE AP_INV_HDR" ).append("\n"); 
		query.append("SET    INV_DESC =" ).append("\n"); 
		query.append("( SELECT" ).append("\n"); 
		query.append("(SELECT M.ACCT_ENG_NM" ).append("\n"); 
		query.append("FROM    MDM_ACCOUNT M" ).append("\n"); 
		query.append("WHERE   M.ACCT_CD = A.DTRB_COA_ACCT_CD" ).append("\n"); 
		query.append(") MAX_ACCT_NM" ).append("\n"); 
		query.append("FROM" ).append("\n"); 
		query.append("( SELECT  SUM(INV_AMT) SUM_AMT," ).append("\n"); 
		query.append("DTRB_COA_ACCT_CD" ).append("\n"); 
		query.append("FROM     AP_INV_DTRB D" ).append("\n"); 
		query.append("WHERE    D.CSR_NO = @[csr_no]" ).append("\n"); 
		query.append("GROUP BY D.DTRB_COA_CO_CD      ," ).append("\n"); 
		query.append("D.DTRB_COA_RGN_CD     ," ).append("\n"); 
		query.append("D.DTRB_COA_CTR_CD     ," ).append("\n"); 
		query.append("D.DTRB_COA_ACCT_CD    ," ).append("\n"); 
		query.append("D.DTRB_COA_INTER_CO_CD," ).append("\n"); 
		query.append("D.DTRB_COA_VVD_CD     ," ).append("\n"); 
		query.append("D.INV_DESC            ," ).append("\n"); 
		query.append("D.ATTR_CTNT3          ," ).append("\n"); 
		query.append("D.ATTR_CTNT1          ," ).append("\n"); 
		query.append("D.LINE_NO" ).append("\n"); 
		query.append("ORDER BY SUM_AMT DESC" ).append("\n"); 
		query.append(") A" ).append("\n"); 
		query.append("WHERE   ROWNUM = 1" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("WHERE  CSR_NO = @[csr_no]" ).append("\n"); 

	}
}