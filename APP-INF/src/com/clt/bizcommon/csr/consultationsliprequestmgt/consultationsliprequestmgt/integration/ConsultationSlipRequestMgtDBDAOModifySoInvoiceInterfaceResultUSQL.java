/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOModifySoInvoiceInterfaceResultUSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.07.07
*@LastModifier : 
*@LastVersion : 1.0
* 2016.07.07 
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

public class ConsultationSlipRequestMgtDBDAOModifySoInvoiceInterfaceResultUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * ConsultationSlipRequestMgtDBDAOModifySoInvoiceInterfaceResultUSQL
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOModifySoInvoiceInterfaceResultUSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("if_err_rsn",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOModifySoInvoiceInterfaceResultUSQL").append("\n"); 
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
		query.append("UPDATE  AP_INV_HDR AIH " ).append("\n"); 
		query.append("SET     AIH.IF_FLG = 'E'" ).append("\n"); 
		query.append("      , AIH.IF_DT = SYSDATE" ).append("\n"); 
		query.append("      , AIH.IF_ERR_RSN = @[if_err_rsn]" ).append("\n"); 
		query.append("      , AIH.APRO_FLG = 'Y'" ).append("\n"); 
		query.append("WHERE   AIH.CSR_NO = @[csr_no]" ).append("\n"); 

	}
}