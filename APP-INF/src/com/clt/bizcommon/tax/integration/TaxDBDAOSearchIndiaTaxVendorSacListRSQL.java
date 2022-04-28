/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : TaxDBDAOSearchIndiaTaxVendorSacListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2017.07.17
*@LastModifier : 
*@LastVersion : 1.0
* 2017.07.17 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.tax.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class TaxDBDAOSearchIndiaTaxVendorSacListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Vendor SAC ComboItem Search.
	  * </pre>
	  */
	public TaxDBDAOSearchIndiaTaxVendorSacListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("vndr_seq",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.tax.integration").append("\n"); 
		query.append("FileName : TaxDBDAOSearchIndiaTaxVendorSacListRSQL").append("\n"); 
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
		query.append("SELECT MC.VNDR_SEQ" ).append("\n"); 
		query.append("     , MC.VNDR_COST_CD" ).append("\n"); 
		query.append("     , (SELECT INTG_CD_VAL_DP_DESC" ).append("\n"); 
		query.append("          FROM COM_INTG_CD_DTL" ).append("\n"); 
		query.append("         WHERE INTG_CD_ID = 'CD00709'" ).append("\n"); 
		query.append("           AND INTG_CD_VAL_CTNT = MC.VNDR_COST_CD ) AS VNDR_COST_NM" ).append("\n"); 
		query.append("     , MC.CNTR_VNDR_SVC_CD" ).append("\n"); 
		query.append("     , (SELECT INTG_CD_VAL_DP_DESC" ).append("\n"); 
		query.append("          FROM COM_INTG_CD_DTL" ).append("\n"); 
		query.append("         WHERE INTG_CD_ID = 'CD00708'" ).append("\n"); 
		query.append("           AND INTG_CD_VAL_CTNT = MC.CNTR_VNDR_SVC_CD ) AS CNTR_VNDR_SVC_NM" ).append("\n"); 
		query.append("     , MC.SVC_ACCTG_CD" ).append("\n"); 
		query.append("     , 'Y' AS USE_FLG" ).append("\n"); 
		query.append("  FROM MDM_CNTR_VNDR_CLSS MC" ).append("\n"); 
		query.append(" WHERE 1=1" ).append("\n"); 
		query.append("   AND MC.VNDR_SEQ = @[vndr_seq]" ).append("\n"); 
		query.append("   AND MC.DELT_FLG = 'N'" ).append("\n"); 
		query.append("   AND MC.SVC_ACCTG_CD IS NOT NULL" ).append("\n"); 

	}
}