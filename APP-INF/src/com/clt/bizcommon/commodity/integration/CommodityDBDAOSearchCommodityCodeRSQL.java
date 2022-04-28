/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : CommodityDBDAOSearchCommodityCodeRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2011.08.11
*@LastModifier : 박찬민
*@LastVersion : 1.0
* 2011.08.11 박찬민
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.commodity.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author PARK CHAN MIN
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CommodityDBDAOSearchCommodityCodeRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * SearchCommodityCode
	  * </pre>
	  */
	public CommodityDBDAOSearchCommodityCodeRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("chk_cmdt_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.commodity.integration").append("\n"); 
		query.append("FileName : CommodityDBDAOSearchCommodityCodeRSQL").append("\n"); 
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
		query.append("SELECT  B.rep_cmdt_cd AS prf_n1st_rep_cmdt_cd" ).append("\n"); 
		query.append("      , B.rep_cmdt_nm AS prf_n1st_cmdt_grp_dtl" ).append("\n"); 
		query.append("  FROM mdm_commodity A, mdm_rep_cmdt B" ).append("\n"); 
		query.append("WHERE 1 = 1" ).append("\n"); 
		query.append("AND   A.rep_cmdt_cd = B.rep_cmdt_cd" ).append("\n"); 
		query.append("AND   A.REP_CMDT_CD = @[chk_cmdt_cd]" ).append("\n"); 

	}
}