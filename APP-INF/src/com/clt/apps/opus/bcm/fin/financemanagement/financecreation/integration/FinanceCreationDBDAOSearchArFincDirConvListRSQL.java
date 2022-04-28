/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : FinanceCreationDBDAOSearchArFincDirConvListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.10
*@LastModifier : 
*@LastVersion : 1.0
* 2011.03.10 
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

public class FinanceCreationDBDAOSearchArFincDirConvListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 2011-02-22
	  * AR Finance Direction Conversion 정보를 검색하는 SQL
	  * </pre>
	  */
	public FinanceCreationDBDAOSearchArFincDirConvListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rlane_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("slan_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration").append("\n"); 
		query.append("FileName : FinanceCreationDBDAOSearchArFincDirConvListRSQL").append("\n"); 
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
		query.append("    SLAN_CD" ).append("\n"); 
		query.append("    , SCONTI_CD" ).append("\n"); 
		query.append("    , SLAN_DIR_CD" ).append("\n"); 
		query.append("    , RLANE_DIR_CD" ).append("\n"); 
		query.append("	, SLAN_CD H_SLAN_CD" ).append("\n"); 
		query.append("    , SCONTI_CD H_SCONTI_CD" ).append("\n"); 
		query.append("    , SLAN_DIR_CD H_SLAN_DIR_CD" ).append("\n"); 
		query.append("    , RLANE_DIR_CD H_RLANE_DIR_CD" ).append("\n"); 
		query.append("    , DIR_CNG_CD" ).append("\n"); 
		query.append("    , AP_MK_FLG" ).append("\n"); 
		query.append("    , RLANE_CD" ).append("\n"); 
		query.append("    , DELT_FLG" ).append("\n"); 
		query.append("    , UPD_USR_ID" ).append("\n"); 
		query.append("    , CRE_USR_ID" ).append("\n"); 
		query.append("FROM AR_FINC_DIR_CONV" ).append("\n"); 
		query.append("WHERE 1 = 1" ).append("\n"); 
		query.append("#if (${slan_cd} != '')" ).append("\n"); 
		query.append("   AND SLAN_CD = @[slan_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${rlane_cd} != '')" ).append("\n"); 
		query.append("   AND RLANE_CD = @[rlane_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}