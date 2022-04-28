/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : FinanceCreationDBDAOAddOpenNextMonthApPeriodCSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2015.03.06
*@LastModifier : 
*@LastVersion : 1.0
* 2015.03.06 
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

public class FinanceCreationDBDAOAddOpenNextMonthApPeriodCSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * AP Period 데이터가 기 존재하는 가장 늦은 월을 기준으로 다음 월 전체 데이터를 Open 상태로 COPY
	  * </pre>
	  */
	public FinanceCreationDBDAOAddOpenNextMonthApPeriodCSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_id",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration").append("\n"); 
		query.append("FileName : FinanceCreationDBDAOAddOpenNextMonthApPeriodCSQL").append("\n"); 
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
		query.append("INSERT INTO AP_PERIOD" ).append("\n"); 
		query.append("(  " ).append("\n"); 
		query.append("    SYS_DIV_CD" ).append("\n"); 
		query.append("    , EFF_YRMON" ).append("\n"); 
		query.append("    , OFC_CD" ).append("\n"); 
		query.append("    , AR_AP_DIV_CD" ).append("\n"); 
		query.append("    , CLZ_STS_CD" ).append("\n"); 
		query.append("    , SYS_DESC" ).append("\n"); 
		query.append("    , RHQ_CD" ).append("\n"); 
		query.append("    , EAI_EVNT_DT" ).append("\n"); 
		query.append("    , LST_UPD_DT" ).append("\n"); 
		query.append("    , CRE_USR_ID" ).append("\n"); 
		query.append("    , CRE_DT" ).append("\n"); 
		query.append("    , UPD_USR_ID" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("SELECT  SYS_DIV_CD " ).append("\n"); 
		query.append("   ,TO_CHAR(ADD_MONTHS(TO_DATE(EFF_YRMON, 'YYYYMM'), 1), 'YYYYMM') EFF_YRMON" ).append("\n"); 
		query.append("   ,OFC_CD " ).append("\n"); 
		query.append("   ,AR_AP_DIV_CD " ).append("\n"); 
		query.append("   ,'O' AS CLZ_STS_CD " ).append("\n"); 
		query.append("   ,SYS_DESC " ).append("\n"); 
		query.append("   ,RHQ_CD " ).append("\n"); 
		query.append("   ,'' AS EAI_EVNT_DT " ).append("\n"); 
		query.append("   ,SYSDATE LST_UPD_DT" ).append("\n"); 
		query.append("   ,@[usr_id] CRE_USR_ID " ).append("\n"); 
		query.append("   ,SYSDATE CRE_DT" ).append("\n"); 
		query.append("   ,@[usr_id] UPD_USR_ID " ).append("\n"); 
		query.append("FROM AP_PERIOD " ).append("\n"); 
		query.append("WHERE EFF_YRMON = (SELECT MAX(EFF_YRMON) FROM AP_PERIOD)" ).append("\n"); 

	}
}