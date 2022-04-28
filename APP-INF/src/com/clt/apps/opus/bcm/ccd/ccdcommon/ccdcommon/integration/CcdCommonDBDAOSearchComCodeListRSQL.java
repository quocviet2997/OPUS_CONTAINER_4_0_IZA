/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : CcdCommonDBDAOSearchComCodeListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2015.03.31
*@LastModifier : 김성욱
*@LastVersion : 1.0
* 2015.03.31 김성욱
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.ccd.ccdcommon.ccdcommon.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Sung-Wook Kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CcdCommonDBDAOSearchComCodeListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 공통코드를 조회한다.
	  * </pre>
	  */
	public CcdCommonDBDAOSearchComCodeListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("tbl",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.ccd.ccdcommon.ccdcommon.integration").append("\n"); 
		query.append("FileName : CcdCommonDBDAOSearchComCodeListRSQL").append("\n"); 
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
		query.append("#if (${codeItem} == 'Conti') /* MDM_CONTINENT  (콤보 반환)*/" ).append("\n"); 
		query.append("    SELECT CONTI_CD CD" ).append("\n"); 
		query.append("          ,CONTI_NM CD_DESC" ).append("\n"); 
		query.append("    FROM MDM_CONTINENT " ).append("\n"); 
		query.append("    WHERE 1=1" ).append("\n"); 
		query.append("    AND DELT_FLG = 'N'" ).append("\n"); 
		query.append("    ORDER BY CONTI_CD" ).append("\n"); 
		query.append(" " ).append("\n"); 
		query.append("#elseif (${codeItem} == 'GrpCmdt') /* MDM_GRP_CMDT   (콤보 반환)*/" ).append("\n"); 
		query.append("    SELECT GRP_CMDT_CD CD" ).append("\n"); 
		query.append("          ,GRP_CMDT_ENG_NM CD_DESC" ).append("\n"); 
		query.append("    FROM MDM_GRP_CMDT " ).append("\n"); 
		query.append("    WHERE 1=1" ).append("\n"); 
		query.append("    AND DELT_FLG = 'N'" ).append("\n"); 
		query.append("    ORDER BY GRP_CMDT_CD" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#elseif (${codeItem} == 'RepCmdt') /* MDM_REP_CMDT   (콤보 반환)*/" ).append("\n"); 
		query.append("    SELECT REP_CMDT_CD AS CD" ).append("\n"); 
		query.append("          ,REP_CMDT_NM AS CD_DESC" ).append("\n"); 
		query.append("    FROM MDM_REP_CMDT " ).append("\n"); 
		query.append("    WHERE 1=1" ).append("\n"); 
		query.append("    AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("    ORDER BY REP_CMDT_CD" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#elseif (${codeItem} == 'RepChg') /* MDM_REP_CHG   (콤보 반환)*/" ).append("\n"); 
		query.append("    SELECT REP_CHG_CD CD" ).append("\n"); 
		query.append("          ,REP_CHG_NM CD_DESC" ).append("\n"); 
		query.append("    FROM MDM_REP_CHG " ).append("\n"); 
		query.append("    WHERE 1=1" ).append("\n"); 
		query.append("    AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("    ORDER BY REP_CHG_CD" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#elseif (${codeItem} == 'SubTrade') /* MDM_SUB_TRD   (콤보 반환)*/" ).append("\n"); 
		query.append("	SELECT SUB_TRD_CD CD" ).append("\n"); 
		query.append("          ,SUB_TRD_NM CD_DESC" ).append("\n"); 
		query.append("		  ,TRD_CD CD_ETC" ).append("\n"); 
		query.append("    FROM MDM_SUB_TRD " ).append("\n"); 
		query.append("    WHERE 1=1" ).append("\n"); 
		query.append("    AND DELT_FLG = 'N'" ).append("\n"); 
		query.append("    ORDER BY SUB_TRD_CD" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#elseif (${codeItem} == 'Trade') /* MDM_TRADE   (콤보 반환)*/" ).append("\n"); 
		query.append("    SELECT TRD_CD CD" ).append("\n"); 
		query.append("          ,TRD_NM CD_DESC" ).append("\n"); 
		query.append("    FROM MDM_TRADE " ).append("\n"); 
		query.append("    WHERE 1=1" ).append("\n"); 
		query.append("    AND DELT_FLG = 'N'" ).append("\n"); 
		query.append("    ORDER BY TRD_CD" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#elseif (${codeItem} == 'CntrSize') /* MDM_CNTR_SZ   (콤보 반환)*/    " ).append("\n"); 
		query.append("    SELECT CNTR_SZ_CD AS CD" ).append("\n"); 
		query.append("          ,CNTR_SZ_DESC AS CD_DESC" ).append("\n"); 
		query.append("    FROM MDM_CNTR_SZ " ).append("\n"); 
		query.append("    WHERE 1=1" ).append("\n"); 
		query.append("    AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("    ORDER BY CNTR_SZ_CD" ).append("\n"); 
		query.append("    " ).append("\n"); 
		query.append("#elseif (${codeItem} == 'CntrType') /* MDM_CNTR_TP   (콤보 반환)*/    " ).append("\n"); 
		query.append("    SELECT CNTR_TP_CD AS CD" ).append("\n"); 
		query.append("          ,CNTR_TP_DESC AS CD_DESC" ).append("\n"); 
		query.append("    FROM MDM_CNTR_TP " ).append("\n"); 
		query.append("    WHERE 1=1" ).append("\n"); 
		query.append("    AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("    ORDER BY CNTR_TP_CD  " ).append("\n"); 
		query.append("  " ).append("\n"); 
		query.append("#elseif (${codeItem} == 'CntrTpSz') /* MDM_CNTR_TP_SZ   (콤보 반환)*/    " ).append("\n"); 
		query.append("    SELECT CNTR_TPSZ_CD CD" ).append("\n"); 
		query.append("          ,CNTR_TPSZ_DESC CD_DESC" ).append("\n"); 
		query.append("    FROM MDM_CNTR_TP_SZ " ).append("\n"); 
		query.append("    WHERE 1=1" ).append("\n"); 
		query.append("    AND DELT_FLG = 'N'" ).append("\n"); 
		query.append("    ORDER BY CNTR_TPSZ_CD  " ).append("\n"); 
		query.append("  " ).append("\n"); 
		query.append("#elseif (${codeItem} == 'Package') /* MDM_PCK_TP   (콤보 반환)*/    " ).append("\n"); 
		query.append("    SELECT PCK_CD CD" ).append("\n"); 
		query.append("          ,PCK_NM CD_DESC" ).append("\n"); 
		query.append("    FROM MDM_PCK_TP " ).append("\n"); 
		query.append("    WHERE 1=1" ).append("\n"); 
		query.append("    AND DELT_FLG = 'N'" ).append("\n"); 
		query.append("    ORDER BY PCK_CD" ).append("\n"); 
		query.append("	" ).append("\n"); 
		query.append("#elseif (${codeItem} == 'TBL') /* MDA History Table반환 */" ).append("\n"); 
		query.append("SELECT TBL_NM CD" ).append("\n"); 
		query.append("     , UI_DP_TBL_NM CD_DESC" ).append("\n"); 
		query.append("  FROM MDM_TBL_INFO" ).append("\n"); 
		query.append(" WHERE HIS_FLG = 'Y' AND TBL_DIV_CD = 'T'" ).append("\n"); 
		query.append(" GROUP BY TBL_NM, UI_DP_TBL_NM" ).append("\n"); 
		query.append(" ORDER BY UI_DP_TBL_NM " ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#elseif (${codeItem} == 'COL') /* MDA History COL반환 */" ).append("\n"); 
		query.append("SELECT COL_NM CD, UI_DP_FLD_NM CD_DESC" ).append("\n"); 
		query.append("  FROM MDM_COL_INFO" ).append("\n"); 
		query.append(" WHERE TBL_NM = @[tbl]" ).append("\n"); 
		query.append("   AND HIS_FLG = 'Y'" ).append("\n"); 
		query.append(" GROUP BY COL_NM, UI_DP_FLD_NM" ).append("\n"); 
		query.append(" ORDER BY UI_DP_FLD_NM" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}