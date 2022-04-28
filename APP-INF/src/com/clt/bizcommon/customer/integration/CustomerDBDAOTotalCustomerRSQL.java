/*=========================================================
*Copyright(c) 2019 CyberLogitec
*@FileName : CustomerDBDAOTotalCustomerRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2019.02.15
*@LastModifier : 
*@LastVersion : 1.0
* 2019.02.15 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.customer.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CustomerDBDAOTotalCustomerRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 총 카운트 조회
	  * </pre>
	  */
	public CustomerDBDAOTotalCustomerRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("loc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("nmd_cust_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cust_lgl_eng_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ctrt_src_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("lgcy_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cust_seq",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("lgcy_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cust_cnt_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.customer.integration").append("\n"); 
		query.append("FileName : CustomerDBDAOTotalCustomerRSQL").append("\n"); 
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
		query.append("#if(${credit_flg} == 'on')" ).append("\n"); 
		query.append("	SELECT COUNT(*) FROM(" ).append("\n"); 
		query.append("   SELECT  (SELECT LGCY_CO_CD " ).append("\n"); 
		query.append("            FROM MDM_MAPG_RULE" ).append("\n"); 
		query.append("           WHERE COL_NM = 'CUST_SEQ' " ).append("\n"); 
		query.append("             AND OPUS_CD = C.LGCY_CD" ).append("\n"); 
		query.append("             AND LGCY_CO_CD IN ('N', 'M', 'K') ) CTRT_SRC_CD" ).append("\n"); 
		query.append("		FROM MDM_CUSTOMER A, MDM_CR_CUST B , MDM_MAPG_RULE C" ).append("\n"); 
		query.append("		WHERE 1=1" ).append("\n"); 
		query.append("    #if ( (${mdm_yn} == '' || ${mdm_yn} != 'Y') && (${nmd_cust_flg} == '' || ${nmd_cust_flg} != 'Y') )" ).append("\n"); 
		query.append("		AND NVL(A.NMD_CUST_FLG, 'N') = 'N' " ).append("\n"); 
		query.append("    #end" ).append("\n"); 
		query.append("		AND A.CUST_CNT_CD = B.CUST_CNT_CD" ).append("\n"); 
		query.append("		AND A.CUST_SEQ = B.CUST_SEQ" ).append("\n"); 
		query.append("		AND C.OPUS_CD(+) = A.CUST_CNT_CD||A.CUST_SEQ" ).append("\n"); 
		query.append("		AND C.TBL_NM(+)= 'MDM_CUSTOMER'" ).append("\n"); 
		query.append("        AND C.COL_NM(+) = 'CUST_SEQ'" ).append("\n"); 
		query.append("        AND B.CR_FLG = 'Y'" ).append("\n"); 
		query.append("        AND C.LGCY_CO_CD(+) = 'O'" ).append("\n"); 
		query.append("        AND A.CUST_CNT_CD NOT IN ('TB','XX')" ).append("\n"); 
		query.append("    " ).append("\n"); 
		query.append("	#if(${cust_cnt_cd} != '')" ).append("\n"); 
		query.append("          AND A.CUST_CNT_CD = @[cust_cnt_cd]" ).append("\n"); 
		query.append("    #end" ).append("\n"); 
		query.append("    #if(${cust_seq} != '')" ).append("\n"); 
		query.append("          AND A.CUST_SEQ  = @[cust_seq]" ).append("\n"); 
		query.append("    #end" ).append("\n"); 
		query.append("	#if(${loc_cd} != '')" ).append("\n"); 
		query.append("		AND A.LOC_CD = @[loc_cd]" ).append("\n"); 
		query.append("    #end" ).append("\n"); 
		query.append("	#if(${cust_lgl_eng_nm} != '')" ).append("\n"); 
		query.append("		#if(${include} == 'on')" ).append("\n"); 
		query.append("            AND UPPER(REPLACE(TRIM(A.CUST_LGL_ENG_NM),' ','')) LIKE '%' || UPPER(REPLACE(TRIM(@[cust_lgl_eng_nm]),' ','')) || '%'" ).append("\n"); 
		query.append("		#else" ).append("\n"); 
		query.append("            AND UPPER(REPLACE(TRIM(A.CUST_LGL_ENG_NM),' ','')) LIKE UPPER(REPLACE(TRIM(@[cust_lgl_eng_nm]),' ','')) || '%'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("	#if(${lgcy_cd} != '')" ).append("\n"); 
		query.append("			AND (C.COL_NM, C.LGCY_CD) IN (SELECT COL_NM, OPUS_CD " ).append("\n"); 
		query.append("                                        FROM MDM_MAPG_RULE" ).append("\n"); 
		query.append("                                       WHERE COL_NM = 'CUST_SEQ'" ).append("\n"); 
		query.append("                                         AND LGCY_CD LIKE @[lgcy_cd] || '%'" ).append("\n"); 
		query.append("                                         AND LGCY_CO_CD IN ('N', 'M', 'K') )   " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("	#if(${lgcy_nm} != '')" ).append("\n"); 
		query.append("		#if(${include} == 'on')" ).append("\n"); 
		query.append("			AND upper(C.LGCY_NM) LIKE '%' || upper(@[lgcy_nm]) || '%'" ).append("\n"); 
		query.append("		#else" ).append("\n"); 
		query.append("			AND upper(C.LGCY_NM) LIKE upper(@[lgcy_nm]) || '%'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("	#if(${ofc_cd} != '')" ).append("\n"); 
		query.append("	AND A.OFC_CD LIKE @[ofc_cd] || '%'" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("	#if(${nmd_cust_flg} != '')" ).append("\n"); 
		query.append("			AND A.NMD_CUST_FLG = @[nmd_cust_flg]" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("	#if (${mdm_yn} != '')" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("		#if (${delt_flg} == 'Y') " ).append("\n"); 
		query.append("			AND A.DELT_FLG = @[delt_flg]" ).append("\n"); 
		query.append("		#elseif (${delt_flg} == 'ALL') " ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("		#else " ).append("\n"); 
		query.append("			AND A.DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("	#else	" ).append("\n"); 
		query.append("		AND A.DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("    ) WHERE 1=1" ).append("\n"); 
		query.append("    #if(${ctrt_src_cd} != 'A')" ).append("\n"); 
		query.append("	    AND CTRT_SRC_CD = @[ctrt_src_cd]" ).append("\n"); 
		query.append("    #end" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("SELECT COUNT(*) FROM (" ).append("\n"); 
		query.append("	SELECT (SELECT LGCY_CO_CD " ).append("\n"); 
		query.append("            FROM MDM_MAPG_RULE" ).append("\n"); 
		query.append("           WHERE COL_NM = 'CUST_SEQ' " ).append("\n"); 
		query.append("             AND OPUS_CD = B.LGCY_CD" ).append("\n"); 
		query.append("             AND LGCY_CO_CD IN ('N', 'M', 'K') ) CTRT_SRC_CD" ).append("\n"); 
		query.append("		FROM MDM_CUSTOMER A, MDM_MAPG_RULE B" ).append("\n"); 
		query.append("		WHERE 1=1" ).append("\n"); 
		query.append("		AND B.OPUS_CD(+) = A.CUST_CNT_CD||A.CUST_SEQ" ).append("\n"); 
		query.append("        AND B.TBL_NM(+)= 'MDM_CUSTOMER'" ).append("\n"); 
		query.append("        AND B.COL_NM(+) = 'CUST_SEQ'" ).append("\n"); 
		query.append(" 		AND B.LGCY_CO_CD(+) = 'O'" ).append("\n"); 
		query.append("        AND A.CUST_CNT_CD NOT IN ('TB','XX')" ).append("\n"); 
		query.append("    #if ( (${mdm_yn} == '' || ${mdm_yn} != 'Y') && (${nmd_cust_flg} == '' || ${nmd_cust_flg} != 'Y') )  " ).append("\n"); 
		query.append("        AND NVL(NMD_CUST_FLG, 'N') = 'N' " ).append("\n"); 
		query.append("    #end" ).append("\n"); 
		query.append("	#if(${cust_cnt_cd} != '')" ).append("\n"); 
		query.append("          AND A.CUST_CNT_CD = @[cust_cnt_cd]" ).append("\n"); 
		query.append("    #end" ).append("\n"); 
		query.append("    #if(${cust_seq} != '')" ).append("\n"); 
		query.append("          AND A.CUST_SEQ  = @[cust_seq]" ).append("\n"); 
		query.append("    #end" ).append("\n"); 
		query.append("	#if(${loc_cd} != '')" ).append("\n"); 
		query.append("		AND A.LOC_CD = @[loc_cd]" ).append("\n"); 
		query.append("    #end" ).append("\n"); 
		query.append("	#if(${cust_lgl_eng_nm} != '')" ).append("\n"); 
		query.append("		#if(${include} == 'on')" ).append("\n"); 
		query.append("            AND UPPER(REPLACE(TRIM(A.CUST_LGL_ENG_NM),' ','')) LIKE '%' || UPPER(REPLACE(TRIM(@[cust_lgl_eng_nm]),' ','')) || '%'" ).append("\n"); 
		query.append("		#else			" ).append("\n"); 
		query.append("            AND UPPER(REPLACE(TRIM(A.CUST_LGL_ENG_NM),' ','')) LIKE UPPER(REPLACE(TRIM(@[cust_lgl_eng_nm]),' ','')) || '%'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("	#if(${lgcy_cd} != '')" ).append("\n"); 
		query.append("			AND (B.COL_NM, B.LGCY_CD) IN (SELECT COL_NM, OPUS_CD " ).append("\n"); 
		query.append("                                        FROM MDM_MAPG_RULE" ).append("\n"); 
		query.append("                                       WHERE COL_NM = 'CUST_SEQ'" ).append("\n"); 
		query.append("                                         AND LGCY_CD LIKE @[lgcy_cd] || '%'" ).append("\n"); 
		query.append("                                         AND LGCY_CO_CD IN ('N', 'M', 'K') )    " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("	#if(${lgcy_nm} != '')" ).append("\n"); 
		query.append("			#if(${include} == 'on')" ).append("\n"); 
		query.append("			AND upper(B.LGCY_NM) LIKE '%' || upper(@[lgcy_nm]) || '%'" ).append("\n"); 
		query.append("		#else" ).append("\n"); 
		query.append("			AND upper(B.LGCY_NM) LIKE upper(@[lgcy_nm]) || '%'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("	#if(${ofc_cd} != '')" ).append("\n"); 
		query.append("	AND A.OFC_CD LIKE @[ofc_cd] || '%'" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("	#if(${nmd_cust_flg} != '')" ).append("\n"); 
		query.append("			AND A.NMD_CUST_FLG = @[nmd_cust_flg]" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("	#if (${mdm_yn} != '')" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("		#if (${delt_flg} == 'Y') " ).append("\n"); 
		query.append("			AND A.DELT_FLG = @[delt_flg]" ).append("\n"); 
		query.append("		#elseif (${delt_flg} == 'ALL') " ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("		#else " ).append("\n"); 
		query.append("			AND A.DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("	#else	" ).append("\n"); 
		query.append("		AND A.DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("    ) WHERE 1=1" ).append("\n"); 
		query.append("    #if(${ctrt_src_cd} != 'A')" ).append("\n"); 
		query.append("	    AND CTRT_SRC_CD = @[ctrt_src_cd]" ).append("\n"); 
		query.append("    #end" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}