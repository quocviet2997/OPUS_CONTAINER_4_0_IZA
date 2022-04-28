/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : NodeDBDAOTotalNodeRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2015.06.05
*@LastModifier : 
*@LastVersion : 1.0
* 2015.06.05 
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

public class NodeDBDAOTotalNodeRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Select node's count
	  * </pre>
	  */
	public NodeDBDAOTotalNodeRSQL(){
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
		params.put("ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("node_nm",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.node.integration").append("\n"); 
		query.append("FileName : NodeDBDAOTotalNodeRSQL").append("\n"); 
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
		query.append("	SELECT COUNT(A.yd_cd)    " ).append("\n"); 
		query.append("	FROM mdm_yard A, mdm_location B						" ).append("\n"); 
		query.append("	WHERE 1 = 1 AND A.loc_cd = B.loc_cd " ).append("\n"); 
		query.append("	#if(${scc_cd} != '')" ).append("\n"); 
		query.append("			AND B.scc_cd LIKE '%' || @[scc_cd] || '%' " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("	#if(${cnt_cd} != '')" ).append("\n"); 
		query.append("			AND B.cnt_cd LIKE '%' || @[cnt_cd] || '%' " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("	#if(${loc_cd} != '')" ).append("\n"); 
		query.append("			AND A.loc_cd LIKE '%' || @[loc_cd] || '%' " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("	#if(${ofc_cd} != '')" ).append("\n"); 
		query.append("			AND A.ofc_cd LIKE '%' || @[ofc_cd] || '%' " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("	#if(${node_cd} != '')" ).append("\n"); 
		query.append("			AND A.yd_cd LIKE '%' || @[node_cd] || '%' " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("	#if(${node_nm} != '')" ).append("\n"); 
		query.append("			AND upper(A.yd_nm) LIKE '%' || @[node_nm] || '%' " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("	 AND NVL(B.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
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
		query.append("" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("	 SELECT COUNT(A.zn_cd)             	" ).append("\n"); 
		query.append("	 FROM mdm_zone A, mdm_yard B, mdm_location C	" ).append("\n"); 
		query.append("	 WHERE 1 = 1 " ).append("\n"); 
		query.append("		 AND A.REP_YD_CD = B.YD_CD AND A.LOC_CD=C.LOC_CD " ).append("\n"); 
		query.append("	#if(${scc_cd} != '')" ).append("\n"); 
		query.append("			AND c.scc_cd LIKE '%' || @[scc_cd] || '%' " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("	#if(${cnt_cd} != '')" ).append("\n"); 
		query.append("			AND C.cnt_cd LIKE '%' || @[cnt_cd] || '%' " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("	#if(${loc_cd} != '')" ).append("\n"); 
		query.append("			AND A.loc_cd LIKE '%' || @[loc_cd] || '%' " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("	#if(${ofc_cd} != '')" ).append("\n"); 
		query.append("			AND B.ofc_cd LIKE '%' || @[ofc_cd] || '%' " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("	#if(${node_cd} != '')" ).append("\n"); 
		query.append("			AND A.zn_cd LIKE '%' || @[node_cd] || '%' " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("	#if(${node_nm} != '')" ).append("\n"); 
		query.append("			AND upper(A.zn_nm) LIKE '%' || @[node_nm] || '%' " ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("    		 AND NVL(C.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("    		 AND NVL(B.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
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
		query.append("#end" ).append("\n"); 

	}
}