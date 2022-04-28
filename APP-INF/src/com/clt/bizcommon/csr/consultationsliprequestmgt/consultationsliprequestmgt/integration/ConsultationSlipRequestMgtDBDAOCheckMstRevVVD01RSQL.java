/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOCheckMstRevVVD01RSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.08.02
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2010.08.02 함대성
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

public class ConsultationSlipRequestMgtDBDAOCheckMstRevVVD01RSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOCheckMstRevVVD01RSQL(){
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
		query.append("FileName : ConsultationSlipRequestMgtDBDAOCheckMstRevVVD01RSQL").append("\n"); 
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
		query.append("SELECT D.ATTR_CTNT1," ).append("\n"); 
		query.append("D.DTRB_COA_VVD_CD," ).append("\n"); 
		query.append("D.DTRB_COA_ACCT_CD" ).append("\n"); 
		query.append("FROM AP_INV_HDR H," ).append("\n"); 
		query.append("AP_INV_DTRB D" ).append("\n"); 
		query.append("WHERE H.CSR_NO = D.CSR_NO" ).append("\n"); 
		query.append("AND D.CSR_NO = @[csr_no]" ).append("\n"); 
		query.append("GROUP BY D.ATTR_CTNT1, D.DTRB_COA_VVD_CD, D.DTRB_COA_ACCT_CD" ).append("\n"); 
		query.append("ORDER BY D.ATTR_CTNT1, D.DTRB_COA_VVD_CD, D.DTRB_COA_ACCT_CD" ).append("\n"); 

	}
}