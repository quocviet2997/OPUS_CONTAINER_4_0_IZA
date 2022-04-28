/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : EQQrgChartDBDAOEQQrgChartListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.07
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2010.07.07 함대성
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.eqorgchart.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author HAM DAE SUNG
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class EQQrgChartDBDAOEQQrgChartListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * EQ Org Chart의 모든 목록을 가져온다.
	  * </pre>
	  */
	public EQQrgChartDBDAOEQQrgChartListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.eqorgchart.integration").append("\n"); 
		query.append("FileName : EQQrgChartDBDAOEQQrgChartListRSQL").append("\n"); 
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
		query.append("select level, loc_cd||decode(loc_dpth_cd, 'R', ' (RCC)', 'L', ' (LCC)', 'E', ' (ECC)', 'S', ' (SCC)', '') unit ," ).append("\n"); 
		query.append("loc_cd," ).append("\n"); 
		query.append("prnt_loc_id," ).append("\n"); 
		query.append("loc_dpth_cd" ).append("\n"); 
		query.append("from eqr_loc_lvl" ).append("\n"); 
		query.append("connect by nocycle prior loc_id = prnt_loc_id" ).append("\n"); 
		query.append("#if (${idepth} != '')" ).append("\n"); 
		query.append("#if (${sccFlag} != 'Y')" ).append("\n"); 
		query.append("and loc_dpth_cd <> 'S'" ).append("\n"); 
		query.append("#end" ).append("\n");
		query.append("#end" ).append("\n"); 
		query.append("start with loc_cd = 'All'" ).append("\n"); 

	}
}