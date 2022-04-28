/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : NodeDBDAOSearchNodeListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2015.09.01
*@LastModifier : 
*@LastVersion : 1.0
* 2015.09.01 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.node.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class NodeDBDAOSearchNodeListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Select Node List
	  * </pre>
	  */
	public NodeDBDAOSearchNodeListRSQL(){
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
		params.put("cnt_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("scc_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("node_cd",new String[]{arrTmp[0],arrTmp[1]});

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

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("node_nm",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.node.integration").append("\n"); 
		query.append("FileName : NodeDBDAOSearchNodeListRSQL").append("\n"); 
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
		query.append("#if(${mode} == 'yard')" ).append("\n"); 
		query.append("	SELECT " ).append("\n"); 
		query.append("		yd_cd,      		" ).append("\n"); 
		query.append("   		yd_nm,  					 	" ).append("\n"); 
		query.append("		ofc_cd,       					" ).append("\n"); 
		query.append("		decode(yd_fcty_tp_mrn_tml_flg, 'Y', '●', '') yd_fcty_tp_mrn_tml_flg,       " ).append("\n"); 
		query.append("		decode(yd_fcty_tp_cy_flg, 'Y', '●', '') yd_fcty_tp_cy_flg,        	" ).append("\n"); 
		query.append("		decode(yd_fcty_tp_cfs_flg, 'Y', '●', '') yd_fcty_tp_cfs_flg,        	" ).append("\n"); 
		query.append("		decode(yd_fcty_tp_rail_rmp_flg, 'Y', '●', '') yd_fcty_tp_rail_rmp_flg,     	" ).append("\n"); 
		query.append("		decode(yd_fcty_tp_psdo_yd_flg, 'Y', '●', '') yd_fcty_tp_psdo_yd_flg,      	" ).append("\n"); 
		query.append("		yd_tp_cd,				       	" ).append("\n"); 
		query.append("		cnt_cd,			       	" ).append("\n"); 
		query.append("		loc_cd, " ).append("\n"); 
		query.append("		yd_cstms_no," ).append("\n"); 
		query.append("		(CASE " ).append("\n"); 
		query.append("			WHEN 'Y' = delt_flg THEN 'Delete' " ).append("\n"); 
		query.append("			ELSE 'Active' " ).append("\n"); 
		query.append("		END) AS delt_flg" ).append("\n"); 
		query.append("	FROM (" ).append("\n"); 
		query.append("		SELECT ROW_NUMBER() OVER (ORDER BY A.yd_cd ASC) no,  " ).append("\n"); 
		query.append("				A.yd_cd,              				" ).append("\n"); 
		query.append("		        A.yd_nm,          					" ).append("\n"); 
		query.append("		        A.ofc_cd,          					" ).append("\n"); 
		query.append("		        A.yd_fcty_tp_mrn_tml_flg,             " ).append("\n"); 
		query.append("		        A.yd_fcty_tp_cy_flg,               	" ).append("\n"); 
		query.append("		        A.yd_fcty_tp_cfs_flg,              	" ).append("\n"); 
		query.append("		        A.yd_fcty_tp_rail_rmp_flg,            " ).append("\n"); 
		query.append("		        A.yd_fcty_tp_psdo_yd_flg,             " ).append("\n"); 
		query.append("		        '' yd_tp_cd,            				" ).append("\n"); 
		query.append("		        B.cnt_cd cnt_cd,       " ).append("\n"); 
		query.append("		        A.loc_cd, " ).append("\n"); 
		query.append("				A.yd_cstms_no," ).append("\n"); 
		query.append("				A.delt_flg" ).append("\n"); 
		query.append("		FROM mdm_yard A, mdm_location B		    " ).append("\n"); 
		query.append("		WHERE 1 = 1 " ).append("\n"); 
		query.append("			AND A.loc_cd = B.loc_cd " ).append("\n"); 
		query.append("		#if(${scc_cd} != '')" ).append("\n"); 
		query.append("			AND B.scc_cd LIKE '%' || @[scc_cd] || '%' " ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("		#if(${cnt_cd} != '')" ).append("\n"); 
		query.append("			AND B.cnt_cd LIKE '%' ||@[cnt_cd] || '%' " ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("		#if(${loc_cd} != '')" ).append("\n"); 
		query.append("			AND A.loc_cd LIKE '%' ||@[loc_cd] || '%' " ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("		#if(${ofc_cd} != '')" ).append("\n"); 
		query.append("			AND A.ofc_cd LIKE '%' || @[ofc_cd] || '%' " ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("		#if(${node_cd} != '')" ).append("\n"); 
		query.append("			AND A.yd_cd LIKE '%' ||@[node_cd] || '%'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("		#if(${node_nm} != '')" ).append("\n"); 
		query.append("			AND upper(A.yd_nm) LIKE '%' || upper(@[node_nm]) || '%' " ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("			AND NVL(B.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("    	#if (${mdm_yn} != '')" ).append("\n"); 
		query.append("			#if (${delt_flg} == 'Y') " ).append("\n"); 
		query.append("			AND NVL(A.DELT_FLG, 'N') = @[delt_flg]" ).append("\n"); 
		query.append("			#elseif (${delt_flg} == 'ALL') " ).append("\n"); 
		query.append("			#else " ).append("\n"); 
		query.append("			AND NVL(A.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("			#end" ).append("\n"); 
		query.append("		#else	" ).append("\n"); 
		query.append("			AND NVL(A.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("	         )        " ).append("\n"); 
		query.append("	ORDER BY yd_cd             					" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("	 SELECT zn_cd,    	" ).append("\n"); 
		query.append("		zn_nm,  				" ).append("\n"); 
		query.append("		ofc_cd,       			" ).append("\n"); 
		query.append("		zip_cd,       			" ).append("\n"); 
		query.append("		dstr_nm,             	" ).append("\n"); 
		query.append("		strt_nm,             	" ).append("\n"); 
		query.append("		address,             	" ).append("\n"); 
		query.append("		cnt_cd,           " ).append("\n"); 
		query.append("		loc_cd," ).append("\n"); 
		query.append("		(CASE " ).append("\n"); 
		query.append("			WHEN 'Y' = delt_flg THEN 'Delete' " ).append("\n"); 
		query.append("			ELSE 'Active' " ).append("\n"); 
		query.append("		END) AS delt_flg" ).append("\n"); 
		query.append("	   FROM (SELECT ROW_NUMBER() OVER (ORDER BY A.zn_cd ASC) no,  " ).append("\n"); 
		query.append("				A.zn_cd,              		" ).append("\n"); 
		query.append("				A.zn_nm,          			" ).append("\n"); 
		query.append("				B.ofc_cd,          			" ).append("\n"); 
		query.append("				'' zip_cd,               	" ).append("\n"); 
		query.append("				'' dstr_nm,              	" ).append("\n"); 
		query.append("				'' strt_nm,              	" ).append("\n"); 
		query.append("				'' address,              	" ).append("\n"); 
		query.append("				C.cnt_cd cnt_cd,   " ).append("\n"); 
		query.append("				A.loc_cd," ).append("\n"); 
		query.append("				A.delt_flg" ).append("\n"); 
		query.append("			   FROM mdm_zone A, mdm_yard B, mdm_location C    	" ).append("\n"); 
		query.append("			  WHERE 1 = 1" ).append("\n"); 
		query.append("    		 AND A.REP_YD_CD = B.YD_CD AND A.loc_cd=C.loc_cd " ).append("\n"); 
		query.append("	#if(${scc_cd} != '')" ).append("\n"); 
		query.append("			AND c.scc_cd LIKE '%' || @[scc_cd] || '%' " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("	#if(${cnt_cd} != '')" ).append("\n"); 
		query.append("			AND C.cnt_cd LIKE '%' ||@[cnt_cd] || '%' " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("	#if(${loc_cd} != '')" ).append("\n"); 
		query.append("			AND A.loc_cd LIKE '%' ||@[loc_cd] || '%' " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("	#if(${ofc_cd} != '')" ).append("\n"); 
		query.append("			AND B.ofc_cd LIKE '%' || @[ofc_cd] || '%' " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("	#if(${node_cd} != '')" ).append("\n"); 
		query.append("			AND A.zn_cd LIKE '%' || @[node_cd] || '%' " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("	#if(${node_nm} != '')" ).append("\n"); 
		query.append("			AND upper(A.zn_nm) LIKE '%' || upper(@[node_nm]) || '%' " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("--    		 AND NVL(C.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("--    		 AND NVL(B.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("    #if (${mdm_yn} != '')" ).append("\n"); 
		query.append("		#if (${delt_flg} == 'Y') " ).append("\n"); 
		query.append("			AND NVL(A.DELT_FLG, 'N') = @[delt_flg]" ).append("\n"); 
		query.append("		#elseif (${delt_flg} == 'ALL') " ).append("\n"); 
		query.append("		#else " ).append("\n"); 
		query.append("			AND NVL(A.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("	#else	" ).append("\n"); 
		query.append("		AND NVL(A.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("         )A" ).append("\n"); 
		query.append("         WHERE no BETWEEN @[startpart] AND @[endpart]" ).append("\n"); 
		query.append("		ORDER BY zn_cd" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}