/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : CntrSizeDBDAOMdmCntrSzListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.03.27
*@LastModifier : 
*@LastVersion : 1.0
* 2012.03.27 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.cntrsize.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CntrSizeDBDAOMdmCntrSzListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Cntr Size
	  * </pre>
	  */
	public CntrSizeDBDAOMdmCntrSzListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cntr_sz_desc",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cntr_sz_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("delt_flg",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.cntrsize.integration").append("\n"); 
		query.append("FileName : CntrSizeDBDAOMdmCntrSzListRSQL").append("\n"); 
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
		query.append("SELECT CNTR_SZ_CD" ).append("\n"); 
		query.append("       ,CNTR_SZ_DESC" ).append("\n"); 
		query.append("       ,CNTR_SZ_TEU_CAPA" ).append("\n"); 
		query.append("       ,MODI_CNTR_SZ_CD" ).append("\n"); 
		query.append("       ,DECODE(DELT_FLG,'Y','Delete','Active') AS DELT_FLG" ).append("\n"); 
		query.append("FROM MDM_CNTR_SZ" ).append("\n"); 
		query.append("WHERE 1=1" ).append("\n"); 
		query.append("#if(${cntr_sz_cd} != '')" ).append("\n"); 
		query.append("AND CNTR_SZ_CD LIKE @[cntr_sz_cd] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${cntr_sz_desc} != '')      " ).append("\n"); 
		query.append("AND CNTR_SZ_DESC LIKE '%' || @[cntr_sz_desc] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${mdm_yn} == '')" ).append("\n"); 
		query.append("AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("#elseif(${mdm_yn} == 'Y')" ).append("\n"); 
		query.append("	#if(${delt_flg} != 'All')" ).append("\n"); 
		query.append("		AND DELT_FLG = @[delt_flg]" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("ORDER BY CNTR_SZ_CD ASC" ).append("\n"); 

	}
}