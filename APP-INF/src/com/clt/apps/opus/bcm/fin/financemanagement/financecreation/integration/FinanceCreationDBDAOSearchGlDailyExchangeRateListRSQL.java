/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : FinanceCreationDBDAOSearchGlDailyExchangeRateListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2014.06.30
*@LastModifier : 
*@LastVersion : 1.0
* 2014.06.30 
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

public class FinanceCreationDBDAOSearchGlDailyExchangeRateListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * SearchGlDailyExchangeRateList
	  * </pre>
	  */
	public FinanceCreationDBDAOSearchGlDailyExchangeRateListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("s_acct_xch_rt_to_dt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("s_to_curr_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("s_acct_xch_rt_fm_dt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("s_fm_curr_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration").append("\n"); 
		query.append("FileName : FinanceCreationDBDAOSearchGlDailyExchangeRateListRSQL").append("\n"); 
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
		query.append("ACCT_XCH_RT_DT" ).append("\n"); 
		query.append(", ACCT_XCH_RT_LVL" ).append("\n"); 
		query.append(", FM_CURR_CD" ).append("\n"); 
		query.append(", TO_CURR_CD" ).append("\n"); 
		query.append(", CONV_XCH_RT" ).append("\n"); 
		query.append(", ACCT_RT_USR_LVL" ).append("\n"); 
		query.append(", DELT_FLG" ).append("\n"); 
		query.append(", CRE_USR_ID" ).append("\n"); 
		query.append(", CRE_DT" ).append("\n"); 
		query.append(", UPD_USR_ID" ).append("\n"); 
		query.append(", UPD_DT" ).append("\n"); 
		query.append("FROM GL_DLY_XCH_RT" ).append("\n"); 
		query.append("WHERE ACCT_XCH_RT_DT BETWEEN @[s_acct_xch_rt_fm_dt] AND @[s_acct_xch_rt_to_dt]" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${s_fm_curr_cd} != '')" ).append("\n"); 
		query.append("AND FM_CURR_CD = @[s_fm_curr_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${s_to_curr_cd} != '')" ).append("\n"); 
		query.append("AND TO_CURR_CD = @[s_to_curr_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}