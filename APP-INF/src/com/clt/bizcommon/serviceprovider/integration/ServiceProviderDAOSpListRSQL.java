/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : ServiceProviderDAOSpListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2017.10.24
*@LastModifier : 
*@LastVersion : 1.0
* 2017.10.24 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.serviceprovider.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ServiceProviderDAOSpListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * select service provider list
	  * </pre>
	  */
	public ServiceProviderDAOSpListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pts_vndr_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("vndr_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("modi_vndr_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("vndr_nm_eng",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("startpart",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("endpart",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.serviceprovider.integration").append("\n"); 
		query.append("FileName : ServiceProviderDAOSpListRSQL").append("\n"); 
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
		query.append("SELECT vndr_seq," ).append("\n"); 
		query.append("                  ofc_cd," ).append("\n"); 
		query.append("                  vndr_lgl_eng_nm," ).append("\n"); 
		query.append("                  vndr_abbr_nm," ).append("\n"); 
		query.append("                  prnt_vndr_seq," ).append("\n"); 
		query.append("                  vndr_cnt_cd," ).append("\n"); 
		query.append("                  org_vndr_seq," ).append("\n"); 
		query.append("                  eng_addr," ).append("\n"); 
		query.append("				  '' cnt_cd		," ).append("\n"); 
		query.append("				  '' vndr_nm_eng	,				  " ).append("\n"); 
		query.append("				  '' pts_vndr_cd	," ).append("\n"); 
		query.append("				  '' vndr_cd    	," ).append("\n"); 
		query.append("				  '' p_sp_type   	," ).append("\n"); 
		query.append("				  '' lgs_flg    	," ).append("\n"); 
		query.append("				  '' i_page," ).append("\n"); 
		query.append("				(CASE " ).append("\n"); 
		query.append("					WHEN 'Y' = delt_flg THEN 'Delete' " ).append("\n"); 
		query.append("					ELSE 'Active' " ).append("\n"); 
		query.append("				END) AS delt_flg," ).append("\n"); 
		query.append("                MODI_VNDR_CD" ).append("\n"); 
		query.append("FROM (SELECT ROW_NUMBER() OVER (ORDER BY vndr_seq) no," ).append("\n"); 
		query.append("          LPAD(vndr_seq, 6, '0') vndr_seq," ).append("\n"); 
		query.append("          ofc_cd," ).append("\n"); 
		query.append("          VNDR_LGL_ENG_NM," ).append("\n"); 
		query.append("          VNDR_ABBR_NM," ).append("\n"); 
		query.append("          LPAD(PRNT_VNDR_SEQ, 6, '0') PRNT_VNDR_SEQ," ).append("\n"); 
		query.append("          VNDR_CNT_CD," ).append("\n"); 
		query.append("          VNDR_CNT_CD||LPAD(vndr_seq, 6, '0') org_vndr_seq," ).append("\n"); 
		query.append("          eng_addr," ).append("\n"); 
		query.append("		  delt_flg," ).append("\n"); 
		query.append("          MODI_VNDR_CD" ).append("\n"); 
		query.append("     FROM mdm_vendor" ).append("\n"); 
		query.append("    WHERE 1 = 1" ).append("\n"); 
		query.append("#if (${cnt_cd} != '')" ).append("\n"); 
		query.append("     AND UPPER(VNDR_CNT_CD) like UPPER(@[cnt_cd]) || '%'" ).append("\n"); 
		query.append("#end    " ).append("\n"); 
		query.append("#if (${ofc_cd} != '')" ).append("\n"); 
		query.append("     AND UPPER(OFC_CD) like UPPER(@[ofc_cd]) || '%'" ).append("\n"); 
		query.append("#end    " ).append("\n"); 
		query.append("#if (${vndr_nm_eng} != '')" ).append("\n"); 
		query.append("     AND UPPER(VNDR_LGL_ENG_NM) like '%' || UPPER(@[vndr_nm_eng]) || '%'" ).append("\n"); 
		query.append("#end    " ).append("\n"); 
		query.append("#if (${pts_vndr_cd} != '')" ).append("\n"); 
		query.append("     AND LPAD(PRNT_VNDR_SEQ, 6, '0') = LPAD(@[pts_vndr_cd], 6, '0')" ).append("\n"); 
		query.append("#end    " ).append("\n"); 
		query.append("#if (${vndr_cd} != '')" ).append("\n"); 
		query.append("     AND LPAD(VNDR_SEQ, 6, '0') = LPAD(@[vndr_cd], 6, '0')" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${lgs_flg} == 'Y')" ).append("\n"); 
		query.append("	AND LGS_FLG = 'Y'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${modi_vndr_cd} != '')" ).append("\n"); 
		query.append("    AND USA_EDI_CD LIKE '%'||UPPER(@[modi_vndr_cd])||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("	" ).append("\n"); 
		query.append("#if (${mdm_yn} != '')" ).append("\n"); 
		query.append("	#if (${delt_flg} == 'Y') " ).append("\n"); 
		query.append("		AND DELT_FLG = @[delt_flg]" ).append("\n"); 
		query.append("	#elseif (${delt_flg} == 'ALL') " ).append("\n"); 
		query.append("	#else " ).append("\n"); 
		query.append("		AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("#else	" ).append("\n"); 
		query.append("	AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("  ) a" ).append("\n"); 
		query.append("WHERE no BETWEEN @[startpart] AND @[endpart]" ).append("\n"); 

	}
}