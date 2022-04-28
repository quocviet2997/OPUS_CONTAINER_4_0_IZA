/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : RevenueLaneDBDAOSearchRevenueLaneListVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.03.28
*@LastModifier : 
*@LastVersion : 1.0
* 2012.03.28 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.revenuelane.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class RevenueLaneDBDAOSearchRevenueLaneListVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Revenue Lane Code 를 조회
	  * </pre>
	  */
	public RevenueLaneDBDAOSearchRevenueLaneListVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rlane_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rlane_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("status",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.revenuelane.integration").append("\n"); 
		query.append("FileName : RevenueLaneDBDAOSearchRevenueLaneListVORSQL").append("\n"); 
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
		query.append("SELECT RLANE_CD," ).append("\n"); 
		query.append("       RLANE_NM," ).append("\n"); 
		query.append("       REP_TRD_CD," ).append("\n"); 
		query.append("       VSL_SLAN_CD," ).append("\n"); 
		query.append("       DECODE(DELT_FLG,'Y','Delete','Active') STATUS" ).append("\n"); 
		query.append("FROM MDM_REV_LANE" ).append("\n"); 
		query.append("WHERE  1 = 1 " ).append("\n"); 
		query.append("#if (${rlane_cd} != '')" ).append("\n"); 
		query.append("AND RLANE_CD like '%'||@[rlane_cd]||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${rlane_nm} != '')" ).append("\n"); 
		query.append("AND UPPER(RLANE_NM) like '%'||@[rlane_nm]||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${status} != '')" ).append("\n"); 
		query.append("AND DECODE(DELT_FLG,'Y','D','A') =  @[status]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("ORDER BY RLANE_CD" ).append("\n"); 

	}
}