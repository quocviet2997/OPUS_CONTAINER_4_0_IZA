/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : VvdDBDAOTotalVvdRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.05
*@LastModifier : 
*@LastVersion : 1.0
* 2010.07.05 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.vvd.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class VvdDBDAOTotalVvdRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 토탈
	  * </pre>
	  */
	public VvdDBDAOTotalVvdRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("vvd_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("edate",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("sdate",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("lane_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.vvd.integration").append("\n"); 
		query.append("FileName : VvdDBDAOTotalVvdRSQL").append("\n"); 
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
		query.append("SELECT COUNT(1)" ).append("\n"); 
		query.append("FROM VSK_VSL_PORT_SKD" ).append("\n"); 
		query.append("WHERE 1=1" ).append("\n"); 
		query.append("#if(${table} == 'D')" ).append("\n"); 
		query.append("	#if(${sdate} != '' && ${edate} != '')" ).append("\n"); 
		query.append("	AND VPS_ETD_DT BETWEEN TO_DATE( NVL( @[sdate], '1900-01-01'), 'YYYY-MM-DD' ) AND TO_DATE( NVL( @[edate], '9999-12-31'), 'YYYY-MM-DD' )" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("#elseif(${table} == 'A')" ).append("\n"); 
		query.append("	#if(${sdate} != '' && ${edate} != '')" ).append("\n"); 
		query.append("	AND VPS_ETA_DT BETWEEN TO_DATE( NVL( @[sdate], '1900-01-01'), 'YYYY-MM-DD' ) AND TO_DATE( NVL( @[edate], '9999-12-31'), 'YYYY-MM-DD' )" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if(${vvd_cd} != '')" ).append("\n"); 
		query.append("AND VSL_CD || SKD_VOY_NO || SKD_DIR_CD LIKE @[vvd_cd] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if(${loc_cd} != '')" ).append("\n"); 
		query.append("AND VPS_PORT_CD LIKE @[loc_cd] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if(${lane_cd} != '')" ).append("\n"); 
		query.append("AND SLAN_CD LIKE @[lane_cd] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("AND NVL(SKD_CNG_STS_CD, ' ') <> 'S'" ).append("\n"); 
		query.append("AND CLPT_IND_SEQ = '1'" ).append("\n"); 
		query.append("ORDER BY SLAN_CD" ).append("\n"); 
		query.append(", VSL_CD || SKD_VOY_NO || SKD_DIR_CD" ).append("\n"); 
		query.append(", TO_NUMBER(CLPT_SEQ)" ).append("\n"); 

	}
}