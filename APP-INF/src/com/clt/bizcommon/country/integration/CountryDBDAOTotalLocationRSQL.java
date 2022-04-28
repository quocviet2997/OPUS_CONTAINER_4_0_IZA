/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : CountryDBDAOTotalLocationRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.08
*@LastModifier : 
*@LastVersion : 1.0
* 2012.02.08 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.country.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CountryDBDAOTotalLocationRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Location 총 카운트를 조회한다
	  * </pre>
	  */
	public CountryDBDAOTotalLocationRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("conti_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cnt_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cnt_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("delt_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("sconti_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.country.integration").append("\n"); 
		query.append("FileName : CountryDBDAOTotalLocationRSQL").append("\n"); 
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
		query.append("FROM mdm_country A, mdm_subcontinent B, mdm_continent C              " ).append("\n"); 
		query.append("WHERE 1 = 1 " ).append("\n"); 
		query.append("AND A.sconti_cd = B.sconti_cd " ).append("\n"); 
		query.append("AND B.conti_cd = C.conti_cd" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${mdm_yn} != '')" ).append("\n"); 
		query.append("	#if (${delt_flg} == 'Y') " ).append("\n"); 
		query.append("		AND nvl(A.delt_flg,'N') = @[delt_flg]" ).append("\n"); 
		query.append("	#elseif (${delt_flg} == 'ALL') " ).append("\n"); 
		query.append("	#else " ).append("\n"); 
		query.append("		AND nvl(A.delt_flg,'N') <> 'Y'" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("#else	" ).append("\n"); 
		query.append("	AND nvl(A.delt_flg,'N') <> 'Y'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("AND nvl(B.delt_flg,'N') <> 'Y'" ).append("\n"); 
		query.append("AND nvl(C.delt_flg,'N') <> 'Y' " ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${conti_cd} != '')" ).append("\n"); 
		query.append("AND UPPER(B.conti_cd) like UPPER(@[conti_cd]) || '%'" ).append("\n"); 
		query.append("#end    " ).append("\n"); 
		query.append("#if (${sconti_cd} != '')      " ).append("\n"); 
		query.append("AND UPPER(A.sconti_cd) like UPPER(@[sconti_cd]) || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${cnt_cd} != '')" ).append("\n"); 
		query.append("AND UPPER(A.cnt_cd) like UPPER(@[cnt_cd]) || '%'" ).append("\n"); 
		query.append("#end       " ).append("\n"); 
		query.append("#if (${cnt_nm} != '')" ).append("\n"); 
		query.append("AND UPPER(A.cnt_nm) like '%' || UPPER(@[cnt_nm]) || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}