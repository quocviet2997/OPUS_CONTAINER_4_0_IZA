/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CarrierDBDAOContinentCodeRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.31
*@LastModifier : 
*@LastVersion : 1.0
* 2009.08.31 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.carrier.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CarrierDBDAOContinentCodeRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * DESC Enter..
	  * </pre>
	  */
	public CarrierDBDAOContinentCodeRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.carrier.integration ").append("\n"); 
		query.append("FileName : CarrierDBDAOContinentCodeRSQL").append("\n"); 
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
		query.append("SELECT (100000 + (ROWNUM * 10) ) AS SORTKEY," ).append("\n"); 
		query.append("CONTI_CD AS CODE," ).append("\n"); 
		query.append("CONTI_NM AS NAME" ).append("\n"); 
		query.append("FROM MDM_CONTINENT" ).append("\n"); 
		query.append("WHERE NVL(DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("AND CONTI_CD NOT IN ('X', 'Y')  ORDER BY 1" ).append("\n"); 

	}
}