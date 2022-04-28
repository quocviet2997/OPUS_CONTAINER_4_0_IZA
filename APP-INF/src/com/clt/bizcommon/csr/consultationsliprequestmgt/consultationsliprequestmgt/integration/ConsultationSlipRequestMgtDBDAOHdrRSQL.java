/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOHdrRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.03.16
*@LastModifier : 
*@LastVersion : 1.0
* 2018.03.16 
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

public class ConsultationSlipRequestMgtDBDAOHdrRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOHdrRSQL(){
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
		query.append("FileName : ConsultationSlipRequestMgtDBDAOHdrRSQL").append("\n"); 
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
		query.append("SELECT CSR_NO PRE_CSR_NO" ).append("\n"); 
		query.append("     , '' PRE_OFFICE" ).append("\n"); 
		query.append("     , ATTR_CTNT10 PRE_PRPD_DY" ).append("\n"); 
		query.append("     , (SELECT SUBSTRB(MV.VNDR_LGL_ENG_NM, 1, 37) || ' ('|| LPAD(TO_CHAR(MV.VNDR_SEQ),6, '0') || ')'" ).append("\n"); 
		query.append("       FROM    MDM_VENDOR MV, MDM_ORGANIZATION MO, MDM_LOCATION ML" ).append("\n"); 
		query.append("       WHERE   MV.VNDR_SEQ = VNDR_NO" ).append("\n"); 
		query.append("         AND   MV.OFC_CD = MO.OFC_CD(+)" ).append("\n"); 
		query.append("         AND   MO.LOC_CD = ML.LOC_CD(+)" ).append("\n"); 
		query.append("       ) PRE_PAY_TO" ).append("\n"); 
		query.append("     , CSR_TP_CD PRE_CSR_TYPE" ).append("\n"); 
		query.append("     , INV_DESC PRE_DESC" ).append("\n"); 
		query.append("     , PAY_GRP_LU_CD PRE_PAY_GROUP" ).append("\n"); 
		query.append("     , ATTR_CATE_NM PRE_EVI_TP" ).append("\n"); 
		query.append("     , SUBSTR(H.INV_TERM_DT, 1, 4) ||'/' ||SUBSTR(H.INV_TERM_DT, 5, 2) ||'/' ||SUBSTR(H.INV_TERM_DT, 7, 2)  PRE_DUE_DATE" ).append("\n"); 
		query.append("     , CASE" ).append("\n"); 
		query.append("              WHEN" ).append("\n"); 
		query.append("                     (" ).append("\n"); 
		query.append("                            CSR_AMT = 0" ).append("\n"); 
		query.append("                        AND ATTR_CTNT2 IS NOT NULL" ).append("\n"); 
		query.append("                     )" ).append("\n"); 
		query.append("              THEN SUBSTR(ATTR_CTNT2,1,3)" ).append("\n"); 
		query.append("                            ||SUBSTR(ATTR_CTNT2,8,3)" ).append("\n"); 
		query.append("                            ||SUBSTR(ATTR_CTNT2,4,4)" ).append("\n"); 
		query.append("       END AS PRE_ASA_NO" ).append("\n"); 
		query.append("     , SUBSTR(INV_DT,1,4)" ).append("\n"); 
		query.append("              ||'/'" ).append("\n"); 
		query.append("              ||SUBSTR(INV_DT,5,2)" ).append("\n"); 
		query.append("              ||'/'" ).append("\n"); 
		query.append("              ||SUBSTR(INV_DT,7,2) PRE_INV_DT" ).append("\n"); 
		query.append("     , CSR_CURR_CD PRE_CURR_CD" ).append("\n"); 
		query.append("     , CSR_AMT PRE_AMT " ).append("\n"); 
		query.append("     , DECODE(PAY_DT" ).append("\n"); 
		query.append("            ,'',''" ).append("\n"); 
		query.append("            ,CSR_CURR_CD) PRE_PAY_CURR_CD" ).append("\n"); 
		query.append("     , CASE WHEN PPD_NO IS NOT NULL " ).append("\n"); 
		query.append("       THEN (CSR_AMT - PPD_APLY_AMT)||''" ).append("\n"); 
		query.append("       ELSE DECODE(PAY_DT,'','',PAY_AMT)" ).append("\n"); 
		query.append("       END PRE_PAY_AMT" ).append("\n"); 
		query.append("     , ATTR_CTNT1 APRO_STEP" ).append("\n"); 
		query.append("	 , CHK_DE_ADDR1||' '||CHK_DE_CTY_NM||' '||CHK_DE_STE_CD||' '||CHK_DE_ZIP_CD||' '||CHK_DE_CNT_CD AS CHK_ADDR" ).append("\n"); 
		query.append("     , DECODE( VNDR_CNT_CD" ).append("\n"); 
		query.append("             , 'US', 'CHK ADDR : '|| NVL(CHK_DE_ADDR1, '')" ).append("\n"); 
		query.append("             , 'CA', 'CHK ADDR : '|| NVL(CHK_DE_ADDR1, '')" ).append("\n"); 
		query.append("			 , 'MX', 'CHK ADDR : '|| NVL(CHK_DE_ADDR1, '')" ).append("\n"); 
		query.append("             , '' ) AS CHK_ADDR1" ).append("\n"); 
		query.append("     , DECODE( VNDR_CNT_CD" ).append("\n"); 
		query.append("             , 'US', NVL(CHK_DE_ADDR2, '')" ).append("\n"); 
		query.append("             , 'CA', NVL(CHK_DE_ADDR2, '')" ).append("\n"); 
		query.append("             , 'MX', NVL(CHK_DE_ADDR2, '')" ).append("\n"); 
		query.append("             , '' ) AS CHK_ADDR2" ).append("\n"); 
		query.append("     , DECODE( VNDR_CNT_CD" ).append("\n"); 
		query.append("             , 'US', NVL(CHK_DE_ADDR3, '')" ).append("\n"); 
		query.append("			 , 'CA', NVL(CHK_DE_ADDR3, '')" ).append("\n"); 
		query.append("			 , 'MX', NVL(CHK_DE_ADDR3, '')" ).append("\n"); 
		query.append("             , '' ) AS CHK_ADDR3" ).append("\n"); 
		query.append("     , DECODE( VNDR_CNT_CD" ).append("\n"); 
		query.append("             , 'US', NVL(CHK_DE_CTY_NM, '')" ).append("\n"); 
		query.append("			 , 'CA', NVL(CHK_DE_CTY_NM, '')" ).append("\n"); 
		query.append("			 , 'MX', NVL(CHK_DE_CTY_NM, '')" ).append("\n"); 
		query.append("             , '' ) AS CHK_CTY_NM" ).append("\n"); 
		query.append("     , DECODE( VNDR_CNT_CD" ).append("\n"); 
		query.append("             , 'US', NVL(CHK_DE_STE_CD, '')" ).append("\n"); 
		query.append("			 , 'CA', NVL(CHK_DE_STE_CD, '')" ).append("\n"); 
		query.append("			 , 'MX', NVL(CHK_DE_STE_CD, '')" ).append("\n"); 
		query.append("             , '' ) AS CHK_STE_CD" ).append("\n"); 
		query.append("     , DECODE( VNDR_CNT_CD" ).append("\n"); 
		query.append("             , 'US', NVL(CHK_DE_ZIP_CD, '')" ).append("\n"); 
		query.append("			 , 'CA', NVL(CHK_DE_ZIP_CD, '')" ).append("\n"); 
		query.append("			 , 'MX', NVL(CHK_DE_ZIP_CD, '')" ).append("\n"); 
		query.append("             , '' ) AS CHK_ZIP_CD" ).append("\n"); 
		query.append("     , DECODE( VNDR_CNT_CD" ).append("\n"); 
		query.append("             , 'US', NVL(CHK_DE_CNT_CD, '')" ).append("\n"); 
		query.append("			 , 'CA', NVL(CHK_DE_CNT_CD, '')" ).append("\n"); 
		query.append("			 , 'MX', NVL(CHK_DE_CNT_CD, '')" ).append("\n"); 
		query.append("             , '' ) AS CHK_CNT_CD" ).append("\n"); 
		query.append("FROM   AP_INV_HDR H" ).append("\n"); 
		query.append("     , MDM_VENDOR V" ).append("\n"); 
		query.append("WHERE  H.VNDR_NO = V.VNDR_SEQ" ).append("\n"); 
		query.append("   AND CSR_NO    = @[csr_no]" ).append("\n"); 

	}
}