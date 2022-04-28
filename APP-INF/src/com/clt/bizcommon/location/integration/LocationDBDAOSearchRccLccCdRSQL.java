/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : LocationDBDAOSearchRccLccCdRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.07.14
*@LastModifier : 
*@LastVersion : 1.0
* 2016.07.14 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.location.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class LocationDBDAOSearchRccLccCdRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * RCC SEARCH
	  * </pre>
	  */
	public LocationDBDAOSearchRccLccCdRSQL(){
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

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.location.integration ").append("\n"); 
		query.append("FileName : LocationDBDAOSearchRccLccCdRSQL").append("\n"); 
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
		query.append("#if(${loc_grp_cd} == 'L')   -- LCC_CD " ).append("\n"); 
		query.append("SELECT DISTINCT LCC_CD CODE " ).append("\n"); 
		query.append("     , LCC_CD NAME " ).append("\n"); 
		query.append("#else                       -- RCC_CD " ).append("\n"); 
		query.append("SELECT DISTINCT RCC_CD CODE " ).append("\n"); 
		query.append("     , RCC_CD NAME " ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("FROM   MDM_EQ_ORZ_CHT" ).append("\n"); 
		query.append("WHERE  DELT_FLG = 'N'" ).append("\n"); 
		query.append("#if(${loc_grp_cd} == 'L')   -- LCC_CD " ).append("\n"); 
		query.append("  #if(${loc_cd} != '')      " ).append("\n"); 
		query.append("AND    RCC_CD = @[loc_cd]   " ).append("\n"); 
		query.append("  #end" ).append("\n"); 
		query.append("#else                       -- RCC_CD " ).append("\n"); 
		query.append("  #if(${loc_cd} != '')      " ).append("\n"); 
		query.append("AND    LCC_CD = @[loc_cd]" ).append("\n"); 
		query.append("  #end" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("ORDER BY NAME" ).append("\n"); 

	}
}