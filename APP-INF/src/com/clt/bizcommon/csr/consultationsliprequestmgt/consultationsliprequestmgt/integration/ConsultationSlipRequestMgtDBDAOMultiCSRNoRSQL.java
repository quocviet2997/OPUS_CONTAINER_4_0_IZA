/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOMultiCSRNoRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2014.10.10
*@LastModifier : 
*@LastVersion : 1.0
* 2014.10.10 
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

public class ConsultationSlipRequestMgtDBDAOMultiCSRNoRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOMultiCSRNoRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("inv_sub_sys_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_tp_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOMultiCSRNoRSQL").append("\n"); 
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
		query.append("SELECT DECODE(@[inv_sub_sys_cd], 'AGT', '08', '05')" ).append("\n"); 
		query.append("       ||@[csr_tp_cd]" ).append("\n"); 
		query.append("       ||" ).append("\n"); 
		query.append("       (SELECT AP_OFC_CD" ).append("\n"); 
		query.append("       FROM    MDM_ORGANIZATION" ).append("\n"); 
		query.append("       WHERE   OFC_CD = @[ofc_cd]" ).append("\n"); 
		query.append("       )" ).append("\n"); 
		query.append("      ||" ).append("\n"); 
		query.append("       (SELECT TO_CHAR(GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[ofc_cd]),'YYMM')" ).append("\n"); 
		query.append("          FROM DUAL" ).append("\n"); 
		query.append("       )" ).append("\n"); 
		query.append("      ||" ).append("\n"); 
		query.append("       (SELECT LPAD(NVL(MAX(SUBSTR(csr_no,13,16)),0)+1,4, '0')" ).append("\n"); 
		query.append("   FROM ap_csr_no" ).append("\n"); 
		query.append("  WHERE SUBSTR(csr_no,1,LENGTH(csr_no)-4) = " ).append("\n"); 
		query.append("                       DECODE(@[inv_sub_sys_cd], 'AGT', '08', '05')" ).append("\n"); 
		query.append("                       ||@[csr_tp_cd]" ).append("\n"); 
		query.append("                       ||" ).append("\n"); 
		query.append("       					(SELECT AP_OFC_CD" ).append("\n"); 
		query.append("       					   FROM    MDM_ORGANIZATION" ).append("\n"); 
		query.append("       					  WHERE   OFC_CD = @[ofc_cd]" ).append("\n"); 
		query.append("       					)" ).append("\n"); 
		query.append("                       ||" ).append("\n"); 
		query.append("               			(SELECT TO_CHAR(GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[ofc_cd]),'YYMM')" ).append("\n"); 
		query.append("              		       FROM    DUAL" ).append("\n"); 
		query.append("               			)" ).append("\n"); 
		query.append("       ) csr_no" ).append("\n"); 
		query.append("FROM   DUAL" ).append("\n"); 

	}
}