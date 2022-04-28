/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : SalesRepDBDAOSearchSalesRepListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.29
*@LastModifier : 
*@LastVersion : 1.0
* 2012.02.29 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.salesrep.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class SalesRepDBDAOSearchSalesRepListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Sales Rep 조회
	  * </pre>
	  */
	public SalesRepDBDAOSearchSalesRepListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("srep_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("srep_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.salesrep.integration").append("\n"); 
		query.append("FileName : SalesRepDBDAOSearchSalesRepListRSQL").append("\n"); 
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
		query.append("SELECT SREP_CD, SREP_NM, OFC_CD, DECODE(DELT_FLG,'Y','Delete','Active') DELT_FLG" ).append("\n"); 
		query.append("FROM MDM_SLS_REP" ).append("\n"); 
		query.append("#if (${delt_flg} == 'Y')" ).append("\n"); 
		query.append("WHERE NVL(DELT_FLG,'N') = 'Y'" ).append("\n"); 
		query.append("#elseif (${delt_flg} == 'ALL')" ).append("\n"); 
		query.append("WHERE NVL(DELT_FLG,'N') IN ('Y','N')" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("WHERE NVL(DELT_FLG,'N') <> 'Y'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${srep_cd} != '')" ).append("\n"); 
		query.append("AND SREP_CD LIKE @[srep_cd]||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${srep_nm} != '')" ).append("\n"); 
		query.append("AND UPPER(SREP_NM) LIKE UPPER(@[srep_nm])||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("ORDER BY SREP_CD" ).append("\n"); 

	}
}