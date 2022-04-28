/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOAsaNoRSQL.java
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

public class ConsultationSlipRequestMgtDBDAOAsaNoRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOAsaNoRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("inv_ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOAsaNoRSQL").append("\n"); 
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
		query.append("SELECT ASA_NO CODE ," ).append("\n"); 
		query.append("      ASA_NO || ' ' || CURR_CD || ' (' || ASA_PRD_FM_DT || '~' || ASA_PRD_TO_DT || ')' NAME" ).append("\n"); 
		query.append("    FROM (" ).append("\n"); 
		query.append("        SELECT ASA_NO ," ).append("\n"); 
		query.append("          CURR_CD," ).append("\n"); 
		query.append("          TO_CHAR(TO_DATE(ASA_PRD_FM_DT, 'YYYY-MM-DD'), 'YYYY-MM-DD') ASA_PRD_FM_DT," ).append("\n"); 
		query.append("          TO_CHAR(TO_DATE(ASA_PRD_TO_DT, 'YYYY-MM-DD'), 'YYYY-MM-DD') ASA_PRD_TO_DT" ).append("\n"); 
		query.append("        FROM SAR_ASA_MST" ).append("\n"); 
		query.append("        WHERE 1=1" ).append("\n"); 
		query.append("--          AND EXPN_EFF_DT IS NULL" ).append("\n"); 
		query.append("--          AND AC_EFF_DT IS NULL" ).append("\n"); 
		query.append("          AND ASA_FSH_DT IS NULL" ).append("\n"); 
		query.append("          AND ASA_APRO_DT IS NULL" ).append("\n"); 
		query.append("--          AND NVL(DELT_FLG, 'N') = 'N'" ).append("\n"); 
		query.append("          AND OFC_CD IN (" ).append("\n"); 
		query.append("            SELECT AR_OFC_CD" ).append("\n"); 
		query.append("            FROM MDM_ORGANIZATION" ).append("\n"); 
		query.append("            WHERE OFC_CD = @[inv_ofc_cd]) )" ).append("\n"); 

	}
}