/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : TradeDBDAOSearchTradeListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.03.29
*@LastModifier : 
*@LastVersion : 1.0
* 2012.03.29 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.trade.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class TradeDBDAOSearchTradeListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * MDM Trade 조회
	  * </pre>
	  */
	public TradeDBDAOSearchTradeListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("desc",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("delt_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("code",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.trade.integration").append("\n"); 
		query.append("FileName : TradeDBDAOSearchTradeListRSQL").append("\n"); 
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
		query.append("SELECT TRD_CD," ).append("\n"); 
		query.append("	TRD_NM," ).append("\n"); 
		query.append("	FM_CONTI_CD," ).append("\n"); 
		query.append("	TO_CONTI_CD," ).append("\n"); 
		query.append("	(CASE " ).append("\n"); 
		query.append("		WHEN 'Y' = delt_flg THEN 'Delete' " ).append("\n"); 
		query.append("		ELSE 'Active' " ).append("\n"); 
		query.append("	END) AS STATUS" ).append("\n"); 
		query.append("FROM MDM_TRADE" ).append("\n"); 
		query.append("WHERE 1=1" ).append("\n"); 
		query.append("#if(${code} != '')     " ).append("\n"); 
		query.append("AND TRD_CD LIKE '%' ||  @[code] || '%'" ).append("\n"); 
		query.append("#end " ).append("\n"); 
		query.append("#if(${desc} != '')     " ).append("\n"); 
		query.append("AND UPPER(TRD_NM) LIKE '%' ||  UPPER(@[desc]) || '%'" ).append("\n"); 
		query.append("#end " ).append("\n"); 
		query.append("#if (${mdm_yn} != '')" ).append("\n"); 
		query.append("#if (${delt_flg} == 'Y') " ).append("\n"); 
		query.append("AND DELT_FLG = @[delt_flg]" ).append("\n"); 
		query.append("#elseif (${delt_flg} == 'ALL') " ).append("\n"); 
		query.append("#else " ).append("\n"); 
		query.append("AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#else	" ).append("\n"); 
		query.append("AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("ORDER BY TRD_CD" ).append("\n"); 

	}
}