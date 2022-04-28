/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : VendorCodeDBDAOTotalVendorCodeRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.03.05
*@LastModifier : 
*@LastVersion : 1.0
* 2018.03.05 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.vendorcode.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class VendorCodeDBDAOTotalVendorCodeRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * VENDOR Code POPUP (COM_COM_0007) - 조건에 따른 Vendor 목록 갯수 조회
	  * </pre>
	  */
	public VendorCodeDBDAOTotalVendorCodeRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("country",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("code",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("scac",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("name",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("location",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("office",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("status",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.vendorcode.integration").append("\n"); 
		query.append("FileName : VendorCodeDBDAOTotalVendorCodeRSQL").append("\n"); 
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
		query.append("SELECT COUNT(*)" ).append("\n"); 
		query.append("FROM MDM_VENDOR" ).append("\n"); 
		query.append("WHERE 1=1" ).append("\n"); 
		query.append("#if(${code} != '')" ).append("\n"); 
		query.append("AND VNDR_SEQ LIKE '%' || @[code] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${name} != '')" ).append("\n"); 
		query.append("  AND UPPER(VNDR_LGL_ENG_NM) LIKE '%' || UPPER(@[name]) || '%' " ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${country} != '')" ).append("\n"); 
		query.append("  AND VNDR_CNT_CD LIKE '%' || @[country] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${location} != '')" ).append("\n"); 
		query.append("  AND LOC_CD LIKE '%' || @[location] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${office} != '')" ).append("\n"); 
		query.append("  AND OFC_CD LIKE '%' || @[office] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${scac} != '')" ).append("\n"); 
		query.append("  AND USA_EDI_CD LIKE '%' || @[scac] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${status} != 'ALL')" ).append("\n"); 
		query.append("	#if (${status} == 'Y')" ).append("\n"); 
		query.append("  AND DELT_FLG = @[status]" ).append("\n"); 
		query.append("	#else" ).append("\n"); 
		query.append("  AND DELT_FLG = 'N'" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("ORDER BY VNDR_SEQ" ).append("\n"); 

	}
}