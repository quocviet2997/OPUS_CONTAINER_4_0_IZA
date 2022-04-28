/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : FinanceCreationDBDAOSearchGlMonthlyExchangeRateListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.07
*@LastModifier : 
*@LastVersion : 1.0
* 2012.02.07 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class FinanceCreationDBDAOSearchGlMonthlyExchangeRateListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * SearchGlMonthlyExchangeRateList
	  * </pre>
	  */
	public FinanceCreationDBDAOSearchGlMonthlyExchangeRateListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("curr_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("acct_xch_rt_lvl",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("acct_xch_rt_yrmon",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration").append("\n"); 
		query.append("FileName : FinanceCreationDBDAOSearchGlMonthlyExchangeRateListRSQL").append("\n"); 
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
		query.append("ACCT_XCH_RT_YRMON" ).append("\n"); 
		query.append(", ACCT_XCH_RT_LVL" ).append("\n"); 
		query.append(", CURR_CD" ).append("\n"); 
		query.append(", ACCT_XCH_RT_YRMON H_ACCT_XCH_RT_YRMON" ).append("\n"); 
		query.append(", ACCT_XCH_RT_LVL H_ACCT_XCH_RT_LVL" ).append("\n"); 
		query.append(", CURR_CD H_CURR_CD" ).append("\n"); 
		query.append(", USD_LOCL_XCH_RT" ).append("\n"); 
		query.append(", LOCL_CNY_XCH_RT" ).append("\n"); 
		query.append(", USD_CNY_XCH_RT" ).append("\n"); 
		query.append(", ACCT_RT_USR_LVL" ).append("\n"); 
		query.append(", LOG_UPD_DT" ).append("\n"); 
		query.append(", DELT_FLG" ).append("\n"); 
		query.append(", UPD_USR_ID" ).append("\n"); 
		query.append(", CRE_USR_ID" ).append("\n"); 
		query.append("FROM GL_MON_XCH_RT" ).append("\n"); 
		query.append("WHERE 1 = 1 " ).append("\n"); 
		query.append("#if (${acct_xch_rt_yrmon} != '')" ).append("\n"); 
		query.append("AND ACCT_XCH_RT_YRMON = @[acct_xch_rt_yrmon]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${acct_xch_rt_lvl} != '')" ).append("\n"); 
		query.append("AND ACCT_XCH_RT_LVL = @[acct_xch_rt_lvl]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${curr_cd} != '')" ).append("\n"); 
		query.append("AND CURR_CD = @[curr_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}