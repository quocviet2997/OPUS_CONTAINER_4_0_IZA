/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : CommodityDBDAOSearchCommodityListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2014.12.29
*@LastModifier : 
*@LastVersion : 1.0
* 2014.12.29 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.commodity.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CommodityDBDAOSearchCommodityListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Commodity 리스트 조회
	  * </pre>
	  */
	public CommodityDBDAOSearchCommodityListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rep_cmdt_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cmdt_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("delt_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cmdt_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rep_imdg_lvl_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.commodity.integration").append("\n"); 
		query.append("FileName : CommodityDBDAOSearchCommodityListRSQL").append("\n"); 
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
		query.append("SELECT CMDT_CD," ).append("\n"); 
		query.append("  CMDT_NM," ).append("\n"); 
		query.append("  REP_CMDT_CD," ).append("\n"); 
		query.append("  REP_IMDG_LVL_CD," ).append("\n"); 
		query.append("  TO_CHAR(UPD_DT,'YYYY-MM-DD') UPD_DT," ).append("\n"); 
		query.append("  (CASE WHEN 'Y' = delt_flg THEN 'Delete'" ).append("\n"); 
		query.append("        ELSE 'Active'" ).append("\n"); 
		query.append("   END" ).append("\n"); 
		query.append("  ) AS DELT_FLG" ).append("\n"); 
		query.append("FROM (SELECT ROW_NUMBER() OVER (ORDER BY cmdt_cd ASC) NO," ).append("\n"); 
		query.append("        CMDT_CD," ).append("\n"); 
		query.append("        CMDT_NM," ).append("\n"); 
		query.append("        REP_CMDT_CD," ).append("\n"); 
		query.append("        REP_IMDG_LVL_CD," ).append("\n"); 
		query.append("        UPD_DT," ).append("\n"); 
		query.append("        DELT_FLG" ).append("\n"); 
		query.append("      FROM MDM_COMMODITY" ).append("\n"); 
		query.append("	  WHERE 1 = 1" ).append("\n"); 
		query.append("#if (${cmdt_cd} != '')" ).append("\n"); 
		query.append("        AND CMDT_CD LIKE @[cmdt_cd] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${rep_cmdt_cd} != '')" ).append("\n"); 
		query.append("        AND REP_CMDT_CD LIKE @[rep_cmdt_cd] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${cmdt_nm} != '')" ).append("\n"); 
		query.append("        AND UPPER(CMDT_NM) like '%' || UPPER(@[cmdt_nm]) || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${mdm_yn} != '')" ).append("\n"); 
		query.append("  #if (${delt_flg} == 'Y')" ).append("\n"); 
		query.append("        AND DELT_FLG = @[delt_flg]" ).append("\n"); 
		query.append("  #else" ).append("\n"); 
		query.append("        AND delt_flg <> 'Y'" ).append("\n"); 
		query.append("  #end" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("        AND delt_flg <> 'Y'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${rep_imdg_lvl_cd} != '')" ).append("\n"); 
		query.append("        AND REP_IMDG_LVL_CD = @[rep_imdg_lvl_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("  ) A" ).append("\n"); 
		query.append("ORDER BY CMDT_CD" ).append("\n"); 

	}
}