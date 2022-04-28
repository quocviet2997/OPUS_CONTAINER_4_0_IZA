/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : FinanceCreationDBDAOSearchRevenueMonthVvdRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2014.11.12
*@LastModifier : 
*@LastVersion : 1.0
* 2014.11.12 
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

public class FinanceCreationDBDAOSearchRevenueMonthVvdRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * search Revenue Month Vvd
	  * </pre>
	  */
	public FinanceCreationDBDAOSearchRevenueMonthVvdRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("tar_yrmon",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration").append("\n"); 
		query.append("FileName : FinanceCreationDBDAOSearchRevenueMonthVvdRSQL").append("\n"); 
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
		query.append("SELECT  VSL_CD||SKD_VOY_NO||SKD_DIR_CD||RLANE_DIR_CD	AS VVD" ).append("\n"); 
		query.append("	,	VSL_CD" ).append("\n"); 
		query.append("	,	SKD_VOY_NO" ).append("\n"); 
		query.append("	,	SKD_DIR_CD" ).append("\n"); 
		query.append("	,	RLANE_DIR_CD" ).append("\n"); 
		query.append("	,	VOY_TP_CD" ).append("\n"); 
		query.append("	,	SLAN_CD" ).append("\n"); 
		query.append("	,	PORT_CHK_FLG" ).append("\n"); 
		query.append("	,	REV_PORT_CD" ).append("\n"); 
		query.append("	,	LOD_QTY" ).append("\n"); 
		query.append("    ,   TO_CHAR(LAST_DAY(TO_DATE(REV_YRMON,'YYYYMM')), 'YYYY-MM-DD') AS REV_YRMON" ).append("\n"); 
		query.append("	,	COM_VVD_FLG" ).append("\n"); 
		query.append("	,	VVD_COM_LVL" ).append("\n"); 
		query.append("	,   RLANE_CD" ).append("\n"); 
		query.append("	, 	DELT_FLG" ).append("\n"); 
		query.append("	,  	CRE_USR_ID" ).append("\n"); 
		query.append("	,  	UPD_USR_ID" ).append("\n"); 
		query.append("FROM AR_MST_REV_VVD" ).append("\n"); 
		query.append("WHERE DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("AND (COM_VVD_FLG = 'Y' OR RLANE_CD = 'CMDCO')" ).append("\n"); 
		query.append("#if (${month_flag} == 'pre')" ).append("\n"); 
		query.append("AND REV_YRMON = TO_CHAR(ADD_MONTHS(TO_DATE(@[tar_yrmon],'YYYYMM'), -1), 'YYYYMM')" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("AND REV_YRMON = @[tar_yrmon]" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}