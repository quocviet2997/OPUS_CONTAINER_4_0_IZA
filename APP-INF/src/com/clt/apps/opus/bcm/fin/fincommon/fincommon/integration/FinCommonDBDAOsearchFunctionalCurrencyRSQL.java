/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : FinCommonDBDAOsearchFunctionalCurrencyRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2014.10.15
*@LastModifier : 
*@LastVersion : 1.0
* 2014.10.15 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.fin.fincommon.fincommon.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class FinCommonDBDAOsearchFunctionalCurrencyRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * searchFunctionalCurrency
	  * </pre>
	  */
	public FinCommonDBDAOsearchFunctionalCurrencyRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.fin.fincommon.fincommon.integration ").append("\n"); 
		query.append("FileName : FinCommonDBDAOsearchFunctionalCurrencyRSQL").append("\n"); 
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
		query.append("SELECT SLD.LU_CD,SLD.LU_DESC" ).append("\n"); 
		query.append("  FROM SCO_LU_HDR SLH," ).append("\n"); 
		query.append("       SCO_LU_DTL SLD" ).append("\n"); 
		query.append(" WHERE SLH.LU_TP_CD = 'FUNCTIONAL CURRENCY'" ).append("\n"); 
		query.append("   AND SLH.LU_TP_CD = SLD.LU_TP_CD" ).append("\n"); 

	}
}