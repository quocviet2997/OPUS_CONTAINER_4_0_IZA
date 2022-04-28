/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOModifyActivity2USQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2015.08.18
*@LastModifier : 
*@LastVersion : 1.0
* 2015.08.18 
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

public class ConsultationSlipRequestMgtDBDAOModifyActivity2USQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Activity Date / Place 수정
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOModifyActivity2USQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("line_seq",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOModifyActivity2USQL").append("\n"); 
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
		query.append("UPDATE AP_INV_DTRB" ).append("\n"); 
		query.append("SET ATTR_CTNT11 = (SELECT MAX(ATTR_CTNT11) FROM AP_INV_DTRB WHERE CSR_NO = @[csr_no] AND ATTR_CTNT11 IS NOT NULL)" ).append("\n"); 
		query.append(",   ATTR_CTNT12 = (SELECT MAX(ATTR_CTNT12) FROM AP_INV_DTRB WHERE CSR_NO = @[csr_no] AND ATTR_CTNT12 IS NOT NULL)" ).append("\n"); 
		query.append(",   ATTR_CTNT14 = (SELECT MAX(ATTR_CTNT14) FROM AP_INV_DTRB WHERE CSR_NO = @[csr_no] AND ATTR_CTNT14 IS NOT NULL)" ).append("\n"); 
		query.append("WHERE CSR_NO = @[csr_no]" ).append("\n"); 
		query.append("  AND LINE_SEQ = @[line_seq]" ).append("\n"); 

	}
}