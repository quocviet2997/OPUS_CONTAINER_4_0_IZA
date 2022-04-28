/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : LocationDBDAOSearchLocationListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.03.29
*@LastModifier : 
*@LastVersion : 1.0
* 2012.03.29 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.location.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class LocationDBDAOSearchLocationListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Search LocationList
	  * </pre>
	  */
	public LocationDBDAOSearchLocationListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("loc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("lcc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("loc_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("loc_eq_ofc",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cnt_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rcc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("loc_state",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.NUMERIC + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("startpart",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("un_loc_ind_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("delt_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.NUMERIC + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("endpart",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.location.integration").append("\n"); 
		query.append("FileName : LocationDBDAOSearchLocationListRSQL").append("\n"); 
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
		query.append("SELECT" ).append("\n"); 
		query.append("	LOC_CD," ).append("\n"); 
		query.append("	LOC_NM," ).append("\n"); 
		query.append("	RGN_CD," ).append("\n"); 
		query.append("	LOC_STATE," ).append("\n"); 
		query.append("	HUB_LOC_CD," ).append("\n"); 
		query.append("	UN_LOC_IND_CD," ).append("\n"); 
		query.append("	UN_LOC_CD," ).append("\n"); 
		query.append("	LOC_CHR_CD," ).append("\n"); 
		query.append("	SCC_CD," ).append("\n"); 
		query.append("	LCC_CD," ).append("\n"); 
		query.append("	ECC_CD," ).append("\n"); 
		query.append("	RCC_CD," ).append("\n"); 
		query.append("	CNT_CD," ).append("\n"); 
		query.append("	SLS_OFC_CD," ).append("\n"); 
		query.append("	EQ_CTRL_OFC_CD," ).append("\n"); 
		query.append("	(CASE " ).append("\n"); 
		query.append("		WHEN 'Y' = delt_flg THEN 'Delete' " ).append("\n"); 
		query.append("		ELSE 'Active' " ).append("\n"); 
		query.append("	END) AS delt_flg" ).append("\n"); 
		query.append("FROM (" ).append("\n"); 
		query.append("		SELECT ROW_NUMBER() OVER (ORDER BY A.LOC_CD ASC) no," ).append("\n"); 
		query.append("			A.LOC_CD," ).append("\n"); 
		query.append("			A.LOC_NM," ).append("\n"); 
		query.append("			A.RGN_CD," ).append("\n"); 
		query.append("			A.STE_CD LOC_STATE," ).append("\n"); 
		query.append("			A.HUB_LOC_CD," ).append("\n"); 
		query.append("			A.UN_LOC_IND_CD," ).append("\n"); 
		query.append("			A.UN_LOC_CD," ).append("\n"); 
		query.append("			A.LOC_CHR_CD," ).append("\n"); 
		query.append("			A.SCC_CD," ).append("\n"); 
		query.append("			C.LCC_CD," ).append("\n"); 
		query.append("			C.ECC_CD," ).append("\n"); 
		query.append("			C.RCC_CD," ).append("\n"); 
		query.append("			A.CNT_CD," ).append("\n"); 
		query.append("			A.SLS_OFC_CD," ).append("\n"); 
		query.append("			A.EQ_CTRL_OFC_CD," ).append("\n"); 
		query.append("			A.DELT_FLG" ).append("\n"); 
		query.append("		FROM MDM_LOCATION A, MDM_COUNTRY B, MDM_EQ_ORZ_CHT C" ).append("\n"); 
		query.append("		WHERE 1 = 1 " ).append("\n"); 
		query.append("			AND A.CNT_CD = B.CNT_CD(+)" ).append("\n"); 
		query.append("		#if (${scc_flg} == 'Y') " ).append("\n"); 
		query.append("			AND A.LOC_CD = C.SCC_CD" ).append("\n"); 
		query.append("		#else " ).append("\n"); 
		query.append("			AND A.SCC_CD = C.SCC_CD(+)" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("		#if(${loc_cd} != '')" ).append("\n"); 
		query.append("			AND A.LOC_CD like '%' || @[loc_cd] || '%'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("		#if(${un_loc_ind_cd} != '')" ).append("\n"); 
		query.append("			AND A.UN_LOC_IND_CD = @[un_loc_ind_cd]" ).append("\n"); 
		query.append("		#end " ).append("\n"); 
		query.append("		#if(${loc_nm} != '')" ).append("\n"); 
		query.append("			AND upper(A.LOC_NM) like '%' || upper(@[loc_nm])  || '%'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("		#if(${cnt_cd} != '')" ).append("\n"); 
		query.append("			AND A.CNT_CD like @[cnt_cd]  || '%'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("		#if(${rcc_cd} != '')" ).append("\n"); 
		query.append("			AND C.RCC_CD = @[rcc_cd]" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("		#if(${lcc_cd} != '')" ).append("\n"); 
		query.append("			AND C.LCC_CD = @[lcc_cd]" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("		#if(${loc_state} != '')" ).append("\n"); 
		query.append("			AND A.STE_CD = @[loc_state]" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("		#if(${select} == 'S')" ).append("\n"); 
		query.append("			AND A.sls_ofc_cd like @[loc_eq_ofc]  || '%'" ).append("\n"); 
		query.append("		#elseif(${select} == 'F')" ).append("\n"); 
		query.append("			AND A.finc_ctrl_ofc_cd like @[loc_eq_ofc]  || '%'" ).append("\n"); 
		query.append("		#elseif(${select} == 'E')" ).append("\n"); 
		query.append("			AND A.eq_ctrl_ofc_cd like @[loc_eq_ofc]  || '%'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("		#if (${mdm_yn} != '')" ).append("\n"); 
		query.append("			#if (${delt_flg} == 'Y') " ).append("\n"); 
		query.append("			AND NVL(A.DELT_FLG, 'N') = @[delt_flg]" ).append("\n"); 
		query.append("			#elseif (${delt_flg} == 'ALL') " ).append("\n"); 
		query.append("			#else " ).append("\n"); 
		query.append("			AND NVL(A.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("			#end" ).append("\n"); 
		query.append("		#else	" ).append("\n"); 
		query.append("			AND NVL(A.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("			AND NVL(B.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("		#if (${scc_flg} == 'Y') " ).append("\n"); 
		query.append("			AND NVL(C.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("	) A	                   " ).append("\n"); 
		query.append("WHERE no BETWEEN @[startpart] AND @[endpart]" ).append("\n"); 
		query.append("ORDER BY LOC_CD" ).append("\n"); 

	}
}