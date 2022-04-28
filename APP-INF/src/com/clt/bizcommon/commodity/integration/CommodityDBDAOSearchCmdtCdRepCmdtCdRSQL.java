/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : CommodityDBDAOSearchCmdtCdRepCmdtCdRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.24
*@LastModifier : 
*@LastVersion : 1.0
* 2012.02.24 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.commodity.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CommodityDBDAOSearchCmdtCdRepCmdtCdRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Commodity Code를 입력하기 위해 Code를 검색하는 화면
	  * </pre>
	  */
	public CommodityDBDAOSearchCmdtCdRepCmdtCdRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rep_cmdt_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cmdt_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cmdt_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.commodity.integration").append("\n"); 
		query.append("FileName : CommodityDBDAOSearchCmdtCdRepCmdtCdRSQL").append("\n"); 
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
		query.append("SELECT B.rep_cmdt_cd" ).append("\n"); 
		query.append(",      B.rep_cmdt_nm" ).append("\n"); 
		query.append(",      A.cmdt_cd" ).append("\n"); 
		query.append(",      A.cmdt_nm" ).append("\n"); 
		query.append(",	   A.REP_IMDG_LVL_CD	" ).append("\n"); 
		query.append(",	   '' rdo_search_type" ).append("\n"); 
		query.append("  FROM mdm_commodity A, mdm_rep_cmdt B" ).append("\n"); 
		query.append(" WHERE 1 = 1" ).append("\n"); 
		query.append("AND   A.rep_cmdt_cd = B.rep_cmdt_cd " ).append("\n"); 
		query.append("#if (${cmdt_cd} != '' && ${rdo_search_type} == 'A') " ).append("\n"); 
		query.append(" AND   A.cmdt_cd like @[cmdt_cd] || '%' " ).append("\n"); 
		query.append("#end " ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${rep_cmdt_cd} != '' && ${rdo_search_type} == 'B') " ).append("\n"); 
		query.append("AND   B.rep_cmdt_cd like @[rep_cmdt_cd] || '%' " ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${cmdt_nm} != '' && ${rdo_search_type} == 'C') " ).append("\n"); 
		query.append(" AND   (upper(a.cmdt_nm) like '%' || upper(@[cmdt_nm]) || '%' )" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}