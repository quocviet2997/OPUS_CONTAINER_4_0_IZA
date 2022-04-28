/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : TaxDBDAOSearchCountryInfoForOfficeRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2017.05.31
*@LastModifier : 
*@LastVersion : 1.0
* 2017.05.31 
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

public class TaxDBDAOSearchCountryInfoForOfficeRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * OFC_CD의 Country Code 조회
	  * </pre>
	  */
	public TaxDBDAOSearchCountryInfoForOfficeRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.tax.integration").append("\n"); 
		query.append("FileName : TaxDBDAOSearchCountryInfoForOfficeRSQL").append("\n"); 
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
		query.append("SELECT B.OFC_CD" ).append("\n"); 
		query.append("     , C.CNT_CD" ).append("\n"); 
		query.append("     , DECODE(C.CNT_CD, 'IN', 'Y', 'N') AS IN_CNT_FLG" ).append("\n"); 
		query.append("  FROM MDM_ORGANIZATION B" ).append("\n"); 
		query.append("     , MDM_LOCATION C" ).append("\n"); 
		query.append(" WHERE 1=1" ).append("\n"); 
		query.append("   AND B.OFC_CD     = @[ofc_cd] --'DLCBB' " ).append("\n"); 
		query.append("   AND B.DELT_FLG   = 'N'" ).append("\n"); 
		query.append("   AND B.LOC_CD  (+)= C.LOC_CD" ).append("\n"); 
		query.append("   AND C.DELT_FLG(+)= 'N'" ).append("\n"); 

	}
}