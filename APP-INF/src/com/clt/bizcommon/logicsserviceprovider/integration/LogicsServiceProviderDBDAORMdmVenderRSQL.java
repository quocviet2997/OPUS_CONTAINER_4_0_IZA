/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : LogicsServiceProviderDBDAORMdmVenderRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.10.20
*@LastModifier : 
*@LastVersion : 1.0
* 2016.10.20 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.logicsserviceprovider.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class LogicsServiceProviderDBDAORMdmVenderRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  *    
	  * </pre>
	  */
	public LogicsServiceProviderDBDAORMdmVenderRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("p_country",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pagerows",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("p_sp_type",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("p_vndr_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("p_vndr_seq",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("p_ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("p_print_vndr_seq",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("usa_edi_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.logicsserviceprovider.integration").append("\n"); 
		query.append("FileName : LogicsServiceProviderDBDAORMdmVenderRSQL").append("\n"); 
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
		query.append("SELECT vndr_seq ,		                " ).append("\n"); 
		query.append("       ofc_cd ofc_cd,			       	        " ).append("\n"); 
		query.append("       vndr_lgl_eng_nm,		            " ).append("\n"); 
		query.append("       vndr_abbr_nm," ).append("\n"); 
		query.append("       prnt_vndr_seq," ).append("\n"); 
		query.append("       vndr_cnt_cd," ).append("\n"); 
		query.append("       org_vndr_seq," ).append("\n"); 
		query.append("       eng_addr," ).append("\n"); 
		query.append("       usa_edi_cd," ).append("\n"); 
		query.append("       modi_vndr_seq" ).append("\n"); 
		query.append("FROM (SELECT ROW_NUMBER() OVER (ORDER BY vndr_seq) no, 	        " ).append("\n"); 
		query.append("             LPAD(vndr_seq, 6, '0') vndr_seq,	                		" ).append("\n"); 
		query.append("             ofc_cd,	                					" ).append("\n"); 
		query.append("             VNDR_LGL_ENG_NM,  	" ).append("\n"); 
		query.append("             VNDR_ABBR_NM,					        	" ).append("\n"); 
		query.append("             LPAD(PRNT_VNDR_SEQ, 6, '0') PRNT_VNDR_SEQ,	" ).append("\n"); 
		query.append("             VNDR_CNT_CD, 					        		" ).append("\n"); 
		query.append("             VNDR_CNT_CD||LPAD(vndr_seq, 6, '0') org_vndr_seq,	" ).append("\n"); 
		query.append("             eng_addr,	" ).append("\n"); 
		query.append("             USA_EDI_CD," ).append("\n"); 
		query.append("             MODI_VNDR_SEQ" ).append("\n"); 
		query.append("        FROM mdm_vendor         	        				" ).append("\n"); 
		query.append("		WHERE 1 = 1 " ).append("\n"); 
		query.append("#if (${p_country} != '')" ).append("\n"); 
		query.append("        AND UPPER(VNDR_CNT_CD) like '%' || UPPER(@[p_country])  || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${p_ofc_cd} != '')" ).append("\n"); 
		query.append("        AND UPPER(ofc_cd) like '%' || UPPER(@[p_ofc_cd])  || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${p_vndr_nm} != '')" ).append("\n"); 
		query.append("        AND UPPER(VNDR_LGL_ENG_NM) like '%' || UPPER(@[p_vndr_nm]) || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${p_vndr_seq} != '')" ).append("\n"); 
		query.append("        AND LPAD(PRNT_VNDR_SEQ, 6, '0') = LPAD(@[p_vndr_seq], 6, '0')" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${p_print_vndr_seq} != '')" ).append("\n"); 
		query.append("        AND LPAD(VNDR_SEQ, 6, '0') = LPAD(@[p_print_vndr_seq], 6, '0')" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("        AND NVL(DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("#if (${p_sp_type} != '')" ).append("\n"); 
		query.append("        AND LGS_FLG = @[p_sp_type]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${usa_edi_cd} != '')" ).append("\n"); 
		query.append("        AND USA_EDI_CD = @[usa_edi_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${modi_vndr_cd} != '')" ).append("\n"); 
		query.append("        AND MODI_VNDR_CD = @[modi_vndr_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("	  ) a" ).append("\n"); 
		query.append("#if (${pagerows} != '')" ).append("\n"); 
		query.append("where no between @[pagerows] * 10 and (@[pagerows]+1) * 10" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}