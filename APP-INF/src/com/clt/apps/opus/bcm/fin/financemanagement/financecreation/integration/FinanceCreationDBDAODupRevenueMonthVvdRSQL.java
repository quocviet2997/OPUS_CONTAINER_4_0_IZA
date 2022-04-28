/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : FinanceCreationDBDAODupRevenueMonthVvdRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2014.12.23
*@LastModifier : 
*@LastVersion : 1.0
* 2014.12.23 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class FinanceCreationDBDAODupRevenueMonthVvdRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * select duplicate RevenueMonthVvd
	  * </pre>
	  */
	public FinanceCreationDBDAODupRevenueMonthVvdRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rlane_dir_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("skd_dir_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("skd_voy_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("vsl_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration ").append("\n"); 
		query.append("FileName : FinanceCreationDBDAODupRevenueMonthVvdRSQL").append("\n"); 
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
		query.append("WHERE VSL_CD = @[vsl_cd]" ).append("\n"); 
		query.append("	AND SKD_VOY_NO = @[skd_voy_no]" ).append("\n"); 
		query.append("	AND SKD_DIR_CD = @[skd_dir_cd]" ).append("\n"); 
		query.append("	AND RLANE_DIR_CD = @[rlane_dir_cd]" ).append("\n"); 

	}
}