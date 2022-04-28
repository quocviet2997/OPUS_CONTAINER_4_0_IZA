/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PerTypeDBDAOPerTypeVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.07.23 정인선
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.pertype.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Jung In Sun
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class PerTypeDBDAOPerTypeVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * perType 조회
	  * </pre>
	  */
	public PerTypeDBDAOPerTypeVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rat_ut_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rat_ut_grp_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.pertype.integration").append("\n"); 
		query.append("FileName : PerTypeDBDAOPerTypeVORSQL").append("\n"); 
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
		query.append("RAT_UT_CD," ).append("\n"); 
		query.append("RAT_UT_DESC," ).append("\n"); 
		query.append("RAT_UT_GRP_CD," ).append("\n"); 
		query.append("CNTR_SZ_CD," ).append("\n"); 
		query.append("TO_CHAR(CRE_DT,'YYYY-MM-DD') CR_DT," ).append("\n"); 
		query.append("TO_CHAR(UPD_DT,'YYYY-MM-DD') UP_DT," ).append("\n"); 
		query.append("DELT_FLG" ).append("\n"); 
		query.append("FROM PRI_RAT_UT" ).append("\n"); 
		query.append("WHERE 1=1" ).append("\n"); 
		query.append("AND DELT_FLG = 'N'" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${rat_ut_cd} != '')" ).append("\n"); 
		query.append("and	RAT_UT_CD = @[rat_ut_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${rat_ut_grp_cd} != '')" ).append("\n"); 
		query.append("and	RAT_UT_GRP_CD = @[rat_ut_grp_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("ORDER BY RAT_UT_CD ASC" ).append("\n"); 

	}
}