/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : FinanceCreationDBDAOSearchArRouteRankListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2017.07.12
*@LastModifier : 
*@LastVersion : 1.0
* 2017.07.12 
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

public class FinanceCreationDBDAOSearchArRouteRankListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * SearchArRouteRankList
	  * </pre>
	  */
	public FinanceCreationDBDAOSearchArRouteRankListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("delt_flg",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration").append("\n"); 
		query.append("FileName : FinanceCreationDBDAOSearchArRouteRankListRSQL").append("\n"); 
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
		query.append("SELECT  'I' IBFLAG" ).append("\n"); 
		query.append("       ,RLANE_CD" ).append("\n"); 
		query.append("       ,RNK_SEQ" ).append("\n"); 
		query.append("       ,RLANE_CD H_RLANE_CD" ).append("\n"); 
		query.append("       ,RNK_SEQ H_RNK_SEQ" ).append("\n"); 
		query.append("       ,RLANE_DESC" ).append("\n"); 
		query.append("       ,ZN_IOC_CD" ).append("\n"); 
		query.append("       ,IOC_DESC" ).append("\n"); 
		query.append("       ,SLAN_CD" ).append("\n"); 
		query.append("       ,DELT_FLG" ).append("\n"); 
		query.append("       ,CRE_USR_ID" ).append("\n"); 
		query.append("       ,UPD_USR_ID" ).append("\n"); 
		query.append("       ,'' CHANGE_FLG" ).append("\n"); 
		query.append("  FROM AR_ROUT_RNK" ).append("\n"); 
		query.append(" WHERE 1 = 1--EXISTS (SELECT 'Y' FROM AR_ROUT_RNK " ).append("\n"); 
		query.append("                --WHERE 1 = 1 " ).append("\n"); 
		query.append("                #if (${slan_cd} != '')" ).append("\n"); 
		query.append("                  AND SLAN_CD IN (${slan_cd})" ).append("\n"); 
		query.append("                #end" ).append("\n"); 
		query.append("                #if (${rlane_cd} != '')" ).append("\n"); 
		query.append("                  AND RLANE_CD IN (${rlane_cd})" ).append("\n"); 
		query.append("                #end" ).append("\n"); 
		query.append("                #if (${delt_flg} != '')" ).append("\n"); 
		query.append("                  AND DELT_FLG = @[delt_flg]" ).append("\n"); 
		query.append("                #end--)" ).append("\n"); 
		query.append(" ORDER BY RNK_SEQ ASC" ).append("\n"); 

	}
}