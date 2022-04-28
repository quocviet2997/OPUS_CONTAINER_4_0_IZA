/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : CurrencyDBDAOMdmCurrencyVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.09
*@LastModifier : 
*@LastVersion : 1.0
* 2012.02.09 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.currency.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CurrencyDBDAOMdmCurrencyVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  *    
	  * </pre>
	  */
	public CurrencyDBDAOMdmCurrencyVORSQL(){
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
		params.put("curr_desc",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cnt_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("delt_flg",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.currency.integration").append("\n"); 
		query.append("FileName : CurrencyDBDAOMdmCurrencyVORSQL").append("\n"); 
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
		query.append("WITH PARAM" ).append("\n"); 
		query.append("AS(SELECT @[curr_cd] CURR_CD, " ).append("\n"); 
		query.append("          @[cnt_cd] CNT_CD," ).append("\n"); 
		query.append("          @[curr_desc] CURR_DESC FROM DUAL)" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("SELECT A.CURR_CD," ).append("\n"); 
		query.append("       A.CNT_CD," ).append("\n"); 
		query.append("       A.CURR_DESC," ).append("\n"); 
		query.append("		(CASE " ).append("\n"); 
		query.append("			WHEN 'Y' = delt_flg THEN 'Delete' " ).append("\n"); 
		query.append("			ELSE 'Active' " ).append("\n"); 
		query.append("		END) AS delt_flg" ).append("\n"); 
		query.append("FROM MDM_CURRENCY A, PARAM P" ).append("\n"); 
		query.append("WHERE A.CURR_CD LIKE '%'||P.CURR_CD||'%'" ).append("\n"); 
		query.append("AND   A.CNT_CD LIKE P.CNT_CD||'%'" ).append("\n"); 
		query.append("AND UPPER(A.CURR_DESC) LIKE '%'||UPPER(P.CURR_DESC)||'%'" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${mdm_yn} != '')" ).append("\n"); 
		query.append("	#if (${delt_flg} == 'Y') " ).append("\n"); 
		query.append("		AND NVL(A.DELT_FLG, 'N') = @[delt_flg]" ).append("\n"); 
		query.append("	#elseif (${delt_flg} == 'ALL') " ).append("\n"); 
		query.append("	#else " ).append("\n"); 
		query.append("		AND NVL(A.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("#else	" ).append("\n"); 
		query.append("	AND NVL(A.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}