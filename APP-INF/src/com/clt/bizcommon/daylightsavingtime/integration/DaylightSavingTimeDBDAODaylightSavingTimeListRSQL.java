/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : DaylightSavingTimeDBDAODaylightSavingTimeListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2017.01.04
*@LastModifier : 
*@LastVersion : 1.0
* 2017.01.04 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.daylightsavingtime.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class DaylightSavingTimeDBDAODaylightSavingTimeListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Charge의 모든 목록을 가져온다.
	  * </pre>
	  */
	public DaylightSavingTimeDBDAODaylightSavingTimeListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("dst_yr",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("dst_cnt_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("delt_flg",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.daylightsavingtime.integration").append("\n"); 
		query.append("FileName : DaylightSavingTimeDBDAODaylightSavingTimeListRSQL").append("\n"); 
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
		query.append("SELECT DST_ID" ).append("\n"); 
		query.append("      ,DST_CNT_CD" ).append("\n"); 
		query.append("      ,DST_YR" ).append("\n"); 
		query.append("      ,DST_MNTS" ).append("\n"); 
		query.append("      ,ST_DST_DT" ).append("\n"); 
		query.append("      ,END_DST_DT" ).append("\n"); 
		query.append("      ,''     AS MDM_YN" ).append("\n"); 
		query.append("      ,DECODE(DELT_FLG,'Y','Delete','Active') AS DELT_FLG" ).append("\n"); 
		query.append("      ,ST_DST_RULE_DESC " ).append("\n"); 
		query.append("      ,END_DST_RULE_DESC " ).append("\n"); 
		query.append("      ,ST_DST_HRMNT" ).append("\n"); 
		query.append("      ,END_DST_HRMNT " ).append("\n"); 
		query.append("      ,DST_NOT_APLY_STE_CD" ).append("\n"); 
		query.append("  FROM (" ).append("\n"); 
		query.append("	    SELECT ROW_NUMBER() OVER (ORDER BY DST_ID ASC) AS NO" ).append("\n"); 
		query.append("              ,DST_ID" ).append("\n"); 
		query.append("              ,DST_CNT_CD" ).append("\n"); 
		query.append("              ,DST_YR" ).append("\n"); 
		query.append("              ,DST_MNTS" ).append("\n"); 
		query.append("              ,ST_DST_DT" ).append("\n"); 
		query.append("              ,END_DST_DT" ).append("\n"); 
		query.append("              ,DELT_FLG" ).append("\n"); 
		query.append("              ,ST_DST_RULE_DESC " ).append("\n"); 
		query.append("              ,END_DST_RULE_DESC " ).append("\n"); 
		query.append("              ,ST_DST_HRMNT" ).append("\n"); 
		query.append("              ,END_DST_HRMNT" ).append("\n"); 
		query.append("              ,DST_NOT_APLY_STE_CD " ).append("\n"); 
		query.append("	      FROM MDM_DYLGT_SAV_TM" ).append("\n"); 
		query.append("	     WHERE 1 = 1   " ).append("\n"); 
		query.append("	     #if (${dst_cnt_cd} != '')" ).append("\n"); 
		query.append("		   AND DST_CNT_CD like @[dst_cnt_cd] || '%'" ).append("\n"); 
		query.append("	     #end    " ).append("\n"); 
		query.append("	     #if (${mdm_yn} != '')" ).append("\n"); 
		query.append("		    #if (${delt_flg} == 'Y') " ).append("\n"); 
		query.append("		       AND DELT_FLG = @[delt_flg]" ).append("\n"); 
		query.append("		    #elseif (${delt_flg} == 'ALL') " ).append("\n"); 
		query.append("		    #else " ).append("\n"); 
		query.append("		       AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("		    #end" ).append("\n"); 
		query.append("	     #else	" ).append("\n"); 
		query.append("		   AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("	     #end" ).append("\n"); 
		query.append("         #if (${dst_yr} != '')" ).append("\n"); 
		query.append("           AND DST_YR = @[dst_yr]" ).append("\n"); 
		query.append("         #end" ).append("\n"); 
		query.append("       ) " ).append("\n"); 
		query.append("WHERE 1=1" ).append("\n"); 
		query.append("ORDER BY DST_ID" ).append("\n"); 

	}
}