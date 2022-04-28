/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ExchangeRateDAOMonthlyCountRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.08
*@LastModifier : 
*@LastVersion : 1.0
* 2009.06.08 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.exrate.monthly.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ExchangeRateDAOMonthlyCountRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * select exchange rate monthly count
	  * </pre>
	  */
	public ExchangeRateDAOMonthlyCountRSQL(){
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
		params.put("fr_year_mon",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("to_year_mon",new String[]{arrTmp[0],arrTmp[1]});

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
		query.append("SELECT COUNT(*)" ).append("\n"); 
		query.append("FROM gl_mon_xch_rt" ).append("\n"); 
		query.append("WHERE nvl(delt_flg,'N') <> 'Y'" ).append("\n"); 
		query.append("#if (${fr_year_mon} != '' && ${to_year_mon} != '')" ).append("\n"); 
		query.append("AND acct_xch_rt_yrmon between @[fr_year_mon] and @[to_year_mon]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${curr_cd} != '')" ).append("\n"); 
		query.append("AND curr_cd like '%'||@[curr_cd]||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.exrate.monthly.integration").append("\n"); 
		query.append("FileName : ExchangeRateDAOMonthlyCountRSQL").append("\n"); 
		query.append("*/").append("\n"); 
	}
}