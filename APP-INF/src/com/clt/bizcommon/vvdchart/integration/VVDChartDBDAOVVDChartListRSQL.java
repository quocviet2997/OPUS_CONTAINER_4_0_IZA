/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : VVDChartDBDAOVVDChartListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2015.01.21
*@LastModifier : 
*@LastVersion : 1.0
* 2015.01.21 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.vvdchart.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class VVDChartDBDAOVVDChartListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * VVDChart의 모든 목록을 가져온다.
	  * </pre>
	  */
	public VVDChartDBDAOVVDChartListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("scnr_id",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.vvdchart.integration").append("\n"); 
		query.append("FileName : VVDChartDBDAOVVDChartListRSQL").append("\n"); 
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
		query.append("SELECT LEVEL, ID, NAME, DECODE(LEVEL, 1, '', SUBSTR(SYS_CONNECT_BY_PATH(ID, '|'), 6,3) ) TRADE," ).append("\n"); 
		query.append("	DECODE(LEVEL, 1, '', 2, '', SUBSTR(SYS_CONNECT_BY_PATH(ID, '|'), 10,3) ) LANE," ).append("\n"); 
		query.append("	DECODE(LEVEL, 1, '', 2, '', 3, '', SUBSTR(SYS_CONNECT_BY_PATH(ID, '|'), 14,9) ) VVD" ).append("\n"); 
		query.append("FROM (SELECT 'ALL' ID, '' DEPTH, 'ALL' NAME, '' PARENT_ID FROM DUAL" ).append("\n"); 
		query.append("		UNION	ALL" ).append("\n"); 
		query.append("		SELECT TRD_CD ID, 'TRADE' DEPTH, TRD_NM NAME, 'ALL' PARENT_ID FROM MDM_TRADE " ).append("\n"); 
		query.append("		WHERE VSL_TP_CD='C' AND NVL(DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("        #if (${depth} != '1') " ).append("\n"); 
		query.append("			UNION	ALL" ).append("\n"); 
		query.append("	        SELECT DISTINCT VSL_SLAN_CD ID, 'LANE' DEPTH, VSL_SLAN_CD NAME, REP_TRD_CD PARENT_ID FROM MDM_REV_LANE" ).append("\n"); 
		query.append("	        WHERE NVL(DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("			#if (${scnr_id} != '') " ).append("\n"); 
		query.append("			AND VSL_SLAN_CD IN (SELECT DISTINCT VSL_LANE_CD FROM EQR_VSL_LODG_DCHG_PLN WHERE REPO_PLN_ID = @[scnr_id] )" ).append("\n"); 
		query.append("			#end" ).append("\n"); 
		query.append("			#if(${depth} == '3')" ).append("\n"); 
		query.append("				UNION	ALL" ).append("\n"); 
		query.append("			    SELECT DISTINCT VSL_CD||SKD_VOY_NO||SKD_DIR_CD ID, 'VVD' DEPTH, '' NAME, VSL_LANE_CD PARENT_ID" ).append("\n"); 
		query.append("		    	FROM EQR_VSL_LODG_DCHG_PLN" ).append("\n"); 
		query.append("                WHERE 1=1" ).append("\n"); 
		query.append("			  --  WHERE NVL(DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("			    #if (${scnr_id} != '') " ).append("\n"); 
		query.append("			    AND REPO_PLN_ID = @[scnr_id]" ).append("\n"); 
		query.append("		    	#end" ).append("\n"); 
		query.append("			#end" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append(") X" ).append("\n"); 
		query.append("CONNECT BY NOCYCLE PRIOR X.ID = X.PARENT_ID" ).append("\n"); 
		query.append("START WITH X.ID='ALL'" ).append("\n"); 
		query.append("ORDER SIBLINGS BY ID" ).append("\n"); 

	}
}