/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : CntrTpSzDBDAOSearchCntrTpSzListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.03.15
*@LastModifier : 
*@LastVersion : 1.0
* 2012.03.15 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.cntrtpsz.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CntrTpSzDBDAOSearchCntrTpSzListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * CntrTpSz의 모든 목록을 가져온다.
	  * </pre>
	  */
	public CntrTpSzDBDAOSearchCntrTpSzListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cntr_tpsz_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("cntr_tpsz_desc",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("endpart",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.cntrtpsz.integration").append("\n"); 
		query.append("FileName : CntrTpSzDBDAOSearchCntrTpSzListRSQL").append("\n"); 
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
		query.append("SELECT cntr_tpsz_cd," ).append("\n"); 
		query.append("	cntr_tpsz_desc," ).append("\n"); 
		query.append("	(CASE " ).append("\n"); 
		query.append("		WHEN 'Y' = delt_flg THEN 'Delete' " ).append("\n"); 
		query.append("		ELSE 'Active' " ).append("\n"); 
		query.append("	END) AS delt_flg" ).append("\n"); 
		query.append("FROM (	SELECT ROW_NUMBER() OVER (ORDER BY cntr_tpsz_cd ASC) no," ).append("\n"); 
		query.append("			cntr_tpsz_cd," ).append("\n"); 
		query.append("			cntr_tpsz_desc," ).append("\n"); 
		query.append("			delt_flg" ).append("\n"); 
		query.append("		FROM mdm_cntr_tp_sz" ).append("\n"); 
		query.append("		WHERE 1 = 1" ).append("\n"); 
		query.append("		#if (${cntr_tpsz_cd} != '') " ).append("\n"); 
		query.append("		AND cntr_tpsz_cd like @[cntr_tpsz_cd] || '%'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("		#if (${cntr_tpsz_desc} != '') " ).append("\n"); 
		query.append("		AND upper(cntr_tpsz_desc) like '%' || upper(@[cntr_tpsz_desc]) || '%'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("		#if (${mdm_yn} != '')" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("			#if (${delt_flg} == 'Y') " ).append("\n"); 
		query.append("				AND delt_flg = @[delt_flg]" ).append("\n"); 
		query.append("			#elseif (${delt_flg} == 'ALL') " ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("			#else " ).append("\n"); 
		query.append("				AND delt_flg <> 'Y'" ).append("\n"); 
		query.append("			#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("		#else	" ).append("\n"); 
		query.append("			AND NVL(delt_flg, 'N') <> 'Y'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append(") a" ).append("\n"); 
		query.append("WHERE no BETWEEN @[startpart] AND @[endpart]" ).append("\n"); 
		query.append("ORDER BY cntr_tpsz_cd" ).append("\n"); 

	}
}