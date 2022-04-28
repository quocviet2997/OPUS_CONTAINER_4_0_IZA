/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOModifyApInvDTRBLineNoUpdate03RSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.01.29
*@LastModifier : 
*@LastVersion : 1.0
* 2018.01.29 
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

public class ConsultationSlipRequestMgtDBDAOModifyApInvDTRBLineNoUpdate03RSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOModifyApInvDTRBLineNoUpdate03RSQL(){
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
		query.append("FileName : ConsultationSlipRequestMgtDBDAOModifyApInvDTRBLineNoUpdate03RSQL").append("\n"); 
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
		query.append("SELECT	ATTR_CTNT1, DTRB_COA_ACCT_CD, DTRB_COA_VVD_CD, ACT_YM, ROWNUM LINE_NO" ).append("\n"); 
		query.append("        , ACT_VVD_CD, ATTR_CTNT7, ATTR_CTNT10, ATTR_CTNT13" ).append("\n"); 
		query.append("FROM	(" ).append("\n"); 
		query.append("		SELECT DISTINCT ATTR_CTNT1, DTRB_COA_ACCT_CD, DTRB_COA_VVD_CD" ).append("\n"); 
		query.append("				, SUBSTR(NVL(ATTR_CTNT11, TO_CHAR(TO_DATE(ATTR_CTNT2, 'YYYY/MM/DD HH24:MI:SS'), 'YYYYMMDD')), 1, 6) AS ACT_YM" ).append("\n"); 
		query.append("                , ACT_VVD_CD, ATTR_CTNT7, ATTR_CTNT10, ATTR_CTNT13" ).append("\n"); 
		query.append("		FROM	AP_INV_DTRB" ).append("\n"); 
		query.append("		WHERE	CSR_NO	= @[csr_no]" ).append("\n"); 
		query.append("		ORDER BY ATTR_CTNT1, DTRB_COA_VVD_CD DESC, DTRB_COA_ACCT_CD, SUBSTR(NVL(ATTR_CTNT11, TO_CHAR(TO_DATE(ATTR_CTNT2,'YYYY/MM/DD HH24:MI:SS'),'YYYYMMDD')), 1, 6)" ).append("\n"); 
		query.append("                 , ACT_VVD_CD, ATTR_CTNT7, ATTR_CTNT10, ATTR_CTNT13" ).append("\n"); 
		query.append("		)" ).append("\n"); 

	}
}