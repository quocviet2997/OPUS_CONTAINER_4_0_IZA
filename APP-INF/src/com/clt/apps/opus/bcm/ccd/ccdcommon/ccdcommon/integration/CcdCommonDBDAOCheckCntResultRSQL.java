/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : CcdCommonDBDAOCheckCntResultRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.11.13
*@LastModifier : 
*@LastVersion : 1.0
* 2018.11.13 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.ccd.ccdcommon.ccdcommon.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CcdCommonDBDAOCheckCntResultRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * DESC Enter..
	  * </pre>
	  */
	public CcdCommonDBDAOCheckCntResultRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cust_grp_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cust_cnt_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.ccd.ccdcommon.ccdcommon.integration").append("\n"); 
		query.append("FileName : CcdCommonDBDAOCheckCntResultRSQL").append("\n"); 
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
		query.append("SELECT NVL(A.GLOB_CT,0)||'#'||" ).append("\n"); 
		query.append("       CASE WHEN LENGTH(B.RLOB_CT) >= 1 THEN 1" ).append("\n"); 
		query.append("       ELSE 0" ).append("\n"); 
		query.append("       END||'#'||NVL(B.CNT_CT,0)||'#'||NVL(B.INDIV_CT,0) AS GLOB_CNT_CT" ).append("\n"); 
		query.append("FROM (SELECT COUNT(CUST_GRP_HRCHY_CD) GLOB_CT, 'SAM' AA FROM MDM_CUSTOMER WHERE CUST_GRP_ID = @[cust_grp_id] AND CUST_GRP_HRCHY_CD = 'G') A" ).append("\n"); 
		query.append("    ,(SELECT (SELECT  ZZ.OFC_CD" ).append("\n"); 
		query.append("                      FROM MDM_ORGANIZATION ZZ, ( SELECT  OFC_CD" ).append("\n"); 
		query.append("                                              FROM MDM_ORGANIZATION" ).append("\n"); 
		query.append("                                              WHERE OFC_CD IN " ).append("\n"); 
		query.append("                                                 (SELECT DISTINCT PRNT_OFC_CD" ).append("\n"); 
		query.append("                                                  FROM MDM_ORGANIZATION " ).append("\n"); 
		query.append("                                                  WHERE LOC_CD IN (" ).append("\n"); 
		query.append("                                                                   SELECT LOC_CD" ).append("\n"); 
		query.append("                                                                   FROM MDM_LOCATION" ).append("\n"); 
		query.append("                                                                   WHERE CNT_CD IN (SELECT CUST_CNT_CD " ).append("\n"); 
		query.append("                                                                                    FROM MDM_CUSTOMER " ).append("\n"); 
		query.append("                                                                                    WHERE CUST_GRP_ID = @[cust_grp_id] " ).append("\n"); 
		query.append("                                                                                    AND CUST_GRP_HRCHY_CD = 'R'" ).append("\n"); 
		query.append("                                                                                   )" ).append("\n"); 
		query.append("                                                                  )" ).append("\n"); 
		query.append("                                                 )" ).append("\n"); 
		query.append("                                               AND OFC_KND_CD IN ('2')) XX" ).append("\n"); 
		query.append("                      WHERE ZZ.OFC_CD IN " ).append("\n"); 
		query.append("                         (SELECT DISTINCT PRNT_OFC_CD" ).append("\n"); 
		query.append("                          FROM MDM_ORGANIZATION " ).append("\n"); 
		query.append("                          WHERE LOC_CD IN (" ).append("\n"); 
		query.append("                                           SELECT LOC_CD" ).append("\n"); 
		query.append("                                           FROM MDM_LOCATION" ).append("\n"); 
		query.append("                                           WHERE CNT_CD IN (SELECT CUST_CNT_CD " ).append("\n"); 
		query.append("                                                            FROM MDM_CUSTOMER " ).append("\n"); 
		query.append("                                                            WHERE CUST_GRP_ID = @[cust_grp_id] " ).append("\n"); 
		query.append("                                                            AND CNT_CD = @[cust_cnt_cd]" ).append("\n"); 
		query.append("                                                           )" ).append("\n"); 
		query.append("                                          )" ).append("\n"); 
		query.append("                         )" ).append("\n"); 
		query.append("                       AND OFC_KND_CD IN ('2')" ).append("\n"); 
		query.append("                       AND ZZ.OFC_CD = XX.OFC_CD) AS RLOB_CT" ).append("\n"); 
		query.append("            ,SUM(DECODE(CUST_GRP_HRCHY_CD, 'C', 1, 0)) CNT_CT" ).append("\n"); 
		query.append("            ,SUM(DECODE(CUST_GRP_HRCHY_CD, 'I', 1, 0)) INDIV_CT" ).append("\n"); 
		query.append("            , 'SAM' AA" ).append("\n"); 
		query.append("      FROM MDM_CUSTOMER" ).append("\n"); 
		query.append("      WHERE CUST_GRP_ID = @[cust_grp_id] " ).append("\n"); 
		query.append("        AND CUST_CNT_CD = @[cust_cnt_cd]" ).append("\n"); 
		query.append(" 	  GROUP BY CUST_GRP_ID" ).append("\n"); 
		query.append("         	,CUST_CNT_CD) B" ).append("\n"); 
		query.append("WHERE A.AA = B.AA(+)" ).append("\n"); 

	}
}