/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : CntrTypeDBDAOMdmCntrTpListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.04.04
*@LastModifier : 채창호
*@LastVersion : 1.0
* 2012.04.04 채창호
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.cntrtype.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Chang HO Chae
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CntrTypeDBDAOMdmCntrTpListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Cntr type
	  * </pre>
	  */
	public CntrTypeDBDAOMdmCntrTpListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cntr_tp_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cntr_tp_desc",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("delt_flg",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.cntrtype.integration").append("\n"); 
		query.append("FileName : CntrTypeDBDAOMdmCntrTpListRSQL").append("\n"); 
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
		query.append("SELECT CNTR_TP_CD" ).append("\n"); 
		query.append("       ,CNTR_TP_DESC" ).append("\n"); 
		query.append("       ,MODI_CNTR_TP_CD" ).append("\n"); 
		query.append("	   ,DECODE(DELT_FLG,'Y','Delete','Active') AS DELT_FLG" ).append("\n"); 
		query.append("FROM MDM_CNTR_TP" ).append("\n"); 
		query.append("WHERE 1=1 " ).append("\n"); 
		query.append("#if(${cntr_tp_cd} != '')" ).append("\n"); 
		query.append("AND CNTR_TP_CD LIKE @[cntr_tp_cd] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${cntr_tp_desc} != '')      " ).append("\n"); 
		query.append("AND CNTR_TP_DESC LIKE '%' || @[cntr_tp_desc] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${mdm_yn} == '')" ).append("\n"); 
		query.append("AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("#elseif(${mdm_yn} == 'Y')" ).append("\n"); 
		query.append("	#if(${delt_flg} != 'All')" ).append("\n"); 
		query.append("		AND DELT_FLG = @[delt_flg]" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("ORDER BY CNTR_TP_CD ASC" ).append("\n"); 

	}
}